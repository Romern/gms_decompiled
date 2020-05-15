package p000;

import android.accounts.Account;

/* renamed from: barf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class barf extends barh {

    /* renamed from: a */
    private final Account f101598a;

    /* renamed from: b */
    private final String f101599b;

    public barf(Account account, String str) {
        if (account != null) {
            this.f101598a = account;
            if (str != null) {
                this.f101599b = str;
                return;
            }
            throw new NullPointerException("Null channelKey");
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo55905a() {
        return this.f101598a;
    }

    /* renamed from: b */
    public final String mo55906b() {
        return this.f101599b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof barh) {
            barh barh = (barh) obj;
            return this.f101598a.equals(barh.mo55905a()) && this.f101599b.equals(barh.mo55906b());
        }
    }

    public final int hashCode() {
        return ((this.f101598a.hashCode() ^ 1000003) * 1000003) ^ this.f101599b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f101598a);
        String str = this.f101599b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40 + str.length());
        sb.append("AccountChannelKey{account=");
        sb.append(valueOf);
        sb.append(", channelKey=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
