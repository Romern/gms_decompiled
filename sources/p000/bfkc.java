package p000;

import android.accounts.Account;
import java.util.Comparator;

/* renamed from: bfkc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bfkc implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return ((Account) obj).name.compareTo(((Account) obj2).name);
    }
}
