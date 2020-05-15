package p000;

import android.accounts.Account;

/* renamed from: wek */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wek extends C1598wfa {

    /* renamed from: a */
    private final Account f50591a;

    public wek(Account account) {
        if (account != null) {
            this.f50591a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: b */
    public final Account mo24205b() {
        return this.f50591a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1598wfa) {
            return this.f50591a.equals(((C1598wfa) obj).mo24205b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f50591a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f50591a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
        sb.append("FacsInternalSyncOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
