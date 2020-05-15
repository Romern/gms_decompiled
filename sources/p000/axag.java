package p000;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.InfoMessageView;
import com.google.android.wallet.p097ui.common.SelectorView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

/* renamed from: axag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axag extends bkdx implements bkfe, bkdb, bjwp {

    /* renamed from: a */
    SelectorView f95505a;

    /* renamed from: b */
    LinearLayout f95506b;

    /* renamed from: c */
    TextView f95507c;

    /* renamed from: d */
    public final HashMap f95508d = new HashMap(3);

    /* renamed from: e */
    public long f95509e = 0;

    /* renamed from: f */
    private final bkip f95510f = new bkip();

    /* renamed from: g */
    private long[] f95511g;

    /* renamed from: h */
    private final bjes f95512h = new bjes(15);

    /* renamed from: a */
    public static axag m81905a(bmet bmet, int i, LogContext logContext) {
        axag axag = new axag();
        axag.setArguments(bkdx.m105383a(i, bmet, logContext));
        return axag;
    }

    /* renamed from: B */
    public final boolean mo52723B() {
        int length = this.f95511g.length;
        bkfr.m105567a(this.f95505a, getResources().getQuantityString(C0126R.plurals.wallet_expanding_customer_selector, length, Integer.valueOf(length)));
        return true;
    }

    /* renamed from: C */
    public final void mo52724C() {
        LinearLayout linearLayout = this.f95506b;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
    }

    /* renamed from: D */
    public final void mo52725D() {
        LinearLayout linearLayout = this.f95506b;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
    }

    /* renamed from: W */
    public final long mo52837W() {
        mo65884y();
        return ((bmet) this.f124069w).f129021c;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        return false;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f95510f;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return Collections.emptyList();
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f95512h;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        SelectorView selectorView = this.f95505a;
        if (selectorView != null) {
            selectorView.setEnabled(z);
        }
    }

    /* renamed from: l */
    public final bmeu mo52938l() {
        bxvd da = bmeu.f129030f.mo74144da();
        Object obj = this.f95508d.get(Long.valueOf(this.f95509e));
        if (obj instanceof bmet) {
            ByteString bxtx = ((bmet) obj).f129028j;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmeu bmeu = (bmeu) da.f164949b;
            bxtx.getClass();
            bmeu.f129032a |= 1;
            bmeu.f129033b = bxtx;
        } else if (obj instanceof bmes) {
            ByteString bxtx2 = ((bmes) obj).f129014e;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmeu bmeu2 = (bmeu) da.f164949b;
            bxtx2.getClass();
            bmeu2.f129032a |= 1;
            bmeu2.f129033b = bxtx2;
        }
        bmet bmet = (bmet) this.f124069w;
        if ((bmet.f129019a & 1) != 0) {
            bmdn bmdn = bmet.f129020b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            String str = bmdn.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmeu bmeu3 = (bmeu) da.f164949b;
            str.getClass();
            bmeu3.f129032a |= 2;
            bmeu3.f129034c = str;
            bmdn bmdn2 = ((bmet) this.f124069w).f129020b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            long j = bmdn2.f128835c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmeu bmeu4 = (bmeu) da.f164949b;
            bmeu4.f129032a |= 4;
            bmeu4.f129035d = j;
            bmdn bmdn3 = ((bmet) this.f124069w).f129020b;
            if (bmdn3 == null) {
                bmdn3 = bmdn.f128831k;
            }
            ByteString bxtx3 = bmdn3.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmeu bmeu5 = (bmeu) da.f164949b;
            bxtx3.getClass();
            bmeu5.f129032a |= 8;
            bmeu5.f129036e = bxtx3;
        }
        return (bmeu) da.mo74062i();
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        boolean z = !TextUtils.isEmpty(((bmet) this.f124069w).f129027i);
        if (z) {
            i = ((bmet) this.f124069w).f129024f.size() + 1;
        } else {
            i = ((bmet) this.f124069w).f129024f.size();
        }
        this.f95511g = new long[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 == i - 1 && z) {
                this.f95511g[i2] = axah.m81926a(this.f124069w);
                this.f95508d.put(Long.valueOf(this.f95511g[i2]), this.f124069w);
            } else {
                this.f95511g[i2] = axah.m81926a((bmes) ((bmet) this.f124069w).f129024f.get(i2));
                this.f95508d.put(Long.valueOf(this.f95511g[i2]), (bmes) ((bmet) this.f124069w).f129024f.get(i2));
            }
        }
    }

    public final void onResume() {
        Object obj;
        long j;
        axah axah;
        super.onResume();
        long j2 = this.f95509e;
        if (j2 != ((bmet) this.f124069w).f129026h) {
            obj = this.f95508d.containsKey(Long.valueOf(j2)) ? this.f95508d.get(Long.valueOf(this.f95509e)) : this.f95508d.get(Long.valueOf(axah.m81926a(this.f124069w)));
        } else {
            obj = null;
        }
        this.f95505a.removeAllViews();
        Activity activity = getActivity();
        int length = this.f95511g.length;
        for (int i = 0; i < length; i++) {
            Object obj2 = this.f95508d.get(Long.valueOf(this.f95511g[i]));
            if (obj2 instanceof bmes) {
                bmes bmes = (bmes) obj2;
                axah = new axaf(activity);
                axah.f124136q = bmes;
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < bmes.f129012c.size(); i2++) {
                    sb.append((CharSequence) awia.m79968a(((bmnr) bmes.f129012c.get(i2)).f130159e));
                    if (i2 != bmes.f129012c.size() - 1) {
                        sb.append("\n");
                    }
                }
                axah.f95513a.setText(bmes.f129011b);
                axah.f95514b.setText(sb.toString());
                axah.f95514b.setVisibility(0);
                axah.setEnabled(true);
                axah.mo65945a(axah.m81926a(obj2));
            } else if (obj2 instanceof bmet) {
                bmet bmet = (bmet) obj2;
                axah = new axad(activity);
                axah.f124136q = bmet;
                axah.f95513a.setText(bmet.f129027i);
                axah.mo65945a(axah.m81926a(obj2));
            } else {
                throw new IllegalArgumentException(String.format("%s %s", "Unexpected option type: ", obj2));
            }
            axah.f124133n = this.f124071y;
            this.f95505a.addView(axah);
        }
        SelectorView selectorView = this.f95505a;
        if (obj != null) {
            j = axah.m81926a(obj);
        } else {
            j = 0;
        }
        selectorView.mo72096a(j);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putLong("selectedOptionUiRef", this.f95509e);
        bundle.putBoolean("isErrorVisible", this.f95507c.getVisibility() == 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmet.f129017l.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        return null;
    }

    /* renamed from: z */
    public final void mo52731z() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, ?[OBJECT, ARRAY], int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.widget.LinearLayout, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.wallet_fragment_customer_selector, (ViewGroup) null, false);
        SelectorView selectorView = (SelectorView) inflate.findViewById(C0126R.C0129id.customer_selector_view);
        this.f95505a = selectorView;
        this.f95510f.mo66032a((bkiq) selectorView);
        SelectorView selectorView2 = this.f95505a;
        selectorView2.f152209e = this;
        selectorView2.f152210f = this;
        selectorView2.f152205a.mo66034a(((bmet) this.f124069w).f129029k);
        this.f95505a.f152212h = mo65980at();
        this.f95505a.f152211g = mo52837W();
        int size = ((bmet) this.f124069w).f129023e.size();
        if (size > 0) {
            bjxv aq = mo65818aq();
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(C0126R.C0129id.customer_selector_header);
            this.f95506b = linearLayout;
            linearLayout.setTag(C0126R.C0129id.summary_expander_transition_name, "expandedField");
            for (int i = 0; i < size; i++) {
                InfoMessageView infoMessageView = (InfoMessageView) this.f123963aH.inflate((int) C0126R.C0128layout.view_info_message_text, (ViewGroup) this.f95506b, false);
                infoMessageView.setId(aq.mo65614a());
                infoMessageView.mo72003a((bmnr) ((bmet) this.f124069w).f129023e.get(i));
                this.f95506b.addView(infoMessageView);
            }
            if (this.f95505a.f152205a.f124294c) {
                this.f95506b.setVisibility(0);
            }
        }
        this.f95507c = (TextView) inflate.findViewById(C0126R.C0129id.error);
        if (bundle != null && bundle.getBoolean("isErrorVisible", false)) {
            this.f95507c.setVisibility(0);
        }
        if (bundle != null && bundle.containsKey("selectedOptionUiRef")) {
            this.f95509e = bundle.getLong("selectedOptionUiRef");
        } else {
            bxxc bxxc = this.f124069w;
            long j = ((bmet) bxxc).f129025g;
            if (j == 0) {
                this.f95509e = axah.m81926a(bxxc);
            } else {
                this.f95509e = j;
            }
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo52728a(Object obj, Object obj2) {
        if (obj2 == null || axah.m81926a(obj2) != axah.m81926a(obj)) {
            this.f95509e = axah.m81926a(obj);
        }
        TextView textView = this.f95507c;
        if (textView != null && textView.getVisibility() == 0) {
            this.f95507c.setVisibility(8);
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
            if (a - 1 != 3) {
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
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return bjwl.m104786a(bmne, (long) ((int) this.f95509e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo52937a(List list, boolean z) {
        TextView textView;
        if (!((Boolean) awjb.f94523a.mo58455c()).booleanValue() || this.f95509e != ((bmet) this.f124069w).f129026h) {
            return super.mo52937a(list, z);
        }
        if (z && (textView = this.f95507c) != null) {
            textView.setVisibility(0);
        }
        return false;
    }
}
