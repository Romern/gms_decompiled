package p000;

import java.io.InputStream;

/* renamed from: clv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class clv implements clu {

    /* renamed from: a */
    public final InputStream f7034a;

    public clv(InputStream inputStream) {
        this.f7034a = inputStream;
    }

    /* renamed from: a */
    public final long mo3960a(long j) {
        if (j < 0) {
            return 0;
        }
        long j2 = j;
        while (j2 > 0) {
            long skip = this.f7034a.skip(j2);
            if (skip <= 0) {
                if (this.f7034a.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= skip;
            }
        }
        return j - j2;
    }

    /* renamed from: b */
    public final int mo3962b() {
        return (mo3961a() << 8) | mo3961a();
    }

    /* renamed from: a */
    public final short mo3961a() {
        int read = this.f7034a.read();
        if (read != -1) {
            return (short) read;
        }
        throw new clt();
    }
}
