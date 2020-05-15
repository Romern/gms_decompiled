package org.webrtc;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface VideoDecoderFactory {
    @Deprecated
    /* renamed from: a */
    VideoDecoder mo86945a();

    VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo);

    VideoCodecInfo[] getSupportedCodecs();
}
