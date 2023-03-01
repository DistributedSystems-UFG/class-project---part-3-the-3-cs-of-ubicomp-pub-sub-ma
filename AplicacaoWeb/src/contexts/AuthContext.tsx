import { createContext, useContext, useState } from 'react';
import { useRouter, NextRouter } from 'next/router';

type AuthContextType = {
  auth: AuthResponse | null;
  setAuth: (auth: AuthResponse | null) => void;
};

type AuthResponse = {
    token: string;
    funcionalidade: string;
  }

const AuthContext = createContext<AuthContextType>({
    auth: null,
    setAuth: () => {},
});

export function useAuth() {
  return useContext(AuthContext);
}

export function redirecionar(auth: AuthResponse | null, router: NextRouter) {
  console.log(auth)
    router.push("/");
    auth == null;
  
}

export function AuthProviderContext({ children }: { children: React.ReactNode }) {
  
  const [auth, setAuth] = useState<AuthResponse | null>(null);
  const router = useRouter();
  const handleSetAuth = (newAuth: AuthResponse | null) => {
    if (newAuth && newAuth.token) {
      console.log(`New token value: ${newAuth.token}`);
    }
    setAuth(newAuth);
  };

  return (
    <AuthContext.Provider value={{ auth, setAuth: handleSetAuth }}>
      {children}
    </AuthContext.Provider>
  );
}

export const useAuthProvider = () => useContext(AuthContext);