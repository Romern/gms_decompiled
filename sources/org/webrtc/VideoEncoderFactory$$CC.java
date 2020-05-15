package org.webrtc;

import org.webrtc.VideoEncoderFactory;

public abstract /* synthetic */ class VideoEncoderFactory$$CC {
    public static VideoEncoderFactory.VideoEncoderSelector getEncoderSelector$$dflt$$(VideoEncoderFactory videoEncoderFactory) {
        return null;
    }

    public static VideoCodecInfo[] getImplementations$$dflt$$(VideoEncoderFactory videoEncoderFactory) {
        return videoEncoderFactory.getSupportedCodecs();
    }
}
