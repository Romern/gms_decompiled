package p000;

import android.view.MotionEvent;
import com.google.android.gms.car.TouchEventCompleteData;

/* renamed from: ook */
public final /* synthetic */ class ook implements Runnable {

    /* renamed from: a */
    private final oop f38067a;

    /* renamed from: b */
    private final TouchEventCompleteData f38068b;

    public ook(oop oop, TouchEventCompleteData touchEventCompleteData) {
        this.f38067a = oop;
        this.f38068b = touchEventCompleteData;
    }

    public final void run() {
        oop oop = this.f38067a;
        TouchEventCompleteData touchEventCompleteData = this.f38068b;
        MotionEvent motionEvent = (MotionEvent) oop.f38079f.mo22394a();
        if (motionEvent != null) {
            oos oos = oop.f38081h;
            if (oos != null) {
                oop.f38077d.mo21663a(oos, motionEvent, touchEventCompleteData);
            } else {
                throw new IllegalStateException("Touch event received prior to createWindow");
            }
        }
        oop.mo22402e();
    }
}
