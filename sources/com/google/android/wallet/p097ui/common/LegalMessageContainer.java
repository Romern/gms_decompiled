package com.google.android.wallet.p097ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.wallet.ui.common.LegalMessageContainer */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class LegalMessageContainer extends LinearLayout implements bkdw, bjer {

    /* renamed from: a */
    public bjwk f152111a;

    /* renamed from: b */
    public bjem f152112b;

    /* renamed from: c */
    private final bjes f152113c = new bjes(1631);

    /* renamed from: d */
    private List f152114d;

    /* renamed from: e */
    private bjxv f152115e;

    /* renamed from: f */
    private bkdw f152116f;

    public LegalMessageContainer(Context context) {
        super(context);
        setOrientation(1);
        m118631a(context);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.wallet.ui.common.LegalMessageContainer, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if (r6.f130164j == false) goto L_0x0060;
     */
    /* renamed from: a */
    private final void m118631a(Context context) {
        List list = this.f152114d;
        if (list != null && !list.isEmpty()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{C0126R.attr.uicLegalMessageTopMargin});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
            obtainStyledAttributes.recycle();
            LayoutInflater from = LayoutInflater.from(context);
            boolean isEnabled = isEnabled();
            for (bmjf bmjf : this.f152114d) {
                InfoMessageView infoMessageView = (InfoMessageView) from.inflate((int) C0126R.C0128layout.view_legal_message_text, (ViewGroup) this, false);
                infoMessageView.setId(this.f152115e.mo65614a());
                infoMessageView.setEnabled(isEnabled);
                addView(infoMessageView);
                if ((bmjf.f129687a & 2) != 0) {
                    bmnr bmnr = bmjf.f129689c;
                    if (bmnr == null) {
                        bmnr = bmnr.f130153o;
                    }
                }
                ((ViewGroup.MarginLayoutParams) infoMessageView.getLayoutParams()).bottomMargin = dimensionPixelSize;
                infoMessageView.mo72002a(this.f152116f);
                bmnr bmnr2 = bmjf.f129689c;
                if (bmnr2 == null) {
                    bmnr2 = bmnr.f130153o;
                }
                infoMessageView.mo72003a(bmnr2);
                bmnr bmnr3 = bmjf.f129689c;
                if (bmnr3 == null) {
                    bmnr3 = bmnr.f130153o;
                }
                bjwl.m104784a(infoMessageView, bmnr3.f130156b, this.f152111a);
            }
        }
    }

    /* renamed from: U */
    public final bkdw mo52821U() {
        return this.f152116f;
    }

    /* renamed from: a */
    public final String mo52823a(String str) {
        return "";
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            arrayList.add((bjer) getChildAt(i));
        }
        return arrayList;
    }

    /* renamed from: bZ */
    public final void mo52779bZ() {
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f152113c;
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public LegalMessageContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(1);
        m118631a(context);
    }

    public LegalMessageContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        m118631a(context);
    }

    /* renamed from: a */
    public final void mo72026a(bkdw bkdw) {
        this.f152116f = bkdw;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((InfoMessageView) getChildAt(i)).mo72002a(this.f152116f);
        }
    }

    public LegalMessageContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        setOrientation(1);
        m118631a(context);
    }

    /* renamed from: a */
    public final void mo72027a(List list, bjxv bjxv) {
        removeAllViews();
        this.f152115e = bjxv;
        bjxv.mo65616b();
        this.f152114d = list;
        m118631a(getContext());
        if (this.f152112b != null && !this.f152114d.isEmpty()) {
            this.f152112b.mo51907a(this);
        }
    }

    /* renamed from: a */
    public final String[] mo72028a() {
        int childCount = getChildCount();
        ArrayList arrayList = new ArrayList(childCount);
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() == 0) {
                arrayList.add(((bmjf) this.f152114d.get(i)).f129693g);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
