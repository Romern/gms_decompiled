package p000;

import java.io.FilterInputStream;
import java.io.InputStream;

/* renamed from: bxsx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bxsx extends FilterInputStream {

    /* renamed from: a */
    private int f164757a;

    public bxsx(InputStream inputStream, int i) {
        super(inputStream);
        this.f164757a = i;
    }

    public final int available() {
        return Math.min(super.available(), this.f164757a);
    }

    public final int read() {
        if (this.f164757a <= 0) {
            return -1;
        }
        int read = super.read();
        if (read >= 0) {
            this.f164757a--;
        }
        return read;
    }

    public final long skip(long j) {
        long skip = super.skip(Math.min(j, (long) this.f164757a));
        if (skip >= 0) {
            this.f164757a = (int) (((long) this.f164757a) - skip);
        }
        return skip;
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.f164757a;
        if (i3 <= 0) {
            return -1;
        }
        int read = super.read(bArr, i, Math.min(i2, i3));
        if (read >= 0) {
            this.f164757a -= read;
        }
        return read;
    }
}
