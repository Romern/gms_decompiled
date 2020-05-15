package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.clientlog.Session;
import com.google.android.wallet.clientlog.TimedEvent;

/* renamed from: com.google.android.wallet.ui.common.SelectorView */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SelectorView extends LinearLayout implements View.OnClickListener, bkii, bkih, bkiq, bkfb, bjwh, bkdf {

    /* renamed from: a */
    public bkip f152205a = new bkip();

    /* renamed from: b */
    public View f152206b;

    /* renamed from: c */
    public bkda f152207c;

    /* renamed from: d */
    public boolean f152208d = false;

    /* renamed from: e */
    public bkfe f152209e;

    /* renamed from: f */
    public bkdb f152210f;

    /* renamed from: g */
    public long f152211g;

    /* renamed from: h */
    public LogContext f152212h;

    /* renamed from: i */
    public bjwk f152213i;

    /* renamed from: j */
    private boolean f152214j;

    /* renamed from: k */
    private boolean f152215k;

    /* renamed from: l */
    private TimedEvent f152216l;

    public SelectorView(Context context) {
        super(context);
        m118739i();
    }

    /* renamed from: a */
    private final void m118737a(View view) {
        View view2;
        view.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        int childCount = getChildCount();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            if (((bkfc) getChildAt(i3)).mo65942e()) {
                i2++;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                int childCount2 = getChildCount();
                while (true) {
                    if (i >= childCount2) {
                        view2 = null;
                        break;
                    }
                    view2 = getChildAt(i);
                    if (((bkfc) view2).mo65942e()) {
                        break;
                    }
                    i++;
                }
                ((bkfc) view2).mo65940a(true);
                view2.setOnClickListener(this);
            }
            view.setOnClickListener(this);
            ((bkfc) view).mo65940a(true);
            return;
        }
        ((bkfc) view).mo65940a(false);
        view.setOnClickListener(this);
    }

    /* renamed from: i */
    private final void m118739i() {
        bkip bkip = this.f152205a;
        bkip.f124305n = this;
        bkip.mo66028a((bkih) this);
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return null;
    }

    /* renamed from: a */
    public final boolean mo65795a(Object obj) {
        return false;
    }

    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        bkfr.m105577a(view instanceof bkfc, "SelectorView may only have children that implement SelectorOption.");
        super.addView(view, i, layoutParams);
        ((bkfc) view).mo65939a(this);
        m118737a(view);
        int childCount = getChildCount();
        int i2 = childCount - 1;
        if (childCount > 2) {
            boolean z = true;
            if (!(i == -1 || i == i2)) {
                z = false;
            }
            m118738a(view, z, false, null);
            if (z) {
                m118738a(mo72095a(i2 - 1), false, false, null);
                return;
            }
            return;
        }
        mo72099h();
    }

    /* renamed from: b */
    public final View mo72098b(long j) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (((bkfc) childAt).mo65944g() == j) {
                return childAt;
            }
        }
        return null;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f152205a;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        if (this.f152213i != null) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.f152213i.mo65588a(((bkfc) getChildAt(i)).mo65944g());
            }
        }
    }

    /* renamed from: c */
    public final void mo59888c() {
        if (getParent() != null && getChildCount() > 0 && C1280ps.m19868C(this)) {
            getParent().requestChildFocus(this, getChildAt(0));
        }
    }

    /* renamed from: cL */
    public final boolean mo65798cL() {
        return this.f152206b != null;
    }

    /* renamed from: cM */
    public final boolean mo65799cM() {
        if (mo65798cL()) {
            mo65794a(null, false);
        } else {
            mo65794a(getResources().getString(C0126R.string.wallet_uic_error_no_option_selected), false);
        }
        return mo65798cL();
    }

    /* renamed from: cN */
    public final boolean mo65800cN() {
        if (hasFocus() || !requestFocus()) {
            bkfr.m105602c(this);
            CharSequence error = getError();
            if (!TextUtils.isEmpty(error)) {
                bkfr.m105567a(this, error);
            }
        }
        return hasFocus();
    }

    /* renamed from: g */
    public final void mo65938g() {
        long j;
        View view = this.f152206b;
        if (view == null || !((bkfc) view).mo65942e()) {
            view = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            m118737a(childAt);
            bkfc bkfc = (bkfc) childAt;
            if (bkfc.mo65942e() && view == null && bkfc.mo52925a()) {
                view = childAt;
            }
        }
        if (view != null) {
            j = ((bkfc) view).mo65944g();
        } else {
            j = 0;
        }
        mo72096a(j);
    }

    public final CharSequence getError() {
        bkda bkda = this.f152207c;
        return bkda != null ? bkda.mo52932m() : "";
    }

    /* renamed from: h */
    public final void mo72099h() {
        boolean z;
        int childCount = getChildCount();
        int i = childCount - 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View a = mo72095a(i2);
            if (i2 == i) {
                z = true;
            } else {
                z = false;
            }
            m118738a(a, z, false, null);
            a.setTranslationY(0.0f);
        }
    }

    public void onClick(View view) {
        boolean z;
        if (this.f152210f != null) {
            z = true;
        } else {
            z = false;
        }
        bkfr.m105597b(z, "SelectorView must have a EventListener.");
        if (!this.f152205a.f124304m) {
            if (view instanceof bkfc) {
                bkfc bkfc = (bkfc) view;
                mo72096a(bkfc.mo65944g());
                this.f152214j = true;
                if (this.f152205a.f124294c) {
                    bjst.m104533b(this.f152212h, bkfc.mo65944g());
                    if (!this.f152205a.f124297f) {
                        bkfe bkfe = this.f152209e;
                        if (bkfe != null) {
                            bkfe.mo52731z();
                        }
                        bkfr.m105559a(getContext(), view);
                    }
                    this.f152215k = true;
                    this.f152205a.mo66025a(2);
                    this.f152210f.mo51905a(9, Bundle.EMPTY);
                } else {
                    LogContext logContext = this.f152212h;
                    if (logContext != null) {
                        bjst.m104533b(logContext.f151794b, this.f152211g);
                    }
                    bkfe bkfe2 = this.f152209e;
                    if (bkfe2 == null || bkfe2.mo52723B()) {
                        bkfr.m105559a(getContext(), view);
                        this.f152205a.mo66025a(1);
                        this.f152210f.mo51905a(9, Bundle.EMPTY);
                    }
                }
            }
            this.f152208d = true;
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.f152205a.mo66026a(bundle.getParcelable("expandableInstanceState"));
        this.f152208d = bundle.getBoolean("userInteractedWith");
    }

    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandableInstanceState", this.f152205a.mo66024a());
        bundle.putBoolean("userInteractedWith", this.f152208d);
        return bundle;
    }

    public final void removeAllViews() {
        super.removeAllViews();
        this.f152206b = null;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    /* renamed from: w */
    public final void mo52076w() {
    }

    /* renamed from: x */
    public final void mo52077x() {
        mo72099h();
    }

    /* renamed from: y */
    public final void mo52078y() {
    }

    /* renamed from: b */
    public final void mo59887b() {
        boolean z;
        boolean z2;
        TimedEvent timedEvent;
        bkfr.m105597b(this.f152206b != null || this.f152205a.f124294c, "SelectorView must have a selected option when collapsed.");
        LogContext logContext = this.f152212h;
        if (logContext != null) {
            long j = this.f152211g;
            if (j > 0) {
                if (!this.f152205a.f124294c) {
                    TimedEvent timedEvent2 = this.f152216l;
                    if (timedEvent2 != null) {
                        LogContext logContext2 = logContext.f151794b;
                        if (!bjst.m104536d(logContext2)) {
                            Log.e("ClientLog", "Tried to log endExpanded() in an invalid session.");
                        } else {
                            bxvd e = bjst.m104537e(logContext2);
                            int i = timedEvent2.f151807a.f159122h;
                            if (e.f164950c) {
                                e.mo74035c();
                                e.f164950c = false;
                            }
                            bwfr bwfr = (bwfr) e.f164949b;
                            bwfr bwfr2 = bwfr.f159113m;
                            bwfr.f159115a |= 16;
                            bwfr.f159123i = i;
                            bwfe bwfe = bwfe.EVENT_NAME_EXPANDED_END;
                            if (e.f164950c) {
                                e.mo74035c();
                                e.f164950c = false;
                            }
                            bwfr bwfr3 = (bwfr) e.f164949b;
                            bwfr3.f159121g = bwfe.f159083I;
                            int i2 = bwfr3.f159115a | 4;
                            bwfr3.f159115a = i2;
                            long j2 = timedEvent2.f151807a.f159124j;
                            bwfr3.f159115a = i2 | 32;
                            bwfr3.f159124j = j2;
                            bjst.m104528a(logContext2.mo71783b(), (bwfr) e.mo74062i());
                        }
                        this.f152216l = null;
                    }
                } else if (this.f152216l == null) {
                    LogContext logContext3 = logContext.f151794b;
                    if (!bjst.m104536d(logContext3)) {
                        Log.e("ClientLog", "Tried to log startExpanded() in an invalid session.");
                        timedEvent = null;
                    } else {
                        Session b = logContext3.mo71783b();
                        bxvd e2 = bjst.m104537e(logContext3);
                        bwfe bwfe2 = bwfe.EVENT_NAME_EXPANDED_START;
                        if (e2.f164950c) {
                            e2.mo74035c();
                            e2.f164950c = false;
                        }
                        bwfr bwfr4 = (bwfr) e2.f164949b;
                        bwfr bwfr5 = bwfr.f159113m;
                        bwfr4.f159121g = bwfe2.f159083I;
                        int i3 = bwfr4.f159115a | 4;
                        bwfr4.f159115a = i3;
                        bwfr4.f159115a = i3 | 32;
                        bwfr4.f159124j = j;
                        bwfr bwfr6 = (bwfr) e2.mo74062i();
                        bjst.m104528a(b, bwfr6);
                        timedEvent = new TimedEvent(bwfr6);
                    }
                    this.f152216l = timedEvent;
                }
            }
        }
        int childCount = getChildCount();
        int i4 = childCount - 1;
        for (int i5 = 0; i5 < childCount; i5++) {
            View a = mo72095a(i5);
            if (a != this.f152206b) {
                if (i5 == i4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                m118738a(a, z2, false, null);
            } else {
                if (i5 == i4) {
                    z = true;
                } else {
                    z = false;
                }
                m118738a(a, z, this.f152215k, "optionViewComponents");
                this.f152215k = false;
            }
        }
        bkfe bkfe = this.f152209e;
        if (bkfe != null) {
            if (!this.f152205a.f124294c) {
                bkfe.mo52724C();
            } else {
                bkfe.mo52725D();
            }
        }
        bkfe bkfe2 = this.f152209e;
        if (bkfe2 == null || this.f152214j) {
            this.f152214j = false;
        } else if (!this.f152205a.f124294c) {
            bkfe2.mo52731z();
        } else {
            bkfe2.mo52723B();
        }
    }

    public SelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118739i();
    }

    public SelectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118739i();
    }

    /* renamed from: a */
    private final void m118738a(View view, boolean z, boolean z2, String str) {
        boolean z3;
        int i;
        boolean z4 = this.f152205a.f124294c;
        boolean z5 = true;
        if (view == this.f152206b) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z4) {
            i = 0;
        } else {
            i = !z3 ? 8 : 0;
        }
        view.setVisibility(i);
        view.setEnabled(isEnabled());
        bkfc bkfc = (bkfc) view;
        if (z4) {
            z5 = false;
        } else if (!z2) {
            z5 = false;
        }
        bkfc.mo65941b(z3, z5);
        bkfc.mo52924a(z4, z);
        bkfc.mo52923a(str);
    }

    public SelectorView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m118739i();
    }

    /* renamed from: a */
    public final View mo72095a(int i) {
        View childAt = getChildAt(i);
        if (!(childAt instanceof bkfc)) {
            return null;
        }
        return childAt;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        View view = this.f152206b;
        return view != null ? ((bkfc) view).mo52926b().toString() : "";
    }

    /* renamed from: a */
    public final void mo72096a(long j) {
        Object obj;
        if (j != 0) {
            int childCount = getChildCount();
            int i = 0;
            while (true) {
                if (i < childCount) {
                    if (((bkfc) mo72095a(i)).mo65944g() == j) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i != -1) {
                View a = mo72095a(i);
                if (((bkfc) a).mo52925a()) {
                    View view = this.f152206b;
                    if (view != null) {
                        obj = ((bkfc) view).mo65943f();
                    } else {
                        obj = null;
                    }
                    this.f152206b = a;
                    mo72099h();
                    if (getChildCount() == 1) {
                        this.f152206b.setClickable(false);
                    }
                    bkfe bkfe = this.f152209e;
                    if (bkfe != null) {
                        bkfe.mo52728a(((bkfc) this.f152206b).mo65943f(), obj);
                    }
                    mo65794a(null, false);
                    return;
                }
                return;
            }
            return;
        }
        View view2 = this.f152206b;
        if (view2 != null) {
            ((bkfc) view2).mo65941b(false, false);
            this.f152206b = null;
        }
    }

    /* renamed from: a */
    public final void mo65794a(CharSequence charSequence, boolean z) {
        bkda bkda = this.f152207c;
        if (bkda != null) {
            bkda.mo52929a(charSequence);
        }
    }
}
