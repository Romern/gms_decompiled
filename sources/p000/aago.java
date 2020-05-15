package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* renamed from: aago */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aago {

    /* renamed from: c */
    public static final /* synthetic */ int f28082c = 0;

    /* renamed from: d */
    private static aago f28083d;

    /* renamed from: e */
    private static aagn f28084e;

    /* renamed from: f */
    private static final Object f28085f = new Object();

    /* renamed from: g */
    private static int f28086g = 0;

    /* renamed from: a */
    public final aagf f28087a = new aagf(this);

    /* renamed from: b */
    public final aafy f28088b = new aafy(this);

    static {
        aago.class.getSimpleName();
    }

    private aago(Context context) {
        f28084e = aagn.m21229a(context);
    }

    /* renamed from: a */
    public static synchronized aago m21234a(Context context) {
        aago aago;
        synchronized (aago.class) {
            synchronized (f28085f) {
                if (f28083d == null) {
                    f28083d = new aago(context);
                }
                f28086g++;
                aago = f28083d;
            }
        }
        return aago;
    }

    /* renamed from: b */
    public static final SQLiteDatabase m21235b() {
        SQLiteDatabase readableDatabase;
        synchronized (f28085f) {
            readableDatabase = f28084e.getReadableDatabase();
        }
        return readableDatabase;
    }

    /* renamed from: c */
    public static final SQLiteDatabase m21236c() {
        SQLiteDatabase writableDatabase;
        synchronized (f28085f) {
            try {
                writableDatabase = f28084e.getWritableDatabase();
            } catch (SQLiteException e) {
                throw new aagp("Could not open the database for writing.");
            } catch (Throwable th) {
                throw th;
            }
        }
        return writableDatabase;
    }

    /* renamed from: a */
    public final void mo16867a() {
        synchronized (f28085f) {
            int i = f28086g - 1;
            f28086g = i;
            if (i == 0) {
                f28084e.close();
                f28083d = null;
            }
        }
    }
}
