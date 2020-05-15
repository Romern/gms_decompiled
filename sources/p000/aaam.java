package p000;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.util.LruCache;
import com.google.android.gms.common.internal.GetServiceRequest;

/* renamed from: aaam */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaam {

    /* renamed from: a */
    static final LruCache f27845a = new LruCache((int) cdjz.f181084a.mo6606a().mo77784m());

    /* renamed from: a */
    public static zzp m21022a(int i) {
        return (zzp) f27845a.get(Integer.valueOf(i));
    }

    /* renamed from: b */
    public static zzp m21024b(GetServiceRequest getServiceRequest, int i) {
        if (Binder.getCallingUid() == spn.f44932a) {
            return null;
        }
        bxvd da = zzp.f56314g.mo74144da();
        int i2 = getServiceRequest.f30229c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        zzp zzp = (zzp) da.f164949b;
        int i3 = zzp.f56316a | 2;
        zzp.f56316a = i3;
        zzp.f56318c = i2;
        int i4 = i - 1;
        if (i != 0) {
            zzp.f56321f = i4;
            int i5 = i3 | 16;
            zzp.f56316a = i5;
            if (i == 3 || i == 6) {
                String str = getServiceRequest.f30230d;
                str.getClass();
                zzp.f56316a = i5 | 1;
                zzp.f56317b = str;
                try {
                    PackageInfo b = svr.m36484b(rpr.m34216b()).mo26176b(((zzp) da.f164949b).f56317b, 0);
                    if (b != null) {
                        if (b.versionName != null) {
                            String str2 = b.versionName;
                            if (da.f164950c) {
                                da.mo74035c();
                                da.f164950c = false;
                            }
                            zzp zzp2 = (zzp) da.f164949b;
                            str2.getClass();
                            zzp2.f56316a |= 8;
                            zzp2.f56320e = str2;
                        }
                        int i6 = b.versionCode;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        zzp zzp3 = (zzp) da.f164949b;
                        zzp3.f56316a |= 4;
                        zzp3.f56319d = i6;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    String str3 = ((zzp) da.f164949b).f56317b;
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 34);
                    sb.append("Cannot get application info for [");
                    sb.append(str3);
                    sb.append("]");
                    sb.toString();
                }
            }
            return (zzp) da.mo74062i();
        }
        throw null;
    }

    /* renamed from: a */
    public static void m21023a(GetServiceRequest getServiceRequest, int i) {
        zzp b = m21024b(getServiceRequest, i);
        if (b != null) {
            f27845a.put(Integer.valueOf(Binder.getCallingUid()), b);
        }
    }
}
