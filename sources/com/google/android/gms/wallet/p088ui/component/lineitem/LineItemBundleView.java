package com.google.android.gms.wallet.p088ui.component.lineitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FifeNetworkImageView;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;

/* renamed from: com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LineItemBundleView extends FrameLayout implements View.OnClickListener, awyz, awgw, bkdi {

    /* renamed from: a */
    LineItemView f110542a;

    /* renamed from: b */
    LinearLayout f110543b;

    /* renamed from: c */
    LinearLayout f110544c;

    /* renamed from: d */
    View f110545d;

    /* renamed from: e */
    ImageWithCaptionView f110546e;

    /* renamed from: f */
    View f110547f;

    /* renamed from: g */
    public bmju f110548g;

    /* renamed from: h */
    boolean f110549h;

    /* renamed from: i */
    Paint f110550i;

    /* renamed from: j */
    Drawable f110551j;

    /* renamed from: k */
    public axbu f110552k;

    /* renamed from: l */
    private TextView f110553l;

    /* renamed from: m */
    private ViewGroup f110554m;

    /* renamed from: n */
    private boolean f110555n;

    /* renamed from: o */
    private int f110556o;

    /* renamed from: p */
    private int f110557p;

    /* renamed from: q */
    private Paint f110558q;

    /* renamed from: r */
    private int f110559r;

    /* renamed from: s */
    private int f110560s;

    /* renamed from: t */
    private boolean f110561t;

    /* renamed from: u */
    private int f110562u;

    /* renamed from: v */
    private boolean f110563v;

    /* renamed from: w */
    private int f110564w;

    /* renamed from: x */
    private float f110565x;

    public LineItemBundleView(Context context) {
        super(context);
        this.f110561t = false;
        this.f110564w = 0;
        mo60109a(context);
    }

    /* renamed from: a */
    private static final Paint m94248a(Context context, int i) {
        Paint paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((int) C0126R.style.WalletLineItemBundle, eoi.f15410v);
        int color = obtainStyledAttributes.getColor(i, 17170445);
        if (color != 17170445) {
            paint = new Paint(1);
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint = null;
        }
        obtainStyledAttributes.recycle();
        return paint;
    }

    /* renamed from: d */
    private final boolean m94250d() {
        if (!mo60113b()) {
            return false;
        }
        bmjy bmjy = this.f110548g.f129747c;
        if (bmjy == null) {
            bmjy = bmjy.f129758i;
        }
        if ((bmjy.f129760a & 8) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private final boolean m94251e() {
        bmju bmju = this.f110548g;
        return bmju != null && bmju.f129749e.size() > 0;
    }

    /* renamed from: f */
    private final boolean m94252f() {
        bmju bmju = this.f110548g;
        return bmju != null && bmju.f129748d.size() > 0;
    }

    /* renamed from: g */
    private final boolean m94253g() {
        return m94251e() || m94252f();
    }

    /* renamed from: b */
    public final void mo52143b(int i) {
        int i2;
        if (this.f110565x > 0.0f && m94250d() && this.f110555n) {
            if (this.f110546e.getWidth() != 0) {
                float f = ((float) i) / this.f110565x;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                this.f110546e.setAlpha(1.0f - f);
                int i3 = Build.VERSION.SDK_INT;
                if (getLayoutDirection() == 1) {
                    i2 = (int) (((float) (this.f110542a.getRight() - this.f110546e.getRight())) * f);
                } else {
                    i2 = (int) (((float) (this.f110542a.getLeft() - this.f110546e.getLeft())) * f);
                }
                this.f110554m.setTranslationX((float) (-i2));
                this.f110542a.f110571a.setTranslationX((float) i2);
                return;
            }
            this.f110562u = i;
            ((FifeNetworkImageView) this.f110546e).f151949h = this;
        }
    }

    /* renamed from: b */
    public final boolean mo60113b() {
        bmju bmju = this.f110548g;
        return (bmju == null || (bmju.f129745a & 2) == 0) ? false : true;
    }

    /* renamed from: c */
    public final void mo60114c() {
        axbu axbu = this.f110552k;
        if (axbu != null) {
            ((axbv) axbu).f95739c = this.f110561t;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void
     arg types: [boolean, int, int]
     candidates:
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(android.view.View, android.view.View, boolean):void
      awgw.a(android.view.View, android.view.View, boolean):void
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void */
    public void onClick(View view) {
        if (view == this.f110545d) {
            mo60112a(!this.f110561t, false, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        Paint paint = this.f110550i;
        if (paint != null && (i3 = this.f110556o) > 0 && (i4 = this.f110557p) > 0) {
            canvas.drawRect(0.0f, 0.0f, (float) i3, (float) i4, paint);
        }
        Paint paint2 = this.f110558q;
        if (paint2 != null && (i = this.f110556o) > 0 && (i2 = this.f110559r) > 0) {
            canvas.drawRect(0.0f, 0.0f, (float) i, (float) i2, paint2);
            Drawable drawable = this.f110551j;
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        LineItemView lineItemView = this.f110542a;
        if (lineItemView != null && lineItemView.getVisibility() == 0) {
            i5 = this.f110542a.getBottom();
            this.f110559r = i5;
        } else {
            this.f110559r = 0;
            i5 = 0;
        }
        Drawable drawable = this.f110551j;
        if (drawable != null) {
            drawable.setBounds(0, i5, this.f110556o, this.f110560s + i5);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f110551j != null && this.f110560s > 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.f110560s);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f110556o = i;
        this.f110557p = i2;
    }

    public LineItemBundleView(Context context, int i) {
        super(context);
        this.f110561t = false;
        this.f110563v = true;
        this.f110564w = i;
        mo60109a(context);
    }

    /* renamed from: a */
    private final void m94249a(boolean z) {
        int i = 0;
        if (this.f110561t) {
            this.f110543b.setVisibility(0);
            this.f110545d.setVisibility(8);
            this.f110544c.setVisibility(8);
            this.f110547f.setVisibility(0);
            if (z) {
                this.f110543b.requestFocus();
                return;
            }
            return;
        }
        this.f110543b.setVisibility(8);
        this.f110545d.setVisibility(!m94251e() ? 8 : 0);
        this.f110544c.setVisibility(!m94252f() ? 8 : 0);
        View view = this.f110547f;
        if (mo60113b() && m94253g()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo52141a(int i) {
        this.f110564w = i;
        LineItemBundleView lineItemBundleView = new LineItemBundleView(getContext(), i);
        lineItemBundleView.mo52802a(this.f110548g);
        return lineItemBundleView;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo52803b(Object obj) {
        return ((bmju) obj) != null;
    }

    /* renamed from: a */
    public final void mo52989a() {
        mo52143b(this.f110562u);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60109a(Context context) {
        View view;
        LayoutInflater from = LayoutInflater.from(context);
        if (!this.f110563v) {
            view = from.inflate((int) C0126R.C0128layout.wallet_view_line_item_bundle, (ViewGroup) this, true);
        } else {
            int i = this.f110564w;
            if (i == 0) {
                view = from.inflate((int) C0126R.C0128layout.wallet_view_line_item_bundle, (ViewGroup) this, true);
            } else if (i == 1) {
                view = from.inflate((int) C0126R.C0128layout.wallet_view_landscape_line_item_bundle, (ViewGroup) this, true);
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown StickyStyle: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f110542a = (LineItemView) view.findViewById(C0126R.C0129id.line_item_bundle_hero);
        this.f110554m = (ViewGroup) view.findViewById(C0126R.C0129id.line_item_bundle_hero_container);
        this.f110543b = (LinearLayout) view.findViewById(C0126R.C0129id.line_item_bundle_expanded_items);
        this.f110544c = (LinearLayout) view.findViewById(C0126R.C0129id.line_item_bundle_collapsed_items);
        View findViewById = view.findViewById(C0126R.C0129id.line_item_bundle_expand_button);
        this.f110545d = findViewById;
        this.f110553l = (TextView) findViewById.findViewById(C0126R.C0129id.line_item_bundle_expand_button_text);
        this.f110546e = (ImageWithCaptionView) view.findViewById(C0126R.C0129id.line_item_bundle_image);
        this.f110547f = view.findViewById(C0126R.C0129id.line_item_bundle_spacer);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.attrWalletShouldAnimateHeroImage});
        this.f110555n = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.f110545d.setOnClickListener(this);
        m94249a(false);
        bkfr.m105572a((ImageView) view.findViewById(C0126R.C0129id.line_item_bundle_expand_button_image), bkfr.m105601c(getContext(), 16842808));
    }

    /* renamed from: a */
    public final void mo52142a(View view, View view2, boolean z) {
        Drawable drawable;
        if (this == view2) {
            int i = 8;
            if (this.f110564w == 1) {
                this.f110546e.setVisibility(8);
                this.f110542a.setVisibility(8);
            } else if (chis.f188662a.mo6606a().mo85266a() && !z) {
                this.f110546e.setVisibility(0);
                this.f110542a.setVisibility(0);
            } else {
                this.f110546e.setVisibility(!m94250d() ? 8 : 4);
                LineItemView lineItemView = this.f110542a;
                if (mo60113b()) {
                    i = 4;
                }
                lineItemView.setVisibility(i);
            }
        } else if (this == view && z && this.f110546e.getDrawable() == null && (view2 instanceof LineItemBundleView) && (drawable = ((LineItemBundleView) view2).f110546e.getDrawable()) != null) {
            this.f110546e.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public final void mo52802a(bmju bmju) {
        this.f110548g = bmju;
        mo60111a(bmju, this.f110549h);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void
     arg types: [boolean, int, int]
     candidates:
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(android.view.View, android.view.View, boolean):void
      awgw.a(android.view.View, android.view.View, boolean):void
      com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView.a(boolean, boolean, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo60111a(bmju bmju, boolean z) {
        Paint paint;
        Context context = getContext();
        LineItemView lineItemView = this.f110542a;
        bmjy bmjy = bmju.f129747c;
        if (bmjy == null) {
            bmjy = bmjy.f129758i;
        }
        boolean z2 = false;
        if (lineItemView.mo52803b(bmjy)) {
            lineItemView.setVisibility(0);
            lineItemView.mo52802a(bmjy);
        } else {
            lineItemView.setVisibility(8);
        }
        ImageWithCaptionView imageWithCaptionView = this.f110546e;
        bmjy bmjy2 = bmju.f129747c;
        if (bmjy2 == null) {
            bmjy2 = bmjy.f129758i;
        }
        bmno bmno = bmjy2.f129766g;
        if (bmno == null) {
            bmno = bmno.f130138m;
        }
        awia.m79983a(imageWithCaptionView, bmno);
        Paint paint2 = null;
        if (mo60113b()) {
            int[] iArr = eoi.f15389a;
            paint = m94248a(context, 0);
        } else {
            paint = null;
        }
        this.f110558q = paint;
        if (this.f110563v) {
            this.f110543b.setVisibility(8);
            this.f110544c.setVisibility(8);
            this.f110545d.setVisibility(8);
            this.f110550i = null;
            this.f110547f.setVisibility(8);
            this.f110551j = context.getResources().getDrawable(C0126R.C0127drawable.wallet_header_shadow);
            this.f110560s = context.getResources().getDimensionPixelSize(C0126R.dimen.wallet_header_shadow_height);
            awia.m79980a(this.f110542a.f110571a, this);
            this.f110565x = context.getResources().getDimension(C0126R.dimen.wallet_line_item_bundle_animation_scroll_distance);
        } else {
            awza.m81597a(context, this.f110543b, bmju.f129749e, LineItemView.class);
            awza.m81597a(context, this.f110544c, bmju.f129748d, LineItemView.class);
            this.f110553l.setText(bmju.f129751g);
            if (mo60113b()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((int) C0126R.style.WalletLineItemBundle, eoi.f15410v);
                boolean z3 = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                if (z3) {
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{16843564});
                    this.f110551j = obtainStyledAttributes2.getDrawable(0);
                    this.f110560s = context.getResources().getDimensionPixelSize(C0126R.dimen.wallet_dialog_divider_height);
                    obtainStyledAttributes2.recycle();
                }
            }
            if (m94253g() && !z) {
                bxwc bxwc = bmju.f129749e;
                int size = bxwc.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        int[] iArr2 = eoi.f15389a;
                        paint2 = m94248a(context, 2);
                        break;
                    }
                    int a = bmjx.m108104a(((bmjy) bxwc.get(i)).f129765f);
                    if (a == 0) {
                        a = 1;
                    }
                    i++;
                    if (a == 7) {
                        break;
                    }
                }
            }
            this.f110550i = paint2;
            mo60112a(!bmju.f129750f, true, false);
        }
        if (this.f110558q == null && this.f110550i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    /* renamed from: a */
    public final void mo60112a(boolean z, boolean z2, boolean z3) {
        if (!m94251e()) {
            z = false;
        }
        if (z != this.f110561t || z2) {
            this.f110561t = z;
            m94249a(z3);
            mo60114c();
        }
    }
}
