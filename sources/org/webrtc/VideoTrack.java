package org.webrtc;

import java.util.IdentityHashMap;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class VideoTrack extends MediaStreamTrack {

    /* renamed from: a */
    private final IdentityHashMap f192083a = new IdentityHashMap();

    public VideoTrack(long j) {
        super(j);
    }

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j, long j2);

    /* renamed from: a */
    public final void mo86813a() {
        for (Long l : this.f192083a.values()) {
            long longValue = l.longValue();
            nativeRemoveSink(mo86814b(), longValue);
            nativeFreeSink(longValue);
        }
        this.f192083a.clear();
        super.mo86813a();
    }
}
