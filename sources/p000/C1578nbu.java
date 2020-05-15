package p000;

/* renamed from: nbu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1578nbu {

    /* renamed from: a */
    public final bngs f35216a = bngx.m109377j();

    /* renamed from: a */
    public final void mo20442a(String str, nbw nbw) {
        boolean z;
        if (str.length() != 0) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108589a(z, "Key must have non-zero length");
        bmxy.m108582a(nbw, "Hash must not be null");
        bxvd da = mcw.f33453d.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mcw mcw = (mcw) da.f164949b;
        str.getClass();
        mcw.f33455a = 1 | mcw.f33455a;
        mcw.f33456b = str;
        ByteString a = ByteString.m123261a(nbw.f35217a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        mcw mcw2 = (mcw) da.f164949b;
        a.getClass();
        mcw2.f33455a |= 2;
        mcw2.f33457c = a;
        this.f35216a.mo67668c((mcw) da.mo74062i());
    }
}
