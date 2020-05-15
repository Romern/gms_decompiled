package p000;

import java.util.Calendar;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: dul */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dul extends dum {

    /* renamed from: a */
    public final TreeSet f14048a;

    private dul(TreeSet treeSet) {
        super(604800000);
        this.f14048a = treeSet;
    }

    /* renamed from: a */
    private final int m9385a(int i) {
        switch (i) {
            case 1:
                return 6;
            case 2:
                return 0;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
                return 3;
            case 6:
                return 4;
            case 7:
                return 5;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dul", "a", 796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[ScheduledFenceTime] Invalid day of week = %s", i);
                return -1;
        }
    }

    /* renamed from: b */
    public final void mo9631b() {
        this.f14048a.clear();
        this.f14048a.add(duk.m9379a(0, 604800000));
    }

    /* renamed from: a */
    static final long m9386a(long j) {
        int i;
        Calendar a = dqt.m9100a(j, dqt.f13835a);
        int i2 = a.get(7);
        switch (i2) {
            case 1:
                i = 6;
                break;
            case 2:
                i = 0;
                break;
            case 3:
                i = 1;
                break;
            case 4:
                i = 2;
                break;
            case 5:
                i = 3;
                break;
            case 6:
                i = 4;
                break;
            case 7:
                i = 5;
                break;
            default:
                bnsl bnsl = (bnsl) dss.f13961a.mo68388c();
                bnsl.mo68432a("dul", "a", 796, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68409a("[ScheduledFenceTime] Invalid day of week = %s", i2);
                i = -1;
                break;
        }
        return (((long) i) * 86400000) + (((long) a.get(11)) * 3600000) + (((long) a.get(12)) * 60000) + (((long) a.get(13)) * 1000) + ((long) a.get(14));
    }

    /* renamed from: b */
    public final void mo9632b(duk duk, int... iArr) {
        TreeSet<duk> treeSet = new TreeSet();
        TreeSet treeSet2 = new TreeSet();
        for (int i : iArr) {
            long j = ((long) i) * 86400000;
            mo9633a(duk.m9379a(duk.f14046a + j, duk.f14047b + j), treeSet2);
        }
        Iterator it = treeSet2.iterator();
        long j2 = -1;
        while (it.hasNext()) {
            duk duk2 = (duk) it.next();
            new Object[1][0] = duk2;
            long j3 = duk2.f14046a;
            if (j3 > 0 && j2 == -1) {
                treeSet.add(duk.m9379a(0, j3));
            } else if (j2 != -1) {
                treeSet.add(duk.m9379a(j2, j3));
            }
            j2 = duk2.f14047b;
        }
        if (j2 < 604800000) {
            treeSet.add(duk.m9379a(j2, 604800000));
        }
        for (duk duk3 : treeSet) {
            mo9633a(duk3, this.f14048a);
        }
    }

    /* renamed from: a */
    static dul m9387a() {
        return new dul(new TreeSet());
    }

    /* renamed from: a */
    public final void mo9630a(duk duk, int... iArr) {
        for (int i : iArr) {
            long j = ((long) i) * 86400000;
            mo9633a(duk.m9379a(duk.f14046a + j, duk.f14047b + j), this.f14048a);
        }
    }
}
