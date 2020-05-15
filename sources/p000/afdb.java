package p000;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import com.android.volley.ExecutorDelivery;
import com.android.volley.toolbox.DiskBasedCache;
import com.android.volley.toolbox.HurlStack;
import com.google.android.gms.maps.auth.ApiTokenChimeraService;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: afdb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class afdb extends dck implements IInterface {

    /* renamed from: a */
    final /* synthetic */ ApiTokenChimeraService f64193a;

    public afdb() {
        super("com.google.android.gms.maps.auth.IApiTokenService");
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.String.replace(char, char):java.lang.String}
     arg types: [int, int]
     candidates:
      ClspMth{java.lang.String.replace(java.lang.CharSequence, java.lang.CharSequence):java.lang.String}
      ClspMth{java.lang.String.replace(char, char):java.lang.String} */
    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        Bundle bundle;
        String[] a;
        bwai bwai;
        long j;
        long j2;
        if (i != 1) {
            return false;
        }
        Bundle bundle2 = (Bundle) dcl.m8163a(parcel, Bundle.CREATOR);
        ApiTokenChimeraService apiTokenChimeraService = this.f64193a;
        if (apiTokenChimeraService.f79861c == null) {
            Context applicationContext = apiTokenChimeraService.getApplicationContext();
            boolean z = bundle2.getBoolean("M4B", false);
            bwbr bwbr = new bwbr(applicationContext, new HurlStack());
            StrictMode.ThreadPolicy a2 = bwap.f158670a.mo73410a();
            try {
                bwba bwba = new bwba(new DiskBasedCache(new File(applicationContext.getCacheDir(), "com.google.android.gms.maps.volley"), 20971520), bwbr, new bway((((ActivityManager) applicationContext.getSystemService("activity")).getMemoryClass() * 1048576) / 8), new ExecutorDelivery(new adzt(Looper.getMainLooper())));
                bwap.f158670a.mo73411a(a2);
                bwba.start();
                String str = bwbq.f158754a;
                boolean z2 = bwbg.f158726g;
                String format = String.format("android:%s-%s-%s", Build.MANUFACTURER.replace('-', '_'), Build.DEVICE.replace('-', '_'), Build.MODEL.replace('-', '_'));
                bwbf a3 = bwbe.m121693a(applicationContext, z2 ? String.valueOf(format).concat("-wear") : format, String.valueOf(rfx.f42891a), bwba, "com.google.android.gms", z);
                ((bwbe) a3).f158700d.addIfAbsent(new afcx());
                apiTokenChimeraService.f79861c = a3;
                bwbf bwbf = apiTokenChimeraService.f79861c;
                synchronized (bwbf) {
                    ((bwbe) bwbf).f158701e = true;
                }
                ((bwbe) bwbf).mo73433d();
            } catch (Throwable th) {
                bwap.f158670a.mo73411a(a2);
                throw th;
            }
        }
        String string = bundle2.getString("PACKAGE_NAME");
        if (!(string == null || (a = svr.m36484b(apiTokenChimeraService.getApplicationContext()).mo26175a(Binder.getCallingUid())) == null)) {
            List asList = Arrays.asList(a);
            if (asList.contains(string) || asList.contains("com.google.android.gms")) {
                String a4 = bwbc.m121683a(apiTokenChimeraService.getApplicationContext(), string);
                if (a4 == null) {
                    if (bwam.m121655a(ApiTokenChimeraService.f79859a, 6)) {
                        String str2 = ApiTokenChimeraService.f79859a;
                        StringBuilder sb = new StringBuilder(string.length() + 55);
                        sb.append("Certificate footprint was not found for the package: \"");
                        sb.append(string);
                        sb.append("\"");
                        Log.e(str2, sb.toString());
                    }
                    bundle = ApiTokenChimeraService.m67163a(2);
                } else {
                    String string2 = bundle2.getString("API_KEY");
                    if (string2 == null) {
                        if (bwam.m121655a(ApiTokenChimeraService.f79859a, 6)) {
                            Log.e(ApiTokenChimeraService.f79859a, "API Key was not found in the request.");
                        }
                        bundle = ApiTokenChimeraService.m67163a(3);
                    } else {
                        bwaj bwaj = new bwaj(string2, string, a4);
                        bwbf bwbf2 = apiTokenChimeraService.f79861c;
                        long j3 = ApiTokenChimeraService.f79860b;
                        bwan.m121656a(bwbf2, "drd");
                        bwbf2.mo73428a(bwaj);
                        try {
                            bwaj.f158657a.tryAcquire(j3, TimeUnit.MILLISECONDS);
                        } catch (InterruptedException e) {
                        }
                        synchronized (bwaj) {
                            bwai = bwaj.f158658b;
                        }
                        if (bwai == null) {
                            if (bwam.m121655a(ApiTokenChimeraService.f79859a, 6)) {
                                Log.e(ApiTokenChimeraService.f79859a, "Timeout of the request to GMM server");
                            }
                            bundle = ApiTokenChimeraService.m67163a(5);
                        } else if (bwai.f158653a) {
                            Bundle bundle3 = new Bundle(3);
                            bundle3.putString("API_TOKEN", bwai.f158654b);
                            Long l = bwai.f158655c;
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = -1;
                            }
                            bundle3.putLong("EXPIRY_TIME", j);
                            Long l2 = bwai.f158656d;
                            if (l2 != null) {
                                j2 = l2.longValue();
                            } else {
                                j2 = 0;
                            }
                            bundle3.putLong("VALIDITY_DURATION", j2);
                            bundle = bundle3;
                        } else {
                            if (bwam.m121655a(ApiTokenChimeraService.f79859a, 6)) {
                                Log.e(ApiTokenChimeraService.f79859a, "Authentication failed. ");
                            }
                            bundle = ApiTokenChimeraService.m67163a(4);
                        }
                    }
                }
                parcel2.writeNoException();
                dcl.m8169b(parcel2, bundle);
                return true;
            }
        }
        if (bwam.m121655a(ApiTokenChimeraService.f79859a, 6)) {
            String str3 = ApiTokenChimeraService.f79859a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 73);
            sb2.append("Package name \"");
            sb2.append(string);
            sb2.append("\" doesn't match any process executed with the caller's UID.");
            Log.e(str3, sb2.toString());
        }
        bundle = ApiTokenChimeraService.m67163a(1);
        parcel2.writeNoException();
        dcl.m8169b(parcel2, bundle);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public afdb(ApiTokenChimeraService apiTokenChimeraService) {
        super("com.google.android.gms.maps.auth.IApiTokenService");
        this.f64193a = apiTokenChimeraService;
    }
}
