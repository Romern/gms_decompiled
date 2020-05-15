package p000;

import android.os.ParcelFileDescriptor;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* renamed from: ahbg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahbg extends FileOutputStream implements begx, begd {

    /* renamed from: a */
    private final ParcelFileDescriptor f66958a;

    public ahbg(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.f66958a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final void mo36257a() {
        getFD().sync();
    }

    /* renamed from: b */
    public final FileChannel mo36255b() {
        return getChannel();
    }

    public final void close() {
        try {
            super.close();
        } finally {
            this.f66958a.close();
        }
    }
}
