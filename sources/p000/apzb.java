package p000;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: apzb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class apzb {

    /* renamed from: a */
    private static final String[] f85217a = {"/system/bin/su", "/system/xbin/su", "/system/bin/.su", "/system/xbin/.su"};

    /* renamed from: a */
    static List m71213a() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = f85217a;
        for (String str : strArr) {
            File file = new File(str);
            apyz apyz = new apyz();
            apyz.f85205a = str;
            apyz.f85206b = file.exists();
            if (file.exists()) {
                try {
                    apyz.f85207c = apuh.m71026a(file);
                } catch (IOException | NoSuchAlgorithmException e) {
                    apyz.f85207c = null;
                }
            }
            arrayList.add(apyz);
        }
        return arrayList;
    }
}
