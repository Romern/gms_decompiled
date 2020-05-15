package com.google.location.bluemoon.inertialanchor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class ThreeAxisCalibrationData {
    public bsdw bias;
    public float quality;
    public btwl sensorType;
    public long timestampNanos = -1;

    public ThreeAxisCalibrationData(btwl btwl, bsdw bsdw) {
        this.sensorType = btwl;
        this.bias = bsdw.mo70287b();
        this.quality = Float.POSITIVE_INFINITY;
    }

    private void setBias(double d, double d2, double d3) {
        bsdw bsdw = this.bias;
        bsdw.f144228c = d;
        bsdw.f144229d = d2;
        bsdw.f144230e = d3;
    }

    private void setSensorTypeFromInt(int i) {
        this.sensorType = btwl.m118952a(i);
    }
}
