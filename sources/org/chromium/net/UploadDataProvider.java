package org.chromium.net;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class UploadDataProvider implements Closeable {
    public void close() {
    }

    public abstract long getLength();

    public abstract void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer);

    public abstract void rewind(UploadDataSink uploadDataSink);
}
