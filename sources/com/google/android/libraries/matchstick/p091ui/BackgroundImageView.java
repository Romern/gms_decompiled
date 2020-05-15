package com.google.android.libraries.matchstick.p091ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.matchstick.ui.BackgroundImageView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackgroundImageView extends ImageView {

    /* renamed from: a */
    public int f111166a = 2;

    public BackgroundImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && (getDrawable() instanceof BitmapDrawable)) {
            Bitmap bitmap = ((BitmapDrawable) getDrawable()).getBitmap();
            int i5 = i3 - i;
            int i6 = i4 - i2;
            Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            BitmapShader bitmapShader = new BitmapShader(bitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShader(bitmapShader);
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, (float) i5, (float) i6), (float) azpi.m86074b(24), (float) azpi.m86074b(24), paint);
            if (createBitmap != null) {
                setImageBitmap(createBitmap);
                invalidate();
            }
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        if (this.f111166a != 4) {
            super.setImageBitmap(bitmap);
        } else if (getHeight() != 0) {
            super.setImageBitmap(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), Math.min(getHeight(), bitmap.getHeight())));
        }
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public BackgroundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}
