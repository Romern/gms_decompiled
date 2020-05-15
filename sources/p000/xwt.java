package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* renamed from: xwt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xwt extends srp {

    /* renamed from: b */
    private static final Logger f53306b = new Logger(new String[]{"SQLiteDataStoreHelper"}, (short[]) null);

    /* renamed from: a */
    private final int f53307a;

    /* renamed from: a */
    public static xwt m43582a(Context context) {
        int i;
        if (!cdxn.f181876a.mo6606a().mo78421a()) {
            i = 1;
        } else {
            i = 2;
        }
        return new xwt(context, i);
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        f53306b.mo25412b("Upgrading from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS successful_ceremony_metadata(key_handle TEXT, rp_id TEXT, transport TEXT, usage_timestamp TEXT)");
        }
    }

    private xwt(Context context, int i) {
        super(context, "fido_embedded_security_key.db", "fido_embedded_security_key.db", i);
        this.f53307a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10020a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS registered_credentials(id TEXT PRIMARY KEY, registration_time TEXT, counter INTEGER, key_data BLOB)");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS usages(id TEXT, usage_timestamp TEXT)");
        if (this.f53307a >= 2) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS successful_ceremony_metadata(key_handle TEXT, rp_id TEXT, transport TEXT, usage_timestamp TEXT)");
        }
        f53306b.mo25414c("Created databases", new Object[0]);
    }
}
