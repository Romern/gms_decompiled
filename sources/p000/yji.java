package p000;

/* renamed from: yji */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yji {
    /* renamed from: a */
    private static ygd m44228a(String str) {
        return ygv.m44053a(ygv.f53776f, ygv.m44050a(str));
    }

    /* renamed from: a */
    public static yha m44229a(String str, yhs yhs, String str2) {
        yha yha = new yha(bngx.m109356a(new ygy(str2)));
        yhb e = yhc.m44078e();
        e.mo30487a(m44228a(str));
        e.mo30488a(ynn.LOCAL_AND_REMOTE);
        e.mo30489a(false);
        yhc a = e.mo30486a();
        yhb e2 = yhc.m44078e();
        e2.mo30487a(m44228a(bzzr.m126368a(str)));
        e2.f53808a = bmxv.m108566b(yhs);
        e2.mo30488a(ynn.LOCAL_ONLY);
        e2.mo30489a(true);
        yha.mo30483a(str2, bngx.m109357a(a, e2.mo30486a()));
        return yha;
    }
}
