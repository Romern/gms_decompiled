package p000;

import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;

/* renamed from: ahbf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ahbf extends FileInputStream implements begw, begd {

    /* renamed from: a */
    private final ParcelFileDescriptor f66957a;

    public ahbf(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor.getFileDescriptor());
        this.f66957a = parcelFileDescriptor;
    }

    /* renamed from: a */
    public final Long mo36254a() {
        return Long.valueOf(this.f66957a.getStatSize());
    }

    /* renamed from: b */
    public final FileChannel mo36255b() {
        return getChannel();
    }

    public final void close() {
        try {
            super.close();
        } finally {
            this.f66957a.close();
        }
    }
}
