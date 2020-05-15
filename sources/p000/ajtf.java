package p000;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.UnmarkContactAsSelectedParams;

/* renamed from: ajtf */
public final /* synthetic */ class ajtf implements roo {

    /* renamed from: a */
    private final Contact f71266a;

    public ajtf(Contact contact) {
        this.f71266a = contact;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Contact contact = this.f71266a;
        int i = ajty.f71279a;
        akbk akbk = new akbk();
        akbk.f71556a.f81132a = contact;
        rnt a = ajty.m59007a((aucf) obj2);
        UnmarkContactAsSelectedParams unmarkContactAsSelectedParams = akbk.f71556a;
        unmarkContactAsSelectedParams.f81133b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38658a(unmarkContactAsSelectedParams);
    }
}
