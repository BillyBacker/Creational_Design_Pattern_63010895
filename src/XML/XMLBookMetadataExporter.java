package XML;

import javax.xml.parsers.ParserConfigurationException;
import exporter.Exporter;

import Book.BookMetadataExporter;

import java.io.IOException;

public class XMLBookMetadataExporter extends BookMetadataExporter {
    @Override
    public Exporter createExporter() throws IOException, ParserConfigurationException {
        return new XMLBookMetadataExporterConcrete();
    }
}
