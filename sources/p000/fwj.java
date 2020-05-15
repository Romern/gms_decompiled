package p000;

import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.appinvite.model.ContactPerson;

/* renamed from: fwj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class fwj implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    final /* synthetic */ fwo f17438a;

    public fwj(fwo fwo) {
        this.f17438a = fwo;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        fvw fvw = this.f17438a.f17446D;
        ContactPerson contactPerson = fvw.f17390a;
        ContactPerson.ContactMethod a = fvw.getItem(i);
        if (!(contactPerson == null || a == null)) {
            fxa fxa = this.f17438a.f17468g;
            if (fxa != null) {
                fxa.mo7246a(a, !contactPerson.mo7263a().equals(a));
            }
            contactPerson.mo7264a(a);
            this.f17438a.f17481t.mo11458b(contactPerson);
            fxg fxg = this.f17438a.f17482u;
            if (fxg != null) {
                fxg.mo11458b(contactPerson);
            }
            if (fwo.m12515c(contactPerson)) {
                this.f17438a.mo11443e();
            }
        }
        this.f17438a.f17445C.mo105d();
    }
}
