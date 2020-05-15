package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;

/* renamed from: gkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkk {

    /* renamed from: a */
    public static final sek f18400a = ght.m13171a("BroadcastManager");

    /* renamed from: b */
    public static final imr f18401b = imr.m15727a("accountsAdded");

    /* renamed from: c */
    public static final imr f18402c = imr.m15727a("accountsRemoved");

    /* renamed from: d */
    public static final imr f18403d = imr.m15727a("accountsMutated");

    /* renamed from: e */
    public static final imr f18404e = imr.m15727a("account");

    /* renamed from: f */
    public static final imr f18405f = imr.m15727a("dmStatus");

    /* renamed from: g */
    public final Context f18406g;

    /* renamed from: h */
    public final PackageManager f18407h;

    /* renamed from: i */
    public final rfz f18408i;

    /* renamed from: j */
    public final ily f18409j = ((ily) ily.f21320d.mo13145b());

    public gkk(Context context) {
        PackageManager packageManager = context.getPackageManager();
        rfz a = rfz.m33557a(context);
        this.f18406g = context;
        this.f18407h = packageManager;
        this.f18408i = a;
    }

    /* renamed from: a */
    public final void mo11986a(Intent intent, String str) {
        this.f18406g.sendBroadcast(new Intent(intent).setPackage(str));
    }
}
