package p000;

import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nqc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nqc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f36385a;

    /* renamed from: b */
    final /* synthetic */ Semaphore f36386b;

    /* renamed from: c */
    final /* synthetic */ WindowManager f36387c;

    /* renamed from: d */
    final /* synthetic */ WindowManager.LayoutParams f36388d;

    /* renamed from: e */
    final /* synthetic */ nqe f36389e;

    public nqc(nqe nqe, AtomicReference atomicReference, Semaphore semaphore, WindowManager windowManager, WindowManager.LayoutParams layoutParams) {
        this.f36389e = nqe;
        this.f36385a = atomicReference;
        this.f36386b = semaphore;
        this.f36387c = windowManager;
        this.f36388d = layoutParams;
    }

    public final void run() {
        this.f36385a.set(new SurfaceView(this.f36389e.f36395a));
        ((SurfaceView) this.f36385a.get()).getHolder().addCallback(new nqb(this));
        this.f36387c.addView((View) this.f36385a.get(), this.f36388d);
    }
}
