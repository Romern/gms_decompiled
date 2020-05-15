package p000;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import java.util.List;
import java.util.Set;

/* renamed from: gpw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gpw implements gnw {

    /* renamed from: a */
    private final gnz f18804a = gqd.f18812f;

    /* renamed from: a */
    public final void mo12082a(goa goa, Account account, gnz gnz, Object obj) {
        if (this.f18804a.equals(gnz)) {
            Set set = (Set) obj;
            gkk gkk = new gkk(rpr.m34216b());
            gkk.f18400a.mo25414c("Broadcasting account services changed.", new Object[0]);
            Intent intent = new Intent("com.google.android.gms.auth.ACCOUNT_SERVICES_CHANGED");
            ims ims = new ims();
            ims.mo13148b(gkk.f18404e, account);
            Intent putExtras = intent.putExtras(ims.f21367a);
            List<ResolveInfo> queryBroadcastReceivers = gkk.f18407h.queryBroadcastReceivers(putExtras, 0);
            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                    ActivityInfo activityInfo = resolveInfo.activityInfo;
                    if (activityInfo != null) {
                        String str = activityInfo.packageName;
                        if (!TextUtils.isEmpty(str) && gkk.f18408i.mo24610b(str)) {
                            gkk.mo11986a(putExtras, str);
                        }
                    }
                }
            }
        }
    }
}
