package p000;

import android.location.Location;
import android.os.Build;

/* renamed from: bvzl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bvzl {
    /* renamed from: a */
    public static bgow m121626a(Location location) {
        bxvd da = bgow.f116967m.mo74144da();
        double latitude = location.getLatitude();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bgow) da.f164949b).f116969a = latitude;
        double longitude = location.getLongitude();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bgow) da.f164949b).f116970b = longitude;
        long time = location.getTime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((bgow) da.f164949b).f116978j = time;
        if (location.hasAccuracy()) {
            double altitude = location.getAltitude();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116971c = altitude;
        }
        if (location.hasSpeed()) {
            float speed = location.getSpeed();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116972d = speed;
        }
        if (location.hasBearing()) {
            float bearing = location.getBearing();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116973e = bearing;
        }
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116974f = accuracy;
        }
        int i = Build.VERSION.SDK_INT;
        if (location.hasVerticalAccuracy()) {
            float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116975g = verticalAccuracyMeters;
        }
        if (location.hasSpeedAccuracy()) {
            float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116976h = speedAccuracyMetersPerSecond;
        }
        if (location.hasBearingAccuracy()) {
            float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116977i = bearingAccuracyDegrees;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (location.hasElapsedRealtimeUncertaintyNanos()) {
            long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116979k = elapsedRealtimeNanos;
            double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            ((bgow) da.f164949b).f116980l = elapsedRealtimeUncertaintyNanos;
        }
        return (bgow) da.mo74062i();
    }
}
