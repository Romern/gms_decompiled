package com.google.android.gms.chimera;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import com.google.android.gms.common.app.BaseApplicationContext;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class GmsModuleInitializer {
    private static final String TAG = "GmsModuleInitializer";
    private static boolean initialized = false;

    public static void initializeModuleV0(Context context, BaseApplicationContext baseApplicationContext) {
        bnic bnic;
        if (!initialized) {
            new rpr(context, baseApplicationContext);
            int i = Build.VERSION.SDK_INT;
            if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
                bnic = bnic.m109495a((Collection) Arrays.asList(rsv.m34363a()));
            } else {
                bnic = null;
            }
            rtc.m34380a(context, bnic);
            aymt.m84282a(context);
            eoh.f15386a = context;
            bdyx.m91614a(context);
            ryu.m34677a();
            aaao.m21026a();
            svr.f45246a = new ayku();
            spx.f44955a = new ayks();
            int i2 = Build.VERSION.SDK_INT;
            sft.f44147a.mo25487a(context.getPackageManager());
            sgd.m35198a(baseApplicationContext);
            rss.m34362a(context);
            qkk.m32288a(context);
            boolean a = slh.m35572a(slf.m35566a());
            StringBuilder sb = new StringBuilder(34);
            sb.append("Set StatisticalEventTracker: ");
            sb.append(a);
            sb.toString();
            initialized = true;
        }
    }
}
