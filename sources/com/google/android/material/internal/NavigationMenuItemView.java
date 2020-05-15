package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import com.felicanetworks.mfc.C0126R;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NavigationMenuItemView extends bhjh implements C1459wi {

    /* renamed from: n */
    private static final int[] f151204n = {16842912};

    /* renamed from: c */
    public int f151205c;

    /* renamed from: d */
    public boolean f151206d;

    /* renamed from: e */
    public boolean f151207e;

    /* renamed from: i */
    public final CheckedTextView f151208i;

    /* renamed from: j */
    public FrameLayout f151209j;

    /* renamed from: k */
    public C1446vw f151210k;

    /* renamed from: l */
    public ColorStateList f151211l;

    /* renamed from: m */
    public boolean f151212m;

    /* renamed from: o */
    private Drawable f151213o;

    /* renamed from: p */
    private final C1251oq f151214p;

    public NavigationMenuItemView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final C1446vw mo1208a() {
        return this.f151210k;
    }

    /* renamed from: b */
    public final boolean mo1210b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1446vw vwVar = this.f151210k;
        if (vwVar != null && vwVar.isCheckable() && this.f151210k.isChecked()) {
            mergeDrawableStates(onCreateDrawableState, f151204n);
        }
        return onCreateDrawableState;
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public final void mo71202a(Drawable drawable) {
        if (drawable != null) {
            if (this.f151212m) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                int i = Build.VERSION.SDK_INT;
                drawable = drawable.mutate();
                C1173lt.m19601a(drawable, this.f151211l);
            }
            int i2 = this.f151205c;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f151206d) {
            if (this.f151213o == null) {
                Drawable a = C1163lk.m19268a(getResources(), (int) C0126R.C0127drawable.navigation_empty_icon, getContext().getTheme());
                this.f151213o = a;
                if (a != null) {
                    int i3 = this.f151205c;
                    a.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f151213o;
        }
        C1334rs.m20105a(this.f151208i, drawable, null, null, null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.material.internal.NavigationMenuItemView, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f151214p = new bhjj(this);
        mo1410d(0);
        LayoutInflater.from(context).inflate((int) C0126R.C0128layout.design_navigation_menu_item, (ViewGroup) this, true);
        this.f151205c = context.getResources().getDimensionPixelSize(C0126R.dimen.design_navigation_icon_size);
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(C0126R.C0129id.design_menu_item_text);
        this.f151208i = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        C1280ps.m19894a(this.f151208i, this.f151214p);
    }

    /* renamed from: a */
    public final void mo1209a(C1446vw vwVar) {
        StateListDrawable stateListDrawable;
        this.f151210k = vwVar;
        int i = vwVar.f27454a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(!vwVar.isVisible() ? 8 : 0);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(C0126R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f151204n, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            C1280ps.m19890a(this, stateListDrawable);
        }
        boolean isCheckable = vwVar.isCheckable();
        refreshDrawableState();
        if (this.f151207e != isCheckable) {
            this.f151207e = isCheckable;
            this.f151214p.mo343a(this.f151208i, 2048);
        }
        boolean isChecked = vwVar.isChecked();
        refreshDrawableState();
        this.f151208i.setChecked(isChecked);
        setEnabled(vwVar.isEnabled());
        this.f151208i.setText(vwVar.f27457d);
        mo71202a(vwVar.getIcon());
        View actionView = vwVar.getActionView();
        if (actionView != null) {
            if (this.f151209j == null) {
                this.f151209j = (FrameLayout) ((ViewStub) findViewById(C0126R.C0129id.design_menu_item_action_area_stub)).inflate();
            }
            this.f151209j.removeAllViews();
            this.f151209j.addView(actionView);
        }
        setContentDescription(vwVar.f27464k);
        aec.m594a(this, vwVar.f27465l);
        C1446vw vwVar2 = this.f151210k;
        if (vwVar2.f27457d == null && vwVar2.getIcon() == null && this.f151210k.getActionView() != null) {
            this.f151208i.setVisibility(8);
            FrameLayout frameLayout = this.f151209j;
            if (frameLayout != null) {
                aac aac = (aac) frameLayout.getLayoutParams();
                aac.width = -1;
                this.f151209j.setLayoutParams(aac);
                return;
            }
            return;
        }
        this.f151208i.setVisibility(0);
        FrameLayout frameLayout2 = this.f151209j;
        if (frameLayout2 != null) {
            aac aac2 = (aac) frameLayout2.getLayoutParams();
            aac2.width = -2;
            this.f151209j.setLayoutParams(aac2);
        }
    }
}
