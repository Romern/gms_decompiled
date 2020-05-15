package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OpenParams;

/* renamed from: ajtb */
final /* synthetic */ class ajtb implements roo {

    /* renamed from: a */
    private final ShareTarget f71260a;

    public ajtb(ShareTarget shareTarget) {
        this.f71260a = shareTarget;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.f71260a;
        int i = ajty.f71279a;
        ajzo ajzo = new ajzo();
        ajzo.f71528a.f81095a = shareTarget;
        rnt a = ajty.m59007a((aucf) obj2);
        OpenParams openParams = ajzo.f71528a;
        openParams.f81096b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38646a(openParams);
    }
}
