package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.common.HelpConfig;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: wxb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wxb {
    /* renamed from: a */
    public static Pair m42439a(Resources resources, Rect rect, int i, int i2, boolean z) {
        int i3;
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (!z) {
            i3 = displayMetrics.heightPixels;
        } else if (i2 <= i) {
            i3 = Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels);
        } else {
            i3 = Math.max(displayMetrics.heightPixels, displayMetrics.widthPixels);
        }
        int dimension = (int) resources.getDimension(C0126R.dimen.gf_drawable_top_margin);
        int dimension2 = (int) resources.getDimension(C0126R.dimen.gf_drawable_border);
        int dimension3 = ((((i3 - ((int) resources.getDimension(C0126R.dimen.gf_top_menu_size))) - (dimension + dimension)) - rect.top) - (dimension2 + dimension2)) - ((int) resources.getDimension(C0126R.dimen.gf_separator_size));
        return new Pair(Integer.valueOf(Math.round((((float) i) / ((float) i2)) * ((float) dimension3))), Integer.valueOf(dimension3));
    }

    /* renamed from: a */
    public static HelpConfig m42440a(ErrorReport errorReport, Context context) {
        GoogleHelp googleHelp = new GoogleHelp("gms:feedback:suggestions");
        if (!TextUtils.isEmpty(errorReport.f31511B)) {
            googleHelp.f78760c = new Account(errorReport.f31511B, "com.google");
        }
        new aare(googleHelp).mo31634a(errorReport.f31543ag);
        HelpConfig a = HelpConfig.m66350a(googleHelp, context);
        a.f78827b = errorReport.f31536a.packageName;
        return a;
    }

    /* renamed from: a */
    public static void m42441a(View view) {
        View view2 = (View) view.getParent();
        if (view2 != null) {
            view2.post(new wxa(view.getResources().getDimensionPixelSize(C0126R.dimen.gf_accessibility_required_min_touch_target_size), view, view2));
        }
    }

    /* renamed from: a */
    public static boolean m42442a(Pair pair, Screenshot screenshot) {
        return screenshot.f78922a >= ((Integer) pair.first).intValue() / 2 || screenshot.f78923b >= ((Integer) pair.first).intValue() / 2 || screenshot.f78922a >= ((Integer) pair.second).intValue() / 2 || screenshot.f78923b >= ((Integer) pair.second).intValue() / 2;
    }

    /* renamed from: a */
    public static boolean m42443a(ErrorReport errorReport) {
        return errorReport != null && errorReport.f31536a.type == 11;
    }
}
