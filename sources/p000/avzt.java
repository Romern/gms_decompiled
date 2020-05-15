package p000;

import android.util.SparseArray;
import com.google.android.gms.vision.text.internal.client.LineBoxParcel;

/* renamed from: avzt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avzt {

    /* renamed from: a */
    public LineBoxParcel[] f94126a;

    public avzt(SparseArray sparseArray) {
        this.f94126a = new LineBoxParcel[sparseArray.size()];
        int i = 0;
        while (true) {
            LineBoxParcel[] lineBoxParcelArr = this.f94126a;
            if (i < lineBoxParcelArr.length) {
                lineBoxParcelArr[i] = (LineBoxParcel) sparseArray.valueAt(i);
                i++;
            } else {
                return;
            }
        }
    }
}
