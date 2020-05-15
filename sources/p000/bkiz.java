package p000;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.wallet.p088ui.redirect.PopupRedirectChimeraActivity;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.p097ui.common.FormHeaderView;
import com.google.android.wallet.redirect.StartAndroidAppRedirectActivity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: bkiz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkiz extends bkdx implements View.OnClickListener, bjzm, bjwp {

    /* renamed from: o */
    static final C1231nx f124338o = new C1231nx(5);

    /* renamed from: a */
    public boolean f124339a;

    /* renamed from: b */
    boolean f124340b;

    /* renamed from: c */
    boolean f124341c;

    /* renamed from: d */
    byte[] f124342d;

    /* renamed from: e */
    public ArrayList f124343e = new ArrayList();

    /* renamed from: f */
    bmkd f124344f;

    /* renamed from: g */
    public bjzk f124345g;

    /* renamed from: h */
    FormHeaderView f124346h;

    /* renamed from: i */
    bkbn f124347i;

    /* renamed from: j */
    final ArrayList f124348j = new ArrayList();

    /* renamed from: k */
    public bmkj f124349k;

    /* renamed from: l */
    public boolean f124350l = false;

    /* renamed from: m */
    public boolean f124351m = false;

    /* renamed from: n */
    final ArrayList f124352n = new ArrayList();

    /* renamed from: p */
    private final bjes f124353p = new bjes(1745);

    /* renamed from: q */
    private final bkip f124354q = new bkip();

    /* renamed from: r */
    private bkjj f124355r;

    /* renamed from: s */
    private final ArrayList f124356s = new ArrayList(2);

    /* renamed from: a */
    private static Bundle m105896a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray("EventListener.EXTRA_DEPENDENCY_GRAPH_ACTION_TOKEN", bArr);
        return bundle;
    }

    /* renamed from: b */
    private final void m105898b(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", z);
        mo51905a(18, bundle);
    }

    /* renamed from: v */
    private final void m105899v() {
        this.f124351m = true;
        m105898b(true);
        int size = this.f124352n.size();
        for (int i = 0; i < size; i++) {
            this.f124196aK.mo65590a((bjwj) this.f124352n.get(i));
        }
    }

    /* renamed from: w */
    private final Bundle m105900w() {
        return m105896a(this.f124342d);
    }

    /* renamed from: a */
    public final boolean mo52055a(bmne bmne) {
        return false;
    }

    /* renamed from: bR */
    public final boolean mo52775bR() {
        int size = this.f124348j.size();
        for (int i = 0; i < size; i++) {
            if ((((bkde) this.f124348j.get(i)).f124039e instanceof bkdm) && !((bkdm) ((bkde) this.f124348j.get(i)).f124039e).mo52775bR()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: bU */
    public final bkip mo52776bU() {
        return this.f124354q;
    }

    /* renamed from: bV */
    public final List mo52777bV() {
        return this.f124356s;
    }

    /* renamed from: bW */
    public final ArrayList mo52778bW() {
        return this.f124348j;
    }

    /* renamed from: bY */
    public final void mo52947bY() {
        super.mo52947bY();
        int size = this.f124348j.size();
        for (int i = 0; i < size; i++) {
            Object obj = ((bkde) this.f124348j.get(i)).f124039e;
            if (obj instanceof bkge) {
                ((bkge) obj).mo52947bY();
            }
        }
    }

    /* renamed from: co */
    public final bjes mo51919co() {
        return this.f124353p;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo51922f() {
        boolean z = this.f124195aJ;
        bkjj bkjj = this.f124355r;
        if (bkjj != null) {
            bkjj.mo52808n(z);
        }
        FormHeaderView formHeaderView = this.f124346h;
        if (formHeaderView != null) {
            formHeaderView.setEnabled(z);
        }
        bkbn bkbn = this.f124347i;
        if (bkbn != null) {
            bkbn.mo52710b().setEnabled(z);
        }
    }

    /* renamed from: m */
    public final boolean mo66066m() {
        return !((bmki) this.f124069w).f129806c.isEmpty();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bjzk bjzk = (bjzk) getActivity().getSupportFragmentManager().findFragmentByTag("appValidationSidecar");
        this.f124345g = bjzk;
        if (bjzk == null || bundle == null) {
            FragmentTransaction beginTransaction = getActivity().getSupportFragmentManager().beginTransaction();
            bjzk bjzk2 = this.f124345g;
            if (bjzk2 != null) {
                beginTransaction.remove(bjzk2);
            }
            bjzk bjzk3 = new bjzk();
            this.f124345g = bjzk3;
            beginTransaction.add(bjzk3, "appValidationSidecar").commit();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        switch (i) {
            case 500:
                if (i2 == -1) {
                    m105897a(0);
                    bmkj u = mo66069u();
                    bxvd bxvd = (bxvd) u.mo74142c(5);
                    bxvd.mo73625a((GeneratedMessageLite) u);
                    String uri = intent.getData().toString();
                    if (bxvd.f164950c) {
                        bxvd.mo74035c();
                        bxvd.f164950c = false;
                    }
                    bmkj bmkj = (bmkj) bxvd.f164949b;
                    bmkj bmkj2 = bmkj.f129827l;
                    uri.getClass();
                    bmkj.f129830b = 4;
                    bmkj.f129831c = uri;
                    this.f124349k = (bmkj) bxvd.mo74062i();
                    mo51905a(8, m105900w());
                    return;
                }
                if (intent != null) {
                    m105897a(intent.getIntExtra("analyticsResult", -1));
                } else {
                    m105897a(4);
                }
                m105899v();
                return;
            case 501:
                if (i2 != -1) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            Bundle bundleExtra = intent.getBundleExtra("errorDetails");
                            if (bundleExtra != null) {
                                mo51905a(5, bundleExtra);
                                return;
                            }
                            throw new IllegalArgumentException("Error result must provide error details.");
                        } else if (i2 != 2) {
                            throw new RuntimeException(String.format(Locale.US, "Unknown result code from popup redirect: %d", Integer.valueOf(i2)));
                        }
                    }
                    m105899v();
                    return;
                }
                this.f124349k = (bmkj) bjvp.m104729a(intent, "formValue", (bxxk) bmkj.f129827l.mo74142c(7));
                mo51905a(8, m105900w());
                return;
            case 502:
                if (i2 == -1) {
                    m105897a(0);
                    Bundle extras = intent.getExtras();
                    Set<String> keySet = extras != null ? extras.keySet() : null;
                    int size = keySet != null ? keySet.size() : 0;
                    ArrayList arrayList = new ArrayList();
                    if (size > 0) {
                        HashSet hashSet = new HashSet(this.f124344f.f129791i);
                        for (String str : keySet) {
                            String b = bmxx.m108578b(extras.getString(str));
                            bxvd da = bmka.f129774e.mo74144da();
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            bmka bmka = (bmka) da.f164949b;
                            str.getClass();
                            bmka.f129776a |= 1;
                            bmka.f129779d = str;
                            if (!hashSet.contains(str)) {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bmka bmka2 = (bmka) da.f164949b;
                                b.getClass();
                                bmka2.f129777b = 2;
                                bmka2.f129778c = b;
                            } else {
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bmka bmka3 = (bmka) da.f164949b;
                                b.getClass();
                                bmka3.f129777b = 3;
                                bmka3.f129778c = b;
                            }
                            arrayList.add((bmka) da.mo74062i());
                        }
                    }
                    bmkj u2 = mo66069u();
                    bxvd bxvd2 = (bxvd) u2.mo74142c(5);
                    bxvd2.mo73625a((GeneratedMessageLite) u2);
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bmkj bmkj3 = bmkj.f129827l;
                    ((bmkj) bxvd2.f164949b).f129839k = GeneratedMessageLite.m124030de();
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    bmkj bmkj4 = (bmkj) bxvd2.f164949b;
                    if (!bmkj4.f129839k.mo73666a()) {
                        bmkj4.f129839k = GeneratedMessageLite.m124021a(bmkj4.f129839k);
                    }
                    bxsy.m123078a(arrayList, bmkj4.f129839k);
                    this.f124349k = (bmkj) bxvd2.mo74062i();
                    mo51905a(8, m105900w());
                    return;
                } else if (i2 != 0) {
                    m105897a(4);
                    m105899v();
                    return;
                } else {
                    m105897a(5);
                    m105899v();
                    return;
                }
            default:
                super.onActivityResult(i, i2, intent);
                return;
        }
    }

    public void onClick(View view) {
        if (view == this.f124347i.mo52710b()) {
            this.f124340b = true;
            mo66068t();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nx.a(java.lang.Object, java.lang.Object):java.lang.Object
     arg types: [java.lang.String, boolean]
     candidates:
      nx.a(int, android.graphics.PorterDuff$Mode):int
      nx.a(java.lang.Object, java.lang.Object):java.lang.Object */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f124339a = bundle.getBoolean("androidAppValidationFinished");
            this.f124343e = (ArrayList) bjvp.m104742b(bundle, "successfullyValidatedApps", (bxxk) bmkd.f129781l.mo74142c(7));
            this.f124344f = (bmkd) bjvp.m104730a(bundle, "launchedAppRedirectInfo", (bxxk) bmkd.f129781l.mo74142c(7));
            this.f124340b = bundle.getBoolean("redirectTriggeredByDependencyGraphOrSubmitButton");
            this.f124341c = bundle.getBoolean("launchedRedirect");
            this.f124342d = bundle.getByteArray("dependencyGraphActionToken");
            this.f124350l = bundle.getBoolean("otherInstrumentSelectionsAvailable");
            this.f124351m = bundle.getBoolean("previouslyLaunchedAndAborted");
        } else {
            C1231nx nxVar = f124338o;
            bmdn bmdn = ((bmki) this.f124069w).f129805b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            nxVar.mo15547a((Object) bmdn.f128834b, (Object) true);
        }
        if (this.f124341c && bundle != null) {
            C1231nx nxVar2 = f124338o;
            bmdn bmdn2 = ((bmki) this.f124069w).f129805b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            if (nxVar2.mo15546a(bmdn2.f128834b) == null) {
                LogContext at = mo65980at();
                if (!bjst.m104536d(at)) {
                    Log.e("ClientLog", "Tried to log redirectFormHostKilled() in an invalid session.");
                    return;
                }
                bxvd e = bjst.m104537e(at);
                bwfe bwfe = bwfe.EVENT_NAME_REDIRECT_FORM_HOST_KILLED;
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
        }
    }

    public final void onDetach() {
        if (!getActivity().isFinishing() && isRemoving()) {
            getActivity().getSupportFragmentManager().beginTransaction().remove(this.f124345g).commit();
            this.f124345g = null;
        }
        super.onDetach();
    }

    public final void onPause() {
        super.onPause();
        this.f124345g.mo65665a((bjzm) null);
    }

    public final void onResume() {
        super.onResume();
        this.f124345g.mo65665a(this);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("androidAppValidationFinished", this.f124339a);
        bjvp.m104737a(bundle, "successfullyValidatedApps", this.f124343e);
        bjvp.m104736a(bundle, "launchedAppRedirectInfo", this.f124344f);
        bundle.putBoolean("redirectTriggeredByDependencyGraphOrSubmitButton", this.f124340b);
        bundle.putBoolean("launchedRedirect", this.f124341c);
        bundle.putByteArray("dependencyGraphActionToken", this.f124342d);
        bundle.putBoolean("otherInstrumentSelectionsAvailable", this.f124350l);
        bundle.putBoolean("previouslyLaunchedAndAborted", this.f124351m);
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

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: t */
    public final void mo66068t() {
        boolean z;
        bmkd bmkd;
        int i;
        if (!this.f124350l) {
            int i2 = ((bmki) this.f124069w).f129804a;
            if ((i2 & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0 && (i2 & 64) == 0) {
                z = false;
                if (this.f124339a) {
                    return;
                }
                if (!z || this.f124340b) {
                    this.f124340b = false;
                    ArrayList arrayList = this.f124343e;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size) {
                            bmkd = null;
                            break;
                        }
                        bmkd = (bmkd) arrayList.get(i3);
                        int a = bmkc.m108109a(bmkd.f129783a);
                        if (a != 0 && a == 3) {
                            break;
                        }
                        i3++;
                    }
                    if (bmkd != null) {
                        startActivityForResult(bjva.m104680a(bmkd), 502);
                        this.f124344f = bmkd;
                        m105898b(false);
                    } else if (mo66066m()) {
                        bmkf bmkf = bmkf.UNKNOWN;
                        bmkf a2 = bmkf.m108112a(((bmki) this.f124069w).f129812i);
                        if (a2 == null) {
                            a2 = bmkf.UNKNOWN;
                        }
                        int ordinal = a2.ordinal();
                        if (ordinal == 1) {
                            startActivityForResult(PopupRedirectChimeraActivity.m94289a(getActivity(), (bmki) this.f124069w, this.f124343e, getArguments().getString("title"), bkjd.m105957a(this.f123962aG), this.f123964aI, (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"), mo51878cn()), 501);
                        } else if (ordinal != 2) {
                            Locale locale = Locale.US;
                            Object[] objArr = new Object[1];
                            bmkf a3 = bmkf.m108112a(((bmki) this.f124069w).f129812i);
                            if (a3 == null) {
                                a3 = bmkf.UNKNOWN;
                            }
                            objArr[0] = Integer.valueOf(a3.f129800d);
                            throw new IllegalArgumentException(String.format(locale, "Unknown RedirectForm DisplayType: %s", objArr));
                        } else {
                            Activity activity = getActivity();
                            String str = ((bmki) this.f124069w).f129806c;
                            int a4 = bkjd.m105957a(this.f123962aG);
                            LogContext logContext = this.f123964aI;
                            Intent intent = new Intent(activity, StartAndroidAppRedirectActivity.class);
                            intent.putExtra("initialUrl", str);
                            intent.putExtra("activityThemeResId", a4);
                            intent.putExtra("logToken", (byte[]) null);
                            intent.putExtra("parentLogContext", logContext);
                            intent.setClassName(activity, "com.google.android.gms.wallet.redirect.StartAndroidAppRedirectProxyActivity");
                            intent.putExtra("buyFlowConfig", (BuyFlowConfig) getArguments().getParcelable("buyFlowConfig"));
                            startActivityForResult(intent, 500);
                        }
                        m105898b(false);
                    } else if (((bmki) this.f124069w).f129820q.size() > 0) {
                        String str2 = ((bmkd) ((bmki) this.f124069w).f129820q.get(0)).f129792j;
                        if (!this.f124350l) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                        Bundle bundle = new Bundle();
                        bjvg.m104691a(bundle, i, getString(C0126R.string.wallet_uic_error_title), str2, null, null, getString(17039370));
                        mo51905a(5, bundle);
                    } else {
                        throw new IllegalStateException("Ready to launch redirect, but no details to proceed.");
                    }
                    this.f124341c = true;
                    return;
                }
                return;
            }
        }
        z = true;
        if (this.f124339a) {
        }
    }

    /* renamed from: u */
    public final bmkj mo66069u() {
        bxvd da = bmkj.f129827l.mo74144da();
        bmdn bmdn = ((bmki) this.f124069w).f129805b;
        if (bmdn == null) {
            bmdn = bmdn.f128831k;
        }
        if ((bmdn.f128833a & 1) != 0) {
            bmdn bmdn2 = ((bmki) this.f124069w).f129805b;
            if (bmdn2 == null) {
                bmdn2 = bmdn.f128831k;
            }
            String str = bmdn2.f128834b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmkj bmkj = (bmkj) da.f164949b;
            str.getClass();
            bmkj.f129829a |= 1;
            bmkj.f129832d = str;
        }
        bmdn bmdn3 = ((bmki) this.f124069w).f129805b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        if ((bmdn3.f128833a & 4) != 0) {
            bmdn bmdn4 = ((bmki) this.f124069w).f129805b;
            if (bmdn4 == null) {
                bmdn4 = bmdn.f128831k;
            }
            ByteString bxtx = bmdn4.f128836d;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmkj bmkj2 = (bmkj) da.f164949b;
            bxtx.getClass();
            bmkj2.f129829a |= 2;
            bmkj2.f129833e = bxtx;
        }
        bkjj bkjj = this.f124355r;
        if (bkjj != null) {
            bmed c = bkjj.mo52944a(Bundle.EMPTY);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bmkj bmkj3 = (bmkj) da.f164949b;
            c.getClass();
            bmkj3.f129838j = c;
            bmkj3.f129829a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        }
        return (bmkj) da.mo74062i();
    }

    /* renamed from: a */
    private final void m105897a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_TYPE", 778);
        bundle.putInt("EventListener.EXTRA_BACKGROUND_EVENT_RESULT_CODE", i);
        mo51905a(7, bundle);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final View mo51901a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        bmdb bmdb;
        bmki bmki = (bmki) this.f124069w;
        if ((bmki.f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0) {
            bmdn bmdn = bmki.f129805b;
            if (bmdn == null) {
                bmdn = bmdn.f128831k;
            }
            if (bmdn.f128838f.size() <= 0 && (((bmki) this.f124069w).f129804a & 64) == 0) {
                return null;
            }
        }
        View inflate = layoutInflater.inflate((int) C0126R.C0128layout.fragment_dummy_form, viewGroup, false);
        FormHeaderView formHeaderView = (FormHeaderView) inflate.findViewById(C0126R.C0129id.dummy_form_header);
        this.f124346h = formHeaderView;
        bmdn bmdn2 = ((bmki) this.f124069w).f129805b;
        if (bmdn2 == null) {
            bmdn2 = bmdn.f128831k;
        }
        formHeaderView.mo71963a(bmdn2, layoutInflater, mo65982av(), this.f124356s);
        ArrayList arrayList = this.f124348j;
        bmdn bmdn3 = ((bmki) this.f124069w).f129805b;
        if (bmdn3 == null) {
            bmdn3 = bmdn.f128831k;
        }
        arrayList.add(new bkde(bmdn3.f128835c, this.f124346h, null));
        this.f124355r = (bkjj) getChildFragmentManager().findFragmentById(C0126R.C0129id.fragment_holder);
        bmki bmki2 = (bmki) this.f124069w;
        if ((bmki2.f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) != 0) {
            if (this.f124355r == null) {
                bmeb bmeb = bmki2.f129821r;
                if (bmeb == null) {
                    bmeb = bmeb.f128902g;
                }
                this.f124355r = bkjj.m105965a(bmeb, this.f123961aF, mo65980at());
                getChildFragmentManager().beginTransaction().add((int) C0126R.C0129id.fragment_holder, this.f124355r).commit();
            }
            bkjj bkjj = this.f124355r;
            bkjj.f124196aK = this.f124196aK;
            this.f124356s.add(bkjj);
            this.f124348j.add(new bkde(this.f124355r));
        } else if (this.f124355r != null) {
            getChildFragmentManager().beginTransaction().remove(this.f124355r).commit();
            this.f124355r = null;
        }
        bmki bmki3 = (bmki) this.f124069w;
        if ((bmki3.f129804a & 64) != 0) {
            bmdb bmdb2 = bmki3.f129811h;
            if (bmdb2 == null) {
                bmdb = bmdb.f128767k;
            } else {
                bmdb = bmdb2;
            }
            bkbn a = bkbs.m105284a(bmdb, this.f123962aG, this.f124196aK, mo65980at(), layoutInflater, (ViewGroup) inflate);
            this.f124347i = a;
            a.mo52710b().setOnClickListener(this);
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo51905a(int i, Bundle bundle) {
        super.mo51905a(i, bundle);
        if (i == 4 && !this.f124350l && (((bmki) this.f124069w).f129804a & AndroidInputTypeSignal.TYPE_TEXT_FLAG_CAP_SENTENCES) == 0 && !this.f124341c) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("EventListener.EXTRA_ENABLE_UI_ENABLED", false);
            mo51905a(18, bundle2);
        }
    }

    /* renamed from: a */
    public final void mo51910a(bmmv bmmv, List list) {
        bmkf bmkf = bmkf.UNKNOWN;
        int a = bmmb.m108166a(bmmv.f130058d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 19) {
            if (i != 26) {
                super.mo51910a(bmmv, list);
                return;
            } else if (this.f124351m) {
                bmkj u = mo66069u();
                bxvd bxvd = (bxvd) u.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) u);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bmkj bmkj = (bmkj) bxvd.f164949b;
                bmkj bmkj2 = bmkj.f129827l;
                bmkj.f129829a |= 32;
                bmkj.f129835g = true;
                this.f124349k = (bmkj) bxvd.mo74062i();
                Bundle bundle = Bundle.EMPTY;
                if (bmmv.f130056b == 14) {
                    bundle = m105896a(((bmmi) bmmv.f130057c).f130018a.getKey());
                }
                mo51905a(8, bundle);
                return;
            }
        }
        this.f124340b = true;
        if (bmmv.f130056b == 14) {
            this.f124342d = ((bmmi) bmmv.f130057c).f130018a.getKey();
        }
        mo66068t();
    }

    /* renamed from: a */
    public final void mo52771a(ArrayList arrayList) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bjwj bjwj = (bjwj) arrayList.get(i);
            int a = bmna.m108191a(bjwj.f123509a.f130094d);
            if (a != 0 && a == 11) {
                this.f124352n.add(bjwj);
                i++;
            } else {
                Locale locale = Locale.US;
                int i2 = 1;
                Object[] objArr = new Object[1];
                int a2 = bmna.m108191a(bjwj.f123509a.f130094d);
                if (a2 != 0) {
                    i2 = a2;
                }
                objArr[0] = Integer.valueOf(i2 - 1);
                throw new IllegalArgumentException(String.format(locale, "Trigger received for unsupported type: %s", objArr));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52281a(bmas bmas) {
        int size = this.f124348j.size();
        for (int i = 0; i < size; i++) {
            if ((((bkde) this.f124348j.get(i)).f124039e instanceof bkdm) && ((bkdm) ((bkde) this.f124348j.get(i)).f124039e).mo52281a(bmas)) {
                return true;
            }
        }
        return false;
    }
}
