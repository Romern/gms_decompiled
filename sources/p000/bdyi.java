package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.util.Log;

/* renamed from: bdyi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdyi {

    /* renamed from: a */
    static volatile bmxv f106626a = bmvz.f131120a;

    /* renamed from: b */
    private static final Object f106627b = new Object();

    /* renamed from: a */
    public static boolean m91580a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            StringBuilder sb = new StringBuilder(String.valueOf(authority).length() + 91);
            sb.append(authority);
            sb.append(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported.");
            Log.e("PhenotypeClientHelper", sb.toString());
            return false;
        } else if (f106626a.mo66813a()) {
            return ((Boolean) f106626a.mo66814b()).booleanValue();
        } else {
            synchronized (f106627b) {
                if (f106626a.mo66813a()) {
                    boolean booleanValue = ((Boolean) f106626a.mo66814b()).booleanValue();
                    return booleanValue;
                }
                if (!"com.google.android.gms".equals(context.getPackageName())) {
                    ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", 0);
                    if (resolveContentProvider == null || !"com.google.android.gms".equals(resolveContentProvider.packageName)) {
                        f106626a = bmxv.m108566b(Boolean.valueOf(z));
                        return ((Boolean) f106626a.mo66814b()).booleanValue();
                    }
                }
                try {
                    if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                        z = true;
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
                f106626a = bmxv.m108566b(Boolean.valueOf(z));
                return ((Boolean) f106626a.mo66814b()).booleanValue();
            }
        }
    }
}
