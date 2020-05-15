package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrw */
public final /* synthetic */ class ajrw implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71209a;

    /* renamed from: b */
    private final ShareTarget f71210b;

    public ajrw(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71209a = shareSheetChimeraActivity;
        this.f71210b = shareTarget;
    }

    public final void run() {
        this.f71209a.mo44488f(this.f71210b).setVisibility(8);
    }
}
