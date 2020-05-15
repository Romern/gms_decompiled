package p000;

import android.view.View;
import android.view.Window;

/* renamed from: adz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class adz implements View.OnClickListener {

    /* renamed from: a */
    final C1427vd f299a = new C1427vd(this.f300b.f310a.getContext(), this.f300b.f313d);

    /* renamed from: b */
    final /* synthetic */ aeb f300b;

    public adz(aeb aeb) {
        this.f300b = aeb;
    }

    public void onClick(View view) {
        aeb aeb = this.f300b;
        Window.Callback callback = aeb.f314e;
        if (callback != null && aeb.f315f) {
            callback.onMenuItemSelected(0, this.f299a);
        }
    }
}
