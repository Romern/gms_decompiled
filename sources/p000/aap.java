package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;

/* renamed from: aap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class aap implements C1462wl {

    /* renamed from: a */
    private Context f56a;

    /* renamed from: b */
    private ListAdapter f57b;

    /* renamed from: c */
    private int f58c;

    /* renamed from: d */
    private int f59d;

    /* renamed from: e */
    public C1543zl f60e;

    /* renamed from: f */
    public int f61f;

    /* renamed from: g */
    public int f62g;

    /* renamed from: h */
    public boolean f63h;

    /* renamed from: i */
    public boolean f64i;

    /* renamed from: j */
    public int f65j;

    /* renamed from: k */
    int f66k;

    /* renamed from: l */
    public View f67l;

    /* renamed from: m */
    public AdapterView.OnItemClickListener f68m;

    /* renamed from: n */
    final aao f69n;

    /* renamed from: o */
    final Handler f70o;

    /* renamed from: p */
    public boolean f71p;

    /* renamed from: q */
    public PopupWindow f72q;

    /* renamed from: r */
    private int f73r;

    /* renamed from: s */
    private boolean f74s;

    /* renamed from: t */
    private DataSetObserver f75t;

    /* renamed from: u */
    private final aan f76u;

    /* renamed from: v */
    private final aam f77v;

    /* renamed from: w */
    private final aak f78w;

    /* renamed from: x */
    private final Rect f79x;

    /* renamed from: y */
    private Rect f80y;

    static {
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
    }

    public aap(Context context) {
        this(context, null, C0126R.attr.listPopupWindowStyle);
    }

    /* renamed from: a */
    public C1543zl mo95a(Context context, boolean z) {
        return new C1543zl(context, z);
    }

    /* renamed from: a */
    public final void mo96a(int i) {
        this.f59d = i;
        this.f74s = true;
    }

    /* renamed from: aI */
    public final void mo101aI() {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.f60e == null) {
            Context context = this.f56a;
            new aai(this);
            C1543zl a = mo95a(context, !this.f71p);
            this.f60e = a;
            a.setAdapter(this.f57b);
            this.f60e.setOnItemClickListener(this.f68m);
            this.f60e.setFocusable(true);
            this.f60e.setFocusableInTouchMode(true);
            this.f60e.setOnItemSelectedListener(new aaj(this));
            this.f60e.setOnScrollListener(this.f77v);
            this.f72q.setContentView(this.f60e);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.f72q.getContentView();
        }
        Drawable background = this.f72q.getBackground();
        int i7 = 0;
        if (background != null) {
            background.getPadding(this.f79x);
            i = this.f79x.top + this.f79x.bottom;
            if (!this.f74s) {
                this.f59d = -this.f79x.top;
            }
        } else {
            this.f79x.setEmpty();
            i = 0;
        }
        if (this.f72q.getInputMethodMode() == 2) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f67l;
        int i8 = this.f59d;
        int i9 = Build.VERSION.SDK_INT;
        int maxAvailableHeight = this.f72q.getMaxAvailableHeight(view, i8, z);
        if (this.f58c != -1) {
            int i10 = this.f61f;
            if (i10 == -2) {
                i5 = View.MeasureSpec.makeMeasureSpec(this.f56a.getResources().getDisplayMetrics().widthPixels - (this.f79x.left + this.f79x.right), Integer.MIN_VALUE);
            } else if (i10 != -1) {
                i5 = View.MeasureSpec.makeMeasureSpec(i10, JGCastService.FLAG_PRIVATE_DISPLAY);
            } else {
                i5 = View.MeasureSpec.makeMeasureSpec(this.f56a.getResources().getDisplayMetrics().widthPixels - (this.f79x.left + this.f79x.right), JGCastService.FLAG_PRIVATE_DISPLAY);
            }
            int a2 = this.f60e.mo16616a(i5, maxAvailableHeight);
            if (a2 > 0) {
                i6 = i + this.f60e.getPaddingTop() + this.f60e.getPaddingBottom();
            } else {
                i6 = 0;
            }
            i2 = a2 + i6;
        } else {
            i2 = maxAvailableHeight + i;
        }
        boolean j = mo111j();
        C1333rr.m20100a(this.f72q, this.f73r);
        if (!this.f72q.isShowing()) {
            int i11 = this.f61f;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.f67l.getWidth();
            }
            int i12 = this.f58c;
            if (i12 == -1) {
                i2 = -1;
            } else if (i12 != -2) {
                i2 = i12;
            }
            this.f72q.setWidth(i11);
            this.f72q.setHeight(i2);
            int i13 = Build.VERSION.SDK_INT;
            this.f72q.setIsClippedToScreen(true);
            this.f72q.setOutsideTouchable(true);
            this.f72q.setTouchInterceptor(this.f76u);
            if (this.f64i) {
                C1333rr.m20101a(this.f72q, this.f63h);
            }
            int i14 = Build.VERSION.SDK_INT;
            this.f72q.setEpicenterBounds(this.f80y);
            PopupWindow popupWindow = this.f72q;
            View view2 = this.f67l;
            int i15 = this.f62g;
            int i16 = this.f59d;
            int i17 = this.f65j;
            int i18 = Build.VERSION.SDK_INT;
            popupWindow.showAsDropDown(view2, i15, i16, i17);
            this.f60e.setSelection(-1);
            if (!this.f71p || this.f60e.isInTouchMode()) {
                mo110i();
            }
            if (!this.f71p) {
                this.f70o.post(this.f78w);
            }
        } else if (C1280ps.m19871F(this.f67l)) {
            int i19 = this.f61f;
            if (i19 == -1) {
                i19 = -1;
            } else if (i19 == -2) {
                i19 = this.f67l.getWidth();
            }
            int i20 = this.f58c;
            if (i20 == -1) {
                if (!j) {
                    i2 = -1;
                }
                if (!j) {
                    PopupWindow popupWindow2 = this.f72q;
                    if (this.f61f == -1) {
                        i7 = -1;
                    }
                    popupWindow2.setWidth(i7);
                    this.f72q.setHeight(-1);
                } else {
                    PopupWindow popupWindow3 = this.f72q;
                    if (this.f61f == -1) {
                        i4 = -1;
                    } else {
                        i4 = 0;
                    }
                    popupWindow3.setWidth(i4);
                    this.f72q.setHeight(0);
                }
            } else if (i20 != -2) {
                i2 = i20;
            }
            this.f72q.setOutsideTouchable(true);
            PopupWindow popupWindow4 = this.f72q;
            View view3 = this.f67l;
            int i21 = this.f62g;
            int i22 = this.f59d;
            if (i19 < 0) {
                i3 = -1;
            } else {
                i3 = i19;
            }
            popupWindow4.update(view3, i21, i22, i3, i2 < 0 ? -1 : i2);
        }
    }

    /* renamed from: b */
    public final Drawable mo102b() {
        return this.f72q.getBackground();
    }

    /* renamed from: b */
    public final void mo103b(int i) {
        this.f62g = i;
    }

    /* renamed from: c */
    public final int mo104c() {
        if (this.f74s) {
            return this.f59d;
        }
        return 0;
    }

    /* renamed from: d */
    public final void mo105d() {
        this.f72q.dismiss();
        this.f72q.setContentView(null);
        this.f60e = null;
        this.f70o.removeCallbacks(this.f69n);
    }

    /* renamed from: e */
    public final boolean mo107e() {
        return this.f72q.isShowing();
    }

    /* renamed from: f */
    public final int mo108f() {
        return this.f62g;
    }

    /* renamed from: g */
    public final ListView mo109g() {
        return this.f60e;
    }

    /* renamed from: i */
    public final void mo110i() {
        C1543zl zlVar = this.f60e;
        if (zlVar != null) {
            zlVar.f27742a = true;
            zlVar.requestLayout();
        }
    }

    /* renamed from: j */
    public final boolean mo111j() {
        return this.f72q.getInputMethodMode() == 2;
    }

    /* renamed from: k */
    public final int mo112k() {
        if (mo107e()) {
            return this.f60e.getSelectedItemPosition();
        }
        return -1;
    }

    /* renamed from: l */
    public final void mo113l() {
        this.f72q.setInputMethodMode(2);
    }

    /* renamed from: m */
    public final void mo114m() {
        this.f71p = true;
        this.f72q.setFocusable(true);
    }

    public aap(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null);
    }

    public aap(Context context, AttributeSet attributeSet, int i, byte[] bArr) {
        this.f58c = -2;
        this.f61f = -2;
        this.f73r = 1002;
        this.f65j = 0;
        this.f66k = Integer.MAX_VALUE;
        this.f69n = new aao(this);
        this.f76u = new aan(this);
        this.f77v = new aam(this);
        this.f78w = new aak(this);
        this.f79x = new Rect();
        this.f56a = context;
        this.f70o = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1390tu.f27207p, i, 0);
        this.f62g = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f59d = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f74s = true;
        }
        obtainStyledAttributes.recycle();
        C1501xx xxVar = new C1501xx(context, attributeSet, i);
        this.f72q = xxVar;
        xxVar.setInputMethodMode(1);
    }

    /* renamed from: a */
    public final void mo97a(Rect rect) {
        this.f80y = rect != null ? new Rect(rect) : null;
    }

    /* renamed from: a */
    public final void mo98a(Drawable drawable) {
        this.f72q.setBackgroundDrawable(drawable);
    }

    /* renamed from: d */
    public final void mo106d(int i) {
        Drawable background = this.f72q.getBackground();
        if (background != null) {
            background.getPadding(this.f79x);
            this.f61f = this.f79x.left + this.f79x.right + i;
            return;
        }
        this.f61f = i;
    }

    /* renamed from: a */
    public void mo99a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f75t;
        if (dataSetObserver == null) {
            this.f75t = new aal(this);
        } else {
            ListAdapter listAdapter2 = this.f57b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f57b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f75t);
        }
        C1543zl zlVar = this.f60e;
        if (zlVar != null) {
            zlVar.setAdapter(this.f57b);
        }
    }

    /* renamed from: a */
    public final void mo100a(PopupWindow.OnDismissListener onDismissListener) {
        this.f72q.setOnDismissListener(onDismissListener);
    }
}
