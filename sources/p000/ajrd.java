package p000;

import android.view.MenuItem;
import android.view.View;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajrd */
public final /* synthetic */ class ajrd implements View.OnClickListener {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71176a;

    /* renamed from: b */
    private final MenuItem f71177b;

    public ajrd(ShareSheetChimeraActivity shareSheetChimeraActivity, MenuItem menuItem) {
        this.f71176a = shareSheetChimeraActivity;
        this.f71177b = menuItem;
    }

    public void onClick(View view) {
        this.f71176a.onOptionsItemSelected(this.f71177b);
    }
}
