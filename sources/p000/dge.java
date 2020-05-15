package p000;

import android.content.Context;
import java.io.File;

/* renamed from: dge */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dge {
    /* renamed from: a */
    public static Context m8385a(Context context) {
        bmxy.m108588a(context.isDeviceProtectedStorage());
        return context.createCredentialProtectedStorageContext();
    }

    /* renamed from: a */
    public static void m8386a(Context context, String str, String str2) {
        bmxy.m108588a(context.isCredentialProtectedStorage());
        File a = dft.m8317a(context);
        File file = new File(a, str);
        File file2 = new File(a, str2);
        file.delete();
        dhb.m8476a(file2);
    }
}
