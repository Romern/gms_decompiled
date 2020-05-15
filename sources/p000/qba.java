package p000;

import com.android.media.remotedisplay.RemoteDisplay;

/* renamed from: qba */
final /* synthetic */ class qba implements Runnable {

    /* renamed from: a */
    private final qbn f40851a;

    /* renamed from: b */
    private final RemoteDisplay f40852b;

    public qba(qbn qbn, RemoteDisplay remoteDisplay) {
        this.f40851a = qbn;
        this.f40852b = remoteDisplay;
    }

    public final void run() {
        this.f40851a.mo23880b(this.f40852b);
    }
}
