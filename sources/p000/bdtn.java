package p000;

import android.accounts.Account;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: bdtn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdtn implements bdtj {

    /* renamed from: a */
    public static final String[] f106422a = {"CREATE TABLE continuation_token(token BLOB)", "CREATE TABLE push_payloads(id INTEGER PRIMARY KEY AUTOINCREMENT,timestamp_millis INTEGER, payload BLOB)"};

    /* renamed from: b */
    public static final String[] f106423b = {"continuation_token", "push_payloads"};

    /* renamed from: c */
    public final SQLiteDatabase f106424c;

    /* renamed from: d */
    private final int f106425d;

    /* renamed from: e */
    private final long f106426e;

    private bdtn(SQLiteDatabase sQLiteDatabase, int i, long j) {
        this.f106424c = sQLiteDatabase;
        this.f106425d = i;
        this.f106426e = j;
    }

    /* renamed from: a */
    public static bdtn m91418a(File file, Account account, int i, long j, TimeUnit timeUnit) {
        try {
            SQLiteDatabase a = bdwd.m91505a(file, new bdtl());
            bdwa.m91503a(a, account, new bdtk(a));
            return new bdtn(a, i, timeUnit.toMillis(j));
        } catch (SQLException e) {
            throw new bdvx(e);
        }
    }

    public final void close() {
        try {
            this.f106424c.close();
        } catch (SQLException e) {
            throw new bdvx(e);
        }
    }

    /* renamed from: a */
    private final void m91419a() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.f106426e;
        this.f106424c.delete("push_payloads", "timestamp_millis<?", new String[]{Long.toString(currentTimeMillis - j)});
    }

    /* renamed from: a */
    public final bdtm mo58348a(boolean z) {
        Cursor query;
        Throwable th;
        bmxv bmxv;
        long j;
        Cursor query2;
        Throwable th2;
        bmxy.m108600b(this.f106424c.isOpen());
        try {
            this.f106424c.beginTransaction();
            try {
                m91419a();
                query = this.f106424c.query("continuation_token", new String[]{"token"}, null, null, null, null, null);
                if (query.moveToNext()) {
                    bmxv = bmxv.m108566b(bxtx.m123261a(query.getBlob(0)));
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (query != null) {
                    query.close();
                }
                bngs j2 = bngx.m109377j();
                long j3 = Long.MIN_VALUE;
                if (z) {
                    query2 = this.f106424c.query("push_payloads", new String[]{"id", "payload"}, null, null, null, null, "id");
                    while (query2.moveToNext()) {
                        j3 = Math.max(j3, query2.getLong(0));
                        j2.mo67668c(bxtx.m123261a(query2.getBlob(1)));
                    }
                    if (query2 != null) {
                        query2.close();
                    }
                    j = j3;
                } else {
                    j = Long.MIN_VALUE;
                }
                bdtm bdtm = new bdtm(this, bmxv, j2.mo67664a(), j);
                this.f106424c.setTransactionSuccessful();
                this.f106424c.endTransaction();
                return bdtm;
                throw th2;
                throw th;
            } catch (Throwable th3) {
                this.f106424c.endTransaction();
                throw th3;
            }
        } catch (SQLException e) {
            throw new bdvx(e);
        }
    }

    /* renamed from: a */
    public final void mo58354a(long j) {
        this.f106424c.delete("push_payloads", "id<=?", new String[]{Long.toString(j)});
    }

    /* renamed from: a */
    public final void mo58349a(bxtx bxtx) {
        bmxy.m108600b(this.f106424c.isOpen());
        try {
            this.f106424c.beginTransaction();
            ContentValues contentValues = new ContentValues(2);
            contentValues.put("timestamp_millis", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("payload", bxtx.mo73780k());
            mo58354a(this.f106424c.insertOrThrow("push_payloads", null, contentValues) - ((long) this.f106425d));
            m91419a();
            this.f106424c.setTransactionSuccessful();
            this.f106424c.endTransaction();
        } catch (SQLException e) {
            throw new bdvx(e);
        } catch (Throwable th) {
            this.f106424c.endTransaction();
            throw th;
        }
    }
}
