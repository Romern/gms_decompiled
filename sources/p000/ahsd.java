package p000;

/* renamed from: ahsd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ahsd {

    /* renamed from: a */
    public static final srn f67925a = ahfr.m55664a("NearbyDiscovery");

    /* renamed from: a */
    public static String m56456a(bvey bvey) {
        if (bvey == null) {
            return "FastPairLog{}";
        }
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = Integer.valueOf(bvey.f155816b);
        int i2 = 1;
        objArr[1] = Long.valueOf(bvey.f155823i);
        objArr[2] = Long.valueOf(bvey.f155824j);
        if ((bvey.f155815a & 512) != 0) {
            bvex bvex = bvey.f155825k;
            if (bvex == null) {
                bvex = bvex.f155809c;
            }
            i = bvex.f155812b;
        }
        objArr[3] = Integer.valueOf(i);
        StringBuilder sb = new StringBuilder(String.format("FastPairLog{0x%06x, salted address=%s, duration=%dms, number of keys=%d", objArr));
        if ((bvey.f155815a & 2) != 0) {
            sb.append(", bond state=");
            int a = bvit.m121158a(bvey.f155817c);
            if (a == 0) {
                a = 1;
            }
            sb.append((Object) Integer.toString(a - 1));
        }
        if ((4 & bvey.f155815a) != 0) {
            sb.append(", error code=");
            int a2 = bviy.m121163a(bvey.f155818d);
            if (a2 != 0) {
                i2 = a2;
            }
            sb.append((Object) Integer.toString(i2 - 1));
            int i3 = bvey.f155815a;
            if ((i3 & 32) != 0) {
                sb.append(", bond event=");
                bveu bveu = bvey.f155821g;
                if (bveu == null) {
                    bveu = bveu.f155796d;
                }
                sb.append(bveu);
            } else if ((i3 & 16) != 0) {
                sb.append(", br/edr event=");
                bves bves = bvey.f155820f;
                if (bves == null) {
                    bves = bves.f155787c;
                }
                sb.append(bves);
            } else if ((i3 & 8) != 0) {
                sb.append(", gatt event=");
                bvew bvew = bvey.f155819e;
                if (bvew == null) {
                    bvew = bvew.f155805c;
                }
                sb.append(bvew);
            } else if ((i3 & 64) != 0) {
                sb.append(", connection event=");
                bvet bvet = bvey.f155822h;
                if (bvet == null) {
                    bvet = bvet.f155791d;
                }
                sb.append(bvet);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    public static String m56457a(bywl bywl) {
        String str;
        if (bywl == null) {
            return "LoggedNearbyDiscovery{}";
        }
        StringBuilder sb = new StringBuilder("LoggedNearbyDiscovery{");
        bvin a = bvin.m121150a(bywl.f168594b);
        if (a == null) {
            a = bvin.UNKNOWN_DISCOVERY_EVENT;
        }
        sb.append(a);
        bxwc bxwc = bywl.f168596d;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            byvp byvp = (byvp) bxwc.get(i);
            sb.append(",");
            if (byvp != null) {
                String str2 = byvp.f168476b;
                int i2 = byvp.f168480f;
                int i3 = byvp.f168481g;
                double d = byvp.f168484j;
                long j = byvp.f168485k;
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 133);
                sb2.append("LoggedDiscoveryItem{");
                sb2.append(str2);
                sb2.append(", rssi=");
                sb2.append(i2);
                sb2.append(", tx power=");
                sb2.append(i3);
                sb2.append(", distance=");
                sb2.append(d);
                sb2.append(", salted address=");
                sb2.append(j);
                sb2.append("}");
                str = sb2.toString();
            } else {
                str = "LoggedDiscoveryItem{}";
            }
            sb.append(str);
        }
        sb.append("}");
        return sb.toString();
    }
}
