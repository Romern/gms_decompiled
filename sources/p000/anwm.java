package p000;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: anwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anwm extends FrameLayout {

    /* renamed from: a */
    public String[] f77826a = null;

    /* renamed from: b */
    public final TextView f77827b;

    /* renamed from: c */
    private final ImageView f77828c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public anwm(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        TextView textView = new TextView(context);
        this.f77828c = imageView;
        addView(imageView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.f77827b = textView;
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        bringChildToFront(this.f77827b);
    }

    /* renamed from: a */
    public final void mo42338a(float f) {
        this.f77827b.setTextSize(0, f);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int measureText;
        int size = View.MeasureSpec.getSize(i);
        Paint paint = new Paint();
        paint.setTextSize(this.f77827b.getTextSize());
        paint.setTypeface(this.f77827b.getTypeface());
        String[] strArr = this.f77826a;
        if (strArr != null) {
            i3 = strArr.length;
        } else {
            i3 = 0;
        }
        String str = null;
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            String str2 = this.f77826a[i5];
            if (str2 != null && (measureText = (int) paint.measureText(str2)) <= size && measureText >= i4) {
                str = this.f77826a[i5];
                i4 = measureText;
            }
        }
        if (str == null || !str.equals(this.f77827b.getText())) {
            this.f77827b.setText(str);
        }
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo42339a(Uri uri) {
        this.f77828c.setImageURI(uri);
    }
}
