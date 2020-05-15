package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrk */
public final /* synthetic */ class ajrk implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71185a;

    /* renamed from: b */
    private final ShareTarget f71186b;

    public ajrk(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71185a = shareSheetChimeraActivity;
        this.f71186b = shareTarget;
    }

    public final void run() {
        this.f71185a.mo44488f(this.f71186b).setVisibility(0);
    }
}
