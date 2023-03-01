import { ElementType } from "react";
import { Icon, Link as ChakraLink, Text, LinkProps as ChakraLinkProps } from "@chakra-ui/react";
import {RxExit} from "react-icons/rx"
import { useAuth, redirecionar, useAuthProvider } from "@/contexts/AuthContext";
import { useRouter } from "next/router";


export function ExitNav(){

  const { auth, setAuth} = useAuthProvider();
  const router = useRouter();

  function handleExit(){
      
    redirecionar(auth, router)
  };
  
    return(<>

    <ChakraLink display="flex" onClick={handleExit}>
        <Icon as={RxExit} fontSize="20" />
        <Text ml="4" fontWeight="medium">Logout</Text>
      </ChakraLink>
    </>);
}