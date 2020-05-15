package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: aywe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aywe {

    /* renamed from: a */
    qws f98612a;

    /* renamed from: b */
    qws f98613b;

    /* renamed from: c */
    private final Context f98614c;

    /* renamed from: d */
    private final Executor f98615d;

    aywe() {
    }

    /* renamed from: a */
    public final bqgg mo54476a(aywd aywd, bqgg bqgg) {
        aywb aywb = (aywb) aywd;
        return bqdf.m112620a(bqdx.m112674a(bqgg, new aywi(this, aywb.f98597b, new aywg(aywd), aywb.f98596a), this.f98615d), rjp.class, aywh.f98619a, bqfb.INSTANCE);
    }

    public aywe(Context context, Executor executor) {
        this.f98614c = context;
        this.f98615d = executor;
    }

    /* renamed from: a */
    public final synchronized qws mo54477a(ayvk ayvk) {
        int i = ayvk.f98565b - 1;
        if (i == 0 || i == 1) {
            if (this.f98612a == null) {
                this.f98612a = new qws(this.f98614c, null, null);
            }
            return this.f98612a;
        }
        if (this.f98613b == null) {
            this.f98613b = qws.m33019a(this.f98614c, (String) null);
        }
        return this.f98613b;
    }
}
