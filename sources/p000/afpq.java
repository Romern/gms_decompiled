package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.mdd.FileGroupRequest;
import com.google.android.gms.mdd.FileGroupResponse;
import java.util.ArrayList;

/* renamed from: afpq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afpq extends afos {

    /* renamed from: i */
    public final afjj f64521i;

    /* renamed from: j */
    private final afoj f64522j;

    public afpq(bbch bbch, afoj afoj, FileGroupRequest fileGroupRequest, String str, int i, afot afot, bbep bbep, afjj afjj) {
        super("GetFileGroupOperation", bbch, fileGroupRequest, str, i, afot, bbep);
        this.f64522j = afoj;
        this.f64521i = afjj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo34989a() {
        return 3;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34990a(bxvd bxvd, bxvd bxvd2) {
        if (!ceni.m137522f()) {
            if (bxvd2.f164950c) {
                bxvd2.mo74035c();
                bxvd2.f164950c = false;
            }
            bpxn bpxn = (bpxn) bxvd2.f164949b;
            bpxn bpxn2 = bpxn.f139738g;
            bpxn.f139743d = bpzz.m112457a(4);
            bpxn.f139740a |= 8;
            throw new aaaj(17, "GetFileGroupOp : Api Disabled");
        }
        if (this.f64522j != null) {
            FileGroupRequest fileGroupRequest = this.f64460c;
            FileGroupResponse fileGroupResponse = (FileGroupResponse) afoj.f64438a.get(afoj.m53354a(fileGroupRequest.f79958a, fileGroupRequest.f79959b, fileGroupRequest.f79960c));
            if (fileGroupResponse != null) {
                this.f64521i.mo34903a(Status.f30107a, fileGroupResponse);
                return;
            }
        }
        ArrayList arrayList = new ArrayList();
        FileGroupRequest fileGroupRequest2 = this.f64460c;
        bavr a = bbfe.m87920a(fileGroupRequest2.f79958a, fileGroupRequest2.f79959b);
        bbch bbch = this.f64459b;
        Object[] objArr = {"MDDManager", a.f101919b, a.f101920c};
        bqga.m112781a(bqdx.m112674a(bqdx.m112674a(bbch.mo56063a(), new bbcd(bbch, a), bbch.f102327n), new afpm(this, bxvd, bxvd2, arrayList), bqfb.INSTANCE), new afpp(this, bxvd2, arrayList), bqfb.INSTANCE);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f64521i.mo34903a(status, null);
    }
}
