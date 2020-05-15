package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: vol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vol extends aah {
    /* renamed from: j */
    public final void mo246j(View view) {
        int i = RecyclerView.getChildViewHolderInt(view).f206f;
        if (i == C0126R.C0128layout.drive_file_list_loading_spinner || i == C0126R.C0128layout.drive_file_list_failure_message || i == C0126R.C0128layout.drive_file_list_empty_message) {
            view.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (this.f115D - mo251v()) - mo253x()), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(Math.max(0, (this.f116E - mo252w()) - mo254y()), JGCastService.FLAG_PRIVATE_DISPLAY));
            return;
        }
        super.mo246j(view);
    }
}
