package p000;

import android.content.Context;

/* renamed from: brnc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnc extends brmj {

    /* renamed from: g */
    private final String f143006g;

    public brnc(String str, String str2, brps brps, String str3, brpp brpp) {
        super(str, str2, brps, brpp, "SignInAnonymously");
        this.f143006g = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f143006g;
        brpj brpj = this.f142967a;
        sdo.m34959a(brpj);
        brph.f143125b.mo69785a(new brrc(str), new brpb(brph, brpj));
    }
}
