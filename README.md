# 💕Durchschnitt von fünf Zahlen
## 👀Beschreibung:
* Dieses Java-Programm fragt den Benutzer nach fünf Zahlen, berechnet daraus den `Durchschnitt` und gibt ihn auf der Konsole aus.

## 😈Ablauf:
**1.** Benutzer gibt fünf Zahlen ein.

**2.** Das Programm berechnet:
    ```Durchschnitt = Summe der Zahlen ÷ 5```

**3.** Das Ergebnis wird als `double` ausgegeben, also mit Nachkommastellen.

## 👩🏼‍💻Code: 
```java
public class CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("First number: ");
        int num1 = scanner.nextInt();

        System.out.println("Second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Third number: ");
        int num3 = scanner.nextInt();

        System.out.println("Fourth number: ");
        int num4 = scanner.nextInt();

        System.out.println("Fifth number: ");
        int num5 = scanner.nextInt();

        int[] numbers ={num1, num2, num3, num4, num5};


        double average= (num1 + num2 + num3 + num4 + num5) / (double)(numbers.length);

        System.out.println("Results: " + average);
    }
}
```
Diese Übung basiert auf Aufgaben von [w3resource](https://www.w3resource.com/java-exercises/basic/index.php)  

Die Lösungen wurden selbstständig von mir entwickelt und sind nur für Lernzwecke gedacht.
