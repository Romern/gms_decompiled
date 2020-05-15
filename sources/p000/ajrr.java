package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrr */
final /* synthetic */ class ajrr implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71197a;

    /* renamed from: b */
    private final ShareTarget f71198b;

    public ajrr(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71197a = shareSheetChimeraActivity;
        this.f71198b = shareTarget;
    }

    public final void run() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71197a;
        ShareTarget shareTarget = this.f71198b;
        if (shareSheetChimeraActivity.mo44489g(shareTarget).mo38930b((Object) shareTarget) != -1) {
            ajuw g = shareSheetChimeraActivity.mo44489g(shareTarget);
            int indexOf = g.f71298d.indexOf(shareTarget);
            if (indexOf != -1) {
                g.f71298d.remove(shareTarget);
                g.mo160O(indexOf);
            }
            shareSheetChimeraActivity.f81017q.remove(shareTarget);
            if (shareSheetChimeraActivity.mo44489g(shareTarget).mo161a() == 0) {
                shareSheetChimeraActivity.mo44483b(shareTarget);
            }
            ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Lost sight of %s, removed from recyclerView", shareTarget.f81029b);
        }
    }
}
