package com.google.android.gms.smart_profile.header.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarView extends ImageView {

    /* renamed from: a */
    private static Paint f107755a;

    /* renamed from: b */
    private static int f107756b;

    public AvatarView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 2.0f;
        if (width > 0.0f) {
            canvas.drawCircle(width, width, width - (((float) f107756b) / 2.0f), f107755a);
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        f107756b = (int) context.getResources().getDimension(C0126R.dimen.profile_header_avatar_border_width);
        Paint paint = new Paint();
        f107755a = paint;
        paint.setAntiAlias(true);
        f107755a.setStrokeWidth((float) f107756b);
        if (cgnz.m146325b()) {
            f107755a.setColor(thh.m36964a(context));
        } else {
            f107755a.setColor(C1133kh.m17843b(getContext(), C0126R.color.profile_header_avatar_border));
        }
        f107755a.setStyle(Paint.Style.STROKE);
    }
}
