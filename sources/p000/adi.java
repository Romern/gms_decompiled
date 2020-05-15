package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: adi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adi extends aci {

    /* renamed from: m */
    final /* synthetic */ abx f259m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public adi(abx abx, Context context) {
        super(context);
        this.f259m = abx;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo297a(DisplayMetrics displayMetrics) {
        return 100.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo302a(View view, acg acg) {
        abx abx = this.f259m;
        RecyclerView recyclerView = abx.f133a;
        if (recyclerView != null) {
            int[] a = abx.mo264a(recyclerView.getLayoutManager(), view);
            int i = a[0];
            int i2 = a[1];
            int b = mo303b(Math.max(Math.abs(i), Math.abs(i2)));
            if (b > 0) {
                acg.mo295a(i, i2, b, this.f169i);
            }
        }
    }
}
