package p000;

import android.accounts.Account;

/* renamed from: babn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class babn extends babm {

    /* renamed from: a */
    public final Account f100437a;

    /* renamed from: b */
    public final bygz f100438b;

    public babn(Account account, bygz bygz) {
        if (account != null) {
            this.f100437a = account;
            if (bygz != null) {
                this.f100438b = bygz;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null account");
    }

    /* renamed from: a */
    public final Account mo55557a() {
        return this.f100437a;
    }

    /* renamed from: b */
    public final bygz mo55558b() {
        return this.f100438b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof babm) {
            babm babm = (babm) obj;
            return this.f100437a.equals(babm.mo55557a()) && this.f100438b.equals(babm.mo55558b());
        }
    }

    public final int hashCode() {
        int hashCode = (this.f100437a.hashCode() ^ 1000003) * 1000003;
        bygz bygz = this.f100438b;
        int i = bygz.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(bygz).mo74216a(bygz);
            bygz.f164758ag = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f100437a);
        String valueOf2 = String.valueOf(this.f100438b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("AccountChannelIdKey{account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
