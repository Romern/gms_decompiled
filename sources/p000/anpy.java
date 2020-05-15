package p000;

import android.view.ViewParent;

/* renamed from: anpy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anpy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ anqe f77426a;

    public anpy(anqe anqe) {
        this.f77426a = anqe;
    }

    public final void run() {
        anqe anqe = this.f77426a;
        boolean z = false;
        if (!anqe.f77450w) {
            anqe.f77437j = 0;
        } else {
            anqe.f77437j = 1;
        }
        anpo q = anqe.mo42122q();
        if (q != null && q.getListView() != null) {
            ViewParent parent = q.getListView().getParent();
            if (this.f77426a.f77437j != 0) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }
}
