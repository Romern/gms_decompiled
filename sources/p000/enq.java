package p000;

import android.view.View;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.List;

/* renamed from: enq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class enq {

    /* renamed from: a */
    public int f15337a = Integer.MAX_VALUE;

    /* renamed from: b */
    public int f15338b = Integer.MAX_VALUE;

    /* renamed from: c */
    public int f15339c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f15340d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f15341e;

    /* renamed from: f */
    public int f15342f;

    /* renamed from: g */
    public int f15343g;

    /* renamed from: h */
    public int f15344h;

    /* renamed from: i */
    int f15345i;

    /* renamed from: j */
    float f15346j;

    /* renamed from: k */
    float f15347k;

    /* renamed from: l */
    public int f15348l;

    /* renamed from: m */
    int f15349m;

    /* renamed from: n */
    final List f15350n = new ArrayList();

    /* renamed from: o */
    public int f15351o;

    /* renamed from: a */
    public final int mo10328a() {
        return this.f15344h - this.f15345i;
    }

    /* renamed from: a */
    public final void mo10329a(View view, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        this.f15337a = Math.min(this.f15337a, (view.getLeft() - flexItem.mo6287m()) - i);
        this.f15338b = Math.min(this.f15338b, (view.getTop() - flexItem.mo6288n()) - i2);
        this.f15339c = Math.max(this.f15339c, view.getRight() + flexItem.mo6289o() + i3);
        this.f15340d = Math.max(this.f15340d, view.getBottom() + flexItem.mo6290p() + i4);
    }
}
