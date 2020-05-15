package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* renamed from: xy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class C1502xy {

    /* renamed from: b */
    private static final int[] f27623b = {16843067, 16843068};

    /* renamed from: a */
    public Bitmap f27624a;

    /* renamed from: c */
    private final ProgressBar f27625c;

    public C1502xy(ProgressBar progressBar) {
        this.f27625c = progressBar;
    }

    /* renamed from: a */
    private final Drawable m20834a(Drawable drawable, boolean z) {
        if (drawable instanceof C1174lu) {
            C1174lu luVar = (C1174lu) drawable;
            Drawable a = luVar.mo15427a();
            if (a != null) {
                m20834a(a, z);
                luVar.mo15428b();
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m20834a(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f27624a == null) {
                this.f27624a = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: xy.a(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable
     arg types: [android.graphics.drawable.Drawable, int]
     candidates:
      xy.a(android.util.AttributeSet, int):void
      xy.a(android.graphics.drawable.Drawable, boolean):android.graphics.drawable.Drawable */
    /* renamed from: a */
    public void mo16524a(AttributeSet attributeSet, int i) {
        adr a = adr.m523a(this.f27625c.getContext(), attributeSet, f27623b, i, 0);
        Drawable b = a.mo453b(0);
        if (b != null) {
            ProgressBar progressBar = this.f27625c;
            if (b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m20834a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b);
        }
        Drawable b2 = a.mo453b(1);
        if (b2 != null) {
            this.f27625c.setProgressDrawable(m20834a(b2, false));
        }
        a.mo450a();
    }
}
