package p000;

import android.content.Context;

/* renamed from: brmv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmv extends brmj {

    /* renamed from: g */
    private final String f142992g;

    /* renamed from: h */
    private final String f142993h;

    /* renamed from: i */
    private final String f142994i;

    public brmv(String str, String str2, brps brps, String str3, String str4, String str5, brpp brpp) {
        super(str, str2, brps, brpp, "LinkEmailAuthCredential");
        this.f142992g = str3;
        this.f142993h = str4;
        this.f142994i = str5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142992g;
        String str2 = this.f142993h;
        String str3 = this.f142994i;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34977c(str3);
        sdo.m34959a(brpj);
        brph.mo69756a(str3, new broe(brph, str, str2, brpj));
    }
}
