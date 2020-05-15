package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: rbt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class rbt implements bmzi {

    /* renamed from: a */
    final /* synthetic */ rbu f42593a;

    public rbt(rbu rbu) {
        this.f42593a = rbu;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo6606a() {
        NetworkInfo activeNetworkInfo;
        bxvd da = cagx.f174504d.mo74144da();
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f42593a.f42594a.getSystemService("connectivity");
            if (!(connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null)) {
                int a = cagw.m126619a(activeNetworkInfo.getType());
                if (a != 0) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cagx cagx = (cagx) da.f164949b;
                    cagx.f174507b = a - 2;
                    cagx.f174506a |= 1;
                }
                int subtype = activeNetworkInfo.getSubtype();
                if (subtype != -1) {
                    int a2 = cagu.m126617a(subtype);
                    if (a2 == 0) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        bxuk a3 = bxuk.m123634a(byteArrayOutputStream);
                        a3.mo73853c(2, subtype);
                        a3.mo73851c();
                        bxvd bxvd = (bxvd) da.mo73633b(byteArrayOutputStream.toByteArray());
                    } else {
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        cagx cagx2 = (cagx) da.f164949b;
                        cagx2.f174508c = a2 - 1;
                        cagx2.f174506a |= 2;
                    }
                } else {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cagx cagx3 = (cagx) da.f164949b;
                    cagx3.f174508c = 100;
                    cagx3.f174506a |= 2;
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        } catch (SecurityException e2) {
        }
        return (cagx) da.mo74062i();
    }
}
