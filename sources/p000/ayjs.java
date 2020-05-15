package p000;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: ayjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayjs implements ComponentCallbacks2, ayjm {

    /* renamed from: a */
    final C1227nt f97773a = new C1227nt(8);

    /* renamed from: b */
    private Integer f97774b;

    /* renamed from: c */
    private final AtomicLong f97775c = new AtomicLong(0);

    /* renamed from: a */
    public static String m84120a(ayen ayen) {
        StringBuilder sb = new StringBuilder("channel request");
        int i = ayen.f97333a;
        if ((i & 4) != 0) {
            ayei ayei = ayen.f97336d;
            if (ayei == null) {
                ayei = ayei.f97299j;
            }
            int a = ayeh.m83883a(ayei.f97302b);
            if (a == 0) {
                a = 1;
            }
            if (a == 1) {
                sb.append(" (OPEN)");
            } else if (a != 2) {
                sb.append(" (CLOSE)");
            } else {
                sb.append(" (OPEN_ACK)");
            }
        } else if ((i & 8) != 0) {
            sb.append(" (DATA: ");
            ayel ayel = ayen.f97337e;
            if (ayel == null) {
                ayel = ayel.f97321e;
            }
            if ((ayel.f97323a & 2) == 0) {
                sb.append("0");
            } else {
                ayel ayel2 = ayen.f97337e;
                if (ayel2 == null) {
                    ayel2 = ayel.f97321e;
                }
                sb.append(ayel2.f97325c.mo73744a());
            }
            sb.append(")");
        } else if ((i & 16) != 0) {
            sb.append(" (DATA_ACK)");
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo54041b(String str, ayfa ayfa) {
        mo54040a("outbound", String.format(Locale.US, " [%3d:%3d] %s -> %s (via %8s) %-31s %s %s", Integer.valueOf(ayfa.f97438j), Integer.valueOf(ayfa.f97430b), ayfa.f97436h, ayfa.f97433e, str, ayfa.f97431c, ayfa.f97434f, m84121a(ayfa)));
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i >= 10) {
            synchronized (this.f97773a) {
                C1227nt ntVar = this.f97773a;
                int a = ntVar.mo15529a();
                if (a > 0) {
                    if (a <= ntVar.mo15529a()) {
                        int length = ntVar.f26763a.length;
                        int i2 = ntVar.f26764b;
                        if (a < length - i2) {
                            length = i2 + a;
                        }
                        while (i2 < length) {
                            ntVar.f26763a[i2] = null;
                            i2++;
                        }
                        int i3 = ntVar.f26764b;
                        int i4 = length - i3;
                        int i5 = a - i4;
                        ntVar.f26764b = ntVar.f26765c & (i3 + i4);
                        if (i5 > 0) {
                            for (int i6 = 0; i6 < i5; i6++) {
                                ntVar.f26763a[i6] = null;
                            }
                            ntVar.f26764b = i5;
                        }
                    } else {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                }
                this.f97775c.set(System.currentTimeMillis());
            }
        }
    }

    /* renamed from: b */
    public final void mo54042b(String str, ayfa ayfa, String str2) {
        mo54040a("outbound", String.format(Locale.US, "*[%3d:%3d] %s -> %s (via %8s) %-31s %s %s DROPPED %s", Integer.valueOf(ayfa.f97438j), Integer.valueOf(ayfa.f97430b), ayfa.f97436h, ayfa.f97433e, str, ayfa.f97431c, ayfa.f97434f, m84121a(ayfa), str2));
    }

    /* renamed from: a */
    public static String m84121a(ayfa ayfa) {
        if ((ayfa.f97429a & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            return String.valueOf(ayfa.f97435g.mo73744a());
        }
        ayen ayen = ayfa.f97437i;
        if (ayen == null) {
            ayen = ayen.f97331g;
        }
        return m84120a(ayen);
    }

    /* renamed from: a */
    public final void mo54038a(String str, ayfa ayfa) {
        mo54040a("inbound", String.format(Locale.US, " [%3d:%3d] %s -> %s (via %8s) %-31s %s %s", Integer.valueOf(ayfa.f97438j), Integer.valueOf(ayfa.f97430b), ayfa.f97436h, ayfa.f97433e, str, ayfa.f97431c, ayfa.f97434f, m84121a(ayfa)));
    }

    /* renamed from: a */
    public final void mo54039a(String str, ayfa ayfa, String str2) {
        mo54040a("inbound", String.format(Locale.US, "*[%3d:%3d] %s -> %s (via %8s) %-31s %s %s DROPPED %s", Integer.valueOf(ayfa.f97438j), Integer.valueOf(ayfa.f97430b), ayfa.f97436h, ayfa.f97433e, str, ayfa.f97431c, ayfa.f97434f, m84121a(ayfa), str2));
    }

    /* renamed from: a */
    public final void mo54040a(String str, String str2) {
        synchronized (this.f97773a) {
            if (this.f97774b == null) {
                this.f97774b = Integer.valueOf((int) chnj.f188812a.mo6606a().mo85416ao());
            }
            while (this.f97773a.mo15529a() >= this.f97774b.intValue()) {
                this.f97773a.mo15532b();
            }
            this.f97773a.mo15531a(new ayjr(System.currentTimeMillis(), String.format(Locale.US, "%-8s%s", str, str2)));
        }
    }

    /* renamed from: a */
    public final void mo53558a(ssb ssb, boolean z, boolean z2) {
        synchronized (this.f97773a) {
            int a = this.f97773a.mo15529a();
            int i = 0;
            for (int i2 = 0; i2 < a; i2++) {
                i = i + 8 + ((ayjr) this.f97773a.mo15530a(i2)).f97772b.length() + 16;
            }
            int a2 = this.f97773a.mo15529a();
            StringBuilder sb = new StringBuilder(48);
            sb.append("num events: ");
            sb.append(a2);
            sb.append(", bytes used: ");
            sb.append(i);
            ssb.println(sb.toString());
            long j = this.f97775c.get();
            if (j > 0) {
                StringBuilder sb2 = new StringBuilder(74);
                sb2.append("received a lowMemory notification and cleared rpcs at ");
                sb2.append(j);
                ssb.println(sb2.toString());
            }
            int a3 = this.f97773a.mo15529a();
            for (int i3 = 0; i3 < a3; i3++) {
                ayjr ayjr = (ayjr) this.f97773a.mo15530a(i3);
                String a4 = ayjl.m84112a(ayjr.f97771a);
                String str = ayjr.f97772b;
                StringBuilder sb3 = new StringBuilder(String.valueOf(a4).length() + 2 + String.valueOf(str).length());
                sb3.append(a4);
                sb3.append(": ");
                sb3.append(str);
                ssb.println(sb3.toString());
            }
        }
    }
}
