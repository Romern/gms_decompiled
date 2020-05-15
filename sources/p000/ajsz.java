package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.RejectParams;

/* renamed from: ajsz */
final /* synthetic */ class ajsz implements roo {

    /* renamed from: a */
    private final ShareTarget f71258a;

    public ajsz(ShareTarget shareTarget) {
        this.f71258a = shareTarget;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.f71258a;
        int i = ajty.f71279a;
        akap akap = new akap();
        akap.f71541a.f81117a = shareTarget;
        rnt a = ajty.m59007a((aucf) obj2);
        RejectParams rejectParams = akap.f71541a;
        rejectParams.f81118b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38651a(rejectParams);
    }
}
