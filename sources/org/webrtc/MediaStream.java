package org.webrtc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaStream {

    /* renamed from: a */
    public final List f191848a = new ArrayList();

    /* renamed from: b */
    public final List f191849b = new ArrayList();

    /* renamed from: c */
    public final List f191850c = new ArrayList();

    /* renamed from: d */
    public long f191851d;

    public MediaStream(long j) {
        this.f191851d = j;
    }

    /* renamed from: a */
    private static void m151183a(List list, long j) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaStreamTrack mediaStreamTrack = (MediaStreamTrack) it.next();
            if (mediaStreamTrack.mo86814b() == j) {
                mediaStreamTrack.mo86813a();
                it.remove();
                return;
            }
        }
        Logging.m151180b("MediaStream", "Couldn't not find track");
    }

    private static native String nativeGetId(long j);

    private static native boolean nativeRemoveAudioTrack(long j, long j2);

    private static native boolean nativeRemoveVideoTrack(long j, long j2);

    /* access modifiers changed from: package-private */
    public void addNativeAudioTrack(long j) {
        this.f191848a.add(new AudioTrack(j));
    }

    /* access modifiers changed from: package-private */
    public void addNativeVideoTrack(long j) {
        this.f191849b.add(new VideoTrack(j));
    }

    public void dispose() {
        mo86805a();
        while (!this.f191848a.isEmpty()) {
            AudioTrack audioTrack = (AudioTrack) this.f191848a.get(0);
            mo86805a();
            this.f191848a.remove(audioTrack);
            nativeRemoveAudioTrack(this.f191851d, audioTrack.mo86814b());
            audioTrack.mo86813a();
        }
        while (!this.f191849b.isEmpty()) {
            VideoTrack videoTrack = (VideoTrack) this.f191849b.get(0);
            mo86806a(videoTrack);
            videoTrack.mo86813a();
        }
        while (!this.f191850c.isEmpty()) {
            mo86806a((VideoTrack) this.f191850c.get(0));
        }
        JniCommon.nativeReleaseRef(this.f191851d);
        this.f191851d = 0;
    }

    /* access modifiers changed from: package-private */
    public void removeAudioTrack(long j) {
        m151183a(this.f191848a, j);
    }

    /* access modifiers changed from: package-private */
    public void removeVideoTrack(long j) {
        m151183a(this.f191849b, j);
    }

    public final String toString() {
        mo86805a();
        String nativeGetId = nativeGetId(this.f191851d);
        int size = this.f191848a.size();
        int size2 = this.f191849b.size();
        StringBuilder sb = new StringBuilder(String.valueOf(nativeGetId).length() + 30);
        sb.append("[");
        sb.append(nativeGetId);
        sb.append(":A=");
        sb.append(size);
        sb.append(":V=");
        sb.append(size2);
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo86805a() {
        if (this.f191851d == 0) {
            throw new IllegalStateException("MediaStream has been disposed.");
        }
    }

    /* renamed from: a */
    public final void mo86806a(VideoTrack videoTrack) {
        mo86805a();
        this.f191849b.remove(videoTrack);
        this.f191850c.remove(videoTrack);
        nativeRemoveVideoTrack(this.f191851d, videoTrack.mo86814b());
    }
}
