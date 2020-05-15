package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;

/* renamed from: rtg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class rtg {
    public rtg(Context context) {
        sdo.m34959a(context);
        context.getContentResolver();
    }

    /* renamed from: a */
    public static final void m34394a(Account account, String str) {
        ContentResolver.setSyncAutomatically(account, str, true);
    }

    /* renamed from: a */
    public static final void m34395a(Account account, String str, Bundle bundle) {
        for (String str2 : bundle.keySet()) {
            sdo.checkIfNull(bundle.get(str2), "Null values are not allowed in extras");
        }
        ContentResolver.removePeriodicSync(account, str, bundle);
    }

    /* renamed from: a */
    public static final void m34396a(Account account, String str, Bundle bundle, long j) {
        for (String str2 : bundle.keySet()) {
            sdo.checkIfNull(bundle.get(str2), "Null values are not allowed in extras");
        }
        ContentResolver.addPeriodicSync(account, str, bundle, j);
    }
}
