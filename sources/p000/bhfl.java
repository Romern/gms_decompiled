package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: bhfl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfl implements Runnable {

    /* renamed from: a */
    public boolean f118472a;

    /* renamed from: b */
    public int f118473b;

    /* renamed from: c */
    final /* synthetic */ BottomSheetBehavior f118474c;

    /* renamed from: d */
    private final View f118475d;

    public bhfl(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f118474c = bottomSheetBehavior;
        this.f118475d = view;
        this.f118473b = i;
    }

    public final void run() {
        C1338rw rwVar = this.f118474c.f151100n;
        if (rwVar != null && rwVar.mo15834b()) {
            C1280ps.m19891a(this.f118475d, this);
        } else {
            this.f118474c.mo71039d(this.f118473b);
        }
        this.f118472a = false;
    }
}
