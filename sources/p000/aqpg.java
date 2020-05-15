package p000;

import android.accounts.Account;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AuthAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: aqpg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpg extends aqoe implements aaai {

    /* renamed from: a */
    static final bnhe f86477a;

    /* renamed from: p */
    private static final Logger f86478p = aqom.m71875b("SignInService");

    /* renamed from: b */
    public final zzx f86479b;

    /* renamed from: c */
    public final String f86480c;

    /* renamed from: d */
    public final int f86481d;

    /* renamed from: e */
    public final Account f86482e;

    /* renamed from: f */
    public final boolean f86483f;

    /* renamed from: g */
    public final boolean f86484g;

    /* renamed from: h */
    public final String f86485h;

    /* renamed from: i */
    public final aqou f86486i;

    /* renamed from: j */
    public final String f86487j;

    /* renamed from: k */
    public final boolean f86488k;

    /* renamed from: l */
    public final String f86489l;

    /* renamed from: m */
    public rkb f86490m;

    /* renamed from: n */
    public aqkt f86491n;

    /* renamed from: o */
    public rjx f86492o;

    /* renamed from: q */
    private final aaag f86493q;

    /* renamed from: r */
    private final Set f86494r;

    /* renamed from: s */
    private final aqpc f86495s;

    /* renamed from: t */
    private final boolean f86496t;

    /* renamed from: u */
    private final AtomicReference f86497u = new AtomicReference(null);

    /* renamed from: v */
    private final AtomicReference f86498v = new AtomicReference(null);

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(aqoo.class, adbj.SIGNIN_AUTH_ACCOUNT);
        h.mo67695b(aqpe.class, adbj.SIGNIN_SIGNIN);
        h.mo67695b(aqoy.class, adbj.SIGNIN_RESOLVE_ACCOUNT);
        h.mo67695b(aqox.class, adbj.SIGNIN_RECORD_CONSENT);
        h.mo67695b(aqow.class, adbj.SIGNIN_RECORD_CONSENT_BY_CONSENT_RESULT);
        h.mo67695b(aqot.class, adbj.SIGNIN_GET_CURRENT_ACCOUNT);
        h.mo67695b(aqoz.class, adbj.SIGNIN_SAVE_DEFAULT_ACCOUNT);
        f86477a = h.mo67618b();
    }

    public aqpg(zzx zzx, String str, Set set, int i, Account account, aqkt aqkt, aaag aaag) {
        zzx zzx2 = zzx;
        String str2 = str;
        aqkt aqkt2 = aqkt;
        aaag aaag2 = aaag;
        boolean z = aqkt2.f86307b;
        boolean z2 = aqkt2.f86308c;
        String str3 = aqkt2.f86309d;
        aqpc aqpc = aqpc.f86466a;
        aqou aqou = aqou.f86436a;
        boolean z3 = aqkt2.f86310e;
        String str4 = aqkt2.f86311f;
        boolean z4 = aqkt2.f86313h;
        String str5 = aqkt2.f86312g;
        qws qws = new qws(zzx2, "IDENTITY_GMSCORE", null);
        this.f86479b = zzx2;
        this.f86480c = str2;
        this.f86494r = set;
        this.f86481d = i;
        this.f86482e = account;
        this.f86483f = z;
        this.f86484g = z2;
        this.f86485h = str3;
        this.f86493q = aaag2;
        this.f86495s = aqpc;
        this.f86486i = aqou;
        this.f86496t = z3;
        this.f86487j = str4;
        this.f86488k = z4;
        if (cgmm.m146206b()) {
            allp allp = new allp();
            allp.f73626a = 80;
            this.f86492o = allr.m61237d(zzx2, allp.mo40491a());
        } else {
            rjy rjy = new rjy(zzx2);
            rjo rjo = allr.f73629a;
            allp allp2 = new allp();
            allp2.f73626a = 80;
            rjy.mo24780a(rjo, allp2.mo40491a());
            this.f86490m = rjy.mo24784b();
        }
        this.f86491n = aqkt2;
        if (str5 == null) {
            String a = adbv.m50143a();
            this.f86489l = a;
            aqks a2 = aqks.m71765a(aqkt.mo47943a());
            a2.f86302f = a;
            this.f86491n = a2.mo47941a();
            if (cgmd.m146192b()) {
                qws.mo24333a(addd.m50199a(str2, (Scope[]) this.f86494r.toArray(new Scope[0]), this.f86491n)).mo24327b();
            }
        } else {
            this.f86489l = str5;
        }
        if (cgmd.m146192b()) {
            adbp.m50129a(aaag2, new aqpf(this, qws));
        }
        Logger Logger = f86478p;
        String valueOf = String.valueOf(this.f86489l);
        Logger.mo25412b(valueOf.length() == 0 ? new String("Log Session ID: ") : "Log Session ID: ".concat(valueOf), new Object[0]);
    }

    @Deprecated
    /* renamed from: a */
    public final void mo47997a() {
        throw new UnsupportedOperationException("onCheckServerAuthorization() is not supported.");
    }

    /* renamed from: b */
    public final Set mo48022b() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.f86494r);
        return hashSet;
    }

    @Deprecated
    /* renamed from: c */
    public final void mo48008c() {
        throw new UnsupportedOperationException("onUploadServerAuthCode() is not supported.");
    }

    /* renamed from: d */
    public final Set mo48023d() {
        return (Set) this.f86498v.get();
    }

    /* renamed from: e */
    public final Set mo48024e() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(mo48023d());
        return hashSet;
    }

    /* renamed from: f */
    public final boolean mo48025f() {
        return mo48024e().contains(GoogleSignInOptions.f10327a);
    }

    /* renamed from: g */
    public final boolean mo48026g() {
        return mo48024e().contains(GoogleSignInOptions.f10328b);
    }

    /* renamed from: h */
    public final Account mo48027h() {
        return (Account) this.f86497u.get();
    }

    /* renamed from: i */
    public final boolean mo48028i() {
        return !this.f86496t;
    }

    /* renamed from: a */
    public final void mo47998a(int i) {
        aqpc aqpc = aqpc.f86466a;
        aqpc.f86468c.mo48019a(this.f86480c, i);
    }

    /* renamed from: a */
    public final void mo47999a(int i, Account account, aqoc aqoc) {
        aqpc aqpc = aqpc.f86466a;
        String str = this.f86480c;
        aqon aqon = aqpc.f86468c;
        aqon.f86414a.logVerbose("putAccount(package_name=%s, session_id=%d)", str, Integer.valueOf(i));
        aqon.f86416c.put(str, account);
        aqoc.mo47988a(Status.f30107a);
    }

    /* renamed from: a */
    public final void mo48021a(Account account, Set set) {
        this.f86497u.set(account);
        this.f86498v.set(set);
    }

    /* renamed from: a */
    public final void mo48000a(aqoc aqoc) {
        this.f86493q.mo16658a(new aqot(this, aqoc));
    }

    /* renamed from: a */
    public final void mo48001a(AuthAccountRequest authAccountRequest, aqoc aqoc) {
        scb scb;
        Account account = authAccountRequest.f30209f;
        if (account == null) {
            IBinder iBinder = authAccountRequest.f30205b;
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof scb) {
                    scb = (scb) queryLocalInterface;
                } else {
                    scb = new sbz(iBinder);
                }
                account = rzw.m34723a(scb);
            } else {
                account = null;
            }
        }
        bmxy.m108581a(account);
        mo48021a(account, new HashSet(Arrays.asList(authAccountRequest.f30206c)));
        Integer num = authAccountRequest.f30207d;
        Integer num2 = authAccountRequest.f30208e;
        if ((num == null && num2 == null) || rfy.m33544a(this.f86479b, Binder.getCallingUid())) {
            this.f86493q.mo16658a(new aqoo(this, authAccountRequest, aqoc));
            return;
        }
        int callingUid = Binder.getCallingUid();
        StringBuilder sb = new StringBuilder(52);
        sb.append("Calling UID ");
        sb.append(callingUid);
        sb.append(" is not Google Play Services.");
        throw new SecurityException(sb.toString());
    }

    /* renamed from: a */
    public final void mo48002a(ResolveAccountRequest resolveAccountRequest, sct sct) {
        this.f86493q.mo16658a(new aqoy(this, resolveAccountRequest, sct, this.f86495s));
    }

    /* renamed from: a */
    public final void mo48003a(RecordConsentByConsentResultRequest recordConsentByConsentResultRequest, aqoc aqoc) {
        int callingUid = Binder.getCallingUid();
        if (str.m36310a(this.f86479b, callingUid)) {
            this.f86493q.mo16658a(new aqow(this, this.f86480c, recordConsentByConsentResultRequest, aqoc));
        } else {
            throw new SecurityException(String.format("Caller with uid: %s is not eligible to invoke recordConsentByConsentResult method!", Integer.valueOf(callingUid)));
        }
    }

    /* renamed from: a */
    public final void mo48004a(RecordConsentRequest recordConsentRequest, aqoc aqoc) {
        int callingUid = Binder.getCallingUid();
        if (rfy.m33544a(this.f86479b, callingUid)) {
            this.f86493q.mo16658a(new aqox(this.f86480c, this.f86481d, this.f86489l, recordConsentRequest, aqoc));
        } else {
            throw new SecurityException(String.format("Caller with uid: %s is not eligible to invoke recordConsent method!", Integer.valueOf(callingUid)));
        }
    }

    /* renamed from: a */
    public final void mo48005a(SignInRequest signInRequest, aqoc aqoc) {
        this.f86493q.mo16658a(new aqpe(this, aqoc, signInRequest, this.f86495s));
    }

    /* renamed from: a */
    public final void mo48006a(scb scb, int i, boolean z) {
        this.f86493q.mo16658a(new aqoz(this, rzw.m34723a(scb), i, z, this.f86495s));
    }

    /* renamed from: a */
    public final void mo48007a(boolean z) {
        Account account = (Account) this.f86497u.get();
        if (account == null || account.name == null) {
            Log.wtf("SignInService", "setGamesHasBeenGreeted(): account or account name was null", new Exception());
        } else {
            aqkm.m71757a(this.f86479b, account.name, this.f86480c, z);
        }
    }
}
