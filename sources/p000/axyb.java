package p000;

import java.util.Map;
import java.util.TreeMap;

/* renamed from: axyb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class axyb implements ayjm {

    /* renamed from: b */
    private static final Long[] f96747b = {60000L, 600000L, 3600000L, 86400000L, 0L};

    /* renamed from: a */
    private final Map f96748a = new TreeMap();

    /* renamed from: a */
    private final void m83548a(long j, String str, String str2, int i) {
        aydw aydw = (aydw) this.f96748a.get(str);
        if (aydw == null) {
            aydw = new aydw(f96747b);
            this.f96748a.put(str, aydw);
        }
        aydv aydv = (aydv) aydw.f97262b.get(str2);
        if (aydv == null) {
            aydv = new aydv(aydw.f97261a);
            aydw.f97262b.put(str2, aydv);
        }
        int length = aydv.f97260a.length;
        for (int i2 = 0; i2 < length; i2++) {
            aydv.f97260a[i2].mo53974a(j, (long) i);
        }
    }

    /* renamed from: a */
    private static final void m83549a(ssb ssb, long j, String str, aydw aydw) {
        ssb.println(str);
        ssb.mo26034a();
        for (Map.Entry entry : aydw.f97262b.entrySet()) {
            aydu[] ayduArr = ((aydv) entry.getValue()).f97260a;
            ssb.printf("%-15s %12d %12d %12d %12d %12d\n", (String) entry.getKey(), Long.valueOf(ayduArr[0].mo53973a(j)), Long.valueOf(ayduArr[1].mo53973a(j)), Long.valueOf(ayduArr[2].mo53973a(j)), Long.valueOf(ayduArr[3].mo53973a(j)), Long.valueOf(ayduArr[4].mo53973a(j)));
        }
        ssb.mo26035b();
    }

    /* renamed from: a */
    public void mo53756a(axya axya, String str, int i) {
        String axya2 = axya.toString();
        if (axya2 == null) {
            axya2 = "catchallTarget";
        }
        String str2 = axya2;
        if (i >= 0) {
            synchronized (this.f96748a) {
                long currentTimeMillis = System.currentTimeMillis();
                m83548a(currentTimeMillis, "Total", str, i);
                m83548a(currentTimeMillis, str2, str, i);
            }
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        ssb.println("Data Usage Stats");
        ssb.mo26034a();
        ssb.mo26034a();
        ssb.printf("%-15s %12s %12s %12s %12s %12s\n", "", "Minute", "10 Minutes", "Hour", "Day", "Total");
        ssb.mo26035b();
        synchronized (this.f96748a) {
            long currentTimeMillis = System.currentTimeMillis();
            for (Map.Entry entry : this.f96748a.entrySet()) {
                if (!"Total".equals(entry.getKey())) {
                    m83549a(ssb, currentTimeMillis, (String) entry.getKey(), (aydw) entry.getValue());
                }
            }
            aydw aydw = (aydw) this.f96748a.get("Total");
            if (aydw != null) {
                m83549a(ssb, currentTimeMillis, "Total", aydw);
            }
        }
        ssb.mo26035b();
    }
}
