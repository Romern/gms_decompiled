package com.google.android.wallet.p097ui.card;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.p097ui.common.FormEditText;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.card.CardNumberEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CardNumberEditText extends FormEditText implements View.OnClickListener, Runnable, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: ap */
    private static final bmnn f151873ap;

    /* renamed from: a */
    public String f151874a = "";

    /* renamed from: aq */
    private final int[] f151875aq = {-1, -1};

    /* renamed from: ar */
    private final TextWatcher f151876ar = new bkay(this);

    /* renamed from: b */
    public ColorStateList f151877b;

    /* renamed from: c */
    public boolean f151878c;

    /* renamed from: d */
    boolean f151879d;

    /* renamed from: e */
    public bkaz f151880e;

    /* renamed from: f */
    public String f151881f;

    /* renamed from: g */
    public String f151882g;

    /* renamed from: h */
    public bmhq[] f151883h;

    /* renamed from: i */
    public int[] f151884i;

    /* renamed from: j */
    public boolean f151885j = true;

    /* renamed from: k */
    public bmhq f151886k;

    /* renamed from: l */
    public bmhm[] f151887l;

    /* renamed from: m */
    public int[] f151888m;

    /* renamed from: n */
    public bmhm f151889n;

    /* renamed from: o */
    Handler f151890o;

    /* renamed from: p */
    ArrayList f151891p;

    /* renamed from: q */
    public bkcr f151892q;

    /* renamed from: r */
    public bkcr f151893r;

    /* renamed from: s */
    public View f151894s;

    /* renamed from: t */
    public View f151895t;

    static {
        bxvd da = bmnn.f130132e.mo74144da();
        bxvd da2 = bmnm.f130127d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bmnm bmnm = (bmnm) da2.f164949b;
        "D".getClass();
        bmnm.f130129a |= 1;
        bmnm.f130130b = "D";
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnn bmnn = (bmnn) da.f164949b;
        bmnm bmnm2 = (bmnm) da2.mo74062i();
        bmnm2.getClass();
        if (!bmnn.f130135b.mo73666a()) {
            bmnn.f130135b = bxvk.m124021a(bmnn.f130135b);
        }
        bmnn.f130135b.add(bmnm2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmnn bmnn2 = (bmnn) da.f164949b;
        "DDDD DDDD DDDD DDDD".getClass();
        int i = bmnn2.f130134a | 1;
        bmnn2.f130134a = i;
        bmnn2.f130136c = "DDDD DDDD DDDD DDDD";
        bmnn2.f130134a = i | 2;
        bmnn2.f130137d = false;
        f151873ap = (bmnn) da.mo74062i();
    }

    public CardNumberEditText(Context context) {
        super(context);
        m118390g();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        if (r0.startsWith(r9) != false) goto L_0x0040;
     */
    /* renamed from: a */
    static int m118388a(List list, String str) {
        int i;
        int i2;
        int i3;
        long j;
        String str2 = str;
        int size = list.size();
        int i4 = 0;
        do {
            i = -1;
            if (i4 >= size) {
                return -1;
            }
            bmhr bmhr = (bmhr) list.get(i4);
            int length = str.length();
            int i5 = bmhr.f129475a;
            long j2 = bmhr.f129476b;
            long j3 = 0;
            if (j2 != 0) {
                String l = Long.toString(j2);
                i2 = l.length();
                if (length <= i2) {
                    if (l.startsWith(str2)) {
                        i = 0;
                    }
                }
                i4++;
            } else {
                i2 = 0;
            }
            int i6 = i5 - 1;
            if (i2 != i6) {
                if (length < i5) {
                    int i7 = (i5 - length) - 1;
                    String substring = str2.substring(i2);
                    if (!TextUtils.isEmpty(substring)) {
                        j3 = Long.parseLong(substring);
                    }
                    long j4 = 1 + j3;
                    for (int i8 = 0; i8 < i7; i8++) {
                        j3 *= 10;
                        j4 *= 10;
                    }
                    j = j4 - 1;
                } else {
                    j3 = Long.parseLong(str2.substring(i2, i6));
                    j = j3;
                }
                i3 = Collections.binarySearch(bmhr.f129477c, Long.valueOf(j3));
                if (i3 >= 0 || ((-i3) - 1 != bmhr.f129477c.size() && bmhr.f129477c.mo74160a(i3) <= j)) {
                    if (length < i5) {
                        i = 0;
                    }
                }
                i4++;
            } else if (length >= i5) {
                i3 = 0;
            } else {
                i = 0;
                i4++;
            }
            if (((1 << Character.getNumericValue(str2.charAt(i6))) & bmhr.f129478d.mo74151b(i3)) != 0) {
                i = bmhr.f129475a;
            }
            i4++;
        } while (i < 0);
        return i;
    }

    /* renamed from: b */
    private final void m118389b(bkcr bkcr) {
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

    /* renamed from: g */
    private final void m118390g() {
        m118391h();
        setInputType(2);
        mo71918a(f151873ap);
        int i = Build.VERSION.SDK_INT;
        setTextDirection(3);
        mo71915a(this.f151876ar);
        mo71925b(new bkav(this));
        mo71925b(new bkaw(this));
        mo65972a((bkgj) new bkax(this));
        int[] iArr = {C0126R.attr.uicInvalidCardNumberShakeAnimationEnabled, C0126R.attr.uicShowCardDropDownAfterDelay};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(iArr);
        this.f151878c = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicInvalidCardNumberShakeAnimationEnabled), false);
        this.f151879d = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.uicShowCardDropDownAfterDelay), false);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: h */
    private final void m118391h() {
        this.f151877b = getTextColors();
    }

    /* renamed from: d */
    public final String mo71835d() {
        return this.f151882g;
    }

    /* renamed from: e */
    public final void mo71836e() {
        if (getWindowToken() != null && mo71838f() && enoughToFilter() && hasFocus()) {
            showDropDown();
            setError(null);
        }
    }

    public final boolean enoughToFilter() {
        return getText().length() == 0;
    }

    /* renamed from: f */
    public final boolean mo71838f() {
        return getAdapter() != null && getAdapter().getCount() > 0;
    }

    public void onClick(View view) {
        if (view == this) {
            mo71836e();
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m118391h();
    }

    /* access modifiers changed from: protected */
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!mo71838f()) {
            return;
        }
        if (!z) {
            dismissDropDown();
        } else {
            mo71836e();
        }
    }

    public final void onGlobalLayout() {
        int[] iArr = this.f151875aq;
        int i = iArr[1];
        getLocationOnScreen(iArr);
        int i2 = this.f151875aq[1];
        if (isPopupShowing() && i2 != i) {
            dismissDropDown();
            showDropDown();
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            mo71836e();
        }
    }

    /* access modifiers changed from: protected */
    public final void replaceText(CharSequence charSequence) {
    }

    public final void run() {
        int size = this.f151891p.size();
        for (int i = 0; i < size; i++) {
            m118389b((bkcr) this.f151891p.get(i));
        }
        this.f151891p.clear();
        mo71836e();
    }

    /* renamed from: b */
    public final void mo71834b(int i) {
        if (this.f151893r == null) {
            bkcr b = bkcr.m105333b(getContext(), i);
            this.f151893r = b;
            mo71831a(b);
        }
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118390g();
    }

    public CardNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118390g();
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        if (!mo65798cL()) {
            return "";
        }
        String substring = this.f151874a.substring(this.f151874a.length() - this.f151886k.f129466g);
        bmhq bmhq = this.f151886k;
        if ((bmhq.f129460a & 128) != 0) {
            bmnw bmnw = bmhq.f129471l;
            if (bmnw == null) {
                bmnw = bmnw.f130182d;
            }
            bkeo bkeo = new bkeo(bmnw);
            if (bkeo.mo65912a(1)) {
                bkeo.mo65910a(1, this.f151886k.f129461b);
            }
            if (bkeo.mo65912a(2)) {
                bkeo.mo65910a(2, substring);
            }
            if (bkeo.mo65911a()) {
                return bkeo.mo65913b();
            }
            throw new IllegalArgumentException("Card summary template contains unknown component references.");
        } else if (!bmhq.f129461b.isEmpty()) {
            return String.format("%1$s  • • • %2$s", this.f151886k.f129461b, substring);
        } else {
            return String.format("• • • %1$s", substring);
        }
    }

    /* renamed from: a */
    public final void mo71830a(int i) {
        if (this.f151892q == null) {
            bkcr a = bkcr.m105332a(getContext(), i);
            this.f151892q = a;
            mo71831a(a);
        }
    }

    /* renamed from: a */
    public final void mo71831a(bkcr bkcr) {
        if (this.f151879d) {
            if (this.f151890o == null) {
                this.f151890o = new adzt(Looper.getMainLooper());
            }
            if (this.f151891p == null) {
                this.f151891p = new ArrayList(2);
            }
            this.f151891p.add(bkcr);
            this.f151890o.removeCallbacks(this);
            this.f151890o.postDelayed(this, 500);
            return;
        }
        m118389b(bkcr);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.util.List, java.lang.String):int
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.util.List, java.lang.String):int
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bkdf.a(java.lang.CharSequence, boolean):void
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void */
    /* renamed from: a */
    public final void mo71832a(CharSequence charSequence, int i) {
        String a = bjyw.m104938a(charSequence);
        mo71833a(a, false);
        super.mo71832a((CharSequence) a, i);
    }

    /* renamed from: a */
    public final void mo71833a(String str, boolean z) {
        bmhq bmhq = this.f151886k;
        boolean startsWith = str.startsWith(this.f151874a);
        this.f151874a = str;
        this.f151886k = null;
        this.f151885j = false;
        int length = this.f151883h.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (!startsWith || this.f151884i[i2] == 0) {
                this.f151884i[i2] = m118388a(this.f151883h[i2].f129462c, str);
            }
            if (!this.f151885j) {
                int i3 = this.f151884i[i2];
                if (i3 == 0) {
                    this.f151885j = true;
                    this.f151886k = null;
                } else if (i3 > i) {
                    this.f151886k = this.f151883h[i2];
                    i = i3;
                }
            }
        }
        this.f151889n = null;
        int length2 = this.f151887l.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (!startsWith || this.f151888m[i4] == 0) {
                this.f151888m[i4] = m118388a(this.f151887l[i4].f129453a, str);
            }
            if (this.f151889n == null && this.f151888m[i4] > 0) {
                this.f151889n = this.f151887l[i4];
            }
        }
        bmhq bmhq2 = this.f151886k;
        if (bjzb.m104957a(bmhq, bmhq2)) {
            return;
        }
        if (bmhq == null || bmhq2 == null || !bmhq.f129463d.equals(bmhq2.f129463d)) {
            bmhq bmhq3 = this.f151886k;
            if (bmhq3 == null || (bmhq3.f129460a & 4) == 0) {
                mo71882a(f151873ap, z);
            } else {
                bmnn bmnn = bmhq3.f129464e;
                if (bmnn == null) {
                    bmnn = bmnn.f130132e;
                }
                mo71882a(bmnn, z);
                int i5 = this.f151886k.f129465f;
                if (i5 >= 0) {
                    mo71880a(i5, this.f152001U.size(), 1);
                }
            }
            bkaz bkaz = this.f151880e;
            if (bkaz != null) {
                bkaz.mo65750a(this.f151886k);
            }
        }
    }
}
