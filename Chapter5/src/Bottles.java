class Bottles {
static void printSong(Object stuff, int n) {

String plural;
if (n == 1)
	plural = "";
else
	plural = "s";

loop: while (true) {

System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall,");
System.out.println(n + " bottle" + plural + " of " + stuff + ";");
System.out.println("You take one down " + "and pass it around:");
--n;

if (n == 1)
	plural = "";
else
	plural = "s";

if (n == 0) break loop;
System.out.println(n + " bottle" + plural + " of " + stuff + " on the wall!\n");

}
System.out.println("No bottles of " + stuff + " on the wall!");

}
public static void main(String[] args) {
printSong("slime", 3);
}
}