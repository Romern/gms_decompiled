package p000;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: bhfq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bhfq extends C1374te {

    /* renamed from: a */
    boolean f118479a;

    /* renamed from: b */
    public boolean f118480b;

    /* renamed from: c */
    public boolean f118481c;

    /* renamed from: d */
    private BottomSheetBehavior f118482d;

    /* renamed from: e */
    private FrameLayout f118483e;

    /* renamed from: f */
    private bhfj f118484f;

    public bhfq(Context context) {
        this(context, 0);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, androidx.coordinatorlayout.widget.CoordinatorLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    private final View m100793a(int i, View view, ViewGroup.LayoutParams layoutParams) {
        m100794d();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f118483e.findViewById(C0126R.C0129id.coordinator);
        if (i != 0 && view == null) {
            view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f118483e.findViewById(C0126R.C0129id.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C0126R.C0129id.touch_outside).setOnClickListener(new bhfm(this));
        C1280ps.m19894a(frameLayout, new bhfn(this));
        frameLayout.setOnTouchListener(new bhfo());
        return this.f118483e;
    }

    /* renamed from: d */
    private final void m100794d() {
        if (this.f118483e == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C0126R.C0128layout.design_bottom_sheet_dialog, null);
            this.f118483e = frameLayout;
            BottomSheetBehavior e = BottomSheetBehavior.m117480e((FrameLayout) frameLayout.findViewById(C0126R.C0129id.design_bottom_sheet));
            this.f118482d = e;
            e.mo71034b(this.f118484f);
            this.f118482d.mo71035b(this.f118479a);
        }
    }

    public final void cancel() {
        mo63666a();
        super.cancel();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            int i = Build.VERSION.SDK_INT;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        BottomSheetBehavior bottomSheetBehavior = this.f118482d;
        if (bottomSheetBehavior != null && bottomSheetBehavior.f151099m == 5) {
            bottomSheetBehavior.mo71037c(4);
        }
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f118479a != z) {
            this.f118479a = z;
            BottomSheetBehavior bottomSheetBehavior = this.f118482d;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.mo71035b(z);
            }
        }
    }

    public final void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f118479a) {
            this.f118479a = true;
        }
        this.f118480b = z;
        this.f118481c = true;
    }

    public final void setContentView(int i) {
        super.setContentView(m100793a(i, null, null));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public bhfq(Context context, int i) {
        super(context, i);
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            i = context.getTheme().resolveAttribute(C0126R.attr.bottomSheetDialogTheme, typedValue, true) ? typedValue.resourceId : 2132018592;
        }
        this.f118479a = true;
        this.f118480b = true;
        this.f118484f = new bhfp(this);
        mo16006c();
    }

    public final void setContentView(View view) {
        super.setContentView(m100793a(0, view, null));
    }

    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m100793a(0, view, layoutParams));
    }

    /* renamed from: a */
    public final BottomSheetBehavior mo63666a() {
        if (this.f118482d == null) {
            m100794d();
        }
        return this.f118482d;
    }
}
