package p000;

import android.accounts.Account;

/* renamed from: brvi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brvi extends brvg {

    /* renamed from: a */
    public final Account f143450a;

    /* renamed from: b */
    public final String f143451b;

    public brvi(Account account, String str) {
        this.f143450a = account;
        if (str != null) {
            this.f143451b = str;
            return;
        }
        throw new NullPointerException("Null scope");
    }

    /* renamed from: a */
    public final Account mo70001a() {
        return this.f143450a;
    }

    /* renamed from: b */
    public final String mo70002b() {
        return this.f143451b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof brvg) {
            brvg brvg = (brvg) obj;
            return this.f143450a.equals(brvg.mo70001a()) && this.f143451b.equals(brvg.mo70002b());
        }
    }

    public final int hashCode() {
        return ((this.f143450a.hashCode() ^ 1000003) * 1000003) ^ this.f143451b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f143450a);
        String str = this.f143451b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33 + str.length());
        sb.append("AccountAndScope{account=");
        sb.append(valueOf);
        sb.append(", scope=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
