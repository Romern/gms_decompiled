package p000;

import android.view.View;

/* renamed from: xvk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xvk implements View.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ xvo f53222a;

    public xvk(xvo xvo) {
        this.f53222a = xvo;
    }

    public void onClick(View view) {
        if (this.f53222a.getDialog() != null) {
            this.f53222a.getDialog().dismiss();
        }
    }
}
