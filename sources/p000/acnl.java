package p000;

import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.icing.proxy.InternalIcingCorporaChimeraProvider;

/* renamed from: acnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acnl extends ftv {

    /* renamed from: f */
    private static acnl f60243f;

    /* renamed from: d */
    public final Context f60244d;

    /* renamed from: e */
    public acmn f60245e;

    public acnl(Context context) {
        super(context, "icing_contacts.db", 1, new ftw("com.google.android.gms.icing.proxy", acnm.m49518a()));
        this.f60244d = context;
    }

    /* renamed from: a */
    public static long m49508a(SQLiteDatabase sQLiteDatabase, String str) {
        if (sQLiteDatabase != null) {
            return DatabaseUtils.queryNumEntries(sQLiteDatabase, str);
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo11314a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11321d() {
        return ((Boolean) abzt.f58872aM.mo58455c()).booleanValue();
    }

    /* renamed from: e */
    public final acmn mo32914e() {
        if (this.f60245e == null) {
            Context context = this.f60244d;
            this.f60245e = new acms(context, new acnc(new abym(context), this.f60244d.getContentResolver()));
        }
        return this.f60245e;
    }

    public final SQLiteDatabase getWritableDatabase() {
        return mo32915f();
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(46);
        sb.append("Downgrading DB from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        acnv.m49550c(sb.toString());
        sra.m36066a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    /* renamed from: a */
    public static synchronized acnl m49509a(Context context) {
        acnl acnl;
        synchronized (acnl.class) {
            if (f60243f == null) {
                f60243f = new acnl(context);
            }
            acnl = f60243f;
        }
        return acnl;
    }

    /* renamed from: c */
    public final boolean mo32913c(ftz ftz) {
        try {
            if (acaw.m48796m()) {
                return mo11316a(ftz, acnj.f60235a);
            }
            return mo11315a(ftz);
        } catch (RuntimeException e) {
            acnv.m49544a(e, "Exception thrown from onTableChanged", new Object[0]);
            if (InternalIcingCorporaChimeraProvider.m66711f()) {
                return false;
            }
            throw e;
        }
    }

    /* renamed from: f */
    public final SQLiteDatabase mo32915f() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteException e) {
            acnv.m49544a(e, "Failed to get a writable database.", new Object[0]);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo32912a(int i, ftz ftz) {
        if (i > 0) {
            acnv.m49543a("Updated %d entries in table %s", Integer.valueOf(i), ftz);
            if (!mo32913c(ftz)) {
                String valueOf = String.valueOf(ftz);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                sb.append("Table change notification failed for ");
                sb.append(valueOf);
                acnv.m49556e(sb.toString());
            }
        }
    }

    /* renamed from: a */
    public final void mo11312a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS contacts");
        sQLiteDatabase.execSQL("CREATE TABLE contacts (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,lookup_key TEXT,icon_uri TEXT,display_name TEXT,given_names TEXT,times_contacted TEXT,score INTEGER,emails TEXT,nickname TEXT,note TEXT,organization TEXT,phone_numbers TEXT,postal_address TEXT,phonetic_name TEXT)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contacts_contact_id_index ON contacts(contact_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS emails");
        sQLiteDatabase.execSQL("CREATE TABLE emails (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,email TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX emails_data_id_index ON emails(data_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS phones");
        sQLiteDatabase.execSQL("CREATE TABLE phones (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,phone TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX phones_data_id_index ON phones(data_id)");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS postals");
        sQLiteDatabase.execSQL("CREATE TABLE postals (_id INTEGER PRIMARY KEY AUTOINCREMENT,contact_id INTEGER,data_id INTEGER,postal TEXT,label TEXT,type INTEGER,score INTEGER)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX postals_data_id_index ON postals(data_id)");
    }

    /* renamed from: a */
    public final void mo11313a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        StringBuilder sb = new StringBuilder(44);
        sb.append("Upgrading DB from ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        acnv.m49550c(sb.toString());
    }
}
