package p000;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorDescription;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: rhc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class rhc extends deu implements AccountManagerCallback {

    /* renamed from: b */
    private Set f42960b;

    /* renamed from: c */
    private Set f42961c;

    /* renamed from: d */
    private String f42962d = null;

    /* renamed from: e */
    protected int f42963e;

    /* renamed from: f */
    protected boolean f42964f;

    /* renamed from: g */
    protected String f42965g;

    /* renamed from: h */
    protected bmxv f42966h;

    /* renamed from: i */
    public ListView f42967i;

    /* renamed from: j */
    private boolean f42968j = false;

    /* renamed from: k */
    private boolean f42969k = false;

    /* renamed from: l */
    private boolean f42970l = false;

    /* renamed from: m */
    private ArrayList f42971m;

    /* renamed from: n */
    private int f42972n = 0;

    /* renamed from: o */
    private Parcelable[] f42973o = null;

    /* renamed from: a */
    private final ArrayList m33596a(adyd adyd) {
        ArrayList arrayList = new ArrayList();
        Set<String> set = this.f42961c;
        if (set != null) {
            for (String str : set) {
                arrayList.addAll(m33597a(adyd, str));
            }
        } else {
            for (String str2 : rzx.f43912a) {
                arrayList.addAll(m33597a(adyd, str2));
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private final View m33599b(String str) {
        try {
            return findViewById(getResources().getIdentifier(str, null, null));
        } catch (Resources.NotFoundException e) {
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m33600c(String str) {
        for (String str2 : rzx.f43912a) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    private final void mo17693h() {
        Intent intent = new Intent();
        intent.setClassName(this, "com.google.android.gms.common.account.AccountTypePickerActivity");
        intent.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
        intent.putExtra("allowableAccountTypes", getIntent().getStringArrayExtra("allowableAccountTypes"));
        intent.putExtra("addAccountOptions", getIntent().getBundleExtra("addAccountOptions"));
        intent.putExtra("addAccountRequiredFeatures", getIntent().getStringArrayExtra("addAccountRequiredFeatures"));
        intent.putExtra("authTokenType", getIntent().getStringExtra("authTokenType"));
        startActivityForResult(intent, 1);
        this.f42972n = 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24624a(Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo17696e();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public ArrayList mo24625g() {
        if (this.f42971m == null) {
            this.f42971m = m33596a(adyd.m51363a(this));
        }
        return this.f42971m;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public boolean mo17694i() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo17695j() {
        TextView textView;
        bmxv bmxv;
        TextView textView2 = (TextView) findViewById(C0126R.C0129id.main_title);
        int intExtra = getIntent().getIntExtra("overrideCustomTheme", 0);
        if (intExtra == 1) {
            if (textView2 != null) {
                if (!this.f42966h.mo66813a() || !((acyq) this.f42966h.mo66814b()).mo33247b().mo66813a()) {
                    textView2.setText(getString(C0126R.string.common_account_choose_account_for_app_label, new Object[]{mo24628l()}));
                } else {
                    textView2.setText((CharSequence) ((acyq) this.f42966h.mo66814b()).mo33247b().mo66814b());
                }
                textView2.setBackgroundResource(C0126R.C0127drawable.bg_play_games_banner_choose_account);
                textView2.setTextColor(-1);
                textView2.setGravity(16);
                int dimensionPixelSize = getResources().getDimensionPixelSize(C0126R.dimen.common_account_picker_header_padding);
                textView2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            }
            View b = m33599b("android:id/titleDivider");
            if (b != null) {
                b.setVisibility(8);
            }
        } else if (intExtra == 2 && (textView = (TextView) findViewById(C0126R.C0129id.main_title)) != null) {
            TextView textView3 = (TextView) findViewById(C0126R.C0129id.subtitle);
            ImageView imageView = (ImageView) findViewById(C0126R.C0129id.app_icon);
            bmxv b2 = this.f42966h.mo66813a() ? ((acyq) this.f42966h.mo66814b()).mo33247b() : bmvz.f131120a;
            if (b2.mo66813a()) {
                textView.setText((CharSequence) b2.mo66814b());
                textView.setSingleLine(false);
                textView.setMaxLines(2);
                return;
            }
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (((float) displayMetrics.heightPixels) / displayMetrics.density < ((float) ((Integer) rhp.f42990a.mo58455c()).intValue())) {
                textView.setVisibility(8);
                this.f42967i.addHeaderView(getLayoutInflater().inflate((int) C0126R.C0128layout.common_account_account_chip_small_screen_list_header, (ViewGroup) null), null, false);
                textView3 = (TextView) this.f42967i.findViewById(C0126R.C0129id.subtitle);
                imageView = null;
            }
            if (imageView != null) {
                String str = this.f42965g;
                if (str != null) {
                    try {
                        bmxv = bmxv.m108566b(getPackageManager().getApplicationIcon(str));
                    } catch (PackageManager.NameNotFoundException e) {
                        Log.w("AccountChooser", String.format("Cannot find icon of package: %s", str), e);
                        bmxv = bmvz.f131120a;
                    }
                } else {
                    bmxv = bmvz.f131120a;
                }
                if (bmxv.mo66813a()) {
                    imageView.setImageDrawable((Drawable) bmxv.mo66814b());
                    imageView.setVisibility(0);
                }
            }
            if (textView3 != null) {
                textView3.setVisibility(0);
                textView3.setText(getString(C0126R.string.common_account_account_chip_subtitle, new Object[]{mo24628l()}));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo24627k() {
        if (this.f42963e == mo24625g().size()) {
            mo17693h();
        } else if (this.f42963e != -1) {
            Account account = (Account) mo24625g().get(this.f42963e);
            m33598a(account.name, account.type);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final String mo24628l() {
        String str = this.f42965g;
        if (!TextUtils.isEmpty(str)) {
            try {
                return svr.m36484b(getApplicationContext()).mo26177b(str).toString();
            } catch (PackageManager.NameNotFoundException e) {
                Log.w("AccountChooser", String.format("Cannot find label of package: %s", str), e);
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        String str;
        this.f42972n = 0;
        Parcelable[] parcelableArr = this.f42973o;
        if (i2 != 0) {
            if (i2 == -1) {
                if (i != 1) {
                    if (i == 2) {
                        String str2 = null;
                        if (intent != null) {
                            str2 = intent.getStringExtra("authAccount");
                            str = intent.getStringExtra("accountType");
                        } else {
                            str = null;
                        }
                        if (parcelableArr != null && (str2 == null || str == null)) {
                            ArrayList a = m33596a(adyd.m51363a(this));
                            Account[] accountArr = (Account[]) a.toArray(new Account[a.size()]);
                            HashSet hashSet = new HashSet();
                            for (Parcelable parcelable : parcelableArr) {
                                hashSet.add((Account) parcelable);
                            }
                            int length = accountArr.length;
                            int i3 = 0;
                            while (true) {
                                if (i3 >= length) {
                                    break;
                                }
                                Account account = accountArr[i3];
                                if (!hashSet.contains(account)) {
                                    str2 = account.name;
                                    str = account.type;
                                    break;
                                }
                                i3++;
                            }
                        }
                        if (!(str2 == null && str == null)) {
                            m33598a(str2, str);
                            return;
                        }
                    }
                } else if (!(intent == null || (stringExtra = intent.getStringExtra("accountType")) == null)) {
                    mo24626a(stringExtra);
                    return;
                }
            }
            setResult(0);
            finish();
        } else if (mo24625g().isEmpty()) {
            setResult(0);
            finish();
        }
    }

    public void onCreate(Bundle bundle) {
        HashSet hashSet;
        Bundle bundleExtra = getIntent().getBundleExtra("first_party_options_bundle");
        if (bundleExtra != null) {
            this.f42966h = bmxv.m108566b(acyq.m50011a(bundleExtra).mo33244a());
        } else {
            this.f42966h = bmvz.f131120a;
        }
        String a = spn.m35852a((Activity) this);
        if (a == null) {
            Log.w("AccountChooser", "Unable to get caller identity");
            finish();
        } else if (!mo17694i() || adbx.m50147a(this, a)) {
            if (bmwb.m108443a(a, getPackageName()) && getIntent().hasExtra("realClientPackage")) {
                a = getIntent().getStringExtra("realClientPackage");
            }
            this.f42965g = a;
        } else {
            Log.w("AccountChooser", "App was not signed by Google.");
            finish();
        }
        Intent intent = getIntent();
        bmxv bmxv = bmvz.f131120a;
        if (intent.hasExtra("overrideTheme")) {
            bmxv = bmxv.m108566b(Integer.valueOf(intent.getIntExtra("overrideTheme", 0)));
        }
        if (this.f42966h.mo66813a() && ((acyq) this.f42966h.mo66814b()).mo33251f().mo66813a()) {
            bmxv = ((acyq) this.f42966h.mo66814b()).mo33251f();
        }
        if (bmxv.mo66813a()) {
            int intValue = ((Integer) bmxv.mo66814b()).intValue();
            if (intValue == 1) {
                setTheme(2132017674);
            } else if (intValue == 1000) {
                setTheme(2132017673);
            } else if (intValue != 1001) {
                setTheme(2132017675);
            } else {
                setTheme(2132017671);
            }
        }
        super.onCreate(bundle);
        Intent intent2 = getIntent();
        if (intent2 != null) {
            HashSet hashSet2 = null;
            if (bundle != null) {
                this.f42972n = bundle.getInt("pendingRequest");
                this.f42973o = bundle.getParcelableArray("existingAccounts");
                this.f42962d = bundle.getString("selectedAccountName");
                this.f42968j = bundle.getBoolean("selectedAddAccount", false);
            } else {
                this.f42972n = 0;
                this.f42973o = null;
                Account account = (Account) intent2.getParcelableExtra("selectedAccount");
                if (account != null) {
                    this.f42962d = account.name;
                }
            }
            ArrayList parcelableArrayListExtra = intent2.getParcelableArrayListExtra("allowableAccounts");
            if (parcelableArrayListExtra != null) {
                hashSet = new HashSet(parcelableArrayListExtra.size());
                int size = parcelableArrayListExtra.size();
                for (int i = 0; i < size; i++) {
                    hashSet.add((Account) ((Parcelable) parcelableArrayListExtra.get(i)));
                }
            } else {
                hashSet = null;
            }
            this.f42960b = hashSet;
            String[] stringArrayExtra = intent2.getStringArrayExtra("allowableAccountTypes");
            if (stringArrayExtra != null) {
                int length = stringArrayExtra.length;
                HashSet hashSet3 = new HashSet(length);
                for (String str : stringArrayExtra) {
                    hashSet3.add(str);
                }
                AuthenticatorDescription[] a2 = adyd.m51363a(this).mo33918a();
                int length2 = a2.length;
                HashSet hashSet4 = new HashSet(length2);
                for (AuthenticatorDescription authenticatorDescription : a2) {
                    hashSet4.add(authenticatorDescription.type);
                }
                hashSet3.retainAll(hashSet4);
                hashSet2 = hashSet3;
            }
            this.f42961c = hashSet2;
            this.f42969k = intent2.getBooleanExtra("alwaysPromptForAccount", false);
            this.f42970l = intent2.getBooleanExtra("setGmsCoreAccount", false);
            this.f42964f = soz.m35813i(this);
            return;
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (p000.adbx.m50146a(r7, r4) != false) goto L_0x00a7;
     */
    public final void onResume() {
        int i;
        int i2;
        super.onResume();
        this.f42971m = null;
        int i3 = 0;
        if (this.f42972n == 0) {
            if (mo24625g().isEmpty()) {
                if (!soz.m35813i(this)) {
                    Toast.makeText(this, (int) C0126R.string.common_account_restricted_no_accounts, 0).show();
                    Log.i("AccountChooser", "User doesn't have the ability to add an Account. Nothing to choose.");
                    setResult(0);
                    finish();
                    return;
                }
                Set set = this.f42961c;
                if (set == null || set.size() != 1) {
                    mo17693h();
                    return;
                } else {
                    mo24626a((String) this.f42961c.iterator().next());
                    return;
                }
            } else if (!this.f42969k) {
                ArrayList g = mo24625g();
                if (g.size() == 1) {
                    Account account = (Account) g.get(0);
                    int i4 = Build.VERSION.SDK_INT;
                    if (m33600c(account.type)) {
                        adyd a = adyd.m51363a(this);
                        String str = this.f42965g;
                        if (str != null) {
                            Integer valueOf = Integer.valueOf(a.mo33919b(account, str));
                            if (!(valueOf.intValue() == 2 || valueOf.intValue() == 1)) {
                                if (valueOf.intValue() == 4) {
                                    String str2 = this.f42965g;
                                    if (str2 != null) {
                                        i2 = spn.m35897i(this, str2);
                                    } else {
                                        i2 = -1;
                                    }
                                }
                            }
                            Account account2 = (Account) g.get(0);
                            m33598a(account2.name, account2.type);
                            return;
                        }
                    }
                }
            }
        }
        ArrayList g2 = mo24625g();
        String str3 = this.f42962d;
        if (!this.f42968j) {
            while (true) {
                if (i3 < g2.size()) {
                    if (((Account) g2.get(i3)).name.equals(str3)) {
                        i = i3;
                        break;
                    }
                    i3++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = g2.size();
        }
        this.f42963e = i;
        mo17696e();
        mo17695j();
        int i5 = this.f42963e;
        if (i5 != -1) {
            this.f42967i.setItemChecked(i5, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("pendingRequest", this.f42972n);
        bundle.putParcelableArray("existingAccounts", this.f42973o);
        int i = this.f42963e;
        if (i == -1) {
            return;
        }
        if (i == mo24625g().size()) {
            bundle.putBoolean("selectedAddAccount", true);
            return;
        }
        bundle.putBoolean("selectedAddAccount", false);
        bundle.putString("selectedAccountName", ((Account) mo24625g().get(this.f42963e)).name);
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
            if (intent == null) {
                Bundle bundle = new Bundle();
                bundle.putString("errorMessage", "error communicating with server");
                setResult(-1, new Intent().putExtras(bundle));
                finish();
                return;
            }
            this.f42972n = 2;
            ArrayList a = m33596a(adyd.m51363a(this));
            this.f42973o = (Parcelable[]) a.toArray(new Account[a.size()]);
            intent.setFlags(intent.getFlags() & -268435457);
            startActivityForResult(intent, 2);
        } catch (OperationCanceledException e) {
            setResult(0);
            finish();
        } catch (AuthenticatorException | IOException e2) {
        }
    }

    /* renamed from: a */
    private final ArrayList m33597a(adyd adyd, String str) {
        String str2 = this.f42965g;
        int i = Build.VERSION.SDK_INT;
        Account[] a = (m33600c(str) && str2 != null) ? adyd.mo33917a(str, str2) : new Account[0];
        int length = a.length;
        ArrayList arrayList = new ArrayList(length);
        for (Account account : a) {
            Set set = this.f42960b;
            if (set == null || set.contains(account)) {
                arrayList.add(account);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final void m33598a(String str, String str2) {
        String str3;
        if (!(!this.f42970l || (str3 = this.f42965g) == null || str == null)) {
            sbv.m34874a(this, str, str3);
        }
        int i = Build.VERSION.SDK_INT;
        if (!(str == null || str2 == null || !m33600c(str2))) {
            Account account = new Account(str, str2);
            adyd a = adyd.m51363a(this);
            String str4 = this.f42965g;
            if (str4 != null && Integer.valueOf(a.mo33919b(account, str4)).intValue() == 4) {
                a.mo33914a(account, this.f42965g, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        mo24624a(bundle);
        setResult(-1, new Intent().putExtras(bundle));
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo24626a(String str) {
        Bundle bundleExtra = getIntent().getBundleExtra("addAccountOptions");
        String[] stringArrayExtra = getIntent().getStringArrayExtra("addAccountRequiredFeatures");
        adyd.m51363a(this).mo33913a(str, getIntent().getStringExtra("authTokenType"), stringArrayExtra, bundleExtra, null, this);
    }
}
