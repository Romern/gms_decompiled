package p000;

import android.app.ActivityOptions;
import android.util.Pair;
import com.google.android.gms.nearby.sharing.SetupChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajsh */
public final /* synthetic */ class ajsh implements ajhd {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71224a;

    public ajsh(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71224a = shareSheetChimeraActivity;
    }

    /* renamed from: a */
    public final void mo38630a() {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71224a;
        shareSheetChimeraActivity.startActivityForResult(SetupChimeraActivity.m67552a(shareSheetChimeraActivity), 1000, ActivityOptions.makeSceneTransitionAnimation(shareSheetChimeraActivity.getContainerActivity(), new Pair(shareSheetChimeraActivity.f70617e, "card")).toBundle());
    }
}
