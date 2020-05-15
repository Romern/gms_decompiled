package p000;

import android.accounts.AccountManager;
import android.accounts.AuthenticatorDescription;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.internal.NotifyCompletionRequest;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: gto */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gto extends rjx {

    /* renamed from: a */
    private static final rjo f18995a = new rjo("AccountTransfer.ACCOUNT_TRANSFER_API", f18997c, f18996b);

    /* renamed from: b */
    private static final rje f18996b = new rje();

    /* renamed from: c */
    private static final rjl f18997c = new gsy();

    /* JADX WARNING: Illegal instructions before constructor call */
    public gto(Context context, gtt gtt) {
        super(context, r0, gtt, r1.mo24666a());
        rjo rjo = f18995a;
        rjv rjv = new rjv();
        rjv.mo24668a(new rky());
    }

    /* renamed from: a */
    public static Set m13877a(Context context) {
        C1223np npVar = new C1223np();
        AuthenticatorDescription[] authenticatorTypes = AccountManager.get(context).getAuthenticatorTypes();
        for (AuthenticatorDescription authenticatorDescription : authenticatorTypes) {
            npVar.put(authenticatorDescription.type, authenticatorDescription.packageName);
        }
        int i = Build.VERSION.SDK_INT;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        C1223np npVar2 = new C1223np();
        for (Map.Entry entry : npVar.entrySet()) {
            String str = (String) entry.getValue();
            String str2 = (String) entry.getKey();
            if (npVar2.containsKey(str)) {
                ((Set) npVar2.get(str)).add(str2);
            } else {
                C1225nr nrVar = new C1225nr();
                nrVar.add(str2);
                npVar2.put(str, nrVar);
            }
        }
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(new Intent("com.google.android.gms.auth.START_ACCOUNT_EXPORT"), 0);
        C1225nr nrVar2 = new C1225nr();
        for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
            String str3 = resolveInfo.activityInfo.packageName;
            if (npVar2.containsKey(str3)) {
                nrVar2.addAll((Collection) npVar2.get(str3));
            }
        }
        return nrVar2;
    }

    /* renamed from: b */
    public final aucb mo12202b(AccountTransferMsg accountTransferMsg) {
        return mo24732b(new gtj(accountTransferMsg));
    }

    /* renamed from: a */
    public final aucb mo12200a(AccountTransferMsg accountTransferMsg) {
        sdo.m34959a(accountTransferMsg);
        return mo24732b(new gth(accountTransferMsg));
    }

    /* renamed from: a */
    public final aucb mo12201a(String str, int i) {
        sdo.m34959a((Object) str);
        return mo24732b(new gtf(new NotifyCompletionRequest(str, i)));
    }
}
