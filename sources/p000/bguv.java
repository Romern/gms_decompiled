package p000;

import android.content.Context;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import com.google.android.location.reporting.state.utils.InactiveReason;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: bguv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguv {

    /* renamed from: a */
    public static bguu f117607a;

    /* renamed from: b */
    private static final InactiveReason f117608b = new InactiveReason(12, "LocationDisabled");

    /* renamed from: a */
    public static int m100037a(List list) {
        int[] iArr = InactiveReason.f150916a;
        for (int i : iArr) {
            if (InactiveReason.m117336a(list, i)) {
                return i;
            }
        }
        String valueOf = String.valueOf(list);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
        sb.append("Unknown inactive reason: ");
        sb.append(valueOf);
        bgur.m100024c("GCoreUlr", 36, sb.toString());
        return 0;
    }

    /* renamed from: b */
    public static qxp m100050b(String str) {
        if (!m100053c()) {
            return null;
        }
        try {
            return f117607a.f117598a.mo24389f(str);
        } catch (RuntimeException e) {
            bguz.m100120a(e);
            return null;
        }
    }

    /* renamed from: c */
    public static boolean m100053c() {
        return f117607a != null && chcs.f188354a.mo6606a().mo85120w();
    }

    /* renamed from: d */
    public static boolean m100054d() {
        return f117607a != null && chcs.f188354a.mo6606a().mo85122y();
    }

    /* renamed from: a */
    public static List m100038a(AccountConfig accountConfig) {
        List e = accountConfig.mo70909e();
        if (accountConfig.f150902m.f150913e) {
            return e;
        }
        ArrayList arrayList = new ArrayList(e);
        arrayList.add(f117608b);
        return arrayList;
    }

    /* renamed from: b */
    public static void m100051b() {
        if (m100053c()) {
            try {
                f117607a.mo63235c();
            } catch (RuntimeException e) {
                bguz.m100120a(e);
            }
        }
    }

    /* renamed from: a */
    public static qxn m100039a() {
        if (m100053c()) {
            return f117607a.f117598a.mo24386d();
        }
        return null;
    }

    /* renamed from: a */
    public static void m100040a(int i) {
        m100043a("UlrError", i);
    }

    /* renamed from: b */
    public static void m100052b(String str, long j) {
        if (m100053c()) {
            try {
                f117607a.f117598a.mo24387e(str).mo24368a(j);
            } catch (RuntimeException e) {
                bguz.m100120a(e);
            }
            f117607a.mo63231a();
        }
    }

    /* renamed from: a */
    public static synchronized void m100041a(Context context) {
        synchronized (bguv.class) {
            if (f117607a == null) {
                f117607a = new bguu(context);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bguv.a(java.lang.String, long):void
     arg types: [java.lang.String, int]
     candidates:
      bguv.a(java.lang.String, int):void
      bguv.a(java.lang.String, bgwb):void
      bguv.a(java.lang.String, com.google.android.location.reporting.state.update.ReportingConfig):void
      bguv.a(java.lang.String, boolean):void
      bguv.a(java.lang.String, long):void */
    /* renamed from: a */
    public static void m100042a(String str) {
        m100045a(str, 1L);
    }

    /* renamed from: a */
    public static void m100043a(String str, int i) {
        if (m100053c()) {
            try {
                f117607a.f117598a.mo24385d(str).mo24367a(i);
            } catch (RuntimeException e) {
                bguz.m100120a(e);
            }
            f117607a.mo63231a();
        }
    }

    /* renamed from: a */
    public static void m100044a(String str, int i, int i2) {
        if (m100053c()) {
            try {
                qxl d = f117607a.f117598a.mo24385d(str);
                for (int i3 = 0; i3 < i2; i3++) {
                    d.mo24367a(i);
                }
            } catch (RuntimeException e) {
                bguz.m100120a(e);
            }
            f117607a.mo63231a();
        }
    }

    /* renamed from: a */
    public static void m100045a(String str, long j) {
        if (m100053c() && j != 0) {
            try {
                f117607a.f117598a.mo24383c(str).mo24360a(j);
            } catch (RuntimeException e) {
                bguz.m100120a(e);
            }
            f117607a.mo63231a();
        }
    }

    /* renamed from: a */
    public static void m100046a(String str, bgwb bgwb) {
        if (bgwb != null && !str.isEmpty()) {
            m100043a(str, bgwb.f117799g);
        }
    }

    /* renamed from: a */
    public static void m100047a(String str, ReportingConfig reportingConfig) {
        try {
            m100045a(str, (long) reportingConfig.mo70928b().size());
        } catch (RuntimeException e) {
            bguz.m100120a(e);
        }
    }

    /* renamed from: a */
    public static void m100048a(String str, boolean z) {
        ReentrantReadWriteLock.WriteLock writeLock;
        qxe qxe;
        if (m100053c()) {
            try {
                qxq qxq = f117607a.f117598a;
                qxq.f42384e.writeLock().lock();
                try {
                    qxc qxc = (qxc) qxq.f42389j.get(str);
                    if (qxc == null) {
                        qxq.f42384e.writeLock().lock();
                        qxe = new qxe(qxq, str);
                        qxq.f42384e.writeLock().unlock();
                        writeLock = qxq.f42384e.writeLock();
                    } else {
                        qxe = (qxe) qxc;
                        writeLock = qxq.f42384e.writeLock();
                    }
                    writeLock.unlock();
                    qxe.mo24354a(!z ? 0 : 1, 1, qxq.f42377b);
                } catch (ClassCastException e) {
                    throw new IllegalArgumentException(str.length() == 0 ? new String("another type of counter exists with name: ") : "another type of counter exists with name: ".concat(str));
                } catch (Throwable th) {
                    qxq.f42384e.writeLock().unlock();
                    throw th;
                }
            } catch (RuntimeException e2) {
                bguz.m100120a(e2);
            }
            f117607a.mo63231a();
        }
    }

    /* renamed from: a */
    public static void m100049a(boolean z) {
        if (m100054d()) {
            f117607a.mo63234b(z);
        }
    }
}
