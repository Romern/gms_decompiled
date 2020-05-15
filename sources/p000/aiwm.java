package p000;

/* renamed from: aiwm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwm extends buqn {

    /* renamed from: a */
    final /* synthetic */ aiwp f69942a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aiwm(aiwp aiwp, String str) {
        super(str);
        this.f69942a = aiwp;
    }

    public final void run() {
        aiwp aiwp = this.f69942a;
        if (!aiwp.f69953f) {
            ajac ajac = aiwp.f69950c;
            sdo.m34959a(aiwp);
            ajac.f70219b.add(aiwp);
            this.f69942a.f69948a.deleteDatabase("copresence_state.db");
            this.f69942a.f69953f = true;
            srn srn = ahfq.f67120a;
        }
    }
}
