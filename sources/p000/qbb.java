package p000;

import com.android.media.remotedisplay.RemoteDisplay;

/* renamed from: qbb */
final /* synthetic */ class qbb implements Runnable {

    /* renamed from: a */
    private final qbn f40853a;

    /* renamed from: b */
    private final RemoteDisplay f40854b;

    public qbb(qbn qbn, RemoteDisplay remoteDisplay) {
        this.f40853a = qbn;
        this.f40854b = remoteDisplay;
    }

    public final void run() {
        qbn qbn = this.f40853a;
        RemoteDisplay remoteDisplay = this.f40854b;
        qbn.f40876a.mo23673b("onDisconnect, display=%s", remoteDisplay);
        qbn.mo23877a((qbx) null);
        if (qbn.findRemoteDisplay(remoteDisplay.getId()) != null) {
            remoteDisplay.setStatus(2);
            qbn.updateDisplay(remoteDisplay);
        }
    }
}
