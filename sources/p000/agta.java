package p000;

import android.content.Context;

/* renamed from: agta */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agta {

    /* renamed from: a */
    public Context f66418a;

    /* renamed from: b */
    public String f66419b;

    /* renamed from: c */
    public Long f66420c;

    /* renamed from: d */
    public String f66421d;

    /* renamed from: e */
    public boolean f66422e;

    /* renamed from: f */
    public Integer f66423f;

    /* renamed from: g */
    public Long f66424g;

    /* renamed from: h */
    public int f66425h;

    public agta() {
    }

    /* renamed from: a */
    public final agtb mo36075a() {
        if (this.f66418a != null && this.f66419b != null && this.f66420c != null && this.f66421d != null && this.f66425h != 0) {
            return new agtb(this);
        }
        throw new IllegalArgumentException("Gcore Registration arguments are not set properly");
    }

    public agta(agtb agtb) {
        this.f66418a = agtb.f66427a;
        this.f66419b = agtb.f66428b;
        this.f66420c = Long.valueOf(agtb.f66429c);
        this.f66421d = agtb.f66430d;
        this.f66422e = agtb.f66431e;
        this.f66425h = agtb.f66434h;
        this.f66423f = Integer.valueOf(agtb.f66432f);
        this.f66424g = Long.valueOf(agtb.f66433g);
    }
}
