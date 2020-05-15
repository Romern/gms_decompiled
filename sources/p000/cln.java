package p000;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: cln */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class cln implements cdo {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Bitmap mo3959a(cgt cgt, Bitmap bitmap, int i, int i2);

    /* renamed from: a */
    public final cgj mo3746a(Context context, cgj cgj, int i, int i2) {
        if (crd.m7394a(i, i2)) {
            cgt cgt = cbo.m3902a(context).f6403a;
            Bitmap bitmap = (Bitmap) cgj.mo3842b();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = bitmap.getHeight();
            }
            Bitmap a = mo3959a(cgt, bitmap, i, i2);
            return !bitmap.equals(a) ? clm.m4457a(a, cgt) : cgj;
        }
        StringBuilder sb = new StringBuilder(128);
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
