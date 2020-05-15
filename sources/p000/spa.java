package p000;

import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.felicanetworks.mfc.C0126R;

/* renamed from: spa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class spa {
    /* renamed from: a */
    public static int m35814a(Activity activity) {
        Resources resources = activity.getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public static void m35815a(Activity activity, double d) {
        boolean z;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        sdo.m34975b(z, "Either width or height resize factor must be > 0");
        Resources resources = activity.getResources();
        resources.getConfiguration();
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        if (d > 0.0d) {
            if (resources.getBoolean(C0126R.bool.common_should_fix_dialog_height)) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                if (displayMetrics.heightPixels > 0) {
                    double d2 = (double) displayMetrics.heightPixels;
                    Double.isNaN(d2);
                    attributes.height = (int) ((d2 * d) + 0.5d);
                }
            } else {
                attributes.height = -1;
            }
        }
        window.setAttributes(attributes);
    }

    /* renamed from: a */
    public static boolean m35816a(MotionEvent motionEvent, View view) {
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int left = view.getLeft();
        int top = view.getTop();
        return x > view.getWidth() + left || x < left || y < top || y > view.getHeight() + top;
    }
}
