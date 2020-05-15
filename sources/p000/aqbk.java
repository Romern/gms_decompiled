package p000;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.leveldb.WriteBatch;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: aqbk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqbk extends aqas {

    /* renamed from: c */
    private static final byte[] f85564c = {0};

    /* renamed from: d */
    private final int f85565d;

    /* renamed from: e */
    private final aqbs f85566e;

    /* renamed from: f */
    private SQLiteDatabase f85567f;

    /* renamed from: g */
    private final String f85568g;

    /* renamed from: h */
    private LevelDb f85569h;

    static {
        aqbk.class.getSimpleName();
    }

    public aqbk(Context context, int i, aqbs aqbs) {
        super(context);
        this.f85565d = i;
        StringBuilder sb = new StringBuilder(21);
        sb.append("blacklist_");
        sb.append(i);
        String valueOf = String.valueOf(sb.toString());
        this.f85568g = valueOf.length() == 0 ? new String("snet_sb_") : "snet_sb_".concat(valueOf);
        this.f85566e = aqbs;
        LevelDb levelDb = (LevelDb) aqbo.f85579l.get(this.f85565d);
        this.f85569h = levelDb;
        if (levelDb == null) {
            this.f85569h = mo47720a(false, null, this.f85568g);
            aqbo.f85579l.put(this.f85565d, this.f85569h);
        }
    }

    /* renamed from: d */
    private final void m71302d() {
        aqbs aqbs = this.f85566e;
        if (aqbs != null) {
            try {
                this.f85567f = aqbs.getWritableDatabase();
                return;
            } catch (SQLException e) {
            }
        }
        this.f85567f = null;
    }

    /* renamed from: e */
    private final void m71303e() {
        SQLiteDatabase sQLiteDatabase = this.f85567f;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo47728a() {
        LevelDb levelDb = this.f85569h;
        if (levelDb != null) {
            try {
                levelDb.close();
            } catch (IllegalStateException e) {
            }
        }
        aqbo.f85579l.delete(this.f85565d);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0058 A[SYNTHETIC, Splitter:B:37:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0064 A[SYNTHETIC, Splitter:B:45:0x0064] */
    /* renamed from: c */
    public final synchronized List mo47731c() {
        ArrayList arrayList;
        LevelDb levelDb;
        LevelDb.Iterator iterator;
        arrayList = new ArrayList();
        LevelDb.Iterator iterator2 = null;
        if (!this.f85473b && (levelDb = this.f85569h) != null) {
            try {
                iterator = levelDb.iterator();
                try {
                    iterator.seekToFirst();
                    if (iterator.isValid()) {
                        while (iterator.isValid()) {
                            byte[] key = iterator.key();
                            if (key != null) {
                                arrayList.add(new apgr(key));
                                iterator.next();
                            } else if (iterator != null) {
                                try {
                                    iterator.close();
                                } catch (Exception e) {
                                }
                            }
                        }
                        if (iterator != null) {
                            try {
                                iterator.close();
                            } catch (Exception e2) {
                            }
                        }
                    } else if (iterator != null) {
                        try {
                            iterator.close();
                        } catch (Exception e3) {
                        }
                    }
                } catch (Exception | OutOfMemoryError e4) {
                    if (iterator != null) {
                        try {
                            iterator.close();
                        } catch (Exception e5) {
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    iterator2 = iterator;
                    if (iterator2 != null) {
                        try {
                            iterator2.close();
                        } catch (Exception e6) {
                        }
                    }
                    throw th;
                }
            } catch (Exception | OutOfMemoryError e7) {
                iterator = null;
                if (iterator != null) {
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (iterator2 != null) {
                }
                throw th;
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x00f0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC, Splitter:B:69:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4 A[SYNTHETIC, Splitter:B:76:0x00e4] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:53:0x00be=Splitter:B:53:0x00be, B:72:0x00de=Splitter:B:72:0x00de, B:43:0x00af=Splitter:B:43:0x00af} */
    /* renamed from: a */
    public final synchronized void mo47729a(aqbt aqbt, aqby aqby) {
        if (aqby != null) {
            aqbt.f85608c.readLock().lock();
            try {
                byte[] bArr = aqbt.f85609d;
                aqbt.f85608c.readLock().unlock();
                byte[] a = aqbt.mo47747a();
                if (!(bArr == null || bArr.length == 0)) {
                    LevelDb levelDb = this.f85569h;
                    if (levelDb != null) {
                        try {
                            levelDb.iterator().close();
                            mo47728a();
                        } catch (Exception e) {
                        }
                    }
                    try {
                        LevelDb.destroy(new File(mo47721b(), this.f85568g));
                        LevelDb levelDb2 = (LevelDb) aqbo.f85579l.get(this.f85565d);
                        this.f85569h = levelDb2;
                        WriteBatch writeBatch = null;
                        if (levelDb2 == null) {
                            this.f85569h = mo47720a(true, null, this.f85568g);
                            aqbo.f85579l.put(this.f85565d, this.f85569h);
                        }
                        if (this.f85569h != null) {
                            try {
                                writeBatch = WriteBatch.create();
                                try {
                                    HashSet<apgr> hashSet = new HashSet();
                                    aqbt.mo47745a(hashSet);
                                    for (apgr apgr : hashSet) {
                                        writeBatch.put(apgr.f84346a, f85564c);
                                    }
                                    this.f85569h.write(writeBatch);
                                    try {
                                        writeBatch.close();
                                        m71302d();
                                        SQLiteDatabase sQLiteDatabase = this.f85567f;
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.beginTransaction();
                                            aqby.m71332a(this.f85567f, this.f85565d, bArr, a);
                                            this.f85567f.setTransactionSuccessful();
                                            try {
                                                SQLiteDatabase sQLiteDatabase2 = this.f85567f;
                                                if (sQLiteDatabase2 != null) {
                                                    sQLiteDatabase2.endTransaction();
                                                }
                                            } catch (SQLException e2) {
                                            }
                                        }
                                        m71303e();
                                    } catch (Exception e3) {
                                        return;
                                    }
                                } catch (Exception | OutOfMemoryError e4) {
                                    if (writeBatch != null) {
                                        try {
                                            writeBatch.close();
                                            return;
                                        } catch (Exception e5) {
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    if (writeBatch != null) {
                                        try {
                                            writeBatch.close();
                                        } catch (Exception e6) {
                                        }
                                    }
                                    throw th;
                                }
                            } catch (Exception | OutOfMemoryError e7) {
                                if (writeBatch != null) {
                                }
                                return;
                            } catch (Throwable th2) {
                                th = th2;
                                if (writeBatch != null) {
                                }
                                throw th;
                            }
                        }
                    } catch (Exception e8) {
                        return;
                    }
                }
            } catch (SQLException e9) {
                try {
                    SQLiteDatabase sQLiteDatabase3 = this.f85567f;
                    if (sQLiteDatabase3 != null) {
                        sQLiteDatabase3.endTransaction();
                    }
                } catch (SQLException e10) {
                }
            } catch (Throwable th3) {
                try {
                    SQLiteDatabase sQLiteDatabase4 = this.f85567f;
                    if (sQLiteDatabase4 != null) {
                        sQLiteDatabase4.endTransaction();
                    }
                } catch (SQLException e11) {
                }
                m71303e();
                throw th3;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0048 A[SYNTHETIC, Splitter:B:37:0x0048] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0051 A[SYNTHETIC, Splitter:B:44:0x0051] */
    /* renamed from: a */
    public final synchronized boolean mo47730a(apgr apgr) {
        boolean z;
        LevelDb levelDb;
        z = false;
        if (apgr != null) {
            if (!this.f85473b && (levelDb = this.f85569h) != null) {
                LevelDb.Iterator iterator = null;
                try {
                    iterator = levelDb.iterator();
                    try {
                        iterator.seekToFirst();
                        if (iterator.isValid()) {
                            try {
                                if (this.f85569h.get(apgr.f84346a) != null) {
                                    z = true;
                                }
                                if (iterator != null) {
                                    try {
                                        iterator.close();
                                    } catch (Exception e) {
                                    }
                                }
                            } catch (LevelDbException e2) {
                                if (iterator != null) {
                                    try {
                                        iterator.close();
                                    } catch (Exception e3) {
                                    }
                                }
                            }
                        } else if (iterator != null) {
                            try {
                                iterator.close();
                            } catch (Exception e4) {
                            }
                        }
                    } catch (Exception e5) {
                        if (iterator != null) {
                        }
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        if (iterator != null) {
                        }
                        throw th;
                    }
                } catch (Exception e6) {
                    if (iterator != null) {
                        try {
                            iterator.close();
                        } catch (Exception e7) {
                        }
                    }
                    return z;
                } catch (Throwable th2) {
                    th = th2;
                    if (iterator != null) {
                        try {
                            iterator.close();
                        } catch (Exception e8) {
                        }
                    }
                    throw th;
                }
            }
        }
        return z;
    }
}
