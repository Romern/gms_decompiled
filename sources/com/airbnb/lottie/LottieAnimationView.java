package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p002v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.io.ByteArrayInputStream;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: a */
    public static final ayq f7169a = new axr();

    /* renamed from: b */
    public int f7170b = 0;

    /* renamed from: c */
    public final ayo f7171c = new ayo();

    /* renamed from: d */
    public axw f7172d;

    /* renamed from: e */
    private final ayq f7173e = new axs(this);

    /* renamed from: f */
    private final ayq f7174f = new axt(this);

    /* renamed from: g */
    private boolean f7175g;

    /* renamed from: h */
    private String f7176h;

    /* renamed from: i */
    private int f7177i;

    /* renamed from: j */
    private boolean f7178j = false;

    /* renamed from: k */
    private boolean f7179k = false;

    /* renamed from: l */
    private boolean f7180l = false;

    /* renamed from: m */
    private Set f7181m = new HashSet();

    /* renamed from: n */
    private int f7182n = 0;

    /* renamed from: o */
    private ayx f7183o;

    /* renamed from: p */
    private int f7184p = 1;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new axu();

        /* renamed from: a */
        String f7185a;

        /* renamed from: b */
        int f7186b;

        /* renamed from: c */
        float f7187c;

        /* renamed from: d */
        boolean f7188d;

        /* renamed from: e */
        String f7189e;

        /* renamed from: f */
        int f7190f;

        /* renamed from: g */
        int f7191g;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f7185a = parcel.readString();
            this.f7187c = parcel.readFloat();
            this.f7188d = parcel.readInt() != 1 ? false : true;
            this.f7189e = parcel.readString();
            this.f7190f = parcel.readInt();
            this.f7191g = parcel.readInt();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f7185a);
            parcel.writeFloat(this.f7187c);
            parcel.writeInt(this.f7188d ? 1 : 0);
            parcel.writeString(this.f7189e);
            parcel.writeInt(this.f7190f);
            parcel.writeInt(this.f7191g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static {
        LottieAnimationView.class.getSimpleName();
    }

    public LottieAnimationView(Context context) {
        super(context);
        m4654a((AttributeSet) null);
    }

    /* renamed from: a */
    private void m4654a(AttributeSet attributeSet) {
        String string;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, ayz.f2609a);
        boolean z = false;
        if (!isInEditMode()) {
            boolean hasValue = obtainStyledAttributes.hasValue(9);
            boolean hasValue2 = obtainStyledAttributes.hasValue(5);
            boolean hasValue3 = obtainStyledAttributes.hasValue(15);
            if (!hasValue || !hasValue2) {
                if (hasValue) {
                    int resourceId = obtainStyledAttributes.getResourceId(9, 0);
                    if (resourceId != 0) {
                        mo4045a(resourceId);
                    }
                } else if (hasValue2) {
                    String string2 = obtainStyledAttributes.getString(5);
                    if (string2 != null) {
                        mo4049a(string2);
                    }
                } else if (hasValue3 && (string = obtainStyledAttributes.getString(15)) != null) {
                    m4655a(aye.m2428a(getContext(), string));
                }
                this.f7170b = obtainStyledAttributes.getResourceId(4, 0);
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        }
        if (obtainStyledAttributes.getBoolean(0, false)) {
            this.f7179k = true;
            this.f7180l = true;
        }
        if (obtainStyledAttributes.getBoolean(7, false)) {
            this.f7171c.mo2881b(-1);
        }
        if (obtainStyledAttributes.hasValue(12)) {
            mo4053b(obtainStyledAttributes.getInt(12, 1));
        }
        if (obtainStyledAttributes.hasValue(11)) {
            mo4057c(obtainStyledAttributes.getInt(11, -1));
        }
        if (obtainStyledAttributes.hasValue(14)) {
            mo4043a(obtainStyledAttributes.getFloat(14, 1.0f));
        }
        this.f7171c.f2555f = obtainStyledAttributes.getString(6);
        mo4052b(obtainStyledAttributes.getFloat(8, 0.0f));
        boolean z2 = obtainStyledAttributes.getBoolean(3, false);
        ayo ayo = this.f7171c;
        if (ayo.f2557h != z2) {
            int i = Build.VERSION.SDK_INT;
            ayo.f2557h = z2;
            if (ayo.f2550a != null) {
                ayo.mo2871a();
            }
        }
        if (obtainStyledAttributes.hasValue(2)) {
            azb azb = new azb(obtainStyledAttributes.getColor(2, 0));
            this.f7171c.mo2876a(new bau("**"), ayt.f2572B, new beq(azb));
        }
        if (obtainStyledAttributes.hasValue(13)) {
            this.f7171c.mo2880b(obtainStyledAttributes.getFloat(13, 1.0f));
        }
        if (obtainStyledAttributes.hasValue(10)) {
            int i2 = obtainStyledAttributes.getInt(10, 0);
            if (i2 >= aza.m2475a().length) {
                i2 = 0;
            }
            mo4060d(aza.m2475a()[i2]);
        }
        if (getScaleType() != null) {
            this.f7171c.f2554e = getScaleType();
        }
        obtainStyledAttributes.recycle();
        ayo ayo2 = this.f7171c;
        if (ben.m2829a(getContext()) != 0.0f) {
            z = true;
        }
        ayo2.f2552c = Boolean.valueOf(z).booleanValue();
        m4657f();
        this.f7175g = true;
    }

    /* renamed from: e */
    private final void m4656e() {
        ayx ayx = this.f7183o;
        if (ayx != null) {
            ayx.mo2918d(this.f7173e);
            this.f7183o.mo2917c(this.f7174f);
        }
    }

    /* renamed from: f */
    private final void m4657f() {
        int i = this.f7184p;
        int i2 = i - 1;
        if (i != 0) {
            int i3 = 2;
            if (i2 == 0) {
                axw axw = this.f7172d;
                if (axw != null && axw.f2517k) {
                    int i4 = Build.VERSION.SDK_INT;
                }
                axw axw2 = this.f7172d;
                if (axw2 != null && axw2.f2518l > 4) {
                    i3 = 1;
                } else {
                    int i5 = Build.VERSION.SDK_INT;
                }
            } else if (i2 != 1) {
                i3 = i2 != 2 ? 1 : 1;
            }
            if (i3 != getLayerType()) {
                setLayerType(i3, null);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: a */
    public final void mo4043a(float f) {
        this.f7171c.f2551b.f3086b = f;
    }

    /* renamed from: b */
    public final void mo4051b() {
        if (isShown()) {
            this.f7171c.mo2883d();
            m4657f();
            return;
        }
        this.f7178j = true;
    }

    public final void buildDrawingCache(boolean z) {
        this.f7182n++;
        super.buildDrawingCache(z);
        if (this.f7182n == 1 && getWidth() > 0 && getHeight() > 0 && getLayerType() == 1 && getDrawingCache(z) == null) {
            mo4060d(2);
        }
        this.f7182n--;
        axq.m2409a();
    }

    /* renamed from: c */
    public final void mo4057c(int i) {
        this.f7171c.mo2881b(i);
    }

    /* renamed from: d */
    public final void mo4059d() {
        this.f7180l = false;
        this.f7179k = false;
        this.f7178j = false;
        ayo ayo = this.f7171c;
        ayo.f2553d.clear();
        ayo.f2551b.mo3065i();
        m4657f();
    }

    public final void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        ayo ayo = this.f7171c;
        if (drawable2 == ayo) {
            super.invalidateDrawable(ayo);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f7180l || this.f7179k) {
            mo4042a();
            this.f7180l = false;
            this.f7179k = false;
        }
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        if (mo4058c()) {
            this.f7178j = false;
            ayo ayo = this.f7171c;
            ayo.f2553d.clear();
            ayo.f2551b.cancel();
            m4657f();
            this.f7179k = true;
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        String str = savedState.f7185a;
        this.f7176h = str;
        if (!TextUtils.isEmpty(str)) {
            mo4049a(this.f7176h);
        }
        int i = savedState.f7186b;
        this.f7177i = i;
        if (i != 0) {
            mo4045a(i);
        }
        mo4052b(savedState.f7187c);
        if (savedState.f7188d) {
            mo4042a();
        }
        this.f7171c.f2555f = savedState.f7189e;
        mo4053b(savedState.f7190f);
        mo4057c(savedState.f7191g);
    }

    /* access modifiers changed from: protected */
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7185a = this.f7176h;
        savedState.f7186b = this.f7177i;
        savedState.f7187c = this.f7171c.mo2898k();
        savedState.f7188d = this.f7171c.mo2893i();
        ayo ayo = this.f7171c;
        savedState.f7189e = ayo.f2555f;
        savedState.f7190f = ayo.f2551b.getRepeatMode();
        savedState.f7191g = this.f7171c.mo2892h();
        return savedState;
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        if (!this.f7175g) {
            return;
        }
        if (isShown()) {
            if (this.f7178j) {
                mo4051b();
                this.f7178j = false;
            }
        } else if (mo4058c()) {
            mo4059d();
            this.f7178j = true;
        }
    }

    public final void setImageBitmap(Bitmap bitmap) {
        m4656e();
        super.setImageBitmap(bitmap);
    }

    public final void setImageDrawable(Drawable drawable) {
        m4656e();
        super.setImageDrawable(drawable);
    }

    public final void setImageResource(int i) {
        m4656e();
        super.setImageResource(i);
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        super.setScaleType(scaleType);
        ayo ayo = this.f7171c;
        if (ayo != null) {
            ayo.f2554e = scaleType;
        }
    }

    /* renamed from: b */
    public final void mo4052b(float f) {
        this.f7171c.mo2872a(f);
    }

    /* renamed from: c */
    public final boolean mo4058c() {
        return this.f7171c.mo2893i();
    }

    /* renamed from: b */
    public final void mo4053b(int i) {
        this.f7171c.f2551b.setRepeatMode(i);
    }

    /* renamed from: b */
    public final void mo4054b(Animator.AnimatorListener animatorListener) {
        this.f7171c.f2551b.removeListener(animatorListener);
    }

    /* renamed from: d */
    public final void mo4060d(int i) {
        this.f7184p = i;
        m4657f();
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4654a(attributeSet);
    }

    /* renamed from: b */
    public final void mo4055b(String str) {
        m4655a(aye.m2429a(new ByteArrayInputStream(str.getBytes())));
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4654a(attributeSet);
    }

    /* renamed from: a */
    private final void m4655a(ayx ayx) {
        this.f7172d = null;
        this.f7171c.mo2879b();
        m4656e();
        ayx.mo2916b(this.f7173e);
        ayx.mo2912a(this.f7174f);
        this.f7183o = ayx;
    }

    /* renamed from: a */
    public final void mo4042a() {
        if (isShown()) {
            this.f7171c.mo2882c();
            m4657f();
            return;
        }
        this.f7178j = true;
    }

    /* renamed from: a */
    public final void mo4044a(float f, float f2) {
        this.f7171c.mo2873a(f, f2);
    }

    /* renamed from: a */
    public final void mo4045a(int i) {
        this.f7177i = i;
        this.f7176h = null;
        m4655a(aye.m2427a(getContext(), i));
    }

    /* renamed from: a */
    public final void mo4046a(int i, int i2) {
        this.f7171c.mo2875a(i, i2);
    }

    /* renamed from: a */
    public final void mo4047a(Animator.AnimatorListener animatorListener) {
        this.f7171c.f2551b.addListener(animatorListener);
    }

    /* renamed from: a */
    public final void mo4048a(axw axw) {
        this.f7171c.setCallback(this);
        this.f7172d = axw;
        boolean a = this.f7171c.mo2878a(axw);
        m4657f();
        if (getDrawable() != this.f7171c || a) {
            setImageDrawable(null);
            setImageDrawable(this.f7171c);
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            for (ays ays : this.f7181m) {
                ays.mo2907a();
            }
        }
    }

    /* renamed from: a */
    public final void mo4049a(String str) {
        this.f7176h = str;
        this.f7177i = 0;
        m4655a(aye.m2432b(getContext(), str));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo4050a(boolean z) {
        this.f7171c.mo2881b(!z ? 0 : -1);
    }
}
