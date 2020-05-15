package p000;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PermissionInfo;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Messenger;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.account.p016be.CreateBootstrapAssertionIntentOperation;
import com.google.android.gms.auth.firstparty.dataservice.AccountSignInRequest;
import com.google.android.gms.auth.firstparty.dataservice.ConfirmCredentialsRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.AccountCredentials;
import com.google.android.gms.auth.firstparty.shared.AppDescription;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.smartdevice.setup.accounts.ExchangeAssertionsForUserCredentialsRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: gkd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkd extends AbstractAccountAuthenticator {

    /* renamed from: a */
    public static final Logger f18373a = new Logger("GLSActivity", "GmsAccountAuthenticatorImpl");

    /* renamed from: c */
    public static final Semaphore f18374c = new Semaphore(0);

    /* renamed from: b */
    public ExchangeAssertionsForUserCredentialsRequest f18375b = null;

    /* renamed from: d */
    private final Context f18376d;

    /* renamed from: e */
    private final gkf f18377e;

    /* renamed from: f */
    private final goa f18378f;

    /* renamed from: g */
    private final iws f18379g;

    /* renamed from: h */
    private final gjy f18380h;

    /* renamed from: i */
    private final glh f18381i;

    /* renamed from: j */
    private final ily f18382j;

    /* renamed from: k */
    private final ilm f18383k;

    /* renamed from: l */
    private final jyj f18384l;

    /* renamed from: m */
    private final ddx f18385m;

    /* renamed from: n */
    private final gjo f18386n;

    /* JADX WARNING: Illegal instructions before constructor call */
    public gkd(Context context) {
        super(r0);
        Context applicationContext = context.getApplicationContext();
        gkf gkf = gkf.f18388a;
        goa goa = (goa) goa.f18759a.mo13145b();
        ixl ixl = new ixl(context);
        gjy gjy = new gjy(context);
        glh a = glh.m13369a(context);
        ily ily = (ily) ily.f21320d.mo13145b();
        ilm ilm = (ilm) ilm.f21294d.mo13145b();
        gjo gjo = new gjo(context);
        ddx ddx = new ddx(context);
        jyj jyj = new jyj(context);
        sdo.m34959a(applicationContext);
        this.f18376d = applicationContext;
        sdo.m34959a(gkf);
        this.f18377e = gkf;
        sdo.m34959a(goa);
        this.f18378f = goa;
        sdo.m34959a(ixl);
        this.f18379g = ixl;
        sdo.m34959a(gjy);
        this.f18380h = gjy;
        sdo.m34959a(a);
        this.f18381i = a;
        sdo.m34959a(ily);
        this.f18382j = ily;
        sdo.m34959a(ilm);
        this.f18383k = ilm;
        sdo.m34959a(gjo);
        this.f18386n = gjo;
        sdo.m34959a(ddx);
        this.f18385m = ddx;
        sdo.m34959a(jyj);
        this.f18384l = jyj;
    }

    /* renamed from: a */
    private final AppDescription m13319a() {
        ilq ilq = new ilq(this.f18376d);
        String uuid = UUID.randomUUID().toString();
        return new AppDescription(ilq.packageName, ilq.appUid, uuid, uuid);
    }

    public final Bundle addAccount(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        boolean z;
        ManagedAuthOptions managedAuthOptions;
        String str3 = str;
        Bundle bundle2 = bundle;
        sdo.m34959a(bundle);
        if ("com.google.work".equals(str3)) {
            int i = bundle2.getInt(gie.f18285a, 0);
            if (!this.f18382j.mo13130a(i)) {
                f18373a.mo25414c(String.format("uid %s cannot manage add accounts of type: %s", Integer.valueOf(i), str3), new Object[0]);
                Intent className = new Intent().setClassName(this.f18376d, "com.google.android.gms.auth.uiflows.addaccount.CantAddWorkAccountActivity");
                gjz a = gjz.m13308a();
                a.mo11959a(this.f18376d, className);
                return a.mo11962b();
            }
        }
        AppDescription a2 = m13319a();
        boolean z2 = bundle2.getBoolean("setupWizard", bundle2.getBoolean("firstRun", false));
        boolean z3 = bundle2.getBoolean("useImmersiveMode", false);
        boolean z4 = bundle2.getBoolean("suppress_device_to_device_setup", false);
        String string = bundle2.getString("authAccount");
        String string2 = bundle2.getString("purchaser_gaia_email");
        String string3 = bundle2.getString("purchaser_name");
        String[] stringArray = bundle2.getStringArray("allowed_domains");
        String string4 = bundle2.getString("minute_maid_login_template");
        boolean z5 = bundle2.getBoolean("resolve_frp_only", false);
        boolean z6 = bundle2.getBoolean("suppress_google_services");
        boolean z7 = bundle2.getBoolean("suppress_account_provisioning", false);
        boolean z8 = bundle2.getBoolean("suppress_backup_opt_in", false);
        ManagedAuthOptions a3 = ManagedAuthOptions.m6596a(bundle2.getByteArray("managed_auth_options"));
        if (!z2) {
            managedAuthOptions = a3;
            z = z8;
        } else {
            if (stringArray != null) {
                managedAuthOptions = a3;
                if (stringArray.length > 0) {
                    z = z8;
                    this.f18386n.mo11943a(new HashSet(Arrays.asList(stringArray)));
                }
            } else {
                managedAuthOptions = a3;
            }
            z = z8;
        }
        String string5 = bundle2.getString("password");
        if (!TextUtils.isEmpty(string5)) {
            AccountSignInRequest accountSignInRequest = new AccountSignInRequest();
            accountSignInRequest.f10594d = z2;
            accountSignInRequest.f10593c = bundle2.getBoolean("created", false);
            accountSignInRequest.f10592b = a2;
            AccountCredentials accountCredentials = new AccountCredentials(str3);
            accountCredentials.f10828b = bundle2.getBoolean("useBrowser");
            if (string5.startsWith("code:")) {
                accountCredentials.f10831e = string5.substring(5);
            } else {
                String string6 = bundle2.getString("username");
                accountCredentials.f10829c = string6;
                Collection<String> a4 = this.f18386n.mo11942a();
                if (a4 != null) {
                    for (String str4 : a4) {
                        String valueOf = String.valueOf(str4);
                        if (string6.endsWith(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf))) {
                        }
                    }
                    gjz a5 = gjz.m13308a();
                    a5.mo11955a(8, "Domain not allowed");
                    return a5.mo11962b();
                }
                if (soz.m35796b(this.f18376d, new Account(string6, str3), this.f18376d.getPackageName())) {
                    gjz a6 = gjz.m13308a();
                    a6.mo11955a(8, "Account does not exist or not visible. Maybe change pwd?");
                    return a6.mo11962b();
                } else if (string5.startsWith("oauth1:")) {
                    accountCredentials.f10830d = string5.substring(7);
                } else {
                    accountCredentials.f10832f = string5;
                }
            }
            accountSignInRequest.f10596f = accountCredentials;
            TokenResponse a7 = this.f18379g.mo13418a(accountSignInRequest);
            if (a7.mo7647b() == izj.SUCCESS) {
                gjz a8 = gjz.m13308a();
                a8.mo11956a(a7.f10744u);
                return a8.mo11962b();
            }
            gjz a9 = gjz.m13308a();
            String valueOf2 = String.valueOf(a7.mo7647b());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 27);
            sb.append("Sign in failed with status ");
            sb.append(valueOf2);
            a9.mo11955a(8, sb.toString());
            return a9.mo11962b();
        }
        boolean z9 = bundle2.getBoolean("hasMultipleUsers", false);
        gjy gjy = this.f18380h;
        SetupAccountWorkflowRequest setupAccountWorkflowRequest = new SetupAccountWorkflowRequest(a2, str3);
        setupAccountWorkflowRequest.f10789i = accountAuthenticatorResponse;
        Collection a10 = this.f18386n.mo11942a();
        if (a10 != null) {
            setupAccountWorkflowRequest.f10784d = new ArrayList(a10);
        } else {
            setupAccountWorkflowRequest.f10784d = null;
        }
        setupAccountWorkflowRequest.f10783c = z2;
        setupAccountWorkflowRequest.f10791k = z3;
        setupAccountWorkflowRequest.f10790j = z4;
        setupAccountWorkflowRequest.f10794n = string;
        setupAccountWorkflowRequest.f10792l = string2;
        setupAccountWorkflowRequest.f10793m = string3;
        setupAccountWorkflowRequest.f10782b = z9;
        setupAccountWorkflowRequest.f10785e.clear();
        if (bundle2 != null) {
            setupAccountWorkflowRequest.f10785e.putAll(bundle2);
        }
        setupAccountWorkflowRequest.f10795o = string4;
        setupAccountWorkflowRequest.f10796p = z5;
        setupAccountWorkflowRequest.f10797q = z6;
        setupAccountWorkflowRequest.f10798r = z7;
        setupAccountWorkflowRequest.f10799s = z;
        setupAccountWorkflowRequest.f10800t = managedAuthOptions;
        PendingIntent a11 = gjy.mo11948a(setupAccountWorkflowRequest);
        gjz a12 = gjz.m13308a();
        a12.mo11957a(a11);
        return a12.mo11962b();
    }

    public final Bundle addAccountFromCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        f18373a.mo25414c("addAccountFromCredentials: %s", Logger.m35081a(account));
        this.f18383k.mo13119a();
        if (((Boolean) ((ixl) this.f18379g).mo13426a(new iwz(account.name, bundle))).booleanValue()) {
            f18373a.mo25412b("addAccountFromCredentials: account add successful", new Object[0]);
            this.f18383k.mo13120b();
            gjz a = gjz.m13308a();
            a.mo11961a(true);
            return a.mo11962b();
        }
        f18373a.mo25418e("addAccountFromCredentials: account add failed", new Object[0]);
        gjz a2 = gjz.m13308a();
        a2.mo11961a(false);
        return a2.mo11962b();
    }

    public final Bundle confirmCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, Bundle bundle) {
        String str;
        boolean z = true;
        f18373a.mo25414c("confirmCredentials invoked for account: %s", Logger.m35081a(account));
        if (bundle == null || !bundle.containsKey("password")) {
            ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest = new ConfirmCredentialsWorkflowRequest();
            confirmCredentialsWorkflowRequest.f10775f = accountAuthenticatorResponse;
            confirmCredentialsWorkflowRequest.f10772c = m13319a();
            if (account != null) {
                str = account.name;
            } else {
                str = null;
            }
            confirmCredentialsWorkflowRequest.f10771b = str;
            confirmCredentialsWorkflowRequest.f10774e = account;
            confirmCredentialsWorkflowRequest.f10773d.clear();
            if (bundle != null) {
                confirmCredentialsWorkflowRequest.f10773d.putAll(bundle);
            }
            PendingIntent a = this.f18380h.mo11946a(confirmCredentialsWorkflowRequest);
            gjz a2 = gjz.m13308a();
            a2.mo11958a(this.f18376d, a, accountAuthenticatorResponse, Arrays.asList("booleanResult", "accountType", "retry"));
            return a2.mo11962b();
        }
        String string = bundle.getString("password");
        AccountCredentials accountCredentials = new AccountCredentials(account);
        accountCredentials.f10832f = string;
        ConfirmCredentialsRequest confirmCredentialsRequest = new ConfirmCredentialsRequest();
        confirmCredentialsRequest.f10613b = accountCredentials;
        TokenResponse a3 = this.f18379g.mo13419a(confirmCredentialsRequest);
        gjz a4 = gjz.m13308a();
        if (izj.SUCCESS != a3.mo7647b()) {
            z = false;
        }
        a4.mo11961a(z);
        return a4.mo11962b();
    }

    public final Bundle editProperties(AccountAuthenticatorResponse accountAuthenticatorResponse, String str) {
        throw new UnsupportedOperationException();
    }

    public final Bundle finishSession(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, Bundle bundle) {
        sdo.m34959a(bundle);
        AppDescription a = m13319a();
        gjy gjy = this.f18380h;
        FinishSessionWorkflowRequest finishSessionWorkflowRequest = new FinishSessionWorkflowRequest(1, bundle, a, str, null);
        finishSessionWorkflowRequest.f10779d = accountAuthenticatorResponse;
        PendingIntent a2 = gjy.mo11947a(finishSessionWorkflowRequest);
        gjz a3 = gjz.m13308a();
        a3.mo11958a(this.f18376d, a2, accountAuthenticatorResponse, Arrays.asList("booleanResult", "accountType", "authAccount", "accountStatusToken", "retry"));
        return a3.mo11962b();
    }

    public final Bundle getAccountCredentialsForCloning(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        f18373a.mo25414c("getAccountCredentialsForCloning, account: %s", Logger.m35081a(account));
        Bundle bundle = (Bundle) ((ixl) this.f18379g).mo13426a(new iwy(account.name));
        if (bundle == null) {
            f18373a.mo25418e("getAccountCredentialsForCloning: Bundle was null", new Object[0]);
            gjz a = gjz.m13308a();
            a.mo11961a(false);
            return a.mo11962b();
        }
        if (gnv.m13530ac()) {
            f18373a.mo25412b("Using new partial bootstrap flow", new Object[0]);
            Bundle bundle2 = new Bundle();
            Intent startIntent = IntentOperation.getStartIntent(this.f18376d, CreateBootstrapAssertionIntentOperation.class, "com.google.android.gms.auth.account.be.create_bootstrap_assertion");
            startIntent.putExtra("bootstrapAccount", account);
            startIntent.putExtra("messenger", new Messenger(new gkc(this, Looper.getMainLooper())));
            this.f18376d.startService(startIntent);
            try {
                f18374c.tryAcquire(1, TimeUnit.MINUTES);
            } catch (InterruptedException e) {
                f18373a.mo25417e("Error waiting for count down", e, new Object[0]);
            }
            if (this.f18375b != null) {
                f18373a.mo25412b("Successful assertion creation for partial bootstrap", new Object[0]);
                bundle2.putByteArray("partialBootstrapAssertion", sef.m35074a(this.f18375b));
            } else {
                f18373a.mo25418e("No assertion returned for partial bootstrap", new Object[0]);
                bundle2 = null;
            }
            if (bundle2 != null) {
                bundle.putBundle("bootstrapBundle", bundle2);
            }
        }
        gjz a2 = gjz.m13308a();
        a2.mo11961a(true);
        a2.f18370a.putAll(bundle);
        return a2.mo11962b();
    }

    /* JADX INFO: finally extract failed */
    public final Bundle getAccountRemovalAllowed(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account) {
        List<String> list;
        boolean z;
        gjo gjo = this.f18386n;
        String str = account.name;
        int i = Build.VERSION.SDK_INT;
        String[] stringArray = gjo.f18355a.getApplicationRestrictions(gjo.f18356b).getStringArray("auth_account:disallow_account_removal_for_domains");
        if (stringArray == null) {
            list = Collections.emptyList();
        } else {
            list = Collections.unmodifiableList(Arrays.asList(stringArray));
        }
        for (String str2 : list) {
            String valueOf = String.valueOf(str2);
            if (str.endsWith(valueOf.length() == 0 ? new String("@") : "@".concat(valueOf))) {
                gjz a = gjz.m13308a();
                a.mo11961a(false);
                return a.mo11962b();
            }
        }
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (!this.f18377e.mo11980a(this.f18376d) && ((KeyguardManager) this.f18376d.getSystemService("keyguard")).isKeyguardSecure()) {
                Context context = this.f18376d;
                if (soz.m35801d(context, context.getPackageName()).size() == 1 && this.f18381i.mo12014e() == null && this.f18381i.mo12009a()) {
                    glh glh = this.f18381i;
                    if ("com.google".equals(account.type)) {
                        if (TextUtils.isEmpty(glh.mo12011b(account.name))) {
                            z = false;
                        } else {
                            z = true;
                        }
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        int i3 = Build.VERSION.SDK_INT;
                        if (rrk.m34290a(this.f18376d, account) == null && !z) {
                            gjz a2 = gjz.m13308a();
                            a2.mo11961a(true);
                            return a2.mo11962b();
                        }
                        PendingIntent a3 = this.f18380h.mo11945a(new AccountRemovalAllowedWorkflowRequest(accountAuthenticatorResponse, account, z));
                        gjz a4 = gjz.m13308a();
                        a4.mo11958a(this.f18376d, a3, accountAuthenticatorResponse, Arrays.asList("booleanResult", "retry"));
                        return a4.mo11962b();
                    }
                }
            }
            z = false;
            Binder.restoreCallingIdentity(clearCallingIdentity);
            int i32 = Build.VERSION.SDK_INT;
            if (rrk.m34290a(this.f18376d, account) == null) {
                gjz a22 = gjz.m13308a();
                a22.mo11961a(true);
                return a22.mo11962b();
            }
            PendingIntent a32 = this.f18380h.mo11945a(new AccountRemovalAllowedWorkflowRequest(accountAuthenticatorResponse, account, z));
            gjz a42 = gjz.m13308a();
            a42.mo11958a(this.f18376d, a32, accountAuthenticatorResponse, Arrays.asList("booleanResult", "retry"));
            return a42.mo11962b();
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sdo.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      sdo.a(int, java.lang.Object):void
      sdo.a(android.os.Handler, java.lang.String):void
      sdo.a(java.lang.Object, java.lang.Object):void
      sdo.a(java.lang.String, android.content.ContentValues):void
      sdo.a(boolean, java.lang.Object):void
      sdo.a(java.lang.String, java.lang.Object):void */
    public final Bundle getAuthToken(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        Bundle b;
        sdo.m34969a(str, (Object) "authTokenType cannot be empty.");
        sdo.m34975b(bundle != null && !bundle.isEmpty(), "loginOptions cannot be null or empty.");
        sdo.checkIfNull(account, "Account cannot be null.");
        sdo.m34969a(account.name, (Object) "Account name cannot be empty");
        if (sqc.m35963b(gik.f18295c, account.type)) {
            Context context = this.f18376d;
            bundle.putParcelable("accountManagerResponse", accountAuthenticatorResponse);
            bundle.putString("_opt_is_called_from_account_manager", "1");
            bundle.putBoolean("handle_notification", bundle.getBoolean("notifyOnAuthFailure", false));
            String str2 = context.getApplicationInfo().packageName;
            bundle.putString("clientPackageName", str2);
            if (TextUtils.isEmpty(bundle.getString(gik.f18297e))) {
                bundle.putString(gik.f18297e, str2);
            }
            bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
            long clearCallingIdentity = Binder.clearCallingIdentity();
            if (cbyz.f178573a.mo6606a().mo75621b()) {
                try {
                    Bundle a = this.f18385m.mo8546a(account, str, bundle);
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    TokenData a2 = TokenData.m6261a(a, "tokenDetails");
                    if (a2 == null) {
                        String string = a.getString("Error");
                        izj c = izj.m16369c(string);
                        gjz a3 = gjz.m13308a();
                        if (izj.m16367a(c)) {
                            a3.mo11959a(this.f18376d, (Intent) a.getParcelable("userRecoveryIntent"));
                            Logger Logger = f18373a;
                            String valueOf = String.valueOf(string);
                            Logger.mo25416d(valueOf.length() == 0 ? new String("Recoverable error: ") : "Recoverable error: ".concat(valueOf), new Object[0]);
                        } else if (izj.m16368b(c)) {
                            a3.mo11955a(3, string);
                            Logger logger2 = f18373a;
                            String valueOf2 = String.valueOf(string);
                            logger2.mo25416d(valueOf2.length() == 0 ? new String("Retryable error: ") : "Retryable error: ".concat(valueOf2), new Object[0]);
                        } else {
                            a3.mo11955a(5, string);
                            Logger logger3 = f18373a;
                            String valueOf3 = String.valueOf(string);
                            logger3.mo25416d(valueOf3.length() == 0 ? new String("Invalid response error: ") : "Invalid response error: ".concat(valueOf3), new Object[0]);
                        }
                        return a3.mo11962b();
                    }
                    gjz a4 = gjz.m13308a();
                    a4.mo11956a(account);
                    a4.mo11960a(a2);
                    return a4.mo11962b();
                } catch (Throwable th) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th;
                }
            } else {
                try {
                    Bundle a5 = this.f18385m.mo8546a(account, str, bundle);
                    TokenData a6 = TokenData.m6261a(a5, "tokenDetails");
                    if (a6 != null) {
                        sdo.checkIfNull(a6, "null tokenData is not expected here as it should have triggered exceptions above.");
                        gjz a7 = gjz.m13308a();
                        a7.mo11956a(account);
                        a7.mo11960a(a6);
                        b = a7.mo11962b();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        return b;
                    }
                    String string2 = a5.getString("Error");
                    izj c2 = izj.m16369c(string2);
                    if (izj.m16367a(c2)) {
                        throw new UserRecoverableAuthException(string2, (Intent) a5.getParcelable("userRecoveryIntent"));
                    } else if (izj.m16368b(c2)) {
                        throw new IOException(string2);
                    } else {
                        throw new gid(string2);
                    }
                } catch (UserRecoverableAuthException e) {
                    f18373a.mo25410a((Throwable) e);
                    gjz a8 = gjz.m13308a();
                    a8.mo11959a(this.f18376d, e.mo7366a());
                    b = a8.mo11962b();
                } catch (IOException e2) {
                    f18373a.mo25410a((Throwable) e2);
                    gjz a9 = gjz.m13308a();
                    a9.mo11955a(3, e2.getMessage());
                    b = a9.mo11962b();
                } catch (gid e3) {
                    f18373a.mo25410a((Throwable) e3);
                    gjz a10 = gjz.m13308a();
                    a10.mo11955a(5, e3.getMessage());
                    b = a10.mo11962b();
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                    throw th2;
                }
            }
        } else {
            throw new IllegalArgumentException("Account type not supported.");
        }
    }

    public final String getAuthTokenLabel(String str) {
        CharSequence text;
        Context context = this.f18376d;
        f18373a.mo25416d("getAuthTokenLabel: %s", str);
        String str2 = null;
        if (!str.startsWith("oauth:")) {
            try {
                String valueOf = String.valueOf(str);
                String str3 = valueOf.length() == 0 ? new String("com.google.android.googleapps.permission.GOOGLE_AUTH.") : "com.google.android.googleapps.permission.GOOGLE_AUTH.".concat(valueOf);
                PackageManager packageManager = context.getPackageManager();
                PermissionInfo permissionInfo = packageManager.getPermissionInfo(str3, 0);
                if (permissionInfo.labelRes != 0 && (text = packageManager.getText(permissionInfo.packageName, permissionInfo.labelRes, null)) != null) {
                    str2 = text.toString();
                } else if (permissionInfo.nonLocalizedLabel != null) {
                    str2 = permissionInfo.nonLocalizedLabel.toString();
                } else if (permissionInfo.name != null) {
                    str2 = permissionInfo.name;
                }
            } catch (PackageManager.NameNotFoundException e) {
            }
        }
        return str2 != null ? str2 : str;
    }

    public final Bundle hasFeatures(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String[] strArr) {
        gky gky = new gky(this.f18376d);
        boolean z = true;
        if (strArr != null) {
            Set set = (Set) this.f18378f.mo12090a(account, gqd.f18812f);
            bxvd da = boex.f132861e.mo74144da();
            if (set != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boex boex = (boex) da.f164949b;
                boex.f132863a |= 1;
                boex.f132864b = false;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boex boex2 = (boex) da.f164949b;
                boex2.f132863a |= 1;
                boex2.f132864b = true;
                long nanoTime = System.nanoTime();
                shr.m35313a(1025, Binder.getCallingUid());
                gky.mo12003a(account);
                shr.m35312a();
                f18373a.mo25412b("Synced services for account.", new Object[0]);
                set = (Set) this.f18378f.mo12090a(account, gqd.f18812f);
                long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                boex boex3 = (boex) da.f164949b;
                int i = boex3.f132863a | 4;
                boex3.f132863a = i;
                boex3.f132866d = millis;
                boolean z2 = set != null;
                boex3.f132863a = i | 2;
                boex3.f132865c = z2;
            }
            if (cbzc.f178579a.mo6606a().mo75626b()) {
                Random random = new Random();
                long a = spn.getAndroidId(this.f18376d);
                if (a != 0) {
                    random.setSeed(a);
                }
                if (random.nextDouble() < cbzc.f178579a.mo6606a().mo75625a()) {
                    jyj jyj = this.f18384l;
                    bxvd da2 = boct.f132600I.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boct boct = (boct) da2.f164949b;
                    boct.f132612c = 42;
                    boct.f132610a |= 1;
                    bxvd da3 = boey.f132867d.mo74144da();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    boey boey = (boey) da3.f164949b;
                    boey.f132870b = 4;
                    boey.f132869a |= 2;
                    boex boex4 = (boex) da.mo74062i();
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    boey boey2 = (boey) da3.f164949b;
                    boex4.getClass();
                    boey2.f132871c = boex4;
                    boey2.f132869a |= 8;
                    boey boey3 = (boey) da3.mo74062i();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    boct boct2 = (boct) da2.f164949b;
                    boey3.getClass();
                    boct2.f132603B = boey3;
                    boct2.f132611b |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                    jyj.mo14225b((boct) da2.mo74062i());
                }
            }
            if (set != null) {
                int length = strArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    String str = strArr[i2];
                    if (str.startsWith("service_")) {
                        if (!set.contains(str.substring(8))) {
                            z = false;
                            break;
                        }
                    } else if (!set.contains(str)) {
                        z = false;
                        break;
                    }
                    i2++;
                }
            } else {
                f18373a.mo25416d("Services not available!", new Object[0]);
                z = false;
            }
        } else {
            z = false;
        }
        gjz a2 = gjz.m13308a();
        a2.mo11961a(z);
        return a2.mo11962b();
    }

    public final Bundle isCredentialsUpdateSuggested(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str) {
        boolean booleanValue = ((Boolean) ((ixl) this.f18379g).mo13426a(new ixj(str))).booleanValue();
        gjz a = gjz.m13308a();
        a.mo11961a(!booleanValue);
        return a.mo11962b();
    }

    public final Bundle startAddAccountSession(AccountAuthenticatorResponse accountAuthenticatorResponse, String str, String str2, String[] strArr, Bundle bundle) {
        AccountAuthenticatorResponse accountAuthenticatorResponse2 = accountAuthenticatorResponse;
        Bundle bundle2 = bundle;
        sdo.m34959a(bundle);
        AppDescription a = m13319a();
        String[] stringArray = bundle2.getStringArray("allowed_domains");
        if (stringArray != null && stringArray.length > 0) {
            this.f18386n.mo11943a(new HashSet(Arrays.asList(stringArray)));
        }
        boolean z = bundle2.getBoolean("useImmersiveMode", false);
        boolean z2 = bundle2.getBoolean("setupWizard", bundle2.getBoolean("firstRun", false));
        String string = bundle2.getString("purchaser_gaia_email");
        String string2 = bundle2.getString("purchaser_name");
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest = r9;
        gjy gjy = this.f18380h;
        String str3 = string2;
        String str4 = string;
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest2 = new StartAddAccountSessionWorkflowRequest(1, null, new Bundle(), a, str, null, false, false, null, null);
        startAddAccountSessionWorkflowRequest.f10806f = accountAuthenticatorResponse2;
        startAddAccountSessionWorkflowRequest.f10807g = z2;
        startAddAccountSessionWorkflowRequest.f10808h = z;
        Collection a2 = this.f18386n.mo11942a();
        if (a2 != null) {
            startAddAccountSessionWorkflowRequest.f10802b = new ArrayList(a2);
        } else {
            startAddAccountSessionWorkflowRequest.f10802b = null;
        }
        startAddAccountSessionWorkflowRequest.f10809i = str4;
        startAddAccountSessionWorkflowRequest.f10810j = str3;
        startAddAccountSessionWorkflowRequest.f10803c.clear();
        Bundle bundle3 = bundle;
        if (bundle3 != null) {
            startAddAccountSessionWorkflowRequest.f10803c.putAll(bundle3);
        }
        PendingIntent a3 = gjy.mo11949a(startAddAccountSessionWorkflowRequest);
        gjz a4 = gjz.m13308a();
        a4.mo11958a(this.f18376d, a3, accountAuthenticatorResponse2, Arrays.asList("booleanResult", "accountSessionBundle", "authAccount", "password", "accountStatusToken", "retry"));
        return a4.mo11962b();
    }

    public final Bundle startUpdateCredentialsSession(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        sdo.m34959a(bundle);
        UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = new UpdateCredentialsWorkflowRequest();
        updateCredentialsWorkflowRequest.mo7671a(account);
        updateCredentialsWorkflowRequest.mo7672a(bundle);
        updateCredentialsWorkflowRequest.f10823c = m13319a();
        PendingIntent a = this.f18380h.mo11951a(updateCredentialsWorkflowRequest);
        gjz a2 = gjz.m13308a();
        a2.mo11958a(this.f18376d, a, accountAuthenticatorResponse, Arrays.asList("booleanResult", "accountSessionBundle", "password", "accountStatusToken", "retry"));
        return a2.mo11962b();
    }

    public final Bundle updateCredentials(AccountAuthenticatorResponse accountAuthenticatorResponse, Account account, String str, Bundle bundle) {
        f18373a.mo25414c("updateCredentials invoked for account: %s", Logger.m35081a(account));
        UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest = new UpdateCredentialsWorkflowRequest();
        updateCredentialsWorkflowRequest.mo7671a(account);
        updateCredentialsWorkflowRequest.mo7672a(bundle);
        updateCredentialsWorkflowRequest.f10823c = m13319a();
        PendingIntent b = this.f18380h.mo11954b(updateCredentialsWorkflowRequest);
        gjz a = gjz.m13308a();
        a.mo11958a(this.f18376d, b, accountAuthenticatorResponse, Arrays.asList("booleanResult", "accountType", "retry"));
        return a.mo11962b();
    }
}
