package p000;

import android.os.RecoverySystem;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: avnq */
final /* synthetic */ class avnq implements Callable {

    /* renamed from: a */
    private final avnt f93540a;

    /* renamed from: b */
    private final StringBuilder f93541b;

    /* renamed from: c */
    private final int f93542c;

    public avnq(avnt avnt, StringBuilder sb, int i) {
        this.f93540a = avnt;
        this.f93541b = sb;
        this.f93542c = i;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avmx.a(int, double):void
     arg types: [int, int]
     candidates:
      avmx.a(int, int):void
      avmx.a(int, double):void */
    public final Object call() {
        avnt avnt = this.f93540a;
        StringBuilder sb = this.f93541b;
        int i = this.f93542c;
        avmz avmz = (avmz) avmz.f93475a.mo51589b();
        bxvd da = bohk.f133097c.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bohk bohk = (bohk) da.f164949b;
        bohk.f133100b = 1;
        bohk.f133099a |= 1;
        avmz.f93482b.mo51477a((bohk) da.mo74062i());
        avmq avmq = (avmq) avmq.f93413e.mo51589b();
        String sb2 = sb.toString();
        avmq.f93409a.mo25414c("Reboot with resume.", new Object[0]);
        if (!ssw.m36269a()) {
            avmq.f93409a.mo25416d("Attempting to use unattended reboot on unsupported platform", new Object[0]);
        } else {
            String valueOf = String.valueOf(avmq.mo51395e());
            avmq.f93409a.mo25412b("Rebooting with update token: %s.", valueOf);
            try {
                RecoverySystem.rebootAndApply(avmq.f93419f, valueOf, sb2);
                return null;
            } catch (IOException e) {
                avmq.f93409a.mo25417e("Reboot with resume failed with exception.", e, new Object[0]);
            }
        }
        avnt.f93546e.mo25418e("Unable to reboot with resume.", new Object[0]);
        avnt.f93555j.f93472k.mo51606a(avmx.f93449d);
        avnt.f93555j.mo51402a(i, -1.0d);
        return null;
    }
}
