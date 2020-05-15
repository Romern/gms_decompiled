package p000;

import android.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: rel */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rel {

    /* renamed from: c */
    private static rel f42807c;

    /* renamed from: e */
    private static long f42808e;

    /* renamed from: f */
    private static long f42809f;

    /* renamed from: a */
    public boolean f42810a;

    /* renamed from: b */
    public final Object f42811b = new Object();

    /* renamed from: d */
    private final aeat f42812d;

    public rel(aeat aeat) {
        this.f42812d = aeat;
    }

    /* renamed from: a */
    public static synchronized rel m33456a() {
        rel rel;
        synchronized (rel.class) {
            if (f42807c == null) {
                m33459d();
                rel rel2 = new rel(aeat.m51532a(rpr.m34216b()));
                f42807c = rel2;
                rel2.mo24557a(0);
                cdeh.m132793c();
                rel2.mo24559c();
                rel2.m33460e();
            }
            if (m33459d()) {
                Log.i("QosScheduler", "intervals changed, updating periodic schedulers");
                rel rel3 = f42807c;
                cdeh.m132793c();
                rel3.mo24559c();
                rel3.m33460e();
            }
            rel = f42807c;
        }
        return rel;
    }

    /* renamed from: b */
    private static long m33457b(long j) {
        return TimeUnit.SECONDS.convert(j, TimeUnit.MILLISECONDS);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    private static final long m33458c(long j) {
        return Math.min(j, Math.max(60L, -60 + j));
    }

    /* renamed from: d */
    private static synchronized boolean m33459d() {
        boolean z;
        synchronized (rel.class) {
            long h = cdej.m132802h();
            long i = cdej.m132803i();
            cdeh.m132793c();
            if (f42808e == h && f42809f == i) {
                z = false;
            } else {
                f42808e = h;
                f42809f = i;
                z = true;
            }
        }
        return z;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: e */
    private final void m33460e() {
        long max = Math.max(30L, m33457b(cdej.m132803i()));
        long c = m33458c(max);
        StringBuilder sb = new StringBuilder(87);
        sb.append("schedule unmetered periodic Task: period=");
        sb.append(max);
        sb.append(" flex=");
        sb.append(c);
        sb.toString();
        aebl aebl = new aebl();
        aebl.f63099k = "qos_unmetered_periodic";
        aebl.f63097i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        aebl.f63070a = max;
        aebl.f63071b = c;
        aebl.mo34027b(1);
        aebl.mo34024a(0, 0);
        aebl.mo34028b(1, 1);
        aebl.mo34026a(false);
        this.f42812d.mo33984a(aebl.mo33974b());
    }

    /* renamed from: b */
    public final void mo24558b() {
        long b = m33457b(cdee.f180578a.mo6606a().mo77330b());
        StringBuilder sb = new StringBuilder(72);
        sb.append("schedule oneoff collect-for-debug Task: windowStart=");
        sb.append(b);
        sb.toString();
        aebi aebi = new aebi();
        aebi.f63097i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        aebi.mo34004a(b, TimeUnit.HOURS.toSeconds(2));
        aebi.f63099k = "qos_collect_for_debug_upload";
        aebi.mo34024a(0, 0);
        aebi.mo34028b(0, 0);
        aebi.mo34026a(false);
        aebi.mo34027b(1);
        this.f42812d.mo33984a(aebi.mo33974b());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final void mo24559c() {
        long max = Math.max(30L, m33457b(cdej.m132802h()));
        long c = m33458c(max);
        StringBuilder sb = new StringBuilder(85);
        sb.append("schedule default periodic Task: period=");
        sb.append(max);
        sb.append(" flex=");
        sb.append(c);
        sb.toString();
        aebl aebl = new aebl();
        aebl.f63099k = "qos_default_periodic";
        aebl.f63097i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
        aebl.f63070a = max;
        aebl.f63071b = c;
        aebl.mo34024a(0, 0);
        aebl.mo34028b(0, 0);
        aebl.mo34026a(false);
        aebl.mo34027b(1);
        this.f42812d.mo33984a(aebl.mo33974b());
    }

    /* renamed from: a */
    public final void mo24557a(long j) {
        synchronized (this.f42811b) {
            long q = cdej.f180585a.mo6606a().mo77350q();
            if (j < q) {
                j = q;
            }
            long b = m33457b(j);
            StringBuilder sb = new StringBuilder(54);
            sb.append("schedule oneoff Task: windowStart=");
            sb.append(b);
            sb.toString();
            aebi aebi = new aebi();
            aebi.f63097i = "com.google.android.gms.clearcut.uploader.QosUploaderService";
            aebi.mo34004a(b, TimeUnit.DAYS.toSeconds(100));
            aebi.f63099k = "qos_oneoff";
            aebi.mo34024a(0, 0);
            aebi.mo34028b(0, 0);
            aebi.mo34026a(false);
            aebi.mo34027b(0);
            this.f42812d.mo33984a(aebi.mo33974b());
            this.f42810a = true;
        }
    }
}
