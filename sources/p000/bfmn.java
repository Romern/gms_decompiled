package p000;

import java.util.Collection;
import java.util.Collections;

/* renamed from: bfmn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class bfmn {

    /* renamed from: a */
    public static final Collection f114411a = Collections.emptyList();

    /* renamed from: b */
    public final int f114412b;

    /* renamed from: c */
    public final int f114413c;

    /* renamed from: d */
    public final int f114414d;

    /* renamed from: e */
    protected final int f114415e;

    /* renamed from: f */
    protected final int f114416f;

    /* renamed from: g */
    public final long f114417g;

    /* renamed from: h */
    public final Collection f114418h;

    /* renamed from: i */
    public final int f114419i;

    /* renamed from: j */
    public final int f114420j;

    /* renamed from: k */
    protected String f114421k;

    public bfmn(long j, int i, int i2, int i3, int i4, Collection collection, int i5, int i6, int i7) {
        this.f114417g = j;
        this.f114419i = i;
        this.f114412b = i2;
        this.f114413c = i3;
        this.f114414d = i4;
        this.f114418h = collection;
        this.f114420j = i7;
        this.f114415e = i5;
        this.f114416f = i6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* renamed from: a */
    public static bsax m97256a(String str) {
        String[] split;
        int length;
        int i;
        if (str != null && (length = (split = str.trim().split(":")).length) >= 4) {
            try {
                int parseInt = Integer.parseInt(split[0]);
                int parseInt2 = Integer.parseInt(split[1]);
                int parseInt3 = Integer.parseInt(split[2]);
                int parseInt4 = Integer.parseInt(split[length - 1]);
                bsax bsax = new bsax(bgox.f116996P);
                if (parseInt != -1) {
                    bsax.mo70134g(10, parseInt);
                    if (parseInt != 6) {
                        if (length != 5) {
                            return null;
                        }
                        i = Integer.parseInt(split[3]);
                        if (i != -1) {
                            bsax.mo70134g(1, i);
                        }
                        bsax.mo70134g(2, parseInt4);
                        if (parseInt3 != -1) {
                            bsax.mo70134g(3, parseInt3);
                        }
                        if (parseInt2 != -1) {
                            bsax.mo70134g(4, parseInt2);
                        }
                        return bsax;
                    }
                }
                i = -1;
                if (i != -1) {
                }
                bsax.mo70134g(2, parseInt4);
                if (parseInt3 != -1) {
                }
                if (parseInt2 != -1) {
                }
                return bsax;
            } catch (NumberFormatException e) {
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m97258b(bsax bsax) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = -1;
        if (bsax.mo70137i(2)) {
            i = bsax.mo70114b(2);
        } else {
            i = -1;
        }
        if (bsax.mo70137i(4)) {
            i2 = bsax.mo70114b(4);
        } else {
            i2 = -1;
        }
        if (bsax.mo70137i(3)) {
            i3 = bsax.mo70114b(3);
        } else {
            i3 = -1;
        }
        if (bsax.mo70137i(10)) {
            i4 = bsax.mo70114b(10);
        } else {
            i4 = -1;
        }
        if (i4 == 6) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("6:");
            sb.append(i2);
            sb.append(":");
            sb.append(i3);
            sb.append(":");
            sb.append(i);
            return sb.toString();
        }
        if (bsax.mo70137i(1) && i4 != 5) {
            i5 = bsax.mo70114b(1);
        }
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append(i4);
        sb2.append(":");
        sb2.append(i2);
        sb2.append(":");
        sb2.append(i3);
        sb2.append(":");
        sb2.append(i5);
        sb2.append(":");
        sb2.append(i);
        return sb2.toString();
    }

    /* renamed from: a */
    public abstract String mo61934a();

    /* renamed from: a */
    public abstract void mo61935a(bsax bsax);

    /* renamed from: a */
    public abstract boolean mo61936a(bfmn bfmn);

    /* renamed from: b */
    public abstract boolean mo61937b();

    /* renamed from: c */
    public abstract String mo61938c();

    /* renamed from: d */
    public abstract long mo61939d();

    /* renamed from: e */
    public final boolean mo61950e() {
        int i = this.f114412b;
        return i != Integer.MAX_VALUE && i != -1 && this.f114413c >= 0 && this.f114414d >= 0 && mo61937b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof bfmn) {
            bfmn bfmn = (bfmn) obj;
            return this.f114412b == bfmn.f114412b && this.f114413c == bfmn.f114413c && this.f114414d == bfmn.f114414d && this.f114419i == bfmn.f114419i;
        }
    }

    /* renamed from: f */
    public final int mo61951f() {
        int i = this.f114419i;
        if (i == 1) {
            return 3;
        }
        if (i == 2) {
            return 4;
        }
        if (i != 3) {
            return i == 4 ? 6 : 7;
        }
        return 5;
    }

    /* renamed from: g */
    public final bsax mo61952g() {
        bsax bsax = new bsax(bgox.f116996P);
        int i = this.f114412b;
        if (i != Integer.MAX_VALUE && !(this instanceof bfnd)) {
            bsax.mo70134g(2, i);
        }
        int i2 = this.f114414d;
        if (!(i2 == -1 || i2 == Integer.MAX_VALUE)) {
            bsax.mo70134g(3, i2);
        }
        int i3 = this.f114413c;
        if (!(i3 == -1 || i3 == Integer.MAX_VALUE)) {
            bsax.mo70134g(4, i3);
        }
        int i4 = this.f114420j;
        if (i4 != -9999) {
            bsax.mo70134g(5, i4);
        }
        int i5 = this.f114415e;
        int i6 = this.f114416f;
        if (i5 != Integer.MAX_VALUE && i6 != Integer.MAX_VALUE && i5 <= 1296000 && i5 >= -1296000 && i6 <= 2592000 && i6 >= -2592000) {
            bsax bsax2 = new bsax(bgox.f116995O);
            double d = (double) this.f114415e;
            Double.isNaN(d);
            bsax2.mo70134g(1, (int) (d * 694.4444444444445d));
            double d2 = (double) this.f114416f;
            Double.isNaN(d2);
            bsax2.mo70134g(2, (int) (d2 * 694.4444444444445d));
            bsax.mo70107a(9, bsax2);
        }
        bsax.mo70134g(10, mo61951f());
        mo61935a(bsax);
        return bsax;
    }

    public int hashCode() {
        return (((this.f114412b * 2347) ^ (this.f114413c * 937)) ^ (this.f114414d * 101)) ^ (this.f114419i * 3643);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        m97257a(sb, this);
        return sb.toString();
    }

    /* renamed from: b */
    public final bsax mo61948b(long j) {
        if (!mo61950e()) {
            return null;
        }
        bsax bsax = new bsax(bgox.f116997Q);
        bsax.mo70117b(2, this.f114417g + j);
        bsax.mo70118b(1, mo61952g());
        Collection<bfmn> collection = this.f114418h;
        if (collection != null) {
            for (bfmn bfmn : collection) {
                bsax.mo70107a(3, bfmn.mo61952g());
            }
        }
        return bsax;
    }

    /* renamed from: a */
    static void m97257a(StringBuilder sb, bfmn bfmn) {
        if (bfmn != null) {
            sb.append("[cid: ");
            sb.append(bfmn.f114412b);
            sb.append(" mcc: ");
            sb.append(bfmn.f114413c);
            sb.append(" mnc: ");
            sb.append(bfmn.f114414d);
            sb.append(bfmn.mo61938c());
            sb.append(" radioType: ");
            sb.append(bfmn.f114419i);
            sb.append(" signalStrength: ");
            sb.append(bfmn.f114420j);
            sb.append(" timeStamp: ");
            sb.append(bfmn.f114417g);
            sb.append(" neighbors[");
            boolean z = true;
            for (bfmn bfmn2 : bfmn.f114418h) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(bfmn2);
                z = false;
            }
            sb.append("]]");
            return;
        }
        sb.append("null");
    }

    /* renamed from: b */
    public final boolean mo61949b(bfmn bfmn) {
        return this.f114412b == bfmn.f114412b && this.f114413c == bfmn.f114413c && this.f114414d == bfmn.f114414d && this.f114419i == bfmn.f114419i && mo61936a(bfmn);
    }

    /* renamed from: a */
    public final bsax mo61947a(long j) {
        bsax bsax = new bsax(bgox.f117041ah);
        bsax b = mo61948b(j);
        if (b != null) {
            b.mo70134g(5, 2);
            bsax.mo70118b(1, b);
        }
        return bsax;
    }
}
