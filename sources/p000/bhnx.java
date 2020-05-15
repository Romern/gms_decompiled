package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.tabs.TabLayout;

/* renamed from: bhnx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnx extends LinearLayout {

    /* renamed from: a */
    public TextView f119174a;

    /* renamed from: b */
    public ImageView f119175b;

    /* renamed from: c */
    public final Drawable f119176c;

    /* renamed from: d */
    final /* synthetic */ TabLayout f119177d;

    /* renamed from: e */
    private bhnu f119178e;

    /* renamed from: f */
    private int f119179f = 2;

    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.drawable.RippleDrawable], assign insn: 0x0060: CONSTRUCTOR  (r3v1 ? I:android.graphics.drawable.RippleDrawable) = 
      (r2v5 android.content.res.ColorStateList)
      (r7v7 android.graphics.drawable.GradientDrawable)
      (r1v2 android.graphics.drawable.GradientDrawable)
     call: android.graphics.drawable.RippleDrawable.<init>(android.content.res.ColorStateList, android.graphics.drawable.Drawable, android.graphics.drawable.Drawable):void type: CONSTRUCTOR */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public bhnx(TabLayout tabLayout, Context context) {
        super(context);
        this.f119177d = tabLayout;
        int i = this.f119177d.f151263r;
        GradientDrawable gradientDrawable = null;
        if (i != 0) {
            Drawable b = C1391tv.m20459b(context, i);
            this.f119176c = b;
            if (b != null && b.isStateful()) {
                this.f119176c.setState(getDrawableState());
            }
        } else {
            this.f119176c = null;
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setColor(0);
        if (this.f119177d.f151258m != null) {
            GradientDrawable gradientDrawable3 = new GradientDrawable();
            gradientDrawable3.setCornerRadius(1.0E-5f);
            gradientDrawable3.setColor(-1);
            ColorStateList a = bhlg.m101094a(this.f119177d.f151258m);
            int i2 = Build.VERSION.SDK_INT;
            boolean z = this.f119177d.f151271z;
            gradientDrawable2 = new RippleDrawable(a, z ? null : gradientDrawable2, !z ? gradientDrawable3 : gradientDrawable);
        }
        C1280ps.m19890a(this, gradientDrawable2);
        this.f119177d.invalidate();
        C1280ps.m19885a(this, tabLayout.f151251f, tabLayout.f151252g, tabLayout.f151253h, tabLayout.f151254i);
        setGravity(17);
        setOrientation(!tabLayout.f151269x);
        setClickable(true);
        C1280ps.m19896a(this, C1272pk.m19859a(getContext()));
    }

    /* renamed from: a */
    private static final void m101229a(View view) {
        if (view != null) {
            view.addOnLayoutChangeListener(new bhnw(view));
        }
    }

    /* access modifiers changed from: protected */
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f119176c;
        if (drawable != null && drawable.isStateful() && this.f119176c.setState(drawableState)) {
            invalidate();
            this.f119177d.invalidate();
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1301qm a = C1301qm.m20017a(accessibilityNodeInfo);
        a.mo15761b(C1300ql.m20014a(0, 1, this.f119178e.f119165d, 1, isSelected()));
        if (isSelected()) {
            a.mo15777f(false);
            a.mo15762b(C1298qj.f26862c);
        }
        a.mo15773e("Tab");
    }

    public final void onMeasure(int i, int i2) {
        Layout layout;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.f119177d.f151264s;
        if (i3 > 0 && (mode == 0 || size > i3)) {
            i = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.f119174a != null) {
            float f = this.f119177d.f151261p;
            int i4 = this.f119179f;
            ImageView imageView = this.f119175b;
            if (imageView != null && imageView.getVisibility() == 0) {
                i4 = 1;
            } else {
                TextView textView = this.f119174a;
                if (textView != null && textView.getLineCount() > 1) {
                    f = this.f119177d.f151262q;
                }
            }
            float textSize = this.f119174a.getTextSize();
            int lineCount = this.f119174a.getLineCount();
            int a = C1334rs.m20102a(this.f119174a);
            if (f != textSize || (a >= 0 && i4 != a)) {
                if (this.f119177d.f151268w != 1 || f <= textSize || lineCount != 1 || ((layout = this.f119174a.getLayout()) != null && layout.getLineWidth(0) * (f / layout.getPaint().getTextSize()) <= ((float) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())))) {
                    this.f119174a.setTextSize(0, f);
                    this.f119174a.setMaxLines(i4);
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f119178e == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        this.f119178e.mo64060a();
        return true;
    }

    public final void setSelected(boolean z) {
        boolean isSelected = isSelected();
        super.setSelected(z);
        if (isSelected != z && z) {
            int i = Build.VERSION.SDK_INT;
        }
        TextView textView = this.f119174a;
        if (textView != null) {
            textView.setSelected(z);
        }
        ImageView imageView = this.f119175b;
        if (imageView != null) {
            imageView.setSelected(z);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bhnx, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64065a() {
        Drawable drawable;
        Drawable drawable2;
        CharSequence charSequence;
        CharSequence charSequence2;
        int i;
        Drawable drawable3;
        Drawable drawable4;
        bhnu bhnu = this.f119178e;
        boolean z = false;
        if (this.f119175b == null) {
            int i2 = bhen.f118404a;
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.design_layout_tab_icon, (ViewGroup) this, false);
            this.f119175b = imageView;
            addView(imageView, 0);
        }
        CharSequence charSequence3 = null;
        if (bhnu == null || (drawable4 = bhnu.f119162a) == null) {
            drawable = null;
        } else {
            int i3 = Build.VERSION.SDK_INT;
            drawable = drawable4.mutate();
        }
        if (drawable != null) {
            C1173lt.m19601a(drawable, this.f119177d.f151257l);
            PorterDuff.Mode mode = this.f119177d.f151260o;
            if (mode != null) {
                C1173lt.m19604a(drawable, mode);
            }
        }
        if (this.f119174a == null) {
            int i4 = bhen.f118404a;
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate((int) C0126R.C0128layout.design_layout_tab_text, (ViewGroup) this, false);
            this.f119174a = textView;
            addView(textView);
            this.f119179f = C1334rs.m20102a(this.f119174a);
        }
        C1334rs.m20104a(this.f119174a, this.f119177d.f151255j);
        ColorStateList colorStateList = this.f119177d.f151256k;
        if (colorStateList != null) {
            this.f119174a.setTextColor(colorStateList);
        }
        TextView textView2 = this.f119174a;
        ImageView imageView2 = this.f119175b;
        bhnu bhnu2 = this.f119178e;
        if (bhnu2 == null || (drawable3 = bhnu2.f119162a) == null) {
            drawable2 = null;
        } else {
            int i5 = Build.VERSION.SDK_INT;
            drawable2 = drawable3.mutate();
        }
        bhnu bhnu3 = this.f119178e;
        if (bhnu3 != null) {
            charSequence = bhnu3.f119163b;
        } else {
            charSequence = null;
        }
        if (imageView2 != null) {
            if (drawable2 != null) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setVisibility(0);
                setVisibility(0);
            } else {
                imageView2.setVisibility(8);
                imageView2.setImageDrawable(null);
            }
        }
        boolean z2 = !TextUtils.isEmpty(charSequence);
        if (textView2 != null) {
            if (z2) {
                textView2.setText(charSequence);
                int i6 = this.f119178e.f119167f;
                textView2.setVisibility(0);
                setVisibility(0);
            } else {
                textView2.setVisibility(8);
                textView2.setText((CharSequence) null);
            }
        }
        if (imageView2 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView2.getLayoutParams();
            if (!z2 || imageView2.getVisibility() != 0) {
                i = 0;
            } else {
                i = (int) bhkn.m101061a(getContext(), 8);
            }
            if (this.f119177d.f151269x) {
                if (i != C1260oz.m19822b(marginLayoutParams)) {
                    C1260oz.m19823b(marginLayoutParams, i);
                    marginLayoutParams.bottomMargin = 0;
                    imageView2.setLayoutParams(marginLayoutParams);
                    imageView2.requestLayout();
                }
            } else if (i != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = i;
                C1260oz.m19823b(marginLayoutParams, 0);
                imageView2.setLayoutParams(marginLayoutParams);
                imageView2.requestLayout();
            }
        }
        bhnu bhnu4 = this.f119178e;
        if (bhnu4 != null) {
            charSequence2 = bhnu4.f119164c;
        } else {
            charSequence2 = null;
        }
        if (!z2) {
            charSequence3 = charSequence2;
        }
        aec.m594a(this, charSequence3);
        m101229a(this.f119175b);
        m101229a(this.f119174a);
        if (bhnu != null && !TextUtils.isEmpty(bhnu.f119164c)) {
            setContentDescription(bhnu.f119164c);
        }
        if (bhnu != null) {
            TabLayout tabLayout = bhnu.f119168g;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            } else if (tabLayout.mo71230c() == bhnu.f119165d) {
                z = true;
            }
        }
        setSelected(z);
    }

    /* renamed from: a */
    public final void mo64066a(bhnu bhnu) {
        if (bhnu != this.f119178e) {
            this.f119178e = bhnu;
            mo64065a();
        }
    }
}
