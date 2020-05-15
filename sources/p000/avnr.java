package p000;

import java.util.concurrent.Callable;

/* renamed from: avnr */
final /* synthetic */ class avnr implements Callable {

    /* renamed from: a */
    private final avnt f93543a;

    /* renamed from: b */
    private final StringBuilder f93544b;

    public avnr(avnt avnt, StringBuilder sb) {
        this.f93543a = avnt;
        this.f93544b = sb;
    }

    public final Object call() {
        avnt avnt = this.f93543a;
        StringBuilder sb = this.f93544b;
        avmz avmz = (avmz) avmz.f93475a.mo51589b();
        bxvd da = bohk.f133097c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bohk bohk = (bohk) da.f164949b;
        bohk.f133100b = 2;
        bohk.f133099a |= 1;
        avmz.f93482b.mo51477a((bohk) da.mo74062i());
        avnt.f93554i.reboot(sb.toString());
        return null;
    }
}
