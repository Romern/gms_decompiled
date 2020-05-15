package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;
import java.util.Iterator;

/* renamed from: ajsk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajsk implements ajsn {

    /* renamed from: a */
    final /* synthetic */ ShareSheetChimeraActivity f71227a;

    public ajsk(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71227a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo38707a(ShareTarget shareTarget) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71227a;
        for (ShareTarget shareTarget2 : shareSheetChimeraActivity.f81017q.keySet()) {
            if (ShareSheetChimeraActivity.m67560a(shareTarget2, shareTarget)) {
                shareSheetChimeraActivity.f70614b.removeCallbacks((Runnable) shareSheetChimeraActivity.f81017q.get(shareTarget2));
                shareSheetChimeraActivity.f81017q.remove(shareTarget2);
                srn srn = ajvp.f71371a;
                if (shareTarget2.f81028a != shareTarget.f81028a && !shareSheetChimeraActivity.mo44489g(shareTarget).mo38950a(shareTarget2, shareTarget)) {
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to replace shareTarget.");
                    return;
                }
                return;
            }
        }
        Iterator it = shareSheetChimeraActivity.mo44489g(shareTarget).iterator();
        while (it.hasNext()) {
            ShareTarget shareTarget3 = (ShareTarget) it.next();
            if (shareTarget.f81028a == shareTarget3.f81028a) {
                srn srn2 = ajvp.f71371a;
                return;
            } else if (ShareSheetChimeraActivity.m67560a(shareTarget, shareTarget3)) {
                if (!shareSheetChimeraActivity.mo44489g(shareTarget).mo38950a(shareTarget3, shareTarget)) {
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68405a("Failed to replace shareTarget.");
                    return;
                } else {
                    ((bnsl) ajvp.f71371a.mo68390d()).mo68420a("Discovered lost device %s again. Replacing the previous one", shareTarget.f81029b);
                    return;
                }
            }
        }
        shareSheetChimeraActivity.mo44480a(shareTarget);
    }

    /* renamed from: b */
    public final void mo38709b(ShareTarget shareTarget) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71227a;
        if (shareSheetChimeraActivity.mo44489g(shareTarget).mo38930b((Object) shareTarget) != -1) {
            ajrr ajrr = new ajrr(shareSheetChimeraActivity, shareTarget);
            shareSheetChimeraActivity.f81017q.put(shareTarget, ajrr);
            shareSheetChimeraActivity.f70614b.postDelayed(ajrr, 50);
        }
    }

    /* renamed from: a */
    public final void mo38708a(ShareTarget shareTarget, int i) {
        this.f71227a.mo44481a(shareTarget, i);
    }
}
