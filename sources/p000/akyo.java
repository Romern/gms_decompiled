package p000;

import java.lang.ref.WeakReference;

/* renamed from: akyo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class akyo implements Runnable {

    /* renamed from: b */
    final WeakReference f73127b;

    public akyo(Object obj) {
        sdo.m34959a(obj);
        this.f73127b = new WeakReference(obj);
    }

    /* renamed from: a */
    public abstract void mo39901a(Object obj);

    public final void run() {
        Object obj = this.f73127b.get();
        if (obj != null) {
            mo39901a(obj);
        }
    }
}
