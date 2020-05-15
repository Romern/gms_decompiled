package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: ajul */
final /* synthetic */ class ajul implements View.OnClickListener {

    /* renamed from: a */
    private final ajuq f71300a;

    /* renamed from: b */
    private final ajup f71301b;

    /* renamed from: c */
    private final Contact f71302c;

    public ajul(ajuq ajuq, ajup ajup, Contact contact) {
        this.f71300a = ajuq;
        this.f71301b = ajup;
        this.f71302c = contact;
    }

    public void onClick(View view) {
        ajuq ajuq = this.f71300a;
        ajup ajup = this.f71301b;
        ajuq.f71316g.mo38686a(ajup.f201a, this.f71302c);
    }
}
