package p000;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

/* renamed from: apkk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apkk {

    /* renamed from: a */
    static final int f84603a = ((int) TimeUnit.SECONDS.toMillis(10));

    /* renamed from: b */
    static final int f84604b = ((int) TimeUnit.HOURS.toSeconds(1));

    /* renamed from: c */
    public final Uri f84605c;

    /* renamed from: d */
    public final apkd f84606d;

    /* renamed from: e */
    private final bqgj f84607e;

    /* renamed from: f */
    private final TreeSet f84608f = new TreeSet();

    /* renamed from: g */
    private Long f84609g;

    /* renamed from: h */
    private int f84610h;

    /* renamed from: i */
    private bngx f84611i;

    /* renamed from: j */
    private final apke f84612j;

    public apkk(Uri uri, apkd apkd, apke apke, bqgj bqgj) {
        this.f84605c = uri;
        this.f84606d = apkd;
        this.f84612j = apke;
        this.f84607e = bqgj;
        this.f84609g = Long.valueOf(SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private final synchronized long m70527a(long j) {
        int d = m70528d();
        if (d == 0) {
            return j + TimeUnit.SECONDS.toMillis((long) ((int) cedu.f182415a.mo6606a().mo78911g()));
        }
        bngx c = mo47367c();
        return j + TimeUnit.SECONDS.toMillis((long) ((Integer) c.get(Math.min(d - 1, c.size() - 1))).intValue());
    }

    /* renamed from: d */
    private final synchronized int m70528d() {
        int i;
        Iterator it = this.f84608f.iterator();
        i = 0;
        while (it.hasNext() && !((apkb) it.next()).f84585b) {
            i++;
        }
        return i;
    }

    /* renamed from: b */
    public final synchronized void mo47366b() {
        Long valueOf = Long.valueOf(m70527a(SystemClock.elapsedRealtime()));
        this.f84609g = valueOf;
        this.f84612j.mo47355a(valueOf.longValue());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0016, code lost:
        if (r1 != r6.f84610h) goto L_0x0018;
     */
    /* renamed from: c */
    public final synchronized bngx mo47367c() {
        bngx bngx;
        String c = cedu.f182415a.mo6606a().mo78907c();
        int hashCode = c.hashCode();
        if (this.f84611i == null) {
        }
        bngs j = bngx.m109377j();
        for (String str : bmyx.m108640a(',').mo66920b().mo66918a((CharSequence) c)) {
            try {
                j.mo67668c(Integer.valueOf(str));
            } catch (NumberFormatException e) {
                String valueOf = String.valueOf(str);
                Log.e("UriObserver", valueOf.length() == 0 ? new String("Invalid integer value in flag reachabilityFailedRetryIntervalsSeconds: ") : "Invalid integer value in flag reachabilityFailedRetryIntervalsSeconds: ".concat(valueOf));
            }
        }
        if (j.mo67664a().isEmpty()) {
            Log.e("UriObserver", "Invalid flag reachabilityFailedRetryIntervalsSeconds");
            j.mo67668c(Integer.valueOf(f84604b));
        }
        this.f84611i = j.mo67664a();
        this.f84610h = hashCode;
        bngx = this.f84611i;
        sdo.m34959a(bngx);
        return bngx;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        return;
     */
    /* renamed from: a */
    public final synchronized void mo47363a() {
        Long l;
        if (cedu.m136333b() && (l = this.f84609g) != null) {
            if (SystemClock.elapsedRealtime() >= l.longValue()) {
                this.f84609g = null;
                bqga.m112781a(this.f84607e.mo25819b(new apki(this)), new apkj(this), this.f84607e);
                return;
            }
            Long l2 = this.f84609g;
            if (l2 != null) {
                this.f84612j.mo47355a(l2.longValue());
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47364a(apkb apkb) {
        boolean z;
        this.f84608f.add(apkb);
        while (this.f84608f.size() > 128) {
            this.f84608f.pollLast();
        }
        apke apke = this.f84612j;
        if (m70528d() >= ((int) cedu.f182415a.mo6606a().mo78908d())) {
            z = true;
        } else {
            z = false;
        }
        apke.f84588b.mo47359a(apke.f84587a, !z);
    }

    /* renamed from: a */
    public final synchronized void mo47365a(PrintWriter printWriter) {
        String str;
        if (cedu.m136333b()) {
            String valueOf = String.valueOf(this.f84605c);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18);
            sb.append("Check history for ");
            sb.append(valueOf);
            printWriter.println(sb.toString());
            synchronized (this) {
                Iterator it = this.f84608f.iterator();
                while (it.hasNext()) {
                    apkb apkb = (apkb) it.next();
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[4];
                    objArr[0] = apkg.m70516b(apkb.f84584a);
                    objArr[1] = Long.valueOf(apkb.f84584a);
                    if (!apkb.f84585b) {
                        str = "un";
                    } else {
                        str = "";
                    }
                    objArr[2] = str;
                    objArr[3] = Long.valueOf(apkb.f84586c);
                    printWriter.println(String.format(locale, "%s (%d): %sreachable (took %d ms)", objArr));
                }
            }
        }
    }
}
