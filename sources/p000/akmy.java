package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.NetworkKey;
import android.net.RssiCurve;
import android.net.ScoredNetwork;
import java.io.PrintWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: akmy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akmy {

    /* renamed from: a */
    static final String[] f72278a = {"bssid", "ssid", "score_curve", "throughput_curve", "captive_portal", "requested_timestamp", "updated_timestamp", "waiting_for_update"};

    /* renamed from: b */
    public int f72279b;

    /* renamed from: c */
    public int f72280c;

    /* renamed from: d */
    private final Context f72281d;

    /* renamed from: e */
    private final akmx f72282e;

    /* renamed from: f */
    private final akmu f72283f;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b8, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ba, code lost:
        p000.eoa.m10828c("NetRec", "Caught encrypter change, flushed cache of %d entries", java.lang.Integer.valueOf(mo39580c()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    public akmy(Context context, akmx akmx) {
        this.f72281d = context;
        if (akmu.f72275a == null) {
            synchronized (akmu.class) {
                if (akmu.f72275a == null) {
                    akmu.f72275a = new akmu(context.getApplicationContext());
                }
            }
        }
        this.f72283f = akmu.f72275a;
        int g = (int) cfpd.m142367g();
        if (g < 0) {
            StringBuilder sb = new StringBuilder(124);
            sb.append("bad value for mMaxNetworks: ");
            sb.append(g);
            sb.append(". setting to default: 5000.  Does this device have a bad GServices value or override?");
            eoa.m10828c("NetRec", sb.toString(), new Object[0]);
            this.f72279b = 5000;
        } else {
            this.f72279b = g;
        }
        int g2 = ((int) (cfpd.m142367g() * cfpd.f185332a.mo6606a().mo82422F())) / 100;
        if (g2 < 0) {
            StringBuilder sb2 = new StringBuilder(122);
            sb2.append("bad value for mMaxNetworks: ");
            sb2.append(g2);
            sb2.append(". setting to default: 85.  Does this device have a bad GServices value or override?");
            eoa.m10828c("NetRec", sb2.toString(), new Object[0]);
            this.f72280c = (this.f72279b * 85) / 100;
        } else {
            this.f72280c = g2;
        }
        this.f72282e = akmx;
        String a = akmx.mo39561a();
        synchronized (akka.f72130e) {
            if (!a.equals(akka.f72130e.mo10351a())) {
                Object a2 = akka.f72130e.mo10351a();
                akka.f72130e.mo10352a(a);
                eoa.m10828c("NetRec", "Setting current/known encrypter", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static akmy m60045a(Context context) {
        return new akmy(context, akmx.m60041a(context));
    }

    /* renamed from: b */
    public static int m60048b(SQLiteDatabase sQLiteDatabase) {
        int i = 0;
        Cursor query = sQLiteDatabase.query("network", new String[]{"count(*)"}, null, null, null, null, null);
        if (query.moveToNext()) {
            i = query.getInt(0);
        }
        query.close();
        return i;
    }

    /* renamed from: a */
    private final List m60046a(String str, String[] strArr, String str2, String str3) {
        SQLiteDatabase b = mo39578b();
        if (b == null) {
            return bngx.m109376e();
        }
        ArrayList arrayList = new ArrayList();
        try {
            Cursor query = b.query("network", f72278a, str, strArr, null, null, str2, str3);
            while (query.moveToNext()) {
                try {
                    arrayList.add(akna.m60065a(this.f72282e, query));
                } catch (GeneralSecurityException e) {
                    eoa.m10825a("NetRec", e, "Error decrypting", new Object[0]);
                    aknf.m60075a("ErrorsEncryption");
                    aknj.m60083a(this.f72281d).mo39586a(e);
                } catch (IllegalArgumentException e2) {
                    eoa.m10825a("NetRec", e2, "Invalid network table entry", new Object[0]);
                }
            }
            query.close();
        } catch (SQLiteException e3) {
            eoa.m10825a("NetRec", e3, "error", new Object[0]);
        }
        return arrayList;
    }

    /* renamed from: c */
    public static final int m60049c(SQLiteDatabase sQLiteDatabase) {
        return sQLiteDatabase.delete("network", "requested_timestamp < ?", new String[]{Long.toString(System.currentTimeMillis() - cfpd.f185332a.mo6606a().mo82421E())});
    }

    /* renamed from: b */
    public final SQLiteDatabase mo39578b() {
        try {
            return this.f72283f.mo39564a();
        } catch (akmt e) {
            eoa.m10825a("NetRec", e, "Can't open database for reading", new Object[0]);
            aknj.m60083a(this.f72281d).mo39586a(e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String[] mo39579b(String... strArr) {
        try {
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                strArr2[i] = this.f72282e.mo39562a(strArr[i]);
            }
            return strArr2;
        } catch (GeneralSecurityException e) {
            eoa.m10825a("NetRec", e, "Error encrypting.", new Object[0]);
            aknf.m60075a("ErrorsEncryption");
            throw e;
        }
    }

    /* renamed from: c */
    private final List m60050c(String[] strArr) {
        try {
            String[] b = mo39579b(strArr);
            String valueOf = String.valueOf(akmv.m60034a(b.length - 1));
            return m60046a(valueOf.length() == 0 ? new String("ssid=? AND bssid") : "ssid=? AND bssid".concat(valueOf), b, null, null);
        } catch (GeneralSecurityException e) {
            aknf.m60075a("ErrorsEncryption");
            return new ArrayList();
        }
    }

    /* renamed from: c */
    public final int mo39580c() {
        SQLiteDatabase a = mo39569a();
        if (a != null) {
            return a.delete("network", "1", null);
        }
        return Integer.MIN_VALUE;
    }

    /* renamed from: a */
    public static void m60047a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS network;");
        sQLiteDatabase.execSQL("create table network (ssid text NOT NULL, bssid text NOT NULL, score_curve text, throughput_curve text, captive_portal integer, requested_timestamp integer, updated_timestamp integer, waiting_for_update integer DEFAULT 0,PRIMARY KEY (ssid, bssid));");
        sQLiteDatabase.execSQL("create index network_bssid_idx ON network(bssid);");
        sQLiteDatabase.execSQL("create index network_ssid_idx ON network(ssid);");
    }

    /* renamed from: a */
    public final int mo39567a(SQLiteDatabase sQLiteDatabase, ContentValues contentValues, String str, String str2, int i) {
        try {
            String[] b = mo39579b(str, str2);
            if (i == 1) {
                contentValues.put("ssid", b[0]);
                contentValues.put("bssid", b[1]);
                try {
                    sQLiteDatabase.insertWithOnConflict("network", null, contentValues, 3);
                    return 1;
                } catch (SQLiteConstraintException e) {
                    return 0;
                }
            } else {
                int update = sQLiteDatabase.update("network", contentValues, "ssid=? AND bssid=?", b);
                if (update > 0 || i == 2) {
                    return update;
                }
                new Object[1][0] = aknk.m60087a(str, str2);
                int i2 = eoa.f15378a;
                contentValues.put("ssid", b[0]);
                contentValues.put("bssid", b[1]);
                if (sQLiteDatabase.insert("network", null, contentValues) != -1) {
                    return 1;
                }
                eoa.m10824a("NetRec", "Insertion for key %s failed", aknk.m60087a(str, str2));
                return 0;
            }
        } catch (GeneralSecurityException e2) {
            aknf.m60075a("ErrorsEncryption");
            return 0;
        }
    }

    /* renamed from: a */
    public final int mo39568a(Collection collection, int i) {
        SQLiteDatabase a = mo39569a();
        if (a == null) {
            return 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            a.beginTransaction();
            Iterator it = collection.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                akkp akkp = (akkp) it.next();
                caet caet = akkp.f72174d;
                if (caet == null) {
                    caet = caet.f172852g;
                }
                if ((akkp.f72171a & 4) != 0) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("updated_timestamp", Long.valueOf(currentTimeMillis));
                    if ((caet.f172854a & 2) != 0) {
                        cafe cafe = caet.f172856c;
                        if (cafe == null) {
                            cafe = cafe.f172889e;
                        }
                        contentValues.put("score_curve", akmv.m60035a(cafe));
                    }
                    int i3 = 1;
                    if ((caet.f172854a & 4) != 0) {
                        cafg cafg = caet.f172857d;
                        if (cafg == null) {
                            cafg = cafg.f172895f;
                        }
                        String a2 = akmv.m60036a(cafg);
                        if (a2 == null) {
                            Object[] objArr = new Object[1];
                            cafg cafg2 = caet.f172857d;
                            if (cafg2 == null) {
                                cafg2 = cafg.f172895f;
                            }
                            objArr[0] = cafg2;
                            eoa.m10824a("NetRec", "Ignoring invalid ThroughputCurve %s", objArr);
                        } else {
                            contentValues.put("throughput_curve", a2);
                        }
                    }
                    if ((caet.f172854a & 16) != 0) {
                        int a3 = cafa.m126567a(caet.f172859f);
                        if (a3 != 0) {
                            i3 = a3;
                        }
                        contentValues.put("captive_portal", Integer.valueOf(i3 - 1));
                    }
                    i2 += mo39567a(a, contentValues, akkp.f72172b, akkp.f72173c, i);
                }
            }
            a.setTransactionSuccessful();
            return i2;
        } finally {
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public final SQLiteDatabase mo39569a() {
        try {
            return this.f72283f.mo39565b();
        } catch (akmt e) {
            eoa.m10825a("NetRec", e, "Can't open database for writing", new Object[0]);
            aknj.m60083a(this.f72281d).mo39586a(e);
            return null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: akmy.a(int, boolean):java.util.List
     arg types: [int, int]
     candidates:
      akmy.a(java.util.Collection, int):int
      akmy.a(int, boolean):java.util.List */
    /* renamed from: a */
    public final List mo39570a(int i) {
        List<akna> a = mo39571a(i, true);
        ArrayList arrayList = new ArrayList();
        for (akna akna : a) {
            arrayList.add(akna.f72285a);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final List mo39571a(int i, boolean z) {
        String str = !z ? "0" : "1";
        return m60046a(str.length() == 0 ? new String("waiting_for_update=") : "waiting_for_update=".concat(str), null, "requested_timestamp DESC", Integer.toString(i));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo39572a(String str) {
        try {
            return m60046a("ssid=?", mo39579b(str), null, null);
        } catch (GeneralSecurityException e) {
            aknf.m60075a("ErrorsEncryption");
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final List mo39573a(NetworkKey[] networkKeyArr) {
        String[] strArr = new String[networkKeyArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = networkKeyArr.length;
            if (i2 >= length) {
                break;
            }
            strArr[i2] = networkKeyArr[i2].wifiKey.bssid;
            i2++;
        }
        List a = mo39574a(strArr);
        HashMap hashMap = new HashMap();
        for (NetworkKey networkKey : networkKeyArr) {
            hashMap.put(networkKey.wifiKey.bssid, networkKey.wifiKey.ssid);
        }
        while (i < a.size()) {
            akna akna = (akna) a.get(i);
            if (!((String) hashMap.get(akna.mo39582b())).equals(akna.mo39581a())) {
                a.remove(i);
                i--;
            }
            i++;
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo39574a(String[] strArr) {
        try {
            String[] b = mo39579b(strArr);
            String valueOf = String.valueOf(akmv.m60034a(b.length));
            return m60046a(valueOf.length() == 0 ? new String("bssid") : "bssid".concat(valueOf), b, null, null);
        } catch (GeneralSecurityException e) {
            aknf.m60075a("ErrorsEncryption");
            return new ArrayList();
        }
    }

    /* renamed from: a */
    public final void mo39575a(PrintWriter printWriter) {
        SQLiteDatabase b = mo39578b();
        if (b == null) {
            printWriter.println("Could not open database");
            return;
        }
        Cursor query = b.query("network", f72278a, null, null, null, null, "ssid ASC, bssid ASC");
        int i = 0;
        while (query.moveToNext()) {
            try {
                printWriter.println(akna.m60065a(this.f72282e, query));
            } catch (GeneralSecurityException e) {
                String valueOf = String.valueOf(DatabaseUtils.dumpCurrentRowToString(query));
                printWriter.println(valueOf.length() == 0 ? new String("Cannot decrypt: ") : "Cannot decrypt: ".concat(valueOf));
                aknf.m60075a("ErrorsEncryption");
            } catch (IllegalArgumentException e2) {
                String valueOf2 = String.valueOf(DatabaseUtils.dumpCurrentRowToString(query));
                printWriter.println(valueOf2.length() == 0 ? new String("Cannot read: ") : "Cannot read: ".concat(valueOf2));
            }
            i++;
        }
        query.close();
        printWriter.printf("Total entries: %d\n", Integer.valueOf(i));
    }

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
    /* renamed from: a */
    public final void mo39576a(List list) {
        SQLiteDatabase a = mo39569a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            a.beginTransaction();
            int size = list.size();
            int i = 0;
            while (i < size) {
                try {
                    StringBuilder sb = new StringBuilder();
                    int min = Math.min(100, size - i);
                    String[] strArr = new String[(min + min)];
                    boolean z = true;
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + i;
                        if (i3 >= size) {
                            break;
                        } else if (i2 < 100) {
                            akkp akkp = (akkp) list.get(i3);
                            if (!z) {
                                sb.append(" OR ");
                            }
                            sb.append("(");
                            sb.append("ssid");
                            sb.append("=? AND ");
                            sb.append("bssid");
                            sb.append("=?)");
                            int i4 = i2 + i2;
                            strArr[i4] = akkp.f72172b;
                            strArr[i4 + 1] = akkp.f72173c;
                            i2++;
                            z = false;
                        }
                    }
                    String[] b = mo39579b(strArr);
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("updated_timestamp", Long.valueOf(currentTimeMillis));
                    contentValues.put("waiting_for_update", (Integer) 0);
                    a.update("network", contentValues, sb.toString(), b);
                    i += 100;
                } catch (GeneralSecurityException e) {
                    aknf.m60075a("ErrorsEncryption");
                } catch (Throwable th) {
                    a.endTransaction();
                    throw th;
                }
            }
            a.setTransactionSuccessful();
            a.endTransaction();
        }
    }

    /* renamed from: a */
    public final ScoredNetwork[] mo39577a(String str, String[] strArr, boolean z) {
        boolean z2;
        String[] strArr2;
        String str2;
        List list;
        if (aknk.m60089c(str)) {
            SQLiteDatabase a = mo39569a();
            if (a == null) {
                return new ScoredNetwork[0];
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("updated_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("waiting_for_update", Integer.valueOf(z ? 1 : 0));
            if (!z) {
                contentValues.put("score_curve", (String) null);
            }
            if (strArr == null || strArr.length <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                int length = strArr.length;
                String a2 = akmv.m60034a(length);
                StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 16);
                sb.append("ssid=? AND bssid");
                sb.append(a2);
                str2 = sb.toString();
                strArr2 = new String[(length + 1)];
                strArr2[0] = str;
                System.arraycopy(strArr, 0, strArr2, 1, length);
            } else {
                strArr2 = new String[]{str};
                str2 = "ssid=?";
            }
            try {
                String[] b = mo39579b(strArr2);
                a.beginTransaction();
                try {
                    if (a.update("network", contentValues, str2, b) == 0) {
                        new Object[1][0] = eoa.m10821a(str, cfpd.m142365e());
                        a.setTransactionSuccessful();
                        return new ScoredNetwork[0];
                    }
                    if (!z2) {
                        list = mo39572a(str);
                    } else {
                        list = m60050c(strArr2);
                    }
                    ScoredNetwork[] scoredNetworkArr = new ScoredNetwork[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        scoredNetworkArr[i] = new ScoredNetwork(((akna) list.get(i)).f72285a, (RssiCurve) null);
                    }
                    a.setTransactionSuccessful();
                    a.endTransaction();
                    return scoredNetworkArr;
                } finally {
                    a.endTransaction();
                }
            } catch (GeneralSecurityException e) {
                aknf.m60075a("ErrorsEncryption");
                return new ScoredNetwork[0];
            }
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 27);
            sb2.append("SSID ");
            sb2.append(str);
            sb2.append(" expected to be quoted");
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
