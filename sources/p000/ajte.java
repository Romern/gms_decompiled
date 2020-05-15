package p000;

import com.google.android.gms.nearby.sharing.Contact;
import com.google.android.gms.nearby.sharing.internal.MarkContactAsSelectedParams;

/* renamed from: ajte */
public final /* synthetic */ class ajte implements roo {

    /* renamed from: a */
    private final Contact f71265a;

    public ajte(Contact contact) {
        this.f71265a = contact;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        Contact contact = this.f71265a;
        int i = ajty.f71279a;
        ajze ajze = new ajze();
        ajze.f71523a.f81087a = contact;
        rnt a = ajty.m59007a((aucf) obj2);
        MarkContactAsSelectedParams markContactAsSelectedParams = ajze.f71523a;
        markContactAsSelectedParams.f81088b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38645a(markContactAsSelectedParams);
    }
}
