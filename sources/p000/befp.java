package p000;

import android.accounts.Account;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: befp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class befp implements befb {

    /* renamed from: a */
    public final belh f111511a;

    public befp(belh belh) {
        this.f111511a = belh;
    }

    /* renamed from: a */
    public final bqgg mo60652a(Account account) {
        AtomicInteger atomicInteger = new AtomicInteger();
        return bqdx.m112673a(this.f111511a.mo60777a(new befm(account, atomicInteger), bqfb.INSTANCE), new befn(atomicInteger), bqfb.INSTANCE);
    }
}
