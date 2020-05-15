package p000;

import android.content.Context;
import com.google.android.gms.awareness.snapshot.internal.BeaconStateImpl;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import com.google.android.gms.location.places.PlaceFilter;
import com.google.android.gms.nearby.messages.Strategy;
import java.util.ArrayList;
import java.util.UUID;

/* renamed from: edd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class edd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ edn f14717a;

    public edd(edn edn) {
        this.f14717a = edn;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r1 != 35) goto L_0x00aa;
     */
    public final void run() {
        bxco bxco = bxco.UNKNOWN_CONTEXT_NAME;
        int ordinal = this.f14717a.f14740i.ordinal();
        if (ordinal != 18) {
            if (ordinal == 26) {
                edn edn = this.f14717a;
                ArrayList arrayList = edn.f14735d.f11731b;
                if (arrayList == null || arrayList.isEmpty()) {
                    edn.mo10003a(0, (Snapshot) null);
                    return;
                }
                edm edm = new edm(edn, arrayList);
                long i = cdgp.f180782a.mo6606a().mo77589i();
                aixd aixd = new aixd();
                ArrayList arrayList2 = edm.f14731a;
                int size = arrayList2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    BeaconStateImpl.TypeFilterImpl typeFilterImpl = (BeaconStateImpl.TypeFilterImpl) arrayList2.get(i2);
                    aixd.mo38201a(typeFilterImpl.mo8038a(), typeFilterImpl.mo8040b());
                }
                aiyl aiyl = new aiyl();
                aiyl.f70070a = Strategy.f80689b;
                aiyl.f70071b = aixd.mo38199a();
                aiym a = aiyl.mo38273a();
                aixh aixh = new aixh();
                aixh.mo38209a("0p:com.google.android.contextmanager");
                aixh.mo38210b();
                aixh.f69978c = edm.f14733c.f14734c.f30678b;
                ahcb.m55440a(dwq.m9662f(), aixh.mo38208a()).mo38205a(edm, a).mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("SnapshotOperation_subscribeNearbyMessages")), new edl(edm, "[SnapshotOperation] subscribe for beacon snapshot", new Object[0], i));
                return;
            } else if (ordinal != 59) {
                edn edn2 = this.f14717a;
                int ordinal2 = edn2.f14740i.ordinal();
                if (ordinal2 != 1) {
                    if (ordinal2 == 6) {
                        edn2.f14739h = UUID.randomUUID().toString();
                        rjx e = lrh.m19581e(dwq.m9662f(), edn2.f14736e);
                        String str = edn2.f14739h;
                        dwj a2 = dwj.m9630a();
                        long j = edn2.f14735d.f11733d;
                        if (j <= 0) {
                            j = cdgp.m133193b();
                        }
                        e.mo24692a(str, 6, a2, dwk.m9635a(j)).mo50371a(new dqi("[SnapshotOperation] register activity interest", new Object[0]));
                    } else if (ordinal2 != 31) {
                    }
                    edn2.f14737f = new edi(edn2, dwq.m9667k(), "SnapshotOperationReceiveContextData");
                    bxco bxco2 = edn2.f14740i;
                    tjc tjc = edn2.f14737f;
                    tit tit = new tit();
                    tit.mo26579a(bxco2.f162973bD);
                    lrh.m19579c(dwq.m9662f(), edn2.f14736e).mo24703a(tit.mo26578a(), tjc).mo50371a(new edh(edn2, "SnapshotOperation", Integer.toString(bxco2.f162973bD)));
                    edn2.f14738g = new edf(edn2);
                    dwq.m9667k().mo9434a(edn2.f14738g, cdig.f180945a.mo6606a().mo77646a(), dqy.m9123a("SnapshotOperationTimeout"));
                    return;
                }
                edn2.f14739h = UUID.randomUUID().toString();
                rjx e2 = lrh.m19581e(dwq.m9662f(), edn2.f14736e);
                String str2 = edn2.f14739h;
                dwj a3 = dwj.m9630a();
                long j2 = edn2.f14735d.f11733d;
                if (j2 <= 0) {
                    j2 = cdgp.m133212u();
                }
                e2.mo24692a(str2, 1, a3, tjx.m37114b(j2)).mo50371a(new dqi("[SnapshotOperation] register location interest", new Object[0]));
                edn2.f14737f = new edi(edn2, dwq.m9667k(), "SnapshotOperationReceiveContextData");
                bxco bxco22 = edn2.f14740i;
                tjc tjc2 = edn2.f14737f;
                tit tit2 = new tit();
                tit2.mo26579a(bxco22.f162973bD);
                lrh.m19579c(dwq.m9662f(), edn2.f14736e).mo24703a(tit2.mo26578a(), tjc2).mo50371a(new edh(edn2, "SnapshotOperation", Integer.toString(bxco22.f162973bD)));
                edn2.f14738g = new edf(edn2);
                dwq.m9667k().mo9434a(edn2.f14738g, cdig.f180945a.mo6606a().mo77646a(), dqy.m9123a("SnapshotOperationTimeout"));
                return;
            }
        }
        edn edn3 = this.f14717a;
        Context f = dwq.m9662f();
        aemh aemh = new aemh();
        aemh.f63517c = 0;
        ContextManagerClientInfo contextManagerClientInfo = edn3.f14734c;
        aemh.f63515a = contextManagerClientInfo.f30678b;
        aemh.f63516b = contextManagerClientInfo.f30680d;
        aelm a4 = aema.m52141a(f, aemh.mo34328a());
        PlaceFilter placeFilter = new PlaceFilter();
        rkb rkb = a4.f43165D;
        aemd aemd = new aemd(aema.f63502b, rkb, placeFilter);
        rkb.mo24787a((rle) aemd);
        sdl.m34955a(aemd, new aels()).mo50378a(dwq.m9667k().mo9432a(dqy.m9123a("SnapshotOperation_getCurrentPlace")), new ede(edn3, "[SnapshotOperation] getCurrentPlace", new Object[0]));
    }
}
