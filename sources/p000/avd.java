package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: avd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class avd extends FilterInputStream {

    /* renamed from: a */
    final /* synthetic */ avf f2361a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avd(avf avf, InputStream inputStream) {
        super(inputStream);
        this.f2361a = avf;
    }

    public final int read() {
        avf avf = this.f2361a;
        int i = avf.f2368e;
        if (i == -1 || avf.f2367d < i) {
            int read = super.read();
            this.f2361a.f2367d++;
            return read;
        }
        throw new IOException();
    }

    public final long skip(long j) {
        avf avf = this.f2361a;
        int i = avf.f2368e;
        if (i == -1 || avf.f2367d < i) {
            long skip = super.skip(j);
            if (skip > 0) {
                this.f2361a.f2367d += (int) skip;
            }
            return skip;
        }
        throw new IOException();
    }

    public final int read(byte[] bArr, int i, int i2) {
        avf avf = this.f2361a;
        int i3 = avf.f2368e;
        if (i3 == -1 || avf.f2367d < i3) {
            int read = super.read(bArr, i, i2);
            if (read > 0) {
                this.f2361a.f2367d += read;
            }
            return read;
        }
        throw new IOException();
    }
}
