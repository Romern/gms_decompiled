package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.Set;
import java.util.regex.Pattern;

/* renamed from: pcm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pcm {

    /* renamed from: a */
    public static final bnsn f38841a = odk.m28481a("CAR.WifiNetworkUtil");

    /* renamed from: a */
    public static Network m30202a(ConnectivityManager connectivityManager) {
        Network[] allNetworks = connectivityManager.getAllNetworks();
        if (allNetworks == null) {
            return null;
        }
        for (Network network : allNetworks) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
            if (networkInfo != null && networkInfo.getType() == 1) {
                return network;
            }
        }
        return null;
    }

    /* renamed from: b */
    public static String m30213b(String str) {
        if (!str.startsWith("\"")) {
            String valueOf = String.valueOf(str);
            str = valueOf.length() == 0 ? new String("\"") : "\"".concat(valueOf);
        }
        return !str.endsWith("\"") ? String.valueOf(str).concat("\"") : str;
    }

    /* renamed from: c */
    public static boolean m30214c(String str) {
        return Pattern.compile("^([0-9A-Fa-f]{2}[:]){5}([0-9A-Fa-f]{2})$").matcher(str).matches();
    }

    /* renamed from: d */
    public static boolean m30215d(String str) {
        if (TextUtils.isEmpty(str) || !str.contains(".") || bqbv.m112538b(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static String m30216e(String str) {
        if (str.length() != 2) {
            return str;
        }
        Locale locale = new Locale("", str);
        try {
            return locale.getISO3Country().toUpperCase(Locale.getDefault());
        } catch (MissingResourceException e) {
            bnsi c = f38841a.mo68388c();
            c.mo68437a(e);
            c.mo68432a("pcm", "e", 220, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            c.mo68420a("Couldn't retrieve ISO 3166 country code for locale: %s", locale);
            return locale.getCountry();
        }
    }

    /* renamed from: a */
    public static Pair m30203a(byte[] bArr, int i, int i2) {
        bxxc bxxc;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        wrap.position(i);
        wrap.limit(i + i2);
        short s = wrap.getShort();
        switch (s) {
            case 1:
                bxxc = bixe.f122174d;
                break;
            case 2:
                bxxc = bixa.f122152a;
                break;
            case 3:
                bxxc = bixb.f122154e;
                break;
            case 4:
                bxxc = bixg.f122185d;
                break;
            case 5:
                bxxc = bixh.f122191f;
                break;
            case 6:
                bxxc = biwz.f122147d;
                break;
            case 7:
                bxxc = bixf.f122179e;
                break;
            default:
                throw new IllegalArgumentException("Invalid type returned");
        }
        try {
            bxxb aR = bxxc.mo73646aR();
            aR.mo73631a(wrap.array(), wrap.arrayOffset() + wrap.position(), wrap.remaining());
            bxxc = aR.mo74062i();
        } catch (bxwf e) {
        }
        return Pair.create(Integer.valueOf(s), bxxc);
    }

    /* renamed from: a */
    public static bixd m30204a(Map map, int i) {
        biww a = biww.m102916a(i);
        if (a == null) {
            return bixd.UNKNOWN_SECURITY_MODE;
        }
        if (!map.containsKey(a)) {
            return bixd.UNKNOWN_SECURITY_MODE;
        }
        bixd bixd = (bixd) map.get(a);
        bmxy.m108581a(bixd);
        return bixd;
    }

    /* renamed from: a */
    public static String m30205a(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        String networkCountryIso = telephonyManager.getNetworkCountryIso();
        if (!bmxx.m108577a(networkCountryIso)) {
            return m30216e(networkCountryIso);
        }
        if (telephonyManager.getNetworkType() != 2) {
            networkCountryIso = telephonyManager.getSimCountryIso();
        }
        if (!bmxx.m108577a(networkCountryIso)) {
            return m30216e(networkCountryIso);
        }
        return m30216e(Locale.getDefault().getCountry());
    }

    /* renamed from: a */
    public static String m30206a(WifiInfo wifiInfo) {
        return wifiInfo != null ? m30207a(wifiInfo.getSSID()) : "";
    }

    /* renamed from: a */
    public static String m30207a(String str) {
        if (str != null) {
            return (!str.startsWith("\"") || !str.endsWith("\"") || str.length() <= 1) ? str : str.substring(1, str.length() - 1);
        }
        return "";
    }

    /* renamed from: a */
    public static void m30208a(ConnectivityManager connectivityManager, Network network) {
        int i = Build.VERSION.SDK_INT;
        connectivityManager.bindProcessToNetwork(network);
    }

    /* renamed from: a */
    public static boolean m30209a(Context context, Set set) {
        String a = m30205a(context);
        if (bmxx.m108577a(a) || set.contains(a.toUpperCase(Locale.getDefault())) || set.contains("*")) {
            return true;
        }
        bnsi d = f38841a.mo68390d();
        d.mo68432a("pcm", "a", 174, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        d.mo68405a("Wireless disabled in country");
        return false;
    }

    /* renamed from: a */
    public static boolean m30210a(WifiInfo wifiInfo, WifiManager wifiManager) {
        WifiInfo connectionInfo = wifiManager.getConnectionInfo();
        return connectionInfo != null && m30212a(wifiInfo.getSSID(), connectionInfo.getSSID());
    }

    /* renamed from: a */
    public static boolean m30211a(Iterable iterable, BluetoothDevice bluetoothDevice) {
        String b = bmxx.m108578b(bluetoothDevice.getName());
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            if (b.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m30212a(String str, String str2) {
        return m30207a(str).equals(m30207a(str2));
    }
}
