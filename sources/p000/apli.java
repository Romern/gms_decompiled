package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import java.io.PrintWriter;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: apli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apli {

    /* renamed from: c */
    public static final /* synthetic */ int f84690c = 0;

    /* renamed from: a */
    public final Map f84691a = new EnumMap(aapx.class);

    /* renamed from: b */
    public final EnumMap f84692b = new EnumMap(aapx.class);

    /* renamed from: d */
    private final skc f84693d;

    /* renamed from: e */
    private final PendingIntent f84694e;

    /* renamed from: f */
    private long f84695f = Long.MAX_VALUE;

    /* renamed from: g */
    private aapa f84696g = aapa.f28723i;

    /* renamed from: h */
    private final Map f84697h = new C1223np();

    /* renamed from: i */
    private Set f84698i = new HashSet();

    /* renamed from: j */
    private boolean f84699j = false;

    static {
        int i = aytg.f98445a;
    }

    public apli(Context context, skc skc) {
        this.f84693d = skc;
        Intent intent = new Intent("com.google.android.gms.gcm.ACTION_CHECK_QUEUE");
        intent.setClassName(context, "com.google.android.gms.gcm.nts.SchedulerInternalReceiver");
        this.f84694e = PendingIntent.getBroadcast(context, 0, intent, 0);
        this.f84699j = cdnj.m134209e();
    }

    /* renamed from: a */
    private static String m70604a(aapa aapa) {
        StringBuilder sb = new StringBuilder();
        aapx aapx = aapx.CAUSE_UNKNOWN;
        int a = aaoz.m21776a(aapa.f28727c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 2) {
            sb.append("/CONNECTED_NETWORK");
        } else if (i == 3) {
            sb.append("/UNMETERED_NETWORK");
        }
        int a2 = aaov.m21772a(aapa.f28728d);
        if (a2 != 0 && a2 == 3) {
            sb.append("/CHARGING");
        }
        int a3 = aaox.m21774a(aapa.f28731g);
        if (a3 != 0 && a3 == 2) {
            sb.append("/DEVICE_IDLE");
        }
        if (sb.length() == 0) {
            sb.append("/NO_CONSTRAINTS");
        }
        sb.append('/');
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized boolean mo47391b() {
        return !this.f84698i.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized boolean mo47392c() {
        return !this.f84699j || !mo47391b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo47393d() {
        long j = this.f84695f;
        if (j != Long.MAX_VALUE) {
            this.f84693d.mo25675a("NetworkScheduler.Wakeup", 2, j, this.f84694e, "com.google.android.gms");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final synchronized long mo47394e() {
        long j;
        j = Long.MAX_VALUE;
        for (Long l : this.f84697h.values()) {
            j = Math.min(l.longValue(), j);
        }
        return j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47387a() {
        this.f84695f = Long.MAX_VALUE;
        this.f84697h.clear();
        this.f84696g = aapa.f28723i;
        this.f84693d.mo25668a(this.f84694e);
        this.f84698i = new HashSet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47388a(apid apid) {
        if (this.f84699j) {
            this.f84698i.remove(apid);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47389a(PrintWriter printWriter) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.f84695f;
        String a = m70604a(this.f84696g);
        printWriter.println(String.format(Locale.US, "Next wakeup: %d s for %s", Long.valueOf((j - elapsedRealtime) / 1000), a));
        for (Map.Entry entry : this.f84697h.entrySet()) {
            long max = Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(((Long) entry.getValue()).longValue() - elapsedRealtime));
            printWriter.println(String.format(Locale.US, "Next %s eligible %d seconds.", m70604a((aapa) entry.getKey()), Long.valueOf(max)));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r9.mo47270h() < r0.longValue()) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        return false;
     */
    /* renamed from: a */
    public final synchronized boolean mo47390a(long j, apid apid) {
        if (apid.f84445o == 2) {
            if (apid.mo47263b().isEmpty()) {
                return false;
            }
        }
        Long l = (Long) this.f84697h.get(apid.f84443m);
        if (l == null) {
        }
        this.f84697h.put(apid.f84443m, Long.valueOf(Math.max(apid.mo47270h(), j)));
        if (apid.mo47272i() > j && apid.mo47272i() < this.f84695f) {
            this.f84695f = Math.max(apid.mo47272i(), 0L);
            this.f84696g = apid.f84443m;
            HashSet hashSet = new HashSet();
            this.f84698i = hashSet;
            if (this.f84699j) {
                hashSet.add(apid);
            }
            return true;
        } else if (this.f84699j && apid.mo47272i() > j && apid.mo47272i() == this.f84695f) {
            this.f84698i.add(apid);
        }
    }
}
