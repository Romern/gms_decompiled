package p000;

import android.content.Context;
import android.view.MenuItem;
import com.google.android.gms.mdi.download.p054ui.DebugUiChimeraActivity;

/* renamed from: afqg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afqg implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a */
    final /* synthetic */ DebugUiChimeraActivity f64544a;

    public afqg(DebugUiChimeraActivity debugUiChimeraActivity) {
        this.f64544a = debugUiChimeraActivity;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: rjx.<init>(android.content.Context, boolean[]):void
     arg types: [com.google.android.gms.mdi.download.ui.DebugUiChimeraActivity, ?[OBJECT, ARRAY]]
     candidates:
      rjx.<init>(android.content.Context, allq):void
      rjx.<init>(android.content.Context, auzy):void
      rjx.<init>(android.content.Context, avty):void
      rjx.<init>(android.content.Context, rjg):void
      rjx.<init>(android.content.Context, rjw):void
      rjx.<init>(android.content.Context, byte[]):void
      rjx.<init>(android.content.Context, char[]):void
      rjx.<init>(android.content.Context, float[]):void
      rjx.<init>(android.content.Context, int[]):void
      rjx.<init>(android.content.Context, short[]):void
      rjx.<init>(android.content.Context, boolean[]):void */
    public final boolean onMenuItemClick(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return false;
        }
        new rjx((Context) this.f64544a, (boolean[]) null).mo24763q().mo50372a(afpy.f64533a);
        return true;
    }
}
