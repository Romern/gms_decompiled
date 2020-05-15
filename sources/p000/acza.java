package p000;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import com.felicanetworks.mfc.C0126R;
import com.google.android.chimera.Activity;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: acza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acza extends adcf {

    /* renamed from: a */
    public static final sek f61102a = new sek("CommonAccount", "AccountChooserFragment");

    /* renamed from: g */
    private static final allq f61103g;

    /* renamed from: b */
    public Context f61104b;

    /* renamed from: c */
    public LinkedHashMap f61105c;

    /* renamed from: d */
    public int f61106d;

    /* renamed from: e */
    public boolean f61107e = false;

    /* renamed from: f */
    aczc f61108f;

    /* renamed from: h */
    private String f61109h;

    /* renamed from: i */
    private bngx f61110i;

    /* renamed from: j */
    private boolean f61111j;

    /* renamed from: k */
    private ArrayList f61112k;

    /* renamed from: l */
    private String f61113l;

    /* renamed from: m */
    private Bundle f61114m;

    /* renamed from: n */
    private boolean f61115n;

    /* renamed from: o */
    private adyd f61116o;

    /* renamed from: p */
    private rjx f61117p;

    /* renamed from: q */
    private rjx f61118q;

    static {
        allp allp = new allp();
        allp.f73626a = 80;
        f61103g = allp.mo40491a();
    }

    /* renamed from: a */
    public static acza m50025a(String str, bngx bngx, String str2) {
        String[] strArr;
        Bundle bundle = new Bundle();
        bundle.putString("calling_package", str);
        bundle.putBoolean("use_particle_disc", true);
        if (bngx != null) {
            strArr = (String[]) bnjd.m109584a(bnfi.m109235a(bngx).mo67504a(), String.class);
        } else {
            strArr = null;
        }
        bundle.putStringArray("allowed_account_types", strArr);
        bundle.putBoolean("force_account_picking", true);
        bundle.putParcelableArrayList("valid_accounts", null);
        bundle.putString("hosted_domain_filter", str2);
        bundle.putBundle("add_account_options", null);
        acza acza = new acza();
        acza.setArguments(bundle);
        return acza;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final List mo33264b() {
        String[] strArr;
        adyd adyd = this.f61116o;
        bngx bngx = this.f61110i;
        if (bngx != null) {
            strArr = (String[]) bngx.toArray(new String[0]);
        } else {
            strArr = null;
        }
        ArrayList a = acyo.m50004a(adyd, strArr, this.f61112k, this.f61109h);
        String str = this.f61113l;
        return (a.isEmpty() || TextUtils.isEmpty(str)) ? a : soz.m35785a(a, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
    public final void onActivityResult(int i, int i2, Intent intent) {
        String stringExtra;
        String str;
        String str2;
        Account account;
        this.f61107e = false;
        if (i2 != 0) {
            if (i2 == -1) {
                if (i != 1) {
                    if (i == 2) {
                        if (intent != null) {
                            str2 = intent.getStringExtra("authAccount");
                            str = intent.getStringExtra("accountType");
                        } else {
                            str2 = null;
                            str = null;
                        }
                        if (str2 == null || str == null) {
                            if (!this.f61105c.isEmpty()) {
                                List b = mo33264b();
                                int size = b.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        break;
                                    }
                                    account = (Account) b.get(i3);
                                    i3++;
                                    if (!this.f61105c.containsKey(account)) {
                                        break;
                                    }
                                }
                                if (account != null) {
                                    str2 = account.name;
                                    str = account.type;
                                }
                            }
                            account = null;
                            if (account != null) {
                            }
                        }
                        if (!(str2 == null && str == null)) {
                            mo33263a(str2, str);
                            return;
                        }
                    }
                } else if (intent == null || (stringExtra = intent.getStringExtra("accountType")) == null) {
                    f61102a.mo25412b("Unable to find account type, pretending the request was canceled", new Object[0]);
                } else {
                    m50026a(stringExtra);
                    return;
                }
                f61102a.mo25412b("Unable to find added account, pretending the request was canceled", new Object[0]);
            }
            f61102a.mo25409a("Canceled", new Object[0]);
            this.f61108f.mo33265a(new acyz(0, null));
        } else if (mo33264b().isEmpty()) {
            this.f61108f.mo33265a(new acyz(0, null));
        } else {
            this.f61108f.mo33265a(new acyz(11, null));
            this.f61108f.mo33267a(false);
        }
    }

    public final void onCreate(Bundle bundle) {
        bngx bngx;
        super.onCreate(bundle);
        setRetainInstance(true);
        Context context = getContext();
        bmxy.m108581a(context);
        this.f61104b = context.getApplicationContext();
        Bundle arguments = getArguments();
        bmxy.m108581a(arguments);
        String[] stringArray = arguments.getStringArray("allowed_account_types");
        if (stringArray != null) {
            bngx = bnfi.m109237a(stringArray).mo67505b();
        } else {
            bngx = null;
        }
        this.f61110i = bngx;
        this.f61111j = arguments.getBoolean("force_account_picking");
        this.f61112k = arguments.getParcelableArrayList("valid_accounts");
        this.f61113l = arguments.getString("hosted_domain_filter");
        this.f61114m = arguments.getBundle("add_account_options");
        String string = arguments.getString("calling_package");
        bmxy.m108581a(string);
        this.f61109h = string;
        this.f61115n = arguments.getBoolean("use_particle_disc");
        this.f61117p = allr.m61234a(this.f61104b, f61103g);
        this.f61118q = allr.m61237d(this.f61104b, f61103g);
        Activity activity = getActivity();
        bmxy.m108581a(activity);
        aczc aczc = (aczc) adcj.m50161a(activity).mo3444a(aczc.class);
        this.f61108f = aczc;
        aczc.f61124e.mo2445a(this, new acys(this));
        this.f61106d = this.f61104b.getResources().getDimensionPixelSize(C0126R.dimen.identity_common_account_picker_chip_avatar_size);
        this.f61105c = new LinkedHashMap();
        this.f61116o = adyd.m51363a(this.f61104b);
        List b = mo33264b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) b.get(i);
            this.f61105c.put(account, aczd.m50038a(account.name, account.type));
        }
    }

    public final void onResume() {
        String[] strArr;
        super.onResume();
        if (!this.f61107e) {
            List b = mo33264b();
            if (!b.isEmpty()) {
                adyd a = adyd.m51363a(this.f61104b);
                if (!this.f61111j && b.size() == 1 && acyo.m50006a(this.f61104b, a, (Account) b.get(0), this.f61109h)) {
                    Account account = (Account) b.get(0);
                    mo33263a(account.name, account.type);
                }
            } else if (!soz.m35813i(this.f61104b)) {
                this.f61108f.mo33265a(new acyz(10, null));
            } else {
                adyd a2 = adyd.m51363a(this.f61104b);
                bngx bngx = this.f61110i;
                if (bngx != null) {
                    strArr = (String[]) bngx.toArray(new String[0]);
                } else {
                    strArr = null;
                }
                Set a3 = acyo.m50005a(a2, strArr);
                if (a3 == null || a3.size() != 1) {
                    this.f61107e = true;
                    mo33262a((Intent) null, 1);
                    return;
                }
                m50026a((String) a3.iterator().next());
            }
        }
    }

    /* renamed from: a */
    private final void m50026a(String str) {
        adyd.m51363a(this.f61104b).mo33913a(str, null, null, this.f61114m, null, new acyv(this));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnmt.a(java.lang.Iterable, bmxj):bnhe
     arg types: [java.util.Set, bmxj]
     candidates:
      bnmt.a(bnmk, java.lang.Object):bmxj
      bnmt.a(java.util.Map, java.lang.Object):java.lang.Object
      bnmt.a(java.util.Set, bmxj):java.util.Iterator
      bnmt.a(java.lang.Object, java.lang.Object):java.util.Map$Entry
      bnmt.a(java.util.Map, bmxj):java.util.Map
      bnmt.a(java.util.Map, bnmk):java.util.Map
      bnmt.a(java.lang.Iterable, bmxj):bnhe */
    /* renamed from: a */
    public final void mo33260a() {
        adap adap = new adap(new adzt(Looper.getMainLooper()));
        ArrayList arrayList = new ArrayList(this.f61105c.size() + 1);
        if (!this.f61105c.isEmpty()) {
            bnhe a = bnmt.m109790a((Iterable) this.f61105c.keySet(), acyw.f61095a);
            rjx rjx = this.f61118q;
            alkx alkx = new alkx();
            alkx.f73613b = false;
            bqgg a2 = adbb.m50102a(rjx.mo24710a(alkx));
            bqga.m112781a(a2, new acyy(this, a), adap);
            arrayList.add(a2);
            for (Map.Entry entry : this.f61105c.entrySet()) {
                Account account = (Account) entry.getKey();
                bqgg a3 = adbb.m50102a(this.f61117p.mo24713a(account.name, 1, this.f61115n ? 1 : 0));
                bqga.m112781a(a3, new acyx(this, account), adap);
                arrayList.add(a3);
            }
        }
        bqga.m112782b(arrayList).mo69215a(new acyt(this), adap);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo33261a(AccountManagerFuture accountManagerFuture) {
        if (accountManagerFuture != null) {
            try {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                if (intent == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("errorMessage", "error communicating with server");
                    this.f61108f.mo33265a(new acyz(-1, new Intent().putExtras(bundle)));
                    return;
                }
                this.f61107e = true;
                intent.setFlags(intent.getFlags() & -268435457);
                mo33262a(intent, 2);
            } catch (OperationCanceledException e) {
                this.f61108f.mo33265a(new acyz(0, null));
            } catch (AuthenticatorException | IOException e2) {
                f61102a.mo25417e("Authenticator returned an exception", e2, new Object[0]);
            }
        } else {
            f61102a.mo25418e("Got a null future while adding an account!", new Object[0]);
        }
    }

    /* renamed from: a */
    public final void mo33262a(Intent intent, int i) {
        String[] strArr;
        if (i == 1) {
            Activity activity = getActivity();
            bmxy.m108581a(activity);
            bngx bngx = this.f61110i;
            Intent intent2 = new Intent();
            intent2.setFlags(AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS);
            sre.m36089i(activity);
            intent2.setClassName(activity, "com.google.android.gms.common.account.AccountTypePickerActivity");
            if (bngx != null) {
                strArr = (String[]) bngx.toArray(new String[bngx.size()]);
            } else {
                strArr = null;
            }
            intent2.putExtra("allowableAccountTypes", strArr);
            intent = intent2;
        } else if (i != 2) {
            this.f61108f.mo33266a(new aczb(3, 0, this.f61105c.size()));
            intent = new Intent("android.settings.SYNC_SETTINGS");
            Activity activity2 = getActivity();
            bmxy.m108581a(activity2);
            activity2.onBackPressed();
        } else {
            this.f61108f.mo33266a(new aczb(2, 0, this.f61105c.size()));
        }
        if (intent != null) {
            startActivityForResult(intent, i);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    public final void mo33263a(String str, String str2) {
        int i = Build.VERSION.SDK_INT;
        if (!(!bnjd.m109592c((Iterable) Arrays.asList(rzx.f43912a), bmyf.m108614a(str2)) || str == null || str2 == null)) {
            Account account = new Account(str, str2);
            adyd a = adyd.m51363a(this.f61104b);
            if (a.mo33919b(account, this.f61109h) == 4) {
                a.mo33914a(account, this.f61109h, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        bundle.putBoolean("pickedFromAccountChips", true);
        this.f61108f.mo33265a(new acyz(-1, new Intent().putExtras(bundle)));
        List list = (List) this.f61108f.f61123d.mo2448b();
        if (list != null && list.size() > 0) {
            this.f61108f.mo33266a(new aczb(0, bnjd.m109601g(list, new acyu(str)), list.size()));
        }
    }
}
