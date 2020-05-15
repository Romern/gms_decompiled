package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.firstparty.dataservice.TokenRequest;
import com.google.android.gms.auth.firstparty.dataservice.TokenResponse;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;

/* renamed from: aqpl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqpl {

    /* renamed from: a */
    public static final Logger f86506a = aqom.m71876c("TokenRequester");

    /* renamed from: c */
    private static final bngx f86507c = bngx.m109360a("authAccount", "booleanResult", "accountType", "authtoken", "retry");

    /* renamed from: b */
    public final Context f86508b;

    /* renamed from: d */
    private final ixl f86509d;

    /* renamed from: e */
    private final adab f86510e;

    private aqpl(Context context) {
        this.f86508b = context;
        this.f86509d = aczw.m50063a(context);
        this.f86510e = new adab(context);
    }

    /* renamed from: a */
    public static aqpl m71926a(Context context) {
        return new aqpl(context);
    }

    /* renamed from: a */
    public final aqpm mo48034a(TokenRequest tokenRequest) {
        Intent intent;
        adab adab;
        rex rex;
        TokenResponse a = this.f86509d.mo13425a(tokenRequest);
        if (a == null) {
            return aqpm.m71928a(8, "Internal error.", bmvz.f131120a);
        }
        TokenData tokenData = a.f10746w;
        if (tokenData != null) {
            return new aqpm(0, bmvz.f131120a, bmxv.m108567c(tokenData));
        }
        if (izj.m16367a(a.mo7647b())) {
            if (((Boolean) aqnw.f86401b.mo58455c()).booleanValue()) {
                intent = aczs.m50058a(this.f86508b, tokenRequest);
            } else {
                try {
                    adab = this.f86510e;
                    TokenWorkflowRequest tokenWorkflowRequest = new TokenWorkflowRequest();
                    tokenWorkflowRequest.mo7666a(tokenRequest.mo7637a());
                    tokenWorkflowRequest.f10812b = tokenRequest.f10706b;
                    tokenWorkflowRequest.mo7667a(tokenRequest.mo7640b());
                    tokenWorkflowRequest.f10816f = tokenRequest.f10710f;
                    tokenWorkflowRequest.f10818h = tokenRequest.f10714j;
                    tokenWorkflowRequest.f10817g = tokenRequest.mo7640b().getBoolean("suppressProgressScreen", false);
                    iyo iyo = null;
                    if (adab.f61183a.mo33281a(adab.f61188b).mo66813a()) {
                        tokenWorkflowRequest.f10816f = null;
                        tokenWorkflowRequest.mo7668b();
                    }
                    aczx aczx = new aczx(tokenWorkflowRequest);
                    PackageManager packageManager = adab.f61188b.getPackageManager();
                    ResolveInfo resolveService = packageManager.resolveService(adab.f61189c, 0);
                    if (resolveService == null || resolveService.serviceInfo == null || resolveService.serviceInfo.applicationInfo == null) {
                        throw new SecurityException("Couldn't resolve AuthDelegateService intent to a delegate service.");
                    } else if (packageManager.checkSignatures(adab.f61188b.getApplicationInfo().uid, resolveService.serviceInfo.applicationInfo.uid) == 0) {
                        adab.f61189c.setPackage(resolveService.serviceInfo.packageName);
                        rex = new rex();
                        if (skh.m35531a().mo25691a(adab.f61188b, "AuthUiDelegateHelper", adab.f61189c, rex, 1)) {
                            try {
                                IBinder a2 = rex.mo24567a();
                                if (a2 != null) {
                                    IInterface queryLocalInterface = a2.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                                    iyo = !(queryLocalInterface instanceof iyo) ? new iym(a2) : (iyo) queryLocalInterface;
                                }
                            } catch (InterruptedException e) {
                                IBinder a3 = rex.mo24567a();
                                if (a3 != null) {
                                    IInterface queryLocalInterface2 = a3.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                                    iyo = !(queryLocalInterface2 instanceof iyo) ? new iym(a3) : (iyo) queryLocalInterface2;
                                }
                            }
                            PendingIntent a4 = iyo.mo11950a(aczx.f61178a);
                            rfz a5 = rfz.m33557a(adab.f61188b);
                            int i = Build.VERSION.SDK_INT;
                            if (a5.mo24608b(a4.getCreatorUid())) {
                                skh.m35531a().mo25689a(adab.f61188b, rex);
                                intent = imt.m15732a(aczv.m50059a(this.f86508b, a4, f86507c));
                            } else {
                                throw new SecurityException("Invalid delegate! Only first party auth delegates are supported.");
                            }
                        } else {
                            throw new InterruptedException("Unable to bind to auth delegate service.");
                        }
                    } else {
                        throw new SecurityException("Cannot delegate to the service with different signature.");
                    }
                } catch (RemoteException | InterruptedException e2) {
                    f86506a.mo25417e("Unable to fetch the intent to launch token retrieval workflow.", e2, new Object[0]);
                    return aqpm.m71928a(8, "Internal error.", bmvz.f131120a);
                } catch (Throwable th) {
                    skh.m35531a().mo25689a(adab.f61188b, rex);
                    throw th;
                }
            }
            return aqpm.m71928a(4, "Sign-in required.", bmxv.m108566b(intent));
        } else if (izj.m16368b(a.mo7647b())) {
            if (izj.NETWORK_ERROR.equals(a.mo7647b())) {
                return aqpm.m71928a(7, "Network error.", bmvz.f131120a);
            }
            return aqpm.m71928a(8, "Internal error.", bmvz.f131120a);
        } else if (izj.SERVICE_DISABLED.equals(a.mo7647b())) {
            return aqpm.m71928a(16, "Account or application is not allowed to use some or all of Google services.", bmvz.f131120a);
        } else {
            if (!izj.INVALID_AUDIENCE.equals(a.mo7647b()) && !izj.UNREGISTERED_ON_API_CONSOLE.equals(a.mo7647b())) {
                return aqpm.m71928a(17, "Sign-in failed.", bmvz.f131120a);
            }
            String valueOf = String.valueOf(a.mo7647b().f22000ac);
            return aqpm.m71928a(10, valueOf.length() == 0 ? new String("Mis-configured OAuth client, please check. Detailed error: ") : "Mis-configured OAuth client, please check. Detailed error: ".concat(valueOf), bmvz.f131120a);
        }
    }
}
