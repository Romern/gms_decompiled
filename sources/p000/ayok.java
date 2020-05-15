package p000;

/* renamed from: ayok */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ayok {

    /* renamed from: a */
    public static final bnhe f98122a;

    /* renamed from: b */
    private static final ayoe f98123b = new ayoe(1, "HEADSET_AND_HANDS_FREE", "android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");

    static {
        aynt.m84375a((short) 10498);
        bnha h = bnhe.m109414h();
        h.mo67695b((short) 4363, new ayoe(2, "A2DP", "android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED"));
        h.mo67695b((short) 4360, f98123b);
        h.mo67695b((short) 4382, f98123b);
        f98122a = h.mo67618b();
    }

    /* renamed from: a */
    public static short[] m84383a() {
        return bqct.m112603a(f98122a.keySet());
    }
}
