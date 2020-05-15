package p000;

import android.os.IBinder;

/* renamed from: apiv */
final /* synthetic */ class apiv implements Runnable {

    /* renamed from: a */
    private final apiz f84501a;

    /* renamed from: b */
    private final IBinder f84502b;

    public apiv(apiz apiz, IBinder iBinder) {
        this.f84501a = apiz;
        this.f84502b = iBinder;
    }

    public final void run() {
        this.f84501a.mo47330a(this.f84502b);
    }
}
