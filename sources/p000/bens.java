package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.CancellationSignal;

/* renamed from: bens */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bens {

    /* renamed from: c */
    public static final /* synthetic */ int f111889c = 0;

    /* renamed from: a */
    public final CancellationSignal f111890a = new CancellationSignal();

    /* renamed from: b */
    public final SQLiteDatabase f111891b;

    static {
        int i = Build.VERSION.SDK_INT;
    }

    public bens(SQLiteDatabase sQLiteDatabase) {
        this.f111891b = sQLiteDatabase;
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: a */
    public static void m95324a() {
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }

    /* renamed from: a */
    public final void mo60826a(beno beno) {
        m95324a();
        String valueOf = String.valueOf(beno.f111884a);
        bljb a = blkh.m107282a(valueOf.length() == 0 ? new String("execSQL: ") : "execSQL: ".concat(valueOf), blki.I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS);
        try {
            this.f111891b.execSQL(beno.f111884a, beno.f111885b);
            if (a != null) {
                a.close();
                return;
            }
            return;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
