package p000;

import android.os.ParcelFileDescriptor;
import java.nio.channels.FileChannel;

/* renamed from: cira */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cira implements circ {

    /* renamed from: a */
    final /* synthetic */ ParcelFileDescriptor f191269a;

    public cira(ParcelFileDescriptor parcelFileDescriptor) {
        this.f191269a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final FileChannel mo86389a() {
        if (this.f191269a.getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream(this.f191269a).getChannel();
        }
        this.f191269a.close();
        throw new IllegalArgumentException("Not a file: " + this.f191269a);
    }
}
