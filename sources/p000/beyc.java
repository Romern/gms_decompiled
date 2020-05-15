package p000;

import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: beyc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beyc {

    /* renamed from: a */
    public static final Collection f113001a = Arrays.asList("com.google.android.location");

    /* renamed from: b */
    public static Context f113002b = null;

    /* renamed from: c */
    public static boolean f113003c = false;

    /* renamed from: d */
    private static fjk f113004d;

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return null;
     */
    /* renamed from: a */
    public static synchronized fjk m96081a() {
        synchronized (beyc.class) {
            Context context = f113002b;
            if (f113004d != null) {
                fjk fjk = f113004d;
                return fjk;
            } else if (context != null) {
                if (cevw.f183465a.mo6606a().analyticsEnabled()) {
                    fjk a = fip.m11765a(context).mo10855a(cevw.f183465a.mo6606a().analyticsTrackingId());
                    f113004d = a;
                    fjj fjj = a.f16723b;
                    fjj.f16720a = -1000;
                    fip j = fjj.mo10945j();
                    j.f16673d.remove(fjj.f16721b.f16723b);
                    f113004d.mo10892a("&dr", "location");
                    fjk fjk2 = f113004d;
                    return fjk2;
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        return;
     */
    /* renamed from: a */
    public static synchronized void m96082a(Context context) {
        synchronized (beyc.class) {
            if (f113002b == null) {
                Context applicationContext = context.getApplicationContext();
                f113002b = applicationContext;
                if (applicationContext != null) {
                    int i = Build.VERSION.SDK_INT;
                    if (cevw.m138328m()) {
                        avtz.m79338b(applicationContext).mo24673E().mo50373a(beya.f112999a);
                        return;
                    }
                    rjy rjy = new rjy(applicationContext);
                    rjy.mo24779a(avtz.f93909a);
                    rjy.f43174c = "Location-AnalyticsUtils";
                    rkb b = rjy.mo24784b();
                    b.mo24801e();
                    avva.m79409a(b).mo9458a(new beyb(b));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m96083a(String str, String str2, String str3, long j) {
        fjk a = m96081a();
        if (a == null) {
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42 + String.valueOf(str3).length());
            sb.append("location analytics disabled, can't send ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            sb.toString();
        } else if (!f113003c && str.equals("ar")) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 36 + String.valueOf(str3).length());
            sb2.append("Ar analytics disabled, can't send ");
            sb2.append(str2);
            sb2.append(", ");
            sb2.append(str3);
            sb2.toString();
        } else {
            String p = cese.m138167p();
            int length = String.valueOf(str).length();
            int length2 = String.valueOf(str2).length();
            StringBuilder sb3 = new StringBuilder(length + 58 + length2 + String.valueOf(str3).length() + String.valueOf(p).length());
            sb3.append("Event ");
            sb3.append(str);
            sb3.append(".");
            sb3.append(str2);
            sb3.append("=");
            sb3.append(str3);
            sb3.append(": ");
            sb3.append(j);
            sb3.append(". AnalyticsUtil userDomain: ");
            sb3.append(p);
            sb3.toString();
            fir fir = new fir((char[]) null);
            fir.mo10862a(j);
            fir.mo10864b("utm_source=location");
            fir.mo10865c(str2);
            fir.mo10866d(str);
            fir.mo10867e(str3);
            fir.mo10858a(1, p);
            a.mo10893a(fir.mo10861a());
        }
    }
}
