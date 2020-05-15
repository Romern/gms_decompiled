package p000;

import android.content.Context;
import android.widget.CompoundButton;

/* renamed from: anzp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class anzp extends CompoundButton {

    /* renamed from: a */
    final /* synthetic */ anzq f77941a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anzp(anzq anzq, Context context) {
        super(context);
        this.f77941a = anzq;
    }

    public final void toggle() {
        anzq anzq = this.f77941a;
        if (anzq.f77943a) {
            super.toggle();
            return;
        }
        anzq.f77943a = true;
        anzq.mo42498b(2);
        anzq.f77946d.setVisibility(0);
        anzq.mo42501e();
    }
}
