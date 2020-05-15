package p000;

import android.app.ActivityManager;
import android.content.Context;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: nit */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class nit implements nhf {

    /* renamed from: a */
    public static final bnsn f35760a = odk.m28481a("CAR.SERVICE");

    /* renamed from: b */
    public static final bnic f35761b = bnic.m109494a("com.google.android.projection.gearhead:projection", "com.google.android.projection.gearhead:car", "com.google.android.gms:car", "com.google.android.tts", "com.google.android.apps.maps", "com.google.android.projection.gearhead:shared", new String[0]);

    /* renamed from: c */
    public static final bnhe f35762c = bnhe.m109410a("com.google.android.projection.gearhead:projection", oey.GEARHEAD_PROJECTION, "com.google.android.projection.gearhead:car", oey.GEARHEAD_CAR, "com.google.android.gms:car", oey.GMSCORE_CAR);

    /* renamed from: d */
    public final Context f35763d;

    /* renamed from: e */
    public final boolean f35764e;

    /* renamed from: f */
    public final Set f35765f;

    /* renamed from: g */
    public final bmzi f35766g;

    /* renamed from: h */
    public final Runnable f35767h = new nir(this);

    /* renamed from: i */
    public final Object f35768i = new Object();

    /* renamed from: j */
    public final Map f35769j;

    /* renamed from: k */
    public final SimpleDateFormat f35770k;

    /* renamed from: l */
    final Map f35771l = new HashMap();

    /* renamed from: m */
    public final Map f35772m = new HashMap();

    /* renamed from: n */
    public final Set f35773n = new HashSet();

    /* renamed from: o */
    public boolean f35774o;

    public nit(Context context, boolean z, bmzi bmzi) {
        bnic bnic = f35761b;
        bnhe bnhe = f35762c;
        this.f35763d = context;
        this.f35764e = z;
        this.f35765f = bnic;
        this.f35769j = bnhe;
        this.f35766g = bmzi;
        this.f35770k = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS", Locale.US);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0081, code lost:
        if (r11.importance < 400) goto L_0x00c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0083, code lost:
        r11 = r11.processName;
        r0 = r10.f35768i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0094, code lost:
        if (r10.f35773n.contains(r11) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0096, code lost:
        r4 = (p000.oey) r10.f35769j.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009e, code lost:
        if (r4 == null) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a0, code lost:
        p000.ofd.m28611a(r10.f35763d, "com.google.android.gms.car.PROCESS_STATE_CACHED", r4);
        r4 = p000.nit.f35760a.mo68388c();
        r4.mo68432a("nit", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        r4.mo68420a("Process in cached state - not expected %s", p000.bryx.m114908a(r11));
        r10.f35773n.add(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c0, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        return;
     */
    /* renamed from: a */
    private final void m26483a(ActivityManager.RunningAppProcessInfo runningAppProcessInfo) {
        synchronized (this.f35768i) {
            nis nis = (nis) this.f35772m.get(runningAppProcessInfo.processName);
            if (nis == null) {
                return;
            }
            if (!(runningAppProcessInfo == null || (runningAppProcessInfo.importance == nis.f35755a && runningAppProcessInfo.lru == nis.f35758d && runningAppProcessInfo.uid == nis.f35759e))) {
                String nis2 = nis.toString();
                nis.f35755a = runningAppProcessInfo.importance;
                nis.f35756b = runningAppProcessInfo.importanceReasonCode;
                nis.f35757c = runningAppProcessInfo.importanceReasonPid;
                nis.f35758d = runningAppProcessInfo.lru;
                nis.f35759e = runningAppProcessInfo.uid;
                String format = this.f35770k.format(new Date());
                ((bnfd) this.f35771l.get(runningAppProcessInfo.processName)).offer(String.format(Locale.US, "%s:%s", format, nis));
                bnsi d = f35760a.mo68390d();
                d.mo68432a("nit", "a", (int) BaseMfiEventCallback.TYPE_OPSRV_REQUIRED_LIB_UNAVAILABLE, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                d.mo68425a("Process info changed %s:%s->%s", runningAppProcessInfo.processName, nis2, nis);
            }
        }
    }

    /* renamed from: a */
    private final void m26484a(String str) {
        oey oey;
        synchronized (this.f35768i) {
            if (!this.f35773n.contains(str) && (oey = (oey) this.f35769j.get(str)) != null) {
                ofd.m28611a(this.f35763d, "com.google.android.gms.car.PROCESS_STATE_CACHED", oey);
                bnsi c = f35760a.mo68388c();
                c.mo68432a("nit", "a", 187, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68420a("Process in cached state - not expected %s", bryx.m114908a(str));
                this.f35773n.add(str);
            }
        }
    }
}
