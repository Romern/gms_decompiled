package p000;

import android.content.Context;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: abvc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abvc {

    /* renamed from: a */
    public final File f58511a;

    /* renamed from: b */
    public final long f58512b;

    /* renamed from: c */
    private final Context f58513c;

    /* renamed from: d */
    private long f58514d = 0;

    /* renamed from: e */
    private long f58515e = 0;

    /* renamed from: f */
    private long f58516f = 0;

    /* renamed from: g */
    private boolean f58517g = false;

    public abvc(Context context, File file, String str) {
        if (file != null) {
            File a = m48306a(file);
            if (!a.exists()) {
                if (!a.mkdirs()) {
                    throw new IOException("The index path could not be created");
                }
            } else if (!a.isDirectory()) {
                throw new IOException("The index path is not a directory");
            }
            this.f58513c = context;
            File file2 = new File(a, str);
            this.f58511a = file2;
            if (file2.exists() || this.f58511a.mkdirs()) {
                long totalSpace = this.f58511a.getTotalSpace();
                this.f58512b = totalSpace;
                if (totalSpace == 0) {
                    absg.m48191b("There is no storage capacity, icing will not index");
                    return;
                }
                return;
            }
            String valueOf = String.valueOf(this.f58511a);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Cannot create directory ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        throw new NullPointerException("Index file directory must be set");
    }

    /* renamed from: a */
    public static File m48306a(File file) {
        return new File(file, "AppDataSearch");
    }

    /* renamed from: b */
    private static long m48309b(File file) {
        long j = 0;
        if (file == null) {
            return 0;
        }
        if (!file.isDirectory()) {
            return file.length();
        }
        Iterator it = new absf(file.list(), file).iterator();
        while (it.hasNext()) {
            j += m48309b(((abse) it).next());
        }
        return j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [long, int]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: g */
    private final void m48310g() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.f58514d >= 10000) {
            this.f58514d = elapsedRealtime;
            this.f58515e = mo32356f();
            boolean a = mo32351a();
            this.f58517g = a;
            if (!a) {
                long longValue = ((Long) abzt.f58988h.mo58455c()).longValue();
                long longValue2 = ((Long) abzt.f58989i.mo58455c()).longValue();
                long e = mo32355e() + this.f58515e;
                this.f58516f = Math.min(Long.MAX_VALUE, Math.max((Math.max(e - longValue, e - ((this.f58512b * longValue2) / 100)) - 20971520) / 2, 0L));
                return;
            }
            this.f58516f = 0;
        }
    }

    /* renamed from: c */
    public final long mo32353c() {
        m48310g();
        return this.f58515e;
    }

    /* renamed from: d */
    public final long mo32354d() {
        m48310g();
        return this.f58516f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final long mo32355e() {
        return this.f58511a.getUsableSpace();
    }

    /* renamed from: f */
    public final long mo32356f() {
        return m48309b(this.f58511a);
    }

    /* renamed from: a */
    public static String m48307a(int i) {
        try {
            return abvb.f58510a[bpzk.m112432a(i)];
        } catch (IndexOutOfBoundsException e) {
            return "unknown";
        }
    }

    /* renamed from: a */
    public static final boolean m48308a(abuw abuw) {
        long j = 0;
        long j2 = 0;
        for (int i = 0; i < abuw.f58493a.size(); i++) {
            abuv abuv = (abuv) abuw.f58493a.get(i);
            j += abuv.f58488d;
            j2 += abuv.f58489e;
        }
        long j3 = j + j2;
        if (j3 != 0) {
            double d = (double) j2;
            double d2 = (double) j3;
            Double.isNaN(d);
            Double.isNaN(d2);
            double longValue = (double) ((Long) abzt.f58990j.mo58455c()).longValue();
            Double.isNaN(longValue);
            if (d / d2 >= Math.min(1.0d, longValue / 100.0d)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final double mo32352b() {
        m48310g();
        long j = this.f58515e;
        long j2 = this.f58516f;
        if (j >= j2) {
            return 0.0d;
        }
        double d = (double) (j2 - j);
        double d2 = (double) j2;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* renamed from: a */
    public final int mo32350a(double d) {
        if (d > 0.05d) {
            m48310g();
            if (this.f58515e < this.f58516f) {
                return 2;
            }
            m48310g();
            if (!this.f58517g) {
                absg.m48196c("Not enough disk space for indexing trimmable");
                return 3;
            }
            absg.m48191b("Not enough disk space for indexing");
            return 4;
        }
        absg.m48196c("Design limits for indexing reached");
        return 5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo32351a() {
        return abyk.m48545a(this.f58513c);
    }
}
