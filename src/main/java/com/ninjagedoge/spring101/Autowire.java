package com.ninjagedoge.spring101;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

class OptionalService {
    // not a bean
}

@Component
public class Autowire {

        /*
        @Autowired
        public  MyComponent myComponent; // notice no final keyword here
        because constructor in called and then object is inserted so that is not possible later if final is present

         that is why with constructor injection you can have bean objects final but now with field injection or
         with setter injection. so avoid using them and prefer constructor injection.
         */

    public final MyComponent myComponent;
    public  MyComponent2 myComponent2;

    /*
        will try to inject if bean found, else assigns null.
        if false is not there, then would throw BeanNotFound exception
     */
    @Autowired(required = false)
    private OptionalService optionalService;

    /*
        if one constructor, @annotation is not required, else required.
        in the below case its not required.
     */

    public Autowire(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    @Autowired
    public void setMyComponent2(MyComponent2 myComponent2) {
        this.myComponent2 = myComponent2;
    }
}


