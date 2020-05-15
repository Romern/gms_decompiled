package p000;

import android.accounts.Account;
import android.accounts.AccountManagerFuture;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SyncAdapterType;
import android.os.Build;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: gkh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gkh {

    /* renamed from: a */
    private static final sek f18390a = ght.m13171a("AccountRenameHelper");

    /* renamed from: b */
    private final adyd f18391b;

    /* renamed from: c */
    private final lsp f18392c;

    /* renamed from: d */
    private final glu f18393d;

    public gkh(Context context) {
        adyd a = adyd.m51363a(context);
        lsp lsp = new lsp(context);
        glu a2 = glu.m13415a(context);
        sdo.m34959a(a);
        this.f18391b = a;
        sdo.m34959a((goa) goa.f18759a.mo13145b());
        sdo.m34959a(lsp);
        this.f18392c = lsp;
        sdo.m34959a(a2);
        this.f18393d = a2;
    }

    /* renamed from: a */
    public final boolean mo11983a(Account account, Account account2) {
        if (account.equals(account2)) {
            return false;
        }
        String a = this.f18393d.mo12037a();
        try {
            List asList = Arrays.asList(this.f18391b.mo33916a(account.type));
            if (asList.contains(account) && !asList.contains(account2)) {
                int i = Build.VERSION.SDK_INT;
                boolean b = mo11984b(account, account2);
                this.f18393d.mo12039a(a);
                return b;
            }
            f18390a.mo25414c("Already renamed", new Object[0]);
            return false;
        } finally {
            this.f18393d.mo12039a(a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo11984b(Account account, Account account2) {
        SyncAdapterType[] syncAdapterTypes = ContentResolver.getSyncAdapterTypes();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (SyncAdapterType syncAdapterType : syncAdapterTypes) {
            if (account2.type.equals(syncAdapterType.accountType)) {
                hashMap2.put(syncAdapterType.authority, Integer.valueOf(ContentResolver.getIsSyncable(account, syncAdapterType.authority)));
                hashMap.put(syncAdapterType.authority, Boolean.valueOf(ContentResolver.getSyncAutomatically(account, syncAdapterType.authority)));
            }
        }
        adyd adyd = this.f18391b;
        String str = account2.name;
        bljb a = blkh.m107281a("AccountManager.renameAccount");
        try {
            AccountManagerFuture<Account> renameAccount = adyd.f62893a.renameAccount(account, str, null, null);
            if (a != null) {
                a.close();
            }
            try {
                Account result = renameAccount.getResult();
                if (!result.name.equals(account2.name)) {
                    f18390a.mo25414c("Rename for account %s failed.", sek.m35081a(account));
                    return false;
                }
                f18390a.mo25414c("Account rename succeeded: %s -> %s.", sek.m35081a(account), sek.m35081a(account2));
                if (account.equals(this.f18392c.mo19591a())) {
                    try {
                        this.f18392c.mo19592a(account2);
                        f18390a.mo25414c("Set account %s as backup account.", sek.m35081a(account2));
                    } catch (Exception e) {
                        f18390a.mo25418e("Failed to set backup account: %s", sek.m35081a(account2), e);
                    }
                }
                for (String str2 : hashMap.keySet()) {
                    ContentResolver.setIsSyncable(result, str2, ((Integer) hashMap2.get(str2)).intValue());
                    ContentResolver.setSyncAutomatically(result, str2, ((Boolean) hashMap.get(str2)).booleanValue());
                }
                this.f18393d.mo12040a(account.name, 4, account2.name);
                this.f18393d.mo12040a(account2.name, 3, account.name);
                return true;
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                f18390a.mo25414c("Rename for account %s failed.", sek.m35081a(account));
                return false;
            }
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
