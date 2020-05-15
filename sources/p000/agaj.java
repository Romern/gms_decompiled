package p000;

import android.os.Build;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: agaj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class agaj {

    /* renamed from: a */
    private static InetAddress f65071a;

    /* renamed from: b */
    private static Charset f65072b;

    private agaj() {
    }

    /* renamed from: a */
    public static InetAddress m53801a() {
        InetAddress inetAddress;
        synchronized (agaj.class) {
            try {
                inetAddress = InetAddress.getByName("224.0.0.251");
            } catch (UnknownHostException e) {
                inetAddress = null;
            }
            f65071a = inetAddress;
        }
        return inetAddress;
    }

    /* renamed from: b */
    public static InetAddress m53802b() {
        InetAddress inetAddress;
        synchronized (agaj.class) {
            try {
                inetAddress = InetAddress.getByName("FF02::FB");
            } catch (UnknownHostException e) {
                inetAddress = null;
            }
            f65071a = inetAddress;
        }
        return inetAddress;
    }

    /* renamed from: c */
    public static Charset m53803c() {
        Charset charset;
        synchronized (agaj.class) {
            if (f65072b == null) {
                int i = Build.VERSION.SDK_INT;
                f65072b = StandardCharsets.UTF_8;
            }
            charset = f65072b;
        }
        return charset;
    }
}
