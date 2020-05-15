package p000;

import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: gxb */
final /* synthetic */ class gxb implements C0038ax {

    /* renamed from: a */
    private final gxi f19155a;

    public gxb(gxi gxi) {
        this.f19155a = gxi;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public final void mo2511a(Object obj) {
        boolean z;
        gxi gxi = this.f19155a;
        int intValue = ((Integer) obj).intValue();
        bnhe bnhe = gxi.f19163a;
        Integer valueOf = Integer.valueOf(intValue);
        if (!bnhe.containsKey(valueOf) || !gxi.f19164b.containsKey(valueOf)) {
            z = false;
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unrecognized UI Type: ");
        sb.append(intValue);
        sdo.m34971a(z, (Object) sb.toString());
        String str = (String) gxi.f19163a.get(valueOf);
        FragmentManager childFragmentManager = gxi.getChildFragmentManager();
        if (childFragmentManager.findFragmentByTag(str) == null) {
            Fragment findFragmentById = childFragmentManager.findFragmentById(gxi.f19166d.f19585c);
            Fragment fragment = (Fragment) ((C1247om) gxi.f19164b.get(valueOf)).mo12294a();
            BottomSheetBehavior bottomSheetBehavior = gxi.f19165c;
            if (bottomSheetBehavior != null && findFragmentById == null) {
                bottomSheetBehavior.mo71025a(0);
            }
            gxi.f19166d.mo12438a(fragment, str);
        }
    }
}
