package p000;

import android.os.Build;
import android.os.SystemClock;
import java.util.Locale;

/* renamed from: betg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class betg implements bgmf {

    /* renamed from: a */
    private final bfor f112378a;

    /* renamed from: b */
    private final bexe f112379b = new bexe(Build.DEVICE);

    /* renamed from: c */
    private final berb f112380c;

    /* renamed from: d */
    private final beth f112381d;

    public betg(bfor bfor, berb berb, beth beth) {
        this.f112378a = bfor;
        this.f112380c = berb;
        this.f112381d = beth;
    }

    /* renamed from: a */
    public final void mo61124a(bgmg bgmg) {
        boolean z;
        bgmg bgmg2 = bgmg;
        if (cfam.m138540j() && cfam.m138534d()) {
            String format = String.format(Locale.US, "m=%d, t=%.2f, l=%.1f, l_m=%.1f, noise=%.1f, ts=%d, pres=%d,", Integer.valueOf(bgmg2.f116816d), Float.valueOf(bgmg2.f116815c), Float.valueOf(bgmg2.f116813a), Float.valueOf(bgmg2.f116814b), Float.valueOf(bgmg2.f116817e), Long.valueOf(bgmg2.f116818f), Integer.valueOf(bgmg2.f116819g));
            String valueOf = String.valueOf(format);
            if (valueOf.length() == 0) {
                new String("CHRE data received: ");
            } else {
                "CHRE data received: ".concat(valueOf);
            }
            bexj h = this.f112380c.mo60992h();
            if (h != null) {
                this.f112380c.f112166ap = SystemClock.elapsedRealtime();
                bexk a = this.f112379b.mo61218a(bgmg2);
                int a2 = h.mo61226a(a);
                StringBuilder sb = new StringBuilder();
                String[] strArr = bexk.f112906M;
                for (String str : strArr) {
                    sb.append(", ");
                    sb.append(str);
                    sb.append(" = ");
                    sb.append(a.mo61227a(str));
                }
                String valueOf2 = String.valueOf(sb.toString());
                if (valueOf2.length() == 0) {
                    new String("CHRE features: ");
                } else {
                    "CHRE features: ".concat(valueOf2);
                }
                beth beth = this.f112381d;
                if (beth != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (bgmg2.f116816d > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    beth.mo61127a(a2, currentTimeMillis, elapsedRealtime, a, z);
                    this.f112378a.mo62047a(new bfop(bfos.CHRE_SLEEP_EVENT, this.f112378a.mo62055b(), null, format, -1, -1, -1));
                }
            }
        }
    }
}
