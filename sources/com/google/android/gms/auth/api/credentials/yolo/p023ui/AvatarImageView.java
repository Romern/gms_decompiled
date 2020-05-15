package com.google.android.gms.auth.api.credentials.yolo.p023ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;

/* renamed from: com.google.android.gms.auth.api.credentials.yolo.ui.AvatarImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarImageView extends sup {

    /* renamed from: g */
    private Paint f10151g;

    public AvatarImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f10151g;
        if (paint != null) {
            canvas.drawOval(new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight()), paint);
        } else {
            super.onDraw(canvas);
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(null);
        if (bitmap != null) {
            BitmapShader bitmapShader = new BitmapShader(Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            this.f10151g = paint;
            paint.setAntiAlias(true);
            this.f10151g.setShader(bitmapShader);
            return;
        }
        this.f10151g = null;
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
