package p000;

import android.os.ParcelFileDescriptor;
import java.io.Closeable;

/* renamed from: anco */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anco implements Closeable {

    /* renamed from: a */
    public final ParcelFileDescriptor f76637a;

    /* renamed from: b */
    private boolean f76638b;

    public anco(ParcelFileDescriptor parcelFileDescriptor) {
        this.f76637a = parcelFileDescriptor;
        ancp.f76640b.incrementAndGet();
    }

    /* renamed from: a */
    public final void mo41704a(boolean z) {
        if (!this.f76638b) {
            this.f76638b = true;
            ancp.f76640b.decrementAndGet();
            if (z) {
                srz.m36170a(this.f76637a);
            }
        }
    }

    public final void close() {
        mo41704a(true);
    }
}
