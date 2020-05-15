package p000;

/* renamed from: axvz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axvz {

    /* renamed from: a */
    public final String f96539a;

    /* renamed from: b */
    final axue f96540b;

    /* renamed from: c */
    final long f96541c;

    /* renamed from: d */
    final boolean f96542d;

    private axvz(String str, axue axue, long j, boolean z) {
        sdo.m34959a((Object) str);
        this.f96539a = str;
        sdo.m34959a(axue);
        this.f96540b = axue;
        sdo.m34976b(j >= 0, "Negative channelId: %s", Long.valueOf(j));
        this.f96541c = j;
        this.f96542d = z;
    }

    /* renamed from: a */
    public static axvz m83357a(axue axue, String str) {
        sdo.m34959a(axue);
        if (str.startsWith("chl-")) {
            try {
                byte[] a = sqd.m35966a(str.substring(4));
                try {
                    aydt aydt = (aydt) bxvk.m124016a(aydt.f97252g, a, bxus.m123744c());
                    int i = aydt.f97254a;
                    if ((i & 1) == 0) {
                        throw new axvy();
                    } else if ((i & 2) == 0) {
                        throw new axvy();
                    } else if ((4 & i) == 0) {
                        throw new axvy();
                    } else if (aydt.f97258e >= 0) {
                        axue a2 = axue.m83239a(aydt.f97256c, aydt.f97257d);
                        if (axue.equals(a2)) {
                            return new axvz(aydt.f97255b, a2, aydt.f97258e, aydt.f97259f);
                        }
                        throw new axvy();
                    } else {
                        throw new axvy();
                    }
                } catch (bxwf e) {
                    throw new axvy();
                }
            } catch (RuntimeException e2) {
                throw new axvy();
            }
        } else {
            throw new axvy();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axvz) {
            axvz axvz = (axvz) obj;
            return this.f96541c == axvz.f96541c && this.f96542d == axvz.f96542d && this.f96540b.equals(axvz.f96540b) && this.f96539a.equals(axvz.f96539a);
        }
    }

    public final int hashCode() {
        int hashCode = this.f96539a.hashCode();
        int hashCode2 = this.f96540b.hashCode();
        long j = this.f96541c;
        return ((((((hashCode + 527) * 31) + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + (this.f96542d ? 1 : 0);
    }

    public final String toString() {
        String str = this.f96539a;
        String valueOf = String.valueOf(this.f96540b);
        long j = this.f96541c;
        boolean z = this.f96542d;
        StringBuilder sb = new StringBuilder(str.length() + 89 + String.valueOf(valueOf).length());
        sb.append("ChannelToken[nodeId='");
        sb.append(str);
        sb.append("', appKey=");
        sb.append(valueOf);
        sb.append(", channelId=");
        sb.append(j);
        sb.append(", thisNodeWasOpener=");
        sb.append(z);
        sb.append(']');
        return sb.toString();
    }

    /* renamed from: a */
    public static axvz m83358a(String str, axue axue, long j, boolean z) {
        return new axvz(str, axue, j, z);
    }

    /* renamed from: a */
    public final String mo53654a() {
        bxvd da = aydt.f97252g.mo74144da();
        String str = this.f96539a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aydt aydt = (aydt) da.f164949b;
        str.getClass();
        int i = aydt.f97254a | 1;
        aydt.f97254a = i;
        aydt.f97255b = str;
        axue axue = this.f96540b;
        String str2 = axue.f96377a;
        str2.getClass();
        int i2 = i | 2;
        aydt.f97254a = i2;
        aydt.f97256c = str2;
        String str3 = axue.f96379c;
        str3.getClass();
        int i3 = i2 | 4;
        aydt.f97254a = i3;
        aydt.f97257d = str3;
        long j = this.f96541c;
        int i4 = i3 | 8;
        aydt.f97254a = i4;
        aydt.f97258e = j;
        boolean z = this.f96542d;
        aydt.f97254a = i4 | 16;
        aydt.f97259f = z;
        String valueOf = String.valueOf(sqd.m35968b(((aydt) da.mo74062i()).mo73642k()));
        return valueOf.length() == 0 ? new String("chl-") : "chl-".concat(valueOf);
    }
}
