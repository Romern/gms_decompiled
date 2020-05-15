package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.support.p002v7.widget.AppCompatCheckBox;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Chip extends AppCompatCheckBox implements bhge, bhmg {

    /* renamed from: a */
    public static final Rect f151136a = new Rect();

    /* renamed from: f */
    private static final int f151137f = 2132019483;

    /* renamed from: g */
    private static final int[] f151138g = {16842913};

    /* renamed from: h */
    private static final int[] f151139h = {16842911};

    /* renamed from: b */
    public bhgf f151140b;

    /* renamed from: c */
    public View.OnClickListener f151141c;

    /* renamed from: d */
    public CompoundButton.OnCheckedChangeListener f151142d;

    /* renamed from: e */
    public boolean f151143e;

    /* renamed from: i */
    private InsetDrawable f151144i;

    /* renamed from: j */
    private RippleDrawable f151145j;

    /* renamed from: k */
    private boolean f151146k;

    /* renamed from: l */
    private boolean f151147l;

    /* renamed from: m */
    private boolean f151148m;

    /* renamed from: n */
    private boolean f151149n;

    /* renamed from: o */
    private int f151150o;

    /* renamed from: p */
    private int f151151p;

    /* renamed from: q */
    private final bhgd f151152q;

    /* renamed from: r */
    private final Rect f151153r;

    /* renamed from: s */
    private final RectF f151154s;

    /* renamed from: t */
    private final bhld f151155t;

    public Chip(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final void m117531a(boolean z) {
        if (this.f151147l != z) {
            this.f151147l = z;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    private final void m117533b(boolean z) {
        if (this.f151148m != z) {
            this.f151148m = z;
            refreshDrawableState();
        }
    }

    /* renamed from: h */
    private final void m117534h() {
        bhgf bhgf;
        if (!TextUtils.isEmpty(getText()) && (bhgf = this.f151140b) != null) {
            int e = (int) (bhgf.f118588m + bhgf.f118585j + bhgf.mo63712e());
            bhgf bhgf2 = this.f151140b;
            int d = (int) (bhgf2.f118583h + bhgf2.f118584i + bhgf2.mo63709d());
            if (this.f151144i != null) {
                Rect rect = new Rect();
                this.f151144i.getPadding(rect);
                d += rect.left;
                e += rect.right;
            }
            C1280ps.m19885a(this, d, getPaddingTop(), e, getPaddingBottom());
        }
    }

    /* renamed from: i */
    private final void m117535i() {
        if (!bhlg.f118948a) {
            this.f151140b.mo63702a(true);
            C1280ps.m19890a(this, mo71074a());
            m117534h();
            if (mo71074a() == this.f151144i && this.f151140b.getCallback() == null) {
                this.f151140b.setCallback(this.f151144i);
                return;
            }
            return;
        }
        this.f151145j = new RippleDrawable(bhlg.m101096b(this.f151140b.f118577b), mo71074a(), null);
        this.f151140b.mo63702a(false);
        C1280ps.m19890a(this, this.f151145j);
        m117534h();
    }

    /* renamed from: j */
    private final void m117536j() {
        bhlc bhlc;
        TextPaint paint = getPaint();
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            paint.drawableState = bhgf.getState();
        }
        bhgf bhgf2 = this.f151140b;
        if (bhgf2 != null) {
            bhlc = bhgf2.f118590o.f118905d;
        } else {
            bhlc = null;
        }
        if (bhlc != null) {
            bhlc.mo63910a(getContext(), paint, this.f151155t);
        }
    }

    /* renamed from: k */
    private final void m117537k() {
        if (this.f151144i != null) {
            this.f151144i = null;
            setMinWidth(0);
            bhgf bhgf = this.f151140b;
            setMinHeight((int) (bhgf != null ? bhgf.f118562a : 0.0f));
            m117535i();
        }
    }

    /* renamed from: a */
    public final Drawable mo71074a() {
        InsetDrawable insetDrawable = this.f151144i;
        return insetDrawable == null ? this.f151140b : insetDrawable;
    }

    /* renamed from: c */
    public final boolean mo71077c() {
        bhgf bhgf = this.f151140b;
        return (bhgf == null || bhgf.mo63715g() == null) ? false : true;
    }

    /* renamed from: d */
    public final RectF mo71078d() {
        this.f151154s.setEmpty();
        if (mo71077c()) {
            bhgf bhgf = this.f151140b;
            RectF rectF = this.f151154s;
            Rect bounds = bhgf.getBounds();
            rectF.setEmpty();
            if (bhgf.mo63707b()) {
                float f = bhgf.f118588m + bhgf.f118587l + bhgf.f118581f + bhgf.f118586k + bhgf.f118585j;
                if (C1173lt.m19613g(bhgf) == 0) {
                    rectF.right = (float) bounds.right;
                    rectF.left = rectF.right - f;
                } else {
                    rectF.left = (float) bounds.left;
                    rectF.right = ((float) bounds.left) + f;
                }
                rectF.top = (float) bounds.top;
                rectF.bottom = (float) bounds.bottom;
            }
        }
        return this.f151154s;
    }

    /* access modifiers changed from: protected */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return m117532a(motionEvent) || this.f151152q.mo15814a(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        if (r7 != false) goto L_0x007b;
     */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z;
        bhgd bhgd = this.f151152q;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i = 33;
                                } else if (keyCode == 21) {
                                    i = 17;
                                } else if (keyCode != 22) {
                                    i = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                int i2 = 0;
                                z = false;
                                while (i2 < repeatCount && bhgd.mo15813a(i, (Rect) null)) {
                                    i2++;
                                    z = true;
                                }
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = bhgd.f26921e;
                    if (i3 != Integer.MIN_VALUE) {
                        bhgd.mo15812a(i3, 16);
                    }
                    if (this.f151152q.f26921e != Integer.MIN_VALUE) {
                        return true;
                    }
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = bhgd.mo15813a(2, (Rect) null);
            } else if (keyEvent.hasModifiers(1)) {
                z = bhgd.mo15813a(1, (Rect) null);
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        bhgf bhgf = this.f151140b;
        if (bhgf != null && bhgf.m100829a(bhgf.f118580e)) {
            bhgf bhgf2 = this.f151140b;
            int isEnabled = isEnabled();
            if (this.f151143e) {
                isEnabled++;
            }
            if (this.f151148m) {
                isEnabled++;
            }
            if (this.f151147l) {
                isEnabled++;
            }
            if (isChecked()) {
                isEnabled++;
            }
            int[] iArr = new int[isEnabled];
            int i = 0;
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.f151143e) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f151148m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f151147l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (bhgf2.mo63703a(iArr)) {
                invalidate();
            }
        }
    }

    /* renamed from: e */
    public final Rect mo71081e() {
        RectF d = mo71078d();
        this.f151153r.set((int) d.left, (int) d.top, (int) d.right, (int) d.bottom);
        return this.f151153r;
    }

    /* renamed from: f */
    public final boolean mo71082f() {
        bhgf bhgf = this.f151140b;
        return bhgf != null && bhgf.f118582g;
    }

    /* renamed from: g */
    public final void mo71083g() {
        playSoundEffect(0);
        this.f151152q.mo15815b(1, 1);
    }

    public final TextUtils.TruncateAt getEllipsize() {
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            return bhgf.f118591p;
        }
        return null;
    }

    public final void getFocusedRect(Rect rect) {
        bhgd bhgd = this.f151152q;
        if (bhgd.f26921e == 1 || bhgd.f26920d == 1) {
            rect.set(mo71081e());
        } else {
            super.getFocusedRect(rect);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        bhls.m101143a(this, this.f151140b);
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f151138g);
        }
        if (mo71082f()) {
            mergeDrawableStates(onCreateDrawableState, f151139h);
        }
        return onCreateDrawableState;
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        bhgd bhgd = this.f151152q;
        int i2 = bhgd.f26921e;
        if (i2 != Integer.MIN_VALUE) {
            bhgd.mo15818d(i2);
        }
        if (z) {
            bhgd.mo15813a(i, rect);
        }
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            m117533b(mo71078d().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            m117533b(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        Object tag;
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (mo71082f() || isClickable()) {
            if (!mo71082f()) {
                str = "android.widget.Button";
            } else {
                str = "android.widget.CompoundButton";
            }
            accessibilityNodeInfo.setClassName(str);
        } else {
            accessibilityNodeInfo.setClassName("android.view.View");
        }
        accessibilityNodeInfo.setCheckable(mo71082f());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            C1301qm a = C1301qm.m20017a(accessibilityNodeInfo);
            int i2 = -1;
            if (chipGroup.f118835h) {
                int i3 = 0;
                i = 0;
                while (true) {
                    if (i3 >= chipGroup.getChildCount()) {
                        break;
                    }
                    if (chipGroup.getChildAt(i3) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i3)) == this) {
                            break;
                        }
                        i++;
                    }
                    i3++;
                }
                tag = getTag(C0126R.C0129id.row_index_key);
                if (tag instanceof Integer) {
                    i2 = ((Integer) tag).intValue();
                }
                a.mo15761b(C1300ql.m20014a(i2, 1, i, 1, isChecked()));
            }
            i = -1;
            tag = getTag(C0126R.C0129id.row_index_key);
            if (tag instanceof Integer) {
            }
            a.mo15761b(C1300ql.m20014a(i2, 1, i, 1, isChecked()));
        }
    }

    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (!mo71078d().contains(motionEvent.getX(), motionEvent.getY()) || !isEnabled()) {
            return null;
        }
        return PointerIcon.getSystemIcon(getContext(), 1002);
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f151150o != i) {
            this.f151150o = i;
            m117534h();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        if (r0 == false) goto L_0x0044;
     */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = mo71078d().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        z = false;
                    }
                } else if (this.f151147l) {
                    if (!contains) {
                        m117531a(false);
                        return true;
                    }
                }
            } else if (this.f151147l) {
                mo71083g();
                z = true;
            } else {
                z = false;
            }
            m117531a(false);
        } else if (contains) {
            m117531a(true);
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setBackground(Drawable drawable) {
        if (drawable == mo71074a() || drawable == this.f151145j) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    public final void setBackgroundDrawable(Drawable drawable) {
        if (drawable == mo71074a() || drawable == this.f151145j) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    public final void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    public final void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public final void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        bhgf bhgf = this.f151140b;
        if (bhgf == null) {
            this.f151146k = z;
        } else if (bhgf.f118582g) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked != z && (onCheckedChangeListener = this.f151142d) != null) {
                onCheckedChangeListener.onCheckedChanged(this, z);
            }
        }
    }

    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(null, drawable2, null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(null, drawable2, null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(0, i2, 0, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(0, i2, 0, i4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setElevation(float f) {
        super.setElevation(f);
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            bhgf.mo63949d(f);
        }
    }

    public final void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f151140b == null) {
            return;
        }
        if (truncateAt != TextUtils.TruncateAt.MARQUEE) {
            super.setEllipsize(truncateAt);
            bhgf bhgf = this.f151140b;
            if (bhgf != null) {
                bhgf.f118591p = truncateAt;
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
    }

    public final void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(8388627);
        }
    }

    public final void setLayoutDirection(int i) {
        if (this.f151140b != null) {
            int i2 = Build.VERSION.SDK_INT;
            super.setLayoutDirection(i);
        }
    }

    public final void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setMaxWidth(int i) {
        super.setMaxWidth(i);
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            bhgf.f118593r = i;
        }
    }

    public final void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setSingleLine(boolean z) {
        if (z) {
            super.setSingleLine(true);
            return;
        }
        throw new UnsupportedOperationException("Chip does not support multi-line text");
    }

    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        CharSequence charSequence2;
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            if (charSequence == null) {
                charSequence = "";
            }
            if (!bhgf.f118592q) {
                charSequence2 = charSequence;
            } else {
                charSequence2 = null;
            }
            super.setText(charSequence2, bufferType);
            bhgf bhgf2 = this.f151140b;
            if (bhgf2 != null) {
                bhgf2.mo63701a(charSequence);
            }
        }
    }

    public final void setTextAppearance(int i) {
        super.setTextAppearance(i);
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            bhgf.mo63697a(i);
        }
        m117536j();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.chipStyle);
    }

    /* renamed from: a */
    private final boolean m117532a(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 10) {
            try {
                Field declaredField = C1326rk.class.getDeclaredField("l");
                declaredField.setAccessible(true);
                if (((Integer) declaredField.get(this.f151152q)).intValue() != Integer.MIN_VALUE) {
                    Method declaredMethod = C1326rk.class.getDeclaredMethod("e", Integer.TYPE);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(this.f151152q, Integer.MIN_VALUE);
                    return true;
                }
            } catch (NoSuchMethodException e) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e);
            } catch (IllegalAccessException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            } catch (InvocationTargetException e3) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e3);
            } catch (NoSuchFieldException e4) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e4);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo63695b() {
        mo71075a(this.f151151p);
        requestLayout();
        int i = Build.VERSION.SDK_INT;
        invalidateOutline();
    }

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, f151137f), attributeSet, i);
        this.f151153r = new Rect();
        this.f151154s = new RectF();
        this.f151155t = new bhgb(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            } else if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            } else if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        bhgf a = bhgf.m100827a(context2, attributeSet, i, f151137f);
        TypedArray a2 = bhki.m101052a(context2, attributeSet, bhgj.f118597a, i, f151137f, new int[0]);
        this.f151149n = a2.getBoolean(31, false);
        this.f151151p = (int) Math.ceil((double) a2.getDimension(19, (float) Math.ceil((double) bhkn.m101061a(getContext(), 48))));
        a2.recycle();
        bhgf bhgf = this.f151140b;
        if (bhgf != a) {
            if (bhgf != null) {
                bhgf.mo63699a((bhge) null);
            }
            this.f151140b = a;
            a.f118592q = false;
            a.mo63699a(this);
            mo71075a(this.f151151p);
        }
        a.mo63949d(C1280ps.m19933o(this));
        TypedArray a3 = bhki.m101052a(context2, attributeSet, bhgj.f118597a, i, f151137f, new int[0]);
        int i2 = Build.VERSION.SDK_INT;
        boolean hasValue = a3.hasValue(36);
        a3.recycle();
        this.f151152q = new bhgd(this, this);
        mo71077c();
        C1280ps.m19894a(this, (C1251oq) null);
        if (!hasValue) {
            int i3 = Build.VERSION.SDK_INT;
            setOutlineProvider(new bhgc(this));
        }
        setChecked(this.f151146k);
        setText(a.f118578c);
        setEllipsize(a.f118591p);
        setIncludeFontPadding(false);
        m117536j();
        if (!this.f151140b.f118592q) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m117534h();
        if (this.f151149n) {
            setMinHeight(this.f151151p);
        }
        this.f151150o = C1280ps.m19923h(this);
    }

    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
    }

    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, drawable2, (Drawable) null, drawable4);
        } else {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            bhgf.mo63697a(i);
        }
        m117536j();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void}
     arg types: [bhgf, int, int, int, int]
     candidates:
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, float, float, float, float):void}
      ClspMth{android.graphics.drawable.InsetDrawable.<init>(android.graphics.drawable.Drawable, int, int, int, int):void} */
    /* renamed from: a */
    public final void mo71075a(int i) {
        int i2;
        int i3;
        this.f151151p = i;
        if (this.f151149n) {
            int max = Math.max(0, i - this.f151140b.getIntrinsicHeight());
            int max2 = Math.max(0, i - this.f151140b.getIntrinsicWidth());
            if (max2 > 0 || max > 0) {
                if (max2 > 0) {
                    i2 = max2 >> 1;
                } else {
                    i2 = 0;
                }
                if (max > 0) {
                    i3 = max >> 1;
                } else {
                    i3 = 0;
                }
                if (this.f151144i != null) {
                    Rect rect = new Rect();
                    this.f151144i.getPadding(rect);
                    if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                        m117535i();
                        return;
                    }
                }
                int i4 = Build.VERSION.SDK_INT;
                if (getMinHeight() != i) {
                    setMinHeight(i);
                }
                if (getMinWidth() != i) {
                    setMinWidth(i);
                }
                this.f151144i = new InsetDrawable((Drawable) this.f151140b, i2, i3, i2, i3);
                m117535i();
            } else if (this.f151144i != null) {
                m117537k();
            } else {
                m117535i();
            }
        } else if (this.f151144i != null) {
            m117537k();
        } else {
            m117535i();
        }
    }

    /* renamed from: a */
    public final void mo71076a(Drawable drawable) {
        bhgf bhgf = this.f151140b;
        if (bhgf != null) {
            bhgf.mo63705b(drawable);
        }
    }

    /* renamed from: a */
    public final void mo63916a(bhlx bhlx) {
        this.f151140b.mo63916a(bhlx);
    }
}
