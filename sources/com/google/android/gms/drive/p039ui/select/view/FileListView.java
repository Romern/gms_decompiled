package com.google.android.gms.drive.p039ui.select.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.p002v7.widget.RecyclerView;
import android.util.AttributeSet;

/* renamed from: com.google.android.gms.drive.ui.select.view.FileListView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FileListView extends RecyclerView {

    /* renamed from: a */
    public final voj f31222a;

    /* renamed from: b */
    public Runnable f31223b;

    /* renamed from: c */
    public abz f31224c;

    /* renamed from: d */
    private final abj f31225d;

    public FileListView(Context context) {
        this(context, null);
    }

    public final void draw(Canvas canvas) {
        int i;
        int i2;
        super.draw(canvas);
        voj voj = this.f31222a;
        if (voj.f49667r != 0) {
            int i3 = voj.f49655f;
            int width = voj.f49658i.getWidth();
            voh voh = voj.f49666q;
            if (voj.f49667r == 4) {
                i = voh.mo28687a();
                if (i < 104) {
                    voj.f49650a.setAlpha(i + i);
                }
                if (!voj.f49673x.equals(vog.LEFT)) {
                    i2 = width - ((voj.f49654e * i) / 208);
                } else {
                    width = (voj.f49654e * i) / 208;
                    i2 = 0;
                }
                voj.f49650a.setBounds(i2, 0, width, voj.f49653d);
                voj.f49671v = true;
            } else {
                i = -1;
            }
            if (voj.f49651b != null) {
                Rect bounds = voj.f49650a.getBounds();
                int i4 = bounds.left;
                int i5 = (bounds.bottom - bounds.top) / 2;
                int intrinsicWidth = voj.f49651b.getIntrinsicWidth();
                int i6 = (i4 + (voj.f49654e / 2)) - (intrinsicWidth / 2);
                voj.f49651b.setBounds(i6, i5, intrinsicWidth + i6, voj.f49658i.getHeight() - i5);
                voj.f49651b.draw(canvas);
            }
            canvas.translate(0.0f, (float) i3);
            voj.f49650a.draw(canvas);
            canvas.translate(0.0f, (float) (-i3));
            int i7 = voj.f49667r;
            if (i7 == 3) {
                if (voj.f49665p) {
                    String str = voj.f49664o;
                    voj.f49674A.draw(canvas);
                    Paint paint = voj.f49677z;
                    RectF rectF = voj.f49675B;
                    float ascent = paint.ascent();
                    canvas.drawText(str, (float) (((int) (rectF.left + rectF.right)) / 2), (float) ((int) (((rectF.top + rectF.bottom) - (paint.descent() + ascent)) / 2.0f)), paint);
                }
            } else if (i7 != 4) {
            } else {
                if (i != 0) {
                    voj.f49672w.invalidate(voj.mo28692b(), i3, voj.mo28689a(), voj.f49653d + i3);
                } else {
                    voj.mo28690a(0);
                }
            }
        }
    }

    public final boolean isVerticalScrollBarEnabled() {
        return this.f31222a.f49667r == 0;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Runnable runnable = this.f31223b;
        if (runnable != null) {
            runnable.run();
            this.f31223b = null;
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        voj voj = this.f31222a;
        Resources resources = getResources();
        Drawable drawable = voj.f49650a;
        if (drawable != null) {
            drawable.setBounds(voj.mo28694c(i), 0, voj.mo28693b(i), voj.f49653d);
        }
        RectF rectF = voj.f49656g;
        rectF.left = (float) ((i - voj.f49657h) / 2);
        rectF.right = rectF.left + ((float) voj.f49657h);
        float f = (float) (i2 / 10);
        rectF.top = f;
        rectF.bottom = rectF.top + ((float) voj.f49657h);
        Drawable drawable2 = voj.f49652c;
        if (drawable2 != null) {
            drawable2.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        RectF rectF2 = voj.f49675B;
        rectF2.left = (float) ((i - voj.f49676y) / 2);
        rectF2.right = rectF2.left + ((float) voj.f49676y);
        rectF2.top = f;
        Rect rect = new Rect();
        voj.f49677z.getTextBounds("W", 0, 1, rect);
        int i5 = (int) (resources.getDisplayMetrics().density * 30.0f);
        rectF2.bottom = rectF2.top + ((float) (i5 + i5)) + ((float) (rect.bottom - rect.top));
        NinePatchDrawable ninePatchDrawable = voj.f49674A;
        if (ninePatchDrawable != null) {
            ninePatchDrawable.setBounds((int) rectF2.left, (int) rectF2.top, (int) rectF2.right, (int) rectF2.bottom);
        }
    }

    public final void setAdapter(abh abh) {
        abh adapter = getAdapter();
        if (abh != adapter) {
            if (adapter != null) {
                adapter.mo174b(this.f31225d);
            }
            super.setAdapter(abh);
            if (abh != null) {
                abh.mo166a(this.f31225d);
            }
        }
    }

    public final void setOnScrollListener(abz abz) {
        this.f31224c = abz;
    }

    public FileListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FileListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31225d = new vom(this);
        this.f31222a = new voj(getContext(), this, this, vog.RIGHT);
        super.setOnScrollListener(new von(this));
        setWillNotDraw(false);
    }
}
