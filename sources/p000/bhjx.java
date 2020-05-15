package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: bhjx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhjx extends FrameLayout {

    /* renamed from: a */
    Drawable f118880a;

    /* renamed from: b */
    Rect f118881b;

    /* renamed from: c */
    public boolean f118882c;

    /* renamed from: d */
    public boolean f118883d;

    /* renamed from: e */
    private Rect f118884e;

    public bhjx(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63888a(C1296qh qhVar) {
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f118881b != null && this.f118880a != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f118882c) {
                this.f118884e.set(0, 0, width, this.f118881b.top);
                this.f118880a.setBounds(this.f118884e);
                this.f118880a.draw(canvas);
            }
            if (this.f118883d) {
                this.f118884e.set(0, height - this.f118881b.bottom, width, height);
                this.f118880a.setBounds(this.f118884e);
                this.f118880a.draw(canvas);
            }
            this.f118884e.set(0, this.f118881b.top, this.f118881b.left, height - this.f118881b.bottom);
            this.f118880a.setBounds(this.f118884e);
            this.f118880a.draw(canvas);
            this.f118884e.set(width - this.f118881b.right, this.f118881b.top, width, height - this.f118881b.bottom);
            this.f118880a.setBounds(this.f118884e);
            this.f118880a.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f118880a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f118880a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public bhjx(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public bhjx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f118884e = new Rect();
        this.f118882c = true;
        this.f118883d = true;
        TypedArray a = bhki.m101052a(context, attributeSet, bhjv.f118877c, i, 2132019311, new int[0]);
        this.f118880a = a.getDrawable(0);
        a.recycle();
        setWillNotDraw(true);
        C1280ps.m19895a(this, new bhjw(this));
    }
}
