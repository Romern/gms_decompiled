package android.support.p002v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.view.AbsSavedState;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.cast.JGCastService;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.Toolbar */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    private int f1320A;

    /* renamed from: B */
    private int f1321B;

    /* renamed from: C */
    private int f1322C;

    /* renamed from: D */
    private int f1323D;

    /* renamed from: E */
    private CharSequence f1324E;

    /* renamed from: F */
    private CharSequence f1325F;

    /* renamed from: G */
    private ColorStateList f1326G;

    /* renamed from: H */
    private ColorStateList f1327H;

    /* renamed from: I */
    private boolean f1328I;

    /* renamed from: J */
    private boolean f1329J;

    /* renamed from: K */
    private final ArrayList f1330K;

    /* renamed from: L */
    private final int[] f1331L;

    /* renamed from: M */
    private aeb f1332M;

    /* renamed from: N */
    private final Runnable f1333N;

    /* renamed from: O */
    private final C0006ads f1334O;

    /* renamed from: a */
    public ActionMenuView f1335a;

    /* renamed from: b */
    public TextView f1336b;

    /* renamed from: c */
    public Drawable f1337c;

    /* renamed from: d */
    public CharSequence f1338d;

    /* renamed from: e */
    public ImageButton f1339e;

    /* renamed from: f */
    public View f1340f;

    /* renamed from: g */
    public Context f1341g;

    /* renamed from: h */
    public int f1342h;

    /* renamed from: i */
    public int f1343i;

    /* renamed from: j */
    public int f1344j;

    /* renamed from: k */
    public int f1345k;

    /* renamed from: l */
    public int f1346l;

    /* renamed from: m */
    public int f1347m;

    /* renamed from: n */
    public int f1348n;

    /* renamed from: o */
    public acr f1349o;

    /* renamed from: p */
    public final ArrayList f1350p;

    /* renamed from: q */
    public adx f1351q;

    /* renamed from: r */
    public C1485xh f1352r;

    /* renamed from: s */
    public adv f1353s;

    /* renamed from: t */
    public C1457wg f1354t;

    /* renamed from: u */
    public C1441vr f1355u;

    /* renamed from: v */
    public boolean f1356v;

    /* renamed from: w */
    private TextView f1357w;

    /* renamed from: x */
    private ImageButton f1358x;

    /* renamed from: y */
    private ImageView f1359y;

    /* renamed from: z */
    private int f1360z;

    /* renamed from: android.support.v7.widget.Toolbar$SavedState */
    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new ady();

        /* renamed from: c */
        int f1361c;

        /* renamed from: d */
        boolean f1362d;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1361c = parcel.readInt();
            this.f1362d = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f1361c);
            parcel.writeInt(this.f1362d ? 1 : 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    private final int m1354a(View view, int i) {
        int i2;
        adw adw = (adw) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        if (i > 0) {
            i2 = (measuredHeight - i) / 2;
        } else {
            i2 = 0;
        }
        int i3 = adw.f26956a & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        if (!(i3 == 16 || i3 == 48 || i3 == 80)) {
            i3 = this.f1323D & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
        }
        if (i3 == 48) {
            return getPaddingTop() - i2;
        }
        if (i3 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - adw.bottomMargin) - i2;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i4 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        if (i4 < adw.topMargin) {
            i4 = adw.topMargin;
        } else {
            int i5 = (((height - paddingBottom) - measuredHeight) - i4) - paddingTop;
            if (i5 < adw.bottomMargin) {
                i4 = Math.max(0, i4 - (adw.bottomMargin - i5));
            }
        }
        return paddingTop + i4;
    }

    /* renamed from: b */
    private final int m1362b(View view, int i, int[] iArr, int i2) {
        adw adw = (adw) view.getLayoutParams();
        int i3 = adw.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int a = m1354a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a, max, view.getMeasuredHeight() + a);
        return max - (measuredWidth + adw.leftMargin);
    }

    /* renamed from: c */
    private static final int m1364c(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1260oz.m19820a(marginLayoutParams) + C1260oz.m19822b(marginLayoutParams);
    }

    /* renamed from: d */
    private static final int m1365d(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: f */
    private final int mo44780f(int i) {
        int h = C1280ps.m19923h(this);
        int a = C1256ov.m19815a(i, h) & 7;
        if (a == 1 || a == 3 || a == 5) {
            return a;
        }
        return h == 1 ? 5 : 3;
    }

    /* renamed from: s */
    public static final adw m1367s() {
        return new adw();
    }

    /* renamed from: t */
    private final void m1368t() {
        if (this.f1359y == null) {
            this.f1359y = new AppCompatImageView(getContext());
        }
    }

    /* renamed from: u */
    private final void m1369u() {
        if (this.f1358x == null) {
            this.f1358x = new AppCompatImageButton(getContext(), null, C0126R.attr.toolbarNavigationButtonStyle);
            adw s = m1367s();
            s.f26956a = (this.f1344j & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) | 8388611;
            this.f1358x.setLayoutParams(s);
        }
    }

    /* renamed from: b */
    public final boolean mo1683b() {
        C1485xh xhVar;
        ActionMenuView actionMenuView = this.f1335a;
        return (actionMenuView == null || (xhVar = actionMenuView.f1165c) == null || !xhVar.mo16470c()) ? false : true;
    }

    /* renamed from: cA */
    public final boolean mo1687cA() {
        C1485xh xhVar;
        ActionMenuView actionMenuView = this.f1335a;
        return (actionMenuView == null || (xhVar = actionMenuView.f1165c) == null || !xhVar.mo16472e()) ? false : true;
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof adw);
    }

    /* renamed from: e */
    public final void mo1691e() {
        adv adv = this.f1353s;
        C1446vw vwVar = adv != null ? adv.f296b : null;
        if (vwVar != null) {
            vwVar.collapseActionView();
        }
    }

    /* renamed from: f */
    public CharSequence mo1693f() {
        return this.f1324E;
    }

    /* renamed from: g */
    public CharSequence mo1694g() {
        return this.f1325F;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1367s();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new adw(getContext(), attributeSet);
    }

    /* renamed from: h */
    public final CharSequence mo1698h() {
        ImageButton imageButton = this.f1358x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    /* renamed from: i */
    public final Drawable mo1699i() {
        ImageButton imageButton = this.f1358x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    /* renamed from: j */
    public final Menu mo1700j() {
        mo1701k();
        return this.f1335a.mo1296a();
    }

    /* renamed from: k */
    public final void mo1701k() {
        mo1702l();
        ActionMenuView actionMenuView = this.f1335a;
        if (actionMenuView.f1163a == null) {
            Menu a = actionMenuView.mo1296a();
            if (this.f1353s == null) {
                this.f1353s = new adv(this);
            }
            this.f1335a.f1165c.mo16474h();
            ((C1443vt) a).mo16225a(this.f1353s, this.f1341g);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.support.v7.widget.ActionMenuView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.content.Context, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: l */
    public final void mo1702l() {
        if (this.f1335a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1335a = actionMenuView;
            actionMenuView.mo1298a(this.f1342h);
            ActionMenuView actionMenuView2 = this.f1335a;
            actionMenuView2.f1167e = this.f1334O;
            actionMenuView2.mo1299a(this.f1354t, this.f1355u);
            adw s = m1367s();
            s.f26956a = (this.f1344j & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS) | 8388613;
            this.f1335a.setLayoutParams(s);
            m1359a((View) this.f1335a, false);
        }
    }

    /* renamed from: m */
    public final int mo1703m() {
        acr acr = this.f1349o;
        if (acr != null) {
            return !acr.f238g ? acr.f232a : acr.f233b;
        }
        return 0;
    }

    /* renamed from: n */
    public final int mo1704n() {
        acr acr = this.f1349o;
        if (acr != null) {
            return !acr.f238g ? acr.f233b : acr.f232a;
        }
        return 0;
    }

    /* renamed from: o */
    public final int mo1705o() {
        return mo1699i() != null ? Math.max(mo1703m(), Math.max(this.f1321B, 0)) : mo1703m();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1333N);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1329J = false;
        }
        if (!this.f1329J) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1329J = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1329J = false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int h = C1280ps.m19923h(this);
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i19 = width - paddingRight;
        int[] iArr = this.f1331L;
        iArr[1] = 0;
        iArr[0] = 0;
        int l = C1280ps.m19930l(this);
        if (l >= 0) {
            i5 = Math.min(l, i4 - i2);
        } else {
            i5 = 0;
        }
        if (!m1361a(this.f1358x)) {
            i7 = paddingLeft;
            i6 = i19;
        } else if (h != 1) {
            i7 = m1356a(this.f1358x, paddingLeft, iArr, i5);
            i6 = i19;
        } else {
            i6 = m1362b(this.f1358x, i19, iArr, i5);
            i7 = paddingLeft;
        }
        if (m1361a(this.f1339e)) {
            if (h != 1) {
                i7 = m1356a(this.f1339e, i7, iArr, i5);
            } else {
                i6 = m1362b(this.f1339e, i6, iArr, i5);
            }
        }
        if (m1361a(this.f1335a)) {
            if (h != 1) {
                i6 = m1362b(this.f1335a, i6, iArr, i5);
            } else {
                i7 = m1356a(this.f1335a, i7, iArr, i5);
            }
        }
        int p = C1280ps.m19923h(this) == 1 ? mo1714p() : mo1705o();
        int o = C1280ps.m19923h(this) == 1 ? mo1705o() : mo1714p();
        int i20 = paddingRight;
        iArr[0] = Math.max(0, p - i7);
        iArr[1] = Math.max(0, o - (i19 - i6));
        int max = Math.max(i7, p);
        int min = Math.min(i6, i19 - o);
        if (m1361a(this.f1340f)) {
            if (h != 1) {
                max = m1356a(this.f1340f, max, iArr, i5);
            } else {
                min = m1362b(this.f1340f, min, iArr, i5);
            }
        }
        if (m1361a(this.f1359y)) {
            if (h != 1) {
                max = m1356a(this.f1359y, max, iArr, i5);
            } else {
                min = m1362b(this.f1359y, min, iArr, i5);
            }
        }
        boolean a = m1361a(this.f1357w);
        boolean a2 = m1361a(this.f1336b);
        if (a) {
            adw adw = (adw) this.f1357w.getLayoutParams();
            i9 = adw.bottomMargin + adw.topMargin + this.f1357w.getMeasuredHeight();
        } else {
            i9 = 0;
        }
        if (a2) {
            adw adw2 = (adw) this.f1336b.getLayoutParams();
            i10 = width;
            i9 += adw2.topMargin + this.f1336b.getMeasuredHeight() + adw2.bottomMargin;
        } else {
            i10 = width;
        }
        if (a || a2) {
            TextView textView = !a ? this.f1336b : this.f1357w;
            TextView textView2 = !a2 ? this.f1357w : this.f1336b;
            adw adw3 = (adw) textView.getLayoutParams();
            adw adw4 = (adw) textView2.getLayoutParams();
            boolean z2 = (!a || this.f1357w.getMeasuredWidth() <= 0) ? a2 && this.f1336b.getMeasuredWidth() > 0 : true;
            i12 = paddingLeft;
            int i21 = this.f1323D & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS;
            i11 = i5;
            if (i21 == 48) {
                i13 = min;
                i14 = getPaddingTop() + adw3.topMargin + this.f1347m;
            } else if (i21 != 80) {
                int i22 = (((height - paddingTop) - paddingBottom) - i9) / 2;
                i13 = min;
                if (i22 < adw3.topMargin + this.f1347m) {
                    i22 = adw3.topMargin + this.f1347m;
                } else {
                    int i23 = (((height - paddingBottom) - i9) - i22) - paddingTop;
                    if (i23 < adw3.bottomMargin + this.f1348n) {
                        i22 = Math.max(0, i22 - ((adw4.bottomMargin + this.f1348n) - i23));
                    }
                }
                i14 = paddingTop + i22;
            } else {
                i13 = min;
                i14 = (((height - paddingBottom) - adw4.bottomMargin) - this.f1348n) - i9;
            }
            if (h != 1) {
                int i24 = (z2 ? this.f1345k : 0) - iArr[0];
                i8 += Math.max(0, i24);
                iArr[0] = Math.max(0, -i24);
                if (a) {
                    int measuredWidth = this.f1357w.getMeasuredWidth() + i8;
                    int measuredHeight = this.f1357w.getMeasuredHeight() + i14;
                    this.f1357w.layout(i8, i14, measuredWidth, measuredHeight);
                    i17 = measuredWidth + this.f1346l;
                    i14 = measuredHeight + ((adw) this.f1357w.getLayoutParams()).bottomMargin;
                } else {
                    i17 = i8;
                }
                if (a2) {
                    adw adw5 = (adw) this.f1336b.getLayoutParams();
                    int i25 = i14 + adw5.topMargin;
                    int measuredWidth2 = this.f1336b.getMeasuredWidth() + i8;
                    this.f1336b.layout(i8, i25, measuredWidth2, this.f1336b.getMeasuredHeight() + i25);
                    i18 = measuredWidth2 + this.f1346l;
                    int i26 = adw5.bottomMargin;
                } else {
                    i18 = i8;
                }
                if (z2) {
                    i8 = Math.max(i17, i18);
                }
                min = i13;
            } else {
                int i27 = (z2 ? this.f1345k : 0) - iArr[1];
                min = i13 - Math.max(0, i27);
                iArr[1] = Math.max(0, -i27);
                if (a) {
                    int measuredWidth3 = min - this.f1357w.getMeasuredWidth();
                    int measuredHeight2 = this.f1357w.getMeasuredHeight() + i14;
                    this.f1357w.layout(measuredWidth3, i14, min, measuredHeight2);
                    i15 = measuredWidth3 - this.f1346l;
                    i14 = measuredHeight2 + ((adw) this.f1357w.getLayoutParams()).bottomMargin;
                } else {
                    i15 = min;
                }
                if (a2) {
                    adw adw6 = (adw) this.f1336b.getLayoutParams();
                    int i28 = i14 + adw6.topMargin;
                    this.f1336b.layout(min - this.f1336b.getMeasuredWidth(), i28, min, this.f1336b.getMeasuredHeight() + i28);
                    i16 = min - this.f1346l;
                    int i29 = adw6.bottomMargin;
                } else {
                    i16 = min;
                }
                if (z2) {
                    min = Math.min(i15, i16);
                }
            }
        } else {
            i12 = paddingLeft;
            i11 = i5;
        }
        m1360a(this.f1330K, 3);
        int size = this.f1330K.size();
        for (int i30 = 0; i30 < size; i30++) {
            i8 = m1356a((View) this.f1330K.get(i30), i8, iArr, i11);
        }
        int i31 = i11;
        m1360a(this.f1330K, 5);
        int size2 = this.f1330K.size();
        for (int i32 = 0; i32 < size2; i32++) {
            min = m1362b((View) this.f1330K.get(i32), min, iArr, i31);
        }
        m1360a(this.f1330K, 1);
        ArrayList arrayList = this.f1330K;
        int i33 = iArr[0];
        int i34 = iArr[1];
        int size3 = arrayList.size();
        int i35 = 0;
        int i36 = 0;
        while (i35 < size3) {
            View view = (View) arrayList.get(i35);
            adw adw7 = (adw) view.getLayoutParams();
            int i37 = adw7.leftMargin - i33;
            int i38 = adw7.rightMargin - i34;
            int max2 = Math.max(0, i37);
            int max3 = Math.max(0, i38);
            int max4 = Math.max(0, -i37);
            int max5 = Math.max(0, -i38);
            i36 += max2 + view.getMeasuredWidth() + max3;
            i35++;
            i34 = max5;
            i33 = max4;
        }
        int i39 = (i12 + (((i10 - i12) - i20) / 2)) - (i36 / 2);
        int i40 = i36 + i39;
        if (i39 >= i8) {
            i8 = i40 > min ? i39 - (i40 - min) : i39;
        }
        int size4 = this.f1330K.size();
        for (int i41 = 0; i41 < size4; i41++) {
            i8 = m1356a((View) this.f1330K.get(i41), i8, iArr, i31);
        }
        this.f1330K.clear();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr = this.f1331L;
        char a = aek.m624a(this);
        char c = a ^ 1;
        int i10 = 0;
        if (m1361a(this.f1358x)) {
            m1358a(this.f1358x, i, 0, i2, this.f1320A);
            i5 = this.f1358x.getMeasuredWidth() + m1364c(this.f1358x);
            i4 = Math.max(0, this.f1358x.getMeasuredHeight() + m1365d(this.f1358x));
            i3 = View.combineMeasuredStates(0, this.f1358x.getMeasuredState());
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
        }
        if (m1361a(this.f1339e)) {
            m1358a(this.f1339e, i, 0, i2, this.f1320A);
            i5 = this.f1339e.getMeasuredWidth() + m1364c(this.f1339e);
            i4 = Math.max(i4, this.f1339e.getMeasuredHeight() + m1365d(this.f1339e));
            i3 = View.combineMeasuredStates(i3, this.f1339e.getMeasuredState());
        }
        int o = mo1705o();
        int max = Math.max(o, i5);
        iArr[a] = Math.max(0, o - i5);
        if (m1361a(this.f1335a)) {
            m1358a(this.f1335a, i, max, i2, this.f1320A);
            i6 = this.f1335a.getMeasuredWidth() + m1364c(this.f1335a);
            i4 = Math.max(i4, this.f1335a.getMeasuredHeight() + m1365d(this.f1335a));
            i3 = View.combineMeasuredStates(i3, this.f1335a.getMeasuredState());
        } else {
            i6 = 0;
        }
        int p = mo1714p();
        int max2 = max + Math.max(p, i6);
        iArr[c] = Math.max(0, p - i6);
        if (m1361a(this.f1340f)) {
            max2 += m1355a(this.f1340f, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1340f.getMeasuredHeight() + m1365d(this.f1340f));
            i3 = View.combineMeasuredStates(i3, this.f1340f.getMeasuredState());
        }
        if (m1361a(this.f1359y)) {
            max2 += m1355a(this.f1359y, i, max2, i2, 0, iArr);
            i4 = Math.max(i4, this.f1359y.getMeasuredHeight() + m1365d(this.f1359y));
            i3 = View.combineMeasuredStates(i3, this.f1359y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((adw) childAt.getLayoutParams()).f298b == 0 && m1361a(childAt)) {
                max2 += m1355a(childAt, i, max2, i2, 0, iArr);
                i4 = Math.max(i4, childAt.getMeasuredHeight() + m1365d(childAt));
                i3 = View.combineMeasuredStates(i3, childAt.getMeasuredState());
            }
        }
        int i12 = this.f1347m + this.f1348n;
        int i13 = this.f1345k + this.f1346l;
        if (m1361a(this.f1357w)) {
            m1355a(this.f1357w, i, max2 + i13, i2, i12, iArr);
            int measuredWidth = this.f1357w.getMeasuredWidth() + m1364c(this.f1357w);
            i7 = this.f1357w.getMeasuredHeight() + m1365d(this.f1357w);
            i9 = View.combineMeasuredStates(i3, this.f1357w.getMeasuredState());
            i8 = measuredWidth;
        } else {
            i9 = i3;
            i8 = 0;
            i7 = 0;
        }
        if (m1361a(this.f1336b)) {
            i8 = Math.max(i8, m1355a(this.f1336b, i, max2 + i13, i2, i7 + i12, iArr));
            i7 += this.f1336b.getMeasuredHeight() + m1365d(this.f1336b);
            i9 = View.combineMeasuredStates(i9, this.f1336b.getMeasuredState());
        }
        int max3 = Math.max(i4, i7);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(max2 + i8 + paddingLeft + paddingRight, getSuggestedMinimumWidth()), i, -16777216 & i9);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(max3 + paddingTop + paddingBottom, getSuggestedMinimumHeight()), i2, i9 << 16);
        if (this.f1356v) {
            int childCount2 = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i14);
                if (m1361a(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i14++;
            }
        }
        i10 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i10);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        C1443vt vtVar;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f1048b);
        ActionMenuView actionMenuView = this.f1335a;
        if (actionMenuView != null) {
            vtVar = actionMenuView.f1163a;
        } else {
            vtVar = null;
        }
        int i = savedState.f1361c;
        if (!(i == 0 || this.f1353s == null || vtVar == null || (findItem = vtVar.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.f1362d) {
            removeCallbacks(this.f1333N);
            post(this.f1333N);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        int i2 = Build.VERSION.SDK_INT;
        super.onRtlPropertiesChanged(i);
        mo1716r();
        acr acr = this.f1349o;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z != acr.f238g) {
            acr.f238g = z;
            if (!acr.f239h) {
                acr.f232a = acr.f236e;
                acr.f233b = acr.f237f;
            } else if (!z) {
                int i3 = acr.f234c;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = acr.f236e;
                }
                acr.f232a = i3;
                int i4 = acr.f235d;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = acr.f237f;
                }
                acr.f233b = i4;
            } else {
                int i5 = acr.f235d;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = acr.f236e;
                }
                acr.f232a = i5;
                int i6 = acr.f234c;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = acr.f237f;
                }
                acr.f233b = i6;
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        C1446vw vwVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        adv adv = this.f1353s;
        if (!(adv == null || (vwVar = adv.f296b) == null)) {
            savedState.f1361c = vwVar.f27454a;
        }
        savedState.f1362d = mo1687cA();
        return savedState;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1328I = false;
        }
        if (!this.f1328I) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1328I = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1328I = false;
        }
        return true;
    }

    /* renamed from: p */
    public final int mo1714p() {
        C1443vt vtVar;
        ActionMenuView actionMenuView = this.f1335a;
        if (actionMenuView == null || (vtVar = actionMenuView.f1163a) == null || !vtVar.hasVisibleItems()) {
            return mo1704n();
        }
        return Math.max(mo1704n(), Math.max(this.f1322C, 0));
    }

    /* renamed from: q */
    public final C1526yv mo1715q() {
        if (this.f1332M == null) {
            this.f1332M = new aeb(this, true);
        }
        return this.f1332M;
    }

    /* renamed from: r */
    public final void mo1716r() {
        if (this.f1349o == null) {
            this.f1349o = new acr();
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0126R.attr.toolbarStyle);
    }

    /* renamed from: b */
    private final boolean m1363b(View view) {
        return view.getParent() == this || this.f1350p.contains(view);
    }

    /* renamed from: c */
    public final void mo1684c(int i) {
        mo1685c(i != 0 ? getContext().getText(i) : null);
    }

    /* renamed from: d */
    public final void mo1689d() {
        ActionMenuView actionMenuView = this.f1335a;
        if (actionMenuView != null) {
            actionMenuView.mo1302b();
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1323D = 8388627;
        this.f1330K = new ArrayList();
        this.f1350p = new ArrayList();
        this.f1331L = new int[2];
        this.f1334O = new C0006ads(this);
        this.f1333N = new adt(this);
        adr a = adr.m523a(getContext(), attributeSet, C1390tu.f27217z, i, 0);
        C1280ps.m19886a(this, context, C1390tu.f27217z, attributeSet, a.f290b, i, 0);
        this.f1360z = a.mo460f(28, 0);
        this.f1343i = a.mo460f(19, 0);
        this.f1323D = a.mo452b(0, this.f1323D);
        this.f1344j = a.mo452b(2, 48);
        int c = a.mo454c(22, 0);
        c = a.mo461f(27) ? a.mo454c(27, c) : c;
        this.f1348n = c;
        this.f1347m = c;
        this.f1346l = c;
        this.f1345k = c;
        int c2 = a.mo454c(25, -1);
        if (c2 >= 0) {
            this.f1345k = c2;
        }
        int c3 = a.mo454c(24, -1);
        if (c3 >= 0) {
            this.f1346l = c3;
        }
        int c4 = a.mo454c(26, -1);
        if (c4 >= 0) {
            this.f1347m = c4;
        }
        int c5 = a.mo454c(23, -1);
        if (c5 >= 0) {
            this.f1348n = c5;
        }
        this.f1320A = a.mo456d(13, -1);
        int c6 = a.mo454c(9, Integer.MIN_VALUE);
        int c7 = a.mo454c(5, Integer.MIN_VALUE);
        int d = a.mo456d(7, 0);
        int d2 = a.mo456d(8, 0);
        mo1716r();
        this.f1349o.mo403b(d, d2);
        if (!(c6 == Integer.MIN_VALUE && c7 == Integer.MIN_VALUE)) {
            this.f1349o.mo402a(c6, c7);
        }
        this.f1321B = a.mo454c(10, Integer.MIN_VALUE);
        this.f1322C = a.mo454c(6, Integer.MIN_VALUE);
        this.f1337c = a.mo449a(4);
        this.f1338d = a.mo455c(3);
        CharSequence c8 = a.mo455c(21);
        if (!TextUtils.isEmpty(c8)) {
            mo1679a(c8);
        }
        CharSequence c9 = a.mo455c(18);
        if (!TextUtils.isEmpty(c9)) {
            mo1682b(c9);
        }
        this.f1341g = getContext();
        mo1674a(a.mo460f(17, 0));
        Drawable a2 = a.mo449a(16);
        if (a2 != null) {
            mo1681b(a2);
        }
        CharSequence c10 = a.mo455c(15);
        if (!TextUtils.isEmpty(c10)) {
            mo1685c(c10);
        }
        Drawable a3 = a.mo449a(11);
        if (a3 != null) {
            mo1677a(a3);
        }
        CharSequence c11 = a.mo455c(12);
        if (!TextUtils.isEmpty(c11)) {
            if (!TextUtils.isEmpty(c11)) {
                m1368t();
            }
            ImageView imageView = this.f1359y;
            if (imageView != null) {
                imageView.setContentDescription(c11);
            }
        }
        if (a.mo461f(29)) {
            mo1676a(a.mo459e(29));
        }
        if (a.mo461f(20)) {
            ColorStateList e = a.mo459e(20);
            this.f1327H = e;
            TextView textView = this.f1336b;
            if (textView != null) {
                textView.setTextColor(e);
            }
        }
        if (a.mo461f(14)) {
            mo1692e(a.mo460f(14, 0));
        }
        a.mo450a();
    }

    /* renamed from: b */
    public final void mo1680b(int i) {
        mo1676a(ColorStateList.valueOf(i));
    }

    /* renamed from: c */
    public final void mo1685c(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m1369u();
        }
        ImageButton imageButton = this.f1358x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    /* renamed from: d */
    public final void mo1690d(int i) {
        mo1681b(C1391tv.m20459b(getContext(), i));
    }

    /* renamed from: e */
    public void mo1692e(int i) {
        new C1422uz(getContext()).inflate(i, mo1700j());
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1357a(layoutParams);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.ImageButton, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.content.Context, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: b */
    public final void mo1681b(Drawable drawable) {
        if (drawable != null) {
            m1369u();
            if (!m1363b(this.f1358x)) {
                m1359a((View) this.f1358x, true);
            }
        } else {
            ImageButton imageButton = this.f1358x;
            if (imageButton != null && m1363b(imageButton)) {
                removeView(this.f1358x);
                this.f1350p.remove(this.f1358x);
            }
        }
        ImageButton imageButton2 = this.f1358x;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    /* renamed from: c */
    public final boolean mo1686c() {
        C1485xh xhVar;
        ActionMenuView actionMenuView = this.f1335a;
        return (actionMenuView == null || (xhVar = actionMenuView.f1165c) == null || !xhVar.mo16471d()) ? false : true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.content.Context, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: b */
    public void mo1682b(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1336b;
            if (textView != null && m1363b(textView)) {
                removeView(this.f1336b);
                this.f1350p.remove(this.f1336b);
            }
        } else {
            if (this.f1336b == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1336b = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1336b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1343i;
                if (i != 0) {
                    this.f1336b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1327H;
                if (colorStateList != null) {
                    this.f1336b.setTextColor(colorStateList);
                }
            }
            if (!m1363b(this.f1336b)) {
                m1359a((View) this.f1336b, true);
            }
        }
        TextView textView2 = this.f1336b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1325F = charSequence;
    }

    /* renamed from: a */
    private final int m1355a(View view, int i, int i2, int i3, int i4, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i5 = marginLayoutParams.leftMargin - iArr[0];
        int i6 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + max + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    /* renamed from: a */
    private final int m1356a(View view, int i, int[] iArr, int i2) {
        adw adw = (adw) view.getLayoutParams();
        int i3 = adw.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int a = m1354a(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a, max + measuredWidth, view.getMeasuredHeight() + a);
        return max + measuredWidth + adw.rightMargin;
    }

    /* renamed from: a */
    protected static final adw m1357a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof adw) {
            return new adw((adw) layoutParams);
        }
        if (layoutParams instanceof C1339rx) {
            return new adw((C1339rx) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new adw((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new adw(layoutParams);
    }

    /* renamed from: a */
    private final void m1358a(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: a */
    private final void m1359a(View view, boolean z) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        adw s = layoutParams == null ? m1367s() : !checkLayoutParams(layoutParams) ? m1357a(layoutParams) : (adw) layoutParams;
        s.f298b = 1;
        if (!z || this.f1340f == null) {
            addView(view, s);
            return;
        }
        view.setLayoutParams(s);
        this.f1350p.add(view);
    }

    /* renamed from: a */
    private final void m1360a(List list, int i) {
        int h = C1280ps.m19923h(this);
        int childCount = getChildCount();
        int a = C1256ov.m19815a(i, C1280ps.m19923h(this));
        list.clear();
        if (h == 1) {
            for (int i2 = childCount - 1; i2 >= 0; i2--) {
                View childAt = getChildAt(i2);
                adw adw = (adw) childAt.getLayoutParams();
                if (adw.f298b == 0 && m1361a(childAt) && mo44780f(adw.f26956a) == a) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = getChildAt(i3);
            adw adw2 = (adw) childAt2.getLayoutParams();
            if (adw2.f298b == 0 && m1361a(childAt2) && mo44780f(adw2.f26956a) == a) {
                list.add(childAt2);
            }
        }
    }

    /* renamed from: a */
    private final boolean m1361a(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* renamed from: a */
    public final void mo1674a(int i) {
        if (this.f1342h != i) {
            this.f1342h = i;
            if (i != 0) {
                this.f1341g = new ContextThemeWrapper(getContext(), i);
            } else {
                this.f1341g = getContext();
            }
        }
    }

    /* renamed from: a */
    public final void mo1675a(Context context, int i) {
        this.f1360z = i;
        TextView textView = this.f1357w;
        if (textView != null) {
            textView.setTextAppearance(context, i);
        }
    }

    /* renamed from: a */
    public final void mo1676a(ColorStateList colorStateList) {
        this.f1326G = colorStateList;
        TextView textView = this.f1357w;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.ImageView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.content.Context, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: a */
    public final void mo1677a(Drawable drawable) {
        if (drawable != null) {
            m1368t();
            if (!m1363b(this.f1359y)) {
                m1359a((View) this.f1359y, true);
            }
        } else {
            ImageView imageView = this.f1359y;
            if (imageView != null && m1363b(imageView)) {
                removeView(this.f1359y);
                this.f1350p.remove(this.f1359y);
            }
        }
        ImageView imageView2 = this.f1359y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    /* renamed from: a */
    public void mo1678a(View.OnClickListener onClickListener) {
        m1369u();
        this.f1358x.setOnClickListener(onClickListener);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: android.support.v7.widget.Toolbar.a(android.view.View, boolean):void
     arg types: [android.widget.TextView, int]
     candidates:
      android.support.v7.widget.Toolbar.a(android.view.View, int):int
      android.support.v7.widget.Toolbar.a(java.util.List, int):void
      android.support.v7.widget.Toolbar.a(android.content.Context, int):void
      android.support.v7.widget.Toolbar.a(android.view.View, boolean):void */
    /* renamed from: a */
    public void mo1679a(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f1357w;
            if (textView != null && m1363b(textView)) {
                removeView(this.f1357w);
                this.f1350p.remove(this.f1357w);
            }
        } else {
            if (this.f1357w == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.f1357w = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.f1357w.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f1360z;
                if (i != 0) {
                    this.f1357w.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f1326G;
                if (colorStateList != null) {
                    this.f1357w.setTextColor(colorStateList);
                }
            }
            if (!m1363b(this.f1357w)) {
                m1359a((View) this.f1357w, true);
            }
        }
        TextView textView2 = this.f1357w;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1324E = charSequence;
    }
}
