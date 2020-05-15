package p000;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.widget.ProgressBar;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentManager;

/* renamed from: aexw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aexw {
    /* renamed from: a */
    public static void m52662a(Activity activity) {
        Dialog dialog;
        aexv aexv = (aexv) activity.getSupportFragmentManager().findFragmentByTag("tag_progress_fragment");
        if (aexv != null && (dialog = aexv.f63993a) != null) {
            dialog.dismiss();
            aexv.f63993a = null;
        }
    }

    /* renamed from: a */
    public static void m52663a(Activity activity, int i) {
        m52664a(activity, i, false);
    }

    /* renamed from: a */
    public static void m52664a(Activity activity, int i, boolean z) {
        m52665a(activity, i, z, new aexu(activity));
    }

    /* renamed from: a */
    public static void m52665a(Activity activity, int i, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        aexv aexv = (aexv) supportFragmentManager.findFragmentByTag("tag_progress_fragment");
        if (aexv == null) {
            aexv = new aexv();
            supportFragmentManager.beginTransaction().add(aexv, "tag_progress_fragment").commitAllowingStateLoss();
        }
        aexv.f63993a = ProgressDialog.show(activity, null, activity.getString(i), true, z, onCancelListener);
        aexv.f63993a.setCanceledOnTouchOutside(false);
        int intExtra = activity.getIntent().getIntExtra("accent_color", -2);
        if (intExtra != -2) {
            ((ProgressBar) aexv.f63993a.findViewById(16908301)).getIndeterminateDrawable().setColorFilter(intExtra, PorterDuff.Mode.SRC_ATOP);
        }
    }
}
