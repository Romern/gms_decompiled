package p000;

import android.view.View;
import android.view.WindowManager;

/* renamed from: fzo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fzo implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f17743a;

    /* renamed from: b */
    final /* synthetic */ WindowManager f17744b;

    /* renamed from: c */
    final /* synthetic */ fwl f17745c;

    public fzo(View view, WindowManager windowManager, fwl fwl) {
        this.f17743a = view;
        this.f17744b = windowManager;
        this.f17745c = fwl;
    }

    public final void run() {
        if (this.f17743a.getParent() != null) {
            this.f17744b.removeView(this.f17743a);
            fwl fwl = this.f17745c;
            if (fwl != null) {
                fwl.mo11428a();
            }
        }
    }
}
