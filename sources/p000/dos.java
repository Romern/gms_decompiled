package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dos */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dos extends dov {
    protected dos() {
    }

    /* renamed from: a */
    public final int mo9356a(ContextManagerClientInfo contextManagerClientInfo) {
        return m8965g(contextManagerClientInfo);
    }

    /* renamed from: b */
    public final int mo9357b(ContextManagerClientInfo contextManagerClientInfo) {
        return m8965g(contextManagerClientInfo);
    }

    /* renamed from: c */
    public final int mo9358c(ContextManagerClientInfo contextManagerClientInfo) {
        return m8965g(contextManagerClientInfo);
    }

    /* renamed from: d */
    public final int mo9359d(ContextManagerClientInfo contextManagerClientInfo) {
        return m8965g(contextManagerClientInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004e, code lost:
        if (((p000.dpd) r0.f13734c.get(r4)).f13731c == 1) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0036, code lost:
        if (((p000.dpd) r0.f13734c.get(r4)).f13731c != 1) goto L_0x0051;
     */
    /* renamed from: g */
    private static final int m8965g(ContextManagerClientInfo contextManagerClientInfo) {
        if (doy.m8996a("android.permission.PACKAGE_USAGE_STATS", contextManagerClientInfo, false) != 1) {
            return 2;
        }
        doh a = contextManagerClientInfo.mo18066a();
        if (!a.mo9338b()) {
            dpe B = dwq.m9645B();
            if (B.f13734c.get(a) == null || ((dpd) B.f13734c.get(a)).f13731c == 0) {
                B.mo9371d(a);
                if (B.f13734c.get(a) != null) {
                }
            }
            new Object[1][0] = a;
            return 2;
        }
        return 1;
    }
}
