package p000;

import android.accounts.Account;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: aqyp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aqyp {

    /* renamed from: a */
    public String f87104a;

    /* renamed from: b */
    public String f87105b;

    /* renamed from: c */
    public String f87106c;

    /* renamed from: d */
    public boolean f87107d;

    /* renamed from: e */
    public final ArrayList f87108e = new ArrayList();

    /* renamed from: f */
    public araa f87109f;

    /* renamed from: g */
    private final Map f87110g = new HashMap();

    /* renamed from: a */
    public final BootstrapConfigurations mo48278a() {
        long j;
        long j2;
        araa araa = this.f87109f;
        if (araa != null) {
            j2 = araa.f87187a;
            j = araa.f87188b;
        } else {
            j2 = 0;
            j = 0;
        }
        return new BootstrapConfigurations(this.f87104a, this.f87105b, this.f87106c, this.f87107d, this.f87108e, this.f87110g, j2, j);
    }

    /* renamed from: a */
    public final void mo48279a(Account[] accountArr) {
        sdo.checkIfNull(accountArr, "accounts cannot be null.");
        for (Account account : accountArr) {
            this.f87108e.add(new BootstrapAccount(account.name, account.type));
        }
    }
}
