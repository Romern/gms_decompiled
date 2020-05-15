package com.google.android.gms.backup.transport.component;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.ArrayList;
import java.util.Collection;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class ModuleEnabler extends qlf {

    /* renamed from: a */
    private static final lvn f29235a = new lvn("ModuleEnabler");

    /* renamed from: b */
    private static final bnic f29236b = bnic.m109494a("backup", "backup_lmp", "backup_base", "backup_cloudrestore", "backup_d2d", "backup_prelmp", "backup_settings", "backup_transport");

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    private static void m22018a(Context context, String str) {
        f29235a.mo25409a("Starting module: %s", str);
        Intent putExtra = new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").putExtra("moduleid", str).putExtra("intent", new Intent(IntentOperation.ACTION_NEW_MODULE).putExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, false));
        putExtra.setPackage("com.google.android.gms");
        if (context.startService(putExtra) == null) {
            lvn lvn = f29235a;
            String valueOf = String.valueOf(str);
            lvn.mo25418e(valueOf.length() == 0 ? new String("Failed to start module ") : "Failed to start module ".concat(valueOf), new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6344a(Intent intent, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (!lvr.f33060a.mo19657c(this)) {
            if (cckw.f179263a.mo6606a().mo76243h()) {
                f29235a.mo25409a("Trying to enable SmartDevice", new Object[0]);
                try {
                    getPackageManager().getActivityInfo(new ComponentName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity"), 0);
                    f29235a.mo25409a("SmartDevice activity found", new Object[0]);
                } catch (PackageManager.NameNotFoundException e) {
                    f29235a.mo25408a("Activity not found", e, new Object[0]);
                    f29235a.mo25416d("SmartDevice activity %s not found, trying to enable SmartDevice", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
                    m22018a(this, "com.google.android.gms.smartdevice");
                }
            }
            if (cckw.f179263a.mo6606a().mo76242g()) {
                try {
                    Collection<ModuleManager.ModuleInfo> allModules = ModuleManager.get(this).getAllModules();
                    ArrayList<String> arrayList = new ArrayList();
                    for (ModuleManager.ModuleInfo moduleInfo : allModules) {
                        f29235a.mo25409a("Found module: %s", moduleInfo.moduleId);
                        arrayList.add(moduleInfo.moduleId);
                    }
                    bnrd a = f29236b.iterator();
                    while (a.hasNext()) {
                        String valueOf = String.valueOf((String) a.next());
                        arrayList.remove(valueOf.length() == 0 ? new String("com.google.android.gms.") : "com.google.android.gms.".concat(valueOf));
                    }
                    for (String str : arrayList) {
                        m22018a(this, str);
                    }
                } catch (InvalidConfigException e2) {
                    f29235a.mo25417e("Couldn't get module list", e2, new Object[0]);
                }
            }
        }
    }
}
