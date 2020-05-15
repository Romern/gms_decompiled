package p000;

import java.nio.charset.Charset;

/* renamed from: bnzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bnzx extends bnyq {

    /* renamed from: a */
    private int f132431a;

    /* renamed from: b */
    private long f132432b;

    /* renamed from: c */
    private int f132433c;

    /* renamed from: d */
    private int f132434d = 0;

    /* renamed from: e */
    private boolean f132435e = false;

    public bnzx(int i) {
        this.f132431a = i;
    }

    /* renamed from: a */
    private final void m110939a(int i, long j) {
        long j2 = this.f132432b;
        int i2 = this.f132433c;
        long j3 = ((j & 4294967295L) << i2) | j2;
        this.f132432b = j3;
        int i3 = i2 + (i * 8);
        this.f132433c = i3;
        this.f132434d += i;
        if (i3 >= 32) {
            this.f132431a = bnzy.m110947a(this.f132431a, bnzy.m110949b((int) j3));
            this.f132432b >>>= 32;
            this.f132433c -= 32;
        }
    }

    /* renamed from: a */
    public final bnzb mo68729a() {
        bmxy.m108600b(!this.f132435e);
        this.f132435e = true;
        int b = this.f132431a ^ bnzy.m110949b((int) this.f132432b);
        this.f132431a = b;
        return bnzy.m110952b(b, this.f132434d);
    }

    /* renamed from: b */
    public final void mo68716b(byte b) {
        m110939a(1, (long) (b & 255));
    }

    /* renamed from: b */
    public final void mo68718b(byte[] bArr, int i, int i2) {
        bmxy.m108585a(i, i + i2, bArr.length);
        int i3 = 0;
        while (true) {
            int i4 = i3 + 4;
            if (i4 > i2) {
                break;
            }
            m110939a(4, (long) bnzy.m110950b(bArr, i3 + i));
            i3 = i4;
        }
        while (i3 < i2) {
            mo68716b(bArr[i + i3]);
            i3++;
        }
    }

    /* renamed from: a */
    public final bnzd mo68725a(CharSequence charSequence, Charset charset) {
        if (!bmwy.f131158c.equals(charset)) {
            return super.mo68725a(charSequence, charset);
        }
        int length = charSequence.length();
        int i = 0;
        while (true) {
            int i2 = i + 4;
            if (i2 > length) {
                break;
            }
            char charAt = charSequence.charAt(i);
            char charAt2 = charSequence.charAt(i + 1);
            char charAt3 = charSequence.charAt(i + 2);
            char charAt4 = charSequence.charAt(i + 3);
            if (charAt >= 128 || charAt2 >= 128 || charAt3 >= 128 || charAt4 >= 128) {
                break;
            }
            m110939a(4, (long) ((charAt2 << 8) | charAt | (charAt3 << 16) | (charAt4 << 24)));
            i = i2;
        }
        while (i < length) {
            char charAt5 = charSequence.charAt(i);
            if (charAt5 < 128) {
                m110939a(1, (long) charAt5);
            } else if (charAt5 < 2048) {
                m110939a(2, bnzy.m110951b(charAt5));
            } else if (charAt5 >= 55296 && charAt5 <= 57343) {
                int codePointAt = Character.codePointAt(charSequence, i);
                if (codePointAt != charAt5) {
                    i++;
                    m110939a(4, bnzy.m110953c(codePointAt));
                } else {
                    mo68717b(charSequence.subSequence(i, length).toString().getBytes(charset));
                    return this;
                }
            } else {
                m110939a(3, bnzy.m110948a(charAt5));
            }
            i++;
        }
        return this;
    }

    /* renamed from: a */
    public final void mo68711a(char c) {
        m110939a(2, (long) c);
    }

    /* renamed from: a */
    public final void mo68712a(int i) {
        m110939a(4, (long) i);
    }

    /* renamed from: a */
    public final void mo68713a(long j) {
        m110939a(4, (long) ((int) j));
        m110939a(4, j >>> 32);
    }
}
