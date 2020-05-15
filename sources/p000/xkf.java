package p000;

/* renamed from: xkf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class xkf {
    /* renamed from: a */
    public abstract xke mo29860a();

    /* renamed from: b */
    public abstract bypu mo29861b();

    /* renamed from: c */
    public final byte[] mo29862c() {
        xke a = mo29860a();
        xke xke = xke.AUTHENTICATOR_MAKE_CREDENTIAL;
        byte[] bArr = {a.f52498g};
        bypu b = mo29861b();
        if (b == null) {
            return bArr;
        }
        return bqce.m112562a(bArr, b.mo74444c());
    }
}
