package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import java.io.IOException;

/* renamed from: ztl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ztl {

    /* renamed from: a */
    public static final srn f55885a = zvt.m46581a();

    /* renamed from: b */
    public final Context f55886b;

    /* renamed from: c */
    public final ztg f55887c;

    /* renamed from: d */
    private final Handler f55888d;

    /* renamed from: e */
    private SQLiteDatabase f55889e = null;

    /* renamed from: f */
    private final Runnable f55890f;

    /* renamed from: g */
    private int f55891g = 0;

    public ztl(Context context, Handler handler, ztg ztg) {
        this.f55886b = context;
        this.f55888d = handler;
        this.f55887c = ztg;
        this.f55890f = new ztj(this);
    }

    /* renamed from: a */
    static int m46301a(Cursor cursor, String str) {
        return cursor.getInt(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: b */
    static long m46302b(Cursor cursor, String str) {
        return cursor.getLong(cursor.getColumnIndexOrThrow(str));
    }

    /* renamed from: c */
    static String m46303c(Cursor cursor, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        bmxy.m108596a(!cursor.isNull(columnIndexOrThrow), "%s was null", str);
        return cursor.getString(columnIndexOrThrow);
    }

    /* renamed from: d */
    static String m46304d(Cursor cursor, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        if (!cursor.isNull(columnIndexOrThrow)) {
            return cursor.getString(columnIndexOrThrow);
        }
        return null;
    }

    /* renamed from: e */
    static byte[] m46305e(Cursor cursor, String str) {
        int columnIndexOrThrow = cursor.getColumnIndexOrThrow(str);
        bmxy.m108596a(!cursor.isNull(columnIndexOrThrow), "%s was null", str);
        return cursor.getBlob(columnIndexOrThrow);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            SQLiteDatabase sQLiteDatabase = this.f55889e;
            boolean z = true;
            if (sQLiteDatabase != null) {
                if (sQLiteDatabase.isOpen()) {
                    z = false;
                }
            }
            bmxy.m108601b(z, "Database is open!");
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    public final boolean mo31502a() {
        return this.f55886b.getDatabasePath(this.f55887c.getDatabaseName()).exists();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized ztk mo31503b() {
        SQLiteDatabase sQLiteDatabase;
        try {
            sQLiteDatabase = this.f55889e;
            if (sQLiteDatabase == null) {
                sQLiteDatabase = this.f55887c.getWritableDatabase();
                bmxy.m108582a(sQLiteDatabase, "Could not open Fitness database");
                this.f55889e = sQLiteDatabase;
            } else if (this.f55891g == 0) {
                this.f55888d.removeCallbacks(this.f55890f);
            }
            this.f55891g++;
        } catch (SQLiteException e) {
            bnsl bnsl = (bnsl) f55885a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("ztl", "b", 95, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Could not open Fitness database.");
            throw new IOException(e);
        }
        return new ztk(this, sQLiteDatabase);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo31504c() {
        int i = this.f55891g - 1;
        this.f55891g = i;
        if (i == 0) {
            this.f55888d.postDelayed(this.f55890f, cdzv.f182107a.mo6606a().mo78635d());
        }
    }

    /* renamed from: d */
    public final synchronized void mo31505d() {
        if (this.f55891g == 0) {
            try {
                this.f55887c.close();
            } catch (SQLiteException e) {
                bnsl bnsl = (bnsl) f55885a.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ztl", "d", 129, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Error when closing database.");
            }
            this.f55889e = null;
        }
    }
}
