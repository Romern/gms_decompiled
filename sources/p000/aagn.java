package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: aagn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aagn extends srp {

    /* renamed from: a */
    private static aagn f28081a;

    /* renamed from: a */
    public static synchronized aagn m21229a(Context context) {
        aagn aagn;
        synchronized (aagn.class) {
            if (f28081a == null) {
                f28081a = new aagn(context);
            }
            aagn = f28081a;
        }
        return aagn;
    }

    /* renamed from: b */
    private static void m21231b(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(String.format("DROP TABLE IF EXISTS %s", str));
        } catch (SQLException e) {
            int i = aago.f28082c;
            new Object[1][0] = str;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = aago.f28082c;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        m21232c(sQLiteDatabase);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            int i3 = aago.f28082c;
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
            if (i <= 0) {
                m21232c(sQLiteDatabase);
                new Object[1][0] = 1;
            } else if (i >= 2) {
                return;
            }
            int i4 = aafy.f28048a;
            m21231b(sQLiteDatabase, "ad_attestation");
            m21230a(sQLiteDatabase, aafy.m21188a());
            new Object[1][0] = 2;
        } catch (SQLException e) {
            int i5 = aago.f28082c;
            new Object[1][0] = e;
            m21232c(sQLiteDatabase);
        }
    }

    private aagn(Context context) {
        super(context, "gass.db", "gass.db", 2);
    }

    /* renamed from: a */
    private static void m21230a(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLException e) {
            int i = aago.f28082c;
            new Object[1][0] = str;
        }
    }

    /* renamed from: c */
    private final void m21232c(SQLiteDatabase sQLiteDatabase) {
        int i = aagf.f28059a;
        m21231b(sQLiteDatabase, "app_info");
        m21231b(sQLiteDatabase, "ad_attestation");
        onCreate(sQLiteDatabase);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        int i = aagf.f28059a;
        String format = String.format(" (%s INTEGER PRIMARY KEY AUTOINCREMENT, ", "_id");
        String format2 = String.format("%s BLOB, ", "pb");
        String format3 = String.format("%s STRING, ", "package_name");
        String format4 = String.format("%s STRING, ", "version_code");
        String format5 = String.format("%s BLOB)", "digest_sha256");
        int length = String.valueOf(format).length();
        int length2 = String.valueOf(format2).length();
        int length3 = String.valueOf(format3).length();
        StringBuilder sb = new StringBuilder(length + 21 + length2 + length3 + String.valueOf(format4).length() + String.valueOf(format5).length());
        sb.append("CREATE TABLE app_info");
        sb.append(format);
        sb.append(format2);
        sb.append(format3);
        sb.append(format4);
        sb.append(format5);
        m21230a(sQLiteDatabase, sb.toString());
        m21230a(sQLiteDatabase, aafy.m21188a());
    }
}
