package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.felicanetworks.mfc.C0126R;

/* renamed from: ya */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C1505ya extends RatingBar {

    /* renamed from: a */
    private final C1502xy f27629a;

    /* access modifiers changed from: protected */
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f27629a.f27624a;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }

    public C1505ya(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0126R.attr.ratingBarStyle);
        adm.m515a(this, getContext());
        C1502xy xyVar = new C1502xy(this);
        this.f27629a = xyVar;
        xyVar.mo16524a(attributeSet, (int) C0126R.attr.ratingBarStyle);
    }
}
