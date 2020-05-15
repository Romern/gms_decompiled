package p000;

import android.content.Context;
import android.util.SparseArray;
import com.google.android.contextmanager.fence.PlaceFenceHelper;
import com.google.android.gms.awareness.fence.FenceState;
import com.google.android.gms.contextmanager.fence.internal.FenceUpdateRequestImpl;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dro extends dwm {

    /* renamed from: a */
    public final Context f13884a;

    public dro(Context context) {
        this.f13884a = context;
    }

    /* renamed from: a */
    public static final void m9170a(drx drx, dqx dqx) {
        drx.f13913b = dqx;
        dwq.m9658b().mo16658a(drx);
    }

    /* renamed from: a */
    public static final void m9171a(PrintWriter printWriter) {
        int i;
        String str;
        String str2;
        dtl dtl;
        String str3;
        PrintWriter printWriter2 = printWriter;
        String str4 = "        ";
        try {
            printWriter2.println("\n== Begin Context Manager State ==\n");
            egr C = dwq.m9646C();
            tnt tnt = null;
            tjr tjr = new tjr(null);
            tkb tkb = new tkb();
            tkb.mo26624b();
            tjr.mo26596a(5, tkb.mo26620a());
            ArrayList a = dwq.m9673q().mo10052a(tjr.mo26595a());
            printWriter.println();
            printWriter2.println(">>> WorkManager <<<");
            Iterator it = a.iterator();
            while (it.hasNext()) {
                try {
                    egr.m10366a(printWriter2, (tnt) bxvk.m124016a(tnt.f46353g, ((tjq) it.next()).mo26593c(), bxus.m123744c()));
                } catch (bxwf e) {
                    bxwf bxwf = e;
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    bnsl.mo68437a(bxwf);
                    bnsl.mo68432a("egr", "a", 115, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("[WorkManager] Could not parse work stats");
                }
            }
            synchronized (C.f14872a) {
                if (!C.f14872a.mo10117b()) {
                    tnt = C.f14872a.mo10118c();
                }
            }
            if (tnt != null) {
                egr.m10366a(printWriter2, tnt);
            }
            synchronized (C.f14873b) {
                if (!C.f14873b.isEmpty()) {
                    LinkedHashSet<dqx> linkedHashSet = new LinkedHashSet(C.f14873b);
                    long b = dwq.m9665i().mo20506b();
                    printWriter2.println("[Ongoing tasks]");
                    for (dqx dqx : linkedHashSet) {
                        long e2 = dqx.mo9466e();
                        long j = b - dqx.f13842c;
                        if (e2 < 0) {
                            e2 = j;
                            j = -1 + j;
                        }
                        String str5 = dqx.f13840a;
                        StringBuilder sb = new StringBuilder(String.valueOf(str5).length() + 49);
                        sb.append("  \"");
                        sb.append(str5);
                        sb.append("\": ");
                        sb.append(e2);
                        sb.append("/");
                        sb.append(j - e2);
                        sb.append("ms");
                        printWriter2.println(sb.toString());
                    }
                }
            }
            dtl E = dwq.m9648E();
            printWriter.println();
            printWriter2.println(">>> FenceManager <<<");
            dto dto = E.f13991b;
            int size = dto.f14001d.size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Num fence listener consumers=");
            sb2.append(size);
            printWriter2.println(sb2.toString());
            Iterator it2 = dto.f14001d.values().iterator();
            int i2 = 0;
            while (true) {
                i = 23;
                if (!it2.hasNext()) {
                    break;
                }
                drk drk = (drk) it2.next();
                int i3 = i2 + 1;
                StringBuilder sb3 = new StringBuilder(23);
                sb3.append("Consumer[");
                sb3.append(i2);
                sb3.append("]: ");
                printWriter2.print(sb3.toString());
                String valueOf = String.valueOf(drk.f13876a);
                int size2 = drk.f13877b.size();
                StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb4.append("consumer={");
                sb4.append(valueOf);
                sb4.append("} (");
                sb4.append(size2);
                sb4.append(" fences)");
                printWriter2.println(sb4.toString());
                boolean a2 = dtl.m9294a(drk.f13876a.f13872a);
                int i4 = 0;
                for (Map.Entry entry : drk.f13877b.entrySet()) {
                    String str6 = (String) entry.getKey();
                    duu duu = (duu) entry.getValue();
                    String str7 = "";
                    if (!a2) {
                        str3 = str4;
                        dtl = E;
                    } else {
                        long j2 = duu.f14120c;
                        String num = Integer.toString(duu.f14134q);
                        str3 = str4;
                        dtl = E;
                        StringBuilder sb5 = new StringBuilder(String.valueOf(num).length() + 24);
                        sb5.append(", ");
                        sb5.append(j2);
                        sb5.append(", ");
                        sb5.append(num);
                        str7 = sb5.toString();
                    }
                    StringBuilder sb6 = new StringBuilder(String.valueOf(str6).length() + 35 + String.valueOf(str7).length());
                    sb6.append("  ");
                    sb6.append("Fence[");
                    sb6.append(i4);
                    sb6.append("]: fenceKey=\"");
                    sb6.append(str6);
                    sb6.append("\"");
                    sb6.append(str7);
                    sb6.append(");");
                    printWriter2.println(sb6.toString());
                    long j3 = duu.f14133p;
                    String a3 = FenceState.m7188a(duu.f14129l);
                    long j4 = duu.f14132o;
                    int i5 = i4 + 1;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(a3).length() + 62);
                    sb7.append("  ");
                    sb7.append("reg_time: ");
                    sb7.append(j3);
                    sb7.append("; state: ");
                    sb7.append(a3);
                    sb7.append("@");
                    sb7.append(j4);
                    printWriter2.println(sb7.toString());
                    printWriter2.println(duu.f14119b);
                    i4 = i5;
                    str4 = str3;
                    E = dtl;
                }
                i2 = i3;
            }
            dto.f14002e.f14019f.mo25063a(printWriter2);
            printWriter2.println("Geofences:");
            int i6 = 0;
            for (Map.Entry entry2 : dto.f13999b.mo67364r()) {
                String str8 = (String) entry2.getKey();
                String valueOf2 = String.valueOf(entry2.getValue());
                StringBuilder sb8 = new StringBuilder(String.valueOf(str8).length() + 16 + String.valueOf(valueOf2).length());
                sb8.append(" ");
                sb8.append(i6);
                sb8.append(": ");
                sb8.append(str8);
                sb8.append(", ");
                sb8.append(valueOf2);
                printWriter2.println(sb8.toString());
                i6++;
                i = 23;
            }
            PlaceFenceHelper placeFenceHelper = E.f13994e;
            printWriter.println();
            int size3 = placeFenceHelper.f7706b.size();
            StringBuilder sb9 = new StringBuilder(38);
            sb9.append(">>> PlaceFenceHelper <<< (");
            sb9.append(size3);
            sb9.append(")");
            printWriter2.println(sb9.toString());
            for (dug dug : placeFenceHelper.f7706b.keySet()) {
                String valueOf3 = String.valueOf(dug);
                StringBuilder sb10 = new StringBuilder(String.valueOf(valueOf3).length() + 6);
                sb10.append("  key ");
                sb10.append(valueOf3);
                printWriter2.println(sb10.toString());
                printWriter2.print("   ");
                for (dvd dvd : ((duh) placeFenceHelper.f7706b.get(dug)).f14039a.keySet()) {
                    String hexString = Integer.toHexString(System.identityHashCode(dvd));
                    StringBuilder sb11 = new StringBuilder(String.valueOf(hexString).length() + 3);
                    sb11.append(" @");
                    sb11.append(hexString);
                    sb11.append(",");
                    printWriter2.print(sb11.toString());
                }
                printWriter.println();
                printWriter.println();
            }
            dvx r = dwq.m9674r();
            printWriter.println();
            int size4 = r.f14223a.size();
            StringBuilder sb12 = new StringBuilder(50);
            sb12.append(">>> InterestManager (num accounts=");
            sb12.append(size4);
            sb12.append(") <<<");
            printWriter2.println(sb12.toString());
            Iterator it3 = r.f14223a.entrySet().iterator();
            int i7 = 0;
            while (true) {
                int i8 = 17;
                if (!it3.hasNext()) {
                    break;
                }
                Map.Entry entry3 = (Map.Entry) it3.next();
                int i9 = i7 + 1;
                String doh = ((doh) entry3.getKey()).toString();
                StringBuilder sb13 = new StringBuilder(String.valueOf(doh).length() + i);
                sb13.append("Account[");
                sb13.append(i7);
                sb13.append("] : ");
                sb13.append(doh);
                printWriter2.println(sb13.toString());
                dwf dwf = (dwf) entry3.getValue();
                int size5 = dwf.f14258a.size();
                StringBuilder sb14 = new StringBuilder(36);
                sb14.append("  Num interest records = ");
                sb14.append(size5);
                printWriter2.println(sb14.toString());
                if (size5 != 0) {
                    SparseArray sparseArray = new SparseArray();
                    for (dwa dwa : dwf.f14258a.values()) {
                        List list = (List) sparseArray.get(dwa.mo9747b().f162973bD);
                        if (list == null) {
                            list = new ArrayList();
                            sparseArray.put(dwa.mo9747b().f162973bD, list);
                        }
                        list.add(dwa);
                    }
                    int i10 = 0;
                    while (i10 < sparseArray.size()) {
                        int keyAt = sparseArray.keyAt(i10);
                        List<dwa> list2 = (List) sparseArray.valueAt(i10);
                        String num2 = Integer.toString(keyAt);
                        int size6 = list2.size();
                        StringBuilder sb15 = new StringBuilder(String.valueOf(num2).length() + 15);
                        sb15.append("  ");
                        sb15.append(num2);
                        sb15.append("(");
                        sb15.append(size6);
                        sb15.append(")");
                        printWriter2.println(sb15.toString());
                        int i11 = 0;
                        for (dwa dwa2 : list2) {
                            StringBuilder sb16 = new StringBuilder(i8);
                            sb16.append("  [");
                            sb16.append(i11);
                            sb16.append("]: ");
                            printWriter2.print(sb16.toString());
                            dwa2.mo9746a(printWriter2);
                            i11++;
                            i8 = 17;
                        }
                        i10++;
                        i8 = 17;
                    }
                }
                i7 = i9;
                i = 23;
            }
            if (r.f14226d) {
                int size7 = r.f14224b.f14211a.size();
                StringBuilder sb17 = new StringBuilder(38);
                sb17.append("\nPending InterestRecords (");
                sb17.append(size7);
                sb17.append(")");
                printWriter2.println(sb17.toString());
                Iterator it4 = new ArrayList(r.f14224b.f14211a).iterator();
                int i12 = 0;
                while (it4.hasNext()) {
                    StringBuilder sb18 = new StringBuilder(16);
                    sb18.append("   ");
                    sb18.append(i12);
                    sb18.append(": ");
                    printWriter2.print(sb18.toString());
                    ((dwa) it4.next()).mo9746a(printWriter2);
                    i12++;
                }
                int size8 = r.f14227e.size();
                StringBuilder sb19 = new StringBuilder(44);
                sb19.append("\nLocationBased InterestRecords (");
                sb19.append(size8);
                sb19.append(")");
                printWriter2.println(sb19.toString());
                Iterator it5 = new ArrayList(r.f14227e).iterator();
                int i13 = 0;
                while (it5.hasNext()) {
                    StringBuilder sb20 = new StringBuilder(16);
                    sb20.append("   ");
                    sb20.append(i13);
                    sb20.append(": ");
                    printWriter2.print(sb20.toString());
                    ((dwa) it5.next()).mo9746a(printWriter2);
                    i13++;
                }
            }
            dxo t = dwq.m9676t();
            printWriter.println();
            int size9 = t.f14365b.size();
            StringBuilder sb21 = new StringBuilder(50);
            sb21.append(">>> ProducerManager (num accounts=");
            sb21.append(size9);
            sb21.append(") <<<");
            printWriter2.println(sb21.toString());
            int i14 = 0;
            for (Map.Entry entry4 : t.f14365b.entrySet()) {
                int i15 = i14 + 1;
                String valueOf4 = String.valueOf(entry4.getKey());
                StringBuilder sb22 = new StringBuilder(String.valueOf(valueOf4).length() + 23);
                sb22.append("Account[");
                sb22.append(i14);
                sb22.append("] : ");
                sb22.append(valueOf4);
                printWriter2.println(sb22.toString());
                for (dxs dxs : ((dxt) entry4.getValue()).f14375b.values()) {
                    String valueOf5 = String.valueOf(dxs.f14372a.f14387c);
                    printWriter2.print(valueOf5.length() == 0 ? new String("  ") : "  ".concat(valueOf5));
                    if (dxs.f14372a.mo9858d()) {
                        printWriter2.println(" (Singleton)");
                        if (!sqw.m36041a((Collection) dxs.f14372a.f14392h)) {
                            printWriter2.println("   Reporting Accounts:");
                            for (doh doh2 : dxs.f14372a.f14392h) {
                                String valueOf6 = String.valueOf(doh2);
                                StringBuilder sb23 = new StringBuilder(String.valueOf(valueOf6).length() + 4);
                                sb23.append("    ");
                                sb23.append(valueOf6);
                                printWriter2.println(sb23.toString());
                            }
                        }
                    }
                    if (dxs.f14373b.size() > 1) {
                        printWriter2.print("\n   Dependent Contexts:");
                        Iterator it6 = dxs.f14373b.iterator();
                        while (it6.hasNext()) {
                            String valueOf7 = String.valueOf(Integer.toString(((Integer) it6.next()).intValue()));
                            printWriter2.print(valueOf7.length() == 0 ? new String(" ") : " ".concat(valueOf7));
                        }
                    }
                    printWriter.println();
                }
                printWriter.println();
                i14 = i15;
            }
            dsw u = dwq.m9677u();
            printWriter.println();
            int size10 = u.f13968a.size();
            StringBuilder sb24 = new StringBuilder(45);
            sb24.append(">>> Dispatcher (num accounts=");
            sb24.append(size10);
            sb24.append(") <<<");
            printWriter2.println(sb24.toString());
            int i16 = 0;
            for (Map.Entry entry5 : u.f13968a.entrySet()) {
                int i17 = i16 + 1;
                String valueOf8 = String.valueOf(entry5.getKey());
                StringBuilder sb25 = new StringBuilder(String.valueOf(valueOf8).length() + 23);
                sb25.append("Account[");
                sb25.append(i16);
                sb25.append("] : ");
                sb25.append(valueOf8);
                printWriter2.print(sb25.toString());
                dsu dsu = (dsu) entry5.getValue();
                int size11 = dsu.f13963a.size();
                StringBuilder sb26 = new StringBuilder(50);
                sb26.append(" (num dispatchable interest records = ");
                sb26.append(size11);
                sb26.append(")");
                printWriter2.println(sb26.toString());
                if (dsu.f13963a.size() != 0) {
                    for (int i18 = 0; i18 < dsu.f13963a.size(); i18++) {
                        int keyAt2 = dsu.f13963a.keyAt(i18);
                        Set<dwa> set = (Set) dsu.f13963a.valueAt(i18);
                        String num3 = Integer.toString(keyAt2);
                        int size12 = set.size();
                        StringBuilder sb27 = new StringBuilder(String.valueOf(num3).length() + 16);
                        sb27.append("  ");
                        sb27.append(num3);
                        sb27.append(" (");
                        sb27.append(size12);
                        sb27.append(")");
                        printWriter2.println(sb27.toString());
                        for (dwa dwa3 : set) {
                            StringBuilder sb28 = new StringBuilder(17);
                            sb28.append("  [0]: ");
                            printWriter2.print(sb28.toString());
                            dwa3.mo9746a(printWriter2);
                        }
                    }
                }
                i16 = i17;
            }
            dpk F = dwq.m9649F();
            printWriter.println();
            printWriter2.println(">>> BatteryStatsCollector <<<");
            for (int i19 = 0; i19 < F.f13748b.size(); i19++) {
                StringBuilder sb29 = new StringBuilder(17);
                sb29.append("[PS");
                sb29.append(i19);
                sb29.append("]: ");
                printWriter2.print(sb29.toString());
                dpq dpq = (dpq) F.f13748b.valueAt(i19);
                String num4 = Integer.toString(dpq.f13789a.f162973bD);
                String str9 = !dpq.f13791c ? ", Inactive" : ", Active";
                StringBuilder sb30 = new StringBuilder(String.valueOf(num4).length() + 14 + str9.length());
                sb30.append("contextName = ");
                sb30.append(num4);
                sb30.append(str9);
                printWriter2.println(sb30.toString());
                Iterator it7 = dpq.f13790b.iterator();
                int i20 = 0;
                while (it7.hasNext()) {
                    dpp dpp = (dpp) it7.next();
                    StringBuilder sb31 = new StringBuilder(22);
                    sb31.append("    [PAI");
                    sb31.append(i20);
                    sb31.append("]: ");
                    printWriter2.write(sb31.toString());
                    if (dpp.f13785b) {
                        String a4 = egc.m10349a(((bxhl) dpp.f13788e.f164949b).f163420b);
                        int i21 = dpp.f13786c;
                        int i22 = dpp.f13787d;
                        StringBuilder sb32 = new StringBuilder(String.valueOf(a4).length() + 48);
                        sb32.append("ONGOING(");
                        sb32.append(a4);
                        sb32.append("), dataCnt = ");
                        sb32.append(i21);
                        sb32.append("/err:");
                        sb32.append(i22);
                        printWriter2.println(sb32.toString());
                    } else {
                        String a5 = egc.m10349a(((bxhl) dpp.f13788e.f164949b).f163420b);
                        String a6 = egc.m10349a(((bxhl) dpp.f13788e.f164949b).f163421c);
                        int i23 = dpp.f13786c;
                        int i24 = dpp.f13787d;
                        StringBuilder sb33 = new StringBuilder(String.valueOf(a5).length() + 48 + String.valueOf(a6).length());
                        sb33.append("CLOSED(");
                        sb33.append(a5);
                        sb33.append(",");
                        sb33.append(a6);
                        sb33.append("), dataCnt = ");
                        sb33.append(i23);
                        sb33.append("/err:");
                        sb33.append(i24);
                        printWriter2.println(sb33.toString());
                    }
                    int i25 = 0;
                    for (Map.Entry entry6 : dpp.f13784a.f13741a.entrySet()) {
                        for (dpg dpg : ((HashMap) entry6.getValue()).values()) {
                            StringBuilder sb34 = new StringBuilder(str4.length() + 17);
                            sb34.append(str4);
                            sb34.append("[AI");
                            sb34.append(i25);
                            sb34.append("]: ");
                            printWriter2.print(sb34.toString());
                            bxhc bxhc = (bxhc) dpg.f13739c.f164949b;
                            String str10 = bxhc.f163341b;
                            String str11 = bxhc.f163342c;
                            if (!dpg.f13738b) {
                                str2 = "Closed";
                            } else {
                                str2 = "Ongoing";
                            }
                            StringBuilder sb35 = new StringBuilder(String.valueOf(str10).length() + 8 + String.valueOf(str11).length() + str2.length());
                            sb35.append("App (");
                            sb35.append(str10);
                            sb35.append(",");
                            sb35.append(str11);
                            sb35.append(") ");
                            sb35.append(str2);
                            printWriter2.println(sb35.toString());
                            printWriter2.write(str4.concat("    "));
                            dwa dwa4 = dpg.f13737a;
                            str4.concat("    ");
                            dwa4.mo9746a(printWriter2);
                            i25++;
                        }
                    }
                    i20++;
                }
                printWriter.println();
            }
            dwi s = dwq.m9675s();
            printWriter.println();
            printWriter2.println(">>> InterestSynchronizerManager <<<");
            dwh dwh = s.f14272a;
            int size13 = dwh.f14270b.size();
            StringBuilder sb36 = new StringBuilder(39);
            sb36.append("Synchronizable contexts (");
            sb36.append(size13);
            sb36.append("): ");
            printWriter2.print(sb36.toString());
            boolean z = true;
            for (Integer num5 : dwh.f14270b) {
                int intValue = num5.intValue();
                if (!z) {
                    printWriter2.print(", ");
                }
                printWriter2.print(Integer.toString(intValue));
                z = false;
            }
            printWriter.println();
            int size14 = dwh.f14271c.size();
            StringBuilder sb37 = new StringBuilder(25);
            sb37.append("Num accounts: ");
            sb37.append(size14);
            printWriter2.println(sb37.toString());
            int i26 = 0;
            for (Map.Entry entry7 : dwh.f14271c.entrySet()) {
                SparseArray sparseArray2 = (SparseArray) entry7.getValue();
                int i27 = i26 + 1;
                String valueOf9 = String.valueOf((doh) entry7.getKey());
                int size15 = sparseArray2.size();
                StringBuilder sb38 = new StringBuilder(String.valueOf(valueOf9).length() + 39);
                sb38.append("Account[");
                sb38.append(i26);
                sb38.append("]: ");
                sb38.append(valueOf9);
                sb38.append(", num=");
                sb38.append(size15);
                printWriter2.println(sb38.toString());
                for (int i28 = 0; i28 < sparseArray2.size(); i28++) {
                    String num6 = Integer.toString(sparseArray2.keyAt(i28));
                    String valueOf10 = String.valueOf((dwg) sparseArray2.valueAt(i28));
                    StringBuilder sb39 = new StringBuilder(String.valueOf(num6).length() + 4 + String.valueOf(valueOf10).length());
                    sb39.append("  ");
                    sb39.append(num6);
                    sb39.append(": ");
                    sb39.append(valueOf10);
                    printWriter2.println(sb39.toString());
                }
                i26 = i27;
            }
            ecv v = dwq.m9678v();
            printWriter.println();
            printWriter2.println(">>> RegistrationManager <<<");
            int size16 = v.f14705a.size();
            StringBuilder sb40 = new StringBuilder(45);
            sb40.append("Cached registration for ");
            sb40.append(size16);
            sb40.append(" accounts.");
            printWriter2.println(sb40.toString());
            int i29 = 0;
            for (Map.Entry entry8 : v.f14705a.entrySet()) {
                String valueOf11 = String.valueOf((doh) entry8.getKey());
                StringBuilder sb41 = new StringBuilder(String.valueOf(valueOf11).length() + 18);
                sb41.append("[");
                sb41.append(i29);
                sb41.append("]: ");
                sb41.append(valueOf11);
                sb41.append(" - ");
                printWriter2.print(sb41.toString());
                printWriter2.println(((ecu) entry8.getValue()).toString());
                i29++;
            }
            dwq.m9673q();
            printWriter.println();
            printWriter2.println(">>> FeatureStore <<<");
            if (!cdgp.f180782a.mo6606a().mo77561af()) {
                printWriter2.println("ACL inclusion in context manager state dump disabled");
            } else {
                printWriter2.println("Anonymous:");
                eew.m10257a(printWriter2, cdgf.m133171b());
                printWriter2.println("\nAccount-based:");
                eew.m10257a(printWriter2, cdgf.m133172c());
            }
            eel p = dwq.m9672p();
            printWriter.println();
            edy edy = p.f14779b;
            int size17 = edy.f14759a.size();
            StringBuilder sb42 = new StringBuilder(53);
            sb42.append(">>> ContextDataCache (num accounts = ");
            sb42.append(size17);
            sb42.append(") <<<");
            printWriter2.println(sb42.toString());
            if (size17 != 0) {
                int i30 = 0;
                for (Map.Entry entry9 : edy.f14759a.entrySet()) {
                    int i31 = i30 + 1;
                    String valueOf12 = String.valueOf(entry9.getKey());
                    StringBuilder sb43 = new StringBuilder(String.valueOf(valueOf12).length() + 23);
                    sb43.append("Account[");
                    sb43.append(i30);
                    sb43.append("] : ");
                    sb43.append(valueOf12);
                    printWriter2.println(sb43.toString());
                    SparseArray sparseArray3 = (SparseArray) entry9.getValue();
                    for (int i32 = 0; i32 < sparseArray3.size(); i32++) {
                        printWriter.println();
                        int keyAt3 = sparseArray3.keyAt(i32);
                        edp edp = (edp) sparseArray3.valueAt(i32);
                        String num7 = Integer.toString(keyAt3);
                        if (!edp.f14745a) {
                            str = " not";
                        } else {
                            str = "";
                        }
                        StringBuilder sb44 = new StringBuilder(String.valueOf(num7).length() + 14 + str.length());
                        sb44.append(num7);
                        sb44.append(": is");
                        sb44.append(str);
                        sb44.append(" producing");
                        printWriter2.println(sb44.toString());
                        for (edr edr : edp.mo10006a()) {
                            printWriter2.println(edr.f14749a.toString());
                        }
                    }
                    i30 = i31;
                }
            }
            printWriter2.println("\n== End ContextManager State ==\n");
        } catch (ConcurrentModificationException e3) {
            String valueOf13 = String.valueOf(e3);
            StringBuilder sb45 = new StringBuilder(String.valueOf(valueOf13).length() + 57);
            sb45.append("ConcurrentModificationException in context manager dump: ");
            sb45.append(valueOf13);
            printWriter2.println(sb45.toString());
        } catch (Throwable th) {
            while (true) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo9501a(tmo tmo, ContextManagerClientInfo contextManagerClientInfo, FenceUpdateRequestImpl fenceUpdateRequestImpl) {
        new Object[1][0] = contextManagerClientInfo;
        m9170a(new dsp(tmo, contextManagerClientInfo, fenceUpdateRequestImpl), dqy.m9124a("UpdateFenceRegistration", this.f13884a, contextManagerClientInfo.f30678b));
    }
}
