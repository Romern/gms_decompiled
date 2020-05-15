package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: adab */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adab {

    /* renamed from: a */
    public static final adaa f61183a = new adaa(new Intent("com.google.android.gsf.notouch.LAUNCH_AUTH_UI").setPackage("com.google.android.gsf.notouch"), bmyd.ALWAYS_TRUE);

    /* renamed from: d */
    private static final adaa f61184d = new adaa(new Intent("com.google.android.gms.auth.account.authenticator.tv.service.START").setPackage("com.google.android.gms"), aczy.f61179a);

    /* renamed from: e */
    private static final adaa f61185e = new adaa(new Intent("com.google.android.gms.auth.account.authenticator.WearableAuthDelegateService.AUTH_UI").setPackage("com.google.android.gms"), aczz.f61180a);

    /* renamed from: f */
    private static final adaa f61186f;

    /* renamed from: g */
    private static final bngx f61187g;

    /* renamed from: b */
    public final Context f61188b;

    /* renamed from: c */
    public final Intent f61189c;

    static {
        adaa adaa = new adaa(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateService"), bmyd.ALWAYS_TRUE);
        f61186f = adaa;
        f61187g = bngx.m109359a(f61184d, f61183a, f61185e, adaa);
    }

    public adab(Context context) {
        this.f61188b = context;
        bnre i = f61187g.listIterator();
        while (i.hasNext()) {
            bmxv a = ((adaa) i.next()).mo33281a(context);
            if (a.mo66813a()) {
                this.f61189c = (Intent) a.mo66814b();
                return;
            }
        }
        throw new IllegalStateException("Unable to get the service intent for auth UI delegate.");
    }
}
