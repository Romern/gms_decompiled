package p000;

import android.util.SparseArray;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: oaw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oaw {

    /* renamed from: a */
    public static final bnsn f37101a = odk.m28481a("CAR.GAL.SNOOP");

    /* renamed from: b */
    public final Object f37102b = new Object();

    /* renamed from: c */
    public final LinkedBlockingDeque f37103c;

    /* renamed from: d */
    public final bnfd f37104d;

    /* renamed from: e */
    public ExecutorService f37105e;

    /* renamed from: f */
    public final boolean f37106f;

    /* renamed from: g */
    public final oba f37107g;

    /* renamed from: h */
    public final SparseArray f37108h = new SparseArray();

    /* renamed from: i */
    private final AtomicLong f37109i;

    public oaw(oba oba, LinkedBlockingDeque linkedBlockingDeque, bnfd bnfd, ExecutorService executorService) {
        this.f37107g = oba;
        this.f37106f = oba.mo21920a();
        this.f37103c = linkedBlockingDeque;
        this.f37104d = bnfd;
        this.f37105e = executorService;
        this.f37109i = new AtomicLong();
    }

    /* renamed from: a */
    public static oaw m28315a(oba oba) {
        int b = oba.mo21921b();
        oba.mo21920a();
        return new oaw(oba, new LinkedBlockingDeque(b), bnfd.m109230a(b), m28316c());
    }

    /* renamed from: c */
    public static ExecutorService m28316c() {
        return adzl.f62962b.mo25879b(1);
    }

    /* renamed from: b */
    public final void mo21929b() {
        this.f37105e.shutdownNow();
        this.f37103c.clear();
        synchronized (this.f37102b) {
            this.f37104d.clear();
        }
    }

    /* renamed from: a */
    public final void mo21927a() {
        if (this.f37106f) {
            if (this.f37105e.isShutdown()) {
                bnsi c = f37101a.mo68388c();
                c.mo68432a("oaw", "a", 106, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68405a("Previous worker thread was shutdown, start a new one");
                this.f37105e = m28316c();
            }
            this.f37105e.execute(new oav(this));
        }
    }

    /* renamed from: a */
    public final void mo21928a(oay oay) {
        if (this.f37106f) {
            oay.f37112a = this.f37109i.getAndIncrement();
            this.f37103c.offer(oay);
        }
    }
}
