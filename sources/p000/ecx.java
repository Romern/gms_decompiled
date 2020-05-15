package p000;

import com.google.android.contextmanager.controller.EventHandler$AlarmSetter;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: ecx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ecx extends drx {

    /* renamed from: c */
    private static boolean f14708c;

    public ecx() {
        super("PruneStores");
        f14708c = true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, java.lang.Object, int):void
     arg types: [java.lang.String, doh, int]
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
    /* renamed from: a */
    public final void mo9410a() {
        dof y = dwq.m9681y();
        eel p = dwq.m9672p();
        for (doh doh : y.mo9331a()) {
            long ar = cdgp.f180782a.mo6606a().mo77573ar() - cdgp.m133194c();
            long a = dwq.m9665i().mo20505a();
            long j = a - ar;
            StringBuilder sb = new StringBuilder(38);
            sb.append("maxKeepTimeMillis=");
            sb.append(ar);
            sb.toString();
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("nowMillis=");
            sb2.append(a);
            sb2.toString();
            StringBuilder sb3 = new StringBuilder(37);
            sb3.append("cutoffTimeMillis=");
            sb3.append(j);
            sb3.toString();
            ContextManagerClientInfo a2 = dwq.m9652a(doh, "PruneStores");
            tit tit = new tit();
            tkb tkb = new tkb();
            tkb.mo26621a(j);
            tit.mo26580a(-1, tkb.mo26620a());
            ContextDataFilterImpl contextDataFilterImpl = (ContextDataFilterImpl) tit.mo26578a();
            p.f14779b.mo10017a(a2.mo18066a(), contextDataFilterImpl, true);
            p.f14778a.mo10057a(contextDataFilterImpl, a2.mo18066a());
        }
        dwq.m9673q().mo10054a();
        dwq.m9671o().f14768a.mo10025a();
        if (!f14708c && cdgp.f180782a.mo6606a().mo77521M()) {
            Set a3 = dwq.m9681y().mo9331a();
            if (!a3.isEmpty()) {
                tit tit2 = new tit();
                tit2.mo26579a(-1);
                tit2.mo26582b(1);
                tiu a4 = tit2.mo26578a();
                eel p2 = dwq.m9672p();
                Iterator it = a3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    doh doh2 = (doh) it.next();
                    eej a5 = p2.mo10037a((ContextDataFilterImpl) a4, dwq.m9652a(doh2, "AccountManager"));
                    if (a5.f14775a == 0) {
                        ArrayList arrayList = a5.f14776b;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                        bnsl.mo68432a("dof", "b", 90, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl.mo68422a("[AccountManager] Can't read store: %s, %s", (Object) doh2, a5.f14775a);
                    }
                }
            }
            dvx r = dwq.m9674r();
            if (r.f14223a.isEmpty() && r.f14224b.mo25994e().isEmpty()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("ecx", "a", 52, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("[PruneStores] Stopping service!");
                for (doh doh3 : dwq.m9681y().mo9331a()) {
                    dwq.m9671o().mo10034b(doh3);
                }
                drv k = dwq.m9667k();
                EventHandler$AlarmSetter eventHandler$AlarmSetter = k.f13907d;
                eventHandler$AlarmSetter.f7699e = false;
                eventHandler$AlarmSetter.f7700f.f13904a.unregisterReceiver(eventHandler$AlarmSetter);
                if (!k.f13908e) {
                    k.f13905b.quit();
                } else {
                    k.f13910g.lock();
                    try {
                        k.f13909f = true;
                        k.f13905b.quit();
                    } finally {
                        k.f13910g.unlock();
                    }
                }
                dwq.m9661e();
                return;
            }
        }
        f14708c = false;
        mo9514a(cdgp.m133194c(), mo9513a((String) null));
    }
}
