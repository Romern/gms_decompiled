package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bihb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bihb {

    /* renamed from: h */
    private static bihb f120579h;

    /* renamed from: a */
    public final C1245ok f120580a;

    /* renamed from: b */
    public final C1245ok f120581b;

    /* renamed from: c */
    public final Bitmap f120582c;

    /* renamed from: d */
    public final Bitmap f120583d;

    /* renamed from: e */
    public final Bitmap f120584e;

    /* renamed from: f */
    public final Bitmap f120585f;

    /* renamed from: g */
    public final Bitmap f120586g;

    /* renamed from: i */
    private final C1245ok f120587i;

    /* renamed from: j */
    private final Drawable f120588j;

    /* renamed from: k */
    private final Bitmap f120589k;

    private bihb(Context context) {
        Resources resources = context.getResources();
        String[] stringArray = resources.getStringArray(C0126R.array.category_names);
        String[] stringArray2 = resources.getStringArray(C0126R.array.category_descriptions);
        Bitmap a = m102384a(resources.getDrawable(C0126R.C0127drawable.white_icons_foreground));
        Bitmap a2 = m102384a(resources.getDrawable(C0126R.C0127drawable.red_icons_foreground));
        int i = Build.VERSION.SDK_INT;
        int length = stringArray.length;
        this.f120580a = new C1245ok(length);
        this.f120587i = new C1245ok(length);
        this.f120581b = new C1245ok(length);
        float f = (float) length;
        float width = ((float) a.getWidth()) / f;
        float height = (float) a.getHeight();
        float width2 = ((float) a2.getWidth()) / f;
        float height2 = (float) a2.getHeight();
        this.f120588j = resources.getDrawable(C0126R.C0127drawable.white_icon_background);
        this.f120589k = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.red_icon_background);
        int i2 = 0;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (i2 < stringArray.length) {
            this.f120581b.put(stringArray[i2], stringArray2[i2]);
            Bitmap createBitmap = Bitmap.createBitmap(a, (int) f2, 0, (int) width, (int) height);
            this.f120580a.put(stringArray[i2], new LayerDrawable(new Drawable[]{this.f120588j, new BitmapDrawable(resources, createBitmap)}));
            f2 += width;
            Bitmap createBitmap2 = Bitmap.createBitmap(a2, (int) f3, 0, (int) width2, (int) height2);
            C1245ok okVar = this.f120587i;
            String str = stringArray[i2];
            Bitmap createBitmap3 = Bitmap.createBitmap(this.f120589k.getWidth(), this.f120589k.getHeight(), this.f120589k.getConfig());
            Canvas canvas = new Canvas(createBitmap3);
            canvas.drawBitmap(this.f120589k, 0.0f, 0.0f, (Paint) null);
            canvas.drawBitmap(createBitmap2, 0.0f, 0.0f, (Paint) null);
            okVar.put(str, createBitmap3);
            f3 += width2;
            i2++;
            stringArray2 = stringArray2;
            a = a;
            stringArray = stringArray;
            a2 = a2;
            height2 = height2;
        }
        this.f120582c = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.ic_qu_home);
        this.f120583d = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.ic_qu_work);
        this.f120584e = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.ic_qu_search);
        this.f120585f = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.ic_qu_clock);
        this.f120586g = BitmapFactory.decodeResource(resources, C0126R.C0127drawable.ic_qu_place);
    }

    /* renamed from: a */
    private static Bitmap m102384a(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* renamed from: a */
    public static bihb m102385a(Context context) {
        if (f120579h == null) {
            f120579h = new bihb(context.getApplicationContext());
        }
        return f120579h;
    }

    /* renamed from: a */
    public final Bitmap mo64607a(aelh aelh) {
        for (Integer num : aelh.mo8008b()) {
            Bitmap bitmap = (Bitmap) this.f120587i.get(bhqm.m101334a(num.intValue()));
            if (bitmap != null) {
                return bitmap;
            }
        }
        return (Bitmap) this.f120587i.get("establishment");
    }
}
