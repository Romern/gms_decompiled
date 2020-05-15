package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupwizard.util.SetupWizardIllustration;

/* renamed from: bjbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjbx extends RelativeLayout {

    /* renamed from: a */
    private static final RelativeLayout.LayoutParams f122493a;

    /* renamed from: b */
    private final LayoutInflater f122494b;

    static {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        f122493a = layoutParams;
        layoutParams.addRule(10);
        f122493a.addRule(9);
        f122493a.addRule(11);
        f122493a.addRule(2, C0126R.C0129id.navigation_bar);
    }

    /* renamed from: a */
    private static void m103173a(View view, Drawable drawable) {
        View findViewById = view.findViewById(C0126R.C0129id.title_area);
        if (findViewById instanceof SetupWizardIllustration) {
            ((SetupWizardIllustration) findViewById).f151549a = drawable;
        }
    }

    /* renamed from: b */
    private static void m103174b(View view, Drawable drawable) {
        View findViewById = view.findViewById(C0126R.C0129id.title_area);
        if (findViewById != null) {
            findViewById.setBackground(drawable);
        }
    }

    public bjbx(Context context) {
        super(context, null, 0, 0);
        LayoutInflater from = LayoutInflater.from(context);
        this.f122494b = from;
        from.inflate((int) C0126R.C0128layout.auth_setup_wizard_nav_bar, this);
    }

    /* renamed from: a */
    public final View mo64985a() {
        View a = mo64986a((int) C0126R.string.auth_gls_name_checking_info_title, (int) C0126R.C0128layout.auth_setup_wizard_interstitial);
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(C0126R.attr.auth_setup_wizard_progress_bar_color, typedValue, true) && typedValue.type >= 28 && typedValue.type <= 31) {
            ((ProgressBar) a.findViewById(C0126R.C0129id.progress_bar)).setIndeterminateTintList(ColorStateList.valueOf(typedValue.data));
        }
        if (a.getId() != C0126R.C0129id.title_area) {
            getContext().getTheme().resolveAttribute(16842836, typedValue, true);
            if (typedValue.type < 28 || typedValue.type > 31) {
                Log.i("SetupWizardUI", "WindowBackground is not a color but could be a drawable.");
            } else {
                a.setBackgroundColor(typedValue.data);
            }
        }
        return a;
    }

    /* renamed from: a */
    public final View mo64986a(int i, int i2) {
        Drawable drawable;
        Drawable drawable2 = null;
        View inflate = this.f122494b.inflate((int) C0126R.C0128layout.auth_setup_wizard_content_container, (ViewGroup) null);
        ((TextView) inflate.findViewById(C0126R.C0129id.title)).setText(i);
        this.f122494b.inflate(i2, (ViewGroup) inflate.findViewById(C0126R.C0129id.setup_content));
        Context context = getContext();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(C0126R.attr.auth_setup_wizard_header_foreground, typedValue, true)) {
            if (typedValue.type == 1) {
                if (typedValue.data != 0) {
                    drawable = context.getDrawable(typedValue.data);
                } else {
                    drawable = null;
                }
                m103173a(inflate, drawable);
            } else if (typedValue.resourceId != 0) {
                m103173a(inflate, context.getDrawable(typedValue.resourceId));
            }
        }
        if (context.getTheme().resolveAttribute(C0126R.attr.auth_setup_wizard_header_background, typedValue, true)) {
            if (typedValue.type == 1) {
                if (typedValue.data != 0) {
                    drawable2 = context.getDrawable(typedValue.data);
                }
                m103174b(inflate, drawable2);
            } else if (typedValue.type >= 28 && typedValue.type <= 31) {
                int i3 = typedValue.data;
                View findViewById = inflate.findViewById(C0126R.C0129id.title_area);
                if (findViewById != null) {
                    findViewById.setBackground(null);
                    findViewById.setBackgroundColor(i3);
                }
            } else if (typedValue.resourceId != 0) {
                m103174b(inflate, context.getDrawable(typedValue.resourceId));
            }
        }
        addView(inflate, f122493a);
        return inflate;
    }
}
