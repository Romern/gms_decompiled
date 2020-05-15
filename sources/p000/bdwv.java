package p000;

/* renamed from: bdwv */
final /* synthetic */ class bdwv implements bmxj {

    /* renamed from: a */
    static final bmxj f106558a = new bdwv();

    private bdwv() {
    }

    public final Object apply(Object obj) {
        bdwi bdwi = bdwi.UNKNOWN;
        int ordinal = ((bdwi) obj).ordinal();
        if (ordinal == 0) {
            return bxqc.UNKNOWN_REQUEST_REASON;
        }
        if (ordinal == 1) {
            return bxqc.FORCED_SYNC;
        }
        throw new AssertionError();
    }
}
