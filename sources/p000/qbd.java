package p000;

import com.android.media.remotedisplay.RemoteDisplay;

/* renamed from: qbd */
final /* synthetic */ class qbd implements Runnable {

    /* renamed from: a */
    private final qbn f40858a;

    /* renamed from: b */
    private final RemoteDisplay f40859b;

    /* renamed from: c */
    private final int f40860c;

    public qbd(qbn qbn, RemoteDisplay remoteDisplay, int i) {
        this.f40858a = qbn;
        this.f40859b = remoteDisplay;
        this.f40860c = i;
    }

    public final void run() {
        qbn qbn = this.f40858a;
        RemoteDisplay remoteDisplay = this.f40859b;
        int i = this.f40860c;
        qbn.f40876a.mo23673b("onAdjustVolume, display=%s, delta=%d", remoteDisplay, Integer.valueOf(i));
        pvc pvc = qbn.f40879f;
        if (pvc != null && pvc.f40388w != null) {
            pvc.mo942c(i);
        }
    }
}
