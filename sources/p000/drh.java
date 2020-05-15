package p000;

import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: drh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class drh implements rlf {

    /* renamed from: a */
    final /* synthetic */ ArrayList f13866a;

    /* renamed from: b */
    final /* synthetic */ int f13867b;

    /* renamed from: c */
    final /* synthetic */ CountDownLatch f13868c;

    /* renamed from: d */
    final /* synthetic */ duu f13869d;

    /* renamed from: e */
    final /* synthetic */ Set f13870e;

    /* renamed from: f */
    final /* synthetic */ drk f13871f;

    public drh(drk drk, ArrayList arrayList, int i, CountDownLatch countDownLatch, duu duu, Set set) {
        this.f13871f = drk;
        this.f13866a = arrayList;
        this.f13867b = i;
        this.f13868c = countDownLatch;
        this.f13869d = duu;
        this.f13870e = set;
    }

    /* renamed from: a */
    public final void mo9481a(Status status) {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, com.google.android.gms.common.api.Status]
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
    public final /* bridge */ /* synthetic */ void mo9482a(Object obj) {
        int i;
        lsb lsb = (lsb) obj;
        if (!lsb.mo7183bo().mo17710c() || lsb.mo15420b().f11729k == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("drh", "a", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("[FenceListenerConsumer] Failed Fence-to-Snapshot %s with %s", this.f13867b, (Object) lsb.mo7183bo());
        } else {
            new Object[1][0] = lsb.mo15420b().f11729k;
            this.f13866a.add(lsb.mo15420b().f11729k);
        }
        this.f13868c.countDown();
        if (this.f13868c.getCount() == 0) {
            if (!this.f13866a.isEmpty()) {
                this.f13869d.f14131n = this.f13866a;
            }
            new Object[1][0] = Integer.valueOf(this.f13866a.size());
            if (this.f13866a.size() < this.f13870e.size()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("drh", "a", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68425a("[FenceListenerConsumer] Received %s/%s snapshots. Won't notify fence %s.", Integer.valueOf(this.f13866a.size()), Integer.valueOf(this.f13870e.size()), this.f13869d.f14118a);
                duu duu = this.f13869d;
                duu.mo9681b(duu.f14128k);
                if (this.f13871f.f13876a.f13873b == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (this.f13869d.f14128k == 2) {
                    dpk F = dwq.m9649F();
                    duu duu2 = this.f13869d;
                    F.mo9392a(duu2.f14123f, duu2.f14125h, 0, 1, i);
                    return;
                }
                return;
            }
            dwq.m9667k().mo9435a(new drg(this), dqy.m9123a("FenceListenerConsumer_notifyListener"));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, com.google.android.gms.common.api.Status]
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
    public final void mo9483a(lsb lsb) {
        int i;
        if (!lsb.mo7183bo().mo17710c() || lsb.mo15420b().f11729k == null) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("drh", "a", 456, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68413a("[FenceListenerConsumer] Failed Fence-to-Snapshot %s with %s", this.f13867b, (Object) lsb.mo7183bo());
        } else {
            new Object[1][0] = lsb.mo15420b().f11729k;
            this.f13866a.add(lsb.mo15420b().f11729k);
        }
        this.f13868c.countDown();
        if (this.f13868c.getCount() == 0) {
            if (!this.f13866a.isEmpty()) {
                this.f13869d.f14131n = this.f13866a;
            }
            new Object[1][0] = Integer.valueOf(this.f13866a.size());
            if (this.f13866a.size() < this.f13870e.size()) {
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("drh", "a", 471, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68425a("[FenceListenerConsumer] Received %s/%s snapshots. Won't notify fence %s.", Integer.valueOf(this.f13866a.size()), Integer.valueOf(this.f13870e.size()), this.f13869d.f14118a);
                duu duu = this.f13869d;
                duu.mo9681b(duu.f14128k);
                if (this.f13871f.f13876a.f13873b == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (this.f13869d.f14128k == 2) {
                    dpk F = dwq.m9649F();
                    duu duu2 = this.f13869d;
                    F.mo9392a(duu2.f14123f, duu2.f14125h, 0, 1, i);
                    return;
                }
                return;
            }
            dwq.m9667k().mo9435a(new drg(this), dqy.m9123a("FenceListenerConsumer_notifyListener"));
        }
    }
}
