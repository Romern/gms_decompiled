package p000;

import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.AcceptParams;

/* renamed from: ajsy */
final /* synthetic */ class ajsy implements roo {

    /* renamed from: a */
    private final ShareTarget f71257a;

    public ajsy(ShareTarget shareTarget) {
        this.f71257a = shareTarget;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        ShareTarget shareTarget = this.f71257a;
        int i = ajty.f71279a;
        ajxh ajxh = new ajxh();
        ajxh.f71506a.f81071a = shareTarget;
        rnt a = ajty.m59007a((aucf) obj2);
        AcceptParams acceptParams = ajxh.f71506a;
        acceptParams.f81072b = a;
        ((ajyq) ((akbf) obj).mo25289B()).mo38635a(acceptParams);
    }
}
