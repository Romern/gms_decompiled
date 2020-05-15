package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.security.verifier.ApkUploadEntry;
import java.util.Iterator;

/* renamed from: aqgi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqgi implements Iterable {

    /* renamed from: a */
    private static final String[] f86047a = {"id", "package_name", "version_code", "sha256_digest", "token", "timestamp", "state", "last_update_time", "upload_attempts", "upload_reason"};

    /* renamed from: b */
    private final aqgh f86048b;

    /* renamed from: c */
    private SQLiteDatabase f86049c;

    public aqgi(Context context) {
        this.f86048b = new aqgh(context);
    }

    /* renamed from: b */
    private final void m71573b() {
        apuh.m71025a();
        try {
            this.f86049c = this.f86048b.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f86049c = null;
            aqgy.m71600a(e.getMessage(), new Object[0]);
        }
    }

    /* renamed from: c */
    private final void m71574c() {
        apuh.m71025a();
        SQLiteDatabase sQLiteDatabase = this.f86049c;
        if (sQLiteDatabase == null || sQLiteDatabase.isOpen()) {
            this.f86048b.close();
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0093 A[SYNTHETIC, Splitter:B:34:0x0093] */
    /* renamed from: a */
    public final synchronized ApkUploadEntry mo47866a(long j) {
        int i;
        synchronized (this) {
            m71573b();
            SQLiteDatabase sQLiteDatabase = this.f86049c;
            Cursor cursor = null;
            if (sQLiteDatabase != null) {
                try {
                    int i2 = 0;
                    Cursor query = sQLiteDatabase.query("upload_queue", f86047a, "id > ?", new String[]{Long.toString(j)}, null, null, "id", "1");
                    try {
                        if (query.getCount() == 1) {
                            query.moveToNext();
                            long j2 = query.getLong(0);
                            String string = query.getString(1);
                            int i3 = query.getInt(2);
                            byte[] blob = query.getBlob(3);
                            byte[] blob2 = query.getBlob(4);
                            long j3 = query.getLong(5);
                            int i4 = query.getInt(6);
                            long j4 = query.getLong(7);
                            int i5 = query.getInt(8);
                            if (cgkt.m145949u()) {
                                i2 = aqgq.m71589a(query.getInt(9));
                            }
                            if (i2 != 0) {
                                i = i2;
                            } else {
                                i = 1;
                            }
                            ApkUploadEntry apkUploadEntry = new ApkUploadEntry(j2, string, i3, blob, blob2, j3, i4, j4, i5, i);
                            if (query != null) {
                                query.close();
                            }
                            m71574c();
                            return apkUploadEntry;
                        }
                        if (query != null) {
                            query.close();
                        }
                        m71574c();
                    } catch (Throwable th) {
                        th = th;
                        cursor = query;
                        if (cursor != null) {
                        }
                        m71574c();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    m71574c();
                    throw th;
                }
            }
        }
    }

    public final Iterator iterator() {
        return new aqgg(this);
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
    /* renamed from: b */
    public final synchronized void mo47870b(ApkUploadEntry apkUploadEntry) {
        m71573b();
        if (this.f86049c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("timestamp", Long.valueOf(apkUploadEntry.f107603f));
                contentValues.put("upload_attempts", (Integer) 0);
                if (this.f86049c.update("upload_queue", contentValues, "package_name = ? AND version_code = ? AND hex(sha256_digest) = ?", new String[]{apkUploadEntry.f107599b, Integer.toString(apkUploadEntry.f107600c), srv.m36164d(apkUploadEntry.f107601d)}) == 0) {
                    contentValues.put("package_name", apkUploadEntry.f107599b);
                    contentValues.put("version_code", Integer.valueOf(apkUploadEntry.f107600c));
                    contentValues.put("sha256_digest", apkUploadEntry.f107601d);
                    contentValues.put("token", apkUploadEntry.f107602e);
                    contentValues.put("state", Integer.valueOf(apkUploadEntry.f107604g));
                    contentValues.put("last_update_time", Long.valueOf(apkUploadEntry.f107605h));
                    if (cgkt.m145949u()) {
                        int i = apkUploadEntry.f107607j;
                        int i2 = i - 1;
                        if (i != 0) {
                            contentValues.put("upload_reason", Integer.valueOf(i2));
                        } else {
                            throw null;
                        }
                    }
                    this.f86049c.insert("upload_queue", null, contentValues);
                }
            } finally {
                m71574c();
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo47872c(ApkUploadEntry apkUploadEntry) {
        m71573b();
        if (this.f86049c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("upload_attempts", Integer.valueOf(apkUploadEntry.f107606i + 1));
                this.f86049c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.f107598a)});
            } finally {
                m71574c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47867a(ApkUploadEntry apkUploadEntry) {
        m71573b();
        SQLiteDatabase sQLiteDatabase = this.f86049c;
        if (sQLiteDatabase != null) {
            try {
                sQLiteDatabase.delete("upload_queue", "id=?", new String[]{Long.toString(apkUploadEntry.f107598a)});
            } finally {
                m71574c();
            }
        }
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
    /* renamed from: b */
    public final synchronized void mo47871b(ApkUploadEntry apkUploadEntry, long j) {
        m71573b();
        if (this.f86049c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("state", (Integer) 1);
                contentValues.put("last_update_time", Long.valueOf(j));
                this.f86049c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.f107598a)});
            } finally {
                m71574c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized void mo47868a(ApkUploadEntry apkUploadEntry, long j) {
        m71573b();
        if (this.f86049c != null) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("last_update_time", Long.valueOf(j));
                this.f86049c.update("upload_queue", contentValues, "id=?", new String[]{Long.toString(apkUploadEntry.f107598a)});
            } finally {
                m71574c();
            }
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo47869a() {
        m71573b();
        SQLiteDatabase sQLiteDatabase = this.f86049c;
        boolean z = true;
        if (sQLiteDatabase == null) {
            return true;
        }
        try {
            Cursor query = sQLiteDatabase.query("upload_queue", new String[]{"count(*)"}, null, null, null, null, null);
            query.moveToFirst();
            int i = query.getInt(0);
            query.close();
            if (i != 0) {
                z = false;
            }
            return z;
        } finally {
            m71574c();
        }
    }
}
