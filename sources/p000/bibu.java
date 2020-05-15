package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: bibu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bibu implements bial {

    /* renamed from: a */
    final /* synthetic */ bhxn f120164a;

    /* renamed from: b */
    final /* synthetic */ List f120165b;

    /* renamed from: c */
    final /* synthetic */ bhyd f120166c;

    /* renamed from: d */
    private final List f120167d;

    public bibu(bhyd bhyd, List list, bhxn bhxn, List list2) {
        this.f120166c = bhyd;
        this.f120164a = bhxn;
        this.f120165b = list2;
        this.f120167d = list;
    }

    /* renamed from: a */
    private static bvty m101926a(bhzs bhzs) {
        bxvd da = bvty.f157634e.mo74144da();
        String str = bhzs.f119985a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvty bvty = (bvty) da.f164949b;
        str.getClass();
        bvty.f157636a |= 1;
        bvty.f157637b = str;
        bxvd da2 = bzrv.f171206c.mo74144da();
        double d = bhzs.f119986b;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bzrv bzrv = (bzrv) da2.f164949b;
        bzrv.f171208a = d;
        bzrv.f171209b = bhzs.f119987c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvty bvty2 = (bvty) da.f164949b;
        bzrv bzrv2 = (bzrv) da2.mo74062i();
        bzrv2.getClass();
        bvty2.f157638c = bzrv2;
        bvty2.f157636a |= 2;
        float f = (float) cgfr.m145051f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvty bvty3 = (bvty) da.f164949b;
        bvty3.f157636a |= 4;
        bvty3.f157639d = f;
        return (bvty) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        HashMap hashMap = new HashMap();
        for (bvty bvty : (List) obj) {
            if ((bvty.f157636a & 1) != 0) {
                hashMap.put(bvty.f157637b, bvty);
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Server sent a NearbyAlertData with null placeId");
            }
        }
        ArrayList arrayList = new ArrayList(this.f120167d.size());
        for (bhzs bhzs : this.f120167d) {
            if (hashMap.containsKey(bhzs.f119985a)) {
                bvty bvty2 = (bvty) hashMap.get(bhzs.f119985a);
                if ((bvty2.f157636a & 2) == 0) {
                    bxvd bxvd = (bxvd) bvty2.mo74142c(5);
                    bxvd.mo73625a((bxvk) bvty2);
                    bxvd da = bzrv.f171206c.mo74144da();
                    double d = bhzs.f119986b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bzrv bzrv = (bzrv) da.f164949b;
                    bzrv.f171208a = d;
                    bzrv.f171209b = bhzs.f119987c;
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bvty bvty3 = (bvty) bxvd.f164949b;
                    bzrv bzrv2 = (bzrv) da.mo74062i();
                    bvty bvty4 = bvty.f157634e;
                    bzrv2.getClass();
                    bvty3.f157638c = bzrv2;
                    bvty3.f157636a |= 2;
                    bvty2 = (bvty) bxvd.mo74062i();
                }
                arrayList.add(bvty2);
            } else {
                arrayList.add(m101926a(bhzs));
            }
        }
        mo64510a((List) arrayList);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        if (th instanceof VolleyError) {
            sil.m35353a((VolleyError) th, "Places");
        }
        if (Log.isLoggable("Places", 5)) {
            bioi.m102662c("Places", "Falling back to default radius for all places");
        }
        ArrayList arrayList = new ArrayList();
        for (bhzs bhzs : this.f120167d) {
            arrayList.add(m101926a(bhzs));
        }
        mo64510a((List) arrayList);
    }

    /* renamed from: a */
    public final void mo64510a(List list) {
        if (this.f120166c.f119870a.contains(this.f120164a)) {
            List<bhzs> list2 = this.f120165b;
            HashMap hashMap = new HashMap();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bvty bvty = (bvty) list.get(i);
                hashMap.put(bvty.f157637b, Float.valueOf(bvty.f157639d));
            }
            for (bhzs bhzs : list2) {
                String str = bhzs.f119985a;
                bhzs.f119988d = hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : 80.0f;
            }
            this.f120166c.f119878i.mo64390a(this.f120164a, this.f120165b);
        }
    }
}
