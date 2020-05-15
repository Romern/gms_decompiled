package com.google.android.gms.car.settings;

import android.os.Bundle;
import java.io.File;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CarServiceSettingsActivityImpl extends deu {

    /* renamed from: b */
    public static final bnsn f29518b = odk.m28481a("CAR.SETTING");

    /* renamed from: a */
    public static void m22100a(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    m22100a(file2);
                }
            }
            file.delete();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        npd.m27127a(this);
        getSupportFragmentManager().beginTransaction().replace(16908290, new omd()).commit();
    }
}
