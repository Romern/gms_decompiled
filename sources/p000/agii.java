package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: agii */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class agii extends agmg {

    /* renamed from: a */
    public final SSLSocketFactory f65590a = null;

    public agii(agmn agmn) {
        super(agmn);
        int i = Build.VERSION.SDK_INT;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo35428a(String str) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo35305a() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35429b() {
    }

    /* renamed from: c */
    public final boolean mo35448c() {
        NetworkInfo networkInfo;
        mo35659q();
        try {
            networkInfo = ((ConnectivityManager) mo35542z().getSystemService("connectivity")).getActiveNetworkInfo();
        } catch (SecurityException e) {
            networkInfo = null;
        }
        return networkInfo != null && networkInfo.isConnected();
    }
}
