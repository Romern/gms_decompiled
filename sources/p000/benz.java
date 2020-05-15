package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/* renamed from: benz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class benz implements benx {

    /* renamed from: a */
    private volatile boolean f111909a = false;

    /* renamed from: b */
    private String f111910b;

    /* renamed from: c */
    private SQLiteDatabase f111911c;

    /* renamed from: d */
    private final Context f111912d;

    /* renamed from: e */
    private final ayte f111913e;

    /* renamed from: f */
    private final String f111914f;

    public benz(Context context, ayte ayte, String str) {
        this.f111912d = context;
        this.f111913e = ayte;
        this.f111914f = str;
        this.f111910b = null;
        this.f111911c = null;
    }

    /* renamed from: a */
    public final Iterable mo60834a(Date date) {
        mo60840a();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f111911c.rawQuery("SELECT path FROM files WHERE domain_id = ? AND expires_at <= ?", new String[]{this.f111910b, Long.toString(date.getTime())});
        while (rawQuery.moveToNext()) {
            try {
                arrayList.add(new File(rawQuery.getString(0)));
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        }
        if (rawQuery != null) {
            rawQuery.close();
        }
        return arrayList;
        throw th;
    }

    /* renamed from: a */
    public final void mo60840a() {
        Cursor rawQuery;
        String str;
        if (!this.f111909a) {
            synchronized (this) {
                if (!this.f111909a) {
                    try {
                        SQLiteDatabase openOrCreateDatabase = this.f111912d.openOrCreateDatabase("mobstore_gc_db_v0", 0, null);
                        this.f111911c = openOrCreateDatabase;
                        openOrCreateDatabase.execSQL("CREATE TABLE IF NOT EXISTS domains (domain_id INTEGER PRIMARY KEY AUTOINCREMENT, created DATETIME, last_update DATETIME, name TEXT);");
                        this.f111911c.execSQL("CREATE TABLE IF NOT EXISTS files (file_id INTEGER PRIMARY KEY AUTOINCREMENT, created DATETIME, last_update DATETIME, domain_id INTEGER REFERENCES domains, path TEXT, expires_at TIMESTAMP);");
                        this.f111911c.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS files_domain_idx ON files (domain_id, path);");
                        this.f111911c.execSQL("CREATE INDEX IF NOT EXISTS files_expiration_idx ON files (domain_id, expires_at);");
                        rawQuery = this.f111911c.rawQuery("SELECT domain_id FROM domains WHERE name = ?", new String[]{this.f111914f});
                        if (rawQuery.moveToFirst()) {
                            str = rawQuery.getString(0);
                        } else {
                            str = null;
                        }
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        ContentValues contentValues = new ContentValues();
                        long currentTimeMillis = System.currentTimeMillis();
                        contentValues.put("name", this.f111914f);
                        Long valueOf = Long.valueOf(currentTimeMillis);
                        contentValues.put("last_update", valueOf);
                        if (str != null) {
                            this.f111911c.update("domains", contentValues, "domain_id = ?", new String[]{str});
                        } else {
                            contentValues.put("created", valueOf);
                            long insertOrThrow = this.f111911c.insertOrThrow("domains", null, contentValues);
                            if (insertOrThrow == -1) {
                                String valueOf2 = String.valueOf(this.f111914f);
                                throw new SQLiteException(valueOf2.length() == 0 ? new String("Couldn't retrieve ID for domain: ") : "Couldn't retrieve ID for domain: ".concat(valueOf2));
                            }
                            str = Long.toString(insertOrThrow);
                        }
                        this.f111910b = str;
                        this.f111909a = true;
                    } catch (SQLiteException e) {
                        throw new IOException("Error while initializing SQLite database.", e);
                    } catch (Throwable th) {
                        bqye.m113761a(th, th);
                    }
                }
            }
            return;
        }
        return;
        throw th;
    }

    /* renamed from: a */
    public final void mo60835a(File file, beny beny) {
        mo60840a();
        try {
            if (!beny.mo60837b()) {
                ContentValues contentValues = new ContentValues();
                long currentTimeMillis = System.currentTimeMillis();
                contentValues.put("expires_at", Long.valueOf(beny.mo60836a().getTime()));
                Long valueOf = Long.valueOf(currentTimeMillis);
                contentValues.put("last_update", valueOf);
                int update = this.f111911c.update("files", contentValues, "path = ? AND domain_id = ?", new String[]{file.getAbsolutePath(), this.f111910b});
                if (update == 0) {
                    contentValues.put("path", file.getAbsolutePath());
                    contentValues.put("domain_id", this.f111910b);
                    contentValues.put("created", valueOf);
                    this.f111911c.insertOrThrow("files", null, contentValues);
                } else if (update == -1) {
                    throw new IOException("setGcRule: database transaction encountered error");
                } else if (update != 1) {
                    throw new IOException("setGcRule: invariant violated, more than one row was updated");
                }
            } else {
                this.f111911c.delete("files", "path = ? AND domain_id = ?", new String[]{file.getAbsolutePath(), this.f111910b});
            }
        } catch (SQLiteException e) {
            String valueOf2 = String.valueOf(file.getPath());
            throw new IOException(valueOf2.length() == 0 ? new String("Error setting GcRule for file ") : "Error setting GcRule for file ".concat(valueOf2), e);
        }
    }
}
