package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: bkjf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkjf implements bker {

    /* renamed from: a */
    final /* synthetic */ int f124373a;

    /* renamed from: b */
    final /* synthetic */ bkjj f124374b;

    public bkjf(bkjj bkjj, int i) {
        this.f124374b = bkjj;
        this.f124373a = i;
    }

    /* renamed from: a */
    public final void mo65764a(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        bkjj bkjj = this.f124374b;
        int i5 = this.f124373a;
        int i6 = bkjj.f124387H;
        if (i5 >= i6) {
            int intValue = ((Integer) bkjj.f124385F.get(i6)).intValue();
            int intValue2 = ((Integer) bkjj.f124386G.get(bkjj.f124387H)).intValue();
            int i7 = bkjj.f124387H + 1;
            bkjj.f124387H = i7;
            int size = bkjj.f124385F.size();
            if (i7 < size) {
                i = ((Integer) bkjj.f124385F.get(bkjj.f124387H)).intValue();
            } else {
                i = -1;
            }
            if (i7 < size) {
                i2 = ((Integer) bkjj.f124386G.get(bkjj.f124387H)).intValue();
            } else {
                i2 = -1;
            }
            if (intValue2 >= 0) {
                ViewGroup viewGroup = (ViewGroup) bkjj.f124404f.getChildAt(intValue);
                if (i != intValue) {
                    i4 = viewGroup.getChildCount() - 1;
                } else {
                    i4 = i2;
                }
                for (int i8 = intValue2 + 1; i8 <= i4; i8++) {
                    bkcd.m105304a(viewGroup.getChildAt(i8), 0);
                }
            }
            if (i7 >= size) {
                i3 = bkjj.f124404f.getChildCount() - 1;
            } else {
                i3 = i;
            }
            for (int i9 = intValue + 1; i9 <= i3; i9++) {
                View childAt = bkjj.f124404f.getChildAt(i9);
                bkcd.m105304a(childAt, 0);
                if (i9 == i && i2 >= 0) {
                    ViewGroup viewGroup2 = (ViewGroup) childAt;
                    int childCount = viewGroup2.getChildCount();
                    for (int i10 = i2 + 1; i10 < childCount; i10++) {
                        viewGroup2.getChildAt(i10).setVisibility(8);
                    }
                }
            }
            bkjj.mo51905a(1, Bundle.EMPTY);
        }
    }
}
