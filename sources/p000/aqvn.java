package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.smart_profile.header.view.HeaderView;

/* renamed from: aqvn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqvn extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ HeaderView f86929a;

    public aqvn(HeaderView headerView) {
        this.f86929a = headerView;
    }

    public final void getOutline(View view, Outline outline) {
        int a = this.f86929a.mo59014a((int) C0126R.dimen.profile_header_avatar_diameter);
        outline.setOval(0, 0, a, a);
    }
}
