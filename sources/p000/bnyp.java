package p000;

import java.nio.charset.Charset;

/* renamed from: bnyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class bnyp implements bnzc {
    /* renamed from: a */
    public bnzb mo68719a(long j) {
        bnzd a = mo68724a(8);
        a.mo68713a(j);
        return a.mo68729a();
    }

    /* renamed from: a */
    public bnzb mo68720a(CharSequence charSequence) {
        int length = charSequence.length();
        bnzd a = mo68724a(length + length);
        a.mo68727a(charSequence);
        return a.mo68729a();
    }

    /* renamed from: a */
    public bnzb mo68721a(CharSequence charSequence, Charset charset) {
        return mo68732a().mo68725a(charSequence, charset).mo68729a();
    }

    /* renamed from: a */
    public final bnzb mo68722a(byte[] bArr) {
        return mo68723a(bArr, bArr.length);
    }

    /* renamed from: a */
    public bnzb mo68723a(byte[] bArr, int i) {
        bmxy.m108585a(0, i, bArr.length);
        bnzd a = mo68724a(i);
        a.mo68718b(bArr, 0, i);
        return a.mo68729a();
    }

    /* renamed from: a */
    public bnzd mo68724a(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108591a(z, "expectedInputSize must be >= 0 but was %s", i);
        return mo68732a();
    }
}
