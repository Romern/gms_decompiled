package p000;

import org.webrtc.VideoFrame;

/* renamed from: citx */
public final /* synthetic */ class citx implements Runnable {

    /* renamed from: a */
    private final VideoFrame.I420Buffer f191458a;

    public citx(VideoFrame.I420Buffer i420Buffer) {
        this.f191458a = i420Buffer;
    }

    public final void run() {
        this.f191458a.release();
    }
}
