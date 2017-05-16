Un exemple pour avoir une OutOfMemomry Exception

Trivial example
The first example is truly simple – the following Java code tries to allocate an array of 2M integers. When you compile it and launch with 12MB of Java heap space (java -Xmx12m OOM), it fails with the java.lang.OutOfMemoryError: Java heap space message. With 13MB Java heap space the program runs just fine.

--How to print all the Java system properties
Properties p = System.getProperties();
Enumeration keys = p.keys();
while (keys.hasMoreElements()) {
    String key = (String)keys.nextElement();
    String value = (String)p.get(key);
    System.out.println(key + ": " + value);
}
