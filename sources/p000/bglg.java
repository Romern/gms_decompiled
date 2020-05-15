package p000;

import java.util.Map;

/* renamed from: bglg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bglg {

    /* renamed from: a */
    public static final Map f116758a = bnhe.m109409a(0, bucs.ENTER, 1, bucs.EXIT);

    /* renamed from: b */
    private static final Map f116759b;

    static {
        bnha a = bnhe.m109406a(9);
        a.mo67695b(0, buce.IN_VEHICLE);
        a.mo67695b(16, buce.IN_ROAD_VEHICLE);
        a.mo67695b(17, buce.IN_RAIL_VEHICLE);
        a.mo67695b(1, buce.ON_BICYCLE);
        a.mo67695b(7, buce.WALKING);
        a.mo67695b(8, buce.RUNNING);
        a.mo67695b(3, buce.STILL);
        a.mo67695b(4, buce.INCONSISTENT);
        a.mo67695b(5, buce.TILTING);
        f116759b = a.mo67618b();
        bnha a2 = bnhe.m109406a(8);
        a2.mo67695b(16, 0);
        a2.mo67695b(17, 1);
        a2.mo67695b(1, 2);
        a2.mo67695b(7, 3);
        a2.mo67695b(8, 4);
        a2.mo67695b(3, 5);
        a2.mo67695b(4, 6);
        a2.mo67695b(5, 7);
        a2.mo67618b();
    }

    /* renamed from: a */
    public static buce m99238a(int i) {
        return (buce) f116759b.get(Integer.valueOf(i));
    }

    /* renamed from: a */
    public static Integer m99239a(buce buce) {
        for (Map.Entry entry : f116759b.entrySet()) {
            if (entry.getValue() == buce) {
                return (Integer) entry.getKey();
            }
        }
        return null;
    }
}
