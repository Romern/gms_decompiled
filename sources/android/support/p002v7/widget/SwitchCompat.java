package android.support.p002v7.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.felicanetworks.mfc.C0126R;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;

/* renamed from: android.support.v7.widget.SwitchCompat */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SwitchCompat extends CompoundButton {

    /* renamed from: O */
    private static final int[] f1279O = {16842912};

    /* renamed from: e */
    private static final Property f1280e = new adl(Float.class, "thumbPos");

    /* renamed from: A */
    private int f1281A;

    /* renamed from: B */
    private int f1282B;

    /* renamed from: C */
    private int f1283C;

    /* renamed from: D */
    private int f1284D;

    /* renamed from: E */
    private int f1285E;

    /* renamed from: F */
    private int f1286F;

    /* renamed from: G */
    private int f1287G;

    /* renamed from: H */
    private final TextPaint f1288H;

    /* renamed from: I */
    private ColorStateList f1289I;

    /* renamed from: J */
    private Layout f1290J;

    /* renamed from: K */
    private Layout f1291K;

    /* renamed from: L */
    private TransformationMethod f1292L;

    /* renamed from: M */
    private final C1520yp f1293M;

    /* renamed from: N */
    private final Rect f1294N;

    /* renamed from: a */
    public CharSequence f1295a;

    /* renamed from: b */
    public CharSequence f1296b;

    /* renamed from: c */
    public float f1297c;

    /* renamed from: d */
    ObjectAnimator f1298d;

    /* renamed from: f */
    private Drawable f1299f;

    /* renamed from: g */
    private ColorStateList f1300g;

    /* renamed from: h */
    private PorterDuff.Mode f1301h;

    /* renamed from: i */
    private boolean f1302i;

    /* renamed from: j */
    private boolean f1303j;

    /* renamed from: k */
    private Drawable f1304k;

    /* renamed from: l */
    private ColorStateList f1305l;

    /* renamed from: m */
    private PorterDuff.Mode f1306m;

    /* renamed from: n */
    private boolean f1307n;

    /* renamed from: o */
    private boolean f1308o;

    /* renamed from: p */
    private int f1309p;

    /* renamed from: q */
    private int f1310q;

    /* renamed from: r */
    private int f1311r;

    /* renamed from: s */
    private boolean f1312s;

    /* renamed from: t */
    private boolean f1313t;

    /* renamed from: u */
    private int f1314u;

    /* renamed from: v */
    private int f1315v;

    /* renamed from: w */
    private float f1316w;

    /* renamed from: x */
    private float f1317x;

    /* renamed from: y */
    private VelocityTracker f1318y;

    /* renamed from: z */
    private int f1319z;

    public SwitchCompat(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final Layout m1348a(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f1292L;
        CharSequence transformation = transformationMethod == null ? charSequence : transformationMethod.getTransformation(charSequence, this);
        TextPaint textPaint = this.f1288H;
        return new StaticLayout(transformation, textPaint, transformation != null ? (int) Math.ceil((double) Layout.getDesiredWidth(transformation, textPaint)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    /* renamed from: a */
    private final boolean m1349a() {
        return this.f1297c > 0.5f;
    }

    /* renamed from: b */
    private final int m1350b() {
        float f;
        if (aek.m624a(this)) {
            f = 1.0f - this.f1297c;
        } else {
            f = this.f1297c;
        }
        return (int) ((f * ((float) m1351c())) + 0.5f);
    }

    /* renamed from: c */
    private final int m1351c() {
        Rect rect;
        Drawable drawable = this.f1304k;
        if (drawable == null) {
            return 0;
        }
        Rect rect2 = this.f1294N;
        drawable.getPadding(rect2);
        Drawable drawable2 = this.f1299f;
        if (drawable2 != null) {
            rect = C1540zi.m20969a(drawable2);
        } else {
            rect = C1540zi.f27739a;
        }
        return ((((this.f1281A - this.f1283C) - rect2.left) - rect2.right) - rect.left) - rect.right;
    }

    public final void draw(Canvas canvas) {
        Rect rect;
        int i;
        int i2;
        Rect rect2 = this.f1294N;
        int i3 = this.f1284D;
        int i4 = this.f1285E;
        int i5 = this.f1286F;
        int i6 = this.f1287G;
        int b = m1350b() + i3;
        Drawable drawable = this.f1299f;
        if (drawable != null) {
            rect = C1540zi.m20969a(drawable);
        } else {
            rect = C1540zi.f27739a;
        }
        Drawable drawable2 = this.f1304k;
        if (drawable2 != null) {
            drawable2.getPadding(rect2);
            b += rect2.left;
            if (rect == null) {
                i = i4;
                i2 = i6;
            } else {
                if (rect.left > rect2.left) {
                    i3 += rect.left - rect2.left;
                }
                if (rect.top > rect2.top) {
                    i = (rect.top - rect2.top) + i4;
                } else {
                    i = i4;
                }
                if (rect.right > rect2.right) {
                    i5 -= rect.right - rect2.right;
                }
                i2 = rect.bottom > rect2.bottom ? i6 - (rect.bottom - rect2.bottom) : i6;
            }
            this.f1304k.setBounds(i3, i, i5, i2);
        }
        Drawable drawable3 = this.f1299f;
        if (drawable3 != null) {
            drawable3.getPadding(rect2);
            int i7 = b - rect2.left;
            int i8 = b + this.f1283C + rect2.right;
            this.f1299f.setBounds(i7, i4, i8, i6);
            Drawable background = getBackground();
            if (background != null) {
                C1173lt.m19600a(background, i7, i4, i8, i6);
            }
        }
        super.draw(canvas);
    }

    public final void drawableHotspotChanged(float f, float f2) {
        int i = Build.VERSION.SDK_INT;
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.f1299f;
        if (drawable != null) {
            C1173lt.m19598a(drawable, f, f2);
        }
        Drawable drawable2 = this.f1304k;
        if (drawable2 != null) {
            C1173lt.m19598a(drawable2, f, f2);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1299f;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f1304k;
        if (drawable2 != null && drawable2.isStateful()) {
            z |= drawable2.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final int getCompoundPaddingLeft() {
        if (!aek.m624a(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f1281A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f1311r : compoundPaddingLeft;
    }

    public final int getCompoundPaddingRight() {
        if (aek.m624a(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f1281A;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f1311r : compoundPaddingRight;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1299f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1304k;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f1298d;
        if (objectAnimator != null && objectAnimator.isStarted()) {
            this.f1298d.end();
            this.f1298d = null;
        }
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f1279O);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Layout layout;
        int i;
        super.onDraw(canvas);
        Rect rect = this.f1294N;
        Drawable drawable = this.f1304k;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i2 = this.f1285E;
        int i3 = this.f1287G;
        int i4 = i2 + rect.top;
        int i5 = i3 - rect.bottom;
        Drawable drawable2 = this.f1299f;
        if (drawable != null) {
            if (this.f1312s && drawable2 != null) {
                Rect a = C1540zi.m20969a(drawable2);
                drawable2.copyBounds(rect);
                rect.left += a.left;
                rect.right -= a.right;
                int save = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(save);
            } else {
                drawable.draw(canvas);
            }
        }
        int save2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        if (!m1349a()) {
            layout = this.f1291K;
        } else {
            layout = this.f1290J;
        }
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f1289I;
            if (colorStateList != null) {
                this.f1288H.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f1288H.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                i = bounds.left + bounds.right;
            } else {
                i = getWidth();
            }
            canvas.translate((float) ((i / 2) - (layout.getWidth() / 2)), (float) (((i4 + i5) / 2) - (layout.getHeight() / 2)));
            layout.draw(canvas);
        }
        canvas.restoreToCount(save2);
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        if (!isChecked()) {
            charSequence = this.f1296b;
        } else {
            charSequence = this.f1295a;
        }
        if (!TextUtils.isEmpty(charSequence)) {
            CharSequence text = accessibilityNodeInfo.getText();
            if (TextUtils.isEmpty(text)) {
                accessibilityNodeInfo.setText(charSequence);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(text);
            sb.append(' ');
            sb.append(charSequence);
            accessibilityNodeInfo.setText(sb);
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        super.onLayout(z, i, i2, i3, i4);
        int i10 = 0;
        if (this.f1299f != null) {
            Rect rect = this.f1294N;
            Drawable drawable = this.f1304k;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect a = C1540zi.m20969a(this.f1299f);
            i5 = Math.max(0, a.left - rect.left);
            i10 = Math.max(0, a.right - rect.right);
        } else {
            i5 = 0;
        }
        if (aek.m624a(this)) {
            i7 = getPaddingLeft() + i5;
            i6 = ((this.f1281A + i7) - i5) - i10;
        } else {
            i6 = (getWidth() - getPaddingRight()) - i10;
            i7 = (i6 - this.f1281A) + i5 + i10;
        }
        int gravity = getGravity() & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        if (gravity == 16) {
            int paddingTop = getPaddingTop();
            int height = getHeight();
            int paddingBottom = getPaddingBottom();
            int i11 = this.f1282B;
            i9 = (((paddingTop + height) - paddingBottom) / 2) - (i11 / 2);
            i8 = i9 + i11;
        } else if (gravity != 80) {
            i9 = getPaddingTop();
            i8 = this.f1282B + i9;
        } else {
            i8 = getHeight() - getPaddingBottom();
            i9 = i8 - this.f1282B;
        }
        this.f1284D = i7;
        this.f1285E = i9;
        this.f1287G = i8;
        this.f1286F = i6;
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        if (this.f1313t) {
            if (this.f1290J == null) {
                this.f1290J = m1348a(this.f1295a);
            }
            if (this.f1291K == null) {
                this.f1291K = m1348a(this.f1296b);
            }
        }
        Rect rect = this.f1294N;
        Drawable drawable = this.f1299f;
        int i6 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            i4 = (this.f1299f.getIntrinsicWidth() - rect.left) - rect.right;
            i3 = this.f1299f.getIntrinsicHeight();
        } else {
            i4 = 0;
            i3 = 0;
        }
        if (this.f1313t) {
            int max = Math.max(this.f1290J.getWidth(), this.f1291K.getWidth());
            int i7 = this.f1309p;
            i5 = max + i7 + i7;
        } else {
            i5 = 0;
        }
        this.f1283C = Math.max(i5, i4);
        Drawable drawable2 = this.f1304k;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            i6 = this.f1304k.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int i8 = rect.left;
        int i9 = rect.right;
        Drawable drawable3 = this.f1299f;
        if (drawable3 != null) {
            Rect a = C1540zi.m20969a(drawable3);
            i8 = Math.max(i8, a.left);
            i9 = Math.max(i9, a.right);
        }
        int i10 = this.f1310q;
        int i11 = this.f1283C;
        int max2 = Math.max(i10, i11 + i11 + i8 + i9);
        int max3 = Math.max(i6, i3);
        this.f1281A = max2;
        this.f1282B = max3;
        super.onMeasure(i, i2);
        if (getMeasuredHeight() < max3) {
            setMeasuredDimension(getMeasuredWidthAndState(), max3);
        }
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        CharSequence charSequence;
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (!isChecked()) {
            charSequence = this.f1296b;
        } else {
            charSequence = this.f1295a;
        }
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r0 != 3) goto L_0x0157;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        float f;
        this.f1318y.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            float f2 = 0.0f;
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f1314u;
                    if (i == 1) {
                        float x = motionEvent.getX();
                        float y = motionEvent.getY();
                        if (Math.abs(x - this.f1316w) > ((float) this.f1315v) || Math.abs(y - this.f1317x) > ((float) this.f1315v)) {
                            this.f1314u = 2;
                            getParent().requestDisallowInterceptTouchEvent(true);
                            this.f1316w = x;
                            this.f1317x = y;
                            return true;
                        }
                    } else if (i == 2) {
                        float x2 = motionEvent.getX();
                        int c = m1351c();
                        float f3 = x2 - this.f1316w;
                        if (c != 0) {
                            f = f3 / ((float) c);
                        } else {
                            f = f3 > 0.0f ? 1.0f : -1.0f;
                        }
                        if (aek.m624a(this)) {
                            f = -f;
                        }
                        float f4 = this.f1297c;
                        float f5 = f + f4;
                        if (f5 >= 0.0f) {
                            if (f5 <= 1.0f) {
                                f2 = f5;
                            } else {
                                f2 = 1.0f;
                            }
                        }
                        if (f2 != f4) {
                            this.f1316w = x2;
                            mo1654a(f2);
                        }
                        return true;
                    }
                }
            }
            if (this.f1314u != 2) {
                this.f1314u = 0;
                this.f1318y.clear();
            } else {
                this.f1314u = 0;
                if (motionEvent.getAction() != 1 || !isEnabled()) {
                    z = false;
                } else {
                    z = true;
                }
                boolean isChecked = isChecked();
                if (z) {
                    this.f1318y.computeCurrentVelocity(1000);
                    float xVelocity = this.f1318y.getXVelocity();
                    if (Math.abs(xVelocity) > ((float) this.f1319z)) {
                        if (!aek.m624a(this)) {
                            if (xVelocity > 0.0f) {
                                z2 = true;
                            }
                        } else if (xVelocity < 0.0f) {
                            z2 = true;
                        }
                        z2 = false;
                    } else {
                        z2 = m1349a();
                    }
                } else {
                    z2 = isChecked;
                }
                if (z2 != isChecked) {
                    playSoundEffect(0);
                }
                setChecked(z2);
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setAction(3);
                super.onTouchEvent(obtain);
                obtain.recycle();
                super.onTouchEvent(motionEvent);
                return true;
            }
        } else {
            float x3 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (isEnabled() && this.f1299f != null) {
                int b = m1350b();
                this.f1299f.getPadding(this.f1294N);
                int i2 = this.f1285E;
                int i3 = this.f1315v;
                int i4 = i2 - i3;
                int i5 = (this.f1284D + b) - i3;
                int i6 = this.f1283C;
                int i7 = this.f1294N.left;
                int i8 = this.f1294N.right;
                int i9 = this.f1315v;
                int i10 = i6 + i5 + i7 + i8 + i9;
                int i11 = this.f1287G + i9;
                if (x3 > ((float) i5) && x3 < ((float) i10) && y2 > ((float) i4) && y2 < ((float) i11)) {
                    this.f1314u = 1;
                    this.f1316w = x3;
                    this.f1317x = y2;
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setChecked(boolean z) {
        super.setChecked(z);
        boolean isChecked = isChecked();
        float f = 0.0f;
        if (getWindowToken() != null && C1280ps.m19868C(this)) {
            if (isChecked) {
                f = 1.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f1280e, f);
            this.f1298d = ofFloat;
            ofFloat.setDuration(250L);
            int i = Build.VERSION.SDK_INT;
            this.f1298d.setAutoCancel(true);
            this.f1298d.start();
            return;
        }
        ObjectAnimator objectAnimator = this.f1298d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        if (isChecked) {
            f = 1.0f;
        }
        mo1654a(f);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        C1334rs.m20103a();
        super.setCustomSelectionActionModeCallback(callback);
    }

    public final void toggle() {
        setChecked(!isChecked());
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1299f || drawable == this.f1304k;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.switchStyle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    public SwitchCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Typeface typeface;
        Typeface typeface2;
        int i2;
        Drawable drawable;
        Drawable drawable2;
        this.f1300g = null;
        this.f1301h = null;
        this.f1302i = false;
        this.f1303j = false;
        this.f1305l = null;
        this.f1306m = null;
        this.f1307n = false;
        this.f1308o = false;
        this.f1318y = VelocityTracker.obtain();
        this.f1294N = new Rect();
        adm.m515a(this, getContext());
        boolean z = true;
        this.f1288H = new TextPaint(1);
        this.f1288H.density = getResources().getDisplayMetrics().density;
        adr a = adr.m523a(context, attributeSet, C1390tu.f27215x, i, 0);
        C1280ps.m19886a(this, context, C1390tu.f27215x, attributeSet, a.f290b, i, 0);
        Drawable a2 = a.mo449a(2);
        this.f1299f = a2;
        if (a2 != null) {
            a2.setCallback(this);
        }
        Drawable a3 = a.mo449a(11);
        this.f1304k = a3;
        if (a3 != null) {
            a3.setCallback(this);
        }
        this.f1295a = a.mo455c(0);
        this.f1296b = a.mo455c(1);
        this.f1313t = a.mo451a(3, true);
        this.f1309p = a.mo456d(8, 0);
        this.f1310q = a.mo456d(5, 0);
        this.f1311r = a.mo456d(6, 0);
        this.f1312s = a.mo451a(4, false);
        ColorStateList e = a.mo459e(9);
        if (e != null) {
            this.f1300g = e;
            this.f1302i = true;
        }
        PorterDuff.Mode a4 = C1540zi.m20968a(a.mo448a(10, -1), null);
        if (this.f1301h != a4) {
            this.f1301h = a4;
            this.f1303j = true;
        }
        boolean z2 = this.f1302i;
        if ((z2 || this.f1303j) && (drawable2 = this.f1299f) != null && (z2 || this.f1303j)) {
            int i3 = Build.VERSION.SDK_INT;
            Drawable mutate = drawable2.mutate();
            this.f1299f = mutate;
            if (this.f1302i) {
                C1173lt.m19601a(mutate, this.f1300g);
            }
            if (this.f1303j) {
                C1173lt.m19604a(this.f1299f, this.f1301h);
            }
            if (this.f1299f.isStateful()) {
                this.f1299f.setState(getDrawableState());
            }
        }
        ColorStateList e2 = a.mo459e(12);
        if (e2 != null) {
            this.f1305l = e2;
            this.f1307n = true;
        }
        PorterDuff.Mode a5 = C1540zi.m20968a(a.mo448a(13, -1), null);
        if (this.f1306m != a5) {
            this.f1306m = a5;
            this.f1308o = true;
        }
        boolean z3 = this.f1307n;
        if ((z3 || this.f1308o) && (drawable = this.f1304k) != null && (z3 || this.f1308o)) {
            int i4 = Build.VERSION.SDK_INT;
            Drawable mutate2 = drawable.mutate();
            this.f1304k = mutate2;
            if (this.f1307n) {
                C1173lt.m19601a(mutate2, this.f1305l);
            }
            if (this.f1308o) {
                C1173lt.m19604a(this.f1304k, this.f1306m);
            }
            if (this.f1304k.isStateful()) {
                this.f1304k.setState(getDrawableState());
            }
        }
        int f = a.mo460f(7, 0);
        if (f != 0) {
            adr a6 = adr.m521a(context, f, C1390tu.f27216y);
            ColorStateList e3 = a6.mo459e(3);
            if (e3 == null) {
                this.f1289I = getTextColors();
            } else {
                this.f1289I = e3;
            }
            int d = a6.mo456d(0, 0);
            if (d != 0) {
                float f2 = (float) d;
                if (f2 != this.f1288H.getTextSize()) {
                    this.f1288H.setTextSize(f2);
                    requestLayout();
                }
            }
            int a7 = a6.mo448a(1, -1);
            int a8 = a6.mo448a(2, -1);
            if (a7 == 1) {
                typeface = Typeface.SANS_SERIF;
            } else if (a7 == 2) {
                typeface = Typeface.SERIF;
            } else if (a7 != 3) {
                typeface = null;
            } else {
                typeface = Typeface.MONOSPACE;
            }
            float f3 = 0.0f;
            if (a8 <= 0) {
                this.f1288H.setFakeBoldText(false);
                this.f1288H.setTextSkewX(0.0f);
                mo1655a(typeface);
            } else {
                if (typeface != null) {
                    typeface2 = Typeface.create(typeface, a8);
                } else {
                    typeface2 = Typeface.defaultFromStyle(a8);
                }
                mo1655a(typeface2);
                if (typeface2 != null) {
                    i2 = typeface2.getStyle();
                } else {
                    i2 = 0;
                }
                int i5 = (i2 ^ -1) & a8;
                this.f1288H.setFakeBoldText((i5 & 1) == 0 ? false : z);
                this.f1288H.setTextSkewX((2 & i5) != 0 ? -0.25f : f3);
            }
            if (a6.mo451a(14, false)) {
                this.f1292L = new C1398ub(getContext());
            } else {
                this.f1292L = null;
            }
            a6.mo450a();
        }
        C1520yp ypVar = new C1520yp(this);
        this.f1293M = ypVar;
        ypVar.mo16570a(attributeSet, i);
        a.mo450a();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1315v = viewConfiguration.getScaledTouchSlop();
        this.f1319z = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }

    /* renamed from: a */
    public final void mo1654a(float f) {
        this.f1297c = f;
        invalidate();
    }

    /* renamed from: a */
    public final void mo1655a(Typeface typeface) {
        if ((this.f1288H.getTypeface() != null && !this.f1288H.getTypeface().equals(typeface)) || (this.f1288H.getTypeface() == null && typeface != null)) {
            this.f1288H.setTypeface(typeface);
            requestLayout();
            invalidate();
        }
    }
}
