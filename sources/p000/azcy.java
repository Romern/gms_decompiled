package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.lang.ref.WeakReference;

/* renamed from: azcy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azcy {

    /* renamed from: c */
    private static WeakReference f99022c = new WeakReference(null);

    /* renamed from: a */
    public final Context f99023a;

    /* renamed from: b */
    public SQLiteDatabase f99024b;

    public azcy(Context context, SQLiteDatabase sQLiteDatabase) {
        this.f99023a = context.getApplicationContext();
        this.f99024b = sQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003e, code lost:
        return r1;
     */
    /* renamed from: a */
    public static synchronized azcy m85381a(Context context) {
        SQLiteDatabase sQLiteDatabase;
        synchronized (azcy.class) {
            azcy azcy = (azcy) f99022c.get();
            if (azcy == null) {
                Context applicationContext = context.getApplicationContext();
                try {
                    sQLiteDatabase = azcl.m85289a(applicationContext).getWritableDatabase();
                } catch (SQLiteException e) {
                    azoj.m85932b("MsMediaManager", "Cannot create database instance with write permission.", new Object[0]);
                    sQLiteDatabase = null;
                }
                azcy azcy2 = new azcy(applicationContext, sQLiteDatabase);
                if (!azcy2.mo54710b()) {
                    azcy = azcy2;
                } else {
                    f99022c = new WeakReference(azcy2);
                    return azcy2;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean mo54710b() {
        return mo54709a() && !this.f99024b.isReadOnly();
    }

    /* renamed from: a */
    public final boolean mo54709a() {
        SQLiteDatabase sQLiteDatabase = this.f99024b;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }
}
