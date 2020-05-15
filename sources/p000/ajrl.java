package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrl */
public final /* synthetic */ class ajrl implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71187a;

    /* renamed from: b */
    private final ShareTarget f71188b;

    public ajrl(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71187a = shareSheetChimeraActivity;
        this.f71188b = shareTarget;
    }

    public final void run() {
        this.f71187a.mo44488f(this.f71188b).setVisibility(8);
    }
}
