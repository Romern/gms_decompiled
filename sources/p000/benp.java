package p000;

import java.util.ArrayList;

/* renamed from: benp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class benp {

    /* renamed from: a */
    public final ArrayList f111886a = new ArrayList();

    /* renamed from: b */
    private final StringBuilder f111887b = new StringBuilder();

    /* renamed from: a */
    public final beno mo60822a() {
        String sb = this.f111887b.toString();
        ArrayList arrayList = this.f111886a;
        return new beno(sb, arrayList.toArray(new Object[arrayList.size()]));
    }

    /* renamed from: a */
    public final void mo60823a(Long l) {
        this.f111886a.add(l);
    }

    /* renamed from: a */
    public final void mo60824a(String str) {
        this.f111887b.append(str);
    }
}
