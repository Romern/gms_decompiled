package p000;

import android.location.Location;
import com.google.android.gms.org.conscrypt.PSKKeyManager;

/* renamed from: bfcf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfcf {
    /* renamed from: a */
    public static beza m96335a(Location location) {
        bxvd da = beza.f113089n.mo74144da();
        double latitude = location.getLatitude();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza = (beza) da.f164949b;
        beza.f113091a |= 1;
        beza.f113092b = latitude;
        double longitude = location.getLongitude();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza2 = (beza) da.f164949b;
        beza2.f113091a |= 2;
        beza2.f113093c = longitude;
        float accuracy = location.getAccuracy();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza3 = (beza) da.f164949b;
        beza3.f113091a |= 4;
        beza3.f113094d = accuracy;
        double altitude = location.getAltitude();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza4 = (beza) da.f164949b;
        beza4.f113091a |= 8;
        beza4.f113095e = altitude;
        float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza5 = (beza) da.f164949b;
        beza5.f113091a |= 32;
        beza5.f113097g = bearingAccuracyDegrees;
        float bearing = location.getBearing();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza6 = (beza) da.f164949b;
        beza6.f113091a |= 16;
        beza6.f113096f = bearing;
        long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza7 = (beza) da.f164949b;
        beza7.f113091a |= 64;
        beza7.f113098h = elapsedRealtimeNanos;
        String provider = location.getProvider();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza8 = (beza) da.f164949b;
        provider.getClass();
        beza8.f113091a |= 4096;
        beza8.f113103m = provider;
        float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza9 = (beza) da.f164949b;
        beza9.f113091a |= 512;
        beza9.f113100j = speedAccuracyMetersPerSecond;
        float speed = location.getSpeed();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza10 = (beza) da.f164949b;
        beza10.f113091a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        beza10.f113099i = speed;
        long time = location.getTime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza11 = (beza) da.f164949b;
        beza11.f113091a |= 1024;
        beza11.f113101k = time;
        float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        beza beza12 = (beza) da.f164949b;
        beza12.f113091a |= 2048;
        beza12.f113102l = verticalAccuracyMeters;
        return (beza) da.mo74062i();
    }
}
