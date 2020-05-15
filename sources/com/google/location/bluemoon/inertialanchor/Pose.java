package com.google.location.bluemoon.inertialanchor;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class Pose {
    private final bsdw accelBiasMps2;
    public final bsdv attitude;
    private final bsdw gyroBiasRps;
    public final float headingErrorRad;
    private final bsdw positionM;
    public long timestampNanos = 0;
    private final bsdw velocityMps;

    public Pose(btvn btvn) {
        this.timestampNanos = btvn.f152626f;
        this.attitude = btvn.f152621a;
        this.positionM = btvn.f152623c;
        this.gyroBiasRps = btvn.f152624d;
        this.accelBiasMps2 = btvn.f152625e;
        this.velocityMps = btvn.f152622b;
        this.headingErrorRad = 0.0f;
    }

    /* renamed from: a */
    public static Pose m151141a() {
        btvn btvn = new btvn();
        btvn.f152626f = 0;
        bsdv a = bsdv.m115367a();
        bsdv bsdv = btvn.f152621a;
        a.mo70283a(bsdv);
        bsdv.mo70284b();
        btvn.f152621a = bsdv;
        btvn.f152623c = new bsdw();
        btvn.f152622b = new bsdw();
        return new Pose(btvn);
    }

    private void setAccelBiasMps2(double d, double d2, double d3) {
        bsdw bsdw = this.accelBiasMps2;
        bsdw.f144228c = d;
        bsdw.f144229d = d2;
        bsdw.f144230e = d3;
    }

    private void setGyroBiasRps(double d, double d2, double d3) {
        bsdw bsdw = this.gyroBiasRps;
        bsdw.f144228c = d;
        bsdw.f144229d = d2;
        bsdw.f144230e = d3;
    }

    public void setAttitude(double d, double d2, double d3, double d4) {
        this.attitude.mo70282a(d, d2, d3, d4);
    }

    public void setPositionM(double d, double d2, double d3) {
        bsdw bsdw = this.positionM;
        bsdw.f144228c = d;
        bsdw.f144229d = d2;
        bsdw.f144230e = d3;
    }

    public void setVelocityMps(double d, double d2, double d3) {
        bsdw bsdw = this.velocityMps;
        bsdw.f144228c = d;
        bsdw.f144229d = d2;
        bsdw.f144230e = d3;
    }

    /* renamed from: a */
    public final void mo86664a(float[] fArr) {
        bsdv bsdv = this.attitude;
        fArr[0] = (float) bsdv.f144222a;
        fArr[1] = (float) bsdv.f144223b;
        fArr[2] = (float) bsdv.f144224c;
        fArr[3] = (float) bsdv.f144225d;
    }
}
