package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajrm */
public final /* synthetic */ class ajrm implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71189a;

    public ajrm(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71189a = shareSheetChimeraActivity;
    }

    public final void run() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71189a;
        shareSheetChimeraActivity.invalidateOptionsMenu();
        shareSheetChimeraActivity.f81010j.animate().alpha(1.0f).setDuration(250);
    }
}
