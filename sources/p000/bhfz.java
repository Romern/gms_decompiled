package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.p002v7.widget.AppCompatCheckBox;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhfz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhfz extends AppCompatCheckBox {

    /* renamed from: a */
    private static final int[][] f118527a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: b */
    private ColorStateList f118528b;

    /* renamed from: c */
    private boolean f118529c;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f118529c && C1321rf.m20064a(this) == null) {
            this.f118529c = true;
            if (this.f118528b == null) {
                int[] iArr = new int[f118527a.length];
                int a = bhkx.m101073a(this, (int) C0126R.attr.colorControlActivated);
                int a2 = bhkx.m101073a(this, (int) C0126R.attr.colorSurface);
                int a3 = bhkx.m101073a(this, (int) C0126R.attr.colorOnSurface);
                iArr[0] = bhgk.m100859a(a2, a, 1.0f);
                iArr[1] = bhgk.m100859a(a2, a3, 0.54f);
                iArr[2] = bhgk.m100859a(a2, a3, 0.38f);
                iArr[3] = bhgk.m100859a(a2, a3, 0.38f);
                this.f118528b = new ColorStateList(f118527a, iArr);
            }
            C1321rf.m20065a(this, this.f118528b);
        }
    }

    public bhfz(Context context, AttributeSet attributeSet) {
        super(bhpq.m101285a(context, attributeSet, C0126R.attr.checkboxStyle, 2132019488), attributeSet, C0126R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray a = bhki.m101052a(context2, attributeSet, bhga.f118530a, C0126R.attr.checkboxStyle, 2132019488, new int[0]);
        if (a.hasValue(0)) {
            C1321rf.m20065a(this, bhky.m101077a(context2, a, 0));
        }
        this.f118529c = a.getBoolean(1, false);
        a.recycle();
    }
}
