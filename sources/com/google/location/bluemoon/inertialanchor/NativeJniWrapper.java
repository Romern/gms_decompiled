package com.google.location.bluemoon.inertialanchor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class NativeJniWrapper {
    public native void configureMetadata(long j, byte[] bArr);

    public native void deleteOnlineEstimator(long j);

    public native byte[] getClientLog(long j);

    public native byte[] getDebugLog(long j);

    public native boolean getLatestCalibration(long j, ThreeAxisCalibrationData threeAxisCalibrationData);

    public native boolean getLatestPose(long j, Pose pose);

    public native boolean isResultSupported(long j, int i);

    public native boolean isSupported(long j);

    public native long newDefaultOnlineEstimator();

    public native long newOnlineEstimatorWithConfig(byte[] bArr, byte[] bArr2);

    public native boolean registerCallbacks(long j, InertialAnchorBase inertialAnchorBase);

    public native void setCallbackThreadJniEnv(long j);

    public native void setMainThreadJniEnv(long j);

    public native boolean startOnlineEstimator(long j);

    public native void stopOnlineEstimator(long j);
}
