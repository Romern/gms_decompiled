package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: bhff */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhff implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f118465a;

    /* renamed from: b */
    final /* synthetic */ int f118466b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f118467c;

    public bhff(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f118467c = bottomSheetBehavior;
        this.f118465a = view;
        this.f118466b = i;
    }

    public final void run() {
        this.f118467c.mo71027a(this.f118465a, this.f118466b);
    }
}
