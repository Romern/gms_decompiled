package p000;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.OperationApplicationException;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import com.google.android.chimera.ContentProvider;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: sgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class sgo extends ContentProvider implements SQLiteTransactionListener {

    /* renamed from: a */
    protected static final ReentrantLock f44429a = new ReentrantLock();

    /* renamed from: b */
    private volatile boolean f44430b;

    /* renamed from: c */
    private final ThreadLocal f44431c = new ThreadLocal();

    /* renamed from: a */
    protected static final int m35213a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String str2, ContentValues contentValues) {
        long parseId = ContentUris.parseId(uri);
        return sQLiteDatabase.update(str, contentValues, str2.concat("=?"), new String[]{String.valueOf(parseId)});
    }

    /* renamed from: g */
    private final boolean m35216g() {
        return this.f44431c.get() != null && ((Boolean) this.f44431c.get()).booleanValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo7298a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues, String str, String[] strArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo7299a(SQLiteDatabase sQLiteDatabase, Uri uri, String str, String[] strArr);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AssetFileDescriptor mo7300a(Uri uri, String str);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Cursor mo7301a(SQLiteDatabase sQLiteDatabase, Uri uri, String[] strArr, String str, String[] strArr2, String str2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Uri mo7302a(SQLiteDatabase sQLiteDatabase, Uri uri, ContentValues contentValues);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo7303a();

    public final ContentProviderResult[] applyBatch(ArrayList arrayList) {
        if (m35214a(arrayList) == null) {
            return new ContentProviderResult[0];
        }
        f44429a.lock();
        try {
            ContentProviderResult[] a = m35215a(mo7305c().getWritableDatabase(), arrayList);
            f44429a.unlock();
            return a;
        } catch (SQLiteCantOpenDatabaseException e) {
            throw new OperationApplicationException(e);
        } catch (Throwable th) {
            f44429a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract String mo7304b();

    public final int bulkInsert(Uri uri, ContentValues[] contentValuesArr) {
        SQLiteDatabase writableDatabase;
        f44429a.lock();
        try {
            writableDatabase = mo7305c().getWritableDatabase();
            int length = contentValuesArr.length;
            writableDatabase.beginTransactionWithListener(this);
            for (ContentValues contentValues : contentValuesArr) {
                if (mo7302a(writableDatabase, uri, contentValues) != null) {
                    this.f44430b = true;
                }
                boolean z = this.f44430b;
                writableDatabase.yieldIfContendedSafely();
                this.f44430b = z;
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            mo25497f();
            f44429a.unlock();
            return length;
        } catch (Throwable th) {
            f44429a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract SQLiteOpenHelper mo7305c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo25495d() {
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int i;
        f44429a.lock();
        try {
            writableDatabase = mo7305c().getWritableDatabase();
            if (m35216g()) {
                i = mo7299a(writableDatabase, uri, str, strArr);
                if (i > 0) {
                    this.f44430b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                i = mo7299a(writableDatabase, uri, str, strArr);
                if (i > 0) {
                    this.f44430b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                mo25497f();
            }
            f44429a.unlock();
            return i;
        } catch (Throwable th) {
            f44429a.unlock();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo25496e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo25497f() {
        if (this.f44430b) {
            this.f44430b = false;
            mo7303a();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Uri insert(Uri uri, ContentValues contentValues) {
        SQLiteDatabase writableDatabase;
        Uri uri2;
        f44429a.lock();
        try {
            writableDatabase = mo7305c().getWritableDatabase();
            if (m35216g()) {
                uri2 = mo7302a(writableDatabase, uri, contentValues);
                if (uri2 != null) {
                    this.f44430b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                uri2 = mo7302a(writableDatabase, uri, contentValues);
                if (uri2 != null) {
                    this.f44430b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                mo25497f();
            }
            f44429a.unlock();
            return uri2;
        } catch (SQLiteCantOpenDatabaseException e) {
            try {
                Log.e("BaseGmsContentProvider", "Failed to open db", e);
                f44429a.unlock();
                return null;
            } catch (Throwable th) {
                f44429a.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            writableDatabase.endTransaction();
            throw th2;
        }
    }

    public final void onBegin() {
        mo25495d();
    }

    public final void onCommit() {
        mo25496e();
    }

    public boolean onCreate() {
        return true;
    }

    public final void onRollback() {
    }

    public final AssetFileDescriptor openAssetFile(Uri uri, String str) {
        f44429a.lock();
        try {
            return mo7300a(uri, str);
        } finally {
            f44429a.unlock();
        }
    }

    /* JADX INFO: finally extract failed */
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        f44429a.lock();
        try {
            Cursor a = mo7301a(mo7305c().getReadableDatabase(), uri, strArr, str, strArr2, str2);
            f44429a.unlock();
            return a;
        } catch (SQLiteCantOpenDatabaseException e) {
            Log.e("BaseGmsContentProvider", "Failed to open db", e);
            f44429a.unlock();
            return null;
        } catch (Throwable th) {
            f44429a.unlock();
            throw th;
        }
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase;
        int i;
        f44429a.lock();
        try {
            writableDatabase = mo7305c().getWritableDatabase();
            if (m35216g()) {
                i = mo7298a(writableDatabase, uri, contentValues, str, strArr);
                if (i > 0) {
                    this.f44430b = true;
                }
            } else {
                writableDatabase.beginTransactionWithListener(this);
                i = mo7298a(writableDatabase, uri, contentValues, str, strArr);
                if (i > 0) {
                    this.f44430b = true;
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                mo25497f();
            }
            f44429a.unlock();
            return i;
        } catch (Throwable th) {
            f44429a.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    private final Uri m35214a(ArrayList arrayList) {
        if (arrayList.size() == 0) {
            return null;
        }
        Uri uri = ((ContentProviderOperation) arrayList.get(0)).getUri();
        String b = mo7304b();
        if (!Build.TYPE.equals("user")) {
            int size = arrayList.size();
            for (int i = 1; i < size; i++) {
                ((ContentProviderOperation) arrayList.get(i)).getUri();
                rzz.m34730a(sdg.m34949a(b, mo7304b()), "URIs in batch operation refer to different databases");
            }
        }
        return uri;
    }

    /* renamed from: a */
    private final ContentProviderResult[] m35215a(SQLiteDatabase sQLiteDatabase, ArrayList arrayList) {
        sQLiteDatabase.beginTransactionWithListener(this);
        try {
            this.f44431c.set(true);
            int size = arrayList.size();
            ContentProviderResult[] contentProviderResultArr = new ContentProviderResult[size];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < size) {
                i2++;
                if (i2 <= 500) {
                    try {
                        ContentProviderOperation contentProviderOperation = (ContentProviderOperation) arrayList.get(i);
                        if (i > 0) {
                            if (contentProviderOperation.isYieldAllowed()) {
                                boolean z = this.f44430b;
                                if (sQLiteDatabase.yieldIfContendedSafely(4000)) {
                                    m35214a(arrayList);
                                    sQLiteDatabase = mo7305c().getWritableDatabase();
                                    this.f44430b = z;
                                    i3++;
                                }
                                i2 = 0;
                            }
                        }
                        contentProviderResultArr[i] = contentProviderOperation.apply(getContainerContentProvider(), contentProviderResultArr, i);
                        i++;
                    } catch (SQLiteCantOpenDatabaseException e) {
                        e = e;
                        try {
                            throw new OperationApplicationException(e);
                        } catch (Throwable th) {
                            th = th;
                            this.f44431c.set(false);
                            sQLiteDatabase.endTransaction();
                            mo25497f();
                            throw th;
                        }
                    }
                } else {
                    throw new OperationApplicationException("Too many content provider operations between yield points. The maximum number of operations per yield point is 500", i3);
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            this.f44431c.set(false);
            sQLiteDatabase.endTransaction();
            mo25497f();
            return contentProviderResultArr;
        } catch (SQLiteCantOpenDatabaseException e2) {
            e = e2;
            throw new OperationApplicationException(e);
        } catch (Throwable th2) {
            th = th2;
            this.f44431c.set(false);
            sQLiteDatabase.endTransaction();
            mo25497f();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Uri mo25494a(SQLiteDatabase sQLiteDatabase, Uri uri, Uri uri2, String str, ContentValues contentValues, String str2, String[] strArr) {
        int update = update(uri2, contentValues, str2, strArr);
        if (update == 1) {
            Cursor query = query(uri2, new String[]{"_id"}, str2, strArr, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        long j = query.getLong(0);
                        query.close();
                        return ContentUris.withAppendedId(uri, j);
                    }
                } catch (Throwable th) {
                    if (query != null) {
                        query.close();
                    }
                    throw th;
                }
            }
            String valueOf = String.valueOf(uri2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35);
            sb.append("Could not find internal ID for URI ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        if (update == 0) {
            long insert = sQLiteDatabase.insert(str, null, contentValues);
            if (insert >= 0) {
                return ContentUris.withAppendedId(uri, insert);
            }
        } else if (update > 1) {
            throw new IllegalArgumentException("Upsert affected multiple rows");
        }
        return null;
    }
}
