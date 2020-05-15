package p000;

import android.content.Context;

/* renamed from: ajeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ajeg implements aiyq {

    /* renamed from: a */
    public final ajej f70420a;

    /* renamed from: b */
    private final buqh f70421b;

    /* renamed from: c */
    private final ajat f70422c;

    /* renamed from: d */
    private final aiyr f70423d;

    /* renamed from: e */
    private final buqn f70424e = new ajef(this, "heartbeat");

    public ajeg(Context context) {
        this.f70422c = (ajat) ahgz.m55754a(context, ajat.class);
        this.f70421b = (buqh) ahgz.m55754a(context, buqh.class);
        this.f70420a = (ajej) ahgz.m55754a(context, ajej.class);
        aiyr aiyr = (aiyr) ahgz.m55754a(context, aiyr.class);
        this.f70423d = aiyr;
        aiyr.mo38295a(this);
    }

    /* renamed from: a */
    public final void mo38545a() {
        if (!this.f70423d.mo38304f()) {
            srn srn = ahfq.f67120a;
            this.f70423d.mo38304f();
            this.f70421b.mo72989e(this.f70424e);
        } else if (!this.f70421b.mo72985b(this.f70424e)) {
            srn srn2 = ahfq.f67120a;
            this.f70422c.mo38426l();
            this.f70421b.mo72983a(this.f70424e, this.f70422c.mo38426l());
        }
    }

    /* renamed from: b */
    public final void mo38287b() {
        mo38545a();
    }

    /* renamed from: a */
    public final void mo38286a(aiyo aiyo) {
        mo38545a();
    }
}
