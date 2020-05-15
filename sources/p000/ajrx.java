package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrx */
public final /* synthetic */ class ajrx implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71211a;

    /* renamed from: b */
    private final ShareTarget f71212b;

    public ajrx(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71211a = shareSheetChimeraActivity;
        this.f71212b = shareTarget;
    }

    public final void run() {
        this.f71211a.mo44488f(this.f71212b).setVisibility(8);
    }
}
