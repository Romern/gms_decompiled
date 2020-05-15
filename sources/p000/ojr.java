package p000;

import android.os.Handler;
import android.os.Message;

/* renamed from: ojr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ojr implements Handler.Callback {

    /* renamed from: a */
    final /* synthetic */ ojt f37802a;

    public ojr(ojt ojt) {
        this.f37802a = ojt;
    }

    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 0:
                ojt ojt = this.f37802a;
                bnsn bnsn = ojt.f37803a;
                ojt.f37804b.mo21131b(message.arg1, message.arg2);
                return true;
            case 1:
                ojt ojt2 = this.f37802a;
                bnsn bnsn2 = ojt.f37803a;
                ojt2.f37804b.mo21138c(message.arg1, message.arg2);
                return true;
            case 2:
                ojt ojt3 = this.f37802a;
                bnsn bnsn3 = ojt.f37803a;
                ojt3.f37804b.mo21141d(message.arg1, message.arg2);
                return true;
            case 3:
                ojt ojt4 = this.f37802a;
                bnsn bnsn4 = ojt.f37803a;
                ojt4.f37804b.mo21119a(message.arg1, message.arg2, ((Boolean) message.obj).booleanValue());
                return true;
            case 4:
                ojt ojt5 = this.f37802a;
                bnsn bnsn5 = ojt.f37803a;
                ojt5.f37804b.mo21118a(message.arg1, message.arg2, (bity) message.obj);
                return true;
            case 5:
                ojt ojt6 = this.f37802a;
                bnsn bnsn6 = ojt.f37803a;
                ojt6.f37804b.mo21121a(message.arg1, (bity) message.obj);
                return true;
            case 6:
                ojt ojt7 = this.f37802a;
                bnsn bnsn7 = ojt.f37803a;
                ojt7.f37804b.mo21142e(message.arg1, message.arg2);
                return true;
            case 7:
                ojt ojt8 = this.f37802a;
                bnsn bnsn8 = ojt.f37803a;
                ojt8.f37804b.mo21120a(message.arg1, message.arg2, (bivu[]) message.obj);
                return true;
            case 8:
                biqq biqq = (biqq) message.obj;
                ojt ojt9 = this.f37802a;
                bnsn bnsn9 = ojt.f37803a;
                ojs ojs = ojt9.f37804b;
                bisf a = bisf.m102781a(biqq.f121319a);
                if (a == null) {
                    a = bisf.STATUS_UNSOLICITED_MESSAGE;
                }
                ojs.mo21125a(a, biqq.f121320b, biqq.f121321c, biqq.f121322d);
                return true;
            case 9:
                ojt ojt10 = this.f37802a;
                bnsn bnsn10 = ojt.f37803a;
                ojt10.f37804b.mo21133b(message.arg1, message.arg2, ((Boolean) message.obj).booleanValue());
                return true;
            case 10:
                ojt ojt11 = this.f37802a;
                bnsn bnsn11 = ojt.f37803a;
                ojt11.f37804b.mo21134b(message.arg1, ((Boolean) message.obj).booleanValue());
                return true;
            case 11:
                ojt ojt12 = this.f37802a;
                bnsn bnsn12 = ojt.f37803a;
                ojt12.f37804b.mo21132b(message.arg1, message.arg2, ((Integer) message.obj).intValue());
                return true;
            case 12:
                ojt ojt13 = this.f37802a;
                bnsn bnsn13 = ojt.f37803a;
                ojt13.f37804b.mo21127a((bivk) message.obj);
                return true;
            case 13:
                ojt ojt14 = this.f37802a;
                bnsn bnsn14 = ojt.f37803a;
                ojt14.f37804b.mo21126a((bitx) message.obj);
                return true;
            default:
                bnsi c = ojt.f37803a.mo68388c();
                c.mo68432a("ojr", "handleMessage", 539, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                c.mo68409a("unhandled message: %d", message.what);
                return true;
        }
    }
}
