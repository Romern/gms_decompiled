package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;
import java.io.IOException;

/* renamed from: ohd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ohd implements Closeable {

    /* renamed from: a */
    private final ParcelFileDescriptor f37627a;

    /* renamed from: b */
    private final ParcelFileDescriptor f37628b;

    public ohd(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        this.f37627a = parcelFileDescriptor;
        this.f37628b = parcelFileDescriptor2;
    }

    public final void close() {
        try {
            this.f37627a.close();
            this.f37628b.close();
        } catch (IOException e) {
        }
    }
}
