package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhgo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhgo {

    /* renamed from: a */
    public final bhgn f118611a;

    /* renamed from: b */
    final bhgn f118612b;

    /* renamed from: c */
    final bhgn f118613c;

    /* renamed from: d */
    final bhgn f118614d;

    /* renamed from: e */
    final bhgn f118615e;

    /* renamed from: f */
    final bhgn f118616f;

    /* renamed from: g */
    final bhgn f118617g;

    /* renamed from: h */
    public final Paint f118618h;

    public bhgo(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(bhkx.m101072a(context, (int) C0126R.attr.materialCalendarStyle, bhhb.class.getCanonicalName()), bhhs.f118687a);
        this.f118611a = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.f118617g = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f118612b = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f118613c = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a = bhky.m101077a(context, obtainStyledAttributes, 5);
        this.f118614d = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f118615e = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f118616f = bhgn.m100862a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.f118618h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
