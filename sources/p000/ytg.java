package p000;

import java.util.Map;

/* renamed from: ytg */
final /* synthetic */ class ytg implements yuu {

    /* renamed from: a */
    static final yuu f54579a = new ytg();

    private ytg() {
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnid.b(java.lang.Object, java.lang.Iterable):void
     arg types: [java.lang.String, java.lang.Iterable]
     candidates:
      bnhp.b(java.lang.Object, java.lang.Object):void
      bnid.b(java.lang.Object, java.lang.Iterable):void */
    /* renamed from: a */
    public final Object mo30727a(Object obj, Object obj2) {
        String str = (String) obj;
        bnig bnig = (bnig) obj2;
        srn srn = ytj.f54582a;
        try {
            Map a = ytj.f54583b.mo66915a(str);
            bnid a2 = bnig.m109513a();
            for (Map.Entry entry : a.entrySet()) {
                a2.mo67760b((Object) ((String) entry.getKey()), ytj.f54584c.mo66917a().mo66918a((CharSequence) entry.getValue()));
            }
            return a2.mo67757a();
        } catch (IllegalArgumentException e) {
            return bnfc.f131553a;
        }
    }
}
