package p000;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: gxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gxi extends adcd {

    /* renamed from: a */
    public static final bnhe f19163a;

    /* renamed from: b */
    public static final bnhe f19164b;

    /* renamed from: c */
    public BottomSheetBehavior f19165c;

    /* renamed from: d */
    public heg f19166d;

    /* renamed from: e */
    private gzz f19167e;

    /* renamed from: f */
    private hel f19168f;

    /* renamed from: g */
    private int f19169g;

    /* renamed from: h */
    private int f19170h;

    /* renamed from: i */
    private View f19171i;

    /* renamed from: j */
    private hix f19172j;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, "fragment_tag_loading_page");
        h.mo67695b(3, "fragment_tag_multi_credential");
        h.mo67695b(2, "fragment_tag_single_credential");
        h.mo67695b(4, "fragment_tag_confirmation");
        f19163a = h.mo67618b();
        bnha h2 = bnhe.m109414h();
        h2.mo67695b(1, gxe.f19159a);
        h2.mo67695b(3, gxf.f19160a);
        h2.mo67695b(2, gxg.f19161a);
        h2.mo67695b(4, gxh.f19162a);
        f19164b = h2.mo67618b();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f19169g = displayMetrics.widthPixels;
        this.f19170h = displayMetrics.heightPixels;
        this.f19166d = new heg(getChildFragmentManager(), this.f19171i, this.f19170h, bundle);
        Activity activity = getActivity();
        this.f19168f = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        gzz gzz = (gzz) adcj.m50161a(activity).mo3444a(gzz.class);
        this.f19167e = gzz;
        gzz.f19334w.mo2445a(this, new gxb(this));
        this.f19168f.f19608a.mo2445a(this, new gxc(this));
        this.f19172j = new hix(this, this.f19167e.f19321j, null);
        this.f19167e.f19323l.mo12423b();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bhfq bhfq = (bhfq) super.onCreateDialog(bundle);
        bhfq.setOnShowListener(new gxd(this, bhfq));
        return bhfq;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.credentials_gis_bottomsheet_dialog, viewGroup, false);
        this.f19171i = inflate;
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.f19167e.f19333v.mo2448b() == null) {
            this.f19172j.mo12513a(6);
            this.f19167e.mo12356a();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        int i;
        Window window;
        super.onResume();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_lower_width_threshold);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_upper_width_threshold);
        int i2 = this.f19169g;
        if (i2 > dimensionPixelSize2) {
            i = getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_adjusted_larger_width);
        } else {
            i = i2 > dimensionPixelSize ? getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_adjusted_intermediate_width) : 0;
        }
        Dialog dialog = getDialog();
        if (dialog != null && i > 0 && (window = dialog.getWindow()) != null) {
            window.setLayout(i, -1);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        this.f19166d.mo12437a(bundle);
        super.onSaveInstanceState(bundle);
    }
}
