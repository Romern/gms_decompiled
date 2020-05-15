package p000;

import android.accounts.Account;
import android.content.Context;

/* renamed from: mnt */
final /* synthetic */ class mnt implements bmxj {

    /* renamed from: a */
    private final Context f34061a;

    public mnt(Context context) {
        this.f34061a = context;
    }

    public final Object apply(Object obj) {
        Account[] accountArr = (Account[]) obj;
        Account a = new lsp(this.f34061a).mo19591a();
        int length = accountArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                if (accountArr[i].equals(a)) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
