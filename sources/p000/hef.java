package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: hef */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class hef extends bhfj {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f19581a;

    /* renamed from: b */
    final /* synthetic */ heg f19582b;

    public hef(heg heg, BottomSheetBehavior bottomSheetBehavior) {
        this.f19582b = heg;
        this.f19581a = bottomSheetBehavior;
    }

    /* renamed from: a */
    public final void mo12434a(int i) {
    }

    /* renamed from: a */
    public final void mo12435a(View view, float f) {
        this.f19582b.f19586d = (int) (((1.0f - f) * ((float) this.f19581a.mo71032b())) + (f * ((float) view.getMeasuredHeight())));
    }
}
