package p000;

import android.accounts.Account;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: aeqm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aeqm {
    /* renamed from: a */
    public static String m52397a(Account account) {
        if (account == null) {
            return "null";
        }
        int hashCode = account.name.hashCode();
        StringBuilder sb = new StringBuilder(20);
        sb.append("account#");
        sb.append(hashCode % 20);
        sb.append("#");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m52398a(Integer num) {
        int intValue = num.intValue();
        StringBuilder sb = new StringBuilder(15);
        sb.append("tag#");
        sb.append(intValue % 20);
        return sb.toString();
    }

    /* renamed from: a */
    public static String m52399a(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(m52397a((Account) it.next()));
        }
        return arrayList.toString();
    }

    /* renamed from: a */
    public static String m52400a(Account... accountArr) {
        return m52399a(Arrays.asList(accountArr));
    }
}
