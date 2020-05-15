package com.google.android.wallet.p097ui.creditcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.view.ViewTreeObserver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.creditcard.CreditCardNumberEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CreditCardNumberEditText extends FormEditText implements View.OnClickListener, Runnable, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public static final List f152256a = Collections.unmodifiableList(Arrays.asList(4, 4, 4, 4));

    /* renamed from: b */
    public String f152257b = "";

    /* renamed from: c */
    public ColorStateList f152258c;

    /* renamed from: d */
    public String f152259d;

    /* renamed from: e */
    public String f152260e;

    /* renamed from: f */
    public boolean f152261f;

    /* renamed from: g */
    boolean f152262g;

    /* renamed from: h */
    public bkho f152263h;

    /* renamed from: i */
    public List f152264i;

    /* renamed from: j */
    public final ArrayList f152265j = new ArrayList();

    /* renamed from: k */
    public Pair f152266k;

    /* renamed from: l */
    public List f152267l;

    /* renamed from: m */
    public bmhs f152268m;

    /* renamed from: n */
    Handler f152269n;

    /* renamed from: o */
    ArrayList f152270o;

    /* renamed from: p */
    public bkcr f152271p;

    /* renamed from: q */
    public bkcr f152272q;

    /* renamed from: r */
    private boolean f152273r;

    /* renamed from: s */
    private final int[] f152274s = {-1, -1};

    /* renamed from: t */
    private final TextWatcher f152275t = new bkhn(this);

    public CreditCardNumberEditText(Context context) {
        super(context);
        m118784a(context);
    }

    /* renamed from: a */
    public static bmhs m118783a(List list, String str) {
        if (list != null) {
            int length = str.length();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bmhs bmhs = (bmhs) list.get(i);
                int length2 = bmhs.f129482a.length();
                if (length >= length2) {
                    String substring = str.substring(0, length2);
                    if (substring.compareTo(bmhs.f129482a) >= 0 && substring.compareTo(bmhs.f129483b) <= 0) {
                        return bmhs;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    private final void m118786b(bkcr bkcr) {
        if (getAdapter() == null) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(bkcr);
            setAdapter(new bkcq(getContext(), arrayList));
            setOnClickListener(this);
            getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        }
        ((bkcq) getAdapter()).add(bkcr);
    }

    /* renamed from: c */
    private final void m118787c(bkcr bkcr) {
        if (getAdapter() instanceof bkcq) {
            ((bkcq) getAdapter()).remove(bkcr);
        }
    }

    /* renamed from: w */
    private final boolean m118788w() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    /* renamed from: x */
    private final void m118789x() {
        this.f152258c = getTextColors();
    }

    /* renamed from: cO */
    public final boolean mo65775cO() {
        return this.f152257b.length() == mo71885j();
    }

    public final boolean enoughToFilter() {
        return this.f152273r ? super.enoughToFilter() : getText().length() == 0;
    }

    /* renamed from: g */
    public final String mo66001g() {
        String str = this.f152257b;
        return str.substring(Math.max(0, str.length() - 4));
    }

    /* renamed from: h */
    public final bmhu mo66002h() {
        Pair pair = this.f152266k;
        if (pair != null) {
            return (bmhu) pair.first;
        }
        return null;
    }

    /* renamed from: i */
    public final void mo66003i() {
        if (getWindowToken() != null && m118788w() && enoughToFilter() && hasFocus()) {
            showDropDown();
            setError(null);
        }
    }

    /* renamed from: j */
    public final int mo71885j() {
        Pair pair = this.f152266k;
        if (pair != null) {
            return ((bmhs) pair.second).f129484c;
        }
        return 16;
    }

    public void onClick(View view) {
        if (view == this) {
            mo66003i();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m118789x();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!m118788w()) {
            return;
        }
        if (!z) {
            dismissDropDown();
        } else {
            mo66003i();
        }
    }

    public final void onGlobalLayout() {
        int[] iArr = this.f152274s;
        int i = iArr[1];
        getLocationOnScreen(iArr);
        int i2 = this.f152274s[1];
        if (isPopupShowing() && i2 != i) {
            dismissDropDown();
            showDropDown();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo66003i();
        }
    }

    /* access modifiers changed from: protected */
    public final void replaceText(CharSequence charSequence) {
        if (this.f152273r) {
            super.replaceText(charSequence);
        }
    }

    public final void run() {
        int size = this.f152270o.size();
        for (int i = 0; i < size; i++) {
            m118786b((bkcr) this.f152270o.get(i));
        }
        this.f152270o.clear();
        mo66003i();
    }

    /* renamed from: a */
    private final void m118784a(Context context) {
        setKeyListener(DigitsKeyListener.getInstance("1234567890 "));
        setSingleLine();
        m118789x();
        int i = Build.VERSION.SDK_INT;
        setTextDirection(3);
        mo71915a(this.f152275t);
        mo71925b(new bkhk(this));
        String string = context.getString(C0126R.string.wallet_uic_error_card_number_invalid);
        mo71925b(new bkhl(this, string));
        mo65972a((bkgj) new bkhm(this, string));
        int[] iArr = {C0126R.attr.uicInvalidCardNumberShakeAnimationEnabled, C0126R.attr.uicShowCardDropDownAfterDelay};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(iArr);
        this.f152261f = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicInvalidCardNumberShakeAnimationEnabled), false);
        this.f152262g = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicShowCardDropDownAfterDelay), false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void mo71834b(int i) {
        if (this.f152272q == null) {
            bkcr b = bkcr.m105333b(getContext(), i);
            this.f152272q = b;
            m118785a(b);
        }
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118784a(context);
    }

    public CreditCardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118784a(context);
    }

    /* renamed from: a */
    private final void m118785a(bkcr bkcr) {
        if (this.f152262g) {
            if (this.f152269n == null) {
                this.f152269n = new adzt(Looper.getMainLooper());
            }
            if (this.f152270o == null) {
                this.f152270o = new ArrayList(2);
            }
            this.f152270o.add(bkcr);
            this.f152269n.removeCallbacks(this);
            this.f152269n.postDelayed(this, 500);
            return;
        }
        m118786b(bkcr);
    }

    /* renamed from: a */
    public final void mo71830a(int i) {
        if (this.f152271p == null) {
            bkcr a = bkcr.m105332a(getContext(), i);
            this.f152271p = a;
            m118785a(a);
        }
    }

    /* renamed from: a */
    public final void mo71921a(List list) {
        this.f152273r = true;
        bkcr bkcr = this.f152271p;
        if (bkcr != null) {
            m118787c(bkcr);
            this.f152271p = null;
        }
        bkcr bkcr2 = this.f152272q;
        if (bkcr2 != null) {
            m118787c(bkcr2);
            this.f152272q = null;
        }
        setDropDownBackgroundResource(17301657);
        super.mo71921a(list);
    }
}
