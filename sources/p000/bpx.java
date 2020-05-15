package p000;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: bpx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpx {

    /* renamed from: a */
    public final asse f5329a;

    /* renamed from: b */
    public final EnumSet f5330b;

    public bpx(asse asse) {
        this.f5329a = asse;
        EnumSet enumSet = asse.f89562f;
        ArrayList arrayList = new ArrayList();
        Iterator it = enumSet.iterator();
        while (it.hasNext()) {
            arrayList.add(bxc.m3742a(((assd) it.next()).name()));
        }
        this.f5330b = EnumSet.copyOf(arrayList);
    }

    /* renamed from: a */
    public final long mo3397a() {
        return this.f5329a.f89557a;
    }

    /* renamed from: b */
    public final String mo3398b() {
        return this.f5329a.f89560d;
    }
}
