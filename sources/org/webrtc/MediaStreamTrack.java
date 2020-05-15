package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class MediaStreamTrack {

    /* renamed from: a */
    private long f191852a;

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum MediaType {
        MEDIA_TYPE_AUDIO(0),
        MEDIA_TYPE_VIDEO(1);
        

        /* renamed from: c */
        private final int f191856c;

        private MediaType(int i) {
            this.f191856c = i;
        }

        static MediaType fromNativeIndex(int i) {
            MediaType[] values = values();
            for (MediaType mediaType : values) {
                if (mediaType.getNative() == i) {
                    return mediaType;
                }
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown native media type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }

        public int getNative() {
            return this.f191856c;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public enum State {
        LIVE,
        ENDED;

        static State fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public MediaStreamTrack(long j) {
        if (j != 0) {
            this.f191852a = j;
            return;
        }
        throw new IllegalArgumentException("nativeTrack may not be null");
    }

    /* renamed from: a */
    static MediaStreamTrack m151186a(long j) {
        if (j == 0) {
            return null;
        }
        String nativeGetKind = nativeGetKind(j);
        if (nativeGetKind.equals("audio")) {
            return new AudioTrack(j);
        }
        if (nativeGetKind.equals("video")) {
            return new VideoTrack(j);
        }
        return null;
    }

    /* renamed from: c */
    private final void m151187c() {
        if (this.f191852a == 0) {
            throw new IllegalStateException("MediaStreamTrack has been disposed.");
        }
    }

    private static native String nativeGetKind(long j);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final long mo86814b() {
        m151187c();
        return this.f191852a;
    }

    /* renamed from: a */
    public void mo86813a() {
        m151187c();
        JniCommon.nativeReleaseRef(this.f191852a);
        this.f191852a = 0;
    }
}
