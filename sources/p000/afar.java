package p000;

import android.content.Context;
import android.telephony.TelephonyManager;

/* renamed from: afar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afar {

    /* renamed from: a */
    public final Context f64098a;

    /* renamed from: b */
    public final afby f64099b;

    /* renamed from: c */
    public final TelephonyManager f64100c;

    /* renamed from: d */
    public final afai f64101d;

    public afar(Context context) {
        afby a = afbv.m52820a(context);
        afai afai = new afai(context);
        this.f64098a = context;
        this.f64099b = a;
        this.f64100c = (TelephonyManager) context.getSystemService("phone");
        this.f64101d = afai;
    }
}
