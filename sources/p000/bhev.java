package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;

/* renamed from: bhev */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhev extends FrameLayout implements C1459wi {

    /* renamed from: e */
    private static final int[] f118415e = {16842912};

    /* renamed from: a */
    public final ImageView f118416a;

    /* renamed from: b */
    public int f118417b = -1;

    /* renamed from: c */
    public C1446vw f118418c;

    /* renamed from: d */
    public bhem f118419d;

    /* renamed from: f */
    private final int f118420f;

    /* renamed from: g */
    private float f118421g;

    /* renamed from: h */
    private float f118422h;

    /* renamed from: i */
    private float f118423i;

    /* renamed from: j */
    private int f118424j;

    /* renamed from: k */
    private boolean f118425k;

    /* renamed from: l */
    private final TextView f118426l;

    /* renamed from: m */
    private final TextView f118427m;

    /* renamed from: n */
    private ColorStateList f118428n;

    /* renamed from: o */
    private Drawable f118429o;

    /* renamed from: p */
    private Drawable f118430p;

    /* renamed from: a */
    private final void m100739a(float f, float f2) {
        this.f118421g = f - f2;
        this.f118422h = f2 / f;
        this.f118423i = f / f2;
    }

    /* renamed from: a */
    public final C1446vw mo1208a() {
        return this.f118418c;
    }

    /* renamed from: b */
    public final void mo63634b(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f118416a.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.f118416a.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final boolean mo1210b() {
        return false;
    }

    /* renamed from: c */
    public final void mo63637c(int i) {
        C1334rs.m20104a(this.f118426l, i);
        m100739a(this.f118426l.getTextSize(), this.f118427m.getTextSize());
    }

    /* renamed from: c */
    public final boolean mo63638c() {
        return this.f118419d != null;
    }

    /* renamed from: d */
    public final void mo63639d(int i) {
        C1334rs.m20104a(this.f118427m, i);
        m100739a(this.f118426l.getTextSize(), this.f118427m.getTextSize());
    }

    /* renamed from: e */
    public final void mo63640e(int i) {
        mo63630a(i != 0 ? C1133kh.m17836a(getContext(), i) : null);
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1446vw vwVar = this.f118418c;
        if (vwVar != null && vwVar.isCheckable() && this.f118418c.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f118415e);
        }
        return onCreateDrawableState;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        bhem bhem = this.f118419d;
        if (bhem != null && bhem.isVisible()) {
            C1446vw vwVar = this.f118418c;
            CharSequence charSequence = vwVar.f27457d;
            if (!TextUtils.isEmpty(vwVar.f27464k)) {
                charSequence = this.f118418c.f27464k;
            }
            String valueOf = String.valueOf(charSequence);
            bhem bhem2 = this.f118419d;
            Object obj = null;
            if (bhem2.isVisible()) {
                if (!bhem2.mo63609a()) {
                    obj = bhem2.f118391d.f151048f;
                } else if (bhem2.f118391d.f151049g > 0 && (context = (Context) bhem2.f118388a.get()) != null) {
                    obj = context.getResources().getQuantityString(bhem2.f118391d.f151049g, bhem2.mo63610b(), Integer.valueOf(bhem2.mo63610b()));
                }
            }
            String valueOf2 = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
            sb.append(valueOf);
            sb.append(", ");
            sb.append(valueOf2);
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        C1301qm a = C1301qm.m20017a(accessibilityNodeInfo);
        a.mo15761b(C1300ql.m20014a(0, 1, this.f118417b, 1, isSelected()));
        if (isSelected()) {
            a.mo15777f(false);
            a.mo15762b(C1298qj.f26862c);
        }
        a.mo15773e("Tab");
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f118426l.setEnabled(z);
        this.f118427m.setEnabled(z);
        this.f118416a.setEnabled(z);
        if (z) {
            C1280ps.m19896a(this, C1272pk.m19859a(getContext()));
        } else {
            C1280ps.m19896a(this, (C1272pk) null);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, bhev, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [android.widget.TextView, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public bhev(Context context) {
        super(context, null, 0);
        Resources resources = getResources();
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(C0126R.C0127drawable.design_bottom_navigation_item_background);
        this.f118420f = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_margin);
        this.f118416a = (ImageView) findViewById(C0126R.C0129id.icon);
        this.f118426l = (TextView) findViewById(C0126R.C0129id.smallLabel);
        this.f118427m = (TextView) findViewById(C0126R.C0129id.largeLabel);
        C1280ps.m19906b((View) this.f118426l, 2);
        C1280ps.m19906b((View) this.f118427m, 2);
        setFocusable(true);
        m100739a(this.f118426l.getTextSize(), this.f118427m.getTextSize());
        ImageView imageView = this.f118416a;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new bheu(this));
        }
    }

    /* renamed from: a */
    private static final void m100740a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    /* renamed from: a */
    private static final void m100741a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo63635b(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f118426l.setTextColor(colorStateList);
            this.f118427m.setTextColor(colorStateList);
        }
    }

    /* renamed from: b */
    public final void mo63636b(boolean z) {
        TextView textView = this.f118427m;
        textView.setPivotX((float) (textView.getWidth() / 2));
        TextView textView2 = this.f118427m;
        textView2.setPivotY((float) textView2.getBaseline());
        TextView textView3 = this.f118426l;
        textView3.setPivotX((float) (textView3.getWidth() / 2));
        TextView textView4 = this.f118426l;
        textView4.setPivotY((float) textView4.getBaseline());
        int i = this.f118424j;
        if (i != -1) {
            if (i == 0) {
                if (!z) {
                    m100741a(this.f118416a, this.f118420f, 17);
                    m100740a(this.f118427m, 0.5f, 0.5f, 4);
                } else {
                    m100741a(this.f118416a, this.f118420f, 49);
                    m100740a(this.f118427m, 1.0f, 1.0f, 0);
                }
                this.f118426l.setVisibility(4);
            } else if (i != 1) {
                if (i == 2) {
                    m100741a(this.f118416a, this.f118420f, 17);
                    this.f118427m.setVisibility(8);
                    this.f118426l.setVisibility(8);
                }
            } else if (z) {
                m100741a(this.f118416a, (int) (((float) this.f118420f) + this.f118421g), 49);
                m100740a(this.f118427m, 1.0f, 1.0f, 0);
                TextView textView5 = this.f118426l;
                float f = this.f118422h;
                m100740a(textView5, f, f, 4);
            } else {
                m100741a(this.f118416a, this.f118420f, 49);
                TextView textView6 = this.f118427m;
                float f2 = this.f118423i;
                m100740a(textView6, f2, f2, 4);
                m100740a(this.f118426l, 1.0f, 1.0f, 0);
            }
        } else if (this.f118425k) {
            if (!z) {
                m100741a(this.f118416a, this.f118420f, 17);
                m100740a(this.f118427m, 0.5f, 0.5f, 4);
            } else {
                m100741a(this.f118416a, this.f118420f, 49);
                m100740a(this.f118427m, 1.0f, 1.0f, 0);
            }
            this.f118426l.setVisibility(4);
        } else if (z) {
            m100741a(this.f118416a, (int) (((float) this.f118420f) + this.f118421g), 49);
            m100740a(this.f118427m, 1.0f, 1.0f, 0);
            TextView textView7 = this.f118426l;
            float f3 = this.f118422h;
            m100740a(textView7, f3, f3, 4);
        } else {
            m100741a(this.f118416a, this.f118420f, 49);
            TextView textView8 = this.f118427m;
            float f4 = this.f118423i;
            m100740a(textView8, f4, f4, 4);
            m100740a(this.f118426l, 1.0f, 1.0f, 0);
        }
        refreshDrawableState();
        setSelected(z);
    }

    /* renamed from: a */
    public final void mo63628a(int i) {
        if (this.f118424j != i) {
            this.f118424j = i;
            C1446vw vwVar = this.f118418c;
            if (vwVar != null) {
                mo63636b(vwVar.isChecked());
            }
        }
    }

    /* renamed from: a */
    public final void mo63629a(ColorStateList colorStateList) {
        Drawable drawable;
        this.f118428n = colorStateList;
        if (this.f118418c != null && (drawable = this.f118430p) != null) {
            C1173lt.m19601a(drawable, colorStateList);
            this.f118430p.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo63630a(Drawable drawable) {
        if (!(drawable == null || drawable.getConstantState() == null)) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C1280ps.m19890a(this, drawable);
    }

    /* renamed from: a */
    public final void mo63631a(View view) {
        if (view == this.f118416a) {
            int i = bhen.f118404a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63632a(bhem bhem) {
        this.f118419d = bhem;
        ImageView imageView = this.f118416a;
        if (imageView != null && mo63638c()) {
            setClipChildren(false);
            setClipToPadding(false);
            bhem bhem2 = this.f118419d;
            mo63631a(imageView);
            bhen.m100726b(bhem2, imageView);
            imageView.getOverlay().add(bhem2);
        }
    }

    /* renamed from: a */
    public final void mo1209a(C1446vw vwVar) {
        CharSequence charSequence;
        this.f118418c = vwVar;
        vwVar.isCheckable();
        refreshDrawableState();
        mo63636b(vwVar.isChecked());
        setEnabled(vwVar.isEnabled());
        Drawable icon = vwVar.getIcon();
        if (icon != this.f118429o) {
            this.f118429o = icon;
            if (icon != null) {
                Drawable.ConstantState constantState = icon.getConstantState();
                if (constantState != null) {
                    icon = constantState.newDrawable();
                }
                int i = Build.VERSION.SDK_INT;
                icon = icon.mutate();
                this.f118430p = icon;
                ColorStateList colorStateList = this.f118428n;
                if (colorStateList != null) {
                    C1173lt.m19601a(icon, colorStateList);
                }
            }
            this.f118416a.setImageDrawable(icon);
        }
        CharSequence charSequence2 = vwVar.f27457d;
        this.f118426l.setText(charSequence2);
        this.f118427m.setText(charSequence2);
        C1446vw vwVar2 = this.f118418c;
        if (vwVar2 == null || TextUtils.isEmpty(vwVar2.f27464k)) {
            setContentDescription(charSequence2);
        }
        C1446vw vwVar3 = this.f118418c;
        if (vwVar3 != null && !TextUtils.isEmpty(vwVar3.f27465l)) {
            charSequence2 = this.f118418c.f27465l;
        }
        aec.m594a(this, charSequence2);
        setId(vwVar.f27454a);
        if (!TextUtils.isEmpty(vwVar.f27464k)) {
            setContentDescription(vwVar.f27464k);
        }
        if (TextUtils.isEmpty(vwVar.f27465l)) {
            charSequence = vwVar.f27457d;
        } else {
            charSequence = vwVar.f27465l;
        }
        aec.m594a(this, charSequence);
        setVisibility(!vwVar.isVisible() ? 8 : 0);
    }

    /* renamed from: a */
    public final void mo63633a(boolean z) {
        if (this.f118425k != z) {
            this.f118425k = z;
            C1446vw vwVar = this.f118418c;
            if (vwVar != null) {
                mo63636b(vwVar.isChecked());
            }
        }
    }
}
