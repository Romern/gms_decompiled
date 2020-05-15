package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: anhb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anhb {

    /* renamed from: a */
    public String f76844a;

    /* renamed from: b */
    public final String f76845b;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    public anhb(String str, String str2) {
        this.f76844a = str;
        this.f76845b = str2;
    }

    /* renamed from: a */
    public static boolean m64373a(SQLiteDatabase sQLiteDatabase, String str) {
        boolean z = true;
        Cursor query = sQLiteDatabase.query("Packages", new String[]{"packageName"}, "packageName = ?", new String[]{str}, null, null, null);
        try {
            if (query.getCount() == 0) {
                z = false;
            }
            if (query != null) {
                query.close();
            }
            return z;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean
     arg types: [android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, int]
     candidates:
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, long, java.lang.String, boolean):android.database.Cursor
      anfe.a(android.database.sqlite.SQLiteDatabase, java.lang.String, int, java.lang.String, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations
     arg types: [java.util.TreeSet, java.util.Set, java.lang.String, anhd, int]
     candidates:
      anhe.a(android.database.sqlite.SQLiteDatabase, int, java.lang.String, anhd, com.google.android.gms.phenotype.Flag[]):com.google.android.gms.phenotype.Configurations
      anhe.a(java.util.Set, java.util.Set, java.lang.String, anhd, boolean):com.google.android.gms.phenotype.Configurations */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c1, code lost:
        if (r2 != null) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0043, code lost:
        if (r2 != null) goto L_0x0045;
     */
    /* renamed from: b */
    public static Configurations m64374b(SQLiteDatabase sQLiteDatabase, String str) {
        anhd anhd;
        Throwable th;
        Pair a;
        Throwable th2;
        Throwable th3;
        String str2 = str;
        Flag[] c = m64375c(sQLiteDatabase, str);
        if (c == null) {
            Cursor query = sQLiteDatabase.query("ExperimentTokens", new String[]{"experimentToken", "serverToken", "servingVersion"}, "packageName = ? AND isCommitted = 1", new String[]{str2}, null, null, null, null);
            try {
                if (query.moveToFirst()) {
                    anhd = new anhd(query.getBlob(0), query.getString(1), query.getLong(2));
                } else {
                    anhd = anhd.f76848a;
                }
                query.close();
            } catch (Throwable th4) {
                bqye.m113761a(th3, th4);
            }
        } else {
            int length = c.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Flag flag = c[i];
                    if (flag.f82099a.equals("__phenotype_server_token") && flag.f82105g == 4) {
                        anhd = new anhd(null, flag.mo46502d(), 0);
                        break;
                    }
                    i++;
                } else if (!cgec.m144834i()) {
                    anhd = anhd.f76848a;
                } else {
                    Cursor query2 = sQLiteDatabase.query("ExperimentTokens", new String[]{"serverToken"}, "packageName = ? AND isCommitted = 1", new String[]{str2}, null, null, null, null);
                    try {
                        if (query2.moveToFirst()) {
                            anhd = new anhd(null, query2.getString(0), 0);
                        } else {
                            anhd = anhd.f76848a;
                        }
                        query2.close();
                    } catch (Throwable th5) {
                        bqye.m113761a(th2, th5);
                    }
                }
            }
        }
        TreeSet treeSet = new TreeSet(Flag.f82097j);
        Cursor query3 = sQLiteDatabase.query("Flags", anfq.f76775b, "packageName = ? AND committed = 1", new String[]{str2}, null, null, null);
        while (query3.moveToNext()) {
            try {
                treeSet.add(anhe.m64382a(query3));
            } catch (Throwable th6) {
                bqye.m113761a(th, th6);
            }
        }
        if (cgem.m144888c() && (a = anfl.m64159a(sQLiteDatabase, str)) != null) {
            if (!anfe.m64149a(sQLiteDatabase, str2, ((Integer) a.second).intValue(), (String) a.first, true)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 71);
                sb.append("Can't return configuration for package ");
                sb.append(str2);
                sb.append(" due to detected flag corruption");
                throw new anfx(sb.toString());
            }
        }
        if (query3 != null) {
            query3.close();
        }
        if (c != null) {
            for (Flag flag2 : c) {
                treeSet.remove(flag2);
                treeSet.add(flag2);
            }
        }
        return anhe.m64381a((Set) treeSet, Collections.emptySet(), "", anhd, false);
        throw th3;
        throw th2;
        throw th;
    }

    /* renamed from: c */
    static Flag[] m64375c(SQLiteDatabase sQLiteDatabase, String str) {
        int i = 0;
        Cursor query = sQLiteDatabase.query("FlagOverrides", anfq.f76775b, "packageName = ? AND committed = 1", new String[]{str}, null, null, null);
        try {
            if (query.getCount() != 0) {
                Flag[] flagArr = new Flag[query.getCount()];
                while (query.moveToNext()) {
                    int i2 = i + 1;
                    flagArr[i] = anhe.m64382a(query);
                    i = i2;
                }
                if (query != null) {
                    query.close();
                }
                return flagArr;
            } else if (query == null) {
                return null;
            } else {
                query.close();
                return null;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
