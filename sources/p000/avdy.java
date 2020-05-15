package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: avdy */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avdy extends avdz {

    /* renamed from: a */
    protected final avdx f93003a = new avdx(this);

    /* renamed from: b */
    final /* synthetic */ bxrt f93004b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public avdy(rkb rkb, bxrt bxrt) {
        super(rkb);
        this.f93004b = bxrt;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo51177a(avdo avdo) {
        avdx avdx = this.f93003a;
        bxrt bxrt = this.f93004b;
        bxvd bxvd = (bxvd) bxrt.mo74142c(5);
        bxvd.mo73625a((bxvk) bxrt);
        bxss bxss = this.f93004b.f164607g;
        if (bxss == null) {
            bxss = bxss.f164728i;
        }
        bxvd bxvd2 = (bxvd) bxss.mo74142c(5);
        bxvd2.mo73625a((bxvk) bxss);
        bxsp bxsp = bxss.f164736g;
        if (bxsp == null) {
            bxsp = bxsp.f164717c;
        }
        bxvd bxvd3 = (bxvd) bxsp.mo74142c(5);
        bxvd3.mo73625a((bxvk) bxsp);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        bxsp bxsp2 = (bxsp) bxvd3.f164949b;
        "201515000".getClass();
        bxsp2.f164719a |= 1;
        bxsp2.f164720b = "201515000";
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        bxss bxss2 = (bxss) bxvd2.f164949b;
        bxsp bxsp3 = (bxsp) bxvd3.mo74062i();
        bxsp3.getClass();
        bxss2.f164736g = bxsp3;
        bxss2.f164730a |= 64;
        bxss bxss3 = (bxss) bxvd2.mo74062i();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        bxrt bxrt2 = (bxrt) bxvd.f164949b;
        bxrt bxrt3 = bxrt.f164599j;
        bxss3.getClass();
        bxrt2.f164607g = bxss3;
        bxrt2.f164601a |= 16;
        avdo.mo51173c(avdx, ((bxrt) bxvd.mo74062i()).mo73642k());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final avac mo11187b(Status status) {
        return new avee(status, null);
    }
}
