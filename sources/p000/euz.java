package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: euz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class euz extends ewn {

    /* renamed from: a */
    public final eui f15805a;

    /* renamed from: d */
    public final bdej f15806d;

    /* renamed from: e */
    public ffl f15807e;

    public euz(Context context, List list, evl evl, eui eui, fgt fgt, bdej bdej, ffl ffl) {
        super(context, list, evl, fgt);
        this.f15805a = eui;
        this.f15806d = bdej;
        this.f15807e = ffl;
    }

    /* renamed from: a */
    public static List m11155a(bsxp bsxp, List list) {
        ArrayList arrayList = new ArrayList();
        if (bsxp != null) {
            arrayList.add(new eur(bsxp));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bsvd bsvd = (bsvd) it.next();
            int i = bsvd.f147232a;
            if (i == 1) {
                arrayList.add(new euv(bsvd));
            } else if (i == 2) {
                arrayList.add(new eul(bsvd));
            } else if (i == 3) {
                arrayList.add(new euk(bsvd));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final void m11156a(View view, int i) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(C0126R.dimen.as_card_deck_vertical_padding);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (i == 1) {
            marginLayoutParams.topMargin = dimensionPixelSize;
        } else {
            marginLayoutParams.bottomMargin = dimensionPixelSize;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: a */
    public static final void m11157a(View view, int i, int i2) {
        if (i > i2) {
            int i3 = (i - i2) / 2;
            view.setPadding(i3, view.getPaddingTop(), i3, view.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public final int mo162a(int i) {
        int a = ((ewj) this.f15934f.get(i)).mo10503a();
        if (a == 3 || a == 4 || a == 2 || a == 8) {
            return a - 1;
        }
        return 0;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ acm mo163a(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(this.f15937i);
        if (i == 2) {
            return new euy(this, from.inflate((int) C0126R.C0128layout.as_card, viewGroup, false));
        }
        if (i == 3) {
            return new euq(this, from.inflate((int) C0126R.C0128layout.as_prompt_carousel, viewGroup, false));
        }
        if (i == 1) {
            return new euu(this, from.inflate((int) C0126R.C0128layout.as_screen_intro, viewGroup, false));
        }
        if (i == 7) {
            return new euj(this, from.inflate((int) C0126R.C0128layout.as_clp_card, viewGroup, false));
        }
        return super.mo10553a(viewGroup);
    }
}
