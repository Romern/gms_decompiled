package p000;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteFullException;
import android.util.Log;
import java.io.File;
import java.util.Locale;

/* renamed from: bdwd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdwd {
    /* renamed from: a */
    public static SQLiteDatabase m91505a(File file, bdwc bdwc) {
        if (!file.exists()) {
            return m91506b(file, bdwc);
        }
        SQLiteDatabase c = m91507c(file, bdwc);
        if (c != null) {
            return c;
        }
        SQLiteDatabase.deleteDatabase(file);
        return m91506b(file, bdwc);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0035  */
    /* renamed from: b */
    private static SQLiteDatabase m91506b(File file, bdwc bdwc) {
        boolean z;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
            try {
                sQLiteDatabase.beginTransaction();
                int version = sQLiteDatabase.getVersion();
                int i = bdwc.f106520a;
                if (version == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108600b(z);
                bdwc.mo58352a(sQLiteDatabase);
                sQLiteDatabase.setVersion(i);
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                return sQLiteDatabase;
            } catch (Exception e) {
                e = e;
                Log.w("SQLiteDatabaseCreator", "Failed to create database", e);
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                SQLiteDatabase.deleteDatabase(file);
                throw e;
            } catch (Throwable th) {
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            Log.w("SQLiteDatabaseCreator", "Failed to create database", e);
            if (sQLiteDatabase != null) {
            }
            SQLiteDatabase.deleteDatabase(file);
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x004d, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x004f, code lost:
        r9 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0055, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0088, code lost:
        r8.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x004d A[ExcHandler: Exception (e java.lang.Exception), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004f A[ExcHandler: SQLiteDatabaseCorruptException | SQLiteDiskIOException | SQLiteFullException (e java.lang.Throwable), Splitter:B:5:0x0018] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0088  */
    /* renamed from: c */
    private static SQLiteDatabase m91507c(File file, bdwc bdwc) {
        SQLiteDatabase sQLiteDatabase;
        boolean z;
        if (file.length() != 0) {
            int i = bdwc.f106520a;
            int i2 = -1;
            try {
                sQLiteDatabase = SQLiteDatabase.openOrCreateDatabase(file, (SQLiteDatabase.CursorFactory) null);
                try {
                    sQLiteDatabase.beginTransaction();
                    try {
                        i2 = sQLiteDatabase.getVersion();
                        if (i2 > 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        try {
                            bmxy.m108600b(z);
                            if (i2 != i) {
                                if (i2 < i) {
                                    throw new bdwb();
                                } else if (i2 <= i) {
                                    sQLiteDatabase.setVersion(i);
                                } else {
                                    throw new bdwb();
                                }
                            }
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            return sQLiteDatabase;
                        } catch (Throwable th) {
                            th = th;
                            sQLiteDatabase.endTransaction();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase.endTransaction();
                        throw th;
                    }
                } catch (bdwb e) {
                    e = e;
                    Log.w("SQLiteDatabaseCreator", String.format(Locale.US, "Cannot migrate database from version %d to %d", Integer.valueOf(i2), Integer.valueOf(i)), e);
                    if (sQLiteDatabase != null) {
                    }
                    return null;
                } catch (SQLiteDatabaseCorruptException | SQLiteDiskIOException | SQLiteFullException e2) {
                } catch (Exception e3) {
                }
            } catch (bdwb e4) {
                e = e4;
                sQLiteDatabase = null;
                Log.w("SQLiteDatabaseCreator", String.format(Locale.US, "Cannot migrate database from version %d to %d", Integer.valueOf(i2), Integer.valueOf(i)), e);
                if (sQLiteDatabase != null) {
                }
                return null;
            } catch (SQLiteDatabaseCorruptException | SQLiteDiskIOException | SQLiteFullException e5) {
                Throwable e6 = e5;
                sQLiteDatabase = null;
                Log.w("SQLiteDatabaseCreator", "Failed to open/migrate database", e6);
                if (sQLiteDatabase != null) {
                }
                return null;
            } catch (Exception e7) {
                e = e7;
                sQLiteDatabase = null;
                Log.e("SQLiteDatabaseCreator", "Failed to open/migrate database", e);
                if (sQLiteDatabase != null) {
                }
                return null;
            }
        } else {
            Log.w("SQLiteDatabaseCreator", "Database file is empty");
            return null;
        }
    }
}
