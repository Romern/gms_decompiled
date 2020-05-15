package p000;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: vz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class C1449vz extends FrameLayout implements C1415us {

    /* renamed from: a */
    final CollapsibleActionView f27483a;

    public C1449vz(View view) {
        super(view.getContext());
        this.f27483a = (CollapsibleActionView) view;
        addView(view);
    }

    /* renamed from: a */
    public final void mo1612a() {
        this.f27483a.onActionViewExpanded();
    }

    /* renamed from: b */
    public final void mo1619b() {
        this.f27483a.onActionViewCollapsed();
    }
}
