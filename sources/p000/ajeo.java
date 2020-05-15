package p000;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: ajeo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajeo implements ajeu {

    /* renamed from: a */
    final /* synthetic */ ClientAppIdentifier f70449a;

    /* renamed from: b */
    final /* synthetic */ ajep f70450b;

    /* renamed from: c */
    final /* synthetic */ List f70451c;

    /* renamed from: d */
    final /* synthetic */ List f70452d;

    /* renamed from: e */
    final /* synthetic */ List f70453e;

    /* renamed from: f */
    final /* synthetic */ List f70454f;

    /* renamed from: g */
    final /* synthetic */ Set f70455g;

    /* renamed from: h */
    final /* synthetic */ ajeq f70456h;

    /* renamed from: i */
    final /* synthetic */ ajeh f70457i;

    public ajeo(ajeq ajeq, ClientAppIdentifier clientAppIdentifier, ajep ajep, List list, List list2, List list3, List list4, Set set, ajeh ajeh) {
        this.f70456h = ajeq;
        this.f70449a = clientAppIdentifier;
        this.f70450b = ajep;
        this.f70451c = list;
        this.f70452d = list2;
        this.f70453e = list3;
        this.f70454f = list4;
        this.f70455g = set;
        this.f70457i = ajeh;
    }

    /* renamed from: a */
    public final void mo38178a(ajet ajet, int i) {
        if (!cfos.m141988b() || !((bnsl) ahfq.f67120a.mo68390d()).mo68447l()) {
            srn srn = ahfq.f67120a;
            aiyc.m58180a(i);
        } else {
            bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
            bnsl.mo68432a("ajeo", "a", 544, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("%s Call failed (network error, Nearby status code = %s) for client: %s", "ReportRpcManager: ", aiyc.m58180a(i), this.f70449a);
        }
        this.f70450b.mo38555b(this.f70451c);
        this.f70456h.f70467i.mo38297a(ajeq.m58614b(this.f70451c), 3, i);
        this.f70456h.f70467i.mo38296a(this.f70452d, 3);
        this.f70456h.f70468j.mo38264a(ajeq.m58613a(this.f70453e), 3, i);
        this.f70456h.f70468j.mo38265b(this.f70454f, 3, i);
        this.f70457i.mo38546a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajaf.a(java.util.Set, boolean):void
     arg types: [java.util.Set, int]
     candidates:
      ajaf.a(byzr[], boolean):void
      ajaf.a(java.util.Set, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ajaf.a(byzr[], boolean):void
     arg types: [byzr[], int]
     candidates:
      ajaf.a(java.util.Set, boolean):void
      ajaf.a(byzr[], boolean):void */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo38179a(Object obj) {
        HashSet hashSet;
        int i;
        bzck bzck = (bzck) obj;
        srn srn = ahfq.f67120a;
        this.f70450b.mo38555b(this.f70451c);
        int i2 = 0;
        this.f70456h.f70467i.mo38297a(ajeq.m58614b(this.f70451c), 4, 0);
        this.f70456h.f70467i.mo38296a(this.f70452d, 4);
        this.f70456h.f70468j.mo38264a(ajeq.m58613a(this.f70453e), 4, 0);
        this.f70456h.f70468j.mo38265b(this.f70454f, 4, 0);
        ajaf a = this.f70456h.mo38556a(this.f70449a);
        a.mo38361a(this.f70455g, false);
        HashSet hashSet2 = new HashSet();
        int i3 = 5;
        if ((bzck.f169348a & 8) != 0) {
            ajep ajep = this.f70450b;
            bzco bzco = bzck.f169352e;
            if (bzco == null) {
                bzco = bzco.f169385f;
            }
            List<byzr> list = bzco.f169389c;
            if (!ajep.f70458a.isEmpty()) {
                bngs bngs = new bngs();
                for (int i4 = 0; i4 < list.size(); i4++) {
                    byzr byzr = (byzr) list.get(i4);
                    C1225nr nrVar = new C1225nr();
                    bxwc bxwc = byzr.f169153b;
                    int size = bxwc.size();
                    int i5 = 0;
                    while (i5 < size) {
                        String str = (String) bxwc.get(i5);
                        String str2 = (String) ajep.f70458a.get(str);
                        if (str2 != null) {
                            str = str2;
                        }
                        nrVar.add(str);
                        i5++;
                        i3 = 5;
                    }
                    bxvd bxvd = (bxvd) byzr.mo74142c(i3);
                    bxvd.mo73625a((bxvk) byzr);
                    bxvf bxvf = (bxvf) bxvd;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    byzr byzr2 = byzr.f169150h;
                    ((byzr) bxvf.f164949b).f169153b = bxvk.m124030de();
                    bxvf.mo74129a(nrVar);
                    bngs.mo67668c((byzr) bxvf.mo74062i());
                }
                list = bngs.mo67664a();
            }
            ajai ajai = (ajai) ahgz.m55754a(this.f70456h.f70459a, ajai.class);
            bzco bzco2 = bzck.f169352e;
            if (bzco2 == null) {
                bzco2 = bzco.f169385f;
            }
            ajai.mo38390a((byyr[]) bzco2.f169391e.toArray(new byyr[0]));
            bzco bzco3 = bzck.f169352e;
            if (bzco3 == null) {
                bzco3 = bzco.f169385f;
            }
            byzv[] byzvArr = (byzv[]) bzco3.f169388b.toArray(new byzv[0]);
            int length = byzvArr.length;
            int i6 = 0;
            while (true) {
                int i7 = 1;
                if (i6 >= length) {
                    break;
                }
                byzv byzv = byzvArr[i6];
                int a2 = bzbw.m125631a(byzv.f169182b);
                if (a2 != 0) {
                    i7 = a2;
                }
                if (i7 == 2) {
                    i = 3;
                } else {
                    i = 4;
                }
                ahfv a3 = ahfv.m55670a(byzv.f169181a);
                ajgu ajgu = this.f70456h.f70463e;
                ajgu.f70594c.mo72984b();
                if (ajgu.f70592a.containsKey(a3)) {
                    ((ajgv) ajgu.f70592a.get(a3)).f70603f = i;
                }
                i6++;
            }
            bzco bzco4 = bzck.f169352e;
            if (bzco4 == null) {
                bzco4 = bzco.f169385f;
            }
            String str3 = bzco4.f169390d;
            if (!TextUtils.equals(this.f70456h.f70469k.mo38444a(this.f70449a), str3)) {
                ((ajbn) ahgz.m55754a(this.f70456h.f70459a, ajbn.class)).mo38450a(this.f70449a, (byzr[]) list.toArray(new byzr[0]), str3);
                a.mo38361a(this.f70455g, true);
                a.mo38362a((byzr[]) list.toArray(new byzr[0]), false);
            }
            if (!list.isEmpty()) {
                for (byzr byzr3 : list) {
                    hashSet2.addAll(byzr3.f169153b);
                }
            }
        }
        if ((bzck.f169348a & 16) != 0) {
            bzci bzci = bzck.f169353f;
            if (bzci == null) {
                bzci = bzci.f169330c;
            }
            String str4 = bzci.f169333b;
            if (!TextUtils.isEmpty(str4)) {
                this.f70456h.f70464f.mo38181a(str4);
            }
        }
        if ((bzck.f169348a & 32) != 0) {
            ajeb ajeb = this.f70456h.f70462d;
            bzcc bzcc = bzck.f169354g;
            if (bzcc == null) {
                bzcc = bzcc.f169297b;
            }
            ajeb.f70411b.mo72984b();
            bxwc bxwc2 = bzcc.f169299a;
            int size2 = bxwc2.size();
            int i8 = 0;
            while (i8 < size2) {
                byzp byzp = (byzp) bxwc2.get(i8);
                bzbu a4 = bzbu.m125627a(byzp.f169143a);
                if (a4 == null) {
                    a4 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                }
                byzn[] byznArr = (byzn[]) byzp.f169144b.toArray(new byzn[i2]);
                ajeb.f70411b.mo72984b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int i9 = 0;
                int i10 = 0;
                for (int length2 = byznArr.length; i9 < length2; length2 = length2) {
                    byzn byzn = byznArr[i9];
                    int i11 = i10 + 1;
                    bxvd bxvd2 = (bxvd) byzn.mo74142c(5);
                    bxvd2.mo73625a((bxvk) byzn);
                    HashSet hashSet3 = hashSet2;
                    int i12 = size2;
                    long j = byzn.f169136d + elapsedRealtime;
                    bxwc bxwc3 = bxwc2;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    byzn byzn2 = (byzn) bxvd2.f164949b;
                    byzn byzn3 = byzn.f169131e;
                    int i13 = byzn2.f169133a | 4;
                    byzn2.f169133a = i13;
                    byzn2.f169136d = j;
                    long j2 = byzn.f169135c;
                    byzn2.f169133a = i13 | 2;
                    byzn2.f169135c = j2 + elapsedRealtime;
                    byznArr[i10] = (byzn) bxvd2.mo74062i();
                    i9++;
                    hashSet2 = hashSet3;
                    i10 = i11;
                    size2 = i12;
                    bxwc2 = bxwc3;
                }
                bxwc bxwc4 = bxwc2;
                HashSet hashSet4 = hashSet2;
                int i14 = size2;
                ajeb.mo38539a(a4, byznArr);
                byzp.f169144b.size();
                bzbu a5 = bzbu.m125627a(byzp.f169143a);
                if (a5 == null) {
                    a5 = bzbu.TOKEN_MEDIUM_UNKNOWN;
                }
                ajgs.m58685a(a5);
                i8++;
                hashSet2 = hashSet4;
                size2 = i14;
                bxwc2 = bxwc4;
                i2 = 0;
            }
            hashSet = hashSet2;
            ((ajbd) ahgz.m55754a(this.f70456h.f70459a, ajbd.class)).mo38439c();
        } else {
            hashSet = hashSet2;
        }
        if (hashSet.size() > 0) {
            this.f70456h.f70465g.mo38320a((String) null, 17, hashSet, (Set) null);
        }
        this.f70457i.mo38546a();
    }
}
