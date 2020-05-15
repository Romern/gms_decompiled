package p000;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: amyd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class amyd {

    /* renamed from: a */
    protected static final bnhe f76367a;

    /* renamed from: b */
    public final Map f76368b = new EnumMap(alvf.class);

    /* renamed from: c */
    private final Map f76369c = new EnumMap(alvf.class);

    /* renamed from: d */
    private final int f76370d;

    static {
        bnha h = bnhe.m109414h();
        h.mo67695b(alut.OK, Integer.valueOf(chus.OK.f189211r));
        h.mo67695b(alut.CANCELLED, Integer.valueOf(chus.CANCELLED.f189211r));
        h.mo67695b(alut.UNKNOWN, Integer.valueOf(chus.UNKNOWN.f189211r));
        h.mo67695b(alut.INVALID_ARGUMENT, Integer.valueOf(chus.INVALID_ARGUMENT.f189211r));
        h.mo67695b(alut.DEADLINE_EXCEEDED, Integer.valueOf(chus.DEADLINE_EXCEEDED.f189211r));
        h.mo67695b(alut.NOT_FOUND, Integer.valueOf(chus.NOT_FOUND.f189211r));
        h.mo67695b(alut.ALREADY_EXISTS, Integer.valueOf(chus.ALREADY_EXISTS.f189211r));
        h.mo67695b(alut.PERMISSION_DENIED, Integer.valueOf(chus.PERMISSION_DENIED.f189211r));
        h.mo67695b(alut.RESOURCE_EXHAUSTED, Integer.valueOf(chus.RESOURCE_EXHAUSTED.f189211r));
        h.mo67695b(alut.FAILED_PRECONDITION, Integer.valueOf(chus.FAILED_PRECONDITION.f189211r));
        h.mo67695b(alut.ABORTED, Integer.valueOf(chus.ABORTED.f189211r));
        h.mo67695b(alut.OUT_OF_RANGE, Integer.valueOf(chus.OUT_OF_RANGE.f189211r));
        h.mo67695b(alut.UNIMPLEMENTED, Integer.valueOf(chus.UNIMPLEMENTED.f189211r));
        h.mo67695b(alut.INTERNAL, Integer.valueOf(chus.INTERNAL.f189211r));
        h.mo67695b(alut.UNAVAILABLE, Integer.valueOf(chus.UNAVAILABLE.f189211r));
        h.mo67695b(alut.DATA_LOSS, Integer.valueOf(chus.DATA_LOSS.f189211r));
        h.mo67695b(alut.UNAUTHENTICATED, Integer.valueOf(chus.UNAUTHENTICATED.f189211r));
        f76367a = h.mo67618b();
    }

    public amyd(int i) {
        aluw aluw;
        this.f76370d = i;
        try {
            aluw = (aluw) GeneratedMessageLite.m124014a(aluw.f74347c, mo41557a());
        } catch (bxwf e) {
            aluw = aluw.f74347c;
        }
        int a = aluv.m61928a(aluw.f74350b);
        if ((a == 0 ? 1 : a) == this.f76370d) {
            bnhe b = mo41558b();
            bxwc bxwc = aluw.f74349a;
            int size = bxwc.size();
            for (int i2 = 0; i2 < size; i2++) {
                alvg alvg = (alvg) bxwc.get(i2);
                int a2 = alvd.m61936a(alvg.f74372c);
                if (a2 != 0 && a2 == 3) {
                    m63710a(b, alvg, this.f76368b);
                } else {
                    int a3 = alvd.m61936a(alvg.f74372c);
                    if (a3 != 0 && a3 == 2) {
                        m63710a(f76367a, alvg, this.f76369c);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final int m63709a(alvf alvf, int i, String str, Map map) {
        if (map.containsKey(alvf)) {
            Map map2 = (Map) map.get(alvf);
            Integer valueOf = Integer.valueOf(i);
            if (map2.containsKey(valueOf)) {
                for (alvg alvg : (List) map2.get(valueOf)) {
                    if ((alvg.f74370a & 16) != 0) {
                        alvb alvb = alvg.f74375f;
                        if (alvb == null) {
                            alvb = alvb.f74354c;
                        }
                        int a = alva.m61933a(alvb.f74356a);
                        if (a == 0) {
                            a = 1;
                        }
                        if (a - 1 != 0) {
                            if (str != null) {
                                alvb alvb2 = alvg.f74375f;
                                if (alvb2 == null) {
                                    alvb2 = alvb.f74354c;
                                }
                                if (str.contains(alvb2.f74357b)) {
                                }
                            }
                        }
                    }
                    int a2 = aluy.m61931a(alvg.f74374e);
                    if (a2 != 0) {
                        return a2;
                    }
                    return 1;
                }
            }
        }
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract byte[] mo41557a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract bnhe mo41558b();

    /* renamed from: a */
    private static void m63710a(Map map, alvg alvg, Map map2) {
        alvf a = alvf.m61938a(alvg.f74371b);
        if (a == null) {
            a = alvf.UNKNOWN_OPERATION;
        }
        if (!map2.containsKey(a)) {
            map2.put(a, new HashMap());
        }
        Map map3 = (Map) map2.get(a);
        alut a2 = alut.m61924a(alvg.f74373d);
        if (a2 == null) {
            a2 = alut.OK;
        }
        if (map.containsKey(a2)) {
            alut a3 = alut.m61924a(alvg.f74373d);
            if (a3 == null) {
                a3 = alut.OK;
            }
            Integer num = (Integer) map.get(a3);
            if (!map3.containsKey(num)) {
                map3.put(num, new ArrayList());
            }
            ((List) map3.get(num)).add(alvg);
        }
    }

    /* renamed from: a */
    public final int mo41556a(alvf alvf, int i, String str) {
        return m63709a(alvf, i, str, this.f76369c);
    }
}
