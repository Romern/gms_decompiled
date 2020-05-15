package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.auth.account.authenticator.ChromeOsAuthDelegateService;
import com.google.android.gms.auth.firstparty.delegate.AccountRemovalAllowedWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.ConfirmCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.TokenWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;

/* renamed from: gjy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gjy implements iyo {

    /* renamed from: a */
    private static final sek f18367a = ght.m13171a("AuthDelegateWrapper");

    /* renamed from: b */
    private final Context f18368b;

    /* renamed from: c */
    private final Intent f18369c;

    public gjy(Context context) {
        Intent intent;
        Context applicationContext = context.getApplicationContext();
        this.f18368b = applicationContext;
        if (!gkf.f18388a.mo11981b(applicationContext)) {
            if (cbxo.f178521a.mo6606a().mo75583b()) {
                sre.m36087g(applicationContext);
            }
            ResolveInfo resolveActivity = applicationContext.getPackageManager().resolveActivity(ChromeOsAuthDelegateService.m6271a(), 0);
            if (resolveActivity == null || resolveActivity.activityInfo == null || (resolveActivity.activityInfo.applicationInfo.flags & 129) == 0) {
                intent = new Intent().setClassName(applicationContext, "com.google.android.gms.auth.account.authenticator.DefaultAuthDelegateService");
            } else {
                intent = new Intent().setAction("com.google.android.gms.auth.account.authenticator.chromeos.START").setPackage("com.google.android.gms");
            }
        } else {
            int i = Build.VERSION.SDK_INT;
            intent = new Intent().setAction("com.google.android.gms.auth.account.authenticator.tv.service.START").setPackage("com.google.android.gms");
        }
        this.f18369c = intent;
    }

    /* renamed from: a */
    public final PendingIntent mo11945a(AccountRemovalAllowedWorkflowRequest accountRemovalAllowedWorkflowRequest) {
        return mo11952a(new gjw(accountRemovalAllowedWorkflowRequest));
    }

    public final IBinder asBinder() {
        throw new UnsupportedOperationException("No binder!");
    }

    /* renamed from: b */
    public final PendingIntent mo11954b(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return mo11952a(new gjv(updateCredentialsWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11946a(ConfirmCredentialsWorkflowRequest confirmCredentialsWorkflowRequest) {
        return mo11952a(new gjp(confirmCredentialsWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11947a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        return mo11952a(new gjt(finishSessionWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        return mo11952a(new gjq(setupAccountWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11949a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        return mo11952a(new gjr(startAddAccountSessionWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11950a(TokenWorkflowRequest tokenWorkflowRequest) {
        if (gkf.f18388a.mo11981b(this.f18368b)) {
            tokenWorkflowRequest.f10816f = null;
            tokenWorkflowRequest.mo7668b();
        }
        return mo11952a(new gju(tokenWorkflowRequest));
    }

    /* renamed from: a */
    public final PendingIntent mo11951a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return mo11952a(new gjs(updateCredentialsWorkflowRequest));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        p000.gjy.f18367a.mo25417e("Error while trying to execute against auth delegate.", r13, new java.lang.Object[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ec, code lost:
        throw new java.lang.RuntimeException(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ed, code lost:
        p000.skh.m35531a().mo25689a(r12.f18368b, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        throw r13;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[ExcHandler: RemoteException | InterruptedException (r13v6 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:19:0x0076] */
    /* renamed from: a */
    public final PendingIntent mo11952a(gjx gjx) {
        ilq ilq = new ilq(this.f18368b);
        rex rex = new rex();
        ResolveInfo resolveService = ilq.f21307b.resolveService(this.f18369c, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                if (resolveService.serviceInfo.applicationInfo != null) {
                    if (ilq.f21307b.checkSignatures(ilq.f21311f, resolveService.serviceInfo.applicationInfo.uid) != 0) {
                        SecurityException securityException = new SecurityException("Cannot delegate to Service with different signature.");
                        f18367a.mo25417e(securityException.getMessage(), securityException, new Object[0]);
                        throw securityException;
                    }
                }
                this.f18369c.setPackage(resolveService.serviceInfo.packageName);
            } else {
                throw new IllegalStateException("Couldn't resolve AuthDelegateService intent to a delegate service.");
            }
        }
        int aC = gnv.m13521aC();
        int i = 0;
        while (i < aC) {
            if (!skh.m35531a().mo25691a(this.f18368b, "AuthDelegateWrapper", this.f18369c, rex, 1)) {
                i++;
            } else {
                iyo iyo = null;
                try {
                    IBinder a = rex.mo24567a();
                    if (a != null) {
                        IInterface queryLocalInterface = a.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                        iyo = !(queryLocalInterface instanceof iyo) ? new iym(a) : (iyo) queryLocalInterface;
                    }
                } catch (InterruptedException e) {
                    IBinder a2 = rex.mo24567a();
                    if (a2 != null) {
                        IInterface queryLocalInterface2 = a2.queryLocalInterface("com.google.android.gms.auth.firstparty.delegate.IAuthDelegateService");
                        iyo = !(queryLocalInterface2 instanceof iyo) ? new iym(a2) : (iyo) queryLocalInterface2;
                    }
                } catch (RemoteException | InterruptedException e2) {
                }
                PendingIntent a3 = gjx.mo11944a(iyo);
                int i2 = Build.VERSION.SDK_INT;
                if (ilq.mo13124a(a3.getCreatorUid())) {
                    skh.m35531a().mo25689a(this.f18368b, rex);
                    return a3;
                }
                throw new SecurityException(String.format("Invalid delegate %s! Only first party auth delegates are supported.", ilq.m15665a(a3)));
            }
        }
        throw new gkb("Unable to bind to auth delegate service.");
    }
}
