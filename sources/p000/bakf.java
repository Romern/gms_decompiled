package p000;

import android.accounts.Account;

/* renamed from: bakf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bakf extends bakg {

    /* renamed from: a */
    private final byie f101119a;

    /* renamed from: b */
    private final bygz f101120b;

    /* renamed from: c */
    private final Account f101121c;

    /* renamed from: d */
    private final boolean f101122d;

    /* renamed from: e */
    private final boolean f101123e;

    public bakf(byie byie, bygz bygz, Account account, boolean z, boolean z2) {
        if (byie != null) {
            this.f101119a = byie;
            if (bygz != null) {
                this.f101120b = bygz;
                this.f101121c = account;
                this.f101122d = z;
                this.f101123e = z2;
                return;
            }
            throw new NullPointerException("Null channelId");
        }
        throw new NullPointerException("Null identity");
    }

    /* renamed from: a */
    public final byie mo55718a() {
        return this.f101119a;
    }

    /* renamed from: b */
    public final bygz mo55719b() {
        return this.f101120b;
    }

    /* renamed from: c */
    public final Account mo55720c() {
        return this.f101121c;
    }

    /* renamed from: d */
    public final boolean mo55721d() {
        return this.f101122d;
    }

    /* renamed from: e */
    public final boolean mo55722e() {
        return this.f101123e;
    }

    public final boolean equals(Object obj) {
        Account account;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bakg) {
            bakg bakg = (bakg) obj;
            return this.f101119a.equals(bakg.mo55718a()) && this.f101120b.equals(bakg.mo55719b()) && ((account = this.f101121c) == null ? bakg.mo55720c() == null : account.equals(bakg.mo55720c())) && this.f101122d == bakg.mo55721d() && this.f101123e == bakg.mo55722e();
        }
    }

    public final int hashCode() {
        byie byie = this.f101119a;
        int i = byie.f164758ag;
        if (i == 0) {
            i = bxxm.f165037a.mo74228a(byie).mo74216a(byie);
            byie.f164758ag = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        bygz bygz = this.f101120b;
        int i3 = bygz.f164758ag;
        if (i3 == 0) {
            i3 = bxxm.f165037a.mo74228a(bygz).mo74216a(bygz);
            bygz.f164758ag = i3;
        }
        int i4 = (i2 ^ i3) * 1000003;
        Account account = this.f101121c;
        int i5 = 1237;
        int hashCode = (((i4 ^ (account != null ? account.hashCode() : 0)) * 1000003) ^ (!this.f101122d ? 1237 : 1231)) * 1000003;
        if (this.f101123e) {
            i5 = 1231;
        }
        return hashCode ^ i5;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f101119a);
        String valueOf2 = String.valueOf(this.f101120b);
        String valueOf3 = String.valueOf(this.f101121c);
        boolean z = this.f101122d;
        boolean z2 = this.f101123e;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 82 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ChannelNotification{identity=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", account=");
        sb.append(valueOf3);
        sb.append(", updated=");
        sb.append(z);
        sb.append(", deleted=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
