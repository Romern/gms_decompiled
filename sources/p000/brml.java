package p000;

import android.content.Context;

/* renamed from: brml */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brml extends brmj {

    /* renamed from: g */
    private final String f142974g;

    /* renamed from: h */
    private final String f142975h;

    public brml(String str, String str2, brps brps, String str3, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "ChangeEmail");
        this.f142974g = str3;
        this.f142975h = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142974g;
        String str2 = this.f142975h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new brpd(brph, str2, brpj));
    }
}
