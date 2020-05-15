package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: sqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sqj {

    /* renamed from: a */
    public final Object f44962a = new Object();

    /* renamed from: b */
    public final Object f44963b = new Object();

    /* renamed from: c */
    public SQLiteDatabase f44964c;

    /* renamed from: d */
    public int f44965d;

    /* renamed from: e */
    public final C1225nr f44966e;

    /* renamed from: f */
    ScheduledFuture f44967f;

    /* renamed from: g */
    final Runnable f44968g = new sqf(this);

    /* renamed from: h */
    private final String f44969h;

    /* renamed from: i */
    private final ScheduledExecutorService f44970i;

    /* renamed from: j */
    private final long f44971j;

    /* renamed from: k */
    private final long f44972k;

    /* renamed from: l */
    private final TimeUnit f44973l;

    /* renamed from: m */
    private final SQLiteOpenHelper f44974m;

    /* renamed from: n */
    private final sqh f44975n;

    public sqj(SQLiteOpenHelper sQLiteOpenHelper, String str, sqh sqh, ScheduledExecutorService scheduledExecutorService, long j, TimeUnit timeUnit, int i) {
        boolean z;
        if (i < 0) {
            Log.w("CachingDatabaseWriter", "buffer size should be >= 0");
        }
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34975b(z, "bufferSize must be >= 0");
        this.f44974m = sQLiteOpenHelper;
        this.f44969h = str;
        this.f44975n = sqh;
        this.f44970i = scheduledExecutorService;
        this.f44971j = (long) i;
        this.f44972k = j;
        this.f44973l = timeUnit;
        this.f44966e = new C1225nr(i);
    }

    /* renamed from: a */
    public final int mo25969a(String str, String str2, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int delete;
        synchronized (this.f44962a) {
            ScheduledFuture scheduledFuture = this.f44967f;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            synchronized (this.f44963b) {
                mo25973a(this.f44966e);
                this.f44966e.clear();
                try {
                    writableDatabase = this.f44974m.getWritableDatabase();
                    delete = writableDatabase.delete(str, str2, strArr);
                    if (writableDatabase != null) {
                        writableDatabase.close();
                    }
                } catch (SQLiteException e) {
                    Log.e("CachingDatabaseWriter", "Unable to open database", e);
                    return -1;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            }
        }
        return delete;
        throw th;
    }

    /* renamed from: a */
    public final Cursor mo25970a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4) {
        Cursor query;
        synchronized (this.f44963b) {
            try {
                SQLiteDatabase readableDatabase = this.f44974m.getReadableDatabase();
                this.f44964c = readableDatabase;
                this.f44965d++;
                query = readableDatabase.query(str, strArr, str2, strArr2, null, null, str3, str4);
            } catch (SQLiteException e) {
                Log.e("CachingDatabaseWriter", "Unable to open database", e);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return query;
    }

    /* renamed from: a */
    public final void mo25971a() {
        this.f44970i.execute(new sqg(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r6.isDone() != false) goto L_0x001e;
     */
    /* renamed from: a */
    public final void mo25972a(Object obj) {
        synchronized (this.f44962a) {
            this.f44966e.add(obj);
            if (((long) this.f44966e.f26758b) < this.f44971j) {
                ScheduledFuture scheduledFuture = this.f44967f;
                if (scheduledFuture == null) {
                }
                this.f44967f = ((sny) this.f44970i).schedule(this.f44968g, this.f44972k, this.f44973l);
            } else {
                ScheduledFuture scheduledFuture2 = this.f44967f;
                if (scheduledFuture2 != null) {
                    scheduledFuture2.cancel(false);
                }
                this.f44970i.execute(new sqi(this, this.f44966e));
                this.f44966e.clear();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public final void mo25973a(C1225nr nrVar) {
        int i = nrVar.f26758b;
        if (i != 0) {
            ContentValues contentValues = new ContentValues();
            SQLiteDatabase sQLiteDatabase = null;
            try {
                SQLiteDatabase writableDatabase = this.f44974m.getWritableDatabase();
                try {
                    writableDatabase.beginTransaction();
                    for (int i2 = 0; i2 < i; i2++) {
                        this.f44975n.mo25757a(nrVar.mo15513b(i2), contentValues);
                        writableDatabase.insert(this.f44969h, null, contentValues);
                        contentValues.clear();
                    }
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase != null) {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    }
                } catch (SQLiteException e) {
                    e = e;
                    sQLiteDatabase = writableDatabase;
                    try {
                        Log.e("CachingDatabaseWriter", e.getMessage());
                        if (sQLiteDatabase == null) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (sQLiteDatabase != null) {
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteDatabase = writableDatabase;
                    if (sQLiteDatabase != null) {
                    }
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                Log.e("CachingDatabaseWriter", e.getMessage());
                if (sQLiteDatabase == null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
            } catch (Throwable th3) {
                th = th3;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
    }
}
