package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;

/* renamed from: aanw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanw implements aanv {

    /* renamed from: a */
    static final int[] f28664a = {110000, 230000, 550000, 720000, 840000, 1140000, 1440000, 1740000};

    /* renamed from: b */
    private final int f28665b;

    /* renamed from: c */
    private final bxvd f28666c;

    public aanw(aait aait) {
        int i;
        this.f28665b = aait.f28228h;
        bxvd da = aait.f28219k.mo74144da();
        if ((aait.f28221a & 4) != 0) {
            i = aait.f28224d;
        } else {
            i = m21711c(m21712c().length);
        }
        boolean z = false;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        aait aait2 = (aait) da.f164949b;
        int i2 = aait2.f28221a | 4;
        aait2.f28221a = i2;
        aait2.f28224d = i;
        if ((aait.f28221a & 8) != 0 && aait.f28225e) {
            z = true;
        }
        int i3 = i2 | 8;
        aait2.f28221a = i3;
        aait2.f28225e = z;
        int i4 = aait.f28226f;
        int i5 = i3 | 16;
        aait2.f28221a = i5;
        aait2.f28226f = i4;
        int i6 = aait.f28227g;
        aait2.f28221a = i5 | 32;
        aait2.f28227g = i6;
        this.f28666c = da;
    }

    /* renamed from: a */
    private final void m21709a(String str) {
        aait aait = (aait) this.f28666c.f164949b;
        int i = aait.f28226f;
        int i2 = aait.f28227g;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34);
        sb.append(str);
        sb.append(", good=");
        sb.append(i);
        sb.append(" bad=");
        sb.append(i2);
        Log.w("GCM", sb.toString());
    }

    /* renamed from: b */
    private final int m21710b(int i) {
        bxvd bxvd = this.f28666c;
        int i2 = ((aait) bxvd.f164949b).f28224d;
        if (i2 < 0 || i2 > i - 1) {
            int c = m21711c(i);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            aait aait = (aait) bxvd.f164949b;
            aait aait2 = aait.f28219k;
            aait.f28221a |= 4;
            aait.f28224d = c;
            m21715g();
            bxvd bxvd2 = this.f28666c;
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            aait aait3 = (aait) bxvd2.f164949b;
            aait3.f28221a |= 8;
            aait3.f28225e = false;
            Log.i("GCM", "Reset heartbeat interval");
        }
        return ((aait) this.f28666c.f164949b).f28224d;
    }

    /* renamed from: c */
    private static final int m21711c(int i) {
        int c = (int) cedc.f182364a.mo6606a().mo78862c();
        return (c < 0 || c > i + -1) ? i >> 1 : c;
    }

    /* renamed from: e */
    private final synchronized void m21713e() {
        bxvd bxvd = this.f28666c;
        int i = ((aait) bxvd.f164949b).f28226f + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aait aait = (aait) bxvd.f164949b;
        aait aait2 = aait.f28219k;
        aait.f28221a |= 16;
        aait.f28226f = i;
        bxvd bxvd2 = this.f28666c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        aait aait3 = (aait) bxvd2.f164949b;
        aait3.f28221a |= 8;
        aait3.f28225e = false;
        if (((long) ((aait) this.f28666c.f164949b).f28226f) >= cedc.m136233c()) {
            int i2 = ((aait) this.f28666c.f164949b).f28224d;
            if (i2 < m21712c().length - 1) {
                bxvd bxvd3 = this.f28666c;
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                aait aait4 = (aait) bxvd3.f164949b;
                aait4.f28221a |= 8;
                aait4.f28225e = true;
                bxvd bxvd4 = this.f28666c;
                int i3 = i2 + 1;
                if (bxvd4.f164950c) {
                    bxvd4.mo74035c();
                    bxvd4.f164950c = false;
                }
                aait aait5 = (aait) bxvd4.f164949b;
                aait5.f28221a |= 4;
                aait5.f28224d = i3;
                int a = mo17152a();
                StringBuilder sb = new StringBuilder(41);
                sb.append("Raising heartbeat interval to ");
                sb.append(a);
                m21709a(sb.toString());
            } else {
                m21709a("Resetting heartbeat counters (at max)");
            }
            m21715g();
        }
    }

    /* renamed from: f */
    private final synchronized void m21714f() {
        bxvd bxvd = this.f28666c;
        int i = ((aait) bxvd.f164949b).f28227g + 1;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aait aait = (aait) bxvd.f164949b;
        aait aait2 = aait.f28219k;
        aait.f28221a |= 32;
        aait.f28227g = i;
        if (((long) ((aait) this.f28666c.f164949b).f28227g) < cedc.m136232b()) {
            if (!((aait) this.f28666c.f164949b).f28225e) {
                return;
            }
        }
        if (((aait) this.f28666c.f164949b).f28224d <= 0) {
            m21709a("Resetting heartbeat counters (at min)");
        } else {
            if (mo17156d()) {
                if (!((aait) this.f28666c.f164949b).f28225e) {
                    int a = mo17152a();
                    StringBuilder sb = new StringBuilder(49);
                    sb.append("Dropping heartbeat interval to 0 from ");
                    sb.append(a);
                    m21709a(sb.toString());
                    bxvd bxvd2 = this.f28666c;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    aait aait3 = (aait) bxvd2.f164949b;
                    aait3.f28221a |= 4;
                    aait3.f28224d = 0;
                }
            }
            bxvd bxvd3 = this.f28666c;
            int i2 = ((aait) bxvd3.f164949b).f28224d - 1;
            if (bxvd3.f164950c) {
                bxvd3.mo74035c();
                bxvd3.f164950c = false;
            }
            aait aait4 = (aait) bxvd3.f164949b;
            aait4.f28221a |= 4;
            aait4.f28224d = i2;
            int a2 = mo17152a();
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Lowering heartbeat interval 1 notch to ");
            sb2.append(a2);
            m21709a(sb2.toString());
        }
        bxvd bxvd4 = this.f28666c;
        if (bxvd4.f164950c) {
            bxvd4.mo74035c();
            bxvd4.f164950c = false;
        }
        aait aait5 = (aait) bxvd4.f164949b;
        aait5.f28221a |= 8;
        aait5.f28225e = false;
        m21715g();
    }

    /* renamed from: g */
    private final void m21715g() {
        bxvd bxvd = this.f28666c;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        aait aait = (aait) bxvd.f164949b;
        aait aait2 = aait.f28219k;
        aait.f28221a |= 16;
        aait.f28226f = 0;
        bxvd bxvd2 = this.f28666c;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        aait aait3 = (aait) bxvd2.f164949b;
        aait3.f28221a |= 32;
        aait3.f28227g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo17156d() {
        if (aajg.m21347e(this.f28665b)) {
            return cedc.f182364a.mo6606a().mo78865f();
        }
        return cedc.f182364a.mo6606a().mo78861b();
    }

    public final String toString() {
        return "SimpleIntervalSteppingHeartbeatAlgorithm{" + "interval: " + mo17152a() + ", fall_fast: " + mo17156d() + ", upward_trigger: " + cedc.m136233c() + ", downward_trigger: " + cedc.m136232b() + ", intervals: " + Arrays.toString(m21712c()) + "}";
    }

    /* renamed from: c */
    public static int[] m21712c() {
        String d = cedc.f182364a.mo6606a().mo78863d();
        if (TextUtils.isEmpty(d)) {
            return f28664a;
        }
        String[] split = d.split(",");
        int length = split.length;
        int[] iArr = new int[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            try {
                int parseInt = Integer.parseInt(split[i]);
                if (parseInt <= i2) {
                    String valueOf = String.valueOf(d);
                    Log.e("GCM", valueOf.length() == 0 ? new String("Invalid adaptive wifi heartbeat intervals: ") : "Invalid adaptive wifi heartbeat intervals: ".concat(valueOf));
                    return f28664a;
                }
                iArr[i] = parseInt;
                i++;
                i2 = parseInt;
            } catch (NumberFormatException e) {
                String valueOf2 = String.valueOf(d);
                Log.e("GCM", valueOf2.length() == 0 ? new String("Failed to parse heartbeat intervals: ") : "Failed to parse heartbeat intervals: ".concat(valueOf2));
                return f28664a;
            }
        }
        return iArr;
    }

    /* renamed from: a */
    public final int mo17152a() {
        int[] c = m21712c();
        return c[m21710b(c.length)];
    }

    /* renamed from: a */
    public final void mo17153a(int i) {
        if (i != 1) {
            m21714f();
        } else {
            m21713e();
        }
    }

    /* renamed from: b */
    public final aait mo17154b() {
        m21710b(m21712c().length);
        return (aait) this.f28666c.mo74062i();
    }
}
