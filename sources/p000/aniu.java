package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* renamed from: aniu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class aniu {

    /* renamed from: a */
    private static final srn f76966a = srn.m36127a(sgj.PHENOTYPE);

    /* renamed from: b */
    private static final Object f76967b = new Object();

    /* renamed from: g */
    private static final byte[] f76968g = new byte[0];

    /* renamed from: c */
    public final Context f76969c;

    /* renamed from: d */
    public anfw f76970d;

    /* renamed from: e */
    public anfw f76971e;

    /* renamed from: f */
    public boolean f76972f = false;

    /* renamed from: h */
    private final aniz f76973h;

    /* renamed from: i */
    private final bdza f76974i;

    /* renamed from: j */
    private final cijl f76975j;

    /* renamed from: k */
    private final int f76976k;

    public aniu(Context context, anfw anfw, anfw anfw2, aniz aniz, bdza bdza, int i, cijl cijl) {
        this.f76969c = context;
        this.f76970d = anfw;
        this.f76971e = anfw2;
        this.f76974i = bdza;
        this.f76973h = aniz;
        this.f76976k = i;
        this.f76975j = cijl;
    }

    /* renamed from: a */
    private static int m64504a(anit anit) {
        if (anit.mo41849a()) {
            return 4;
        }
        if (anit.f76959a <= 0 || anit.mo41849a()) {
            return 1;
        }
        if (anit.f76960b < anit.f76959a) {
            return 10;
        }
        int i = anit.f76964f;
        return i - anit.f76965g < i ? 10 : 1;
    }

    /* renamed from: b */
    private static final bxvd m64523b(anit anit) {
        bxvd da = caii.f174700i.mo74144da();
        int i = anit.f76963e;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caii caii = (caii) da.f164949b;
        caii.f174702a |= 32;
        caii.f174707f = i;
        int b = anit.mo41850b();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        caii caii2 = (caii) da.f164949b;
        int i2 = caii2.f174702a | 64;
        caii2.f174702a = i2;
        caii2.f174708g = b;
        int i3 = anit.f76965g;
        int i4 = i2 | 128;
        caii2.f174702a = i4;
        caii2.f174709h = i3;
        int i5 = anit.f76959a;
        int i6 = i4 | 1;
        caii2.f174702a = i6;
        caii2.f174703b = i5;
        int i7 = anit.f76960b;
        int i8 = i6 | 2;
        caii2.f174702a = i8;
        caii2.f174704c = i7;
        int i9 = anit.f76962d;
        int i10 = i8 | 4;
        caii2.f174702a = i10;
        caii2.f174705d = i9;
        int i11 = anit.f76964f;
        caii2.f174702a = i10 | 8;
        caii2.f174706e = i11;
        return da;
    }

    /* renamed from: c */
    private static ArrayList m64524c(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str.endsWith("@google.com")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: e */
    public static aniw m64525e() {
        return new aniw(cgec.f186635a.mo6606a().mo83522c());
    }

    /* renamed from: g */
    private final void m64526g() {
        Cursor rawQuery;
        anfw anfw = this.f76971e;
        if (anfw != null) {
            SQLiteDatabase writableDatabase = anfw.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                bxwc bxwc = cgcr.m144764b().f165797a;
                String join = TextUtils.join(",", Collections.nCopies(bxwc.size(), "?"));
                StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 60);
                sb.append("SELECT packageName FROM Packages WHERE packageName NOT IN (");
                sb.append(join);
                sb.append(")");
                rawQuery = writableDatabase.rawQuery(sb.toString(), (String[]) bxwc.toArray(new String[0]));
                while (rawQuery.moveToNext()) {
                    anih.m64471a(writableDatabase, rawQuery.getString(0));
                }
                if (rawQuery != null) {
                    rawQuery.close();
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return;
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } else {
            return;
        }
        throw th;
    }

    /* renamed from: h */
    private static Level m64527h() {
        return !cgec.f186635a.mo6606a().mo83529j() ? Level.CONFIG : Level.INFO;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract String mo25224a(String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25225a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41842a(int i, Set set) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25226a(long j);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo41843a(aniy aniy) {
    }

    /* renamed from: a */
    public abstract String[] mo25227a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo25228b();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo25229b(String str);

    /* access modifiers changed from: protected */
    /* renamed from: bp */
    public void mo41844bp() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract cafx mo25230c();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo41859f() {
        bnsl bnsl = (bnsl) f76966a.mo68390d();
        bnsl.mo68432a("aniu", "f", 2385, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("vacuuming");
        try {
            this.f76970d.getWritableDatabase().execSQL("VACUUM");
            anfw anfw = this.f76971e;
            if (anfw != null) {
                anfw.getWritableDatabase().execSQL("VACUUM");
            }
            bnsl bnsl2 = (bnsl) f76966a.mo68390d();
            bnsl2.mo68432a("aniu", "f", 2392, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("done vacuuming");
        } catch (SQLException e) {
            bnsl bnsl3 = (bnsl) f76966a.mo68388c();
            bnsl3.mo68437a(e);
            bnsl3.mo68432a("aniu", "f", 2394, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl3.mo68405a("SQLException when vacuuming:");
        }
    }

    /* renamed from: a */
    static int m64505a(bqyt bqyt) {
        bxwc bxwc = bqyt.f141985c;
        int size = bxwc.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bqzl bqzl = (bqzl) bxwc.get(i2);
            bqzm bqzm = bqzl.f142056a;
            if (bqzm == null) {
                bqzm = bqzm.f142060d;
            }
            long j = bqzm.f142063b;
            bqzm bqzm2 = bqzl.f142056a;
            if (bqzm2 == null) {
                bqzm2 = bqzm.f142060d;
            }
            int i3 = (int) (j ^ (bqzm2.f142063b >>> 32));
            bqzm bqzm3 = bqzl.f142056a;
            if (bqzm3 == null) {
                bqzm3 = bqzm.f142060d;
            }
            for (byte b : bqzm3.f142064c.mo73780k()) {
                i3 = (i3 * 31) + b;
            }
            i = (i * 17) ^ i3;
        }
        return i;
    }

    /* renamed from: a */
    private static int m64506a(LinkedHashMap linkedHashMap, String str) {
        int i = -1;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            i++;
            if (((String) entry.getKey()).equals(str)) {
                return i;
            }
        }
        throw new AssertionError(String.format("Impossible State: Could not find key %s in map", str));
    }

    /* renamed from: a */
    private static bngx m64507a(SQLiteDatabase sQLiteDatabase, bqzn bqzn, String str) {
        Cursor query = sQLiteDatabase.query("ApplicationTags", new String[]{"partitionId", "tag"}, "packageName = ? AND user = ? AND version = ?", new String[]{bqzn.f142068b, str, Long.toString(bqzn.f142069c)}, null, null, null);
        try {
            bngs j = bngx.m109377j();
            while (query.moveToNext()) {
                bxvd da = bqzm.f142060d.mo74144da();
                long j2 = query.getLong(0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqzm bqzm = (bqzm) da.f164949b;
                bqzm.f142062a |= 1;
                bqzm.f142063b = j2;
                bxtx a = bxtx.m123261a(query.getBlob(1));
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bqzm bqzm2 = (bqzm) da.f164949b;
                a.getClass();
                bqzm2.f142062a |= 2;
                bqzm2.f142064c = a;
                j.mo67668c((bqzm) da.mo74062i());
            }
            bngx a2 = j.mo67664a();
            if (query != null) {
                query.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo41858b(String[] strArr) {
        Throwable th;
        Cursor rawQuery;
        Throwable th2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Cursor query;
        Throwable th3;
        String[] strArr2 = strArr;
        SQLiteDatabase writableDatabase = this.f76970d.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            Set a = anfv.m64174a(writableDatabase);
            for (String str : strArr2) {
                a.remove(str);
            }
            for (String str2 : m64510a(writableDatabase)) {
                a.remove(str2);
            }
            a.remove("");
            HashSet<String> hashSet = new HashSet();
            Iterator it = a.iterator();
            while (it.hasNext()) {
                String[] strArr3 = {(String) it.next()};
                String[] strArr4 = strArr3;
                String str3 = "CrossLoggedExperimentTokens";
                String str4 = "ExperimentTokens";
                query = writableDatabase.query("ExperimentTokens", new String[]{"packageName"}, "user = ?", strArr3, null, null, null);
                while (query.moveToNext()) {
                    hashSet.add(query.getString(0));
                }
                if (query != null) {
                    query.close();
                }
                writableDatabase.delete(str4, "user = ?", strArr4);
                writableDatabase.delete("Flags", "user = ?", strArr4);
                writableDatabase.delete("RequestTags", "user = ?", strArr4);
                writableDatabase.delete("ApplicationTags", "user = ?", strArr4);
                writableDatabase.delete(str3, "fromUser = ?", strArr4);
            }
            String str5 = "CrossLoggedExperimentTokens";
            String str6 = "ExperimentTokens";
            for (String str7 : hashSet) {
                anfm.m64162b(writableDatabase, str7);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            SQLiteDatabase writableDatabase2 = this.f76970d.getWritableDatabase();
            writableDatabase2.beginTransaction();
            try {
                Cursor query2 = writableDatabase2.query("Packages", new String[]{"packageName", "version"}, null, null, null, null, null);
                while (query2.moveToNext()) {
                    try {
                        String string = query2.getString(0);
                        rawQuery = writableDatabase2.rawQuery("SELECT MAX(version), user FROM ExperimentTokens WHERE packageName = ? AND version <= ? AND isCommitted = 0 GROUP BY user", new String[]{string, Integer.toString(query2.getInt(1))});
                        boolean z5 = false;
                        while (rawQuery.moveToNext()) {
                            String[] strArr5 = {string, rawQuery.getString(1), Integer.toString(rawQuery.getInt(0))};
                            if (writableDatabase2.delete("Flags", "packageName = ? AND user = ? AND version != ? AND committed = 0", strArr5) > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            boolean z6 = z5 | z;
                            if (writableDatabase2.delete(str6, "packageName = ? AND user = ? AND version != ? AND isCommitted = 0", strArr5) > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z7 = z6 | z2;
                            if (writableDatabase2.delete("ApplicationTags", "packageName = ? AND user = ? AND version != ?", strArr5) > 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            boolean z8 = z7 | z3;
                            if (writableDatabase2.delete(str5, "fromPackageName = ? AND fromUser = ? AND fromVersion != ? AND isCommitted = 0", strArr5) > 0) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            z5 = z8 | z4 | (writableDatabase2.delete(str5, "toPackageName = ? AND fromUser = ? AND toVersion != ? AND isCommitted = 0", strArr5) > 0);
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        if (z5) {
                            anfm.m64162b(writableDatabase2, string);
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        if (query2 != null) {
                            query2.close();
                        }
                        throw th;
                    }
                }
                writableDatabase2.setTransactionSuccessful();
                if (query2 != null) {
                    query2.close();
                }
                writableDatabase2.endTransaction();
                return;
            } catch (Throwable th5) {
                writableDatabase2.endTransaction();
                throw th5;
            }
            throw th3;
            throw th2;
        } catch (Throwable th6) {
            writableDatabase.endTransaction();
            throw th6;
        }
    }

    /* renamed from: a */
    private static String m64508a(List list, LinkedHashMap linkedHashMap, bqzn bqzn) {
        if (linkedHashMap == null) {
            return (String) bnjd.m109587b(list);
        }
        bqzb bqzb = bqzn.f142070d;
        if (bqzb == null) {
            bqzb = bqzb.f142013c;
        }
        int i = bqzb.f142016b;
        return i != -1 ? (String) m64509a(linkedHashMap, i).getKey() : "";
    }

    /* renamed from: a */
    private static Map.Entry m64509a(LinkedHashMap linkedHashMap, int i) {
        if (linkedHashMap == null) {
            throw new AssertionError("map shall not be null");
        } else if (i < 0 || i >= linkedHashMap.size()) {
            throw new IndexOutOfBoundsException(String.format("i: %d is out of range for a map with size of %d", Integer.valueOf(i), Integer.valueOf(linkedHashMap.size())));
        } else {
            int i2 = -1;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                i2++;
                if (i2 == i) {
                    return entry;
                }
            }
            throw new IndexOutOfBoundsException(String.format("j: %d is out of range for a map with size of %d", Integer.valueOf(i2), Integer.valueOf(linkedHashMap.size())));
        }
    }

    /* renamed from: a */
    private static final Set m64510a(SQLiteDatabase sQLiteDatabase) {
        Cursor query = sQLiteDatabase.query("ApplicationStates", new String[]{"user"}, null, null, null, null, null);
        try {
            HashSet hashSet = new HashSet(query.getCount());
            while (query.moveToNext()) {
                hashSet.add(query.getString(0));
            }
            if (query != null) {
                query.close();
            }
            return hashSet;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    private static Set m64511a(bqzd bqzd, bqze bqze) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        bxwc bxwc = bqze.f142030a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bqzn bqzn = ((bqyt) bxwc.get(i)).f141984b;
            if (bqzn == null) {
                bqzn = bqzn.f142065e;
            }
            hashSet2.add(bqzn);
        }
        bxwc bxwc2 = bqzd.f142022c;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bqzn bqzn2 = ((bqys) bxwc2.get(i2)).f141976b;
            if (bqzn2 == null) {
                bqzn2 = bqzn.f142065e;
            }
            bxvt bxvt = bqze.f142034e;
            bqzb bqzb = bqzn2.f142070d;
            if (bqzb == null) {
                bqzb = bqzb.f142013c;
            }
            if (!bxvt.contains(Integer.valueOf(bqzb.f142016b)) && !hashSet2.contains(bqzn2)) {
                hashSet.add(bqzn2);
            }
        }
        return hashSet;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void
     arg types: [java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, int]
     candidates:
      aniu.a(int, java.lang.String, cahw, bxvd, anit, java.util.LinkedHashMap, boolean, java.util.List, java.lang.String, java.util.Set):void
      aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void */
    /* renamed from: a */
    private final void m64512a(int i, String str, cahw cahw, bxvd bxvd, anit anit, LinkedHashMap linkedHashMap, boolean z, List list, String str2, Set set) {
        bxvd bxvd2;
        cahw cahw2 = cahw;
        Iterator it = list.iterator();
        anfy e = null;
        while (it.hasNext()) {
            String str3 = (String) it.next();
            if (bxvd == null) {
                bxvd2 = cahv.f174600h.mo74144da();
            } else {
                bxvd2 = bxvd;
            }
            try {
                m64521a(set, Collections.singletonList(str3), str2, i, str, z, bxvd2, anit, linkedHashMap, false);
                if (bxvd != null) {
                }
            } catch (anfy e2) {
                e = e2;
                bnsl bnsl = (bnsl) f76966a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aniu", "a", 597, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Sync failed");
                if (cahw2.f164950c) {
                    cahw.mo74035c();
                    cahw2.f164950c = false;
                }
                cahz cahz = (cahz) cahw2.f164949b;
                cahz cahz2 = cahz.f174610h;
                cahz.f174617f = 4;
                cahz.f174612a |= 16;
                if ((((cahv) bxvd2.f164949b).f174602a & 2) == 0) {
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cahv cahv = (cahv) bxvd2.f164949b;
                    cahv cahv2 = cahv.f174600h;
                    cahv.f174604c = 1;
                    cahv.f174602a |= 2;
                }
                if (bxvd != null) {
                }
            } catch (Throwable th) {
                if (bxvd == null) {
                    cahw2.mo74649a(bxvd2);
                }
                throw th;
            }
            cahw2.mo74649a(bxvd2);
        }
        if (e != null) {
            throw e;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void
     arg types: [java.util.Set, java.util.List, ?[OBJECT, ARRAY], int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, int]
     candidates:
      aniu.a(int, java.lang.String, cahw, bxvd, anit, java.util.LinkedHashMap, boolean, java.util.List, java.lang.String, java.util.Set):void
      aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void */
    /* renamed from: a */
    private final void m64513a(int i, String str, cahw cahw, bxvd bxvd, anit anit, LinkedHashMap linkedHashMap, boolean z, List list, Set set) {
        cahw cahw2 = cahw;
        bxvd bxvd2 = bxvd;
        try {
            m64521a(set, list, (String) null, i, str, z, bxvd, anit, linkedHashMap, true);
        } catch (anfy e) {
            anfy anfy = e;
            bnsl bnsl = (bnsl) f76966a.mo68388c();
            bnsl.mo68437a(anfy);
            bnsl.mo68432a("aniu", "a", 552, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("SyncInBatch failed");
            if (cahw2.f164950c) {
                cahw.mo74035c();
                cahw2.f164950c = false;
            }
            cahz cahz = (cahz) cahw2.f164949b;
            cahz cahz2 = cahz.f174610h;
            cahz.f174617f = 4;
            cahz.f174612a |= 16;
            if ((((cahv) bxvd2.f164949b).f174602a & 2) == 0) {
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                cahv cahv = (cahv) bxvd2.f164949b;
                cahv cahv2 = cahv.f174600h;
                cahv.f174604c = 1;
                cahv.f174602a |= 2;
            }
            throw anfy;
        }
    }

    /* renamed from: a */
    private static void m64514a(SQLiteDatabase sQLiteDatabase, bqyr bqyr, String str) {
        byte[] blob;
        String[] strArr = {"tokensTag"};
        String[] strArr2 = new String[3];
        bqzn bqzn = ((bqys) bqyr.f164949b).f141976b;
        if (bqzn == null) {
            bqzn = bqzn.f142065e;
        }
        strArr2[0] = bqzn.f142068b;
        strArr2[1] = str;
        bqzn bqzn2 = ((bqys) bqyr.f164949b).f141976b;
        if (bqzn2 == null) {
            bqzn2 = bqzn.f142065e;
        }
        strArr2[2] = Long.toString(bqzn2.f142069c);
        Cursor query = sQLiteDatabase.query("ExperimentTokens", strArr, "packageName = ? AND user = ? AND version = ? AND isCommitted = 0", strArr2, null, null, null);
        try {
            if (query.moveToFirst() && (blob = query.getBlob(0)) != null) {
                bxtx a = bxtx.m123261a(blob);
                if (bqyr.f164950c) {
                    bqyr.mo74035c();
                    bqyr.f164950c = false;
                }
                bqys bqys = (bqys) bqyr.f164949b;
                bqys bqys2 = bqys.f141973g;
                a.getClass();
                bqys.f141975a |= 4;
                bqys.f141979e = a;
            }
            if (query != null) {
                query.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
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
    private static void m64515a(SQLiteDatabase sQLiteDatabase, bqyt bqyt, String str, long j, Integer num) {
        bqzn bqzn = bqyt.f141984b;
        if (bqzn == null) {
            bqzn = bqzn.f142065e;
        }
        ContentValues contentValues = new ContentValues();
        if (bqyt.f141985c.size() > 0) {
            contentValues.put("configHash", Integer.toString(m64505a(bqyt)));
        }
        contentValues.put("flagsHash", num);
        contentValues.put("servingVersion", Long.valueOf(j));
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{bqzn.f142068b, String.valueOf(bqzn.f142069c), str});
        contentValues.put("packageName", bqzn.f142068b);
        contentValues.put("user", str);
        contentValues.put("version", Long.valueOf(bqzn.f142069c));
        contentValues.put("isCommitted", (Integer) 0);
        contentValues.put("experimentToken", new byte[0]);
        contentValues.put("serverToken", "");
        sQLiteDatabase.insertWithOnConflict("ExperimentTokens", null, contentValues, 4);
    }

    /* renamed from: a */
    private static void m64516a(SQLiteDatabase sQLiteDatabase, bqzn bqzn, String str, long j) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("servingVersion", Long.valueOf(j));
        sQLiteDatabase.update("ExperimentTokens", contentValues, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{bqzn.f142068b, String.valueOf(bqzn.f142069c), str});
    }

    /* renamed from: a */
    private static final void m64517a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, long j2) {
        sQLiteDatabase.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND committed = 0", new String[]{str, Long.toString(j), str2, Long.toString(j2)});
    }

    /* renamed from: a */
    private final void m64518a(String str, long j, long j2, String str2, bqzi bqzi, SQLiteStatement sQLiteStatement) {
        if (!bqzi.f142050h) {
            sQLiteStatement.clearBindings();
            sQLiteStatement.bindString(1, str);
            sQLiteStatement.bindLong(2, j);
            sQLiteStatement.bindLong(3, (long) bqzi.f142051i);
            sQLiteStatement.bindLong(4, j2);
            sQLiteStatement.bindString(5, str2);
            sQLiteStatement.bindString(6, bqzi.f142043a);
            long j3 = 0;
            sQLiteStatement.bindLong(7, 0);
            int a = bqzh.m113791a(bqzi.f142049g);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                sQLiteStatement.bindLong(8, bqzi.f142044b);
            } else if (i == 2) {
                if (bqzi.f142045c) {
                    j3 = 1;
                }
                sQLiteStatement.bindLong(9, j3);
            } else if (i == 3) {
                sQLiteStatement.bindDouble(10, bqzi.f142046d);
            } else if (i == 4) {
                sQLiteStatement.bindString(11, bqzi.f142047e);
            } else if (i != 5) {
                bnsl bnsl = (bnsl) f76966a.mo68388c();
                bnsl.mo68432a("aniu", "a", 2332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("Value type not set for flag %s, ignoring", bqzi.f142043a);
                return;
            } else {
                bqzf bqzf = bqzi.f142048f;
                if (bqzf == null) {
                    bqzf = bqzf.f142036b;
                }
                sQLiteStatement.bindBlob(12, bqzf.f142038a.mo73780k());
            }
            String str3 = bqzi.f142043a;
            sQLiteStatement.execute();
            return;
        }
        bnsl bnsl2 = (bnsl) f76966a.mo68390d();
        bnsl2.mo68432a("aniu", "a", 2300, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68424a("deleting flag in updateFlag - not supposed to happen: %s, %s", str, bqzi.f142043a);
    }

    /* renamed from: a */
    private final void m64519a(LinkedHashMap linkedHashMap, boolean z, String... strArr) {
        String str;
        for (String str2 : strArr) {
            if (z) {
                try {
                    str = mo25224a(str2);
                } catch (anfy e) {
                    str = null;
                }
                if (str != null) {
                    linkedHashMap.put(str2, str);
                }
            } else {
                String a = mo25224a(str2);
                if (a != null) {
                    linkedHashMap.put(str2, a);
                }
            }
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:356:0x06ab */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:449:0x02cf */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: bqze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: bqze} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v17, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: java.util.LinkedHashMap} */
    /* JADX WARN: Type inference failed for: r5v10, assign insn: PHI: (r5v10 ?) = (r5v6 bqze), (r5v13 bqze) binds: [B:356:0x06ab, B:371:0x06e5] */
    /* JADX WARN: Type inference failed for: r5v50, assign insn: ?: MOVE  (r5v50 ?) = (r5v17 java.util.LinkedHashMap) */
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
     method: anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, int]
     candidates:
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x03db, code lost:
        if (r3 == null) goto L_0x03dd;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0315 A[Catch:{ all -> 0x068b }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0316 A[Catch:{ all -> 0x068b }] */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0329 A[SYNTHETIC, Splitter:B:180:0x0329] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x037b  */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x03a6  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x03bd A[Catch:{ all -> 0x0656, all -> 0x065e, all -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x03d0 A[Catch:{ all -> 0x0656, all -> 0x065e, all -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:239:0x03d9 A[Catch:{ all -> 0x0656, all -> 0x065e, all -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x03e3 A[Catch:{ all -> 0x0656, all -> 0x065e, all -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x03f9 A[Catch:{ all -> 0x0656, all -> 0x065e, all -> 0x0689 }] */
    /* JADX WARNING: Removed duplicated region for block: B:320:0x0639  */
    /* JADX WARNING: Removed duplicated region for block: B:344:0x0691 A[SYNTHETIC, Splitter:B:344:0x0691] */
    /* JADX WARNING: Removed duplicated region for block: B:424:0x07fe A[SYNTHETIC, Splitter:B:424:0x07fe] */
    /* renamed from: a */
    private final void m64520a(Set set, long j, bqzd bqzd, bqze bqze, List list, LinkedHashMap linkedHashMap, bxvd bxvd, anit anit, boolean z) {
        Integer num;
        bqze bqze2;
        anit anit2;
        bqze bqze3;
        Throwable th;
        long j2;
        Long l;
        Long l2;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        Long l3;
        HashSet<String> hashSet;
        bqze bqze4;
        bqze bqze5;
        SQLiteStatement sQLiteStatement;
        Throwable th2;
        Iterator it;
        bqzn bqzn;
        HashSet hashSet2;
        boolean z4;
        Integer num2;
        boolean j3;
        byte[] bArr;
        String str3;
        String str4;
        String str5;
        String str6;
        Integer num3;
        String str7;
        Integer num4;
        boolean z5;
        Cursor query;
        Throwable th3;
        Long l4;
        int i;
        boolean z6;
        Cursor a;
        Throwable th4;
        String str8;
        Cursor query2;
        Throwable th5;
        Cursor query3;
        Throwable th6;
        long j4;
        String str9;
        bqzd bqzd2 = bqzd;
        bqze bqze6 = bqze;
        List list2 = list;
        ? r5 = linkedHashMap;
        bxvd bxvd2 = bxvd;
        String str10 = "experimentToken";
        if (bqze6.f142032c.isEmpty()) {
            num = 0;
        } else {
            if (bqzd2 != null) {
                try {
                    bqyu bqyu = bqzd2.f142021b;
                    if (bqyu == null) {
                        bqyu = bqyu.f141991h;
                    }
                    str9 = bqyu.f141996d;
                } catch (anfy e) {
                    if (cgem.m144897l()) {
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cahv cahv = (cahv) bxvd2.f164949b;
                        cahv cahv2 = cahv.f174600h;
                        cahv.f174604c = 11;
                        cahv.f174602a |= 2;
                        throw e;
                    }
                    bnsl bnsl = (bnsl) f76966a.mo68388c();
                    bnsl.mo68437a(e);
                    num = 0;
                    bnsl.mo68432a("aniu", "a", 1513, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Skip setting Pseudonymous ID error.");
                }
            } else {
                str9 = null;
            }
            bdza bdza = this.f76974i;
            aood c = aooe.m66192c();
            c.f78603a = bqze6.f142032c;
            c.f78604b = str9;
            bdza.mo25223a(c.mo43121a());
            num = 0;
        }
        SQLiteDatabase writableDatabase = this.f76970d.getWritableDatabase();
        writableDatabase.beginTransaction();
        Collections.emptySet();
        try {
            long a2 = anfm.m64160a(writableDatabase);
            if (a2 != j) {
                if (bxvd2.f164950c) {
                    bxvd.mo74035c();
                    bxvd2.f164950c = false;
                }
                cahv cahv3 = (cahv) bxvd2.f164949b;
                cahv cahv4 = cahv.f174600h;
                cahv3.f174604c = 7;
                cahv3.f174602a |= 2;
                throw new anfy(29504, String.format("Bad change count. Expecting %d, got %d", Long.valueOf(j), Long.valueOf(a2)));
            }
            long j5 = bqze6.f142033d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("key", (Integer) 1);
            contentValues.put("servertimestamp", Long.valueOf(j5));
            try {
                writableDatabase.insertWithOnConflict("LastFetch", null, contentValues, 5);
                Cursor query4 = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 0", null, null, null, null);
                try {
                    if (query4.moveToFirst()) {
                        try {
                            j2 = query4.getLong(0);
                        } catch (Throwable th7) {
                            th = th7;
                            bqze2 = bqze6;
                            anit2 = anit;
                            if (query4 != null) {
                            }
                            throw th;
                        }
                    } else {
                        j2 = 0;
                    }
                    if (query4 != null) {
                        query4.close();
                    }
                    if (j2 > j5) {
                        query3 = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 2", null, null, null, null);
                        if (query3.moveToFirst()) {
                            j4 = query3.getLong(0);
                        } else {
                            j4 = 0;
                        }
                        if (query3 != null) {
                            query3.close();
                        }
                        if (j4 != j2) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("key", (Integer) 2);
                            Long valueOf = Long.valueOf(j2);
                            contentValues2.put("servertimestamp", valueOf);
                            writableDatabase.insertWithOnConflict("LastFetch", null, contentValues2, 5);
                            l = valueOf;
                        } else {
                            l = null;
                        }
                    } else {
                        l = null;
                    }
                    String str11 = "user";
                    if (cgem.m144896k()) {
                        l2 = l;
                        str = "serverToken";
                        z2 = false;
                    } else if (bqze6.f142031b.mo73744a() == 0) {
                        l2 = l;
                        str = "serverToken";
                        z2 = false;
                    } else {
                        if (!z) {
                            str8 = (String) bnjd.m109587b(list);
                        } else {
                            str8 = "ALL_USERS";
                        }
                        ContentValues contentValues3 = new ContentValues();
                        contentValues3.put(str11, str8);
                        contentValues3.put("bytesTag", bqze6.f142031b.mo73780k());
                        HashMap hashMap = new HashMap();
                        query2 = writableDatabase.query("RequestTags", new String[]{str11, "bytesTag"}, null, null, null, null, null);
                        while (query2.moveToNext()) {
                            hashMap.put(query2.getString(0), query2.getBlob(1));
                            l = l;
                        }
                        l2 = l;
                        if (hashMap.containsKey(str8)) {
                            str = "serverToken";
                            if (!Arrays.equals((byte[]) hashMap.get(str8), bqze6.f142031b.mo73780k())) {
                                writableDatabase.update("RequestTags", contentValues3, "user = ?", new String[]{str8});
                            } else {
                                if (query2 != null) {
                                    query2.close();
                                }
                                z2 = false;
                            }
                        } else {
                            str = "serverToken";
                            writableDatabase.insert("RequestTags", null, contentValues3);
                        }
                        if (!"ALL_USERS".equals(str8)) {
                            writableDatabase.delete("RequestTags", "user = ?", new String[]{"ALL_USERS"});
                        } else {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                String str12 = (String) it2.next();
                                ContentValues contentValues4 = new ContentValues();
                                contentValues4.put(str11, str12);
                                contentValues4.put("bytesTag", anfv.f76779a);
                                if (!hashMap.containsKey(str12) || !Arrays.equals((byte[]) hashMap.get(str12), anfv.f76779a)) {
                                    writableDatabase.insertWithOnConflict("RequestTags", null, contentValues4, 5);
                                }
                            }
                        }
                        if (query2 != null) {
                            query2.close();
                        }
                        z2 = true;
                    }
                    if (bqze6.f142030a.size() > 0) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    HashSet hashSet3 = new HashSet();
                    String str13 = "packageName = ? AND version = ? AND user = ? AND isCommitted = 0";
                    String str14 = "flagsHash";
                    if (z3) {
                        try {
                            SQLiteStatement compileStatement = writableDatabase.compileStatement("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                            Long valueOf2 = Long.valueOf(anfm.m64162b(writableDatabase, "__sync"));
                            HashSet hashSet4 = new HashSet();
                            Iterator it3 = bqze6.f142030a.iterator();
                            while (it3.hasNext()) {
                                bqyt bqyt = (bqyt) it3.next();
                                bqzn bqzn2 = bqyt.f141984b;
                                if (bqzn2 == null) {
                                    bqzn2 = bqzn.f142065e;
                                }
                                String str15 = bqzn2.f142068b;
                                Long l5 = valueOf2;
                                bqzn bqzn3 = bqyt.f141984b;
                                if (bqzn3 == null) {
                                    bqzn3 = bqzn.f142065e;
                                }
                                HashSet hashSet5 = hashSet3;
                                long j6 = bqzn3.f142069c;
                                if (cgck.m144753b()) {
                                    try {
                                        if (cgem.m144889d()) {
                                            it = it3;
                                            bqyx bqyx = bqyt.f141990h;
                                            if (bqyx == null) {
                                                bqyx = bqyx.f142002b;
                                            }
                                            anfu.m64172a(writableDatabase, str15, bqyx);
                                            bqzn = bqyt.f141984b;
                                            if (bqzn != null) {
                                                bqzn = bqzn.f142065e;
                                            }
                                            String a3 = m64508a(list2, r5, bqzn);
                                            hashSet4.add(a3);
                                            hashSet2 = hashSet4;
                                            if (cgem.m144889d()) {
                                                if (cgck.m144753b()) {
                                                    if (z) {
                                                        bqyx bqyx2 = bqyt.f141990h;
                                                        if (bqyx2 == null) {
                                                            bqyx2 = bqyx.f142002b;
                                                        }
                                                        int a4 = bqyw.m113780a(bqyx2.f142004a);
                                                        if (a4 != 0) {
                                                            if (a4 == 3) {
                                                                if (a3.equals("")) {
                                                                    boolean z7 = false;
                                                                    for (Iterator it4 = list.iterator(); it4.hasNext(); it4 = it4) {
                                                                        z7 |= m64522a((String) it4.next(), writableDatabase, compileStatement, bqyt);
                                                                    }
                                                                    z4 = z7;
                                                                } else {
                                                                    z4 = false;
                                                                }
                                                                if (!cgem.m144888c()) {
                                                                    a = anfe.m64148a(writableDatabase, str15, j6, a3, false);
                                                                    int a5 = anfe.m64147a(a);
                                                                    if (a != null) {
                                                                        a.close();
                                                                    }
                                                                    num2 = Integer.valueOf(a5);
                                                                } else {
                                                                    num2 = null;
                                                                }
                                                                sQLiteStatement = compileStatement;
                                                                String str16 = "";
                                                                long j7 = bqze6.f142033d;
                                                                j3 = cgem.f186663a.mo6606a().mo83553j();
                                                                if ((bqyt.f141983a & 8) != 0 || bqyt.f141989g.mo73780k().length <= 0) {
                                                                    bArr = null;
                                                                } else {
                                                                    bArr = bqyt.f141989g.mo73780k();
                                                                }
                                                                if (j3) {
                                                                    z5 = z4;
                                                                    if ((bqyt.f141983a & 8) == 0) {
                                                                    }
                                                                    Long valueOf3 = Long.valueOf(j6);
                                                                    String str17 = str14;
                                                                    ArrayList arrayList = new ArrayList();
                                                                    arrayList.add(str10);
                                                                    str3 = str10;
                                                                    arrayList.add(str);
                                                                    String str18 = str;
                                                                    arrayList.add("configHash");
                                                                    arrayList.add("tokensTag");
                                                                    query = writableDatabase.query("ExperimentTokens", (String[]) arrayList.toArray(new String[arrayList.size()]), "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{str15, Long.toString(j6), a3}, null, null, null);
                                                                    if (query.moveToFirst()) {
                                                                        l4 = valueOf3;
                                                                        str4 = str11;
                                                                        if (Arrays.equals(bqyt.f141986d.mo73780k(), query.getBlob(0))) {
                                                                            String str19 = bqyt.f141987e;
                                                                            String string = query.getString(1);
                                                                            if (str19 == null) {
                                                                                if (string != null) {
                                                                                    str19 = str16;
                                                                                }
                                                                                if (!j3 || Arrays.equals(query.getBlob(3), bArr)) {
                                                                                    z6 = false;
                                                                                    i = query.getInt(2);
                                                                                }
                                                                            } else if (string == null) {
                                                                                string = str16;
                                                                            }
                                                                            if (!str19.equals(string)) {
                                                                                z6 = true;
                                                                                i = query.getInt(2);
                                                                            }
                                                                            z6 = false;
                                                                            i = query.getInt(2);
                                                                        }
                                                                        z6 = true;
                                                                        i = query.getInt(2);
                                                                    } else {
                                                                        l4 = valueOf3;
                                                                        str4 = str11;
                                                                        z6 = true;
                                                                        i = 0;
                                                                    }
                                                                    if (query != null) {
                                                                        query.close();
                                                                    }
                                                                    if (j3) {
                                                                        if (!z6) {
                                                                            if (!cgem.m144898m()) {
                                                                                bqzn bqzn4 = bqyt.f141984b;
                                                                                if (bqzn4 == null) {
                                                                                    bqzn4 = bqzn.f142065e;
                                                                                }
                                                                                m64516a(writableDatabase, bqzn4, a3, j7);
                                                                                num3 = num;
                                                                                str14 = str17;
                                                                                str5 = str13;
                                                                                str6 = str18;
                                                                            } else {
                                                                                m64515a(writableDatabase, bqyt, a3, j7, num2);
                                                                                num3 = num;
                                                                                str14 = str17;
                                                                                str5 = str13;
                                                                                str6 = str18;
                                                                            }
                                                                            if (!z5) {
                                                                                bqze6 = bqze;
                                                                                r5 = linkedHashMap;
                                                                                hashSet3 = hashSet5;
                                                                                str7 = str6;
                                                                                str13 = str5;
                                                                                str11 = str4;
                                                                                it3 = it;
                                                                                hashSet4 = hashSet2;
                                                                                compileStatement = sQLiteStatement;
                                                                                str10 = str3;
                                                                                valueOf2 = l5;
                                                                                num4 = num3;
                                                                                list2 = list;
                                                                            }
                                                                            HashSet hashSet6 = hashSet5;
                                                                            hashSet6.add(str15);
                                                                            bqze6 = bqze;
                                                                            r5 = linkedHashMap;
                                                                            hashSet3 = hashSet6;
                                                                            str7 = str6;
                                                                            str13 = str5;
                                                                            str11 = str4;
                                                                            it3 = it;
                                                                            hashSet4 = hashSet2;
                                                                            compileStatement = sQLiteStatement;
                                                                            str10 = str3;
                                                                            valueOf2 = l5;
                                                                            num4 = num3;
                                                                            list2 = list;
                                                                        }
                                                                    }
                                                                    writableDatabase.delete("ExperimentTokens", str13, new String[]{str15, Long.toString(j6), a3});
                                                                    if (bqyt.f141985c.size() > 0) {
                                                                        i = m64505a(bqyt);
                                                                    }
                                                                    ContentValues contentValues5 = new ContentValues();
                                                                    contentValues5.put("packageName", str15);
                                                                    boolean z8 = z6;
                                                                    contentValues5.put("version", l4);
                                                                    contentValues5.put(str4, a3);
                                                                    str4 = str4;
                                                                    num3 = num;
                                                                    contentValues5.put("isCommitted", num3);
                                                                    str5 = str13;
                                                                    contentValues5.put(str3, bqyt.f141986d.mo73780k());
                                                                    str3 = str3;
                                                                    str6 = str18;
                                                                    contentValues5.put(str6, bqyt.f141987e);
                                                                    contentValues5.put("configHash", Integer.toString(i));
                                                                    contentValues5.put("servingVersion", Long.valueOf(j7));
                                                                    contentValues5.put("tokensTag", bArr);
                                                                    str14 = str17;
                                                                    contentValues5.put(str14, num2);
                                                                    if (!j3) {
                                                                        z8 = bArr != null;
                                                                    }
                                                                    writableDatabase.insert("ExperimentTokens", null, contentValues5);
                                                                    if (z8) {
                                                                        bqzn bqzn5 = bqyt.f141984b;
                                                                        if (bqzn5 == null) {
                                                                            bqzn5 = bqzn.f142065e;
                                                                        }
                                                                        writableDatabase.delete("CrossLoggedExperimentTokens", "fromUser = ? AND toPackageName = ? AND toVersion = ? AND isCommitted != 1", new String[]{a3, bqzn5.f142068b, Long.toString(bqzn5.f142069c)});
                                                                        for (bqza bqza : bqyt.f141988f) {
                                                                            ContentValues contentValues6 = new ContentValues();
                                                                            bqzn bqzn6 = bqza.f142009a;
                                                                            if (bqzn6 == null) {
                                                                                bqzn6 = bqzn.f142065e;
                                                                            }
                                                                            contentValues6.put("fromPackageName", bqzn6.f142068b);
                                                                            bqzn bqzn7 = bqza.f142009a;
                                                                            if (bqzn7 == null) {
                                                                                bqzn7 = bqzn.f142065e;
                                                                            }
                                                                            contentValues6.put("fromVersion", Long.valueOf(bqzn7.f142069c));
                                                                            contentValues6.put("fromUser", a3);
                                                                            contentValues6.put("toPackageName", str15);
                                                                            contentValues6.put("toVersion", Long.valueOf(j6));
                                                                            contentValues6.put("isCommitted", num3);
                                                                            contentValues6.put("token", bqza.f142010b.mo73780k());
                                                                            int a6 = bqyz.m113783a(bqza.f142011c);
                                                                            if (a6 == 0) {
                                                                                a6 = 1;
                                                                            }
                                                                            contentValues6.put("provenance", Integer.valueOf(a6 - 1));
                                                                            writableDatabase.insert("CrossLoggedExperimentTokens", null, contentValues6);
                                                                        }
                                                                        HashSet hashSet62 = hashSet5;
                                                                        hashSet62.add(str15);
                                                                        bqze6 = bqze;
                                                                        r5 = linkedHashMap;
                                                                        hashSet3 = hashSet62;
                                                                        str7 = str6;
                                                                        str13 = str5;
                                                                        str11 = str4;
                                                                        it3 = it;
                                                                        hashSet4 = hashSet2;
                                                                        compileStatement = sQLiteStatement;
                                                                        str10 = str3;
                                                                        valueOf2 = l5;
                                                                        num4 = num3;
                                                                        list2 = list;
                                                                    } else {
                                                                        if (!z5) {
                                                                        }
                                                                        HashSet hashSet622 = hashSet5;
                                                                        hashSet622.add(str15);
                                                                        bqze6 = bqze;
                                                                        r5 = linkedHashMap;
                                                                        hashSet3 = hashSet622;
                                                                        str7 = str6;
                                                                        str13 = str5;
                                                                        str11 = str4;
                                                                        it3 = it;
                                                                        hashSet4 = hashSet2;
                                                                        compileStatement = sQLiteStatement;
                                                                        str10 = str3;
                                                                        valueOf2 = l5;
                                                                        num4 = num3;
                                                                        list2 = list;
                                                                    }
                                                                } else {
                                                                    z5 = z4;
                                                                }
                                                                if (cgem.m144898m()) {
                                                                    bqzn bqzn8 = bqyt.f141984b;
                                                                    if (bqzn8 == null) {
                                                                        bqzn8 = bqzn.f142065e;
                                                                    }
                                                                    m64516a(writableDatabase, bqzn8, a3, j7);
                                                                    str4 = str11;
                                                                    str3 = str10;
                                                                    num3 = num;
                                                                    str5 = str13;
                                                                    str6 = str;
                                                                } else {
                                                                    m64515a(writableDatabase, bqyt, a3, j7, num2);
                                                                    str4 = str11;
                                                                    str3 = str10;
                                                                    num3 = num;
                                                                    str5 = str13;
                                                                    str6 = str;
                                                                }
                                                                if (!z5) {
                                                                }
                                                                HashSet hashSet6222 = hashSet5;
                                                                hashSet6222.add(str15);
                                                                bqze6 = bqze;
                                                                r5 = linkedHashMap;
                                                                hashSet3 = hashSet6222;
                                                                str7 = str6;
                                                                str13 = str5;
                                                                str11 = str4;
                                                                it3 = it;
                                                                hashSet4 = hashSet2;
                                                                compileStatement = sQLiteStatement;
                                                                str10 = str3;
                                                                valueOf2 = l5;
                                                                num4 = num3;
                                                                list2 = list;
                                                            }
                                                        }
                                                        z4 = m64522a(a3, writableDatabase, compileStatement, bqyt);
                                                        if (!cgem.m144888c()) {
                                                        }
                                                        sQLiteStatement = compileStatement;
                                                        String str162 = "";
                                                        long j72 = bqze6.f142033d;
                                                        j3 = cgem.f186663a.mo6606a().mo83553j();
                                                        if ((bqyt.f141983a & 8) != 0) {
                                                        }
                                                        bArr = null;
                                                        if (j3) {
                                                        }
                                                        if (cgem.m144898m()) {
                                                        }
                                                        if (!z5) {
                                                        }
                                                        HashSet hashSet62222 = hashSet5;
                                                        hashSet62222.add(str15);
                                                        bqze6 = bqze;
                                                        r5 = linkedHashMap;
                                                        hashSet3 = hashSet62222;
                                                        str7 = str6;
                                                        str13 = str5;
                                                        str11 = str4;
                                                        it3 = it;
                                                        hashSet4 = hashSet2;
                                                        compileStatement = sQLiteStatement;
                                                        str10 = str3;
                                                        valueOf2 = l5;
                                                        num4 = num3;
                                                        list2 = list;
                                                    }
                                                }
                                            }
                                            z4 = m64522a(a3, writableDatabase, compileStatement, bqyt);
                                            if (!cgem.m144888c()) {
                                            }
                                            sQLiteStatement = compileStatement;
                                            String str1622 = "";
                                            try {
                                                long j722 = bqze6.f142033d;
                                                j3 = cgem.f186663a.mo6606a().mo83553j();
                                                if ((bqyt.f141983a & 8) != 0) {
                                                }
                                                bArr = null;
                                                if (j3) {
                                                }
                                                if (cgem.m144898m()) {
                                                }
                                                if (!z5) {
                                                }
                                                HashSet hashSet622222 = hashSet5;
                                                hashSet622222.add(str15);
                                                bqze6 = bqze;
                                                r5 = linkedHashMap;
                                                hashSet3 = hashSet622222;
                                                str7 = str6;
                                                str13 = str5;
                                                str11 = str4;
                                                it3 = it;
                                                hashSet4 = hashSet2;
                                                compileStatement = sQLiteStatement;
                                                str10 = str3;
                                                valueOf2 = l5;
                                                num4 = num3;
                                                list2 = list;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                th2 = th;
                                                if (sQLiteStatement != null) {
                                                    sQLiteStatement.close();
                                                }
                                                throw th2;
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        th2 = th9;
                                        sQLiteStatement = compileStatement;
                                        if (sQLiteStatement != null) {
                                        }
                                        throw th2;
                                    }
                                }
                                it = it3;
                                try {
                                    bqzn = bqyt.f141984b;
                                    if (bqzn != null) {
                                    }
                                    String a32 = m64508a(list2, r5, bqzn);
                                    hashSet4.add(a32);
                                    hashSet2 = hashSet4;
                                    if (cgem.m144889d()) {
                                    }
                                    z4 = m64522a(a32, writableDatabase, compileStatement, bqyt);
                                    if (!cgem.m144888c()) {
                                    }
                                    sQLiteStatement = compileStatement;
                                    String str16222 = "";
                                    long j7222 = bqze6.f142033d;
                                    j3 = cgem.f186663a.mo6606a().mo83553j();
                                    if ((bqyt.f141983a & 8) != 0) {
                                    }
                                    bArr = null;
                                    if (j3) {
                                    }
                                    if (cgem.m144898m()) {
                                    }
                                    if (!z5) {
                                    }
                                    HashSet hashSet6222222 = hashSet5;
                                    hashSet6222222.add(str15);
                                    bqze6 = bqze;
                                    r5 = linkedHashMap;
                                    hashSet3 = hashSet6222222;
                                    str7 = str6;
                                    str13 = str5;
                                    str11 = str4;
                                    it3 = it;
                                    hashSet4 = hashSet2;
                                    compileStatement = sQLiteStatement;
                                    str10 = str3;
                                    valueOf2 = l5;
                                    num4 = num3;
                                    list2 = list;
                                } catch (Throwable th10) {
                                    th = th10;
                                    sQLiteStatement = compileStatement;
                                    th2 = th;
                                    if (sQLiteStatement != null) {
                                    }
                                    throw th2;
                                }
                            }
                            Long l6 = valueOf2;
                            hashSet = hashSet3;
                            str2 = str13;
                            SQLiteStatement sQLiteStatement2 = compileStatement;
                            for (String str20 : hashSet) {
                                anfm.m64162b(writableDatabase, str20);
                            }
                            if (sQLiteStatement2 != null) {
                                sQLiteStatement2.close();
                            }
                            l3 = l6;
                            r5 = r5;
                        } catch (Throwable th11) {
                            th = th11;
                            bqze3 = bqze;
                        }
                    } else {
                        hashSet = hashSet3;
                        str2 = str13;
                        l3 = null;
                    }
                    bqzd bqzd3 = bqzd;
                    if (bqzd3 != null) {
                        try {
                            if (bqzd3.f142022c.size() <= 0) {
                                bqze4 = bqze;
                            } else {
                                for (bqzn bqzn9 : m64511a(bqzd, bqze)) {
                                    bqze bqze7 = bqze;
                                    bxvt bxvt = bqze7.f142034e;
                                    bqzb bqzb = bqzn9.f142070d;
                                    if (bqzb == null) {
                                        bqzb = bqzb.f142013c;
                                    }
                                    if (!bxvt.contains(Integer.valueOf(bqzb.f142016b))) {
                                        String a7 = m64508a(list, linkedHashMap, bqzn9);
                                        m64516a(writableDatabase, bqzn9, a7, bqze7.f142033d);
                                        if (!cgem.m144888c()) {
                                            if (cgem.f186663a.mo6606a().mo83545b()) {
                                                ContentValues contentValues7 = new ContentValues();
                                                contentValues7.putNull(str14);
                                                writableDatabase.update("ExperimentTokens", contentValues7, str2, new String[]{bqzn9.f142068b, String.valueOf(bqzn9.f142069c), a7});
                                                str2 = str2;
                                            }
                                        }
                                    }
                                }
                                HashSet<String> hashSet7 = new HashSet();
                                for (bqys bqys : bqzd3.f142022c) {
                                    bqzn bqzn10 = bqys.f141976b;
                                    if (bqzn10 == null) {
                                        bqzn10 = bqzn.f142065e;
                                    }
                                    r5 = bqze;
                                    bxvt bxvt2 = r5.f142034e;
                                    bqzb bqzb2 = bqzn10.f142070d;
                                    if (bqzb2 == null) {
                                        bqzb2 = bqzb.f142013c;
                                    }
                                    if (!bxvt2.contains(Integer.valueOf(bqzb2.f142016b))) {
                                        hashSet7.add(bqzn10.f142068b);
                                    }
                                }
                                bqze4 = bqze;
                                for (String str21 : hashSet7) {
                                    anfu.m64171a(writableDatabase, str21);
                                }
                            }
                        } catch (Throwable th12) {
                            th = th12;
                            bqze5 = r5;
                            bqze3 = bqze5;
                            anit2 = anit;
                            anit2.f76965g = bqze2.f142034e.size();
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    } else {
                        bqze4 = bqze;
                    }
                    set.addAll(hashSet);
                    writableDatabase.setTransactionSuccessful();
                    anit anit3 = anit;
                    if (anit3 != null && bqze4.f142034e.size() > 0) {
                        anit3.f76965g = bqze4.f142034e.size();
                    }
                    writableDatabase.endTransaction();
                    anfh.m64156a();
                    if (l2 != null) {
                        if (cgej.m144882b()) {
                            mo25226a(l2.longValue());
                        }
                    }
                    if (l3 != null && l3.longValue() % cgec.f186635a.mo6606a().mo83537r() == 0) {
                        mo41859f();
                    }
                    m64526g();
                    return;
                } catch (Throwable th13) {
                    bqze2 = bqze6;
                    anit2 = anit;
                    th = th13;
                    if (query4 != null) {
                        try {
                            query4.close();
                        } catch (Throwable th14) {
                            th = th14;
                            anit2.f76965g = bqze2.f142034e.size();
                            writableDatabase.endTransaction();
                            throw th;
                        }
                    }
                    throw th;
                }
            } catch (Throwable th15) {
                th = th15;
                bqze3 = bqze6;
                anit2 = anit;
                if (anit2 != null && bqze2.f142034e.size() > 0) {
                    anit2.f76965g = bqze2.f142034e.size();
                }
                writableDatabase.endTransaction();
                throw th;
            }
            throw th5;
            throw th3;
            throw th4;
            throw th6;
        } catch (Throwable th16) {
            th = th16;
            bqze3 = bqze6;
            anit2 = anit;
            anit2.f76965g = bqze2.f142034e.size();
            writableDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:499:0x0926 */
    /* JADX WARN: Type inference failed for: r3v22, assign insn: PHI: (r3v22 ?) = (r3v90 ?), (r3v91 ?), (r3v92 ?) binds: [B:270:0x050f, B:269:0x050d, B:267:0x0509] */
    /* JADX WARN: Type inference failed for: r3v53, types: [boolean], assign insn: 0x08d5: INVOKE  (r3v53 ? I:boolean) = (r2v45 java.util.Iterator) type: INTERFACE call: java.util.Iterator.hasNext():boolean */
    /* JADX WARN: Type inference failed for: r3v90, assign insn: 0x050f: CONST  (r3v90 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r3v91, assign insn: 0x050d: CONST  (r3v91 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r3v92, assign insn: 0x0509: CONST  (r3v92 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
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
     method: anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, int]
     candidates:
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x064c, code lost:
        if (r14 == null) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x08fd, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0903, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0904, code lost:
        r7 = r43;
        r1 = r44;
        r4 = r0;
        r3 = r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0ac3, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:477:0x08e7, B:485:0x08f9] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:336:0x05ea  */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x0615  */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0628 A[SYNTHETIC, Splitter:B:360:0x0628] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x063b  */
    /* JADX WARNING: Removed duplicated region for block: B:373:0x064a A[Catch:{ all -> 0x0644 }] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0654 A[Catch:{ all -> 0x0644 }] */
    /* JADX WARNING: Removed duplicated region for block: B:381:0x0668 A[Catch:{ all -> 0x0644 }] */
    /* JADX WARNING: Removed duplicated region for block: B:459:0x0898  */
    /* JADX WARNING: Removed duplicated region for block: B:485:0x08f9 A[SYNTHETIC, Splitter:B:485:0x08f9] */
    /* JADX WARNING: Removed duplicated region for block: B:618:0x0afa A[SYNTHETIC, Splitter:B:618:0x0afa] */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x0b4c A[Catch:{ all -> 0x0b60 }] */
    /* JADX WARNING: Removed duplicated region for block: B:644:0x0b4d A[Catch:{ all -> 0x0b60 }] */
    /* JADX WARNING: Removed duplicated region for block: B:652:0x0b6d A[Catch:{ anfy -> 0x02b7, IOException -> 0x02b0, all -> 0x02a9, IOException -> 0x0b84 }] */
    /* JADX WARNING: Removed duplicated region for block: B:653:0x0b6e A[Catch:{ anfy -> 0x02b7, IOException -> 0x02b0, all -> 0x02a9, IOException -> 0x0b84 }] */
    /* JADX WARNING: Removed duplicated region for block: B:670:0x0ba8 A[Catch:{ all -> 0x0bc4, all -> 0x0bc9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x0ba9 A[Catch:{ all -> 0x0bc4, all -> 0x0bc9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:674:0x0bbd A[Catch:{ all -> 0x0bc4, all -> 0x0bc9 }] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    private final void m64521a(Set set, List list, String str, int i, String str2, boolean z, bxvd bxvd, anit anit, LinkedHashMap linkedHashMap, boolean z2) {
        String str3;
        int i2;
        Throwable th;
        String str4;
        bxvd bxvd2;
        Throwable th2;
        anit anit2;
        IOException iOException;
        aniy aniy;
        Throwable th3;
        aniu aniu;
        bxvd bxvd3;
        IOException iOException2;
        anit anit3;
        aniu aniu2;
        bxvd bxvd4;
        anit anit4;
        int i3;
        boolean z3;
        bqze bqze;
        Throwable th4;
        long j;
        Long l;
        Long l2;
        boolean z4;
        ? r3;
        Long l3;
        bqzd bqzd;
        bqze bqze2;
        Long l4;
        bqze bqze3;
        HashSet hashSet;
        SQLiteStatement sQLiteStatement;
        Throwable th5;
        ? hasNext;
        HashSet hashSet2;
        boolean z5;
        Integer num;
        boolean j2;
        byte[] bArr;
        bqzd bqzd2;
        HashSet hashSet3;
        boolean z6;
        Long l5;
        boolean z7;
        Cursor query;
        Throwable th6;
        int i4;
        boolean z8;
        boolean z9;
        Cursor a;
        Throwable th7;
        String str5;
        Cursor query2;
        Throwable th8;
        Cursor query3;
        Throwable th9;
        long j3;
        String str6;
        String str7 = str;
        bxvd bxvd5 = bxvd;
        anit anit5 = anit;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!z2) {
            str3 = (String) bnjd.m109587b(list);
        } else {
            str3 = null;
        }
        if (!z2) {
            i2 = !"".equals(str3) ? 3 : 2;
        } else {
            i2 = 4;
        }
        if (bxvd5.f164950c) {
            bxvd.mo74035c();
            bxvd5.f164950c = false;
        }
        cahv cahv = (cahv) bxvd5.f164949b;
        cahv cahv2 = cahv.f174600h;
        cahv.f174603b = i2 - 1;
        long j4 = elapsedRealtime;
        cahv.f174602a |= 1;
        synchronized (f76967b) {
            String str8 = str3;
            try {
                bqzd a2 = mo41851a(list, i, str2, z, linkedHashMap, z2, bxvd);
                if (linkedHashMap2 != null) {
                    try {
                        str4 = TextUtils.join("+", linkedHashMap.values());
                    } catch (Throwable th10) {
                        th = th10;
                        throw th;
                    }
                } else if (!"".equals(str8)) {
                    str4 = mo25224a(str8);
                } else {
                    str4 = str7 != null ? mo25224a(str7) : null;
                }
                long a3 = anfm.m64160a(this.f76970d.getWritableDatabase());
                try {
                    String b = mo25228b();
                    bnsl a4 = f76966a.mo26019b(m64527h());
                    a4.mo68432a("aniu", "a", 1296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a4.mo68420a("Heterodyne Request: %s", a2);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    try {
                        mo41844bp();
                        aniy a5 = this.f76973h.mo25221a(a2, str4, b);
                        try {
                            int i5 = a5.f76984b;
                            if (i5 > 0) {
                                mo25225a(i5);
                            }
                            if (a5.f76985c) {
                                try {
                                    bqze bqze4 = a5.f76983a;
                                    if (bqze4 != null && bqze4.f142034e.size() > 0) {
                                        for (Integer num2 : a5.f76983a.f142034e) {
                                            mo25229b((String) m64509a(linkedHashMap2, num2.intValue()).getValue());
                                        }
                                    }
                                } catch (IOException e) {
                                    iOException2 = e;
                                    aniu2 = this;
                                    bxvd4 = bxvd5;
                                    anit4 = anit5;
                                    aniy = a5;
                                    try {
                                        if (bxvd3.f164950c) {
                                        }
                                        cahv cahv3 = (cahv) bxvd3.f164949b;
                                        cahv3.f174604c = 2;
                                        cahv3.f174602a = 2 | cahv3.f174602a;
                                        throw iOException2;
                                    } catch (Throwable th11) {
                                        th3 = th11;
                                        int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime2);
                                        if (!bxvd2.f164950c) {
                                        }
                                        cahv cahv4 = (cahv) bxvd2.f164949b;
                                        cahv4.f174602a |= 8;
                                        cahv4.f174606e = elapsedRealtime3;
                                        aniu.mo41843a(aniy);
                                        throw th3;
                                    }
                                } catch (Throwable th12) {
                                    th3 = th12;
                                    aniu = this;
                                    bxvd3 = bxvd5;
                                    anit3 = anit5;
                                    aniy = a5;
                                    int elapsedRealtime32 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime2);
                                    if (!bxvd2.f164950c) {
                                    }
                                    cahv cahv42 = (cahv) bxvd2.f164949b;
                                    cahv42.f174602a |= 8;
                                    cahv42.f174606e = elapsedRealtime32;
                                    aniu.mo41843a(aniy);
                                    throw th3;
                                }
                            } else if (z2) {
                                for (String str9 : linkedHashMap.values()) {
                                    mo25229b(str9);
                                }
                                if (anit5 != null) {
                                    anit5.f76965g = list.size() - 1;
                                }
                            } else if (linkedHashMap2 != null) {
                                mo25229b((String) linkedHashMap2.get(bnjd.m109587b(list)));
                                if (anit5 != null) {
                                    anit5.f76965g = 1;
                                }
                            } else {
                                mo25229b(str4);
                            }
                            if (!a5.f76985c) {
                                if (!bxvd5.f164950c) {
                                    z3 = false;
                                } else {
                                    bxvd.mo74035c();
                                    z3 = false;
                                    bxvd5.f164950c = false;
                                }
                                cahv cahv5 = (cahv) bxvd5.f164949b;
                                cahv5.f174604c = 3;
                                i3 = 2;
                                cahv5.f174602a |= 2;
                            } else {
                                z3 = false;
                                z3 = false;
                                z3 = false;
                                z3 = false;
                                z3 = false;
                                i3 = 2;
                                i3 = 2;
                                i3 = 2;
                                i3 = 2;
                                i3 = 2;
                                int i6 = a5.f76986d;
                                if (i6 == 0) {
                                    if (bxvd5.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd5.f164950c = false;
                                    }
                                    cahv cahv6 = (cahv) bxvd5.f164949b;
                                    cahv6.f174604c = 4;
                                    cahv6.f174602a |= 2;
                                } else {
                                    if (i6 >= 200) {
                                        if (i6 < 300) {
                                            bqze bqze5 = a5.f76983a;
                                            if (bqze5 == null) {
                                                if (bxvd5.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd5.f164950c = false;
                                                }
                                                cahv cahv7 = (cahv) bxvd5.f164949b;
                                                cahv7.f174604c = 5;
                                                cahv7.f174602a |= 2;
                                            } else if (bqze5.f142034e.size() > 0) {
                                                if (bxvd5.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd5.f164950c = false;
                                                }
                                                cahv cahv8 = (cahv) bxvd5.f164949b;
                                                cahv8.f174604c = 9;
                                                cahv8.f174602a |= 2;
                                            }
                                        }
                                    }
                                    if (bxvd5.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd5.f164950c = false;
                                    }
                                    cahv cahv9 = (cahv) bxvd5.f164949b;
                                    cahv9.f174604c = 6;
                                    cahv9.f174602a |= 2;
                                }
                            }
                            if (cgem.f186663a.mo6606a().mo83556m()) {
                                int i7 = a5.f76986d;
                                if (i7 != 200) {
                                    if (bxvd5.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd5.f164950c = z3;
                                    }
                                    cahv cahv10 = (cahv) bxvd5.f164949b;
                                    cahv10.f174602a |= 4;
                                    cahv10.f174605d = i7;
                                }
                            }
                            if (a5.f76983a != null) {
                                bnsl a6 = f76966a.mo26019b(m64527h());
                                a6.mo68432a("aniu", "a", 1378, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                a6.mo68420a("Heterodyne Response: %s", a5.f76983a);
                                bqze bqze6 = a5.f76983a;
                                int elapsedRealtime4 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime2);
                                if (bxvd5.f164950c) {
                                    bxvd.mo74035c();
                                    bxvd5.f164950c = false;
                                }
                                cahv cahv11 = (cahv) bxvd5.f164949b;
                                cahv11.f174602a |= 8;
                                cahv11.f174606e = elapsedRealtime4;
                                mo41843a(a5);
                                if (!bqze6.f142032c.isEmpty()) {
                                    if (a2 != null) {
                                        try {
                                            bqyu bqyu = a2.f142021b;
                                            if (bqyu == null) {
                                                bqyu = bqyu.f141991h;
                                            }
                                            str6 = bqyu.f141996d;
                                        } catch (anfy e2) {
                                            anfy anfy = e2;
                                            if (!cgem.m144897l()) {
                                                bnsl bnsl = (bnsl) f76966a.mo68388c();
                                                bnsl.mo68437a(anfy);
                                                bnsl.mo68432a("aniu", "a", 1513, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                                bnsl.mo68405a("Skip setting Pseudonymous ID error.");
                                            } else {
                                                bxvd bxvd6 = bxvd5;
                                                if (bxvd6.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd6.f164950c = false;
                                                }
                                                cahv cahv12 = (cahv) bxvd6.f164949b;
                                                cahv12.f174604c = 11;
                                                cahv12.f174602a |= 2;
                                                throw anfy;
                                            }
                                        } catch (IOException e3) {
                                            iOException = e3;
                                            bxvd2 = bxvd5;
                                            anit2 = anit5;
                                            try {
                                                throw new anfy(29504, "Network error", iOException);
                                            } catch (Throwable th13) {
                                                th = th13;
                                                th2 = th;
                                                int elapsedRealtime5 = (int) (SystemClock.elapsedRealtime() - j4);
                                                if (bxvd2.f164950c) {
                                                }
                                                cahv cahv13 = (cahv) bxvd2.f164949b;
                                                cahv13.f174602a |= 16;
                                                cahv13.f174607f = elapsedRealtime5;
                                                if (anit2 != null) {
                                                }
                                                throw th2;
                                            }
                                        } catch (IOException e4) {
                                            e = e4;
                                            iOException = e;
                                            throw new anfy(29504, "Network error", iOException);
                                        } catch (Throwable th14) {
                                            th2 = th14;
                                            bxvd2 = bxvd5;
                                            anit2 = anit5;
                                            int elapsedRealtime52 = (int) (SystemClock.elapsedRealtime() - j4);
                                            if (bxvd2.f164950c) {
                                            }
                                            cahv cahv132 = (cahv) bxvd2.f164949b;
                                            cahv132.f174602a |= 16;
                                            cahv132.f174607f = elapsedRealtime52;
                                            if (anit2 != null) {
                                            }
                                            throw th2;
                                        }
                                    } else {
                                        str6 = null;
                                    }
                                    bdza bdza = this.f76974i;
                                    aood c = aooe.m66192c();
                                    c.f78603a = bqze6.f142032c;
                                    c.f78604b = str6;
                                    bdza.mo25223a(c.mo43121a());
                                }
                                SQLiteDatabase writableDatabase = this.f76970d.getWritableDatabase();
                                writableDatabase.beginTransaction();
                                Collections.emptySet();
                                try {
                                    long a7 = anfm.m64160a(writableDatabase);
                                    if (a7 != a3) {
                                        if (bxvd5.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd5.f164950c = false;
                                        }
                                        cahv cahv14 = (cahv) bxvd5.f164949b;
                                        cahv14.f174604c = 7;
                                        cahv14.f174602a |= 2;
                                        throw new anfy(29504, String.format("Bad change count. Expecting %d, got %d", Long.valueOf(a3), Long.valueOf(a7)));
                                    }
                                    long j5 = bqze6.f142033d;
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("key", (Integer) 1);
                                    contentValues.put("servertimestamp", Long.valueOf(j5));
                                    writableDatabase.insertWithOnConflict("LastFetch", null, contentValues, 5);
                                    Cursor query4 = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 0", null, null, null, null);
                                    try {
                                        if (query4.moveToFirst()) {
                                            j = query4.getLong(0);
                                        } else {
                                            j = 0;
                                        }
                                        if (query4 != null) {
                                            query4.close();
                                        }
                                        if (j > j5) {
                                            query3 = writableDatabase.query("LastFetch", new String[]{"servertimestamp"}, "key = 2", null, null, null, null);
                                            if (query3.moveToFirst()) {
                                                j3 = query3.getLong(0);
                                            } else {
                                                j3 = 0;
                                            }
                                            if (query3 != null) {
                                                query3.close();
                                            }
                                            if (j3 != j) {
                                                ContentValues contentValues2 = new ContentValues();
                                                contentValues2.put("key", (Integer) 2);
                                                l = Long.valueOf(j);
                                                contentValues2.put("servertimestamp", l);
                                                writableDatabase.insertWithOnConflict("LastFetch", null, contentValues2, 5);
                                            } else {
                                                l = null;
                                            }
                                        } else {
                                            l = null;
                                        }
                                        if (cgem.m144896k()) {
                                            l2 = null;
                                            z4 = false;
                                        } else if (bqze6.f142031b.mo73744a() == 0) {
                                            z4 = false;
                                            l2 = null;
                                        } else {
                                            if (!z2) {
                                                str5 = (String) bnjd.m109587b(list);
                                            } else {
                                                str5 = "ALL_USERS";
                                            }
                                            ContentValues contentValues3 = new ContentValues();
                                            contentValues3.put("user", str5);
                                            contentValues3.put("bytesTag", bqze6.f142031b.mo73780k());
                                            HashMap hashMap = new HashMap();
                                            query2 = writableDatabase.query("RequestTags", new String[]{"user", "bytesTag"}, null, null, null, null, null);
                                            while (query2.moveToNext()) {
                                                hashMap.put(query2.getString(0), query2.getBlob(1));
                                            }
                                            if (!hashMap.containsKey(str5)) {
                                                writableDatabase.insert("RequestTags", null, contentValues3);
                                            } else if (!Arrays.equals((byte[]) hashMap.get(str5), bqze6.f142031b.mo73780k())) {
                                                writableDatabase.update("RequestTags", contentValues3, "user = ?", new String[]{str5});
                                            } else {
                                                if (query2 != null) {
                                                    query2.close();
                                                }
                                                z4 = false;
                                                l2 = null;
                                            }
                                            if (!"ALL_USERS".equals(str5)) {
                                                writableDatabase.delete("RequestTags", "user = ?", new String[]{"ALL_USERS"});
                                                l2 = null;
                                            } else {
                                                Iterator it = list.iterator();
                                                while (it.hasNext()) {
                                                    String str10 = (String) it.next();
                                                    ContentValues contentValues4 = new ContentValues();
                                                    contentValues4.put("user", str10);
                                                    contentValues4.put("bytesTag", anfv.f76779a);
                                                    if (!hashMap.containsKey(str10) || !Arrays.equals((byte[]) hashMap.get(str10), anfv.f76779a)) {
                                                        writableDatabase.insertWithOnConflict("RequestTags", null, contentValues4, 5);
                                                    }
                                                }
                                                l2 = null;
                                            }
                                            if (query2 != null) {
                                                query2.close();
                                            }
                                            z4 = true;
                                        }
                                        if (bqze6.f142030a.size() > 0) {
                                            r3 = 1;
                                        } else {
                                            r3 = !z4 ? 0 : 1;
                                        }
                                        HashSet hashSet4 = new HashSet();
                                        if (r3 != 0) {
                                            try {
                                                SQLiteStatement compileStatement = writableDatabase.compileStatement("INSERT OR REPLACE INTO Flags(packageName, version, flagType, partitionId, user, name, committed, intVal, boolVal, floatVal, stringVal, extensionVal) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                                                Long valueOf = Long.valueOf(anfm.m64162b(writableDatabase, "__sync"));
                                                HashSet hashSet5 = new HashSet();
                                                Iterator it2 = bqze6.f142030a.iterator();
                                                while (it2.hasNext()) {
                                                    bqyt bqyt = (bqyt) it2.next();
                                                    bqzn bqzn = bqyt.f141984b;
                                                    if (bqzn == null) {
                                                        bqzn = bqzn.f142065e;
                                                    }
                                                    String str11 = bqzn.f142068b;
                                                    Long l6 = valueOf;
                                                    bqzn bqzn2 = bqyt.f141984b;
                                                    if (bqzn2 == null) {
                                                        bqzn2 = bqzn.f142065e;
                                                    }
                                                    Iterator it3 = it2;
                                                    long j6 = bqzn2.f142069c;
                                                    if (cgck.m144753b()) {
                                                        try {
                                                            if (cgem.m144889d()) {
                                                                bqyx bqyx = bqyt.f141990h;
                                                                if (bqyx == null) {
                                                                    bqyx = bqyx.f142002b;
                                                                }
                                                                anfu.m64172a(writableDatabase, str11, bqyx);
                                                            }
                                                        } catch (Throwable th15) {
                                                            th5 = th15;
                                                            sQLiteStatement = compileStatement;
                                                            bqze2 = bqze6;
                                                            if (sQLiteStatement != null) {
                                                            }
                                                            throw th5;
                                                        }
                                                    }
                                                    bqzn bqzn3 = bqyt.f141984b;
                                                    if (bqzn3 == null) {
                                                        bqzn3 = bqzn.f142065e;
                                                    }
                                                    Long l7 = l;
                                                    String a8 = m64508a(list, linkedHashMap2, bqzn3);
                                                    hashSet5.add(a8);
                                                    if (!cgem.m144889d()) {
                                                        hashSet2 = hashSet5;
                                                    } else if (!cgck.m144753b()) {
                                                        hashSet2 = hashSet5;
                                                    } else if (z2) {
                                                        bqyx bqyx2 = bqyt.f141990h;
                                                        if (bqyx2 == null) {
                                                            bqyx2 = bqyx.f142002b;
                                                        }
                                                        int a9 = bqyw.m113780a(bqyx2.f142004a);
                                                        if (a9 == 0) {
                                                            hashSet2 = hashSet5;
                                                        } else {
                                                            hashSet2 = hashSet5;
                                                            if (a9 == 3) {
                                                                if (a8.equals("")) {
                                                                    boolean z10 = false;
                                                                    for (Iterator it4 = list.iterator(); it4.hasNext(); it4 = it4) {
                                                                        z10 |= m64522a((String) it4.next(), writableDatabase, compileStatement, bqyt);
                                                                    }
                                                                    z5 = z10;
                                                                } else {
                                                                    z5 = false;
                                                                }
                                                                if (cgem.m144888c()) {
                                                                    a = anfe.m64148a(writableDatabase, str11, j6, a8, false);
                                                                    int a10 = anfe.m64147a(a);
                                                                    if (a != null) {
                                                                        a.close();
                                                                    }
                                                                    num = Integer.valueOf(a10);
                                                                } else {
                                                                    num = null;
                                                                }
                                                                long j7 = bqze6.f142033d;
                                                                j2 = cgem.f186663a.mo6606a().mo83553j();
                                                                if ((bqyt.f141983a & 8) != 0) {
                                                                    if (bqyt.f141989g.mo73780k().length > 0) {
                                                                        bArr = bqyt.f141989g.mo73780k();
                                                                        if (j2) {
                                                                            bqze2 = bqze6;
                                                                            try {
                                                                                if ((bqyt.f141983a & 8) == 0) {
                                                                                }
                                                                            } catch (Throwable th16) {
                                                                                th5 = th16;
                                                                                sQLiteStatement = compileStatement;
                                                                                if (sQLiteStatement != null) {
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                            try {
                                                                                Long valueOf2 = Long.valueOf(j6);
                                                                                bqzd2 = a2;
                                                                                ArrayList arrayList = new ArrayList();
                                                                                sQLiteStatement = compileStatement;
                                                                                try {
                                                                                    arrayList.add("experimentToken");
                                                                                    arrayList.add("serverToken");
                                                                                    arrayList.add("configHash");
                                                                                    arrayList.add("tokensTag");
                                                                                    query = writableDatabase.query("ExperimentTokens", (String[]) arrayList.toArray(new String[arrayList.size()]), "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{str11, Long.toString(j6), a8}, null, null, null);
                                                                                    if (query.moveToFirst()) {
                                                                                        hashSet3 = hashSet4;
                                                                                        z7 = z5;
                                                                                        if (Arrays.equals(bqyt.f141986d.mo73780k(), query.getBlob(0))) {
                                                                                            String str12 = bqyt.f141987e;
                                                                                            String string = query.getString(1);
                                                                                            if (str12 == null) {
                                                                                                if (string != null) {
                                                                                                    str12 = "";
                                                                                                }
                                                                                                if (!j2 || Arrays.equals(query.getBlob(3), bArr)) {
                                                                                                    z8 = false;
                                                                                                    i4 = query.getInt(2);
                                                                                                }
                                                                                            } else if (string == null) {
                                                                                                string = "";
                                                                                            }
                                                                                            if (!str12.equals(string)) {
                                                                                                z8 = true;
                                                                                                i4 = query.getInt(2);
                                                                                            }
                                                                                            z8 = false;
                                                                                            i4 = query.getInt(2);
                                                                                        }
                                                                                        z8 = true;
                                                                                        i4 = query.getInt(2);
                                                                                    } else {
                                                                                        hashSet3 = hashSet4;
                                                                                        z7 = z5;
                                                                                        z8 = true;
                                                                                        i4 = 0;
                                                                                    }
                                                                                    if (query != null) {
                                                                                        query.close();
                                                                                    }
                                                                                    if (j2) {
                                                                                        if (!z8) {
                                                                                            if (!cgem.m144898m()) {
                                                                                                bqzn bqzn4 = bqyt.f141984b;
                                                                                                if (bqzn4 == null) {
                                                                                                    bqzn4 = bqzn.f142065e;
                                                                                                }
                                                                                                m64516a(writableDatabase, bqzn4, a8, j7);
                                                                                                z6 = false;
                                                                                            } else {
                                                                                                m64515a(writableDatabase, bqyt, a8, j7, num);
                                                                                                z6 = false;
                                                                                            }
                                                                                            if (!z7) {
                                                                                                l5 = l7;
                                                                                                valueOf = l6;
                                                                                                linkedHashMap2 = linkedHashMap;
                                                                                                hashSet4 = hashSet3;
                                                                                                it2 = it3;
                                                                                                hashSet5 = hashSet2;
                                                                                                bqze6 = bqze2;
                                                                                                a2 = bqzd2;
                                                                                                compileStatement = sQLiteStatement;
                                                                                            }
                                                                                            HashSet hashSet6 = hashSet3;
                                                                                            hashSet6.add(str11);
                                                                                            l5 = l7;
                                                                                            valueOf = l6;
                                                                                            linkedHashMap2 = linkedHashMap;
                                                                                            hashSet4 = hashSet6;
                                                                                            it2 = it3;
                                                                                            hashSet5 = hashSet2;
                                                                                            bqze6 = bqze2;
                                                                                            a2 = bqzd2;
                                                                                            compileStatement = sQLiteStatement;
                                                                                        }
                                                                                    }
                                                                                    boolean z11 = z8;
                                                                                    writableDatabase.delete("ExperimentTokens", "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{str11, Long.toString(j6), a8});
                                                                                    if (bqyt.f141985c.size() > 0) {
                                                                                        i4 = m64505a(bqyt);
                                                                                    }
                                                                                    ContentValues contentValues5 = new ContentValues();
                                                                                    contentValues5.put("packageName", str11);
                                                                                    contentValues5.put("version", valueOf2);
                                                                                    contentValues5.put("user", a8);
                                                                                    contentValues5.put("isCommitted", (Integer) 0);
                                                                                    contentValues5.put("experimentToken", bqyt.f141986d.mo73780k());
                                                                                    contentValues5.put("serverToken", bqyt.f141987e);
                                                                                    contentValues5.put("configHash", Integer.toString(i4));
                                                                                    contentValues5.put("servingVersion", Long.valueOf(j7));
                                                                                    contentValues5.put("tokensTag", bArr);
                                                                                    contentValues5.put("flagsHash", num);
                                                                                    if (j2) {
                                                                                        z9 = z11;
                                                                                    } else {
                                                                                        z9 = bArr != null;
                                                                                    }
                                                                                    writableDatabase.insert("ExperimentTokens", null, contentValues5);
                                                                                    if (z9) {
                                                                                        bqzn bqzn5 = bqyt.f141984b;
                                                                                        if (bqzn5 == null) {
                                                                                            bqzn5 = bqzn.f142065e;
                                                                                        }
                                                                                        writableDatabase.delete("CrossLoggedExperimentTokens", "fromUser = ? AND toPackageName = ? AND toVersion = ? AND isCommitted != 1", new String[]{a8, bqzn5.f142068b, Long.toString(bqzn5.f142069c)});
                                                                                        for (bqza bqza : bqyt.f141988f) {
                                                                                            ContentValues contentValues6 = new ContentValues();
                                                                                            bqzn bqzn6 = bqza.f142009a;
                                                                                            if (bqzn6 == null) {
                                                                                                bqzn6 = bqzn.f142065e;
                                                                                            }
                                                                                            contentValues6.put("fromPackageName", bqzn6.f142068b);
                                                                                            bqzn bqzn7 = bqza.f142009a;
                                                                                            if (bqzn7 == null) {
                                                                                                bqzn7 = bqzn.f142065e;
                                                                                            }
                                                                                            contentValues6.put("fromVersion", Long.valueOf(bqzn7.f142069c));
                                                                                            contentValues6.put("fromUser", a8);
                                                                                            contentValues6.put("toPackageName", str11);
                                                                                            contentValues6.put("toVersion", Long.valueOf(j6));
                                                                                            contentValues6.put("isCommitted", (Integer) 0);
                                                                                            contentValues6.put("token", bqza.f142010b.mo73780k());
                                                                                            int a11 = bqyz.m113783a(bqza.f142011c);
                                                                                            if (a11 == 0) {
                                                                                                a11 = 1;
                                                                                            }
                                                                                            contentValues6.put("provenance", Integer.valueOf(a11 - 1));
                                                                                            writableDatabase.insert("CrossLoggedExperimentTokens", null, contentValues6);
                                                                                        }
                                                                                        z6 = false;
                                                                                        HashSet hashSet62 = hashSet3;
                                                                                        hashSet62.add(str11);
                                                                                        l5 = l7;
                                                                                        valueOf = l6;
                                                                                        linkedHashMap2 = linkedHashMap;
                                                                                        hashSet4 = hashSet62;
                                                                                        it2 = it3;
                                                                                        hashSet5 = hashSet2;
                                                                                        bqze6 = bqze2;
                                                                                        a2 = bqzd2;
                                                                                        compileStatement = sQLiteStatement;
                                                                                    } else {
                                                                                        z6 = false;
                                                                                        if (!z7) {
                                                                                        }
                                                                                        HashSet hashSet622 = hashSet3;
                                                                                        hashSet622.add(str11);
                                                                                        l5 = l7;
                                                                                        valueOf = l6;
                                                                                        linkedHashMap2 = linkedHashMap;
                                                                                        hashSet4 = hashSet622;
                                                                                        it2 = it3;
                                                                                        hashSet5 = hashSet2;
                                                                                        bqze6 = bqze2;
                                                                                        a2 = bqzd2;
                                                                                        compileStatement = sQLiteStatement;
                                                                                    }
                                                                                } catch (Throwable th17) {
                                                                                    th = th17;
                                                                                    th5 = th;
                                                                                    if (sQLiteStatement != null) {
                                                                                    }
                                                                                    throw th5;
                                                                                }
                                                                            } catch (Throwable th18) {
                                                                                th = th18;
                                                                                sQLiteStatement = compileStatement;
                                                                                th5 = th;
                                                                                if (sQLiteStatement != null) {
                                                                                    sQLiteStatement.close();
                                                                                }
                                                                                throw th5;
                                                                            }
                                                                        } else {
                                                                            bqze2 = bqze6;
                                                                        }
                                                                        if (cgem.m144898m()) {
                                                                            bqzn bqzn8 = bqyt.f141984b;
                                                                            if (bqzn8 == null) {
                                                                                bqzn8 = bqzn.f142065e;
                                                                            }
                                                                            m64516a(writableDatabase, bqzn8, a8, j7);
                                                                            bqzd2 = a2;
                                                                            hashSet3 = hashSet4;
                                                                            sQLiteStatement = compileStatement;
                                                                            z7 = z5;
                                                                            z6 = false;
                                                                        } else {
                                                                            m64515a(writableDatabase, bqyt, a8, j7, num);
                                                                            bqzd2 = a2;
                                                                            hashSet3 = hashSet4;
                                                                            sQLiteStatement = compileStatement;
                                                                            z7 = z5;
                                                                            z6 = false;
                                                                        }
                                                                        if (!z7) {
                                                                        }
                                                                        HashSet hashSet6222 = hashSet3;
                                                                        hashSet6222.add(str11);
                                                                        l5 = l7;
                                                                        valueOf = l6;
                                                                        linkedHashMap2 = linkedHashMap;
                                                                        hashSet4 = hashSet6222;
                                                                        it2 = it3;
                                                                        hashSet5 = hashSet2;
                                                                        bqze6 = bqze2;
                                                                        a2 = bqzd2;
                                                                        compileStatement = sQLiteStatement;
                                                                    }
                                                                }
                                                                bArr = null;
                                                                if (j2) {
                                                                }
                                                                if (cgem.m144898m()) {
                                                                }
                                                                if (!z7) {
                                                                }
                                                                HashSet hashSet62222 = hashSet3;
                                                                hashSet62222.add(str11);
                                                                l5 = l7;
                                                                valueOf = l6;
                                                                linkedHashMap2 = linkedHashMap;
                                                                hashSet4 = hashSet62222;
                                                                it2 = it3;
                                                                hashSet5 = hashSet2;
                                                                bqze6 = bqze2;
                                                                a2 = bqzd2;
                                                                compileStatement = sQLiteStatement;
                                                            }
                                                        }
                                                        z5 = m64522a(a8, writableDatabase, compileStatement, bqyt);
                                                        if (cgem.m144888c()) {
                                                        }
                                                        long j72 = bqze6.f142033d;
                                                        j2 = cgem.f186663a.mo6606a().mo83553j();
                                                        if ((bqyt.f141983a & 8) != 0) {
                                                        }
                                                        bArr = null;
                                                        if (j2) {
                                                        }
                                                        if (cgem.m144898m()) {
                                                        }
                                                        if (!z7) {
                                                        }
                                                        HashSet hashSet622222 = hashSet3;
                                                        hashSet622222.add(str11);
                                                        l5 = l7;
                                                        valueOf = l6;
                                                        linkedHashMap2 = linkedHashMap;
                                                        hashSet4 = hashSet622222;
                                                        it2 = it3;
                                                        hashSet5 = hashSet2;
                                                        bqze6 = bqze2;
                                                        a2 = bqzd2;
                                                        compileStatement = sQLiteStatement;
                                                    } else {
                                                        hashSet2 = hashSet5;
                                                    }
                                                    try {
                                                        z5 = m64522a(a8, writableDatabase, compileStatement, bqyt);
                                                        if (cgem.m144888c()) {
                                                        }
                                                        long j722 = bqze6.f142033d;
                                                        j2 = cgem.f186663a.mo6606a().mo83553j();
                                                        if ((bqyt.f141983a & 8) != 0) {
                                                        }
                                                        bArr = null;
                                                        if (j2) {
                                                        }
                                                        if (cgem.m144898m()) {
                                                        }
                                                        if (!z7) {
                                                        }
                                                        HashSet hashSet6222222 = hashSet3;
                                                        hashSet6222222.add(str11);
                                                        l5 = l7;
                                                        valueOf = l6;
                                                        linkedHashMap2 = linkedHashMap;
                                                        hashSet4 = hashSet6222222;
                                                        it2 = it3;
                                                        hashSet5 = hashSet2;
                                                        bqze6 = bqze2;
                                                        a2 = bqzd2;
                                                        compileStatement = sQLiteStatement;
                                                    } catch (Throwable th19) {
                                                        th = th19;
                                                        sQLiteStatement = compileStatement;
                                                        bqze2 = bqze6;
                                                        th5 = th;
                                                        if (sQLiteStatement != null) {
                                                        }
                                                        throw th5;
                                                    }
                                                }
                                                bqzd = a2;
                                                hashSet = hashSet4;
                                                SQLiteStatement sQLiteStatement2 = compileStatement;
                                                bqze2 = bqze6;
                                                Long l8 = valueOf;
                                                l3 = l;
                                                Iterator it5 = hashSet.iterator();
                                                while (true) {
                                                    hasNext = it5.hasNext();
                                                    if (hasNext == 0) {
                                                        break;
                                                    }
                                                    anfm.m64162b(writableDatabase, (String) it5.next());
                                                }
                                                if (sQLiteStatement2 != null) {
                                                    sQLiteStatement2.close();
                                                }
                                                l4 = l8;
                                                bqze3 = hasNext;
                                            } catch (Throwable th20) {
                                                th = th20;
                                                bxvd2 = bxvd;
                                                anit2 = anit;
                                                bqze = bqze6;
                                                Throwable th21 = th;
                                                if (anit2 != null) {
                                                }
                                                writableDatabase.endTransaction();
                                                throw th21;
                                            }
                                        } else {
                                            bqzd = a2;
                                            hashSet = hashSet4;
                                            bqze2 = bqze6;
                                            l3 = l;
                                            l4 = l2;
                                            bqze3 = r3;
                                        }
                                        if (bqzd != null) {
                                            bqzd bqzd3 = bqzd;
                                            try {
                                                if (bqzd3.f142022c.size() <= 0) {
                                                    bqze3 = bqze2;
                                                } else {
                                                    bqze3 = bqze2;
                                                    try {
                                                        for (bqzn bqzn9 : m64511a(bqzd3, bqze3)) {
                                                            bxvt bxvt = bqze3.f142034e;
                                                            bqzb bqzb = bqzn9.f142070d;
                                                            if (bqzb == null) {
                                                                bqzb = bqzb.f142013c;
                                                            }
                                                            if (!bxvt.contains(Integer.valueOf(bqzb.f142016b))) {
                                                                String a12 = m64508a(list, linkedHashMap, bqzn9);
                                                                m64516a(writableDatabase, bqzn9, a12, bqze3.f142033d);
                                                                if (!cgem.m144888c()) {
                                                                    if (cgem.f186663a.mo6606a().mo83545b()) {
                                                                        ContentValues contentValues7 = new ContentValues();
                                                                        contentValues7.putNull("flagsHash");
                                                                        writableDatabase.update("ExperimentTokens", contentValues7, "packageName = ? AND version = ? AND user = ? AND isCommitted = 0", new String[]{bqzn9.f142068b, String.valueOf(bqzn9.f142069c), a12});
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        HashSet<String> hashSet7 = new HashSet();
                                                        for (bqys bqys : bqzd3.f142022c) {
                                                            bqzn bqzn10 = bqys.f141976b;
                                                            if (bqzn10 == null) {
                                                                bqzn10 = bqzn.f142065e;
                                                            }
                                                            bxvt bxvt2 = bqze3.f142034e;
                                                            bqzb bqzb2 = bqzn10.f142070d;
                                                            if (bqzb2 == null) {
                                                                bqzb2 = bqzb.f142013c;
                                                            }
                                                            if (!bxvt2.contains(Integer.valueOf(bqzb2.f142016b))) {
                                                                hashSet7.add(bqzn10.f142068b);
                                                            }
                                                        }
                                                        for (String str13 : hashSet7) {
                                                            anfu.m64171a(writableDatabase, str13);
                                                        }
                                                    } catch (Throwable th22) {
                                                        th = th22;
                                                        bqze3 = bqze3;
                                                        bxvd2 = bxvd;
                                                        anit2 = anit;
                                                        bqze = bqze3;
                                                        Throwable th212 = th;
                                                        if (anit2 != null) {
                                                        }
                                                        writableDatabase.endTransaction();
                                                        throw th212;
                                                    }
                                                }
                                            } catch (Throwable th23) {
                                                th = th23;
                                                bqze3 = bqze2;
                                                bxvd2 = bxvd;
                                                anit2 = anit;
                                                bqze = bqze3;
                                                Throwable th2122 = th;
                                                if (anit2 != null) {
                                                    if (bqze.f142034e.size() > 0) {
                                                        anit2.f76965g = bqze.f142034e.size();
                                                    }
                                                }
                                                writableDatabase.endTransaction();
                                                throw th2122;
                                            }
                                        } else {
                                            bqze3 = bqze2;
                                        }
                                        set.addAll(hashSet);
                                        writableDatabase.setTransactionSuccessful();
                                        anit2 = anit;
                                        if (anit2 != null) {
                                            try {
                                                if (bqze3.f142034e.size() > 0) {
                                                    anit2.f76965g = bqze3.f142034e.size();
                                                }
                                            } catch (IOException e5) {
                                                e = e5;
                                                bxvd2 = bxvd;
                                                iOException = e;
                                                throw new anfy(29504, "Network error", iOException);
                                            } catch (Throwable th24) {
                                                th = th24;
                                                bxvd2 = bxvd;
                                                th2 = th;
                                                int elapsedRealtime522 = (int) (SystemClock.elapsedRealtime() - j4);
                                                if (bxvd2.f164950c) {
                                                    bxvd.mo74035c();
                                                    bxvd2.f164950c = false;
                                                }
                                                cahv cahv1322 = (cahv) bxvd2.f164949b;
                                                cahv1322.f174602a |= 16;
                                                cahv1322.f174607f = elapsedRealtime522;
                                                if (anit2 != null) {
                                                    anit2.f76963e = list.size();
                                                }
                                                throw th2;
                                            }
                                        }
                                        writableDatabase.endTransaction();
                                        anfh.m64156a();
                                        if (l3 != null) {
                                            if (cgej.m144882b()) {
                                                try {
                                                    mo25226a(l3.longValue());
                                                } catch (IOException e6) {
                                                    e = e6;
                                                    bxvd2 = bxvd;
                                                    iOException = e;
                                                    throw new anfy(29504, "Network error", iOException);
                                                } catch (Throwable th25) {
                                                    th = th25;
                                                    bxvd2 = bxvd;
                                                    th2 = th;
                                                    int elapsedRealtime5222 = (int) (SystemClock.elapsedRealtime() - j4);
                                                    if (bxvd2.f164950c) {
                                                    }
                                                    cahv cahv13222 = (cahv) bxvd2.f164949b;
                                                    cahv13222.f174602a |= 16;
                                                    cahv13222.f174607f = elapsedRealtime5222;
                                                    if (anit2 != null) {
                                                    }
                                                    throw th2;
                                                }
                                            }
                                        }
                                        if (l4 != null) {
                                            if (l4.longValue() % cgec.f186635a.mo6606a().mo83537r() == 0) {
                                                mo41859f();
                                            }
                                        }
                                        m64526g();
                                        if (!bqze3.f142034e.isEmpty()) {
                                            bxvd2 = bxvd;
                                            if (bxvd2.f164950c) {
                                                bxvd.mo74035c();
                                                bxvd2.f164950c = false;
                                            }
                                            cahv cahv15 = (cahv) bxvd2.f164949b;
                                            cahv15.f174604c = 9;
                                            cahv15.f174602a |= 2;
                                            throw new anfy(29504, "Partial authentication failure");
                                        }
                                        bxvd bxvd7 = bxvd;
                                        int elapsedRealtime6 = (int) (SystemClock.elapsedRealtime() - j4);
                                        if (bxvd7.f164950c) {
                                            bxvd.mo74035c();
                                            bxvd7.f164950c = false;
                                        }
                                        cahv cahv16 = (cahv) bxvd7.f164949b;
                                        cahv16.f174602a |= 16;
                                        cahv16.f174607f = elapsedRealtime6;
                                        if (anit2 != null) {
                                            anit2.f76963e = list.size();
                                        }
                                    } catch (Throwable th26) {
                                        th = th26;
                                        Throwable th21222 = th;
                                        if (anit2 != null) {
                                        }
                                        writableDatabase.endTransaction();
                                        throw th21222;
                                    }
                                } catch (Throwable th27) {
                                    th = th27;
                                    bqze = bqze6;
                                    bxvd2 = bxvd5;
                                    anit2 = anit5;
                                    Throwable th212222 = th;
                                    if (anit2 != null) {
                                    }
                                    writableDatabase.endTransaction();
                                    throw th212222;
                                }
                            } else if (cgem.f186663a.mo6606a().mo83549f()) {
                                Object[] objArr = new Object[i3];
                                objArr[0] = Integer.valueOf(((cahv) bxvd5.f164949b).f174605d);
                                int a13 = cahu.m126649a(((cahv) bxvd5.f164949b).f174604c);
                                if (a13 == 0) {
                                    a13 = 1;
                                }
                                objArr[1] = cahu.m126650b(a13);
                                throw new anfy(29504, String.format("Null server response, http status code %d: %s", objArr));
                            } else {
                                throw new anfy(29504, "Null server response");
                            }
                        } catch (IOException e7) {
                            aniu2 = this;
                            bxvd4 = bxvd5;
                            anit4 = anit5;
                            iOException2 = e7;
                            aniy = a5;
                            if (bxvd3.f164950c) {
                            }
                            cahv cahv32 = (cahv) bxvd3.f164949b;
                            cahv32.f174604c = 2;
                            cahv32.f174602a = 2 | cahv32.f174602a;
                            throw iOException2;
                        } catch (Throwable th28) {
                            aniu = this;
                            bxvd3 = bxvd5;
                            anit3 = anit5;
                            th3 = th28;
                            aniy = a5;
                            int elapsedRealtime322 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime2);
                            if (!bxvd2.f164950c) {
                            }
                            cahv cahv422 = (cahv) bxvd2.f164949b;
                            cahv422.f174602a |= 8;
                            cahv422.f174606e = elapsedRealtime322;
                            aniu.mo41843a(aniy);
                            throw th3;
                        }
                    } catch (IOException e8) {
                        aniu2 = this;
                        bxvd4 = bxvd5;
                        anit4 = anit5;
                        iOException2 = e8;
                        aniy = null;
                        if (bxvd3.f164950c) {
                            bxvd.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        cahv cahv322 = (cahv) bxvd3.f164949b;
                        cahv322.f174604c = 2;
                        cahv322.f174602a = 2 | cahv322.f174602a;
                        throw iOException2;
                    } catch (Throwable th29) {
                        aniu = this;
                        bxvd3 = bxvd5;
                        anit3 = anit5;
                        th3 = th29;
                        aniy = null;
                        int elapsedRealtime3222 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime2);
                        if (!bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cahv cahv4222 = (cahv) bxvd2.f164949b;
                        cahv4222.f174602a |= 8;
                        cahv4222.f174606e = elapsedRealtime3222;
                        aniu.mo41843a(aniy);
                        throw th3;
                    }
                } catch (IOException e9) {
                    e = e9;
                    bxvd2 = bxvd5;
                    anit2 = anit5;
                    iOException = e;
                    throw new anfy(29504, "Network error", iOException);
                } catch (Throwable th30) {
                    th = th30;
                    bxvd2 = bxvd5;
                    anit2 = anit5;
                    th2 = th;
                    int elapsedRealtime52222 = (int) (SystemClock.elapsedRealtime() - j4);
                    if (bxvd2.f164950c) {
                    }
                    cahv cahv132222 = (cahv) bxvd2.f164949b;
                    cahv132222.f174602a |= 16;
                    cahv132222.f174607f = elapsedRealtime52222;
                    if (anit2 != null) {
                    }
                    throw th2;
                }
            } catch (Throwable th31) {
                th = th31;
                th = th;
                throw th;
            }
        }
        throw th6;
        throw th7;
        throw th8;
        throw th9;
        throw th4;
    }

    /* renamed from: a */
    private static final boolean m64522a(String str, SQLiteDatabase sQLiteDatabase, SQLiteStatement sQLiteStatement, bqyt bqyt) {
        int i;
        bxwc bxwc;
        String str2;
        Throwable th;
        byte[] bArr;
        int i2;
        bqzl bqzl;
        bxwc bxwc2;
        long j;
        long j2;
        int i3;
        String str3;
        int i4;
        int i5;
        bxwc bxwc3;
        int i6;
        int i7;
        String str4 = str;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        SQLiteStatement sQLiteStatement2 = sQLiteStatement;
        bqyt bqyt2 = bqyt;
        bqzn bqzn = bqyt2.f141984b;
        if (bqzn == null) {
            bqzn = bqzn.f142065e;
        }
        String str5 = bqzn.f142068b;
        bqzn bqzn2 = bqyt2.f141984b;
        if (bqzn2 == null) {
            bqzn2 = bqzn.f142065e;
        }
        long j3 = bqzn2.f142069c;
        bxwc bxwc4 = bqyt2.f141985c;
        int size = bxwc4.size();
        int i8 = 0;
        while (i8 < size) {
            bqzl bqzl2 = (bqzl) bxwc4.get(i8);
            int a = bqzk.m113794a(bqzl2.f142058c);
            if (a == 0) {
                i7 = i8;
                bxwc3 = bxwc4;
                i6 = size;
            } else if (a == 3) {
                bqzm bqzm = bqzl2.f142056a;
                if (bqzm == null) {
                    bqzm = bqzm.f142060d;
                }
                bxwc3 = bxwc4;
                i6 = size;
                String str6 = "ApplicationTags";
                i7 = i8;
                m64517a(sQLiteDatabase, str5, j3, str, bqzm.f142063b);
                bqzm bqzm2 = bqzl2.f142056a;
                String[] strArr = new String[4];
                strArr[0] = str5;
                strArr[1] = Long.toString(j3);
                strArr[2] = str4;
                bqzm bqzm3 = bqzl2.f142056a;
                if (bqzm3 == null) {
                    bqzm3 = bqzm.f142060d;
                }
                strArr[3] = Long.toString(bqzm3.f142063b);
                sQLiteDatabase2.delete(str6, "packageName = ? AND version = ? AND user = ? AND partitionId = ?", strArr);
            } else {
                i7 = i8;
                bxwc3 = bxwc4;
                i6 = size;
            }
            i8 = i7 + 1;
            size = i6;
            bxwc4 = bxwc3;
        }
        String str7 = "ApplicationTags";
        int i9 = 0;
        bxwc bxwc5 = bqyt2.f141985c;
        int size2 = bxwc5.size();
        int i10 = 0;
        while (i10 < size2) {
            bqzl bqzl3 = (bqzl) bxwc5.get(i10);
            bxwc bxwc6 = bqzl3.f142057b;
            int size3 = bxwc6.size();
            while (true) {
                i3 = i10 + 1;
                if (i9 >= size3) {
                    break;
                }
                bqzi bqzi = (bqzi) bxwc6.get(i9);
                bxwc bxwc7 = bxwc5;
                if (bqzi.f142050h) {
                    String str8 = bqzi.f142043a;
                    bqzm bqzm4 = bqzl3.f142056a;
                    if (bqzm4 == null) {
                        bqzm4 = bqzm.f142060d;
                    }
                    i4 = size2;
                    long j4 = bqzm4.f142063b;
                    str3 = str7;
                    String[] strArr2 = new String[6];
                    strArr2[0] = str5;
                    strArr2[1] = Long.toString(j3);
                    strArr2[2] = str4;
                    bqzm bqzm5 = bqzl3.f142056a;
                    if (bqzm5 == null) {
                        bqzm5 = bqzm.f142060d;
                    }
                    i5 = i9;
                    strArr2[3] = Long.toString(bqzm5.f142063b);
                    strArr2[4] = bqzi.f142043a;
                    strArr2[5] = Integer.toString(bqzi.f142051i);
                    sQLiteDatabase2.delete("Flags", "packageName = ? AND version = ? AND user = ? AND partitionId = ? AND name = ? AND flagType = ? AND committed = 0", strArr2);
                } else {
                    i4 = size2;
                    str3 = str7;
                    i5 = i9;
                }
                i9 = i5 + 1;
                bxwc5 = bxwc7;
                size2 = i4;
                str7 = str3;
            }
            i10 = i3;
            i9 = 0;
        }
        String str9 = str7;
        bxwc bxwc8 = bqyt2.f141985c;
        int size4 = bxwc8.size();
        int i11 = 0;
        boolean z = false;
        while (i11 < size4) {
            bqzl bqzl4 = (bqzl) bxwc8.get(i11);
            int a2 = bqzk.m113794a(bqzl4.f142058c);
            if (a2 != 0 && a2 == 3) {
                i = i11;
                bxwc = bxwc8;
                str2 = str9;
                z = true;
            } else {
                bqzm bqzm6 = bqzl4.f142056a;
                if (bqzm6 == null) {
                    bqzm6 = bqzm.f142060d;
                }
                long j5 = bqzm6.f142063b;
                bqzm bqzm7 = bqzl4.f142056a;
                if (bqzm7 == null) {
                    bqzm7 = bqzm.f142060d;
                }
                byte[] k = bqzm7.f142064c.mo73780k();
                if (k == null) {
                    i = i11;
                    bxwc = bxwc8;
                    str2 = str9;
                } else if (k.length != 0) {
                    long j6 = j5;
                    byte[] bArr2 = k;
                    String str10 = str9;
                    bqzl bqzl5 = bqzl4;
                    i = i11;
                    bxwc = bxwc8;
                    String str11 = "tag";
                    Cursor query = sQLiteDatabase.query("ApplicationTags", new String[]{"tag"}, "packageName = ? AND version = ? AND partitionId = ? AND user = ?", new String[]{str5, Long.toString(j3), Long.toString(j5), str4}, null, null, null);
                    try {
                        if (query.moveToFirst()) {
                            bArr = bArr2;
                            if (Arrays.equals(bArr, query.getBlob(0))) {
                                if (query != null) {
                                    query.close();
                                    str2 = str10;
                                } else {
                                    str2 = str10;
                                }
                            }
                        } else {
                            bArr = bArr2;
                        }
                        if (query != null) {
                            query.close();
                        }
                        Long valueOf = Long.valueOf(j3);
                        Long valueOf2 = Long.valueOf(j6);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("packageName", str5);
                        contentValues.put("version", valueOf);
                        contentValues.put("partitionId", valueOf2);
                        contentValues.put("user", str4);
                        contentValues.put(str11, bArr);
                        str2 = str10;
                        sQLiteDatabase2.insertWithOnConflict(str2, null, contentValues, 5);
                        bqzl bqzl6 = bqzl5;
                        int a3 = bqzk.m113794a(bqzl6.f142058c);
                        if (a3 == 0 || a3 == 1) {
                            bqzl = bqzl6;
                            i2 = 5;
                            m64517a(sQLiteDatabase, str5, j3, str, j6);
                        } else {
                            bqzl = bqzl6;
                            i2 = 5;
                        }
                        bxwc bxwc9 = bqzl.f142057b;
                        int size5 = bxwc9.size();
                        int i12 = 0;
                        while (i12 < size5) {
                            bqzi bqzi2 = (bqzi) bxwc9.get(i12);
                            if (!bqzi2.f142050h) {
                                sQLiteStatement.clearBindings();
                                sQLiteStatement2.bindString(1, str5);
                                sQLiteStatement2.bindLong(2, j3);
                                sQLiteStatement2.bindLong(3, (long) bqzi2.f142051i);
                                j = j6;
                                sQLiteStatement2.bindLong(4, j);
                                sQLiteStatement2.bindString(i2, str4);
                                sQLiteStatement2.bindString(6, bqzi2.f142043a);
                                sQLiteStatement2.bindLong(7, 0);
                                int a4 = bqzh.m113791a(bqzi2.f142049g);
                                if (a4 == 0) {
                                    a4 = 1;
                                }
                                int i13 = a4 - 1;
                                if (i13 == 1) {
                                    bxwc2 = bxwc9;
                                    sQLiteStatement2.bindLong(8, bqzi2.f142044b);
                                } else if (i13 == 2) {
                                    bxwc2 = bxwc9;
                                    if (!bqzi2.f142045c) {
                                        j2 = 0;
                                    } else {
                                        j2 = 1;
                                    }
                                    sQLiteStatement2.bindLong(9, j2);
                                } else if (i13 == 3) {
                                    bxwc2 = bxwc9;
                                    sQLiteStatement2.bindDouble(10, bqzi2.f142046d);
                                } else if (i13 == 4) {
                                    bxwc2 = bxwc9;
                                    sQLiteStatement2.bindString(11, bqzi2.f142047e);
                                } else if (i13 != 5) {
                                    bnsl bnsl = (bnsl) f76966a.mo68388c();
                                    bxwc2 = bxwc9;
                                    bnsl.mo68432a("aniu", "a", 2332, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                    bnsl.mo68420a("Value type not set for flag %s, ignoring", bqzi2.f142043a);
                                } else {
                                    bxwc2 = bxwc9;
                                    bqzf bqzf = bqzi2.f142048f;
                                    if (bqzf == null) {
                                        bqzf = bqzf.f142036b;
                                    }
                                    sQLiteStatement2.bindBlob(12, bqzf.f142038a.mo73780k());
                                }
                                String str12 = bqzi2.f142043a;
                                sQLiteStatement.execute();
                            } else {
                                bxwc2 = bxwc9;
                                j = j6;
                            }
                            i12++;
                            str4 = str;
                            j6 = j;
                            bxwc9 = bxwc2;
                            i2 = 5;
                        }
                        z = true;
                    } catch (Throwable th2) {
                        bqye.m113761a(th, th2);
                    }
                } else {
                    i = i11;
                    bxwc = bxwc8;
                    str2 = str9;
                }
            }
            i11 = i + 1;
            str4 = str;
            sQLiteDatabase2 = sQLiteDatabase;
            str9 = str2;
            bxwc8 = bxwc;
        }
        return z;
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0335, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0336, code lost:
        r1 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0337, code lost:
        if (r13 != null) goto L_0x0339;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r13.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x033d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        p000.bqye.m113761a(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0519, code lost:
        if (r1 != null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0525, code lost:
        if (r1 != null) goto L_0x051b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x056d, code lost:
        if (r1 != null) goto L_0x056f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0575, code lost:
        if (r1 == null) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05c7, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05c8, code lost:
        if (r1 != null) goto L_0x05ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05ce, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:?, code lost:
        p000.bqye.m113761a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05d5, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05d6, code lost:
        if (r1 != null) goto L_0x05d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05dc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:?, code lost:
        p000.bqye.m113761a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05e3, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05e4, code lost:
        if (r1 != null) goto L_0x05e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        p000.bqye.m113761a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x05f0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x05f1, code lost:
        r3.endTransaction();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x05f4, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:64:0x019e, B:136:0x0339, B:145:0x0366, B:221:0x0511, B:226:0x051b, B:239:0x055f, B:265:0x05ca, B:275:0x05d8, B:285:0x05e6] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04c2 A[Catch:{ all -> 0x05e2, all -> 0x05ea, all -> 0x05d4, all -> 0x05dc, all -> 0x05c6, all -> 0x05ce, all -> 0x0335, all -> 0x033d, all -> 0x05f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04c3 A[Catch:{ all -> 0x05e2, all -> 0x05ea, all -> 0x05d4, all -> 0x05dc, all -> 0x05c6, all -> 0x05ce, all -> 0x0335, all -> 0x033d, all -> 0x05f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04d5 A[Catch:{ all -> 0x05e2, all -> 0x05ea, all -> 0x05d4, all -> 0x05dc, all -> 0x05c6, all -> 0x05ce, all -> 0x0335, all -> 0x033d, all -> 0x05f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x04e8 A[Catch:{ all -> 0x05e2, all -> 0x05ea, all -> 0x05d4, all -> 0x05dc, all -> 0x05c6, all -> 0x05ce, all -> 0x0335, all -> 0x033d, all -> 0x05f0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x04e9 A[Catch:{ all -> 0x05e2, all -> 0x05ea, all -> 0x05d4, all -> 0x05dc, all -> 0x05c6, all -> 0x05ce, all -> 0x0335, all -> 0x033d, all -> 0x05f0 }] */
    /* renamed from: a */
    public final bqzd mo41851a(List list, int i, String str, boolean z, LinkedHashMap linkedHashMap, boolean z2, bxvd bxvd) {
        String str2;
        bxvd bxvd2;
        List list2;
        bqzd bqzd;
        Cursor query;
        Throwable th;
        byte[] bArr;
        String str3;
        Throwable th2;
        byte[] bArr2;
        Throwable th3;
        Throwable th4;
        long j;
        boolean z3;
        long j2;
        String str4 = str;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        bxvd bxvd3 = bxvd;
        bxvd da = bqzd.f142018h.mo74144da();
        bxvd da2 = bqyu.f141991h.mo74144da();
        cijl cijl = this.f76975j;
        int i2 = 0;
        if (!(cijl == null || cijl.mo6445a() == null)) {
            bqzo bqzo = (bqzo) this.f76975j.mo6445a();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bqyu bqyu = (bqyu) da2.f164949b;
            bqzo.getClass();
            bqyu.f141999g = bqzo;
            bqyu.f141993a |= 128;
        }
        int i3 = 2;
        if (!z2) {
            if (!"".equals(bnjd.m109587b(list))) {
                j2 = 1;
            } else {
                j2 = 0;
            }
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bqyu bqyu2 = (bqyu) da2.f164949b;
            bqyu2.f141993a |= 2;
            bqyu2.f141994b = j2;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bqzd bqzd2 = (bqzd) da.f164949b;
        int i4 = i - 1;
        if (i != 0) {
            bqzd2.f142024e = i4;
            int i5 = bqzd2.f142020a | 4;
            bqzd2.f142020a = i5;
            if (str4 != null) {
                str.getClass();
                i5 |= 8;
                bqzd2.f142020a = i5;
                bqzd2.f142025f = str4;
            }
            int i6 = this.f76976k;
            int i7 = i6 - 1;
            if (i6 != 0) {
                bqzd2.f142020a = i5 | 16;
                bqzd2.f142026g = i7;
                try {
                    str2 = this.f76974i.mo25222a();
                } catch (anfy e) {
                    if (cgem.m144897l()) {
                        if (bxvd3.f164950c) {
                            bxvd.mo74035c();
                            bxvd3.f164950c = false;
                        }
                        cahv cahv = (cahv) bxvd3.f164949b;
                        cahv cahv2 = cahv.f174600h;
                        cahv.f174604c = 10;
                        cahv.f174602a |= 2;
                        throw e;
                    }
                    bnsl bnsl = (bnsl) f76966a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("aniu", "a", 1016, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Skip getting Pseudonymous ID error.");
                    str2 = null;
                }
                if (str2 != null) {
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bqyu bqyu3 = (bqyu) da2.f164949b;
                    str2.getClass();
                    bqyu3.f141993a |= 16;
                    bqyu3.f141996d = str2;
                }
                bxvd da3 = cagb.f173068e.mo74144da();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cagb cagb = (cagb) da3.f164949b;
                cagb.f173071b = 4;
                int i8 = 1;
                cagb.f173070a |= 1;
                cafx c = mo25230c();
                if (da3.f164950c) {
                    da3.mo74035c();
                    da3.f164950c = false;
                }
                cagb cagb2 = (cagb) da3.f164949b;
                c.getClass();
                cagb2.f173072c = c;
                cagb2.f173070a |= 8;
                cagb cagb3 = (cagb) da3.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bqyu bqyu4 = (bqyu) da2.f164949b;
                cagb3.getClass();
                bqyu4.f141995c = cagb3;
                int i9 = bqyu4.f141993a | 8;
                bqyu4.f141993a = i9;
                bqyu4.f141993a = i9 | 64;
                bqyu4.f141998f = z;
                SQLiteDatabase writableDatabase = this.f76970d.getWritableDatabase();
                writableDatabase.beginTransaction();
                if (!cgem.m144889d()) {
                    bxvd2 = da2;
                } else if (cgck.m144753b()) {
                    Cursor query2 = writableDatabase.query("Packages", new String[]{"packageName", "version", "params", "dynamicParams", "configTier"}, null, null, null, null, null);
                    bngs bngs = new bngs();
                    while (query2.moveToNext()) {
                        String string = query2.getString(i2);
                        if (!string.startsWith("__internal.")) {
                            long j3 = query2.getLong(i8);
                            byte[] blob = query2.getBlob(i3);
                            byte[] blob2 = query2.getBlob(3);
                            int a = bqyw.m113780a(query2.getInt(4));
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                String str5 = (String) it.next();
                                bqyr bqyr = (bqyr) bqys.f141973g.mo74144da();
                                bxvd da4 = bqzn.f142065e.mo74144da();
                                byte[] bArr3 = blob;
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bqzn bqzn = (bqzn) da4.f164949b;
                                string.getClass();
                                bxvd bxvd4 = da2;
                                int i10 = bqzn.f142067a | 1;
                                bqzn.f142067a = i10;
                                bqzn.f142068b = string;
                                bqzn.f142067a = i10 | 2;
                                bqzn.f142069c = j3;
                                if (linkedHashMap2 != null) {
                                    bxvd da5 = bqzb.f142013c.mo74144da();
                                    if ("".equals(str5)) {
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bqzb bqzb = (bqzb) da5.f164949b;
                                        j = j3;
                                        bqzb.f142015a |= 1;
                                        bqzb.f142016b = -1;
                                    } else {
                                        j = j3;
                                        int a2 = m64506a(linkedHashMap2, str5);
                                        if (da5.f164950c) {
                                            da5.mo74035c();
                                            da5.f164950c = false;
                                        }
                                        bqzb bqzb2 = (bqzb) da5.f164949b;
                                        bqzb2.f142015a |= 1;
                                        bqzb2.f142016b = a2;
                                    }
                                    if (da4.f164950c) {
                                        da4.mo74035c();
                                        da4.f164950c = false;
                                    }
                                    bqzn bqzn2 = (bqzn) da4.f164949b;
                                    bqzb bqzb3 = (bqzb) da5.mo74062i();
                                    bqzb3.getClass();
                                    bqzn2.f142070d = bqzb3;
                                    bqzn2.f142067a |= 4;
                                } else {
                                    j = j3;
                                }
                                byte[] bArr4 = blob2 != null ? blob2 : bArr3;
                                if (bArr4 != null) {
                                    bxtx a3 = bxtx.m123261a(bArr4);
                                    if (bqyr.f164950c) {
                                        bqyr.mo74035c();
                                        bqyr.f164950c = false;
                                    }
                                    bqys bqys = (bqys) bqyr.f164949b;
                                    a3.getClass();
                                    bqys.f141975a |= 2;
                                    bqys.f141977c = a3;
                                }
                                bqzn bqzn3 = (bqzn) da4.mo74062i();
                                if (bqyr.f164950c) {
                                    bqyr.mo74035c();
                                    bqyr.f164950c = false;
                                }
                                bqys bqys2 = (bqys) bqyr.f164949b;
                                bqzn3.getClass();
                                bqys2.f141976b = bqzn3;
                                bqys2.f141975a |= 1;
                                if (!cgec.m144829d()) {
                                    m64514a(writableDatabase, bqyr, str5);
                                    bqyr.mo69469a(m64507a(writableDatabase, bqzn3, str5));
                                }
                                if (a != 0) {
                                    if (a != 3 || str5.equals("")) {
                                        z3 = false;
                                    } else {
                                        z3 = true;
                                    }
                                    if (bqyr.f164950c) {
                                        bqyr.mo74035c();
                                        bqyr.f164950c = false;
                                    }
                                    bqys bqys3 = (bqys) bqyr.f164949b;
                                    bqys3.f141975a |= 8;
                                    bqys3.f141980f = z3;
                                    bngs.mo67668c((bqys) bqyr.mo74062i());
                                    blob = bArr3;
                                    j3 = j;
                                    da2 = bxvd4;
                                } else {
                                    throw null;
                                }
                            }
                            i2 = 0;
                            i3 = 2;
                            i8 = 1;
                        } else {
                            i2 = 0;
                            i3 = 2;
                            i8 = 1;
                        }
                    }
                    bxvd2 = da2;
                    list2 = bngs.mo67664a();
                    if (query2 != null) {
                        query2.close();
                    }
                    if (!da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqzd = (bqzd) da.f164949b;
                    if (!bqzd.f142022c.mo73666a()) {
                        bqzd.f142022c = bxvk.m124021a(bqzd.f142022c);
                    }
                    bxsy.m123078a(list2, bqzd.f142022c);
                    if (cgem.m144896k()) {
                        if (!z2) {
                            str3 = (String) bnjd.m109587b(list);
                        } else {
                            str3 = "ALL_USERS";
                        }
                        Cursor query3 = writableDatabase.query("RequestTags", new String[]{"bytesTag"}, "user = ?", new String[]{str3}, null, null, null);
                        if (!query3.moveToFirst()) {
                            bArr2 = f76968g;
                        } else {
                            bArr2 = query3.getBlob(0);
                        }
                        query3.close();
                        bxtx a4 = bxtx.m123261a(bArr2);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bqzd bqzd3 = (bqzd) da.f164949b;
                        a4.getClass();
                        bqzd3.f142020a |= 2;
                        bqzd3.f142023d = a4;
                    }
                    query = writableDatabase.query("DogfoodsToken", new String[]{"token"}, null, null, null, null, null);
                    if (query.moveToFirst() || (bArr = query.getBlob(0)) == null) {
                        bArr = f76968g;
                    }
                    query.close();
                    bxtx a5 = bxtx.m123261a(bArr);
                    bxvd bxvd5 = bxvd2;
                    if (bxvd5.f164950c) {
                        bxvd5.mo74035c();
                        bxvd5.f164950c = false;
                    }
                    bqyu bqyu5 = (bqyu) bxvd5.f164949b;
                    a5.getClass();
                    bqyu5.f141993a |= 32;
                    bqyu5.f141997e = a5;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bqzd bqzd4 = (bqzd) da.f164949b;
                    bqyu bqyu6 = (bqyu) bxvd5.mo74062i();
                    bqyu6.getClass();
                    bqzd4.f142021b = bqyu6;
                    bqzd4.f142020a |= 1;
                    writableDatabase.setTransactionSuccessful();
                    bqzd bqzd5 = (bqzd) da.mo74062i();
                    writableDatabase.endTransaction();
                    return bqzd5;
                } else {
                    bxvd2 = da2;
                }
                Cursor query4 = writableDatabase.query("Packages", new String[]{"packageName", "version", "params", "dynamicParams"}, null, null, null, null, null);
                list2 = new ArrayList(query4.getCount());
                while (query4.moveToNext()) {
                    if (!query4.getString(0).startsWith("__internal.")) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            String str6 = (String) it2.next();
                            bqyr bqyr2 = (bqyr) bqys.f141973g.mo74144da();
                            bxvd da6 = bqzn.f142065e.mo74144da();
                            String string2 = query4.getString(0);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bqzn bqzn4 = (bqzn) da6.f164949b;
                            string2.getClass();
                            bqzn4.f142067a |= 1;
                            bqzn4.f142068b = string2;
                            long j4 = query4.getLong(1);
                            if (da6.f164950c) {
                                da6.mo74035c();
                                da6.f164950c = false;
                            }
                            bqzn bqzn5 = (bqzn) da6.f164949b;
                            bqzn5.f142067a |= 2;
                            bqzn5.f142069c = j4;
                            if (linkedHashMap2 != null) {
                                bxvd da7 = bqzb.f142013c.mo74144da();
                                if ("".equals(str6)) {
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bqzb bqzb4 = (bqzb) da7.f164949b;
                                    bqzb4.f142015a |= 1;
                                    bqzb4.f142016b = -1;
                                } else {
                                    int a6 = m64506a(linkedHashMap2, str6);
                                    if (da7.f164950c) {
                                        da7.mo74035c();
                                        da7.f164950c = false;
                                    }
                                    bqzb bqzb5 = (bqzb) da7.f164949b;
                                    bqzb5.f142015a |= 1;
                                    bqzb5.f142016b = a6;
                                }
                                if (da6.f164950c) {
                                    da6.mo74035c();
                                    da6.f164950c = false;
                                }
                                bqzn bqzn6 = (bqzn) da6.f164949b;
                                bqzb bqzb6 = (bqzb) da7.mo74062i();
                                bqzb6.getClass();
                                bqzn6.f142070d = bqzb6;
                                bqzn6.f142067a |= 4;
                            }
                            byte[] blob3 = query4.getBlob(2);
                            byte[] blob4 = query4.getBlob(3);
                            if (blob4 != null) {
                                blob3 = blob4;
                            }
                            if (blob3 != null) {
                                bxtx a7 = bxtx.m123261a(blob3);
                                if (bqyr2.f164950c) {
                                    bqyr2.mo74035c();
                                    bqyr2.f164950c = false;
                                }
                                bqys bqys4 = (bqys) bqyr2.f164949b;
                                a7.getClass();
                                bqys4.f141975a |= 2;
                                bqys4.f141977c = a7;
                            }
                            bqzn bqzn7 = (bqzn) da6.mo74062i();
                            if (bqyr2.f164950c) {
                                bqyr2.mo74035c();
                                bqyr2.f164950c = false;
                            }
                            bqys bqys5 = (bqys) bqyr2.f164949b;
                            bqzn7.getClass();
                            bqys5.f141976b = bqzn7;
                            bqys5.f141975a |= 1;
                            if (!cgec.m144829d()) {
                                m64514a(writableDatabase, bqyr2, str6);
                                bqyr2.mo69469a(m64507a(writableDatabase, bqzn7, str6));
                            }
                            list2.add((bqys) bqyr2.mo74062i());
                        }
                    }
                }
                if (query4 != null) {
                    query4.close();
                }
                if (!da.f164950c) {
                }
                bqzd = (bqzd) da.f164949b;
                if (!bqzd.f142022c.mo73666a()) {
                }
                bxsy.m123078a(list2, bqzd.f142022c);
                if (cgem.m144896k()) {
                }
                query = writableDatabase.query("DogfoodsToken", new String[]{"token"}, null, null, null, null, null);
                if (query.moveToFirst()) {
                }
                bArr = f76968g;
            } else {
                throw null;
            }
        } else {
            throw null;
        }
        throw th2;
        throw th4;
        throw th;
        throw th3;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0201 A[Catch:{ all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0202 A[Catch:{ all -> 0x0215 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0220  */
    /* renamed from: a */
    public final bqze mo41852a(bqzd bqzd, List list, String str, String str2, bxvd bxvd, LinkedHashMap linkedHashMap, anit anit, boolean z) {
        int i;
        bqzd bqzd2 = bqzd;
        String str3 = str;
        bxvd bxvd2 = bxvd;
        LinkedHashMap linkedHashMap2 = linkedHashMap;
        anit anit2 = anit;
        bnsl a = f76966a.mo26019b(m64527h());
        a.mo68432a("aniu", "a", 1296, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        a.mo68420a("Heterodyne Request: %s", bqzd2);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        aniy aniy = null;
        try {
            mo41844bp();
            aniy = this.f76973h.mo25221a(bqzd2, str3, str2);
            try {
                int i2 = aniy.f76984b;
                if (i2 > 0) {
                    mo25225a(i2);
                }
                if (aniy.f76985c) {
                    bqze bqze = aniy.f76983a;
                    if (bqze != null && bqze.f142034e.size() > 0) {
                        for (Integer num : aniy.f76983a.f142034e) {
                            mo25229b((String) m64509a(linkedHashMap2, num.intValue()).getValue());
                        }
                    }
                } else if (z) {
                    for (String str4 : linkedHashMap.values()) {
                        mo25229b(str4);
                    }
                    if (anit2 != null) {
                        anit2.f76965g = list.size() - 1;
                    }
                } else if (linkedHashMap2 != null) {
                    mo25229b((String) linkedHashMap2.get(bnjd.m109587b(list)));
                    if (anit2 != null) {
                        anit2.f76965g = 1;
                    }
                } else {
                    mo25229b(str3);
                }
                if (!aniy.f76985c) {
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cahv cahv = (cahv) bxvd2.f164949b;
                    cahv cahv2 = cahv.f174600h;
                    cahv.f174604c = 3;
                    cahv.f174602a |= 2;
                } else {
                    int i3 = aniy.f76986d;
                    if (i3 == 0) {
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cahv cahv3 = (cahv) bxvd2.f164949b;
                        cahv cahv4 = cahv.f174600h;
                        cahv3.f174604c = 4;
                        cahv3.f174602a |= 2;
                    } else {
                        if (i3 >= 200) {
                            if (i3 < 300) {
                                bqze bqze2 = aniy.f76983a;
                                if (bqze2 == null) {
                                    if (bxvd2.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    cahv cahv5 = (cahv) bxvd2.f164949b;
                                    cahv cahv6 = cahv.f174600h;
                                    cahv5.f174604c = 5;
                                    cahv5.f174602a |= 2;
                                } else if (bqze2.f142034e.size() > 0) {
                                    if (bxvd2.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd2.f164950c = false;
                                    }
                                    cahv cahv7 = (cahv) bxvd2.f164949b;
                                    cahv cahv8 = cahv.f174600h;
                                    cahv7.f174604c = 9;
                                    cahv7.f174602a |= 2;
                                }
                            }
                        }
                        if (bxvd2.f164950c) {
                            bxvd.mo74035c();
                            bxvd2.f164950c = false;
                        }
                        cahv cahv9 = (cahv) bxvd2.f164949b;
                        cahv cahv10 = cahv.f174600h;
                        cahv9.f174604c = 6;
                        cahv9.f174602a |= 2;
                    }
                }
                if (cgem.f186663a.mo6606a().mo83556m() && (i = aniy.f76986d) != 200) {
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cahv cahv11 = (cahv) bxvd2.f164949b;
                    cahv cahv12 = cahv.f174600h;
                    cahv11.f174602a = 4 | cahv11.f174602a;
                    cahv11.f174605d = i;
                }
                if (aniy.f76983a != null) {
                    bnsl a2 = f76966a.mo26019b(m64527h());
                    a2.mo68432a("aniu", "a", 1378, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    a2.mo68420a("Heterodyne Response: %s", aniy.f76983a);
                    bqze bqze3 = aniy.f76983a;
                    int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cahv cahv13 = (cahv) bxvd2.f164949b;
                    cahv cahv14 = cahv.f174600h;
                    cahv13.f174602a |= 8;
                    cahv13.f174606e = elapsedRealtime2;
                    mo41843a(aniy);
                    return bqze3;
                } else if (cgem.f186663a.mo6606a().mo83549f()) {
                    Object[] objArr = new Object[2];
                    objArr[0] = Integer.valueOf(((cahv) bxvd2.f164949b).f174605d);
                    int a3 = cahu.m126649a(((cahv) bxvd2.f164949b).f174604c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    objArr[1] = cahu.m126650b(a3);
                    throw new anfy(29504, String.format("Null server response, http status code %d: %s", objArr));
                } else {
                    throw new anfy(29504, "Null server response");
                }
            } catch (IOException e) {
                e = e;
                try {
                    if (!bxvd2.f164950c) {
                    }
                    cahv cahv15 = (cahv) bxvd2.f164949b;
                    cahv cahv16 = cahv.f174600h;
                    cahv15.f174604c = 2;
                    cahv15.f174602a |= 2;
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                    if (bxvd2.f164950c) {
                        bxvd.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    cahv cahv17 = (cahv) bxvd2.f164949b;
                    cahv cahv18 = cahv.f174600h;
                    cahv17.f174602a |= 8;
                    cahv17.f174606e = elapsedRealtime3;
                    mo41843a(aniy);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                int elapsedRealtime32 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
                if (bxvd2.f164950c) {
                }
                cahv cahv172 = (cahv) bxvd2.f164949b;
                cahv cahv182 = cahv.f174600h;
                cahv172.f174602a |= 8;
                cahv172.f174606e = elapsedRealtime32;
                mo41843a(aniy);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            if (!bxvd2.f164950c) {
                bxvd.mo74035c();
                bxvd2.f164950c = false;
            }
            cahv cahv152 = (cahv) bxvd2.f164949b;
            cahv cahv162 = cahv.f174600h;
            cahv152.f174604c = 2;
            cahv152.f174602a |= 2;
            throw e;
        } catch (Throwable th3) {
            th = th3;
            int elapsedRealtime322 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (bxvd2.f164950c) {
            }
            cahv cahv1722 = (cahv) bxvd2.f164949b;
            cahv cahv1822 = cahv.f174600h;
            cahv1722.f174602a |= 8;
            cahv1722.f174606e = elapsedRealtime322;
            mo41843a(aniy);
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo41853a(int i, Runnable runnable) {
        if (!cgem.m144892g().f165791a.isEmpty()) {
            bxvt bxvt = cgem.m144892g().f165791a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            } else if (!bxvt.contains(Integer.valueOf(i2))) {
                return;
            }
        }
        try {
            runnable.run();
        } catch (RuntimeException e) {
            bnsl bnsl = (bnsl) f76966a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("aniu", "a", 762, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Garbage collection failed");
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(int, java.lang.String, java.lang.String[], java.lang.String[], boolean, cahw):void
     arg types: [int, java.lang.String, java.lang.String[], java.lang.String[], int, cahw]
     candidates:
      aniu.a(java.lang.String, long, long, java.lang.String, bqzi, android.database.sqlite.SQLiteStatement):void
      aniu.a(int, java.lang.String, java.lang.String[], java.lang.String[], boolean, cahw):void */
    /* renamed from: a */
    public final void mo41854a(int i, String str, cahw cahw) {
        String[] a = mo25227a();
        mo41855a(i, str, a, a, true, cahw);
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:196:0x041c */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:449:0x040e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:222:0x046d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:232:0x0495 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:249:0x04c7 */
    /* JADX WARN: Type inference failed for: r9v27, assign insn: PHI: (r9v27 ?) = (r9v33 ?), (r9v72 char) binds: [B:449:0x040e, B:190:?] */
    /* JADX WARN: Type inference failed for: r6v30, assign insn: PHI: (r6v30 ?) = (r6v27 java.lang.String[]), (r6v36 ?) binds: [B:190:?, B:449:0x040e] */
    /* JADX WARN: Type inference failed for: r9v33, assign insn: PHI: (r9v33 ?) = (r9v38 ?), (r9v43 ?) binds: [B:452:0x040e, B:451:0x040e] */
    /* JADX WARN: Type inference failed for: r6v36, assign insn: PHI: (r6v36 ?) = (r6v41 java.lang.String[]), (r6v47 java.lang.String[]) binds: [B:452:0x040e, B:451:0x040e] */
    /* JADX WARN: Type inference failed for: r8v30, assign insn: PHI: (r8v30 ?) = (r8v26 int), (r8v79 ?) binds: [B:221:0x0469, B:216:0x045e] */
    /* JADX WARN: Type inference failed for: r6v37, assign insn: PHI: (r6v37 ?) = (r6v30 ?), (r6v106 ?) binds: [B:221:0x0469, B:216:0x045e] */
    /* JADX WARN: Type inference failed for: r8v31, assign insn: PHI: (r8v31 ?) = (r8v30 ?), (r8v30 ?), (r8v30 ?), (r8v68 ? I:?[int, float, short, byte, char]) binds: [B:222:0x046d, B:232:0x0495, B:228:0x048e, B:249:0x04c7] */
    /* JADX WARN: Type inference failed for: r6v38, assign insn: PHI: (r6v38 ?) = (r6v37 ?), (r6v40 ?), (r6v40 ?), (r6v42 ?) binds: [B:222:0x046d, B:232:0x0495, B:249:0x04c7, B:228:0x048e] */
    /* JADX WARN: Type inference failed for: r8v32, assign insn: PHI: (r8v32 ?) = (r8v30 ?), (r8v30 ?), (r8v30 ?), (r8v69 ? I:?[int, float, short, byte, char]) binds: [B:222:0x046d, B:232:0x0495, B:228:0x048e, B:249:0x04c7] */
    /* JADX WARN: Type inference failed for: r6v39, assign insn: PHI: (r6v39 ?) = (r6v37 ?), (r6v40 ?), (r6v40 ?), (r6v85 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:222:0x046d, B:232:0x0495, B:249:0x04c7, B:228:0x048e] */
    /* JADX WARN: Type inference failed for: r6v40, types: [boolean], assign insn: PHI: (r6v40 ?) = (r6v43 ?), (r6v86 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) binds: [B:225:0x0488, B:229:?] */
    /* JADX WARN: Type inference failed for: r9v37, assign insn: PHI: (r9v37 ?) = (r9v39 ?), (r9v40 ?) binds: [B:247:0x04c4, B:244:?] */
    /* JADX WARN: Type inference failed for: r9v38, assign insn: 0x04d0: CONST  (r9v38 ? I:?[int, float, short, byte, char]) = (4 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v39, assign insn: 0x04c4: CONST  (r9v39 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v40, assign insn: 0x04b7: CONST  (r9v40 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r6v42, assign insn: 0x048d: CONST  (r6v42 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v43, assign insn: 0x0488: CONST  (r6v43 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v43, assign insn: 0x0453: CONST  (r9v43 ? I:?[int, float, short, byte, char]) = (4 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r6v48, assign insn: PHI: (r6v48 ?) = (r6v30 ?), (r6v27 java.lang.String[]) binds: [B:196:0x041c, B:179:0x03d9] */
    /* JADX WARN: Type inference failed for: r6v50, assign insn: PHI: (r6v50 ?) = (r6v30 ?), (r6v27 java.lang.String[]) binds: [B:196:0x041c, B:179:0x03d9] */
    /* JADX WARN: Type inference failed for: r8v68, assign insn: 0x04a3: CONST  (r8v68 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r8v69, assign insn: 0x04a3: CONST  (r8v69 ? I:?[int, float, short, byte, char]) = (2 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r6v85, assign insn: 0x048d: CONST  (r6v85 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r6v86, assign insn: 0x048d: CONST  (r6v86 ? I:?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (0 ?[int, float, boolean, short, byte, char, OBJECT, ARRAY]) */
    /* JADX WARN: Type inference failed for: r9v75, assign insn: ?: MOVE  (r9v75 ?) = (r9v35 anit) */
    /* JADX WARN: Type inference failed for: r9v76, assign insn: ?: MOVE  (r9v76 ?) = (r9v36 anit) */
    /* JADX WARN: Type inference failed for: r6v106, assign insn: ?: MOVE  (r6v106 ?) = (r6v46 java.lang.String) */
    /* JADX WARN: Type inference failed for: r8v79, assign insn: ?: MOVE  (r8v79 ?) = (r8v35 bxvd) */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void
     arg types: [java.util.HashSet, java.util.ArrayList, ?[OBJECT, ARRAY], int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, int]
     candidates:
      aniu.a(int, java.lang.String, cahw, bxvd, anit, java.util.LinkedHashMap, boolean, java.util.List, java.lang.String, java.util.Set):void
      aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void
     arg types: [java.util.HashSet, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, int]
     candidates:
      aniu.a(int, java.lang.String, cahw, bxvd, anit, java.util.LinkedHashMap, boolean, java.util.List, java.lang.String, java.util.Set):void
      aniu.a(java.util.Set, java.util.List, java.lang.String, int, java.lang.String, boolean, bxvd, anit, java.util.LinkedHashMap, boolean):void */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x0488 A[Catch:{ all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:226:0x048a A[Catch:{ all -> 0x04d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04a7 A[SYNTHETIC, Splitter:B:236:0x04a7] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x04c4  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x04c7 A[SYNTHETIC, Splitter:B:249:0x04c7] */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x04de A[Catch:{ RuntimeException -> 0x04e4, all -> 0x04e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:272:0x0503  */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0506  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0515 A[Catch:{ RuntimeException -> 0x053b, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0516 A[Catch:{ RuntimeException -> 0x053b, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:371:0x0760 A[SYNTHETIC, Splitter:B:371:0x0760] */
    /* JADX WARNING: Removed duplicated region for block: B:407:0x07e3 A[Catch:{ all -> 0x07fb }] */
    /* JADX WARNING: Removed duplicated region for block: B:421:0x081a  */
    /* JADX WARNING: Removed duplicated region for block: B:425:0x0837  */
    /* JADX WARNING: Removed duplicated region for block: B:428:0x085c  */
    /* JADX WARNING: Removed duplicated region for block: B:434:0x0889  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    public final void mo41855a(int i, String str, String[] strArr, String[] strArr2, boolean z, cahw cahw) {
        cahw cahw2;
        long j;
        anit anit;
        String[] strArr3;
        aniu aniu;
        int i2;
        int i3;
        cahw cahw3;
        boolean z2;
        bxvd bxvd;
        HashSet hashSet;
        int i4;
        boolean z3;
        LinkedHashMap linkedHashMap;
        HashSet hashSet2;
        bxvd bxvd2;
        anit anit2;
        bxvd bxvd3;
        anit anit3;
        boolean z4;
        boolean z5;
        bxvd bxvd4;
        String[] strArr4;
        aniu aniu2;
        int i5;
        cahw cahw4;
        boolean z6;
        HashSet hashSet3;
        int i6;
        anit anit4;
        boolean z7;
        boolean z8;
        int i7;
        boolean z9;
        anit anit5;
        cahw cahw5;
        boolean z10;
        String[] strArr5;
        boolean z11;
        int i8;
        bxvd bxvd5;
        aniu aniu3;
        HashSet hashSet4;
        cahw cahw6;
        boolean z12;
        int i9;
        bxvd bxvd6;
        aniu aniu4;
        HashSet hashSet5;
        cahw cahw7;
        SQLiteDatabase writableDatabase;
        String[] strArr6;
        boolean z13;
        Throwable th;
        int i10;
        bxvd bxvd7;
        aniu aniu5;
        HashSet hashSet6;
        cahw cahw8;
        int i11;
        String[] strArr7;
        anit anit6;
        int i12;
        cahw cahw9;
        aniu aniu6;
        anit anit7;
        int i13;
        boolean z14;
        int i14;
        cahw cahw10;
        HashSet hashSet7;
        aniu aniu7;
        int i15;
        boolean z15;
        int i16;
        cahw cahw11;
        HashSet hashSet8;
        int i17;
        anit anit8;
        boolean z16;
        int i18;
        boolean z17;
        anit anit9;
        aniu aniu8;
        int i19;
        aniu aniu9;
        int i20;
        String str2;
        String str3;
        String str4;
        char c;
        String str5;
        int i21;
        boolean z18;
        int i22;
        boolean z19;
        bxvd bxvd8;
        bxvd bxvd9;
        String str6;
        String str7;
        anit anit10;
        ? r6;
        int i23;
        String str8;
        String str9;
        ? r9;
        bxvd bxvd10;
        int i24;
        boolean z20;
        int i25;
        boolean z21;
        int i26;
        boolean z22;
        int i27;
        boolean z23;
        boolean z24;
        Set set;
        bnsl bnsl;
        int length;
        bxvd bxvd11;
        aniu aniu10 = this;
        int i28 = i;
        String[] strArr8 = strArr;
        String[] strArr9 = strArr2;
        if (!aniu10.f76972f) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (cahw != null) {
                cahw2 = cahw;
            } else {
                cahw2 = (cahw) cahz.f174610h.mo74144da();
            }
            int i29 = aniu10.f76976k;
            if (cahw2.f164950c) {
                cahw2.mo74035c();
                cahw2.f164950c = false;
            }
            cahz cahz = (cahz) cahw2.f164949b;
            int i30 = i29 - 1;
            cahz cahz2 = cahz.f174610h;
            if (i29 != 0) {
                cahz.f174613b = i30;
                int i31 = cahz.f174612a | 1;
                cahz.f174612a = i31;
                int i32 = i28 - 1;
                if (i28 != 0) {
                    cahz.f174614c = i32;
                    cahz.f174612a = i31 | 2;
                    String b = bmxx.m108578b(str);
                    if (cahw2.f164950c) {
                        cahw2.mo74035c();
                        cahw2.f164950c = false;
                    }
                    cahz cahz3 = (cahz) cahw2.f164949b;
                    b.getClass();
                    cahz3.f174612a |= 4;
                    cahz3.f174615d = b;
                    boolean c2 = cgdb.f186584a.mo6606a().mo83508c();
                    boolean z25 = c2 && cgdb.f186584a.mo6606a().mo83506a();
                    HashSet hashSet9 = new HashSet();
                    if (c2) {
                        try {
                            bxvd da = cahv.f174600h.mo74144da();
                            try {
                                anit anit11 = new anit();
                                hashSet2 = hashSet9;
                                try {
                                    int e = (int) cgec.m144830e();
                                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                    int length2 = strArr9.length;
                                    anit11.f76959a = length2;
                                    if (length2 > e) {
                                        ArrayList c3 = m64524c(strArr2);
                                        ArrayList arrayList = new ArrayList(m64510a(aniu10.f76970d.getWritableDatabase()));
                                        bxvd11 = da;
                                        try {
                                            ArrayList arrayList2 = new ArrayList(Arrays.asList(strArr2));
                                            LinkedHashSet linkedHashSet = new LinkedHashSet(c3);
                                            arrayList.remove("");
                                            Collections.sort(arrayList);
                                            linkedHashSet.addAll(arrayList);
                                            Collections.sort(arrayList2);
                                            linkedHashSet.addAll(arrayList2);
                                            Iterator it = linkedHashSet.iterator();
                                            while (it.hasNext()) {
                                                String str10 = (String) it.next();
                                                if (linkedHashMap2.size() >= e) {
                                                    break;
                                                }
                                                aniu10.m64519a(linkedHashMap2, z25, str10);
                                            }
                                        } catch (RuntimeException e2) {
                                            e = e2;
                                            anit = anit11;
                                            cahw3 = cahw2;
                                            aniu = aniu10;
                                            i4 = i28;
                                            strArr3 = strArr9;
                                            j = elapsedRealtime;
                                            hashSet = hashSet2;
                                            bxvd = bxvd11;
                                            z3 = false;
                                            i3 = 2;
                                            i2 = 1;
                                            try {
                                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                }
                                                throw e;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                z2 = z3;
                                                int a = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                int a2 = m64504a(anit);
                                                if (bxvd.f164950c) {
                                                }
                                                cahv cahv = (cahv) bxvd.f164949b;
                                                cahv cahv2 = cahv.f174600h;
                                                cahv.f174604c = a2 - 1;
                                                cahv.f174602a |= i3;
                                                bxvd b2 = m64523b(anit);
                                                if (bxvd.f164950c) {
                                                }
                                                cahv cahv3 = (cahv) bxvd.f164949b;
                                                caii caii = (caii) b2.mo74062i();
                                                cahv cahv4 = cahv.f174600h;
                                                caii.getClass();
                                                cahv3.f174608g = caii;
                                                cahv3.f174602a |= 64;
                                                cahw3.mo74649a(bxvd);
                                                if (m64504a(anit) != i2) {
                                                }
                                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                aniu.mo41842a(i4, hashSet);
                                                int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - j);
                                                if (cahw3.f164950c) {
                                                }
                                                cahz cahz4 = (cahz) cahw3.f164949b;
                                                cahz4.f174612a |= 32;
                                                cahz4.f174618g = elapsedRealtime2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            anit = anit11;
                                            cahw3 = cahw2;
                                            aniu = aniu10;
                                            i4 = i28;
                                            strArr3 = strArr9;
                                            j = elapsedRealtime;
                                            hashSet = hashSet2;
                                            bxvd = bxvd11;
                                            z2 = false;
                                            i3 = 2;
                                            i2 = 1;
                                            int a3 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                            int a22 = m64504a(anit);
                                            if (bxvd.f164950c) {
                                            }
                                            cahv cahv5 = (cahv) bxvd.f164949b;
                                            cahv cahv22 = cahv.f174600h;
                                            cahv5.f174604c = a22 - 1;
                                            cahv5.f174602a |= i3;
                                            bxvd b22 = m64523b(anit);
                                            if (bxvd.f164950c) {
                                            }
                                            cahv cahv32 = (cahv) bxvd.f164949b;
                                            caii caii2 = (caii) b22.mo74062i();
                                            cahv cahv42 = cahv.f174600h;
                                            caii2.getClass();
                                            cahv32.f174608g = caii2;
                                            cahv32.f174602a |= 64;
                                            cahw3.mo74649a(bxvd);
                                            if (m64504a(anit) != i2) {
                                            }
                                            aniu.mo41853a(i4, new anis(aniu, strArr3));
                                            aniu.mo41842a(i4, hashSet);
                                            int elapsedRealtime22 = (int) (SystemClock.elapsedRealtime() - j);
                                            if (cahw3.f164950c) {
                                            }
                                            cahz cahz42 = (cahz) cahw3.f164949b;
                                            cahz42.f174612a |= 32;
                                            cahz42.f174618g = elapsedRealtime22;
                                            throw th;
                                        }
                                    } else {
                                        bxvd11 = da;
                                        aniu10.m64519a(linkedHashMap2, z25, strArr9);
                                    }
                                    anit11.f76960b = linkedHashMap2.size();
                                    anit2 = anit11;
                                    bxvd2 = bxvd11;
                                    linkedHashMap = linkedHashMap2;
                                } catch (RuntimeException e3) {
                                    e = e3;
                                    bxvd11 = da;
                                    anit = anit11;
                                    cahw3 = cahw2;
                                    aniu = aniu10;
                                    i4 = i28;
                                    strArr3 = strArr9;
                                    j = elapsedRealtime;
                                    hashSet = hashSet2;
                                    bxvd = bxvd11;
                                    z3 = false;
                                    i3 = 2;
                                    i2 = 1;
                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                    }
                                    throw e;
                                } catch (Throwable th4) {
                                    th = th4;
                                    bxvd11 = da;
                                    anit = anit11;
                                    cahw3 = cahw2;
                                    aniu = aniu10;
                                    i4 = i28;
                                    strArr3 = strArr9;
                                    j = elapsedRealtime;
                                    hashSet = hashSet2;
                                    bxvd = bxvd11;
                                    z2 = false;
                                    i3 = 2;
                                    i2 = 1;
                                    int a32 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                    int a222 = m64504a(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv52 = (cahv) bxvd.f164949b;
                                    cahv cahv222 = cahv.f174600h;
                                    cahv52.f174604c = a222 - 1;
                                    cahv52.f174602a |= i3;
                                    bxvd b222 = m64523b(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv322 = (cahv) bxvd.f164949b;
                                    caii caii22 = (caii) b222.mo74062i();
                                    cahv cahv422 = cahv.f174600h;
                                    caii22.getClass();
                                    cahv322.f174608g = caii22;
                                    cahv322.f174602a |= 64;
                                    cahw3.mo74649a(bxvd);
                                    if (m64504a(anit) != i2) {
                                    }
                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                    aniu.mo41842a(i4, hashSet);
                                    int elapsedRealtime222 = (int) (SystemClock.elapsedRealtime() - j);
                                    if (cahw3.f164950c) {
                                    }
                                    cahz cahz422 = (cahz) cahw3.f164949b;
                                    cahz422.f174612a |= 32;
                                    cahz422.f174618g = elapsedRealtime222;
                                    throw th;
                                }
                            } catch (RuntimeException e4) {
                                e = e4;
                                cahw3 = cahw2;
                                aniu = aniu10;
                                i4 = i28;
                                strArr3 = strArr9;
                                j = elapsedRealtime;
                                hashSet = hashSet9;
                                bxvd = da;
                                z3 = false;
                                i3 = 2;
                                i2 = 1;
                                anit = null;
                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                }
                                throw e;
                            } catch (Throwable th5) {
                                th = th5;
                                cahw3 = cahw2;
                                aniu = aniu10;
                                i4 = i28;
                                strArr3 = strArr9;
                                j = elapsedRealtime;
                                hashSet = hashSet9;
                                bxvd = da;
                                z2 = false;
                                i3 = 2;
                                i2 = 1;
                                anit = null;
                                int a322 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                int a2222 = m64504a(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv522 = (cahv) bxvd.f164949b;
                                cahv cahv2222 = cahv.f174600h;
                                cahv522.f174604c = a2222 - 1;
                                cahv522.f174602a |= i3;
                                bxvd b2222 = m64523b(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv3222 = (cahv) bxvd.f164949b;
                                caii caii222 = (caii) b2222.mo74062i();
                                cahv cahv4222 = cahv.f174600h;
                                caii222.getClass();
                                cahv3222.f174608g = caii222;
                                cahv3222.f174602a |= 64;
                                cahw3.mo74649a(bxvd);
                                if (m64504a(anit) != i2) {
                                }
                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                aniu.mo41842a(i4, hashSet);
                                int elapsedRealtime2222 = (int) (SystemClock.elapsedRealtime() - j);
                                if (cahw3.f164950c) {
                                }
                                cahz cahz4222 = (cahz) cahw3.f164949b;
                                cahz4222.f174612a |= 32;
                                cahz4222.f174618g = elapsedRealtime2222;
                                throw th;
                            }
                        } catch (RuntimeException e5) {
                            e = e5;
                            cahw3 = cahw2;
                            aniu = aniu10;
                            i4 = i28;
                            strArr3 = strArr9;
                            j = elapsedRealtime;
                            hashSet = hashSet9;
                            bxvd = null;
                            z3 = false;
                            i3 = 2;
                            i2 = 1;
                            anit = null;
                            if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                            }
                            throw e;
                        } catch (Throwable th6) {
                            th = th6;
                            cahw3 = cahw2;
                            aniu = aniu10;
                            i4 = i28;
                            strArr3 = strArr9;
                            j = elapsedRealtime;
                            hashSet = hashSet9;
                            bxvd = null;
                            z2 = false;
                            i3 = 2;
                            i2 = 1;
                            anit = null;
                            int a3222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                            int a22222 = m64504a(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv5222 = (cahv) bxvd.f164949b;
                            cahv cahv22222 = cahv.f174600h;
                            cahv5222.f174604c = a22222 - 1;
                            cahv5222.f174602a |= i3;
                            bxvd b22222 = m64523b(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv32222 = (cahv) bxvd.f164949b;
                            caii caii2222 = (caii) b22222.mo74062i();
                            cahv cahv42222 = cahv.f174600h;
                            caii2222.getClass();
                            cahv32222.f174608g = caii2222;
                            cahv32222.f174602a |= 64;
                            cahw3.mo74649a(bxvd);
                            if (m64504a(anit) != i2) {
                            }
                            aniu.mo41853a(i4, new anis(aniu, strArr3));
                            aniu.mo41842a(i4, hashSet);
                            int elapsedRealtime22222 = (int) (SystemClock.elapsedRealtime() - j);
                            if (cahw3.f164950c) {
                            }
                            cahz cahz42222 = (cahz) cahw3.f164949b;
                            cahz42222.f174612a |= 32;
                            cahz42222.f174618g = elapsedRealtime22222;
                            throw th;
                        }
                    } else {
                        hashSet2 = hashSet9;
                        anit2 = null;
                        bxvd2 = null;
                        linkedHashMap = null;
                    }
                    try {
                        boolean z26 = !m64524c(strArr2).isEmpty();
                        if (cgem.f186663a.mo6606a().mo83559p()) {
                            aniu10.mo41853a(i28, new anip(aniu10));
                        }
                        String str11 = ":com.google.android.gms@201515033@20.15.15 (120300-306758586)";
                        String str12 = "a";
                        if (linkedHashMap != null) {
                            try {
                                if (cgdb.f186584a.mo6606a().mo83507b()) {
                                    set = new LinkedHashSet(Arrays.asList(strArr));
                                } else {
                                    set = new HashSet(Arrays.asList(strArr));
                                }
                                set.retainAll(linkedHashMap.keySet());
                                bnsl = (bnsl) f76966a.mo68390d();
                                z10 = z25;
                                bnsl.mo68432a("aniu", str12, 735, str11);
                                length = strArr8.length;
                                cahw5 = cahw2;
                            } catch (RuntimeException e6) {
                                e = e6;
                                j = elapsedRealtime;
                                bxvd4 = bxvd2;
                                cahw4 = cahw2;
                                aniu2 = aniu10;
                                i6 = i28;
                                strArr4 = strArr9;
                                hashSet3 = hashSet2;
                                z6 = false;
                                i5 = 2;
                                anit4 = anit2;
                                z5 = z6;
                                i2 = 1;
                                z4 = z5;
                                anit = anit3;
                                bxvd = bxvd3;
                                z3 = z4;
                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                }
                                throw e;
                            } catch (Throwable th7) {
                                th = th7;
                                j = elapsedRealtime;
                                bxvd3 = bxvd2;
                                cahw3 = cahw2;
                                aniu = aniu10;
                                i4 = i28;
                                strArr3 = strArr9;
                                hashSet = hashSet2;
                                z9 = false;
                                i7 = 2;
                                anit5 = anit2;
                                z8 = z9;
                                i2 = 1;
                                z7 = z8;
                                anit = anit3;
                                bxvd = bxvd3;
                                z2 = z7;
                                int a32222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                int a222222 = m64504a(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv52222 = (cahv) bxvd.f164949b;
                                cahv cahv222222 = cahv.f174600h;
                                cahv52222.f174604c = a222222 - 1;
                                cahv52222.f174602a |= i3;
                                bxvd b222222 = m64523b(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv322222 = (cahv) bxvd.f164949b;
                                caii caii22222 = (caii) b222222.mo74062i();
                                cahv cahv422222 = cahv.f174600h;
                                caii22222.getClass();
                                cahv322222.f174608g = caii22222;
                                cahv322222.f174602a |= 64;
                                cahw3.mo74649a(bxvd);
                                if (m64504a(anit) != i2) {
                                }
                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                aniu.mo41842a(i4, hashSet);
                                int elapsedRealtime222222 = (int) (SystemClock.elapsedRealtime() - j);
                                if (cahw3.f164950c) {
                                }
                                cahz cahz422222 = (cahz) cahw3.f164949b;
                                cahz422222.f174612a |= 32;
                                cahz422222.f174618g = elapsedRealtime222222;
                                throw th;
                            }
                            try {
                                j = elapsedRealtime;
                                try {
                                    bnsl.mo68409a("Removed %d invalid users", length - set.size());
                                    anit2.f76962d = length;
                                    anit2.f76964f = set.size();
                                    strArr5 = (String[]) set.toArray(new String[0]);
                                } catch (RuntimeException e7) {
                                    e = e7;
                                    bxvd4 = bxvd2;
                                    aniu2 = aniu10;
                                    i6 = i28;
                                    strArr4 = strArr9;
                                    hashSet3 = hashSet2;
                                    cahw4 = cahw5;
                                    z6 = false;
                                    i5 = 2;
                                    anit4 = anit2;
                                    z5 = z6;
                                    i2 = 1;
                                    z4 = z5;
                                    anit = anit3;
                                    bxvd = bxvd3;
                                    z3 = z4;
                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                    }
                                    throw e;
                                } catch (Throwable th8) {
                                    th = th8;
                                    bxvd3 = bxvd2;
                                    aniu = aniu10;
                                    i4 = i28;
                                    strArr3 = strArr9;
                                    hashSet = hashSet2;
                                    cahw3 = cahw5;
                                    z9 = false;
                                    i7 = 2;
                                    anit5 = anit2;
                                    z8 = z9;
                                    i2 = 1;
                                    z7 = z8;
                                    anit = anit3;
                                    bxvd = bxvd3;
                                    z2 = z7;
                                    int a322222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                    int a2222222 = m64504a(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv522222 = (cahv) bxvd.f164949b;
                                    cahv cahv2222222 = cahv.f174600h;
                                    cahv522222.f174604c = a2222222 - 1;
                                    cahv522222.f174602a |= i3;
                                    bxvd b2222222 = m64523b(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv3222222 = (cahv) bxvd.f164949b;
                                    caii caii222222 = (caii) b2222222.mo74062i();
                                    cahv cahv4222222 = cahv.f174600h;
                                    caii222222.getClass();
                                    cahv3222222.f174608g = caii222222;
                                    cahv3222222.f174602a |= 64;
                                    cahw3.mo74649a(bxvd);
                                    if (m64504a(anit) != i2) {
                                    }
                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                    aniu.mo41842a(i4, hashSet);
                                    int elapsedRealtime2222222 = (int) (SystemClock.elapsedRealtime() - j);
                                    if (cahw3.f164950c) {
                                    }
                                    cahz cahz4222222 = (cahz) cahw3.f164949b;
                                    cahz4222222.f174612a |= 32;
                                    cahz4222222.f174618g = elapsedRealtime2222222;
                                    throw th;
                                }
                            } catch (RuntimeException e8) {
                                e = e8;
                                j = elapsedRealtime;
                                bxvd4 = bxvd2;
                                aniu2 = aniu10;
                                i6 = i28;
                                strArr4 = strArr9;
                                hashSet3 = hashSet2;
                                cahw4 = cahw5;
                                z6 = false;
                                i5 = 2;
                                anit4 = anit2;
                                z5 = z6;
                                i2 = 1;
                                z4 = z5;
                                anit = anit3;
                                bxvd = bxvd3;
                                z3 = z4;
                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                }
                                throw e;
                            } catch (Throwable th9) {
                                th = th9;
                                j = elapsedRealtime;
                                bxvd3 = bxvd2;
                                aniu = aniu10;
                                i4 = i28;
                                strArr3 = strArr9;
                                hashSet = hashSet2;
                                cahw3 = cahw5;
                                z9 = false;
                                i7 = 2;
                                anit5 = anit2;
                                z8 = z9;
                                i2 = 1;
                                z7 = z8;
                                anit = anit3;
                                bxvd = bxvd3;
                                z2 = z7;
                                int a3222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                int a22222222 = m64504a(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv5222222 = (cahv) bxvd.f164949b;
                                cahv cahv22222222 = cahv.f174600h;
                                cahv5222222.f174604c = a22222222 - 1;
                                cahv5222222.f174602a |= i3;
                                bxvd b22222222 = m64523b(anit);
                                if (bxvd.f164950c) {
                                }
                                cahv cahv32222222 = (cahv) bxvd.f164949b;
                                caii caii2222222 = (caii) b22222222.mo74062i();
                                cahv cahv42222222 = cahv.f174600h;
                                caii2222222.getClass();
                                cahv32222222.f174608g = caii2222222;
                                cahv32222222.f174602a |= 64;
                                cahw3.mo74649a(bxvd);
                                if (m64504a(anit) != i2) {
                                }
                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                aniu.mo41842a(i4, hashSet);
                                int elapsedRealtime22222222 = (int) (SystemClock.elapsedRealtime() - j);
                                if (cahw3.f164950c) {
                                }
                                cahz cahz42222222 = (cahz) cahw3.f164949b;
                                cahz42222222.f174612a |= 32;
                                cahz42222222.f174618g = elapsedRealtime22222222;
                                throw th;
                            }
                        } else {
                            z10 = z25;
                            cahw5 = cahw2;
                            j = elapsedRealtime;
                            strArr5 = strArr8;
                        }
                        int length3 = strArr8.length;
                        int length4 = strArr5.length;
                        int i33 = length3 - length4;
                        try {
                            if (((long) length4) > cgec.m144830e()) {
                                bnsl bnsl2 = (bnsl) f76966a.mo68390d();
                                bnsl2.mo68432a("aniu", str12, 745, str11);
                                bnsl2.mo68412a("users truncated from %d to %d", length4, cgec.m144830e());
                                strArr5 = (String[]) Arrays.copyOf(strArr5, (int) cgec.m144830e());
                            }
                            writableDatabase = aniu10.f76970d.getWritableDatabase();
                            strArr6 = new String[1];
                            z11 = false;
                            z12 = false;
                        } catch (RuntimeException e9) {
                            e = e9;
                            i8 = i;
                            bxvd5 = bxvd2;
                            aniu3 = aniu10;
                            hashSet4 = hashSet2;
                            cahw6 = cahw5;
                            z11 = false;
                            i5 = 2;
                            strArr4 = strArr2;
                            z6 = z11;
                            anit4 = anit2;
                            z5 = z6;
                            i2 = 1;
                            z4 = z5;
                            anit = anit3;
                            bxvd = bxvd3;
                            z3 = z4;
                            if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                            }
                            throw e;
                        } catch (Throwable th10) {
                            th = th10;
                            i9 = i;
                            bxvd6 = bxvd2;
                            aniu4 = aniu10;
                            hashSet5 = hashSet2;
                            cahw7 = cahw5;
                            z12 = false;
                            i7 = 2;
                            strArr3 = strArr2;
                            z9 = z12;
                            anit5 = anit2;
                            z8 = z9;
                            i2 = 1;
                            z7 = z8;
                            anit = anit3;
                            bxvd = bxvd3;
                            z2 = z7;
                            int a32222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                            int a222222222 = m64504a(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv52222222 = (cahv) bxvd.f164949b;
                            cahv cahv222222222 = cahv.f174600h;
                            cahv52222222.f174604c = a222222222 - 1;
                            cahv52222222.f174602a |= i3;
                            bxvd b222222222 = m64523b(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv322222222 = (cahv) bxvd.f164949b;
                            caii caii22222222 = (caii) b222222222.mo74062i();
                            cahv cahv422222222 = cahv.f174600h;
                            caii22222222.getClass();
                            cahv322222222.f174608g = caii22222222;
                            cahv322222222.f174602a |= 64;
                            cahw3.mo74649a(bxvd);
                            if (m64504a(anit) != i2) {
                            }
                            aniu.mo41853a(i4, new anis(aniu, strArr3));
                            aniu.mo41842a(i4, hashSet);
                            int elapsedRealtime222222222 = (int) (SystemClock.elapsedRealtime() - j);
                            if (cahw3.f164950c) {
                            }
                            cahz cahz422222222 = (cahz) cahw3.f164949b;
                            cahz422222222.f174612a |= 32;
                            cahz422222222.f174618g = elapsedRealtime222222222;
                            throw th;
                        }
                        try {
                            strArr6[0] = "packageName";
                            Cursor query = writableDatabase.query("Packages", strArr6, null, null, null, null, null, null);
                            while (query.moveToNext()) {
                                try {
                                    try {
                                        if (!query.getString(0).startsWith("__internal.")) {
                                            if (query != null) {
                                                try {
                                                    query.close();
                                                } catch (RuntimeException e10) {
                                                    e = e10;
                                                    bxvd3 = bxvd2;
                                                    aniu = aniu10;
                                                    z4 = false;
                                                    i3 = 2;
                                                    strArr3 = strArr2;
                                                    anit3 = anit2;
                                                    i2 = 1;
                                                    i4 = i;
                                                    hashSet = hashSet2;
                                                    cahw3 = cahw5;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z3 = z4;
                                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                    }
                                                    throw e;
                                                } catch (Throwable th11) {
                                                    th = th11;
                                                    bxvd3 = bxvd2;
                                                    aniu = aniu10;
                                                    z7 = false;
                                                    i3 = 2;
                                                    strArr3 = strArr2;
                                                    anit3 = anit2;
                                                    i2 = 1;
                                                    i4 = i;
                                                    hashSet = hashSet2;
                                                    cahw3 = cahw5;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z2 = z7;
                                                    int a322222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                    int a2222222222 = m64504a(anit);
                                                    if (bxvd.f164950c) {
                                                    }
                                                    cahv cahv522222222 = (cahv) bxvd.f164949b;
                                                    cahv cahv2222222222 = cahv.f174600h;
                                                    cahv522222222.f174604c = a2222222222 - 1;
                                                    cahv522222222.f174602a |= i3;
                                                    bxvd b2222222222 = m64523b(anit);
                                                    if (bxvd.f164950c) {
                                                    }
                                                    cahv cahv3222222222 = (cahv) bxvd.f164949b;
                                                    caii caii222222222 = (caii) b2222222222.mo74062i();
                                                    cahv cahv4222222222 = cahv.f174600h;
                                                    caii222222222.getClass();
                                                    cahv3222222222.f174608g = caii222222222;
                                                    cahv3222222222.f174602a |= 64;
                                                    cahw3.mo74649a(bxvd);
                                                    if (m64504a(anit) != i2) {
                                                    }
                                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                    aniu.mo41842a(i4, hashSet);
                                                    int elapsedRealtime2222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                    if (cahw3.f164950c) {
                                                    }
                                                    cahz cahz4222222222 = (cahz) cahw3.f164949b;
                                                    cahz4222222222.f174612a |= 32;
                                                    cahz4222222222.f174618g = elapsedRealtime2222222222;
                                                    throw th;
                                                }
                                            }
                                            ArrayList<String> arrayList3 = new ArrayList(strArr5.length + 1);
                                            if (z) {
                                                arrayList3.add("");
                                            }
                                            Collections.addAll(arrayList3, strArr5);
                                            if (anit2 != null) {
                                                int size = arrayList3.size();
                                                anit2.f76963e = size;
                                                anit2.f76961c = size <= anit2.f76964f ? anit2.f76962d : anit2.f76962d + 1;
                                            }
                                            if (c2) {
                                                try {
                                                    if (arrayList3.size() > 1) {
                                                        String str13 = "aniu";
                                                        z16 = z10;
                                                        String str14 = str12;
                                                        String str15 = str11;
                                                        anit8 = anit2;
                                                        i17 = i33;
                                                        cahw9 = cahw5;
                                                        bxvd3 = bxvd2;
                                                        try {
                                                            m64521a((Set) hashSet2, (List) arrayList3, (String) null, i, str, z26, bxvd2, anit2, linkedHashMap, true);
                                                            z17 = false;
                                                            i18 = 4;
                                                            i3 = 2;
                                                            i21 = 1;
                                                            if (i17 > 0) {
                                                                if (z16) {
                                                                    anit9 = anit8;
                                                                    try {
                                                                        if (anit9.f76959a <= anit9.f76960b) {
                                                                        }
                                                                    } catch (RuntimeException e11) {
                                                                        e = e11;
                                                                        aniu8 = this;
                                                                        i19 = i;
                                                                        i13 = i3;
                                                                        z14 = z17;
                                                                        cahw10 = cahw9;
                                                                        hashSet7 = hashSet2;
                                                                        i24 = i13;
                                                                        z20 = z14;
                                                                        strArr3 = strArr2;
                                                                        i3 = i24;
                                                                        z4 = z20;
                                                                        anit = anit3;
                                                                        bxvd = bxvd3;
                                                                        z3 = z4;
                                                                        if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                                        }
                                                                        throw e;
                                                                    } catch (Throwable th12) {
                                                                        th = th12;
                                                                        aniu9 = this;
                                                                        i20 = i;
                                                                        i15 = i3;
                                                                        z15 = z17;
                                                                        cahw11 = cahw9;
                                                                        hashSet8 = hashSet2;
                                                                        i26 = i15;
                                                                        z22 = z15;
                                                                        strArr3 = strArr2;
                                                                        i3 = i26;
                                                                        z7 = z22;
                                                                        anit = anit3;
                                                                        bxvd = bxvd3;
                                                                        z2 = z7;
                                                                        int a3222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                                        int a22222222222 = m64504a(anit);
                                                                        if (bxvd.f164950c) {
                                                                        }
                                                                        cahv cahv5222222222 = (cahv) bxvd.f164949b;
                                                                        cahv cahv22222222222 = cahv.f174600h;
                                                                        cahv5222222222.f174604c = a22222222222 - 1;
                                                                        cahv5222222222.f174602a |= i3;
                                                                        bxvd b22222222222 = m64523b(anit);
                                                                        if (bxvd.f164950c) {
                                                                        }
                                                                        cahv cahv32222222222 = (cahv) bxvd.f164949b;
                                                                        caii caii2222222222 = (caii) b22222222222.mo74062i();
                                                                        cahv cahv42222222222 = cahv.f174600h;
                                                                        caii2222222222.getClass();
                                                                        cahv32222222222.f174608g = caii2222222222;
                                                                        cahv32222222222.f174602a |= 64;
                                                                        cahw3.mo74649a(bxvd);
                                                                        if (m64504a(anit) != i2) {
                                                                        }
                                                                        aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                                        aniu.mo41842a(i4, hashSet);
                                                                        int elapsedRealtime22222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                                        if (cahw3.f164950c) {
                                                                        }
                                                                        cahz cahz42222222222 = (cahz) cahw3.f164949b;
                                                                        cahz42222222222.f174612a |= 32;
                                                                        cahz42222222222.f174618g = elapsedRealtime22222222222;
                                                                        throw th;
                                                                    }
                                                                } else {
                                                                    anit9 = anit8;
                                                                }
                                                                if (!(bxvd3 == null || anit9 == null)) {
                                                                    int a4 = cahu.m126649a(((cahv) bxvd3.f164949b).f174604c);
                                                                    if (a4 == 0 || a4 == i2) {
                                                                        int a5 = m64504a(anit9);
                                                                        if (bxvd3.f164950c) {
                                                                            bxvd3.mo74035c();
                                                                            bxvd3.f164950c = z17;
                                                                        }
                                                                        cahv cahv6 = (cahv) bxvd3.f164949b;
                                                                        cahv cahv7 = cahv.f174600h;
                                                                        cahv6.f174604c = a5 - 1;
                                                                        cahv6.f174602a |= i3;
                                                                    }
                                                                    bxvd b3 = m64523b(anit9);
                                                                    if (bxvd3.f164950c) {
                                                                        bxvd3.mo74035c();
                                                                        bxvd3.f164950c = z17;
                                                                    }
                                                                    cahv cahv8 = (cahv) bxvd3.f164949b;
                                                                    caii caii3 = (caii) b3.mo74062i();
                                                                    cahv cahv9 = cahv.f174600h;
                                                                    caii3.getClass();
                                                                    cahv8.f174608g = caii3;
                                                                    cahv8.f174602a |= 64;
                                                                    cahw9.mo74649a(bxvd3);
                                                                    if (m64504a(anit9) != i2) {
                                                                        if (cahw9.f164950c) {
                                                                            cahw9.mo74035c();
                                                                            cahw9.f164950c = z17;
                                                                        }
                                                                        cahz cahz5 = (cahz) cahw9.f164949b;
                                                                        cahz5.f174617f = i18;
                                                                        cahz5.f174612a |= 16;
                                                                    }
                                                                }
                                                                cahw cahw12 = cahw9;
                                                                mo41853a(i, new anir(this, strArr2));
                                                                mo41842a(i, hashSet2);
                                                                int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - j);
                                                                if (cahw12.f164950c) {
                                                                    cahw12.mo74035c();
                                                                    cahw12.f164950c = z17;
                                                                }
                                                                cahz cahz6 = (cahz) cahw12.f164949b;
                                                                cahz6.f174612a |= 32;
                                                                cahz6.f174618g = elapsedRealtime3;
                                                                return;
                                                            }
                                                            if (!cahw9.f164950c) {
                                                                cahw9.mo74035c();
                                                                cahw9.f164950c = z17;
                                                            }
                                                            cahz cahz7 = (cahz) cahw9.f164949b;
                                                            cahz7.f174617f = i18;
                                                            cahz7.f174612a |= 16;
                                                            throw new anfy(29504, "Could not find valid auth token for all requested accounts");
                                                        } catch (anfy e12) {
                                                            anfy anfy = e12;
                                                            try {
                                                                bnsl bnsl3 = (bnsl) f76966a.mo68388c();
                                                                bnsl3.mo68437a(anfy);
                                                                bnsl3.mo68432a(str13, str14, 552, str15);
                                                                bnsl3.mo68405a("SyncInBatch failed");
                                                                if (!cahw9.f164950c) {
                                                                    z24 = false;
                                                                } else {
                                                                    cahw9.mo74035c();
                                                                    z24 = false;
                                                                    cahw9.f164950c = false;
                                                                }
                                                                cahz cahz8 = (cahz) cahw9.f164949b;
                                                                cahz8.f174617f = 4;
                                                                cahz8.f174612a |= 16;
                                                                i25 = 2;
                                                                i27 = 2;
                                                                if ((((cahv) bxvd3.f164949b).f174602a & 2) == 0) {
                                                                    if (bxvd3.f164950c) {
                                                                        bxvd3.mo74035c();
                                                                        bxvd3.f164950c = z24;
                                                                    }
                                                                    cahv cahv10 = (cahv) bxvd3.f164949b;
                                                                    cahv cahv11 = cahv.f174600h;
                                                                    cahv10.f174604c = 1;
                                                                    cahv10.f174602a |= 2;
                                                                }
                                                                throw anfy;
                                                            } catch (RuntimeException e13) {
                                                                e = e13;
                                                                aniu6 = this;
                                                                i14 = i;
                                                                anit7 = anit8;
                                                                cahw10 = cahw9;
                                                                hashSet7 = hashSet2;
                                                                z21 = false;
                                                                i25 = 2;
                                                                i2 = 1;
                                                                i24 = i25;
                                                                z20 = z21;
                                                                strArr3 = strArr2;
                                                                i3 = i24;
                                                                z4 = z20;
                                                                anit = anit3;
                                                                bxvd = bxvd3;
                                                                z3 = z4;
                                                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                                }
                                                                throw e;
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                aniu7 = this;
                                                                i16 = i;
                                                                anit3 = anit8;
                                                                cahw11 = cahw9;
                                                                hashSet8 = hashSet2;
                                                                z23 = false;
                                                                i27 = 2;
                                                                i2 = 1;
                                                                i26 = i27;
                                                                z22 = z23;
                                                                strArr3 = strArr2;
                                                                i3 = i26;
                                                                z7 = z22;
                                                                anit = anit3;
                                                                bxvd = bxvd3;
                                                                z2 = z7;
                                                                int a32222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                                int a222222222222 = m64504a(anit);
                                                                if (bxvd.f164950c) {
                                                                }
                                                                cahv cahv52222222222 = (cahv) bxvd.f164949b;
                                                                cahv cahv222222222222 = cahv.f174600h;
                                                                cahv52222222222.f174604c = a222222222222 - 1;
                                                                cahv52222222222.f174602a |= i3;
                                                                bxvd b222222222222 = m64523b(anit);
                                                                if (bxvd.f164950c) {
                                                                }
                                                                cahv cahv322222222222 = (cahv) bxvd.f164949b;
                                                                caii caii22222222222 = (caii) b222222222222.mo74062i();
                                                                cahv cahv422222222222 = cahv.f174600h;
                                                                caii22222222222.getClass();
                                                                cahv322222222222.f174608g = caii22222222222;
                                                                cahv322222222222.f174602a |= 64;
                                                                cahw3.mo74649a(bxvd);
                                                                if (m64504a(anit) != i2) {
                                                                }
                                                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                                aniu.mo41842a(i4, hashSet);
                                                                int elapsedRealtime222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                                if (cahw3.f164950c) {
                                                                }
                                                                cahz cahz422222222222 = (cahz) cahw3.f164949b;
                                                                cahz422222222222.f174612a |= 32;
                                                                cahz422222222222.f174618g = elapsedRealtime222222222222;
                                                                throw th;
                                                            }
                                                        } catch (RuntimeException e14) {
                                                            e = e14;
                                                            aniu6 = this;
                                                            i14 = i;
                                                            anit7 = anit8;
                                                            cahw10 = cahw9;
                                                            hashSet7 = hashSet2;
                                                            z21 = false;
                                                            i2 = 1;
                                                            i24 = i25;
                                                            z20 = z21;
                                                            strArr3 = strArr2;
                                                            i3 = i24;
                                                            z4 = z20;
                                                            anit = anit3;
                                                            bxvd = bxvd3;
                                                            z3 = z4;
                                                            if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                            }
                                                            throw e;
                                                        } catch (Throwable th14) {
                                                            th = th14;
                                                            aniu7 = this;
                                                            i16 = i;
                                                            anit3 = anit8;
                                                            cahw11 = cahw9;
                                                            hashSet8 = hashSet2;
                                                            z23 = false;
                                                            i2 = 1;
                                                            i26 = i27;
                                                            z22 = z23;
                                                            strArr3 = strArr2;
                                                            i3 = i26;
                                                            z7 = z22;
                                                            anit = anit3;
                                                            bxvd = bxvd3;
                                                            z2 = z7;
                                                            int a322222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                            int a2222222222222 = m64504a(anit);
                                                            if (bxvd.f164950c) {
                                                            }
                                                            cahv cahv522222222222 = (cahv) bxvd.f164949b;
                                                            cahv cahv2222222222222 = cahv.f174600h;
                                                            cahv522222222222.f174604c = a2222222222222 - 1;
                                                            cahv522222222222.f174602a |= i3;
                                                            bxvd b2222222222222 = m64523b(anit);
                                                            if (bxvd.f164950c) {
                                                            }
                                                            cahv cahv3222222222222 = (cahv) bxvd.f164949b;
                                                            caii caii222222222222 = (caii) b2222222222222.mo74062i();
                                                            cahv cahv4222222222222 = cahv.f174600h;
                                                            caii222222222222.getClass();
                                                            cahv3222222222222.f174608g = caii222222222222;
                                                            cahv3222222222222.f174602a |= 64;
                                                            cahw3.mo74649a(bxvd);
                                                            if (m64504a(anit) != i2) {
                                                            }
                                                            aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                            aniu.mo41842a(i4, hashSet);
                                                            int elapsedRealtime2222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                            if (cahw3.f164950c) {
                                                            }
                                                            cahz cahz4222222222222 = (cahz) cahw3.f164949b;
                                                            cahz4222222222222.f174612a |= 32;
                                                            cahz4222222222222.f174618g = elapsedRealtime2222222222222;
                                                            throw th;
                                                        }
                                                    } else {
                                                        str3 = "aniu";
                                                        str4 = str12;
                                                        str2 = str11;
                                                        anit8 = anit2;
                                                        i17 = i33;
                                                        z16 = z10;
                                                        cahw9 = cahw5;
                                                        i3 = 2;
                                                        c = 4;
                                                        bxvd10 = bxvd2;
                                                    }
                                                } catch (RuntimeException e15) {
                                                    e = e15;
                                                    bxvd4 = bxvd2;
                                                    aniu2 = this;
                                                    i6 = i;
                                                    strArr4 = strArr2;
                                                    anit4 = anit2;
                                                    hashSet3 = hashSet2;
                                                    cahw4 = cahw5;
                                                    z5 = false;
                                                    i5 = 2;
                                                    i2 = 1;
                                                    z4 = z5;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z3 = z4;
                                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                    }
                                                    throw e;
                                                } catch (Throwable th15) {
                                                    th = th15;
                                                    bxvd3 = bxvd2;
                                                    aniu = this;
                                                    i4 = i;
                                                    strArr3 = strArr2;
                                                    anit5 = anit2;
                                                    hashSet = hashSet2;
                                                    cahw3 = cahw5;
                                                    z8 = false;
                                                    i7 = 2;
                                                    i2 = 1;
                                                    z7 = z8;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z2 = z7;
                                                    int a3222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                    int a22222222222222 = m64504a(anit);
                                                    if (bxvd.f164950c) {
                                                    }
                                                    cahv cahv5222222222222 = (cahv) bxvd.f164949b;
                                                    cahv cahv22222222222222 = cahv.f174600h;
                                                    cahv5222222222222.f174604c = a22222222222222 - 1;
                                                    cahv5222222222222.f174602a |= i3;
                                                    bxvd b22222222222222 = m64523b(anit);
                                                    if (bxvd.f164950c) {
                                                    }
                                                    cahv cahv32222222222222 = (cahv) bxvd.f164949b;
                                                    caii caii2222222222222 = (caii) b22222222222222.mo74062i();
                                                    cahv cahv42222222222222 = cahv.f174600h;
                                                    caii2222222222222.getClass();
                                                    cahv32222222222222.f174608g = caii2222222222222;
                                                    cahv32222222222222.f174602a |= 64;
                                                    cahw3.mo74649a(bxvd);
                                                    if (m64504a(anit) != i2) {
                                                    }
                                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                    aniu.mo41842a(i4, hashSet);
                                                    int elapsedRealtime22222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                    if (cahw3.f164950c) {
                                                    }
                                                    cahz cahz42222222222222 = (cahz) cahw3.f164949b;
                                                    cahz42222222222222.f174612a |= 32;
                                                    cahz42222222222222.f174618g = elapsedRealtime22222222222222;
                                                    throw th;
                                                }
                                            } else {
                                                str3 = "aniu";
                                                str4 = str12;
                                                str2 = str11;
                                                anit8 = anit2;
                                                i17 = i33;
                                                z16 = z10;
                                                cahw9 = cahw5;
                                                i3 = 2;
                                                c = 4;
                                                bxvd10 = bxvd2;
                                            }
                                            String[] strArr10 = strArr2;
                                            try {
                                                int length5 = strArr10.length;
                                                int i34 = 0;
                                                while (true) {
                                                    if (i34 >= length5) {
                                                        str5 = null;
                                                        break;
                                                    }
                                                    try {
                                                        String str16 = strArr10[i34];
                                                        if (!"".equals(str16)) {
                                                            str5 = str16;
                                                            break;
                                                        }
                                                        i34++;
                                                    } catch (RuntimeException e16) {
                                                        e = e16;
                                                        aniu = this;
                                                        i4 = i;
                                                        anit3 = anit8;
                                                        cahw3 = cahw9;
                                                        hashSet = hashSet2;
                                                        i2 = 1;
                                                        strArr3 = strArr10;
                                                        z4 = false;
                                                        i3 = i3;
                                                        anit = anit3;
                                                        bxvd = bxvd3;
                                                        z3 = z4;
                                                        if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                        }
                                                        throw e;
                                                    } catch (Throwable th16) {
                                                        th = th16;
                                                        aniu = this;
                                                        i4 = i;
                                                        anit3 = anit8;
                                                        cahw3 = cahw9;
                                                        hashSet = hashSet2;
                                                        i2 = 1;
                                                        strArr3 = strArr10;
                                                        z7 = false;
                                                        i3 = i3;
                                                        anit = anit3;
                                                        bxvd = bxvd3;
                                                        z2 = z7;
                                                        int a32222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                        int a222222222222222 = m64504a(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv52222222222222 = (cahv) bxvd.f164949b;
                                                        cahv cahv222222222222222 = cahv.f174600h;
                                                        cahv52222222222222.f174604c = a222222222222222 - 1;
                                                        cahv52222222222222.f174602a |= i3;
                                                        bxvd b222222222222222 = m64523b(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv322222222222222 = (cahv) bxvd.f164949b;
                                                        caii caii22222222222222 = (caii) b222222222222222.mo74062i();
                                                        cahv cahv422222222222222 = cahv.f174600h;
                                                        caii22222222222222.getClass();
                                                        cahv322222222222222.f174608g = caii22222222222222;
                                                        cahv322222222222222.f174602a |= 64;
                                                        cahw3.mo74649a(bxvd);
                                                        if (m64504a(anit) != i2) {
                                                        }
                                                        aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                        aniu.mo41842a(i4, hashSet);
                                                        int elapsedRealtime222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                        if (cahw3.f164950c) {
                                                        }
                                                        cahz cahz422222222222222 = (cahz) cahw3.f164949b;
                                                        cahz422222222222222.f174612a |= 32;
                                                        cahz422222222222222.f174618g = elapsedRealtime222222222222222;
                                                        throw th;
                                                    }
                                                }
                                                anfy anfy2 = null;
                                                char c4 = c;
                                                for (String str17 : arrayList3) {
                                                    try {
                                                        if (bxvd3 == null) {
                                                            bxvd8 = cahv.f174600h.mo74144da();
                                                        } else {
                                                            bxvd8 = bxvd3;
                                                        }
                                                        try {
                                                            bxvd bxvd12 = bxvd8;
                                                            String str18 = str;
                                                            bxvd bxvd13 = bxvd12;
                                                            anit10 = anit8;
                                                            str6 = str3;
                                                            str7 = str4;
                                                            try {
                                                                m64521a((Set) hashSet2, Collections.singletonList(str17), str5, i, str18, z26, bxvd13, anit10, linkedHashMap, false);
                                                                if (bxvd3 == null) {
                                                                    cahw9.mo74649a(bxvd12);
                                                                }
                                                                strArr10 = strArr2;
                                                                str8 = str7;
                                                                str9 = str6;
                                                                i23 = 2;
                                                                c4 = 4;
                                                            } catch (anfy e17) {
                                                                e = e17;
                                                                bxvd9 = bxvd12;
                                                                strArr10 = str18;
                                                                i3 = bxvd13;
                                                                try {
                                                                    bnsl bnsl4 = (bnsl) f76966a.mo68388c();
                                                                    bnsl4.mo68437a(e);
                                                                    String str19 = str6;
                                                                    bnsl4.mo68432a(str19, str7, 597, str2);
                                                                    bnsl4.mo68405a("Sync failed");
                                                                    if (cahw9.f164950c) {
                                                                    }
                                                                    cahz cahz9 = (cahz) cahw9.f164949b;
                                                                } catch (Throwable th17) {
                                                                    th = th17;
                                                                    if (bxvd3 == null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                                try {
                                                                    cahz9.f174617f = 4;
                                                                    cahz9.f174612a |= 16;
                                                                    i23 = 2;
                                                                    i3 = 2;
                                                                    i3 = 2;
                                                                    if ((((cahv) bxvd9.f164949b).f174602a & 2) != 0) {
                                                                    }
                                                                    if (bxvd3 == null) {
                                                                    }
                                                                    strArr10 = strArr2;
                                                                    anfy2 = e;
                                                                    str8 = str7;
                                                                    c4 = 4;
                                                                    str9 = str19;
                                                                } catch (Throwable th18) {
                                                                    th = th18;
                                                                    if (bxvd3 == null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th19) {
                                                                th = th19;
                                                                bxvd9 = bxvd12;
                                                                if (bxvd3 == null) {
                                                                }
                                                                throw th;
                                                            }
                                                        } catch (anfy e18) {
                                                            e = e18;
                                                            bxvd9 = bxvd8;
                                                            str6 = str3;
                                                            str7 = str4;
                                                            anit10 = c4;
                                                            bnsl bnsl42 = (bnsl) f76966a.mo68388c();
                                                            bnsl42.mo68437a(e);
                                                            String str192 = str6;
                                                            bnsl42.mo68432a(str192, str7, 597, str2);
                                                            bnsl42.mo68405a("Sync failed");
                                                            if (cahw9.f164950c) {
                                                                r6 = 0;
                                                            } else {
                                                                cahw9.mo74035c();
                                                                r6 = 0;
                                                                r6 = 0;
                                                                r6 = 0;
                                                                try {
                                                                    cahw9.f164950c = false;
                                                                } catch (Throwable th20) {
                                                                    th = th20;
                                                                    if (bxvd3 == null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            cahz cahz92 = (cahz) cahw9.f164949b;
                                                            cahz92.f174617f = 4;
                                                            cahz92.f174612a |= 16;
                                                            i23 = 2;
                                                            i3 = 2;
                                                            i3 = 2;
                                                            if ((((cahv) bxvd9.f164949b).f174602a & 2) != 0) {
                                                                try {
                                                                    if (bxvd9.f164950c) {
                                                                        bxvd9.mo74035c();
                                                                        bxvd9.f164950c = r6;
                                                                    }
                                                                    cahv cahv12 = (cahv) bxvd9.f164949b;
                                                                    cahv cahv13 = cahv.f174600h;
                                                                    r9 = 1;
                                                                    try {
                                                                        cahv12.f174604c = 1;
                                                                        cahv12.f174602a |= 2;
                                                                    } catch (Throwable th21) {
                                                                        th = th21;
                                                                    }
                                                                } catch (Throwable th22) {
                                                                    th = th22;
                                                                    if (bxvd3 == null) {
                                                                    }
                                                                    throw th;
                                                                }
                                                            } else {
                                                                r9 = 1;
                                                            }
                                                            if (bxvd3 == null) {
                                                                try {
                                                                    cahw9.mo74649a(bxvd9);
                                                                } catch (RuntimeException e19) {
                                                                    e = e19;
                                                                    i2 = anit10;
                                                                    i3 = i3;
                                                                    z18 = r6;
                                                                    aniu8 = this;
                                                                    i19 = i;
                                                                    anit9 = anit8;
                                                                    i13 = i3;
                                                                    z14 = z18;
                                                                    cahw10 = cahw9;
                                                                    hashSet7 = hashSet2;
                                                                    i24 = i13;
                                                                    z20 = z14;
                                                                    strArr3 = strArr2;
                                                                    i3 = i24;
                                                                    z4 = z20;
                                                                    anit = anit3;
                                                                    bxvd = bxvd3;
                                                                    z3 = z4;
                                                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                                    }
                                                                    throw e;
                                                                } catch (Throwable th23) {
                                                                    th = th23;
                                                                    i22 = anit10;
                                                                    i3 = i3;
                                                                    z19 = r6;
                                                                    aniu9 = this;
                                                                    i20 = i;
                                                                    anit9 = anit8;
                                                                    i2 = i22;
                                                                    i15 = i3;
                                                                    z15 = z19;
                                                                    cahw11 = cahw9;
                                                                    hashSet8 = hashSet2;
                                                                    i26 = i15;
                                                                    z22 = z15;
                                                                    strArr3 = strArr2;
                                                                    i3 = i26;
                                                                    z7 = z22;
                                                                    anit = anit3;
                                                                    bxvd = bxvd3;
                                                                    z2 = z7;
                                                                    int a322222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                                    int a2222222222222222 = m64504a(anit);
                                                                    if (bxvd.f164950c) {
                                                                    }
                                                                    cahv cahv522222222222222 = (cahv) bxvd.f164949b;
                                                                    cahv cahv2222222222222222 = cahv.f174600h;
                                                                    cahv522222222222222.f174604c = a2222222222222222 - 1;
                                                                    cahv522222222222222.f174602a |= i3;
                                                                    bxvd b2222222222222222 = m64523b(anit);
                                                                    if (bxvd.f164950c) {
                                                                    }
                                                                    cahv cahv3222222222222222 = (cahv) bxvd.f164949b;
                                                                    caii caii222222222222222 = (caii) b2222222222222222.mo74062i();
                                                                    cahv cahv4222222222222222 = cahv.f174600h;
                                                                    caii222222222222222.getClass();
                                                                    cahv3222222222222222.f174608g = caii222222222222222;
                                                                    cahv3222222222222222.f174602a |= 64;
                                                                    cahw3.mo74649a(bxvd);
                                                                    if (m64504a(anit) != i2) {
                                                                    }
                                                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                                    aniu.mo41842a(i4, hashSet);
                                                                    int elapsedRealtime2222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                                    if (cahw3.f164950c) {
                                                                    }
                                                                    cahz cahz4222222222222222 = (cahz) cahw3.f164949b;
                                                                    cahz4222222222222222.f174612a |= 32;
                                                                    cahz4222222222222222.f174618g = elapsedRealtime2222222222222222;
                                                                    throw th;
                                                                }
                                                            }
                                                            strArr10 = strArr2;
                                                            anfy2 = e;
                                                            str8 = str7;
                                                            c4 = 4;
                                                            str9 = str192;
                                                        } catch (Throwable th24) {
                                                            th = th24;
                                                            bxvd9 = bxvd8;
                                                            if (bxvd3 == null) {
                                                                cahw9.mo74649a(bxvd9);
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (RuntimeException e20) {
                                                        e = e20;
                                                        z18 = false;
                                                        i2 = 1;
                                                        aniu8 = this;
                                                        i19 = i;
                                                        anit9 = anit8;
                                                        i13 = i3;
                                                        z14 = z18;
                                                        cahw10 = cahw9;
                                                        hashSet7 = hashSet2;
                                                        i24 = i13;
                                                        z20 = z14;
                                                        strArr3 = strArr2;
                                                        i3 = i24;
                                                        z4 = z20;
                                                        anit = anit3;
                                                        bxvd = bxvd3;
                                                        z3 = z4;
                                                        if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                        }
                                                        throw e;
                                                    } catch (Throwable th25) {
                                                        th = th25;
                                                        z19 = false;
                                                        i22 = 1;
                                                        aniu9 = this;
                                                        i20 = i;
                                                        anit9 = anit8;
                                                        i2 = i22;
                                                        i15 = i3;
                                                        z15 = z19;
                                                        cahw11 = cahw9;
                                                        hashSet8 = hashSet2;
                                                        i26 = i15;
                                                        z22 = z15;
                                                        strArr3 = strArr2;
                                                        i3 = i26;
                                                        z7 = z22;
                                                        anit = anit3;
                                                        bxvd = bxvd3;
                                                        z2 = z7;
                                                        int a3222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                        int a22222222222222222 = m64504a(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv5222222222222222 = (cahv) bxvd.f164949b;
                                                        cahv cahv22222222222222222 = cahv.f174600h;
                                                        cahv5222222222222222.f174604c = a22222222222222222 - 1;
                                                        cahv5222222222222222.f174602a |= i3;
                                                        bxvd b22222222222222222 = m64523b(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv32222222222222222 = (cahv) bxvd.f164949b;
                                                        caii caii2222222222222222 = (caii) b22222222222222222.mo74062i();
                                                        cahv cahv42222222222222222 = cahv.f174600h;
                                                        caii2222222222222222.getClass();
                                                        cahv32222222222222222.f174608g = caii2222222222222222;
                                                        cahv32222222222222222.f174602a |= 64;
                                                        cahw3.mo74649a(bxvd);
                                                        if (m64504a(anit) != i2) {
                                                        }
                                                        aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                        aniu.mo41842a(i4, hashSet);
                                                        int elapsedRealtime22222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                        if (cahw3.f164950c) {
                                                        }
                                                        cahz cahz42222222222222222 = (cahz) cahw3.f164949b;
                                                        cahz42222222222222222.f174612a |= 32;
                                                        cahz42222222222222222.f174618g = elapsedRealtime22222222222222222;
                                                        throw th;
                                                    }
                                                }
                                                z17 = false;
                                                z7 = false;
                                                z4 = false;
                                                i18 = 4;
                                                i21 = 1;
                                                i2 = 1;
                                                i2 = 1;
                                                if (anfy2 != null) {
                                                    aniu = this;
                                                    int i35 = i;
                                                    anit3 = anit8;
                                                    cahw cahw13 = cahw9;
                                                    HashSet hashSet10 = hashSet2;
                                                    strArr3 = strArr2;
                                                    try {
                                                        throw anfy2;
                                                    } catch (RuntimeException e21) {
                                                        e = e21;
                                                        cahw3 = cahw13;
                                                        i4 = i35;
                                                        hashSet = hashSet10;
                                                    } catch (Throwable th26) {
                                                        th = th26;
                                                        cahw3 = cahw13;
                                                        i4 = i35;
                                                        hashSet = hashSet10;
                                                        anit = anit3;
                                                        bxvd = bxvd3;
                                                        z2 = z7;
                                                        int a32222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                        int a222222222222222222 = m64504a(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv52222222222222222 = (cahv) bxvd.f164949b;
                                                        cahv cahv222222222222222222 = cahv.f174600h;
                                                        cahv52222222222222222.f174604c = a222222222222222222 - 1;
                                                        cahv52222222222222222.f174602a |= i3;
                                                        bxvd b222222222222222222 = m64523b(anit);
                                                        if (bxvd.f164950c) {
                                                        }
                                                        cahv cahv322222222222222222 = (cahv) bxvd.f164949b;
                                                        caii caii22222222222222222 = (caii) b222222222222222222.mo74062i();
                                                        cahv cahv422222222222222222 = cahv.f174600h;
                                                        caii22222222222222222.getClass();
                                                        cahv322222222222222222.f174608g = caii22222222222222222;
                                                        cahv322222222222222222.f174602a |= 64;
                                                        cahw3.mo74649a(bxvd);
                                                        if (m64504a(anit) != i2) {
                                                        }
                                                        aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                        aniu.mo41842a(i4, hashSet);
                                                        int elapsedRealtime222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                        if (cahw3.f164950c) {
                                                        }
                                                        cahz cahz422222222222222222 = (cahz) cahw3.f164949b;
                                                        cahz422222222222222222.f174612a |= 32;
                                                        cahz422222222222222222.f174618g = elapsedRealtime222222222222222222;
                                                        throw th;
                                                    }
                                                }
                                                if (i17 > 0) {
                                                }
                                                if (!cahw9.f164950c) {
                                                }
                                                cahz cahz72 = (cahz) cahw9.f164949b;
                                                cahz72.f174617f = i18;
                                                cahz72.f174612a |= 16;
                                                throw new anfy(29504, "Could not find valid auth token for all requested accounts");
                                            } catch (RuntimeException e22) {
                                                e = e22;
                                                aniu = this;
                                                anit3 = anit8;
                                                i2 = 1;
                                                strArr3 = strArr10;
                                                z4 = false;
                                                cahw3 = cahw9;
                                                hashSet = hashSet2;
                                                i4 = i;
                                                anit = anit3;
                                                bxvd = bxvd3;
                                                z3 = z4;
                                                if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                }
                                                throw e;
                                            } catch (Throwable th27) {
                                                th = th27;
                                                aniu = this;
                                                anit3 = anit8;
                                                i2 = 1;
                                                strArr3 = strArr10;
                                                z7 = false;
                                                cahw3 = cahw9;
                                                hashSet = hashSet2;
                                                i4 = i;
                                                anit = anit3;
                                                bxvd = bxvd3;
                                                z2 = z7;
                                                int a322222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                int a2222222222222222222 = m64504a(anit);
                                                if (bxvd.f164950c) {
                                                }
                                                cahv cahv522222222222222222 = (cahv) bxvd.f164949b;
                                                cahv cahv2222222222222222222 = cahv.f174600h;
                                                cahv522222222222222222.f174604c = a2222222222222222222 - 1;
                                                cahv522222222222222222.f174602a |= i3;
                                                bxvd b2222222222222222222 = m64523b(anit);
                                                if (bxvd.f164950c) {
                                                }
                                                cahv cahv3222222222222222222 = (cahv) bxvd.f164949b;
                                                caii caii222222222222222222 = (caii) b2222222222222222222.mo74062i();
                                                cahv cahv4222222222222222222 = cahv.f174600h;
                                                caii222222222222222222.getClass();
                                                cahv3222222222222222222.f174608g = caii222222222222222222;
                                                cahv3222222222222222222.f174602a |= 64;
                                                cahw3.mo74649a(bxvd);
                                                if (m64504a(anit) != i2) {
                                                }
                                                aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                aniu.mo41842a(i4, hashSet);
                                                int elapsedRealtime2222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                if (cahw3.f164950c) {
                                                }
                                                cahz cahz4222222222222222222 = (cahz) cahw3.f164949b;
                                                cahz4222222222222222222.f174612a |= 32;
                                                cahz4222222222222222222.f174618g = elapsedRealtime2222222222222222222;
                                                throw th;
                                            }
                                        } else {
                                            anit2 = anit2;
                                            aniu10 = aniu10;
                                            str12 = str12;
                                            str11 = str11;
                                            bxvd2 = bxvd2;
                                            i33 = i33;
                                        }
                                    } catch (Throwable th28) {
                                        bxvd7 = bxvd2;
                                        aniu5 = aniu10;
                                        cahw8 = cahw5;
                                        z13 = false;
                                        i11 = 2;
                                        strArr7 = strArr2;
                                        anit6 = anit2;
                                        i12 = 1;
                                        i10 = i;
                                        th = th28;
                                        hashSet6 = hashSet2;
                                        if (query != null) {
                                            try {
                                                query.close();
                                            } catch (Throwable th29) {
                                                try {
                                                    bqye.m113761a(th, th29);
                                                } catch (RuntimeException e23) {
                                                    e = e23;
                                                    z4 = z13;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z3 = z4;
                                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                                        if (cahw3.f164950c) {
                                                            cahw3.mo74035c();
                                                            cahw3.f164950c = z3;
                                                        }
                                                        cahz cahz10 = (cahz) cahw3.f164949b;
                                                        cahz10.f174617f = 3;
                                                        cahz10.f174612a |= 16;
                                                    }
                                                    throw e;
                                                } catch (Throwable th30) {
                                                    th = th30;
                                                    z7 = z13;
                                                    anit = anit3;
                                                    bxvd = bxvd3;
                                                    z2 = z7;
                                                    if (!(bxvd == null || anit == null)) {
                                                        int a3222222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                                        if (a3222222222222222222 == 0 || a3222222222222222222 == i2) {
                                                            int a22222222222222222222 = m64504a(anit);
                                                            if (bxvd.f164950c) {
                                                                bxvd.mo74035c();
                                                                bxvd.f164950c = z2;
                                                            }
                                                            cahv cahv5222222222222222222 = (cahv) bxvd.f164949b;
                                                            cahv cahv22222222222222222222 = cahv.f174600h;
                                                            cahv5222222222222222222.f174604c = a22222222222222222222 - 1;
                                                            cahv5222222222222222222.f174602a |= i3;
                                                        }
                                                        bxvd b22222222222222222222 = m64523b(anit);
                                                        if (bxvd.f164950c) {
                                                            bxvd.mo74035c();
                                                            bxvd.f164950c = z2;
                                                        }
                                                        cahv cahv32222222222222222222 = (cahv) bxvd.f164949b;
                                                        caii caii2222222222222222222 = (caii) b22222222222222222222.mo74062i();
                                                        cahv cahv42222222222222222222 = cahv.f174600h;
                                                        caii2222222222222222222.getClass();
                                                        cahv32222222222222222222.f174608g = caii2222222222222222222;
                                                        cahv32222222222222222222.f174602a |= 64;
                                                        cahw3.mo74649a(bxvd);
                                                        if (m64504a(anit) != i2) {
                                                            if (cahw3.f164950c) {
                                                                cahw3.mo74035c();
                                                                cahw3.f164950c = z2;
                                                            }
                                                            cahz cahz11 = (cahz) cahw3.f164949b;
                                                            cahz11.f174617f = 4;
                                                            cahz11.f174612a |= 16;
                                                        }
                                                    }
                                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                                    aniu.mo41842a(i4, hashSet);
                                                    int elapsedRealtime22222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                                    if (cahw3.f164950c) {
                                                        cahw3.mo74035c();
                                                        cahw3.f164950c = z2;
                                                    }
                                                    cahz cahz42222222222222222222 = (cahz) cahw3.f164949b;
                                                    cahz42222222222222222222.f174612a |= 32;
                                                    cahz42222222222222222222.f174618g = elapsedRealtime22222222222222222222;
                                                    throw th;
                                                }
                                            }
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th31) {
                                    i10 = i;
                                    bxvd7 = bxvd2;
                                    aniu5 = aniu10;
                                    hashSet6 = hashSet2;
                                    cahw8 = cahw5;
                                    z13 = false;
                                    i11 = 2;
                                    strArr7 = strArr2;
                                    anit6 = anit2;
                                    i12 = 1;
                                    th = th31;
                                    if (query != null) {
                                    }
                                    throw th;
                                }
                            }
                            bxvd3 = bxvd2;
                            aniu = aniu10;
                            HashSet hashSet11 = hashSet2;
                            cahw3 = cahw5;
                            z4 = false;
                            z7 = false;
                            i3 = 2;
                            i3 = 2;
                            strArr3 = strArr2;
                            anit3 = anit2;
                            i2 = 1;
                            i2 = 1;
                            if (query != null) {
                                try {
                                    query.close();
                                } catch (RuntimeException e24) {
                                    e = e24;
                                    i4 = i;
                                    hashSet = hashSet11;
                                    anit = anit3;
                                    bxvd = bxvd3;
                                    z3 = z4;
                                    if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                                    }
                                    throw e;
                                } catch (Throwable th32) {
                                    th = th32;
                                    i4 = i;
                                    hashSet = hashSet11;
                                    anit = anit3;
                                    bxvd = bxvd3;
                                    z2 = z7;
                                    int a32222222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                                    int a222222222222222222222 = m64504a(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv52222222222222222222 = (cahv) bxvd.f164949b;
                                    cahv cahv222222222222222222222 = cahv.f174600h;
                                    cahv52222222222222222222.f174604c = a222222222222222222222 - 1;
                                    cahv52222222222222222222.f174602a |= i3;
                                    bxvd b222222222222222222222 = m64523b(anit);
                                    if (bxvd.f164950c) {
                                    }
                                    cahv cahv322222222222222222222 = (cahv) bxvd.f164949b;
                                    caii caii22222222222222222222 = (caii) b222222222222222222222.mo74062i();
                                    cahv cahv422222222222222222222 = cahv.f174600h;
                                    caii22222222222222222222.getClass();
                                    cahv322222222222222222222.f174608g = caii22222222222222222222;
                                    cahv322222222222222222222.f174602a |= 64;
                                    cahw3.mo74649a(bxvd);
                                    if (m64504a(anit) != i2) {
                                    }
                                    aniu.mo41853a(i4, new anis(aniu, strArr3));
                                    aniu.mo41842a(i4, hashSet);
                                    int elapsedRealtime222222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                                    if (cahw3.f164950c) {
                                    }
                                    cahz cahz422222222222222222222 = (cahz) cahw3.f164949b;
                                    cahz422222222222222222222.f174612a |= 32;
                                    cahz422222222222222222222.f174618g = elapsedRealtime222222222222222222222;
                                    throw th;
                                }
                            }
                            if (cahw3.f164950c) {
                                cahw3.mo74035c();
                                cahw3.f164950c = false;
                            }
                            cahz cahz12 = (cahz) cahw3.f164949b;
                            cahz12.f174617f = 2;
                            cahz12.f174612a |= 16;
                            if (bxvd3 != null) {
                                int a6 = cahu.m126649a(((cahv) bxvd3.f164949b).f174604c);
                                if (a6 == 0 || a6 == 1) {
                                    int a7 = m64504a(anit3);
                                    if (bxvd3.f164950c) {
                                        bxvd3.mo74035c();
                                        bxvd3.f164950c = false;
                                    }
                                    cahv cahv14 = (cahv) bxvd3.f164949b;
                                    cahv cahv15 = cahv.f174600h;
                                    cahv14.f174604c = a7 - 1;
                                    cahv14.f174602a |= 2;
                                }
                                bxvd b4 = m64523b(anit3);
                                if (bxvd3.f164950c) {
                                    bxvd3.mo74035c();
                                    bxvd3.f164950c = false;
                                }
                                cahv cahv16 = (cahv) bxvd3.f164949b;
                                caii caii4 = (caii) b4.mo74062i();
                                cahv cahv17 = cahv.f174600h;
                                caii4.getClass();
                                cahv16.f174608g = caii4;
                                cahv16.f174602a |= 64;
                                cahw3.mo74649a(bxvd3);
                                if (m64504a(anit3) != 1) {
                                    if (cahw3.f164950c) {
                                        cahw3.mo74035c();
                                        cahw3.f164950c = false;
                                    }
                                    cahz cahz13 = (cahz) cahw3.f164949b;
                                    cahz13.f174617f = 4;
                                    cahz13.f174612a |= 16;
                                }
                            }
                            aniu.mo41853a(i, new aniq(aniu, strArr3));
                            aniu.mo41842a(i, hashSet11);
                            int elapsedRealtime4 = (int) (SystemClock.elapsedRealtime() - j);
                            if (cahw3.f164950c) {
                                cahw3.mo74035c();
                                cahw3.f164950c = false;
                            }
                            cahz cahz14 = (cahz) cahw3.f164949b;
                            cahz14.f174612a |= 32;
                            cahz14.f174618g = elapsedRealtime4;
                        } catch (RuntimeException e25) {
                            e = e25;
                            i8 = i;
                            bxvd5 = bxvd2;
                            aniu3 = aniu10;
                            hashSet4 = hashSet2;
                            cahw6 = cahw5;
                            i5 = 2;
                            strArr4 = strArr2;
                            z6 = z11;
                            anit4 = anit2;
                            z5 = z6;
                            i2 = 1;
                            z4 = z5;
                            anit = anit3;
                            bxvd = bxvd3;
                            z3 = z4;
                            if ((((cahz) cahw3.f164949b).f174612a & 16) == 0) {
                            }
                            throw e;
                        } catch (Throwable th33) {
                            th = th33;
                            i9 = i;
                            bxvd6 = bxvd2;
                            aniu4 = aniu10;
                            hashSet5 = hashSet2;
                            cahw7 = cahw5;
                            i7 = 2;
                            strArr3 = strArr2;
                            z9 = z12;
                            anit5 = anit2;
                            z8 = z9;
                            i2 = 1;
                            z7 = z8;
                            anit = anit3;
                            bxvd = bxvd3;
                            z2 = z7;
                            int a322222222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                            int a2222222222222222222222 = m64504a(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv522222222222222222222 = (cahv) bxvd.f164949b;
                            cahv cahv2222222222222222222222 = cahv.f174600h;
                            cahv522222222222222222222.f174604c = a2222222222222222222222 - 1;
                            cahv522222222222222222222.f174602a |= i3;
                            bxvd b2222222222222222222222 = m64523b(anit);
                            if (bxvd.f164950c) {
                            }
                            cahv cahv3222222222222222222222 = (cahv) bxvd.f164949b;
                            caii caii222222222222222222222 = (caii) b2222222222222222222222.mo74062i();
                            cahv cahv4222222222222222222222 = cahv.f174600h;
                            caii222222222222222222222.getClass();
                            cahv3222222222222222222222.f174608g = caii222222222222222222222;
                            cahv3222222222222222222222.f174602a |= 64;
                            cahw3.mo74649a(bxvd);
                            if (m64504a(anit) != i2) {
                            }
                            aniu.mo41853a(i4, new anis(aniu, strArr3));
                            aniu.mo41842a(i4, hashSet);
                            int elapsedRealtime2222222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                            if (cahw3.f164950c) {
                            }
                            cahz cahz4222222222222222222222 = (cahz) cahw3.f164949b;
                            cahz4222222222222222222222.f174612a |= 32;
                            cahz4222222222222222222222.f174618g = elapsedRealtime2222222222222222222222;
                            throw th;
                        }
                    } catch (RuntimeException e26) {
                        e = e26;
                        cahw4 = cahw2;
                        aniu2 = aniu10;
                        i6 = i28;
                        strArr4 = strArr9;
                        j = elapsedRealtime;
                        hashSet3 = hashSet2;
                        z6 = false;
                        i5 = 2;
                        bxvd4 = bxvd2;
                    } catch (Throwable th34) {
                        th = th34;
                        cahw3 = cahw2;
                        aniu = aniu10;
                        i4 = i28;
                        strArr3 = strArr9;
                        j = elapsedRealtime;
                        hashSet = hashSet2;
                        z9 = false;
                        i7 = 2;
                        bxvd3 = bxvd2;
                        anit5 = anit2;
                        z8 = z9;
                        i2 = 1;
                        z7 = z8;
                        anit = anit3;
                        bxvd = bxvd3;
                        z2 = z7;
                        int a3222222222222222222222 = cahu.m126649a(((cahv) bxvd.f164949b).f174604c);
                        int a22222222222222222222222 = m64504a(anit);
                        if (bxvd.f164950c) {
                        }
                        cahv cahv5222222222222222222222 = (cahv) bxvd.f164949b;
                        cahv cahv22222222222222222222222 = cahv.f174600h;
                        cahv5222222222222222222222.f174604c = a22222222222222222222222 - 1;
                        cahv5222222222222222222222.f174602a |= i3;
                        bxvd b22222222222222222222222 = m64523b(anit);
                        if (bxvd.f164950c) {
                        }
                        cahv cahv32222222222222222222222 = (cahv) bxvd.f164949b;
                        caii caii2222222222222222222222 = (caii) b22222222222222222222222.mo74062i();
                        cahv cahv42222222222222222222222 = cahv.f174600h;
                        caii2222222222222222222222.getClass();
                        cahv32222222222222222222222.f174608g = caii2222222222222222222222;
                        cahv32222222222222222222222.f174602a |= 64;
                        cahw3.mo74649a(bxvd);
                        if (m64504a(anit) != i2) {
                        }
                        aniu.mo41853a(i4, new anis(aniu, strArr3));
                        aniu.mo41842a(i4, hashSet);
                        int elapsedRealtime22222222222222222222222 = (int) (SystemClock.elapsedRealtime() - j);
                        if (cahw3.f164950c) {
                        }
                        cahz cahz42222222222222222222222 = (cahz) cahw3.f164949b;
                        cahz42222222222222222222222.f174612a |= 32;
                        cahz42222222222222222222222.f174618g = elapsedRealtime22222222222222222222222;
                        throw th;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        } else {
            throw new UnsupportedOperationException("not implemented yet");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String[] mo41856a(String[] strArr) {
        int length = strArr.length;
        if (((long) length) <= cgec.m144830e()) {
            return strArr;
        }
        bnsl bnsl = (bnsl) f76966a.mo68390d();
        bnsl.mo68432a("aniu", "a", 745, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68412a("users truncated from %d to %d", length, cgec.m144830e());
        return (String[]) Arrays.copyOf(strArr, (int) cgec.m144830e());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final String[] mo41857a(String[] strArr, LinkedHashMap linkedHashMap, anit anit) {
        if (linkedHashMap == null) {
            return strArr;
        }
        Set linkedHashSet = cgdb.f186584a.mo6606a().mo83507b() ? new LinkedHashSet(Arrays.asList(strArr)) : new HashSet(Arrays.asList(strArr));
        linkedHashSet.retainAll(linkedHashMap.keySet());
        bnsl bnsl = (bnsl) f76966a.mo68390d();
        bnsl.mo68432a("aniu", "a", 735, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        int length = strArr.length;
        bnsl.mo68409a("Removed %d invalid users", length - linkedHashSet.size());
        anit.f76962d = length;
        anit.f76964f = linkedHashSet.size();
        return (String[]) linkedHashSet.toArray(new String[0]);
    }
}
