package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.MessageFilter;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.MessageType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: ajej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajej {

    /* renamed from: a */
    public int f70427a = 0;

    /* renamed from: b */
    public boolean f70428b;

    /* renamed from: c */
    private final ajeq f70429c;

    /* renamed from: d */
    private final aiyr f70430d;

    /* renamed from: e */
    private final aiyh f70431e;

    /* renamed from: f */
    private final buqh f70432f;

    /* renamed from: g */
    private final ajat f70433g;

    /* renamed from: h */
    private final buqn f70434h = new ajei(this, "SendReportRpc");

    /* renamed from: i */
    private final ajeh f70435i = new ajeh(this);

    public ajej(Context context) {
        this.f70432f = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70429c = (ajeq) ahgz.m55754a(context, ajeq.class);
        this.f70430d = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f70431e = (aiyh) ahgz.m55754a(context, aiyh.class);
        this.f70433g = (ajat) ahgz.m55754a(context, ajat.class);
    }

    /* renamed from: a */
    public final void mo38548a() {
        this.f70432f.mo72984b();
        srn srn = ahfq.f67120a;
        if (this.f70427a > 0) {
            this.f70428b = true;
        } else if (!this.f70432f.mo72985b(this.f70434h)) {
            buqh buqh = this.f70432f;
            buqn buqn = this.f70434h;
            byyl byyl = this.f70433g.f70278f.f168921d;
            if (byyl == null) {
                byyl = byyl.f168949v;
            }
            buqh.mo72983a(buqn, (long) byyl.f168970u);
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018e, code lost:
        if (r7 != 107) goto L_0x0190;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0318 A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x034e A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0360 A[SYNTHETIC, Splitter:B:139:0x0360] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0463 A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x0502 A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x057c A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x057d A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x05b1 A[Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x05ca A[SYNTHETIC, Splitter:B:252:0x05ca] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0622 A[ADDED_TO_REGION, Catch:{ NameNotFoundException -> 0x05d9, all -> 0x0a31 }] */
    /* renamed from: b */
    public final void mo38549b() {
        boolean z;
        int i;
        Iterator it;
        String str;
        String str2;
        ajej ajej;
        ClientAppIdentifier clientAppIdentifier;
        ArrayList arrayList;
        String str3;
        String str4;
        byzk byzk;
        Collection<aiyo> collection;
        String str5;
        boolean c;
        String str6;
        boolean z2;
        String str7;
        Iterator it2;
        Set set;
        boolean z3;
        Set<ajae> set2;
        boolean z4;
        Set set3;
        String str8;
        bzcb bzcb;
        Iterator it3;
        ajep ajep;
        ajeo ajeo;
        String str9;
        String str10;
        String str11;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str12;
        long j;
        int length;
        Set set4;
        byzr[] byzrArr;
        String str13;
        boolean z5;
        String str14;
        String str15;
        String str16;
        boolean z6;
        ArrayList arrayList4;
        String str17;
        ArrayList arrayList5;
        byzs byzs;
        String str18;
        byzh byzh;
        String str19;
        Iterator it4;
        boolean z7;
        String str20;
        int i2;
        ajej ajej2;
        ajej ajej3 = this;
        String str21 = "*";
        String str22 = "0p:discoverer";
        ajej3.f70432f.mo72984b();
        srn srn = ahfq.f67120a;
        HashSet hashSet = new HashSet(ajej3.f70430d.mo38301c());
        hashSet.addAll(ajej3.f70431e.mo38261a());
        try {
            Iterator it5 = hashSet.iterator();
            int i3 = 1;
            boolean z8 = false;
            while (it.hasNext()) {
                try {
                    clientAppIdentifier = (ClientAppIdentifier) it.next();
                    aiyh aiyh = ajej.f70431e;
                    HashSet hashSet2 = new HashSet();
                    for (aiye aiye : aiyh.f70061c) {
                        String str23 = str2;
                        String str24 = str;
                        Iterator it6 = it;
                        boolean z9 = z;
                        ajdm ajdm = aiye.f70058f;
                        if ((clientAppIdentifier != null && !clientAppIdentifier.equals(aiye.f70057e)) || ajdm == null) {
                            ajej = this;
                            str2 = str23;
                            it = it6;
                            z = z9;
                            str = str24;
                            i = 1;
                        } else if (ajdm.m58555a(ajdm.f70395f)) {
                            hashSet2.add(aiye);
                            ajej = this;
                            str2 = str23;
                            it = it6;
                            z = z9;
                            str = str24;
                            i = 1;
                        } else {
                            ajej = this;
                            str2 = str23;
                            it = it6;
                            z = z9;
                            str = str24;
                            i = 1;
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it7 = hashSet2.iterator();
                    while (true) {
                        str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        str4 = "a";
                        if (!it7.hasNext()) {
                            break;
                        }
                        String str25 = str2;
                        String str26 = str;
                        Iterator it8 = it;
                        boolean z10 = z;
                        String str27 = str4;
                        String str28 = str3;
                        ArrayList arrayList7 = arrayList;
                        aiye aiye2 = (aiye) it7.next();
                        if (aiye2 != null) {
                            Strategy strategy = aiye2.f70055c;
                            bxvf bxvf = (bxvf) byzk.f169111f.mo74144da();
                            String str29 = aiye2.f70053a;
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            byzk byzk2 = (byzk) bxvf.f164949b;
                            str29.getClass();
                            byzk2.f169113a |= 1;
                            byzk2.f169114b = str29;
                            byze a = ajek.m58598a(aiye2.f70054b);
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            byzk byzk3 = (byzk) bxvf.f164949b;
                            a.getClass();
                            byzk3.f169116d = a;
                            byzk3.f169113a |= 4;
                            bxvf bxvf2 = (bxvf) byyp.f168984e.mo74144da();
                            bxvf bxvf3 = (bxvf) byyq.f168991c.mo74144da();
                            if (bxvf3.f164950c) {
                                bxvf3.mo74035c();
                                bxvf3.f164950c = false;
                            }
                            byyq byyq = (byyq) bxvf3.f164949b;
                            byyq.f168994b = 1;
                            byyq.f168993a |= 1;
                            if (bxvf2.f164950c) {
                                bxvf2.mo74035c();
                                bxvf2.f164950c = false;
                            }
                            byyp byyp = (byyp) bxvf2.f164949b;
                            byyq byyq2 = (byyq) bxvf3.mo74062i();
                            byyq2.getClass();
                            byyp.f168988c = byyq2;
                            byyp.f168986a |= 2;
                            int i4 = aiye2.f70055c.f80692e;
                            if (i4 == Integer.MAX_VALUE || i4 > 86400) {
                                bnsl bnsl = (bnsl) ahfq.f67120a.mo68387b();
                                bnsl.mo68432a("ajek", str27, 57, str28);
                                bnsl.mo68411a("ProtoConverter: Publish with unexpectedly long TTL(%d seconds). Using default TTL(%d seconds).", i4, 300);
                                i4 = 300;
                            }
                            long b = ajdq.m58561b(i4);
                            if (bxvf2.f164950c) {
                                bxvf2.mo74035c();
                                bxvf2.f164950c = false;
                            }
                            byyp byyp2 = (byyp) bxvf2.f164949b;
                            byyp2.f168986a |= 1;
                            byyp2.f168987b = b;
                            byyy a2 = ajek.m58597a(aiye2.f70055c.f80693f);
                            if (a2 != null) {
                                if (bxvf2.f164950c) {
                                    bxvf2.mo74035c();
                                    bxvf2.f164950c = false;
                                }
                                byyp byyp3 = (byyp) bxvf2.f164949b;
                                a2.getClass();
                                byyp3.f168989d = a2;
                                byyp3.f168986a |= 8;
                            }
                            byyp byyp4 = (byyp) bxvf2.mo74062i();
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            byzk byzk4 = (byzk) bxvf.f164949b;
                            byyp4.getClass();
                            byzk4.f169115c = byyp4;
                            byzk4.f169113a |= 2;
                            byzw a3 = ajek.m58600a(strategy);
                            if (bxvf.f164950c) {
                                bxvf.mo74035c();
                                bxvf.f164950c = false;
                            }
                            byzk byzk5 = (byzk) bxvf.f164949b;
                            a3.getClass();
                            byzk5.f169117e = a3;
                            byzk5.f169113a |= 8;
                            byzk = (byzk) bxvf.mo74062i();
                        } else {
                            byzk = null;
                        }
                        arrayList7.add(byzk);
                        arrayList6 = arrayList7;
                        str2 = str25;
                        it = it8;
                        z = z10;
                        str = str26;
                        i = 1;
                        ajej = this;
                    }
                    aiyh aiyh2 = ajej.f70431e;
                    HashSet hashSet3 = new HashSet();
                    for (ajdm ajdm2 : aiyh2.f70060b.values()) {
                        if (ajdm2.f70392c.f70398b.equals(clientAppIdentifier)) {
                            hashSet3.add(ajdm2.f70392c.f70397a);
                        }
                    }
                    ArrayList arrayList8 = new ArrayList(hashSet3);
                    aiyr aiyr = ajej.f70430d;
                    if (clientAppIdentifier == null) {
                        collection = aiyr.f70095f.values();
                    } else {
                        collection = ((bndq) aiyr.f70093d).mo67127c(clientAppIdentifier);
                    }
                    HashSet hashSet4 = new HashSet();
                    for (aiyo aiyo : collection) {
                        String str30 = str2;
                        String str31 = str;
                        Iterator it9 = it;
                        boolean z11 = z;
                        ArrayList arrayList9 = arrayList8;
                        String str32 = str4;
                        String str33 = str3;
                        ArrayList arrayList10 = arrayList;
                        ajdm ajdm3 = aiyo.f70088f;
                        if (ajdm3 == null) {
                            str3 = str33;
                            str4 = str32;
                            str19 = str30;
                            it4 = it9;
                            z7 = z11;
                            arrayList8 = arrayList9;
                            str20 = str31;
                            arrayList = arrayList10;
                            i2 = 1;
                            ajej2 = this;
                        } else if (ajdm.m58555a(ajdm3.f70395f)) {
                            hashSet4.add(aiyo);
                            str3 = str33;
                            str4 = str32;
                            str19 = str30;
                            it4 = it9;
                            z7 = z11;
                            arrayList8 = arrayList9;
                            str20 = str31;
                            arrayList = arrayList10;
                            i2 = 1;
                            ajej2 = this;
                        } else {
                            str3 = str33;
                            str4 = str32;
                            str19 = str30;
                            it4 = it9;
                            z7 = z11;
                            arrayList8 = arrayList9;
                            str20 = str31;
                            arrayList = arrayList10;
                            i2 = 1;
                            ajej2 = this;
                        }
                    }
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it10 = hashSet4.iterator();
                    while (true) {
                        str5 = str4;
                        if (!it10.hasNext()) {
                            break;
                        }
                        String str34 = str2;
                        String str35 = str;
                        Iterator it11 = it;
                        boolean z12 = z;
                        ArrayList arrayList12 = arrayList8;
                        String str36 = str3;
                        ArrayList arrayList13 = arrayList;
                        String str37 = str5;
                        aiyo aiyo2 = (aiyo) it10.next();
                        if (aiyo2 != null) {
                            bxvf bxvf4 = (bxvf) byzs.f169160i.mo74144da();
                            String str38 = !cfop.m141879i() ? aiyo2.f70083a : "0";
                            if (bxvf4.f164950c) {
                                bxvf4.mo74035c();
                                bxvf4.f164950c = false;
                            }
                            byzs byzs2 = (byzs) bxvf4.f164949b;
                            str38.getClass();
                            byzs2.f169162a |= 1;
                            byzs2.f169163b = str38;
                            MessageFilter messageFilter = aiyo2.f70085c;
                            C1225nr nrVar = new C1225nr();
                            if (messageFilter.f80685e) {
                                str18 = str34;
                                nrVar.add(ajek.m58599a(str18, str18));
                            } else {
                                str18 = str34;
                            }
                            for (MessageType messageType : messageFilter.f80683c) {
                                if (messageType != null) {
                                    byzh = ajek.m58599a(messageType.f80739b, messageType.f80740c);
                                } else {
                                    byzh = null;
                                }
                                nrVar.add(byzh);
                            }
                            byzf byzf = byzf.f169070b;
                            bxvd bxvd = (bxvd) byzf.mo74142c(5);
                            bxvd.mo73625a((GeneratedMessageLite) byzf);
                            bxvf bxvf5 = (bxvf) bxvd;
                            if (bxvf5.f164950c) {
                                bxvf5.mo74035c();
                                bxvf5.f164950c = false;
                            }
                            byzf byzf2 = (byzf) bxvf5.f164949b;
                            byzf2.mo74513e();
                            bxsy.m123078a(nrVar, byzf2.f169072a);
                            byzf byzf3 = (byzf) bxvf5.mo74062i();
                            if (bxvf4.f164950c) {
                                bxvf4.mo74035c();
                                bxvf4.f164950c = false;
                            }
                            byzs byzs3 = (byzs) bxvf4.f164949b;
                            byzf3.getClass();
                            byzs3.f169168g = byzf3;
                            int i5 = byzs3.f169162a | 512;
                            byzs3.f169162a = i5;
                            Strategy strategy2 = aiyo2.f70086d;
                            byzs3.f169162a = i5 | 2;
                            byzs3.f169164c = 0;
                            byzw a4 = ajek.m58600a(strategy2);
                            if (bxvf4.f164950c) {
                                bxvf4.mo74035c();
                                bxvf4.f164950c = false;
                            }
                            byzs byzs4 = (byzs) bxvf4.f164949b;
                            a4.getClass();
                            byzs4.f169166e = a4;
                            byzs4.f169162a |= 16;
                            int i6 = !aiyo2.mo38280a() ? 3 : 2;
                            if (bxvf4.f164950c) {
                                bxvf4.mo74035c();
                                bxvf4.f164950c = false;
                            }
                            byzs byzs5 = (byzs) bxvf4.f164949b;
                            byzs5.f169169h = i6 - 1;
                            byzs5.f169162a |= 2048;
                            byyy a5 = ajek.m58597a(strategy2.f80693f);
                            if (a5 != null) {
                                if (bxvf4.f164950c) {
                                    bxvf4.mo74035c();
                                    bxvf4.f164950c = false;
                                }
                                byzs byzs6 = (byzs) bxvf4.f164949b;
                                a5.getClass();
                                byzs6.f169167f = a5;
                                byzs6.f169162a |= 128;
                            }
                            byzs = (byzs) bxvf4.mo74062i();
                        } else {
                            str18 = str34;
                            byzs = null;
                        }
                        arrayList11.add(byzs);
                        str3 = str36;
                        str4 = str37;
                        str2 = str18;
                        it = it11;
                        z = z12;
                        arrayList8 = arrayList12;
                        str = str35;
                        arrayList = arrayList13;
                        i = 1;
                        ajej = this;
                    }
                    ArrayList arrayList14 = new ArrayList(new HashSet(((bndq) ajej.f70430d.f70092c).mo67127c(clientAppIdentifier)));
                    arrayList.size();
                    arrayList8.size();
                    arrayList11.size();
                    arrayList14.size();
                    c = clientAppIdentifier.mo44295c(str);
                    ajej.f70432f.mo72984b();
                    ajej.f70427a += i;
                    ajej.f70428b = false;
                    ajeq ajeq = ajej.f70429c;
                    ajeh ajeh = ajej.f70435i;
                    String str39 = "ajeq";
                    String a6 = ajeq.f70464f.mo38180a();
                    if (TextUtils.isEmpty(a6)) {
                        if (arrayList.isEmpty() && arrayList11.isEmpty()) {
                            ajeh.mo38546a();
                            str7 = str2;
                            str6 = str;
                            it2 = it;
                            z2 = z;
                            if (c && !z2) {
                                ajej3 = this;
                                it5 = it2;
                                str21 = str7;
                                str22 = str6;
                                i3 = 1;
                                z8 = false;
                            } else {
                                ajej3 = this;
                                it5 = it2;
                                str21 = str7;
                                str22 = str6;
                                i3 = 1;
                                z8 = true;
                            }
                        }
                    }
                    List a7 = ajeq.mo38557a();
                    it2 = it;
                    ajai ajai = (ajai) ahgz.m55754a(ajeq.f70459a, ajai.class);
                    ajai.f70251l.mo72984b();
                    str7 = str2;
                    ArrayList arrayList15 = new ArrayList(ajai.f70247h.size());
                    for (byys byys : ajai.f70247h.keySet()) {
                        String str40 = str;
                        String str41 = a6;
                        boolean z13 = z;
                        String str42 = str39;
                        ArrayList arrayList16 = arrayList8;
                        ArrayList arrayList17 = arrayList14;
                        ajeh ajeh2 = ajeh;
                        ArrayList arrayList18 = arrayList;
                        String str43 = str5;
                        ajai ajai2 = ajai;
                        ArrayList arrayList19 = arrayList15;
                        ajeq ajeq2 = ajeq;
                        String str44 = str3;
                        bxvd da = byyt.f169008d.mo74144da();
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        byyt byyt = (byyt) da.f164949b;
                        byys.getClass();
                        byyt.f169011b = byys;
                        byyt.f169010a |= 1;
                        ajag a8 = ajai2.mo38384a(byys);
                        if (a8 != null) {
                            if (!sdg.m34949a(a8.f70238h, byys)) {
                                byte[] bArr = a8.f70239i;
                                if (bArr != null) {
                                    ByteString a9 = ByteString.m123261a(bArr);
                                    if (da.f164950c) {
                                        da.mo74035c();
                                        da.f164950c = false;
                                    }
                                    byyt byyt2 = (byyt) da.f164949b;
                                    a9.getClass();
                                    byyt2.f169010a |= 2;
                                    byyt2.f169012c = a9;
                                }
                            } else {
                                str16 = str44;
                                ajai = ajai2;
                                ajeq = ajeq2;
                                str5 = str43;
                                arrayList15 = arrayList19;
                                z6 = z13;
                                arrayList4 = arrayList16;
                                arrayList14 = arrayList17;
                                ajeh = ajeh2;
                                str17 = str40;
                                arrayList5 = arrayList18;
                                str39 = str42;
                                a6 = str41;
                            }
                        }
                        arrayList19.add((byyt) da.mo74062i());
                        str16 = str44;
                        ajai = ajai2;
                        ajeq = ajeq2;
                        str5 = str43;
                        arrayList15 = arrayList19;
                        z6 = z13;
                        arrayList4 = arrayList16;
                        arrayList14 = arrayList17;
                        ajeh = ajeh2;
                        str17 = str40;
                        arrayList5 = arrayList18;
                        str39 = str42;
                        a6 = str41;
                    }
                    bngs bngs = new bngs();
                    Iterator it12 = arrayList15.iterator();
                    while (it12.hasNext()) {
                        Iterator it13 = it12;
                        byyt byyt3 = (byyt) it12.next();
                        if (cfop.f185115a.mo6606a().mo82210N()) {
                            boolean z14 = z;
                            byys byys2 = byyt3.f169011b;
                            if (byys2 == null) {
                                byys2 = byys.f169002d;
                            }
                            int a10 = bzaj.m125580a(byys2.f169005b);
                            if (a10 == 0) {
                                str15 = a6;
                            } else {
                                str15 = a6;
                            }
                            if (!clientAppIdentifier.mo44295c(str)) {
                                bngs.mo67668c(byyt3);
                                z5 = z14;
                                it12 = it13;
                                str14 = str15;
                            } else {
                                z5 = z14;
                                it12 = it13;
                                str14 = str15;
                            }
                        } else {
                            bngs.mo67668c(byyt3);
                            z5 = z;
                            it12 = it13;
                            str14 = a6;
                        }
                    }
                    String str45 = a6;
                    z2 = z;
                    bngx<byyt> a11 = bngs.mo67664a();
                    arrayList15.size();
                    a11.size();
                    a11.size();
                    ajai ajai3 = (ajai) ahgz.m55754a(ajeq.f70459a, ajai.class);
                    ajai3.f70251l.mo72984b();
                    HashSet hashSet5 = new HashSet();
                    Iterator it14 = ajai3.mo38385a().iterator();
                    while (it14.hasNext()) {
                        ajag ajag = (ajag) it14.next();
                        Iterator it15 = ajag.mo38372c().iterator();
                        while (it15.hasNext()) {
                            Iterator it16 = it14;
                            String str46 = (String) it15.next();
                            Iterator it17 = it15;
                            bxvd da2 = bzab.f169208d.mo74144da();
                            String str47 = str;
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            bzab bzab = (bzab) da2.f164949b;
                            str46.getClass();
                            ajeh ajeh3 = ajeh;
                            bzab.f169210a |= 1;
                            bzab.f169211b = str46;
                            byte[] bArr2 = ajag.f70239i;
                            if (bArr2 != null) {
                                ByteString a12 = ByteString.m123261a(bArr2);
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bzab bzab2 = (bzab) da2.f164949b;
                                a12.getClass();
                                bzab2.f169210a |= 2;
                                bzab2.f169212c = a12;
                            }
                            hashSet5.add((bzab) da2.mo74062i());
                            str = str47;
                            it14 = it16;
                            it15 = it17;
                            ajeh = ajeh3;
                        }
                    }
                    String str48 = str;
                    ajeh ajeh4 = ajeh;
                    ArrayList<bzab> arrayList20 = new ArrayList(hashSet5);
                    Set<ajae> nrVar2 = new C1225nr();
                    for (byyt byyt4 : a11) {
                        byys byys3 = byyt4.f169011b;
                        if (byys3 == null) {
                            byys3 = byys.f169002d;
                        }
                        nrVar2.add(new ajae(byys3));
                    }
                    C1225nr nrVar3 = new C1225nr();
                    for (bzab bzab3 : arrayList20) {
                        nrVar3.add(new ajae(bzab3.f169211b));
                    }
                    nrVar2.addAll(nrVar3);
                    ajaf a13 = ajeq.mo38556a(clientAppIdentifier);
                    if (cfop.m141876f()) {
                        if (a13.mo38365c()) {
                            bnia j2 = bnic.m109500j();
                            for (ajae ajae : nrVar2) {
                                if (a13.mo38363b(ajae) != null) {
                                    j2.mo67629b(ajae);
                                }
                            }
                            set = j2.mo67751a();
                        } else {
                            set = bnon.f131923a;
                        }
                        nrVar2.removeAll(set);
                    } else {
                        set = bnon.f131923a;
                    }
                    if (cfop.m141876f()) {
                        if (!set.isEmpty()) {
                            z3 = true;
                        } else if (nrVar2.isEmpty()) {
                            z3 = true;
                        }
                        if (cfop.m141876f()) {
                            if (a13.mo38365c()) {
                                for (ajae ajae2 : nrVar2) {
                                    set2 = set;
                                    if (a13.mo38363b(ajae2) != null) {
                                        set = set2;
                                    }
                                }
                                set2 = set;
                                z4 = true;
                            } else if (!nrVar2.isEmpty()) {
                                set2 = set;
                                z4 = false;
                            } else {
                                set2 = set;
                                z4 = true;
                            }
                            ArrayList arrayList21 = arrayList20;
                            if (!arrayList.isEmpty()) {
                                set3 = nrVar2;
                            } else {
                                Iterator it18 = arrayList11.iterator();
                                while (true) {
                                    if (it18.hasNext()) {
                                        Iterator it19 = it18;
                                        byzs byzs7 = (byzs) it18.next();
                                        set3 = nrVar2;
                                        ajaf ajaf = a13;
                                        if (byzs7.f169164c != 0) {
                                            break;
                                        }
                                        int a14 = bzbs.m125625a(byzs7.f169169h);
                                        if (a14 == 0) {
                                            break;
                                        } else if (a14 != 2) {
                                            break;
                                        } else {
                                            nrVar2 = set3;
                                            it18 = it19;
                                            a13 = ajaf;
                                        }
                                    } else {
                                        set3 = nrVar2;
                                        ajaf ajaf2 = a13;
                                        if (arrayList8.isEmpty()) {
                                            if (arrayList14.isEmpty()) {
                                                if (a7.isEmpty()) {
                                                    if (!z3) {
                                                        if (z4) {
                                                        }
                                                    }
                                                } else if (!z3) {
                                                }
                                                bnsl bnsl2 = (bnsl) ahfq.f67120a.mo68390d();
                                                String str49 = str5;
                                                bnsl2.mo68432a(str39, str49, 235, str3);
                                                if (!cfop.m141876f()) {
                                                    set4 = set3;
                                                } else {
                                                    set4 = set2;
                                                }
                                                bnsl2.mo68424a("%s Skipping some call, returning cached messages for beacon IDs and URLs: %s", "ReportRpcManager: ", set4);
                                                ajbn ajbn = (ajbn) ahgz.m55754a(ajeq.f70459a, ajbn.class);
                                                if (!cfop.m141876f()) {
                                                    set2 = set3;
                                                }
                                                if (ajaf2.mo38365c()) {
                                                    C1225nr nrVar4 = new C1225nr();
                                                    for (ajae ajae3 : set2) {
                                                        String str50 = str49;
                                                        ajaf ajaf3 = ajaf2;
                                                        Set b2 = ajaf3.mo38363b(ajae3);
                                                        if (b2 != null) {
                                                            nrVar4.addAll(b2);
                                                            ajaf2 = ajaf3;
                                                            str49 = str50;
                                                        } else {
                                                            ajaf2 = ajaf3;
                                                            str49 = str50;
                                                        }
                                                    }
                                                    str13 = str49;
                                                    byzrArr = (byzr[]) nrVar4.toArray(new byzr[0]);
                                                } else {
                                                    str13 = str49;
                                                    byzrArr = new byzr[0];
                                                }
                                                ajbn.mo38450a(clientAppIdentifier, byzrArr, (String) null);
                                                ajeh4.mo38546a();
                                                if (cfop.m141876f()) {
                                                    if (set3.isEmpty()) {
                                                        str6 = str48;
                                                    }
                                                }
                                                if (!cfop.m141876f()) {
                                                    str6 = str48;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            ajeb ajeb = ajeq.f70462d;
                            str8 = str48;
                            if (!clientAppIdentifier.mo44295c(str8)) {
                                ajeb.f70411b.mo72984b();
                                ajeb.f70411b.mo72984b();
                                Iterator it20 = ajeb.mo38538a().iterator();
                                while (true) {
                                    if (!it20.hasNext()) {
                                        j = 0;
                                        break;
                                    }
                                    byzn[] b3 = ajeb.mo38541b(((bzbu) it20.next()).f169275k);
                                    if (b3 != null && (length = b3.length) > 0) {
                                        j = b3[length - 1].f169136d;
                                        break;
                                    }
                                }
                                if (j <= SystemClock.elapsedRealtime()) {
                                    Set a15 = ajeb.mo38538a();
                                    if (!a15.isEmpty()) {
                                        bxvf bxvf6 = (bxvf) bzcb.f169293b.mo74144da();
                                        Iterator it21 = a15.iterator();
                                        while (it21.hasNext()) {
                                            bzbu bzbu = (bzbu) it21.next();
                                            bxvd da3 = byzo.f169137c.mo74144da();
                                            Iterator it22 = it21;
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            byzo byzo = (byzo) da3.f164949b;
                                            byzo.f169140b = bzbu.f169275k;
                                            byzo.f169139a |= 1;
                                            bxvf6.mo74132b(da3);
                                            it21 = it22;
                                        }
                                        bzcb = (bzcb) bxvf6.mo74062i();
                                        it3 = arrayList11.iterator();
                                        int i7 = 0;
                                        while (it3.hasNext()) {
                                            byzs byzs8 = (byzs) it3.next();
                                            String str51 = str39;
                                            ArrayList arrayList22 = arrayList8;
                                            if (byzs8.f169164c == Long.MAX_VALUE) {
                                                int i8 = i7 + 1;
                                                bxvd bxvd2 = (bxvd) byzs8.mo74142c(5);
                                                bxvd2.mo73625a((GeneratedMessageLite) byzs8);
                                                bxvf bxvf7 = (bxvf) bxvd2;
                                                ArrayList arrayList23 = arrayList14;
                                                ArrayList arrayList24 = arrayList22;
                                                long e = ajeq.f70466h.mo38419e();
                                                if (bxvf7.f164950c) {
                                                    bxvf7.mo74035c();
                                                    bxvf7.f164950c = false;
                                                }
                                                byzs byzs9 = (byzs) bxvf7.f164949b;
                                                byzs byzs10 = byzs.f169160i;
                                                byzs9.f169162a |= 2;
                                                byzs9.f169164c = e;
                                                arrayList11.set(i7, (byzs) bxvf7.mo74062i());
                                                i7 = i8;
                                                arrayList3 = arrayList24;
                                                str12 = str51;
                                                arrayList14 = arrayList23;
                                                it3 = it3;
                                            } else {
                                                arrayList3 = arrayList22;
                                                str12 = str51;
                                            }
                                        }
                                        String str52 = str39;
                                        ArrayList arrayList25 = arrayList8;
                                        ArrayList arrayList26 = arrayList14;
                                        ajep ajep2 = new ajep();
                                        if (!cfop.m141876f()) {
                                            if (clientAppIdentifier.mo44295c(str8)) {
                                                ajep = ajep.m58611a(arrayList11);
                                                str9 = str52;
                                                ArrayList arrayList27 = arrayList25;
                                                str6 = str8;
                                                ajeq ajeq3 = ajeq;
                                                str10 = str5;
                                                bngx bngx = a11;
                                                str11 = str3;
                                                arrayList2 = arrayList;
                                                ajeo = new ajeo(ajeq, clientAppIdentifier, ajep, arrayList11, arrayList26, arrayList, arrayList27, set3, ajeh4);
                                                if (arrayList2.isEmpty() || !arrayList27.isEmpty() || !arrayList11.isEmpty() || !arrayList26.isEmpty()) {
                                                    if (!clientAppIdentifier.mo44293b()) {
                                                        ajeq3.f70459a.getPackageManager().getPackageInfo(clientAppIdentifier.f80668c.f80723b, 0);
                                                    }
                                                }
                                                ajeq3.f70461c.mo72987c(new ajen(ajeq3, "ReportRpcManager.report", a7, bngx, arrayList21, clientAppIdentifier, str45, arrayList11, arrayList26, arrayList2, arrayList27, bzcb, ajeo));
                                                if (c) {
                                                    ajej3 = this;
                                                    it5 = it2;
                                                    str21 = str7;
                                                    str22 = str6;
                                                    i3 = 1;
                                                    z8 = false;
                                                }
                                                ajej3 = this;
                                                it5 = it2;
                                                str21 = str7;
                                                str22 = str6;
                                                i3 = 1;
                                                z8 = true;
                                            }
                                        }
                                        ajep = ajep2;
                                        str9 = str52;
                                        ArrayList arrayList272 = arrayList25;
                                        str6 = str8;
                                        ajeq ajeq32 = ajeq;
                                        str10 = str5;
                                        bngx bngx2 = a11;
                                        str11 = str3;
                                        arrayList2 = arrayList;
                                        ajeo = new ajeo(ajeq, clientAppIdentifier, ajep, arrayList11, arrayList26, arrayList, arrayList272, set3, ajeh4);
                                        if (arrayList2.isEmpty()) {
                                        }
                                        if (!clientAppIdentifier.mo44293b()) {
                                        }
                                        ajeq32.f70461c.mo72987c(new ajen(ajeq32, "ReportRpcManager.report", a7, bngx2, arrayList21, clientAppIdentifier, str45, arrayList11, arrayList26, arrayList2, arrayList272, bzcb, ajeo));
                                        if (c) {
                                        }
                                        ajej3 = this;
                                        it5 = it2;
                                        str21 = str7;
                                        str22 = str6;
                                        i3 = 1;
                                        z8 = true;
                                    }
                                }
                            }
                            bzcb = null;
                            it3 = arrayList11.iterator();
                            int i72 = 0;
                            while (it3.hasNext()) {
                            }
                            String str522 = str39;
                            ArrayList arrayList252 = arrayList8;
                            ArrayList arrayList262 = arrayList14;
                            ajep ajep22 = new ajep();
                            if (!cfop.m141876f()) {
                            }
                            ajep = ajep22;
                            str9 = str522;
                            ArrayList arrayList2722 = arrayList252;
                            str6 = str8;
                            ajeq ajeq322 = ajeq;
                            str10 = str5;
                            bngx bngx22 = a11;
                            str11 = str3;
                            arrayList2 = arrayList;
                            ajeo = new ajeo(ajeq, clientAppIdentifier, ajep, arrayList11, arrayList262, arrayList, arrayList2722, set3, ajeh4);
                            if (arrayList2.isEmpty()) {
                            }
                            if (!clientAppIdentifier.mo44293b()) {
                            }
                            ajeq322.f70461c.mo72987c(new ajen(ajeq322, "ReportRpcManager.report", a7, bngx22, arrayList21, clientAppIdentifier, str45, arrayList11, arrayList262, arrayList2, arrayList2722, bzcb, ajeo));
                            if (c) {
                            }
                            ajej3 = this;
                            it5 = it2;
                            str21 = str7;
                            str22 = str6;
                            i3 = 1;
                            z8 = true;
                        } else {
                            set2 = set;
                        }
                        z4 = false;
                        ArrayList arrayList212 = arrayList20;
                        if (!arrayList.isEmpty()) {
                        }
                        ajeb ajeb2 = ajeq.f70462d;
                        str8 = str48;
                        if (!clientAppIdentifier.mo44295c(str8)) {
                        }
                        bzcb = null;
                        it3 = arrayList11.iterator();
                        int i722 = 0;
                        while (it3.hasNext()) {
                        }
                        String str5222 = str39;
                        ArrayList arrayList2522 = arrayList8;
                        ArrayList arrayList2622 = arrayList14;
                        ajep ajep222 = new ajep();
                        if (!cfop.m141876f()) {
                        }
                        ajep = ajep222;
                        str9 = str5222;
                        ArrayList arrayList27222 = arrayList2522;
                        str6 = str8;
                        ajeq ajeq3222 = ajeq;
                        str10 = str5;
                        bngx bngx222 = a11;
                        str11 = str3;
                        arrayList2 = arrayList;
                        ajeo = new ajeo(ajeq, clientAppIdentifier, ajep, arrayList11, arrayList2622, arrayList, arrayList27222, set3, ajeh4);
                        if (arrayList2.isEmpty()) {
                        }
                        if (!clientAppIdentifier.mo44293b()) {
                        }
                        ajeq3222.f70461c.mo72987c(new ajen(ajeq3222, "ReportRpcManager.report", a7, bngx222, arrayList212, clientAppIdentifier, str45, arrayList11, arrayList2622, arrayList2, arrayList27222, bzcb, ajeo));
                        if (c) {
                        }
                        ajej3 = this;
                        it5 = it2;
                        str21 = str7;
                        str22 = str6;
                        i3 = 1;
                        z8 = true;
                    }
                    z3 = false;
                    if (cfop.m141876f()) {
                    }
                    z4 = false;
                    ArrayList arrayList2122 = arrayList20;
                    if (!arrayList.isEmpty()) {
                    }
                    ajeb ajeb22 = ajeq.f70462d;
                    str8 = str48;
                    if (!clientAppIdentifier.mo44295c(str8)) {
                    }
                    bzcb = null;
                    it3 = arrayList11.iterator();
                    int i7222 = 0;
                    while (it3.hasNext()) {
                    }
                    String str52222 = str39;
                    ArrayList arrayList25222 = arrayList8;
                    ArrayList arrayList26222 = arrayList14;
                    ajep ajep2222 = new ajep();
                    if (!cfop.m141876f()) {
                    }
                    ajep = ajep2222;
                    str9 = str52222;
                    ArrayList arrayList272222 = arrayList25222;
                    str6 = str8;
                    ajeq ajeq32222 = ajeq;
                    str10 = str5;
                    bngx bngx2222 = a11;
                    str11 = str3;
                    arrayList2 = arrayList;
                    ajeo = new ajeo(ajeq, clientAppIdentifier, ajep, arrayList11, arrayList26222, arrayList, arrayList272222, set3, ajeh4);
                    if (arrayList2.isEmpty()) {
                    }
                    if (!clientAppIdentifier.mo44293b()) {
                    }
                    ajeq32222.f70461c.mo72987c(new ajen(ajeq32222, "ReportRpcManager.report", a7, bngx2222, arrayList2122, clientAppIdentifier, str45, arrayList11, arrayList26222, arrayList2, arrayList272222, bzcb, ajeo));
                } catch (PackageManager.NameNotFoundException e2) {
                    bnsl bnsl3 = (bnsl) ahfq.f67120a.mo68387b();
                    bnsl3.mo68432a(str9, str10, 313, str11);
                    bnsl3.mo68424a("%s Failed to find package for %s", "ReportRpcManager: ", clientAppIdentifier);
                    ajeo.mo38178a(null, 13);
                } catch (Throwable th) {
                    throw th;
                }
                if (c) {
                }
                ajej3 = this;
                it5 = it2;
                str21 = str7;
                str22 = str6;
                i3 = 1;
                z8 = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
