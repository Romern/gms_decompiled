package p000;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.nio.charset.Charset;

/* renamed from: aanz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aanz extends aany {
    public aanz(Context context) {
        super(context, "fcm_package_info.ldb");
    }

    /* renamed from: a */
    private static final byte[] m21731a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append(":");
        sb.append(i);
        return sb.toString().getBytes(Charset.forName("UTF-8"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bmxv mo17165c(bxvk bxvk) {
        aajw aajw = (aajw) bxvk;
        if (aajw == null) {
            Log.w("GCM", "Provided package info is null.");
        } else if ((aajw.f28322a & 2) != 0) {
            return bmxv.m108566b(m21731a(aajw.f28324c, aajw.f28323b));
        } else {
            Log.w("GCM", "Package was not populated.");
        }
        return bmvz.f131120a;
    }

    /* renamed from: a */
    public final bmxv mo17167a(aamh aamh) {
        return mo17158a(m21731a(aamh.f28457a, aamh.f28458b));
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ bxvk mo17166c(byte[] bArr) {
        return (aajw) bxvk.m124014a(aajw.f28320h, bArr);
    }
}
