package p000;

import android.content.Context;
import android.location.GeocoderParams;
import com.android.location.provider.GeocodeProvider;
import java.io.IOException;
import java.util.List;

/* renamed from: bfvu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfvu extends GeocodeProvider {

    /* renamed from: a */
    private final bfvy f115446a;

    public bfvu(Context context) {
        this.f115446a = new bfvy(context, new bfvv(new shl(context, (char[]) null)), qws.m33019a(context, "LE"));
    }

    public final String onGetFromLocation(double d, double d2, int i, GeocoderParams geocoderParams, List list) {
        try {
            this.f115446a.mo62334a(geocoderParams.getLocale(), geocoderParams.getClientPackage(), d, d2, i, list);
            return null;
        } catch (IOException e) {
            return e.getMessage();
        } catch (Exception e2) {
            return null;
        }
    }

    public final String onGetFromLocationName(String str, double d, double d2, double d3, double d4, int i, GeocoderParams geocoderParams, List list) {
        try {
            this.f115446a.mo62335a(geocoderParams.getLocale(), geocoderParams.getClientPackage(), str, d, d2, d3, d4, i, list);
            return null;
        } catch (IOException e) {
            return e.getMessage();
        } catch (Exception e2) {
            return null;
        }
    }
}
