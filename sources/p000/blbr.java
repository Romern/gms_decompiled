package p000;

import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Locale;

/* renamed from: blbr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class blbr implements blbk {

    /* renamed from: a */
    private static final Charset f125854a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final int f125855b;

    /* renamed from: c */
    private final OutputStream f125856c;

    /* renamed from: d */
    private final byte[] f125857d;

    /* renamed from: e */
    private int f125858e = 0;

    /* renamed from: f */
    private blbg f125859f;

    public blbr(OutputStream outputStream, int i) {
        this.f125856c = outputStream;
        this.f125855b = i;
        this.f125857d = new byte[i];
    }

    /* renamed from: b */
    private final void m106995b() {
        this.f125856c.write(Integer.toString(this.f125858e).getBytes(f125854a));
        this.f125856c.write(10);
        this.f125856c.write(this.f125857d, 0, this.f125858e);
        this.f125856c.write(10);
        this.f125858e = 0;
    }

    /* renamed from: c */
    private final void m106996c() {
        if (this.f125859f != null) {
            this.f125856c.write(String.format(Locale.US, "%d-%d", Long.valueOf(this.f125859f.f125822a), Long.valueOf(this.f125859f.f125823b)).getBytes(f125854a));
            this.f125856c.write(10);
            this.f125859f = null;
        }
    }

    /* renamed from: a */
    public final void mo66449a() {
        boolean z = true;
        if (!(this.f125858e == 0 || this.f125859f == null)) {
            z = false;
        }
        bmxy.m108600b(z);
        if (this.f125858e != 0) {
            m106995b();
        }
        if (this.f125859f != null) {
            m106996c();
        }
        this.f125856c.flush();
    }

    /* renamed from: a */
    public final void mo66450a(byte b) {
        if (this.f125859f != null) {
            m106996c();
        }
        byte[] bArr = this.f125857d;
        int i = this.f125858e;
        int i2 = i + 1;
        this.f125858e = i2;
        bArr[i] = b;
        if (i2 == this.f125855b) {
            m106995b();
        }
    }

    /* renamed from: a */
    public final void mo66451a(long j, int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        bmxy.m108588a(z2);
        if (this.f125858e != 0) {
            m106995b();
        }
        blbg blbg = this.f125859f;
        if (blbg != null && blbg.f125823b + 1 == j) {
            long j2 = (long) i;
            if (j2 <= 0) {
                z3 = false;
            }
            bmxy.m108588a(z3);
            this.f125859f = new blbg(blbg.f125822a, blbg.f125823b + j2);
            return;
        }
        m106996c();
        this.f125859f = new blbg(j, (((long) i) + j) - 1);
    }
}
