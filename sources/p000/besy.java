package p000;

import java.util.LinkedList;

/* renamed from: besy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class besy {

    /* renamed from: a */
    protected final LinkedList f112337a = new LinkedList();

    /* renamed from: b */
    public final LinkedList f112338b = new LinkedList();

    /* renamed from: c */
    public long f112339c = -1;

    /* renamed from: d */
    public final bevj f112340d = new bevj();

    /* renamed from: e */
    public final besw f112341e = new besw();

    /* renamed from: f */
    public final besx f112342f = new besx();

    /* renamed from: a */
    public final boolean mo61113a(long j) {
        this.f112338b.addLast(Long.valueOf(j));
        boolean z = false;
        if (this.f112338b.size() >= 2 && j - ((Long) this.f112338b.getFirst()).longValue() >= 110000) {
            z = true;
        }
        while (((Long) this.f112338b.getFirst()).longValue() + 200000 < j) {
            this.f112338b.removeFirst();
        }
        return z;
    }
}
