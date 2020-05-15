package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqbp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbp {

    /* renamed from: a */
    private static final String[] f85595a = {"hash", "find_threat_matches_response_proto", "time_cached_ms"};

    /* renamed from: b */
    private final aqbs f85596b;

    /* renamed from: c */
    private SQLiteDatabase f85597c;

    static {
        aqbp.class.getSimpleName();
    }

    public aqbp(aqbs aqbs) {
        this.f85596b = aqbs;
    }

    /* renamed from: a */
    private final void m71315a() {
        aqbs aqbs = this.f85596b;
        if (aqbs != null) {
            try {
                this.f85597c = aqbs.getWritableDatabase();
                return;
            } catch (SQLException e) {
            }
        }
        this.f85597c = null;
    }

    /* renamed from: b */
    private final void m71316b() {
        SQLiteDatabase sQLiteDatabase = this.f85597c;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0083 A[Catch:{ bxwf | NullPointerException -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008f A[Catch:{ bxwf | NullPointerException -> 0x005a }] */
    /* renamed from: a */
    public final synchronized void mo47739a(aqbw aqbw) {
        m71315a();
        SQLiteDatabase sQLiteDatabase = this.f85597c;
        if (sQLiteDatabase != null) {
            Cursor cursor = null;
            try {
                cursor = sQLiteDatabase.query("cache", f85595a, null, null, null, null, null);
                while (cursor.moveToNext()) {
                    try {
                        try {
                            byte[] blob = cursor.getBlob(cursor.getColumnIndexOrThrow("hash"));
                            byte[] blob2 = cursor.getBlob(cursor.getColumnIndexOrThrow("find_threat_matches_response_proto"));
                            long j = cursor.getLong(cursor.getColumnIndexOrThrow("time_cached_ms"));
                            aqbv aqbv = new aqbv();
                            aqbv.f85614a = (aqcr) bxvk.m124016a(aqcr.f85693e, blob2, bxus.m123744c());
                            aqbv.f85615b = j;
                            aqbw.mo47749a(aqbw.f85616a, new apgr(blob), aqbv);
                        } catch (bxwf | NullPointerException e) {
                            Map map = aqbw.f85616a;
                            if (map != null) {
                                map.clear();
                            }
                            aqbs.m71321c(this.f85597c);
                            if (cursor != null) {
                                cursor.close();
                            }
                        }
                    } catch (SQLException e2) {
                        if (cursor != null) {
                        }
                        m71316b();
                    } catch (IllegalArgumentException e3) {
                        if (cursor != null) {
                        }
                        m71316b();
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                        }
                        m71316b();
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            } catch (SQLException e4) {
                if (cursor != null) {
                    cursor.close();
                }
                m71316b();
            } catch (IllegalArgumentException e5) {
                if (cursor != null) {
                }
                m71316b();
            } catch (Throwable th2) {
                th = th2;
                if (cursor != null) {
                    cursor.close();
                }
                m71316b();
                throw th;
            }
            m71316b();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0140=Splitter:B:56:0x0140, B:42:0x0119=Splitter:B:42:0x0119, B:46:0x011e=Splitter:B:46:0x011e} */
    /* renamed from: b */
    public final synchronized boolean mo47740b(aqbw aqbw) {
        if (aqbw != null) {
            HashMap hashMap = new HashMap();
            aqbw.f85617b.readLock().lock();
            try {
                for (Map.Entry entry : aqbw.f85616a.entrySet()) {
                    aqbu aqbu = (aqbu) entry.getValue();
                    if (aqbu != null) {
                        Map map = aqbu.f85612a;
                        if (map != null) {
                            for (Map.Entry entry2 : map.entrySet()) {
                                hashMap.put((apgr) entry2.getKey(), (aqbv) entry2.getValue());
                            }
                        }
                        Map map2 = aqbu.f85613b;
                        if (map2 != null) {
                            for (Map.Entry entry3 : map2.entrySet()) {
                                hashMap.put((apgr) entry3.getKey(), (aqbv) entry3.getValue());
                            }
                        }
                    }
                }
                aqbw.f85617b.readLock().unlock();
                if (!hashMap.isEmpty()) {
                    m71315a();
                    SQLiteDatabase sQLiteDatabase = this.f85597c;
                    if (sQLiteDatabase != null) {
                        sQLiteDatabase.beginTransaction();
                        this.f85597c.execSQL(String.format("DELETE FROM %s", "cache"));
                        for (Map.Entry entry4 : hashMap.entrySet()) {
                            aqbv aqbv = (aqbv) entry4.getValue();
                            if (aqbv != null) {
                                ContentValues contentValues = new ContentValues();
                                contentValues.put("hash", ((apgr) entry4.getKey()).f84346a);
                                contentValues.put("find_threat_matches_response_proto", aqbv.f85614a.mo73642k());
                                contentValues.put("time_cached_ms", Long.valueOf(aqbv.f85615b));
                                this.f85597c.replace("cache", null, contentValues);
                            }
                        }
                        this.f85597c.setTransactionSuccessful();
                        try {
                            SQLiteDatabase sQLiteDatabase2 = this.f85597c;
                            if (sQLiteDatabase2 != null) {
                                sQLiteDatabase2.endTransaction();
                                this.f85597c.execSQL(String.format("VACUUM %s", "cache"));
                            }
                        } catch (SQLException | IllegalStateException e) {
                        }
                        m71316b();
                        return true;
                    }
                    m71316b();
                }
            } catch (SQLException | IllegalStateException e2) {
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.f85597c;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.endTransaction();
                        this.f85597c.execSQL(String.format("VACUUM %s", "cache"));
                    }
                } catch (SQLException | IllegalStateException e3) {
                }
            } catch (Throwable th) {
                try {
                    SQLiteDatabase sQLiteDatabase4 = this.f85597c;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.endTransaction();
                        this.f85597c.execSQL(String.format("VACUUM %s", "cache"));
                    }
                } catch (SQLException | IllegalStateException e4) {
                }
                m71316b();
                throw th;
            }
        }
    }
}
