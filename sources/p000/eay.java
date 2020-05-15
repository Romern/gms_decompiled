package p000;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import java.util.Collections;
import java.util.Locale;

/* renamed from: eay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class eay extends dyd implements aehz {

    /* renamed from: b */
    public static final dxr f14581b = new dxr(new eax(), "UserLocationProducer", new int[]{1}, null);

    public eay(Context context, doh doh, String str, dqb dqb) {
        super(context, doh, f14581b, str, dqb);
    }

    /* renamed from: a */
    public final void mo9845a() {
        ean a = ean.m9992a();
        Object[] objArr = {this, Integer.valueOf(a.f14560d.size())};
        if (a.f14560d.isEmpty()) {
            a.mo9911b();
        }
        a.f14560d.add(this);
    }

    /* renamed from: b */
    public final void mo9848b() {
        ean a = ean.m9992a();
        Object[] objArr = {this, Integer.valueOf(a.f14560d.size())};
        a.f14560d.remove(this);
        if (a.f14560d.isEmpty()) {
            a.f14559c.mo34511a(Collections.emptyList(), false);
            aesh aesh = a.f14558b;
            if (aesh != null) {
                aesh.mo34507b();
            }
            new Object[1][0] = ean.f14556e;
            ean.f14556e = null;
        }
    }

    /* renamed from: a */
    public final void mo7032a(Location location) {
        int i = 2;
        Object[] objArr = {Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())};
        bxvd da = bxnm.f164050i.mo74144da();
        int b = ayuo.m84849b(location.getLatitude());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxnm bxnm = (bxnm) da.f164949b;
        bxnm.f164053a |= 1;
        bxnm.f164054b = b;
        int b2 = ayuo.m84849b(location.getLongitude());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxnm bxnm2 = (bxnm) da.f164949b;
        bxnm2.f164053a |= 2;
        bxnm2.f164055c = b2;
        if (location.hasSpeed()) {
            float speed = location.getSpeed();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnm bxnm3 = (bxnm) da.f164949b;
            bxnm3.f164053a |= 4;
            bxnm3.f164056d = speed;
        }
        if (location.hasBearing()) {
            float bearing = location.getBearing();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnm bxnm4 = (bxnm) da.f164949b;
            bxnm4.f164053a |= 8;
            bxnm4.f164057e = bearing;
        }
        if (location.hasAltitude()) {
            double altitude = location.getAltitude();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnm bxnm5 = (bxnm) da.f164949b;
            bxnm5.f164053a |= 16;
            bxnm5.f164058f = altitude;
        }
        if (location.hasAccuracy()) {
            float accuracy = location.getAccuracy();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxnm bxnm6 = (bxnm) da.f164949b;
            bxnm6.f164053a |= 32;
            bxnm6.f164059g = accuracy;
        }
        String upperCase = location.getProvider().toUpperCase(Locale.US);
        if (TextUtils.equals(upperCase, "UNKNOWN")) {
            i = 1;
        } else if (!TextUtils.equals(upperCase, "WIFI")) {
            i = !TextUtils.equals(upperCase, "CELL") ? !TextUtils.equals(upperCase, "GPS") ? !TextUtils.equals(upperCase, "FUSED") ? !TextUtils.equals(upperCase, "IPGEO") ? !TextUtils.equals(upperCase, "MANUAL") ? 1 : 7 : 6 : 5 : 4 : 3;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxnm bxnm7 = (bxnm) da.f164949b;
        bxnm7.f164060h = i - 1;
        bxnm7.f164053a |= 64;
        tip tip = new tip(3, 1, 1);
        tip.mo26574a(tka.m37117a(location.getTime()));
        tip.mo26572a(bxnm.f164051j, (bxnm) da.mo74062i());
        mo9856c(tip.mo26570a());
    }

    /* renamed from: a */
    public final void mo9854a(dwa dwa) {
        ean a = ean.m9992a();
        new Object[1][0] = dwa;
        if (a.f14557a.mo9897a(dwa)) {
            a.mo9911b();
        }
    }

    /* renamed from: a */
    public final void mo9855a(dwa dwa, dwa dwa2) {
        ean a = ean.m9992a();
        Object[] objArr = {dwa, dwa2};
        a.mo9912c();
        if (a.f14557a.mo9898a(dwa, dwa2)) {
            a.mo9911b();
        }
    }
}
