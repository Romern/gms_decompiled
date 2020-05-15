package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: eew */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eew extends dwm {

    /* renamed from: a */
    public final HashSet f14802a = new HashSet();

    /* renamed from: b */
    public final egi f14803b = new egi();

    /* renamed from: c */
    private final ege f14804c = new ege();

    /* renamed from: d */
    private final eed f14805d;

    public eew(eed eed) {
        this.f14805d = eed;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0098, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        r16 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009d, code lost:
        r3 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a9, code lost:
        r3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c5, code lost:
        r16.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cc, code lost:
        r16.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0098 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:6:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:1:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cc  */
    /* renamed from: a */
    private final ArrayList m10254a(tjt tjt, String str) {
        String str2;
        String str3;
        doh doh;
        String a = eex.m10267a(tjt, "_id");
        String a2 = eex.m10266a((tmx) tjt);
        String[] strArr = {"proto_blob", "_id", "account_id"};
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            eed eed = this.f14805d;
            str3 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
            Cursor query = eed.f14768a.mo10023a(2, eed.f14769b).getReadableDatabase().query("feature", strArr, str, null, null, null, a, a2);
            while (query.moveToNext()) {
                try {
                    byte[] blob = query.getBlob(0);
                    int i = query.getInt(1);
                    String string = query.getString(2);
                    if (blob != null) {
                        if (string != null) {
                            dwq.m9681y();
                            doh = dof.m8924b(string);
                        } else {
                            doh = null;
                        }
                        tjq tjq = new tjq(blob, i, doh);
                        if (tjq.f46204a != null) {
                            arrayList.add(tjq);
                        }
                    }
                    bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
                    str2 = str3;
                    bnsl.mo68432a("eew", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_PASSWORD, str2);
                    bnsl.mo68420a("[FeatureStore] Corrupt feature proto bytes for query %s.", str);
                    str3 = str2;
                } catch (SQLException e) {
                    e = e;
                    cursor = query;
                    try {
                        bnsl bnsl2 = (bnsl) dss.f13961a.mo68387b();
                        bnsl2.mo68437a(e);
                        bnsl2.mo68432a("eew", "a", 227, str2);
                        bnsl2.mo68420a("[FeatureStore]  %s", e.getMessage());
                        if (cursor != null) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                }
            }
            if (query != null) {
                query.close();
            }
        } catch (SQLException e2) {
            e = e2;
            str2 = str3;
            bnsl bnsl22 = (bnsl) dss.f13961a.mo68387b();
            bnsl22.mo68437a(e);
            bnsl22.mo68432a("eew", "a", 227, str2);
            bnsl22.mo68420a("[FeatureStore]  %s", e.getMessage());
            if (cursor != null) {
            }
            return arrayList;
        } catch (Throwable th3) {
        }
        return arrayList;
    }

    /* renamed from: b */
    public final int mo10056b(tjt tjt) {
        new Object[1][0] = tjt;
        ege ege = this.f14804c;
        doh doh = tjt.f46215a;
        Iterator it = ege.f14857a.entrySet().iterator();
        while (it.hasNext()) {
            if (((egd) ((Map.Entry) it.next()).getKey()).f14855a.equals(doh)) {
                it.remove();
            }
        }
        try {
            return this.f14805d.mo10032a().delete("feature", eex.m10265a(tjt), null);
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eew", "b", 249, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FeatureStore] delete getWritableFeatureDatabase failed");
            return 0;
        }
    }

    /* renamed from: a */
    static void m10255a(eet eet, int i) {
        eet.f14799b.clearBindings();
        long j = (long) i;
        eet.f14799b.bindLong(1, j);
        eet.f14799b.bindLong(2, j);
        try {
            eet.f14799b.executeUpdateDelete();
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eew", "a", 385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FeatureStore] pruneAnonymous:");
        }
    }

    /* renamed from: a */
    static void m10256a(eet eet, doh doh, int i) {
        eet.f14798a.clearBindings();
        long j = (long) i;
        eet.f14798a.bindLong(1, j);
        eet.f14798a.bindString(2, doh.f13690b);
        eet.f14798a.bindLong(3, j);
        eet.f14798a.bindString(4, doh.f13690b);
        try {
            eet.f14798a.executeUpdateDelete();
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eew", "a", 372, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FeatureStore] pruneWithAccount:");
        }
    }

    /* renamed from: a */
    public static void m10257a(PrintWriter printWriter, bxga bxga) {
        bxhr bxhr;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        String str6;
        PrintWriter printWriter2 = printWriter;
        bxga bxga2 = bxga;
        int size = bxga2.f163219b.size();
        StringBuilder sb = new StringBuilder(23);
        sb.append(" (num acls=");
        sb.append(size);
        sb.append(")");
        printWriter2.println(sb.toString());
        int i = 0;
        while (i < bxga2.f163219b.size()) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("    acl[");
            sb2.append(i);
            String str7 = "]: ";
            sb2.append(str7);
            printWriter2.print(sb2.toString());
            bxhp bxhp = (bxhp) bxga2.f163219b.get(i);
            if (bxhp != null) {
                String str8 = "{";
                printWriter2.println(str8);
                printWriter2.print("      context_key: ");
                bxhr bxhr2 = bxhp.f163448b;
                if (bxhr2 == null) {
                    bxhr = bxhr.f163456d;
                } else {
                    bxhr = bxhr2;
                }
                if (bxhr != null) {
                    printWriter2.print("{ ");
                    int a = bxch.m122566a(bxhr.f163459b);
                    if (a == 0) {
                        a = 1;
                    }
                    switch (a) {
                        case 1:
                            str6 = "UNKNOWN_CONTEXT_FAMILY";
                            str5 = str6;
                            break;
                        case 2:
                            str6 = "USER_ACTIVITY";
                            str5 = str6;
                            break;
                        case 3:
                            str6 = "USER_STATE";
                            str5 = str6;
                            break;
                        case 4:
                            str6 = "LOCATION";
                            str5 = str6;
                            break;
                        case 5:
                            str6 = "PLACE";
                            str5 = str6;
                            break;
                        case 6:
                            str6 = "PROXIMITY";
                            str5 = str6;
                            break;
                        case 7:
                            str6 = "AMBIENCE";
                            str5 = str6;
                            break;
                        case 8:
                            str6 = "DEVICE_STATE";
                            str5 = str6;
                            break;
                        case 9:
                            str6 = "DEVICE_ACTIVITY";
                            str5 = str6;
                            break;
                        case 10:
                            str6 = "USER_PROFILE";
                            str5 = str6;
                            break;
                        case 11:
                            str6 = "SEMANTIC_TIME";
                            str5 = str6;
                            break;
                        case 12:
                            str6 = "TASKS";
                            str5 = str6;
                            break;
                        default:
                            str5 = "SUGGEST_STATE";
                            break;
                    }
                    int a2 = bxch.m122566a(bxhr.f163459b);
                    if (a2 == 0) {
                        z = false;
                    } else {
                        z = a2 != 1;
                    }
                    str = " }";
                    str2 = "{ ";
                    boolean a3 = egf.m10351a(printWriter, "context_family", str5, z, ", ", false);
                    bxco a4 = bxco.m122577a(bxhr.f163460c);
                    if (a4 == null) {
                        a4 = bxco.UNKNOWN_CONTEXT_NAME;
                    }
                    String name = a4.name();
                    bxco a5 = bxco.m122577a(bxhr.f163460c);
                    if (a5 == null) {
                        a5 = bxco.UNKNOWN_CONTEXT_NAME;
                    }
                    egf.m10351a(printWriter, "context_name", name, a5 != bxco.UNKNOWN_CONTEXT_NAME, ", ", a3);
                    printWriter2.print(str);
                } else {
                    str = " }";
                    str2 = "{ ";
                    printWriter2.println("null");
                }
                printWriter.println();
                if (bxhp.f163449c.size() == 0) {
                    printWriter2.println("      acl_entry: null");
                } else {
                    int i2 = 0;
                    while (i2 < bxhp.f163449c.size()) {
                        StringBuilder sb3 = new StringBuilder(30);
                        sb3.append("      acl_entry[");
                        sb3.append(i2);
                        sb3.append(str7);
                        printWriter2.print(sb3.toString());
                        bxfy bxfy = (bxfy) bxhp.f163449c.get(i2);
                        if (bxfy != null) {
                            String concat = "        ".concat("  ");
                            printWriter2.println(str8);
                            if ((bxfy.f163213a & 1) != 0) {
                                printWriter2.print("        ".concat("entity: "));
                                bxhw bxhw = bxfy.f163214b;
                                if (bxhw == null) {
                                    bxhw = bxhw.f163474d;
                                }
                                if (bxhw != null) {
                                    str4 = str7;
                                    printWriter2.print("{ type: ");
                                    bxfw bxfw = bxfw.UNKNOWN_ACCESS_TYPE;
                                    bxjq bxjq = bxjq.UNKNOWN_SYNC_TYPE;
                                    int a6 = bxhv.m122730a(bxhw.f163477b);
                                    if (a6 == 0) {
                                        a6 = 1;
                                    }
                                    int i3 = a6 - 1;
                                    if (i3 != 0) {
                                        str3 = str8;
                                        if (i3 != 1) {
                                            printWriter2.print("ALL_PACKAGES");
                                        } else {
                                            printWriter2.print("SINGLE_PACKAGE");
                                        }
                                    } else {
                                        str3 = str8;
                                        printWriter2.print("ENTITY_TYPE_UNKNOWN");
                                    }
                                    if ((bxhw.f163476a & 2) != 0 && bxhw.f163478c.length() > 0) {
                                        String valueOf = String.valueOf(bxhw.f163478c);
                                        printWriter2.print(valueOf.length() == 0 ? new String(", package_name: ") : ", package_name: ".concat(valueOf));
                                    }
                                    printWriter2.print(str);
                                } else {
                                    str4 = str7;
                                    str3 = str8;
                                    printWriter2.print("null");
                                }
                                printWriter.println();
                            } else {
                                str4 = str7;
                                str3 = str8;
                            }
                            if ((bxfy.f163213a & 2) != 0) {
                                printWriter2.print("        ".concat("policy: "));
                                bxfu bxfu = bxfy.f163215c;
                                if (bxfu == null) {
                                    bxfu = bxfu.f163194c;
                                }
                                if (bxfu != null) {
                                    printWriter2.print("{ access_type: ");
                                    String.valueOf(concat).concat("  ");
                                    bxfw a7 = bxfw.m122671a(bxfu.f163197b);
                                    if (a7 == null) {
                                        a7 = bxfw.UNKNOWN_ACCESS_TYPE;
                                    }
                                    bxjq bxjq2 = bxjq.UNKNOWN_SYNC_TYPE;
                                    switch (a7.ordinal()) {
                                        case 0:
                                            printWriter2.print("UNKNOWN_ACCESS_TYPE");
                                            break;
                                        case 1:
                                            printWriter2.print("READ_ONLY");
                                            break;
                                        case 2:
                                            printWriter2.print("WRITE_ONLY");
                                            break;
                                        case 3:
                                            printWriter2.print("READ_WRITE");
                                            break;
                                        case 4:
                                            printWriter2.print("LISTEN_ONLY");
                                            break;
                                        case 5:
                                            printWriter2.print("INJECT_ONLY");
                                            break;
                                        case 6:
                                            printWriter2.print("LISTEN_WRITE");
                                            break;
                                        case 7:
                                            printWriter2.print("LISTEN_INJECT");
                                            break;
                                        case 8:
                                            printWriter2.print("READ_INJECT");
                                            break;
                                        default:
                                            String valueOf2 = String.valueOf(a7);
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 10);
                                            sb4.append("unknown (");
                                            sb4.append(valueOf2);
                                            sb4.append(")");
                                            printWriter2.print(sb4.toString());
                                            break;
                                    }
                                    printWriter2.print(str);
                                } else {
                                    printWriter2.print("null");
                                }
                                printWriter.println();
                            }
                            printWriter2.print("        ".concat("}"));
                        } else {
                            str4 = str7;
                            str3 = str8;
                            printWriter2.print("null");
                        }
                        printWriter.println();
                        i2++;
                        str7 = str4;
                        str8 = str3;
                    }
                }
                if ((bxhp.f163447a & 2) != 0) {
                    printWriter2.print("      sync_policy: ");
                    bxjo bxjo = bxhp.f163450d;
                    if (bxjo == null) {
                        bxjo = bxjo.f163657c;
                    }
                    if (bxjo != null) {
                        printWriter2.print("{ sync_type: ");
                        "        ".concat("  ");
                        bxjq a8 = bxjq.m122779a(bxjo.f163660b);
                        if (a8 == null) {
                            a8 = bxjq.UNKNOWN_SYNC_TYPE;
                        }
                        bxfw bxfw2 = bxfw.UNKNOWN_ACCESS_TYPE;
                        int ordinal = a8.ordinal();
                        if (ordinal == 0) {
                            printWriter2.print("UNKNOWN_SYNC_TYPE");
                        } else if (ordinal == 1) {
                            printWriter2.print("DO_NOT_SYNC");
                        } else if (ordinal != 2) {
                            String valueOf3 = String.valueOf(a8);
                            StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf3).length() + 10);
                            sb5.append("unknown (");
                            sb5.append(valueOf3);
                            sb5.append(")");
                            printWriter2.print(sb5.toString());
                        } else {
                            printWriter2.print("SYNCABLE_TO_BACKEND");
                        }
                        printWriter2.print(str);
                    } else {
                        printWriter2.print("null");
                    }
                    printWriter.println();
                }
                if ((bxhp.f163447a & 4) != 0) {
                    printWriter2.print("      retention_policy: ");
                    bxje bxje = bxhp.f163451e;
                    if (bxje == null) {
                        bxje = bxje.f163621d;
                    }
                    if (bxje != null) {
                        printWriter2.print(str2);
                        long j = bxje.f163624b;
                        StringBuilder sb6 = new StringBuilder(43);
                        sb6.append("time_to_retain_millis: ");
                        sb6.append(j);
                        printWriter2.print(sb6.toString());
                        if ((bxje.f163623a & 2) != 0) {
                            int i4 = bxje.f163625c;
                            StringBuilder sb7 = new StringBuilder(36);
                            sb7.append(", retention_count_limit: ");
                            sb7.append(i4);
                            printWriter2.print(sb7.toString());
                        }
                        printWriter2.print(str);
                    } else {
                        printWriter2.print("null");
                    }
                    printWriter.println();
                }
                printWriter2.print("      }");
            } else {
                printWriter2.print("null");
            }
            printWriter.println();
            i++;
            bxga2 = bxga;
        }
    }

    /* renamed from: a */
    public final long mo10051a(tjq tjq) {
        long j;
        doh doh = tjq.f46205b;
        Object[] objArr = {tjq, doh};
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(tjq.mo26591a()));
        if (doh != null) {
            contentValues.put("account_id", doh.f13690b);
        }
        eee.m10221a(contentValues, tjq.mo26592b());
        eee.m10220a(contentValues, tjq.mo26594d());
        contentValues.put("proto_blob", tjq.f46204a.serializeToBytes());
        try {
            j = this.f14805d.mo10032a().insertOrThrow("feature", null, contentValues);
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eew", "a", 89, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68420a("[FeatureStore] Failed inserting feature %s", bryx.m114908a(Integer.valueOf(tjq.mo26591a())));
            j = -1;
        }
        if (j != -1) {
            this.f14803b.mo10086a((egg) new eeu(tjq.f46205b, tjq));
        }
        if (this.f14802a.contains(Integer.valueOf(tjq.mo26591a()))) {
            this.f14804c.f14857a.put(egd.m10350a(tjq.f46205b, Integer.valueOf(tjq.mo26591a())), tjq);
        }
        return j;
    }

    /* renamed from: a */
    public final ArrayList mo10052a(tjt tjt) {
        Object[] objArr = {tjt, tjt.f46215a};
        return m10254a(tjt, eex.m10265a(tjt));
    }

    /* renamed from: a */
    public final tjq mo10053a(doh doh, int i) {
        tjt tjt;
        if (doh == null) {
            tjr tjr = new tjr();
            tkb tkb = new tkb();
            tkb.mo26624b();
            tjr.mo26596a(i, tkb.mo26620a());
            tjr.mo26598b();
            tjt = tjr.mo26595a();
        } else {
            HashSet hashSet = this.f14802a;
            Integer valueOf = Integer.valueOf(i);
            if (hashSet.contains(valueOf) && this.f14804c.f14857a.containsKey(egd.m10350a(doh, valueOf))) {
                return (tjq) this.f14804c.f14857a.get(egd.m10350a(doh, valueOf));
            }
            tjr tjr2 = new tjr(doh);
            tkb tkb2 = new tkb();
            tkb2.mo26624b();
            tjr2.mo26596a(i, tkb2.mo26620a());
            tjr2.mo26598b();
            tjt = tjr2.mo26595a();
        }
        ArrayList a = mo10052a(tjt);
        if (a.isEmpty()) {
            return null;
        }
        if (a.size() > 1) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("eew", "a", 162, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FeatureStore] Should never get more than one result back.");
        }
        return (tjq) a.get(0);
    }

    /* renamed from: a */
    public final void mo10054a() {
        eet eet;
        try {
            eet = new eet(this.f14805d.mo10032a());
        } catch (SQLException e) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("eew", "a", 265, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("[FeatureStore] prune getWritableFeatureDatabase failed");
            eet = null;
        }
        for (doh doh : dwq.m9681y().mo9331a()) {
            if (eet != null) {
                m10256a(eet, doh, 1);
                m10256a(eet, doh, 6);
                m10256a(eet, doh, 11);
            }
            mo10055a(13, 86400000, doh);
        }
        if (eet != null) {
            m10255a(eet, 3);
            m10255a(eet, 10);
            m10255a(eet, 7);
        }
        mo10055a(5, 86400000, (doh) null);
        tjr tjr = new tjr();
        tkb tkb = new tkb();
        tkb.mo26624b();
        tjr.mo26596a(9, tkb.mo26620a());
        mo10056b(tjr.mo26595a());
    }

    /* renamed from: a */
    public final void mo10055a(int i, long j, doh doh) {
        tjr tjr = new tjr(doh);
        tkb tkb = new tkb();
        tkb.mo26621a(dwq.m9665i().mo20505a() - j);
        tjr.mo26596a(i, tkb.mo26620a());
        mo10056b(tjr.mo26595a());
    }
}
