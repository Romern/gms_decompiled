package p000;

/* renamed from: kbg */
final /* synthetic */ class kbg implements bmxj {
    public final Object apply(Object obj) {
        boolean z;
        quo quo;
        bnre i = ((bngx) obj).listIterator();
        do {
            z = true;
            if (!i.hasNext()) {
                return true;
            }
            quo = (quo) i.next();
        } while (!quo.f42182b.equalsIgnoreCase("credentials_enable_service"));
        String str = quo.f42183c;
        if ("false".equalsIgnoreCase(str)) {
            z = false;
        } else if ("true".equalsIgnoreCase(str)) {
        }
        return Boolean.valueOf(z);
    }
}
