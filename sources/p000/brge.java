package p000;

import com.felicanetworks.sdu.DividingEventListener;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: brge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brge implements DividingEventListener {

    /* renamed from: a */
    final /* synthetic */ brgf f142801a;

    public brge(brgf brgf) {
        this.f142801a = brgf;
    }

    public final void errorOccurred(ErrorInfo errorInfo) {
        String valueOf = String.valueOf(errorInfo);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("startDividing.errorOccurred:");
        sb.append(valueOf);
        sb.toString();
        brgg brgg = this.f142801a.f142804c;
        brgg.f142807c.mo69505a(brgg.f142805a);
    }

    public final void finished() {
        brgg brgg = this.f142801a.f142804c;
        brgg.f142807c.f142819g.execute(new brgd(brgg.f142805a));
        this.f142801a.f142804c.f142807c.mo69515f(4);
        this.f142801a.f142804c.f142807c.mo69511d();
        this.f142801a.f142804c.f142807c.mo69509c();
    }
}
