package p000;

import com.felicanetworks.sdu.CheckingStatusEventListener;
import com.felicanetworks.sdu.ErrorInfo;

/* renamed from: brgb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class brgb implements CheckingStatusEventListener {

    /* renamed from: a */
    final /* synthetic */ brgc f142796a;

    public brgb(brgc brgc) {
        this.f142796a = brgc;
    }

    public final void errorOccurred(ErrorInfo errorInfo) {
        brhc brhc = this.f142796a.f142799c.f142818f;
        String str = brgj.f142813c;
        String message = errorInfo.getMessage();
        String valueOf = String.valueOf(errorInfo);
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 44 + String.valueOf(valueOf).length());
        sb.append("startCheckingStatus.errorOccurred:");
        sb.append(message);
        sb.append(" the rest ");
        sb.append(valueOf);
        brhc.mo69532a(str, sb.toString(), null);
        brgc brgc = this.f142796a;
        brgc.f142799c.mo69504a(brgc.f142797a);
    }

    public final void finished(int i) {
        brgc brgc = this.f142796a;
        brgc.f142799c.f142819g.execute(new brga(brgc.f142797a));
        this.f142796a.f142799c.mo69515f(4);
        this.f142796a.f142799c.mo69511d();
        this.f142796a.f142799c.mo69509c();
    }
}
