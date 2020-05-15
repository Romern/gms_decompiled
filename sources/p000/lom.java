package p000;

import android.content.Intent;

/* renamed from: lom */
final /* synthetic */ class lom implements Runnable {

    /* renamed from: a */
    private final lop f26501a;

    public lom(lop lop) {
        this.f26501a = lop;
    }

    public final void run() {
        lop lop = this.f26501a;
        Intent b = lio.m19198b(204);
        if (b != null) {
            lop.f26159a.startActivity(b);
        }
    }
}
