package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.setupwizardlib.GlifLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;

/* renamed from: vsw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class vsw extends Fragment {

    /* renamed from: g */
    vrb f49930g;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Spanned mo28814a(int i) {
        return m41201b(getString(i));
    }

    /* renamed from: b */
    public abstract bpeb mo28806b();

    /* renamed from: c */
    public abstract CharSequence mo28807c();

    /* renamed from: d */
    public void mo28808d() {
        getActivity().onBackPressed();
    }

    /* renamed from: e */
    public CharSequence mo28809e() {
        return null;
    }

    /* renamed from: f */
    public void mo28810f() {
    }

    /* renamed from: h */
    public CharSequence mo28817h() {
        return "";
    }

    /* renamed from: i */
    public int mo28818i() {
        return 0;
    }

    /* renamed from: j */
    public CharSequence mo28819j() {
        return null;
    }

    /* renamed from: k */
    public CharSequence mo28820k() {
        return null;
    }

    /* renamed from: l */
    public void mo28821l() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final vum mo28822m() {
        return ((vul) getActivity()).mo18365a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final boolean mo28823n() {
        Bundle arguments = getArguments();
        if (arguments == null || !arguments.getBoolean("DrivingMode.ImmediateStart", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo28824o() {
        Bundle arguments = getArguments();
        if (arguments == null || arguments.getInt("DrivingMode.ClientTriggerReason", 0) != 2) {
            return false;
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        vuk.m41322a();
        this.f49930g = vuk.m41326e(getContext());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.car_driving_mode_frx, viewGroup, false);
        mo28815a(inflate);
        Button button = (Button) inflate.findViewById(C0126R.C0129id.next_button);
        if (mo28809e() == null) {
            button.setVisibility(8);
        } else {
            button.setVisibility(0);
            button.setText(mo28809e());
            button.setOnClickListener(new vss(this));
        }
        Button button2 = (Button) inflate.findViewById(C0126R.C0129id.back_button);
        if (mo28819j() == null) {
            button2.setVisibility(8);
        } else {
            button2.setVisibility(0);
            button2.setText(mo28819j());
            button2.setOnClickListener(new vst(this));
        }
        Button button3 = (Button) inflate.findViewById(C0126R.C0129id.tertiary_button);
        if (mo28820k() == null) {
            button3.setVisibility(8);
        } else {
            button3.setVisibility(0);
            button3.setText(mo28820k());
            button3.setOnClickListener(new vsu(this));
        }
        ((TextView) inflate.findViewById(C0126R.C0129id.body)).setText(mo28817h());
        ((ImageView) inflate.findViewById(C0126R.C0129id.illustration)).setImageResource(mo28818i());
        return inflate;
    }

    public void onResume() {
        super.onResume();
        this.f49930g.mo28759a(mo28806b(), bpea.SCREEN_VIEW);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final void mo28825p() {
        this.f49930g.mo28759a(mo28806b(), bpea.DRIVING_MODE_FRX_NEXT_BUTTON);
        mo28810f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo28826q() {
        this.f49930g.mo28759a(mo28806b(), bpea.DRIVING_MODE_FRX_BACK_BUTTON);
        mo28808d();
    }

    /* renamed from: r */
    public final void mo28827r() {
        vuk.m41322a();
        vsi f = vuk.m41327f(getContext());
        f.mo28795k();
        f.mo28778a(new vsv(this, f));
    }

    /* renamed from: b */
    static final Spanned m41201b(String str) {
        int i = Build.VERSION.SDK_INT;
        return Html.fromHtml(str, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* renamed from: a */
    public final void mo28815a(View view) {
        TypedArray typedArray;
        GlifLayout glifLayout = (GlifLayout) view.findViewById(C0126R.C0129id.setup_wizard_layout);
        ImageView imageView = (ImageView) glifLayout.mo4081c(C0126R.C0129id.suw_layout_icon);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.car_driving_mode_frx_icon_size);
        imageView.getLayoutParams().height = dimensionPixelSize;
        imageView.getLayoutParams().width = dimensionPixelSize;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView.requestLayout();
        Drawable a = C1133kh.m17836a(getContext(), (int) C0126R.C0127drawable.quantum_gm_ic_directions_car_vd_theme_24);
        try {
            int i = 0;
            typedArray = getContext().getTheme().obtainStyledAttributes(new int[]{16843829});
            try {
                int color = typedArray.getColor(0, getResources().getColor(17170446));
                if (typedArray != null) {
                    typedArray.recycle();
                }
                a.setTint(color);
                ImageView a2 = ((bms) glifLayout.mo4084a(bms.class)).mo3288a();
                if (a2 != null) {
                    a2.setImageDrawable(a);
                    if (a == null) {
                        i = 8;
                    }
                    a2.setVisibility(i);
                }
                ((bmr) glifLayout.mo4084a(bmr.class)).mo3287a(mo28807c());
            } catch (Throwable th) {
                th = th;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            typedArray = null;
            if (typedArray != null) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo28816a(String str) {
        Context context = getContext();
        vuk.m41322a();
        vqk c = vuk.m41324c(context);
        if (((c.mo28747a() && !c.mo28749c().isEmpty()) || (vsr.m41191g() && vuv.m41426a(str))) && !mo28824o()) {
            mo28822m().mo28866c(new vsr());
        } else if (!mo28823n() || "car_pref_key_driving_mode_behavior_dnd_preference".equals(str)) {
            mo28822m().mo28866c(new vts());
        } else {
            mo28827r();
        }
    }
}
