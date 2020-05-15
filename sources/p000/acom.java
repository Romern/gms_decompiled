package p000;

import android.content.ContentValues;
import android.content.Context;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: acom */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acom extends ftv {

    /* renamed from: d */
    public static final String[] f60348d = {"_id", "msg_type"};

    /* renamed from: e */
    public static final String[] f60349e = {"_id", "msg_type", "date"};

    /* renamed from: f */
    private static acom f60350f;

    /* renamed from: g */
    private final abym f60351g;

    /* renamed from: a */
    public static synchronized acom m49611a(Context context, ftw ftw) {
        acom acom;
        synchronized (acom.class) {
            if (f60350f == null) {
                f60350f = new acom(context, ftw);
            }
            acom = f60350f;
        }
        return acom;
    }

    /* renamed from: b */
    private static final void m49612b(SQLiteDatabase sQLiteDatabase) {
        acnv.m49555d("Dropping mmssms index by executing: %s", "DROP INDEX IF EXISTS mmssms_idx");
        sQLiteDatabase.execSQL("DROP INDEX IF EXISTS mmssms_idx");
        acnv.m49555d("Creating mmssms index by executing: %s", "CREATE INDEX mmssms_idx ON mmssms(uri)");
        sQLiteDatabase.execSQL("CREATE INDEX mmssms_idx ON mmssms(uri)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo11314a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo11321d() {
        return ((Boolean) abzt.f58872aM.mo58455c()).booleanValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final SQLiteDatabase mo32958e() {
        try {
            return getReadableDatabase();
        } catch (SQLiteException e) {
            this.f60351g.mo32447a("sms_read_db_exception");
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final SQLiteDatabase mo32959f() {
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            this.f60351g.mo32447a("sms_write_db_exception");
            return null;
        }
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        acnv.m49548b("Downgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        sra.m36066a(sQLiteDatabase);
        onCreate(sQLiteDatabase);
    }

    public acom(Context context, ftw ftw) {
        super(context, "icing_mmssms.db", 4, ftw);
        this.f60351g = new abym(context);
    }

    /* renamed from: a */
    public final int mo32955a(String str, boolean z) {
        SQLiteDatabase e = mo32958e();
        if (e == null) {
            acnv.m49556e("Got null db in SmsCorpusDbOpenHelper's getIdCount.");
            return 0;
        } else if (z) {
            return (int) DatabaseUtils.queryNumEntries(e, "mmssms_tag", "msg_type=? AND tag=?", new String[]{str, "unread"});
        } else {
            return (int) DatabaseUtils.queryNumEntries(e, "mmssms", "msg_type=?", new String[]{str});
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final int mo32956a(List list, String str) {
        SQLiteDatabase f = mo32959f();
        if (f == null) {
            acnv.m49556e("Got null db in SmsCorpusDbOpenHelper.updateReadStatus");
            return 0;
        }
        f.beginTransaction();
        try {
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf((Integer) it.next()), str});
            }
            f.setTransactionSuccessful();
            f.endTransaction();
            acnv.m49552c("Updated %d readstatus for %s", Integer.valueOf(i), str);
            return i;
        } catch (Throwable th) {
            f.endTransaction();
            throw th;
        }
    }

    /* renamed from: a */
    public final acol mo32957a(String str, Iterator it) {
        long j;
        String str2 = str;
        SQLiteDatabase f = mo32959f();
        if (f != null) {
            C1240of ofVar = null;
            int i = 0;
            int i2 = 0;
            while (it.hasNext()) {
                acnx acnx = (acnx) it.next();
                if (acnx != null) {
                    f.beginTransaction();
                    try {
                        ContentValues contentValues = new ContentValues();
                        sra.m36064a(contentValues, "_id", Integer.valueOf(acnx.mo32853a()));
                        sra.m36065a(contentValues, "msg_type", acnx.mo32854b());
                        sra.m36065a(contentValues, "uri", acnx.mo32855c());
                        sra.m36064a(contentValues, "type", acnx.mo32856d());
                        sra.m36064a(contentValues, "thread_id", acnx.mo32857e());
                        sra.m36065a(contentValues, "address", acnx.mo32860g());
                        contentValues.put("date", Long.valueOf(acnx.mo32859f()));
                        sra.m36065a(contentValues, "subject", acnx.mo32861h());
                        sra.m36065a(contentValues, "body", acnx.mo32863i());
                        sra.m36064a(contentValues, "score", Integer.valueOf(acnx.mo32864j()));
                        sra.m36065a(contentValues, "content_type", acnx.mo32865k());
                        sra.m36065a(contentValues, "media_uri", acnx.mo32866l());
                        f.insert("mmssms", null, contentValues);
                        f.delete("mmssms_tag", "_id=? AND msg_type=?", new String[]{String.valueOf(acnx.mo32853a()), str2});
                        if (!"sms".equals(str2)) {
                            j = TimeUnit.MILLISECONDS.toSeconds(acnx.mo32859f());
                        } else {
                            j = acnx.mo32859f();
                        }
                        if (!acnx.mo32867m()) {
                            ContentValues contentValues2 = new ContentValues();
                            contentValues2.put("_id", Integer.valueOf(acnx.mo32853a()));
                            contentValues2.put("msg_type", str2);
                            contentValues2.put("uri", acnx.mo32855c());
                            contentValues2.put("tag", "unread");
                            contentValues2.put("date", Long.valueOf(j));
                            f.insert("mmssms_tag", null, contentValues2);
                            i2++;
                        }
                        i++;
                        ofVar = new C1240of(Long.valueOf(j), Integer.valueOf(acnx.mo32853a()));
                        f.setTransactionSuccessful();
                    } finally {
                        f.endTransaction();
                    }
                }
            }
            acnv.m49553c("Ingested %d %s (%d unread) into corpus", Integer.valueOf(i), str2, Integer.valueOf(i2));
            return new acol(i, ofVar);
        }
        acnv.m49557e("Got null db SmsCorpusDbOpenHelper.processNewMessages for %s", str2);
        return new acol(0, null);
    }

    /* renamed from: a */
    public final void mo11312a(SQLiteDatabase sQLiteDatabase) {
        acnv.m49555d("Dropping mmssms table by executing: %s", "DROP TABLE IF EXISTS mmssms");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms");
        acnv.m49555d("Creating mmssms table by executing: %s", "CREATE TABLE mmssms(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,type INTEGER,thread_id INTEGER,address TEXT,date INTEGER,subject TEXT,body TEXT,score INTEGER,content_type TEXT,media_uri TEXT,read INTEGER DEFAULT 0,UNIQUE(_id,msg_type) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("CREATE TABLE mmssms(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,type INTEGER,thread_id INTEGER,address TEXT,date INTEGER,subject TEXT,body TEXT,score INTEGER,content_type TEXT,media_uri TEXT,read INTEGER DEFAULT 0,UNIQUE(_id,msg_type) ON CONFLICT REPLACE)");
        m49612b(sQLiteDatabase);
        acnv.m49555d("Dropping mmssms_tag table by executing: %s", "DROP TABLE IF EXISTS mmssms_tag");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mmssms_tag");
        acnv.m49555d("Creating mmssms_tag table by executing: %s", "CREATE TABLE mmssms_tag(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,tag TEXT NOT NULL,date INTEGER DEFAULT 0,UNIQUE(_id,msg_type,tag) ON CONFLICT REPLACE)");
        sQLiteDatabase.execSQL("CREATE TABLE mmssms_tag(_id INTEGER NOT NULL,msg_type TEXT NOT NULL,uri TEXT NOT NULL,tag TEXT NOT NULL,date INTEGER DEFAULT 0,UNIQUE(_id,msg_type,tag) ON CONFLICT REPLACE)");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11313a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        acnv.m49548b("Upgrading mmssms DB from version %d to version %d", Integer.valueOf(i), Integer.valueOf(i2));
        if (i < 2) {
            onCreate(sQLiteDatabase);
        } else if (i < 3) {
            onCreate(sQLiteDatabase);
        } else if (i < 4) {
            m49612b(sQLiteDatabase);
        }
    }
}
