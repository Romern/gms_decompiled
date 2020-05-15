package p000;

import android.util.Log;
import com.android.volley.VolleyError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: biap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class biap implements bial {

    /* renamed from: a */
    final /* synthetic */ bhxn f120061a;

    /* renamed from: b */
    final /* synthetic */ List f120062b;

    /* renamed from: c */
    final /* synthetic */ bhyd f120063c;

    /* renamed from: d */
    private final List f120064d;

    public biap(bhyd bhyd, List list, bhxn bhxn, List list2) {
        this.f120063c = bhyd;
        this.f120061a = bhxn;
        this.f120062b = list2;
        this.f120064d = list;
    }

    /* renamed from: a */
    private static bvms m101882a(bhzs bhzs) {
        bxvd da = bvms.f156782e.mo74144da();
        String str = bhzs.f119985a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvms bvms = (bvms) da.f164949b;
        str.getClass();
        bvms.f156784a |= 1;
        bvms.f156785b = str;
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
        bvms bvms2 = (bvms) da.f164949b;
        bzrv bzrv2 = (bzrv) da2.mo74062i();
        bzrv2.getClass();
        bvms2.f156786c = bzrv2;
        bvms2.f156784a |= 2;
        float f = (float) cgfr.m145051f();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvms bvms3 = (bvms) da.f164949b;
        bvms3.f156784a |= 4;
        bvms3.f156787d = f;
        return (bvms) da.mo74062i();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo64172a(Object obj) {
        HashMap hashMap = new HashMap();
        for (bvms bvms : (List) obj) {
            if ((bvms.f156784a & 1) != 0) {
                hashMap.put(bvms.f156785b, bvms);
            } else if (Log.isLoggable("Places", 5)) {
                bioi.m102662c("Places", "Server sent a NearbyAlertData with null placeId");
            }
        }
        ArrayList arrayList = new ArrayList(this.f120064d.size());
        for (bhzs bhzs : this.f120064d) {
            if (hashMap.containsKey(bhzs.f119985a)) {
                bvms bvms2 = (bvms) hashMap.get(bhzs.f119985a);
                if ((bvms2.f156784a & 2) == 0) {
                    bxvd bxvd = (bxvd) bvms2.mo74142c(5);
                    bxvd.mo73625a((bxvk) bvms2);
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
                    bvms bvms3 = (bvms) bxvd.f164949b;
                    bzrv bzrv2 = (bzrv) da.mo74062i();
                    bvms bvms4 = bvms.f156782e;
                    bzrv2.getClass();
                    bvms3.f156786c = bzrv2;
                    bvms3.f156784a |= 2;
                    bvms2 = (bvms) bxvd.mo74062i();
                }
                arrayList.add(bvms2);
            } else {
                arrayList.add(m101882a(bhzs));
            }
        }
        mo64496a((List) arrayList);
    }

    /* renamed from: a */
    public final void mo64173a(Throwable th) {
        int i;
        if (th instanceof VolleyError) {
            VolleyError volleyError = (VolleyError) th;
            sil.m35353a(volleyError, "Places");
            i = biam.m101858a(volleyError);
        } else {
            i = 13;
        }
        if (Log.isLoggable("Places", 5)) {
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("onFailure StatusCode: ");
            sb.append(i);
            sb.append(", Cause: ");
            sb.append(valueOf);
            bioi.m102662c("Places", sb.toString());
            bioi.m102662c("Places", "Falling back to default radius for all places");
        }
        ArrayList arrayList = new ArrayList();
        for (bhzs bhzs : this.f120064d) {
            arrayList.add(m101882a(bhzs));
        }
        mo64496a((List) arrayList);
    }

    /* renamed from: a */
    public final void mo64496a(List list) {
        if (this.f120063c.f119870a.contains(this.f120061a)) {
            List<bhzs> list2 = this.f120062b;
            HashMap hashMap = new HashMap();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bvms bvms = (bvms) list.get(i);
                hashMap.put(bvms.f156785b, Float.valueOf(bvms.f156787d));
            }
            for (bhzs bhzs : list2) {
                String str = bhzs.f119985a;
                bhzs.f119988d = hashMap.containsKey(str) ? ((Float) hashMap.get(str)).floatValue() : 80.0f;
            }
            this.f120063c.f119878i.mo64390a(this.f120061a, this.f120062b);
        }
    }
}
