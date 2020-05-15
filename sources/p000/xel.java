package p000;

import com.google.android.gms.fido.fido2.api.StateUpdate;

/* renamed from: xel */
public final /* synthetic */ class xel implements Runnable {

    /* renamed from: a */
    private final xeq f52072a;

    /* renamed from: b */
    private final StateUpdate f52073b;

    public xel(xeq xeq, StateUpdate stateUpdate) {
        this.f52072a = xeq;
        this.f52073b = stateUpdate;
    }

    public final void run() {
        xeq xeq = this.f52072a;
        xeq.f52085h.mo29683a(this.f52073b);
    }
}
