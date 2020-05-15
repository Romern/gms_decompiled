package p000;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: bkbb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bkbb implements bker {

    /* renamed from: a */
    final /* synthetic */ int f123908a;

    /* renamed from: b */
    final /* synthetic */ int f123909b;

    /* renamed from: c */
    final /* synthetic */ bkbh f123910c;

    public bkbb(bkbh bkbh, int i, int i2) {
        this.f123910c = bkbh;
        this.f123908a = i;
        this.f123909b = i2;
    }

    /* renamed from: a */
    public final void mo65764a(View view) {
        int i;
        int i2;
        bkbh bkbh = this.f123910c;
        int i3 = this.f123908a;
        int i4 = this.f123909b;
        bmhq bmhq = bkbh.f123934q;
        if (bmhq == null || bmhq.f129469j.size() == 0) {
            throw new IllegalStateException("Reveal transitions should not be triggered when no subforms are visible.");
        }
        bxvt bxvt = bkbh.f123934q.f129469j;
        int size = bxvt.size();
        boolean z = false;
        for (int i5 = 0; i5 < size; i5++) {
            int intValue = ((Integer) bxvt.get(i5)).intValue();
            if (intValue == i3) {
                List list = (List) bkbh.f123925h.get(intValue);
                Integer valueOf = Integer.valueOf(i4);
                if (list.contains(valueOf)) {
                    list.remove(valueOf);
                    int[] iArr = bkbh.f123926i;
                    iArr[intValue] = iArr[intValue] + 1;
                    if (intValue == bkbh.f123934q.f129469j.mo74151b(0)) {
                        i = bkbh.f123932o.size();
                    } else {
                        i = 0;
                    }
                    ViewGroup viewGroup = (ViewGroup) bkbh.f123920c.get(intValue);
                    if (list.isEmpty()) {
                        i2 = (viewGroup.getChildCount() + i) - 1;
                        z = true;
                    } else {
                        i2 = ((Integer) list.get(0)).intValue();
                        z = false;
                    }
                    int i6 = i4 + 1;
                    if (i6 >= i) {
                        while (i6 <= i2) {
                            bkcd.m105304a(viewGroup.getChildAt(i6 - i), 0);
                            i6++;
                        }
                        if (!z) {
                            break;
                        }
                    } else {
                        throw new IllegalStateException("Cannot reveal a collapsed view");
                    }
                } else {
                    return;
                }
            } else if (z) {
                bkcd.m105304a((ViewGroup) bkbh.f123920c.get(intValue), 0);
                if (!((List) bkbh.f123925h.get(intValue)).isEmpty()) {
                    break;
                }
            } else {
                continue;
            }
        }
        bkbh.mo51905a(1, Bundle.EMPTY);
    }
}
