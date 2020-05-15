package com.google.android.gms.romanesco.restoresettings;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsRestoreSettingsChimeraActivity extends deu {

    /* renamed from: b */
    public apeh f107290b;

    /* renamed from: c */
    public apdh f107291c;

    /* renamed from: d */
    public bhnh f107292d;

    /* renamed from: e */
    public boolean f107293e;

    /* renamed from: f */
    public final aoyh f107294f = aoyh.m69805a("CRSBackupList");

    /* renamed from: g */
    public byte[] f107295g;

    /* renamed from: h */
    apcm f107296h;

    /* renamed from: i */
    String f107297i;

    /* renamed from: j */
    private apdr f107298j;

    /* renamed from: k */
    private RecyclerView f107299k;

    /* renamed from: l */
    private SwipeRefreshLayout f107300l;

    /* renamed from: m */
    private String f107301m;

    /* renamed from: n */
    private bqgj f107302n;

    /* renamed from: a */
    public final void mo58842a(int i) {
        Toast.makeText(this, i, 1).show();
    }

    /* renamed from: e */
    public final void mo58849e() {
        this.f107290b.mo47134b(this.f107298j.f84187b);
    }

    /* renamed from: g */
    public final void mo58850g() {
        this.f107292d.mo64020c();
    }

    /* renamed from: h */
    public final void mo58851h() {
        this.f107292d.mo64021d();
    }

    /* renamed from: i */
    public final void mo58852i() {
        if (!aper.m70108a(getApplicationContext(), this.f107291c.f84164d, false)) {
            this.f107294f.mo46985d("Could not reset restore from settings shared pref!");
        }
    }

    /* renamed from: j */
    public final void mo58853j() {
        Toast.makeText(this, (int) C0126R.string.romanesco_restore_key_recovery_explanation_unknown_error, 0).show();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, boolean, int, boolean, boolean):void
     arg types: [int, int, int, int, int]
     candidates:
      aoyj.a(boolean, int, int, int, boolean):void
      aoyj.a(boolean, boolean, int, boolean, boolean):void */
    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        aucb aucb;
        if (cgkf.m145856c()) {
            if (i == 3) {
                mo58848a(true);
                new aoxu(getApplicationContext()).mo46975a().mo50373a(new apdo(this));
            } else if (i == 4) {
                if (i2 == -1) {
                    aoyj.m69819a().mo47001b(3);
                    mo58848a(true);
                    mo58847a(ltu.m24388a(this), aoxb.m69771a(this), this.f107291c.f84164d);
                } else if (i2 == 0) {
                    aoyj.m69819a().mo47001b(4);
                } else if (i2 != 1) {
                    this.f107294f.mo46985d("KeyRecoveryLockScreenActivity returned unknown result!");
                    aoyj.m69819a().mo47001b(6);
                    mo58853j();
                } else {
                    aoyj.m69819a().mo47001b(5);
                    Toast.makeText(this, (int) C0126R.string.romanesco_restore_key_recovery_explanation_permanent_error, 0).show();
                }
            }
        }
        if (i2 == -1 && intent != null) {
            if (i == 0) {
                String stringExtra = intent.getStringExtra("authAccount");
                if (!TextUtils.isEmpty(stringExtra)) {
                    apeh apeh = this.f107290b;
                    if (!stringExtra.equals(apeh.f84212b.f84187b)) {
                        apeh.f84212b.mo47126a(stringExtra);
                        apeh.f84211a.mo58844a(apeh.f84212b.f84187b);
                        Map b = apeh.f84212b.mo47127b(stringExtra);
                        if (b != null) {
                            apeh.f84211a.mo58846a(apeh.mo47130a(new ArrayList(b.values())));
                        } else if (apel.m70099a(apeh.f84211a)) {
                            apeh.mo47134b(stringExtra);
                        }
                        if (apel.m70099a(apeh.f84211a)) {
                            apeh.f84211a.mo58851h();
                        } else {
                            apeh.f84211a.mo58850g();
                        }
                        aoyj.m69819a().mo47000a(false, true, 2, false, false);
                    }
                }
            } else if (i == 2) {
                String stringExtra2 = intent.getStringExtra("account_name");
                String stringExtra3 = intent.getStringExtra("device_id");
                String stringExtra4 = intent.getStringExtra("device_name");
                ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("selected_contacts_account_types");
                if (!cgkf.m145856c() || !intent.getBooleanExtra("is_android_backup", false)) {
                    z = false;
                } else {
                    z = true;
                }
                if (!TextUtils.isEmpty(stringExtra2) && !TextUtils.isEmpty(stringExtra3) && !TextUtils.isEmpty(stringExtra4) && stringArrayListExtra != null && !stringArrayListExtra.isEmpty()) {
                    apeh apeh2 = this.f107290b;
                    String str2 = this.f107301m;
                    String[] strArr = new String[stringArrayListExtra.size()];
                    stringArrayListExtra.toArray(strArr);
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            str = str2;
                        } else {
                            str = "contacts_restore_settings";
                        }
                        if (cgkf.m145856c()) {
                            if (z) {
                                aoxr a = aoxb.m69771a(apeh2.f84211a);
                                roz b2 = rpa.m34196b();
                                b2.f43473b = new Feature[]{aoxa.f83780a};
                                b2.f43472a = new aoxd(str, stringExtra2, stringExtra3, stringExtra4, strArr);
                                aucb = a.mo24732b(b2.mo24977a());
                                aucb.mo50373a(new aped(apeh2, stringExtra2, stringExtra3));
                                aucb.mo50372a(new apee(apeh2));
                                apeh2.f84211a.mo58842a((int) C0126R.string.romanesco_restore_contacts_in_the_background);
                            }
                        }
                        aucb = aoxb.m69771a(apeh2.f84211a).mo46973a(str, stringExtra2, stringExtra3, stringExtra4, strArr);
                        aucb.mo50373a(new aped(apeh2, stringExtra2, stringExtra3));
                        aucb.mo50372a(new apee(apeh2));
                        apeh2.f84211a.mo58842a((int) C0126R.string.romanesco_restore_contacts_in_the_background);
                    } catch (RuntimeException e) {
                        apeh.f84210c.mo46985d("Error occurs when calling api to restore contacts!");
                        if (cgjy.m145761h()) {
                            aoyp.m69851a(apeh2.f84211a).mo47009a(e, cgjy.m145765l());
                        }
                        apeh2.mo47131a(e);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, boolean, int, boolean, boolean):void
     arg types: [int, int, int, int, int]
     candidates:
      aoyj.a(boolean, int, int, int, boolean):void
      aoyj.a(boolean, boolean, int, boolean, boolean):void */
    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) C0126R.C0128layout.romanesco_contacts_restore_settings);
        this.f107293e = cgkf.f187143a.mo6606a().mo83975j();
        RecyclerView recyclerView = (RecyclerView) findViewById(16908298);
        this.f107299k = recyclerView;
        recyclerView.setLayoutManager(new aah());
        apdh apdh = new apdh(this);
        this.f107291c = apdh;
        this.f107299k.setAdapter(apdh);
        this.f107299k.addItemDecoration(new apdq(this));
        C1341rz aW = mo8628aW();
        aW.mo15855c((int) C0126R.string.romanesco_contacts_restore_title);
        aW.mo15841a(4, 4);
        aW.mo15853b(true);
        this.f107296h = apcm.m70044a();
        String str = null;
        if (cgjy.m145755b()) {
            this.f107298j = new apdr(getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0), new aoys(getApplicationContext()).mo47021a());
        } else {
            this.f107298j = new apdr(getSharedPreferences("people_ui_contacts_backup_and_restore_settings", 0), null);
        }
        this.f107290b = new apeh(this, this.f107298j);
        Intent intent = getIntent();
        if (intent != null) {
            if (intent.hasExtra("people_ui_contacts_restore_account_name")) {
                str = intent.getStringExtra("people_ui_contacts_restore_account_name");
            } else if (cgjy.f187097a.mo6606a().mo83928F()) {
                str = intent.getStringExtra("authAccount");
            }
            this.f107297i = str;
            if (cgkf.f187143a.mo6606a().mo83979n() && intent.hasExtra("people_ui_contacts_restore_dialog_extras")) {
                this.f107301m = "CONTACTS_APP_NOTIFICATION";
                Intent putExtras = new Intent("com.google.android.gms.romanesco.settings.RESTORE_CONTACTS").setPackage("com.google.android.gms").putExtras(intent.getBundleExtra("people_ui_contacts_restore_dialog_extras"));
                if (putExtras != null) {
                    startActivityForResult(putExtras, 2);
                }
            }
        }
        this.f107292d = bhnh.m101201a(findViewById(16908290), (int) C0126R.string.common_no_network, -2);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(C0126R.C0129id.layout_container);
        this.f107300l = swipeRefreshLayout;
        swipeRefreshLayout.mo2092a(C0126R.color.material_google_blue_500);
        this.f107300l.f1697a = new apdp(this);
        aoyj.m69819a().mo47000a(true, false, 2, false, false);
        this.f107302n = snp.m35702a(9);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.f107293e) {
            menuInflater.inflate(C0126R.C0130menu.romanesco_restoresettings_menu_refresh, menu);
        } else {
            menuInflater.inflate(C0126R.C0130menu.romanesco_restoresettings_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        GoogleHelp googleHelp;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            this.f107296h.mo47111b();
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
        } else if (itemId != C0126R.C0129id.refresh) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (!this.f107293e) {
                mo58848a(false);
            } else if (apel.m70099a(this)) {
                if (this.f107292d.mo64022e()) {
                    mo58851h();
                }
                mo58849e();
            } else {
                mo58850g();
                mo58848a(false);
            }
            return true;
        }
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.f107295g = bundle.getByteArray("Device");
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putByteArray("Device", this.f107295g);
    }

    /* access modifiers changed from: protected */
    public final void onStart() {
        super.onStart();
        if (!TextUtils.isEmpty(this.f107297i)) {
            apeh apeh = this.f107290b;
            String str = this.f107297i;
            if (!apel.m70101a(str) || !apel.m70100a(apeh.f84211a, str)) {
                str = apeh.mo47129a();
            }
            apeh.mo47132a(str);
            this.f107297i = null;
        } else {
            apeh apeh2 = this.f107290b;
            apeh2.mo47132a(apeh2.mo47129a());
        }
        if (apel.m70099a(this)) {
            if (this.f107292d.mo64022e()) {
                this.f107292d.mo64021d();
            }
            if (this.f107291c.f84167g) {
                apeh apeh3 = this.f107290b;
                String str2 = apeh3.f84212b.f84187b;
                if (!TextUtils.isEmpty(str2)) {
                    apeh3.mo47134b(str2);
                } else {
                    aoyj.m69819a().mo46996a("CRSP.skip_fetch_call_due_to_no_account");
                }
            }
        } else {
            this.f107292d.mo64020c();
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
        apdr apdr = this.f107290b.f84212b;
        if (apdr.f84187b != null) {
            apdr.f84186a.edit().putString("restore:restore_account_name", apdr.f84187b).apply();
        } else {
            apdr.f84186a.edit().clear().apply();
        }
    }

    /* renamed from: a */
    public final void mo58843a(Account account) {
        int i;
        String[] strArr = {"com.google"};
        if (cgjy.f187097a.mo6606a().mo83955s()) {
            i = (getResources().getConfiguration().uiMode & 48) != 32 ? 1 : 0;
        } else {
            i = 1;
        }
        startActivityForResult(rew.m33487a(account, null, strArr, true, false, i), 0);
    }

    /* renamed from: a */
    public final void mo58844a(String str) {
        apdh apdh = this.f107291c;
        if (!TextUtils.equals(apdh.f84164d, str)) {
            apdh.f84164d = str;
            apdh.f84167g = !TextUtils.isEmpty(str);
            apdh.f84166f.clear();
            apdh.mo171aJ();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aoyj.a(boolean, boolean, int, boolean, boolean):void
     arg types: [int, int, int, int, int]
     candidates:
      aoyj.a(boolean, int, int, int, boolean):void
      aoyj.a(boolean, boolean, int, boolean, boolean):void */
    /* renamed from: a */
    public final void mo58845a(String str, apej apej) {
        aoyj.m69819a().mo47000a(false, false, 2, true, false);
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        String a = apel.m70098a(apej);
        bundle.putString("device_id", a);
        apcm a2 = apcm.m70044a();
        if (!a.equals(a2.f84136f)) {
            a2.mo47111b();
            a2.f84136f = a;
        }
        bundle.putString("device_name", apej.f84239k);
        bundle.putLong("last_backup_time_millis", apej.f84231c);
        bundle.putLong("last_restore_time_millis", apej.f84241m);
        bundle.putInt("num_google_contacts", apej.f84234f);
        bundle.putInt("num_device_contacts", apej.f84235g);
        bundle.putInt("num_sim_contacts", apej.f84236h);
        bundle.putStringArrayList("device_contacts_account_types", apej.f84237i);
        bundle.putStringArrayList("sim_contacts_account_types", apej.f84238j);
        bundle.putBoolean("is_android_backup", apej.mo47137a());
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.romanesco.settings.RESTORE_CONTACTS");
        intent.setPackage("com.google.android.gms");
        intent.putExtras(bundle);
        startActivityForResult(intent, 2);
    }

    /* renamed from: a */
    public final void mo58846a(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                apej apej = (apej) list.get(i);
                if ((cgkf.m145856c() && apej.mo47137a()) || apej.f84233e > 0) {
                    arrayList.add(apej);
                }
            }
        }
        apdh apdh = this.f107291c;
        Object[] objArr = {apdh.f84164d, Integer.valueOf(arrayList.size())};
        apdh.f84167g = false;
        apdh.f84166f.clear();
        apdh.f84166f.addAll(arrayList);
        apdh.mo171aJ();
    }

    /* renamed from: a */
    public final void mo58847a(ltz ltz, aoxr aoxr, String str) {
        byte[] bArr = this.f107295g;
        if (bArr != null) {
            try {
                ltn ltn = (ltn) bxvk.m124016a(ltn.f32960g, bArr, bxus.m123744c());
                aucb a = aucu.m76780a(this.f107302n, new apdi(this, str)).mo50364a(new apdj(ltz, ltn)).mo50364a(new apdk(aoxr, str, ltn));
                a.mo50373a(new apdl(this, ltn));
                a.mo50372a(new apdm(this));
            } catch (bxwf e) {
                mo58848a(false);
                if (cgjy.m145760g()) {
                    this.f107294f.mo46980a(e, "Exception while parsing device");
                } else {
                    this.f107294f.mo46987e("Exception while parsing device ", e);
                }
                mo58848a(false);
                mo58853j();
            }
        } else {
            this.f107294f.mo46985d("Required selected device id not found.");
            mo58848a(false);
            mo58853j();
        }
    }

    /* renamed from: a */
    public final void mo58848a(boolean z) {
        this.f107300l.mo2090a(z);
    }
}
