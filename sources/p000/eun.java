package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Set;

/* renamed from: eun */
final /* synthetic */ class eun implements Runnable {

    /* renamed from: a */
    private final euq f15763a;

    /* renamed from: b */
    private final View f15764b;

    /* renamed from: c */
    private final Set f15765c;

    /* renamed from: d */
    private final bsxh f15766d;

    public eun(euq euq, View view, Set set, bsxh bsxh) {
        this.f15763a = euq;
        this.f15764b = view;
        this.f15765c = set;
        this.f15766d = bsxh;
    }

    public final void run() {
        euq euq = this.f15763a;
        View view = this.f15764b;
        Set set = this.f15765c;
        bsxh bsxh = this.f15766d;
        int i = -euq.f15777t.getWidth();
        view.setX((float) (i + i));
        if (!set.isEmpty()) {
            ViewGroup.LayoutParams layoutParams = euq.f15777t.getLayoutParams();
            layoutParams.height = euq.f15777t.getHeight();
            euq.f15777t.setLayoutParams(layoutParams);
            euq.f15777t.removeView(view);
            LinearLayout linearLayout = euq.f15777t;
            View childAt = linearLayout.getChildAt(linearLayout.getChildCount() - 1);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int i2 = Build.VERSION.SDK_INT;
            layoutParams2.setMarginEnd(0);
            childAt.setLayoutParams(layoutParams2);
        } else {
            int d = euq.mo323d();
            euq.f15779v.f15934f.remove(d);
            euq.f15779v.mo160O(d);
            euz euz = euq.f15779v;
            euz.mo180h(d, euz.f15934f.size());
        }
        eui eui = euq.f15779v.f15805a;
        Long valueOf = Long.valueOf(bsxh.f147554b);
        eui eui2 = ((euh) eui).f15754a.f7766c;
        if (eui2 != null) {
            fcg fcg = ((eyj) eui2).f16030a.f16032a.f16297b;
            fcg.f16263a.mo10448a(fcg.mo10683b(), valueOf);
        }
    }
}
