package p000;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* renamed from: acyn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acyn {

    /* renamed from: a */
    private final Context f61082a;

    /* renamed from: b */
    private final AccountManager f61083b;

    public acyn(Context context) {
        sdo.m34959a(context);
        this.f61082a = context;
        this.f61083b = AccountManager.get(context);
    }

    /* renamed from: a */
    public final List mo33243a() {
        Account[] accountsByType = this.f61083b.getAccountsByType("com.google");
        int length = accountsByType.length;
        ArrayList arrayList = new ArrayList(length);
        for (Account account : accountsByType) {
            arrayList.add(acyr.m50017a(this.f61082a, account));
        }
        return arrayList;
    }
}
