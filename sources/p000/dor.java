package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dor */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dor extends dov {
    protected dor() {
    }

    /* renamed from: a */
    public final int mo9356a(ContextManagerClientInfo contextManagerClientInfo) {
        int c = mo9358c(contextManagerClientInfo);
        return c == 1 ? doy.m8997b(contextManagerClientInfo.mo18066a()) : c;
    }

    /* renamed from: b */
    public final int mo9357b(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8997b(contextManagerClientInfo.mo18066a());
    }

    /* renamed from: d */
    public final int mo9359d(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }

    /* renamed from: c */
    public final int mo9358c(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8996a("com.google.android.gms.permission.ACTIVITY_RECOGNITION", contextManagerClientInfo, false);
    }
}
