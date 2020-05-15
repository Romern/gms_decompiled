package p000;

import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import com.google.android.gms.nearby.messages.internal.BleSignalImpl;
import com.google.android.gms.nearby.messages.internal.DistanceImpl;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: ajbi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajbi extends ajah {

    /* renamed from: a */
    final /* synthetic */ ajbn f70322a;

    public ajbi(ajbn ajbn) {
        this.f70322a = ajbn;
    }

    /* renamed from: a */
    public final void mo38309a(ajag ajag) {
        if (cfop.m141874d()) {
            ajbn ajbn = this.f70322a;
            ajdv ajdv = new ajdv();
            ajdv.mo38533d();
            NearbyDevice a = ajbn.m58446a(ajag);
            ajai ajai = this.f70322a.f70332f;
            Set b = ajag.mo38371b();
            ajai.f70251l.mo72984b();
            HashSet hashSet = new HashSet(b);
            hashSet.removeAll(ajai.f70247h.keySet());
            ajai ajai2 = this.f70322a.f70332f;
            Set c = ajag.mo38372c();
            ajai2.f70251l.mo72984b();
            HashSet hashSet2 = new HashSet(c);
            for (ajag ajag2 : ajai2.f70246g.values()) {
                hashSet2.removeAll(ajag2.mo38372c());
            }
            ajai ajai3 = this.f70322a.f70332f;
            Set d = ajag.mo38374d();
            ajai3.f70251l.mo72984b();
            HashSet hashSet3 = new HashSet(d);
            for (ajag ajag3 : ajai3.f70246g.values()) {
                hashSet3.removeAll(ajag3.mo38374d());
            }
            ajbn.mo38448a(ajdv, a, hashSet, hashSet2, hashSet3, null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0207, code lost:
        if (p000.cfop.f185115a.mo6606a().mo82223b() != false) goto L_0x020f;
     */
    /* renamed from: a */
    public final void mo38310a(ajag ajag, ajag ajag2, int i) {
        Object obj;
        Iterator it;
        byzr byzr;
        Object obj2;
        Iterator it2;
        double d;
        ajag a;
        ajag ajag3 = ajag;
        ajag ajag4 = ajag2;
        int i2 = i;
        if (cfop.m141874d()) {
            if (ajai.m58348a(i2, 1)) {
                this.f70322a.mo38446a(ajag4, ajag.mo38375e(), ajag2.mo38375e(), ajbn.f70327a);
            }
            if (ajai.m58348a(i2, 2)) {
                this.f70322a.mo38446a(ajag4, ajag.mo38376f(), ajag2.mo38376f(), ajbn.f70328b);
            }
            if (ajai.m58348a(i2, 32)) {
                this.f70322a.mo38446a(ajag4, ajag.mo38377g(), ajag2.mo38377g(), ajbn.f70329c);
            }
            if (ajai.m58348a(i2, 64)) {
                ajbn ajbn = this.f70322a;
                Map g = ajag.mo38377g();
                Map g2 = ajag2.mo38377g();
                ajbm ajbm = ajbn.f70329c;
                for (Object obj3 : g.keySet()) {
                    if (!g2.containsKey(obj3)) {
                        NearbyDevice a2 = ajbn.m58446a(ajag2);
                        ajdv ajdv = new ajdv();
                        ajdv.mo38533d();
                        ajdv.mo38527a(a2);
                        Message a3 = ajbm.mo38441a(obj3, a2);
                        if (a3 != null) {
                            ajdv.f70402b = a3;
                            ajbn.mo38451a(ajdv.mo38525a(), (aiyo) null);
                        }
                    }
                }
            }
            if (ajai.m58348a(i2, 20)) {
                this.f70322a.mo38445a(i, ajag2, ajag.mo38375e(), ajag2.mo38375e(), ajbn.f70327a);
                this.f70322a.mo38445a(i, ajag2, ajag.mo38376f(), ajag2.mo38376f(), ajbn.f70328b);
                this.f70322a.mo38445a(i, ajag2, ajag.mo38377g(), ajag2.mo38377g(), ajbn.f70329c);
                HashSet hashSet = new HashSet();
                hashSet.addAll(ajag2.mo38371b());
                hashSet.addAll(ajag2.mo38372c());
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof byys) || ((a = this.f70322a.f70332f.mo38384a((byys) next)) != null && a.f70232b.equals(ajag4.f70232b))) {
                        ajdv ajdv2 = new ajdv();
                        if (ajai.m58348a(i2, 4)) {
                            ajdv2.mo38529a(new DistanceImpl(ajag4.f70237g));
                        }
                        if (ajai.m58348a(i2, 16)) {
                            BleSignalImpl a4 = ajag3.mo38368a(next);
                            BleSignalImpl a5 = ajag4.mo38368a(next);
                            if (!sdg.m34949a(a4, a5)) {
                                ajdv2.mo38528a(a5);
                            }
                        }
                        if (!ajdv2.mo38531b()) {
                            ajdv2.mo38526a(ajag2.mo38378h());
                            for (Map.Entry entry : this.f70322a.f70330d.mo38455b()) {
                                for (byzr byzr2 : ((ajbs) entry.getValue()).mo38457a()) {
                                    ArrayList arrayList = new ArrayList();
                                    arrayList.addAll(byzr2.f169155d);
                                    arrayList.addAll(byzr2.f169156e);
                                    if (arrayList.contains(obj)) {
                                        byzu byzu = byzr2.f169158g;
                                        if (byzu == null) {
                                            byzu = byzu.f169175b;
                                        }
                                        double d2 = byzu.f169177a;
                                        if (d2 > 0.0d) {
                                            byzr = byzr2;
                                            double max = Math.max(cfop.f185115a.mo6606a().mo82197A(), d2 * cfop.f185115a.mo6606a().mo82198B()) + d2;
                                            double d3 = Double.MAX_VALUE;
                                            if (ajag.mo38370a()) {
                                                it2 = it3;
                                                obj2 = obj;
                                                d = ajag3.f70237g;
                                            } else {
                                                it2 = it3;
                                                obj2 = obj;
                                                d = Double.MAX_VALUE;
                                            }
                                            if (ajag2.mo38370a()) {
                                                it = it2;
                                                d3 = ajag4.f70237g;
                                            } else {
                                                it = it2;
                                            }
                                            if (d3 <= d2) {
                                                if (d2 < d) {
                                                    srn srn = ahfq.f67120a;
                                                    ajdv2.mo38532c();
                                                }
                                                ajdv2.mo38527a(ajbn.m58446a(ajag2));
                                            } else if (d <= max && max < d3) {
                                                srn srn2 = ahfq.f67120a;
                                                ajdv2.mo38533d();
                                            }
                                            if (d3 > d2) {
                                                if (!ajdv2.mo38525a().mo44364a(2)) {
                                                    obj = obj2;
                                                    it3 = it;
                                                }
                                            }
                                        } else {
                                            it = it3;
                                            obj2 = obj;
                                            byzr = byzr2;
                                        }
                                        this.f70322a.mo38447a(ajdv2, byzr, (ClientAppIdentifier) entry.getKey());
                                        obj = obj2;
                                        it3 = it;
                                    } else {
                                        obj = obj;
                                    }
                                }
                                next = obj;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo38381a(byys byys, ajag ajag) {
        for (Map.Entry entry : this.f70322a.f70330d.mo38455b()) {
            for (byzr byzr : ((ajbs) entry.getValue()).mo38457a()) {
                if (byzr.f169155d.contains(byys)) {
                    ajbn ajbn = this.f70322a;
                    ajdv ajdv = new ajdv();
                    ajdv.mo38527a(ajbn.m58446a(ajag));
                    ajbn.mo38447a(ajdv, byzr, (ClientAppIdentifier) entry.getKey());
                }
            }
        }
    }
}
