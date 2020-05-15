package p000;

import android.media.MediaDataSource;
import java.io.IOException;

/* renamed from: ajv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajv extends MediaDataSource {

    /* renamed from: a */
    long f686a;

    /* renamed from: b */
    final /* synthetic */ ajw f687b;

    public ajv(ajw ajw) {
        this.f687b = ajw;
    }

    public final void close() {
    }

    public final long getSize() {
        return -1;
    }

    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.f686a;
            if (j2 != j) {
                if (j2 >= 0) {
                    if (j >= j2 + ((long) this.f687b.available())) {
                        return -1;
                    }
                }
                this.f687b.mo842a(j);
                this.f686a = j;
            }
            if (i2 > this.f687b.available()) {
                i2 = this.f687b.available();
            }
            int read = this.f687b.read(bArr, i, i2);
            if (read >= 0) {
                this.f686a += (long) read;
                return read;
            }
        } catch (IOException e) {
        }
        this.f686a = -1;
        return -1;
    }
}
