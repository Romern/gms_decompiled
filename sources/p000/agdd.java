package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: agdd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class agdd extends agmg {

    /* renamed from: a */
    private String f65287a;

    /* renamed from: b */
    private Set f65288b;

    /* renamed from: c */
    private Map f65289c;

    /* renamed from: d */
    private Long f65290d;

    public agdd(agmn agmn) {
        super(agmn);
    }

    /* renamed from: a */
    private final agcy m54030a(int i) {
        Map map = this.f65289c;
        Integer valueOf = Integer.valueOf(i);
        if (map.containsKey(valueOf)) {
            return (agcy) this.f65289c.get(valueOf);
        }
        agcy agcy = new agcy();
        this.f65289c.put(valueOf, agcy);
        return agcy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        return false;
    }

    /* renamed from: a */
    private final boolean m54031a(int i, int i2) {
        Map map = this.f65289c;
        Integer valueOf = Integer.valueOf(i);
        if (map.get(valueOf) != null) {
            return ((agcy) this.f65289c.get(valueOf)).f65267a.get(i2);
        }
        return false;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Byte):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Float):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.String):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Long):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Boolean):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, byte[]):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Double):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Short):void}
      ClspMth{android.content.ContentValues.put(java.lang.String, java.lang.Integer):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: agmp.a(bxxb, byte[]):bxxb
     arg types: [bxvd, byte[]]
     candidates:
      agmp.a(bxvd, java.lang.String):int
      agmp.a(java.lang.StringBuilder, int):void
      agmp.a(com.google.android.gms.measurement.internal.EventParcel, com.google.android.gms.measurement.internal.AppMetadata):boolean
      agmp.a(java.util.List, int):boolean
      agmp.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable
      agmp.a(agni, java.lang.String):java.lang.Object
      agmp.a(java.util.List, java.util.List):java.util.List
      agmp.a(bxvd, java.lang.Object):void
      agmp.a(long, long):boolean
      agmp.a(bxxb, byte[]):bxxb */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x05be, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x05bf, code lost:
        r14 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x05c1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x05c2, code lost:
        r25 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x05c9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x05ca, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x05cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x05cd, code lost:
        r25 = r3;
        r28 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x05e1, code lost:
        r2.close();
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x05e6, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x05f6, code lost:
        r14.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0781, code lost:
        if (r10 != null) goto L_0x0783;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x078c, code lost:
        if (r10 != null) goto L_0x0783;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x010d, code lost:
        if (r14 != null) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0ad2, code lost:
        r0 = mo35497E().f65567f;
        r2 = p000.agid.m54288a(r1.f65287a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0ae2, code lost:
        if ((r10.f66016a & 1) == 0) goto L_0x0aeb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:450:0x0ae4, code lost:
        r14 = java.lang.Integer.valueOf(r10.f66017b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:0x0aeb, code lost:
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0aec, code lost:
        r0.mo35437a("Invalid property filter ID. appId, id", r2, java.lang.String.valueOf(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01af, code lost:
        if (r11 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01ba, code lost:
        if (r11 != null) goto L_0x01b1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02f6  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02fb  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0449  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x05be A[ExcHandler: all (th java.lang.Throwable), Splitter:B:191:0x0543] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x05c9 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:186:0x051e] */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x05e1  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x05e6  */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x05e9  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x05f6  */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0612  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x06c4  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x06d0  */
    /* JADX WARNING: Removed duplicated region for block: B:311:0x07a9  */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:314:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x07b7  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x07bf  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x07d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:462:0x0b57  */
    /* JADX WARNING: Removed duplicated region for block: B:482:0x0bed  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:531:0x0b32 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ee  */
    /* renamed from: a */
    public final List mo35304a(String str, List list, List list2, Long l) {
        boolean z;
        Cursor cursor;
        C1223np npVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Iterator it;
        Map map;
        C1223np npVar2;
        Iterator it2;
        String str8;
        Map map2;
        Iterator it3;
        String str9;
        boolean z2;
        Boolean bool;
        Integer num;
        String str10;
        int i;
        Cursor cursor2;
        agdr agdr;
        Iterator it4;
        String str11;
        String str12;
        String str13;
        agcz agcz;
        Map map3;
        Cursor cursor3;
        C1223np npVar3;
        List list3;
        C1223np npVar4;
        Iterator it5;
        Iterator it6;
        bxwc bxwc;
        int i2;
        Iterator it7;
        bxwc bxwc2;
        Long l2;
        Cursor cursor4;
        Cursor cursor5;
        String str14 = "current_results";
        String str15 = "audience_id";
        sdo.m34977c(str);
        sdo.m34959a(list);
        sdo.m34959a(list2);
        this.f65287a = str;
        this.f65288b = new HashSet();
        this.f65289c = new C1223np();
        this.f65290d = l;
        Iterator it8 = list.iterator();
        while (true) {
            if (it8.hasNext()) {
                if ("_s".equals(((agni) it8.next()).f66068c)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        cfiw.m139808c();
        cfiw.m139808c();
        if (z) {
            agdl n = mo35656n();
            String str16 = this.f65287a;
            n.mo35659q();
            n.mo35241h();
            sdo.m34977c(str16);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                n.mo35360e().update("events", contentValues, "app_id = ?", new String[]{str16});
            } catch (SQLiteException e) {
                n.mo35497E().f65564c.mo35437a("Error resetting session-scoped event counts. appId", agid.m54288a(str16), e);
            }
        }
        Collections.emptyMap();
        agdl n2 = mo35656n();
        String str17 = this.f65287a;
        n2.mo35659q();
        n2.mo35241h();
        sdo.m34977c(str17);
        try {
            cursor = n2.mo35360e().query("audience_filter_values", new String[]{str15, str14}, "app_id=?", new String[]{str17}, null, null, null);
            try {
                if (cursor.moveToFirst()) {
                    C1223np npVar5 = new C1223np();
                    do {
                        int i3 = cursor.getInt(0);
                        try {
                            npVar5.put(Integer.valueOf(i3), (agno) ((bxvd) agmp.m54563a((bxxb) agno.f66134e.mo74144da(), cursor.getBlob(1))).mo74062i());
                        } catch (IOException e2) {
                            n2.mo35497E().f65564c.mo35438a("Failed to merge filter results. appId, audienceId, error", agid.m54288a(str17), Integer.valueOf(i3), e2);
                        }
                    } while (cursor.moveToNext());
                    if (cursor != null) {
                        cursor.close();
                    }
                    npVar = npVar5;
                    int i4 = 5;
                    if (npVar != null && !npVar.isEmpty()) {
                        HashSet hashSet = new HashSet(npVar.keySet());
                        if (!z) {
                            String str18 = this.f65287a;
                            sdo.m34977c(str18);
                            sdo.m34959a(npVar);
                            npVar4 = new C1223np();
                            if (!npVar.isEmpty()) {
                                agdl n3 = mo35656n();
                                n3.mo35659q();
                                n3.mo35241h();
                                sdo.m34977c(str18);
                                Map npVar6 = new C1223np();
                                try {
                                    cursor5 = n3.mo35360e().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str18, str18});
                                    try {
                                        if (cursor5.moveToFirst()) {
                                            do {
                                                Integer valueOf = Integer.valueOf(cursor5.getInt(0));
                                                List list4 = (List) npVar6.get(valueOf);
                                                if (list4 == null) {
                                                    list4 = new ArrayList();
                                                    npVar6.put(valueOf, list4);
                                                }
                                                list4.add(Integer.valueOf(cursor5.getInt(1)));
                                            } while (cursor5.moveToNext());
                                        } else {
                                            npVar6 = Collections.emptyMap();
                                        }
                                        cursor5.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        try {
                                            n3.mo35497E().f65564c.mo35437a("Database error querying scoped filters. appId", agid.m54288a(str18), e);
                                            if (cursor5 == null) {
                                            }
                                            while (r4.hasNext()) {
                                            }
                                            it5 = hashSet.iterator();
                                            while (it5.hasNext()) {
                                            }
                                            String str19 = "Database error querying filters. appId";
                                            String str20 = "data";
                                            if (list.isEmpty()) {
                                            }
                                            if (!list2.isEmpty()) {
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            Set<Integer> keySet = this.f65289c.keySet();
                                            keySet.removeAll(this.f65288b);
                                            while (r3.hasNext()) {
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            cursor4 = cursor5;
                                            if (cursor4 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        cursor4 = cursor5;
                                        if (cursor4 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    cursor5 = null;
                                    n3.mo35497E().f65564c.mo35437a("Database error querying scoped filters. appId", agid.m54288a(str18), e);
                                    if (cursor5 == null) {
                                        cursor5.close();
                                        npVar6 = null;
                                    } else {
                                        npVar6 = null;
                                    }
                                    while (r4.hasNext()) {
                                    }
                                    it5 = hashSet.iterator();
                                    while (it5.hasNext()) {
                                    }
                                    String str192 = "Database error querying filters. appId";
                                    String str202 = "data";
                                    if (list.isEmpty()) {
                                    }
                                    if (!list2.isEmpty()) {
                                    }
                                    ArrayList arrayList2 = new ArrayList();
                                    Set<Integer> keySet2 = this.f65289c.keySet();
                                    keySet2.removeAll(this.f65288b);
                                    while (r3.hasNext()) {
                                    }
                                    return arrayList2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    cursor4 = null;
                                    if (cursor4 != null) {
                                        cursor4.close();
                                    }
                                    throw th;
                                }
                                for (Integer num2 : npVar.keySet()) {
                                    int intValue = num2.intValue();
                                    Integer valueOf2 = Integer.valueOf(intValue);
                                    agno agno = (agno) npVar.get(valueOf2);
                                    List list5 = (List) npVar6.get(valueOf2);
                                    if (list5 == null || list5.isEmpty()) {
                                        npVar4.put(valueOf2, agno);
                                        i4 = 5;
                                    } else {
                                        List a = mo35657o().mo35710a(agno.f66137b, list5);
                                        if (!a.isEmpty()) {
                                            bxvd bxvd = (bxvd) agno.mo74142c(i4);
                                            bxvd.mo73625a((bxvk) agno);
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            agno agno2 = agno.f66134e;
                                            ((agno) bxvd.f164949b).f66137b = bxvk.m124029dd();
                                            bxvd.mo73962Y(a);
                                            List a2 = mo35657o().mo35710a(agno.f66136a, list5);
                                            if (bxvd.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd.f164950c = false;
                                            }
                                            ((agno) bxvd.f164949b).f66136a = bxvk.m124029dd();
                                            bxvd.mo73963Z(a2);
                                            for (int i5 = 0; i5 < agno.f66138c.size(); i5++) {
                                                if (list5.contains(Integer.valueOf(((agnh) agno.f66138c.get(i5)).f66062b))) {
                                                    if (bxvd.f164950c) {
                                                        bxvd.mo74035c();
                                                        bxvd.f164950c = false;
                                                    }
                                                    agno agno3 = (agno) bxvd.f164949b;
                                                    agno3.mo35760a();
                                                    agno3.f66138c.remove(i5);
                                                }
                                            }
                                            for (int i6 = 0; i6 < agno.f66139d.size(); i6++) {
                                                if (list5.contains(Integer.valueOf(((agnp) agno.f66139d.get(i6)).f66143b))) {
                                                    if (bxvd.f164950c) {
                                                        bxvd.mo74035c();
                                                        bxvd.f164950c = false;
                                                    }
                                                    agno agno4 = (agno) bxvd.f164949b;
                                                    agno4.mo35761b();
                                                    agno4.f66139d.remove(i6);
                                                }
                                            }
                                            npVar4.put(Integer.valueOf(intValue), (agno) bxvd.mo74062i());
                                            i4 = 5;
                                        } else {
                                            i4 = 5;
                                        }
                                    }
                                }
                            }
                        } else {
                            npVar4 = npVar;
                        }
                        it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            int intValue2 = ((Integer) it5.next()).intValue();
                            agno agno5 = (agno) npVar4.get(Integer.valueOf(intValue2));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            C1223np npVar7 = new C1223np();
                            if (agno5 != null) {
                                if (agno5.f66138c.size() != 0) {
                                    bxwc bxwc3 = agno5.f66138c;
                                    int size = bxwc3.size();
                                    int i7 = 0;
                                    while (i7 < size) {
                                        agnh agnh = (agnh) bxwc3.get(i7);
                                        if ((agnh.f66061a & 1) != 0) {
                                            Integer valueOf3 = Integer.valueOf(agnh.f66062b);
                                            it7 = it5;
                                            if ((agnh.f66061a & 2) != 0) {
                                                bxwc2 = bxwc3;
                                                i2 = size;
                                                l2 = Long.valueOf(agnh.f66063c);
                                            } else {
                                                bxwc2 = bxwc3;
                                                i2 = size;
                                                l2 = null;
                                            }
                                            npVar7.put(valueOf3, l2);
                                        } else {
                                            it7 = it5;
                                            bxwc2 = bxwc3;
                                            i2 = size;
                                        }
                                        i7++;
                                        bxwc3 = bxwc2;
                                        it5 = it7;
                                        size = i2;
                                    }
                                }
                                it6 = it5;
                            } else {
                                it6 = it5;
                            }
                            C1223np npVar8 = new C1223np();
                            if (!(agno5 == null || agno5.f66139d.size() == 0)) {
                                bxwc bxwc4 = agno5.f66139d;
                                int size2 = bxwc4.size();
                                int i8 = 0;
                                while (i8 < size2) {
                                    agnp agnp = (agnp) bxwc4.get(i8);
                                    if ((agnp.f66142a & 1) == 0) {
                                        bxwc = bxwc4;
                                    } else if (agnp.f66144c.size() > 0) {
                                        bxwc = bxwc4;
                                        npVar8.put(Integer.valueOf(agnp.f66143b), Long.valueOf(agnp.f66144c.mo74160a(agnp.f66144c.size() - 1)));
                                    } else {
                                        bxwc = bxwc4;
                                    }
                                    i8++;
                                    bxwc4 = bxwc;
                                }
                            }
                            if (agno5 != null) {
                                for (int i9 = 0; i9 < agno5.f66136a.size() * 64; i9++) {
                                    if (agmp.m54573a(agno5.f66136a, i9)) {
                                        mo35497E().f65572k.mo35437a("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i9));
                                        bitSet2.set(i9);
                                        if (agmp.m54573a(agno5.f66137b, i9)) {
                                            bitSet.set(i9);
                                        }
                                    }
                                    npVar7.remove(Integer.valueOf(i9));
                                }
                            }
                            Integer valueOf4 = Integer.valueOf(intValue2);
                            this.f65289c.put(valueOf4, new agcy((agno) npVar.get(valueOf4), bitSet, bitSet2, npVar7, npVar8));
                            it5 = it6;
                        }
                    }
                    String str1922 = "Database error querying filters. appId";
                    String str2022 = "data";
                    if (list.isEmpty()) {
                        agcz agcz2 = new agcz(this);
                        C1223np npVar9 = new C1223np();
                        Iterator it9 = list.iterator();
                        while (it9.hasNext()) {
                            agni agni = (agni) it9.next();
                            agni a3 = agcz2.mo35300a(this.f65287a, agni);
                            if (a3 != null) {
                                agdl n4 = mo35656n();
                                String str21 = this.f65287a;
                                String str22 = a3.f66068c;
                                agdr a4 = n4.mo35338a(str21, agni.f66068c);
                                if (a4 == null) {
                                    n4.mo35497E().f65567f.mo35437a("Event aggregate wasn't created during raw event logging. appId, event", agid.m54288a(str21), n4.mo35541y().mo35422a(str22));
                                    agdr = new agdr(str21, agni.f66068c, 1, 1, 1, agni.f66069d, 0, null, null, null, null);
                                } else {
                                    agdr = new agdr(a4.f65330a, a4.f65331b, a4.f65332c + 1, a4.f65333d + 1, a4.f65334e + 1, a4.f65335f, a4.f65336g, a4.f65337h, a4.f65338i, a4.f65339j, a4.f65340k);
                                }
                                mo35656n().mo35343a(agdr);
                                long j = agdr.f65332c;
                                String str23 = a3.f66068c;
                                Map map4 = (Map) npVar9.get(str23);
                                if (map4 == null) {
                                    agdl n5 = mo35656n();
                                    agcz = agcz2;
                                    String str24 = this.f65287a;
                                    n5.mo35659q();
                                    n5.mo35241h();
                                    sdo.m34977c(str24);
                                    sdo.m34977c(str23);
                                    it4 = it9;
                                    C1223np npVar10 = new C1223np();
                                    str12 = str14;
                                    try {
                                        str11 = str2022;
                                        str13 = null;
                                        cursor3 = n5.mo35360e().query("event_filters", new String[]{str15, str2022}, "app_id=? AND event_name=?", new String[]{str24, str23}, null, null, null);
                                        try {
                                            if (cursor3.moveToFirst()) {
                                                while (true) {
                                                    try {
                                                        agmu agmu = (agmu) ((bxvd) agmp.m54563a((bxxb) agmu.f65988i.mo74144da(), cursor3.getBlob(1))).mo74062i();
                                                        Integer valueOf5 = Integer.valueOf(cursor3.getInt(0));
                                                        List list6 = (List) npVar10.get(valueOf5);
                                                        if (list6 == null) {
                                                            str13 = str15;
                                                            list3 = new ArrayList();
                                                            npVar10.put(valueOf5, list3);
                                                        } else {
                                                            str13 = str15;
                                                            list3 = list6;
                                                        }
                                                        list3.add(agmu);
                                                        npVar3 = npVar10;
                                                    } catch (IOException e5) {
                                                        str13 = str15;
                                                        npVar3 = npVar10;
                                                        n5.mo35497E().f65564c.mo35437a("Failed to merge filter. appId", agid.m54288a(str24), e5);
                                                    }
                                                    if (!cursor3.moveToNext()) {
                                                        break;
                                                    }
                                                    npVar10 = npVar3;
                                                    str15 = str13;
                                                }
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                map4 = npVar3;
                                                if (map4 == null) {
                                                    map4 = new C1223np();
                                                }
                                                npVar9.put(str23, map4);
                                            } else {
                                                str13 = str15;
                                                map4 = Collections.emptyMap();
                                                if (cursor3 != null) {
                                                    cursor3.close();
                                                }
                                                if (map4 == null) {
                                                }
                                                npVar9.put(str23, map4);
                                            }
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            try {
                                                n5.mo35497E().f65564c.mo35437a(str1922, agid.m54288a(str24), e);
                                                if (cursor3 == null) {
                                                }
                                                if (map4 == null) {
                                                }
                                                npVar9.put(str23, map4);
                                                while (r2.hasNext()) {
                                                }
                                                it9 = it4;
                                                agcz2 = agcz;
                                                str15 = str13;
                                                str14 = str12;
                                                str2022 = str11;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                Cursor cursor6 = cursor3;
                                                if (cursor6 != null) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                        }
                                    } catch (SQLiteException e7) {
                                        e = e7;
                                        str13 = str15;
                                        cursor3 = null;
                                        n5.mo35497E().f65564c.mo35437a(str1922, agid.m54288a(str24), e);
                                        if (cursor3 == null) {
                                        }
                                        if (map4 == null) {
                                        }
                                        npVar9.put(str23, map4);
                                        while (r2.hasNext()) {
                                        }
                                        it9 = it4;
                                        agcz2 = agcz;
                                        str15 = str13;
                                        str14 = str12;
                                        str2022 = str11;
                                    } catch (Throwable th6) {
                                    }
                                } else {
                                    str12 = str14;
                                    str13 = str15;
                                    str11 = str2022;
                                    agcz = agcz2;
                                    it4 = it9;
                                }
                                for (Integer num3 : map4.keySet()) {
                                    int intValue3 = num3.intValue();
                                    Set set = this.f65288b;
                                    Integer valueOf6 = Integer.valueOf(intValue3);
                                    if (set.contains(valueOf6)) {
                                        mo35497E().f65572k.mo35436a("Skipping failed audience ID", valueOf6);
                                    } else {
                                        Iterator it10 = ((List) map4.get(valueOf6)).iterator();
                                        boolean z3 = true;
                                        while (true) {
                                            if (!it10.hasNext()) {
                                                map3 = map4;
                                                break;
                                            }
                                            agmu agmu2 = (agmu) it10.next();
                                            agda agda = new agda(this, this.f65287a, intValue3, agmu2);
                                            z3 = agda.mo35302a(a3, j, agdr, m54031a(intValue3, agmu2.f65991b));
                                            map3 = map4;
                                            if (!mo35538v().mo35320c(this.f65287a, aghn.f65470Z)) {
                                                m54030a(intValue3).mo35299a(agda);
                                            } else if (!z3) {
                                                this.f65288b.add(Integer.valueOf(intValue3));
                                                break;
                                            } else {
                                                m54030a(intValue3).mo35299a(agda);
                                            }
                                            map4 = map3;
                                        }
                                        if (!z3) {
                                            this.f65288b.add(Integer.valueOf(intValue3));
                                            map4 = map3;
                                        } else {
                                            map4 = map3;
                                        }
                                    }
                                }
                                it9 = it4;
                                agcz2 = agcz;
                                str15 = str13;
                                str14 = str12;
                                str2022 = str11;
                            }
                        }
                        str3 = str14;
                        str4 = str15;
                        str2 = str2022;
                    } else {
                        str3 = str14;
                        str4 = str15;
                        str2 = str2022;
                    }
                    if (!list2.isEmpty()) {
                        C1223np npVar11 = new C1223np();
                        Iterator it11 = list2.iterator();
                        while (it11.hasNext()) {
                            agnq agnq = (agnq) it11.next();
                            String str25 = agnq.f66149c;
                            Map map5 = (Map) npVar11.get(str25);
                            if (map5 == null) {
                                agdl n6 = mo35656n();
                                String str26 = this.f65287a;
                                n6.mo35659q();
                                n6.mo35241h();
                                sdo.m34977c(str26);
                                sdo.m34977c(str25);
                                Map npVar12 = new C1223np();
                                try {
                                    Cursor query = n6.mo35360e().query("property_filters", new String[]{str4, str2}, "app_id=? AND property_name=?", new String[]{str26, str25}, null, null, null);
                                    try {
                                        if (query.moveToFirst()) {
                                            do {
                                                try {
                                                    agmz agmz = (agmz) ((bxvd) agmp.m54563a((bxxb) agmz.f66014h.mo74144da(), query.getBlob(1))).mo74062i();
                                                    Integer valueOf7 = Integer.valueOf(query.getInt(0));
                                                    List list7 = (List) npVar12.get(valueOf7);
                                                    if (list7 == null) {
                                                        list7 = new ArrayList();
                                                        npVar12.put(valueOf7, list7);
                                                    }
                                                    list7.add(agmz);
                                                } catch (IOException e8) {
                                                    n6.mo35497E().f65564c.mo35437a("Failed to merge filter", agid.m54288a(str26), e8);
                                                }
                                            } while (query.moveToNext());
                                        } else {
                                            npVar12 = Collections.emptyMap();
                                        }
                                        query.close();
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        cursor2 = query;
                                        try {
                                            n6.mo35497E().f65564c.mo35437a(str7, agid.m54288a(str26), e);
                                            if (cursor2 == null) {
                                            }
                                            if (npVar12 == null) {
                                            }
                                            npVar11.put(str25, map5);
                                            it = map5.keySet().iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                }
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            if (cursor2 != null) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        cursor2 = query;
                                        if (cursor2 != null) {
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    cursor2 = null;
                                    n6.mo35497E().f65564c.mo35437a(str7, agid.m54288a(str26), e);
                                    if (cursor2 == null) {
                                        cursor2.close();
                                        npVar12 = null;
                                    } else {
                                        npVar12 = null;
                                    }
                                    if (npVar12 == null) {
                                    }
                                    npVar11.put(str25, map5);
                                    it = map5.keySet().iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor2 = null;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                                if (npVar12 == null) {
                                    map5 = new C1223np();
                                } else {
                                    map5 = npVar12;
                                }
                                npVar11.put(str25, map5);
                            }
                            it = map5.keySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str1922 = str7;
                                    break;
                                }
                                int intValue4 = ((Integer) it.next()).intValue();
                                Set set2 = this.f65288b;
                                Integer valueOf8 = Integer.valueOf(intValue4);
                                if (set2.contains(valueOf8)) {
                                    mo35497E().f65572k.mo35436a("Skipping failed audience ID", valueOf8);
                                    str1922 = str7;
                                    break;
                                }
                                Iterator it12 = ((List) map5.get(valueOf8)).iterator();
                                boolean z4 = true;
                                while (true) {
                                    if (!it12.hasNext()) {
                                        map = map5;
                                        npVar2 = npVar11;
                                        it2 = it11;
                                        str8 = str7;
                                        break;
                                    }
                                    agmz agmz2 = (agmz) it12.next();
                                    String str27 = "null";
                                    if (mo35497E().mo35441a(2)) {
                                        map = map5;
                                        mo35497E().f65572k.mo35438a("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), (agmz2.f66016a & 1) != 0 ? Integer.valueOf(agmz2.f66017b) : null, mo35541y().mo35426c(agmz2.f66018c));
                                        agib agib = mo35497E().f65572k;
                                        agmp o = mo35657o();
                                        if (agmz2 != null) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("\nproperty_filter {\n");
                                            if ((agmz2.f66016a & 1) != 0) {
                                                npVar2 = npVar11;
                                                i = 0;
                                                agmp.m54569a(sb, 0, "filter_id", Integer.valueOf(agmz2.f66017b));
                                            } else {
                                                npVar2 = npVar11;
                                                i = 0;
                                            }
                                            agmp.m54569a(sb, i, "property_name", o.mo35541y().mo35426c(agmz2.f66018c));
                                            String a5 = agmp.m54564a(agmz2.f66020e, agmz2.f66021f, agmz2.f66022g);
                                            if (!a5.isEmpty()) {
                                                agmp.m54569a(sb, 0, "filter_type", a5);
                                            }
                                            agmv agmv = agmz2.f66019d;
                                            if (agmv == null) {
                                                agmv = agmv.f65998f;
                                            }
                                            o.mo35713a(sb, 1, agmv);
                                            sb.append("}\n");
                                            str10 = sb.toString();
                                        } else {
                                            npVar2 = npVar11;
                                            str10 = str27;
                                        }
                                        agib.mo35436a("Filter definition", str10);
                                    } else {
                                        map = map5;
                                        npVar2 = npVar11;
                                    }
                                    if ((agmz2.f66016a & 1) != 0) {
                                        if (agmz2.f66017b > 256) {
                                            it3 = it11;
                                            str9 = str7;
                                            break;
                                        }
                                        agdc agdc = new agdc(this, this.f65287a, intValue4, agmz2);
                                        Long l3 = this.f65290d;
                                        boolean a6 = m54031a(intValue4, agmz2.f66017b);
                                        cfiw.m139808c();
                                        agmz agmz3 = agdc.f65285a;
                                        boolean z5 = agmz3.f66020e;
                                        boolean z6 = agmz3.f66021f;
                                        boolean z7 = agmz3.f66022g;
                                        if (z5) {
                                            z2 = true;
                                        } else {
                                            z2 = z6 || z7;
                                        }
                                        if (a6 && !z2) {
                                            agib agib2 = agdc.f65286h.mo35497E().f65572k;
                                            Integer valueOf9 = Integer.valueOf(agdc.f65280c);
                                            agmz agmz4 = agdc.f65285a;
                                            if ((agmz4.f66016a & 1) != 0) {
                                                num = Integer.valueOf(agmz4.f66017b);
                                            } else {
                                                num = null;
                                            }
                                            agib2.mo35437a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf9, num);
                                            it2 = it11;
                                            str8 = str7;
                                            z4 = true;
                                        } else {
                                            agmv agmv2 = agmz3.f66019d;
                                            if (agmv2 == null) {
                                                agmv2 = agmv.f65998f;
                                            }
                                            boolean z8 = agmv2.f66003d;
                                            it2 = it11;
                                            int i10 = agnq.f66147a;
                                            if ((i10 & 8) != 0) {
                                                str8 = str7;
                                                if ((agmv2.f66000a & 2) != 0) {
                                                    long j2 = agnq.f66151e;
                                                    agmy agmy = agmv2.f66002c;
                                                    if (agmy == null) {
                                                        agmy = agmy.f66006g;
                                                    }
                                                    bool = agdc.m54021a(agdc.m54020a(j2, agmy), z8);
                                                } else {
                                                    agdc.f65286h.mo35497E().f65567f.mo35436a("No number filter for long property. property", agdc.f65286h.mo35541y().mo35426c(agnq.f66149c));
                                                    bool = null;
                                                }
                                            } else if ((i10 & 32) != 0) {
                                                str8 = str7;
                                                if ((agmv2.f66000a & 2) != 0) {
                                                    double d = agnq.f66152f;
                                                    agmy agmy2 = agmv2.f66002c;
                                                    if (agmy2 == null) {
                                                        agmy2 = agmy.f66006g;
                                                    }
                                                    bool = agdc.m54021a(agdc.m54019a(d, agmy2), z8);
                                                } else {
                                                    agdc.f65286h.mo35497E().f65567f.mo35436a("No number filter for double property. property", agdc.f65286h.mo35541y().mo35426c(agnq.f66149c));
                                                    bool = null;
                                                }
                                            } else if ((i10 & 4) == 0) {
                                                agdc.f65286h.mo35497E().f65567f.mo35436a("User property has no value, property", agdc.f65286h.mo35541y().mo35426c(agnq.f66149c));
                                                str8 = str7;
                                                bool = null;
                                            } else {
                                                int i11 = agmv2.f66000a;
                                                if ((i11 & 1) != 0) {
                                                    String str28 = agnq.f66150d;
                                                    agnc agnc = agmv2.f66001b;
                                                    if (agnc == null) {
                                                        agnc = agnc.f66024f;
                                                    }
                                                    str8 = str7;
                                                    bool = agdc.m54021a(agdc.m54024a(str28, agnc, agdc.f65286h.mo35497E()), z8);
                                                } else {
                                                    str8 = str7;
                                                    if ((i11 & 2) == 0) {
                                                        agdc.f65286h.mo35497E().f65567f.mo35436a("No string or number filter defined. property", agdc.f65286h.mo35541y().mo35426c(agnq.f66149c));
                                                        bool = null;
                                                    } else if (!agmp.m54572a(agnq.f66150d)) {
                                                        agdc.f65286h.mo35497E().f65567f.mo35437a("Invalid user property value for Numeric number filter. property, value", agdc.f65286h.mo35541y().mo35426c(agnq.f66149c), agnq.f66150d);
                                                        bool = null;
                                                    } else {
                                                        String str29 = agnq.f66150d;
                                                        agmy agmy3 = agmv2.f66002c;
                                                        if (agmy3 == null) {
                                                            agmy3 = agmy.f66006g;
                                                        }
                                                        bool = agdc.m54021a(agdc.m54023a(str29, agmy3), z8);
                                                    }
                                                }
                                            }
                                            agib agib3 = agdc.f65286h.mo35497E().f65572k;
                                            if (bool != null) {
                                                str27 = bool;
                                            }
                                            agib3.mo35436a("Property filter result", str27);
                                            if (bool != null) {
                                                agdc.f65281d = true;
                                                if (!z7 || bool.booleanValue()) {
                                                    if (!a6 || agdc.f65285a.f66020e) {
                                                        agdc.f65282e = bool;
                                                    }
                                                    if (!bool.booleanValue()) {
                                                        z4 = true;
                                                    } else {
                                                        if (z2 && (agnq.f66147a & 1) != 0) {
                                                            long j3 = agnq.f66148b;
                                                            if (l3 != null) {
                                                                j3 = l3.longValue();
                                                            }
                                                            if (agdc.f65285a.f66021f) {
                                                                agdc.f65284g = Long.valueOf(j3);
                                                                z4 = true;
                                                            } else {
                                                                agdc.f65283f = Long.valueOf(j3);
                                                            }
                                                        }
                                                        z4 = true;
                                                    }
                                                } else {
                                                    z4 = true;
                                                }
                                            } else {
                                                z4 = false;
                                            }
                                        }
                                        if (!mo35538v().mo35320c(this.f65287a, aghn.f65470Z)) {
                                            m54030a(intValue4).mo35299a(agdc);
                                        } else if (!z4) {
                                            this.f65288b.add(Integer.valueOf(intValue4));
                                            break;
                                        } else {
                                            m54030a(intValue4).mo35299a(agdc);
                                        }
                                        map5 = map;
                                        it11 = it2;
                                        npVar11 = npVar2;
                                        str7 = str8;
                                    } else {
                                        it3 = it11;
                                        str9 = str7;
                                        break;
                                    }
                                }
                                if (z4) {
                                    map2 = map;
                                    it11 = it2;
                                    npVar11 = npVar2;
                                    str7 = str8;
                                }
                                this.f65288b.add(Integer.valueOf(intValue4));
                                map2 = map;
                                it11 = it2;
                                npVar11 = npVar2;
                                str7 = str8;
                            }
                        }
                    }
                    ArrayList arrayList22 = new ArrayList();
                    Set<Integer> keySet22 = this.f65289c.keySet();
                    keySet22.removeAll(this.f65288b);
                    for (Integer num4 : keySet22) {
                        int intValue5 = num4.intValue();
                        Map map6 = this.f65289c;
                        Integer valueOf10 = Integer.valueOf(intValue5);
                        agng a7 = ((agcy) map6.get(valueOf10)).mo35298a(intValue5);
                        arrayList22.add(a7);
                        agdl n7 = mo35656n();
                        String str30 = this.f65287a;
                        agno agno6 = a7.f66056c;
                        if (agno6 == null) {
                            agno6 = agno.f66134e;
                        }
                        n7.mo35659q();
                        n7.mo35241h();
                        sdo.m34977c(str30);
                        sdo.m34959a(agno6);
                        byte[] k = agno6.mo73642k();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str30);
                        String str31 = str4;
                        contentValues2.put(str31, valueOf10);
                        String str32 = str3;
                        contentValues2.put(str32, k);
                        try {
                            try {
                                if (n7.mo35360e().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    n7.mo35497E().f65564c.mo35436a("Failed to insert filter results (got -1). appId", agid.m54288a(str30));
                                    str5 = str32;
                                    str6 = str31;
                                } else {
                                    str5 = str32;
                                    str6 = str31;
                                }
                            } catch (SQLiteException e11) {
                                e = e11;
                                n7.mo35497E().f65564c.mo35437a("Error storing filter results. appId", agid.m54288a(str30), e);
                                str5 = str32;
                                str6 = str31;
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            n7.mo35497E().f65564c.mo35437a("Error storing filter results. appId", agid.m54288a(str30), e);
                            str5 = str32;
                            str6 = str31;
                        }
                    }
                    return arrayList22;
                }
            } catch (SQLiteException e13) {
                e = e13;
                try {
                    n2.mo35497E().f65564c.mo35437a("Database error querying filter results. appId", agid.m54288a(str17), e);
                    if (cursor == null) {
                        npVar = null;
                        int i42 = 5;
                        HashSet hashSet2 = new HashSet(npVar.keySet());
                        if (!z) {
                        }
                        it5 = hashSet2.iterator();
                        while (it5.hasNext()) {
                        }
                        String str19222 = "Database error querying filters. appId";
                        String str20222 = "data";
                        if (list.isEmpty()) {
                        }
                        if (!list2.isEmpty()) {
                        }
                        ArrayList arrayList222 = new ArrayList();
                        Set<Integer> keySet222 = this.f65289c.keySet();
                        keySet222.removeAll(this.f65288b);
                        while (r3.hasNext()) {
                        }
                        return arrayList222;
                    }
                    cursor.close();
                    npVar = null;
                    int i422 = 5;
                    HashSet hashSet22 = new HashSet(npVar.keySet());
                    if (!z) {
                    }
                    it5 = hashSet22.iterator();
                    while (it5.hasNext()) {
                    }
                    String str192222 = "Database error querying filters. appId";
                    String str202222 = "data";
                    if (list.isEmpty()) {
                    }
                    if (!list2.isEmpty()) {
                    }
                    ArrayList arrayList2222 = new ArrayList();
                    Set<Integer> keySet2222 = this.f65289c.keySet();
                    keySet2222.removeAll(this.f65288b);
                    while (r3.hasNext()) {
                    }
                    return arrayList2222;
                } catch (Throwable th10) {
                    th = th10;
                    if (cursor != null) {
                    }
                    throw th;
                }
            } catch (Throwable th11) {
                th = th11;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e14) {
            e = e14;
            cursor = null;
            n2.mo35497E().f65564c.mo35437a("Database error querying filter results. appId", agid.m54288a(str17), e);
            if (cursor == null) {
            }
            cursor.close();
            npVar = null;
            int i4222 = 5;
            HashSet hashSet222 = new HashSet(npVar.keySet());
            if (!z) {
            }
            it5 = hashSet222.iterator();
            while (it5.hasNext()) {
            }
            String str1922222 = "Database error querying filters. appId";
            String str2022222 = "data";
            if (list.isEmpty()) {
            }
            if (!list2.isEmpty()) {
            }
            ArrayList arrayList22222 = new ArrayList();
            Set<Integer> keySet22222 = this.f65289c.keySet();
            keySet22222.removeAll(this.f65288b);
            while (r3.hasNext()) {
            }
            return arrayList22222;
        } catch (Throwable th12) {
            th = th12;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
    }
}
