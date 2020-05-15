package p000;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.ViewGroup;
import android.view.WindowManager;

/* renamed from: bhmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bhmq implements Runnable {

    /* renamed from: a */
    final /* synthetic */ bhnd f119087a;

    public bhmq(bhnd bhnd) {
        this.f119087a = bhnd;
    }

    public final void run() {
        Context context;
        bhnd bhnd = this.f119087a;
        if (bhnd.f119110e != null && (context = bhnd.f119109d) != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRealMetrics(displayMetrics);
            int i = displayMetrics.heightPixels;
            bhnd bhnd2 = this.f119087a;
            int[] iArr = new int[2];
            bhnd2.f119110e.getLocationOnScreen(iArr);
            int height = (i - (iArr[1] + bhnd2.f119110e.getHeight())) + ((int) this.f119087a.f119110e.getTranslationY());
            bhnd bhnd3 = this.f119087a;
            if (height < bhnd3.f119115j) {
                ViewGroup.LayoutParams layoutParams = bhnd3.f119110e.getLayoutParams();
                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                    Log.w(bhnd.f119106b, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                    return;
                }
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += this.f119087a.f119115j - height;
                this.f119087a.f119110e.requestLayout();
            }
        }
    }
}
