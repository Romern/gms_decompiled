package p000;

import android.accounts.Account;

/* renamed from: aecp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aecp extends aeeb {

    /* renamed from: a */
    public final bxvp f63165a;

    /* renamed from: b */
    public final boolean f63166b;

    /* renamed from: c */
    private final Account f63167c;

    public aecp(bxvp bxvp, Account account, boolean z) {
        if (bxvp != null) {
            this.f63165a = bxvp;
            this.f63167c = account;
            this.f63166b = z;
            return;
        }
        throw new NullPointerException("Null syncId");
    }

    /* renamed from: a */
    public final bxvp mo34046a() {
        return this.f63165a;
    }

    /* renamed from: b */
    public final Account mo34047b() {
        return this.f63167c;
    }

    /* renamed from: c */
    public final boolean mo34048c() {
        return this.f63166b;
    }

    /* renamed from: d */
    public final String mo34049d() {
        return null;
    }

    public final boolean equals(Object obj) {
        Account account;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aeeb) {
            aeeb aeeb = (aeeb) obj;
            return this.f63165a.equals(aeeb.mo34046a()) && ((account = this.f63167c) == null ? aeeb.mo34047b() == null : account.equals(aeeb.mo34047b())) && this.f63166b == aeeb.mo34048c() && aeeb.mo34049d() == null;
        }
    }

    public final int hashCode() {
        int hashCode = (this.f63165a.hashCode() ^ 1000003) * 1000003;
        Account account = this.f63167c;
        return (((hashCode ^ (account != null ? account.hashCode() : 0)) * 1000003) ^ (!this.f63166b ? 1237 : 1231)) * 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f63165a);
        String valueOf2 = String.valueOf(this.f63167c);
        boolean z = this.f63166b;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 64 + String.valueOf(valueOf2).length() + String.valueOf((Object) null).length());
        sb.append("ChannelKey{syncId=");
        sb.append(valueOf);
        sb.append(", accountInternal=");
        sb.append(valueOf2);
        sb.append(", allAccounts=");
        sb.append(z);
        sb.append(", subId=null}");
        return sb.toString();
    }
}
