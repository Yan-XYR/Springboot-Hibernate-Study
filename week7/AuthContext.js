function login(username, password) {
        if(username==='in28minutes' && password==='dummy'){
            setAuthenticated(true)
            return true            
        } else {
            setAuthenticated(false)
            return false
        }        
    }
    function logout() {
        setAuthenticated(false)
    }
    
    <AuthContext.Provider value={ {isAuthenticated, login, logout}  }>
