package p000;

import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajsf */
public final /* synthetic */ class ajsf implements View.OnClickListener {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71222a;

    public ajsf(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71222a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71222a;
        ShareTarget shareTarget = shareSheetChimeraActivity.f81015o;
        shareSheetChimeraActivity.f81023w = 1;
        shareSheetChimeraActivity.mo44477a(3);
        shareSheetChimeraActivity.mo44485c(shareTarget);
        shareSheetChimeraActivity.f81018r = true;
        srn srn = ajvp.f71371a;
    }
}
