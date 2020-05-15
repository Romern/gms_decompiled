package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: abhv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abhv implements abhu {

    /* renamed from: a */
    private static final srn f57508a = srn.m36127a(sgj.GROWTH);

    /* renamed from: b */
    private final Context f57509b;

    public abhv(Context context) {
        this.f57509b = context;
    }

    /* renamed from: a */
    public final List mo32118a() {
        Account[] accountArr;
        ArrayList arrayList = new ArrayList();
        try {
            accountArr = gik.m13219g(this.f57509b, "com.google");
        } catch (RemoteException | rfv | rfw e) {
            bnsl bnsl = (bnsl) f57508a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("abhv", "a", 48, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to get accounts");
            accountArr = null;
        }
        if (accountArr != null) {
            for (Account account : accountArr) {
                arrayList.add(account.name);
            }
        }
        return arrayList;
    }
}
