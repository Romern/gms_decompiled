package p000;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.DialogFragment;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.WebViewLayout;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bkjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bkjc extends bkdx implements bjxr, aptl {

    /* renamed from: a */
    private final bjes f124360a = new bjes(1745);

    /* renamed from: c */
    public WebViewLayout f124361c;

    /* renamed from: d */
    public bjxt f124362d;

    /* renamed from: e */
    public String f124363e;

    /* renamed from: f */
    public String f124364f;

    /* renamed from: g */
    public bjym f124365g;

    /* renamed from: h */
    public String f124366h;

    /* renamed from: i */
    public boolean f124367i;

    /* renamed from: j */
    public boolean f124368j;

    /* renamed from: k */
    public bmkd f124369k;

    /* renamed from: l */
    public List f124370l = new ArrayList();

    /* renamed from: a */
    public static Bundle m105926a(bmki bmki, ArrayList arrayList, int i, LogContext logContext) {
        Bundle a = bkdx.m105383a(i, bmki, logContext);
        bjvp.m104737a(a, "successfullyValidatedApps", arrayList);
        return a;
    }

    /* renamed from: B */
    public final void mo66071B() {
        mo51905a(10, Bundle.EMPTY);
    }

    /* renamed from: C */
    public final void mo66072C() {
        ViewGroup viewGroup = (ViewGroup) this.f124361c.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.f124361c);
        }
        this.f124361c = null;
        this.f124362d = null;
    }

    /* renamed from: E */
    public final void mo65299E() {
        mo66074c(((bmki) this.f124069w).f129816m);
    }

    /* renamed from: F */
    public final void mo65400F() {
        DialogFragment dialogFragment = (DialogFragment) getFragmentManager().findFragmentByTag("errorDialog");
        if (dialogFragment != null) {
            dialogFragment.dismiss();
        }
        bkga bkga = new bkga();
        bkga.f124182a = getString(C0126R.string.wallet_uic_error_title);
        bkga.f124183b = ((bmki) this.f124069w).f129819p;
        bkga.f124184c = getString(17039370);
        bkga.f124185d = this.f123961aF;
        bkga.mo65976a().show(getFragmentManager(), "errorDialog");
    }

    /* renamed from: a */
    public abstract Intent mo53020a(Context context, bmkd bmkd, String str, int i, LogContext logContext);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo53021a(Bundle bundle) {
        throw null;
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        return false;
    }

    /* renamed from: b */
    public final void mo65403b(String str, bjym bjym) {
        this.f124363e = str;
        this.f124364f = null;
        this.f124365g = bjym;
        mo51905a(8, Bundle.EMPTY);
    }

    /* renamed from: bR */
    public boolean mo52775bR() {
        return mo66076w() || mo66077x() || mo66078z() || this.f124367i;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return null;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return new ArrayList();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo66074c(String str) {
        WebViewLayout webViewLayout = this.f124361c;
        if (webViewLayout != null) {
            webViewLayout.setVisibility(4);
        }
        this.f124363e = null;
        this.f124364f = null;
        this.f124365g = null;
        Bundle bundle = new Bundle();
        bjvg.m104691a(bundle, 2, getString(C0126R.string.wallet_uic_error_title), str, null, null, getString(17039370));
        mo51905a(5, bundle);
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124360a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        WebViewLayout webViewLayout = this.f124361c;
        if (webViewLayout != null) {
            webViewLayout.setEnabled(this.f124195aJ);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo53022m() {
        throw null;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3;
        if (i != 502) {
            if (i != 6000) {
                super.onActivityResult(i, i2, intent);
            } else {
                aptm.m70977a(getActivity(), this);
            }
        } else if (i2 == -1) {
            m105927a(778, 0);
            this.f124363e = intent.getData().toString();
            this.f124364f = null;
            this.f124365g = null;
            mo51905a(8, Bundle.EMPTY);
        } else if (i2 != 0 || !this.f124369k.f129793k) {
            if (intent != null) {
                m105927a(778, intent.getIntExtra("analyticsResult", -1));
            } else {
                if (i2 == 0) {
                    i3 = 5;
                } else {
                    i3 = 4;
                }
                m105927a(778, i3);
            }
            mo51905a(10, Bundle.EMPTY);
        } else {
            this.f124367i = true;
            mo51905a(8, Bundle.EMPTY);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        bjxt bjxt = this.f124362d;
        if (bjxt != null) {
            bjxt.f123642k = this;
            bjxt.f123605e = this;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f124370l = bjvp.m104742b(getArguments(), "successfullyValidatedApps", (bxxk) bmkd.f129781l.mo74142c(7));
    }

    public final void onDetach() {
        super.onDetach();
        bjxt bjxt = this.f124362d;
        if (bjxt != null) {
            bjxt.f123642k = null;
            bjxt.f123605e = null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bjvp.m104736a(bundle, "launchedAppRedirectInfo", this.f124369k);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final bxxk mo52787p() {
        return (bxxk) bmki.f129802w.mo74142c(7);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final bmdn mo52789r() {
        mo65884y();
        bmdn bmdn = ((bmki) this.f124069w).f129805b;
        return bmdn == null ? bmdn.f128831k : bmdn;
    }

    /* renamed from: v */
    public final boolean mo66075v() {
        return !((bmki) this.f124069w).f129806c.isEmpty();
    }

    /* renamed from: w */
    public final boolean mo66076w() {
        return !TextUtils.isEmpty(this.f124364f);
    }

    /* renamed from: x */
    public final boolean mo66077x() {
        return !TextUtils.isEmpty(this.f124363e);
    }

    /* renamed from: z */
    public final boolean mo66078z() {
        return !TextUtils.isEmpty(this.f124366h);
    }

    /* renamed from: f */
    public final void mo65404f(String str) {
        this.f124366h = str;
        mo51905a(8, Bundle.EMPTY);
        LogContext at = mo65980at();
        if (!bjst.m104536d(at)) {
            Log.e("ClientLog", "Tried to log landingMessageCallbackReceived() in an invalid session.");
            return;
        }
        bxvd e = bjst.m104537e(at);
        bwfe bwfe = bwfe.EVENT_NAME_LANDING_MESSAGE_CALLBACK_RECEIVED;
        if (e.f164950c) {
            e.mo74035c();
            e.f164950c = false;
        }
        bwfr bwfr = (bwfr) e.f164949b;
        bwfr bwfr2 = bwfr.f159113m;
        bwfr.f159121g = bwfe.f159083I;
        bwfr.f159115a |= 4;
        bjst.m104528a(at.mo71783b(), (bwfr) e.mo74062i());
    }

    /* renamed from: a */
    private final void m105927a(int i, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", i);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i2);
        mo51905a(7, bundle);
    }

    /* renamed from: a */
    public final void mo47595a() {
        this.f124368j = true;
        mo53022m();
        m105927a(776, 0);
    }

    /* renamed from: a */
    public final void mo47596a(int i, Intent intent) {
        if (bjvb.m104682a()) {
            mo47595a();
            return;
        }
        m105927a(776, i);
        rfi rfi = rfi.f42868a;
        if (rfy.m33547b(i)) {
            rfx.m33534a(i, getActivity(), new bkjb(this));
        } else {
            mo66071B();
        }
    }

    /* renamed from: a */
    public final void mo65401a(int i, String str) {
        if (i != -1 || !"net::ERR_CACHE_MISS".equals(str)) {
            if (i != -8 && i != -6 && i != -1) {
                mo66074c(((bmki) this.f124069w).f129818o);
            }
        } else if (getActivity() != null && !getActivity().isFinishing()) {
            mo66074c(((bmki) this.f124069w).f129817n);
        }
    }

    /* renamed from: a */
    public final void mo65611a(bmkd bmkd, String str) {
        int size = this.f124370l.size();
        for (int i = 0; i < size; i++) {
            bmkd bmkd2 = (bmkd) this.f124370l.get(i);
            int a = bmkc.m108109a(bmkd2.f129783a);
            if (a != 0 && a == 2 && bmkd.f129784b.equals(bmkd2.f129784b)) {
                this.f124361c.f152238a.stopLoading();
                mo66072C();
                TypedArray obtainStyledAttributes = this.f123962aG.obtainStyledAttributes(new int[]{C0126R.attr.uicPopupRedirectActivityTheme});
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                obtainStyledAttributes.recycle();
                startActivityForResult(mo53020a(getActivity(), bmkd, str, resourceId, mo65980at()), 502);
                this.f124369k = bmkd;
                return;
            }
        }
        String valueOf = String.valueOf(str);
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("Trying to Intent to invalid third-party app with URL: ") : "Trying to Intent to invalid third-party app with URL: ".concat(valueOf));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66073a(bxvd bxvd) {
        WebViewLayout webViewLayout = this.f124361c;
        if (webViewLayout != null) {
            webViewLayout.setVisibility(4);
        }
        this.f124363e = null;
        this.f124364f = null;
        this.f124365g = null;
        Bundle bundle = new Bundle();
        bjvg.m104691a(bundle, 2, getString(C0126R.string.wallet_uic_error_title), null, bxvd, null, getString(17039370));
        mo51905a(5, bundle);
    }

    /* renamed from: a */
    public final void mo65402a(String str, bjym bjym) {
        this.f124364f = str;
        this.f124363e = null;
        this.f124365g = bjym;
        mo51905a(8, Bundle.EMPTY);
    }
}
