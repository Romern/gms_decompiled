package p000;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.apps.ListAppsChimeraActivity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: anme */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anme extends Fragment implements LoaderManager.LoaderCallbacks, annn, rka, rjz {

    /* renamed from: a */
    public Account f77107a;

    /* renamed from: b */
    public int f77108b;

    /* renamed from: c */
    public int f77109c = 1;

    /* renamed from: d */
    public final ArrayList f77110d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f77111e = new ArrayList();

    /* renamed from: f */
    public List f77112f;

    /* renamed from: g */
    public final HashSet f77113g = new HashSet();

    /* renamed from: h */
    public anno f77114h;

    /* renamed from: i */
    public anlw f77115i;

    /* renamed from: j */
    public final Map f77116j = new HashMap();

    /* renamed from: k */
    public rke f77117k;

    /* renamed from: l */
    public rkb f77118l;

    /* renamed from: m */
    private String f77119m;

    /* renamed from: n */
    private String f77120n;

    /* renamed from: o */
    private String f77121o;

    /* renamed from: p */
    private boolean f77122p;

    /* renamed from: a */
    public static anuy m64734a(anul anul, Context context, rjz rjz, rka rka, String str) {
        return m64735a(anul, context, rjz, rka, str, new String[]{"service_googleme"});
    }

    /* renamed from: b */
    public static anuy m64737b(anul anul, Context context, rjz rjz, rka rka, String str) {
        return m64735a(anul, context, rjz, rka, str, new String[0]);
    }

    /* renamed from: c */
    private final rkb m64739c(String str) {
        rjy rjy = new rjy(getActivity());
        rjy.mo24779a(ydi.f53658a);
        rjy.mo24778a(str);
        rjy.mo24781a((rjz) this);
        rjy.mo24782a((rka) this);
        return rjy.mo24784b();
    }

    /* renamed from: c */
    private static final boolean m64740c(int i) {
        return (i == 0 || i == 1 || i == 4) ? false : true;
    }

    /* renamed from: d */
    private final void m64741d() {
        this.f77118l.mo24801e();
    }

    /* renamed from: e */
    private final void m64743e() {
        int i = Build.VERSION.SDK_INT;
        rke rke = this.f77117k;
        if (rke != null) {
            rke.mo9460b();
        }
        rjo rjo = ydi.f53658a;
        rkb rkb = this.f77118l;
        rle a = rkb.mo24787a((rle) new zco(rkb));
        this.f77117k = a;
        a.mo9458a((rkl) new anlz(this));
    }

    /* renamed from: f */
    private final void m64744f() {
        this.f77110d.clear();
        this.f77120n = null;
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        String str = this.f77121o;
        if (str != null) {
            mo41935a(str);
            this.f77121o = null;
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Activity activity = getActivity();
        anno a = anno.m64822a(activity);
        this.f77114h = a;
        a.mo41997a(this);
        this.f77115i = anlw.m64727a(activity);
        if (this.f77109c == 1) {
            getLoaderManager().initLoader(10, null, this);
            m64743e();
        }
        this.f77108b = -2;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            mo41932a();
        }
    }

    public final void onCreate(Bundle bundle) {
        int i;
        super.onCreate(bundle);
        if (bundle != null) {
            this.f77122p = bundle.getBoolean("is_in_resolution", false);
        }
        String string = getArguments().getString("account_name");
        if (string != null) {
            m64742d(string);
        } else {
            string = m64738b(getActivity());
            if (string == null) {
                return;
            }
        }
        this.f77118l = m64739c(string);
        this.f77107a = new Account(string, "com.google");
        this.f77119m = getArguments().getString("calling_package_name");
        if (bundle != null) {
            this.f77111e.clear();
            this.f77111e.addAll(bundle.getStringArrayList("disconnected_apps"));
        }
        if (this.f77107a != null && (bundle == null || !bundle.getBoolean("has_error"))) {
            anna.m64797a();
            if (!anna.m64798b(getActivity(), 1)) {
                return;
            }
        }
        if (this.f77107a == null) {
            i = 2;
        } else {
            i = 3;
        }
        mo41937b(i);
    }

    public final /* bridge */ /* synthetic */ Loader onCreateLoader(int i, Bundle bundle) {
        if (i == 10) {
            return new anth(getActivity(), this.f77107a, ((Integer) ansx.f77703y.mo25081c()).intValue(), this.f77120n);
        }
        StringBuilder sb = new StringBuilder(30);
        sb.append("Unknown loader ID: ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void onDetach() {
        super.onDetach();
        anno anno = this.f77114h;
        if (anno != null) {
            anno.mo41999b(this);
        }
        getLoaderManager().destroyLoader(10);
    }

    public final /* bridge */ /* synthetic */ void onLoadFinished(Loader loader, Object obj) {
        anxm anxm = (anxm) obj;
        if (loader.getId() == 10) {
            anth anth = (anth) loader;
            ConnectionResult connectionResult = anth.f77711a;
            if (anxm == null || connectionResult == null || !connectionResult.mo17671b()) {
                m64744f();
                mo41937b(3);
                getLoaderManager().destroyLoader(10);
                if (connectionResult != null && connectionResult.mo17670a()) {
                    ListAppsChimeraActivity listAppsChimeraActivity = (ListAppsChimeraActivity) getActivity();
                    return;
                }
                return;
            }
            if (((Boolean) ansx.f77695q.mo25081c()).booleanValue()) {
                m64744f();
            }
            int a = anxm.mo24660a();
            for (int i = 0; i < a; i++) {
                this.f77110d.add(ApplicationEntity.m68424a(anxm.mo24661a(i)));
            }
            String str = anth.f77712b;
            this.f77120n = str;
            if (str != null) {
                getLoaderManager().restartLoader(10, null, this);
            } else {
                mo41936b();
            }
        }
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        super.onPause();
        rke rke = this.f77117k;
        if (rke != null) {
            rke.mo9460b();
            this.f77117k = null;
            this.f77112f = null;
        }
    }

    public final void onResume() {
        super.onResume();
        if (m64740c(this.f77109c) && this.f77108b == -1) {
            mo41940c();
        }
        this.f77108b = -2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_in_resolution", this.f77122p);
        bundle.putBoolean("has_error", m64740c(this.f77109c));
        bundle.putStringArrayList("disconnected_apps", this.f77111e);
    }

    public final void onStart() {
        super.onStart();
        m64741d();
    }

    /* renamed from: a */
    private static anuy m64735a(anul anul, Context context, rjz rjz, rka rka, String str, String[] strArr) {
        anwk anwk = new anwk(context);
        anwk.f77819a = str;
        anwk.mo42334a("https://www.googleapis.com/auth/plus.applications.manage", "https://www.googleapis.com/auth/grants.audit", "https://www.googleapis.com/auth/plus.circles.read", "https://www.googleapis.com/auth/plus.me");
        anwk.f77822d = strArr;
        anwk.f77823e = String.valueOf(byug.GOOGLE_SETTINGS.f168292ja);
        return anul.mo42292a(context, anwk.mo42333a(), rjz, rka);
    }

    /* renamed from: b */
    public static String m64738b(Context context) {
        String[] a = m64736a(context);
        int length = a.length;
        if (length == 0) {
            return null;
        }
        String string = context.getSharedPreferences("com.google.android.gms.plus.apps.AppsUtilFragment", 0).getString("prefs_account_name", null);
        if (string == null) {
            return a[0];
        }
        for (String str : a) {
            if (string.equals(str)) {
                return string;
            }
        }
        return a[0];
    }

    /* renamed from: d */
    private final void m64742d(String str) {
        SharedPreferences.Editor edit = getActivity().getSharedPreferences("com.google.android.gms.plus.apps.AppsUtilFragment", 0).edit();
        edit.putString("prefs_account_name", str);
        edit.apply();
    }

    /* renamed from: c */
    public final void mo41940c() {
        anna.m64797a();
        if (!anna.m64798b(getActivity(), 1)) {
            m64744f();
            mo41937b(1);
            getLoaderManager().restartLoader(10, null, this);
            m64743e();
        }
    }

    /* renamed from: a */
    static String[] m64736a(Context context) {
        return soz.m35792a(soz.m35801d(context, context.getPackageName()));
    }

    /* renamed from: b */
    public final void mo41936b() {
        int i = this.f77109c;
        if (i == 1) {
            mo41937b(4);
        } else if (i == 4) {
            mo41937b(0);
        }
    }

    /* renamed from: b */
    public final void mo41937b(int i) {
        this.f77109c = i;
        Iterator it = this.f77113g.iterator();
        while (it.hasNext()) {
            ((anmc) it.next()).mo41930a();
        }
    }

    /* renamed from: a */
    public final void mo41932a() {
        this.f77122p = false;
        if (!this.f77118l.mo24806j()) {
            m64741d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41938b(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shz.m35339a(getActivity(), this.f77107a.name, (String) null, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f77119m);
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        mo41932a();
    }

    /* renamed from: a */
    public final void mo41933a(anxl anxl, Drawable drawable) {
        this.f77115i.mo41926a(anxl, drawable);
        List<anmd> list = (List) this.f77116j.get(anxl);
        if (list != null) {
            for (anmd anmd : list) {
                anmd.mo41931a();
            }
            this.f77116j.remove(anxl);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo41939b(String str) {
        m64742d(str);
        this.f77107a = new Account(str, "com.google");
        this.f77118l.mo24803g();
        this.f77118l = m64739c(str);
        m64741d();
        mo41940c();
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        Activity activity = getActivity();
        if (activity != null) {
            mo41937b(3);
            if (!connectionResult.mo17670a()) {
                rfx.m33532a(connectionResult.f30065c, activity.getContainerActivity(), 0, new anlx(this)).show();
            } else if (!this.f77122p) {
                this.f77122p = true;
                try {
                    connectionResult.mo17669a(activity.getContainerActivity(), 1);
                } catch (IntentSender.SendIntentException e) {
                    mo41932a();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo41934a(FavaDiagnosticsEntity favaDiagnosticsEntity, FavaDiagnosticsEntity favaDiagnosticsEntity2) {
        shz.m35338a(getActivity(), this.f77107a.name, favaDiagnosticsEntity, favaDiagnosticsEntity2, this.f77119m);
    }

    /* renamed from: a */
    public final void mo41935a(String str) {
        if (!this.f77118l.mo24805i()) {
            if (!this.f77118l.mo24806j()) {
                m64741d();
            }
            this.f77121o = str;
            return;
        }
        this.f77121o = null;
        rjo rjo = ydi.f53658a;
        rkb rkb = this.f77118l;
        rkb.mo24795b(new zcn(rkb, str)).mo9458a((rkl) new anmb(this));
    }
}
