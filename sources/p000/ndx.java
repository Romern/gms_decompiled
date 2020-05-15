package p000;

import android.accounts.Account;
import java.util.Comparator;

/* renamed from: ndx */
public final /* synthetic */ class ndx implements Comparator {

    /* renamed from: a */
    public static final Comparator f35372a = new ndx();

    private ndx() {
    }

    public final int compare(Object obj, Object obj2) {
        lvn lvn = ndy.f35373a;
        return ((Account) obj).name.compareToIgnoreCase(((Account) obj2).name);
    }
}
