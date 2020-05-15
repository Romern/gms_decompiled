package p000;

import java.nio.charset.Charset;

/* renamed from: bnyq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnyq implements bnzd {
    /* renamed from: a */
    public bnzd mo68725a(CharSequence charSequence, Charset charset) {
        mo68717b(charSequence.toString().getBytes(charset));
        return this;
    }

    /* renamed from: b */
    public void mo68717b(byte[] bArr) {
        mo68718b(bArr, 0, bArr.length);
    }

    /* renamed from: b */
    public void mo68718b(byte[] bArr, int i, int i2) {
        throw null;
    }

    /* renamed from: a */
    public void mo68711a(char c) {
        mo68716b((byte) c);
        mo68716b((byte) (c >>> 8));
    }

    /* renamed from: a */
    public final void mo68726a(double d) {
        mo68713a(Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public void mo68712a(int i) {
        mo68716b((byte) i);
        mo68716b((byte) (i >>> 8));
        mo68716b((byte) (i >>> 16));
        mo68716b((byte) (i >> 24));
    }

    /* renamed from: a */
    public void mo68713a(long j) {
        for (int i = 0; i < 64; i += 8) {
            mo68716b((byte) ((int) (j >>> i)));
        }
    }

    /* renamed from: a */
    public final void mo68727a(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            mo68711a(charSequence.charAt(i));
        }
    }

    /* renamed from: a */
    public final void mo68728a(boolean z) {
        mo68716b(z ? (byte) 1 : 0);
    }
}
