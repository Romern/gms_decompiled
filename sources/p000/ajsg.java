package p000;

import android.view.View;
import com.google.android.chimera.Activity;
import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;

/* renamed from: ajsg */
public final /* synthetic */ class ajsg implements View.OnClickListener {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71223a;

    public ajsg(ShareSheetChimeraActivity shareSheetChimeraActivity) {
        this.f71223a = shareSheetChimeraActivity;
    }

    public void onClick(View view) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71223a;
        shareSheetChimeraActivity.f81012l.mo44654a(true);
        aucb a = akij.m59822a((Activity) shareSheetChimeraActivity);
        aucb a2 = akic.m59784a(shareSheetChimeraActivity.getApplicationContext());
        aucb a3 = akiw.m59861a((Activity) shareSheetChimeraActivity);
        aucu.m76781a(a, a2, shareSheetChimeraActivity.f70615c.mo38905b(true), a3).mo50371a(new ajrg(shareSheetChimeraActivity));
        a.mo50372a(new ajrh(shareSheetChimeraActivity));
        a2.mo50372a(new ajri(shareSheetChimeraActivity));
        a3.mo50372a(new ajrj(shareSheetChimeraActivity));
    }
}
