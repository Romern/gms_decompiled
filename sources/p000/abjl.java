package p000;

/* renamed from: abjl */
public final /* synthetic */ class abjl implements bmxj {

    /* renamed from: a */
    private final String f57580a;

    public abjl(String str) {
        this.f57580a = str;
    }

    public final Object apply(Object obj) {
        String str = this.f57580a;
        str.getClass();
        bxww bxww = ((bsmk) obj).f145040c;
        if (bxww.containsKey(str)) {
            return (bsmh) bxww.get(str);
        }
        return null;
    }
}
