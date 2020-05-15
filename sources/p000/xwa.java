package p000;

import android.os.MessageQueue;
import android.view.View;

/* renamed from: xwa */
final /* synthetic */ class xwa implements MessageQueue.IdleHandler {

    /* renamed from: a */
    private final View f53262a;

    public xwa(View view) {
        this.f53262a = view;
    }

    public final boolean queueIdle() {
        View view = this.f53262a;
        xwb.f53263c.mo25414c("Footerbar updated", new Object[0]);
        xwb.m43495a(view);
        return false;
    }
}
