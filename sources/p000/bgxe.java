package p000;

import android.accounts.Account;
import android.os.IInterface;
import com.google.android.location.reporting.state.update.AccountConfig;
import java.util.List;

/* renamed from: bgxe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface bgxe extends IInterface {
    /* renamed from: a */
    AccountConfig mo63304a(Account account);

    /* renamed from: a */
    List mo63305a(Account account, int i, boolean z, String str);

    /* renamed from: a */
    void mo63306a(Account account, String str, boolean z, String str2);

    /* renamed from: b */
    List mo63307b(Account account);

    /* renamed from: b */
    void mo63308b(Account account, String str, boolean z, String str2);
}
