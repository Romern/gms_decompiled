package p000;

import android.accounts.Account;

/* renamed from: akbx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class akbx extends akbt {

    /* renamed from: a */
    public final Account f71569a;

    /* renamed from: b */
    public final String f71570b;

    public akbx(Account account, String str) {
        this.f71569a = account;
        this.f71570b = str;
    }

    /* renamed from: a */
    public final Account mo39165a() {
        return this.f71569a;
    }

    /* renamed from: b */
    public final String mo39166b() {
        return this.f71570b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akbt) {
            akbt akbt = (akbt) obj;
            return this.f71569a.equals(akbt.mo39165a()) && this.f71570b.equals(akbt.mo39166b());
        }
    }

    public final int hashCode() {
        return ((this.f71569a.hashCode() ^ 1000003) * 1000003) ^ this.f71570b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f71569a);
        String str = this.f71570b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + String.valueOf(str).length());
        sb.append("AccountInfo{account=");
        sb.append(valueOf);
        sb.append(", accountId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
