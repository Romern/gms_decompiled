package p000;

import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;
import android.view.MotionEvent;
import com.google.android.gms.car.InputFocusChangedEvent;

/* renamed from: oot */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class oot extends nvt {
    public oot(oou oou) {
        super(oou, Looper.getMainLooper());
    }

    /* renamed from: a */
    public final void mo22462a() {
        sendMessage(obtainMessage(4));
    }

    /* renamed from: b */
    public final void mo22464b() {
        sendMessage(obtainMessage(5));
    }

    public final void handleMessage(Message message) {
        oou oou = (oou) mo21726f();
        if (oou != null) {
            int i = message.what;
            if (i != 1) {
                switch (i) {
                    case 4:
                        oou.f38116i.mo21459a(oou);
                        return;
                    case 5:
                        oou.f38116i.mo21467y();
                        return;
                    case 6:
                        oou.f38116i.mo21458a((InputFocusChangedEvent) message.obj);
                        return;
                    case 7:
                        oou.f38116i.mo21462a(oou, (MotionEvent) message.obj);
                        return;
                    case 8:
                        oou.f38116i.mo21461a(oou, (KeyEvent) message.obj);
                        return;
                    case 9:
                        oou.f38116i.mo21457a(message.arg1);
                        return;
                    case 10:
                        oou.f38116i.mo21466e(oou);
                        return;
                    case 11:
                        oou.f38116i.mo21465d(oou);
                        return;
                    case 12:
                        oou.f38116i.mo21464c(oou);
                        return;
                    default:
                        return;
                }
            } else {
                oou.f38116i.mo21460a(oou, message.arg1, message.arg2);
            }
        }
    }

    /* renamed from: a */
    public final void mo22463a(MotionEvent motionEvent) {
        sendMessage(obtainMessage(7, motionEvent));
    }
}
