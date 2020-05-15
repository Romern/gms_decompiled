package p000;

import android.location.Location;

/* renamed from: bgss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class bgss {

    /* renamed from: a */
    final int f117455a;

    /* renamed from: b */
    final Location f117456b;

    /* renamed from: c */
    final double f117457c;

    public bgss(int i, double d, double d2, double d3) {
        Location location = new Location("Stored");
        this.f117456b = location;
        this.f117455a = i;
        location.setLatitude(d);
        this.f117456b.setLongitude(d2);
        this.f117457c = d3;
    }
}
