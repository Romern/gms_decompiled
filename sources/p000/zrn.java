package p000;

import android.os.Handler;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: zrn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zrn {

    /* renamed from: h */
    private static final srn f55746h = zvt.m46581a();

    /* renamed from: a */
    public final Set f55747a;

    /* renamed from: b */
    public cadn f55748b;

    /* renamed from: c */
    public cadn f55749c;

    /* renamed from: d */
    public final zrm f55750d = new zrm(this);

    /* renamed from: e */
    public final AtomicLong f55751e = new AtomicLong(-1);

    /* renamed from: f */
    public final Handler f55752f;

    /* renamed from: g */
    public final Object f55753g = new Object();

    /* renamed from: i */
    private final bmzi f55754i;

    /* renamed from: j */
    private final Set f55755j;

    /* renamed from: k */
    private final Object f55756k;

    public zrn(bmzi bmzi, Handler handler, Object obj) {
        this.f55754i = bmzi;
        this.f55752f = handler;
        this.f55756k = obj;
        this.f55755j = new HashSet();
        this.f55747a = new HashSet();
    }

    /* renamed from: a */
    private static void m46060a(zrc zrc, Collection collection, boolean z) {
        bnrd a = ((bnht) bnnm.m109864a(collection, zrl.f55744a)).f131642b.entrySet().iterator();
        while (a.hasNext()) {
            Map.Entry entry = (Map.Entry) a.next();
            cado b = yyl.m45033b((caae) entry.getKey());
            b.mo74617a((Collection) entry.getValue());
            zrc.mo31366a((cadp) b.mo74062i(), z);
        }
    }

    /* renamed from: c */
    public static int m46061c(cadn cadn) {
        return yyk.m45007a(cadn, bzzj.f172029au);
    }

    /* renamed from: d */
    private static String m46063d(cadn cadn) {
        if (cadn == null) {
            return "none";
        }
        return String.format(Locale.US, "%1$tF %1$tT %2$s", Long.valueOf(TimeUnit.NANOSECONDS.toMillis(cadn.f172702b)), yyp.m45050a(cadn.f172704d));
    }

    /* renamed from: a */
    public final boolean mo31405a() {
        cadn cadn = this.f55749c;
        return (cadn == null || cadn == this.f55748b) ? false : true;
    }

    /* renamed from: b */
    public final void mo31406b() {
        synchronized (this.f55753g) {
            try {
                if (this.f55749c != null) {
                    if (mo31405a()) {
                        mo31403a(this.f55749c);
                        this.f55749c = null;
                    }
                }
                zrc zrc = (zrc) this.f55754i.mo6606a();
                if (!this.f55755j.isEmpty()) {
                    m46060a(zrc, this.f55755j, true);
                    this.f55755j.size();
                    this.f55755j.clear();
                }
                if (!this.f55747a.isEmpty()) {
                    m46060a(zrc, this.f55747a, false);
                    this.f55747a.size();
                    this.f55747a.clear();
                }
            } catch (IOException e) {
                try {
                    bnsl bnsl = (bnsl) f55746h.mo68387b();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("zrn", "b", 237, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Cannot flush data points buffer");
                } catch (Throwable th) {
                    m46062c();
                    throw th;
                }
            }
            m46062c();
        }
    }

    public final int hashCode() {
        Object obj = this.f55756k;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        String format;
        synchronized (this.f55753g) {
            format = String.format("DataPointsBuffer{buffer=%s, lastStepCountCumulative=%s}", this.f55755j, yyk.m45023b(this.f55749c));
        }
        return format;
    }

    /* renamed from: c */
    private final void m46062c() {
        this.f55751e.set(-1);
        this.f55752f.removeCallbacks(this.f55750d);
    }

    /* renamed from: a */
    public final void mo31403a(cadn cadn) {
        this.f55755j.add(cadn);
    }

    /* renamed from: a */
    public final void mo31404a(PrintWriter printWriter) {
        synchronized (this.f55753g) {
            printWriter.append((CharSequence) "DataPointBuffer:\n").append((CharSequence) "  size: ").append((CharSequence) String.valueOf(this.f55755j.size())).append((CharSequence) "\n");
            if (!this.f55755j.isEmpty()) {
                printWriter.append((CharSequence) "  oldest: ").append((CharSequence) m46063d((cadn) this.f55755j.iterator().next())).append((CharSequence) "\n");
            }
            printWriter.append((CharSequence) "  last step count: ").append((CharSequence) m46063d(this.f55749c)).append((CharSequence) "\n");
        }
    }

    /* renamed from: b */
    public final void mo31407b(cadn cadn) {
        mo31403a(cadn);
        this.f55748b = cadn;
    }
}
