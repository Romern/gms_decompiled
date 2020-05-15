package p000;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: bikw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bikw extends aah {

    /* renamed from: a */
    private final int[] f120801a = new int[2];

    public bikw() {
        super(1);
    }

    /* renamed from: a */
    public final void mo225a(acc acc, int i, int i2) {
        acc acc2 = acc;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < mo218A()) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, i3);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, i3);
            int[] iArr = this.f120801a;
            View b = acc2.mo282b(i4);
            if (b != null) {
                abv abv = (abv) b.getLayoutParams();
                b.measure(ViewGroup.getChildMeasureSpec(makeMeasureSpec, mo251v() + mo253x(), abv.width), ViewGroup.getChildMeasureSpec(makeMeasureSpec2, mo252w() + mo254y(), abv.height));
                iArr[0] = b.getMeasuredWidth() + abv.leftMargin + abv.rightMargin;
                iArr[1] = b.getMeasuredHeight() + abv.bottomMargin + abv.topMargin;
                acc2.mo281a(b);
            }
            if (this.f41i == 0) {
                int[] iArr2 = this.f120801a;
                i5 += iArr2[0];
                if (i4 == 0) {
                    i6 = iArr2[1];
                }
            } else {
                int[] iArr3 = this.f120801a;
                i6 += iArr3[1];
                if (i4 == 0) {
                    i5 = iArr3[0];
                }
            }
            i4++;
            i3 = 0;
        }
        if (mode == Integer.MIN_VALUE) {
            size = Math.min(size, i5);
        } else if (mode != 1073741824) {
            size = i5;
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i6);
        } else if (mode2 != 1073741824) {
            size2 = i6;
        }
        mo242f(size, size2);
    }
}
