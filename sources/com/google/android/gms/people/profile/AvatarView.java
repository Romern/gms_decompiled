package com.google.android.gms.people.profile;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class AvatarView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: s */
    private static boolean f81964s;

    /* renamed from: t */
    private static int f81965t;

    /* renamed from: u */
    private static boolean f81966u;

    /* renamed from: v */
    private static Paint f81967v;

    /* renamed from: w */
    private static Paint f81968w;

    /* renamed from: x */
    private static int f81969x;

    /* renamed from: A */
    private boolean f81970A;

    /* renamed from: B */
    private float f81971B;

    /* renamed from: C */
    private long f81972C;

    /* renamed from: D */
    private final RectF f81973D = new RectF();

    /* renamed from: E */
    private final RectF f81974E = new RectF();

    /* renamed from: F */
    private final RectF f81975F = new RectF();

    /* renamed from: G */
    private final float[] f81976G = new float[9];

    /* renamed from: a */
    public Drawable f81977a;

    /* renamed from: b */
    public Matrix f81978b;

    /* renamed from: c */
    public final Matrix f81979c = new Matrix();

    /* renamed from: d */
    public final Rect f81980d = new Rect();

    /* renamed from: e */
    float f81981e;

    /* renamed from: f */
    GestureDetector f81982f;

    /* renamed from: g */
    ScaleGestureDetector f81983g;

    /* renamed from: h */
    View.OnClickListener f81984h;

    /* renamed from: i */
    boolean f81985i;

    /* renamed from: j */
    boolean f81986j;

    /* renamed from: k */
    boolean f81987k;

    /* renamed from: l */
    amiu f81988l;

    /* renamed from: m */
    public float f81989m;

    /* renamed from: n */
    boolean f81990n;

    /* renamed from: o */
    float f81991o;

    /* renamed from: p */
    amiw f81992p;

    /* renamed from: q */
    amiv f81993q;

    /* renamed from: r */
    public float f81994r;

    /* renamed from: y */
    private final Matrix f81995y = new Matrix();

    /* renamed from: z */
    private int f81996z = -1;

    public AvatarView(Context context) {
        super(context);
        m68087d();
    }

    /* renamed from: a */
    private final void m68085a(float f) {
        if (this.f81977a == null) {
            setContentDescription(getResources().getString(C0126R.string.people_avatar_cropper));
        } else if (Math.abs(this.f81989m - f) < 5.0E-8f) {
            setContentDescription(getResources().getString(C0126R.string.people_avatar_view_description_max_crop_updated));
        } else {
            setContentDescription(getResources().getString(C0126R.string.people_avatar_cropper));
        }
    }

    /* renamed from: c */
    private final float m68086c() {
        this.f81979c.getValues(this.f81976G);
        return this.f81976G[0];
    }

    /* renamed from: d */
    private final void m68087d() {
        Context context = getContext();
        if (!f81964s) {
            f81964s = true;
            Resources resources = context.getApplicationContext().getResources();
            f81969x = resources.getColor(C0126R.color.people_avatar_preview_background);
            f81965t = resources.getDimensionPixelSize(C0126R.dimen.people_avatar_preview_profile_width);
            Paint paint = new Paint();
            f81967v = paint;
            paint.setAntiAlias(true);
            f81967v.setColor(resources.getColor(C0126R.color.people_avatar_preview_crop_dim));
            f81967v.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            f81968w = paint2;
            paint2.setAntiAlias(true);
            f81968w.setColor(resources.getColor(C0126R.color.people_avatar_preview_crop_highlight));
            f81968w.setStyle(Paint.Style.STROKE);
            f81968w.setStrokeWidth(resources.getDimension(C0126R.dimen.people_avatar_preview_stroke_width));
            f81966u = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        }
        this.f81982f = new GestureDetector(context, this, null, true ^ f81966u);
        this.f81983g = new ScaleGestureDetector(context, this);
        this.f81988l = new amiu(this);
        this.f81992p = new amiw(this);
        this.f81993q = new amiv(this);
        new amit(this);
        setContentDescription(getResources().getString(C0126R.string.people_avatar_cropper));
    }

    /* renamed from: b */
    public final void mo46377b() {
        float f;
        this.f81975F.set(this.f81973D);
        this.f81979c.mapRect(this.f81975F);
        float f2 = (float) this.f81980d.left;
        float f3 = (float) this.f81980d.right;
        float f4 = this.f81975F.left;
        float f5 = this.f81975F.right;
        float f6 = f3 - f2;
        float f7 = 0.0f;
        if (f5 - f4 < f6) {
            f = f2 + ((f6 - (f5 + f4)) / 2.0f);
        } else {
            f = f4 > f2 ? f2 - f4 : f5 < f3 ? f3 - f5 : 0.0f;
        }
        float f8 = (float) this.f81980d.top;
        float f9 = (float) this.f81980d.bottom;
        float f10 = this.f81975F.top;
        float f11 = this.f81975F.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f7 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f7 = f8 - f10;
        } else if (f11 < f9) {
            f7 = f9 - f11;
        }
        if (Math.abs(f) <= 20.0f && Math.abs(f7) <= 20.0f) {
            this.f81979c.postTranslate(f, f7);
            invalidate();
            return;
        }
        amiv amiv = this.f81993q;
        if (!amiv.f74966e) {
            amiv.f74965d = -1;
            amiv.f74963b = f;
            amiv.f74964c = f7;
            amiv.f74967f = false;
            amiv.f74966e = true;
            amiv.f74962a.postDelayed(amiv, 250);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.f81977a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f81977a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f81977a;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f81977a;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }

    public final boolean onDoubleTap(MotionEvent motionEvent) {
        boolean z;
        if (this.f81985i) {
            if (!this.f81986j) {
                float c = m68086c();
                float min = Math.min(this.f81971B, Math.max(this.f81989m, 1.5f * c));
                amiu amiu = this.f81988l;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!amiu.f74960i) {
                    amiu.f74953b = x;
                    amiu.f74954c = y;
                    amiu.f74956e = min;
                    amiu.f74959h = System.currentTimeMillis();
                    amiu.f74957f = c;
                    float f = amiu.f74956e;
                    if (f > c) {
                        z = true;
                    } else {
                        z = false;
                    }
                    amiu.f74955d = z;
                    amiu.f74958g = (f - c) / 300.0f;
                    amiu.f74960i = true;
                    amiu.f74961j = false;
                    amiu.f74952a.post(amiu);
                }
            }
            this.f81986j = false;
        }
        return true;
    }

    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.f81985i) {
            return true;
        }
        this.f81992p.mo41205a();
        this.f81993q.mo41203a();
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(f81969x);
        if (this.f81977a != null) {
            int saveCount = canvas.getSaveCount();
            canvas.save();
            Matrix matrix = this.f81978b;
            if (matrix != null) {
                canvas.concat(matrix);
            }
            this.f81977a.draw(canvas);
            canvas.restoreToCount(saveCount);
            this.f81975F.set(this.f81977a.getBounds());
            Matrix matrix2 = this.f81978b;
            if (matrix2 != null) {
                matrix2.mapRect(this.f81975F);
            }
            int saveCount2 = canvas.getSaveCount();
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), f81967v);
            canvas.save();
            canvas.clipRect(this.f81980d);
            Matrix matrix3 = this.f81978b;
            if (matrix3 != null) {
                canvas.concat(matrix3);
            }
            this.f81977a.draw(canvas);
            canvas.restoreToCount(saveCount2);
            canvas.drawRect(this.f81980d, f81968w);
        }
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.f81985i) {
            if (!this.f81990n) {
                amiw amiw = this.f81992p;
                if (!amiw.f74972e) {
                    amiw.f74971d = -1;
                    amiw.f74969b = f;
                    amiw.f74970c = f2;
                    amiw.f74973f = false;
                    amiw.f74972e = true;
                    amiw.f74968a.post(amiw);
                }
            }
            this.f81990n = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f81970A = true;
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(f81965t, Math.min(width, height));
        int i5 = (int) ((float) min);
        int i6 = (width - min) / 2;
        int i7 = (height - i5) / 2;
        this.f81980d.set(i6, i7, min + i6, i5 + i7);
        mo46375a(z);
    }

    public final void onLongPress(MotionEvent motionEvent) {
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (this.f81996z != -1) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, Integer.MIN_VALUE));
            setMeasuredDimension(getMeasuredWidth(), this.f81996z);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() - 4.0f;
        if ((scaleFactor < 0.0f && this.f81991o > 0.0f) || (scaleFactor > 0.0f && this.f81991o < 0.0f)) {
            this.f81991o = 0.0f;
        }
        float f = this.f81991o + scaleFactor;
        this.f81991o = f;
        if (!this.f81985i || Math.abs(f) <= 0.04f) {
            return true;
        }
        this.f81987k = false;
        mo46374a(m68086c() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.f81985i) {
            this.f81988l.mo41201a();
            this.f81987k = true;
            this.f81991o = 0.0f;
        }
        return true;
    }

    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.f81985i && this.f81987k) {
            this.f81986j = true;
            this.f81979c.set(this.f81995y);
            invalidate();
        }
        this.f81990n = true;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent2.getEventTime() - this.f81972C) <= 400 || !this.f81985i) {
            return true;
        }
        mo46376a(-f, -f2);
        return true;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.f81984h;
        if (onClickListener != null && !this.f81987k) {
            onClickListener.onClick(this);
        }
        this.f81987k = false;
        return true;
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.f81983g;
        if (scaleGestureDetector == null || this.f81982f == null) {
            return true;
        }
        scaleGestureDetector.onTouchEvent(motionEvent);
        this.f81982f.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 6) {
            if (motionEvent.getPointerCount() == 2) {
                this.f81972C = motionEvent.getEventTime();
            } else if (motionEvent.getPointerCount() == 1) {
                this.f81972C = 0;
            }
        }
        int action = motionEvent.getAction();
        if ((action == 1 || action == 3) && !this.f81992p.f74972e) {
            mo46377b();
        }
        return true;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.f81984h = onClickListener;
    }

    public final void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        Drawable drawable = this.f81977a;
        if (drawable != null) {
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            drawable.setVisible(z, false);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return this.f81977a == drawable || super.verifyDrawable(drawable);
    }

    /* renamed from: a */
    public final void mo46373a() {
        Drawable drawable = this.f81977a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.f81977a = null;
    }

    /* renamed from: a */
    public final void mo46374a(float f, float f2, float f3) {
        this.f81979c.postRotate(-this.f81994r, (float) (getWidth() / 2), (float) (getHeight() / 2));
        float min = Math.min(Math.max(f, this.f81989m), this.f81971B);
        float c = min / m68086c();
        this.f81979c.postScale(c, c, f2, f3);
        mo46377b();
        this.f81979c.postRotate(this.f81994r, (float) (getWidth() / 2), (float) (getHeight() / 2));
        m68085a(min);
        invalidate();
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m68087d();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(float, float):float}
     arg types: [float, int]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(long, long):long}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(float, float):float} */
    /* renamed from: a */
    public final void mo46375a(boolean z) {
        m68085a(this.f81989m);
        Drawable drawable = this.f81977a;
        if (drawable != null && this.f81970A) {
            this.f81977a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.f81977a.getIntrinsicHeight());
            if (z || (this.f81989m == 0.0f && this.f81977a != null && this.f81970A)) {
                int intrinsicWidth = this.f81977a.getIntrinsicWidth();
                int intrinsicHeight = this.f81977a.getIntrinsicHeight();
                int i = this.f81980d.right;
                int i2 = this.f81980d.left;
                int i3 = this.f81980d.bottom;
                int i4 = this.f81980d.top;
                float f = (float) intrinsicWidth;
                float f2 = (float) intrinsicHeight;
                this.f81973D.set(0.0f, 0.0f, f, f2);
                float f3 = f2 / f;
                this.f81981e = f3;
                float f4 = (float) (i3 - i4);
                float f5 = (float) (i - i2);
                if (f3 > f4 / f5) {
                    int i5 = (this.f81980d.top + this.f81980d.bottom) / 2;
                    int round = Math.round(f5 * this.f81981e) / 2;
                    this.f81974E.set((float) this.f81980d.left, (float) (i5 - round), (float) this.f81980d.right, (float) (i5 + round));
                } else {
                    int i6 = (this.f81980d.right + this.f81980d.left) / 2;
                    int round2 = Math.round(f4 / this.f81981e) / 2;
                    this.f81974E.set((float) (i6 - round2), (float) this.f81980d.top, (float) (i6 + round2), (float) this.f81980d.bottom);
                }
                this.f81979c.setRectToRect(this.f81973D, this.f81974E, Matrix.ScaleToFit.CENTER);
                this.f81995y.set(this.f81979c);
                float c = m68086c();
                this.f81989m = c;
                this.f81971B = Math.max(c + c, Math.min(c * 8.0f, 8.0f));
            }
            this.f81978b = this.f81979c;
        }
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m68087d();
    }

    /* renamed from: a */
    public final boolean mo46376a(float f, float f2) {
        this.f81975F.set(this.f81973D);
        this.f81979c.mapRect(this.f81975F);
        int i = this.f81980d.left;
        int i2 = this.f81980d.right;
        float f3 = this.f81975F.left;
        float f4 = this.f81975F.right;
        float max = Math.max(((float) i) - this.f81975F.right, Math.min(((float) i2) - this.f81975F.left, f));
        int i3 = this.f81980d.top;
        int i4 = this.f81980d.bottom;
        float f5 = this.f81975F.top;
        float f6 = this.f81975F.bottom;
        float max2 = Math.max(((float) i3) - this.f81975F.bottom, Math.min(((float) i4) - this.f81975F.top, f2));
        this.f81979c.postTranslate(max, max2);
        invalidate();
        return max == f && max2 == f2;
    }
}
