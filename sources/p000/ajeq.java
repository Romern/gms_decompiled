package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: ajeq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajeq {

    /* renamed from: a */
    public final Context f70459a;

    /* renamed from: b */
    public final ajed f70460b;

    /* renamed from: c */
    public final buqh f70461c;

    /* renamed from: d */
    public final ajeb f70462d;

    /* renamed from: e */
    public final ajgu f70463e;

    /* renamed from: f */
    public final aiwt f70464f;

    /* renamed from: g */
    public final aiyx f70465g;

    /* renamed from: h */
    public final ajat f70466h;

    /* renamed from: i */
    public final aiyr f70467i;

    /* renamed from: j */
    public final aiyh f70468j;

    /* renamed from: k */
    public final ajbn f70469k;

    /* renamed from: l */
    private final Map f70470l = new C1223np();

    public ajeq(Context context) {
        this.f70466h = (ajat) ahgz.m55754a(context, ajat.class);
        sdo.m34959a(context);
        this.f70459a = context;
        this.f70460b = (ajed) ahgz.m55754a(context, ajed.class);
        this.f70461c = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70462d = (ajeb) ahgz.m55754a(context, ajeb.class);
        this.f70463e = (ajgu) ahgz.m55754a(context, ajgu.class);
        this.f70464f = ((aiws) ahgz.m55754a(context, aiws.class)).f69959b;
        this.f70465g = (aiyx) ahgz.m55754a(context, aiyx.class);
        this.f70467i = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f70468j = (aiyh) ahgz.m55754a(context, aiyh.class);
        this.f70469k = (ajbn) ahgz.m55754a(context, ajbn.class);
    }

    /* renamed from: a */
    public static Set m58613a(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((byzk) it.next()).f169114b);
        }
        return hashSet;
    }

    /* renamed from: b */
    public static Set m58614b(List list) {
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(((byzs) it.next()).f169163b);
        }
        return hashSet;
    }

    /* renamed from: a */
    public final ajaf mo38556a(ClientAppIdentifier clientAppIdentifier) {
        ajaf ajaf = (ajaf) this.f70470l.get(clientAppIdentifier);
        if (ajaf != null) {
            return ajaf;
        }
        ajaf ajaf2 = new ajaf(this.f70459a, clientAppIdentifier);
        this.f70470l.put(clientAppIdentifier, ajaf2);
        return ajaf2;
    }

    /* renamed from: a */
    public final List mo38557a() {
        ajgu ajgu = this.f70463e;
        ajgu.f70594c.mo72984b();
        ajgu.mo38618a();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ajgu.f70592a.entrySet()) {
            int i = ((ajgv) entry.getValue()).f70603f;
            if (i == 1 || i == 3) {
                ajgv ajgv = (ajgv) entry.getValue();
                byzx byzx = (byzx) byzy.f169191d.mo74144da();
                String a = ajgv.f70599b.mo36407a();
                if (byzx.f164950c) {
                    byzx.mo74035c();
                    byzx.f164950c = false;
                }
                byzy byzy = (byzy) byzx.f164949b;
                a.getClass();
                byzy.f169193a = 1 | byzy.f169193a;
                byzy.f169194b = a;
                byzx.mo74516a(ajgv.f70600c);
                byzx.mo74516a(ajgv.f70601d);
                byzx.mo74516a(ajgv.f70602e);
                arrayList.add((byzy) byzx.mo74062i());
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x02ff  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x030b  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0443  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x045f A[SYNTHETIC, Splitter:B:186:0x045f] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x048e  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0221 A[EDGE_INSN: B:230:0x0221->B:91:0x0221 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0234  */
    /* renamed from: a */
    public final void mo38558a(ClientAppIdentifier clientAppIdentifier, List list, List list2, List list3, List list4, ajeh ajeh) {
        int i;
        boolean z;
        Set<ajae> set;
        boolean z2;
        boolean z3;
        Set set2;
        ArrayList arrayList;
        bzcb bzcb;
        Iterator it;
        ajeo ajeo;
        int length;
        Set set3;
        byzr[] byzrArr;
        int a;
        ajeq ajeq = this;
        ClientAppIdentifier clientAppIdentifier2 = clientAppIdentifier;
        srn srn = ahfq.f67120a;
        String a2 = ajeq.f70464f.mo38180a();
        if (!TextUtils.isEmpty(a2) || !list.isEmpty() || !list3.isEmpty()) {
            List a3 = mo38557a();
            ajai ajai = (ajai) ahgz.m55754a(ajeq.f70459a, ajai.class);
            ajai.f70251l.mo72984b();
            ArrayList arrayList2 = new ArrayList(ajai.f70247h.size());
            Iterator it2 = ajai.f70247h.keySet().iterator();
            while (true) {
                i = 1;
                z = false;
                if (!it2.hasNext()) {
                    break;
                }
                byys byys = (byys) it2.next();
                bxvd da = byyt.f169008d.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                byyt byyt = (byyt) da.f164949b;
                byys.getClass();
                byyt.f169011b = byys;
                byyt.f169010a = 1 | byyt.f169010a;
                ajag a4 = ajai.mo38384a(byys);
                if (a4 != null) {
                    if (!sdg.m34949a(a4.f70238h, byys)) {
                        byte[] bArr = a4.f70239i;
                        if (bArr != null) {
                            ByteString a5 = ByteString.m123261a(bArr);
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            byyt byyt2 = (byyt) da.f164949b;
                            a5.getClass();
                            byyt2.f169010a = 2 | byyt2.f169010a;
                            byyt2.f169012c = a5;
                        }
                    }
                }
                arrayList2.add((byyt) da.mo74062i());
            }
            bngs bngs = new bngs();
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                List list5 = a3;
                byyt byyt3 = (byyt) arrayList2.get(i2);
                if (cfop.f185115a.mo6606a().mo82210N()) {
                    byys byys2 = byyt3.f169011b;
                    if (byys2 == null) {
                        byys2 = byys.f169002d;
                    }
                    int a6 = bzaj.m125580a(byys2.f169005b);
                    if ((a6 != 0 && a6 == 107) || !clientAppIdentifier2.mo44295c("0p:discoverer")) {
                        bngs.mo67668c(byyt3);
                    }
                } else {
                    bngs.mo67668c(byyt3);
                }
                i2++;
                ajeq = this;
                a3 = list5;
                i = 1;
                z = false;
            }
            bngx a7 = bngs.mo67664a();
            arrayList2.size();
            a7.size();
            a7.size();
            ajai ajai2 = (ajai) ahgz.m55754a(ajeq.f70459a, ajai.class);
            ajai2.f70251l.mo72984b();
            HashSet hashSet = new HashSet();
            for (ajag ajag : ajai2.mo38385a()) {
                for (String str : ajag.mo38372c()) {
                    bxvd da2 = bzab.f169208d.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = z;
                    }
                    bzab bzab = (bzab) da2.f164949b;
                    str.getClass();
                    bzab.f169210a |= i;
                    bzab.f169211b = str;
                    byte[] bArr2 = ajag.f70239i;
                    if (bArr2 != null) {
                        ByteString a8 = ByteString.m123261a(bArr2);
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = z;
                        }
                        bzab bzab2 = (bzab) da2.f164949b;
                        a8.getClass();
                        bzab2.f169210a |= 2;
                        bzab2.f169212c = a8;
                    }
                    hashSet.add((bzab) da2.mo74062i());
                }
            }
            ArrayList arrayList3 = new ArrayList(hashSet);
            Set<ajae> nrVar = new C1225nr();
            int size2 = a7.size();
            for (int i3 = 0; i3 < size2; i3++) {
                byys byys3 = ((byyt) a7.get(i3)).f169011b;
                if (byys3 == null) {
                    byys3 = byys.f169002d;
                }
                nrVar.add(new ajae(byys3));
            }
            C1225nr nrVar2 = new C1225nr();
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                nrVar2.add(new ajae(((bzab) arrayList3.get(i4)).f169211b));
            }
            nrVar.addAll(nrVar2);
            ajaf a9 = mo38556a(clientAppIdentifier);
            if (!cfop.m141876f()) {
                set = bnon.f131923a;
            } else {
                if (a9.mo38365c()) {
                    bnia j = bnic.m109500j();
                    for (ajae ajae : nrVar) {
                        if (a9.mo38363b(ajae) != null) {
                            j.mo67629b(ajae);
                        }
                    }
                    set = j.mo67751a();
                } else {
                    set = bnon.f131923a;
                }
                nrVar.removeAll(set);
            }
            if (cfop.m141876f()) {
                if (!set.isEmpty()) {
                    z2 = true;
                } else if (nrVar.isEmpty()) {
                    z2 = true;
                }
                if (cfop.m141876f()) {
                    z3 = false;
                } else if (!a9.mo38365c()) {
                    z3 = nrVar.isEmpty();
                } else {
                    Iterator it3 = nrVar.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (a9.mo38363b((ajae) it3.next()) == null) {
                                break;
                            }
                        } else {
                            z3 = true;
                            break;
                        }
                    }
                    z3 = false;
                }
                String str2 = "a";
                long j2 = 0;
                bngx bngx = a7;
                if (!list.isEmpty()) {
                    Iterator it4 = list3.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            byzs byzs = (byzs) it4.next();
                            set2 = nrVar;
                            arrayList = arrayList3;
                            if (byzs.f169164c != 0 || (a = bzbs.m125625a(byzs.f169169h)) == 0 || a != 2) {
                                break;
                            }
                            arrayList3 = arrayList;
                            nrVar = set2;
                        } else {
                            set2 = nrVar;
                            arrayList = arrayList3;
                            if (list2.isEmpty() && list4.isEmpty() && (!a3.isEmpty() ? z2 : !(!z2 && !z3))) {
                                bnsl bnsl = (bnsl) ahfq.f67120a.mo68390d();
                                bnsl.mo68432a("ajeq", str2, 235, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                if (!cfop.m141876f()) {
                                    set3 = set2;
                                } else {
                                    set3 = set;
                                }
                                bnsl.mo68424a("%s Skipping some call, returning cached messages for beacon IDs and URLs: %s", "ReportRpcManager: ", set3);
                                ajbn ajbn = (ajbn) ahgz.m55754a(ajeq.f70459a, ajbn.class);
                                if (!cfop.m141876f()) {
                                    set = set2;
                                }
                                if (a9.mo38365c()) {
                                    C1225nr nrVar3 = new C1225nr();
                                    for (ajae ajae2 : set) {
                                        Set b = a9.mo38363b(ajae2);
                                        if (b != null) {
                                            nrVar3.addAll(b);
                                        }
                                    }
                                    byzrArr = (byzr[]) nrVar3.toArray(new byzr[0]);
                                } else {
                                    byzrArr = new byzr[0];
                                }
                                ajbn.mo38450a(clientAppIdentifier2, byzrArr, (String) null);
                                ajeh.mo38546a();
                                if ((cfop.m141876f() && set2.isEmpty()) || !cfop.m141876f()) {
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    set2 = nrVar;
                    arrayList = arrayList3;
                }
                ajeb ajeb = ajeq.f70462d;
                if (!clientAppIdentifier2.mo44295c("0p:discoverer")) {
                    ajeb.f70411b.mo72984b();
                    ajeb.f70411b.mo72984b();
                    Iterator it5 = ajeb.mo38538a().iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            byzn[] b2 = ajeb.mo38541b(((bzbu) it5.next()).f169275k);
                            if (b2 != null && (length = b2.length) > 0) {
                                j2 = b2[length - 1].f169136d;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (j2 <= SystemClock.elapsedRealtime()) {
                        Set<bzbu> a10 = ajeb.mo38538a();
                        if (!a10.isEmpty()) {
                            bxvf bxvf = (bxvf) bzcb.f169293b.mo74144da();
                            for (bzbu bzbu : a10) {
                                bxvd da3 = byzo.f169137c.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                byzo byzo = (byzo) da3.f164949b;
                                byzo.f169140b = bzbu.f169275k;
                                byzo.f169139a |= 1;
                                bxvf.mo74132b(da3);
                            }
                            bzcb = (bzcb) bxvf.mo74062i();
                            it = list3.iterator();
                            int i5 = 0;
                            while (it.hasNext()) {
                                byzs byzs2 = (byzs) it.next();
                                if (byzs2.f169164c == Long.MAX_VALUE) {
                                    bxvd bxvd = (bxvd) byzs2.mo74142c(5);
                                    bxvd.mo73625a((GeneratedMessageLite) byzs2);
                                    bxvf bxvf2 = (bxvf) bxvd;
                                    int i6 = i5 + 1;
                                    long e = ajeq.f70466h.mo38419e();
                                    Iterator it6 = it;
                                    if (bxvf2.f164950c) {
                                        bxvf2.mo74035c();
                                        bxvf2.f164950c = false;
                                    }
                                    byzs byzs3 = (byzs) bxvf2.f164949b;
                                    byzs byzs4 = byzs.f169160i;
                                    byzs3.f169162a |= 2;
                                    byzs3.f169164c = e;
                                    list3.set(i5, (byzs) bxvf2.mo74062i());
                                    i5 = i6;
                                    it = it6;
                                    str2 = str2;
                                }
                            }
                            String str3 = str2;
                            ajep ajep = new ajep();
                            if (cfop.m141876f() && clientAppIdentifier2.mo44295c("0p:discoverer")) {
                                ajep = ajep.m58611a(list3);
                            }
                            bzcb bzcb2 = bzcb;
                            String str4 = "ajeq";
                            List list6 = a3;
                            String str5 = str3;
                            Object obj = "ReportRpcManager: ";
                            String str6 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                            ajeo ajeo2 = r10;
                            ArrayList arrayList4 = arrayList;
                            ajeo ajeo3 = new ajeo(this, clientAppIdentifier, ajep, list3, list4, list, list2, set2, ajeh);
                            if (!list.isEmpty() && list2.isEmpty() && list3.isEmpty() && list4.isEmpty()) {
                                ajeo = ajeo2;
                            } else if (!clientAppIdentifier.mo44293b()) {
                                try {
                                    ajeq.f70459a.getPackageManager().getPackageInfo(clientAppIdentifier2.f80668c.f80723b, 0);
                                    ajeo = ajeo2;
                                } catch (PackageManager.NameNotFoundException e2) {
                                    bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68387b();
                                    bnsl2.mo68432a(str4, str5, 313, str6);
                                    bnsl2.mo68424a("%s Failed to find package for %s", obj, clientAppIdentifier2);
                                    ajeo2.mo38178a(null, 13);
                                    return;
                                }
                            } else {
                                ajeo = ajeo2;
                            }
                            ajeq.f70461c.mo72987c(new ajen(this, "ReportRpcManager.report", list6, bngx, arrayList4, clientAppIdentifier, a2, list3, list4, list, list2, bzcb2, ajeo));
                            return;
                        }
                    }
                }
                bzcb = null;
                it = list3.iterator();
                int i52 = 0;
                while (it.hasNext()) {
                }
                String str32 = str2;
                ajep ajep2 = new ajep();
                ajep2 = ajep.m58611a(list3);
                bzcb bzcb22 = bzcb;
                String str42 = "ajeq";
                List list62 = a3;
                String str52 = str32;
                Object obj2 = "ReportRpcManager: ";
                String str62 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                ajeo ajeo22 = ajeo3;
                ArrayList arrayList42 = arrayList;
                ajeo ajeo32 = new ajeo(this, clientAppIdentifier, ajep2, list3, list4, list, list2, set2, ajeh);
                if (!list.isEmpty()) {
                }
                if (!clientAppIdentifier.mo44293b()) {
                }
                ajeq.f70461c.mo72987c(new ajen(this, "ReportRpcManager.report", list62, bngx, arrayList42, clientAppIdentifier, a2, list3, list4, list, list2, bzcb22, ajeo));
                return;
            }
            z2 = false;
            if (cfop.m141876f()) {
            }
            String str22 = "a";
            long j22 = 0;
            bngx bngx2 = a7;
            if (!list.isEmpty()) {
            }
            ajeb ajeb2 = ajeq.f70462d;
            if (!clientAppIdentifier2.mo44295c("0p:discoverer")) {
            }
            bzcb = null;
            it = list3.iterator();
            int i522 = 0;
            while (it.hasNext()) {
            }
            String str322 = str22;
            ajep ajep22 = new ajep();
            ajep22 = ajep.m58611a(list3);
            bzcb bzcb222 = bzcb;
            String str422 = "ajeq";
            List list622 = a3;
            String str522 = str322;
            Object obj22 = "ReportRpcManager: ";
            String str622 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            ajeo ajeo222 = ajeo32;
            ArrayList arrayList422 = arrayList;
            ajeo ajeo322 = new ajeo(this, clientAppIdentifier, ajep22, list3, list4, list, list2, set2, ajeh);
            if (!list.isEmpty()) {
            }
            if (!clientAppIdentifier.mo44293b()) {
            }
            ajeq.f70461c.mo72987c(new ajen(this, "ReportRpcManager.report", list622, bngx2, arrayList422, clientAppIdentifier, a2, list3, list4, list, list2, bzcb222, ajeo));
            return;
        }
        ajeh.mo38546a();
    }
}
