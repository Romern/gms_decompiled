package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.net.Socket;

/* renamed from: osi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class osi implements Closeable {

    /* renamed from: a */
    private final Socket f38318a;

    /* renamed from: b */
    private final ParcelFileDescriptor f38319b;

    /* renamed from: c */
    private final ParcelFileDescriptor f38320c;

    public osi(Socket socket, ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        this.f38318a = socket;
        this.f38319b = parcelFileDescriptor;
        this.f38320c = parcelFileDescriptor2;
    }

    public final void close() {
        this.f38319b.close();
        this.f38320c.close();
        shr.m35317b(this.f38318a);
        this.f38318a.close();
    }
}
