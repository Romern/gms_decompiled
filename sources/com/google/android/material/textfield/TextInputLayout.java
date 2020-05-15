package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.support.p002v7.widget.AppCompatTextView;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TextInputLayout extends LinearLayout {

    /* renamed from: A */
    private CharSequence f151274A;

    /* renamed from: B */
    private TextView f151275B;

    /* renamed from: C */
    private ColorStateList f151276C;

    /* renamed from: D */
    private int f151277D;

    /* renamed from: E */
    private ColorStateList f151278E;

    /* renamed from: F */
    private ColorStateList f151279F;

    /* renamed from: G */
    private CharSequence f151280G;

    /* renamed from: H */
    private final TextView f151281H;

    /* renamed from: I */
    private final TextView f151282I;

    /* renamed from: J */
    private boolean f151283J;

    /* renamed from: K */
    private CharSequence f151284K;

    /* renamed from: L */
    private bhlr f151285L;

    /* renamed from: M */
    private bhlx f151286M;

    /* renamed from: N */
    private final int f151287N;

    /* renamed from: O */
    private final int f151288O;

    /* renamed from: P */
    private int f151289P;

    /* renamed from: Q */
    private final int f151290Q;

    /* renamed from: R */
    private final int f151291R;

    /* renamed from: S */
    private int f151292S;

    /* renamed from: T */
    private final Rect f151293T;

    /* renamed from: U */
    private final Rect f151294U;

    /* renamed from: V */
    private final RectF f151295V;

    /* renamed from: W */
    private final CheckableImageButton f151296W;

    /* renamed from: a */
    public EditText f151297a;

    /* renamed from: aA */
    private boolean f151298aA;

    /* renamed from: aB */
    private boolean f151299aB;

    /* renamed from: aC */
    private ValueAnimator f151300aC;

    /* renamed from: aD */
    private boolean f151301aD;

    /* renamed from: aa */
    private ColorStateList f151302aa;

    /* renamed from: ab */
    private boolean f151303ab;

    /* renamed from: ac */
    private PorterDuff.Mode f151304ac;

    /* renamed from: ad */
    private boolean f151305ad;

    /* renamed from: ae */
    private Drawable f151306ae;

    /* renamed from: af */
    private int f151307af;

    /* renamed from: ag */
    private final LinkedHashSet f151308ag;

    /* renamed from: ah */
    private int f151309ah;

    /* renamed from: ai */
    private final SparseArray f151310ai;

    /* renamed from: aj */
    private ColorStateList f151311aj;

    /* renamed from: ak */
    private boolean f151312ak;

    /* renamed from: al */
    private PorterDuff.Mode f151313al;

    /* renamed from: am */
    private boolean f151314am;

    /* renamed from: an */
    private Drawable f151315an;

    /* renamed from: ao */
    private int f151316ao;

    /* renamed from: ap */
    private Drawable f151317ap;

    /* renamed from: aq */
    private final CheckableImageButton f151318aq;

    /* renamed from: ar */
    private ColorStateList f151319ar;

    /* renamed from: as */
    private int f151320as;

    /* renamed from: at */
    private int f151321at;

    /* renamed from: au */
    private ColorStateList f151322au;

    /* renamed from: av */
    private int f151323av;

    /* renamed from: aw */
    private final int f151324aw;

    /* renamed from: ax */
    private final int f151325ax;

    /* renamed from: ay */
    private final int f151326ay;

    /* renamed from: az */
    private int f151327az;

    /* renamed from: b */
    public final bhox f151328b;

    /* renamed from: c */
    public boolean f151329c;

    /* renamed from: d */
    public int f151330d;

    /* renamed from: e */
    public boolean f151331e;

    /* renamed from: f */
    public TextView f151332f;

    /* renamed from: g */
    public boolean f151333g;

    /* renamed from: h */
    public CharSequence f151334h;

    /* renamed from: i */
    public boolean f151335i;

    /* renamed from: j */
    public bhlr f151336j;

    /* renamed from: k */
    public int f151337k;

    /* renamed from: l */
    public int f151338l;

    /* renamed from: m */
    public final CheckableImageButton f151339m;

    /* renamed from: n */
    public final LinkedHashSet f151340n;

    /* renamed from: o */
    public ColorStateList f151341o;

    /* renamed from: p */
    public ColorStateList f151342p;

    /* renamed from: q */
    public int f151343q;

    /* renamed from: r */
    public final bhje f151344r;

    /* renamed from: s */
    public boolean f151345s;

    /* renamed from: t */
    private final FrameLayout f151346t;

    /* renamed from: u */
    private final LinearLayout f151347u;

    /* renamed from: v */
    private final LinearLayout f151348v;

    /* renamed from: w */
    private final FrameLayout f151349w;

    /* renamed from: x */
    private CharSequence f151350x;

    /* renamed from: y */
    private int f151351y;

    /* renamed from: z */
    private int f151352z;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new bhpn();

        /* renamed from: c */
        CharSequence f151353c;

        /* renamed from: d */
        boolean f151354d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151353c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f151354d = parcel.readInt() != 1 ? false : true;
        }

        public final String toString() {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String valueOf = String.valueOf(this.f151353c);
            StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 35 + String.valueOf(valueOf).length());
            sb.append("TextInputLayout.SavedState{");
            sb.append(hexString);
            sb.append(" error=");
            sb.append(valueOf);
            sb.append("}");
            return sb.toString();
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f151353c, parcel, i);
            parcel.writeInt(this.f151354d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    /* renamed from: A */
    private final boolean m117634A() {
        return this.f151309ah != 0;
    }

    /* renamed from: B */
    private final void m117635B() {
        m117644a(this.f151339m, this.f151312ak, this.f151311aj, this.f151314am, this.f151313al);
    }

    /* renamed from: C */
    private final boolean m117636C() {
        boolean z;
        if (this.f151297a == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if ((this.f151296W.getDrawable() != null || this.f151280G != null) && this.f151347u.getMeasuredWidth() > 0) {
            int measuredWidth = this.f151347u.getMeasuredWidth() - this.f151297a.getPaddingLeft();
            if (this.f151306ae == null || this.f151307af != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f151306ae = colorDrawable;
                this.f151307af = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] b = C1334rs.m20108b(this.f151297a);
            Drawable drawable = b[0];
            Drawable drawable2 = this.f151306ae;
            if (drawable != drawable2) {
                C1334rs.m20105a(this.f151297a, drawable2, b[1], b[2], b[3]);
                z = true;
            } else {
                z = false;
            }
        } else if (this.f151306ae != null) {
            Drawable[] b2 = C1334rs.m20108b(this.f151297a);
            C1334rs.m20105a(this.f151297a, null, b2[1], b2[2], b2[3]);
            this.f151306ae = null;
            z = true;
        } else {
            z = false;
        }
        if ((this.f151318aq.getVisibility() == 0 || ((m117634A() && mo71288f()) || this.f151334h != null)) && this.f151348v.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.f151282I.getMeasuredWidth() - this.f151297a.getPaddingRight();
            if (this.f151318aq.getVisibility() == 0) {
                checkableImageButton = this.f151318aq;
            } else if (m117634A() && mo71288f()) {
                checkableImageButton = this.f151339m;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = measuredWidth2 + checkableImageButton.getMeasuredWidth() + C1260oz.m19820a((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams());
            }
            Drawable[] b3 = C1334rs.m20108b(this.f151297a);
            Drawable drawable3 = this.f151315an;
            if (drawable3 == null || this.f151316ao == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f151315an = colorDrawable2;
                    this.f151316ao = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = b3[2];
                Drawable drawable5 = this.f151315an;
                if (drawable4 != drawable5) {
                    this.f151317ap = drawable4;
                    C1334rs.m20105a(this.f151297a, b3[0], b3[1], drawable5, b3[3]);
                    return true;
                }
            } else {
                this.f151316ao = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C1334rs.m20105a(this.f151297a, b3[0], b3[1], this.f151315an, b3[3]);
                return true;
            }
        } else if (this.f151315an != null) {
            Drawable[] b4 = C1334rs.m20108b(this.f151297a);
            if (b4[2] == this.f151315an) {
                C1334rs.m20105a(this.f151297a, b4[0], b4[1], this.f151317ap, b4[3]);
            } else {
                z2 = z;
            }
            this.f151315an = null;
            return z2;
        }
        return z;
    }

    /* renamed from: D */
    private final boolean m117637D() {
        return this.f151283J && !TextUtils.isEmpty(this.f151284K) && (this.f151336j instanceof bhoj);
    }

    /* renamed from: E */
    private final void m117638E() {
        float f;
        float f2;
        if (m117637D()) {
            RectF rectF = this.f151295V;
            bhje bhje = this.f151344r;
            int width = this.f151297a.getWidth();
            int gravity = this.f151297a.getGravity();
            boolean a = bhje.mo63853a(bhje.f118810f);
            bhje.f118811g = a;
            if (gravity == 17 || (gravity & 7) == 1) {
                f = (((float) width) / 2.0f) - (bhje.mo63845a() / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                f = !a ? ((float) bhje.f118806b.right) - bhje.mo63845a() : (float) bhje.f118806b.left;
            } else {
                f = a ? ((float) bhje.f118806b.right) - bhje.mo63845a() : (float) bhje.f118806b.left;
            }
            rectF.left = f;
            rectF.top = (float) bhje.f118806b.top;
            if (gravity == 17 || (gravity & 7) == 1) {
                f2 = (((float) width) / 2.0f) + (bhje.mo63845a() / 2.0f);
            } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                f2 = !bhje.f118811g ? (float) bhje.f118806b.right : rectF.left + bhje.mo63845a();
            } else {
                f2 = bhje.f118811g ? (float) bhje.f118806b.right : rectF.left + bhje.mo63845a();
            }
            rectF.right = f2;
            rectF.bottom = ((float) bhje.f118806b.top) + bhje.mo63855b();
            rectF.left -= (float) this.f151287N;
            rectF.top -= (float) this.f151287N;
            rectF.right += (float) this.f151287N;
            rectF.bottom += (float) this.f151287N;
            rectF.offset((float) (-getPaddingLeft()), (float) (-getPaddingTop()));
            ((bhoj) this.f151336j).mo64085a(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* renamed from: a */
    private final int m117639a(int i, boolean z) {
        int compoundPaddingLeft = i + this.f151297a.getCompoundPaddingLeft();
        return (this.f151280G == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.f151281H.getMeasuredWidth()) + this.f151281H.getPaddingLeft();
    }

    /* renamed from: b */
    private final int m117646b(int i, boolean z) {
        int compoundPaddingRight = i - this.f151297a.getCompoundPaddingRight();
        return (this.f151280G == null || !z) ? compoundPaddingRight : compoundPaddingRight + this.f151281H.getMeasuredWidth() + this.f151281H.getPaddingRight();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: g */
    private final void m117649g(boolean z) {
        if (this.f151333g != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f151275B = appCompatTextView;
                appCompatTextView.setId(C0126R.C0129id.textinput_placeholder);
                C1280ps.m19919f((View) this.f151275B, 1);
                mo71269c(this.f151277D);
                mo71270c(this.f151276C);
                TextView textView = this.f151275B;
                if (textView != null) {
                    this.f151346t.addView(textView);
                    this.f151275B.setVisibility(0);
                }
            } else {
                TextView textView2 = this.f151275B;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.f151275B = null;
            }
            this.f151333g = z;
        }
    }

    /* renamed from: h */
    private final void m117650h(boolean z) {
        int i = 8;
        this.f151318aq.setVisibility(!z ? 8 : 0);
        FrameLayout frameLayout = this.f151349w;
        if (!z) {
            i = 0;
        }
        frameLayout.setVisibility(i);
        m117659s();
        if (!m117634A()) {
            m117636C();
        }
    }

    /* renamed from: k */
    private final void m117651k() {
        int i = this.f151337k;
        if (i == 0) {
            this.f151336j = null;
            this.f151285L = null;
        } else if (i == 1) {
            this.f151336j = new bhlr(this.f151286M);
            this.f151285L = new bhlr();
        } else if (i == 2) {
            if (this.f151283J && !(this.f151336j instanceof bhoj)) {
                this.f151336j = new bhoj(this.f151286M);
            } else {
                this.f151336j = new bhlr(this.f151286M);
            }
            this.f151285L = null;
        } else {
            StringBuilder sb = new StringBuilder(72);
            sb.append(i);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        EditText editText = this.f151297a;
        if (!(editText == null || this.f151336j == null || editText.getBackground() != null || this.f151337k == 0)) {
            C1280ps.m19890a(this.f151297a, this.f151336j);
        }
        mo71291h();
        if (this.f151337k != 0) {
            m117652l();
        }
    }

    /* renamed from: l */
    private final void m117652l() {
        if (this.f151337k != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f151346t.getLayoutParams();
            int u = m117661u();
            if (u != layoutParams.topMargin) {
                layoutParams.topMargin = u;
                this.f151346t.requestLayout();
            }
        }
    }

    /* renamed from: m */
    private final void m117653m() {
        if (this.f151332f != null) {
            EditText editText = this.f151297a;
            mo71251a(editText != null ? editText.getText().length() : 0);
        }
    }

    /* renamed from: n */
    private final void m117654n() {
        TextView textView = this.f151275B;
        if (textView != null && this.f151333g) {
            textView.setText(this.f151274A);
            this.f151275B.setVisibility(0);
            this.f151275B.bringToFront();
        }
    }

    /* renamed from: o */
    private final void m117655o() {
        TextView textView = this.f151275B;
        if (textView != null && this.f151333g) {
            textView.setText((CharSequence) null);
            this.f151275B.setVisibility(4);
        }
    }

    /* renamed from: p */
    private final void m117656p() {
        TextView textView = this.f151281H;
        int i = 8;
        if (this.f151280G != null && !this.f151298aA) {
            i = 0;
        }
        textView.setVisibility(i);
        m117636C();
    }

    /* renamed from: q */
    private final void m117657q() {
        int i;
        if (this.f151297a != null) {
            TextView textView = this.f151281H;
            if (!mo71286e()) {
                i = this.f151297a.getPaddingLeft();
            } else {
                i = 0;
            }
            textView.setPadding(i, this.f151297a.getCompoundPaddingTop(), this.f151281H.getCompoundPaddingRight(), this.f151297a.getCompoundPaddingBottom());
        }
    }

    /* renamed from: r */
    private final void m117658r() {
        boolean z;
        int visibility = this.f151282I.getVisibility();
        int i = 0;
        if (this.f151334h == null || this.f151298aA) {
            z = false;
        } else {
            z = true;
        }
        TextView textView = this.f151282I;
        if (!z) {
            i = 8;
        }
        textView.setVisibility(i);
        if (visibility != this.f151282I.getVisibility()) {
            m117665y().mo64083a(z);
        }
        m117636C();
    }

    /* renamed from: s */
    private final void m117659s() {
        if (this.f151297a != null) {
            TextView textView = this.f151282I;
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = this.f151297a.getPaddingTop();
            int i = 0;
            if (!mo71288f() && this.f151318aq.getVisibility() != 0) {
                i = this.f151297a.getPaddingRight();
            }
            textView.setPadding(paddingLeft, paddingTop, i, this.f151297a.getPaddingBottom());
        }
    }

    /* renamed from: t */
    private final void m117660t() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f151332f;
        if (textView != null) {
            if (!this.f151331e) {
                i = this.f151352z;
            } else {
                i = this.f151351y;
            }
            mo71256a(textView, i);
            if (!this.f151331e && (colorStateList2 = this.f151278E) != null) {
                this.f151332f.setTextColor(colorStateList2);
            }
            if (this.f151331e && (colorStateList = this.f151279F) != null) {
                this.f151332f.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: u */
    private final int m117661u() {
        if (!this.f151283J) {
            return 0;
        }
        int i = this.f151337k;
        if (i == 0 || i == 1) {
            return (int) this.f151344r.mo63855b();
        }
        if (i != 2) {
            return 0;
        }
        return (int) (this.f151344r.mo63855b() / 2.0f);
    }

    /* renamed from: v */
    private final boolean m117662v() {
        if (this.f151337k != 1) {
            return false;
        }
        int i = Build.VERSION.SDK_INT;
        return this.f151297a.getMinLines() <= 1;
    }

    /* renamed from: w */
    private final void m117663w() {
        bhlr bhlr = this.f151336j;
        if (bhlr != null) {
            bhlr.mo63916a(this.f151286M);
            if (this.f151337k == 2 && m117664x()) {
                this.f151336j.mo63940a((float) this.f151289P, this.f151292S);
            }
            int i = this.f151338l;
            if (this.f151337k == 1) {
                i = C1165lm.m19351a(this.f151338l, bhgk.m100860a(getContext(), (int) C0126R.attr.colorSurface));
            }
            this.f151338l = i;
            this.f151336j.mo63948c(ColorStateList.valueOf(i));
            if (this.f151309ah == 3) {
                this.f151297a.getBackground().invalidateSelf();
            }
            if (this.f151285L != null) {
                if (m117664x()) {
                    this.f151285L.mo63948c(ColorStateList.valueOf(this.f151292S));
                }
                invalidate();
            }
            invalidate();
        }
    }

    /* renamed from: x */
    private final boolean m117664x() {
        return this.f151289P >= 0 && this.f151292S != 0;
    }

    /* renamed from: y */
    private final bhov m117665y() {
        bhov bhov = (bhov) this.f151310ai.get(this.f151309ah);
        return bhov == null ? (bhov) this.f151310ai.get(0) : bhov;
    }

    /* renamed from: z */
    private final void m117666z() {
        m117644a(this.f151296W, this.f151303ab, this.f151302aa, this.f151305ad, this.f151304ac);
    }

    /* renamed from: a */
    public final CharSequence mo71248a() {
        if (this.f151283J) {
            return this.f151284K;
        }
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.textfield.TextInputLayout.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      com.google.android.material.textfield.TextInputLayout.a(int, boolean):int
      com.google.android.material.textfield.TextInputLayout.a(android.view.ViewGroup, boolean):void
      com.google.android.material.textfield.TextInputLayout.a(com.google.android.material.internal.CheckableImageButton, android.content.res.ColorStateList):void
      com.google.android.material.textfield.TextInputLayout.a(com.google.android.material.internal.CheckableImageButton, android.view.View$OnClickListener):void
      com.google.android.material.textfield.TextInputLayout.a(android.widget.TextView, int):void
      com.google.android.material.textfield.TextInputLayout.a(boolean, boolean):void */
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.f151346t.addView(view, layoutParams2);
            this.f151346t.setLayoutParams(layoutParams);
            m117652l();
            EditText editText = (EditText) view;
            if (this.f151297a == null) {
                if (this.f151309ah != 3 && !(editText instanceof TextInputEditText)) {
                    Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
                }
                this.f151297a = editText;
                m117651k();
                mo71257a(new bhpl(this));
                bhje bhje = this.f151344r;
                Typeface typeface = this.f151297a.getTypeface();
                boolean a = bhje.mo63852a(typeface);
                boolean b = bhje.mo63861b(typeface);
                if (a || b) {
                    bhje.mo63866e();
                }
                this.f151344r.mo63846a(this.f151297a.getTextSize());
                int gravity = this.f151297a.getGravity();
                this.f151344r.mo63857b((gravity & -113) | 48);
                this.f151344r.mo63847a(gravity);
                this.f151297a.addTextChangedListener(new bhph(this));
                if (this.f151341o == null) {
                    this.f151341o = this.f151297a.getHintTextColors();
                }
                if (this.f151283J) {
                    if (TextUtils.isEmpty(this.f151284K)) {
                        CharSequence hint = this.f151297a.getHint();
                        this.f151350x = hint;
                        mo71259a(hint);
                        this.f151297a.setHint((CharSequence) null);
                    }
                    this.f151335i = true;
                }
                if (this.f151332f != null) {
                    mo71251a(this.f151297a.getText().length());
                }
                mo71268c();
                this.f151328b.mo64115c();
                this.f151347u.bringToFront();
                this.f151348v.bringToFront();
                this.f151349w.bringToFront();
                this.f151318aq.bringToFront();
                Iterator it = this.f151308ag.iterator();
                while (it.hasNext()) {
                    ((bhpm) it.next()).mo64076a(this);
                }
                m117657q();
                m117659s();
                if (!isEnabled()) {
                    editText.setEnabled(false);
                }
                m117645a(false, true);
                return;
            }
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        super.addView(view, i, layoutParams);
    }

    /* renamed from: b */
    public final boolean mo71267b() {
        return this.f151328b.f119240m;
    }

    /* renamed from: c */
    public final void mo71268c() {
        Drawable background;
        TextView textView;
        EditText editText = this.f151297a;
        if (editText != null && this.f151337k == 0 && (background = editText.getBackground()) != null) {
            if (C1540zi.m20971b(background)) {
                background = background.mutate();
            }
            if (this.f151328b.mo64116d()) {
                background.setColorFilter(C1497xt.m20821a(this.f151328b.mo64117e(), PorterDuff.Mode.SRC_IN));
            } else if (this.f151331e && (textView = this.f151332f) != null) {
                background.setColorFilter(C1497xt.m20821a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            } else {
                C1173lt.m19611e(background);
                this.f151297a.refreshDrawableState();
            }
        }
    }

    /* renamed from: d */
    public final CharSequence mo71274d() {
        bhox bhox = this.f151328b;
        if (bhox.f119234g) {
            return bhox.f119233f;
        }
        return null;
    }

    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.f151350x == null || (editText = this.f151297a) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.f151335i;
        this.f151335i = false;
        CharSequence hint = editText.getHint();
        this.f151297a.setHint(this.f151350x);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f151297a.setHint(hint);
            this.f151335i = z;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f151345s = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f151345s = false;
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f151283J) {
            this.f151344r.mo63851a(canvas);
        }
        bhlr bhlr = this.f151285L;
        if (bhlr != null) {
            Rect bounds = bhlr.getBounds();
            bounds.top = bounds.bottom - this.f151289P;
            this.f151285L.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        boolean z;
        if (!this.f151301aD) {
            boolean z2 = true;
            this.f151301aD = true;
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            bhje bhje = this.f151344r;
            if (bhje != null) {
                z = bhje.mo63854a(drawableState);
            } else {
                z = false;
            }
            if (this.f151297a != null) {
                if (!C1280ps.m19868C(this) || !isEnabled()) {
                    z2 = false;
                }
                mo71260a(z2);
            }
            mo71268c();
            mo71291h();
            if (z) {
                invalidate();
            }
            this.f151301aD = false;
        }
    }

    /* renamed from: e */
    public final void mo71283e(ColorStateList colorStateList) {
        if (this.f151311aj != colorStateList) {
            this.f151311aj = colorStateList;
            this.f151312ak = true;
            m117635B();
        }
    }

    /* renamed from: f */
    public final void mo71287f(boolean z) {
        this.f151339m.mo71194a(z);
    }

    public final int getBaseline() {
        EditText editText = this.f151297a;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m117661u();
        }
        return super.getBaseline();
    }

    /* renamed from: i */
    public final void mo71292i() {
        m117643a(this.f151296W, (View.OnClickListener) null);
    }

    /* renamed from: j */
    public final void mo71293j() {
        m117641a(this.f151296W);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int i5;
        int i6;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f151297a;
        if (editText != null) {
            Rect rect = this.f151293T;
            bhjf.m101008a(this, editText, rect);
            if (this.f151285L != null) {
                this.f151285L.setBounds(rect.left, rect.bottom - this.f151291R, rect.right, rect.bottom);
            }
            if (this.f151283J) {
                this.f151344r.mo63846a(this.f151297a.getTextSize());
                int gravity = this.f151297a.getGravity();
                this.f151344r.mo63857b((gravity & -113) | 48);
                this.f151344r.mo63847a(gravity);
                bhje bhje = this.f151344r;
                if (this.f151297a != null) {
                    Rect rect2 = this.f151294U;
                    if (C1280ps.m19923h(this) == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rect2.bottom = rect.bottom;
                    int i7 = this.f151337k;
                    if (i7 == 1) {
                        rect2.left = m117639a(rect.left, z2);
                        rect2.top = rect.top + this.f151288O;
                        rect2.right = m117646b(rect.right, z2);
                    } else if (i7 != 2) {
                        rect2.left = m117639a(rect.left, z2);
                        rect2.top = getPaddingTop();
                        rect2.right = m117646b(rect.right, z2);
                    } else {
                        rect2.left = rect.left + this.f151297a.getPaddingLeft();
                        rect2.top = rect.top - m117661u();
                        rect2.right = rect.right - this.f151297a.getPaddingRight();
                    }
                    bhje.mo63858b(rect2.left, rect2.top, rect2.right, rect2.bottom);
                    bhje bhje2 = this.f151344r;
                    if (this.f151297a != null) {
                        Rect rect3 = this.f151294U;
                        TextPaint textPaint = bhje2.f118812h;
                        textPaint.setTextSize(bhje2.f118807c);
                        textPaint.setTypeface(bhje2.f118809e);
                        float f = -bhje2.f118812h.ascent();
                        rect3.left = rect.left + this.f151297a.getCompoundPaddingLeft();
                        if (m117662v()) {
                            i5 = (int) (((float) rect.centerY()) - (f / 2.0f));
                        } else {
                            i5 = rect.top + this.f151297a.getCompoundPaddingTop();
                        }
                        rect3.top = i5;
                        rect3.right = rect.right - this.f151297a.getCompoundPaddingRight();
                        if (m117662v()) {
                            i6 = (int) (((float) rect3.top) + f);
                        } else {
                            i6 = rect.bottom - this.f151297a.getCompoundPaddingBottom();
                        }
                        rect3.bottom = i6;
                        bhje2.mo63848a(rect3.left, rect3.top, rect3.right, rect3.bottom);
                        this.f151344r.mo63866e();
                        if (m117637D() && !this.f151298aA) {
                            m117638E();
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException();
                }
                throw new IllegalStateException();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f151297a != null && this.f151297a.getMeasuredHeight() < (max = Math.max(this.f151348v.getMeasuredHeight(), this.f151347u.getMeasuredHeight()))) {
            this.f151297a.setMinimumHeight(max);
            z = true;
        }
        boolean C = m117636C();
        if (z || C) {
            this.f151297a.post(new bhpj(this));
        }
        if (this.f151275B != null && (editText = this.f151297a) != null) {
            this.f151275B.setGravity(editText.getGravity());
            this.f151275B.setPadding(this.f151297a.getCompoundPaddingLeft(), this.f151297a.getCompoundPaddingTop(), this.f151297a.getCompoundPaddingRight(), this.f151297a.getCompoundPaddingBottom());
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        mo71272c(savedState.f151353c);
        if (savedState.f151354d) {
            this.f151339m.post(new bhpi(this));
        }
        requestLayout();
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.f151328b.mo64116d()) {
            savedState.f151353c = mo71274d();
        }
        boolean z = false;
        if (m117634A() && this.f151339m.f151200a) {
            z = true;
        }
        savedState.f151354d = z;
        return savedState;
    }

    public final void setEnabled(boolean z) {
        m117640a(this, z);
        super.setEnabled(z);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.textInputStyle);
    }

    /* renamed from: d */
    public final void mo71275d(int i) {
        boolean z;
        int i2 = this.f151309ah;
        this.f151309ah = i;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        mo71285e(z);
        if (m117665y().mo64098a(this.f151337k)) {
            m117665y().mo64082a();
            m117635B();
            Iterator it = this.f151340n.iterator();
            while (it.hasNext()) {
                bhpd bhpd = (bhpd) it.next();
                EditText editText = this.f151297a;
                if (editText != null && i2 == 1) {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
            }
            return;
        }
        int i3 = this.f151337k;
        StringBuilder sb = new StringBuilder(93);
        sb.append("The current box background mode ");
        sb.append(i3);
        sb.append(" is not supported by the end icon mode ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final void mo71284e(CharSequence charSequence) {
        if (this.f151339m.getContentDescription() != charSequence) {
            this.f151339m.setContentDescription(charSequence);
        }
    }

    /* renamed from: f */
    public final boolean mo71288f() {
        return this.f151349w.getVisibility() == 0 && this.f151339m.getVisibility() == 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f5  */
    /* renamed from: h */
    public final void mo71291h() {
        boolean z;
        boolean z2;
        int i;
        TextView textView;
        if (this.f151336j != null && this.f151337k != 0) {
            boolean z3 = false;
            if (!isFocused()) {
                EditText editText = this.f151297a;
                if (editText == null) {
                    z = false;
                } else if (!editText.hasFocus()) {
                    z = false;
                }
                if (!isHovered()) {
                    EditText editText2 = this.f151297a;
                    if (editText2 == null) {
                        z2 = false;
                    } else if (!editText2.isHovered()) {
                        z2 = false;
                    }
                    if (isEnabled()) {
                        if (this.f151328b.mo64116d()) {
                            if (this.f151322au == null) {
                                this.f151292S = this.f151328b.mo64117e();
                            } else {
                                m117648b(z, z2);
                            }
                        } else if (!this.f151331e || (textView = this.f151332f) == null) {
                            i = z ? this.f151343q : !z2 ? this.f151320as : this.f151321at;
                        } else if (this.f151322au == null) {
                            this.f151292S = textView.getCurrentTextColor();
                        } else {
                            m117648b(z, z2);
                        }
                        if (this.f151318aq.getDrawable() != null) {
                            bhox bhox = this.f151328b;
                            if (bhox.f119234g && bhox.mo64116d()) {
                                z3 = true;
                            }
                        }
                        m117650h(z3);
                        m117642a(this.f151318aq, this.f151319ar);
                        m117642a(this.f151296W, this.f151302aa);
                        m117642a(this.f151339m, this.f151311aj);
                        if (m117665y().mo64100b()) {
                            if (!this.f151328b.mo64116d() || mo71289g() == null) {
                                m117635B();
                            } else {
                                Drawable g = mo71289g();
                                int i2 = Build.VERSION.SDK_INT;
                                Drawable mutate = g.mutate();
                                C1173lt.m19599a(mutate, this.f151328b.mo64117e());
                                this.f151339m.setImageDrawable(mutate);
                            }
                        }
                        if (z && isEnabled()) {
                            this.f151289P = this.f151291R;
                        } else {
                            this.f151289P = this.f151290Q;
                        }
                        if (this.f151337k == 1) {
                            if (!isEnabled()) {
                                this.f151338l = this.f151324aw;
                            } else {
                                this.f151338l = (!z2 || z) ? !z ? this.f151323av : this.f151325ax : this.f151326ay;
                            }
                        }
                        m117663w();
                    }
                    i = this.f151327az;
                    this.f151292S = i;
                    if (this.f151318aq.getDrawable() != null) {
                    }
                    m117650h(z3);
                    m117642a(this.f151318aq, this.f151319ar);
                    m117642a(this.f151296W, this.f151302aa);
                    m117642a(this.f151339m, this.f151311aj);
                    if (m117665y().mo64100b()) {
                    }
                    if (z) {
                        this.f151289P = this.f151291R;
                        if (this.f151337k == 1) {
                        }
                        m117663w();
                    }
                    this.f151289P = this.f151290Q;
                    if (this.f151337k == 1) {
                    }
                    m117663w();
                }
                z2 = true;
                if (isEnabled()) {
                }
                this.f151292S = i;
                if (this.f151318aq.getDrawable() != null) {
                }
                m117650h(z3);
                m117642a(this.f151318aq, this.f151319ar);
                m117642a(this.f151296W, this.f151302aa);
                m117642a(this.f151339m, this.f151311aj);
                if (m117665y().mo64100b()) {
                }
                if (z) {
                }
                this.f151289P = this.f151290Q;
                if (this.f151337k == 1) {
                }
                m117663w();
            }
            z = true;
            if (!isHovered()) {
            }
            z2 = true;
            if (isEnabled()) {
            }
            this.f151292S = i;
            if (this.f151318aq.getDrawable() != null) {
            }
            m117650h(z3);
            m117642a(this.f151318aq, this.f151319ar);
            m117642a(this.f151296W, this.f151302aa);
            m117642a(this.f151339m, this.f151311aj);
            if (m117665y().mo64100b()) {
            }
            if (z) {
            }
            this.f151289P = this.f151290Q;
            if (this.f151337k == 1) {
            }
            m117663w();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adr.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      adr.a(int, int):int
      adr.a(int, boolean):boolean */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.material.internal.CheckableImageButton, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.FrameLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.material.textfield.TextInputLayout, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(bhpq.m101285a(context, attributeSet, i, 2132019315), attributeSet, i);
        ColorStateList e;
        ColorStateList e2;
        PorterDuff.Mode a;
        ColorStateList a2;
        this.f151328b = new bhox(this);
        this.f151293T = new Rect();
        this.f151294U = new Rect();
        this.f151295V = new RectF();
        this.f151308ag = new LinkedHashSet();
        this.f151309ah = 0;
        this.f151310ai = new SparseArray();
        this.f151340n = new LinkedHashSet();
        this.f151344r = new bhje(this);
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f151346t = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        addView(this.f151346t);
        LinearLayout linearLayout = new LinearLayout(context2);
        this.f151347u = linearLayout;
        linearLayout.setOrientation(0);
        this.f151347u.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        this.f151346t.addView(this.f151347u);
        LinearLayout linearLayout2 = new LinearLayout(context2);
        this.f151348v = linearLayout2;
        linearLayout2.setOrientation(0);
        this.f151348v.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        this.f151346t.addView(this.f151348v);
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.f151349w = frameLayout2;
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        this.f151344r.mo63849a(bhdl.f118327a);
        bhje bhje = this.f151344r;
        bhje.f118813i = bhdl.f118327a;
        bhje.mo63866e();
        this.f151344r.mo63857b(8388659);
        adr b = bhki.m101056b(context2, attributeSet, bhpg.f119261c, i, 2132019315, 18, 16, 31, 35, 39);
        this.f151283J = b.mo451a(38, true);
        mo71259a(b.mo455c(2));
        this.f151299aB = b.mo451a(37, true);
        this.f151286M = bhlx.m101158a(context2, attributeSet, i, 2132019315).mo63972a();
        this.f151287N = context2.getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f151288O = b.mo454c(5, 0);
        this.f151290Q = b.mo456d(12, context2.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f151291R = b.mo456d(13, context2.getResources().getDimensionPixelSize(C0126R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f151289P = this.f151290Q;
        float g = b.mo462g(9);
        float g2 = b.mo462g(8);
        float g3 = b.mo462g(6);
        float g4 = b.mo462g(7);
        bhlw b2 = this.f151286M.mo63980b();
        if (g >= 0.0f) {
            b2.mo63975c(g);
        }
        if (g2 >= 0.0f) {
            b2.mo63976d(g2);
        }
        if (g3 >= 0.0f) {
            b2.mo63974b(g3);
        }
        if (g4 >= 0.0f) {
            b2.mo63973a(g4);
        }
        this.f151286M = b2.mo63972a();
        ColorStateList a3 = bhky.m101076a(context2, b, 3);
        if (a3 != null) {
            int defaultColor = a3.getDefaultColor();
            this.f151323av = defaultColor;
            this.f151338l = defaultColor;
            if (a3.isStateful()) {
                this.f151324aw = a3.getColorForState(new int[]{-16842910}, -1);
                this.f151325ax = a3.getColorForState(new int[]{16842908, 16842910}, -1);
                this.f151326ay = a3.getColorForState(new int[]{16843623, 16842910}, -1);
            } else {
                this.f151325ax = this.f151323av;
                ColorStateList a4 = C1391tv.m20458a(context2, C0126R.color.mtrl_filled_background_color);
                this.f151324aw = a4.getColorForState(new int[]{-16842910}, -1);
                this.f151326ay = a4.getColorForState(new int[]{16843623}, -1);
            }
        } else {
            this.f151338l = 0;
            this.f151323av = 0;
            this.f151324aw = 0;
            this.f151325ax = 0;
            this.f151326ay = 0;
        }
        if (b.mo461f(1)) {
            ColorStateList e3 = b.mo459e(1);
            this.f151342p = e3;
            this.f151341o = e3;
        }
        ColorStateList a5 = bhky.m101076a(context2, b, 10);
        this.f151343q = b.mo463h(10);
        this.f151320as = C1133kh.m17843b(context2, C0126R.color.mtrl_textinput_default_box_stroke_color);
        this.f151327az = C1133kh.m17843b(context2, C0126R.color.mtrl_textinput_disabled_color);
        this.f151321at = C1133kh.m17843b(context2, C0126R.color.mtrl_textinput_hovered_box_stroke_color);
        if (a5 != null) {
            if (a5.isStateful()) {
                this.f151320as = a5.getDefaultColor();
                this.f151327az = a5.getColorForState(new int[]{-16842910}, -1);
                this.f151321at = a5.getColorForState(new int[]{16843623, 16842910}, -1);
                this.f151343q = a5.getColorForState(new int[]{16842908, 16842910}, -1);
            } else if (this.f151343q != a5.getDefaultColor()) {
                this.f151343q = a5.getDefaultColor();
            }
            mo71291h();
        }
        if (b.mo461f(11) && this.f151322au != (a2 = bhky.m101076a(context2, b, 11))) {
            this.f151322au = a2;
            mo71291h();
        }
        if (b.mo460f(39, -1) != -1) {
            this.f151344r.mo63863c(b.mo460f(39, 0));
            this.f151342p = this.f151344r.f118808d;
            if (this.f151297a != null) {
                mo71260a(false);
                m117652l();
            }
        }
        int f = b.mo460f(31, 0);
        CharSequence c = b.mo455c(26);
        boolean a6 = b.mo451a(27, false);
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.design_text_input_end_icon, (ViewGroup) this.f151348v, false);
        this.f151318aq = checkableImageButton;
        checkableImageButton.setVisibility(8);
        if (b.mo461f(28)) {
            mo71254a(b.mo449a(28));
        }
        if (b.mo461f(29)) {
            ColorStateList a7 = bhky.m101076a(context2, b, 29);
            this.f151319ar = a7;
            Drawable drawable = this.f151318aq.getDrawable();
            if (drawable != null) {
                int i2 = Build.VERSION.SDK_INT;
                drawable = drawable.mutate();
                C1173lt.m19601a(drawable, a7);
            }
            if (this.f151318aq.getDrawable() != drawable) {
                this.f151318aq.setImageDrawable(drawable);
            }
        }
        if (b.mo461f(30)) {
            PorterDuff.Mode a8 = bhkn.m101062a(b.mo448a(30, -1), (PorterDuff.Mode) null);
            Drawable drawable2 = this.f151318aq.getDrawable();
            if (drawable2 != null) {
                int i3 = Build.VERSION.SDK_INT;
                drawable2 = drawable2.mutate();
                C1173lt.m19604a(drawable2, a8);
            }
            if (this.f151318aq.getDrawable() != drawable2) {
                this.f151318aq.setImageDrawable(drawable2);
            }
        }
        this.f151318aq.setContentDescription(getResources().getText(C0126R.string.error_icon_content_description));
        C1280ps.m19906b((View) this.f151318aq, 2);
        this.f151318aq.setClickable(false);
        CheckableImageButton checkableImageButton2 = this.f151318aq;
        checkableImageButton2.f151202c = false;
        checkableImageButton2.setFocusable(false);
        int f2 = b.mo460f(35, 0);
        boolean a9 = b.mo451a(34, false);
        CharSequence c2 = b.mo455c(33);
        int f3 = b.mo460f(47, 0);
        CharSequence c3 = b.mo455c(46);
        int f4 = b.mo460f(50, 0);
        CharSequence c4 = b.mo455c(49);
        int f5 = b.mo460f(60, 0);
        CharSequence c5 = b.mo455c(59);
        int i4 = f5;
        boolean a10 = b.mo451a(14, false);
        int a11 = b.mo448a(15, -1);
        if (this.f151330d != a11) {
            if (a11 > 0) {
                this.f151330d = a11;
            } else {
                this.f151330d = -1;
            }
            if (this.f151329c) {
                m117653m();
            }
        }
        this.f151352z = b.mo460f(18, 0);
        this.f151351y = b.mo460f(16, 0);
        CharSequence charSequence = c5;
        int i5 = f4;
        CheckableImageButton checkableImageButton3 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.design_text_input_start_icon, (ViewGroup) this.f151347u, false);
        this.f151296W = checkableImageButton3;
        checkableImageButton3.setVisibility(8);
        mo71292i();
        mo71293j();
        if (b.mo461f(56)) {
            mo71264b(b.mo449a(56));
            if (b.mo461f(55)) {
                mo71277d(b.mo455c(55));
            }
            this.f151296W.mo71194a(b.mo451a(54, true));
        }
        if (b.mo461f(57)) {
            mo71276d(bhky.m101076a(context2, b, 57));
        }
        if (b.mo461f(58) && this.f151304ac != (a = bhkn.m101062a(b.mo448a(58, -1), (PorterDuff.Mode) null))) {
            this.f151304ac = a;
            this.f151305ad = true;
            m117666z();
        }
        int a12 = b.mo448a(4, 0);
        if (a12 != this.f151337k) {
            this.f151337k = a12;
            if (this.f151297a != null) {
                m117651k();
            }
        }
        CheckableImageButton checkableImageButton4 = (CheckableImageButton) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.design_text_input_end_icon, (ViewGroup) this.f151349w, false);
        this.f151339m = checkableImageButton4;
        this.f151349w.addView(checkableImageButton4);
        this.f151339m.setVisibility(8);
        this.f151310ai.append(-1, new bhoi(this));
        this.f151310ai.append(0, new bhpa(this));
        this.f151310ai.append(1, new bhpf(this));
        this.f151310ai.append(2, new bhoh(this));
        this.f151310ai.append(3, new bhou(this));
        if (b.mo461f(23)) {
            mo71275d(b.mo448a(23, 0));
            if (b.mo461f(22)) {
                mo71271c(b.mo449a(22));
            }
            if (b.mo461f(21)) {
                mo71284e(b.mo455c(21));
            }
            mo71287f(b.mo451a(20, true));
        } else if (b.mo461f(43)) {
            mo71275d(b.mo451a(43, false) ? 1 : 0);
            mo71271c(b.mo449a(42));
            mo71284e(b.mo455c(41));
            if (b.mo461f(44)) {
                mo71283e(bhky.m101076a(context2, b, 44));
            }
            if (b.mo461f(45)) {
                mo71253a(bhkn.m101062a(b.mo448a(45, -1), (PorterDuff.Mode) null));
            }
        }
        if (!b.mo461f(43)) {
            if (b.mo461f(24)) {
                mo71283e(bhky.m101076a(context2, b, 24));
            }
            if (b.mo461f(25)) {
                mo71253a(bhkn.m101062a(b.mo448a(25, -1), (PorterDuff.Mode) null));
            }
        }
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.f151281H = appCompatTextView;
        appCompatTextView.setId(C0126R.C0129id.textinput_prefix_text);
        this.f151281H.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        C1280ps.m19919f((View) this.f151281H, 1);
        this.f151347u.addView(this.f151296W);
        this.f151347u.addView(this.f151281H);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context2);
        this.f151282I = appCompatTextView2;
        appCompatTextView2.setId(C0126R.C0129id.textinput_suffix_text);
        this.f151282I.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        C1280ps.m19919f((View) this.f151282I, 1);
        this.f151348v.addView(this.f151282I);
        this.f151348v.addView(this.f151318aq);
        this.f151348v.addView(this.f151349w);
        mo71273c(a9);
        mo71265b(c2);
        this.f151328b.mo64112b(f2);
        mo71266b(a6);
        this.f151328b.mo64105a(f);
        this.f151328b.mo64109a(c);
        if (!this.f151333g || !TextUtils.isEmpty(c3)) {
            if (!this.f151333g) {
                m117649g(true);
            }
            this.f151274A = c3;
        } else {
            m117649g(false);
        }
        EditText editText = this.f151297a;
        mo71262b(editText != null ? editText.getText().length() : 0);
        mo71269c(f3);
        this.f151280G = !TextUtils.isEmpty(c4) ? c4 : null;
        this.f151281H.setText(c4);
        m117656p();
        C1334rs.m20104a(this.f151281H, i5);
        this.f151334h = !TextUtils.isEmpty(charSequence) ? charSequence : null;
        this.f151282I.setText(charSequence);
        m117658r();
        C1334rs.m20104a(this.f151282I, i4);
        if (b.mo461f(32)) {
            mo71263b(b.mo459e(32));
        }
        if (b.mo461f(36)) {
            this.f151328b.mo64113b(b.mo459e(36));
        }
        if (b.mo461f(40)) {
            mo71252a(b.mo459e(40));
        }
        if (b.mo461f(19) && this.f151278E != (e2 = b.mo459e(19))) {
            this.f151278E = e2;
            m117660t();
        }
        if (b.mo461f(17) && this.f151279F != (e = b.mo459e(17))) {
            this.f151279F = e;
            m117660t();
        }
        if (b.mo461f(48)) {
            mo71270c(b.mo459e(48));
        }
        if (b.mo461f(51)) {
            this.f151281H.setTextColor(b.mo459e(51));
        }
        if (b.mo461f(61)) {
            this.f151282I.setTextColor(b.mo459e(61));
        }
        boolean z = a10;
        if (this.f151329c != z) {
            if (z) {
                AppCompatTextView appCompatTextView3 = new AppCompatTextView(getContext());
                this.f151332f = appCompatTextView3;
                appCompatTextView3.setId(C0126R.C0129id.textinput_counter);
                this.f151332f.setMaxLines(1);
                this.f151328b.mo64108a(this.f151332f, 2);
                C1260oz.m19821a((ViewGroup.MarginLayoutParams) this.f151332f.getLayoutParams(), getResources().getDimensionPixelOffset(C0126R.dimen.mtrl_textinput_counter_margin_start));
                m117660t();
                m117653m();
            } else {
                this.f151328b.mo64114b(this.f151332f, 2);
                this.f151332f = null;
            }
            this.f151329c = z;
        }
        setEnabled(b.mo451a(0, true));
        b.mo450a();
        C1280ps.m19906b((View) this, 2);
    }

    /* renamed from: a */
    private static void m117640a(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m117640a((ViewGroup) childAt, z);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [com.google.android.material.internal.CheckableImageButton, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    /* renamed from: b */
    private static void m117647b(CheckableImageButton checkableImageButton) {
        boolean G = C1280ps.m19872G(checkableImageButton);
        checkableImageButton.setFocusable(G);
        checkableImageButton.setClickable(G);
        checkableImageButton.f151202c = G;
        checkableImageButton.setLongClickable(false);
        C1280ps.m19906b((View) checkableImageButton, !G ? 2 : 1);
    }

    /* renamed from: a */
    public static void m117641a(CheckableImageButton checkableImageButton) {
        checkableImageButton.setOnLongClickListener(null);
        m117647b(checkableImageButton);
    }

    /* renamed from: a */
    private final void m117642a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            int i = Build.VERSION.SDK_INT;
            Drawable mutate = drawable.mutate();
            C1173lt.m19601a(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    /* renamed from: e */
    public final void mo71285e(boolean z) {
        if (mo71288f() != z) {
            this.f151339m.setVisibility(!z ? 8 : 0);
            m117659s();
            m117636C();
        }
    }

    /* renamed from: b */
    private final void m117648b(boolean z, boolean z2) {
        int defaultColor = this.f151322au.getDefaultColor();
        int colorForState = this.f151322au.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f151322au.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f151292S = colorForState2;
        } else if (!z2) {
            this.f151292S = defaultColor;
        } else {
            this.f151292S = colorForState;
        }
    }

    /* renamed from: e */
    public final boolean mo71286e() {
        return this.f151296W.getVisibility() == 0;
    }

    /* renamed from: g */
    public final Drawable mo71289g() {
        return this.f151339m.getDrawable();
    }

    /* renamed from: d */
    public final void mo71276d(ColorStateList colorStateList) {
        if (this.f151302aa != colorStateList) {
            this.f151302aa = colorStateList;
            this.f151303ab = true;
            m117666z();
        }
    }

    /* renamed from: b */
    public final void mo71262b(int i) {
        if (i != 0 || this.f151298aA) {
            m117655o();
        } else {
            m117654n();
        }
    }

    /* renamed from: d */
    public final void mo71277d(CharSequence charSequence) {
        if (this.f151296W.getContentDescription() != charSequence) {
            this.f151296W.setContentDescription(charSequence);
        }
    }

    /* renamed from: a */
    private static void m117643a(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m117647b(checkableImageButton);
    }

    /* renamed from: a */
    private static final void m117644a(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            int i = Build.VERSION.SDK_INT;
            drawable = drawable.mutate();
            if (z) {
                C1173lt.m19601a(drawable, colorStateList);
            }
            if (z2) {
                C1173lt.m19604a(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: b */
    public final void mo71263b(ColorStateList colorStateList) {
        this.f151328b.mo64107a(colorStateList);
    }

    /* renamed from: b */
    public final void mo71264b(Drawable drawable) {
        this.f151296W.setImageDrawable(drawable);
        if (drawable != null) {
            mo71278d(true);
            m117666z();
            return;
        }
        mo71278d(false);
        mo71292i();
        mo71293j();
        mo71277d((CharSequence) null);
    }

    /* renamed from: c */
    public final void mo71269c(int i) {
        this.f151277D = i;
        TextView textView = this.f151275B;
        if (textView != null) {
            C1334rs.m20104a(textView, i);
        }
    }

    /* renamed from: d */
    public final void mo71278d(boolean z) {
        if (mo71286e() != z) {
            this.f151296W.setVisibility(!z ? 8 : 0);
            m117657q();
            m117636C();
        }
    }

    /* renamed from: c */
    public final void mo71270c(ColorStateList colorStateList) {
        if (this.f151276C != colorStateList) {
            this.f151276C = colorStateList;
            TextView textView = this.f151275B;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: c */
    public final void mo71271c(Drawable drawable) {
        this.f151339m.setImageDrawable(drawable);
    }

    /* renamed from: b */
    public final void mo71265b(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!mo71267b()) {
                mo71273c(true);
            }
            bhox bhox = this.f151328b;
            bhox.mo64111b();
            bhox.f119239l = charSequence;
            bhox.f119241n.setText(charSequence);
            int i = bhox.f119231d;
            if (i != 2) {
                bhox.f119232e = 2;
            }
            bhox.mo64106a(i, bhox.f119232e, bhox.mo64110a(bhox.f119241n, charSequence));
        } else if (mo71267b()) {
            mo71273c(false);
        }
    }

    /* renamed from: c */
    public final void mo71272c(CharSequence charSequence) {
        if (!this.f151328b.f119234g) {
            if (!TextUtils.isEmpty(charSequence)) {
                mo71266b(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            bhox bhox = this.f151328b;
            bhox.mo64111b();
            bhox.f119233f = charSequence;
            bhox.f119235h.setText(charSequence);
            int i = bhox.f119231d;
            if (i != 1) {
                bhox.f119232e = 1;
            }
            bhox.mo64106a(i, bhox.f119232e, bhox.mo64110a(bhox.f119235h, charSequence));
            return;
        }
        this.f151328b.mo64104a();
    }

    /* renamed from: a */
    private final void m117645a(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        ColorStateList colorStateList2;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f151297a;
        if (editText == null || TextUtils.isEmpty(editText.getText())) {
            z3 = false;
        } else {
            z3 = true;
        }
        EditText editText2 = this.f151297a;
        if (editText2 == null || !editText2.hasFocus()) {
            z4 = false;
        } else {
            z4 = true;
        }
        boolean d = this.f151328b.mo64116d();
        ColorStateList colorStateList3 = this.f151341o;
        if (colorStateList3 != null) {
            this.f151344r.mo63850a(colorStateList3);
            this.f151344r.mo63859b(this.f151341o);
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.f151341o;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.f151327az);
            } else {
                i = this.f151327az;
            }
            this.f151344r.mo63850a(ColorStateList.valueOf(i));
            this.f151344r.mo63859b(ColorStateList.valueOf(i));
        } else if (d) {
            bhje bhje = this.f151344r;
            TextView textView2 = this.f151328b.f119235h;
            if (textView2 != null) {
                colorStateList2 = textView2.getTextColors();
            } else {
                colorStateList2 = null;
            }
            bhje.mo63850a(colorStateList2);
        } else if (this.f151331e && (textView = this.f151332f) != null) {
            this.f151344r.mo63850a(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f151342p) != null) {
            this.f151344r.mo63850a(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || d))) {
            if (z2 || this.f151298aA) {
                ValueAnimator valueAnimator = this.f151300aC;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f151300aC.cancel();
                }
                if (z && this.f151299aB) {
                    mo71249a(1.0f);
                } else {
                    this.f151344r.mo63856b(1.0f);
                }
                this.f151298aA = false;
                if (m117637D()) {
                    m117638E();
                }
                m117654n();
                m117656p();
                m117658r();
            }
        } else if (z2 || !this.f151298aA) {
            ValueAnimator valueAnimator2 = this.f151300aC;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f151300aC.cancel();
            }
            if (z && this.f151299aB) {
                mo71249a(0.0f);
            } else {
                this.f151344r.mo63856b(0.0f);
            }
            if (m117637D() && !((bhoj) this.f151336j).f119193a.isEmpty() && m117637D()) {
                ((bhoj) this.f151336j).mo64085a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f151298aA = true;
            m117655o();
            m117656p();
            m117658r();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: b */
    public final void mo71266b(boolean z) {
        bhox bhox = this.f151328b;
        if (bhox.f119234g != z) {
            bhox.mo64111b();
            if (z) {
                bhox.f119235h = new AppCompatTextView(bhox.f119228a);
                bhox.f119235h.setId(C0126R.C0129id.textinput_error);
                int i = Build.VERSION.SDK_INT;
                bhox.f119235h.setTextAlignment(5);
                bhox.mo64105a(bhox.f119237j);
                bhox.mo64107a(bhox.f119238k);
                bhox.mo64109a(bhox.f119236i);
                bhox.f119235h.setVisibility(4);
                C1280ps.m19919f((View) bhox.f119235h, 1);
                bhox.mo64108a(bhox.f119235h, 0);
            } else {
                bhox.mo64104a();
                bhox.mo64114b(bhox.f119235h, 0);
                bhox.f119235h = null;
                bhox.f119229b.mo71268c();
                bhox.f119229b.mo71291h();
            }
            bhox.f119234g = z;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.f(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.f(android.view.View, float):void
      ps.f(android.view.View, int):void */
    /* renamed from: c */
    public final void mo71273c(boolean z) {
        bhox bhox = this.f151328b;
        if (bhox.f119240m != z) {
            bhox.mo64111b();
            if (z) {
                bhox.f119241n = new AppCompatTextView(bhox.f119228a);
                bhox.f119241n.setId(C0126R.C0129id.textinput_helper_text);
                int i = Build.VERSION.SDK_INT;
                bhox.f119241n.setTextAlignment(5);
                bhox.f119241n.setVisibility(4);
                C1280ps.m19919f((View) bhox.f119241n, 1);
                bhox.mo64112b(bhox.f119242o);
                bhox.mo64113b(bhox.f119243p);
                bhox.mo64108a(bhox.f119241n, 1);
            } else {
                bhox.mo64111b();
                int i2 = bhox.f119231d;
                if (i2 == 2) {
                    bhox.f119232e = 0;
                }
                bhox.mo64106a(i2, bhox.f119232e, bhox.mo64110a(bhox.f119241n, (CharSequence) null));
                bhox.mo64114b(bhox.f119241n, 1);
                bhox.f119241n = null;
                bhox.f119229b.mo71268c();
                bhox.f119229b.mo71291h();
            }
            bhox.f119240m = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo71249a(float f) {
        if (this.f151344r.f118805a != f) {
            if (this.f151300aC == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.f151300aC = valueAnimator;
                valueAnimator.setInterpolator(bhdl.f118328b);
                this.f151300aC.setDuration(167L);
                this.f151300aC.addUpdateListener(new bhpk(this));
            }
            this.f151300aC.setFloatValues(this.f151344r.f118805a, f);
            this.f151300aC.start();
        }
    }

    /* renamed from: a */
    public final void mo71250a(float f, float f2, float f3, float f4) {
        if (this.f151336j.mo63962n() != f || this.f151336j.mo63963o() != f2 || this.f151336j.mo63966q() != f4 || this.f151336j.mo63965p() != f3) {
            bhlw b = this.f151286M.mo63980b();
            b.mo63975c(f);
            b.mo63976d(f2);
            b.mo63974b(f4);
            b.mo63973a(f3);
            this.f151286M = b.mo63972a();
            m117663w();
        }
    }

    /* renamed from: a */
    public final void mo71251a(int i) {
        boolean z;
        int i2;
        boolean z2 = this.f151331e;
        int i3 = this.f151330d;
        if (i3 == -1) {
            this.f151332f.setText(String.valueOf(i));
            this.f151332f.setContentDescription(null);
            this.f151331e = false;
        } else {
            if (i > i3) {
                z = true;
            } else {
                z = false;
            }
            this.f151331e = z;
            Context context = getContext();
            TextView textView = this.f151332f;
            int i4 = this.f151330d;
            if (!this.f151331e) {
                i2 = C0126R.string.character_counter_content_description;
            } else {
                i2 = C0126R.string.character_counter_overflowed_content_description;
            }
            Integer valueOf = Integer.valueOf(i);
            textView.setContentDescription(context.getString(i2, valueOf, Integer.valueOf(i4)));
            if (z2 != this.f151331e) {
                m117660t();
            }
            this.f151332f.setText(getContext().getString(C0126R.string.character_counter_pattern, valueOf, Integer.valueOf(this.f151330d)));
        }
        if (this.f151297a != null && z2 != this.f151331e) {
            mo71260a(false);
            mo71291h();
            mo71268c();
        }
    }

    /* renamed from: a */
    public final void mo71252a(ColorStateList colorStateList) {
        if (this.f151342p != colorStateList) {
            if (this.f151341o == null) {
                this.f151344r.mo63850a(colorStateList);
            }
            this.f151342p = colorStateList;
            if (this.f151297a != null) {
                mo71260a(false);
            }
        }
    }

    /* renamed from: a */
    public final void mo71253a(PorterDuff.Mode mode) {
        if (this.f151313al != mode) {
            this.f151313al = mode;
            this.f151314am = true;
            m117635B();
        }
    }

    /* renamed from: a */
    public final void mo71254a(Drawable drawable) {
        this.f151318aq.setImageDrawable(drawable);
        boolean z = false;
        if (drawable != null && this.f151328b.f119234g) {
            z = true;
        }
        m117650h(z);
    }

    /* renamed from: a */
    public final void mo71255a(View.OnClickListener onClickListener) {
        m117643a(this.f151339m, onClickListener);
    }

    /* renamed from: a */
    public final void mo71256a(TextView textView, int i) {
        try {
            C1334rs.m20104a(textView, i);
            int i2 = Build.VERSION.SDK_INT;
            if (textView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception e) {
        }
        C1334rs.m20104a(textView, 2132018336);
        textView.setTextColor(C1133kh.m17843b(getContext(), C0126R.color.design_error));
    }

    /* renamed from: a */
    public final void mo71257a(bhpl bhpl) {
        EditText editText = this.f151297a;
        if (editText != null) {
            C1280ps.m19894a(editText, bhpl);
        }
    }

    /* renamed from: a */
    public final void mo71258a(bhpm bhpm) {
        this.f151308ag.add(bhpm);
        if (this.f151297a != null) {
            bhpm.mo64076a(this);
        }
    }

    /* renamed from: a */
    public final void mo71259a(CharSequence charSequence) {
        if (this.f151283J) {
            if (!TextUtils.equals(charSequence, this.f151284K)) {
                this.f151284K = charSequence;
                this.f151344r.mo63860b(charSequence);
                if (!this.f151298aA) {
                    m117638E();
                }
            }
            sendAccessibilityEvent(2048);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.material.textfield.TextInputLayout.a(boolean, boolean):void
     arg types: [boolean, int]
     candidates:
      com.google.android.material.textfield.TextInputLayout.a(int, boolean):int
      com.google.android.material.textfield.TextInputLayout.a(android.view.ViewGroup, boolean):void
      com.google.android.material.textfield.TextInputLayout.a(com.google.android.material.internal.CheckableImageButton, android.content.res.ColorStateList):void
      com.google.android.material.textfield.TextInputLayout.a(com.google.android.material.internal.CheckableImageButton, android.view.View$OnClickListener):void
      com.google.android.material.textfield.TextInputLayout.a(android.widget.TextView, int):void
      com.google.android.material.textfield.TextInputLayout.a(boolean, boolean):void */
    /* renamed from: a */
    public final void mo71260a(boolean z) {
        m117645a(z, false);
    }
}
