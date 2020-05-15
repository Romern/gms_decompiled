package p000;

import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.nfc.NfcAdapter;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.wallet.analytics.CreditCardEntryAction;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.card.CardImagesView;
import com.google.android.wallet.p097ui.card.CardNumberEditText;
import com.google.android.wallet.p097ui.common.DateEditText;
import com.google.android.wallet.p097ui.common.FormEditText;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.p097ui.common.MaterialFieldLayout;
import com.google.android.wallet.p097ui.expander.SummaryExpanderWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: bkas */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class bkas extends bkdx implements View.OnClickListener, AdapterView.OnItemClickListener, bkaz, bjep, bkbg, bjwu, bjwt, bkdv {

    /* renamed from: C */
    private final bjes f123856C = new bjes(1654);

    /* renamed from: D */
    private final ArrayList f123857D = new ArrayList();

    /* renamed from: E */
    private final ArrayList f123858E = new ArrayList();

    /* renamed from: F */
    private boolean f123859F;

    /* renamed from: G */
    private final bkip f123860G = new bkip();

    /* renamed from: H */
    private boolean f123861H;

    /* renamed from: I */
    private boolean f123862I;

    /* renamed from: J */
    private int f123863J;

    /* renamed from: K */
    private List f123864K;

    /* renamed from: L */
    private Intent f123865L;

    /* renamed from: M */
    private bmld f123866M = bmld.UI_NO_CAMERA_INPUT;

    /* renamed from: N */
    private bmnz f123867N = bmnz.UI_NO_NFC_INPUT;

    /* renamed from: O */
    private boolean f123868O = true;

    /* renamed from: P */
    private Drawable f123869P;

    /* renamed from: Q */
    private boolean f123870Q;

    /* renamed from: R */
    private TextWatcher f123871R;

    /* renamed from: S */
    private boolean f123872S;

    /* renamed from: T */
    private HorizontalScrollView f123873T;

    /* renamed from: a */
    public RelativeLayout f123874a;

    /* renamed from: b */
    public CardImagesView f123875b;

    /* renamed from: c */
    public CardNumberEditText f123876c;

    /* renamed from: d */
    public MaterialFieldLayout f123877d;

    /* renamed from: e */
    public TextView f123878e;

    /* renamed from: f */
    public View f123879f;

    /* renamed from: g */
    public View f123880g;

    /* renamed from: h */
    public LinearLayout f123881h;

    /* renamed from: i */
    public ImageView f123882i;

    /* renamed from: j */
    public Button f123883j;

    /* renamed from: k */
    public View f123884k;

    /* renamed from: l */
    public View f123885l;

    /* renamed from: m */
    public bkbh f123886m;

    /* renamed from: n */
    public SummaryExpanderWrapper f123887n;

    /* renamed from: o */
    protected bmlv f123888o;

    /* renamed from: p */
    protected bkde f123889p;

    /* renamed from: q */
    public bmhq f123890q;

    /* renamed from: r */
    int f123891r = 1;

    /* renamed from: s */
    public bjww f123892s;

    /* renamed from: t */
    public boolean f123893t;

    /* renamed from: u */
    public CreditCardEntryAction f123894u;

    /* renamed from: v */
    public List f123895v;

    /* renamed from: B */
    private final void m105149B() {
        this.f123875b.mo71823a();
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f123876c.getLayoutParams();
        bkfr.m105592b();
        layoutParams.addRule(3, C0126R.C0129id.header);
        layoutParams.leftMargin = this.f123863J;
        this.f123876c.setLayoutParams(layoutParams);
        this.f123859F = true;
    }

    /* renamed from: C */
    private final int m105150C() {
        LinearLayout linearLayout = this.f123881h;
        if (linearLayout != null) {
            return bkfr.m105544a(linearLayout);
        }
        return 0;
    }

    /* renamed from: D */
    private final void m105151D() {
        startActivityForResult(this.f123865L, 500);
        mo52808n(false);
    }

    /* renamed from: E */
    private final void m105152E() {
        if (getFragmentManager().findFragmentByTag("tagNfcInfoDialog") == null) {
            m105153F();
        }
    }

    /* renamed from: F */
    private final void m105153F() {
        bkiy a = bkiy.m105892a(this.f123961aF, this.f123892s.mo65605c());
        a.setTargetFragment(this, 0);
        a.show(getFragmentManager(), "tagNfcInfoDialog");
    }

    /* renamed from: H */
    private final boolean m105154H() {
        return this.f123867N != bmnz.UI_NO_NFC_INPUT;
    }

    /* renamed from: a */
    private final void m105155a(int i, boolean z) {
        int i2;
        bxvt bxvt;
        int i3 = i;
        int i4 = this.f123891r;
        if (i3 == i4) {
            return;
        }
        if (i3 >= i4) {
            int i5 = 0;
            if (i4 == 1 && i3 == 2) {
                bmhq bmhq = this.f123890q;
                if (bmhq == null || bmhq.f129469j.size() == 0) {
                    throw new IllegalStateException("State transitions should not be triggered when no subforms are visible.");
                }
                if (this.f123859F) {
                    i2 = 0;
                } else {
                    i2 = z ? bkfr.m105544a(this.f123878e) : 0;
                }
                bkfr.m105592b();
                ((RelativeLayout.LayoutParams) this.f123876c.getLayoutParams()).addRule(3, C0126R.C0129id.header);
                if (z) {
                    bkfr.m105564a(this.f123876c, i2, 0);
                    View view = this.f123880g;
                    if (view != null && view.getVisibility() == 0) {
                        bkfr.m105594b(this.f123880g, i2);
                    }
                    ImageView imageView = this.f123882i;
                    if (imageView != null && imageView.getVisibility() == 0) {
                        bkfr.m105594b(this.f123882i, i2);
                    }
                    LinearLayout linearLayout = this.f123881h;
                    if (linearLayout != null && linearLayout.getVisibility() == 0) {
                        bkfr.m105594b(this.f123881h, i2);
                    }
                } else {
                    this.f123876c.setVisibility(4);
                    View view2 = this.f123880g;
                    if (view2 != null) {
                        view2.setVisibility(8);
                    }
                    ImageView imageView2 = this.f123882i;
                    if (imageView2 != null) {
                        imageView2.setVisibility(8);
                    }
                    LinearLayout linearLayout2 = this.f123881h;
                    if (linearLayout2 != null) {
                        linearLayout2.setVisibility(8);
                    }
                }
                TextView textView = this.f123878e;
                CardNumberEditText cardNumberEditText = this.f123876c;
                bmhq bmhq2 = cardNumberEditText.f151886k;
                int size = cardNumberEditText.f152001U.size() - (bmhq2 != null ? bmhq2.f129466g : 4);
                StringBuilder sb = new StringBuilder(cardNumberEditText.getText());
                int length = sb.length();
                for (int i6 = 0; i6 < size; i6++) {
                    int intValue = ((Integer) cardNumberEditText.f152001U.get(i6)).intValue();
                    if (intValue >= length) {
                        break;
                    }
                    sb.setCharAt(intValue, 8226);
                }
                textView.setText(sb.toString());
                bkfr.m105592b();
                ((RelativeLayout.LayoutParams) this.f123878e.getLayoutParams()).addRule(3, C0126R.C0129id.header);
                if (z) {
                    bkcd.m105304a(this.f123878e, i2);
                    bkcd.m105304a(this.f123879f, i2);
                } else {
                    this.f123878e.setVisibility(0);
                    this.f123879f.setVisibility(0);
                }
                if (z) {
                    this.f123875b.setTranslationY((float) i2);
                    this.f123875b.animate().translationY(0.0f).start();
                }
                bkbh bkbh = this.f123886m;
                int a = bkfr.m105544a((View) this.f123876c);
                int C = m105150C();
                bxvt bxvt2 = bkbh.f123934q.f129469j;
                int size2 = bxvt2.size();
                int i7 = 0;
                int i8 = 0;
                while (i7 < size2) {
                    int intValue2 = ((Integer) bxvt2.get(i7)).intValue();
                    ViewGroup viewGroup = (ViewGroup) bkbh.f123920c.get(intValue2);
                    if (intValue2 == bkbh.f123934q.f129469j.mo74151b(i5)) {
                        int i9 = 0;
                        while (i9 <= bkbh.f123930m[intValue2]) {
                            View childAt = viewGroup.getChildAt(i5);
                            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((ViewGroup.MarginLayoutParams) childAt.getLayoutParams());
                            layoutParams.addRule(10);
                            boolean hasFocus = childAt.hasFocus();
                            if (hasFocus) {
                                bkfr.m105576a(bkbh);
                            }
                            viewGroup.removeView(childAt);
                            bxvt bxvt3 = bxvt2;
                            bkbh.f123918a.addView(childAt, layoutParams);
                            if (hasFocus) {
                                childAt.requestFocus();
                            }
                            if (childAt.getVisibility() == 0) {
                                if (z) {
                                    bkfr.m105564a(childAt, i2 + i8, -(a + C));
                                } else {
                                    childAt.setVisibility(4);
                                }
                                i8 += bkfr.m105544a(childAt);
                            }
                            bkbh.f123932o.add(childAt);
                            i9++;
                            bxvt2 = bxvt3;
                            i5 = 0;
                        }
                        bxvt = bxvt2;
                    } else {
                        bxvt = bxvt2;
                    }
                    if (z) {
                        viewGroup.setTranslationY((float) (i2 + i8));
                        viewGroup.animate().translationY((float) (-C)).setListener(new bkbe(viewGroup)).start();
                    }
                    i7++;
                    bxvt2 = bxvt;
                    i5 = 0;
                }
            } else if (i4 == 2 && i3 == 3) {
                bmhq bmhq3 = this.f123890q;
                if (bmhq3 == null || bmhq3.f129469j.size() == 0) {
                    throw new IllegalStateException("State transitions should not be triggered when no subforms are visible.");
                }
                m105149B();
                if (z) {
                    bkfr.m105564a(this.f123878e, 0, 0);
                    bkfr.m105564a(this.f123879f, 0, 0);
                    bkcd.m105304a(this.f123876c, 0);
                    View view3 = this.f123880g;
                    if (view3 != null) {
                        bkcd.m105304a(view3, 0);
                    }
                    ImageView imageView3 = this.f123882i;
                    if (imageView3 != null) {
                        bkcd.m105304a(imageView3, 0);
                    }
                    LinearLayout linearLayout3 = this.f123881h;
                    if (linearLayout3 != null) {
                        bkcd.m105304a(linearLayout3, 0);
                    }
                } else {
                    this.f123878e.setVisibility(4);
                    this.f123879f.setVisibility(4);
                    this.f123876c.setVisibility(0);
                    View view4 = this.f123880g;
                    if (view4 != null) {
                        view4.setVisibility(0);
                    }
                    ImageView imageView4 = this.f123882i;
                    if (imageView4 != null) {
                        imageView4.setVisibility(0);
                    }
                    LinearLayout linearLayout4 = this.f123881h;
                    if (linearLayout4 != null) {
                        linearLayout4.setVisibility(0);
                    }
                }
                bkbh bkbh2 = this.f123886m;
                int a2 = bkfr.m105544a((View) this.f123876c);
                int C2 = m105150C();
                ViewGroup viewGroup2 = (ViewGroup) bkbh2.f123920c.get(bkbh2.f123934q.f129469j.mo74151b(0));
                int i10 = 0;
                for (int size3 = bkbh2.f123932o.size() - 1; size3 >= 0; size3--) {
                    View view5 = (View) bkbh2.f123932o.get(size3);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) view5.getLayoutParams());
                    bkbh2.f123918a.removeView(view5);
                    viewGroup2.addView(view5, 0, layoutParams2);
                    if (view5.getVisibility() != 8) {
                        if (z) {
                            i10 += bkfr.m105544a(view5);
                            bkcd.m105304a(view5, -(a2 - i10));
                        } else {
                            view5.setVisibility(0);
                        }
                    }
                }
                if (z) {
                    bxvt bxvt4 = bkbh2.f123934q.f129469j;
                    int size4 = bxvt4.size();
                    for (int i11 = 0; i11 < size4; i11++) {
                        ViewGroup viewGroup3 = (ViewGroup) bkbh2.f123920c.get(((Integer) bxvt4.get(i11)).intValue());
                        viewGroup3.setTranslationY((float) (-(C2 + i10)));
                        viewGroup3.animate().translationY(0.0f).start();
                    }
                }
                bkbh2.f123932o.clear();
            } else if (i4 != 1 || i3 != 3) {
                StringBuilder sb2 = new StringBuilder(58);
                sb2.append("Unimplemented state transition: ");
                sb2.append(i4);
                sb2.append(" to ");
                sb2.append(i3);
                throw new IllegalArgumentException(sb2.toString());
            } else if (z) {
                throw new IllegalArgumentException("Cannot animate transition from STATE_INITIAL to STATE_EXPANDED");
            } else if (!this.f123859F) {
                m105149B();
            }
            this.f123891r = i3;
            return;
        }
        throw new IllegalArgumentException("Cannot transition to an earlier state");
    }

    /* renamed from: c */
    private final void m105158c(String str) {
        if (getFragmentManager().findFragmentByTag("tagNfcErrorDialog") == null) {
            bkga bkga = new bkga();
            bkga.f124182a = getString(C0126R.string.wallet_uic_nfc_error_title);
            bkga.f124183b = str;
            bkga.f124185d = this.f123961aF;
            bkga.f124184c = getString(17039370);
            bkga.mo65976a().show(getFragmentManager(), "tagNfcErrorDialog");
        }
    }

    /* renamed from: e */
    private final void m105159e(String str) {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(str);
        if (findFragmentByTag != null) {
            getFragmentManager().beginTransaction().remove(findFragmentByTag).commit();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkas.a(android.view.View, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(int, boolean):void */
    /* renamed from: z */
    private final void m105160z() {
        if (this.f123891r == 2) {
            m105155a(3, false);
        }
    }

    /* renamed from: a */
    public final void mo65058a(int i) {
        this.f123894u.f151730g = i;
    }

    /* renamed from: b */
    public final void mo65059b() {
        CreditCardEntryAction creditCardEntryAction = this.f123894u;
        if (!creditCardEntryAction.f151732i) {
            creditCardEntryAction.f151732i = true;
            mo65755x();
        }
    }

    /* renamed from: b */
    public final void mo65060b(int i) {
        this.f123894u.f151735l = i;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        if (this.f123876c != null) {
            return this.f123886m.mo52775bR();
        }
        return false;
    }

    /* renamed from: bU */
    public bkip mo52776bU() {
        return this.f123860G;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        if (this.f123876c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.f123857D);
        if (mo65754w()) {
            arrayList.add(new bjeq(1652));
        }
        if (m105154H()) {
            arrayList.add(new bjeq(1655));
        }
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || ((bkiy) fragmentManager.findFragmentByTag("tagNfcInfoDialog")) == null)) {
            arrayList.add(new bjeq(1656));
        }
        arrayList.addAll(this.f123886m.mo52777bV());
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f123858E;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        CardNumberEditText cardNumberEditText = this.f123876c;
        if (cardNumberEditText != null) {
            bjwl.m104790b(cardNumberEditText, ((bmhi) this.f124069w).f129420l, this.f124196aK);
            this.f123876c.mo52947bY();
        }
        bkbh bkbh = this.f123886m;
        if (bkbh != null) {
            bkbh.mo52947bY();
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f123856C;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        CardNumberEditText cardNumberEditText = this.f123876c;
        if (cardNumberEditText != null) {
            boolean z = this.f124195aJ;
            cardNumberEditText.setEnabled(z);
            View view = this.f123880g;
            if (view != null) {
                view.setEnabled(z);
            }
            LinearLayout linearLayout = this.f123881h;
            if (linearLayout != null) {
                linearLayout.setEnabled(z);
            }
            ImageView imageView = this.f123882i;
            if (imageView != null) {
                imageView.setEnabled(z);
            }
            SummaryExpanderWrapper summaryExpanderWrapper = this.f123887n;
            if (summaryExpanderWrapper != null) {
                summaryExpanderWrapper.setEnabled(z);
            }
            this.f123886m.mo52808n(z);
        }
    }

    /* renamed from: h */
    public final void mo65062h() {
        CreditCardEntryAction creditCardEntryAction = this.f123894u;
        if (creditCardEntryAction.f151730g != 1) {
            creditCardEntryAction.f151730g = 1;
            mo65755x();
        }
    }

    /* renamed from: i */
    public final void mo65063i() {
        CreditCardEntryAction creditCardEntryAction = this.f123894u;
        if (creditCardEntryAction.f151735l != 1) {
            creditCardEntryAction.f151735l = 1;
            mo65755x();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public int mo52958m() {
        return C0126R.C0129id.card_number_layout;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 500) {
            mo52808n(true);
            CreditCardOcrResult a = CreditCardOcrResult.m67675a(intent);
            if (intent != null) {
                this.f123894u.f151729f = intent.getBooleanExtra("com.google.android.gms.ocr.EXP_DATE_RECOGNITION_ENABLED", false);
                this.f123894u.f151734k = intent.getBooleanExtra("com.google.android.gms.ocr.NAME_RECOGNITION_ENABLED", false);
            }
            m105157a(bjvn.m104712a(a, i2), -1);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkas.a(android.view.View, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(int, boolean):void */
    public void onClick(View view) {
        if (view == this.f123883j) {
            if (getFragmentManager().findFragmentByTag("cardLogoGridDialog") == null) {
                int i = this.f123961aF;
                bkau bkau = new bkau();
                Bundle a = bkbq.m105268a(i);
                bkau.setArguments(a);
                bjvp.m104737a(a, "keyLogosToDisplay", Arrays.asList((bmno[]) this.f123864K.toArray(new bmno[0])));
                bkau.f123958c = this;
                bkau.show(getFragmentManager(), "cardLogoGridDialog");
            }
        } else if (view == this.f123879f) {
            m105155a(3, true);
        } else if (view == this.f123880g || view == this.f123881h || view == this.f123884k) {
            m105151D();
        } else if (view == this.f123882i || view == this.f123885l) {
            m105152E();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x003c A[EDGE_INSN: B:92:0x003c->B:14:0x003c ?: BREAK  , SYNTHETIC] */
    public void onCreate(Bundle bundle) {
        bmld bmld;
        bmnz bmnz;
        super.onCreate(bundle);
        if (NfcAdapter.getDefaultAdapter(getActivity()) != null) {
            Iterator it = new bxvv(((bmhi) this.f124069w).f129419j, bmhi.f129408k).iterator();
            while (true) {
                if (it.hasNext()) {
                    break;
                }
                bmnz = (bmnz) it.next();
                if (bmnz == bmnz.UI_SMALL_NFC_ICON || bmnz == bmnz.UI_NFC_DROP_DOWN_BUTTON || bmnz == bmnz.UI_NFC_DROP_DOWN_BUTTON_V2 || bmnz == bmnz.UI_NFC_ASSISTIVE_CHIP_BUTTON) {
                    this.f123867N = bmnz;
                }
                if (it.hasNext()) {
                }
            }
            this.f123867N = bmnz;
        }
        this.f123892s = m105154H() ? new bjwy(getActivity(), this) : new bjwz();
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        boolean z = true;
        if (bmdn.f128840h.size() <= 1) {
            bmdn bmdn2 = ((bmhi) this.f124069w).f129412b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            if (bmdn2.f128840h.size() == 1) {
                if (mo52961u()) {
                    bmdn bmdn3 = ((bmhi) this.f124069w).f129412b;
                    if (bmdn3 == null) {
                        bmdn3 = bmdn.f128831k;
                    }
                    bmlv bmlv = (bmlv) bmdn3.f128840h.get(0);
                    this.f123888o = bmlv;
                    int a = bmlu.m108157a(bmlv.f129968d);
                    if (a == 0 || a != 4) {
                        throw new IllegalArgumentException("Component group types other than field groups are not supported.");
                    }
                    bmlv bmlv2 = this.f123888o;
                    if (!(bmlv2.f129974j == 0 && bmlv2.f129975k == 0)) {
                        throw new IllegalArgumentException("Form header component group can only contain the card number field.");
                    }
                } else {
                    throw new IllegalArgumentException("Component groups are not supported.");
                }
            }
            if (bundle != null) {
                this.f123894u = (CreditCardEntryAction) bundle.getParcelable("creditCardEntryAction");
                this.f123895v = bjvp.m104742b(bundle, "creditCardInputResults", (bxxk) bmik.f129577j.mo74142c(7));
                this.f123862I = bundle.getBoolean("hasAppliedCreditCardInputResult");
                this.f123870Q = bundle.getBoolean("hasOcrBeenLaunched");
            } else {
                bmhi bmhi = (bmhi) this.f124069w;
                if ((bmhi.f129411a & 2) != 0) {
                    bmhj bmhj = bmhi.f129413c;
                    if (bmhj == null) {
                        bmhj = bmhj.f129426h;
                    }
                    if (bmhj.f129433f.size() <= 0) {
                        z = false;
                    }
                } else {
                    z = false;
                }
                this.f123870Q = z;
            }
            Iterator it2 = new bxvv(((bmhi) this.f124069w).f129418h, bmhi.f129407i).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                bmld = (bmld) it2.next();
                if (!(bmld == bmld.UI_CARD_NUMBER_DROP_DOWN || bmld == bmld.UI_CARD_NUMBER_DROP_DOWN_V2 || bmld == bmld.UI_SMALL_CAMERA_ICON || bmld == bmld.UI_LARGE_CAMERA_ICON || bmld == bmld.UI_BUTTON_BELOW_CARD_NUMBER || bmld == bmld.UI_ASSISTIVE_CHIP_BUTTON || (bmld == bmld.UI_LAUNCH_WITH_CAMERA && !this.f123870Q))) {
                }
            }
            akoz q = mo52959q();
            q.mo39628b();
            q.mo39625a(mo65984ax());
            bjvn.m104715a(q, bmld, ((bmhi) this.f124069w).f129425q);
            Intent a2 = q.mo39623a();
            this.f123865L = a2;
            if (a2 == null) {
                bmld = bmld.UI_NO_CAMERA_INPUT;
            }
            this.f123866M = bmld;
            if (this.f123894u == null) {
                CreditCardEntryAction creditCardEntryAction = new CreditCardEntryAction();
                this.f123894u = creditCardEntryAction;
                creditCardEntryAction.f151724a = mo65754w();
                this.f123894u.f151740q = m105154H();
                this.f123894u.f151741r = this.f123892s.mo65605c();
                CreditCardEntryAction creditCardEntryAction2 = this.f123894u;
                creditCardEntryAction2.f151747x = this.f123866M.f129927o;
                creditCardEntryAction2.f151748y = this.f123867N.f130199f;
                mo65755x();
            }
            if (this.f123895v == null) {
                this.f123895v = new ArrayList(2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Form header should contain at most a single component group.");
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        if (((bkcr) this.f123876c.getAdapter().getItem(i)).f124020c == 1) {
            m105151D();
        } else {
            m105152E();
        }
    }

    public final void onPause() {
        super.onPause();
        this.f123892s.mo65604b();
        this.f123868O = this.f123892s.mo65605c();
    }

    public final void onResume() {
        super.onResume();
        this.f123892s.mo65602a();
        boolean c = this.f123892s.mo65605c();
        if (!this.f123892s.mo65606d() && !this.f123868O && c) {
            m105159e("tagNfcInfoDialog");
            m105153F();
        }
        this.f123876c.mo71836e();
        CreditCardEntryAction creditCardEntryAction = this.f123894u;
        if (creditCardEntryAction.f151741r != c) {
            creditCardEntryAction.f151741r = c;
            mo65755x();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("viewState", this.f123891r);
        bundle.putParcelable("creditCardEntryAction", this.f123894u);
        bjvp.m104737a(bundle, "creditCardInputResults", this.f123895v);
        bundle.putBoolean("hasAppliedCreditCardInputResult", this.f123862I);
        bundle.putBoolean("hasOcrBeenLaunched", this.f123870Q);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkas.a(android.view.View, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(int, boolean):void */
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (bundle != null) {
            m105155a(bundle.getInt("viewState", 1), false);
        }
        this.f123876c.addTextChangedListener(this.f123871R);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmhi.f129409r.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public akoz mo52959q() {
        return new akoz(getActivity());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public bkbh mo52960t() {
        int i = this.f123961aF;
        LogContext at = mo65980at();
        bkbh bkbh = new bkbh();
        bkbh.setArguments(bkdx.m105383a(i, (bmhi) this.f124069w, at));
        return bkbh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public boolean mo52961u() {
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkas.a(android.view.View, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(int, boolean):void */
    /* renamed from: v */
    public final void mo65753v() {
        if (this.f123891r == 1) {
            m105155a(2, true);
        }
    }

    /* renamed from: w */
    public final boolean mo65754w() {
        return this.f123866M != bmld.UI_NO_CAMERA_INPUT;
    }

    /* renamed from: x */
    public final void mo65755x() {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 770);
        bundle.putParcelable("EventListener.EXTRA_BACKGROUND_EVENT_DATA", this.f123894u);
        mo51905a(7, bundle);
    }

    /* renamed from: b */
    public final void mo52058b(Intent intent) {
        if (m105154H() && !this.f123892s.mo65606d()) {
            bkiy bkiy = (bkiy) getFragmentManager().findFragmentByTag("tagNfcInfoDialog");
            mo52808n(false);
            if (bkiy != null) {
                bkiy.mo66064d();
            } else {
                m105159e("tagNfcErrorDialog");
                if (!(this.f123882i == null || this.f123891r == 2)) {
                    this.f123893t = true;
                    TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.uicNfcInProgressDrawable, C0126R.attr.uicNfcDrawable});
                    Drawable drawable = obtainStyledAttributes.getDrawable(0);
                    this.f123869P = obtainStyledAttributes.getDrawable(1);
                    obtainStyledAttributes.recycle();
                    this.f123882i.setImageDrawable(drawable);
                }
            }
            this.f123892s.mo65603a(intent);
        }
    }

    /* renamed from: c */
    public final void mo65061c() {
        CreditCardEntryAction creditCardEntryAction = this.f123894u;
        if (!creditCardEntryAction.f151737n) {
            creditCardEntryAction.f151737n = true;
            mo65755x();
        }
    }

    /* renamed from: b */
    public final void mo52774b(boolean z) {
        m105156a(this.f123873T, z);
    }

    /* renamed from: a */
    private final void m105156a(View view, boolean z) {
        int i;
        View view2;
        Button button;
        if (view != null) {
            View view3 = this.f123885l;
            if ((view3 != null && view3.getVisibility() == 0) || (((view2 = this.f123884k) != null && view2.getVisibility() == 0) || (this.f123872S && (button = this.f123883j) != null && button.getVisibility() == 0))) {
                if (!z) {
                    i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_assistive_chip_button_top_margin);
                } else {
                    i = getResources().getDimensionPixelSize(C0126R.dimen.wallet_uic_assistive_chip_button_top_margin_on_error);
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, i, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(int, boolean):void
     arg types: [int, int]
     candidates:
      bkas.a(android.view.View, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(int, boolean):void */
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
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
     arg types: [java.lang.String, int]
     candidates:
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
    private final void m105157a(bmik bmik, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        bmik bmik2 = bmik;
        long j2 = j;
        this.f123895v.add(bmik2);
        bmld bmld = bmld.UI_NO_CAMERA_INPUT;
        int a = bmij.m108062a(bmik2.f129580b);
        if (a == 0) {
            a = 1;
        }
        int i8 = a - 1;
        if (i8 == 1) {
            i2 = 2;
            i = 3;
        } else if (i8 != 2) {
            i2 = 1;
            i = 1;
        } else {
            i2 = 3;
            i = 4;
        }
        boolean z = !bmik2.f129582d.isEmpty();
        int i9 = bmik2.f129583e;
        boolean z2 = i9 > 0 && i9 <= 12;
        boolean z3 = !bmik2.f129585g.isEmpty();
        if (z) {
            if (this.f123861H && this.f123878e.getVisibility() == 0) {
                m105155a(3, false);
            }
            this.f123894u.f151725b = i2;
            this.f123876c.removeTextChangedListener(this.f123871R);
            this.f123876c.requestFocus();
            this.f123876c.mo71832a((CharSequence) bmik2.f129582d, i);
            this.f123876c.addTextChangedListener(this.f123871R);
            if (this.f123876c.mo65798cL()) {
                if (z2) {
                    bkbh bkbh = this.f123886m;
                    int i10 = bmik2.f129583e;
                    int i11 = bmik2.f129584f;
                    View a2 = bkbh.mo65772a(4);
                    if (a2 instanceof DateEditText) {
                        DateEditText dateEditText = (DateEditText) a2;
                        bjep bjep = bkbh.f123936s;
                        if (bjep != null) {
                            bjep.mo65058a(i2);
                        }
                        dateEditText.removeTextChangedListener(bkbh.f123937t);
                        dateEditText.requestFocus();
                        dateEditText.mo71883a(Integer.toString(i10), Integer.toString(i11 % 100), i);
                        dateEditText.addTextChangedListener(bkbh.f123937t);
                    }
                }
                if (z3) {
                    bkbh bkbh2 = this.f123886m;
                    String str = bmik2.f129585g;
                    View a3 = bkbh2.mo65772a(2);
                    if (a3 instanceof FormEditText) {
                        FormEditText formEditText = (FormEditText) a3;
                        bjep bjep2 = bkbh2.f123936s;
                        if (bjep2 != null) {
                            bjep2.mo65060b(i2);
                        }
                        formEditText.removeTextChangedListener(bkbh2.f123938u);
                        formEditText.requestFocus();
                        formEditText.mo71832a((CharSequence) str, i);
                        formEditText.addTextChangedListener(bkbh2.f123938u);
                    }
                    ArrayList arrayList = new ArrayList();
                    bmhq bmhq = bkbh2.f123934q;
                    if (bmhq != null) {
                        bxvt bxvt = bmhq.f129469j;
                        int size = bxvt.size();
                        int i12 = 0;
                        while (i12 < size) {
                            bxvt bxvt2 = bxvt;
                            ArrayList arrayList2 = (ArrayList) bkbh2.f123933p.get(((Integer) bxvt.get(i12)).intValue());
                            int size2 = arrayList2.size();
                            int i13 = size;
                            int i14 = 0;
                            while (true) {
                                i7 = i12 + 1;
                                if (i14 >= size2) {
                                    break;
                                }
                                ArrayList arrayList3 = arrayList2;
                                bkbf bkbf = (bkbf) arrayList2.get(i14);
                                int i15 = i12;
                                int i16 = size2;
                                if (bkbf.f123914a == 4) {
                                    arrayList.add((bjzp) bkbh2.f123922e.get(bkbf.f123915b));
                                }
                                i14++;
                                arrayList2 = arrayList3;
                                i12 = i15;
                                size2 = i16;
                            }
                            bxvt = bxvt2;
                            size = i13;
                            i12 = i7;
                        }
                    }
                    int size3 = arrayList.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        bjep bjep3 = bkbh2.f123936s;
                        if (bjep3 != null) {
                            bjep3.mo65060b(i2);
                        }
                        bjzp bjzp = (bjzp) arrayList.get(i17);
                        bjzp.mo65674a((bkae) null);
                        TextView textView = bjzp.f123708h.f123771h;
                        if (textView != null) {
                            i6 = size3;
                            if (textView instanceof FormEditText) {
                                ((FormEditText) textView).mo71832a((CharSequence) str, i);
                            } else {
                                textView.setText(str);
                            }
                        } else {
                            i6 = size3;
                        }
                        bjzp.mo65674a(bkbh2);
                        i17++;
                        size3 = i6;
                    }
                }
            }
        }
        if (i2 == 2) {
            CreditCardEntryAction creditCardEntryAction = this.f123894u;
            int i18 = creditCardEntryAction.f151742s;
            if (i18 >= 0) {
                i4 = i18 + 1;
            } else {
                i4 = 1;
            }
            creditCardEntryAction.f151742s = i4;
            int a4 = bmih.m108060a(bmik2.f129581c);
            if (a4 != 0) {
                i5 = a4;
            } else {
                i5 = 1;
            }
            creditCardEntryAction.f151743t = i5 - 1;
            CreditCardEntryAction creditCardEntryAction2 = this.f123894u;
            creditCardEntryAction2.f151726c = z;
            creditCardEntryAction2.f151731h = z2;
            creditCardEntryAction2.f151736m = z3;
        } else if (i2 == 3) {
            CreditCardEntryAction creditCardEntryAction3 = this.f123894u;
            int i19 = creditCardEntryAction3.f151744u;
            if (i19 >= 0) {
                i3 = i19 + 1;
            } else {
                i3 = 1;
            }
            creditCardEntryAction3.f151744u = i3;
            int a5 = bmih.m108060a(bmik2.f129581c);
            creditCardEntryAction3.f151745v = (a5 != 0 ? a5 : 1) - 1;
            CreditCardEntryAction creditCardEntryAction4 = this.f123894u;
            creditCardEntryAction4.f151728e = z;
            creditCardEntryAction4.f151733j = z2;
            creditCardEntryAction4.f151738o = z3;
            if (j2 >= 0) {
                creditCardEntryAction4.f151739p = j2;
            }
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown entry type: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        mo65755x();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [int, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void
     arg types: [com.google.android.wallet.ui.card.CardNumberEditText, com.google.android.wallet.ui.card.CardNumberEditText, int]
     candidates:
      com.google.android.wallet.ui.common.FormEditText.a(int, int, int):void
      com.google.android.wallet.ui.common.FormEditText.a(bkce, bkdf, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, com.google.android.wallet.ui.common.MaterialFieldLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkas.a(android.view.View, boolean):void
     arg types: [android.widget.HorizontalScrollView, int]
     candidates:
      bkas.a(int, boolean):void
      bkas.a(bmik, long):void
      bkas.a(int, android.os.Bundle):void
      bkdx.a(android.os.Bundle, android.view.View):android.view.View
      bkdx.a(int, android.os.Bundle):void
      bkdx.a(bmmv, java.util.List):void
      bkdx.a(java.util.List, boolean):boolean
      bkge.a(android.os.Bundle, android.view.View):android.view.View
      bkge.a(int, android.os.Bundle):void
      bkge.a(android.view.View, java.lang.String):void
      bkbr.a(int, com.google.android.wallet.clientlog.LogContext):android.os.Bundle
      bkbr.a(android.os.Bundle, android.view.View):android.view.View
      bjxu.a(android.view.View, java.lang.String):void
      bkdb.a(int, android.os.Bundle):void
      bjwm.a(bmmv, java.util.List):void
      bkas.a(android.view.View, boolean):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x024c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0262  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x034f  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x035d  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x038d  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03d3  */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z;
        int i;
        List list;
        CardImagesView cardImagesView;
        View findViewById;
        int ordinal;
        boolean z2;
        bkbh bkbh;
        int[] iArr = {C0126R.attr.internalUicCardFragmentRootLayout, C0126R.attr.internalUicCardFragmentCollapsibleStateEnabled, C0126R.attr.internalUicCardNumberOneCardModeStartMargin, C0126R.attr.internalUicCardFragmentCardImagesPosition, C0126R.attr.internalUicCardFragmentShowCardLogoGridAsAssistiveChipButton};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(iArr);
        int resourceId = obtainStyledAttributes.getResourceId(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCardFragmentRootLayout), C0126R.C0128layout.fragment_card);
        this.f123861H = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCardFragmentCollapsibleStateEnabled), false);
        this.f123863J = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCardNumberOneCardModeStartMargin), 0);
        int i2 = obtainStyledAttributes.getInt(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCardFragmentCardImagesPosition), 0);
        this.f123872S = obtainStyledAttributes.getBoolean(Arrays.binarySearch(iArr, (int) C0126R.attr.internalUicCardFragmentShowCardLogoGridAsAssistiveChipButton), false);
        obtainStyledAttributes.recycle();
        RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(resourceId, viewGroup, false);
        this.f123874a = relativeLayout;
        FormHeaderView formHeaderView = (FormHeaderView) relativeLayout.findViewById(C0126R.C0129id.header);
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn, layoutInflater, mo65982av(), this.f123857D);
        int a = bmhh.m108029a(((bmhi) this.f124069w).f129417g);
        if (a == 0 || a != 3) {
            int a2 = bmhh.m108029a(((bmhi) this.f124069w).f129417g);
            if (a2 == 0) {
                z = false;
            } else if (a2 != 4) {
                z = false;
            }
            if (i2 != 2) {
                this.f123875b = (CardImagesView) this.f123874a.findViewById(C0126R.C0129id.card_image_inside_card_number);
            } else if (i2 == 3 && (this.f123866M == bmld.UI_SMALL_CAMERA_ICON || this.f123867N == bmnz.UI_SMALL_NFC_ICON)) {
                this.f123875b = (CardImagesView) this.f123874a.findViewById(C0126R.C0129id.card_images_above);
            } else {
                this.f123875b = (CardImagesView) this.f123874a.findViewById(C0126R.C0129id.card_images);
            }
            this.f123875b.setVisibility(0);
            bmhi bmhi = (bmhi) this.f124069w;
            i = bmhi.f129416f;
            if (i < 0) {
                this.f123864K = bmhi.f129415e.subList(0, i);
                bmhi bmhi2 = (bmhi) this.f124069w;
                bxwc bxwc = bmhi2.f129415e;
                list = bxwc.subList(bmhi2.f129416f, bxwc.size());
            } else {
                this.f123864K = bmhi.f129415e;
                list = new ArrayList();
            }
            cardImagesView = this.f123875b;
            cardImagesView.f151860a = cardImagesView.mo71825a((bmno[]) this.f123864K.toArray(new bmno[0]), cardImagesView.f151864e, cardImagesView.f151865f, z, false);
            cardImagesView.f151861b = cardImagesView.mo71825a((bmno[]) list.toArray(new bmno[0]), cardImagesView.f151864e, cardImagesView.f151865f, z, true);
            cardImagesView.f151868i = z;
            if (cardImagesView.f151866g) {
                cardImagesView.f151863d = new bkat(cardImagesView.f151860a, cardImagesView.f151861b, cardImagesView.f151862c);
            } else if (z) {
                throw new IllegalArgumentException("One card mode cannot be used if allImagesStaticOnly is true.");
            }
            findViewById = this.f123874a.findViewById(C0126R.C0129id.card_number_layout);
            if (!(findViewById instanceof ViewStub)) {
                View inflate = ((ViewStub) findViewById).inflate();
                if (inflate instanceof MaterialFieldLayout) {
                    MaterialFieldLayout materialFieldLayout = (MaterialFieldLayout) inflate;
                    this.f123877d = materialFieldLayout;
                    this.f123876c = (CardNumberEditText) materialFieldLayout.findViewById(C0126R.C0129id.card_number);
                } else {
                    this.f123876c = (CardNumberEditText) inflate;
                }
            } else {
                MaterialFieldLayout materialFieldLayout2 = (MaterialFieldLayout) findViewById;
                this.f123877d = materialFieldLayout2;
                this.f123876c = (CardNumberEditText) materialFieldLayout2.findViewById(C0126R.C0129id.card_number);
            }
            this.f123876c.mo71919a(mo65980at());
            this.f123876c.mo71914a(mo65985l(1));
            CardNumberEditText cardNumberEditText = this.f123876c;
            cardNumberEditText.mo71917a((bkce) cardNumberEditText, (bkdf) cardNumberEditText, false);
            CardNumberEditText cardNumberEditText2 = this.f123876c;
            bmhq[] bmhqArr = (bmhq[]) ((bmhi) this.f124069w).f129421m.toArray(new bmhq[0]);
            cardNumberEditText2.f151883h = bmhqArr;
            cardNumberEditText2.f151884i = new int[bmhqArr.length];
            CardNumberEditText cardNumberEditText3 = this.f123876c;
            bmhm[] bmhmArr = (bmhm[]) ((bmhi) this.f124069w).f129424p.toArray(new bmhm[0]);
            cardNumberEditText3.f151887l = bmhmArr;
            cardNumberEditText3.f151888m = new int[bmhmArr.length];
            CardNumberEditText cardNumberEditText4 = this.f123876c;
            bmhi bmhi3 = (bmhi) this.f124069w;
            cardNumberEditText4.f151881f = bmhi3.f129422n;
            cardNumberEditText4.f151882g = bmhi3.f129423o;
            cardNumberEditText4.f151880e = this;
            cardNumberEditText4.f151989I = this;
            bjwl.m104784a(cardNumberEditText4, bmhi3.f129420l, this.f124196aK);
            bkde bkde = new bkde(((bmhi) this.f124069w).f129420l, this.f123874a.findViewById(mo52958m()), null);
            this.f123889p = bkde;
            this.f123858E.add(bkde);
            TextView textView = (TextView) this.f123874a.findViewById(C0126R.C0129id.card_number_concealed);
            this.f123878e = textView;
            if (!this.f123861H) {
                textView.setPadding(this.f123876c.getPaddingLeft(), this.f123876c.getPaddingTop(), this.f123876c.getPaddingRight(), this.f123876c.getPaddingBottom());
                int i3 = Build.VERSION.SDK_INT;
                int i4 = Build.VERSION.SDK_INT;
                View findViewById2 = this.f123874a.findViewById(C0126R.C0129id.expand_icon);
                this.f123879f = findViewById2;
                findViewById2.setOnClickListener(this);
            } else if (textView != null) {
                textView.setVisibility(8);
            }
            if (this.f123867N != bmnz.UI_SMALL_NFC_ICON) {
                ImageView imageView = (ImageView) this.f123874a.findViewById(C0126R.C0129id.nfc_icon);
                this.f123882i = imageView;
                imageView.setOnClickListener(this);
                this.f123882i.setVisibility(0);
            } else if (this.f123867N == bmnz.UI_NFC_DROP_DOWN_BUTTON) {
                this.f123876c.mo71834b(1);
                this.f123876c.setOnItemClickListener(this);
            } else if (this.f123867N == bmnz.UI_NFC_DROP_DOWN_BUTTON_V2) {
                this.f123876c.mo71834b(2);
                this.f123876c.setOnItemClickListener(this);
            } else if (this.f123867N == bmnz.UI_NFC_ASSISTIVE_CHIP_BUTTON) {
                View findViewById3 = this.f123874a.findViewById(C0126R.C0129id.nfc_chip_button);
                this.f123885l = findViewById3;
                findViewById3.setOnClickListener(this);
                this.f123885l.setVisibility(0);
                this.f123876c.f151895t = this.f123885l;
            }
            bmld bmld = bmld.UI_NO_CAMERA_INPUT;
            ordinal = this.f123866M.ordinal();
            if (ordinal == 1) {
                if (ordinal != 4) {
                    if (ordinal == 13) {
                        View findViewById4 = this.f123874a.findViewById(C0126R.C0129id.ocr_chip_button);
                        this.f123884k = findViewById4;
                        findViewById4.setOnClickListener(this);
                        this.f123884k.setVisibility(0);
                        this.f123876c.f151894s = this.f123884k;
                        z2 = false;
                    } else if (ordinal == 6) {
                        this.f123876c.mo71830a(1);
                        this.f123876c.setOnItemClickListener(this);
                        z2 = false;
                    } else if (ordinal == 7) {
                        this.f123876c.mo71830a(2);
                        this.f123876c.setOnItemClickListener(this);
                        z2 = false;
                    } else if (ordinal != 8) {
                        z2 = false;
                    } else {
                        MaterialFieldLayout materialFieldLayout3 = this.f123877d;
                        if (materialFieldLayout3 != null) {
                            RelativeLayout relativeLayout2 = (RelativeLayout) layoutInflater.inflate((int) C0126R.C0128layout.view_ocr_and_error, (ViewGroup) materialFieldLayout3, false);
                            this.f123877d.mo72050b(relativeLayout2);
                            this.f123881h = (LinearLayout) relativeLayout2.findViewById(C0126R.C0129id.below_card_number_ocr_button);
                        } else {
                            LinearLayout linearLayout = (LinearLayout) this.f123874a.findViewById(C0126R.C0129id.below_card_number_ocr_button);
                            this.f123881h = linearLayout;
                            linearLayout.setVisibility(0);
                        }
                        this.f123881h.setOnClickListener(this);
                        z2 = false;
                    }
                } else if (!this.f123870Q) {
                    z2 = true;
                }
                int a3 = bmhh.m108029a(((bmhi) this.f124069w).f129417g);
                if (a3 != 0 && a3 == 4) {
                    if (this.f123872S) {
                        this.f123883j = (Button) this.f123874a.findViewById(C0126R.C0129id.card_logo_grid_chip_button);
                    } else {
                        this.f123883j = (Button) this.f123874a.findViewById(C0126R.C0129id.card_logo_grid_button);
                    }
                    this.f123883j.setVisibility(0);
                    this.f123883j.setOnClickListener(this);
                }
                if (i2 == 1 && z) {
                    m105149B();
                }
                bkbh = (bkbh) getChildFragmentManager().findFragmentById(C0126R.C0129id.card_sub_form_fragment_holder);
                this.f123886m = bkbh;
                if (bkbh == null) {
                    this.f123886m = mo52960t();
                    getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.card_sub_form_fragment_holder, this.f123886m).commit();
                }
                bkbh bkbh2 = this.f123886m;
                bkbh2.f123935r = this;
                bkbh2.f123936s = this;
                bkbh2.f124196aK = this.f124196aK;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) this.f123874a.findViewById(C0126R.C0129id.assistive_chip_button_layout);
                this.f123873T = horizontalScrollView;
                m105156a((View) horizontalScrollView, false);
                this.f123858E.add(new bkde(this.f123886m));
                this.f123871R = new bkar(this);
                if (z2) {
                    m105151D();
                    this.f123870Q = true;
                }
                return this.f123874a;
            }
            View findViewById5 = this.f123874a.findViewById(C0126R.C0129id.ocr_icon);
            this.f123880g = findViewById5;
            findViewById5.setOnClickListener(this);
            this.f123880g.setVisibility(0);
            z2 = false;
            int a32 = bmhh.m108029a(((bmhi) this.f124069w).f129417g);
            if (this.f123872S) {
            }
            this.f123883j.setVisibility(0);
            this.f123883j.setOnClickListener(this);
            m105149B();
            bkbh = (bkbh) getChildFragmentManager().findFragmentById(C0126R.C0129id.card_sub_form_fragment_holder);
            this.f123886m = bkbh;
            if (bkbh == null) {
            }
            bkbh bkbh22 = this.f123886m;
            bkbh22.f123935r = this;
            bkbh22.f123936s = this;
            bkbh22.f124196aK = this.f124196aK;
            HorizontalScrollView horizontalScrollView2 = (HorizontalScrollView) this.f123874a.findViewById(C0126R.C0129id.assistive_chip_button_layout);
            this.f123873T = horizontalScrollView2;
            m105156a((View) horizontalScrollView2, false);
            this.f123858E.add(new bkde(this.f123886m));
            this.f123871R = new bkar(this);
            if (z2) {
            }
            return this.f123874a;
        }
        z = true;
        if (i2 != 2) {
        }
        this.f123875b.setVisibility(0);
        bmhi bmhi4 = (bmhi) this.f124069w;
        i = bmhi4.f129416f;
        if (i < 0) {
        }
        cardImagesView = this.f123875b;
        cardImagesView.f151860a = cardImagesView.mo71825a((bmno[]) this.f123864K.toArray(new bmno[0]), cardImagesView.f151864e, cardImagesView.f151865f, z, false);
        cardImagesView.f151861b = cardImagesView.mo71825a((bmno[]) list.toArray(new bmno[0]), cardImagesView.f151864e, cardImagesView.f151865f, z, true);
        cardImagesView.f151868i = z;
        if (cardImagesView.f151866g) {
        }
        findViewById = this.f123874a.findViewById(C0126R.C0129id.card_number_layout);
        if (!(findViewById instanceof ViewStub)) {
        }
        this.f123876c.mo71919a(mo65980at());
        this.f123876c.mo71914a(mo65985l(1));
        CardNumberEditText cardNumberEditText5 = this.f123876c;
        cardNumberEditText5.mo71917a((bkce) cardNumberEditText5, (bkdf) cardNumberEditText5, false);
        CardNumberEditText cardNumberEditText22 = this.f123876c;
        bmhq[] bmhqArr2 = (bmhq[]) ((bmhi) this.f124069w).f129421m.toArray(new bmhq[0]);
        cardNumberEditText22.f151883h = bmhqArr2;
        cardNumberEditText22.f151884i = new int[bmhqArr2.length];
        CardNumberEditText cardNumberEditText32 = this.f123876c;
        bmhm[] bmhmArr2 = (bmhm[]) ((bmhi) this.f124069w).f129424p.toArray(new bmhm[0]);
        cardNumberEditText32.f151887l = bmhmArr2;
        cardNumberEditText32.f151888m = new int[bmhmArr2.length];
        CardNumberEditText cardNumberEditText42 = this.f123876c;
        bmhi bmhi32 = (bmhi) this.f124069w;
        cardNumberEditText42.f151881f = bmhi32.f129422n;
        cardNumberEditText42.f151882g = bmhi32.f129423o;
        cardNumberEditText42.f151880e = this;
        cardNumberEditText42.f151989I = this;
        bjwl.m104784a(cardNumberEditText42, bmhi32.f129420l, this.f124196aK);
        bkde bkde2 = new bkde(((bmhi) this.f124069w).f129420l, this.f123874a.findViewById(mo52958m()), null);
        this.f123889p = bkde2;
        this.f123858E.add(bkde2);
        TextView textView2 = (TextView) this.f123874a.findViewById(C0126R.C0129id.card_number_concealed);
        this.f123878e = textView2;
        if (!this.f123861H) {
        }
        if (this.f123867N != bmnz.UI_SMALL_NFC_ICON) {
        }
        bmld bmld2 = bmld.UI_NO_CAMERA_INPUT;
        ordinal = this.f123866M.ordinal();
        if (ordinal == 1) {
        }
        z2 = false;
        int a322 = bmhh.m108029a(((bmhi) this.f124069w).f129417g);
        if (this.f123872S) {
        }
        this.f123883j.setVisibility(0);
        this.f123883j.setOnClickListener(this);
        m105149B();
        bkbh = (bkbh) getChildFragmentManager().findFragmentById(C0126R.C0129id.card_sub_form_fragment_holder);
        this.f123886m = bkbh;
        if (bkbh == null) {
        }
        bkbh bkbh222 = this.f123886m;
        bkbh222.f123935r = this;
        bkbh222.f123936s = this;
        bkbh222.f124196aK = this.f124196aK;
        HorizontalScrollView horizontalScrollView22 = (HorizontalScrollView) this.f123874a.findViewById(C0126R.C0129id.assistive_chip_button_layout);
        this.f123873T = horizontalScrollView22;
        m105156a((View) horizontalScrollView22, false);
        this.f123858E.add(new bkde(this.f123886m));
        this.f123871R = new bkar(this);
        if (z2) {
        }
        return this.f123874a;
    }

    /* renamed from: a */
    public void mo51905a(int i, Bundle bundle) {
        if ((i == 4 || i == 12) && bkde.m105359l(this.f123858E) && !this.f123862I) {
            bmhi bmhi = (bmhi) this.f124069w;
            if ((bmhi.f129411a & 2) != 0) {
                bmhj bmhj = bmhi.f129413c;
                if (bmhj == null) {
                    bmhj = bmhj.f129426h;
                }
                if (bmhj.f129433f.size() > 0) {
                    this.f123862I = true;
                    bmhj bmhj2 = ((bmhi) this.f124069w).f129413c;
                    if (bmhj2 == null) {
                        bmhj2 = bmhj.f129426h;
                    }
                    m105157a((bmik) bmhj2.f129433f.get(0), -1);
                }
            }
        }
        super.mo51905a(i, bundle);
    }

    /* renamed from: a */
    public final void mo39808a(int i, bjws bjws, long j) {
        m105159e("tagNfcInfoDialog");
        mo52808n(true);
        if (this.f123893t) {
            this.f123893t = false;
            this.f123882i.setImageDrawable(this.f123869P);
        }
        bxvd da = bmik.f129577j.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmik bmik = (bmik) da.f164949b;
        bmik.f129580b = 2;
        bmik.f129579a = 1 | bmik.f129579a;
        int a = bmih.m108060a(bkfr.m105604d(i));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bmik bmik2 = (bmik) da.f164949b;
        int i2 = a - 1;
        if (a != 0) {
            bmik2.f129581c = i2;
            bmik2.f129579a |= 2;
            if (bjws != null) {
                if (bjws.mo65594a()) {
                    String str = bjws.f123530a;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmik bmik3 = (bmik) da.f164949b;
                    str.getClass();
                    bmik3.f129579a |= 4;
                    bmik3.f129582d = str;
                }
                if (bjws.mo65595b()) {
                    int i3 = bjws.f123531b;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmik bmik4 = (bmik) da.f164949b;
                    int i4 = bmik4.f129579a | 8;
                    bmik4.f129579a = i4;
                    bmik4.f129583e = i3;
                    int i5 = bjws.f123532c;
                    bmik4.f129579a = i4 | 16;
                    bmik4.f129584f = i5;
                }
                if (bjws.mo65596c()) {
                    String str2 = bjws.f123533d;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bmik bmik5 = (bmik) da.f164949b;
                    str2.getClass();
                    bmik5.f129579a |= 32;
                    bmik5.f129585g = str2;
                }
            }
            bmik bmik6 = (bmik) da.mo74062i();
            this.f123894u.f151746w = bkfr.m105609e(i);
            switch (i) {
                case 1:
                case 2:
                    break;
                case 3:
                case 4:
                    m105158c(getString(C0126R.string.wallet_uic_nfc_unsupported_error_message));
                    break;
                case 5:
                    m105158c(getString(C0126R.string.wallet_uic_nfc_transceive_error_message));
                    break;
                case 6:
                    m105158c(getString(C0126R.string.wallet_uic_nfc_timeout_error_message));
                    break;
                case 7:
                    m105158c(getString(C0126R.string.wallet_uic_nfc_rate_limit_error_message));
                    break;
                default:
                    StringBuilder sb = new StringBuilder(36);
                    sb.append("Unknown NFC result code: ");
                    sb.append(i);
                    throw new IllegalStateException(sb.toString());
            }
            m105157a(bmik6, j);
            return;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.b(android.view.View, boolean):void
     arg types: [android.widget.Button, boolean]
     candidates:
      bkfr.b(android.content.Context, java.lang.String):int
      bkfr.b(android.content.Context, int):android.graphics.drawable.Drawable
      bkfr.b(java.lang.String, java.lang.String):java.lang.String
      bkfr.b(android.content.Context, android.view.View):void
      bkfr.b(android.view.View, int):void
      bkfr.b(android.widget.TextView, java.lang.String):void
      bkfr.b(boolean, java.lang.Object):void
      bkfr.b(android.view.View, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.view.View, boolean):void
     arg types: [android.view.ViewGroup, boolean]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.view.View, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkfr.a(android.view.View, boolean):void
     arg types: [android.widget.Button, boolean]
     candidates:
      bkfr.a(android.content.Context, int):int
      bkfr.a(android.view.View, android.view.View):int
      bkfr.a(android.content.Context, java.lang.String):android.content.Intent
      bkfr.a(android.content.res.Resources, java.util.List):java.lang.String
      bkfr.a(java.lang.String, java.lang.String):java.lang.String
      bkfr.a(android.content.Context, android.view.View):void
      bkfr.a(android.content.Context, android.widget.Button):void
      bkfr.a(android.view.View, int):void
      bkfr.a(android.view.View, android.util.TypedValue):void
      bkfr.a(android.view.View, java.lang.CharSequence):void
      bkfr.a(android.view.ViewGroup, int):void
      bkfr.a(android.view.ViewGroup, boolean):void
      bkfr.a(android.widget.ImageView, android.content.res.ColorStateList):void
      bkfr.a(android.widget.TextView, java.lang.String):void
      bkfr.a(android.widget.TextView, boolean):void
      bkfr.a(boolean, java.lang.Object):void
      bkfr.a(android.content.Context, bmap):boolean
      bkfr.a(android.content.Context, int[]):boolean
      bkfr.a(com.google.android.chimera.Activity, android.widget.TextView):boolean
      bkfr.a(android.view.View, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0309  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0067 A[LOOP:1: B:21:0x0065->B:22:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x012b  */
    /* renamed from: a */
    public final void mo65750a(bmhq bmhq) {
        boolean z;
        bkbh bkbh;
        int size;
        int i;
        int size2;
        int i2;
        SummaryExpanderWrapper summaryExpanderWrapper;
        bkas bkas;
        int i3;
        int i4;
        boolean z2;
        int i5;
        bmlv bmlv;
        bkbm bkbm;
        boolean z3;
        boolean z4;
        bmhq bmhq2 = bmhq;
        int i6 = 0;
        if (this.f123887n == null) {
            if (this.f123890q != null) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (bmhq2 == null) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z3 == z4) {
                z = true;
                this.f123890q = bmhq2;
                bkbh = this.f123886m;
                bkbh.f123934q = bmhq2;
                size = bkbh.f123920c.size();
                for (i = 0; i < size; i++) {
                    View view = (View) bkbh.f123920c.get(i);
                    if (view.getParent() != bkbh.f123918a) {
                        view.setVisibility(8);
                        ((ViewGroup) view.getParent()).removeView(view);
                        bkbh.f123918a.addView(view);
                        bkde.m105345a((List) bkbh.f123933p.get(i), 0);
                    } else {
                        bkfr.m105595b(view, z);
                    }
                }
                size2 = bkbh.f123919b.size();
                for (i2 = 0; i2 < size2; i2++) {
                    bkbh.f123918a.removeView((SummaryExpanderWrapper) bkbh.f123919b.get(i2));
                }
                bkbh.f123919b.clear();
                if (bkbh.f123928k && (bkbm = bkbh.f123931n) != null) {
                    bkbm.mo65786b(bkbh);
                    bkbh.f123931n = null;
                }
                if (bkbh.mo52776bU() != null) {
                    bkbh.mo52776bU().mo66040d();
                }
                summaryExpanderWrapper = this.f123887n;
                if (summaryExpanderWrapper != null) {
                    summaryExpanderWrapper.f152305a.mo66035b();
                    this.f123887n.mo72160a(this.f123889p);
                    if (bmhq2 == null) {
                        this.f123887n.mo72169i();
                    }
                    if (bmhq2 != null) {
                        bmlv = (bmlv) bmhq2.f129470k.get(0);
                    } else {
                        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
                        if (bmdn == null) {
                            bmdn = bmdn.f128831k;
                        }
                        bmlv = (bmlv) bmdn.f128840h.get(0);
                    }
                    SummaryExpanderWrapper summaryExpanderWrapper2 = this.f123887n;
                    bmlh bmlh = bmlv.f129977m;
                    if (bmlh == null) {
                        bmlh = bmlh.f129935d;
                    }
                    summaryExpanderWrapper2.mo72163a(bmlh, bmlv.f129970f);
                }
                if (bmhq2 == null) {
                    this.f123875b.mo71824a((bmno) ((bmhi) this.f124069w).f129415e.get(bmhq2.f129468i));
                    Button button = this.f123883j;
                    if (button != null) {
                        bkfr.m105595b((View) button, z);
                    }
                    bkbh bkbh2 = this.f123886m;
                    SummaryExpanderWrapper summaryExpanderWrapper3 = this.f123887n;
                    bxwc bxwc = bkbh2.f123934q.f129470k;
                    int size3 = bxwc.size();
                    if (summaryExpanderWrapper3 == null) {
                        summaryExpanderWrapper3 = null;
                    } else if (((bmlv) bxwc.get(0)).f129975k == 0) {
                        summaryExpanderWrapper3.mo72169i();
                        summaryExpanderWrapper3 = null;
                        i3 = 1;
                        bkbh2.f123927j.mo65616b();
                        int i7 = -1;
                        i4 = 0;
                        int i8 = -1;
                        boolean z5 = false;
                        while (i4 < bkbh2.f123934q.f129469j.size()) {
                            int b = bkbh2.f123934q.f129469j.mo74151b(i4);
                            boolean z6 = i3 < size3 && i4 >= ((bmlv) bxwc.get(i3)).f129974j + i7 && i4 <= ((bmlv) bxwc.get(i3)).f129975k + i7;
                            if (!z6 || ((bmhk) ((bmhi) bkbh2.f124069w).f129414d.get(b)).f129440d.size() <= 0) {
                                z2 = false;
                            } else {
                                z2 = ((bmhc) ((bmhk) ((bmhi) bkbh2.f124069w).f129414d.get(b)).f129440d.get(i6)).f129398a == 2;
                            }
                            if (!z6) {
                                i5 = size3;
                            } else if (!z2) {
                                if (i4 == ((bmlv) bxwc.get(i3)).f129974j + i7) {
                                    summaryExpanderWrapper3 = bkbh2.mo52963a((bmlv) bxwc.get(i3), bkbh2.f123918a);
                                    summaryExpanderWrapper3.setId(bkbh2.f123927j.mo65614a());
                                    bkbh2.f123918a.addView(summaryExpanderWrapper3);
                                    bkbh2.f123919b.add(summaryExpanderWrapper3);
                                    bkbh2.mo52776bU().mo66032a((bkiq) summaryExpanderWrapper3);
                                    bkbh.m105207a((RelativeLayout.LayoutParams) summaryExpanderWrapper3.getLayoutParams(), i8);
                                    i8 = summaryExpanderWrapper3.getId();
                                }
                                bmhk bmhk = (bmhk) ((bmhi) bkbh2.f124069w).f129414d.get(b);
                                ViewGroup viewGroup = (ViewGroup) bkbh2.f123920c.get(b);
                                bkbh2.f123918a.removeView(viewGroup);
                                summaryExpanderWrapper3.f152309e.addView(viewGroup);
                                viewGroup.setVisibility(0);
                                i5 = size3;
                                summaryExpanderWrapper3.mo72160a(new bkde(0, viewGroup.getChildAt(0), null));
                                ArrayList arrayList = (ArrayList) bkbh2.f123933p.get(b);
                                int size4 = arrayList.size();
                                for (int i9 = 0; i9 < size4; i9++) {
                                    summaryExpanderWrapper3.mo72160a((bkde) arrayList.get(i9));
                                }
                                if ((bmhk.f129437a & 8) != 0) {
                                    bmjf bmjf = bmhk.f129443g;
                                    if (bmjf == null) {
                                        bmjf = bmjf.f129685i;
                                    }
                                    summaryExpanderWrapper3.mo72160a(new bkde(bmjf.f129688b, viewGroup.getChildAt(viewGroup.getChildCount() - 1), null));
                                }
                                if (i4 == ((bmlv) bxwc.get(i3)).f129975k - 1) {
                                    summaryExpanderWrapper3.mo72169i();
                                    i3++;
                                    summaryExpanderWrapper3 = null;
                                }
                                i4++;
                                i6 = 0;
                                i7 = -1;
                                size3 = i5;
                            } else {
                                i5 = size3;
                            }
                            ViewGroup viewGroup2 = (ViewGroup) bkbh2.f123920c.get(b);
                            bkbh.m105207a((RelativeLayout.LayoutParams) viewGroup2.getLayoutParams(), i8);
                            int id = viewGroup2.getId();
                            if (!z5) {
                                bkfr.m105568a((View) viewGroup2, z);
                                if (!((List) bkbh2.f123925h.get(b)).isEmpty()) {
                                    z5 = true;
                                }
                            }
                            if (z2) {
                                bjzo bjzo = (bjzo) ((bkbf) ((ArrayList) bkbh2.f123933p.get(b)).get(0)).f124039e;
                                bjzo.f123701c.mo72106a(((bmlv) bxwc.get(i3)).f129970f);
                                bkbh2.mo52776bU().mo66032a(bjzo);
                                i3++;
                            } else if (bkbh2.mo52776bU() != null) {
                                ArrayList arrayList2 = (ArrayList) bkbh2.f123933p.get(b);
                                int size5 = arrayList2.size();
                                for (int i10 = 0; i10 < size5; i10++) {
                                    if (((bkbf) arrayList2.get(i10)).f124039e instanceof bjzo) {
                                        bkbh2.mo52776bU().mo66032a((bjzo) ((bkbf) arrayList2.get(i10)).f124039e);
                                    }
                                }
                            }
                            i8 = id;
                            i4++;
                            i6 = 0;
                            i7 = -1;
                            size3 = i5;
                        }
                        if (bkbh2.mo52776bU() != null) {
                            bkbh2.mo52776bU().mo66046g();
                        }
                        if (bkbh2.f123928k) {
                            bkas = this;
                        } else if (bkbh2.f123934q.f129469j.size() > 0) {
                            int b2 = bkbh2.f123934q.f129469j.mo74151b(0);
                            if (bkbh2.f123929l.get(b2) != null) {
                                int i11 = Build.VERSION.SDK_INT;
                                bkbh2.f123931n = (bkbm) bkbh2.f123929l.get(b2);
                                bkbh2.f123931n.mo65785a(bkbh2);
                                bkas = this;
                            } else {
                                bkas = this;
                            }
                        } else {
                            bkas = this;
                        }
                    }
                    i3 = 0;
                    bkbh2.f123927j.mo65616b();
                    int i72 = -1;
                    i4 = 0;
                    int i82 = -1;
                    boolean z52 = false;
                    while (i4 < bkbh2.f123934q.f129469j.size()) {
                    }
                    if (bkbh2.mo52776bU() != null) {
                    }
                    if (bkbh2.f123928k) {
                    }
                } else {
                    bkas = this;
                    bkas.f123875b.mo71824a(null);
                    Button button2 = bkas.f123883j;
                    if (button2 != null) {
                        bkfr.m105568a((View) button2, z);
                    }
                }
                bkas.mo51905a(1, Bundle.EMPTY);
                if (bmhq == null) {
                    bkas.mo51905a(20, Bundle.EMPTY);
                    return;
                }
                return;
            }
        }
        z = false;
        this.f123890q = bmhq2;
        bkbh = this.f123886m;
        bkbh.f123934q = bmhq2;
        size = bkbh.f123920c.size();
        while (i < size) {
        }
        size2 = bkbh.f123919b.size();
        while (i2 < size2) {
        }
        bkbh.f123919b.clear();
        bkbm.mo65786b(bkbh);
        bkbh.f123931n = null;
        if (bkbh.mo52776bU() != null) {
        }
        summaryExpanderWrapper = this.f123887n;
        if (summaryExpanderWrapper != null) {
        }
        if (bmhq2 == null) {
        }
        bkas.mo51905a(1, Bundle.EMPTY);
        if (bmhq == null) {
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void
     arg types: [java.lang.String, int]
     candidates:
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.util.List, java.lang.String):int
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.card.CardNumberEditText.a(java.lang.String, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.String, int):java.lang.String
      com.google.android.wallet.ui.common.FormEditText.a(android.content.Context, android.util.AttributeSet):void
      com.google.android.wallet.ui.common.FormEditText.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(bmnn, boolean):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, int):void
      com.google.android.wallet.ui.common.FormEditText.a(int, int):boolean
      bjwm.a(bmmv, java.util.List):void
      com.google.android.wallet.ui.common.FormEditText.a(java.lang.CharSequence, boolean):void */
    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bmaf bmaf = bmas.f128496a;
        if (bmaf == null) {
            bmaf = bmaf.f128436d;
        }
        String str = bmaf.f128438a;
        bmdn bmdn = ((bmhi) this.f124069w).f129412b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if (!str.equals(bmdn.f128834b)) {
            boolean a = this.f123886m.mo52281a(bmas);
            if (a) {
                m105160z();
            }
            return a;
        }
        bmaf bmaf2 = bmas.f128496a;
        if (bmaf2 == null) {
            bmaf2 = bmaf.f128436d;
        }
        if (bmaf2.f128439b == 1) {
            this.f123876c.mo65794a((CharSequence) bmas.f128497b, true);
            CreditCardEntryAction creditCardEntryAction = this.f123894u;
            if (!creditCardEntryAction.f151727d) {
                creditCardEntryAction.f151727d = true;
                mo65755x();
            }
            m105160z();
            return true;
        }
        bmaf bmaf3 = bmas.f128496a;
        if (bmaf3 == null) {
            bmaf3 = bmaf.f128436d;
        }
        int i = bmaf3.f128439b;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Unknown FormFieldMessage fieldId: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        if (r5 != false) goto L_0x0057;
     */
    /* renamed from: a */
    public final boolean mo52804a(List list) {
        boolean a = super.mo52804a(list);
        if (this.f123894u.f151727d || TextUtils.isEmpty(this.f123876c.getError())) {
            bkbh bkbh = this.f123886m;
            CreditCardEntryAction creditCardEntryAction = this.f123894u;
            View a2 = bkbh.mo65772a(4);
            boolean z = false;
            if (!creditCardEntryAction.f151732i && a2 != null && !TextUtils.isEmpty(bkft.m105632a(a2))) {
                creditCardEntryAction.f151732i = true;
                z = true;
            }
            View a3 = bkbh.mo65772a(2);
            if (!creditCardEntryAction.f151737n && a3 != null && !TextUtils.isEmpty(bkft.m105632a(a3))) {
                creditCardEntryAction.f151737n = true;
            }
        } else {
            this.f123894u.f151727d = true;
        }
        mo65755x();
        if (!a) {
            m105160z();
        }
        return a;
    }
}
