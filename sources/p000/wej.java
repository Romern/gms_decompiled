package p000;

import android.accounts.Account;

/* renamed from: wej */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class wej extends wel {

    /* renamed from: a */
    private final Account f50590a;

    public wej(Account account) {
        if (account != null) {
            this.f50590a = account;
            return;
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: b */
    public final Account mo24205b() {
        return this.f50590a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wel) {
            return this.f50590a.equals(((wel) obj).mo24205b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f50590a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f50590a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("FacsCacheOptions{account=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
