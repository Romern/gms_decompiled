package com.google.android.gms.romanesco.restoresettings;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsRestoreContactsChimeraActivity extends deu {

    /* renamed from: b */
    public aoyj f107250b;

    /* renamed from: c */
    public apco f107251c;

    /* renamed from: d */
    public apcm f107252d;

    /* renamed from: e */
    public bhnh f107253e;

    /* renamed from: f */
    bmza f107254f;

    /* renamed from: g */
    public aoym f107255g;

    /* renamed from: h */
    public FastScroller f107256h;

    /* renamed from: i */
    public RecyclerView f107257i;

    /* renamed from: j */
    public SwipeRefreshLayout f107258j;

    /* renamed from: k */
    public String f107259k;

    /* renamed from: l */
    public String f107260l;

    /* renamed from: m */
    public String[] f107261m;

    /* renamed from: n */
    public boolean f107262n;

    /* renamed from: o */
    public boolean f107263o;

    /* renamed from: p */
    public boolean f107264p;

    /* renamed from: q */
    public int f107265q = 2;

    /* renamed from: r */
    private final aoyh f107266r = aoyh.m69805a("CRCCActivity");

    /* renamed from: s */
    private aah f107267s;

    /* renamed from: t */
    private boolean f107268t;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, int, int, int, boolean):void
     arg types: [int, int, int, int, int]
     candidates:
      aoyj.a(boolean, boolean, int, boolean, boolean):void
      aoyj.a(boolean, int, int, int, boolean):void */
    /* renamed from: a */
    public final void mo58836a(String str, String str2, String[] strArr, int i) {
        aoyj.m69819a().mo46998a(true, 0, i, 2, false);
        if (!apel.m70099a(this)) {
            this.f107253e.mo64020c();
            return;
        }
        if (this.f107253e.mo64022e()) {
            this.f107253e.mo64021d();
        }
        this.f107258j.mo2090a(true);
        if (!this.f107268t) {
            aucb a = aoxb.m69771a(getApplicationContext()).mo24701a((rpa) new aoxi(str, str2, strArr));
            a.mo50373a(new apct(this));
            a.mo50372a(new apcs(this));
        } else if (cgkf.m145856c()) {
            aoxr a2 = aoxb.m69771a(getApplicationContext());
            roz b = rpa.m34196b();
            b.f43473b = new Feature[]{aoxa.f83782c};
            b.f43472a = new aoxe(str, str2, strArr);
            aucb a3 = a2.mo24701a(b.mo24977a());
            a3.mo50373a(new apct(this));
            a3.mo50372a(new apcs(this));
        } else {
            this.f107266r.mo46985d("Preview contacts for android backup not enabled");
        }
    }

    /* renamed from: e */
    public final void mo58838e() {
        this.f107258j.mo2090a(false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.f107256h.setVisibility(4);
            this.f107256h.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        String[] strArr;
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.romanesco_contacts_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(C0126R.C0129id.recycler_view);
        this.f107257i = recyclerView;
        boolean z = true;
        recyclerView.setHasFixedSize(true);
        this.f107264p = cgjy.m145756c();
        this.f107263o = cgkf.f187143a.mo6606a().mo83976k();
        this.f107262n = cgkf.m145857d();
        this.f107256h = (FastScroller) findViewById(C0126R.C0129id.fast_scroller);
        if (this.f107264p) {
            if (cgjy.m145758e()) {
                this.f107255g = aoyk.m69838a(getApplicationContext(), getApplication());
            } else {
                this.f107255g = aoyl.m69842a(getApplicationContext(), getApplication());
            }
            this.f107254f = bmza.m108656a();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(C0126R.C0129id.swipe_refresh);
        this.f107258j = swipeRefreshLayout;
        if (this.f107263o) {
            swipeRefreshLayout.setEnabled(true);
        }
        this.f107258j.mo2092a(C0126R.color.material_google_blue_500);
        this.f107251c = new apco();
        apcp apcp = new apcp(this);
        this.f107267s = apcp;
        this.f107257i.setLayoutManager(apcp);
        this.f107257i.setAdapter(this.f107251c);
        FastScroller fastScroller = this.f107256h;
        apco apco = this.f107251c;
        aah aah = this.f107267s;
        fastScroller.f107303a = apco;
        fastScroller.f107304b = aah;
        fastScroller.f107305c = cgkf.m145857d();
        int i = Build.VERSION.SDK_INT;
        this.f107257i.setOnScrollChangeListener(new apcq(this));
        this.f107258j.f1697a = new apcv(this);
        this.f107258j.mo2090a(true);
        this.f107252d = apcm.m70044a();
        this.f107250b = aoyj.m69819a();
        Intent intent = getIntent();
        if (bundle == null && (intent == null || intent.getExtras() == null)) {
            this.f107250b.mo46996a("error:restore_contacts_activity:no_data");
            finish();
            return;
        }
        this.f107253e = bhnh.m101201a(findViewById(16908290), (int) C0126R.string.common_no_network, -2);
        Bundle extras = intent.getExtras();
        int i2 = extras.getInt("type");
        int i3 = 2;
        if (i2 != 0) {
            i3 = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
        }
        this.f107265q = i3;
        if (i3 == 3) {
            setTitle((int) C0126R.string.romanesco_device_contacts_settings_title);
        } else if (i3 == 4) {
            setTitle((int) C0126R.string.romanesco_sim_contacts_settings_title);
        }
        this.f107259k = extras.getString("account_name");
        this.f107260l = extras.getString("device_id");
        this.f107261m = extras.getStringArray("sources");
        if (!intent.hasExtra("is_android_backup") || !extras.getBoolean("is_android_backup")) {
            z = false;
        }
        this.f107268t = z;
        String str2 = this.f107259k;
        if (str2 == null || (str = this.f107260l) == null || (strArr = this.f107261m) == null) {
            this.f107250b.mo46996a("error:restore_contacts_activity:null_data");
            finish();
            return;
        }
        if (!apel.m70099a(this)) {
            this.f107253e.mo64020c();
            this.f107258j.mo2090a(false);
        } else if (this.f107253e.mo64022e()) {
            this.f107253e.mo64021d();
        }
        int i4 = this.f107265q;
        if (i4 == 3) {
            if (this.f107252d.f84134d) {
                this.f107258j.mo2090a(false);
                mo58837a(this.f107252d.f84132b);
                return;
            }
        } else if (i4 == 4 && this.f107252d.f84133c) {
            this.f107258j.mo2090a(false);
            mo58837a(this.f107252d.f84131a);
            return;
        }
        if (apel.m70099a(this)) {
            mo58836a(str2, str, strArr, 3);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.f107263o) {
            menuInflater.inflate(C0126R.C0130menu.romanesco_restoresettings_menu_refresh, menu);
        } else {
            menuInflater.inflate(C0126R.C0130menu.romanesco_restoresettings_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f107264p) {
            this.f107255g.mo47006a(this.f107254f.mo66928a(TimeUnit.MILLISECONDS));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        GoogleHelp googleHelp;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C0126R.C0129id.settings_help) {
            Uri parse = Uri.parse("https://support.google.com/nexus?p=contacts_restore");
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.f31623a = 1;
            if (cgkf.m145859f()) {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.f78774q = parse;
                wwu wwu = new wwu(this);
                wwu.f51499d = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
                wwu.mo29497b(wwr.m42392a(getContainerActivity()));
                googleHelp.mo43196a(wwu.mo29490a(), getCacheDir());
                googleHelp.f78776s = themeSettings;
            } else {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.f78774q = parse;
                googleHelp.f78776s = themeSettings;
            }
            new aarh(this).mo31646a(googleHelp.mo43194a());
            return true;
        } else if (!this.f107263o || itemId != C0126R.C0129id.refresh) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (apel.m70099a(this)) {
                if (this.f107253e.mo64022e()) {
                    this.f107253e.mo64021d();
                }
                mo58836a(this.f107259k, this.f107260l, this.f107261m, 5);
            } else {
                this.f107253e.mo64020c();
                mo58838e();
            }
            return true;
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.f107264p) {
            this.f107254f.mo66931e();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f107264p) {
            this.f107254f.mo66930d();
        }
    }

    /* renamed from: a */
    public final void mo58837a(List list) {
        bmxv bmxv;
        int i;
        char charAt;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = ((RawContactEntity) it.next()).f107241a;
            if (!TextUtils.isEmpty(str)) {
                apek apek = new apek(getApplicationContext().getResources());
                if (str != null && str.length() > 0) {
                    while (true) {
                        Integer valueOf = Integer.valueOf(i2);
                        if (valueOf.intValue() < str.length()) {
                            if (TextUtils.isGraphic(str.charAt(valueOf.intValue()))) {
                                bmxv = bmxv.m108566b(valueOf);
                                break;
                            }
                            i2 = valueOf.intValue() + 1;
                        } else {
                            break;
                        }
                    }
                }
                bmxv = bmvz.f131120a;
                if (!bmxv.mo66813a() || (((charAt = str.charAt(((Integer) bmxv.mo66814b()).intValue())) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                    apek.f84251d = null;
                } else {
                    apek.f84251d = Character.valueOf(Character.toUpperCase(str.charAt(((Integer) bmxv.mo66814b()).intValue())));
                }
                if (!TextUtils.isEmpty(str)) {
                    i = apek.f84242a.getColor(Math.abs(str.hashCode()) % apek.f84242a.length(), apek.f84243b);
                } else {
                    i = apek.f84243b;
                }
                apek.f84250c = i;
                arrayList.add(new apch(str, apek));
            }
        }
        Collections.sort(arrayList, new apcr());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        char c = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < size; i4++) {
            char charAt2 = ((apcl) arrayList.get(i4)).mo47104a().charAt(0);
            if (charAt2 == c) {
                i3++;
            } else {
                if (i3 != -1) {
                    arrayList3.add(Integer.valueOf(i3));
                }
                arrayList2.add(Character.valueOf(charAt2));
                c = charAt2;
                i3 = 1;
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(Integer.valueOf(i3));
        }
        apco apco = this.f107251c;
        apco.f84139a.clear();
        apco.f84139a.addAll(arrayList);
        apco.mo171aJ();
    }
}
