package p000;

import java.io.Closeable;
import java.nio.channels.FileLock;

/* renamed from: begp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class begp implements Closeable {

    /* renamed from: a */
    private FileLock f111546a;

    public begp(FileLock fileLock) {
        this.f111546a = fileLock;
    }

    public final void close() {
        FileLock fileLock = this.f111546a;
        if (fileLock != null) {
            fileLock.release();
            this.f111546a = null;
        }
    }
}
