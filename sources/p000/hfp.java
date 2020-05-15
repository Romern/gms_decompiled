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

/* renamed from: hfp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class hfp extends adcd {

    /* renamed from: a */
    public static final bnhe f19671a;

    /* renamed from: b */
    public BottomSheetBehavior f19672b;

    /* renamed from: c */
    public heg f19673c;

    /* renamed from: d */
    private int f19674d;

    /* renamed from: e */
    private int f19675e;

    /* renamed from: f */
    private View f19676f;

    /* renamed from: g */
    private hhe f19677g;

    /* renamed from: h */
    private hel f19678h;

    /* renamed from: i */
    private hix f19679i;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(1, "loading_page");
        h.mo67695b(2, "confirmation_page");
        h.mo67695b(3, "account_selection_page");
        f19671a = h.mo67618b();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        this.f19674d = displayMetrics.widthPixels;
        this.f19675e = displayMetrics.heightPixels;
        this.f19673c = new heg(getChildFragmentManager(), this.f19676f, this.f19675e, bundle);
        this.f19678h = (hel) adcj.m50161a(activity).mo3444a(hel.class);
        hhe hhe = (hhe) adcj.m50161a(activity).mo3444a(hhe.class);
        this.f19677g = hhe;
        hhe.f19762q.mo2445a(this, new hfm(this));
        this.f19678h.f19608a.mo2445a(this, new hfn(this));
        this.f19679i = new hix(this, this.f19677g.f19751f, null);
        this.f19677g.f19760o.mo12423b();
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        bhfq bhfq = (bhfq) super.onCreateDialog(bundle);
        bhfq.setOnShowListener(new hfo(this, bhfq));
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
        this.f19676f = inflate;
        return inflate;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        if (!getActivity().isChangingConfigurations() && this.f19677g.f19765t.mo2448b() == null) {
            this.f19677g.mo12466a();
            this.f19679i.mo12513a(6);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onResume() {
        int i;
        Window window;
        super.onResume();
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_lower_width_threshold);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C0126R.dimen.credentials_gis_bottomsheet_dialog_upper_width_threshold);
        int i2 = this.f19674d;
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
        this.f19673c.mo12437a(bundle);
        super.onSaveInstanceState(bundle);
    }
}
