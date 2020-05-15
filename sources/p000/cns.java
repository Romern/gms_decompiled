package p000;

import android.graphics.Bitmap;

/* renamed from: cns */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cns {

    /* renamed from: a */
    public final cgt f7113a;

    /* renamed from: b */
    public final cgr f7114b;

    public cns(cgt cgt, cgr cgr) {
        this.f7113a = cgt;
        this.f7114b = cgr;
    }

    /* renamed from: a */
    public final void mo4003a(Bitmap bitmap) {
        this.f7113a.mo3881a(bitmap);
    }

    /* renamed from: a */
    public final void mo4004a(byte[] bArr) {
        cgr cgr = this.f7114b;
        if (cgr != null) {
            cgr.mo3874a(bArr);
        }
    }

    /* renamed from: a */
    public final byte[] mo4005a(int i) {
        cgr cgr = this.f7114b;
        if (cgr != null) {
            return (byte[]) cgr.mo3870a(i, byte[].class);
        }
        return new byte[i];
    }
}
