package p000;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;

/* renamed from: ahip */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahip {

    /* renamed from: a */
    public final ParcelFileDescriptor f67249a;

    /* renamed from: b */
    public InputStream f67250b;

    public ahip(ParcelFileDescriptor parcelFileDescriptor, InputStream inputStream) {
        this.f67249a = parcelFileDescriptor;
        this.f67250b = inputStream;
    }

    /* renamed from: a */
    public final InputStream mo36538a() {
        if (this.f67250b == null) {
            this.f67250b = new ParcelFileDescriptor.AutoCloseInputStream(this.f67249a);
        }
        return this.f67250b;
    }
}
