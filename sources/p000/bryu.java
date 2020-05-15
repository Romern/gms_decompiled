package p000;

import java.util.ArrayList;
import java.util.Collections;

/* renamed from: bryu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bryu implements brxe {

    /* renamed from: a */
    private final bmzi f143693a;

    public bryu(bmzi bmzi) {
        this.f143693a = bmzi;
    }

    /* renamed from: a */
    public final bryh mo70011a(brxa brxa) {
        if (!((Boolean) this.f143693a.mo6606a()).booleanValue()) {
            return bryh.f143647a;
        }
        chqo chqo = brxa.f143554b;
        bryr bryr = (bryr) chqo.mo85548a(bryr.f143673b);
        bmxy.m108587a(bryr, "%s missing from CallOptions.", bryr.f143673b);
        bryt bryt = new bryt(bryr);
        chqo chqo2 = new chqo(chqo);
        ArrayList arrayList = new ArrayList(chqo.f189011f.size() + 1);
        arrayList.addAll(chqo.f189011f);
        arrayList.add(bryt);
        chqo2.f189011f = Collections.unmodifiableList(arrayList);
        return bryh.m114873a(chqo2);
    }

    /* renamed from: c */
    public final bryi mo70018c() {
        return bryi.f143654a;
    }

    /* renamed from: b */
    public final bryh mo70016b() {
        return bryh.f143647a;
    }

    /* renamed from: b */
    public final bryh mo70017b(brxa brxa) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryh mo70012a(brxb brxb) {
        return bryh.f143647a;
    }

    /* renamed from: a */
    public final bryi mo70013a(brwz brwz) {
        return bryi.f143654a;
    }

    /* renamed from: a */
    public final bryi mo70014a(brxc brxc) {
        return bryi.f143654a;
    }
}
