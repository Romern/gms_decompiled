package p000;

import android.os.Build;
import android.os.Trace;

/* renamed from: ned */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ned {
    /* renamed from: a */
    public static final void m26010a() {
        if (m26012c()) {
            Trace.beginSection("backup_gmscore");
        }
    }

    /* renamed from: b */
    public static final void m26011b() {
        if (m26012c()) {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    private static final boolean m26012c() {
        return "userdebug".equals(Build.TYPE) && ccnf.f179489a.mo6606a().mo76427U();
    }
}
