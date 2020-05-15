package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: yhx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yhx {

    /* renamed from: a */
    private final List f53842a;

    /* renamed from: b */
    private final yfr f53843b;

    public yhx(yfr yfr, int i) {
        this.f53843b = yfr;
        this.f53842a = new ArrayList(i);
    }

    /* renamed from: a */
    public final yht mo30519a() {
        yfr yfr = this.f53843b;
        bmxy.m108582a(yfr, "Must set data source first");
        return new yht(yfr);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ ygx mo30520b() {
        ArrayList arrayList = new ArrayList();
        List list = this.f53842a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((yht) list.get(i)).mo30508c());
        }
        return new yhz(this.f53843b, arrayList);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ yht mo30521c() {
        yht a = mo30519a();
        this.f53842a.add(a);
        return a;
    }
}
