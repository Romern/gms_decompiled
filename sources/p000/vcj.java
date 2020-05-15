package p000;

import android.content.SyncResult;

/* renamed from: vcj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class vcj implements vcn {

    /* renamed from: a */
    private final uhn f49030a;

    /* renamed from: b */
    private final uih f49031b;

    public vcj(vpu vpu, uih uih) {
        sdo.m34959a(uih);
        this.f49031b = uih;
        this.f49030a = vpu.f49757d;
    }

    /* renamed from: a */
    public final void mo28162a(SyncResult syncResult) {
    }

    /* renamed from: a */
    public final boolean mo28164a() {
        return false;
    }

    /* renamed from: b */
    public final String mo28165b() {
        return "ChangeLogSyncAlgorithm";
    }

    /* renamed from: a */
    public final void mo28163a(vbi vbi, vks vks, SyncResult syncResult) {
        vbe vbe = new vbe(vbj.m39934a(syncResult));
        uij b = this.f49030a.mo27418b(this.f49031b.f47682a);
        vbi.mo28197a(uzy.m39860a(new uzv(b.f47690e + 1, this.f49030a.mo27431d(this.f49031b)), null, 0), null, this.f49031b, Integer.MAX_VALUE, vbe, vks);
    }
}
