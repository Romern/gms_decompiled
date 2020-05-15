package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dou extends dov {
    protected dou() {
    }

    /* renamed from: b */
    public final int mo9357b(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8996a("android.permission.WRITE_CALENDAR", contextManagerClientInfo, false);
    }

    /* renamed from: c */
    public final int mo9358c(ContextManagerClientInfo contextManagerClientInfo) {
        return mo9356a(contextManagerClientInfo);
    }

    /* renamed from: d */
    public final int mo9359d(ContextManagerClientInfo contextManagerClientInfo) {
        return mo9357b(contextManagerClientInfo);
    }

    /* renamed from: a */
    public final int mo9356a(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8996a("android.permission.READ_CALENDAR", contextManagerClientInfo, false);
    }
}
