package p000;

import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import java.util.concurrent.Executor;

/* renamed from: bemk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bemk {

    /* renamed from: a */
    public final SQLiteDatabase f111829a;

    /* renamed from: b */
    public final Executor f111830b;

    /* renamed from: c */
    public volatile boolean f111831c = false;

    /* renamed from: d */
    public final bemv f111832d;

    /* renamed from: e */
    private final Executor f111833e;

    public bemk(SQLiteDatabase sQLiteDatabase, Executor executor, Executor executor2, bemv bemv) {
        this.f111829a = sQLiteDatabase;
        this.f111830b = executor;
        this.f111833e = executor2;
        this.f111832d = bemv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bqgh.a(java.lang.Runnable, java.util.concurrent.Executor):void
     arg types: [bemg, bqfb]
     candidates:
      bqgh.a(java.lang.Runnable, java.lang.Object):bqgh
      bqgh.a(java.lang.Runnable, java.util.concurrent.Executor):void */
    /* renamed from: a */
    public final bqgg mo60799a(benr benr) {
        mo60800a();
        bens bens = new bens(this.f111829a);
        bljb a = blkh.m107281a("Transaction");
        try {
            bqgh a2 = bqgh.m112796a(bljx.m107270a(new bemi(this, benr, bens)));
            this.f111833e.execute(a2);
            int i = Build.VERSION.SDK_INT;
            a2.mo741a((Runnable) new bemg(a2, bens), (Executor) bqfb.INSTANCE);
            a.mo66586a(a2);
            if (a != null) {
                a.close();
            }
            return a2;
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }

    /* renamed from: a */
    public final void mo60800a() {
        if (this.f111831c) {
            throw new IllegalStateException("Already closed");
        }
    }
}
