function decrementCounterParentFunction(by) {
        setCount(count - by)
    }

    <CounterButton by={1} 
        incrementMethod={incrementCounterParentFunction} 
        decrementMethod={decrementCounterParentFunction}/>
    <CounterButton by={2} 
        incrementMethod={incrementCounterParentFunction}
        decrementMethod={decrementCounterParentFunction}/>
    <CounterButton by={5} 
        incrementMethod={incrementCounterParentFunction}
        decrementMethod={decrementCounterParentFunction}/>

function CounterButton({by, incrementMethod, decrementMethod}) {    

    //[0, ƒ]
    //const [firstElt, secondElt] = array
    const [count, setCount] = useState(0)

    function incrementCounterFunction() {
        setCount(count + by)
        incrementMethod(by)
    }

    function decrementCounterFunction() {
        setCount(count - by)
        decrementMethod(by)
    }
