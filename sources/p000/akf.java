package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: akf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akf extends Handler {

    /* renamed from: a */
    final /* synthetic */ aki f759a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akf(aki aki, Looper looper) {
        super(looper);
        this.f759a = aki;
    }

    public final void handleMessage(Message message) {
        if (message.what != 1) {
            super.handleMessage(message);
        } else {
            this.f759a.mo871a();
        }
    }
}
