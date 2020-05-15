package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: agdm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agdm {
    /* renamed from: a */
    static void m54095a(agid agid, SQLiteDatabase sQLiteDatabase) {
        if (agid != null) {
            File file = new File(sQLiteDatabase.getPath());
            if (!file.setReadable(false, false)) {
                agid.f65567f.mo35435a("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                agid.f65567f.mo35435a("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                agid.f65567f.mo35435a("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                agid.f65567f.mo35435a("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 != false) goto L_0x004b;
     */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0086 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c3 A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }, LOOP:1: B:35:0x00c3->B:41:0x00d6, LOOP_START, PHI: r14 10  PHI: (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:33:0x00bf, B:41:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00df A[Catch:{ all -> 0x00ed, SQLiteException -> 0x00f2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[Catch:{  }, RETURN, SYNTHETIC] */
    /* renamed from: a */
    static void m54096a(agid agid, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        HashSet hashSet;
        Cursor rawQuery;
        int length;
        int i;
        Cursor cursor;
        agid agid2 = agid;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        String str4 = str;
        String[] strArr2 = strArr;
        if (agid2 != null) {
            Cursor cursor2 = null;
            try {
                cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str4}, null, null, null);
                try {
                    boolean moveToFirst = cursor.moveToFirst();
                    if (cursor != null) {
                        cursor.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    try {
                        agid2.f65567f.mo35437a("Error querying for table", str4, e);
                        if (cursor != null) {
                        }
                        sQLiteDatabase2.execSQL(str2);
                        try {
                            hashSet = new HashSet();
                            StringBuilder sb = new StringBuilder(str.length() + 22);
                            sb.append("SELECT * FROM ");
                            sb.append(str4);
                            sb.append(" LIMIT 0");
                            rawQuery = sQLiteDatabase2.rawQuery(sb.toString(), null);
                            Collections.addAll(hashSet, rawQuery.getColumnNames());
                            rawQuery.close();
                            String[] split = str3.split(",");
                            length = split.length;
                            i = 0;
                            while (i < length) {
                            }
                            if (strArr2 == null) {
                            }
                            if (hashSet.isEmpty()) {
                            }
                        } catch (SQLiteException e2) {
                            agid2.f65564c.mo35436a("Failed to verify columns on table that was just created", str4);
                            throw e2;
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursor2 = cursor;
                    if (cursor2 != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e3) {
                e = e3;
                cursor = null;
                agid2.f65567f.mo35437a("Error querying for table", str4, e);
                if (cursor != null) {
                    cursor.close();
                }
                sQLiteDatabase2.execSQL(str2);
                hashSet = new HashSet();
                StringBuilder sb2 = new StringBuilder(str.length() + 22);
                sb2.append("SELECT * FROM ");
                sb2.append(str4);
                sb2.append(" LIMIT 0");
                rawQuery = sQLiteDatabase2.rawQuery(sb2.toString(), null);
                Collections.addAll(hashSet, rawQuery.getColumnNames());
                rawQuery.close();
                String[] split2 = str3.split(",");
                length = split2.length;
                i = 0;
                while (i < length) {
                    String str5 = split2[i];
                    if (hashSet.remove(str5)) {
                        i++;
                    } else {
                        StringBuilder sb3 = new StringBuilder(str.length() + 35 + String.valueOf(str5).length());
                        sb3.append("Table ");
                        sb3.append(str4);
                        sb3.append(" is missing required column: ");
                        sb3.append(str5);
                        throw new SQLiteException(sb3.toString());
                    }
                }
                if (strArr2 == null) {
                    for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                        if (!hashSet.remove(strArr2[i2])) {
                            sQLiteDatabase2.execSQL(strArr2[i2 + 1]);
                        }
                    }
                }
                if (hashSet.isEmpty()) {
                    agid2.f65567f.mo35437a("Table has extra columns. table, columns", str4, TextUtils.join(", ", hashSet));
                }
            } catch (Throwable th4) {
                th = th4;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }
}
