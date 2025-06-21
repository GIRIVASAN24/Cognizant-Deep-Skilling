
import java.util.Scanner;
interface Document {
    void open();
}

abstract class DocumentFactory {
    public abstract Document createDocument();
}

class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Word Document");
    }

    public void checkSpelling() {
        System.out.println("Word Document has spell check feature enabled.");
    }
}

class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening PDF Document");
    }

    public void showSecuritySettings() {
        System.out.println("PDF Document is password protected.");
    }
}

class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening Excel Document");
    }

    public void showCellFormulas() {
        System.out.println("Excel Document contains formulas in 12 cells.");
    }
}

class WordFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}

class PdfFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}

class ExcelFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}

public class FactoryMethodPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a document type to create (word/pdf/excel):");
        String input = scanner.nextLine().trim().toLowerCase();

        DocumentFactory factory = null;

        switch (input) {
            case "word":
                factory = new WordFactory();
                break;
            case "pdf":
                factory = new PdfFactory();
                break;
            case "excel":
                factory = new ExcelFactory();
                break;
            default:
                System.out.println("Invalid input.");
                return;
        }

        Document document = factory.createDocument();
        document.open();
        if (document instanceof WordDocument) {
            ((WordDocument) document).checkSpelling();
        } else if (document instanceof PdfDocument) {
            ((PdfDocument) document).showSecuritySettings();
        } else if (document instanceof ExcelDocument) {
            ((ExcelDocument) document).showCellFormulas();
        }

        scanner.close();
    }
}
