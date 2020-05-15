package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;

/* renamed from: dov */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class dov {
    /* renamed from: f */
    protected static final int m8979f(ContextManagerClientInfo contextManagerClientInfo) {
        if (cdij.m133502b()) {
            return doy.m8996a("android.permission.ACCESS_FINE_LOCATION", contextManagerClientInfo, true);
        }
        return 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    public final int mo9361a(int i, ContextManagerClientInfo contextManagerClientInfo) {
        if (i == 0) {
            return mo9358c(contextManagerClientInfo);
        }
        if (i == 1) {
            return mo9359d(contextManagerClientInfo);
        }
        if (i == 2) {
            return mo9357b(contextManagerClientInfo);
        }
        if (i == 3) {
            return mo9356a(contextManagerClientInfo);
        }
        if (i == 4) {
            return mo9360e(contextManagerClientInfo);
        }
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("dov", "a", (int) MfiClientException.TYPE_MFICLIENT_NOT_STARTED, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68413a("[ContextSpecificAclFactory] Unknown permission: %s, clientInfo=%s", i, (Object) contextManagerClientInfo);
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo9356a(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo9357b(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract int mo9358c(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract int mo9359d(ContextManagerClientInfo contextManagerClientInfo);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo9360e(ContextManagerClientInfo contextManagerClientInfo) {
        return 1;
    }
}
