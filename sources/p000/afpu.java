package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;

/* renamed from: afpu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afpu extends afos {

    /* renamed from: i */
    public final rnt f64528i;

    /* renamed from: j */
    private final boolean f64529j;

    public afpu(bbch bbch, FileGroupRequest fileGroupRequest, String str, int i, afot afot, bbep bbep, rnt rnt, boolean z) {
        super("SetFileGroupActivationOperation", bbch, fileGroupRequest, str, i, afot, bbep);
        this.f64528i = rnt;
        this.f64529j = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo34989a() {
        return this.f64529j ? 5 : 6;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34990a(bxvd bxvd, bxvd bxvd2) {
        if (!ceni.m137522f() || !ceni.m137521e()) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxn bpxn = (bpxn) bxvd2.f164949b;
            bpxn bpxn2 = bpxn.f139738g;
            bpxn.f139743d = bpzz.m112457a(4);
            bpxn.f139740a |= 8;
            throw new aaaj(17, "SetFileGroupActivationOperation : Api Disabled");
        } else if (!this.f64461d.equals(this.f64460c.f79959b)) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxn bpxn3 = (bpxn) bxvd2.f164949b;
            bpxn bpxn4 = bpxn.f139738g;
            bpxn3.f139743d = bpzz.m112457a(6);
            bpxn3.f139740a |= 8;
            throw new aaaj(10, "SetFileGroupActivationOperation : Caller not the owner");
        } else {
            FileGroupRequest fileGroupRequest = this.f64460c;
            bavr a = bbfe.m87920a(fileGroupRequest.f79958a, fileGroupRequest.f79959b);
            bbch bbch = this.f64459b;
            boolean z = this.f64529j;
            Object[] objArr = {"MDDManager", a.f101919b, a.f101920c};
            bqga.m112781a(bqdx.m112674a(bbch.mo56063a(), new bbbd(bbch, a, z), bbch.f102327n), new afpt(this, bxvd2), bqfb.INSTANCE);
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64528i.mo11797a(status);
    }
}
