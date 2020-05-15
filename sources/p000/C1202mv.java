package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: mv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1202mv implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ C1208na f26700a;

    public C1202mv(C1208na naVar) {
        this.f26700a = naVar;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            C1208na naVar = this.f26700a;
            synchronized (naVar.f26715a) {
                if (!naVar.f26717c.hasMessages(1)) {
                    naVar.f26716b.quit();
                    naVar.f26716b = null;
                    naVar.f26717c = null;
                }
            }
            return true;
        } else if (i != 1) {
            return true;
        } else {
            C1208na naVar2 = this.f26700a;
            ((Runnable) message.obj).run();
            synchronized (naVar2.f26715a) {
                naVar2.f26717c.removeMessages(0);
                Handler handler = naVar2.f26717c;
                handler.sendMessageDelayed(handler.obtainMessage(0), (long) naVar2.f26718d);
            }
            return true;
        }
    }
}
