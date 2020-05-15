package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: cgm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class cgm implements Handler.Callback {
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        ((cgj) message.obj).mo3844d();
        return true;
    }
}
