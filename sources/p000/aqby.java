package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aqby */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqby {

    /* renamed from: a */
    private static final String[] f85620a = {"threat_type", "checksum", "state"};

    /* renamed from: b */
    private final aqbs f85621b;

    /* renamed from: c */
    private SQLiteDatabase f85622c;

    static {
        aqby.class.getSimpleName();
    }

    public aqby(aqbs aqbs) {
        this.f85621b = aqbs;
    }

    /* renamed from: a */
    private final void m71331a() {
        aqbs aqbs = this.f85621b;
        if (aqbs != null) {
            try {
                this.f85622c = aqbs.getWritableDatabase();
                return;
            } catch (SQLException e) {
            }
        }
        this.f85622c = null;
    }

    /* renamed from: b */
    private final void m71333b() {
        SQLiteDatabase sQLiteDatabase = this.f85622c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* renamed from: a */
    static final synchronized void m71332a(SQLiteDatabase sQLiteDatabase, int i, byte[] bArr, byte[] bArr2) {
        synchronized (aqby.class) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("threat_type", Integer.valueOf(i));
            contentValues.put("checksum", bArr);
            contentValues.put("state", bArr2);
            try {
                sQLiteDatabase.replace("metadata", null, contentValues);
            } catch (SQLException e) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006a A[Catch:{ SQLException -> 0x0067, IllegalArgumentException -> 0x0065, all -> 0x005a }] */
    /* renamed from: a */
    public final synchronized aqbx mo47750a(int i) {
        m71331a();
        SQLiteDatabase sQLiteDatabase = this.f85622c;
        if (sQLiteDatabase != null) {
            try {
                Cursor query = sQLiteDatabase.query("metadata", f85620a, "threat_type=?", new String[]{Integer.toString(i)}, null, null, null);
                try {
                    if (query.getCount() == 1) {
                        aqbx aqbx = new aqbx();
                        query.moveToNext();
                        aqbx.f85618a = query.getBlob(query.getColumnIndexOrThrow("checksum"));
                        aqbx.f85619b = query.getBlob(query.getColumnIndexOrThrow("state"));
                        if (query != null) {
                            query.close();
                        }
                        m71333b();
                        return aqbx;
                    }
                    if (query != null) {
                        query.close();
                    }
                    m71333b();
                } catch (SQLException e) {
                    if (query != null) {
                        query.close();
                    }
                    m71333b();
                    return null;
                } catch (IllegalArgumentException e2) {
                    if (query != null) {
                    }
                    m71333b();
                    return null;
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    m71333b();
                    throw th;
                }
            } catch (SQLException e3) {
            }
        }
    }
}
