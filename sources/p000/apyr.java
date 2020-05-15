package p000;

import java.util.List;

/* renamed from: apyr */
public final /* synthetic */ class apyr implements Runnable {

    /* renamed from: a */
    private final apys f85177a;

    /* renamed from: b */
    private final List f85178b;

    public apyr(apys apys, List list) {
        this.f85177a = apys;
        this.f85178b = list;
    }

    public final void run() {
        apys apys = this.f85177a;
        List list = this.f85178b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            apys.f85180b.mo24335a(((aqdy) list.get(i)).mo73642k()).mo24327b();
        }
    }
}
