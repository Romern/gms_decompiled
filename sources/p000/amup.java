package p000;

import android.accounts.Account;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.people.contactssync.model.BackupAndSyncOptInState;
import java.util.ArrayList;

/* renamed from: amup */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class amup {
    /* renamed from: a */
    static Account m63312a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return new Account(str, "com.google");
        }
        return null;
    }

    /* renamed from: a */
    static boolean m63317a(BackupAndSyncOptInState backupAndSyncOptInState) {
        return backupAndSyncOptInState != null && backupAndSyncOptInState.f81706c == 3;
    }

    /* renamed from: b */
    static bddo m63318b(String str) {
        bddn g = bddo.m90606g();
        g.mo57907a(str);
        return g.mo57906a();
    }

    /* renamed from: b */
    static boolean m63319b(BackupAndSyncOptInState backupAndSyncOptInState) {
        int i;
        return backupAndSyncOptInState == null || (i = backupAndSyncOptInState.f81706c) == 1 || i == 0;
    }

    /* renamed from: a */
    static Intent m63313a(Account account, String str) {
        return m63314a(account, str, null);
    }

    /* renamed from: a */
    static Intent m63314a(Account account, String str, ArrayList arrayList) {
        ArrayList arrayList2;
        res res = new res();
        res.f42823a = account;
        if (arrayList != null) {
            arrayList2 = new ArrayList(arrayList);
        } else {
            arrayList2 = null;
        }
        res.f42824b = arrayList2;
        res.mo24566c();
        res.mo24564a(bnkn.m109665a("com.google"));
        res.mo24565b();
        res.f42828f = 1001;
        res.f42825c = str;
        return rew.m33488a(res.mo24563a());
    }

    /* renamed from: a */
    static String m63315a(Account account) {
        if (account != null) {
            return account.name;
        }
        return null;
    }

    /* renamed from: a */
    static void m63316a(String str, View view) {
        view.setClickable(true);
        C1280ps.m19906b(view, 1);
        C1280ps.m19894a(view, new amuo(str));
    }
}
