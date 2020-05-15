package p000;

import com.android.media.remotedisplay.RemoteDisplay;

/* renamed from: qbc */
final /* synthetic */ class qbc implements Runnable {

    /* renamed from: a */
    private final qbn f40855a;

    /* renamed from: b */
    private final RemoteDisplay f40856b;

    /* renamed from: c */
    private final int f40857c;

    public qbc(qbn qbn, RemoteDisplay remoteDisplay, int i) {
        this.f40855a = qbn;
        this.f40856b = remoteDisplay;
        this.f40857c = i;
    }

    public final void run() {
        qbn qbn = this.f40855a;
        RemoteDisplay remoteDisplay = this.f40856b;
        int i = this.f40857c;
        qbn.f40876a.mo23673b("onSetVolume, display=%s, volume=%d", remoteDisplay, Integer.valueOf(i));
        pvc pvc = qbn.f40879f;
        if (pvc != null && pvc.f40388w != null) {
            pvc.mo940b(i);
        }
    }
}
