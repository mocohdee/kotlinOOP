class birds{
       var name: String = ""
       var feathercolour: String =""
       var birdtype: String=""

       fun insertvalues(n:String,fc:String,bt:String){
              name=n
              feathercolour=fc
              birdtype=bt

              println("name of birds : $name")
              println("name of feathercolour : $feathercolour")
              println("name of birdtype : $birdtype")
       }


}

fun main(args: Array<String>) {
    /*Object oriented programming-kotlin
     OOP - is a programming paradigm based on the concepts of classes.
       Features of OOP
          ->Abstraction
          ->Encapsulation
          ->Inheritance
       *Description
       class-Is a blueprint for the object which defines a template to be used to create the required object.
             *They are the main building block of any OOP language
             *It is defined by the class keyword
       Object-Is a basic unit of OOP and are created or used to access properties or member function of a class.
       *An object is an instance of a class.
            *An object must have the following;
               1.Attributes
               2.Identity
               3.Behaviour

         -Inheritance-Is the mechanism by which an object acquire some or all properties of another object.
            *It supports the concept of hierarchical classification
          -Abstraction-Is the process where you show only relevant data and hide unnecessary details
                      of an object from the user.
          -Encapsulation-Is the process of binding object states and behaviour together.

    * */
    //Syntax and example of a class
       /*1...Class classname{
           object->Identity
                 ->Attributes
                 ->Behaviour}
           2... Class classname constructor(parameters){
           object->Identity
                 ->Attributes
                 ->Behaviour}
        */

    //Creating an object based on employee class
       var bird1 = birds()

       //Accessing the Member function
         bird1.insertvalues("crow""black""bird of prey")

       println(bird1)

       var bird2= birds()
       //Accessing the Member function
       bird2.insertvalues("Owl","white","sca")

       println(bird2)

}
class employee {
       var name: String = ""
       var age: Int = 0
       var salary: Double = 0.toDouble()

       fun insertvalues(n:String,a:Int,s:Double){
              name=n
              age=a
              salary=s

              println("name of employee : $name")
              println("name of age : $age")
              println("name of salary : $salary")
       }

       //Member functions
       fun name() {}
       fun age() {}
       fun salary() {}
}