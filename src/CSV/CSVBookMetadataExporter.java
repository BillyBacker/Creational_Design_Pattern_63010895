package CSV;

import java.io.IOException;

import Book.BookMetadataExporter;
import exporter.Exporter;

public class CSVBookMetadataExporter extends BookMetadataExporter {
    @Override
    public Exporter createExporter() throws IOException {
        return new CSVBookMetadataExporterConcrete();
    }
}
