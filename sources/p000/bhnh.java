package p000;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.snackbar.SnackbarContentLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bhnh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhnh extends bhnd {

    /* renamed from: p */
    private static final int[] f119125p = {C0126R.attr.snackbarButtonStyle, C0126R.attr.snackbarTextViewStyle};

    /* renamed from: n */
    private final AccessibilityManager f119126n;

    /* renamed from: o */
    private boolean f119127o;

    /* renamed from: q */
    private bhmz f119128q;

    private bhnh(ViewGroup viewGroup, View view, SnackbarContentLayout snackbarContentLayout) {
        super(viewGroup, view, snackbarContentLayout);
        this.f119126n = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* renamed from: a */
    public static bhnh m101201a(View view, int i, int i2) {
        return m101202a(view, view.getResources().getText(i), i2);
    }

    /* renamed from: b */
    public final int mo64019b() {
        int i;
        int i2 = this.f119111f;
        if (i2 == -2) {
            return -2;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (!this.f119127o) {
            i = 0;
        } else {
            i = 4;
        }
        return this.f119126n.getRecommendedTimeoutMillis(i2, i | 3);
    }

    /* renamed from: c */
    public final void mo64034c(int i) {
        this.f119110e.setBackgroundTintList(ColorStateList.valueOf(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public static bhnh m101202a(View view, CharSequence charSequence, int i) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (view instanceof FrameLayout) {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
            }
            if (view != null) {
                ViewParent parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                    continue;
                } else {
                    view = null;
                    continue;
                }
            }
            if (view == null) {
                viewGroup = viewGroup2;
                break;
            }
        }
        if (viewGroup != null) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes(f119125p);
            int resourceId = obtainStyledAttributes.getResourceId(0, -1);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
            obtainStyledAttributes.recycle();
            int i2 = C0126R.C0128layout.design_layout_snackbar_include;
            if (!(resourceId == -1 || resourceId2 == -1)) {
                i2 = C0126R.C0128layout.mtrl_layout_snackbar_include;
            }
            SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(i2, viewGroup, false);
            bhnh bhnh = new bhnh(viewGroup, snackbarContentLayout, snackbarContentLayout);
            ((SnackbarContentLayout) bhnh.f119110e.getChildAt(0)).f151225a.setText(charSequence);
            bhnh.f119111f = i;
            return bhnh;
        }
        throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
    }

    /* renamed from: b */
    public final void mo64033b(int i) {
        ((SnackbarContentLayout) this.f119110e.getChildAt(0)).f151226b.setTextColor(i);
    }

    /* renamed from: a */
    public final void mo64030a(int i, View.OnClickListener onClickListener) {
        mo64032a(this.f119109d.getText(i), onClickListener);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo64031a(bhng bhng) {
        List list;
        bhmz bhmz = this.f119128q;
        if (!(bhmz == null || (list = this.f119116k) == null)) {
            list.remove(bhmz);
        }
        if (this.f119116k == null) {
            this.f119116k = new ArrayList();
        }
        this.f119116k.add(bhng);
        this.f119128q = bhng;
    }

    /* renamed from: a */
    public final void mo64032a(CharSequence charSequence, View.OnClickListener onClickListener) {
        Button button = ((SnackbarContentLayout) this.f119110e.getChildAt(0)).f151226b;
        if (!TextUtils.isEmpty(charSequence) && onClickListener != null) {
            this.f119127o = true;
            button.setVisibility(0);
            button.setText(charSequence);
            button.setOnClickListener(new bhnf(this, onClickListener));
            return;
        }
        button.setVisibility(8);
        button.setOnClickListener(null);
        this.f119127o = false;
    }
}
