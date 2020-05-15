package p000;

import java.util.ArrayList;

/* renamed from: bjwa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bjwa {

    /* renamed from: a */
    public final ArrayList f123455a = new ArrayList();

    /* renamed from: a */
    public final void mo65580a(long j) {
        this.f123455a.add(Long.toString(j));
    }

    public final String toString() {
        return bjwb.m104765a("⁣", this.f123455a.toArray(), false);
    }

    /* renamed from: a */
    public final void mo65581a(bxxc bxxc) {
        if (bxxc != null) {
            this.f123455a.add(bjvp.m104734a(bxxc).trim());
        } else {
            this.f123455a.add(null);
        }
    }

    /* renamed from: a */
    public final void mo65582a(String str) {
        this.f123455a.add(str);
    }

    /* renamed from: a */
    public final void mo65583a(bxxc[] bxxcArr) {
        if (bxxcArr != null) {
            this.f123455a.add(bjwb.m104765a("‽", bxxcArr, true));
        } else {
            this.f123455a.add(null);
        }
    }
}
