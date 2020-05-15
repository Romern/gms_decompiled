package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhkt extends C1503xz {

    /* renamed from: a */
    private static final int[][] f118920a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: b */
    private ColorStateList f118921b;

    /* renamed from: c */
    private boolean f118922c;

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f118922c && C1321rf.m20064a(this) == null) {
            this.f118922c = true;
            if (this.f118921b == null) {
                int a = bhkx.m101073a(this, (int) C0126R.attr.colorControlActivated);
                int a2 = bhkx.m101073a(this, (int) C0126R.attr.colorOnSurface);
                int a3 = bhkx.m101073a(this, (int) C0126R.attr.colorSurface);
                int[] iArr = new int[f118920a.length];
                iArr[0] = bhgk.m100859a(a3, a, 1.0f);
                iArr[1] = bhgk.m100859a(a3, a2, 0.54f);
                iArr[2] = bhgk.m100859a(a3, a2, 0.38f);
                iArr[3] = bhgk.m100859a(a3, a2, 0.38f);
                this.f118921b = new ColorStateList(f118920a, iArr);
            }
            C1321rf.m20065a(this, this.f118921b);
        }
    }

    public bhkt(Context context, AttributeSet attributeSet) {
        super(bhpq.m101285a(context, attributeSet, C0126R.attr.radioButtonStyle, 2132019489), attributeSet, null);
        TypedArray a = bhki.m101052a(getContext(), attributeSet, bhku.f118923a, C0126R.attr.radioButtonStyle, 2132019489, new int[0]);
        this.f118922c = a.getBoolean(0, false);
        a.recycle();
    }
}
