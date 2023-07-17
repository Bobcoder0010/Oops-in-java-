class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");

        stringBuffer.append(" World");
        System.out.println(stringBuffer);

        stringBuffer.insert(5, " Awesome");
        System.out.println(stringBuffer);

        stringBuffer.reverse();
        System.out.println(stringBuffer);

        stringBuffer.delete(0, 6);
        System.out.println(stringBuffer);

        stringBuffer.setLength(7);
        System.out.println(stringBuffer);

        System.out.println("Length: " + stringBuffer.length());
        System.out.println("Capacity: " + stringBuffer.capacity());
    }
}
