package com.google.android.gms.romanesco.restoresettings;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ContactsRestoreDialogChimeraActivity extends deu {

    /* renamed from: b */
    apdd f107269b;

    /* renamed from: c */
    apdd f107270c;

    /* renamed from: d */
    public Button f107271d;

    /* renamed from: e */
    public bhnh f107272e;

    /* renamed from: f */
    long f107273f;

    /* renamed from: g */
    aoym f107274g;

    /* renamed from: h */
    private TextView f107275h;

    /* renamed from: i */
    private View f107276i;

    /* renamed from: j */
    private String f107277j;

    /* renamed from: k */
    private String f107278k;

    /* renamed from: l */
    private String f107279l;

    /* renamed from: m */
    private long f107280m;

    /* renamed from: n */
    private int f107281n;

    /* renamed from: o */
    private int f107282o;

    /* renamed from: p */
    private int f107283p;

    /* renamed from: q */
    private ArrayList f107284q;

    /* renamed from: r */
    private ArrayList f107285r;

    /* renamed from: s */
    private boolean f107286s;

    /* renamed from: t */
    private boolean f107287t;

    /* renamed from: u */
    private boolean f107288u;

    /* renamed from: v */
    private boolean f107289v;

    /* renamed from: b */
    private final String m92304b(int i) {
        Resources resources = getResources();
        Integer valueOf = Integer.valueOf(i);
        return resources.getString(C0126R.string.romanesco_contacts_count_viewable, valueOf, valueOf);
    }

    /* renamed from: a */
    public final void mo58839a(int i) {
        ArrayList arrayList = new ArrayList();
        if (this.f107269b != null && i == 3) {
            arrayList.addAll(this.f107284q);
        } else if (this.f107270c != null && i == 4) {
            arrayList.addAll(this.f107285r);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        Intent className = new Intent().setClassName(getApplicationContext(), "com.google.android.gms.romanesco.settings.ContactsRestoreContactsActivity");
        className.putExtra("account_name", this.f107277j);
        className.putExtra("device_id", this.f107278k);
        className.putExtra("sources", strArr);
        className.putExtra("type", bzdt.m125700a(i));
        className.putExtra("is_android_backup", this.f107287t);
        startActivity(className);
        if (i == 3) {
            aoyj.m69819a().mo47005f(3);
            if (this.f107289v) {
                this.f107274g.mo47007a("DEVICE_STORAGE_CONTACT_TYPE");
                return;
            }
            return;
        }
        aoyj.m69819a().mo47005f(4);
        if (this.f107289v) {
            this.f107274g.mo47007a("SIM_CARD_CONTACT_TYPE");
        }
    }

    /* renamed from: e */
    public final void mo58840e() {
        boolean z = false;
        if (!apel.m70099a(this)) {
            this.f107271d.setEnabled(false);
            this.f107272e.mo64020c();
            return;
        }
        if (this.f107272e.mo64022e()) {
            this.f107272e.mo64021d();
        }
        apdd apdd = this.f107269b;
        if (apdd == null) {
            z = true;
        } else if (!apdd.f84158e.isChecked()) {
            z = true;
        }
        apdd apdd2 = this.f107270c;
        if (apdd2 != null) {
            z &= !apdd2.f84158e.isChecked();
        }
        this.f107271d.setEnabled(!z);
    }

    /* renamed from: g */
    public final void mo58841g() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        apdd apdd = this.f107269b;
        boolean z2 = true;
        if (apdd == null || !apdd.f84158e.isChecked()) {
            z = false;
        } else {
            arrayList.addAll(this.f107284q);
            z = true;
        }
        apdd apdd2 = this.f107270c;
        if (apdd2 == null || !apdd2.f84158e.isChecked()) {
            z2 = false;
        } else {
            arrayList.addAll(this.f107285r);
        }
        if (z && z2) {
            aoyj.m69819a().mo46988a(6);
        } else if (z) {
            aoyj.m69819a().mo46988a(7);
        } else if (z2) {
            aoyj.m69819a().mo46988a(8);
        } else {
            aoyj.m69819a().mo46988a(5);
            return;
        }
        arrayList.toArray(new String[arrayList.size()]);
        Intent intent = new Intent();
        intent.putExtra("account_name", this.f107277j);
        intent.putExtra("device_id", this.f107278k);
        intent.putExtra("device_name", this.f107279l);
        intent.putStringArrayListExtra("selected_contacts_account_types", arrayList);
        if (cgkf.m145856c()) {
            intent.putExtra("is_android_backup", this.f107287t);
        }
        setResult(-1, intent);
        finish();
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
        setContentView((int) C0126R.C0128layout.romanesco_restore_contacts_dialog);
        Intent intent = getIntent();
        aoyj a = aoyj.m69819a();
        if (bundle == null && (intent == null || intent.getExtras() == null)) {
            a.mo46996a("error:restore_contacts_activity:no_data");
        } else {
            if (bundle == null) {
                bundle = intent.getExtras();
            }
            this.f107277j = bundle.getString("account_name");
            this.f107278k = bundle.getString("device_id");
            this.f107279l = bundle.getString("device_name");
            this.f107280m = bundle.getLong("last_backup_time_millis");
            this.f107273f = bundle.getLong("last_restore_time_millis");
            this.f107281n = bundle.getInt("num_google_contacts", 0);
            this.f107282o = bundle.getInt("num_device_contacts", 0);
            this.f107283p = bundle.getInt("num_sim_contacts", 0);
            this.f107284q = bundle.getStringArrayList("device_contacts_account_types");
            this.f107285r = bundle.getStringArrayList("sim_contacts_account_types");
            this.f107287t = bundle.getBoolean("is_android_backup");
            if (TextUtils.isEmpty(this.f107277j)) {
                a.mo46996a("error:restore_contacts_activity:no_account_name");
            } else if (TextUtils.isEmpty(this.f107278k)) {
                a.mo46996a("error:restore_contacts_activity:no_device_id");
            } else if (TextUtils.isEmpty(this.f107279l)) {
                a.mo46996a("error:restore_contacts_activity:no_device_name");
            } else if (this.f107281n <= 0 && this.f107282o <= 0 && this.f107283p <= 0) {
                a.mo46996a("error:restore_contacts_activity:no_contacts");
            } else if (this.f107282o <= 0 && this.f107283p <= 0) {
                a.mo46996a("error:restore_contacts_activity:no_contacts_can_be_restored");
            } else if (this.f107284q == null || this.f107285r == null) {
                a.mo46996a("error:restore_contacts_activity:no_contacts_account_types");
            } else {
                if (this.f107280m < 0) {
                    a.mo46996a("error:restore_contacts_activity:invalid_last_backup_time");
                } else if (this.f107273f < 0) {
                    a.mo46996a("error:restore_contacts_activity:invalid_last_restore_time");
                }
                this.f107286s = cgkf.f187143a.mo6606a().mo83977l();
                this.f107289v = cgjy.m145756c();
                C1341rz aW = mo8628aW();
                aW.mo15855c((int) C0126R.string.romanesco_contacts_restore_dialog_title);
                aW.mo15841a(4, 4);
                aW.mo15853b(true);
                String str = this.f107279l;
                long j = this.f107280m;
                long j2 = this.f107273f;
                ((TextView) findViewById(C0126R.C0129id.dialog_title)).setText(getResources().getString(C0126R.string.romanesco_from_device_label, str));
                TextView textView = (TextView) findViewById(C0126R.C0129id.dialog_subtitle);
                if (j2 > 0) {
                    textView.setText(apel.m70103b(this, j2));
                } else if (j > 0) {
                    textView.setText(apel.m70097a(this, j));
                } else {
                    textView.setVisibility(8);
                }
                int i = this.f107281n;
                int i2 = this.f107282o;
                int i3 = this.f107283p;
                ViewGroup viewGroup = (ViewGroup) findViewById(C0126R.C0129id.contacts_info_container);
                if (i2 > 0) {
                    apdd apdd = new apdd(this, viewGroup);
                    this.f107269b = apdd;
                    apdd.f84155b.setText((int) C0126R.string.romanesco_device_contacts_settings_title);
                    this.f107269b.f84156c.setText(m92304b(i2));
                    this.f107269b.f84158e.setOnCheckedChangeListener(new apcw(this));
                    if (this.f107286s) {
                        this.f107269b.f84154a.setOnClickListener(new apcx(this));
                    }
                }
                if (i3 > 0) {
                    apdd apdd2 = new apdd(this, viewGroup);
                    this.f107270c = apdd2;
                    apdd2.f84155b.setText((int) C0126R.string.romanesco_sim_contacts_settings_title);
                    this.f107270c.f84156c.setText(m92304b(i3));
                    this.f107270c.f84158e.setOnCheckedChangeListener(new apcy(this));
                    if (this.f107286s) {
                        this.f107270c.f84154a.setOnClickListener(new apcz(this));
                    }
                }
                if (i > 0) {
                    Resources resources = getResources();
                    Integer valueOf = Integer.valueOf(i);
                    ((TextView) findViewById(C0126R.C0129id.google_contacts_summary)).setText(resources.getString(C0126R.string.romanesco_contacts_count, valueOf, valueOf));
                } else {
                    ((ViewGroup) findViewById(C0126R.C0129id.google_contacts_info)).setVisibility(8);
                }
                this.f107275h = (TextView) findViewById(C0126R.C0129id.disclaimer);
                this.f107275h.setText(getResources().getString(C0126R.string.romanesco_contacts_restore_dialog_disclaimer, this.f107277j));
                View findViewById = findViewById(C0126R.C0129id.learn_more_link_wrapper);
                this.f107276i = findViewById;
                findViewById.setOnClickListener(new apda(this));
                TextView textView2 = (TextView) findViewById(C0126R.C0129id.learn_more_link);
                textView2.setPaintFlags(textView2.getPaintFlags() | 8);
                Button button = (Button) findViewById(C0126R.C0129id.restore_button);
                this.f107271d = button;
                button.setOnClickListener(new apdb(this));
                this.f107272e = bhnh.m101201a(findViewById(16908290), (int) C0126R.string.common_no_network, -2);
                aoyj.m69819a().mo47000a(false, false, 2, false, true);
                if (!this.f107289v) {
                    return;
                }
                if (cgjy.m145758e()) {
                    this.f107274g = aoyk.m69838a(getApplicationContext(), getApplication());
                    return;
                } else {
                    this.f107274g = aoyl.m69842a(getApplicationContext(), getApplication());
                    return;
                }
            }
        }
        finish();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 0 && iArr.length > 0 && iArr[0] == 0) {
            mo58841g();
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        boolean z;
        super.onRestoreInstanceState(bundle);
        boolean z2 = true;
        if (bundle != null) {
            boolean z3 = bundle.getBoolean("device_contacts_selected", true);
            z = bundle.getBoolean("sim_contacts_selected", true);
            z2 = z3;
        } else {
            z = true;
        }
        apdd apdd = this.f107269b;
        if (apdd != null) {
            apdd.f84158e.setChecked(z2);
        }
        apdd apdd2 = this.f107270c;
        if (apdd2 != null) {
            apdd2.f84158e.setChecked(z);
        }
        boolean z4 = bundle.getBoolean("last_restore_time_updated");
        this.f107288u = z4;
        if (z4) {
            Intent intent = new Intent();
            intent.putExtra("account_name", this.f107277j);
            intent.putExtra("device_id", this.f107278k);
            intent.putExtra("last_restore_time_millis", this.f107273f);
            setResult(-1, intent);
        }
        this.f107287t = bundle.getBoolean("is_android_backup");
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        mo58840e();
    }

    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        super.onSaveInstanceState(bundle);
        bundle.putString("account_name", this.f107277j);
        bundle.putString("device_id", this.f107278k);
        bundle.putString("device_name", this.f107279l);
        bundle.putLong("last_backup_time_millis", this.f107280m);
        bundle.putLong("last_restore_time_millis", this.f107273f);
        bundle.putInt("num_google_contacts", this.f107281n);
        bundle.putInt("num_device_contacts", this.f107282o);
        bundle.putInt("num_sim_contacts", this.f107283p);
        bundle.putStringArrayList("device_contacts_account_types", this.f107284q);
        bundle.putStringArrayList("sim_contacts_account_types", this.f107285r);
        bundle.putBoolean("last_restore_time_updated", this.f107288u);
        bundle.putBoolean("is_android_backup", this.f107287t);
        apdd apdd = this.f107269b;
        boolean z2 = true;
        if (apdd == null || !apdd.f84158e.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean("device_contacts_selected", z);
        apdd apdd2 = this.f107270c;
        if (apdd2 == null || !apdd2.f84158e.isChecked()) {
            z2 = false;
        }
        bundle.putBoolean("sim_contacts_selected", z2);
    }
}
