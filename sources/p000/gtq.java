package p000;

import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferProgress;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* renamed from: gtq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gtq {

    /* renamed from: a */
    public ArrayList f18998a;

    /* renamed from: b */
    public int f18999b = 0;

    /* renamed from: c */
    public AccountTransferProgress f19000c;

    /* renamed from: d */
    public final Set f19001d = new HashSet(3);

    /* renamed from: a */
    public final AccountTransferMsg mo12203a() {
        return new AccountTransferMsg(this.f19001d, 1, this.f18998a, this.f18999b, this.f19000c);
    }

    /* renamed from: a */
    public final void mo12204a(int i) {
        this.f18999b = i;
        this.f19001d.add(3);
    }

    /* renamed from: a */
    public final void mo12205a(AccountTransferProgress accountTransferProgress) {
        this.f19000c = accountTransferProgress;
        this.f19001d.add(4);
    }

    /* renamed from: a */
    public final void mo12206a(ArrayList arrayList) {
        this.f18998a = arrayList;
        this.f19001d.add(2);
    }
}
