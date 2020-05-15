package com.google.android.libraries.matchstick.p091ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/* renamed from: com.google.android.libraries.matchstick.ui.MessageBubbleView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MessageBubbleView extends TextView {
    public MessageBubbleView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Layout layout = getLayout();
        int lineCount = layout.getLineCount();
        float f = 0.0f;
        for (int i3 = 0; i3 < lineCount; i3++) {
            float lineMax = layout.getLineMax(i3);
            if (lineMax > f) {
                f = lineMax;
            }
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(((int) Math.ceil((double) f)) + getPaddingLeft() + getPaddingRight(), Integer.MIN_VALUE), i2);
    }

    public MessageBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
