package p000;

import com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity;

/* renamed from: ajiy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajiy implements adc {

    /* renamed from: a */
    final /* synthetic */ ContactSelectChimeraActivity f70729a;

    public ajiy(ContactSelectChimeraActivity contactSelectChimeraActivity) {
        this.f70729a = contactSelectChimeraActivity;
    }

    /* renamed from: a */
    public final boolean mo417a(String str) {
        this.f70729a.mo44409a(str, false);
        this.f70729a.f80860d.clearFocus();
        return true;
    }

    /* renamed from: b */
    public final void mo418b(String str) {
        ContactSelectChimeraActivity contactSelectChimeraActivity = this.f70729a;
        Runnable runnable = contactSelectChimeraActivity.f80859c;
        if (runnable != null) {
            contactSelectChimeraActivity.f80858b.removeCallbacks(runnable);
        }
        this.f70729a.f80859c = new ajix(this, str);
        ContactSelectChimeraActivity contactSelectChimeraActivity2 = this.f70729a;
        contactSelectChimeraActivity2.f80858b.postDelayed(contactSelectChimeraActivity2.f80859c, 500);
    }
}
