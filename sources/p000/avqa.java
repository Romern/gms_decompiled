package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import java.util.Objects;

/* renamed from: avqa */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avqa {

    /* renamed from: a */
    public final bmxv f93761a;

    private avqa(bmxv bmxv) {
        this.f93761a = bmxv;
    }

    /* renamed from: a */
    public static avqa m79037a(Network network, Context context) {
        m79038c(context);
        bmxy.m108588a(true);
        return new avqa(bmxv.m108566b(network));
    }

    /* renamed from: c */
    static void m79038c(Context context) {
        avls.m78745k(context);
        int i = Build.VERSION.SDK_INT;
    }

    /* renamed from: b */
    public final boolean mo51489b(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!this.f93761a.mo66813a()) {
            return connectivityManager.isActiveNetworkMetered();
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities((Network) this.f93761a.mo66814b());
        if (networkCapabilities == null) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (!networkCapabilities.hasCapability(11)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof avqa) {
            int i = Build.VERSION.SDK_INT;
            if (((Network) this.f93761a.mo66814b()).getNetworkHandle() == ((Network) ((avqa) obj).f93761a.mo66814b()).getNetworkHandle()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo51488a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!this.f93761a.mo66813a()) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.getType() == 1;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities((Network) this.f93761a.mo66814b());
        return networkCapabilities != null && networkCapabilities.hasTransport(1);
    }

    public final int hashCode() {
        int i = Build.VERSION.SDK_INT;
        return Objects.hashCode(Long.valueOf(((Network) this.f93761a.mo66814b()).getNetworkHandle()));
    }
}
