package p000;

import com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceEntity;
import com.google.android.gms.awareness.snapshot.internal.AwarenessPlaceLikelihoodEntity;
import com.google.android.gms.awareness.snapshot.internal.PlacesData;
import com.google.android.gms.awareness.snapshot.internal.Snapshot;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.contextmanager.ContextData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: ede */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ede extends dqi {

    /* renamed from: a */
    final /* synthetic */ edn f14718a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ede(edn edn, String str, Object... objArr) {
        super(str, objArr);
        this.f14718a = edn;
    }

    /* renamed from: a */
    public final void mo9444a(Exception exc) {
        this.f14718a.mo10003a(7508, (Snapshot) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0200, code lost:
        if (r30 != null) goto L_0x0202;
     */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo9366a(Object obj) {
        boolean z;
        aels aels;
        aels aels2;
        List list;
        String str;
        aels aels3 = (aels) obj;
        int i = this.f14718a.f14740i.f162973bD;
        int i2 = 1;
        char c = 0;
        if (i == 18) {
            z = true;
        } else {
            z = i == 60;
        }
        sdo.m34974b(z);
        Snapshot snapshot = null;
        if (aels3 != null) {
            try {
                if (aels3.mo24660a() > 0) {
                    ArrayList arrayList = new ArrayList(aels3.mo24660a());
                    bxmn bxmn = (bxmn) bxmo.f163965b.mo74144da();
                    Iterator it = aels3.iterator();
                    while (it.hasNext()) {
                        aelp aelp = (aelp) it.next();
                        aelh bB = aelp.mo8029bB();
                        lrn lrn = new lrn();
                        lrn.f26641a = bB.mo8007a();
                        lrn.f26651k = bB.mo8008b();
                        lrn.f26642b = String.valueOf(bB.mo8024q());
                        lrn.f26652l = String.valueOf(bB.mo8025r());
                        lrn.f26653m = String.valueOf(bB.mo8023p());
                        if (bB.mo8017j() != null) {
                            String[] strArr = new String[i2];
                            strArr[c] = bB.mo8017j().toString();
                            list = Arrays.asList(strArr);
                        } else {
                            list = Collections.emptyList();
                        }
                        lrn.f26654n = list;
                        lrn.f26643c = bB.mo8010d();
                        lrn.f26644d = bB.mo8012f();
                        lrn.f26645e = bB.mo8013g();
                        if (bB.mo8014h() != null) {
                            str = bB.mo8014h().getID();
                        } else {
                            str = "UTC";
                        }
                        lrn.f26646f = str;
                        lrn.f26647g = bB.mo8016i();
                        lrn.f26648h = bB.mo8018k();
                        lrn.f26649i = bB.mo8019l();
                        lrn.f26650j = bB.mo8020m();
                        lrn.f26655o = bB.mo8021n();
                        Iterator it2 = it;
                        aels2 = aels3;
                        try {
                            int i3 = i;
                            AwarenessPlaceEntity awarenessPlaceEntity = new AwarenessPlaceEntity(lrn.f26641a, lrn.f26651k, lrn.f26642b, lrn.f26652l, lrn.f26653m, lrn.f26654n, lrn.f26643c, lrn.f26644d, lrn.f26645e, lrn.f26646f, lrn.f26647g, lrn.f26648h, lrn.f26649i, lrn.f26650j, lrn.f26655o);
                            float bA = aelp.mo8028bA();
                            sdo.m34959a(awarenessPlaceEntity);
                            AwarenessPlaceLikelihoodEntity awarenessPlaceLikelihoodEntity = new AwarenessPlaceLikelihoodEntity(awarenessPlaceEntity, bA);
                            new Object[1][0] = awarenessPlaceLikelihoodEntity;
                            ArrayList arrayList2 = arrayList;
                            arrayList2.add(awarenessPlaceLikelihoodEntity);
                            bxmm a = dzv.m9920a(awarenessPlaceLikelihoodEntity.f11705a, (double) awarenessPlaceLikelihoodEntity.f11706b, 0, -1.0d, null);
                            bxmn = bxmn;
                            if (bxmn.f164950c) {
                                bxmn.mo74035c();
                                bxmn.f164950c = false;
                            }
                            bxmo bxmo = (bxmo) bxmn.f164949b;
                            a.getClass();
                            bxmo.mo73592a();
                            bxmo.f163968a.add(a);
                            arrayList = arrayList2;
                            it = it2;
                            aels3 = aels2;
                            i = i3;
                            i2 = 1;
                            c = 0;
                        } catch (Throwable th) {
                            th = th;
                            aels2.mo12460c();
                            throw th;
                        }
                    }
                    aels = aels3;
                    ArrayList arrayList3 = arrayList;
                    int i4 = i;
                    if (i4 == 60) {
                        List a2 = new dxz(cdgv.m133420b()).mo9843a(Collections.unmodifiableList(((bxmo) bxmn.f164949b).f163968a));
                        if (bxmn.f164950c) {
                            bxmn.mo74035c();
                            bxmn.f164950c = false;
                        }
                        ((bxmo) bxmn.f164949b).f163968a = bxvk.m124030de();
                        bxmn.mo73591a(a2);
                    }
                    tip tip = new tip(7, i4, 1);
                    tip.mo26572a(bxmo.f163966c, (bxmo) bxmn.mo74062i());
                    ContextData a3 = tip.mo26570a();
                    lrx lrx = new lrx();
                    lrx.mo15414a(a3);
                    if (i4 == 18) {
                        PlacesData placesData = new PlacesData(arrayList3);
                        rtu d = rts.m34440d();
                        rts.m34439a(d, placesData);
                        DataHolder a4 = d.mo25163a(0);
                        if (!lrx.mo15415a(a4)) {
                            lrx.f26658c = a4;
                        }
                    }
                    snapshot = lrx.mo15413a();
                    aels.mo12460c();
                    this.f14718a.mo10003a(0, snapshot);
                    return;
                }
                aels = aels3;
            } catch (Throwable th2) {
                th = th2;
                aels2 = aels3;
                aels2.mo12460c();
                throw th;
            }
        } else {
            aels = aels3;
        }
    }
}
