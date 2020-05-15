package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: anfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anfe {
    /* renamed from: a */
    public static int m64147a(Cursor cursor) {
        bnzd a = bnzi.m110900b().mo68732a();
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            boolean z = true;
            a.mo68725a(cursor.getString(1), bmwy.f131158c);
            if (!cursor.isNull(2)) {
                a.mo68713a(cursor.getLong(2));
            } else if (!cursor.isNull(3)) {
                if (cursor.getInt(3) == 0) {
                    z = false;
                }
                a.mo68728a(z);
            } else if (!cursor.isNull(4)) {
                a.mo68726a(cursor.getDouble(4));
            } else if (!cursor.isNull(5)) {
                a.mo68725a(cursor.getString(5), bmwy.f131158c);
            } else if (!cursor.isNull(6)) {
                a.mo68717b(cursor.getBlob(6));
            }
            cursor.moveToNext();
        }
        return a.mo68729a().mo68741c();
    }

    /* renamed from: a */
    public static Cursor m64148a(SQLiteDatabase sQLiteDatabase, String str, long j, String str2, boolean z) {
        String str3;
        String[] strArr = anfq.f76775b;
        String[] strArr2 = new String[4];
        strArr2[0] = str;
        strArr2[1] = Long.toString(j);
        strArr2[2] = str2;
        if (!z) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        strArr2[3] = str3;
        return sQLiteDatabase.query("Flags", strArr, "packageName = ? AND version = ? AND user = ? AND committed = ?", strArr2, null, null, "name");
    }

    /* renamed from: a */
    public static boolean m64149a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z) {
        Cursor a = m64148a(sQLiteDatabase, str, (long) i, str2, z);
        try {
            boolean a2 = m64150a(sQLiteDatabase, str, i, str2, z, a);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0029, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        if (r8 != null) goto L_0x0031;
     */
    /* renamed from: a */
    public static boolean m64150a(SQLiteDatabase sQLiteDatabase, String str, int i, String str2, boolean z, Cursor cursor) {
        int a = m64147a(cursor);
        cursor.moveToPosition(-1);
        Cursor a2 = anfo.m64163a(sQLiteDatabase, str, i, str2, z, "flagsHash");
        try {
            Integer num = null;
            if (a2.moveToFirst()) {
                if (!a2.isNull(0)) {
                    num = Integer.valueOf(a2.getInt(0));
                }
            }
            a2.close();
            if (num == null || num.intValue() == 0 || a == num.intValue()) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
