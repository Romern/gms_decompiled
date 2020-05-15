package p000;

/* renamed from: bepf */
final /* synthetic */ class bepf implements bmxj {

    /* renamed from: a */
    private final int f111974a;

    /* renamed from: b */
    private final String f111975b;

    /* renamed from: c */
    private final String f111976c;

    public bepf(int i, String str, String str2) {
        this.f111974a = i;
        this.f111975b = str;
        this.f111976c = str2;
    }

    public final Object apply(Object obj) {
        int i = this.f111974a;
        String str = this.f111975b;
        String str2 = this.f111976c;
        bepk bepk = (bepk) obj;
        if ((bepk.mo60883a() & i) == 0) {
            return null;
        }
        for (StackTraceElement stackTraceElement : bepk.mo60884b()) {
            if (stackTraceElement.getClassName().equals(str) && stackTraceElement.getMethodName().equals(str2)) {
                return Integer.valueOf(i);
            }
        }
        return null;
    }
}
