package p000;

import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dox extends dov {
    protected dox() {
    }

    /* renamed from: a */
    public final int mo9356a(ContextManagerClientInfo contextManagerClientInfo) {
        int c = mo9358c(contextManagerClientInfo);
        return c == 1 ? doy.m8995a(contextManagerClientInfo.mo18066a()) : c;
    }

    /* renamed from: b */
    public final int mo9357b(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8995a(contextManagerClientInfo.mo18066a());
    }

    /* renamed from: d */
    public final int mo9359d(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo9360e(ContextManagerClientInfo contextManagerClientInfo) {
        return dov.m8979f(contextManagerClientInfo);
    }

    /* renamed from: c */
    public final int mo9358c(ContextManagerClientInfo contextManagerClientInfo) {
        return doy.m8996a("android.permission.ACCESS_FINE_LOCATION", contextManagerClientInfo, false);
    }
}
