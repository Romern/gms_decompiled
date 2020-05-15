package p000;

import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ozb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ozb {
    /* renamed from: a */
    static ProgressBar m30029a(Resources resources, ViewGroup viewGroup) {
        ProgressBar progressBar = (ProgressBar) viewGroup.findViewById(C0126R.C0129id.progress_bar);
        progressBar.setIndeterminateDrawable(new azyz(resources.getDimensionPixelSize(C0126R.dimen.car_frx_progress_thickness), 0, new int[]{resources.getColor(C0126R.color.car_frx_progress_color)}));
        progressBar.setProgressDrawable(new azyv(resources.getDimensionPixelSize(C0126R.dimen.car_frx_progress_thickness), 0, resources.getColor(C0126R.color.car_frx_progress_color)));
        return progressBar;
    }
}
