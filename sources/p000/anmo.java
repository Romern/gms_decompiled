package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.ArrayList;

/* renamed from: anmo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anmo extends annl implements rjz, rka {

    /* renamed from: e */
    static final int f77139e = C0126R.C0127drawable.default_avatar;

    /* renamed from: k */
    private static final byug f77140k = byug.GOOGLE_PLAY_SERVICES;

    /* renamed from: b */
    public anmr f77141b;

    /* renamed from: c */
    public anmr f77142c;

    /* renamed from: d */
    public int f77143d;

    /* renamed from: f */
    private C1341rz f77144f;

    /* renamed from: g */
    private anmk[] f77145g;

    /* renamed from: h */
    private int f77146h;

    /* renamed from: i */
    private rkb f77147i;

    /* renamed from: j */
    private int f77148j;

    /* renamed from: a */
    private final void m64768a(PendingIntent pendingIntent) {
        if (pendingIntent != null) {
            try {
                this.f77148j = 1;
                getActivity().startIntentSenderForResult(pendingIntent.getIntentSender(), 0, null, 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                this.f77148j = 2;
                this.f77147i.mo24801e();
            }
        }
    }

    /* renamed from: b */
    public static anmo m64769b(int i) {
        if (i < 0 || i > 2) {
            Log.wtf("ConnectedAppsFragment", "Invalid filter type");
        }
        Bundle bundle = new Bundle();
        bundle.putInt("preselected_filter", i);
        anmo anmo = new anmo();
        anmo.setArguments(bundle);
        return anmo;
    }

    /* renamed from: c */
    public final FavaDiagnosticsEntity mo41944c() {
        return this.f77145g[this.f77146h].f77135e;
    }

    /* renamed from: d */
    public final CharSequence mo41953d() {
        return this.f77145g[this.f77146h].f77133c;
    }

    /* renamed from: e */
    public final CharSequence mo41954e() {
        anna.m64797a();
        if (!anna.m64798b(getActivity(), 1)) {
            return this.f77145g[this.f77146h].f77134d;
        }
        anna.m64797a();
        return anna.m64796a(getActivity(), 1);
    }

    /* renamed from: f */
    public final Intent mo41955f() {
        return new Intent("android.intent.action.VIEW").setData(Uri.parse(this.f77145g[this.f77146h].f77136f));
    }

    /* renamed from: g */
    public final void mo7257g(Bundle bundle) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connected");
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f77145g == null) {
            anmk[] anmkArr = new anmk[3];
            this.f77145g = anmkArr;
            anmkArr[0] = new anmk(getString(C0126R.string.plus_app_settings_all_apps_label), new anmj(this), C0126R.C0127drawable.common_settings_icon, getText(C0126R.string.plus_list_apps_empty_message), getText(C0126R.string.plus_list_apps_error), rih.f43056j, (String) ansx.f77700v.mo25081c());
            this.f77145g[1] = new anmk(getString(C0126R.string.plus_app_settings_sign_in_apps_label), new anmn(this), C0126R.C0127drawable.plus_icon_red_32, annj.m64806a(getText(C0126R.string.plus_list_apps_aspen_empty_message), (String) ansx.f77696r.mo25081c()), annj.m64806a(getText(C0126R.string.plus_list_apps_error_aspen), (String) ansx.f77696r.mo25081c()), rih.f43048b, (String) ansx.f77697s.mo25081c());
            this.f77145g[2] = new anmk(getString(C0126R.string.plus_app_settings_fitness_apps_label), new anmm(this), C0126R.C0127drawable.common_settings_icon, annj.m64806a(getText(C0126R.string.plus_list_apps_fitness_empty_message), (String) ansx.f77698t.mo25081c()), annj.m64806a(getText(C0126R.string.plus_list_apps_error_fitness), (String) ansx.f77698t.mo25081c()), rih.f43048b, (String) ansx.f77699u.mo25081c());
        }
        int i = getArguments().getInt("preselected_filter", -1);
        if (bundle != null) {
            this.f77146h = bundle.getInt("connected_apps_filter");
            this.f77143d = bundle.getInt("connected_apps_account");
            this.f77148j = bundle.getInt("signed_in");
        } else {
            if (i == 1) {
                this.f77146h = 1;
            } else if (i != 2) {
                this.f77146h = 0;
            } else {
                this.f77146h = 2;
            }
            this.f77143d = -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        rjy rjy = new rjy(getActivity());
        rjy.mo24781a((rjz) this);
        rjy.mo24782a((rka) this);
        rjo rjo = allr.f73629a;
        allp allp = new allp();
        allp.f73626a = f77140k.f168292ja;
        rjy.mo24780a(rjo, allp.mo40491a());
        rjy.mo24777a(ankt.f77032b);
        rkb b = rjy.mo24784b();
        this.f77147i = b;
        b.mo24801e();
        this.f77148j = 2;
    }

    public final void onDetach() {
        super.onDetach();
        rkb rkb = this.f77147i;
        if (rkb != null) {
            rkb.mo24803g();
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("connected_apps_filter", this.f77146h);
        bundle.putInt("connected_apps_account", this.f77143d);
        bundle.putInt("signed_in", this.f77148j);
    }

    /* renamed from: c */
    public final void mo41952c(int i) {
        this.f77146h = i;
        annk h = mo41994h();
        anmk anmk = this.f77145g[i];
        h.f77199b = anmk.f77137g;
        this.f77144f.mo15850b(anmk.f77132b);
        mo41930a();
    }

    /* renamed from: b */
    public final void mo41943b(C1341rz rzVar) {
        this.f77144f = rzVar;
        mo41952c(this.f77146h);
        String[] a = anme.m64736a(getActivity());
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            anmg anmg = new anmg(str);
            arrayList.add(anmg);
            if (this.f77143d == -1 && str.equals(((anmf) this).f77123a.f77107a.name)) {
                this.f77143d = arrayList.indexOf(anmg);
            }
            int i = Build.VERSION.SDK_INT;
            rjo rjo = allr.f73629a;
            amcy.m62631b(this.f77147i, str, 1, 0).mo9458a(new anmi(anmg));
        }
        if (this.f77141b == null) {
            anmr anmr = new anmr(rzVar.mo15868g());
            this.f77141b = anmr;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                anmr.f77154b.add((anmg) arrayList.get(i2));
            }
            int i3 = Build.VERSION.SDK_INT;
        }
        this.f77141b.f77155c = ((anmf) this).f77123a.f77107a.name;
        int i4 = Build.VERSION.SDK_INT;
        if (this.f77142c == null) {
            anmr anmr2 = new anmr(getActivity());
            this.f77142c = anmr2;
            int i5 = 0;
            while (true) {
                anmk[] anmkArr = this.f77145g;
                if (i5 >= anmkArr.length) {
                    break;
                }
                anmr2.f77153a.add(new anmq(anmkArr[i5].f77131a, i5));
                i5++;
            }
        }
        Spinner spinner = (Spinner) getActivity().findViewById(C0126R.C0129id.filters_spinner);
        spinner.setAdapter((SpinnerAdapter) this.f77142c);
        spinner.setOnItemSelectedListener(new anml(this));
        spinner.setSelection(this.f77146h);
        this.f77142c.mo41956a(this.f77146h);
        int i6 = this.f77143d;
        anmh anmh = new anmh(this);
        rzVar.mo15840a((int) C0126R.C0128layout.common_action_bar_spinner);
        Spinner spinner2 = (Spinner) rzVar.mo15837a().findViewById(C0126R.C0129id.action_bar_spinner);
        spinner2.setOnItemSelectedListener(anmh);
        spinner2.setAdapter((SpinnerAdapter) this.f77141b);
        spinner2.setVisibility(0);
        spinner2.setSelection(i6);
    }

    /* renamed from: a */
    public final annk mo41951a(Context context) {
        return new annk(context, ((anmf) this).f77123a, new anmj(this));
    }

    /* renamed from: a */
    public final void mo7244a(int i) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connection suspended");
        }
        this.f77147i.mo24801e();
    }

    /* renamed from: a */
    public final void mo7249a(ConnectionResult connectionResult) {
        if (Log.isLoggable("ConnectedAppsFragment", 4)) {
            Log.i("ConnectedAppsFragment", "GoogleApiClient connection failed");
        }
        if (this.f77148j == 2) {
            m64768a(connectionResult.f30066d);
        }
    }
}
