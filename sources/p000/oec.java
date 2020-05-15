package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

/* renamed from: oec */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class oec {

    /* renamed from: b */
    public static final bnsn f37335b = odk.m28481a("CAR.INST");

    /* renamed from: h */
    public static final bnic f37336h = bnic.m109494a("CX", "CC", "NF", "BB", "HK", "MO", "TL", "FJ", "NA", "NU", "CK", "KN", "LC", "VC", "WS", "GB", "IM", "GG", "JE", "AI", "BM", "VG", "KY", "FK", "MS", "PN", "TC", "SH", "VI", "ZW", "AU", "ID", "NZ", "TH", "AG", "BS", "BD", "BT", "BW", "BN", "CY", "DM", "GD", "GY", "IN", "IE", "JP", "KI", "LS", "MW", "MY", "MV", "MT", "MU", "MZ", "NR", "PK", "PG", "SC", "SG", "SB", "LK", "SR", "SZ", "TZ", "TO", "TV", "UG", "ZM", "JM", "KE", "NP", "ZA", "TT");

    /* renamed from: a */
    public boolean f37337a = false;

    /* renamed from: c */
    public final Context f37338c;

    /* renamed from: d */
    public final oeb f37339d = new oeb(this);

    /* renamed from: e */
    public final int f37340e;

    /* renamed from: f */
    public final int f37341f;

    /* renamed from: g */
    final Bitmap.Config f37342g;

    public oec(Context context, int i, int i2, int i3) {
        Geocoder geocoder = new Geocoder(context, Locale.getDefault());
        this.f37341f = i;
        this.f37340e = i2;
        this.f37338c = context;
        if (i3 == 32) {
            this.f37342g = Bitmap.Config.ARGB_8888;
        } else if (i3 != 16) {
            this.f37342g = Bitmap.Config.ALPHA_8;
        } else {
            this.f37342g = Bitmap.Config.RGB_565;
        }
        if (npe.m27160b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || npe.m27160b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            aucb l = aeie.m51878c(context).mo24756l();
            l.mo50373a(new odz(this, geocoder));
            l.mo50372a(oea.f37332a);
            return;
        }
        bnsi c = f37335b.mo68388c();
        c.mo68432a("oec", "<init>", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("No Location permissions. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
    }

    /* renamed from: a */
    static final /* synthetic */ void m28554a(Exception exc) {
        bnsi c = f37335b.mo68388c();
        c.mo68437a(exc);
        c.mo68432a("oec", "a", 93, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("Connection to location service failed. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
    }

    /* renamed from: a */
    private static boolean m28555a(Geocoder geocoder, Location location) {
        if (location == null) {
            bnsi c = f37335b.mo68388c();
            c.mo68432a("oec", "a", 318, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("No location returned. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
            return false;
        }
        try {
            List<Address> fromLocation = geocoder.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
            if (fromLocation != null) {
                if (!fromLocation.isEmpty()) {
                    if (f37336h.contains(fromLocation.get(0).getCountryCode())) {
                        return true;
                    }
                    return false;
                }
            }
            bnsi c2 = f37335b.mo68388c();
            c2.mo68432a("oec", "a", 331, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c2.mo68420a("No country data returned. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
        } catch (IOException e) {
            bnsi c3 = f37335b.mo68388c();
            c3.mo68437a(e);
            c3.mo68432a("oec", "a", 335, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c3.mo68424a("%s%s", "Could not get location for the CarNavigationStatusService. ", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
        }
        return false;
    }

    /* renamed from: a */
    public final byte[] mo22042a() {
        return mo22043a("da_turn_unknown");
    }

    /* renamed from: a */
    public final byte[] mo22043a(String str) {
        return this.f37339d.mo22041a(str, false);
    }

    oec(Context context, int i, int i2, int i3, Geocoder geocoder) {
        this.f37341f = i;
        this.f37340e = i2;
        this.f37338c = context;
        if (i3 == 32) {
            this.f37342g = Bitmap.Config.ARGB_8888;
        } else if (i3 != 16) {
            this.f37342g = Bitmap.Config.ALPHA_8;
        } else {
            this.f37342g = Bitmap.Config.RGB_565;
        }
        if (npe.m27160b(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 || npe.m27160b(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            aucb l = aeie.m51878c(context).mo24756l();
            l.mo50373a(new odz(this, geocoder));
            l.mo50372a(oea.f37332a);
            return;
        }
        bnsi c = f37335b.mo68388c();
        c.mo68432a("oec", "<init>", 83, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        c.mo68420a("No Location permissions. %s", "Defaulting to right hand drive.  Roundabout images may be backwards in LHD countries.");
    }
}
