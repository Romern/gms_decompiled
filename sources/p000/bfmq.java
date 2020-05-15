package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bfmq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmq {

    /* renamed from: a */
    public bfmn f114425a;

    /* renamed from: b */
    public final List f114426b;

    /* renamed from: c */
    public final long f114427c;

    public bfmq() {
        this(20000);
    }

    /* renamed from: a */
    public final long mo61955a() {
        bfmn bfmn = this.f114425a;
        if (bfmn != null) {
            return bfmn.f114417g;
        }
        return 0;
    }

    public final Object clone() {
        return new bfmq(this.f114425a, this.f114427c, this.f114426b);
    }

    public bfmq(long j) {
        this(null, j, new ArrayList());
    }

    private bfmq(bfmn bfmn, long j, List list) {
        this.f114425a = bfmn;
        this.f114427c = j;
        this.f114426b = list;
    }
}
