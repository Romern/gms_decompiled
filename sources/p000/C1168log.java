package p000;

import android.content.Intent;

/* renamed from: log */
final /* synthetic */ class C1168log implements Runnable {

    /* renamed from: a */
    private final lop f26495a;

    public C1168log(lop lop) {
        this.f26495a = lop;
    }

    public final void run() {
        lop lop = this.f26495a;
        Intent b = lio.m19198b(205);
        if (b != null) {
            lop.f26159a.startActivity(b);
        }
    }
}
