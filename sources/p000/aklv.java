package p000;

import android.os.Message;
import android.util.Log;

/* renamed from: aklv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aklv extends adzt {

    /* renamed from: a */
    private final akln f72225a;

    public aklv(akln akln) {
        this.f72225a = akln;
    }

    public final void handleMessage(Message message) {
        if (message.what != 0) {
            Log.w("NetRec", String.format("Received unknown message type (%d), expected a network status ack", Integer.valueOf(message.what)));
            return;
        }
        this.f72225a.mo39545a();
    }
}
