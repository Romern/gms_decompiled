package p000;

import com.google.android.gms.nearby.sharing.ShareSheetChimeraActivity;
import com.google.android.gms.nearby.sharing.ShareTarget;

/* renamed from: ajrp */
public final /* synthetic */ class ajrp implements aubw {

    /* renamed from: a */
    private final ShareSheetChimeraActivity f71192a;

    /* renamed from: b */
    private final boolean f71193b;

    /* renamed from: c */
    private final boolean f71194c;

    /* renamed from: d */
    private final boolean f71195d;

    public ajrp(ShareSheetChimeraActivity shareSheetChimeraActivity, boolean z, boolean z2, boolean z3) {
        this.f71192a = shareSheetChimeraActivity;
        this.f71193b = z;
        this.f71194c = z2;
        this.f71195d = z3;
    }

    /* renamed from: a */
    public final void mo10462a(Object obj) {
        ShareSheetChimeraActivity shareSheetChimeraActivity = this.f71192a;
        boolean z = this.f71193b;
        boolean z2 = this.f71194c;
        boolean z3 = this.f71195d;
        if (((Boolean) obj).booleanValue() && z && z2 && z3) {
            int i = shareSheetChimeraActivity.f81023w;
            if (i == 1 || i == 4) {
                shareSheetChimeraActivity.f81023w = 1;
                if (!cfov.m142069v()) {
                    shareSheetChimeraActivity.mo44491i();
                }
                shareSheetChimeraActivity.f81019s.setVisibility(4);
                shareSheetChimeraActivity.f81020t.mo44659a();
                if (cfov.m142063p()) {
                    shareSheetChimeraActivity.f81022v.mo44659a();
                }
                shareSheetChimeraActivity.f81014n.setVisibility(8);
                ShareTarget shareTarget = shareSheetChimeraActivity.f81016p;
                if (shareTarget != null) {
                    shareSheetChimeraActivity.mo44480a(shareTarget);
                    shareSheetChimeraActivity.f81013m.setVisibility(8);
                    shareSheetChimeraActivity.f81019s.setVisibility(0);
                } else if (shareSheetChimeraActivity.f81015o != null) {
                    shareSheetChimeraActivity.f81013m.setVisibility(8);
                    shareSheetChimeraActivity.f81019s.setVisibility(0);
                } else {
                    shareSheetChimeraActivity.f81013m.setVisibility(0);
                    shareSheetChimeraActivity.f81019s.setVisibility(4);
                }
                shareSheetChimeraActivity.mo44478a(0, (String) null, shareSheetChimeraActivity.f81015o);
            }
            shareSheetChimeraActivity.f70615c.mo38912e().mo50373a(new ajrq(shareSheetChimeraActivity));
            if (shareSheetChimeraActivity.f81023w != 3) {
                shareSheetChimeraActivity.mo44477a(1);
            }
            ShareTarget shareTarget2 = shareSheetChimeraActivity.f81016p;
            if (shareTarget2 != null) {
                shareSheetChimeraActivity.mo44485c(shareTarget2);
                shareSheetChimeraActivity.f81016p = null;
                return;
            }
            return;
        }
        if (!cfov.m142052e()) {
            shareSheetChimeraActivity.mo44490h();
        }
        if (shareSheetChimeraActivity.f81023w == 2) {
            return;
        }
        if (!cfov.m142052e() || shareSheetChimeraActivity.f81023w != 3) {
            shareSheetChimeraActivity.f81023w = 4;
            if (!cfov.m142069v()) {
                shareSheetChimeraActivity.mo44491i();
            }
            if (cfov.m142050c()) {
                shareSheetChimeraActivity.mo44493k();
            }
            shareSheetChimeraActivity.f81014n.setVisibility(0);
            shareSheetChimeraActivity.f81013m.setVisibility(4);
            shareSheetChimeraActivity.f81019s.setVisibility(4);
            shareSheetChimeraActivity.mo44478a(0, (String) null, (ShareTarget) null);
            if (cfov.m142052e()) {
                shareSheetChimeraActivity.mo44490h();
            }
        }
    }
}
