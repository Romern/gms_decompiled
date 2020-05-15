package p000;

import android.content.Context;

/* renamed from: brmm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmm extends brmj {

    /* renamed from: g */
    private final String f142976g;

    /* renamed from: h */
    private final String f142977h;

    public brmm(String str, String str2, brps brps, String str3, String str4, brpp brpp) {
        super(str, str2, brps, brpp, "ChangePassword");
        this.f142976g = str3;
        this.f142977h = str4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142976g;
        String str2 = this.f142977h;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34977c(str2);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new brpe(brph, str2, brpj));
    }
}
