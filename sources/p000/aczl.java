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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: aczl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aczl extends C0053bl implements aczm {

    /* renamed from: a */
    public static final sek f61150a = new sek("CommonAccount", "AccountPickerViewModel");

    /* renamed from: k */
    private static final allq f61151k;

    /* renamed from: d */
    public final Context f61152d;

    /* renamed from: e */
    public final LinkedHashMap f61153e;

    /* renamed from: f */
    public final int f61154f;

    /* renamed from: g */
    int f61155g = 0;

    /* renamed from: h */
    public final C0034at f61156h;

    /* renamed from: i */
    public final C0034at f61157i;

    /* renamed from: j */
    public final C0034at f61158j;

    /* renamed from: l */
    private final String f61159l;

    /* renamed from: m */
    private final bngx f61160m;

    /* renamed from: n */
    private final boolean f61161n;

    /* renamed from: o */
    private final ArrayList f61162o;

    /* renamed from: p */
    private final String f61163p;

    /* renamed from: q */
    private final Bundle f61164q;

    /* renamed from: r */
    private final boolean f61165r;

    /* renamed from: s */
    private final adyd f61166s;

    /* renamed from: t */
    private final rjx f61167t;

    /* renamed from: u */
    private final rjx f61168u;

    static {
        allp allp = new allp();
        allp.f73626a = 80;
        f61151k = allp.mo40491a();
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
    public aczl(Context context, String str, boolean z, boolean z2, bngx bngx, boolean z3, ArrayList arrayList, String str2, Bundle bundle) {
        rjx a = allr.m61234a(context, f61151k);
        rjx d = allr.m61237d(context, f61151k);
        this.f61152d = context.getApplicationContext();
        this.f61160m = bngx;
        this.f61161n = z3;
        this.f61162o = arrayList;
        this.f61163p = str2;
        this.f61164q = bundle;
        this.f61159l = str;
        this.f61167t = a;
        this.f61168u = d;
        this.f61165r = z2;
        this.f61156h = new C0034at();
        this.f61157i = new adch();
        this.f61158j = new adch();
        this.f61154f = this.f61152d.getResources().getDimensionPixelSize(C0126R.dimen.identity_common_account_picker_chip_avatar_size);
        this.f61153e = new LinkedHashMap();
        this.f61166s = adyd.m51363a(this.f61152d);
        List c = mo33277c();
        int size = c.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) c.get(i);
            this.f61153e.put(account, aczd.m50038a(account.name, account.type));
        }
        if (z) {
            adap adap = new adap(new adzt(Looper.getMainLooper()));
            ArrayList arrayList2 = new ArrayList(this.f61153e.size() + 1);
            if (!this.f61153e.isEmpty()) {
                bnhe a2 = bnmt.m109790a((Iterable) this.f61153e.keySet(), aczg.f61134a);
                rjx rjx = this.f61168u;
                alkx alkx = new alkx();
                alkx.f73613b = false;
                bqgg a3 = adbb.m50102a(rjx.mo24710a(alkx));
                bqga.m112781a(a3, new aczi(this, a2), adap);
                arrayList2.add(a3);
                for (Map.Entry entry : this.f61153e.entrySet()) {
                    Account account2 = (Account) entry.getKey();
                    bqgg a4 = adbb.m50102a(this.f61167t.mo24713a(account2.name, 1, this.f61165r ? 1 : 0));
                    bqga.m112781a(a4, new aczh(this, account2), adap);
                    arrayList2.add(a4);
                }
            }
            bqga.m112782b(arrayList2).mo69215a(new aczf(this), adap);
        }
    }

    /* renamed from: a */
    private final void m50045a(String str) {
        adyd.m51363a(this.f61152d).mo33913a(str, null, null, this.f61164q, null, new acze(this));
    }

    /* renamed from: b */
    public final void mo33276b() {
        String[] strArr;
        if (this.f61155g == 0) {
            List c = mo33277c();
            if (!c.isEmpty()) {
                adyd a = adyd.m51363a(this.f61152d);
                if (!this.f61161n && c.size() == 1 && acyo.m50006a(this.f61152d, a, (Account) c.get(0), this.f61159l)) {
                    Account account = (Account) c.get(0);
                    m50046a(account.name, account.type);
                }
            } else if (!soz.m35813i(this.f61152d)) {
                this.f61157i.mo2453l(new aczk(10, null));
            } else {
                adyd a2 = adyd.m51363a(this.f61152d);
                bngx bngx = this.f61160m;
                if (bngx != null) {
                    strArr = (String[]) bngx.toArray(new String[bngx.size()]);
                } else {
                    strArr = null;
                }
                Set a3 = acyo.m50005a(a2, strArr);
                if (a3 == null || a3.size() != 1) {
                    this.f61155g = 1;
                    this.f61158j.mo2453l(new aczk(1, null));
                    return;
                }
                m50045a((String) a3.iterator().next());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo33277c() {
        String[] strArr;
        adyd adyd = this.f61166s;
        bngx bngx = this.f61160m;
        if (bngx != null) {
            strArr = (String[]) bngx.toArray(new String[bngx.size()]);
        } else {
            strArr = null;
        }
        ArrayList a = acyo.m50004a(adyd, strArr, this.f61162o, this.f61159l);
        String str = this.f61163p;
        return (a.isEmpty() || TextUtils.isEmpty(str)) ? a : soz.m35785a(a, str);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.c(java.lang.Iterable, bmxz):boolean
     arg types: [java.util.List, bmxz]
     candidates:
      bnjd.c(java.lang.Iterable, int):java.lang.Iterable
      bnjd.c(java.lang.Iterable, java.lang.Object):java.lang.Object
      bnjd.c(java.lang.Iterable, bmxz):boolean */
    /* renamed from: a */
    private final void m50046a(String str, String str2) {
        int i = Build.VERSION.SDK_INT;
        if (!(!bnjd.m109592c((Iterable) Arrays.asList(rzx.f43912a), bmyf.m108614a(str2)) || str == null || str2 == null)) {
            Account account = new Account(str, str2);
            adyd a = adyd.m51363a(this.f61152d);
            if (a.mo33919b(account, this.f61159l) == 4) {
                a.mo33914a(account, this.f61159l, 2);
            }
        }
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putString("accountType", str2);
        bundle.putBoolean("pickedFromAccountChips", true);
        this.f61157i.mo2453l(new aczk(-1, new Intent().putExtras(bundle)));
    }

    /* renamed from: a */
    public final void mo33273a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f61153e.values());
        this.f61156h.mo2453l(arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066  */
    /* renamed from: a */
    public final void mo33274a(int i, int i2, Intent intent) {
        String stringExtra;
        String str;
        String str2;
        Account account;
        this.f61155g = 0;
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
                            if (!this.f61153e.isEmpty()) {
                                List c = mo33277c();
                                int size = c.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size) {
                                        break;
                                    }
                                    account = (Account) c.get(i3);
                                    i3++;
                                    if (!this.f61153e.containsKey(account)) {
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
                            m50046a(str2, str);
                            return;
                        }
                    }
                } else if (intent == null || (stringExtra = intent.getStringExtra("accountType")) == null) {
                    f61150a.mo25412b("Unable to find account type, pretending the request was canceled", new Object[0]);
                } else {
                    m50045a(stringExtra);
                    return;
                }
                f61150a.mo25412b("Unable to find added account, pretending the request was canceled", new Object[0]);
            }
            f61150a.mo25409a("Canceled", new Object[0]);
            this.f61157i.mo2453l(new aczk(0, null));
        } else if (mo33277c().isEmpty()) {
            this.f61157i.mo2453l(new aczk(0, null));
        }
    }

    /* renamed from: a */
    public final void mo12331a(aczd aczd) {
        int i = aczd.f61127a;
        if (i == 0) {
            m50046a(aczd.f61129c, aczd.f61128b);
        } else if (i == 2) {
            this.f61155g = 1;
            this.f61158j.mo2453l(new aczk(1, null));
        } else if (i == 3) {
            this.f61155g = 3;
            this.f61158j.mo2453l(new aczk(3, null));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo33275a(AccountManagerFuture accountManagerFuture) {
        if (accountManagerFuture != null) {
            try {
                Intent intent = (Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent");
                if (intent == null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("errorMessage", "error communicating with server");
                    this.f61157i.mo2453l(new aczk(-1, new Intent().putExtras(bundle)));
                    return;
                }
                this.f61155g = 2;
                intent.setFlags(intent.getFlags() & -268435457);
                this.f61158j.mo2453l(new aczk(2, intent));
            } catch (OperationCanceledException e) {
                this.f61157i.mo2453l(new aczk(0, null));
            } catch (AuthenticatorException | IOException e2) {
                f61150a.mo25417e("Authenticator returned an exception", e2, new Object[0]);
            }
        } else {
            f61150a.mo25418e("Got a null future while adding an account!", new Object[0]);
        }
    }
}
