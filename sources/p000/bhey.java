package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import java.util.HashSet;

/* renamed from: bhey */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bhey extends ViewGroup implements C1460wj {

    /* renamed from: p */
    private static final int[] f118432p = {16842912};

    /* renamed from: q */
    private static final int[] f118433q = {-16842910};

    /* renamed from: A */
    private final int[] f118434A;

    /* renamed from: a */
    public final atn f118435a;

    /* renamed from: b */
    public boolean f118436b;

    /* renamed from: c */
    public int f118437c;

    /* renamed from: d */
    public bhev[] f118438d;

    /* renamed from: e */
    public int f118439e = 0;

    /* renamed from: f */
    public int f118440f = 0;

    /* renamed from: g */
    public int f118441g;

    /* renamed from: h */
    public ColorStateList f118442h;

    /* renamed from: i */
    public int f118443i;

    /* renamed from: j */
    public int f118444j;

    /* renamed from: k */
    public Drawable f118445k;

    /* renamed from: l */
    public int f118446l;

    /* renamed from: m */
    public SparseArray f118447m = new SparseArray(5);

    /* renamed from: n */
    public bhfa f118448n;

    /* renamed from: o */
    public C1443vt f118449o;

    /* renamed from: r */
    private final int f118450r;

    /* renamed from: s */
    private final int f118451s;

    /* renamed from: t */
    private final int f118452t;

    /* renamed from: u */
    private final int f118453u;

    /* renamed from: v */
    private final int f118454v;

    /* renamed from: w */
    private final View.OnClickListener f118455w;

    /* renamed from: x */
    private final C1241og f118456x = new C1243oi(5);

    /* renamed from: y */
    private ColorStateList f118457y;

    /* renamed from: z */
    private final ColorStateList f118458z;

    /* renamed from: a */
    public final void mo63645a() {
        bhem bhem;
        removeAllViews();
        bhev[] bhevArr = this.f118438d;
        if (bhevArr != null) {
            for (bhev bhev : bhevArr) {
                if (bhev != null) {
                    this.f118456x.mo8189a(bhev);
                    ImageView imageView = bhev.f118416a;
                    if (bhev.mo63638c()) {
                        if (imageView != null) {
                            bhev.setClipChildren(true);
                            bhev.setClipToPadding(true);
                            bhem bhem2 = bhev.f118419d;
                            bhev.mo63631a(imageView);
                            bhen.m100725a(bhem2, imageView);
                        }
                        bhev.f118419d = null;
                    }
                }
            }
        }
        if (this.f118449o.size() != 0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.f118449o.size(); i++) {
                hashSet.add(Integer.valueOf(this.f118449o.getItem(i).getItemId()));
            }
            for (int i2 = 0; i2 < this.f118447m.size(); i2++) {
                int keyAt = this.f118447m.keyAt(i2);
                if (!hashSet.contains(Integer.valueOf(keyAt))) {
                    this.f118447m.delete(keyAt);
                }
            }
            this.f118438d = new bhev[this.f118449o.size()];
            boolean a = mo63648a(this.f118437c, this.f118449o.mo16255g().size());
            for (int i3 = 0; i3 < this.f118449o.size(); i3++) {
                this.f118448n.f118460b = true;
                this.f118449o.getItem(i3).setCheckable(true);
                this.f118448n.f118460b = false;
                bhev bhev2 = (bhev) this.f118456x.mo8188a();
                if (bhev2 == null) {
                    bhev2 = new bhev(getContext());
                }
                this.f118438d[i3] = bhev2;
                bhev2.mo63629a(this.f118457y);
                bhev2.mo63634b(this.f118441g);
                bhev2.mo63635b(this.f118458z);
                bhev2.mo63637c(this.f118443i);
                bhev2.mo63639d(this.f118444j);
                bhev2.mo63635b(this.f118442h);
                Drawable drawable = this.f118445k;
                if (drawable != null) {
                    bhev2.mo63630a(drawable);
                } else {
                    bhev2.mo63640e(this.f118446l);
                }
                bhev2.mo63633a(a);
                bhev2.mo63628a(this.f118437c);
                bhev2.mo1209a((C1446vw) this.f118449o.getItem(i3));
                bhev2.f118417b = i3;
                bhev2.setOnClickListener(this.f118455w);
                if (this.f118439e != 0 && this.f118449o.getItem(i3).getItemId() == this.f118439e) {
                    this.f118440f = i3;
                }
                int id = bhev2.getId();
                if (!(id == -1 || (bhem = (bhem) this.f118447m.get(id)) == null)) {
                    bhev2.mo63632a(bhem);
                }
                addView(bhev2);
            }
            int min = Math.min(this.f118449o.size() - 1, this.f118440f);
            this.f118440f = min;
            this.f118449o.getItem(min).setChecked(true);
            return;
        }
        this.f118439e = 0;
        this.f118440f = 0;
        this.f118438d = null;
    }

    /* renamed from: a */
    public final void mo1220a(C1443vt vtVar) {
        this.f118449o = vtVar;
    }

    /* renamed from: a */
    public final boolean mo63648a(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    /* renamed from: b */
    public final ColorStateList mo63649b() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            ColorStateList a = C1391tv.m20458a(getContext(), typedValue.resourceId);
            if (getContext().getTheme().resolveAttribute(C0126R.attr.colorPrimary, typedValue, true)) {
                int i = typedValue.data;
                int defaultColor = a.getDefaultColor();
                return new ColorStateList(new int[][]{f118433q, f118432p, EMPTY_STATE_SET}, new int[]{a.getColorForState(f118433q, defaultColor), i, defaultColor});
            }
        }
        return null;
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C1301qm.m20017a(accessibilityNodeInfo).mo15756a(C1299qk.m20013a(1, this.f118449o.mo16255g().size(), 1));
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (C1280ps.m19923h(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.f118449o.mo16255g().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f118454v, JGCastService.FLAG_PRIVATE_DISPLAY);
        int i6 = 1;
        if (!mo63648a(this.f118437c, size2) || !this.f118436b) {
            if (size2 != 0) {
                i6 = size2;
            }
            int min = Math.min(size / i6, this.f118452t);
            int i7 = size - (size2 * min);
            for (int i8 = 0; i8 < childCount; i8++) {
                if (getChildAt(i8).getVisibility() != 8) {
                    int[] iArr = this.f118434A;
                    iArr[i8] = min;
                    if (i7 > 0) {
                        iArr[i8] = min + 1;
                        i7--;
                    }
                } else {
                    this.f118434A[i8] = 0;
                }
            }
            i4 = 0;
            i3 = 0;
        } else {
            View childAt = getChildAt(this.f118440f);
            int i9 = this.f118453u;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f118452t, Integer.MIN_VALUE), makeMeasureSpec);
                i9 = Math.max(i9, childAt.getMeasuredWidth());
            }
            int i10 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.f118451s * i10), Math.min(i9, this.f118452t));
            int i11 = size - min2;
            if (i10 != 0) {
                i6 = i10;
            }
            int min3 = Math.min(i11 / i6, this.f118450r);
            int i12 = i11 - (i10 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.f118434A;
                    if (i13 == this.f118440f) {
                        i5 = min2;
                    } else {
                        i5 = min3;
                    }
                    iArr2[i13] = i5;
                    if (i12 > 0) {
                        iArr2[i13] = i5 + 1;
                        i12--;
                    }
                } else {
                    this.f118434A[i13] = 0;
                }
            }
            i4 = 0;
            i3 = 0;
        }
        while (i4 < childCount) {
            View childAt2 = getChildAt(i4);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f118434A[i4], JGCastService.FLAG_PRIVATE_DISPLAY), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i3 += childAt2.getMeasuredWidth();
            }
            i4++;
        }
        setMeasuredDimension(View.resolveSizeAndState(i3, View.MeasureSpec.makeMeasureSpec(i3, JGCastService.FLAG_PRIVATE_DISPLAY), 0), View.resolveSizeAndState(this.f118454v, makeMeasureSpec, 0));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ps.b(android.view.View, int):void
     arg types: [bhey, int]
     candidates:
      ps.b(android.view.View, qh):qh
      ps.b(android.view.View, float):void
      ps.b(android.view.View, boolean):void
      ps.b(android.view.View, int):void */
    public bhey(Context context) {
        super(context, null);
        Resources resources = getResources();
        this.f118450r = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_item_max_width);
        this.f118451s = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_item_min_width);
        this.f118452t = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_active_item_max_width);
        this.f118453u = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_active_item_min_width);
        this.f118454v = resources.getDimensionPixelSize(C0126R.dimen.design_bottom_navigation_height);
        this.f118458z = mo63649b();
        atn atn = new atn(null);
        this.f118435a = atn;
        atn.mo2493b(0);
        this.f118435a.mo2457a(115);
        this.f118435a.mo2458a(new akc());
        this.f118435a.mo2491a(new bhkh());
        this.f118455w = new bhex(this);
        this.f118434A = new int[5];
        C1280ps.m19906b((View) this, 1);
    }

    /* renamed from: a */
    public final void mo63646a(ColorStateList colorStateList) {
        this.f118457y = colorStateList;
        bhev[] bhevArr = this.f118438d;
        if (bhevArr != null) {
            for (bhev bhev : bhevArr) {
                bhev.mo63629a(colorStateList);
            }
        }
    }

    /* renamed from: a */
    public final void mo63647a(Drawable drawable) {
        this.f118445k = drawable;
        bhev[] bhevArr = this.f118438d;
        if (bhevArr != null) {
            for (bhev bhev : bhevArr) {
                bhev.mo63630a(drawable);
            }
        }
    }
}
