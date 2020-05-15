package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ydo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public abstract class ydo implements yfd {

    /* renamed from: b */
    public static final /* synthetic */ int f53663b = 0;

    /* renamed from: d */
    private static final bnny f53664d = bnnt.f131877a.mo68159a(ydn.f53662a).mo67377a();

    /* renamed from: a */
    protected final caae f53665a;

    /* renamed from: c */
    private final Map f53666c = new HashMap();

    protected ydo(caae caae) {
        this.f53665a = caae;
    }

    /* renamed from: a */
    public final caae mo30379a() {
        return this.f53665a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract yfd mo30380a(caae caae, int i);

    /* renamed from: b */
    public final bngx mo30382b() {
        ArrayList arrayList = new ArrayList();
        for (yfd yfd : this.f53666c.values()) {
            arrayList.addAll(yfd.mo30382b());
        }
        return f53664d.mo67379b(arrayList);
    }

    /* renamed from: a */
    public final void mo30381a(cadn cadn) {
        int i = ((caaw) cadn.f172704d.get(0)).f172382b;
        Map map = this.f53666c;
        Integer valueOf = Integer.valueOf(i);
        yfd yfd = (yfd) map.get(valueOf);
        if (yfd == null) {
            yfd = mo30380a(this.f53665a, i);
            this.f53666c.put(valueOf, yfd);
        }
        yfd.mo30381a(cadn);
    }
}
