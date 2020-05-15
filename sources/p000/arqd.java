package p000;

import android.content.Context;

/* renamed from: arqd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class arqd {

    /* renamed from: a */
    private static volatile arlt f88115a;

    private arqd() {
    }

    /* renamed from: b */
    public static ascx m73297b(Context context) {
        return new ascx(context, m73296a());
    }

    /* renamed from: c */
    public static arlt m73298c(Context context) {
        if (f88115a == null) {
            synchronized (arqd.class) {
                if (f88115a == null) {
                    f88115a = new arlt(context);
                }
            }
        }
        return f88115a;
    }

    /* renamed from: d */
    public static arac m73299d(Context context) {
        return new arqc(context);
    }

    /* renamed from: a */
    public static ahie m73295a(Context context) {
        aqxm.m72204e();
        ahif ahif = new ahif();
        ahif.f67236a = "smartdevice";
        return ahcb.m55439a(context, ahif.mo36530a());
    }

    /* renamed from: a */
    public static ascv m73296a() {
        aqxm.m72204e();
        return ascv.m73797a();
    }
}
