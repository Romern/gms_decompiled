package p000;

import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajiq */
public final /* synthetic */ class ajiq implements aubw {

    /* renamed from: a */
    private final ContactSelectChimeraActivity f70720a;

    public ajiq(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70720a = contactSelectChimeraActivity;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70720a;
        if (!((Boolean) obj).booleanValue()) {
            contactSelectChimeraActivity.startActivityForResult(ConsentsChimeraActivity.m67439a(contactSelectChimeraActivity), 1004);
        }
    }
}
