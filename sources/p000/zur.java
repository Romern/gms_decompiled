package p000;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: zur */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zur implements zus {

    /* renamed from: a */
    private final Context f55953a;

    /* renamed from: b */
    private final String f55954b;

    /* renamed from: c */
    private final zuu f55955c;

    /* renamed from: d */
    private final zre f55956d;

    /* renamed from: e */
    private final zqx f55957e;

    /* renamed from: f */
    private final sqv f55958f;

    public zur(Context context, String str, zuu zuu, zre zre, zqx zqx, sqv sqv) {
        this.f55953a = context;
        this.f55954b = str;
        this.f55955c = zuu;
        this.f55956d = zre;
        this.f55957e = zqx;
        this.f55958f = sqv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: zul.a(android.content.Context, zuu, zra):void
     arg types: [android.content.Context, zuu, zre]
     candidates:
      zul.a(android.content.Context, zuu, zre):void
      zul.a(android.content.Context, zuu, zra):void */
    /* renamed from: a */
    public final void mo31533a(zsr zsr, cadt cadt) {
        zum zum = new zum();
        SharedPreferences d = zuw.m46538d(this.f55953a, this.f55954b);
        zul zul = new zul(zsr, d, zum, zvn.m46574a(this.f55953a), this.f55958f);
        zun zun = new zun(d, zum, zsr);
        zul.mo31529a(this.f55953a, this.f55955c, this.f55956d, this.f55957e);
        if (zul.m46500a(this.f55953a, cadt)) {
            zul.mo31526a(this.f55953a, this.f55955c, (zra) this.f55956d);
        }
        zun.mo31532a(this.f55955c, this.f55956d);
    }
}
