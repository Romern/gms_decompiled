package p000;

import android.content.Context;

/* renamed from: brmp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmp extends brmj {

    /* renamed from: g */
    private final String f142983g;

    /* renamed from: h */
    private final String f142984h;

    /* renamed from: i */
    private final String f142985i;

    public brmp(String str, String str2, brps brps, String str3, String str4, String str5, brpp brpp) {
        super(str, str2, brps, brpp, "CreateUserWithEmailAndPassword");
        this.f142983g = str3;
        this.f142984h = str4;
        this.f142985i = str5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142983g;
        String str2 = this.f142984h;
        String str3 = this.f142985i;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34959a(brpj);
        brph.f143125b.mo69785a(new brrc(str, str2, str3), new brnq(brph, brpj));
    }
}
