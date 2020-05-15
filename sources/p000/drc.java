package p000;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.contextmanager.ContextData;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.Arrays;
import java.util.Collection;

/* renamed from: drc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class drc extends dra implements drb {

    /* renamed from: a */
    public final PendingIntent f13852a;

    /* renamed from: b */
    public final ContextDataFilterImpl f13853b;

    /* renamed from: c */
    private final tml f13854c;

    /* renamed from: d */
    private final ContextManagerClientInfo f13855d;

    /* renamed from: e */
    private final Object f13856e;

    /* renamed from: f */
    private boolean f13857f;

    public drc(ContextManagerClientInfo contextManagerClientInfo, tml tml, PendingIntent pendingIntent, ContextDataFilterImpl contextDataFilterImpl) {
        super(contextManagerClientInfo.f30677a);
        boolean z;
        this.f13855d = contextManagerClientInfo;
        boolean z2 = false;
        if (tml != null) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a((pendingIntent != null ? true : z2) ^ z);
        this.f13854c = tml;
        this.f13852a = pendingIntent;
        this.f13853b = contextDataFilterImpl;
        this.f13856e = new Object();
        this.f13857f = true;
    }

    /* renamed from: b */
    public final boolean mo9474b() {
        boolean z;
        synchronized (this.f13856e) {
            z = this.f13857f;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        PendingIntent pendingIntent;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof drc)) {
            return false;
        }
        drc drc = (drc) obj;
        tml tml = this.f13854c;
        if (tml != null && drc.f13854c != null) {
            return tml.asBinder().equals(drc.f13854c.asBinder());
        }
        PendingIntent pendingIntent2 = this.f13852a;
        if (pendingIntent2 == null || (pendingIntent = drc.f13852a) == null) {
            return false;
        }
        return pendingIntent2.equals(pendingIntent);
    }

    public final int hashCode() {
        IBinder iBinder;
        Object[] objArr = new Object[2];
        tml tml = this.f13854c;
        if (tml != null) {
            iBinder = tml.asBinder();
        } else {
            iBinder = null;
        }
        objArr[0] = iBinder;
        objArr[1] = this.f13852a;
        return Arrays.hashCode(objArr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dpk.a(int, boolean, int):void
     arg types: [int, int, int]
     candidates:
      dpk.a(bxco, int, int):void
      dpk.a(doh, dwa, dwa):void
      dvw.a(doh, dwa, dwa):void
      dpk.a(int, boolean, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, com.google.android.gms.contextmanager.internal.ContextManagerClientInfo, int]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, java.lang.Object):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, int):void */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (p000.dwq.m9668l().mo9355a(r8, r7.f13855d) != 0) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
        if (r0.mo9349a(r5.mo18066a()).mo9346a(4, r8, r5) == 1) goto L_0x004d;
     */
    /* renamed from: a */
    public final void mo9472a(doh doh, ContextData contextData) {
        int i;
        String str;
        doh g = super.mo9470g();
        if (g == null || !g.equals(doh)) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("drc", "a", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68424a("[ContextListenerConsumer] Mismatched account name on deliver.  Expected %s, got %s", g, doh);
            return;
        }
        if (contextData != null) {
            i = contextData.mo18018g();
        } else {
            i = -1;
        }
        if (cdij.m133502b()) {
            if (!cdgp.m133203l()) {
                dom x = dwq.m9680x();
                ContextManagerClientInfo contextManagerClientInfo = this.f13855d;
            }
            bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
            bnsl2.mo68432a("drc", "a", 118, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68422a("[ContextListenerConsumer] Permission denied to notify %s of %s", (Object) this.f13855d, i);
            return;
        }
        tml tml = this.f13854c;
        if (tml != null) {
            try {
                tml.mo26651a(contextData);
                dwq.m9649F().mo9385a(i, true, 0);
            } catch (RemoteException e) {
                synchronized (this.f13856e) {
                    this.f13857f = false;
                    bnsl bnsl3 = (bnsl) dss.f13961a.mo68388c();
                    bnsl3.mo68437a(e);
                    bnsl3.mo68432a("drc", "a", 137, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("[ContextListenerConsumer] Could not deliver context data because app is not reachable.");
                    dwq.m9649F().mo9385a(i, false, 0);
                }
            }
        } else if (this.f13852a != null) {
            Intent intent = new Intent();
            intent.putExtra("context_data_byte_array", contextData.mo18012b());
            try {
                PendingIntent pendingIntent = this.f13852a;
                if (!doi.m8936a(i)) {
                    str = !doi.m8938b(i) ? doi.m8941e(i) ? "android.permission.BLUETOOTH" : null : "com.google.android.gms.permission.ACTIVITY_RECOGNITION";
                } else {
                    str = "android.permission.ACCESS_FINE_LOCATION";
                }
                dqk.m9089a(pendingIntent, intent, str);
                dwq.m9649F().mo9385a(i, true, 1);
            } catch (PendingIntent.CanceledException e2) {
                synchronized (this.f13856e) {
                    this.f13857f = false;
                    bnsl bnsl4 = (bnsl) dss.f13961a.mo68388c();
                    bnsl4.mo68437a(e2);
                    bnsl4.mo68432a("drc", "a", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("[ContextListenerConsumer] Could not deliver context data; PendingIntent is cancelled.");
                    dwq.m9649F().mo9385a(i, false, 1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo9473a(doh doh, Collection collection, dpv dpv, dqb dqb) {
        bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
        bnsl.mo68432a("drc", "a", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("[ContextListenerConsumer] Sync is currently unsupported.");
        dpy.m9066b(dpv, dqb, dqy.m9123a("ContextListenerConsumer+failureCallback"));
    }
}
