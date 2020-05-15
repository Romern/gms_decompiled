package org.webrtc;

import org.webrtc.EncodedImage;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public interface VideoEncoder {

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class BitrateAllocation {
        public BitrateAllocation(int[][] iArr) {
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public interface Callback {
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Capabilities {
        public Capabilities(boolean z) {
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class EncodeInfo {
        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ResolutionBitrateLimits {
        public int getFrameSizePixels() {
            throw null;
        }

        public int getMaxBitrateBps() {
            throw null;
        }

        public int getMinBitrateBps() {
            throw null;
        }

        public int getMinStartBitrateBps() {
            throw null;
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class ScalingSettings {

        /* renamed from: a */
        public final boolean f192077a = false;

        /* renamed from: b */
        public final Integer f192078b = null;

        /* renamed from: c */
        public final Integer f192079c = null;

        static {
            new ScalingSettings();
        }

        private ScalingSettings() {
        }

        public final String toString() {
            return "OFF";
        }
    }

    /* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
    public class Settings {
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities) {
        }
    }

    long createNativeVideoEncoder();

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);
}
