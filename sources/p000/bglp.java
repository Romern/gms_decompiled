package p000;

import java.util.List;

/* renamed from: bglp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglp {

    /* renamed from: a */
    public int[] f116789a;

    /* renamed from: b */
    public final bglf f116790b;

    public bglp(bglf bglf, int[] iArr, List list) {
        this.f116790b = bglf;
        this.f116789a = new int[iArr.length];
        int i = 0;
        while (i < iArr.length) {
            int indexOf = list.indexOf(bglg.m99238a(iArr[i]));
            if (indexOf != -1) {
                this.f116789a[i] = indexOf;
                i++;
            } else {
                this.f116789a = null;
                return;
            }
        }
    }
}
