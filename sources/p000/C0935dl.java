package p000;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* renamed from: dl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C0935dl extends SQLiteOpenHelper {

    /* renamed from: a */
    final C0933dj[] f13435a;

    /* renamed from: b */
    final C0925dc f13436b;

    /* renamed from: c */
    private boolean f13437c;

    public C0935dl(Context context, String str, C0933dj[] djVarArr, C0925dc dcVar) {
        super(context, str, null, dcVar.f12760a, new C0934dk(djVarArr));
        this.f13436b = dcVar;
        this.f13435a = djVarArr;
    }

    /* renamed from: a */
    static C0933dj m8777a(C0933dj[] djVarArr, SQLiteDatabase sQLiteDatabase) {
        C0933dj djVar = djVarArr[0];
        if (djVar != null && djVar.f13300a == sQLiteDatabase) {
            return djVar;
        }
        C0933dj djVar2 = new C0933dj(sQLiteDatabase);
        djVarArr[0] = djVar2;
        return djVar2;
    }

    public final synchronized void close() {
        super.close();
        this.f13435a[0] = null;
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        mo9249a(sQLiteDatabase);
    }

    /* JADX INFO: finally extract failed */
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C0925dc dcVar = this.f13436b;
        C0933dj a = mo9249a(sQLiteDatabase);
        Cursor a2 = a.mo9112a("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (a2.moveToFirst() && a2.getInt(0) == 0) {
                z = true;
            }
            a2.close();
            dcVar.f12762c.mo9981b(a);
            if (!z) {
                C0955ee d = dcVar.f12762c.mo9983d(a);
                if (!d.f14760a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + d.f14761b);
                }
            }
            dcVar.mo8501a(a);
            C0954ed edVar = dcVar.f12762c;
        } catch (Throwable th) {
            a2.close();
            throw th;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f13437c = true;
        this.f13436b.mo8502a(mo9249a(sQLiteDatabase), i, i2);
    }

    /* JADX INFO: finally extract failed */
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        boolean z;
        String str;
        if (!this.f13437c) {
            C0925dc dcVar = this.f13436b;
            C0933dj a = mo9249a(sQLiteDatabase);
            Cursor a2 = a.mo9112a("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                if (!a2.moveToFirst() || a2.getInt(0) == 0) {
                    z = false;
                } else {
                    z = true;
                }
                a2.close();
                if (!z) {
                    C0955ee d = dcVar.f12762c.mo9983d(a);
                    if (d.f14760a) {
                        dcVar.mo8501a(a);
                    } else {
                        throw new IllegalStateException("Pre-packaged database has an invalid schema: " + d.f14761b);
                    }
                } else {
                    Cursor a3 = a.mo9111a(new C0924db("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                    try {
                        if (a3.moveToFirst()) {
                            str = a3.getString(0);
                        } else {
                            str = null;
                        }
                        a3.close();
                        if (!dcVar.f12763d.equals(str) && !dcVar.f12764e.equals(str)) {
                            throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                        }
                    } catch (Throwable th) {
                        a3.close();
                        throw th;
                    }
                }
                dcVar.f12762c.mo9982c(a);
                dcVar.f12761b = null;
            } catch (Throwable th2) {
                a2.close();
                throw th2;
            }
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.f13437c = true;
        this.f13436b.mo8502a(mo9249a(sQLiteDatabase), i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized C0933dj mo9248a() {
        this.f13437c = false;
        SQLiteDatabase writableDatabase = super.getWritableDatabase();
        if (this.f13437c) {
            close();
            return mo9248a();
        }
        return mo9249a(writableDatabase);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0933dj mo9249a(SQLiteDatabase sQLiteDatabase) {
        return m8777a(this.f13435a, sQLiteDatabase);
    }
}
