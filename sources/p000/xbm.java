package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* renamed from: xbm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xbm extends srp {
    /* renamed from: a */
    public static DateFormat m42605a() {
        return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        xbo.f51880b.mo25412b(String.format(Locale.US, "Upgrading from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2)), new Object[0]);
    }

    public xbm(Context context) {
        super(context, "fido_auto_enrollment.db", "fido_auto_enrollment.db", 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS account_enrollment_status(id INTEGER PRIMARY KEY AUTOINCREMENT,account TEXT,original_enroll_time_millis TEXT,enroll_time_millis TEXT,key_type INTEGER,credential_identifier TEXT,validity INTEGER)");
        } catch (SQLException e) {
            throw new SQLiteException(e.getMessage(), e.getCause());
        }
    }
}
