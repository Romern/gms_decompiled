package p000;

import android.accounts.Account;

/* renamed from: azzw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azzw extends baab {

    /* renamed from: a */
    private final String f100346a;

    /* renamed from: b */
    private final Account f100347b;

    /* renamed from: c */
    private final bygz f100348c;

    /* renamed from: d */
    private final String f100349d;

    public azzw(String str, Account account, bygz bygz, String str2) {
        if (str != null) {
            this.f100346a = str;
            if (account != null) {
                this.f100347b = account;
                if (bygz != null) {
                    this.f100348c = bygz;
                    if (str2 != null) {
                        this.f100349d = str2;
                        return;
                    }
                    throw new NullPointerException("Null action");
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null appId");
    }

    /* renamed from: a */
    public final String mo55527a() {
        return this.f100346a;
    }

    /* renamed from: b */
    public final Account mo55528b() {
        return this.f100347b;
    }

    /* renamed from: c */
    public final bygz mo55529c() {
        return this.f100348c;
    }

    /* renamed from: d */
    public final String mo55530d() {
        return this.f100349d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof baab) {
            baab baab = (baab) obj;
            return this.f100346a.equals(baab.mo55527a()) && this.f100347b.equals(baab.mo55528b()) && this.f100348c.equals(baab.mo55529c()) && this.f100349d.equals(baab.mo55530d());
        }
    }

    public final int hashCode() {
        int hashCode = (((this.f100346a.hashCode() ^ 1000003) * 1000003) ^ this.f100347b.hashCode()) * 1000003;
        bygz bygz = this.f100348c;
        int i = bygz.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bygz).mo74216a(bygz);
            bygz.f164758ag = i;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f100349d.hashCode();
    }

    public final String toString() {
        String str = this.f100346a;
        String valueOf = String.valueOf(this.f100347b);
        String valueOf2 = String.valueOf(this.f100348c);
        String str2 = this.f100349d;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 67 + length2 + String.valueOf(valueOf2).length() + str2.length());
        sb.append("CoreBroadcastSubscriptionKey{appId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", action=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
