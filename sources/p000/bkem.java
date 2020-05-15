package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import java.util.HashMap;

/* renamed from: bkem */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkem implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final boolean f124089a;

    /* renamed from: b */
    private final Context f124090b;

    /* renamed from: c */
    private final HashMap f124091c = new HashMap();

    public bkem(Context context, ViewTreeObserver viewTreeObserver) {
        this.f124090b = context;
        viewTreeObserver.addOnGlobalLayoutListener(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.internalUicMaterialFieldLayoutEnabled});
        this.f124089a = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    public static View m105437a(Context context, View view, ViewGroup viewGroup, int i) {
        return m105438a(context, view, viewGroup, i, false);
    }

    /* renamed from: b */
    public final void mo65901b(View view) {
        this.f124091c.remove(view);
    }

    public final void onGlobalLayout() {
        for (View view : this.f124091c.keySet()) {
            View view2 = (View) this.f124091c.get(view);
            if (view2 instanceof MaterialFieldLayout) {
                view2.setVisibility(view.getVisibility());
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static View m105438a(Context context, View view, ViewGroup viewGroup, int i, boolean z) {
        if (!MaterialFieldLayout.m118673a(view)) {
            return view;
        }
        MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) LayoutInflater.from(context).inflate((int) C0126R.C0128layout.view_material_field_layout, viewGroup, false);
        if (view.getLayoutParams() != null) {
            ViewGroup.LayoutParams layoutParams = materialFieldLayout.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(view.getLayoutParams().width, -2);
            } else {
                layoutParams.width = view.getLayoutParams().width;
            }
            materialFieldLayout.setLayoutParams(layoutParams);
        }
        materialFieldLayout.setId(i);
        materialFieldLayout.addView(view);
        materialFieldLayout.f152154i = z;
        return materialFieldLayout;
    }

    /* renamed from: a */
    public static void m105439a(View view, CharSequence charSequence) {
        if (view instanceof MaterialFieldLayout) {
            ((MaterialFieldLayout) view).mo72053c(charSequence);
        }
    }

    /* renamed from: a */
    public final View mo65898a(View view) {
        return this.f124091c.containsKey(view) ? (View) this.f124091c.get(view) : view;
    }

    /* renamed from: a */
    public final View mo65899a(View view, ViewGroup viewGroup, bjxv bjxv) {
        View a;
        if (this.f124091c.containsKey(view)) {
            return (View) this.f124091c.get(view);
        }
        if (view instanceof bkdd) {
            View b = ((bkdd) view).mo65860b();
            if (b == null || this.f124091c.containsKey(b)) {
                return view;
            }
            this.f124091c.put(b, view);
            return view;
        } else if (!this.f124089a || (a = m105437a(this.f124090b, view, viewGroup, bjxv.mo65614a())) == view) {
            return view;
        } else {
            this.f124091c.put(view, a);
            return a;
        }
    }

    /* renamed from: a */
    public final void mo65900a() {
        this.f124091c.clear();
    }
}
