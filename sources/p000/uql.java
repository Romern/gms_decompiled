package p000;

import android.database.SQLException;

/* renamed from: uql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class uql {

    /* renamed from: a */
    private static final sbw f48544a = new sbw("PersistedEventStore", "");

    /* renamed from: a */
    public static void m39246a(uhj uhj, long j, String str) {
        if (str != null) {
            new ume(uhj, j, str).mo27725t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo27876b(long j) {
        umd a = mo27875a(j);
        if (a == null) {
            f48544a.mo25372b("PersistedEventStore", "Trying to delete an already deleted PersistedEvent");
            return false;
        }
        try {
            a.mo27726u();
            return true;
        } catch (SQLException e) {
            f48544a.mo25378c("PersistedEventStore", "Error deleting PersistedEvent", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final umd mo27875a(long j) {
        return vpu.m41034a().f49757d.mo27448h(j);
    }
}
