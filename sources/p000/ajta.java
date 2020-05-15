package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.CancelParams;

/* renamed from: ajta */
final /* synthetic */ class ajta implements roo {

    /* renamed from: a */
    private final ShareTarget f71259a;

    public ajta(ShareTarget shareTarget) {
        this.f71259a = shareTarget;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.f71259a;
        int i = ajty.f71279a;
        ajxj ajxj = new ajxj();
        ajxj.f71507a.f81073a = shareTarget;
        rnt a = ajty.m59007a((aucf) obj2);
        CancelParams cancelParams = ajxj.f71507a;
        cancelParams.f81074b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38636a(cancelParams);
    }
}
