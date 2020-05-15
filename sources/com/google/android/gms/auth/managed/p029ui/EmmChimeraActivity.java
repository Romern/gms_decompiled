package com.google.android.gms.auth.managed.p029ui;

import android.accounts.Account;
import android.app.DownloadManager;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Fragment;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.auth.managed.ui.EmmChimeraActivity */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class EmmChimeraActivity extends rrd implements jgi, jgr, jhd, rrh {

    /* renamed from: b */
    private static final sek f11057b = ght.m13171a("AuthManaged", "EmmActivity");

    /* renamed from: c */
    private Account f11058c;

    /* renamed from: d */
    private jgg f11059d;

    /* renamed from: e */
    private byte[] f11060e;

    /* renamed from: f */
    private camd f11061f;

    /* renamed from: g */
    private long f11062g;

    /* renamed from: h */
    private int f11063h;

    /* renamed from: i */
    private jhl f11064i;

    /* renamed from: j */
    private boolean f11065j;

    /* renamed from: k */
    private Bundle f11066k;

    /* renamed from: l */
    private String f11067l;

    /* renamed from: c */
    private final int m6707c(int i) {
        TypedArray obtainTypedArray = getResources().obtainTypedArray(i);
        int resourceId = obtainTypedArray.getResourceId(mo7763h(), 0);
        obtainTypedArray.recycle();
        return resourceId;
    }

    /* renamed from: a */
    public final void mo7751a() {
        mo7762g();
    }

    /* renamed from: b */
    public final void mo7756b() {
        if (this.f11063h == 3) {
            mo7752a(-1);
        } else {
            mo7758c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo7759d() {
        if (((jgs) getSupportFragmentManager().findFragmentByTag("DownloadInstallFragment")) == null) {
            String str = this.f11058c.name;
            camd camd = this.f11061f;
            String str2 = camd.f175249c;
            String str3 = camd.f175254h;
            int i = this.f11063h;
            String j = mo25039j();
            int h = mo7763h();
            jgs jgs = new jgs();
            Bundle bundle = new Bundle();
            bundle.putString("account_name", str);
            bundle.putString("package_display_name", str2);
            bundle.putString("package_icon_url", str3);
            bundle.putInt("package_install_state", i);
            bundle.putString("theme", j);
            bundle.putInt("variant_index", h);
            jgs.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().replace(16908290, jgs, "DownloadInstallFragment").commitAllowingStateLoss();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo7760e() {
        if (((jhe) getSupportFragmentManager().findFragmentByTag("ProgressDialogFragment")) == null) {
            String str = this.f11061f.f175249c;
            String string = getString(C0126R.string.auth_common_downloading);
            String string2 = getString(C0126R.string.auth_device_management_download_paused);
            long j = this.f11062g;
            byte[] bArr = this.f11060e;
            jhe jhe = new jhe();
            Bundle bundle = new Bundle();
            bundle.putCharSequence("title", str);
            bundle.putCharSequence("message", string);
            bundle.putCharSequence("pausedMessage", string2);
            bundle.putLong("downloadRequestId", j);
            bundle.putByteArray("packageInformationBytes", bArr);
            jhe.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(jhe, "ProgressDialogFragment").commitAllowingStateLoss();
            this.f11059d.f22415c = "ProgressDialogFragment";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo7761f() {
        int i;
        if (this.f11063h == 2) {
            i = C0126R.array.auth_device_management_download_not_updated_message;
        } else {
            i = C0126R.array.auth_device_management_download_failed_message;
        }
        if (((rri) getSupportFragmentManager().findFragmentByTag("FailedDialogFragment")) == null) {
            getSupportFragmentManager().beginTransaction().add(rri.m34288a(getText(m6707c(C0126R.array.auth_device_management_download_failed_title)), getText(m6707c(i)), getText(C0126R.string.common_retry), getText(C0126R.string.common_dismiss), null, true), "FailedDialogFragment").commitAllowingStateLoss();
            this.f11059d.f22415c = "FailedDialogFragment";
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo7762g() {
        if (((rri) getSupportFragmentManager().findFragmentByTag("SkipDialogFragment")) == null) {
            getSupportFragmentManager().beginTransaction().add(rri.m34289a(getText(m6707c(C0126R.array.auth_device_management_download_skip_message)), getText(m6707c(C0126R.array.auth_device_management_download_skip_confirm)), getText(C0126R.string.auth_common_go_back), false), "SkipDialogFragment").commitAllowingStateLoss();
            this.f11059d.f22415c = "SkipDialogFragment";
        }
    }

    /* renamed from: h */
    public final int mo7763h() {
        if (getIntent().getBooleanExtra("is_unicorn_account", false)) {
            return 2;
        }
        if (!getIntent().getBooleanExtra("is_unicorn_account", false) || !ccgh.f178939a.mo6606a().mo75931h()) {
            return 0;
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x006f, code lost:
        if (((android.app.admin.DevicePolicyManager) getSystemService("device_policy")).getUserProvisioningState() == 4) goto L_0x0071;
     */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        sek sek = f11057b;
        StringBuilder sb = new StringBuilder(41);
        sb.append("onActivityResult: ");
        sb.append(i2);
        sb.append(" ");
        sb.append(i);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (i == 1 && i2 == 0) {
            f11057b.mo25414c("Forced DO is cancelled, removing the account", new Object[0]);
            mo7753a(10, (Intent) null);
            return;
        }
        this.f11064i = jhl.m16704a();
        boolean booleanExtra = getIntent().getBooleanExtra("is_setup_wizard", false);
        if (booleanExtra && i2 == 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (((DevicePolicyManager) getSystemService("device_policy")).getDeviceOwner() == null) {
                int i4 = Build.VERSION.SDK_INT;
            }
            f11057b.mo25414c("Provisioning is indeed done, returns RESULT_OKAY instead", new Object[0]);
            i2 = -1;
        }
        if (ccgi.m129605b() && !booleanExtra && i == 2 && i2 == 0 && this.f11064i.mo13741a(this.f11067l)) {
            camd camd = this.f11061f;
            if (("com.google.android.apps.work.clouddpc".equals(camd.f175248b) || "com.google.android.apps.enterprise.dmagent".equals(camd.f175248b)) && getIntent().getIntExtra("flow", -1) == 0) {
                f11057b.mo25414c("Returning to remove just added Google managed account", new Object[0]);
                mo7753a(10, (Intent) null);
                return;
            }
        }
        Account account = this.f11058c;
        sdo.m34959a(account);
        gob a = goc.m13598a(this);
        roz b = rpa.m34196b();
        b.f43473b = new Feature[]{ghy.f18276b};
        b.f43472a = new gpk(account);
        ((rjx) a).mo24732b(b.mo24977a()).mo50372a(new jhk());
        mo7753a(i2, intent);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00ef, code lost:
        if (r4 != false) goto L_0x0121;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00fe, code lost:
        if (p000.ccgh.f178939a.mo75920b().mo75924a() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x010e, code lost:
        if (p000.ccgh.f178939a.mo75920b().mo75926c() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x011e, code lost:
        if (p000.ccgh.f178939a.mo75920b().mo75925b() == false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0135, code lost:
        if ("com.google.work".equals(r6.f11058c.type) == false) goto L_0x013c;
     */
    public final void onCreate(Bundle bundle) {
        Bundle applicationRestrictions;
        super.onCreate(bundle);
        sek sek = f11057b;
        String valueOf = String.valueOf(bundle);
        String valueOf2 = String.valueOf(getIntent().getExtras());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 10 + String.valueOf(valueOf2).length());
        sb.append("onCreate ");
        sb.append(valueOf);
        sb.append(" ");
        sb.append(valueOf2);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (ccgz.m129649c() && bundle == null) {
            jhm.m16712a(this).mo13743a(8);
        }
        int i = Build.VERSION.SDK_INT;
        if (!getPackageManager().hasSystemFeature("android.software.device_admin")) {
            mo7753a(5, (Intent) null);
            return;
        }
        int intExtra = getIntent().getIntExtra("flow", 0);
        if (intExtra != 0 || (applicationRestrictions = ((UserManager) getSystemService("user")).getApplicationRestrictions(getPackageName())) == null || !applicationRestrictions.getBoolean("auth_account:disallow_managed_account", false)) {
            this.f11064i = jhl.m16704a();
            this.f11058c = (Account) getIntent().getParcelableExtra("account");
            this.f11067l = getIntent().getStringExtra("dm_status");
            if (intExtra == 0) {
                Intent intent = getIntent();
                boolean booleanExtra = intent.getBooleanExtra("is_setup_wizard", false);
                boolean booleanExtra2 = intent.getBooleanExtra("is_user_owner", false);
                if (intent.getBooleanExtra("is_unicorn_account", false)) {
                    if (!booleanExtra) {
                    }
                    if (booleanExtra) {
                        if (booleanExtra2) {
                        }
                    }
                    if (booleanExtra) {
                        if (!booleanExtra2) {
                        }
                    }
                } else if (booleanExtra) {
                    mo7753a(7, (Intent) null);
                    return;
                } else {
                    mo7753a(7, (Intent) null);
                    return;
                }
                if (this.f11064i.mo13741a(this.f11067l)) {
                }
                mo7753a(7, (Intent) null);
                return;
            }
            if (bundle != null) {
                this.f11065j = bundle.getBoolean("force_device_owner_launched");
            }
            jgg jgg = (jgg) getSupportFragmentManager().findFragmentByTag("StateRetainFragment");
            this.f11059d = jgg;
            if (jgg == null) {
                this.f11059d = new jgg();
                getSupportFragmentManager().beginTransaction().add(this.f11059d, "StateRetainFragment").commit();
            }
            byte[] bArr = this.f11059d.f22413a;
            this.f11060e = bArr;
            if (bArr != null) {
                camd a = this.f11064i.mo13738a(bArr);
                this.f11061f = a;
                this.f11063h = this.f11064i.mo13737a(this, a);
            }
            this.f11062g = this.f11059d.f22414b;
            setResult(0, new Intent().putExtra("intentionally_canceled", true));
            Bundle bundle2 = (Bundle) getIntent().getParcelableExtra("options");
            this.f11066k = bundle2;
            if (bundle2 == null) {
                this.f11066k = Bundle.EMPTY;
            }
            if (!ccgq.m129635b()) {
                this.f11066k.remove("source_device_id");
                return;
            }
            return;
        }
        mo7753a(9, (Intent) null);
    }

    /* access modifiers changed from: protected */
    public final void onResumeFragments() {
        super.onResumeFragments();
        f11057b.mo25414c("onResumeFragments", new Object[0]);
        if (isFinishing()) {
            f11057b.mo25412b("finish() had been called, skip resuming fragments.", new Object[0]);
        } else if (this.f11059d.f22413a != null) {
            mo7759d();
            jgg jgg = this.f11059d;
            if (jgg.f22414b != -1 && "ProgressDialogFragment".equals(jgg.f22415c)) {
                mo7760e();
            } else if ("FailedDialogFragment".equals(this.f11059d.f22415c)) {
                mo7761f();
            } else if ("SkipDialogFragment".equals(this.f11059d.f22415c)) {
                mo7762g();
            }
        } else if (((jgj) getSupportFragmentManager().findFragmentByTag("FetchManagingAppFragment")) == null) {
            Account account = this.f11058c;
            String j = mo25039j();
            jgj jgj = new jgj();
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putString("theme", j);
            jgj.setArguments(bundle);
            getSupportFragmentManager().beginTransaction().add(16908290, jgj, "FetchManagingAppFragment").commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("force_device_owner_launched", this.f11065j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7752a(int i) {
        Intent intent = getIntent();
        camd camd = this.f11061f;
        Account account = this.f11058c;
        int i2 = 0;
        boolean booleanExtra = intent.getBooleanExtra("is_setup_wizard", false);
        Bundle bundle = this.f11066k;
        sdo.m34959a(camd);
        sdo.m34959a(account);
        jhi a = jhl.m16703a(this, camd.f175248b, camd, account, bundle, Boolean.valueOf(booleanExtra), false, null);
        if (a.f22488a.f30115i == Status.f30107a.f30115i && a.f22489b != null) {
            if (ccgz.m129649c()) {
                f11057b.mo25414c("Launching managing app", new Object[0]);
                jhm.m16712a(this).mo13744a(14, this.f11061f);
            }
            Intent intent2 = a.f22489b;
            if (ccgi.m129605b()) {
                i2 = 2;
            }
            startActivityForResult(intent2, i2);
        } else if (i != -1) {
            mo7753a(i, (Intent) null);
        } else {
            mo7753a(2, (Intent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo7758c() {
        camd camd = this.f11061f;
        sdo.m34959a(camd);
        DownloadManager.Request visibleInDownloadsUi = new DownloadManager.Request(Uri.parse(camd.f175255i)).setNotificationVisibility(2).setVisibleInDownloadsUi(false);
        if (!camd.f175256j.isEmpty() && !camd.f175257k.isEmpty()) {
            String str = camd.f175256j;
            String str2 = camd.f175257k;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
            sb.append(str);
            sb.append("=");
            sb.append(str2);
            visibleInDownloadsUi.addRequestHeader("Cookie", sb.toString());
        }
        long enqueue = ((DownloadManager) getSystemService("download")).enqueue(visibleInDownloadsUi);
        this.f11062g = enqueue;
        this.f11059d.f22414b = enqueue;
        mo7760e();
    }

    /* renamed from: b */
    public final void mo7757b(int i) {
        this.f11059d.f22415c = null;
        if (i == 3) {
            mo7762g();
        } else if (i == 1) {
            mo7761f();
        } else if (i == 2) {
            mo7752a(-1);
        }
        ((DownloadManager) getSystemService("download")).remove(this.f11062g);
        this.f11059d.f22414b = -1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo7753a(int i, Intent intent) {
        sek sek = f11057b;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Finish with resultCode: ");
        sb.append(i);
        sek.mo25414c(sb.toString(), new Object[0]);
        if (ccgz.m129649c()) {
            jhm a = jhm.m16712a(this);
            bxvd da = cilz.f190690g.mo74144da();
            cilx a2 = jhm.m16711a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            cilz cilz = (cilz) da.f164949b;
            a2.getClass();
            cilz.f190693b = a2;
            int i2 = cilz.f190692a | 1;
            cilz.f190692a = i2;
            cilz.f190694c = 15;
            int i3 = 2;
            int i4 = i2 | 2;
            cilz.f190692a = i4;
            switch (i) {
                case -1:
                    break;
                case 0:
                    i3 = 3;
                    break;
                case 1:
                default:
                    i3 = 1;
                    break;
                case 2:
                    i3 = 4;
                    break;
                case 3:
                    i3 = 5;
                    break;
                case 4:
                    i3 = 6;
                    break;
                case 5:
                    i3 = 7;
                    break;
                case 6:
                    i3 = 8;
                    break;
                case 7:
                    i3 = 9;
                    break;
                case 8:
                    i3 = 10;
                    break;
                case 9:
                    i3 = 11;
                    break;
                case 10:
                    i3 = 12;
                    break;
            }
            cilz.f190696e = i3 - 1;
            cilz.f190692a = i4 | 8;
            qwo a3 = a.f22495a.mo24335a(((cilz) da.mo74062i()).mo73642k());
            a3.mo24328b(15);
            a3.mo24327b();
        }
        if (i == 0) {
            if (intent == null) {
                intent = new Intent();
            }
            intent.putExtra("intentionally_canceled", true);
        }
        setResult(i, intent);
        finish();
    }

    /* renamed from: a */
    public final void mo7754a(rri rri, int i) {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("SkipDialogFragment");
        Fragment findFragmentByTag2 = getSupportFragmentManager().findFragmentByTag("FailedDialogFragment");
        rri.dismissAllowingStateLoss();
        this.f11059d.f22415c = null;
        if (i == 1 && findFragmentByTag == rri) {
            mo7753a(6, (Intent) null);
        } else if (findFragmentByTag2 != rri) {
        } else {
            if (i != 1) {
                mo7752a(4);
            } else {
                mo7758c();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0242, code lost:
        if (r14.name.contains("@") == false) goto L_0x024e;
     */
    /* renamed from: a */
    public final void mo7755a(byte[] bArr, boolean z, String str) {
        sek sek = f11057b;
        StringBuilder sb = new StringBuilder(45);
        sb.append("onFetchManagingAppInfoFragmentFinished, ");
        sb.append(z);
        sek.mo25414c(sb.toString(), new Object[0]);
        this.f11060e = bArr;
        camd a = this.f11064i.mo13738a(bArr);
        this.f11061f = a;
        if (a == null) {
            mo7753a(3, (Intent) null);
        } else if (!getIntent().getBooleanExtra("suppress_account_provisioning", false) || !this.f11061f.f175248b.equals(getIntent().getStringExtra("calling_package"))) {
            if (this.f11066k.getInt("enforced_management_mode", 0) == 0 && adyd.m51363a(this).mo33916a("com.google").length > 1) {
                this.f11066k.putInt("enforced_management_mode", 2);
            }
            if (!TextUtils.isEmpty(str)) {
                this.f11066k.putString("source_device_id", str);
            }
            int i = Settings.Secure.getInt(getContentResolver(), "device_provisioned", 1);
            if (z) {
                int i2 = Build.VERSION.SDK_INT;
                if (getIntent().getBooleanExtra("is_setup_wizard", false) && this.f11066k.getInt("enforced_management_mode", 0) != 2 && i == 0) {
                    if (!this.f11065j) {
                        this.f11065j = true;
                        if (ccgz.m129649c()) {
                            sek sek2 = f11057b;
                            StringBuilder sb2 = new StringBuilder(26);
                            sb2.append("Launching forced DO, true");
                            sek2.mo25414c(sb2.toString(), new Object[0]);
                            jhm.m16712a(this).mo13744a(15, this.f11061f);
                        }
                        camd camd = this.f11061f;
                        Account account = this.f11058c;
                        Bundle bundle = this.f11066k;
                        sdo.m34959a(camd);
                        sek sek3 = jhl.f22492a;
                        String valueOf = String.valueOf(camd.f175248b);
                        sek3.mo25414c(valueOf.length() == 0 ? new String("packageName: ") : "packageName: ".concat(valueOf), new Object[0]);
                        sek sek4 = jhl.f22492a;
                        String valueOf2 = String.valueOf(camd.f175259m);
                        sek4.mo25414c(valueOf2.length() == 0 ? new String("zeroTouchDeviceAdminReceiver: ") : "zeroTouchDeviceAdminReceiver: ".concat(valueOf2), new Object[0]);
                        sek sek5 = jhl.f22492a;
                        String valueOf3 = String.valueOf(camd.f175255i);
                        sek5.mo25414c(valueOf3.length() == 0 ? new String("apkDownloadUrl: ") : "apkDownloadUrl: ".concat(valueOf3), new Object[0]);
                        sek sek6 = jhl.f22492a;
                        String valueOf4 = String.valueOf(camd.f175252f);
                        sek6.mo25414c(valueOf4.length() == 0 ? new String("apkSigningCertSha256Hash: ") : "apkSigningCertSha256Hash: ".concat(valueOf4), new Object[0]);
                        sek sek7 = jhl.f22492a;
                        String valueOf5 = String.valueOf(camd.f175256j);
                        sek7.mo25414c(valueOf5.length() == 0 ? new String("apkDownloadCookieName: ") : "apkDownloadCookieName: ".concat(valueOf5), new Object[0]);
                        sek sek8 = jhl.f22492a;
                        String valueOf6 = String.valueOf(camd.f175257k);
                        sek8.mo25414c(valueOf6.length() == 0 ? new String("apkDownloadCookieValue: ") : "apkDownloadCookieValue: ".concat(valueOf6), new Object[0]);
                        PersistableBundle persistableBundle = new PersistableBundle();
                        Intent putExtra = new Intent("android.app.action.PROVISION_MANAGED_DEVICE_FROM_TRUSTED_SOURCE").putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_COMPONENT_NAME", new ComponentName(camd.f175248b, camd.f175259m)).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_LABEL", camd.f175249c).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_LOCATION", camd.f175255i).putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_SIGNATURE_CHECKSUM", camd.f175252f);
                        String str2 = camd.f175256j;
                        String str3 = camd.f175257k;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                        sb3.append(str2);
                        sb3.append("=");
                        sb3.append(str3);
                        Intent putExtra2 = putExtra.putExtra("android.app.extra.PROVISIONING_DEVICE_ADMIN_PACKAGE_DOWNLOAD_COOKIE_HEADER", sb3.toString());
                        if ("com.google.android.apps.work.clouddpc".equals(camd.f175248b)) {
                            persistableBundle.putString("com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_NAME", account.name);
                            persistableBundle.putString("com.google.android.apps.work.clouddpc.EXTRA_ACCOUNT_TYPE", account.type);
                            persistableBundle.putInt("enforced_management_mode", bundle.getInt("enforced_management_mode", 0));
                            persistableBundle.putInt("restore_mode", bundle.getInt("restore_mode", 0));
                            persistableBundle.putLong("source_device_id", bundle.getLong("source_device_id", -1));
                            int i3 = Build.VERSION.SDK_INT;
                            if (!ccgh.f178939a.mo6606a().mo75932i()) {
                                if (account != null) {
                                    sdo.m34959a(account);
                                }
                            }
                            persistableBundle.putBoolean("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
                            putExtra2.putExtra("android.app.extra.PROVISIONING_SKIP_EDUCATION_SCREENS", true);
                        }
                        putExtra2.putExtra("android.app.extra.PROVISIONING_ADMIN_EXTRAS_BUNDLE", persistableBundle);
                        startActivityForResult(putExtra2.putExtra("android.app.extra.PROVISIONING_TRIGGER", 3), 1);
                        return;
                    }
                    return;
                }
            }
            this.f11059d.f22413a = this.f11060e;
            int a2 = this.f11064i.mo13737a(this, this.f11061f);
            this.f11063h = a2;
            if (a2 == 3) {
                mo7752a(-1);
            } else {
                mo7759d();
            }
        } else {
            mo7753a(8, (Intent) null);
        }
    }
}
