package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: azoe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azoe {

    /* renamed from: a */
    private static WeakReference f99788a = new WeakReference(null);

    /* renamed from: b */
    private final Context f99789b;

    public azoe(Context context) {
        this.f99789b = context;
    }

    /* renamed from: a */
    public static synchronized azoe m85908a(Context context) {
        azoe azoe;
        synchronized (azoe.class) {
            azoe = (azoe) f99788a.get();
            if (azoe == null) {
                azoe = new azoe(context.getApplicationContext());
                f99788a = new WeakReference(azoe);
            }
        }
        return azoe;
    }

    /* renamed from: b */
    public static List m85910b(Context context) {
        ArrayList arrayList = new ArrayList(Arrays.asList(adyd.m51363a(context).mo33916a("com.google")));
        if (arrayList.isEmpty()) {
            arrayList.add(null);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static void m85909a(ClientContext clientContext, Context context, Account account, boolean z) {
        clientContext.mo17798a("auth_token", azob.m85899a(context).mo55112a(account, z));
    }

    /* renamed from: a */
    public final Account mo55114a(String str) {
        List b = m85910b(this.f99789b);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            Account account = (Account) b.get(i);
            if (account != null && ddq.m8203a(account.name, str)) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final String mo55115a(ClientContext clientContext, LocalEntityId localEntityId) {
        Account a;
        String h = azcv.m85357a(this.f99789b).mo54707h(localEntityId);
        if (!(h == null || (a = mo55114a(h)) == null)) {
            m85909a(clientContext, this.f99789b, a, false);
        }
        return h;
    }
}
