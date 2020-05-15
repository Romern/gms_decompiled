package p000;

import android.database.Cursor;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: ec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class C0953ec {

    /* renamed from: a */
    public Executor f14651a;

    /* renamed from: b */
    public C0929df f14652b;

    /* renamed from: c */
    boolean f14653c;
    @Deprecated

    /* renamed from: d */
    public volatile C0933dj f14654d;

    /* renamed from: e */
    private final C0947dx f14655e;

    /* renamed from: f */
    private final ReentrantReadWriteLock f14656f = new ReentrantReadWriteLock();

    /* renamed from: g */
    private final ThreadLocal f14657g = new ThreadLocal();

    public C0953ec() {
        new ConcurrentHashMap();
        this.f14655e = mo6327b();
    }

    /* renamed from: a */
    public final Cursor mo9937a(C0931dh dhVar) {
        m10086j();
        mo9943e();
        return this.f14652b.mo8640a().mo9111a(dhVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C0929df mo6326a(C0940dq dqVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C0947dx mo6327b();

    /* renamed from: c */
    public final boolean mo9941c() {
        C0933dj djVar = this.f14654d;
        return djVar != null && djVar.mo9120e();
    }

    /* renamed from: d */
    public final void mo9942d() {
        if (mo9941c()) {
            ReentrantReadWriteLock.WriteLock writeLock = this.f14656f.writeLock();
            writeLock.lock();
            try {
                C0948dy dyVar = this.f14655e.f14331g;
                this.f14652b.close();
            } finally {
                writeLock.unlock();
            }
        }
    }

    /* renamed from: e */
    public final void mo9943e() {
        if (!mo9947i() && this.f14657g.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    @Deprecated
    /* renamed from: f */
    public final void mo9944f() {
        m10086j();
        C0933dj a = this.f14652b.mo8640a();
        this.f14655e.mo9824a(a);
        a.mo9113a();
    }

    @Deprecated
    /* renamed from: g */
    public final void mo9945g() {
        this.f14652b.mo8640a().mo9114b();
        if (!mo9947i()) {
            C0947dx dxVar = this.f14655e;
            if (dxVar.f14328d.compareAndSet(false, true)) {
                dxVar.f14327c.f14651a.execute(dxVar.f14332h);
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public final void mo9946h() {
        this.f14652b.mo8640a().mo9117c();
    }

    /* renamed from: i */
    public final boolean mo9947i() {
        return this.f14652b.mo8640a().mo9119d();
    }

    /* renamed from: j */
    public static final void m10086j() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    /* renamed from: a */
    public final C0939dp mo9938a(String str) {
        m10086j();
        mo9943e();
        return this.f14652b.mo8640a().mo9116c(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Lock mo9939a() {
        return this.f14656f.readLock();
    }

    /* renamed from: a */
    public final void mo9940a(C0933dj djVar) {
        C0947dx dxVar = this.f14655e;
        synchronized (dxVar) {
            if (!dxVar.f14329e) {
                djVar.mo9115b("PRAGMA temp_store = MEMORY;");
                djVar.mo9115b("PRAGMA recursive_triggers='ON';");
                djVar.mo9115b("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                dxVar.mo9824a(djVar);
                dxVar.f14333i = djVar.mo9116c("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                dxVar.f14329e = true;
                return;
            }
            Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
        }
    }
}
