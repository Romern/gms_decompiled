package p000;

/* renamed from: blbo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class blbo {

    /* renamed from: a */
    public final byte[] f125842a;

    /* renamed from: b */
    public int f125843b;

    /* renamed from: c */
    public int f125844c;

    /* renamed from: d */
    public byte f125845d = 0;

    /* renamed from: e */
    public boolean f125846e = false;

    /* renamed from: f */
    private final int f125847f;

    /* renamed from: g */
    private int f125848g;

    /* renamed from: h */
    private int f125849h;

    public blbo(int i) {
        boolean z = false;
        bmxy.m108588a(i > 0 ? true : z);
        this.f125847f = 1;
        this.f125842a = new byte[i];
        mo66463c();
    }

    /* renamed from: a */
    private final String m106983a(int i, int i2) {
        blbs blbs = new blbs();
        int min = Math.min(i2, this.f125842a.length - i);
        blbs.mo66468a(this.f125842a, i, min);
        if (min < i2) {
            blbs.mo66468a(this.f125842a, 0, i2 - min);
        }
        byte[] digest = blbs.f125861a.digest();
        int length = digest.length;
        StringBuilder sb = new StringBuilder(length + length);
        for (byte b : digest) {
            sb.append(blbs.f125860b[(b >> 4) & 15]);
            sb.append(blbs.f125860b[b & 15]);
        }
        return sb.toString();
    }

    /* renamed from: c */
    private static final int m106984c(int i) {
        return ((i % 65521) + 65521) % 65521;
    }

    /* renamed from: a */
    public final int mo66458a() {
        return this.f125842a.length;
    }

    /* renamed from: b */
    public final String mo66461b(int i) {
        boolean z = true;
        bmxy.m108588a(i >= 0);
        bmxy.m108588a(i <= this.f125842a.length);
        if (this.f125844c < i) {
            z = false;
        }
        bmxy.m108600b(z);
        int length = this.f125842a.length;
        return m106983a(((this.f125843b + length) - i) % length, i);
    }

    /* renamed from: b */
    public final boolean mo66462b() {
        return this.f125844c == this.f125842a.length;
    }

    /* renamed from: c */
    public final void mo66463c() {
        this.f125843b = 0;
        this.f125848g = this.f125847f;
        this.f125849h = 0;
        this.f125844c = 0;
        this.f125846e = false;
    }

    /* renamed from: d */
    public final int mo66464d() {
        bmxy.m108600b(mo66462b());
        return ((char) this.f125848g) | (this.f125849h << 16);
    }

    /* renamed from: e */
    public final String mo66465e() {
        bmxy.m108600b(mo66462b());
        return m106983a(this.f125843b, this.f125842a.length);
    }

    /* renamed from: a */
    public final int mo66459a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108588a(z);
        if (i > this.f125842a.length) {
            z2 = false;
        }
        bmxy.m108588a(z2);
        int i2 = this.f125848g;
        int i3 = this.f125849h;
        for (int i4 = this.f125844c; i4 > i; i4--) {
            byte[] bArr = this.f125842a;
            int length = bArr.length;
            byte b = bArr[((this.f125843b + length) - i4) % length] & 255;
            i2 = m106984c(i2 - b);
            i3 = m106984c((i3 - (b * i4)) - 1);
        }
        return ((char) i2) | (i3 << 16);
    }

    /* renamed from: a */
    public final void mo66460a(byte b) {
        byte b2 = b & 255;
        if (!mo66462b()) {
            int c = m106984c(this.f125848g + b2);
            this.f125848g = c;
            this.f125849h = m106984c(this.f125849h + c);
            this.f125844c++;
        } else {
            byte b3 = this.f125842a[this.f125843b] & 255;
            int c2 = m106984c((this.f125848g + b2) - b3);
            this.f125848g = c2;
            this.f125849h = m106984c(((this.f125849h + c2) - (this.f125842a.length * b3)) - 1);
            this.f125845d = this.f125842a[this.f125843b];
            this.f125846e = true;
        }
        byte[] bArr = this.f125842a;
        int i = this.f125843b;
        bArr[i] = b;
        this.f125843b = (i + 1) % bArr.length;
    }
}
