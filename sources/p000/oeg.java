package p000;

import android.os.Looper;
import android.os.Message;

/* renamed from: oeg */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oeg extends adzt {

    /* renamed from: a */
    final /* synthetic */ oeh f37343a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oeg(oeh oeh, Looper looper) {
        super(looper);
        this.f37343a = oeh;
    }

    /* renamed from: a */
    public final synchronized void mo22045a() {
        removeMessages(0);
        sendMessageDelayed(obtainMessage(0), 2000);
    }

    /* renamed from: b */
    public final synchronized void mo22046b() {
        removeCallbacksAndMessages(null);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: oeh.a(int, boolean):void
     arg types: [int, int]
     candidates:
      oeh.a(float, int):void
      oee.a(float, int):void
      oeh.a(int, boolean):void */
    public final void handleMessage(Message message) {
        int i;
        int i2;
        if (message.what == 0) {
            oeh oeh = this.f37343a;
            int i3 = oeh.f37344n;
            synchronized (oeh.f37361k) {
                i = oeh.f37362l;
                i2 = -65537 & i;
                oeh.f37362l = i2;
            }
            if (i != i2) {
                oeh.mo22050a(i2, false);
            }
        }
    }
}
