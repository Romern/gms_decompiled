package p000;

import android.util.SparseArray;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* renamed from: diu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class diu {

    /* renamed from: n */
    public static final Comparator f13268n = dir.f13265a;

    /* renamed from: o */
    static final Comparator f13269o = dis.f13266a;

    /* renamed from: a */
    public final String f13270a;

    /* renamed from: b */
    public dky f13271b;

    /* renamed from: c */
    public final List f13272c = new ArrayList();

    /* renamed from: d */
    public final Map f13273d = adyi.m51410a();

    /* renamed from: e */
    public dky f13274e;

    /* renamed from: f */
    public BitSet f13275f;

    /* renamed from: g */
    public ArrayList f13276g;

    /* renamed from: h */
    public final List f13277h = new ArrayList();

    /* renamed from: i */
    public final Map f13278i = adyi.m51410a();

    /* renamed from: j */
    public final Map f13279j = adyi.m51410a();

    /* renamed from: k */
    public dky f13280k = dky.m8763a((Comparator) bnnt.f131877a);

    /* renamed from: l */
    public final SparseArray f13281l = new SparseArray();

    /* renamed from: m */
    public boolean f13282m = false;

    /* renamed from: p */
    public bxvd f13283p;

    protected diu(String str) {
        this.f13270a = str;
    }

    /* renamed from: a */
    public static final List m8583a(List list, List list2, SortedMap sortedMap) {
        dmo dmo;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            for (dmr dmr : Collections.unmodifiableSet(((djn) it.next()).f13344g)) {
                bxvd da = dmo.f13572f.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                dmo dmo2 = (dmo) da.f164949b;
                int i = dmo2.f13574a | 2;
                dmo2.f13574a = i;
                dmo2.f13576c = Integer.MAX_VALUE;
                String str = dmr.f13595b;
                str.getClass();
                dmo2.f13574a = i | 1;
                dmo2.f13575b = str;
                int binarySearch = Collections.binarySearch(list2, (dmo) da.mo74062i(), f13269o);
                if (binarySearch < 0) {
                    binarySearch = -(binarySearch + 1);
                }
                Object obj = list2.get(binarySearch);
                while (true) {
                    dmo = (dmo) obj;
                    int i2 = dmr.f13597d;
                    int i3 = dmo.f13576c;
                    if (i2 >= i3 && dmr.f13596c <= i3) {
                        break;
                    }
                    binarySearch++;
                    obj = list2.get(binarySearch);
                }
                bmzs.m108698a(dmr.f13595b.equals(dmo.f13575b));
                bmzs.m108696a((djn) sortedMap.get(dmo));
                arrayList.add(dmo);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final int m8588b(din din) {
        int a = this.f13274e.mo9239a(din);
        boolean z = false;
        if (a >= 0 && a < this.f13274e.size()) {
            z = true;
        }
        bmzs.m108698a(z);
        return a;
    }

    /* renamed from: c */
    private static String m8589c(djn djn) {
        StringBuilder sb = new StringBuilder();
        for (dmr dmr : djn.mo9132b()) {
            if (sb.length() != 0) {
                sb.append(",");
            }
            sb.append(djn.f13338a);
            sb.append("(");
            sb.append(dmr.f13596c);
            sb.append(":");
            sb.append(dmr.f13597d);
            sb.append(")");
        }
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9104a() {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo9105a(String str) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo9106b(String str) {
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dmv.a(java.util.List, java.util.List):java.util.List
     arg types: [java.util.List, bxwc]
     candidates:
      dmv.a(java.lang.String, java.lang.String):java.lang.String
      dmv.a(java.util.List, java.util.Comparator):java.util.List
      dmv.a(java.lang.String, bxvd):void
      dmv.a(java.util.Collection, java.util.List):void
      dmv.a(java.util.List, java.util.List):java.util.List */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dmv.a(java.util.Collection, java.util.List):void
     arg types: [java.util.List, java.util.List]
     candidates:
      dmv.a(java.lang.String, java.lang.String):java.lang.String
      dmv.a(java.util.List, java.util.Comparator):java.util.List
      dmv.a(java.util.List, java.util.List):java.util.List
      dmv.a(java.lang.String, bxvd):void
      dmv.a(java.util.Collection, java.util.List):void */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x03a7 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0447 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0102 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0104 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x018f A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0190 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01b8 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b9 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01ea A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0260 A[Catch:{ dmu -> 0x0858 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0307 A[SYNTHETIC, Splitter:B:92:0x0307] */
    /* renamed from: b */
    public final boolean mo9107b(djn djn) {
        boolean z;
        bxvd bxvd;
        dmn c;
        if (djn.f13343f != -1) {
            z = true;
        } else {
            z = false;
        }
        bmzs.m108698a(z);
        int a = mo9101a(djn);
        din din = (din) this.f13276g.get(a);
        bxvd bxvd2 = (bxvd) din.mo74142c(5);
        bxvd2.mo73625a((GeneratedMessageLite) din);
        bxvd da = dio.f13248e.mo74144da();
        String str = djn.f13338a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        dio dio = (dio) da.f164949b;
        str.getClass();
        int i = dio.f13250a | 1;
        dio.f13250a = i;
        dio.f13251b = str;
        int i2 = i | 2;
        dio.f13250a = i2;
        dio.f13252c = a;
        int i3 = djn.f13339b;
        dio.f13250a = i2 | 4;
        dio.f13253d = i3;
        this.f13272c.add((dio) da.mo74062i());
        try {
            int a2 = dik.m8576a(((din) bxvd2.f164949b).f13232b);
            if (a2 != 0) {
                if (a2 == 2) {
                    this.f13276g.set(a, (din) bxvd2.mo74062i());
                    bxvd = this.f13283p;
                    c = djn.mo9133c();
                    if (c.f13555e.isEmpty()) {
                        if (!((dmn) bxvd.f164949b).f13555e.isEmpty()) {
                            if (!((dmn) bxvd.f164949b).f13555e.equals(c.f13555e)) {
                                String str2 = c.f13555e;
                                String str3 = ((dmn) bxvd.f164949b).f13555e;
                                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 95 + String.valueOf(str3).length());
                                sb.append("Can't merge <uses-module-api name='");
                                sb.append(str2);
                                sb.append("'>.  This module already requires a different module API '");
                                sb.append(str3);
                                sb.append("'.");
                                throw new dmu(sb.toString());
                            }
                        }
                        String str4 = c.f13555e;
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dmn dmn = (dmn) bxvd.f164949b;
                        dmn dmn2 = dmn.f13549v;
                        str4.getClass();
                        dmn.f13551a |= 4;
                        dmn.f13555e = str4;
                    }
                    List a3 = dmv.m8837a(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13556f), (List) c.f13556f);
                    if (!bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    dmn dmn3 = dmn.f13549v;
                    ((dmn) bxvd.f164949b).f13556f = GeneratedMessageLite.m124030de();
                    bxvd.mo74113u(a3);
                    List a4 = dmv.m8837a(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13557g), (List) c.f13557g);
                    if (!bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    ((dmn) bxvd.f164949b).f13557g = GeneratedMessageLite.m124030de();
                    bxvd.mo74101q(a4);
                    dmv.m8839a((Collection) Collections.unmodifiableList(((dmn) bxvd.f164949b).f13556f), Collections.unmodifiableList(((dmn) bxvd.f164949b).f13557g));
                    if (c.f13558h.size() > 0) {
                        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13558h));
                        for (dmo dmo : c.f13558h) {
                            int binarySearch = Collections.binarySearch(arrayList, dmo, dma.f13470b);
                            if (binarySearch < 0) {
                                arrayList.add((-binarySearch) - 1, dmo);
                            } else {
                                String str5 = dmo.f13575b;
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 83);
                                sb2.append("Can't merge <provides-api name='");
                                sb2.append(str5);
                                sb2.append("'>.  This module is already providing the same API.");
                                throw new dmu(sb2.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13558h = GeneratedMessageLite.m124030de();
                        bxvd.mo74105r(arrayList);
                    }
                    if (c.f13567q.size() > 0) {
                        ArrayList arrayList2 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13567q));
                        for (djd djd : c.f13567q) {
                            int binarySearch2 = Collections.binarySearch(arrayList2, djd, dma.f13471c);
                            if (binarySearch2 < 0) {
                                arrayList2.add((-binarySearch2) - 1, djd);
                            } else if (((djd) arrayList2.get(binarySearch2)).f13318c != djd.f13318c) {
                                String str6 = djd.f13317b;
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str6).length() + 114);
                                sb3.append("Can't merge <provides-feature name='");
                                sb3.append(str6);
                                sb3.append("'>.  This module is already providing the same feature at a different version.");
                                throw new dmu(sb3.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13567q = GeneratedMessageLite.m124030de();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dmn dmn4 = (dmn) bxvd.f164949b;
                        if (!dmn4.f13567q.mo73666a()) {
                            dmn4.f13567q = GeneratedMessageLite.m124021a(dmn4.f13567q);
                        }
                        bxsy.m123078a(arrayList2, dmn4.f13567q);
                    }
                    if (c.f13559i.size() > 0) {
                        ArrayList arrayList3 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13559i));
                        for (dms dms : c.f13559i) {
                            int binarySearch3 = Collections.binarySearch(arrayList3, dms, dma.f13472d);
                            if (binarySearch3 < 0) {
                                arrayList3.add((-binarySearch3) - 1, dms);
                            } else {
                                String str7 = dms.f13602c;
                                String str8 = dms.f13601b;
                                String str9 = ((dms) arrayList3.get(binarySearch3)).f13602c;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str7).length() + 118 + String.valueOf(str8).length() + String.valueOf(str9).length());
                                sb4.append("Can't merge <module-service name='");
                                sb4.append(str7);
                                sb4.append("'> with container-service '");
                                sb4.append(str8);
                                sb4.append("'.  That service is already proxied to Chimera service '");
                                sb4.append(str9);
                                sb4.append("'");
                                throw new dmu(sb4.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13559i = GeneratedMessageLite.m124030de();
                        bxvd.mo74115v(arrayList3);
                    }
                    if (c.f13560j.size() > 0) {
                        ArrayList arrayList4 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13560j));
                        for (dmq dmq : c.f13560j) {
                            int binarySearch4 = Collections.binarySearch(arrayList4, dmq, dma.f13473e);
                            if (binarySearch4 < 0) {
                                arrayList4.add((-binarySearch4) - 1, dmq);
                            } else {
                                String str10 = dmq.f13590c;
                                String str11 = dmq.f13589b;
                                String str12 = ((dmq) arrayList4.get(binarySearch4)).f13590c;
                                StringBuilder sb5 = new StringBuilder(String.valueOf(str10).length() + 122 + String.valueOf(str11).length() + String.valueOf(str12).length());
                                sb5.append("Can't merge <module-receiver name='");
                                sb5.append(str10);
                                sb5.append("'> with container-receiver '");
                                sb5.append(str11);
                                sb5.append("'.  That receiver is already proxied to Chimera receiver '");
                                sb5.append(str12);
                                sb5.append("'");
                                throw new dmu(sb5.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13560j = GeneratedMessageLite.m124030de();
                        bxvd.mo74111t(arrayList4);
                    }
                    if (c.f13563m.size() > 0) {
                        ArrayList arrayList5 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13563m));
                        for (dmb dmb : c.f13563m) {
                            int binarySearch5 = Collections.binarySearch(arrayList5, dmb, dma.f13474f);
                            if (binarySearch5 < 0) {
                                arrayList5.add((-binarySearch5) - 1, dmb);
                            } else {
                                String str13 = dmb.f13487c;
                                String str14 = dmb.f13486b;
                                String str15 = ((dmb) arrayList5.get(binarySearch5)).f13487c;
                                StringBuilder sb6 = new StringBuilder(String.valueOf(str13).length() + 122 + String.valueOf(str14).length() + String.valueOf(str15).length());
                                sb6.append("Can't merge <module-activity name='");
                                sb6.append(str13);
                                sb6.append("'> with container-activity '");
                                sb6.append(str14);
                                sb6.append("'.  That activity is already proxied to Chimera activity '");
                                sb6.append(str15);
                                sb6.append("'");
                                throw new dmu(sb6.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13563m = GeneratedMessageLite.m124030de();
                        bxvd.mo74089n(arrayList5);
                    }
                    if (c.f13562l.size() <= 0 || ((dmn) bxvd.f164949b).f13562l.size() > 0) {
                        throw new dmu("Manifest should be normalized before merging");
                    }
                    if (c.f13564n.size() > 0) {
                        List d = dmv.m8843d(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13564n), c.f13564n);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13564n = GeneratedMessageLite.m124030de();
                        bxvd.mo74097p(d);
                    }
                    if (c.f13561k.size() > 0) {
                        ArrayList arrayList6 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13561k));
                        for (dmp dmp : c.f13561k) {
                            int binarySearch6 = Collections.binarySearch(arrayList6, dmp, dma.f13478j);
                            if (binarySearch6 < 0) {
                                arrayList6.add((-binarySearch6) - 1, dmp);
                            } else {
                                String str16 = dmp.f13583c;
                                String str17 = dmp.f13582b;
                                String str18 = ((dmp) arrayList6.get(binarySearch6)).f13583c;
                                StringBuilder sb7 = new StringBuilder(String.valueOf(str16).length() + 122 + String.valueOf(str17).length() + String.valueOf(str18).length());
                                sb7.append("Can't merge <module-provider name='");
                                sb7.append(str16);
                                sb7.append("'> with container-provider '");
                                sb7.append(str17);
                                sb7.append("'.  That provider is already proxied to Chimera provider '");
                                sb7.append(str18);
                                sb7.append("'");
                                throw new dmu(sb7.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13561k = GeneratedMessageLite.m124030de();
                        bxvd.mo74109s(arrayList6);
                    }
                    if (c.f13570t.size() > 0) {
                        ArrayList arrayList7 = new ArrayList(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13570t));
                        for (dmt dmt : c.f13570t) {
                            int binarySearch7 = Collections.binarySearch(arrayList7, dmt, dma.f13479k);
                            if (binarySearch7 < 0) {
                                arrayList7.add((-binarySearch7) - 1, dmt);
                            } else {
                                String str19 = dmt.f13608c;
                                String str20 = dmt.f13607b;
                                String str21 = ((dmt) arrayList7.get(binarySearch7)).f13608c;
                                StringBuilder sb8 = new StringBuilder(String.valueOf(str19).length() + 134 + String.valueOf(str20).length() + String.valueOf(str21).length());
                                sb8.append("Can't merge <module-slice-provider name='");
                                sb8.append(str19);
                                sb8.append("'> with container-slice-provider '");
                                sb8.append(str20);
                                sb8.append("'.  That provider is already proxied to Chimera provider '");
                                sb8.append(str21);
                                sb8.append("'");
                                throw new dmu(sb8.toString());
                            }
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13570t = GeneratedMessageLite.m124030de();
                        bxvd.mo74117w(arrayList7);
                    }
                    dmv.m8841b(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13561k), Collections.unmodifiableList(((dmn) bxvd.f164949b).f13570t));
                    if (c.f13566p.size() > 0) {
                        List c2 = dmv.m8842c(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13566p), c.f13566p);
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13566p = GeneratedMessageLite.m124030de();
                        bxvd.mo74093o(c2);
                    }
                    if (c.f13569s.size() > 0) {
                        List unmodifiableList = Collections.unmodifiableList(((dmn) bxvd.f164949b).f13569s);
                        bxwc<dme> bxwc = c.f13569s;
                        ArrayList arrayList8 = new ArrayList(unmodifiableList);
                        for (dme dme : bxwc) {
                            int binarySearch8 = Collections.binarySearch(arrayList8, dme, dma.f13482n);
                            if (binarySearch8 >= 0) {
                                String valueOf = String.valueOf(dme.f13506b);
                                throw new dmu(valueOf.length() == 0 ? new String("Each module can have at most one DowngradeHandler: ") : "Each module can have at most one DowngradeHandler: ".concat(valueOf));
                            }
                            arrayList8.add((-binarySearch8) - 1, dme);
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13569s = GeneratedMessageLite.m124030de();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dmn dmn5 = (dmn) bxvd.f164949b;
                        dmn5.mo9286h();
                        bxsy.m123078a(arrayList8, dmn5.f13569s);
                    }
                    if (c.f13568r.size() > 0) {
                        List unmodifiableList2 = Collections.unmodifiableList(((dmn) bxvd.f164949b).f13568r);
                        bxwc<dmm> bxwc2 = c.f13568r;
                        ArrayList arrayList9 = new ArrayList(unmodifiableList2);
                        for (dmm dmm : bxwc2) {
                            int binarySearch9 = Collections.binarySearch(arrayList9, dmm, dma.f13481m);
                            if (binarySearch9 >= 0) {
                                String valueOf2 = String.valueOf(dmm.f13546d);
                                throw new dmu(valueOf2.length() == 0 ? new String("Duplicated meta-data entry: ") : "Duplicated meta-data entry: ".concat(valueOf2));
                            }
                            arrayList9.add((-binarySearch9) - 1, dmm);
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        ((dmn) bxvd.f164949b).f13568r = GeneratedMessageLite.m124030de();
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dmn dmn6 = (dmn) bxvd.f164949b;
                        dmn6.mo9285g();
                        bxsy.m123078a(arrayList9, dmn6.f13568r);
                    }
                    if ((c.f13551a & 16) != 0) {
                        if ((((dmn) bxvd.f164949b).f13551a & 16) != 0) {
                            dmc dmc = c.f13571u;
                            if (dmc == null) {
                                dmc = dmc.f13490d;
                            }
                            String str22 = dmc.f13493b;
                            dmc dmc2 = ((dmn) bxvd.f164949b).f13571u;
                            if (dmc2 == null) {
                                dmc2 = dmc.f13490d;
                            }
                            String str23 = dmc2.f13493b;
                            StringBuilder sb9 = new StringBuilder(String.valueOf(str22).length() + 84 + String.valueOf(str23).length());
                            sb9.append("Multiple backup agents are disallowed. More than one module backup-agent found:");
                            sb9.append(str22);
                            sb9.append(" and ");
                            sb9.append(str23);
                            throw new dmu(sb9.toString());
                        }
                        dmc dmc3 = c.f13571u;
                        if (dmc3 == null) {
                            dmc3 = dmc.f13490d;
                        }
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        dmn dmn7 = (dmn) bxvd.f164949b;
                        dmc3.getClass();
                        dmn7.f13571u = dmc3;
                        dmn7.f13551a |= 16;
                    }
                    bxvd bxvd3 = this.f13283p;
                    if (bxvd3.f164950c) {
                        bxvd3.mo74035c();
                        bxvd3.f164950c = false;
                    }
                    dmn dmn8 = (dmn) bxvd3.f164949b;
                    "".getClass();
                    dmn8.f13551a |= 4;
                    dmn8.f13555e = "";
                    bxvd bxvd4 = this.f13283p;
                    if (bxvd4.f164950c) {
                        bxvd4.mo74035c();
                        bxvd4.f164950c = false;
                    }
                    ((dmn) bxvd4.f164949b).f13567q = GeneratedMessageLite.m124030de();
                    return true;
                }
            }
            if (!((din) bxvd2.f164949b).f13235e.isEmpty()) {
                if (!djn.f13342e.f13555e.equals(((din) bxvd2.f164949b).f13235e)) {
                    String str24 = ((din) bxvd2.f164949b).f13235e;
                    String str25 = djn.f13342e.f13555e;
                    StringBuilder sb10 = new StringBuilder(String.valueOf(str24).length() + 59 + String.valueOf(str25).length());
                    sb10.append("modules in the same APK require different module APIs (");
                    sb10.append(str24);
                    sb10.append(" & ");
                    sb10.append(str25);
                    sb10.append(")");
                    throw new dmu(sb10.toString());
                }
            }
            String str26 = djn.f13342e.f13555e;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            din din2 = (din) bxvd2.f164949b;
            din din3 = din.f13229r;
            str26.getClass();
            din2.f13231a |= 8;
            din2.f13235e = str26;
            this.f13276g.set(a, (din) bxvd2.mo74062i());
            bxvd = this.f13283p;
            c = djn.mo9133c();
            if (c.f13555e.isEmpty()) {
            }
            List a32 = dmv.m8837a(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13556f), (List) c.f13556f);
            if (!bxvd.f164950c) {
            }
            dmn dmn32 = dmn.f13549v;
            ((dmn) bxvd.f164949b).f13556f = GeneratedMessageLite.m124030de();
            bxvd.mo74113u(a32);
            List a42 = dmv.m8837a(Collections.unmodifiableList(((dmn) bxvd.f164949b).f13557g), (List) c.f13557g);
            if (!bxvd.f164950c) {
            }
            ((dmn) bxvd.f164949b).f13557g = GeneratedMessageLite.m124030de();
            bxvd.mo74101q(a42);
            dmv.m8839a((Collection) Collections.unmodifiableList(((dmn) bxvd.f164949b).f13556f), Collections.unmodifiableList(((dmn) bxvd.f164949b).f13557g));
            if (c.f13558h.size() > 0) {
            }
            if (c.f13567q.size() > 0) {
            }
            if (c.f13559i.size() > 0) {
            }
            if (c.f13560j.size() > 0) {
            }
            if (c.f13563m.size() > 0) {
            }
            if (c.f13562l.size() <= 0) {
            }
            throw new dmu("Manifest should be normalized before merging");
        } catch (dmu e) {
            String valueOf3 = String.valueOf(djn);
            String message = e.getMessage();
            StringBuilder sb11 = new StringBuilder(String.valueOf(valueOf3).length() + 31 + String.valueOf(message).length());
            sb11.append("Failed merging manifest from ");
            sb11.append(valueOf3);
            sb11.append(": ");
            sb11.append(message);
            mo9105a(sb11.toString());
            m8584a(djn.f13341d, new dfg(5, e.getMessage()));
            return false;
        }
    }

    /* renamed from: c */
    private static final boolean m8590c(din din) {
        int a = dim.m8578a(din.f13241k);
        return a != 0 && a == 2;
    }

    /* renamed from: a */
    private final void m8584a(din din, dfg dfg) {
        if (m8587a(din)) {
            this.f13275f.set(m8588b(din));
            return;
        }
        this.f13273d.put(din, dfg);
        String valueOf = String.valueOf(dff.m8283a(din));
        throw new InvalidConfigException(valueOf.length() == 0 ? new String("Cannot discard required APK: ") : "Cannot discard required APK: ".concat(valueOf));
    }

    /* renamed from: a */
    private final void m8585a(djn djn, String str) {
        StringBuilder sb = new StringBuilder(djn.toString());
        sb.append(" rejected due to ");
        sb.append(str);
        sb.append(":");
        for (dmr dmr : djn.mo9132b()) {
            sb.append(' ');
            sb.append(dmr.f13595b);
            sb.append('[');
            sb.append(dmr.f13596c);
            if (dmr.f13597d < Integer.MAX_VALUE) {
                sb.append(',');
                sb.append(dmr.f13597d);
            }
            sb.append(']');
        }
        mo9106b(sb.toString());
    }

    /* renamed from: a */
    private final void m8586a(ArrayList arrayList, int i, Collection collection, dfg dfg) {
        djn djn = (djn) arrayList.get(i);
        if (m8590c(djn.f13341d)) {
            this.f13273d.put(djn.f13341d, dfg);
        }
        if (!djn.f13342e.f13558h.isEmpty()) {
            collection.remove(djn);
        }
        arrayList.remove(i);
    }

    /* renamed from: a */
    public static final boolean m8587a(din din) {
        int a = dim.m8578a(din.f13241k);
        return a != 0 && a == 3;
    }

    /* renamed from: a */
    public final int mo9101a(djn djn) {
        return m8588b(djn.f13341d);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djn.a(java.util.Collection, boolean):boolean
     arg types: [java.util.Set, int]
     candidates:
      djn.a(java.lang.String, java.lang.String):boolean
      djn.a(java.util.Collection, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djn.a(java.util.Collection, boolean):boolean
     arg types: [java.util.ArrayList, int]
     candidates:
      djn.a(java.lang.String, java.lang.String):boolean
      djn.a(java.util.Collection, boolean):boolean */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ArrayList mo9102a(ArrayList arrayList, SortedMap sortedMap) {
        Map map;
        int i;
        Map map2;
        ArrayList arrayList2 = arrayList;
        Collections.sort(arrayList);
        Map a = adyi.m51410a();
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            djn djn = (djn) arrayList2.get(i2);
            if (!djn.f13342e.f13558h.isEmpty()) {
                arrayList4.add(djn);
            }
        }
        sortedMap.clear();
        Set keySet = sortedMap.keySet();
        while (true) {
            int size2 = keySet.size();
            ArrayList arrayList5 = new ArrayList();
            int size3 = arrayList4.size();
            for (int i3 = 0; i3 < size3; i3++) {
                arrayList5.addAll(((djn) arrayList4.get(i3)).f13342e.f13558h);
            }
            Collections.sort(arrayList5, f13269o);
            int i4 = 0;
            String str = null;
            while (i4 < arrayList.size()) {
                djn djn2 = (djn) arrayList2.get(i4);
                if (str == null || !djn.m8656a(djn2.f13338a, str)) {
                    str = djn2.f13338a;
                    if (djn2.mo9131a((Collection) keySet, true)) {
                        String valueOf = String.valueOf(djn2);
                        int i5 = djn2.f13339b;
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36 + String.valueOf(str).length());
                        sb.append(valueOf);
                        sb.append(" accepted (id=");
                        sb.append(str);
                        sb.append(", version=");
                        sb.append(i5);
                        sb.append(")");
                        sb.toString();
                        mo9104a();
                        arrayList3.add(djn2);
                        List list = djn2.f13340c;
                        if (list != null) {
                            int size4 = list.size();
                            int i6 = 0;
                            while (i6 < size4) {
                                a.put((String) list.get(i6), djn2);
                                i6++;
                                list = list;
                            }
                        }
                        bxwc bxwc = djn2.f13342e.f13558h;
                        int size5 = bxwc.size();
                        int i7 = 0;
                        while (i7 < size5) {
                            sortedMap.put((dmo) bxwc.get(i7), djn2);
                            i7++;
                            size5 = size5;
                            bxwc = bxwc;
                        }
                        arrayList2.remove(i4);
                        arrayList4.remove(djn2);
                        while (i4 < arrayList.size() && djn.m8656a(djn2.f13338a, ((djn) arrayList2.get(i4)).f13338a)) {
                            String valueOf2 = String.valueOf(arrayList2.get(i4));
                            int i8 = ((djn) arrayList2.get(i4)).f13339b;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 36 + String.valueOf(str).length());
                            sb2.append(valueOf2);
                            sb2.append(" rejected (id=");
                            sb2.append(str);
                            sb2.append(", version=");
                            sb2.append(i8);
                            sb2.append(")");
                            sb2.toString();
                            mo9104a();
                            m8586a(arrayList2, i4, arrayList4, new dfg(1, String.valueOf(djn2.f13339b)));
                            a = a;
                        }
                        map2 = a;
                    } else {
                        map2 = a;
                        if (!djn2.mo9131a((Collection) arrayList5, false)) {
                            m8585a(djn2, "missing APIs");
                            m8586a(arrayList2, i4, arrayList4, new dfg(3, m8589c(djn2)));
                            str = null;
                        } else {
                            i4++;
                        }
                        a = map2;
                    }
                } else {
                    i4++;
                    map2 = a;
                }
                a = map2;
            }
            map = a;
            i = 0;
            if (!arrayList.isEmpty() && keySet.size() != size2) {
                a = map;
            }
        }
        int size6 = arrayList.size();
        String str2 = null;
        for (int i9 = 0; i9 < size6; i9++) {
            djn djn3 = (djn) arrayList2.get(i9);
            if (str2 == null || !djn.m8656a(djn3.f13338a, str2)) {
                String str3 = djn3.f13338a;
                m8585a(djn3, "dependency cycle");
                str2 = str3;
            }
            if (m8590c(djn3.f13341d)) {
                this.f13273d.put(djn3.f13341d, new dfg(3, m8589c(djn3)));
            }
        }
        int i10 = 0;
        while (i10 < arrayList3.size()) {
            djn djn4 = (djn) arrayList3.get(i10);
            Map map3 = map;
            djn djn5 = (djn) map3.remove(djn4.f13338a);
            if (djn5 != null) {
                String str4 = djn4.f13338a;
                String str5 = djn5.f13338a;
                StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 36 + String.valueOf(str5).length());
                sb3.append(str4);
                sb3.append(" NOT accepted, replaced by alias to ");
                sb3.append(str5);
                sb3.toString();
                mo9104a();
                arrayList3.remove(i10);
            } else {
                i10++;
            }
            map = map3;
        }
        Collections.sort(arrayList3, djn.f13336h);
        int size7 = arrayList3.size();
        int i11 = 0;
        while (i11 < size7) {
            ((djn) arrayList3.get(i11)).f13343f = i;
            i11++;
            i++;
        }
        return arrayList3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dmv.a(java.util.Collection, java.util.List):void
     arg types: [java.util.List, java.util.List]
     candidates:
      dmv.a(java.lang.String, java.lang.String):java.lang.String
      dmv.a(java.util.List, java.util.Comparator):java.util.List
      dmv.a(java.util.List, java.util.List):java.util.List
      dmv.a(java.lang.String, bxvd):void
      dmv.a(java.util.Collection, java.util.List):void */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bd, code lost:
        if (r12.contains(r14.toString()) == false) goto L_0x00d0;
     */
    /* renamed from: a */
    public final ArrayList mo9103a(List list, boolean z) {
        int i;
        ArrayList arrayList;
        diu diu;
        int i2;
        ArrayList arrayList2;
        dmu dmu;
        diu diu2 = this;
        ArrayList arrayList3 = new ArrayList((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        boolean z2 = false;
        int i3 = 0;
        while (i3 < list.size()) {
            if (!diu2.f13275f.get(i3)) {
                din din = (din) list.get(i3);
                dmj dmj = (dmj) diu2.f13279j.get(din);
                if (dmj == null) {
                    String valueOf = String.valueOf(dff.m8283a(din));
                    diu2.mo9106b(valueOf.length() == 0 ? new String("Can't get Chimera manifests from ") : "Can't get Chimera manifests from ".concat(valueOf));
                    diu2.m8584a(din, new dfg(4));
                    arrayList = arrayList3;
                    i = i3;
                    diu = diu2;
                } else {
                    int i4 = 5;
                    bxvd bxvd = (bxvd) dmj.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) dmj);
                    int i5 = 0;
                    while (i5 < ((dmj) bxvd.f164949b).f13539a.size()) {
                        dmn dmn = (dmn) ((dmj) bxvd.f164949b).f13539a.get(i5);
                        int a = dik.m8576a(din.f13232b);
                        boolean z3 = a != 0 && a == 2 && dmn.f13552b.isEmpty();
                        String str = diu2.f13270a;
                        if (!z3) {
                            if (dmn.f13552b.isEmpty()) {
                                throw new dmu("Missing required module ID");
                            } else if (dmn.f13554d <= 0) {
                                throw new dmu("Missing required module version");
                            } else if (dmn.f13555e.isEmpty()) {
                                throw new dmu("Missing required <uses-module-api>");
                            }
                        }
                        bxvd bxvd2 = (bxvd) dmn.mo74142c(i4);
                        bxvd2.mo73625a((GeneratedMessageLite) dmn);
                        if (!((dmn) bxvd2.f164949b).f13565o.equals(str)) {
                            dmv.m8838a(str, bxvd2);
                        }
                        List a2 = dmv.m8835a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13556f));
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = z2;
                        }
                        dmn dmn2 = dmn.f13549v;
                        ((dmn) bxvd2.f164949b).f13556f = GeneratedMessageLite.m124030de();
                        bxvd2.mo74113u(a2);
                        List a3 = dmv.m8835a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13557g));
                        if (bxvd2.f164950c) {
                            bxvd2.mo74035c();
                            bxvd2.f164950c = z2;
                        }
                        ((dmn) bxvd2.f164949b).f13557g = GeneratedMessageLite.m124030de();
                        bxvd2.mo74101q(a3);
                        dmv.m8839a((Collection) Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13556f), Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13557g));
                        if (((dmn) bxvd2.f164949b).f13558h.size() > 1) {
                            try {
                                List a4 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13558h), dma.f13470b);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = z2;
                                }
                                ((dmn) bxvd2.f164949b).f13558h = GeneratedMessageLite.m124030de();
                                bxvd2.mo74105r(a4);
                                String str2 = bxvd2.mo74058h(z2).f13575b;
                                int i6 = 1;
                                while (i6 < ((dmn) bxvd2.f164949b).f13558h.size()) {
                                    if (!bxvd2.mo74058h(i6).f13575b.equals(str2)) {
                                        str2 = bxvd2.mo74058h(i6).f13575b;
                                        i6++;
                                    } else {
                                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 42);
                                        sb.append("Multiple <provides-api> entries for API '");
                                        sb.append(str2);
                                        sb.append("'");
                                        throw new dmu(sb.toString());
                                    }
                                }
                            } catch (dmu e) {
                                dmu = e;
                                arrayList = arrayList2;
                                i = i2;
                                String str3 = dmn.f13552b;
                                String a5 = dff.m8283a(din);
                                String message = dmu.getMessage();
                                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 65 + String.valueOf(a5).length() + String.valueOf(message).length());
                                sb2.append("Manifest for module '");
                                sb2.append(str3);
                                sb2.append("' from ");
                                sb2.append(a5);
                                sb2.append(" is malformed. Ignore the whole APK: ");
                                sb2.append(message);
                                diu = this;
                                diu.mo9106b(sb2.toString());
                                diu.m8584a(din, new dfg(5, dmu.getMessage()));
                                diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                                arrayList3 = arrayList;
                                z2 = false;
                                i3 = i + 1;
                                diu2 = diu;
                            }
                        }
                        if (((dmn) bxvd2.f164949b).f13559i.size() > 1) {
                            List a6 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13559i), dma.f13472d);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = z2;
                            }
                            ((dmn) bxvd2.f164949b).f13559i = GeneratedMessageLite.m124030de();
                            bxvd2.mo74115v(a6);
                            String str4 = bxvd2.mo74063i(z2).f13601b;
                            int i7 = 1;
                            while (i7 < ((dmn) bxvd2.f164949b).f13559i.size()) {
                                if (!bxvd2.mo74063i(i7).f13601b.equals(str4)) {
                                    str4 = bxvd2.mo74063i(i7).f13601b;
                                    i7++;
                                } else {
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(str4).length() + 46);
                                    sb3.append("Multiple services tied to container-service '");
                                    sb3.append(str4);
                                    sb3.append("'");
                                    throw new dmu(sb3.toString());
                                }
                            }
                        }
                        if (((dmn) bxvd2.f164949b).f13560j.size() > 1) {
                            List a7 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13560j), dma.f13473e);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = z2;
                            }
                            ((dmn) bxvd2.f164949b).f13560j = GeneratedMessageLite.m124030de();
                            bxvd2.mo74111t(a7);
                            String str5 = bxvd2.mo74068j(z2).f13589b;
                            int i8 = 1;
                            while (i8 < ((dmn) bxvd2.f164949b).f13560j.size()) {
                                if (!bxvd2.mo74068j(i8).f13589b.equals(str5)) {
                                    str5 = bxvd2.mo74068j(i8).f13589b;
                                    i8++;
                                } else {
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str5).length() + 48);
                                    sb4.append("Multiple receivers tied to container-receiver '");
                                    sb4.append(str5);
                                    sb4.append("'");
                                    throw new dmu(sb4.toString());
                                }
                            }
                        }
                        if (((dmn) bxvd2.f164949b).f13563m.size() > 1) {
                            List a8 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13563m), dma.f13474f);
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = z2;
                            }
                            ((dmn) bxvd2.f164949b).f13563m = GeneratedMessageLite.m124030de();
                            bxvd2.mo74089n(a8);
                            String str6 = bxvd2.mo74078l(z2 ? 1 : 0).f13486b;
                            int i9 = 1;
                            while (i9 < ((dmn) bxvd2.f164949b).f13563m.size()) {
                                if (!bxvd2.mo74078l(i9).f13486b.equals(str6)) {
                                    str6 = bxvd2.mo74078l(i9).f13486b;
                                    i9++;
                                } else {
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(str6).length() + 49);
                                    sb5.append("Multiple activities tied to container-activity '");
                                    sb5.append(str6);
                                    sb5.append("'");
                                    throw new dmu(sb5.toString());
                                }
                            }
                        }
                        if (((dmn) bxvd2.f164949b).f13564n.size() > 0) {
                            List d = dmv.m8843d(Collections.emptyList(), Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13564n));
                            if (bxvd2.f164950c) {
                                bxvd2.mo74035c();
                                bxvd2.f164950c = z2;
                            }
                            ((dmn) bxvd2.f164949b).f13564n = GeneratedMessageLite.m124030de();
                            bxvd2.mo74097p(d);
                        }
                        try {
                            if (((dmn) bxvd2.f164949b).f13562l.size() > 0) {
                                try {
                                    List unmodifiableList = Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13564n);
                                    List unmodifiableList2 = Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13562l);
                                    ArrayList arrayList4 = new ArrayList(unmodifiableList);
                                    Iterator it = unmodifiableList2.iterator();
                                    while (it.hasNext()) {
                                        dmf dmf = (dmf) it.next();
                                        bxvd da = dmi.f13532d.mo74144da();
                                        String str7 = dmf.f13512c;
                                        if (da.f164950c) {
                                            da.mo74035c();
                                            da.f164950c = false;
                                        }
                                        dmi dmi = (dmi) da.f164949b;
                                        str7.getClass();
                                        Iterator it2 = it;
                                        dmi.f13534a |= 1;
                                        dmi.f13535b = str7;
                                        int binarySearch = Collections.binarySearch(arrayList4, (dmi) da.mo74062i(), dma.f13475g);
                                        if (binarySearch >= 0) {
                                            bxwc bxwc = ((dmi) arrayList4.get(binarySearch)).f13536c;
                                            ArrayList arrayList5 = new ArrayList(bxwc);
                                            bxvd da2 = dmh.f13527d.mo74144da();
                                            arrayList = arrayList2;
                                            try {
                                                String str8 = dmf.f13513d;
                                                i = i2;
                                                if (da2.f164950c) {
                                                    da2.mo74035c();
                                                    da2.f164950c = false;
                                                }
                                                dmh dmh = (dmh) da2.f164949b;
                                                str8.getClass();
                                                dmh.f13529a |= 1;
                                                dmh.f13530b = str8;
                                                int binarySearch2 = Collections.binarySearch(arrayList5, (dmh) da2.mo74062i(), dma.f13476h);
                                                if (binarySearch2 >= 0) {
                                                    ArrayList arrayList6 = new ArrayList(((dmh) bxwc.get(binarySearch2)).f13531c);
                                                    dmg a9 = dmv.m8833a(dmf);
                                                    int binarySearch3 = Collections.binarySearch(arrayList6, a9, dma.f13477i);
                                                    if (binarySearch3 >= 0) {
                                                        String valueOf2 = String.valueOf(dmf.f13511b);
                                                        throw new dmu(valueOf2.length() == 0 ? new String("Duplicate ModuleIntentOperation: ") : "Duplicate ModuleIntentOperation: ".concat(valueOf2));
                                                    }
                                                    arrayList6.add((-binarySearch3) - 1, a9);
                                                    dmh dmh2 = (dmh) bxwc.get(binarySearch2);
                                                    bxvd bxvd3 = (bxvd) dmh2.mo74142c(5);
                                                    bxvd3.mo73625a((GeneratedMessageLite) dmh2);
                                                    if (bxvd3.f164950c) {
                                                        bxvd3.mo74035c();
                                                        try {
                                                            bxvd3.f164950c = false;
                                                        } catch (dmu e2) {
                                                            e = e2;
                                                            dmu = e;
                                                            String str32 = dmn.f13552b;
                                                            String a52 = dff.m8283a(din);
                                                            String message2 = dmu.getMessage();
                                                            StringBuilder sb22 = new StringBuilder(String.valueOf(str32).length() + 65 + String.valueOf(a52).length() + String.valueOf(message2).length());
                                                            sb22.append("Manifest for module '");
                                                            sb22.append(str32);
                                                            sb22.append("' from ");
                                                            sb22.append(a52);
                                                            sb22.append(" is malformed. Ignore the whole APK: ");
                                                            sb22.append(message2);
                                                            diu = this;
                                                            diu.mo9106b(sb22.toString());
                                                            diu.m8584a(din, new dfg(5, dmu.getMessage()));
                                                            diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                                                            arrayList3 = arrayList;
                                                            z2 = false;
                                                            i3 = i + 1;
                                                            diu2 = diu;
                                                        }
                                                    }
                                                    try {
                                                        ((dmh) bxvd3.f164949b).f13531c = GeneratedMessageLite.m124030de();
                                                        bxvd3.mo74080l(arrayList6);
                                                        arrayList5.set(binarySearch2, (dmh) bxvd3.mo74062i());
                                                    } catch (dmu e3) {
                                                        e = e3;
                                                    }
                                                } else {
                                                    da2.mo74001a(dmv.m8833a(dmf));
                                                    arrayList5.add((-binarySearch2) - 1, (dmh) da2.mo74062i());
                                                }
                                                dmi dmi2 = (dmi) arrayList4.get(binarySearch);
                                                bxvd bxvd4 = (bxvd) dmi2.mo74142c(5);
                                                bxvd4.mo73625a((GeneratedMessageLite) dmi2);
                                                if (bxvd4.f164950c) {
                                                    bxvd4.mo74035c();
                                                    bxvd4.f164950c = false;
                                                }
                                                ((dmi) bxvd4.f164949b).f13536c = GeneratedMessageLite.m124030de();
                                                bxvd4.mo74085m(arrayList5);
                                                arrayList4.set(binarySearch, (dmi) bxvd4.mo74062i());
                                                it = it2;
                                                arrayList2 = arrayList;
                                                i2 = i;
                                            } catch (dmu e4) {
                                                e = e4;
                                                i = i2;
                                                dmu = e;
                                                String str322 = dmn.f13552b;
                                                String a522 = dff.m8283a(din);
                                                String message22 = dmu.getMessage();
                                                StringBuilder sb222 = new StringBuilder(String.valueOf(str322).length() + 65 + String.valueOf(a522).length() + String.valueOf(message22).length());
                                                sb222.append("Manifest for module '");
                                                sb222.append(str322);
                                                sb222.append("' from ");
                                                sb222.append(a522);
                                                sb222.append(" is malformed. Ignore the whole APK: ");
                                                sb222.append(message22);
                                                diu = this;
                                                diu.mo9106b(sb222.toString());
                                                diu.m8584a(din, new dfg(5, dmu.getMessage()));
                                                diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                                                arrayList3 = arrayList;
                                                z2 = false;
                                                i3 = i + 1;
                                                diu2 = diu;
                                            }
                                        } else {
                                            arrayList = arrayList2;
                                            i = i2;
                                            bxvd da3 = dmh.f13527d.mo74144da();
                                            String str9 = dmf.f13513d;
                                            if (da3.f164950c) {
                                                da3.mo74035c();
                                                da3.f164950c = false;
                                            }
                                            dmh dmh3 = (dmh) da3.f164949b;
                                            str9.getClass();
                                            dmh3.f13529a |= 1;
                                            dmh3.f13530b = str9;
                                            da3.mo74001a(dmv.m8833a(dmf));
                                            dmh dmh4 = (dmh) da3.mo74062i();
                                            if (da.f164950c) {
                                                da.mo74035c();
                                                da.f164950c = false;
                                            }
                                            dmi dmi3 = (dmi) da.f164949b;
                                            dmh4.getClass();
                                            dmi3.mo9278a();
                                            dmi3.f13536c.add(dmh4);
                                            arrayList4.add((-binarySearch) - 1, (dmi) da.mo74062i());
                                            it = it2;
                                            arrayList2 = arrayList;
                                            i2 = i;
                                        }
                                    }
                                    arrayList = arrayList2;
                                    i = i2;
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    ((dmn) bxvd2.f164949b).f13562l = GeneratedMessageLite.m124030de();
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    ((dmn) bxvd2.f164949b).f13564n = GeneratedMessageLite.m124030de();
                                    bxvd2.mo74097p(arrayList4);
                                } catch (dmu e5) {
                                    e = e5;
                                    arrayList = arrayList2;
                                    i = i2;
                                    dmu = e;
                                    String str3222 = dmn.f13552b;
                                    String a5222 = dff.m8283a(din);
                                    String message222 = dmu.getMessage();
                                    StringBuilder sb2222 = new StringBuilder(String.valueOf(str3222).length() + 65 + String.valueOf(a5222).length() + String.valueOf(message222).length());
                                    sb2222.append("Manifest for module '");
                                    sb2222.append(str3222);
                                    sb2222.append("' from ");
                                    sb2222.append(a5222);
                                    sb2222.append(" is malformed. Ignore the whole APK: ");
                                    sb2222.append(message222);
                                    diu = this;
                                    diu.mo9106b(sb2222.toString());
                                    diu.m8584a(din, new dfg(5, dmu.getMessage()));
                                    diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                                    arrayList3 = arrayList;
                                    z2 = false;
                                    i3 = i + 1;
                                    diu2 = diu;
                                }
                            } else {
                                arrayList = arrayList2;
                                i = i2;
                            }
                            if (((dmn) bxvd2.f164949b).f13566p.size() > 0) {
                                List c = dmv.m8842c(Collections.emptyList(), Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13566p));
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ((dmn) bxvd2.f164949b).f13566p = GeneratedMessageLite.m124030de();
                                bxvd2.mo74093o(c);
                            }
                            if (((dmn) bxvd2.f164949b).f13561k.size() > 1) {
                                List a10 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13561k), dma.f13478j);
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                ((dmn) bxvd2.f164949b).f13561k = GeneratedMessageLite.m124030de();
                                bxvd2.mo74109s(a10);
                                String str10 = bxvd2.mo74072k(0).f13582b;
                                int i10 = 1;
                                while (i10 < ((dmn) bxvd2.f164949b).f13561k.size()) {
                                    if (!bxvd2.mo74072k(i10).f13582b.equals(str10)) {
                                        str10 = bxvd2.mo74072k(i10).f13582b;
                                        i10++;
                                    } else {
                                        StringBuilder sb6 = new StringBuilder(String.valueOf(str10).length() + 48);
                                        sb6.append("Multiple providers tied to container-provider '");
                                        sb6.append(str10);
                                        sb6.append("'");
                                        throw new dmu(sb6.toString());
                                    }
                                }
                            }
                            try {
                                if (((dmn) bxvd2.f164949b).f13570t.size() > 1) {
                                    List a11 = dmv.m8836a(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13570t), dma.f13479k);
                                    if (bxvd2.f164950c) {
                                        bxvd2.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    ((dmn) bxvd2.f164949b).f13570t = GeneratedMessageLite.m124030de();
                                    bxvd2.mo74117w(a11);
                                    String str11 = bxvd2.mo74095p(0).f13607b;
                                    int i11 = 1;
                                    while (i11 < ((dmn) bxvd2.f164949b).f13570t.size()) {
                                        if (!bxvd2.mo74095p(i11).f13607b.equals(str11)) {
                                            str11 = bxvd2.mo74095p(i11).f13607b;
                                            i11++;
                                        } else {
                                            StringBuilder sb7 = new StringBuilder(String.valueOf(str11).length() + 60);
                                            sb7.append("Multiple slice-providers tied to container-slice-provider '");
                                            sb7.append(str11);
                                            sb7.append("'");
                                            throw new dmu(sb7.toString());
                                        }
                                    }
                                }
                                dmv.m8841b(Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13561k), Collections.unmodifiableList(((dmn) bxvd2.f164949b).f13570t));
                                dmn dmn3 = (dmn) bxvd2.mo74062i();
                                if (bxvd.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd.f164950c = false;
                                }
                                dmj dmj2 = (dmj) bxvd.f164949b;
                                dmn3.getClass();
                                if (!dmj2.f13539a.mo73666a()) {
                                    dmj2.f13539a = GeneratedMessageLite.m124021a(dmj2.f13539a);
                                }
                                dmj2.f13539a.set(i5, dmn3);
                                i5++;
                                diu2 = this;
                                arrayList3 = arrayList;
                                i3 = i;
                                z2 = false;
                                i4 = 5;
                            } catch (dmu e6) {
                                e = e6;
                                dmu = e;
                                String str32222 = dmn.f13552b;
                                String a52222 = dff.m8283a(din);
                                String message2222 = dmu.getMessage();
                                StringBuilder sb22222 = new StringBuilder(String.valueOf(str32222).length() + 65 + String.valueOf(a52222).length() + String.valueOf(message2222).length());
                                sb22222.append("Manifest for module '");
                                sb22222.append(str32222);
                                sb22222.append("' from ");
                                sb22222.append(a52222);
                                sb22222.append(" is malformed. Ignore the whole APK: ");
                                sb22222.append(message2222);
                                diu = this;
                                diu.mo9106b(sb22222.toString());
                                diu.m8584a(din, new dfg(5, dmu.getMessage()));
                                diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                                arrayList3 = arrayList;
                                z2 = false;
                                i3 = i + 1;
                                diu2 = diu;
                            }
                        } catch (dmu e7) {
                            e = e7;
                            arrayList = arrayList2;
                            i = i2;
                            dmu = e;
                            String str322222 = dmn.f13552b;
                            String a522222 = dff.m8283a(din);
                            String message22222 = dmu.getMessage();
                            StringBuilder sb222222 = new StringBuilder(String.valueOf(str322222).length() + 65 + String.valueOf(a522222).length() + String.valueOf(message22222).length());
                            sb222222.append("Manifest for module '");
                            sb222222.append(str322222);
                            sb222222.append("' from ");
                            sb222222.append(a522222);
                            sb222222.append(" is malformed. Ignore the whole APK: ");
                            sb222222.append(message22222);
                            diu = this;
                            diu.mo9106b(sb222222.toString());
                            diu.m8584a(din, new dfg(5, dmu.getMessage()));
                            diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                            arrayList3 = arrayList;
                            z2 = false;
                            i3 = i + 1;
                            diu2 = diu;
                        }
                    }
                    for (dmn dmn4 : Collections.unmodifiableList(((dmj) bxvd.f164949b).f13539a)) {
                        if (z) {
                            String str12 = dmn4.f13552b;
                            int i12 = dmn4.f13554d;
                            if (!diu2.f13280k.contains(str12)) {
                                dky dky = diu2.f13280k;
                                StringBuilder sb8 = new StringBuilder(String.valueOf(str12).length() + 12);
                                sb8.append(str12);
                                sb8.append(":");
                                sb8.append(i12);
                            }
                            if (m8590c(din)) {
                                diu2.m8584a(din, new dfg(6));
                            }
                        }
                        djn djn = new djn(dmn4, din);
                        String valueOf3 = String.valueOf(djn);
                        String a12 = dff.m8283a(din);
                        StringBuilder sb9 = new StringBuilder(String.valueOf(valueOf3).length() + 18 + String.valueOf(a12).length());
                        sb9.append("Considering ");
                        sb9.append(valueOf3);
                        sb9.append(" from ");
                        sb9.append(a12);
                        sb9.toString();
                        mo9104a();
                        arrayList2.add(djn);
                    }
                    arrayList = arrayList2;
                    i = i2;
                    diu = diu2;
                    diu.f13279j.put(din, (dmj) bxvd.mo74062i());
                }
            } else {
                arrayList = arrayList3;
                i = i3;
                diu = diu2;
            }
            arrayList3 = arrayList;
            z2 = false;
            i3 = i + 1;
            diu2 = diu;
        }
        return arrayList3;
    }
}
