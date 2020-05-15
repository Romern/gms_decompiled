package com.google.android.gms.ocr.camera;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CameraPreviewLayout extends FrameLayout {

    /* renamed from: a */
    public Rect f81271a;

    public CameraPreviewLayout(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f81271a != null) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                getChildAt(i5).layout(this.f81271a.left, this.f81271a.top, this.f81271a.right, this.f81271a.bottom);
            }
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f81271a != null && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == 1073741824) {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f81271a.width(), JGCastService.FLAG_PRIVATE_DISPLAY);
            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.f81271a.height(), JGCastService.FLAG_PRIVATE_DISPLAY);
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
            }
            return;
        }
        super.onMeasure(i, i2);
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
