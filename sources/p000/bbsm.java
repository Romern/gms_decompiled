package p000;

import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;

/* renamed from: bbsm */
final /* synthetic */ class bbsm implements bdaq {

    /* renamed from: a */
    private final bbsw f103302a;

    /* renamed from: b */
    private final bqgy f103303b;

    /* renamed from: c */
    private final Boolean f103304c;

    /* renamed from: d */
    private final bqgg f103305d;

    public bbsm(bbsw bbsw, bqgy bqgy, Boolean bool, bqgg bqgg) {
        this.f103302a = bbsw;
        this.f103303b = bqgy;
        this.f103304c = bool;
        this.f103305d = bqgg;
    }

    /* renamed from: a */
    public final void mo54573a(Object obj) {
        bbsw bbsw = this.f103302a;
        bqgy bqgy = this.f103303b;
        Boolean bool = this.f103304c;
        bqgg bqgg = this.f103305d;
        bmxv bmxv = (bmxv) obj;
        boolean z = false;
        if (!bmxv.mo66813a()) {
            if (!((Boolean) bbqt.m88417a(bbsw.f103315a).f103141aj.mo58455c()).booleanValue() && bool.booleanValue()) {
                z = true;
            }
            bqgy.mo69138b(Boolean.valueOf(z));
        } else if (((bcsp) bmxv.mo66814b()).mo57327k().contains(Integer.valueOf((int) BaseMfiEventCallback.TYPE_UNKNOWN_ERROR))) {
            bqgy.mo69137b(bqgg);
        } else {
            bqgy.mo69138b((Object) false);
        }
    }
}
