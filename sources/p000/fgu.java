package p000;

import com.android.volley.RequestQueue;

/* renamed from: fgu */
final /* synthetic */ class fgu implements Runnable {

    /* renamed from: a */
    private final RequestQueue f16527a;

    public fgu(RequestQueue requestQueue) {
        this.f16527a = requestQueue;
    }

    public final void run() {
        RequestQueue requestQueue = this.f16527a;
        requestQueue.cancelAll(fgv.f16528a);
        requestQueue.stop();
    }
}
