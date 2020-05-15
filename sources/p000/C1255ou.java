package p000;

import android.content.Context;
import android.os.Build;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* renamed from: ou */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1255ou {

    /* renamed from: a */
    public final C1254ot f26824a;

    /* renamed from: a */
    public final void mo15671a(MotionEvent motionEvent) {
        this.f26824a.f26823a.onTouchEvent(motionEvent);
    }

    public C1255ou(Context context, GestureDetector.OnGestureListener onGestureListener) {
        int i = Build.VERSION.SDK_INT;
        this.f26824a = new C1254ot(context, onGestureListener);
    }
}
