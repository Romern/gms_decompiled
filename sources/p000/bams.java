package p000;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.leveldb.LevelDb;
import com.google.android.gms.leveldb.LevelDbCorruptionException;
import com.google.android.gms.leveldb.LevelDbException;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutionException;

/* renamed from: bams */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bams implements Closeable, banu, bami {

    /* renamed from: a */
    public final cayo f101287a;

    /* renamed from: b */
    public final cayo f101288b;

    /* renamed from: c */
    public final babr f101289c;

    /* renamed from: d */
    public final cayo f101290d;

    /* renamed from: e */
    public final Object f101291e = new Object();

    /* renamed from: f */
    public boolean f101292f;

    /* renamed from: g */
    public bare f101293g;

    /* renamed from: h */
    public bamx f101294h;

    /* renamed from: i */
    public final bamj f101295i;

    /* renamed from: j */
    private final File f101296j;

    public bams(cayo cayo, File file, cayo cayo2, babr babr, cayo cayo3, bamj bamj) {
        this.f101287a = cayo2;
        this.f101296j = file;
        this.f101288b = cayo;
        this.f101289c = babr;
        this.f101290d = cayo3;
        this.f101295i = bamj;
    }

    /* renamed from: a */
    static boolean m87144a(Throwable th) {
        while (th != null) {
            if (th instanceof LevelDbCorruptionException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    public final void mo55757b() {
        bare a;
        synchronized (this.f101291e) {
            try {
                LevelDb.destroy(mo55789f());
                this.f101292f = true;
                if (this.f101293g != null) {
                    a = bare.m87435a(new banv("LevelDb database in lame duck mode"));
                    this.f101293g = a;
                }
            } catch (LevelDbException | IllegalStateException e) {
                try {
                    ((achw) this.f101288b.mo16713a()).mo25418e("Failed to destroy LevelDb database", new Object[0]);
                    mo55790g().createNewFile();
                    bare bare = this.f101293g;
                    if (bare != null) {
                        if (bare.mo55902a()) {
                            ((LevelDb) this.f101293g.mo55903b()).close();
                        }
                    }
                    this.f101292f = true;
                    if (this.f101293g != null) {
                        a = bare.m87435a(new banv("LevelDb database in lame duck mode"));
                    }
                } catch (IOException e2) {
                    ((achw) this.f101288b.mo16713a()).mo25418e("Failed to create LevelDb nuke file.", new Object[0]);
                    throw new banv("Failed to create LevelDb nuke file.", e2);
                } catch (ExecutionException e3) {
                    throw new RuntimeException("Unexpected condition", e3);
                } catch (Throwable th) {
                    this.f101292f = true;
                    if (this.f101293g != null) {
                        this.f101293g = bare.m87435a(new banv("LevelDb database in lame duck mode"));
                    }
                    throw th;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: c */
    public final void mo55785c() {
        boolean z;
        ((achw) this.f101288b.mo16713a()).mo25414c("Destroying LevelDb database", new Object[0]);
        try {
            synchronized (this.f101291e) {
                if (this.f101293g == null) {
                    z = true;
                } else {
                    z = false;
                }
                bmxy.m108600b(z);
                LevelDb.destroy(mo55789f());
            }
        } catch (LevelDbException | IllegalStateException e) {
            ((achw) this.f101288b.mo16713a()).mo25418e("Failed to destroy LevelDb database", new Object[0]);
            mo55787d();
            throw e;
        }
    }

    public final void close() {
        boolean z;
        synchronized (this.f101291e) {
            boolean z2 = true;
            if (this.f101293g != null) {
                z = true;
            } else {
                z = false;
            }
            bmxy.m108600b(z);
            if (this.f101294h != null) {
                z2 = false;
            }
            bmxy.m108600b(z2);
            if (this.f101293g.mo55902a()) {
                try {
                    ((LevelDb) this.f101293g.mo55903b()).close();
                } catch (ExecutionException e) {
                    throw new RuntimeException("Unexpected condition", e);
                }
            }
            this.f101293g = null;
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: d */
    public final void mo55787d() {
        try {
            mo55790g().createNewFile();
        } catch (IOException e) {
            ((achw) this.f101288b.mo16713a()).mo25418e("Failed to mark LevelDb database as corrupted", new Object[0]);
        }
        synchronized (this.f101291e) {
            bare bare = this.f101293g;
            if (bare != null) {
                if (bare.mo55902a()) {
                    try {
                        ((LevelDb) this.f101293g.mo55903b()).close();
                    } catch (ExecutionException e2) {
                        throw new RuntimeException("Unexpected condition", e2);
                    }
                }
                this.f101293g = bare.m87435a(new banv("Database marked as corrupted"));
            }
        }
    }

    /* renamed from: e */
    public final LevelDb mo55788e() {
        LevelDb levelDb;
        try {
            synchronized (this.f101291e) {
                bare bare = this.f101293g;
                if (bare != null) {
                    levelDb = (LevelDb) bare.mo55903b();
                } else {
                    throw new banv("Database object is null");
                }
            }
            return levelDb;
        } catch (ExecutionException e) {
            throw new banv(e.getCause().getMessage(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final File mo55789f() {
        return new File(this.f101296j, "level.db");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final File mo55790g() {
        return new File(this.f101296j, "level.db.corrupted");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo55754a() {
        mo55787d();
    }

    @Deprecated
    /* renamed from: a */
    public final void mo55755a(SQLiteDatabase sQLiteDatabase) {
        try {
            mo55785c();
        } catch (LevelDbException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    /* renamed from: a */
    public final void mo55784a(Exception exc) {
        if (m87144a((Throwable) exc)) {
            mo55787d();
        }
    }
}
