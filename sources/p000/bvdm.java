package p000;

import java.io.IOException;

/* renamed from: bvdm */
public final /* synthetic */ class bvdm implements bvcv {

    /* renamed from: a */
    private final buwc f155658a;

    public bvdm(buwc buwc) {
        this.f155658a = buwc;
    }

    /* renamed from: a */
    public final void mo73327a() {
        buwc buwc = this.f155658a;
        bvbw bvbw = buwc.f155128h;
        if (bvbw != null && (bvbw instanceof bvcy)) {
            bvcy bvcy = (bvcy) bvbw;
            if (bvcy.mo73332k()) {
                bvcy.mo73331j();
                try {
                    bvcy.mo73329h();
                } catch (IOException e) {
                    bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
                    bnsl.mo68437a(e);
                    bnsl.mo68432a("buwc", "a", 233, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl.mo68405a("Fail to send confirm message");
                }
                buwc.f155121a.countDown();
                return;
            }
            return;
        }
        bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
        bnsl2.mo68432a("buwc", "a", 238, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl2.mo68405a("No connection ready to confirm");
    }
}
