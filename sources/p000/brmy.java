package p000;

import android.content.Context;

/* renamed from: brmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brmy extends brmj {

    /* renamed from: g */
    private final String f142999g;

    public brmy(String str, String str2, brps brps, String str3, brpp brpp) {
        super(str, str2, brps, brpp, "Reload");
        this.f142999g = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f142999g;
        brpj brpj = this.f142967a;
        sdo.m34977c(str);
        sdo.m34959a(brpj);
        brph.mo69756a(str, new brov(brph, brpj));
    }
}
