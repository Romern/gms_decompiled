package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.cast.JGCastService;

/* renamed from: ddz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ddz extends Handler {

    /* renamed from: a */
    final /* synthetic */ JGCastService f12967a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ddz(JGCastService jGCastService, Looper looper) {
        super(looper);
        this.f12967a = jGCastService;
    }

    public final void handleMessage(Message message) {
        this.f12967a.mListener.mo8555a(message.what, message.arg1, message.arg2, message.obj);
    }
}
