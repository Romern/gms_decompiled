package p000;

/* renamed from: quv */
final /* synthetic */ class quv implements bmxj {

    /* renamed from: a */
    static final bmxj f42211a = new quv();

    private quv() {
    }

    public final Object apply(Object obj) {
        String str = (String) obj;
        return str.endsWith("/") ? str.substring(0, str.length() - 1) : str;
    }
}
