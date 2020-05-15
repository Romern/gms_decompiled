package p000;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteOutOfMemoryException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import com.felicanetworks.sdu.ErrorInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: bend */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bend implements ComponentCallbacks2 {

    /* renamed from: a */
    public static final bnrt f111847a = bnrt.m110178a("bend");

    /* renamed from: b */
    public final Context f111848b;

    /* renamed from: c */
    public final ScheduledExecutorService f111849c;

    /* renamed from: d */
    public final benc f111850d;

    /* renamed from: e */
    public final bmxv f111851e;

    /* renamed from: f */
    public final List f111852f;

    /* renamed from: g */
    public final List f111853g;

    /* renamed from: h */
    public final beni f111854h;

    /* renamed from: i */
    public final String f111855i;

    /* renamed from: j */
    public final Set f111856j = new HashSet();

    /* renamed from: k */
    public final Object f111857k = new Object();

    /* renamed from: l */
    public final Executor f111858l;

    /* renamed from: m */
    public bqgg f111859m;

    /* renamed from: n */
    public int f111860n = 0;

    /* renamed from: o */
    public boolean f111861o = false;

    /* renamed from: p */
    public boolean f111862p;

    /* renamed from: q */
    public final bemv f111863q = new bemv(this);

    /* renamed from: r */
    private final bqeg f111864r;

    /* renamed from: s */
    private final bqfp f111865s = new bemw(this);

    /* renamed from: t */
    private boolean f111866t = false;

    /* renamed from: u */
    private ScheduledFuture f111867u;

    public bend(Context context, ScheduledExecutorService scheduledExecutorService, benc benc, bqeg bqeg, benm benm, String str) {
        this.f111864r = bqeg;
        this.f111849c = scheduledExecutorService;
        this.f111850d = benc;
        this.f111858l = bqgs.m112813a((Executor) scheduledExecutorService);
        this.f111848b = context;
        this.f111851e = benm.f111880a;
        this.f111852f = benm.f111881b;
        this.f111853g = benm.f111882c;
        this.f111854h = benm.f111883d;
        this.f111855i = str;
    }

    /* renamed from: a */
    private static SQLiteDatabase m95300a(Context context, beni beni, File file) {
        int i;
        boolean a = m95304a(context, beni);
        if (a) {
            int i2 = Build.VERSION.SDK_INT;
            i = 805306368;
        } else {
            i = 268435456;
        }
        file.getParentFile().mkdirs();
        try {
            String path = file.getPath();
            int i3 = bens.f111889c;
            SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(path, null, i, null);
            if (a) {
                openDatabase.enableWriteAheadLogging();
            }
            return openDatabase;
        } catch (Throwable th) {
            throw new bemy("Failed to open database.", th);
        }
    }

    /* renamed from: b */
    public final void mo60808b() {
        if (this.f111860n == 0 && this.f111859m != null) {
            if (!this.f111866t) {
                this.f111867u = this.f111849c.schedule(new bems(this), 60, TimeUnit.SECONDS);
                if (!this.f111862p) {
                    bqga.m112781a(this.f111859m, new bemx(this), this.f111858l);
                    return;
                }
                return;
            }
            mo60809c();
        }
    }

    /* renamed from: c */
    public final void mo60809c() {
        this.f111858l.execute(new bemt(this));
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        onTrimMemory(80);
    }

    public final void onTrimMemory(int i) {
        boolean z;
        synchronized (this.f111857k) {
            if (i >= 40) {
                z = true;
            } else {
                z = false;
            }
            this.f111866t = z;
            mo60808b();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static SQLiteDatabase m95301a(Context context, File file, beni beni, bmxv bmxv, List list, List list2) {
        bljb a;
        SQLiteDatabase a2 = m95300a(context, beni, file);
        try {
            if (m95305a(a2, beni, bmxv, list, list2)) {
                a2.close();
                a2 = m95300a(context, beni, file);
                try {
                    a = blkh.m107281a("Configuring reopened database.");
                    bmxy.m108601b(!m95305a(a2, beni, bmxv, list, list2), "Reopen request for a database that was already reopened after upgrade. Upgrade did not take despite error-free completion of the upgrade transaction.");
                    if (a != null) {
                        a.close();
                    }
                } catch (SQLiteException | IllegalStateException e) {
                    a2.close();
                    throw new bemy("Failed to open database.", e);
                } catch (Throwable th) {
                    a2.close();
                    throw th;
                }
            }
            return a2;
            throw th;
        } catch (SQLiteException e2) {
            a2.close();
            throw new bemy("Failed to open database.", e2);
        } catch (Throwable th2) {
            a2.close();
            throw th2;
        }
    }

    /* renamed from: a */
    public static bqeu m95302a(bqgg bqgg, Closeable... closeableArr) {
        bmxy.m108581a(bqgg);
        return new bqeu(new bemp(closeableArr), bqfb.INSTANCE).mo69186a(new bemq(bqgg), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public static void m95303a(File file) {
        File file2 = new File(String.valueOf(file.getPath()).concat("-wal"));
        File file3 = new File(String.valueOf(file.getPath()).concat("-journal"));
        File file4 = new File(String.valueOf(file.getPath()).concat("-shm"));
        try {
            if ((file2.exists() && !file2.delete()) || ((file3.exists() && !file3.delete()) || ((file4.exists() && !file4.delete()) || !file.delete()))) {
                throw new bemz(String.format("Unable to clean up database %s", file.getAbsolutePath()));
            }
        } catch (Throwable th) {
            throw new bemz(String.format("Unable to clean up database %s", file.getAbsolutePath()), th);
        }
    }

    /* renamed from: a */
    public static boolean m95304a(Context context, beni beni) {
        int i = beni.f111876b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return true;
        } else {
            if (i2 != 2) {
                int i3 = Build.VERSION.SDK_INT;
                if (!((ActivityManager) context.getSystemService("activity")).isLowRamDevice()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m95305a(SQLiteDatabase sQLiteDatabase, beni beni, bmxv bmxv, List list, List list2) {
        int i = Build.VERSION.SDK_INT;
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        List list3 = beni.f111875a;
        int size = list3.size();
        for (int i2 = 0; i2 < size; i2++) {
            String valueOf = String.valueOf((String) list3.get(i2));
            sQLiteDatabase.execSQL(valueOf.length() == 0 ? new String("PRAGMA ") : "PRAGMA ".concat(valueOf));
        }
        return m95306a(sQLiteDatabase, list, list2);
    }

    /* renamed from: a */
    private static boolean m95306a(SQLiteDatabase sQLiteDatabase, List list, List list2) {
        boolean z;
        bljb a;
        int version = sQLiteDatabase.getVersion();
        if (version <= list.size()) {
            z = true;
        } else {
            z = false;
        }
        bmxy.m108603b(z, "Can't downgrade from version %s to version %s", version, list.size());
        bens bens = new bens(sQLiteDatabase);
        sQLiteDatabase.beginTransaction();
        try {
            if (version != list.size()) {
                a = blkh.m107281a("Applying upgrade steps");
                for (benj benj : list.subList(version, list.size())) {
                    bens.mo60826a(benj.f111877a);
                }
                if (a != null) {
                    a.close();
                }
                sQLiteDatabase.setVersion(list.size());
            }
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                benl benl = (benl) it.next();
                if (!Thread.interrupted()) {
                    bens.f111891b.execSQL(benl.f111879a);
                } else {
                    throw new InterruptedException();
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            return version != sQLiteDatabase.getVersion();
        } catch (InterruptedException e) {
            throw new benb("Thread interrupted during database upgrade. Upgrade transaction will be unsuccessful.", e);
        } catch (SQLiteDatabaseLockedException e2) {
            e = e2;
            throw new benb("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteDiskIOException e3) {
            e = e3;
            throw new benb("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteFullException e4) {
            e = e4;
            throw new benb("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteOutOfMemoryException e5) {
            e = e5;
            throw new benb("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (SQLiteTableLockedException e6) {
            e = e6;
            throw new benb("An Exception was thrown during upgrade. This is probably recoverable by the user clearing disk space or when another process releases a database lock.", e);
        } catch (Throwable th) {
            try {
                throw new bena("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
            } catch (Throwable th2) {
                sQLiteDatabase.endTransaction();
                throw th2;
            }
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ SQLiteDatabase mo60806a(String str) {
        File file;
        SQLiteDatabase sQLiteDatabase;
        String str2 = this.f111855i;
        if (str2 != null) {
            file = new File(str2, str);
        } else {
            file = this.f111848b.getDatabasePath(str);
        }
        if (!this.f111861o) {
            benc benc = this.f111850d;
            String path = file.getPath();
            if (benc.f111846a.add(path)) {
                this.f111861o = true;
                boolean a = m95304a(this.f111848b, this.f111854h);
                this.f111862p = a;
                if (a) {
                    try {
                        this.f111862p = file.getCanonicalPath().startsWith(this.f111848b.getCacheDir().getCanonicalPath());
                    } catch (IOException e) {
                    }
                }
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(path).length() + 89);
                sb.append("DB ");
                sb.append(path);
                sb.append(" opened from different AsyncSQLiteOpenHelper. Are you missing a scope on your binding?");
                throw new IllegalStateException(sb.toString());
            }
        }
        Set set = this.f111856j;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) ((WeakReference) it.next()).get();
                if (sQLiteDatabase2 == null) {
                    it.remove();
                } else if (sQLiteDatabase2.isOpen()) {
                    String path2 = sQLiteDatabase2.getPath();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(path2).length() + ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                    sb2.append("Open database reference to ");
                    sb2.append(path2);
                    sb2.append(" already exists. Follow instructions in source to file a bug against TikTok.");
                    throw new IllegalStateException(sb2.toString());
                }
            }
        }
        try {
            sQLiteDatabase = m95301a(this.f111848b, file, this.f111854h, this.f111851e, this.f111852f, this.f111853g);
        } catch (bemy | bena | benb e2) {
            try {
                sQLiteDatabase = m95301a(this.f111848b, file, this.f111854h, this.f111851e, this.f111852f, this.f111853g);
            } catch (benb e3) {
                throw new bemy("Probably-recoverable database upgrade failure.", e3);
            } catch (bena e4) {
                bnrq bnrq = (bnrq) f111847a.mo68387b();
                bnrq.mo68437a(e4);
                bnrq.mo68432a("bend", "a", 434, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnrq.mo68405a("Fatal Exception when trying to upgrade database. Proceeding to delete.");
                m95303a(file);
                throw new bemy("Failed to open the database with an unrecoverable Exception. Deleted its files so the next open attempt will create a new instance.", e4);
            } catch (Throwable th) {
                throw new bemy("Recovery by deletion failed.", th);
            }
        }
        this.f111856j.add(new WeakReference(sQLiteDatabase));
        this.f111848b.registerComponentCallbacks(this);
        return sQLiteDatabase;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r1 = p000.bqga.m112772a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0057, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
        r0.mo66586a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r1 = m95302a(r1, new p000.bemn(r7)).mo69186a(p000.bljx.m107267a(new p000.bemo(r7)), p000.bqfb.INSTANCE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r0 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007b, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007e, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008d  */
    /* renamed from: a */
    public final bqeu mo60807a() {
        bqgg bqgg;
        blkh.m107286a();
        bljb bljb = null;
        try {
            synchronized (this.f111857k) {
                try {
                    int i = this.f111860n + 1;
                    this.f111860n = i;
                    if (this.f111859m == null) {
                        bmxy.m108601b(i == 1, "DB was null with nonzero refcount");
                        bljb = blkh.m107281a("Opening database");
                        try {
                            bqgg a = bqga.m112771a(this.f111864r, this.f111858l);
                            bqga.m112781a(a, this.f111865s, this.f111849c);
                            bqgg = bqdx.m112673a(a, bljx.m107264a(new bemr(this)), this.f111858l);
                        } catch (Exception e) {
                            bqgg = bqga.m112777a((Throwable) e);
                        } catch (Throwable th) {
                            th = th;
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        this.f111859m = bqgg;
                    }
                    try {
                        bqgg bqgg2 = this.f111859m;
                        ScheduledFuture scheduledFuture = this.f111867u;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(true);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            if (bljb != null) {
                bljb.close();
            }
            throw th;
        }
    }
}
