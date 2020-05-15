package org.webrtc;

public abstract /* synthetic */ class VideoDecoderFactory$$CC {
    public static VideoDecoder createDecoder$$dflt$$(VideoDecoderFactory videoDecoderFactory, VideoCodecInfo videoCodecInfo) {
        videoCodecInfo.getName();
        return videoDecoderFactory.mo86945a();
    }

    public static VideoCodecInfo[] getSupportedCodecs$$dflt$$(VideoDecoderFactory videoDecoderFactory) {
        return new VideoCodecInfo[0];
    }
}
