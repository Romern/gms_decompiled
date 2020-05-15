package p000;

import android.nfc.tech.IsoDep;

/* renamed from: xkx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xkx {

    /* renamed from: a */
    public final IsoDep f52637a;

    public xkx(IsoDep isoDep) {
        this.f52637a = isoDep;
    }

    /* renamed from: a */
    public final void mo29884a() {
        this.f52637a.setTimeout(800);
    }

    /* renamed from: a */
    public final byte[] mo29885a(byte[] bArr) {
        return this.f52637a.transceive(bArr);
    }
}
