package p000;

import android.accounts.Account;

/* renamed from: banz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class banz extends baog {

    /* renamed from: a */
    private final String f101372a;

    /* renamed from: b */
    private final Account f101373b;

    /* renamed from: c */
    private final bygz f101374c;

    /* renamed from: d */
    private final byjh f101375d;

    /* renamed from: e */
    private final bygx f101376e;

    /* renamed from: f */
    private final long f101377f;

    /* renamed from: g */
    private final int f101378g;

    /* renamed from: h */
    private final long f101379h;

    public banz(String str, Account account, bygz bygz, byjh byjh, bygx bygx, long j, int i, long j2) {
        if (str != null) {
            this.f101372a = str;
            if (account != null) {
                this.f101373b = account;
                if (bygz != null) {
                    this.f101374c = bygz;
                    this.f101375d = byjh;
                    this.f101376e = bygx;
                    this.f101377f = j;
                    this.f101378g = i;
                    this.f101379h = j2;
                    return;
                }
                throw new NullPointerException("Null channelId");
            }
            throw new NullPointerException("Null account");
        }
        throw new NullPointerException("Null appId");
    }

    /* renamed from: a */
    public final String mo55814a() {
        return this.f101372a;
    }

    /* renamed from: b */
    public final Account mo55815b() {
        return this.f101373b;
    }

    /* renamed from: c */
    public final bygz mo55816c() {
        return this.f101374c;
    }

    /* renamed from: d */
    public final byjh mo55817d() {
        return this.f101375d;
    }

    /* renamed from: e */
    public final bygx mo55818e() {
        return this.f101376e;
    }

    public final boolean equals(Object obj) {
        byjh byjh;
        bygx bygx;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof baog)) {
            return false;
        }
        baog baog = (baog) obj;
        return this.f101372a.equals(baog.mo55814a()) && this.f101373b.equals(baog.mo55815b()) && this.f101374c.equals(baog.mo55816c()) && ((byjh = this.f101375d) == null ? baog.mo55817d() == null : byjh.equals(baog.mo55817d())) && ((bygx = this.f101376e) == null ? baog.mo55818e() == null : bygx.equals(baog.mo55818e())) && this.f101377f == baog.mo55820f() && this.f101378g == baog.mo55821g() && this.f101379h == baog.mo55822h();
    }

    /* renamed from: f */
    public final long mo55820f() {
        return this.f101377f;
    }

    /* renamed from: g */
    public final int mo55821g() {
        return this.f101378g;
    }

    /* renamed from: h */
    public final long mo55822h() {
        return this.f101379h;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f101372a.hashCode() ^ 1000003) * 1000003) ^ this.f101373b.hashCode()) * 1000003;
        bygz bygz = this.f101374c;
        int i2 = bygz.f164758ag;
        if (i2 == 0) {
            i2 = bxxm.f165037a.mo74228a(bygz).mo74216a(bygz);
            bygz.f164758ag = i2;
        }
        int i3 = (hashCode ^ i2) * 1000003;
        byjh byjh = this.f101375d;
        int i4 = 0;
        if (byjh != null) {
            i = byjh.f164758ag;
            if (i == 0) {
                i = bxxm.f165037a.mo74228a(byjh).mo74216a(byjh);
                byjh.f164758ag = i;
            }
        } else {
            i = 0;
        }
        int i5 = (i3 ^ i) * 1000003;
        bygx bygx = this.f101376e;
        if (bygx != null && (i4 = bygx.f164758ag) == 0) {
            i4 = bxxm.f165037a.mo74228a(bygx).mo74216a(bygx);
            bygx.f164758ag = i4;
        }
        long j = this.f101377f;
        int i6 = this.f101378g;
        long j2 = this.f101379h;
        return ((((((i5 ^ i4) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ i6) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2));
    }

    public final String toString() {
        String str = this.f101372a;
        String valueOf = String.valueOf(this.f101373b);
        String valueOf2 = String.valueOf(this.f101374c);
        String valueOf3 = String.valueOf(this.f101375d);
        String valueOf4 = String.valueOf(this.f101376e);
        long j = this.f101377f;
        int i = this.f101378g;
        long j2 = this.f101379h;
        int length = str.length();
        int length2 = String.valueOf(valueOf).length();
        int length3 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 172 + length2 + length3 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Subscription{appId=");
        sb.append(str);
        sb.append(", account=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(valueOf2);
        sb.append(", syncPolicy=");
        sb.append(valueOf3);
        sb.append(", channelFilter=");
        sb.append(valueOf4);
        sb.append(", elapsedRealtime=");
        sb.append(j);
        sb.append(", bootCount=");
        sb.append(i);
        sb.append(", currentTimeMillis=");
        sb.append(j2);
        sb.append("}");
        return sb.toString();
    }
}
