package com.google.android.wallet.bender3.impl.p096ui.common.input;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import com.google.android.material.textfield.TextInputEditText;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.wallet.bender3.impl.ui.common.input.TransformEditText */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransformEditText extends TextInputEditText {

    /* renamed from: a */
    public bjpa f151773a;

    /* renamed from: b */
    final ArrayList f151774b = new ArrayList();

    /* renamed from: c */
    public final bjpc f151775c = new bjpc();

    /* renamed from: d */
    public boolean f151776d;

    /* renamed from: e */
    public boolean f151777e;

    /* renamed from: f */
    public int f151778f;

    /* renamed from: g */
    public int f151779g = -1;

    /* renamed from: h */
    public StringBuilder f151780h;

    /* renamed from: i */
    TextWatcher f151781i;

    public TransformEditText(Context context) {
        super(context);
        m118349d();
    }

    /* renamed from: d */
    private final void m118349d() {
        this.f151780h = new StringBuilder();
        bjoz bjoz = new bjoz(this);
        this.f151781i = bjoz;
        addTextChangedListener(bjoz);
    }

    /* renamed from: e */
    private final void m118350e() {
        bjpc bjpc = this.f151775c;
        StringBuilder sb = this.f151780h;
        bjpc.f123070a = sb;
        bjpc.f123071b = sb.length();
        bjpc bjpc2 = this.f151775c;
        mo71768a(bjpc2);
        CharSequence charSequence = bjpc2.f123070a;
        int i = bjpc2.f123071b;
        this.f151776d = true;
        setText(charSequence);
        setSelection(i);
        this.f151776d = false;
        mo71771b();
    }

    /* renamed from: a */
    public final String mo71767a() {
        Editable text = getText();
        return text != null ? text.toString() : "";
    }

    /* renamed from: b */
    public final void mo71771b() {
        if (this.f151773a != null) {
            mo71767a();
        }
    }

    /* renamed from: c */
    public final void mo71773c() {
        bjpa bjpa = this.f151773a;
        if (bjpa != null) {
            bjpa.mo65426a(this.f151780h.toString());
        }
    }

    public final boolean getFreezesText() {
        return false;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (z && TextUtils.isEmpty(getText())) {
            m118350e();
        }
    }

    /* renamed from: a */
    public final void mo71768a(bjpc bjpc) {
        ArrayList arrayList = this.f151774b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bjpb) arrayList.get(i)).mo65422a(bjpc, hasFocus());
        }
    }

    /* renamed from: b */
    public final void mo71772b(bjpc bjpc) {
        for (bjpb bjpb : bnkn.m109666a((List) this.f151774b)) {
            bjpb.mo65421a(bjpc);
        }
    }

    /* renamed from: a */
    public final void mo71769a(String str) {
        if (!TextUtils.equals(this.f151780h, str)) {
            this.f151780h = new StringBuilder(str);
            mo71773c();
            m118350e();
        }
    }

    /* renamed from: a */
    public final void mo71770a(List list) {
        int i;
        bwuk bwuk;
        bwum bwum;
        this.f151774b.clear();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            bwuf bwuf = (bwuf) list.get(i2);
            int i3 = bwuf.f161028a;
            if (i3 != 0) {
                i = i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? 0 : 4 : 3 : 2 : 1;
            } else {
                i = 5;
            }
            int i4 = i - 1;
            Object obj = null;
            if (i != 0) {
                if (i4 == 1) {
                    if (i3 == 2) {
                        bwuk = (bwuk) bwuf.f161029b;
                    } else {
                        bwuk = bwuk.f161035c;
                    }
                    obj = new bjov(bwuk);
                } else if (i4 == 3) {
                    if (i3 == 4) {
                        bwum = (bwum) bwuf.f161029b;
                    } else {
                        bwum = bwum.f161045e;
                    }
                    obj = new bjoy(bwum);
                }
                if (obj != null) {
                    this.f151774b.add(obj);
                }
                i2++;
            } else {
                throw null;
            }
        }
        m118350e();
        ArrayList arrayList = this.f151774b;
        int size2 = arrayList.size();
        int i5 = -1;
        for (int i6 = 0; i6 < size2; i6++) {
            int a = ((bjpb) arrayList.get(i6)).mo65420a();
            if (a >= 0) {
                i5 = i5 >= 0 ? Math.min(i5, a) : a;
            }
        }
        this.f151779g = i5;
    }

    public TransformEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m118349d();
    }

    public TransformEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m118349d();
    }
}
