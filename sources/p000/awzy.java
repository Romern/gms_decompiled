package p000;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.analytics.events.OrchestrationViewEvent;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.ImageWithCaptionView;
import com.google.android.wallet.p097ui.common.SelectorView;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: awzy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awzy extends bkag implements bkfe, bkdb, bjwp, bkfv, bkda {

    /* renamed from: a */
    SelectorView f95461a;

    /* renamed from: b */
    FrameLayout f95462b;

    /* renamed from: c */
    bjzo f95463c;

    /* renamed from: d */
    TextView f95464d;

    /* renamed from: e */
    TextView f95465e;

    /* renamed from: f */
    View f95466f;

    /* renamed from: g */
    public Object f95467g;

    /* renamed from: h */
    final HashMap f95468h = new HashMap();

    /* renamed from: i */
    public bkcb f95469i;

    /* renamed from: k */
    private ArrayList f95470k = new ArrayList();

    /* renamed from: l */
    private final ArrayList f95471l = new ArrayList();

    /* renamed from: m */
    private final bkip f95472m = new bkip();

    /* renamed from: n */
    private String f95473n;

    /* renamed from: o */
    private final bjes f95474o = new bjes(8);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(boolean, java.lang.Object):void
     arg types: [boolean, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(java.lang.String, java.lang.Object):void
      sdo.a(boolean, java.lang.Object):void */
    /* renamed from: a */
    public static awzy m81847a(bmbr bmbr, int i, String str, LogContext logContext) {
        int a = bmbk.m107867a(bmbr.f128599p);
        boolean z = true;
        if (a == 0) {
            a = 1;
        }
        if (a != 3) {
            z = false;
        }
        sdo.m34971a(z, (Object) "AddressSelectorFragment is only used for address form with selector display type");
        awzy awzy = new awzy();
        Bundle a2 = bkdx.m105383a(i, bmbr, logContext);
        a2.putString("analyticsSessionId", str);
        awzy.setArguments(a2);
        return awzy;
    }

    /* renamed from: t */
    private final boolean m81849t() {
        int a;
        Object obj = this.f95467g;
        if ((obj instanceof bmbr) || ((obj instanceof bmbz) && (a = bmby.m107883a(((bmbz) obj).f128639d)) != 0 && a == 4)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        this.f95462b.setVisibility(8);
        int childCount = this.f95461a.getChildCount();
        bkfr.m105567a(this.f95461a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_shipping_address_selector, childCount, Integer.valueOf(childCount)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
        TextView textView = this.f95464d;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void mo52725D() {
        TextView textView = this.f95464d;
        if (textView != null) {
            textView.setVisibility(0);
        }
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        Object obj = this.f95467g;
        if (obj == null || this.f95463c == null) {
            return (obj instanceof bmbz) && !m81849t();
        }
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95472m;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        ArrayList arrayList = new ArrayList(1);
        bjzo bjzo = this.f95463c;
        if (bjzo != null) {
            arrayList.add(bjzo);
        }
        return arrayList;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new bkde(((bmbr) this.f124069w).f128587d, this.f95461a, null));
        if (m81849t()) {
            arrayList.add(new bkde(this.f95463c));
        }
        return arrayList;
    }

    /* renamed from: cl */
    public final bwdm mo52930cl() {
        if (!(this.f95467g instanceof bmbz) || m81849t()) {
            return null;
        }
        bmbz bmbz = (bmbz) this.f95467g;
        if ((bmbz.f128636a & 64) == 0) {
            return null;
        }
        bwdm bwdm = bmbz.f128643h;
        return bwdm == null ? bwdm.f158904d : bwdm;
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95474o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        SelectorView selectorView = this.f95461a;
        if (selectorView != null) {
            selectorView.setEnabled(z);
        }
        bjzo bjzo = this.f95463c;
        if (bjzo != null) {
            bjzo.mo52808n(z);
        }
    }

    /* renamed from: l */
    public final void mo52931l() {
        Object obj;
        bwef A = this.f95469i.mo52029A();
        if ((A.f158971a & 2) != 0) {
            bwee bwee = A.f158975e;
            if (bwee == null) {
                bwee = bwee.f158964d;
            }
            int a = bwed.m121874a(bwee.f158968c);
            if (a != 0 && a == 2) {
                bmdn bmdn = ((bmbr) this.f124069w).f128585b;
                if (bmdn == null) {
                    bmdn = bmdn.f128831k;
                }
                int a2 = bmae.m107829a(bmdn.f128842j);
                if (a2 != 0 && a2 == 2) {
                    SelectorView selectorView = this.f95461a;
                    View view = selectorView.f152206b;
                    if (view != null) {
                        obj = ((bkfc) view).mo65943f();
                        ((bkfc) selectorView.f152206b).mo65941b(false, false);
                        selectorView.f152206b = null;
                    } else {
                        obj = null;
                    }
                    selectorView.f152209e.mo52728a(null, obj);
                }
            }
        }
    }

    /* renamed from: m */
    public final CharSequence mo52932m() {
        return this.f95465e.getText();
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f95473n = getArguments().getString("analyticsSessionId");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean a = awia.m79988a((bmbr) this.f124069w);
        if (bundle != null) {
            this.f95470k = bjyu.m104929a(bundle.getLongArray("displayedOptions"));
        } else {
            bxwc bxwc = ((bmbr) this.f124069w).f128592i;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                this.f95470k.add(Long.valueOf(awzz.m81870a((bmbz) bxwc.get(i))));
            }
            if (!a) {
                this.f95470k.add(Long.valueOf(awzz.m81870a(this.f124069w)));
            }
        }
        bxwc bxwc2 = ((bmbr) this.f124069w).f128592i;
        int size2 = bxwc2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            bmbz bmbz = (bmbz) bxwc2.get(i2);
            this.f95468h.put(Long.valueOf(awzz.m81870a(bmbz)), bmbz);
        }
        if (!a) {
            HashMap hashMap = this.f95468h;
            Long valueOf = Long.valueOf(awzz.m81870a(this.f124069w));
            bmbr bmbr = (bmbr) this.f124069w;
            bxvd bxvd = (bxvd) bmbr.mo74142c(5);
            bxvd.mo73625a((bxvk) bmbr);
            bmbn bmbn = (bmbn) bxvd;
            if (bmbn.f164950c) {
                bmbn.mo74035c();
                bmbn.f164950c = false;
            }
            bxvu bxvu = bmbr.f128574y;
            ((bmbr) bmbn.f164949b).f128592i = bxvk.m124030de();
            if (bmbn.f164950c) {
                bmbn.mo74035c();
                bmbn.f164950c = false;
            }
            bmbr bmbr2 = (bmbr) bmbn.f164949b;
            bmbr2.f128599p = 1;
            int i3 = bmbr2.f128584a | 8192;
            bmbr2.f128584a = i3;
            "".getClass();
            bmbr2.f128584a = i3 | 16;
            bmbr2.f128589f = "";
            hashMap.put(valueOf, (bmbr) bmbn.mo74062i());
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Object obj = this.f95467g;
        if (obj instanceof bmbz) {
            bjvp.m104736a(bundle, "selectedAddress", (bmbz) obj);
        } else if (obj instanceof bmbr) {
            bjvp.m104736a(bundle, "selectedAddressForm", (bmbr) obj);
        }
        bundle.putLongArray("displayedOptions", bjyu.m104931b(this.f95470k));
        bundle.putCharSequence("errorMessage", mo52932m());
    }

    /* renamed from: z */
    public final void mo52731z() {
        if (m81849t()) {
            this.f95462b.setVisibility(0);
        }
    }

    /* renamed from: a */
    private final void m81848a(bmbr bmbr) {
        bjzo bjzo = (bjzo) getChildFragmentManager().findFragmentById(C0126R.C0129id.add_address_form_holder);
        this.f95463c = bjzo;
        if (bjzo == null) {
            this.f95463c = bjzo.m105003a(bmbr, this.f123961aF, true, true, false, mo65980at());
            getChildFragmentManager().beginTransaction().replace(C0126R.C0129id.add_address_form_holder, this.f95463c).commit();
            OrchestrationViewEvent.m93828c(getActivity(), this.f95473n, this.f95463c.f123709i);
        }
        this.f95463c.mo65666a(this.f123790j);
        this.f95472m.mo66032a(this.f95463c);
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:77:0x026e */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:78:0x026e */
    /* JADX WARN: Type inference failed for: r12v0, types: [bkfd, android.view.View], assign insn: PHI: (r12v0 ?) = (r12v1 ?), (r12v2 ?) binds: [B:77:0x026e, B:78:0x026e] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.widget.LinearLayout, bkfd, awzz, awzw], assign insn: 0x021e: CONSTRUCTOR  (r12v1 ? I:awzw) = (r6v4 com.google.android.chimera.Activity) call: awzw.<init>(android.content.Context):void type: CONSTRUCTOR */
    /* JADX WARN: Type inference failed for: r12v2, types: [android.widget.LinearLayout, awzx, bkfd, awzz], assign insn: 0x014e: CONSTRUCTOR  (r12v2 ? I:awzx) = (r6v4 com.google.android.chimera.Activity) call: awzx.<init>(android.content.Context):void type: CONSTRUCTOR */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object obj;
        boolean z;
        ? r12;
        bmno bmno;
        Bundle bundle2 = bundle;
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_address_selector, (ViewGroup) null, false);
        SelectorView selectorView = (SelectorView) inflate.findViewById(C0126R.C0129id.address_selector_view);
        this.f95461a = selectorView;
        this.f95472m.mo66032a((bkiq) selectorView);
        SelectorView selectorView2 = this.f95461a;
        selectorView2.f152209e = this;
        selectorView2.f152207c = this;
        selectorView2.f152210f = this;
        selectorView2.f152212h = mo65980at();
        this.f95461a.f152211g = mo52837W();
        this.f95462b = (FrameLayout) inflate.findViewById(C0126R.C0129id.add_address_form_holder);
        this.f95466f = inflate.findViewById(C0126R.C0129id.address_selector_form_separator);
        this.f95465e = (TextView) inflate.findViewById(C0126R.C0129id.error);
        if (!((bmbr) this.f124069w).f128589f.isEmpty()) {
            TextView textView = (TextView) inflate.findViewById(C0126R.C0129id.address_selector_header);
            this.f95464d = textView;
            textView.setText(((bmbr) this.f124069w).f128589f);
            this.f95464d.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
        }
        if (bundle2 == null) {
            bxxc bxxc = this.f124069w;
            bmbr bmbr = (bmbr) bxxc;
            long j = bmbr.f128596m;
            if (j != 0) {
                if (j == bmbr.f128598o) {
                    obj = this.f95468h.get(Long.valueOf(awzz.m81870a(bxxc)));
                } else if (j != bmbr.f128597n) {
                    obj = this.f95468h.get(Long.valueOf(j));
                } else {
                    throw new IllegalArgumentException("Does not support unselected state.");
                }
            } else if (bmbr.f128595l >= 0 && bmbr.f128592i.size() > 0) {
                HashMap hashMap = this.f95468h;
                bmbr bmbr2 = (bmbr) this.f124069w;
                obj = hashMap.get(Long.valueOf(awzz.m81870a((bmbz) bmbr2.f128592i.get(bmbr2.f128595l))));
            } else {
                obj = this.f95468h.get(Long.valueOf(awzz.m81870a(this.f124069w)));
            }
        } else {
            obj = bundle2.containsKey("selectedAddress") ? bjvp.m104730a(bundle2, "selectedAddress", (bxxk) bmbz.f128634i.mo74142c(7)) : bundle2.containsKey("selectedAddressForm") ? bjvp.m104730a(bundle2, "selectedAddressForm", (bxxk) bmbr.f128572L.mo74142c(7)) : null;
        }
        this.f95461a.removeAllViews();
        Activity activity = getActivity();
        int size = this.f95470k.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = this.f95468h.get(this.f95470k.get(i));
            if (obj2 instanceof bmbz) {
                bmbz bmbz = (bmbz) obj2;
                r12 = new awzx(activity);
                r12.f124136q = bmbz;
                if (awzx.f95458c == null) {
                    awzx.f95458c = r12.getResources().getString(C0126R.string.wallet_uic_string_list_append_to_end, "", "");
                }
                bmbs bmbs = bmbz.f128638c;
                if (bmbs == null) {
                    bmbs = bmbs.f128609j;
                }
                btwp btwp = bmbs.f128615e;
                if (btwp == null) {
                    btwp = btwp.f152728s;
                }
                char[] cArr = {'N', 'R'};
                bmbs bmbs2 = bmbz.f128638c;
                if (bmbs2 == null) {
                    bmbs2 = bmbs.f128609j;
                }
                r12.f95459a = bjtg.m104557a(btwp, "\n", cArr, bmbs2.f128616f);
                bmbs bmbs3 = bmbz.f128638c;
                if (bmbs3 == null) {
                    bmbs3 = bmbs.f128609j;
                }
                btwp btwp2 = bmbs3.f128615e;
                if (btwp2 == null) {
                    btwp2 = btwp.f152728s;
                }
                String str = awzx.f95458c;
                char[] cArr2 = {'N', 'R'};
                bmbs bmbs4 = bmbz.f128638c;
                if (bmbs4 == null) {
                    bmbs4 = bmbs.f128609j;
                }
                r12.f95460b = bjtg.m104557a(btwp2, str, cArr2, bmbs4.f128616f);
                r12.f95477f.setText(r12.f95460b);
                TextView textView2 = r12.f95476e;
                bmbs bmbs5 = bmbz.f128638c;
                if (bmbs5 == null) {
                    bmbs5 = bmbs.f128609j;
                }
                btwp btwp3 = bmbs5.f128615e;
                if (btwp3 == null) {
                    btwp3 = btwp.f152728s;
                }
                textView2.setText(btwp3.f152747r);
                r12.f95477f.setVisibility(0);
                r12.f95478g.setText(((bmbz) r12.f124136q).f128640e);
                ImageWithCaptionView imageWithCaptionView = r12.f95475d;
                bmbz bmbz2 = (bmbz) r12.f124136q;
                if ((bmbz2.f128636a & 32) != 0) {
                    bmno = bmbz2.f128642g;
                    if (bmno == null) {
                        bmno = bmno.f130138m;
                    }
                } else {
                    bmno = null;
                }
                imageWithCaptionView.mo71992a(bmno, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
                r12.setEnabled(true);
                r12.mo65945a(awzz.m81870a(obj2));
                z = false;
            } else if (obj2 instanceof bmbr) {
                bmbr bmbr3 = (bmbr) obj2;
                r12 = new awzw(activity);
                r12.f124136q = bmbr3;
                r12.f95476e.setText(bmbr3.f128594k);
                TypedArray obtainStyledAttributes = r12.getContext().getTheme().obtainStyledAttributes(new int[]{C0126R.attr.drawableWalletAdd});
                r12.f95475d.setDefaultImageResId(obtainStyledAttributes.getResourceId(0, 0));
                z = false;
                r12.f95475d.mo71992a((bmno) null, awia.m79973a(), ((Boolean) awir.f94488a.mo58455c()).booleanValue());
                obtainStyledAttributes.recycle();
                r12.f95480i.setVisibility(8);
                r12.mo65945a(awzz.m81870a(obj2));
            } else {
                String valueOf = String.valueOf(obj2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Unexpected option type: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            r12.f124133n = this.f124071y;
            this.f95461a.addView(r12);
        }
        this.f95461a.mo72096a(awzz.m81870a(obj));
        if (bundle2 != null) {
            mo52929a(bundle2.getCharSequence("errorMessage"));
        }
        return inflate;
    }

    /* renamed from: a */
    public final bmbs mo52928a(Bundle bundle) {
        bjzo bjzo = this.f95463c;
        if (bjzo != null) {
            return bjzo.mo52928a(bundle);
        }
        if (!(this.f95467g instanceof bmbz) || m81849t()) {
            throw new IllegalStateException("Invalid address form value");
        }
        bmbs bmbs = ((bmbz) this.f95467g).f128638c;
        return bmbs == null ? bmbs.f128609j : bmbs;
    }

    /* renamed from: a */
    public final void mo52929a(CharSequence charSequence) {
        this.f95465e.setText(charSequence);
        this.f95465e.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    /* renamed from: a */
    public final void mo52728a(Object obj, Object obj2) {
        boolean z;
        bkip bkip = this.f95461a.f152205a;
        int i = 1;
        int i2 = 0;
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        bkip.mo66034a(z);
        if (awzz.m81870a(obj) != awzz.m81870a(obj2)) {
            if (obj2 != null) {
                OrchestrationViewEvent.m93827b(getActivity(), this.f95473n, this.f95474o);
            }
            if (awzz.m81870a(this.f95467g) != awzz.m81870a(obj)) {
                this.f95467g = obj;
                bjwl.m104782a(this.f124196aK, this.f95471l, awzz.m81870a(obj));
            }
            bjzo bjzo = this.f95463c;
            if (bjzo != null) {
                this.f95472m.mo66036b(bjzo);
                getChildFragmentManager().beginTransaction().remove(this.f95463c).commit();
                this.f95463c = null;
                getChildFragmentManager().executePendingTransactions();
            }
            if (m81849t()) {
                if (obj instanceof bmbr) {
                    m81848a((bmbr) obj);
                } else if (obj instanceof bmbz) {
                    bmbr bmbr = (bmbr) this.f124069w;
                    bmbz bmbz = (bmbz) obj;
                    int a = bmbw.m107881a(bmbz.f128641f);
                    if (a != 0 && a == 2) {
                        bxvd bxvd = (bxvd) bmbr.mo74142c(5);
                        bxvd.mo73625a((bxvk) bmbr);
                        bmbn bmbn = (bmbn) bxvd;
                        bmbs bmbs = bmbz.f128638c;
                        if (bmbs == null) {
                            bmbs = bmbs.f128609j;
                        }
                        if (bmbn.f164950c) {
                            bmbn.mo74035c();
                            bmbn.f164950c = false;
                        }
                        bmbr bmbr2 = (bmbr) bmbn.f164949b;
                        bxvu bxvu = bmbr.f128574y;
                        bmbs.getClass();
                        bmbr2.f128590g = bmbs;
                        int i3 = bmbr2.f128584a | 32;
                        bmbr2.f128584a = i3;
                        long j = bmbz.f128637b;
                        bmbr2.f128584a = i3 | 4;
                        bmbr2.f128587d = j;
                        bmbr2.f128608z = bxvk.m124028dc();
                        bmbm[] bmbmArr = {bmbm.PHONE_NUMBER};
                        bmbm[] bmbmArr2 = new bmbm[(bjtl.f123283c.length - 1)];
                        int length = bjtl.f123283c.length;
                        int i4 = 0;
                        for (int i5 = 0; i5 < length; i5++) {
                            if (bjyu.m104928a(bmbmArr, bjtl.f123283c[i5]) < 0) {
                                bmbmArr2[i4] = bjtl.f123283c[i5];
                                i4++;
                            }
                        }
                        List<bmbm> asList = Arrays.asList(bmbmArr2);
                        if (bmbn.f164950c) {
                            bmbn.mo74035c();
                            bmbn.f164950c = false;
                        }
                        bmbr bmbr3 = (bmbr) bmbn.f164949b;
                        if (!bmbr3.f128608z.mo73666a()) {
                            bmbr3.f128608z = bxvk.m124019a(bmbr3.f128608z);
                        }
                        for (bmbm bmbm : asList) {
                            bmbr3.f128608z.mo74153d(bmbm.f128563q);
                        }
                        if (bmbn.f164950c) {
                            bmbn.mo74035c();
                            bmbn.f164950c = false;
                        }
                        bmbr bmbr4 = (bmbr) bmbn.f164949b;
                        bmbr4.f128599p = 1;
                        int i6 = bmbr4.f128584a | 8192;
                        bmbr4.f128584a = i6;
                        "".getClass();
                        int i7 = i6 | 16;
                        bmbr4.f128584a = i7;
                        bmbr4.f128589f = "";
                        bmbr4.f128584a = i7 | AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE;
                        bmbr4.f128604u = true;
                        bmbr4.f128592i = bxvk.m124030de();
                        m81848a((bmbr) bmbn.mo74062i());
                    } else {
                        Object[] objArr = new Object[1];
                        int a2 = bmbw.m107881a(bmbz.f128641f);
                        if (a2 != 0) {
                            i = a2;
                        }
                        objArr[0] = Integer.valueOf(i - 1);
                        throw new IllegalStateException(String.format("Unsupported fix type %s for DisplayAddress", objArr));
                    }
                }
            }
            View view = this.f95466f;
            if (this.f124071y || mo52777bV().size() == 0) {
                i2 = 8;
            }
            view.setVisibility(i2);
        }
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            int i2 = 1;
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            if (!(i3 == 1 || i3 == 18)) {
                if (i3 == 3) {
                    continue;
                } else if (i3 != 4) {
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[1];
                    int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                    if (a2 != 0) {
                        i2 = a2;
                    }
                    objArr[0] = Integer.valueOf(i2 - 1);
                    throw new IllegalArgumentException(String.format(locale, "Unsupported trigger type: %s", objArr));
                }
            }
            this.f95471l.add(bjwj);
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        bjzo bjzo = this.f95463c;
        return bjzo != null && bjzo.mo52281a(bmas);
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return bjwl.m104786a(bmne, awzz.m81870a(this.f95467g));
    }
}
