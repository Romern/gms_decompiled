package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrs */
public final /* synthetic */ class ajrs implements Runnable {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71199a;

    /* renamed from: b */
    private final ShareTarget f71200b;

    public ajrs(ShareSheetChimeraActivity shareSheetChimeraActivity, ShareTarget shareTarget) {
        this.f71199a = shareSheetChimeraActivity;
        this.f71200b = shareTarget;
    }

    public final void run() {
        this.f71199a.mo44481a(this.f71200b, 2);
    }
}
