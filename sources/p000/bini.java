package p000;

import android.view.MotionEvent;

/* renamed from: bini */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bini {

    /* renamed from: a */
    public MotionEvent f120996a;

    /* renamed from: b */
    private final binp f120997b;

    public bini(binp binp) {
        this.f120997b = binp;
    }

    /* renamed from: a */
    private final void m102605a(MotionEvent motionEvent, int i) {
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        obtainNoHistory.setAction(i);
        this.f120997b.mo64799a(obtainNoHistory);
        obtainNoHistory.recycle();
    }

    /* renamed from: b */
    public final void mo64798b() {
        MotionEvent motionEvent = this.f120996a;
        if (motionEvent != null) {
            motionEvent.recycle();
            this.f120996a = null;
        }
    }

    /* renamed from: a */
    public final void mo64796a() {
        MotionEvent motionEvent = this.f120996a;
        if (motionEvent != null) {
            motionEvent.setAction(3);
            this.f120997b.mo64799a(this.f120996a);
            this.f120996a.recycle();
            this.f120996a = null;
        }
    }

    /* renamed from: a */
    public final void mo64797a(MotionEvent motionEvent) {
        int i;
        int actionMasked;
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 != 3) {
            int pointerCount = motionEvent.getPointerCount();
            if (actionMasked2 == 5 || actionMasked2 == 0) {
                pointerCount--;
            }
            MotionEvent motionEvent2 = this.f120996a;
            if (motionEvent2 == null || (actionMasked = motionEvent2.getActionMasked()) == 3) {
                i = 0;
            } else {
                i = this.f120996a.getPointerCount();
                if (actionMasked == 6 || actionMasked == 1) {
                    i--;
                }
            }
            if (i < pointerCount) {
                if (i == 0) {
                    m102605a(motionEvent, 0);
                    i = 1;
                }
                while (i < pointerCount) {
                    m102605a(motionEvent, (i << 8) | 5);
                    i++;
                }
            } else if (i > pointerCount) {
                MotionEvent motionEvent3 = this.f120996a;
                int max = Math.max(pointerCount, 1);
                while (i > max) {
                    i--;
                    m102605a(motionEvent3, (i << 8) | 6);
                }
                if (pointerCount == 0) {
                    m102605a(motionEvent3, 1);
                }
            }
        }
        int actionMasked3 = motionEvent.getActionMasked();
        if (actionMasked3 == 1 || actionMasked3 == 3) {
            mo64798b();
        } else {
            this.f120996a = MotionEvent.obtain(motionEvent);
        }
        this.f120997b.mo64799a(motionEvent);
    }
}
