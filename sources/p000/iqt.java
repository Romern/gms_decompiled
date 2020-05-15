package p000;

import android.content.Context;

/* renamed from: iqt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iqt {

    /* renamed from: e */
    public static final Logger f21581e = new Logger(new String[]{"GcmNotificationHandler"}, (byte[]) null);

    /* renamed from: a */
    public final Context f21582a;

    /* renamed from: b */
    public final ism f21583b;

    /* renamed from: c */
    public final iqi f21584c;

    /* renamed from: d */
    public final ipo f21585d;

    public iqt(Context context) {
        ism ism = new ism(context);
        iqi iqi = new iqi(context);
        ipo ipo = new ipo(context);
        this.f21582a = context;
        this.f21583b = ism;
        this.f21584c = iqi;
        this.f21585d = ipo;
    }
}
