package p000;

import android.graphics.Rect;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.tapandpay.firstparty.CardInfo;
import com.google.android.gms.tapandpay.firstparty.GetAllCardsResponse;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: atme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atme extends avh implements avq, atmt {

    /* renamed from: b */
    public final deu f90469b;

    /* renamed from: c */
    public final atlz f90470c;

    /* renamed from: d */
    public final atam f90471d;

    /* renamed from: e */
    public atmb f90472e;

    /* renamed from: f */
    public ViewPager f90473f;

    /* renamed from: g */
    public String f90474g;

    /* renamed from: h */
    public GetAllCardsResponse f90475h;

    /* renamed from: i */
    public List f90476i;

    /* renamed from: j */
    public boolean f90477j;

    /* renamed from: k */
    public Map f90478k;

    /* renamed from: l */
    public final rjx f90479l;

    /* renamed from: m */
    private final auaj f90480m;

    public atme(deu deu, Fragment fragment, rjx rjx, atlz atlz, atam atam) {
        bmxy.m108601b(fragment instanceof auaj, "Fragment must implement TokenDeleter");
        this.f90469b = deu;
        this.f90480m = (auaj) fragment;
        this.f90479l = rjx;
        this.f90470c = atlz;
        this.f90471d = atam;
    }

    /* renamed from: a */
    public static float m76164a(float f, ViewGroup viewGroup) {
        return TypedValue.applyDimension(1, f, viewGroup.getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: a */
    public final void mo1835a(int i, float f) {
    }

    /* renamed from: b */
    public final void mo1836b(int i) {
        if (i == 0 && this.f90473f.getWindowVisibility() == 0 && this.f90473f.getGlobalVisibleRect(new Rect())) {
            this.f90473f.performHapticFeedback(1);
            this.f90473f.getAccessibilityDelegate().sendAccessibilityEvent(this.f90473f, AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_CORRECT);
        }
    }

    /* renamed from: c */
    public final void mo2720c() {
        super.mo2720c();
        if (!mo50038e()) {
            this.f90473f.mo2136a((avh) this);
            if (!mo50038e()) {
                int i = 0;
                if (this.f90475h.f108372d != null) {
                    int i2 = 0;
                    while (i2 < this.f90476i.size()) {
                        if (!((CardInfo) this.f90476i.get(i2)).f108340a.equals(this.f90475h.f108372d)) {
                            i2++;
                        } else {
                            this.f90473f.mo2143b(i2);
                            return;
                        }
                    }
                }
                if (this.f90475h.f108371c != null) {
                    while (i < this.f90476i.size()) {
                        if (!((CardInfo) this.f90476i.get(i)).f108340a.equals(this.f90475h.f108371c)) {
                            i++;
                        } else {
                            this.f90473f.mo2143b(i);
                            return;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public final boolean mo50038e() {
        return this.f90475h == null || this.f90476i == null;
    }

    /* renamed from: f */
    public final void mo50039f() {
        if (!mo50038e()) {
            this.f90470c.mo50035a();
        }
    }

    /* renamed from: a */
    public static final List m76165a(CardInfo[] cardInfoArr) {
        ArrayList arrayList = new ArrayList();
        for (CardInfo cardInfo : cardInfoArr) {
            if (cardInfo.f108345f.f108459b == 5) {
                arrayList.add(cardInfo);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final int mo2709a() {
        List list = this.f90476i;
        return (list != null ? list.size() : 0) + 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final Object mo2711a(ViewGroup viewGroup, int i) {
        CardInfo cardInfo;
        RelativeLayout relativeLayout;
        List list = this.f90476i;
        String str = null;
        if (list == null || i >= list.size()) {
            cardInfo = null;
        } else {
            cardInfo = (CardInfo) this.f90476i.get(i);
        }
        if (cardInfo != null) {
            relativeLayout = (RelativeLayout) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.tp_settings_token_selector_item, viewGroup, false);
            atmu atmu = new atmu(this.f90480m, relativeLayout, this.f90474g, this.f90479l, this.f90469b, this.f90471d, this);
            this.f90478k.put(cardInfo.f108340a, atmu);
            GetAllCardsResponse getAllCardsResponse = this.f90475h;
            if (getAllCardsResponse != null) {
                str = getAllCardsResponse.f108371c;
            }
            atmu.mo50045a(cardInfo, str);
        } else {
            relativeLayout = (RelativeLayout) LayoutInflater.from(viewGroup.getContext()).inflate((int) C0126R.C0128layout.tp_settings_token_selector_add_item, viewGroup, false);
            relativeLayout.findViewById(C0126R.C0129id.AddTokenCard).setOnClickListener(new atma(this));
        }
        viewGroup.addView(relativeLayout);
        return relativeLayout;
    }

    /* renamed from: a */
    public final void mo1834a(int i) {
        int i2 = 0;
        if (!mo50038e()) {
            if (i >= this.f90476i.size()) {
                this.f90470c.mo50035a();
            } else {
                String str = ((CardInfo) this.f90476i.get(i)).f108340a;
                if (str.equals(this.f90475h.f108371c)) {
                    this.f90470c.mo50035a();
                } else {
                    atam atam = this.f90471d;
                    bxvd da = bpbx.f135635S.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bpbx bpbx = (bpbx) da.f164949b;
                    bpbx.f135657c = 130;
                    bpbx.f135655a |= 1;
                    atam.mo49741a((bpbx) da.mo74062i());
                    atlz atlz = this.f90470c;
                    sdo.m34967a("startTemporaryOverrideForNonDefaultCard");
                    atlz.mo50036b().removeCallbacksAndMessages(null);
                    new atly(atlz, str).run();
                    atlz.f90463a = str;
                }
            }
        }
        if (!mo50038e()) {
            atmb atmb = this.f90472e;
            if (i >= this.f90476i.size()) {
                i2 = 4;
            }
            ((asvk) atmb).f89814a.f89846i.f90499f.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public final void mo2715a(ViewGroup viewGroup, int i, Object obj) {
        viewGroup.removeView((View) obj);
    }

    /* renamed from: a */
    public final boolean mo2716a(View view, Object obj) {
        return view == ((View) obj);
    }
}
