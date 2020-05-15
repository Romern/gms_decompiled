package p000;

import android.os.MessageQueue;
import android.view.View;

/* renamed from: xvw */
final /* synthetic */ class xvw implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private final View f53256a;

    public xvw(View view) {
        this.f53256a = view;
    }

    public final boolean queueIdle() {
        xvy.m43494a(this.f53256a);
        return false;
    }
}
