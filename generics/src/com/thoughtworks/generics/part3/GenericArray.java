package com.thoughtworks.generics.part3;

/**
 * Created with IntelliJ IDEA.
 * User: ravi
 * Date: 3/4/13
 * Time: 8:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class GenericArray {
    //No, it's not type safe

    public static void main(String[] args) {
        Object[] objArr = new String[10];
        objArr[0] = new String();           //fine

        /*arrays carry runtime type information about their component type, that is, about the type of the
        elements contained. The runtime type information regarding the component type is used when elements are
        stored in an array in order to ensure that no "alien" elements can be inserted */

        objArr[1] = new Long(0L); // compiles; fails at runtime with ArrayStoreException


        /*When an element is inserted into the array, the information about the array's component
        type is used to perform a type check - the so-called array store check. In our example the array store check will
        fail because we are trying to add a Long to an array of Strings. Failure of the array store check is reported by
        means of a ArrayStoreException . */


       /* Because of type erasure, parameterized types do not have exact runtime type information. As a consequence, the array store
        check does not work because it uses the dynamic type information regarding the array's (non-exact) component
        type for the array store check. */


//        Pair<Integer,Integer>[] intPairArr = new Pair<Integer,Integer>[10]; // illegal
//        Object[] objArr1 = intPairArr;
//        objArr[0] = new Pair<String,String>("",""); // should fail, but would succeed

        /*If arrays of concrete parameterized types were allowed At runtime an array store check must be performed
        when an array element is added to the array. Since we are trying to add a Pair<String,String> to a
        Pair<Integer,Integer>[] we would expect that the type check fails. However, the JVM cannot detect any
        type mismatch here: at runtime, after type erasure, objArr would have the dynamic type Pair[] and the
        element to be stored has the matching dynamic type Pair . Hence the store check succeeds, although it should
        not*/



    }


}