package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.Log;
import com.felicanetworks.mfc.C0126R;

/* renamed from: aaxm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxm {
    /* renamed from: a */
    private static int m47166a(float f, Resources resources) {
        return Math.round(f * resources.getDisplayMetrics().density);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaxm.a(float, android.content.res.Resources):int
     arg types: [int, android.content.res.Resources]
     candidates:
      aaxm.a(int, android.content.res.Resources):int
      aaxm.a(int, int):android.graphics.drawable.ShapeDrawable
      aaxm.a(float, android.content.res.Resources):int */
    /* renamed from: b */
    private static int m47172b(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m47166a(5.0f, resources);
        }
        if (i2 != 1) {
            return m47166a(4.0f, resources);
        }
        return m47166a(4.5f, resources);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaxm.a(float, android.content.res.Resources):int
     arg types: [int, android.content.res.Resources]
     candidates:
      aaxm.a(int, android.content.res.Resources):int
      aaxm.a(int, int):android.graphics.drawable.ShapeDrawable
      aaxm.a(float, android.content.res.Resources):int */
    /* renamed from: c */
    private static int m47173c(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return 0;
        }
        if (i2 != 1) {
            return m47166a(1.0f, resources);
        }
        return m47166a(0.5f, resources);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaxm.a(float, android.content.res.Resources):int
     arg types: [int, android.content.res.Resources]
     candidates:
      aaxm.a(int, android.content.res.Resources):int
      aaxm.a(int, int):android.graphics.drawable.ShapeDrawable
      aaxm.a(float, android.content.res.Resources):int */
    /* renamed from: a */
    private static int m47167a(int i, Resources resources) {
        int i2 = i - 1;
        if (i2 == 0) {
            return m47166a(4.0f, resources);
        }
        if (i2 != 1) {
            return m47166a(6.0f, resources);
        }
        return m47166a(5.0f, resources);
    }

    /* renamed from: a */
    public static AnimationDrawable m47168a(Context context) {
        AnimationDrawable animationDrawable = new AnimationDrawable();
        int a = aayi.m47263a(context, C0126R.attr.gh_primaryBlueColor);
        try {
            LayerDrawable[] layerDrawableArr = {m47169a(1, 1, 1, a, context), m47169a(2, 1, 1, a, context), m47169a(3, 1, 1, a, context), m47169a(2, 1, 1, a, context), m47169a(1, 1, 1, a, context), m47169a(1, 2, 1, a, context), m47169a(1, 3, 1, a, context), m47169a(1, 2, 1, a, context), m47169a(1, 1, 1, a, context), m47169a(1, 1, 2, a, context), m47169a(1, 1, 3, a, context), m47169a(1, 1, 2, a, context), m47169a(1, 1, 1, a, context)};
            int i = 0;
            while (i < 13) {
                animationDrawable.addFrame(layerDrawableArr[i], i == 12 ? 500 : 44);
                i++;
            }
            animationDrawable.setOneShot(false);
        } catch (OutOfMemoryError e) {
            Log.e("gH_ChatUiUtil", "OutOfMemory trying to create ellipsis animation.", e);
        }
        return animationDrawable;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aaxm.a(float, android.content.res.Resources):int
     arg types: [int, android.content.res.Resources]
     candidates:
      aaxm.a(int, android.content.res.Resources):int
      aaxm.a(int, int):android.graphics.drawable.ShapeDrawable
      aaxm.a(float, android.content.res.Resources):int */
    /* renamed from: a */
    public static LayerDrawable m47169a(int i, int i2, int i3, int i4, Context context) {
        Resources resources = context.getResources();
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{m47171a(m47167a(i, resources), i4), m47171a(m47167a(i2, resources), i4), m47171a(m47167a(i3, resources), i4)});
        int b = m47172b(i, resources);
        int c = m47173c(i, resources);
        layerDrawable.setLayerInset(0, m47166a(4.0f, resources) - c, b, m47166a(16.0f, resources) - c, b);
        int b2 = m47172b(i2, resources);
        int c2 = m47173c(i2, resources);
        layerDrawable.setLayerInset(1, m47166a(10.0f, resources) - c2, b2, m47166a(10.0f, resources) - c2, b2);
        int b3 = m47172b(i3, resources);
        int c3 = m47173c(i3, resources);
        layerDrawable.setLayerInset(2, m47166a(16.0f, resources) - c3, b3, m47166a(4.0f, resources) - c3, b3);
        return layerDrawable;
    }

    /* renamed from: a */
    public static ShapeDrawable m47170a(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setAntiAlias(true);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        return shapeDrawable;
    }

    /* renamed from: a */
    private static ShapeDrawable m47171a(int i, int i2) {
        ShapeDrawable a = m47170a(i2);
        a.setIntrinsicHeight(i);
        a.setIntrinsicWidth(i);
        return a;
    }
}
