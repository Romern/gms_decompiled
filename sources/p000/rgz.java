package p000;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: rgz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rgz implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ rhb f42950a;

    public rgz(rhb rhb) {
        this.f42950a = rhb;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        rhb.f42954b.mo25412b("Account selected: %d", Integer.valueOf(i));
        if (i >= this.f42950a.f42967i.getHeaderViewsCount()) {
            rhb rhb = this.f42950a;
            rhb.f42956c.f42928c = i;
            rhb.f42963e = i - rhb.f42967i.getHeaderViewsCount();
            rhb rhb2 = this.f42950a;
            rhb2.f42957d = 3;
            rhb2.mo24627k();
        }
    }
}
