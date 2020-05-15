package p000;

import android.os.Build;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* renamed from: rc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1318rc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C1319rd f26896a;

    public C1318rc(C1319rd rdVar) {
        this.f26896a = rdVar;
    }

    public final void run() {
        C1319rd rdVar = this.f26896a;
        if (rdVar.f26902e) {
            if (rdVar.f26900c) {
                rdVar.f26900c = false;
                C1317rb rbVar = rdVar.f26898a;
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                rbVar.f26889e = currentAnimationTimeMillis;
                rbVar.f26893i = -1;
                rbVar.f26890f = currentAnimationTimeMillis;
                rbVar.f26894j = 0.5f;
                rbVar.f26891g = 0;
                rbVar.f26892h = 0;
            }
            C1317rb rbVar2 = this.f26896a.f26898a;
            if ((rbVar2.f26893i <= 0 || AnimationUtils.currentAnimationTimeMillis() <= rbVar2.f26893i + ((long) rbVar2.f26895k)) && this.f26896a.mo15803a()) {
                C1319rd rdVar2 = this.f26896a;
                if (rdVar2.f26901d) {
                    rdVar2.f26901d = false;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    rdVar2.f26899b.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (rbVar2.f26890f != 0) {
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a = rbVar2.mo15800a(currentAnimationTimeMillis2);
                    long j = rbVar2.f26890f;
                    rbVar2.f26890f = currentAnimationTimeMillis2;
                    float f = ((float) (currentAnimationTimeMillis2 - j)) * ((-4.0f * a * a) + (a * 4.0f));
                    rbVar2.f26891g = (int) (rbVar2.f26887c * f);
                    int i = (int) (f * rbVar2.f26888d);
                    rbVar2.f26892h = i;
                    ListView listView = this.f26896a.f26903f;
                    int i2 = Build.VERSION.SDK_INT;
                    listView.scrollListBy(i);
                    C1280ps.m19891a(this.f26896a.f26899b, this);
                    return;
                }
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            this.f26896a.f26902e = false;
        }
    }
}
