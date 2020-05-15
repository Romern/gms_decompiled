package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.util.Locale;

/* renamed from: hnf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hnf extends srp {
    /* renamed from: a */
    private static void m14638a(SQLiteDatabase sQLiteDatabase, hnt hnt) {
        hng.f20067a.mo25412b(String.format("Creating table %s", hnt.mo12624a()), new Object[0]);
        imu.m15736a(sQLiteDatabase, hnt.mo12624a(), hnt.mo12625b(), hnt.mo12626c(), hnt.mo12627d());
        for (String[] strArr : hnt.mo12628e()) {
            imu.m15734a(sQLiteDatabase, hnt.mo12624a(), strArr);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo10021b(SQLiteDatabase sQLiteDatabase) {
        hng.f20067a.mo25412b(String.format("Opening database %s...", "auth.credentials.credential_store"), new Object[0]);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        hng.f20067a.mo25412b(String.format(Locale.US, "Upgrading from version %d to version %s...", Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
        if (i2 == 8) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential_affiliation");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phone_numbers");
        }
    }

    public hnf(Context context) {
        super(context, "auth.credentials.credential_store", "auth.credentials.credential_store", 8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        hng.f20067a.mo25412b(String.format("Creating database %s...", "auth.credentials.credential_store"), new Object[0]);
        m14638a(sQLiteDatabase, hnd.f20057a);
        m14638a(sQLiteDatabase, hne.f20062a);
    }
}
