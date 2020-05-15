package p000;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import java.io.Closeable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: fkv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fkv extends fkj implements Closeable {

    /* renamed from: a */
    public static final String f16820a = String.format("CREATE TABLE IF NOT EXISTS %s ( '%s' INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, '%s' INTEGER NOT NULL, '%s' TEXT NOT NULL, '%s' TEXT NOT NULL, '%s' INTEGER);", "hits2", "hit_id", "hit_time", "hit_url", "hit_string", "hit_app_id");

    /* renamed from: b */
    public static final String f16821b = String.format("SELECT MAX(%s) FROM %s WHERE 1;", "hit_time", "hits2");

    /* renamed from: c */
    public final fof f16822c = new fof(mo10936e());

    /* renamed from: e */
    public final fof f16823e = new fof(mo10936e());

    /* renamed from: f */
    private final fku f16824f;

    public fkv(fkm fkm) {
        super(fkm);
        this.f16824f = new fku(this, fkm.f16785a, mo10987x());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0031  */
    /* renamed from: a */
    public final long mo10978a(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            cursor = mo10986w().rawQuery(str, strArr);
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j;
                } else if (cursor == null) {
                    return 0;
                } else {
                    cursor.close();
                    return 0;
                }
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo10935d("Database error", str, e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            mo10935d("Database error", str, e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10890a() {
    }

    /* renamed from: b */
    public final void mo10981b() {
        mo10954t();
        mo10986w().beginTransaction();
    }

    /* renamed from: c */
    public final void mo10982c() {
        mo10954t();
        mo10986w().setTransactionSuccessful();
    }

    public final void close() {
        try {
            this.f16824f.close();
        } catch (SQLiteException e) {
            mo10938e("Sql error closing database", e);
        } catch (IllegalStateException e2) {
            mo10938e("Error closing database", e2);
        }
    }

    /* renamed from: d */
    public final void mo10984d() {
        mo10954t();
        mo10986w().endTransaction();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final SQLiteDatabase mo10986w() {
        try {
            return this.f16824f.getWritableDatabase();
        } catch (SQLiteException e) {
            mo10934d("Error opening database", e);
            throw e;
        }
    }

    /* renamed from: x */
    public final String mo10987x() {
        mo10943h();
        if (mo10943h().mo11005a()) {
            mo10943h();
            return "google_analytics_v4.db";
        }
        mo10943h();
        return "google_analytics2_v4.db";
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0039  */
    /* renamed from: v */
    public final long mo10985v() {
        fje.m11804a();
        mo10954t();
        Cursor cursor = null;
        try {
            cursor = mo10986w().rawQuery("SELECT COUNT(*) FROM hits2", null);
            try {
                if (cursor.moveToFirst()) {
                    long j = cursor.getLong(0);
                    if (cursor != null) {
                        cursor.close();
                    }
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                e = e;
                try {
                    mo10935d("Database error", "SELECT COUNT(*) FROM hits2", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                    }
                    throw th;
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            mo10935d("Database error", "SELECT COUNT(*) FROM hits2", e);
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Map mo10979a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new HashMap(0);
        }
        try {
            if (!str.startsWith("?")) {
                String valueOf = String.valueOf(str);
                str = valueOf.length() == 0 ? new String("?") : "?".concat(valueOf);
            }
            return srw.m36166a(new URI(str), "UTF-8");
        } catch (URISyntaxException e) {
            mo10938e("Error parsing hit parameters", e);
            return new HashMap(0);
        }
    }

    /* renamed from: a */
    public final void mo10980a(List list) {
        sdo.m34959a(list);
        fje.m11804a();
        mo10954t();
        if (!list.isEmpty()) {
            StringBuilder sb = new StringBuilder("hit_id");
            sb.append(" in (");
            for (int i = 0; i < list.size(); i++) {
                Long l = (Long) list.get(i);
                if (l == null || l.longValue() == 0) {
                    throw new SQLiteException("Invalid hit id");
                }
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(l);
            }
            sb.append(")");
            String sb2 = sb.toString();
            try {
                SQLiteDatabase w = mo10986w();
                mo10926a("Deleting dispatched hits. count", Integer.valueOf(list.size()));
                int delete = w.delete("hits2", sb2, null);
                if (delete != list.size()) {
                    mo10928a("Deleted fewer hits then expected", Integer.valueOf(list.size()), Integer.valueOf(delete), sb2);
                }
            } catch (SQLiteException e) {
                mo10938e("Error deleting hits", e);
                throw e;
            }
        }
    }
}
