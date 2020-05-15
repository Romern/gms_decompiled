package p000;

import android.view.View;
import android.view.WindowManager;

/* renamed from: fzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fzp implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ View f17746a;

    /* renamed from: b */
    final /* synthetic */ WindowManager f17747b;

    /* renamed from: c */
    final /* synthetic */ fwl f17748c;

    public fzp(View view, WindowManager windowManager, fwl fwl) {
        this.f17746a = view;
        this.f17747b = windowManager;
        this.f17748c = fwl;
    }

    public void onClick(View view) {
        if (this.f17746a.getParent() != null) {
            this.f17747b.removeView(this.f17746a);
            fwl fwl = this.f17748c;
            if (fwl != null) {
                fwl.mo11428a();
            }
        }
    }
}
