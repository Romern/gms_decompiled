package p000;

/* renamed from: bepe */
final /* synthetic */ class bepe implements bmxj {

    /* renamed from: a */
    private final int f111971a;

    /* renamed from: b */
    private final String f111972b;

    /* renamed from: c */
    private final String f111973c;

    public bepe(int i, String str, String str2) {
        this.f111971a = i;
        this.f111972b = str;
        this.f111973c = str2;
    }

    public final Object apply(Object obj) {
        int i = this.f111971a;
        String str = this.f111972b;
        String str2 = this.f111973c;
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
