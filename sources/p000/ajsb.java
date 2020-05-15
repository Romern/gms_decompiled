package p000;

import android.graphics.Bitmap;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajsb */
final /* synthetic */ class ajsb implements aubw {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71217a;

    /* renamed from: b */
    private final MenuItem f71218b;

    public ajsb(ShareSheetChimeraActivity shareSheetChimeraActivity, MenuItem menuItem) {
        this.f71217a = shareSheetChimeraActivity;
        this.f71218b = menuItem;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71217a;
        this.f71218b.setIcon(akia.m59779a(shareSheetChimeraActivity, (Bitmap) obj));
        shareSheetChimeraActivity.mo38632a(false);
    }
}
