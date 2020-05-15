package p000;

import android.content.ContentValues;
import android.database.Cursor;

/* renamed from: aagf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aagf extends aaho {

    /* renamed from: a */
    public static final /* synthetic */ int f28059a = 0;

    public aagf(aago aago) {
    }

    /* renamed from: c */
    public static final synchronized Cursor m21200c(String str, String str2) {
        synchronized (aagf.class) {
            Cursor query = aago.m21235b().query("app_info", new String[]{"_id", "pb", "package_name", "version_code", "digest_sha256"}, "package_name = ? AND version_code = ?", new String[]{str, str2}, null, null, null);
            if (query.getCount() > 1) {
                new Object[1][0] = Integer.valueOf(query.getCount());
                query.close();
                int count = query.getCount();
                StringBuilder sb = new StringBuilder(47);
                sb.append("Expect one result returned, but got ");
                sb.append(count);
                throw new aagp(sb.toString());
            } else if (query.getCount() <= 0) {
                Object[] objArr = {str, str2};
                query.close();
                return null;
            } else {
                query.moveToFirst();
                return query;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x001e A[SYNTHETIC, Splitter:B:16:0x001e] */
    /* renamed from: a */
    public final synchronized long mo16850a(String str, String str2) {
        Cursor cursor;
        long j;
        try {
            cursor = m21200c(str, str2);
            if (cursor != null) {
                try {
                    cursor.moveToFirst();
                    int i = cursor.getInt(0);
                    cursor.close();
                    j = (long) i;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } else {
                j = -1;
            }
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0046 A[SYNTHETIC, Splitter:B:22:0x0046] */
    /* renamed from: b */
    public final synchronized aaim mo16852b(String str, String str2) {
        aaim aaim;
        Cursor cursor = null;
        aaim = null;
        try {
            Cursor c = m21200c(str, str2);
            if (c != null) {
                try {
                    c.moveToFirst();
                    aaim = (aaim) bxvk.m124016a(aaim.f28200g, c.getBlob(1), bxus.m123744c());
                    c.close();
                } catch (bxwf e) {
                    new Object[1][0] = e.toString();
                    throw new aagp(String.format("Failed to get app info pb, error: %s", e.toString()));
                } catch (Throwable th) {
                    th = th;
                    cursor = c;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        return aaim;
    }

    /* renamed from: a */
    public final synchronized void mo16851a(aaim aaim) {
        long j;
        String str;
        String str2;
        String str3;
        try {
            j = mo16850a(aaim.f28203b, aaim.f28205d);
        } catch (aagp e) {
            j = -1;
        }
        ContentValues contentValues = new ContentValues();
        if (j > -1) {
            contentValues.put("_id", Long.valueOf(j));
        }
        contentValues.put("pb", aaim.mo73642k());
        if ((aaim.f28202a & 1) != 0) {
            str = aaim.f28203b;
        } else {
            str = null;
        }
        contentValues.put("package_name", str);
        if ((aaim.f28202a & 4) != 0) {
            str2 = aaim.f28205d;
        } else {
            str2 = null;
        }
        contentValues.put("version_code", str2);
        if ((aaim.f28202a & 8) != 0) {
            str3 = aaim.f28206e;
        } else {
            str3 = null;
        }
        contentValues.put("digest_sha256", str3);
        if (aago.m21236c().insertWithOnConflict("app_info", null, contentValues, 5) <= 0) {
            throw new aagp("Failed to add app info to sql table.");
        }
    }
}
