package p000;

import android.net.LinkAddress;
import android.net.StaticIpConfiguration;
import android.net.wifi.WifiConfiguration;
import android.os.Build;
import com.felicanetworks.mfc.mfi.BaseMfiEventCallback;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.SecureRandom;

/* renamed from: aiwc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aiwc {
    /* renamed from: a */
    public static boolean m58053a(WifiConfiguration wifiConfiguration, String str) {
        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
        bnsl.mo68432a("aiwc", "a", 55, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Attempting to use static ip.");
        if (str.equals("0.0.0.0") || str.equals("127.0.0.1")) {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
            bnsl2.mo68432a("aiwc", "a", 58, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68420a("Gateway address %s is invalid.", str);
            return false;
        }
        try {
            bqbv.m112536a(str);
            try {
                if (!(InetAddress.getByName(str) instanceof Inet4Address)) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl3.mo68432a("aiwc", "a", 78, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68420a("Gateway address %s is not ipv4.", str);
                    return false;
                }
                String format = String.format("%s.%s", str.substring(0, str.lastIndexOf(".")), Integer.valueOf(new SecureRandom().nextInt(253) + 2));
                try {
                    byte[] address = InetAddress.getByName(format).getAddress();
                    byte b = address[address.length - 1];
                    if (b == 0 || b == 1 || b == -1) {
                        bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl4.mo68432a("aiwc", "a", 96, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl4.mo68420a("Generate static IP address %s failed.", format);
                        return false;
                    }
                    bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl5.mo68432a("aiwc", "a", 100, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl5.mo68420a("Using ip address %s", format);
                    try {
                        LinkAddress linkAddress = (LinkAddress) new ahft(LinkAddress.class, new Class[]{String.class}).mo36405a(String.valueOf(format).concat("/24"));
                        int i = Build.VERSION.SDK_INT;
                        return m58054a(wifiConfiguration, str, linkAddress);
                    } catch (ahfu e) {
                        bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
                        bnsl6.mo68437a(e);
                        bnsl6.mo68432a("aiwc", "a", 109, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl6.mo68405a("Unable to configure static ip.");
                        return false;
                    }
                } catch (UnknownHostException e2) {
                    bnsl bnsl7 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl7.mo68437a(e2);
                    bnsl7.mo68432a("aiwc", "a", 92, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl7.mo68405a("Unable to configure static ip.");
                    return false;
                }
            } catch (UnknownHostException e3) {
                bnsl bnsl8 = (bnsl) ailf.f69111a.mo68390d();
                bnsl8.mo68437a(e3);
                bnsl8.mo68432a("aiwc", "a", 73, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl8.mo68405a("Unable to configure static ip.");
                return false;
            }
        } catch (IllegalArgumentException e4) {
            bnsl bnsl9 = (bnsl) ailf.f69111a.mo68390d();
            bnsl9.mo68437a(e4);
            bnsl9.mo68432a("aiwc", "a", 65, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl9.mo68420a("Gateway address %s is invalid.", str);
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m58054a(WifiConfiguration wifiConfiguration, String str, LinkAddress linkAddress) {
        srn srn = ailf.f69111a;
        try {
            Object a = ahft.m55666a(StaticIpConfiguration.class).mo36405a(new Object[0]);
            try {
                ahft a2 = ahft.m55666a(a);
                a2.mo36406a("ipAddress", linkAddress);
                a2.mo36406a("gateway", InetAddress.getByName(str));
                try {
                    ahft.m55666a(wifiConfiguration).mo36404a("setStaticIpConfiguration", StaticIpConfiguration.class).mo36403a(a);
                    try {
                        ahft a3 = ahft.m55666a(Class.forName("android.net.IpConfiguration$IpAssignment"));
                        Object[] enumConstants = ((Class) a3.f67126a).getEnumConstants();
                        if (enumConstants != null) {
                            int length = enumConstants.length;
                            int i = 0;
                            while (i < length) {
                                Object obj = enumConstants[i];
                                if (bmwb.m108442a(((Enum) obj).name()).equals(bmwb.m108442a("static"))) {
                                    try {
                                        ahft.m55666a(wifiConfiguration).mo36404a("setIpAssignment", obj.getClass()).mo36403a(obj);
                                        bnsl bnsl = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl.mo68432a("aiwc", "a", 248, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl.mo68405a("Successfully configured static ip for lollipop and higher.");
                                        return true;
                                    } catch (ahfu e) {
                                        bnsl bnsl2 = (bnsl) ailf.f69111a.mo68390d();
                                        bnsl2.mo68437a(e);
                                        bnsl2.mo68432a("aiwc", "a", 244, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                                        bnsl2.mo68405a("Unable to configure static ip.");
                                        return false;
                                    }
                                } else {
                                    i++;
                                }
                            }
                            throw new ahfu(new IllegalArgumentException(String.format("Failed to find enum %s", "static")));
                        }
                        throw new ahfu(new IllegalArgumentException(String.format("%s has no enums", a3.f67126a.toString())));
                    } catch (ClassNotFoundException e2) {
                        throw new ahfu(e2);
                    } catch (ahfu e3) {
                        return false;
                    }
                } catch (ahfu e4) {
                    bnsl bnsl3 = (bnsl) ailf.f69111a.mo68390d();
                    bnsl3.mo68437a(e4);
                    bnsl3.mo68432a("aiwc", "a", 225, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68405a("Unable to configure static ip.");
                    return false;
                }
            } catch (ahfu e5) {
                bnsl bnsl4 = (bnsl) ailf.f69111a.mo68390d();
                bnsl4.mo68437a(e5);
                bnsl4.mo68432a("aiwc", "a", (int) BaseMfiEventCallback.TYPE_EXIST_UNKNOWN_CARD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("Unable to configure static ip.");
                return false;
            } catch (UnknownHostException e6) {
                bnsl bnsl5 = (bnsl) ailf.f69111a.mo68390d();
                bnsl5.mo68437a(e6);
                bnsl5.mo68432a("aiwc", "a", (int) BaseMfiEventCallback.TYPE_INTERRUPTED_ERROR, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl5.mo68405a("Unable to configure static ip.");
                return false;
            }
        } catch (ahfu e7) {
            bnsl bnsl6 = (bnsl) ailf.f69111a.mo68390d();
            bnsl6.mo68437a(e7);
            bnsl6.mo68432a("aiwc", "a", 203, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl6.mo68405a("Unable to configure static ip.");
            return false;
        }
    }
}
