package p000;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;

/* renamed from: tuv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class tuv extends adcf {
    /* renamed from: bq */
    public boolean mo26806bq() {
        return false;
    }

    public void onResume() {
        super.onResume();
        if (cdpx.m134644b()) {
            ((SwipeRefreshLayout) getActivity().findViewById(C0126R.C0129id.main_swipe_refresh_layout)).setEnabled(mo26806bq());
        }
    }
}
