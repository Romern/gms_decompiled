package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: nhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nhv extends nvt {

    /* renamed from: a */
    private boolean f35674a = false;

    public nhv(nhw nhw, Looper looper) {
        super(nhw, looper);
    }

    /* renamed from: a */
    public final synchronized void mo20705a() {
        if (!this.f35674a) {
            removeMessages(0);
            sendMessage(obtainMessage(0));
        }
    }

    /* renamed from: b */
    public final synchronized void mo20706b() {
        if (!this.f35674a) {
            this.f35674a = true;
        }
    }

    public final void handleMessage(Message message) {
        nhw nhw = (nhw) mo21726f();
        if (nhw != null && message.what == 0) {
            nhw.mo20709b();
        }
    }
}
