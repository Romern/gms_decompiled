package p000;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.provider.Settings;
import com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateChimeraService;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountIntroChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.BrowserSignInChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.FinishSessionChimeraActivity;
import com.google.android.gms.auth.uiflows.addaccount.StartAddAccountSessionController;
import com.google.android.gms.auth.uiflows.confirmcredentials.ConfirmCredentialsController;
import com.google.android.gms.auth.uiflows.controller.ControllerLauncherChimeraActivity;
import com.google.android.gms.auth.uiflows.gettoken.GetTokenController;
import com.google.android.gms.auth.uiflows.updatecredentials.UpdateCredentialsController;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: iyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class iyn extends dck implements iyo {

    /* renamed from: a */
    public final Context f21934a;

    /* renamed from: b */
    private final boolean f21935b;

    /* renamed from: c */
    private final goa f21936c;

    public iyn() {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
    }

    /* renamed from: a */
    private final PendingIntent m16338a(Intent intent, String str) {
        String valueOf = String.valueOf(str);
        intent.addCategory(valueOf.length() == 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf));
        return PendingIntent.getActivity(this.f21934a, 0, intent, 0);
    }

    /* renamed from: b */
    public final PendingIntent mo11954b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        if (this.f21935b) {
            return m16338a(ControllerLauncherChimeraActivity.m7062a(this.f21934a, new UpdateCredentialsController(updateCredentialsWorkflowRequest.f10826f, updateCredentialsWorkflowRequest.f10825e, rrq.m34308a(updateCredentialsWorkflowRequest.mo7670a()), false)), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    public iyn(Context context) {
        super("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
        this.f21934a = context;
        int i = Build.VERSION.SDK_INT;
        this.f21935b = true;
        this.f21936c = (goa) goa.f18759a.mo13145b();
    }

    /* renamed from: a */
    public final PendingIntent mo11945a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        int i = Build.VERSION.SDK_INT;
        Context context = this.f21934a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = accountRemovalAllowedWorkflowRequest.f10767a;
        Account account = accountRemovalAllowedWorkflowRequest.f10768b;
        return m16338a(new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity").putExtra("am_response", accountAuthenticatorResponse).putExtra("account", account).putExtra("show_lock_screen", accountRemovalAllowedWorkflowRequest.f10769c), UUID.randomUUID().toString());
    }

    /* renamed from: b */
    public Intent mo11982b(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        String[] strArr;
        boolean z;
        SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = setupAccountWorkflowRequest;
        PendingIntent pendingIntent = (PendingIntent) setupAccountWorkflowRequest.mo7660b().getParcelable("pendingIntent");
        String string = setupAccountWorkflowRequest.mo7660b().getString(gie.f18286b);
        List a = setupAccountWorkflowRequest.mo7659a();
        if (a != null) {
            strArr = (String[]) a.toArray(new String[a.size()]);
        } else {
            strArr = new String[0];
        }
        Context context = this.f21934a;
        AccountAuthenticatorResponse accountAuthenticatorResponse = setupAccountWorkflowRequest2.f10789i;
        String str = setupAccountWorkflowRequest2.f10788h;
        boolean z2 = setupAccountWorkflowRequest2.f10783c;
        boolean z3 = setupAccountWorkflowRequest2.f10791k;
        rrq a2 = rrq.m34308a(setupAccountWorkflowRequest2.f10785e);
        if ("cn.google".equals(setupAccountWorkflowRequest2.f10788h) || setupAccountWorkflowRequest2.f10790j) {
            z = true;
        } else {
            z = false;
        }
        return AccountIntroChimeraActivity.m6908a(context, accountAuthenticatorResponse, str, z2, z3, a2, z, setupAccountWorkflowRequest2.f10794n, setupAccountWorkflowRequest2.f10792l, setupAccountWorkflowRequest2.f10793m, strArr, pendingIntent, string, setupAccountWorkflowRequest2.f10795o, setupAccountWorkflowRequest2.f10796p, setupAccountWorkflowRequest2.f10797q, setupAccountWorkflowRequest2.f10798r, setupAccountWorkflowRequest2.f10799s, setupAccountWorkflowRequest2.f10800t, D2dOptions.m6591a(setupAccountWorkflowRequest2.f10785e));
    }

    /* renamed from: a */
    public final PendingIntent mo11946a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        if (this.f21935b) {
            return m16338a(ControllerLauncherChimeraActivity.m7062a(this.f21934a, new ConfirmCredentialsController(confirmCredentialsWorkflowRequest.f10775f, confirmCredentialsWorkflowRequest.f10774e, false, rrq.m34308a(new Bundle(confirmCredentialsWorkflowRequest.f10773d)))), UUID.randomUUID().toString());
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public PendingIntent mo11947a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        int i = Build.VERSION.SDK_INT;
        finishSessionWorkflowRequest.mo7657a();
        return m16338a(FinishSessionChimeraActivity.m6983a(this.f21934a, finishSessionWorkflowRequest.f10779d, finishSessionWorkflowRequest.f10778c, finishSessionWorkflowRequest.mo7657a()), UUID.randomUUID().toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056  */
    /* renamed from: a */
    public PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        char c;
        Intent intent;
        String str = setupAccountWorkflowRequest.f10788h;
        int hashCode = str.hashCode();
        if (hashCode != -2011849543) {
            if (hashCode != 816462108) {
                if (hashCode == 879034182 && str.equals("com.google")) {
                    c = 2;
                    if (c == 0) {
                        if (c != 1 && c != 2) {
                            throw new IllegalStateException("No account type.");
                        } else if (this.f21935b) {
                            intent = mo11982b(setupAccountWorkflowRequest);
                        } else {
                            throw new UnsupportedOperationException();
                        }
                    } else if (!this.f21935b) {
                        Context context = this.f21934a;
                        AccountAuthenticatorResponse accountAuthenticatorResponse = setupAccountWorkflowRequest.f10789i;
                        Locale locale = Locale.getDefault();
                        Configuration configuration = new Configuration();
                        Settings.System.getConfiguration(this.f21934a.getContentResolver(), configuration);
                        String a = ryv.m34681a(this.f21934a, "device_country", null);
                        String language = locale.getLanguage();
                        String country = locale.getCountry();
                        String valueOf = String.valueOf(language);
                        String valueOf2 = String.valueOf(valueOf.length() == 0 ? new String("&lang=") : "&lang=".concat(valueOf));
                        String lowerCase = country.toLowerCase(Locale.US);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 14 + String.valueOf(language).length() + String.valueOf(lowerCase).length());
                        sb.append(valueOf2);
                        sb.append("&langCountry=");
                        sb.append(language);
                        sb.append("_");
                        sb.append(lowerCase);
                        String sb2 = sb.toString();
                        if (configuration.mcc != 0) {
                            String valueOf3 = String.valueOf(sb2);
                            String num = Integer.toString(configuration.mcc);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 5 + String.valueOf(num).length());
                            sb3.append(valueOf3);
                            sb3.append("&mcc=");
                            sb3.append(num);
                            sb2 = sb3.toString();
                        }
                        String concat = String.valueOf(sb2).concat("&xoauth_display_name=Android%20Phone");
                        if (a != null) {
                            String valueOf4 = String.valueOf(concat);
                            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 4 + a.length());
                            sb4.append(valueOf4);
                            sb4.append("&cc=");
                            sb4.append(a);
                            concat = sb4.toString();
                        }
                        StringBuilder sb5 = new StringBuilder(String.valueOf(concat).length() + 58);
                        sb5.append("https://accounts.google.com/o/android/auth?&source=android");
                        sb5.append(concat);
                        intent = BrowserSignInChimeraActivity.m6949a(context, accountAuthenticatorResponse, String.valueOf(sb5.toString()).concat("&tmpl=new_account"), setupAccountWorkflowRequest.f10788h, setupAccountWorkflowRequest.f10794n, rrq.m34308a(setupAccountWorkflowRequest.f10785e));
                    } else {
                        intent = mo11982b(setupAccountWorkflowRequest);
                    }
                    return m16338a(intent, UUID.randomUUID().toString());
                }
            } else if (str.equals("cn.google")) {
                c = 1;
                if (c == 0) {
                }
                return m16338a(intent, UUID.randomUUID().toString());
            }
        } else if (str.equals("com.google.work")) {
            c = 0;
            if (c == 0) {
            }
            return m16338a(intent, UUID.randomUUID().toString());
        }
        c = 65535;
        if (c == 0) {
        }
        return m16338a(intent, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    public PendingIntent mo11949a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        String[] strArr;
        StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest2 = startAddAccountSessionWorkflowRequest;
        int i = Build.VERSION.SDK_INT;
        if ("com.google".equals(startAddAccountSessionWorkflowRequest2.f10805e) || "com.google.work".equals(startAddAccountSessionWorkflowRequest2.f10805e)) {
            String string = startAddAccountSessionWorkflowRequest.mo7663b().getString(gie.f18286b);
            List a = startAddAccountSessionWorkflowRequest.mo7662a();
            if (a != null) {
                strArr = (String[]) a.toArray(new String[a.size()]);
            } else {
                strArr = new String[0];
            }
            return m16338a(ControllerLauncherChimeraActivity.m7062a(this.f21934a, new StartAddAccountSessionController(startAddAccountSessionWorkflowRequest2.f10806f, startAddAccountSessionWorkflowRequest2.f10805e, startAddAccountSessionWorkflowRequest2.f10807g, startAddAccountSessionWorkflowRequest2.f10808h, rrq.m34308a(startAddAccountSessionWorkflowRequest.mo7663b()), startAddAccountSessionWorkflowRequest2.f10809i, startAddAccountSessionWorkflowRequest2.f10810j, strArr, string, null, false, false, null, null, null, null)), UUID.randomUUID().toString());
        }
        throw new IllegalStateException("Account type is not supported.");
    }

    /* renamed from: a */
    public final PendingIntent mo11950a(TokenWorkflowRequest tokenWorkflowRequest) {
        Intent intent;
        if (!this.f21935b) {
            Account account = tokenWorkflowRequest.f10819i;
            jes jes = new jes(new Bundle());
            boolean booleanValue = ((Boolean) this.f21936c.mo12091a(account, gqd.f18815i, false)).booleanValue();
            Logger Logger = DefaultAuthDelegateChimeraService.f9969a;
            StringBuilder sb = new StringBuilder(23);
            sb.append("Use browser flow? ");
            sb.append(booleanValue);
            Logger.mo25414c(sb.toString(), new Object[0]);
            if (booleanValue) {
                jes.mo13678b("https://accounts.google.com/o/android/auth?");
            }
            jes.f22302a.putInt("request_type", 1);
            jes.f22302a.putParcelable("calling_app_description", tokenWorkflowRequest.f10818h);
            jes.mo13673a(account);
            jes.f22302a.putString("service", tokenWorkflowRequest.f10812b);
            jes.f22302a.putBundle("options", tokenWorkflowRequest.mo7665a());
            jes.f22302a.putBoolean("suppress_progress_screen", tokenWorkflowRequest.f10817g);
            jes.mo13675a(tokenWorkflowRequest.f10816f);
            jes.mo13674a(tokenWorkflowRequest.f10815e);
            intent = new Intent().setClassName(this.f21934a.getApplicationContext(), "com.google.android.gms.auth.login.LoginActivity").putExtras(jes.f22302a);
        } else {
            Bundle a = tokenWorkflowRequest.mo7665a();
            boolean z = a.getBoolean("UseCache");
            TokenRequest tokenRequest = new TokenRequest(tokenWorkflowRequest.f10819i, tokenWorkflowRequest.f10812b);
            tokenRequest.f10710f = tokenWorkflowRequest.f10816f;
            tokenRequest.f10717m = z;
            tokenRequest.mo7638a(a);
            tokenRequest.f10714j = tokenWorkflowRequest.f10818h;
            if (ccbp.f178725a.mo6606a().mo75749a()) {
                intent = aczs.m50058a(this.f21934a, tokenRequest);
            } else {
                intent = ControllerLauncherChimeraActivity.m7062a(this.f21934a, new GetTokenController(tokenWorkflowRequest.f10820j, tokenRequest, tokenWorkflowRequest.f10817g, false, rrq.m34308a(tokenWorkflowRequest.mo7665a()), 0));
            }
        }
        return m16338a(intent, UUID.randomUUID().toString());
    }

    /* renamed from: a */
    public PendingIntent mo11951a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        int i = Build.VERSION.SDK_INT;
        Account account = updateCredentialsWorkflowRequest.f10825e;
        if (account != null) {
            return m16338a(ControllerLauncherChimeraActivity.m7062a(this.f21934a, new UpdateCredentialsController(updateCredentialsWorkflowRequest.f10826f, account, rrq.m34308a(updateCredentialsWorkflowRequest.mo7670a()), true)), UUID.randomUUID().toString());
        }
        throw new IllegalStateException("Account is required to update credentials.");
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                PendingIntent a = mo11948a((SetupAccountWorkflowRequest) dcl.m8163a(parcel, SetupAccountWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a);
                return true;
            case 2:
                PendingIntent a2 = mo11950a((TokenWorkflowRequest) dcl.m8163a(parcel, TokenWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a2);
                return true;
            case 3:
                PendingIntent b = mo11954b((UpdateCredentialsWorkflowRequest) dcl.m8163a(parcel, UpdateCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, b);
                return true;
            case 4:
                PendingIntent a3 = mo11946a((ConfirmCredentialsWorkflowRequest) dcl.m8163a(parcel, ConfirmCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a3);
                return true;
            case 5:
                PendingIntent a4 = mo11949a((StartAddAccountSessionWorkflowRequest) dcl.m8163a(parcel, StartAddAccountSessionWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a4);
                return true;
            case 6:
                PendingIntent a5 = mo11951a((UpdateCredentialsWorkflowRequest) dcl.m8163a(parcel, UpdateCredentialsWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a5);
                return true;
            case 7:
                PendingIntent a6 = mo11947a((FinishSessionWorkflowRequest) dcl.m8163a(parcel, FinishSessionWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a6);
                return true;
            case 8:
                PendingIntent a7 = mo11945a((AccountRemovalAllowedWorkflowRequest) dcl.m8163a(parcel, AccountRemovalAllowedWorkflowRequest.CREATOR));
                parcel2.writeNoException();
                dcl.m8169b(parcel2, a7);
                return true;
            default:
                return false;
        }
    }
}
