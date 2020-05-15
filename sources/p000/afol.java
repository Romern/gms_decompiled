package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: afol */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afol {
    /* renamed from: a */
    private static void m53355a(Context context, Location location) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
        if (location == null) {
            sharedPreferences.edit().remove("cached_location_lat").remove("cached_location_lon").remove("cached_location_provider").apply();
        } else {
            sharedPreferences.edit().putString("cached_location_lat", String.valueOf(location.getLatitude())).putString("cached_location_lon", String.valueOf(location.getLongitude())).putString("cached_location_provider", location.getProvider()).apply();
        }
    }

    /* renamed from: a */
    public static void m53356a(Context context, bbep bbep) {
        boolean z;
        String str;
        Location location;
        Location location2;
        context.getSharedPreferences("gms_icing_mdd_phenotype_config", 0).edit().clear().commit();
        bxvd da = acbl.f59441c.mo74144da();
        if (C1133kh.m17835a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            z = C1133kh.m17835a(context, "android.permission.ACCESS_COARSE_LOCATION") == 0;
        } else {
            z = true;
        }
        Location location3 = null;
        if (ceni.m137526j() && z) {
            aucb l = aeie.m51878c(context).mo24756l();
            SharedPreferences sharedPreferences = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
            try {
                aucu.m76783a(l, ceni.f183073a.mo6606a().mo79440q(), TimeUnit.SECONDS);
                location = (Location) l.mo50386d();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                location = null;
            }
            if (location == null) {
                bbep.mo34988b(1037);
                sharedPreferences.edit().putBoolean("registered_with_location", false).apply();
            } else {
                bbep.mo34988b(1038);
                if (!sharedPreferences.getBoolean("registered_with_location", false)) {
                    bbep.mo34988b(1039);
                }
                sharedPreferences.edit().putBoolean("registered_with_location", true).apply();
                long a = ayvd.m84899a(ayvd.m84895a(location.getLatitude(), location.getLongitude()), (int) ceni.m137524h());
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                acbl acbl = (acbl) da.f164949b;
                acbl.f59443a = 1 | acbl.f59443a;
                acbl.f59444b = a;
                if (ceni.m137519c()) {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences("gms_icing_mdd_phenotype_registrar", 0);
                    String string = sharedPreferences2.getString("cached_location_lat", null);
                    String string2 = sharedPreferences2.getString("cached_location_lon", null);
                    if (string == null) {
                        location2 = null;
                    } else if (string2 != null) {
                        location2 = new Location(sharedPreferences2.getString("cached_location_provider", "null"));
                        location2.setLatitude(Double.parseDouble(string));
                        location2.setLongitude(Double.parseDouble(string2));
                    } else {
                        location2 = null;
                    }
                    if (!(location2 == null || a == ayvd.m84899a(ayvd.m84895a(location2.getLatitude(), location2.getLongitude()), (int) ceni.m137524h()))) {
                        bbep.mo34988b(1040);
                    }
                }
            }
            if (ceni.m137519c()) {
                location3 = location;
            }
            m53355a(context, location3);
        } else {
            m53355a(context, (Location) null);
            if (ceni.m137526j() && !z) {
                bbep.mo34988b(1066);
            }
        }
        aney a2 = anef.m64089a(context);
        if (!context.getPackageName().equals("com.google.android.gms")) {
            String valueOf = String.valueOf(context.getPackageName());
            str = valueOf.length() == 0 ? new String("com.google.android.gms.icing.mdd#") : "com.google.android.gms.icing.mdd#".concat(valueOf);
        } else {
            str = "com.google.android.gms.icing.mdd";
        }
        a2.mo41761a(str, ((acbl) da.mo74062i()).serializeToBytes());
    }
}
