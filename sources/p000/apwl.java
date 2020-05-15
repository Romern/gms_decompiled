package p000;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.widget.phone.SwitchBar;

/* renamed from: apwl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apwl extends sva {

    /* renamed from: t */
    private final SwitchBar f85016t;

    /* renamed from: u */
    private final Context f85017u;

    public apwl(View view, Context context) {
        super(view);
        this.f85017u = context;
        SwitchBar switchBar = (SwitchBar) view.findViewById(C0126R.C0129id.toggle);
        this.f85016t = switchBar;
        if (context instanceof sux) {
            switchBar.f30418a = (sux) context;
        }
    }

    /* renamed from: a */
    public final void mo23819a(svc svc) {
        if (svc instanceof apwn) {
            this.f85016t.mo17943a(((svm) ((apwn) svc)).f45239a);
            View childAt = this.f85016t.getChildAt(0);
            if (childAt != null) {
                ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).leftMargin = Math.round(TypedValue.applyDimension(1, 72.0f, this.f85017u.getResources().getDisplayMetrics()));
                return;
            }
            return;
        }
        throw new IllegalArgumentException("settingItem must be FindMyDeviceTopToggleItem");
    }
}
