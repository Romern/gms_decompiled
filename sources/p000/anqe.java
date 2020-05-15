package p000;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.plus.audience.AudienceSelectionListView;
import com.google.android.gms.plus.audience.AudienceSelectionScrollView;

/* renamed from: anqe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class anqe extends deu implements LoaderManager.LoaderCallbacks, View.OnClickListener, AbsListView.OnScrollListener, anpf, anpw, anpu, anpt, anpv, anpe {

    /* renamed from: b */
    private int f77432b;

    /* renamed from: c */
    private int f77433c;

    /* renamed from: d */
    private boolean f77434d;

    /* renamed from: h */
    public AudienceSelectionScrollView f77435h;

    /* renamed from: i */
    public FrameLayout f77436i;

    /* renamed from: j */
    public int f77437j = 0;

    /* renamed from: k */
    public int f77438k;

    /* renamed from: l */
    public FrameLayout f77439l;

    /* renamed from: m */
    public boolean f77440m = false;

    /* renamed from: n */
    public boolean f77441n = false;

    /* renamed from: o */
    public boolean f77442o = false;

    /* renamed from: p */
    public boolean f77443p;

    /* renamed from: q */
    public int f77444q = 0;

    /* renamed from: r */
    public int f77445r;

    /* renamed from: s */
    public int f77446s;

    /* renamed from: t */
    public int f77447t;

    /* renamed from: u */
    public int f77448u;

    /* renamed from: v */
    public boolean f77449v;

    /* renamed from: w */
    public boolean f77450w;

    /* renamed from: d */
    public static final int m64977d(int i) {
        return (i & -16777216) == 0 ? i | -16777216 : i;
    }

    /* renamed from: a */
    public final void mo42107a(int i, boolean z) {
        if (i >= this.f77432b && z && this.f77437j == 0) {
            this.f77432b = i;
            this.f77437j = 1;
        }
    }

    /* renamed from: a */
    public final boolean mo42089a() {
        return this.f77442o;
    }

    /* renamed from: b */
    public final void mo42088b(int i) {
        int i2;
        if (this.f77442o) {
            if (this.f77447t != i && i <= this.f77448u) {
                this.f77441n = false;
            }
            this.f77447t = i;
            int i3 = this.f77445r;
            if (i3 != 0) {
                this.f77449v = false;
                this.f77439l.setLayoutParams(new LinearLayout.LayoutParams(-1, i3));
                int dimension = this.f77445r - ((int) getResources().getDimension(C0126R.dimen.plus_add_to_circles_view_margin));
                int dimension2 = (int) getResources().getDimension(C0126R.dimen.plus_add_to_circles_view_padding);
                int dimension3 = i == 0 ? (int) getResources().getDimension(C0126R.dimen.plus_audience_selection_loading_bar_height) : 0;
                int dimension4 = (int) getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_height);
                int dimension5 = (int) getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_padding_extra);
                int dimension6 = (int) getResources().getDimension(C0126R.dimen.plus_create_circle_list_item_height);
                int i4 = dimension5 + dimension5;
                int dimension7 = (i * dimension4) + dimension3 + i4 + ((int) getResources().getDimension(C0126R.dimen.plus_create_circle_list_item_height));
                int i5 = this.f77446s;
                float dimension8 = getResources().getDimension(C0126R.dimen.plus_add_to_circles_view_margin);
                int i6 = i5 - ((int) (dimension8 + dimension8));
                int i7 = (dimension - this.f77438k) - dimension2;
                if (dimension7 > i7) {
                    dimension7 = i7;
                }
                int dimension9 = (int) getResources().getDimension(C0126R.dimen.plus_add_to_circles_picker_max_width);
                if (i6 > dimension9) {
                    i6 = dimension9;
                }
                this.f77436i.setLayoutParams(new LinearLayout.LayoutParams(-1, dimension7));
                LinearLayout linearLayout = (LinearLayout) this.f77436i.getParent();
                if (linearLayout != null) {
                    linearLayout.setLayoutParams(new LinearLayout.LayoutParams(i6, -2));
                }
                if (!this.f77441n) {
                    this.f77441n = true;
                    float f = (float) i;
                    int i8 = this.f77448u;
                    if (i > i8 && !this.f77434d) {
                        i2 = (int) (((((float) i8) + 0.6f) * ((float) dimension4)) + ((float) dimension5) + ((float) this.f77438k) + ((float) dimension2) + ((float) dimension3));
                    } else {
                        i2 = (int) ((f * ((float) dimension4)) + ((float) i4) + ((float) dimension6) + ((float) this.f77438k) + ((float) dimension2) + ((float) dimension3));
                    }
                    if (i2 < dimension) {
                        dimension = i2;
                    } else {
                        this.f77450w = true;
                    }
                    int i9 = this.f77438k;
                    this.f77432b = dimension7 + i9;
                    if (this.f77447t > 2) {
                        this.f77433c = i9 + dimension4 + dimension4 + dimension6;
                    } else {
                        this.f77433c = i9;
                    }
                    ObjectAnimator duration = ObjectAnimator.ofInt(this.f77435h, "scrollY", dimension).setDuration(200L);
                    duration.setInterpolator(new DecelerateInterpolator());
                    duration.addListener(new anqd(this));
                    this.f77435h.postDelayed(new anqa(duration), 50);
                    this.f77435h.postDelayed(new anpy(this), 750);
                    return;
                }
                return;
            }
            this.f77449v = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo42117c(int i) {
        int i2;
        if (!this.f77442o || (i2 = this.f77444q) == 2) {
            return true;
        }
        if (i2 != 1) {
            this.f77444q = 1;
            mo42116a((Animator.AnimatorListener) null);
            this.f77435h.postDelayed(new anpx(this, i), 250);
        }
        return false;
    }

    public final void finish() {
        super.finish();
        if (this.f77442o) {
            overridePendingTransition(0, 0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo42079g();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract void mo42080h();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo42118o() {
        this.f77434d = true;
        this.f77449v = true;
        int i = 0;
        this.f77441n = false;
        this.f77450w = true;
        mo42121p();
        this.f77435h.setVisibility(0);
        this.f77443p = true;
        int i2 = Build.VERSION.SDK_INT;
        this.f77435h.setScrollY(0);
        anpo q = mo42122q();
        if (q != null && q.getListView() != null) {
            ListView listView = q.getListView();
            if (this.f77434d) {
                i = this.f77447t;
            }
            listView.setSelection(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = true;
        if (bundle != null && !bundle.getBoolean("STATE_IS_LIST_CONTAINER_VISIBLE", true)) {
            z = false;
        }
        this.f77443p = z;
        this.f77434d = false;
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("STATE_IS_LIST_CONTAINER_VISIBLE", this.f77443p);
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 0 && this.f77435h.getScrollY() >= this.f77432b) {
            this.f77432b = this.f77435h.getScrollY();
            boolean z = true;
            this.f77437j = 1;
            ViewParent parent = absListView.getParent();
            if (this.f77437j == 0) {
                z = false;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.f77442o && this.f77436i.getVisibility() == 8) {
            this.f77436i.setVisibility(0);
            this.f77435h.scrollTo(0, 0);
            TextView textView = (TextView) findViewById(C0126R.C0129id.add_to_circles_title);
            textView.requestFocus();
            textView.sendAccessibilityEvent(8);
        }
    }

    /* renamed from: p */
    public final void mo42121p() {
        ViewTreeObserver viewTreeObserver = this.f77435h.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new anpz(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public anpo mo42122q() {
        return null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final void mo42116a(Animator.AnimatorListener animatorListener) {
        this.f77440m = false;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.f77435h, "scrollY", 0);
        float dimension = getResources().getDimension(C0126R.dimen.plus_add_to_circles_view_padding);
        int i = this.f77448u;
        ObjectAnimator duration = ofInt.setDuration(Math.max(150L, (((long) this.f77435h.getScrollY()) * 200) / ((long) ((int) (((((((float) i) + 0.6f) * getResources().getDimension(C0126R.dimen.plus_audience_selection_list_update_item_height)) + ((float) this.f77438k)) + ((float) ((int) (dimension + 0.5f)))) + 0.5f)))));
        duration.setInterpolator(new AccelerateDecelerateInterpolator());
        if (animatorListener != null) {
            duration.addListener(animatorListener);
        }
        this.f77435h.postDelayed(new anqb(duration), 50);
    }

    /* renamed from: a */
    public final void mo42105a(AudienceSelectionListView audienceSelectionListView) {
        if (this.f77442o) {
            audienceSelectionListView.getParent().requestDisallowInterceptTouchEvent(this.f77437j != 0);
        }
    }

    /* renamed from: a */
    public final void mo42106a(AudienceSelectionListView audienceSelectionListView, boolean z) {
        if (z && audienceSelectionListView.getChildAt(0) != null && audienceSelectionListView.getFirstVisiblePosition() == 0 && audienceSelectionListView.getChildAt(0).getTop() == 0 && this.f77437j == 1) {
            this.f77437j = 0;
            audienceSelectionListView.getParent().requestDisallowInterceptTouchEvent(false);
        }
    }

    /* renamed from: a */
    public final void mo42108a(AudienceSelectionScrollView audienceSelectionScrollView, int i) {
        if (audienceSelectionScrollView.getId() != C0126R.C0129id.audience_selection_container_view) {
            return;
        }
        if (this.f77440m && i < this.f77433c) {
            this.f77440m = false;
            mo42080h();
        } else if (this.f77437j == 1 && i < this.f77432b) {
            this.f77437j = 0;
        }
    }
}
