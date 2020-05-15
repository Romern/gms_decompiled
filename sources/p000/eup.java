package p000;

import android.os.Looper;
import android.view.View;
import java.util.Set;

/* renamed from: eup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class eup implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ int f15772a;

    /* renamed from: b */
    final /* synthetic */ int f15773b;

    /* renamed from: c */
    final /* synthetic */ Set f15774c;

    /* renamed from: d */
    final /* synthetic */ euq f15775d;

    public eup(euq euq, int i, int i2, Set set) {
        this.f15775d = euq;
        this.f15772a = i;
        this.f15773b = i2;
        this.f15774c = set;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f15775d.f15776s.removeOnLayoutChangeListener(this);
        new adzt(Looper.getMainLooper()).post(new euo(this, this.f15772a, Math.max(i3 - i, i - i3), this.f15773b, this.f15774c));
    }
}
