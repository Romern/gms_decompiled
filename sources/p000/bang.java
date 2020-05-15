package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: bang */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bang implements bami {

    /* renamed from: a */
    public final Object f101347a = new Object();

    /* renamed from: b */
    public final Context f101348b;

    /* renamed from: c */
    public final String f101349c;

    /* renamed from: d */
    public boolean f101350d;
    @Deprecated

    /* renamed from: e */
    public boolean f101351e;

    /* renamed from: f */
    public final SQLiteOpenHelper f101352f;

    public bang(SQLiteOpenHelper sQLiteOpenHelper, Context context) {
        bmxy.m108581a(sQLiteOpenHelper);
        this.f101352f = sQLiteOpenHelper;
        this.f101348b = context;
        this.f101349c = sQLiteOpenHelper.getDatabaseName();
    }

    /* renamed from: a */
    public final SQLiteDatabase mo55800a() {
        SQLiteDatabase readableDatabase;
        synchronized (this.f101347a) {
            if (!this.f101350d) {
                try {
                    readableDatabase = this.f101352f.getReadableDatabase();
                    this.f101351e = true;
                } catch (SQLiteException e) {
                    throw new banv("Failed to open SQLite database", e);
                }
            } else {
                throw new banv("SQLite database in lame duck mode");
            }
        }
        return readableDatabase;
    }

    /* renamed from: b */
    public final void mo55757b() {
        synchronized (this.f101347a) {
            if (!this.f101350d) {
                this.f101352f.close();
                this.f101348b.deleteDatabase(this.f101349c);
                this.f101350d = true;
            }
        }
    }

    /* renamed from: c */
    public final SQLiteDatabase mo55801c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f101347a) {
            if (!this.f101350d) {
                try {
                    writableDatabase = this.f101352f.getWritableDatabase();
                    this.f101351e = true;
                } catch (SQLiteException e) {
                    throw new banv("Failed to open SQLite database", e);
                }
            } else {
                throw new banv("SQLite database in lame duck mode");
            }
        }
        return writableDatabase;
    }
}
