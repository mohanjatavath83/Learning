package com.learning.pdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PdfWriteExample {

    private static final String FILE_NAME = "itext.pdf";

    public static void main(String[] args)
    {
        writeUsingIText();
    }

    private static void writeUsingIText() {

        Document document = new Document();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            document.open();

            Paragraph p = new Paragraph();
            p.add("Order Number"+12345);
            p.setAlignment(Element.ALIGN_CENTER);

            document.add(p);

            Paragraph p2 = new Paragraph();
            p2.add("This is my paragraph 2");
            document.add(p2);

            Font f = new Font();
            f.setStyle(Font.BOLD);
            f.setSize(8);

            document.add(new Paragraph("This is my paragraph 3", f));

            document.close();

            System.out.println("Done");

        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
