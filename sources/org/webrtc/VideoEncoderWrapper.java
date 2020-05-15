package org.webrtc;

import org.webrtc.VideoEncoder;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
class VideoEncoderWrapper {
    VideoEncoderWrapper() {
    }

    static VideoEncoder.Callback createEncoderCallback(long j) {
        return new ciut();
    }

    static Integer getScalingSettingsHigh(VideoEncoder.ScalingSettings scalingSettings) {
        Integer num = scalingSettings.f192079c;
        return null;
    }

    static Integer getScalingSettingsLow(VideoEncoder.ScalingSettings scalingSettings) {
        Integer num = scalingSettings.f192078b;
        return null;
    }

    static boolean getScalingSettingsOn(VideoEncoder.ScalingSettings scalingSettings) {
        boolean z = scalingSettings.f192077a;
        return false;
    }
}
