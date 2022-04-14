import jdk.net.UnixDomainPrincipal

//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe?
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z
fun main(){
       var inc= CurrentAccount(23445355,"fatma",4000)
    var pro=Product("habo",32,500,"groceries")
    namess()


}
  class CurrentAccount(var number:Int,var name:String, var balance:Int,) {
     fun Deposit(amount: Double) {
         var increment = balance++
         println(balance)
     }

   open   fun withdraw(amount: Double) {
         var decrement = balance - amount
         println(decrement)

     }

     fun detail() {
         println(" Account number $number with balance $balance is operated by $name")
     }
 }
class  SavingAccount(number:Int,name:String,balance: Int){
    fun withdraw(amount: Double) {
        for( z in amount){
            if (amount<z){

            }
        }

    }

}
class Product( var name:String, var weight:Int,var price:Int,var category:String){
    fun products(){
        when(products()){
            1,2-> println("this are vegetables")
            3,4-> println("this are fruits")
        }
    }
}
fun namess(){
    var num="banana"
    println(num[1].toString()+num[2]+num[3])
}



//}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
//(5points)
//3.A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category
//(3 points)
//4.Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return



