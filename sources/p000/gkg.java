package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.cast.JGCastService;
import com.google.android.gms.auth.firstparty.delegate.FinishSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.SetupAccountWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.StartAddAccountSessionWorkflowRequest;
import com.google.android.gms.auth.firstparty.delegate.UpdateCredentialsWorkflowRequest;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.uiflows.addaccount.AccountIntroChimeraActivity;
import java.util.List;
import java.util.UUID;

/* renamed from: gkg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkg extends iyn {
    public gkg(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final PendingIntent mo11947a(FinishSessionWorkflowRequest finishSessionWorkflowRequest) {
        return null;
    }

    /* renamed from: a */
    public final PendingIntent mo11949a(StartAddAccountSessionWorkflowRequest startAddAccountSessionWorkflowRequest) {
        return null;
    }

    /* renamed from: a */
    public final PendingIntent mo11951a(UpdateCredentialsWorkflowRequest updateCredentialsWorkflowRequest) {
        return null;
    }

    /* renamed from: b */
    public final Intent mo11982b(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        SetupAccountWorkflowRequest setupAccountWorkflowRequest2 = setupAccountWorkflowRequest;
        PendingIntent pendingIntent = (PendingIntent) setupAccountWorkflowRequest.mo7660b().getParcelable("pendingIntent");
        String string = setupAccountWorkflowRequest.mo7660b().getString(gie.f18286b);
        List a = setupAccountWorkflowRequest.mo7659a();
        return AccountIntroChimeraActivity.m6908a(this.f21934a, setupAccountWorkflowRequest2.f10789i, setupAccountWorkflowRequest2.f10788h, setupAccountWorkflowRequest2.f10783c, setupAccountWorkflowRequest2.f10791k, rrq.m34308a(setupAccountWorkflowRequest2.f10785e), true, setupAccountWorkflowRequest2.f10794n, setupAccountWorkflowRequest2.f10792l, setupAccountWorkflowRequest2.f10793m, a != null ? (String[]) a.toArray(new String[a.size()]) : new String[0], pendingIntent, string, setupAccountWorkflowRequest2.f10795o, setupAccountWorkflowRequest2.f10796p, true, setupAccountWorkflowRequest2.f10798r, setupAccountWorkflowRequest2.f10799s, setupAccountWorkflowRequest2.f10800t, D2dOptions.m6591a(setupAccountWorkflowRequest2.f10785e));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* renamed from: a */
    public final PendingIntent mo11948a(SetupAccountWorkflowRequest setupAccountWorkflowRequest) {
        char c;
        String str = setupAccountWorkflowRequest.f10788h;
        int hashCode = str.hashCode();
        if (hashCode != -2011849543) {
            if (hashCode != 816462108) {
                if (hashCode == 879034182 && str.equals("com.google")) {
                    c = 2;
                    if (c != 0 || c == 1 || c == 2) {
                        Intent b = mo11982b(setupAccountWorkflowRequest);
                        String valueOf = String.valueOf(UUID.randomUUID().toString());
                        b.addCategory(valueOf.length() != 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf));
                        b.addCategory(UUID.randomUUID().toString());
                        return PendingIntent.getActivity(this.f21934a, 0, b, JGCastService.FLAG_PRIVATE_DISPLAY);
                    }
                    throw new IllegalStateException("No account type.");
                }
            } else if (str.equals("cn.google")) {
                c = 1;
                if (c != 0) {
                }
                Intent b2 = mo11982b(setupAccountWorkflowRequest);
                String valueOf2 = String.valueOf(UUID.randomUUID().toString());
                b2.addCategory(valueOf2.length() != 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf2));
                b2.addCategory(UUID.randomUUID().toString());
                return PendingIntent.getActivity(this.f21934a, 0, b2, JGCastService.FLAG_PRIVATE_DISPLAY);
            }
        } else if (str.equals("com.google.work")) {
            c = 0;
            if (c != 0) {
            }
            Intent b22 = mo11982b(setupAccountWorkflowRequest);
            String valueOf22 = String.valueOf(UUID.randomUUID().toString());
            b22.addCategory(valueOf22.length() != 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf22));
            b22.addCategory(UUID.randomUUID().toString());
            return PendingIntent.getActivity(this.f21934a, 0, b22, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        c = 65535;
        if (c != 0) {
        }
        Intent b222 = mo11982b(setupAccountWorkflowRequest);
        String valueOf222 = String.valueOf(UUID.randomUUID().toString());
        b222.addCategory(valueOf222.length() != 0 ? new String("categoryhack:") : "categoryhack:".concat(valueOf222));
        b222.addCategory(UUID.randomUUID().toString());
        return PendingIntent.getActivity(this.f21934a, 0, b222, JGCastService.FLAG_PRIVATE_DISPLAY);
    }
}
