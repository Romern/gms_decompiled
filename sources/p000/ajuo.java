package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.Contact;

/* renamed from: ajuo */
final /* synthetic */ class ajuo implements View.OnClickListener {

    /* renamed from: a */
    private final ajup f71304a;

    /* renamed from: b */
    private final Contact f71305b;

    public ajuo(ajup ajup, Contact contact) {
        this.f71304a = ajup;
        this.f71305b = contact;
    }

    public void onClick(View view) {
        ajup ajup = this.f71304a;
        Contact contact = this.f71305b;
        if (ajup.f71307t.mo38940a(contact)) {
            ajup.f71307t.f71314e.remove(Long.valueOf(contact.f80844a));
            ajup.f71307t.f71316g.mo38936b(contact);
            return;
        }
        ajup.f71307t.f71314e.add(Long.valueOf(contact.f80844a));
        ajup.f71307t.f71316g.mo38935a(contact);
    }
}
