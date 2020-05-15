package p000;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.util.TimeZone;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: atvf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atvf {

    /* renamed from: a */
    private static final srn f91008a = srn.m36127a(sgj.WALLET_TAP_AND_PAY);

    /* renamed from: a */
    public static btmr m76450a(Context context) {
        String str;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        bxvd da = btmr.f149528n.mo74144da();
        String a = stm.m36299a(Build.BRAND);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a.getClass();
        ((btmr) da.f164949b).f149531b = a;
        String a2 = stm.m36299a(Build.MANUFACTURER);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a2.getClass();
        ((btmr) da.f164949b).f149532c = a2;
        String a3 = stm.m36299a(Build.MODEL);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a3.getClass();
        ((btmr) da.f164949b).f149533d = a3;
        sre.m36089i(context);
        int i = 3;
        int i2 = !sre.m36081a(context.getResources()) ? 3 : 4;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btmr) da.f164949b).f149534e = i2 - 2;
        if (telephonyManager != null) {
            str = stm.m36299a(telephonyManager.getNetworkOperator());
        } else {
            str = "";
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((btmr) da.f164949b).f149535f = str;
        if (telephonyManager == null) {
            i = 4;
        } else if (telephonyManager.getNetworkType() == 0) {
            i = 4;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btmr) da.f164949b).f149536g = i - 2;
        String a4 = stm.m36299a(Build.VERSION.RELEASE);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a4.getClass();
        ((btmr) da.f164949b).f149539j = a4;
        String a5 = stm.m36299a(TimeZone.getDefault().getID());
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a5.getClass();
        ((btmr) da.f164949b).f149540k = a5;
        int c = m76453c(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btmr) da.f164949b).f149541l = c - 2;
        btmq b = m76452b(context);
        if (b != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            b.getClass();
            ((btmr) da.f164949b).f149542m = b;
        }
        if (telephonyManager != null && sfr.f44142a.mo25481a("android.permission.READ_PHONE_STATE") == 0) {
            String a6 = m76451a(telephonyManager.getDeviceId(), 2);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a6.getClass();
            ((btmr) da.f164949b).f149537h = a6;
            String line1Number = telephonyManager.getLine1Number();
            if (line1Number != null) {
                line1Number = line1Number.replaceAll("[\\D]", "");
            }
            String a7 = m76451a(line1Number, 4);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            a7.getClass();
            ((btmr) da.f164949b).f149530a = a7;
        }
        int i3 = Build.VERSION.SDK_INT;
        String a8 = m76451a(Build.getSerial(), 2);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        a8.getClass();
        ((btmr) da.f164949b).f149538i = a8;
        return (btmr) da.mo74062i();
    }

    /* renamed from: b */
    private static btmq m76452b(Context context) {
        try {
            Location location = (Location) aucu.m76783a(aeie.m51878c(context).mo24756l(), 10, TimeUnit.SECONDS);
            if (location == null) {
                return null;
            }
            double latitude = location.getLatitude();
            double longitude = location.getLongitude();
            bxvd da = btmq.f149524c.mo74144da();
            String d = Double.toString(latitude);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            d.getClass();
            ((btmq) da.f164949b).f149526a = d;
            String d2 = Double.toString(longitude);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            d2.getClass();
            ((btmq) da.f164949b).f149527b = d2;
            return (btmq) da.mo74062i();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            bnsl bnsl = (bnsl) f91008a.mo68387b();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atvf", "b", 173, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("FusedLocationProvider getLastLocation() failed");
            return null;
        }
    }

    /* renamed from: c */
    private static int m76453c(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "auto_time_zone") > 0 ? 3 : 4;
        } catch (Settings.SettingNotFoundException e) {
            return 4;
        }
    }

    /* renamed from: a */
    private static String m76451a(String str, int i) {
        String a = stm.m36299a(str);
        return a.length() >= i ? a.substring(a.length() - i) : a;
    }
}
