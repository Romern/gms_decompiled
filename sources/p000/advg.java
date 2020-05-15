package p000;

import java.util.Locale;
import java.util.Map;

/* renamed from: advg */
final /* synthetic */ class advg implements bmxj {

    /* renamed from: a */
    private final Map f62800a;

    /* renamed from: b */
    private final advx f62801b;

    public advg(Map map, advx advx) {
        this.f62800a = map;
        this.f62801b = advx;
    }

    public final Object apply(Object obj) {
        Map map = this.f62800a;
        advx advx = this.f62801b;
        Locale locale = (Locale) obj;
        String a = adwl.m51282a(locale);
        return map.containsKey(a) ? (advx) map.get(a) : map.containsKey(locale.getLanguage()) ? (advx) map.get(locale.getLanguage()) : advx;
    }
}
