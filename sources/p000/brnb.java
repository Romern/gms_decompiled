package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

/* renamed from: brnb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brnb extends brmj {

    /* renamed from: g */
    private final String f143005g;

    public brnb(String str, String str2, brps brps, String str3, brpp brpp) {
        super(str, str2, brps, brpp, "SendPasswordResetEmail");
        this.f143005g = str3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo69748a(Context context, brph brph) {
        String str = this.f143005g;
        brpj brpj = this.f142967a;
        sdo.m34959a(brpj);
        brpw brpw = brph.f143125b;
        broy broy = new broy(brpj);
        SharedPreferences.Editor putBoolean = brpw.f143143c.getSharedPreferences(String.format("com.google.firebase.auth.internal.proxyApiHelper.%s", brpw.f143142b.f143146a), 0).edit().putBoolean("com.google.firebase.auth.internal.FIREBASE_UI_BIT", true ^ TextUtils.isEmpty(str));
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        putBoolean.putString("com.google.firebase.auth.internal.FIREBASE_UI_VERSION", str).apply();
        broy.mo69749a((Object) null);
    }
}
