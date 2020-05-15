package p000;

/* renamed from: azzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class azzx extends baac {

    /* renamed from: a */
    public final bygx f100350a;

    public azzx(bygx bygx) {
        this.f100350a = bygx;
    }

    /* renamed from: a */
    public final bygx mo55534a() {
        return this.f100350a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof baac)) {
            return false;
        }
        baac baac = (baac) obj;
        bygx bygx = this.f100350a;
        return bygx != null ? bygx.equals(baac.mo55534a()) : baac.mo55534a() == null;
    }

    public final int hashCode() {
        int i;
        bygx bygx = this.f100350a;
        if (bygx != null) {
            i = bygx.f164758ag;
            if (i == 0) {
                i = bxxm.f165037a.mo74228a(bygx).mo74216a(bygx);
                bygx.f164758ag = i;
            }
        } else {
            i = 0;
        }
        return 1000003 ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f100350a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
        sb.append("CoreBroadcastSubscriptionParams{channelFilter=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
