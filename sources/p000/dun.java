package p000;

import java.util.Iterator;
import java.util.TimeZone;

/* renamed from: dun */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dun {

    /* renamed from: a */
    public static final dun f14050a;

    /* renamed from: b */
    private final dul f14051b;

    /* renamed from: c */
    private final dui f14052c;

    static {
        dul a = dul.m9387a();
        a.mo9631b();
        f14050a = new dun(a, dui.m9372b());
    }

    public dun(dul dul, dui dui) {
        this.f14051b = dul;
        this.f14052c = dui;
    }

    /* renamed from: a */
    private final void m9394a(bxew bxew, duk duk) {
        bxew bxew2 = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        switch (bxew.ordinal()) {
            case 1:
                dui dui = this.f14052c;
                dui.mo9633a(duk, dui.f14042a);
                return;
            case 2:
                this.f14051b.mo9630a(duk, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.f14051b.mo9630a(duk, 5, 6);
                return;
            case 4:
                this.f14051b.mo9630a(duk, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.f14051b.mo9630a(duk, 6);
                return;
            case 6:
                this.f14051b.mo9630a(duk, 0);
                return;
            case 7:
                this.f14051b.mo9630a(duk, 1);
                return;
            case 8:
                this.f14051b.mo9630a(duk, 2);
                return;
            case 9:
                this.f14051b.mo9630a(duk, 3);
                return;
            case 10:
                this.f14051b.mo9630a(duk, 4);
                return;
            case 11:
                this.f14051b.mo9630a(duk, 5);
                return;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dun", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ScheduledFenceTime] Invalid time fence type = %s", bxew);
                return;
        }
    }

    /* renamed from: b */
    private final void m9396b(bxew bxew, duk duk) {
        bxew bxew2 = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        switch (bxew.ordinal()) {
            case 1:
                this.f14052c.mo9615a(duk);
                return;
            case 2:
                this.f14051b.mo9632b(duk, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.f14051b.mo9632b(duk, 5, 6);
                return;
            case 4:
                this.f14051b.mo9632b(duk, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.f14051b.mo9632b(duk, 6);
                return;
            case 6:
                this.f14051b.mo9632b(duk, 0);
                return;
            case 7:
                this.f14051b.mo9632b(duk, 1);
                return;
            case 8:
                this.f14051b.mo9632b(duk, 2);
                return;
            case 9:
                this.f14051b.mo9632b(duk, 3);
                return;
            case 10:
                this.f14051b.mo9632b(duk, 4);
                return;
            case 11:
                this.f14051b.mo9632b(duk, 5);
                return;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dun", "b", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("[ScheduledFenceTime] Invalid time fence type for inverse = %s", bxew);
                return;
        }
    }

    /* renamed from: a */
    private static final void m9395a(duk duk, TimeZone timeZone) {
        long a = dqt.m9098a(timeZone, dqt.f13835a);
        Object[] objArr = {timeZone.getID(), Long.valueOf(a)};
        duk.mo9621a(a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x011d, code lost:
        if (r0.f14045c < r14.f14045c) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x011f, code lost:
        return r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0120, code lost:
        return r0;
     */
    /* renamed from: b */
    public final synchronized duj mo9637b(long j) {
        duj duj;
        duj duj2;
        dui dui = this.f14052c;
        if (dui.f14042a.size() != 1 || !((duk) dui.f14042a.iterator().next()).mo9625d(Long.MAX_VALUE)) {
            dul dul = this.f14051b;
            if (dul.f14048a.size() == 1) {
                if (!((duk) dul.f14048a.iterator().next()).mo9625d(604800000)) {
                }
            }
            Iterator it = this.f14052c.f14042a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    duj = duj.f14043a;
                    break;
                }
                duk duk = (duk) it.next();
                if (j <= duk.f14047b) {
                    if (duk.mo9622b(j)) {
                        duj = duj.m9377a(duk.f14047b);
                        break;
                    }
                    long j2 = duk.f14046a;
                    if (j < j2) {
                        duj = duj.m9377a(j2);
                        break;
                    }
                }
            }
            dul dul2 = this.f14051b;
            if (dul2.f14048a.size() != 0) {
                long a = dul.m9386a(j);
                Iterator it2 = dul2.f14048a.iterator();
                boolean z = false;
                while (true) {
                    if (it2.hasNext()) {
                        duk duk2 = (duk) it2.next();
                        if (a <= duk2.f14047b) {
                            if (duk2.mo9622b(a)) {
                                long j3 = duk2.f14047b;
                                if (j3 != 604800000) {
                                    duj2 = duj.m9377a(j + (j3 - a));
                                    break;
                                }
                                z = true;
                            } else {
                                long j4 = duk2.f14046a;
                                if (a < j4) {
                                    duj2 = duj.m9377a(j + (j4 - a));
                                    break;
                                }
                            }
                        }
                    } else {
                        long j5 = 604800000 - a;
                        duk duk3 = (duk) dul2.f14048a.first();
                        if (z) {
                            if (duk3.f14046a == 0) {
                                duj2 = duj.m9377a(j + j5 + duk3.f14047b);
                            }
                        }
                        duj2 = duj.m9377a(j + j5 + duk3.f14046a);
                    }
                }
            } else {
                duj2 = duj.f14043a;
            }
            if (!duj.mo9619a() || !duj2.mo9619a()) {
                if (duj.mo9619a() || !duj2.mo9619a()) {
                    if (duj.mo9619a() && !duj2.mo9619a()) {
                        return duj2;
                    }
                }
            }
        }
        return duj.f14044b;
    }

    /* renamed from: a */
    public final synchronized void mo9634a() {
        this.f14051b.mo9631b();
        this.f14052c.mo9616c();
    }

    /* renamed from: a */
    public final synchronized void mo9635a(bxew bxew, TimeZone timeZone, long j, long j2) {
        if (j2 < j) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dun", "a", 183, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("[ScheduledFenceTime] Invalid time fence %s: (%s, %s)", Integer.valueOf(bxew.f163146n), Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        sdo.m34974b(j2 >= j);
        duk a = duk.m9379a(j, j2);
        if (bxew != bxew.ABSOLUTE_INTERVAL) {
            m9395a(a, timeZone);
            if (a.mo9625d(604800000)) {
                this.f14051b.mo9631b();
                return;
            }
        }
        switch (bxew.ordinal()) {
            case 1:
                dui dui = this.f14052c;
                dui.mo9633a(a, dui.f14042a);
                return;
            case 2:
                this.f14051b.mo9630a(a, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.f14051b.mo9630a(a, 5, 6);
                return;
            case 4:
                this.f14051b.mo9630a(a, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.f14051b.mo9630a(a, 6);
                return;
            case 6:
                this.f14051b.mo9630a(a, 0);
                return;
            case 7:
                this.f14051b.mo9630a(a, 1);
                return;
            case 8:
                this.f14051b.mo9630a(a, 2);
                return;
            case 9:
                this.f14051b.mo9630a(a, 3);
                return;
            case 10:
                this.f14051b.mo9630a(a, 4);
                return;
            case 11:
                this.f14051b.mo9630a(a, 5);
                return;
            default:
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dun", "a", 292, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[ScheduledFenceTime] Invalid time fence type = %s", bxew);
                return;
        }
    }

    /* renamed from: b */
    public final synchronized void mo9638b(bxew bxew, TimeZone timeZone, long j, long j2) {
        if (j2 < j) {
            bnsl bnsl = (bnsl) dss.f13961a.mo68387b();
            bnsl.mo68432a("dun", "b", 222, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68425a("[ScheduledFenceTime] Invalid time fence %s: (%s, %s)", Integer.valueOf(bxew.f163146n), Long.valueOf(j), Long.valueOf(j2));
            return;
        }
        sdo.m34974b(j2 >= j);
        duk a = duk.m9379a(j, j2);
        if (bxew != bxew.ABSOLUTE_INTERVAL) {
            m9395a(a, timeZone);
            if (a.mo9625d(604800000)) {
                this.f14051b.mo9631b();
                return;
            }
        }
        switch (bxew.ordinal()) {
            case 1:
                this.f14052c.mo9615a(a);
                return;
            case 2:
                this.f14051b.mo9632b(a, 0, 1, 2, 3, 4, 5, 6);
                return;
            case 3:
                this.f14051b.mo9632b(a, 5, 6);
                return;
            case 4:
                this.f14051b.mo9632b(a, 0, 1, 2, 3, 4);
                return;
            case 5:
                this.f14051b.mo9632b(a, 6);
                return;
            case 6:
                this.f14051b.mo9632b(a, 0);
                return;
            case 7:
                this.f14051b.mo9632b(a, 1);
                return;
            case 8:
                this.f14051b.mo9632b(a, 2);
                return;
            case 9:
                this.f14051b.mo9632b(a, 3);
                return;
            case 10:
                this.f14051b.mo9632b(a, 4);
                return;
            case 11:
                this.f14051b.mo9632b(a, 5);
                return;
            default:
                bnsl bnsl2 = (bnsl) dss.f13961a.mo68388c();
                bnsl2.mo68432a("dun", "b", 344, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68420a("[ScheduledFenceTime] Invalid time fence type for inverse = %s", bxew);
                return;
        }
    }

    /* renamed from: a */
    public final synchronized boolean mo9636a(long j) {
        Iterator it = this.f14052c.f14042a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((duk) it.next()).mo9622b(j)) {
                    break;
                }
            } else {
                dul dul = this.f14051b;
                long a = dul.m9386a(j);
                Iterator it2 = dul.f14048a.iterator();
                while (it2.hasNext()) {
                    if (((duk) it2.next()).mo9622b(a)) {
                    }
                }
                return false;
            }
        }
        return true;
    }
}
