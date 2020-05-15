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

/* renamed from: beob */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class beob implements benx {

    /* renamed from: a */
    private volatile boolean f111917a = false;

    /* renamed from: b */
    private String f111918b;

    /* renamed from: c */
    private SQLiteDatabase f111919c;

    /* renamed from: d */
    private final Context f111920d;

    /* renamed from: e */
    private final ayte f111921e;

    /* renamed from: f */
    private final String f111922f;

    public beob(Context context, ayte ayte, String str) {
        this.f111920d = context;
        this.f111921e = ayte;
        this.f111922f = str;
        this.f111918b = null;
        this.f111919c = null;
    }

    /* renamed from: a */
    public final Iterable mo60834a(Date date) {
        mo60841a();
        ArrayList arrayList = new ArrayList();
        Cursor rawQuery = this.f111919c.rawQuery("SELECT path FROM files WHERE domain_id = ? AND expires_at <= ?", new String[]{this.f111918b, Long.toString(date.getTime())});
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

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo60841a() {
        Cursor rawQuery;
        if (!this.f111917a) {
            synchronized (this) {
                if (!this.f111917a) {
                    try {
                        String str = null;
                        SQLiteDatabase openOrCreateDatabase = this.f111920d.openOrCreateDatabase("mobstore_gc_db_v0", 0, null);
                        this.f111919c = openOrCreateDatabase;
                        openOrCreateDatabase.beginTransaction();
                        try {
                            this.f111919c.execSQL("CREATE TABLE IF NOT EXISTS domains (domain_id INTEGER PRIMARY KEY AUTOINCREMENT, created DATETIME, last_update DATETIME, name TEXT);");
                            this.f111919c.execSQL("CREATE TABLE IF NOT EXISTS files (file_id INTEGER PRIMARY KEY AUTOINCREMENT, created DATETIME, last_update DATETIME, domain_id INTEGER REFERENCES domains, path TEXT, expires_at TIMESTAMP);");
                            this.f111919c.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS files_domain_idx ON files (domain_id, path);");
                            this.f111919c.beginTransaction();
                            try {
                                Cursor rawQuery2 = this.f111919c.rawQuery("SELECT name FROM domains GROUP BY name HAVING count(domain_id) > 1;", new String[0]);
                                try {
                                    if (rawQuery2.moveToFirst()) {
                                        do {
                                            String string = rawQuery2.getString(0);
                                            this.f111919c.beginTransaction();
                                            try {
                                                rawQuery = this.f111919c.rawQuery("SELECT domain_id FROM domains WHERE name = ? ORDER BY domain_id", new String[]{string});
                                                if (rawQuery.moveToFirst()) {
                                                    String string2 = rawQuery.getString(0);
                                                    while (rawQuery.moveToNext()) {
                                                        String[] strArr = {rawQuery.getString(0)};
                                                        long currentTimeMillis = System.currentTimeMillis();
                                                        ContentValues contentValues = new ContentValues();
                                                        contentValues.put("domain_id", string2);
                                                        contentValues.put("last_update", Long.valueOf(currentTimeMillis));
                                                        this.f111919c.updateWithOnConflict("files", contentValues, "domain_id = ?", strArr, 5);
                                                        this.f111919c.delete("domains", "domain_id = ?", strArr);
                                                    }
                                                }
                                                this.f111919c.setTransactionSuccessful();
                                                if (rawQuery != null) {
                                                    rawQuery.close();
                                                }
                                                this.f111919c.endTransaction();
                                            } catch (Throwable th) {
                                                this.f111919c.endTransaction();
                                                throw th;
                                            }
                                        } while (rawQuery2.moveToNext());
                                    }
                                    this.f111919c.setTransactionSuccessful();
                                    if (rawQuery2 != null) {
                                        rawQuery2.close();
                                    }
                                    this.f111919c.endTransaction();
                                    this.f111919c.execSQL("CREATE INDEX IF NOT EXISTS files_expiration_idx ON files (domain_id, expires_at);");
                                    this.f111919c.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS domain_id_idx ON domains (name);");
                                    this.f111919c.beginTransaction();
                                    try {
                                        ContentValues contentValues2 = new ContentValues();
                                        long currentTimeMillis2 = System.currentTimeMillis();
                                        contentValues2.put("name", this.f111922f);
                                        Long valueOf = Long.valueOf(currentTimeMillis2);
                                        contentValues2.put("created", valueOf);
                                        contentValues2.put("last_update", valueOf);
                                        this.f111919c.insertWithOnConflict("domains", null, contentValues2, 4);
                                        rawQuery2 = this.f111919c.rawQuery("SELECT domain_id FROM domains WHERE name = ? ORDER BY domain_id", new String[]{this.f111922f});
                                        if (rawQuery2.moveToFirst()) {
                                            str = rawQuery2.getString(0);
                                        }
                                        if (rawQuery2 != null) {
                                            rawQuery2.close();
                                        }
                                        this.f111919c.setTransactionSuccessful();
                                        this.f111919c.endTransaction();
                                        if (str == null) {
                                            String valueOf2 = String.valueOf(this.f111922f);
                                            throw new SQLiteException(valueOf2.length() == 0 ? new String("Couldn't retrieve ID for domain: ") : "Couldn't retrieve ID for domain: ".concat(valueOf2));
                                        }
                                        this.f111918b = str;
                                        this.f111917a = true;
                                        this.f111919c.setTransactionSuccessful();
                                        this.f111919c.endTransaction();
                                    } catch (Throwable th2) {
                                        this.f111919c.endTransaction();
                                        throw th2;
                                    }
                                } finally {
                                    if (rawQuery2 != null) {
                                        rawQuery2.close();
                                    }
                                }
                            } catch (Throwable th3) {
                                this.f111919c.endTransaction();
                                throw th3;
                            }
                        } catch (Throwable th4) {
                            this.f111919c.endTransaction();
                            throw th4;
                        }
                    } catch (SQLiteException e) {
                        throw new IOException("Error while initializing SQLite database.", e);
                    }
                }
            }
            return;
        }
        return;
        throw th;
        throw th;
    }

    /* renamed from: a */
    public final void mo60835a(File file, beny beny) {
        mo60841a();
        try {
            if (!beny.mo60837b()) {
                ContentValues contentValues = new ContentValues();
                long currentTimeMillis = System.currentTimeMillis();
                contentValues.put("expires_at", Long.valueOf(beny.mo60836a().getTime()));
                Long valueOf = Long.valueOf(currentTimeMillis);
                contentValues.put("last_update", valueOf);
                int update = this.f111919c.update("files", contentValues, "path = ? AND domain_id = ?", new String[]{file.getAbsolutePath(), this.f111918b});
                if (update == 0) {
                    contentValues.put("path", file.getAbsolutePath());
                    contentValues.put("domain_id", this.f111918b);
                    contentValues.put("created", valueOf);
                    this.f111919c.insertOrThrow("files", null, contentValues);
                } else if (update == -1) {
                    throw new IOException("setGcRule: database transaction encountered error");
                } else if (update != 1) {
                    throw new IOException("setGcRule: invariant violated, more than one row was updated");
                }
            } else {
                this.f111919c.delete("files", "path = ? AND domain_id = ?", new String[]{file.getAbsolutePath(), this.f111918b});
            }
        } catch (SQLiteException e) {
            String valueOf2 = String.valueOf(file.getPath());
            throw new IOException(valueOf2.length() == 0 ? new String("Error setting GcRule for file ") : "Error setting GcRule for file ".concat(valueOf2), e);
        }
    }
}
