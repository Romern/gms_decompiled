package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.setupcompat.internal.TemplateLayout;
import com.google.android.setupcompat.template.FooterActionButton;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: biyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class biyn implements biyr {

    /* renamed from: a */
    private final Context f122309a;

    /* renamed from: b */
    private final ViewStub f122310b;

    /* renamed from: c */
    private int f122311c;

    /* renamed from: d */
    final boolean f122312d;

    /* renamed from: e */
    public LinearLayout f122313e;

    /* renamed from: f */
    public biyp f122314f;

    /* renamed from: g */
    public biyp f122315g;

    /* renamed from: h */
    public int f122316h;

    /* renamed from: i */
    ColorStateList f122317i = null;

    /* renamed from: j */
    ColorStateList f122318j = null;

    /* renamed from: k */
    final int f122319k;

    /* renamed from: l */
    public boolean f122320l = true;

    /* renamed from: m */
    public final biyi f122321m = new biyi();

    /* renamed from: n */
    private int f122322n;

    /* renamed from: o */
    private int f122323o;

    /* renamed from: p */
    private final int f122324p;

    /* renamed from: q */
    private final int f122325q;

    static {
        new AtomicInteger(1);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: biyi.a(boolean, boolean):void
     arg types: [int, int]
     candidates:
      biyi.a(java.lang.String, boolean):java.lang.String
      biyi.a(boolean, boolean):void */
    public biyn(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.f122309a = templateLayout.getContext();
        this.f122310b = (ViewStub) templateLayout.mo71345b(C0126R.C0129id.suc_layout_footer);
        this.f122312d = ((bixl) templateLayout).mo64840c();
        TypedArray obtainStyledAttributes = this.f122309a.obtainStyledAttributes(attributeSet, bixm.f122204a, i, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.f122319k = dimensionPixelSize;
        this.f122322n = obtainStyledAttributes.getDimensionPixelSize(7, dimensionPixelSize);
        this.f122323o = obtainStyledAttributes.getDimensionPixelSize(6, this.f122319k);
        this.f122324p = obtainStyledAttributes.getColor(9, 0);
        this.f122325q = obtainStyledAttributes.getColor(11, 0);
        int resourceId = obtainStyledAttributes.getResourceId(10, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(12, 0);
        obtainStyledAttributes.recycle();
        biyq biyq = new biyq(this.f122309a);
        if (resourceId2 != 0) {
            mo52735b(biyq.mo64890a(resourceId2));
            this.f122321m.mo64866a(true, true);
        }
        if (resourceId != 0) {
            mo52733a(biyq.mo64890a(resourceId));
            this.f122321m.mo64867b(true, true);
        }
    }

    /* renamed from: a */
    private static int m102985a(int i, float f) {
        return Color.argb((int) (f * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: g */
    private final LinearLayout m102990g() {
        if (this.f122313e == null) {
            if (this.f122310b != null) {
                int i = Build.VERSION.SDK_INT;
                this.f122310b.setLayoutInflater(LayoutInflater.from(new ContextThemeWrapper(this.f122309a, 2132018201)));
                this.f122310b.setLayoutResource(C0126R.C0128layout.suc_footer_button_bar);
                LinearLayout linearLayout = (LinearLayout) this.f122310b.inflate();
                this.f122313e = linearLayout;
                if (linearLayout != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    linearLayout.setId(View.generateViewId());
                    linearLayout.setPadding(linearLayout.getPaddingLeft(), this.f122322n, linearLayout.getPaddingRight(), this.f122323o);
                }
                LinearLayout linearLayout2 = this.f122313e;
                if (linearLayout2 != null && this.f122312d) {
                    linearLayout2.setBackgroundColor(biyk.m102977a(this.f122309a).mo64868a(this.f122309a, biyj.CONFIG_FOOTER_BAR_BG_COLOR));
                    this.f122322n = (int) biyk.m102977a(this.f122309a).mo64873e(this.f122309a, biyj.CONFIG_FOOTER_BUTTON_PADDING_TOP);
                    this.f122323o = (int) biyk.m102977a(this.f122309a).mo64873e(this.f122309a, biyj.CONFIG_FOOTER_BUTTON_PADDING_BOTTOM);
                    linearLayout2.setPadding(linearLayout2.getPaddingLeft(), this.f122322n, linearLayout2.getPaddingRight(), this.f122323o);
                }
            } else {
                throw new IllegalStateException("Footer stub is not found in this template");
            }
        }
        return this.f122313e;
    }

    /* renamed from: b */
    public void mo52735b(biyp biyp) {
        bixv.m102957a("setSecondaryButton");
        m102990g();
        bixq bixq = new bixq(biyp);
        bixq.f122221h = m102986a(biyp, 2132018199, biyj.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR);
        bixq.f122214a = biyj.CONFIG_FOOTER_SECONDARY_BUTTON_BG_COLOR;
        bixq.f122215b = m102987a(biyp.f122331a);
        bixq.f122219f = biyj.CONFIG_FOOTER_BUTTON_RADIUS;
        bixq.f122220g = biyj.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
        bixq.f122216c = biyj.CONFIG_FOOTER_SECONDARY_BUTTON_TEXT_COLOR;
        bixq.f122217d = biyj.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
        bixq.f122218e = biyj.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
        bixr a = bixq.mo64845a();
        FooterActionButton a2 = m102988a(biyp, a);
        this.f122311c = a2.getId();
        this.f122318j = a2.getTextColors();
        this.f122315g = biyp;
        mo64875a(a2, this.f122325q);
        m102989a(a2, a);
        mo64878c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo64878c() {
        LinearLayout g = m102990g();
        Button a = mo64874a();
        Button e = mo64880e();
        g.removeAllViews();
        if (e != null) {
            g.addView(e);
        }
        LinearLayout g2 = m102990g();
        View view = new View(g2.getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        view.setVisibility(4);
        g2.addView(view);
        if (a != null) {
            g.addView(a);
        }
    }

    /* renamed from: d */
    public final void mo64879d() {
        boolean z;
        Button a = mo64874a();
        Button e = mo64880e();
        boolean z2 = true;
        int i = 0;
        if (a == null || a.getVisibility() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (e == null || e.getVisibility() != 0) {
            z2 = false;
        }
        LinearLayout linearLayout = this.f122313e;
        if (linearLayout != null) {
            if (!z && !z2) {
                i = this.f122320l ? 8 : 4;
            }
            linearLayout.setVisibility(i);
        }
    }

    /* renamed from: e */
    public final Button mo64880e() {
        LinearLayout linearLayout = this.f122313e;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(this.f122311c);
        }
        return null;
    }

    /* renamed from: f */
    public final boolean mo64881f() {
        return mo64880e() != null && mo64880e().getVisibility() == 0;
    }

    /* renamed from: a */
    private final int m102986a(biyp biyp, int i, biyj biyj) {
        int i2 = biyp.f122335e;
        if (i2 != 0 && !this.f122312d) {
            i = i2;
        }
        int a = biyk.m102977a(this.f122309a).mo64868a(this.f122309a, biyj);
        if (!this.f122312d) {
            return i;
        }
        if (a == 0) {
            return 2132018199;
        }
        if (a == 0) {
            return i;
        }
        return 2132018198;
    }

    /* renamed from: a */
    private static biyj m102987a(int i) {
        switch (i) {
            case 1:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_ADD_ANOTHER;
            case 2:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_CANCEL;
            case 3:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_CLEAR;
            case 4:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_DONE;
            case 5:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_NEXT;
            case 6:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_OPT_IN;
            case 7:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_SKIP;
            case 8:
                return biyj.CONFIG_FOOTER_BUTTON_ICON_STOP;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public final boolean mo64877b() {
        return mo64874a() != null && mo64874a().getVisibility() == 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final FooterActionButton m102988a(biyp biyp, bixr bixr) {
        FooterActionButton footerActionButton = (FooterActionButton) LayoutInflater.from(new ContextThemeWrapper(this.f122309a, bixr.f122230h)).inflate((int) C0126R.C0128layout.suc_button, (ViewGroup) null, false);
        int i = Build.VERSION.SDK_INT;
        footerActionButton.setId(View.generateViewId());
        footerActionButton.setText(biyp.f122332b);
        footerActionButton.setOnClickListener(biyp);
        footerActionButton.setVisibility(biyp.f122334d);
        footerActionButton.setEnabled(biyp.f122333c);
        footerActionButton.f151473a = biyp;
        biyp.f122337g = new biym(this, footerActionButton.getId());
        return footerActionButton;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bixv.a(boolean, java.lang.String):void
     arg types: [int, java.lang.String]
     candidates:
      bixv.a(java.lang.Object, java.lang.String):void
      bixv.a(boolean, java.lang.String):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object
     arg types: [biyj, java.lang.Float]
     candidates:
      ClspMth{java.util.EnumMap.put(java.lang.Object, java.lang.Object):java.lang.Object}
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Object, java.lang.Object):java.lang.Object
      MutableMD:(java.lang.Enum, java.lang.Object):java.lang.Object */
    /* renamed from: a */
    private final void m102989a(Button button, bixr bixr) {
        Drawable drawable;
        Drawable drawable2;
        if (this.f122312d) {
            mo64876a(button, bixr.f122225c);
            float e = biyk.m102977a(this.f122309a).mo64873e(this.f122309a, bixr.f122226d);
            float f = 0.0f;
            if (e > 0.0f) {
                button.setTextSize(0, e);
            }
            Typeface create = Typeface.create(biyk.m102977a(this.f122309a).mo64871c(this.f122309a, bixr.f122227e), 0);
            if (create != null) {
                button.setTypeface(create);
            }
            biyj biyj = bixr.f122223a;
            int i = Build.VERSION.SDK_INT;
            bixv.m102958a(true, "Update button background only support on sdk Q or higher");
            int[] iArr = {-16842910};
            int[] iArr2 = new int[0];
            int a = biyk.m102977a(this.f122309a).mo64868a(this.f122309a, biyj);
            if (a != 0) {
                TypedArray obtainStyledAttributes = this.f122309a.obtainStyledAttributes(new int[]{16842803});
                float f2 = obtainStyledAttributes.getFloat(0, 0.26f);
                obtainStyledAttributes.recycle();
                ColorStateList colorStateList = new ColorStateList(new int[][]{iArr, iArr2}, new int[]{m102985a(a, f2), a});
                button.getBackground().mutate().setState(new int[0]);
                button.refreshDrawableState();
                button.setBackgroundTintList(colorStateList);
            }
            biyj biyj2 = bixr.f122228f;
            int i2 = Build.VERSION.SDK_INT;
            float e2 = biyk.m102977a(this.f122309a).mo64873e(this.f122309a, biyj2);
            int i3 = Build.VERSION.SDK_INT;
            Drawable background = button.getBackground();
            RippleDrawable rippleDrawable = null;
            GradientDrawable gradientDrawable = background instanceof InsetDrawable ? (GradientDrawable) ((LayerDrawable) ((InsetDrawable) background).getDrawable()).getDrawable(0) : background instanceof RippleDrawable ? (GradientDrawable) ((InsetDrawable) ((RippleDrawable) background).getDrawable(0)).getDrawable() : null;
            if (gradientDrawable != null) {
                gradientDrawable.setCornerRadius(e2);
            }
            biyj biyj3 = bixr.f122224b;
            if (button != null) {
                if (biyj3 != null) {
                    drawable = biyk.m102977a(this.f122309a).mo64870b(this.f122309a, biyj3);
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
                }
                if (button.getId() == this.f122316h) {
                    drawable2 = drawable;
                    drawable = null;
                } else if (button.getId() == this.f122311c) {
                    drawable2 = null;
                } else {
                    drawable = null;
                    drawable2 = null;
                }
                int i4 = Build.VERSION.SDK_INT;
                button.setCompoundDrawablesRelative(drawable, null, drawable2, null);
            }
            int i5 = Build.VERSION.SDK_INT;
            int i6 = Build.VERSION.SDK_INT;
            Drawable background2 = button.getBackground();
            if (background2 instanceof InsetDrawable) {
                rippleDrawable = (RippleDrawable) ((InsetDrawable) background2).getDrawable();
            } else if (background2 instanceof RippleDrawable) {
                rippleDrawable = (RippleDrawable) background2;
            }
            if (rippleDrawable != null) {
                int[] iArr3 = {16842919};
                int a2 = biyk.m102977a(this.f122309a).mo64868a(this.f122309a, bixr.f122225c);
                biyk a3 = biyk.m102977a(this.f122309a);
                Context context = this.f122309a;
                biyj biyj4 = bixr.f122229g;
                if (biyj4.f122299N == 6) {
                    if (a3.f122303b.containsKey(biyj4)) {
                        f = ((Float) a3.f122303b.get(biyj4)).floatValue();
                    } else {
                        try {
                            biyl a4 = a3.mo64869a(context, biyj4.f122298M);
                            f = a4.f122306b.getFraction(a4.f122305a, 1, 1);
                            a3.f122303b.put((Enum) biyj4, (Object) Float.valueOf(f));
                        } catch (NullPointerException e3) {
                        }
                    }
                    rippleDrawable.setColor(new ColorStateList(new int[][]{iArr3, StateSet.NOTHING}, new int[]{m102985a(a2, f), 0}));
                    return;
                }
                throw new IllegalArgumentException("Not a fraction resource");
            }
        }
    }

    /* renamed from: a */
    public final Button mo64874a() {
        LinearLayout linearLayout = this.f122313e;
        if (linearLayout != null) {
            return (Button) linearLayout.findViewById(this.f122316h);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64875a(Button button, int i) {
        if (i != 0) {
            button.getBackground().mutate().setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
        }
        this.f122313e.addView(button);
        mo64879d();
    }

    /* renamed from: a */
    public final void mo64876a(Button button, biyj biyj) {
        ColorStateList colorStateList;
        if (button.isEnabled()) {
            int a = biyk.m102977a(this.f122309a).mo64868a(this.f122309a, biyj);
            if (a != 0) {
                button.setTextColor(ColorStateList.valueOf(a));
                return;
            }
            return;
        }
        if (button.getId() != this.f122316h) {
            colorStateList = this.f122318j;
        } else {
            colorStateList = this.f122317i;
        }
        button.setTextColor(colorStateList);
    }

    /* renamed from: a */
    public void mo52733a(biyp biyp) {
        bixv.m102957a("setPrimaryButton");
        m102990g();
        bixq bixq = new bixq(biyp);
        bixq.f122221h = m102986a(biyp, 2132018198, biyj.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR);
        bixq.f122214a = biyj.CONFIG_FOOTER_PRIMARY_BUTTON_BG_COLOR;
        bixq.f122215b = m102987a(biyp.f122331a);
        bixq.f122219f = biyj.CONFIG_FOOTER_BUTTON_RADIUS;
        bixq.f122220g = biyj.CONFIG_FOOTER_BUTTON_RIPPLE_COLOR_ALPHA;
        bixq.f122216c = biyj.CONFIG_FOOTER_PRIMARY_BUTTON_TEXT_COLOR;
        bixq.f122217d = biyj.CONFIG_FOOTER_BUTTON_TEXT_SIZE;
        bixq.f122218e = biyj.CONFIG_FOOTER_BUTTON_FONT_FAMILY;
        bixr a = bixq.mo64845a();
        FooterActionButton a2 = m102988a(biyp, a);
        this.f122316h = a2.getId();
        this.f122317i = a2.getTextColors();
        this.f122314f = biyp;
        mo64875a(a2, this.f122324p);
        m102989a(a2, a);
        mo64878c();
    }
}
