package p000;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import com.google.android.flexbox.FlexItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: ent */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ent {

    /* renamed from: a */
    public final enp f15356a;

    /* renamed from: b */
    private boolean[] f15357b;

    public ent(enp enp) {
        this.f15356a = enp;
    }

    /* renamed from: a */
    private final int m10795a(int i, FlexItem flexItem, int i2) {
        enp enp = this.f15356a;
        int a = enp.mo6293a(i, enp.getPaddingLeft() + this.f15356a.getPaddingRight() + flexItem.mo6287m() + flexItem.mo6289o() + i2, flexItem.mo6275a());
        int size = View.MeasureSpec.getSize(a);
        if (size > flexItem.mo6283i()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo6283i(), View.MeasureSpec.getMode(a));
        }
        return size < flexItem.mo6281g() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6281g(), View.MeasureSpec.getMode(a)) : a;
    }

    /* renamed from: b */
    private final int m10805b(int i, FlexItem flexItem, int i2) {
        enp enp = this.f15356a;
        int b = enp.mo6300b(i, enp.getPaddingTop() + this.f15356a.getPaddingBottom() + flexItem.mo6288n() + flexItem.mo6290p() + i2, flexItem.mo6276b());
        int size = View.MeasureSpec.getSize(b);
        if (size > flexItem.mo6284j()) {
            return View.MeasureSpec.makeMeasureSpec(flexItem.mo6284j(), View.MeasureSpec.getMode(b));
        }
        return size < flexItem.mo6282h() ? View.MeasureSpec.makeMeasureSpec(flexItem.mo6282h(), View.MeasureSpec.getMode(b)) : b;
    }

    /* renamed from: c */
    private static final int m10809c(FlexItem flexItem, boolean z) {
        if (!z) {
            return flexItem.mo6287m();
        }
        return flexItem.mo6288n();
    }

    /* renamed from: d */
    private static final int m10810d(FlexItem flexItem, boolean z) {
        if (!z) {
            return flexItem.mo6288n();
        }
        return flexItem.mo6287m();
    }

    /* renamed from: e */
    private static final int m10811e(FlexItem flexItem, boolean z) {
        if (!z) {
            return flexItem.mo6275a();
        }
        return flexItem.mo6276b();
    }

    /* renamed from: a */
    private static final int m10796a(View view, boolean z) {
        if (!z) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    /* renamed from: b */
    private static final int m10806b(FlexItem flexItem, boolean z) {
        if (!z) {
            return flexItem.mo6290p();
        }
        return flexItem.mo6289o();
    }

    /* renamed from: a */
    private static final int m10797a(FlexItem flexItem, boolean z) {
        if (!z) {
            return flexItem.mo6289o();
        }
        return flexItem.mo6290p();
    }

    /* renamed from: b */
    private final void m10807b(int i, int i2, enq enq, int i3, int i4, boolean z) {
        float f;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        enq enq2 = enq;
        int i12 = i3;
        int i13 = enq2.f15341e;
        float f2 = enq2.f15347k;
        float f3 = 0.0f;
        if (f2 > 0.0f && i12 <= i13) {
            float f4 = ((float) (i13 - i12)) / f2;
            enq2.f15341e = i4 + enq2.f15342f;
            int i14 = 0;
            if (!z) {
                enq2.f15343g = Integer.MIN_VALUE;
                z2 = false;
                i5 = 0;
                f = 0.0f;
            } else {
                z2 = false;
                i5 = 0;
                f = 0.0f;
            }
            while (i14 < enq2.f15344h) {
                int i15 = enq2.f15351o + i14;
                View b = this.f15356a.mo6301b(i15);
                if (b == null) {
                    i7 = i13;
                    i6 = i14;
                } else if (b.getVisibility() != 8) {
                    FlexItem flexItem = (FlexItem) b.getLayoutParams();
                    int b2 = this.f15356a.mo6299b();
                    if (b2 == 0) {
                        i10 = i13;
                        i9 = i14;
                    } else if (b2 != 1) {
                        int measuredHeight = b.getMeasuredHeight();
                        int measuredWidth = b.getMeasuredWidth();
                        if (this.f15357b[i15]) {
                            i7 = i13;
                            i11 = i14;
                        } else if (flexItem.mo6279e() > f3) {
                            float e = ((float) measuredHeight) - (flexItem.mo6279e() * f4);
                            if (i14 == enq2.f15344h - 1) {
                                e += f;
                                f = 0.0f;
                            }
                            int round = Math.round(e);
                            if (round < flexItem.mo6282h()) {
                                round = flexItem.mo6282h();
                                this.f15357b[i15] = true;
                                enq2.f15347k -= flexItem.mo6279e();
                                i7 = i13;
                                i11 = i14;
                                z2 = true;
                            } else {
                                f += e - ((float) round);
                                i7 = i13;
                                i11 = i14;
                                double d = (double) f;
                                if (d > 1.0d) {
                                    round++;
                                    f -= 4.0f;
                                } else if (d < -1.0d) {
                                    round--;
                                    f += 1.0f;
                                }
                            }
                            b.measure(m10795a(i, flexItem, enq2.f15349m), View.MeasureSpec.makeMeasureSpec(round, JGCastService.FLAG_PRIVATE_DISPLAY));
                            measuredWidth = b.getMeasuredWidth();
                            measuredHeight = b.getMeasuredHeight();
                        } else {
                            i7 = i13;
                            i11 = i14;
                        }
                        i8 = Math.max(i5, measuredWidth + flexItem.mo6287m() + flexItem.mo6289o() + this.f15356a.mo6317k());
                        enq2.f15341e += measuredHeight + flexItem.mo6288n() + flexItem.mo6290p();
                        i6 = i11;
                        enq2.f15343g = Math.max(enq2.f15343g, i8);
                        i5 = i8;
                    } else {
                        i10 = i13;
                        i9 = i14;
                    }
                    int measuredWidth2 = b.getMeasuredWidth();
                    int measuredHeight2 = b.getMeasuredHeight();
                    if (this.f15357b[i15]) {
                        i6 = i9;
                    } else if (flexItem.mo6279e() > 0.0f) {
                        float e2 = ((float) measuredWidth2) - (flexItem.mo6279e() * f4);
                        i6 = i9;
                        if (i6 == enq2.f15344h - 1) {
                            e2 += f;
                            f = 0.0f;
                        }
                        int round2 = Math.round(e2);
                        if (round2 < flexItem.mo6281g()) {
                            round2 = flexItem.mo6281g();
                            z2 = true;
                            this.f15357b[i15] = true;
                            enq2.f15347k -= flexItem.mo6279e();
                        } else {
                            f += e2 - ((float) round2);
                            double d2 = (double) f;
                            if (d2 > 1.0d) {
                                round2++;
                                f -= 4.0f;
                            } else if (d2 < -1.0d) {
                                round2--;
                                f += 1.0f;
                            }
                        }
                        b.measure(View.MeasureSpec.makeMeasureSpec(round2, JGCastService.FLAG_PRIVATE_DISPLAY), m10805b(i2, flexItem, enq2.f15349m));
                        measuredWidth2 = b.getMeasuredWidth();
                        measuredHeight2 = b.getMeasuredHeight();
                    } else {
                        i6 = i9;
                    }
                    int max = Math.max(i5, measuredHeight2 + flexItem.mo6288n() + flexItem.mo6290p() + this.f15356a.mo6317k());
                    enq2.f15341e += measuredWidth2 + flexItem.mo6287m() + flexItem.mo6289o();
                    i8 = max;
                    enq2.f15343g = Math.max(enq2.f15343g, i8);
                    i5 = i8;
                } else {
                    i7 = i13;
                    i6 = i14;
                }
                i14 = i6 + 1;
                i13 = i7;
                f3 = 0.0f;
            }
            int i16 = i13;
            if (z2 && i16 != enq2.f15341e) {
                m10807b(i, i2, enq, i3, i4, true);
            }
        }
    }

    /* renamed from: a */
    private static final List m10798a(List list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        enq enq = new enq();
        enq.f15343g = (i - i2) / 2;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (i3 == 0) {
                arrayList.add(enq);
            }
            arrayList.add((enq) list.get(i3));
            if (i3 == list.size() - 1) {
                arrayList.add(enq);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ent.a(int, int, enq, int, int, boolean):void
     arg types: [int, int, enq, int, int, int]
     candidates:
      ent.a(android.view.View, enq, int, int, int, int):void
      ent.a(int, int, enq, int, int, boolean):void */
    /* renamed from: a */
    private final void m10799a(int i, int i2, enq enq, int i3, int i4, boolean z) {
        int i5;
        float f;
        int i6;
        boolean z2;
        int i7;
        double d;
        double d2;
        enq enq2 = enq;
        int i8 = i3;
        float f2 = enq2.f15346j;
        float f3 = 0.0f;
        if (f2 > 0.0f && i8 >= (i5 = enq2.f15341e)) {
            float f4 = ((float) (i8 - i5)) / f2;
            enq2.f15341e = i4 + enq2.f15342f;
            int i9 = 0;
            if (!z) {
                enq2.f15343g = Integer.MIN_VALUE;
                z2 = false;
                i6 = 0;
                f = 0.0f;
            } else {
                z2 = false;
                i6 = 0;
                f = 0.0f;
            }
            while (i9 < enq2.f15344h) {
                int i10 = enq2.f15351o + i9;
                View b = this.f15356a.mo6301b(i10);
                if (b != null) {
                    if (b.getVisibility() != 8) {
                        FlexItem flexItem = (FlexItem) b.getLayoutParams();
                        int b2 = this.f15356a.mo6299b();
                        if (b2 == 0 || b2 == 1) {
                            int measuredWidth = b.getMeasuredWidth();
                            int measuredHeight = b.getMeasuredHeight();
                            if (!this.f15357b[i10]) {
                                if (flexItem.mo6278d() > 0.0f) {
                                    float d3 = ((float) measuredWidth) + (flexItem.mo6278d() * f4);
                                    if (i9 == enq2.f15344h - 1) {
                                        d3 += f;
                                        f = 0.0f;
                                    }
                                    int round = Math.round(d3);
                                    if (round > flexItem.mo6283i()) {
                                        round = flexItem.mo6283i();
                                        this.f15357b[i10] = true;
                                        enq2.f15346j -= flexItem.mo6278d();
                                        z2 = true;
                                    } else {
                                        f += d3 - ((float) round);
                                        double d4 = (double) f;
                                        if (d4 > 1.0d) {
                                            round++;
                                            Double.isNaN(d4);
                                            d = d4 - 4.0d;
                                        } else if (d4 < -1.0d) {
                                            round--;
                                            Double.isNaN(d4);
                                            d = d4 + 1.0d;
                                        }
                                        f = (float) d;
                                    }
                                    b.measure(View.MeasureSpec.makeMeasureSpec(round, JGCastService.FLAG_PRIVATE_DISPLAY), m10805b(i2, flexItem, enq2.f15349m));
                                    measuredWidth = b.getMeasuredWidth();
                                    measuredHeight = b.getMeasuredHeight();
                                }
                            }
                            int max = Math.max(i6, measuredHeight + flexItem.mo6288n() + flexItem.mo6290p() + this.f15356a.mo6317k());
                            enq2.f15341e += measuredWidth + flexItem.mo6287m() + flexItem.mo6289o();
                            i7 = max;
                        } else {
                            int measuredHeight2 = b.getMeasuredHeight();
                            int measuredWidth2 = b.getMeasuredWidth();
                            if (!this.f15357b[i10]) {
                                if (flexItem.mo6278d() > f3) {
                                    float d5 = ((float) measuredHeight2) + (flexItem.mo6278d() * f4);
                                    if (i9 == enq2.f15344h - 1) {
                                        d5 += f;
                                        f = 0.0f;
                                    }
                                    int round2 = Math.round(d5);
                                    if (round2 > flexItem.mo6284j()) {
                                        round2 = flexItem.mo6284j();
                                        this.f15357b[i10] = true;
                                        enq2.f15346j -= flexItem.mo6278d();
                                        z2 = true;
                                    } else {
                                        f += d5 - ((float) round2);
                                        double d6 = (double) f;
                                        if (d6 > 1.0d) {
                                            round2++;
                                            Double.isNaN(d6);
                                            d2 = d6 - 4.0d;
                                        } else if (d6 < -1.0d) {
                                            round2--;
                                            Double.isNaN(d6);
                                            d2 = d6 + 1.0d;
                                        }
                                        f = (float) d2;
                                    }
                                    b.measure(m10795a(i, flexItem, enq2.f15349m), View.MeasureSpec.makeMeasureSpec(round2, JGCastService.FLAG_PRIVATE_DISPLAY));
                                    measuredWidth2 = b.getMeasuredWidth();
                                    measuredHeight2 = b.getMeasuredHeight();
                                }
                            }
                            i7 = Math.max(i6, measuredWidth2 + flexItem.mo6287m() + flexItem.mo6289o() + this.f15356a.mo6317k());
                            enq2.f15341e += measuredHeight2 + flexItem.mo6288n() + flexItem.mo6290p();
                        }
                        enq2.f15343g = Math.max(enq2.f15343g, i7);
                        i6 = i7;
                    }
                }
                i9++;
                f3 = 0.0f;
            }
            if (z2 && i5 != enq2.f15341e) {
                m10799a(i, i2, enq, i3, i4, true);
            }
        }
    }

    /* renamed from: b */
    private final void m10808b(View view, int i) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int n = flexItem.mo6288n();
        int p = flexItem.mo6290p();
        enp enp = this.f15356a;
        view.measure(View.MeasureSpec.makeMeasureSpec(view.getMeasuredWidth(), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(Math.min(Math.max(((i - n) - p) - enp.mo6317k(), flexItem.mo6282h()), flexItem.mo6284j()), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: a */
    private static final void m10800a(View view) {
        boolean z;
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z2 = true;
        if (measuredWidth < flexItem.mo6281g()) {
            measuredWidth = flexItem.mo6281g();
            z = true;
        } else if (measuredWidth > flexItem.mo6283i()) {
            measuredWidth = flexItem.mo6283i();
            z = true;
        } else {
            z = false;
        }
        if (measuredHeight < flexItem.mo6282h()) {
            measuredHeight = flexItem.mo6282h();
        } else if (measuredHeight > flexItem.mo6284j()) {
            measuredHeight = flexItem.mo6284j();
        } else {
            z2 = z;
        }
        if (z2) {
            view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(measuredHeight, JGCastService.FLAG_PRIVATE_DISPLAY));
        }
    }

    /* renamed from: a */
    private final void m10801a(View view, int i) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int m = flexItem.mo6287m();
        int o = flexItem.mo6289o();
        enp enp = this.f15356a;
        int min = Math.min(Math.max(((i - m) - o) - enp.mo6317k(), flexItem.mo6281g()), flexItem.mo6283i());
        view.measure(View.MeasureSpec.makeMeasureSpec(min, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
    }

    /* renamed from: a */
    private final void m10802a(List list, enq enq, int i) {
        enq.f15349m = i;
        this.f15356a.mo6297a(enq);
        list.add(enq);
    }

    /* renamed from: a */
    private static final boolean m10803a(int i, int i2, enq enq) {
        return i == i2 + -1 && enq.mo10328a() != 0;
    }

    /* renamed from: a */
    public static final int[] m10804a(int i, List list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i];
        int size = list.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ens ens = (ens) list.get(i3);
            int i4 = ens.f15354a;
            iArr[i2] = i4;
            sparseIntArray.append(i4, ens.f15355b);
            i2++;
        }
        return iArr;
    }

    /* renamed from: a */
    public final List mo10333a(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            ens ens = new ens();
            ens.f15355b = ((FlexItem) this.f15356a.mo6294a(i2).getLayoutParams()).mo6277c();
            ens.f15354a = i2;
            arrayList.add(ens);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo10334a() {
        View b;
        if (this.f15356a.mo6291a() > 0) {
            int b2 = this.f15356a.mo6299b();
            if (this.f15356a.mo6308e() == 4) {
                List j = this.f15356a.mo6316j();
                int size = j.size();
                for (int i = 0; i < size; i++) {
                    enq enq = (enq) j.get(i);
                    int i2 = enq.f15344h;
                    for (int i3 = 0; i3 < i2; i3++) {
                        int i4 = enq.f15351o + i3;
                        if (!(i3 >= this.f15356a.mo6291a() || (b = this.f15356a.mo6301b(i4)) == null || b.getVisibility() == 8)) {
                            FlexItem flexItem = (FlexItem) b.getLayoutParams();
                            if (flexItem.mo6280f() == -1 || flexItem.mo6280f() == 4) {
                                if (b2 == 0 || b2 == 1) {
                                    m10808b(b, enq.f15343g);
                                } else if (b2 == 2 || b2 == 3) {
                                    m10801a(b, enq.f15343g);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + b2);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (enq enq2 : this.f15356a.mo6316j()) {
                List list = enq2.f15350n;
                int size2 = list.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    Integer num = (Integer) list.get(i5);
                    View b3 = this.f15356a.mo6301b(num.intValue());
                    if (b2 == 0 || b2 == 1) {
                        int i6 = enq2.f15343g;
                        num.intValue();
                        m10808b(b3, i6);
                    } else if (b2 == 2 || b2 == 3) {
                        int i7 = enq2.f15343g;
                        num.intValue();
                        m10801a(b3, i7);
                    } else {
                        throw new IllegalArgumentException("Invalid flex direction: " + b2);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.Arrays.fill(boolean[], boolean):void}
     arg types: [boolean[], int]
     candidates:
      ClspMth{java.util.Arrays.fill(double[], double):void}
      ClspMth{java.util.Arrays.fill(byte[], byte):void}
      ClspMth{java.util.Arrays.fill(long[], long):void}
      ClspMth{java.util.Arrays.fill(char[], char):void}
      ClspMth{java.util.Arrays.fill(short[], short):void}
      ClspMth{java.util.Arrays.fill(java.lang.Object[], java.lang.Object):void}
      ClspMth{java.util.Arrays.fill(int[], int):void}
      ClspMth{java.util.Arrays.fill(float[], float):void}
      ClspMth{java.util.Arrays.fill(boolean[], boolean):void} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ent.a(int, int, enq, int, int, boolean):void
     arg types: [int, int, enq, int, int, int]
     candidates:
      ent.a(android.view.View, enq, int, int, int, int):void
      ent.a(int, int, enq, int, int, boolean):void */
    /* renamed from: a */
    public final void mo10335a(int i, int i2) {
        int i3;
        int i4;
        int a = this.f15356a.mo6291a();
        boolean[] zArr = this.f15357b;
        if (zArr != null) {
            int length = zArr.length;
            if (length < a) {
                int i5 = length + length;
                if (i5 >= a) {
                    a = i5;
                }
                this.f15357b = new boolean[a];
            } else {
                Arrays.fill(zArr, false);
            }
        } else {
            if (a < 10) {
                a = 10;
            }
            this.f15357b = new boolean[a];
        }
        if (this.f15356a.mo6291a() > 0) {
            int b = this.f15356a.mo6299b();
            int b2 = this.f15356a.mo6299b();
            if (b2 == 0 || b2 == 1) {
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode != 1073741824) {
                    size = this.f15356a.mo6311g();
                }
                i4 = this.f15356a.getPaddingLeft() + this.f15356a.getPaddingRight();
            } else if (b2 == 2 || b2 == 3) {
                int mode2 = View.MeasureSpec.getMode(i2);
                i3 = View.MeasureSpec.getSize(i2);
                if (mode2 != 1073741824) {
                    i3 = this.f15356a.mo6311g();
                }
                i4 = this.f15356a.getPaddingTop() + this.f15356a.getPaddingBottom();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + b);
            }
            List j = this.f15356a.mo6316j();
            int size2 = j.size();
            for (int i6 = 0; i6 < size2; i6++) {
                enq enq = (enq) j.get(i6);
                if (enq.f15341e < i3) {
                    m10799a(i, i2, enq, i3, i4, false);
                } else {
                    m10807b(i, i2, enq, i3, i4, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10336a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int b = this.f15356a.mo6299b();
        if (b == 0 || b == 1) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            i4 = mode;
            i5 = size;
        } else if (b == 2 || b == 3) {
            i4 = View.MeasureSpec.getMode(i);
            i5 = View.MeasureSpec.getSize(i);
        } else {
            throw new IllegalArgumentException("Invalid flex direction: " + b);
        }
        List<enq> j = this.f15356a.mo6316j();
        if (i4 == 1073741824) {
            int h = this.f15356a.mo6314h() + i3;
            int i7 = 0;
            if (j.size() == 1) {
                ((enq) j.get(0)).f15343g = i5 - i3;
            } else if (j.size() >= 2) {
                int d = this.f15356a.mo6306d();
                if (d == 1) {
                    enq enq = new enq();
                    enq.f15343g = i5 - h;
                    j.add(0, enq);
                } else if (d == 2) {
                    this.f15356a.mo6309e(m10798a(j, i5, h));
                } else if (d != 3) {
                    if (d != 4) {
                        if (d == 5 && h < i5) {
                            float size2 = ((float) (i5 - h)) / ((float) j.size());
                            int size3 = j.size();
                            float f = 0.0f;
                            while (i7 < size3) {
                                enq enq2 = (enq) j.get(i7);
                                float f2 = ((float) enq2.f15343g) + size2;
                                if (i7 == j.size() - 1) {
                                    f2 += f;
                                    f = 0.0f;
                                }
                                int round = Math.round(f2);
                                f += f2 - ((float) round);
                                if (f > 1.0f) {
                                    round++;
                                    f -= 4.0f;
                                } else if (f < -1.0f) {
                                    round--;
                                    f += 1.0f;
                                }
                                enq2.f15343g = round;
                                i7++;
                            }
                        }
                    } else if (h < i5) {
                        int size4 = j.size();
                        int i8 = (i5 - h) / (size4 + size4);
                        ArrayList arrayList = new ArrayList();
                        enq enq3 = new enq();
                        enq3.f15343g = i8;
                        for (enq enq4 : j) {
                            arrayList.add(enq3);
                            arrayList.add(enq4);
                            arrayList.add(enq3);
                        }
                        this.f15356a.mo6309e(arrayList);
                    } else {
                        this.f15356a.mo6309e(m10798a(j, i5, h));
                    }
                } else if (h < i5) {
                    float size5 = ((float) (i5 - h)) / ((float) (j.size() - 1));
                    ArrayList arrayList2 = new ArrayList();
                    int size6 = j.size();
                    float f3 = 0.0f;
                    while (i7 < size6) {
                        arrayList2.add((enq) j.get(i7));
                        if (i7 != j.size() - 1) {
                            enq enq5 = new enq();
                            if (i7 == j.size() - 2) {
                                int round2 = Math.round(f3 + size5);
                                enq5.f15343g = round2;
                                i6 = round2;
                                f3 = 0.0f;
                            } else {
                                i6 = Math.round(size5);
                                enq5.f15343g = i6;
                            }
                            f3 += size5 - ((float) i6);
                            if (f3 > 1.0f) {
                                enq5.f15343g = i6 + 1;
                                f3 -= 4.0f;
                            } else if (f3 < -1.0f) {
                                enq5.f15343g = i6 - 1;
                                f3 += 1.0f;
                            }
                            arrayList2.add(enq5);
                        }
                        i7++;
                    }
                    this.f15356a.mo6309e(arrayList2);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo10337a(View view, enq enq, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int e = this.f15356a.mo6308e();
        if (flexItem.mo6280f() != -1) {
            e = flexItem.mo6280f();
        }
        int i5 = enq.f15343g;
        if (e != 0) {
            if (e != 1) {
                if (e == 2) {
                    int measuredHeight = (((i5 - view.getMeasuredHeight()) + flexItem.mo6288n()) - flexItem.mo6290p()) / 2;
                    if (this.f15356a.mo6303c() != 2) {
                        int i6 = i2 + measuredHeight;
                        view.layout(i, i6, i3, view.getMeasuredHeight() + i6);
                        return;
                    }
                    int i7 = i2 - measuredHeight;
                    view.layout(i, i7, i3, view.getMeasuredHeight() + i7);
                    return;
                } else if (e != 3) {
                    if (e != 4) {
                        return;
                    }
                } else if (this.f15356a.mo6303c() != 2) {
                    int max = Math.max(enq.f15348l - view.getBaseline(), flexItem.mo6288n());
                    view.layout(i, i2 + max, i3, i4 + max);
                    return;
                } else {
                    int max2 = Math.max((enq.f15348l - view.getMeasuredHeight()) + view.getBaseline(), flexItem.mo6290p());
                    view.layout(i, i2 - max2, i3, i4 - max2);
                    return;
                }
            } else if (this.f15356a.mo6303c() != 2) {
                int i8 = i2 + i5;
                view.layout(i, (i8 - view.getMeasuredHeight()) - flexItem.mo6290p(), i3, i8 - flexItem.mo6290p());
                return;
            } else {
                view.layout(i, (i2 - i5) + view.getMeasuredHeight() + flexItem.mo6288n(), i3, (i4 - i5) + view.getMeasuredHeight() + flexItem.mo6288n());
                return;
            }
        }
        if (this.f15356a.mo6303c() != 2) {
            view.layout(i, i2 + flexItem.mo6288n(), i3, i4 + flexItem.mo6288n());
        } else {
            view.layout(i, i2 - flexItem.mo6290p(), i3, i4 - flexItem.mo6290p());
        }
    }

    /* renamed from: a */
    public final void mo10338a(View view, enq enq, boolean z, int i, int i2, int i3, int i4) {
        FlexItem flexItem = (FlexItem) view.getLayoutParams();
        int e = this.f15356a.mo6308e();
        if (flexItem.mo6280f() != -1) {
            e = flexItem.mo6280f();
        }
        int i5 = enq.f15343g;
        if (e != 0) {
            if (e != 1) {
                if (e == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i5 - view.getMeasuredWidth()) + C1260oz.m19820a(marginLayoutParams)) - C1260oz.m19822b(marginLayoutParams)) / 2;
                    if (!z) {
                        view.layout(i + measuredWidth, i2, i3 + measuredWidth, i4);
                        return;
                    } else {
                        view.layout(i - measuredWidth, i2, i3 - measuredWidth, i4);
                        return;
                    }
                } else if (!(e == 3 || e == 4)) {
                    return;
                }
            } else if (z) {
                view.layout((i - i5) + view.getMeasuredWidth() + flexItem.mo6287m(), i2, (i3 - i5) + view.getMeasuredWidth() + flexItem.mo6287m(), i4);
                return;
            } else {
                view.layout(((i + i5) - view.getMeasuredWidth()) - flexItem.mo6289o(), i2, ((i3 + i5) - view.getMeasuredWidth()) - flexItem.mo6289o(), i4);
                return;
            }
        }
        if (z) {
            view.layout(i - flexItem.mo6289o(), i2, i3 - flexItem.mo6289o(), i4);
        } else {
            view.layout(i + flexItem.mo6287m(), i2, i3 + flexItem.mo6287m(), i4);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ent.a(com.google.android.flexbox.FlexItem, boolean):int
     arg types: [com.google.android.flexbox.FlexItem, int]
     candidates:
      ent.a(android.view.View, boolean):int
      ent.a(android.view.View, int):void
      ent.a(int, int):void
      ent.a(com.google.android.flexbox.FlexItem, boolean):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ent.b(com.google.android.flexbox.FlexItem, boolean):int
     arg types: [com.google.android.flexbox.FlexItem, int]
     candidates:
      ent.b(android.view.View, int):void
      ent.b(com.google.android.flexbox.FlexItem, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02aa  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0308  */
    /* renamed from: a */
    public final void mo10339a(enr enr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26 = i2;
        boolean f = this.f15356a.mo6310f();
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        ArrayList arrayList = new ArrayList();
        enr.f15352a = arrayList;
        if (f) {
            i3 = this.f15356a.getPaddingStart();
        } else {
            i3 = this.f15356a.getPaddingTop();
        }
        if (!f) {
            i4 = this.f15356a.getPaddingBottom();
        } else {
            i4 = this.f15356a.getPaddingEnd();
        }
        if (!f) {
            i5 = this.f15356a.getPaddingStart();
        } else {
            i5 = this.f15356a.getPaddingTop();
        }
        if (!f) {
            i6 = this.f15356a.getPaddingEnd();
        } else {
            i6 = this.f15356a.getPaddingBottom();
        }
        enq enq = new enq();
        int i27 = 0;
        enq.f15351o = 0;
        int i28 = i3 + i4;
        enq.f15341e = i28;
        int a = this.f15356a.mo6291a();
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = Integer.MIN_VALUE;
        while (i31 < a) {
            int i33 = i29;
            View b = this.f15356a.mo6301b(i31);
            if (b == null) {
                if (m10803a(i31, a, enq)) {
                    m10802a(arrayList, enq, i27);
                }
                i13 = i28;
                i14 = i30;
            } else {
                i14 = i30;
                i13 = i28;
                if (b.getVisibility() == 8) {
                    enq.f15345i++;
                    enq.f15344h++;
                    if (m10803a(i31, a, enq)) {
                        m10802a(arrayList, enq, i27);
                    }
                } else {
                    FlexItem flexItem = (FlexItem) b.getLayoutParams();
                    if (flexItem.mo6280f() == 4) {
                        enq.f15350n.add(Integer.valueOf(i31));
                    }
                    if (!f) {
                        i15 = flexItem.mo6276b();
                    } else {
                        i15 = flexItem.mo6275a();
                    }
                    if (flexItem.mo6286l() != -1.0f && mode == 1073741824) {
                        i15 = Math.round(((float) size) * flexItem.mo6286l());
                    }
                    if (!f) {
                        i17 = a;
                        i16 = size;
                        int a2 = this.f15356a.mo6293a(i26, i5 + i6 + m10809c(flexItem, false) + m10797a(flexItem, false) + i27, m10811e(flexItem, false));
                        i18 = i31;
                        i9 = i;
                        i19 = this.f15356a.mo6300b(i9, i13 + m10810d(flexItem, false) + m10806b(flexItem, false), i15);
                        b.measure(a2, i19);
                        i7 = i5;
                    } else {
                        i16 = size;
                        i17 = a;
                        i18 = i31;
                        i9 = i;
                        i19 = this.f15356a.mo6293a(i9, i13 + m10810d(flexItem, true) + m10806b(flexItem, true), i15);
                        i7 = i5;
                        b.measure(i19, this.f15356a.mo6300b(i26, i5 + i6 + m10809c(flexItem, true) + m10797a(flexItem, true) + i27, m10811e(flexItem, true)));
                    }
                    m10800a(b);
                    int combineMeasuredStates = View.combineMeasuredStates(i14, b.getMeasuredState());
                    int i34 = enq.f15341e;
                    int a3 = m10796a(b, f) + m10810d(flexItem, f) + m10806b(flexItem, f);
                    int size2 = arrayList.size();
                    i8 = i6;
                    if (this.f15356a.mo6303c() == 0) {
                        i20 = combineMeasuredStates;
                        i10 = i18;
                        i24 = i33;
                        i28 = i13;
                        i11 = i16;
                        i25 = 1;
                    } else {
                        i20 = combineMeasuredStates;
                        if (flexItem.mo6285k()) {
                            i10 = i18;
                            i11 = i16;
                        } else if (mode != 0) {
                            int i35 = this.f15356a.mo6315i();
                            if (i35 != -1 && i35 <= size2 + 1) {
                                i10 = i18;
                                i24 = i33;
                                i28 = i13;
                                i11 = i16;
                                i25 = 1;
                            } else {
                                i10 = i18;
                                i24 = i33;
                                int a4 = this.f15356a.mo6292a(i10, i24);
                                if (a4 > 0) {
                                    a3 += a4;
                                }
                                i11 = i16;
                                if (i11 >= i34 + a3) {
                                    i28 = i13;
                                    i25 = 1;
                                }
                            }
                        } else {
                            i10 = i18;
                            i24 = i33;
                            i28 = i13;
                            i11 = i16;
                            i25 = 1;
                        }
                        if (enq.mo10328a() > 0) {
                            m10802a(arrayList, enq, i27);
                            i27 += enq.f15343g;
                        }
                        if (!f) {
                            if (flexItem.mo6275a() == -1) {
                                enp enp = this.f15356a;
                                b.measure(enp.mo6293a(i26, enp.getPaddingLeft() + this.f15356a.getPaddingRight() + flexItem.mo6287m() + flexItem.mo6289o() + i27, flexItem.mo6275a()), i19);
                                m10800a(b);
                            }
                        } else if (flexItem.mo6276b() == -1) {
                            enp enp2 = this.f15356a;
                            b.measure(i19, enp2.mo6300b(i26, enp2.getPaddingTop() + this.f15356a.getPaddingBottom() + flexItem.mo6288n() + flexItem.mo6290p() + i27, flexItem.mo6276b()));
                            m10800a(b);
                        }
                        enq = new enq();
                        enq.f15344h = 1;
                        i28 = i13;
                        enq.f15341e = i28;
                        enq.f15351o = i10;
                        i22 = 0;
                        i21 = Integer.MIN_VALUE;
                        enq.f15341e += m10796a(b, f) + m10810d(flexItem, f) + m10806b(flexItem, f);
                        enq.f15346j += flexItem.mo6278d();
                        enq.f15347k += flexItem.mo6279e();
                        this.f15356a.mo6295a(i10, i22, enq);
                        if (!f) {
                            i23 = b.getMeasuredHeight();
                        } else {
                            i23 = b.getMeasuredWidth();
                        }
                        int max = Math.max(i21, i23 + m10809c(flexItem, f) + m10797a(flexItem, f) + this.f15356a.mo6317k());
                        enq.f15343g = Math.max(enq.f15343g, max);
                        if (f) {
                            if (this.f15356a.mo6303c() != 2) {
                                enq.f15348l = Math.max(enq.f15348l, b.getBaseline() + flexItem.mo6288n());
                            } else {
                                enq.f15348l = Math.max(enq.f15348l, (b.getMeasuredHeight() - b.getBaseline()) + flexItem.mo6290p());
                            }
                        }
                        i12 = i17;
                        if (m10803a(i10, i12, enq)) {
                            m10802a(arrayList, enq, i27);
                            i27 += enq.f15343g;
                        }
                        i32 = max;
                        i33 = i22;
                        i30 = i20;
                        int i36 = i10 + 1;
                        i26 = i2;
                        a = i12;
                        size = i11;
                        i29 = i33;
                        i6 = i8;
                        i5 = i7;
                        i31 = i36;
                    }
                    enq.f15344h += i25;
                    i22 = i24 + 1;
                    i21 = i32;
                    enq.f15341e += m10796a(b, f) + m10810d(flexItem, f) + m10806b(flexItem, f);
                    enq.f15346j += flexItem.mo6278d();
                    enq.f15347k += flexItem.mo6279e();
                    this.f15356a.mo6295a(i10, i22, enq);
                    if (!f) {
                    }
                    int max2 = Math.max(i21, i23 + m10809c(flexItem, f) + m10797a(flexItem, f) + this.f15356a.mo6317k());
                    enq.f15343g = Math.max(enq.f15343g, max2);
                    if (f) {
                    }
                    i12 = i17;
                    if (m10803a(i10, i12, enq)) {
                    }
                    i32 = max2;
                    i33 = i22;
                    i30 = i20;
                    int i362 = i10 + 1;
                    i26 = i2;
                    a = i12;
                    size = i11;
                    i29 = i33;
                    i6 = i8;
                    i5 = i7;
                    i31 = i362;
                }
            }
            i12 = a;
            i7 = i5;
            i30 = i14;
            i28 = i13;
            i11 = size;
            i8 = i6;
            i10 = i31;
            i9 = i;
            int i3622 = i10 + 1;
            i26 = i2;
            a = i12;
            size = i11;
            i29 = i33;
            i6 = i8;
            i5 = i7;
            i31 = i3622;
        }
        enr.f15353b = i30;
    }
}
