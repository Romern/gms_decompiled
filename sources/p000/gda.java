package p000;

import android.media.AudioTrack;

/* renamed from: gda */
public final /* synthetic */ class gda implements Runnable {

    /* renamed from: a */
    private final gdd f17910a;

    /* renamed from: b */
    private final int f17911b;

    public gda(gdd gdd, int i) {
        this.f17910a = gdd;
        this.f17911b = i;
    }

    public final void run() {
        gdd gdd = this.f17910a;
        int i = this.f17911b;
        AudioTrack audioTrack = gdd.f17921a[i];
        if (audioTrack != null) {
            audioTrack.release();
        }
        gdd.f17924d[i].getLooper().quit();
    }
}
