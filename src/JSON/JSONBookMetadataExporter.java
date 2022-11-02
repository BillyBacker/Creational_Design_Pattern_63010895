package JSON;

import java.io.IOException;

import Book.BookMetadataExporter;
import exporter.Exporter;

public class JSONBookMetadataExporter extends BookMetadataExporter {

    @Override
    public Exporter createExporter() throws IOException {
        return new JSONBookMetadataExporterConcrete();
    }
}
