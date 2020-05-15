package com.google.android.gms.smart_profile.header.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CircleView extends AvatarView {

    /* renamed from: a */
    public Paint f107757a = new Paint(1);

    public CircleView(Context context) {
        super(context);
        if (!cgnz.m146325b() || !cgmy.m146223b()) {
            this.f107757a.setColor(tey.m36884a(C1133kh.m17843b(getContext(), C0126R.color.default_theme_color)));
        } else {
            this.f107757a.setColor(cgnb.m146247b() ? thh.m36970f(getContext()) : thh.m36966b(getContext()));
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float dimensionPixelSize = (float) getResources().getDimensionPixelSize(C0126R.dimen.profile_header_avatar_border_width);
        float height = (((float) getHeight()) / 2.0f) - dimensionPixelSize;
        float f = dimensionPixelSize + height;
        canvas.drawCircle(f, f, height, this.f107757a);
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!cgnz.m146325b() || !cgmy.m146223b()) {
            this.f107757a.setColor(tey.m36884a(C1133kh.m17843b(getContext(), C0126R.color.default_theme_color)));
        } else {
            this.f107757a.setColor(cgnb.m146247b() ? thh.m36970f(getContext()) : thh.m36966b(getContext()));
        }
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!cgnz.m146325b() || !cgmy.m146223b()) {
            this.f107757a.setColor(tey.m36884a(C1133kh.m17843b(getContext(), C0126R.color.default_theme_color)));
        } else {
            this.f107757a.setColor(cgnb.m146247b() ? thh.m36970f(getContext()) : thh.m36966b(getContext()));
        }
    }
}
