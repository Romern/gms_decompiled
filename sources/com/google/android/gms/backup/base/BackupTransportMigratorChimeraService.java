package com.google.android.gms.backup.base;

import android.accounts.Account;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BackupTransportMigratorChimeraService extends TracingIntentService {

    /* renamed from: a */
    private static final lvn f29000a = new lvn("BackupTransportMigratorChimeraService");

    /* renamed from: b */
    private lvp f29001b;

    public BackupTransportMigratorChimeraService() {
        super("BackupTransportMigratorChimeraService");
    }

    /* renamed from: a */
    public static Intent m21860a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.backup.BackupTransportMigratorService");
    }

    /* renamed from: b */
    private final void m21864b() {
        f29000a.mo25414c("Rolling back migration.", new Object[0]);
        lvp lvp = new lvp(this);
        lvn lvn = f29000a;
        String valueOf = String.valueOf(Arrays.asList(lvp.mo19646d()));
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Transports: ");
        sb.append(valueOf);
        lvn.mo25414c(sb.toString(), new Object[0]);
        try {
            if (!m21862a(this, ComponentName.unflattenFromString("com.google.android.backuptransport/com.google.android.backup.BackupTransportService"), true)) {
                m21862a(this, ComponentName.unflattenFromString("com.google.android.backup/.BackupTransportService"), true);
            }
            startService(mcc.m24854b(this));
            if (!"com.google.android.backup/.BackupTransportService".equals(lvp.mo19645c())) {
                Thread.sleep(5000);
                if (f29000a.mo19637a(3)) {
                    f29000a.mo25412b("Selecting legacy BackupTransportService.", new Object[0]);
                }
                lvp.mo19643b("com.google.android.backup/.BackupTransportService");
            }
        } catch (Exception e) {
            f29000a.mo25417e("Unexpected exception!", e, new Object[0]);
        }
    }

    /* renamed from: a */
    private final lvp m21861a() {
        lvp lvp = this.f29001b;
        if (lvp != null) {
            return lvp;
        }
        lvp lvp2 = new lvp(this);
        this.f29001b = lvp2;
        return lvp2;
    }

    /* renamed from: a */
    private static boolean m21862a(Context context, ComponentName componentName, boolean z) {
        Boolean bool;
        try {
            PackageManager packageManager = context.getPackageManager();
            int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
            if (componentEnabledSetting == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(componentEnabledSetting == 1);
            }
            if (bool == null || bool.booleanValue() != z) {
                int i = 2;
                f29000a.mo25414c(String.format("Switch enabled status of %s to %s", componentName.flattenToString(), String.valueOf(z)), new Object[0]);
                if (z) {
                    i = 1;
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
            }
            return true;
        } catch (Exception e) {
            lvn lvn = f29000a;
            String valueOf = String.valueOf(componentName.flattenToString());
            lvn.mo25414c(valueOf.length() == 0 ? new String("Component name not found : ") : "Component name not found : ".concat(valueOf), new Object[0]);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m21863a(lvp lvp) {
        int i = Build.VERSION.SDK_INT;
        return !m21866b(lvp);
    }

    /* renamed from: b */
    public static boolean m21865b(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (!cckn.m130223b()) {
            f29000a.mo25414c("Gms backup is disabled by gservice.", new Object[0]);
            return false;
        }
        try {
            if (context.getPackageManager().getServiceInfo(ComponentName.unflattenFromString("com.google.android.gms/.backup.BackupTransportService"), 0).isEnabled()) {
                return true;
            }
            f29000a.mo25418e("GMS BackupTransportService not enabled!", new Object[0]);
            return false;
        } catch (PackageManager.NameNotFoundException e) {
            f29000a.mo25418e("GMS BackupTransportService not found!", new Object[0]);
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bf A[SYNTHETIC, Splitter:B:77:0x01bf] */
    /* renamed from: a */
    public final void mo6499a(Intent intent) {
        boolean z;
        lug lug;
        if (intent.getBooleanExtra("rollback", false)) {
            m21864b();
        } else if (m21865b(this)) {
            if (f29000a.mo19637a(3)) {
                f29000a.mo25412b("Migrating if not already migrated.", new Object[0]);
            }
            if (!m21863a(m21861a())) {
                f29000a.mo25414c("Starting migration...", new Object[0]);
                try {
                    lvp a = m21861a();
                    if (m21866b(a)) {
                        if (f29000a.mo19637a(3)) {
                            f29000a.mo25412b("Selecting GMS BackupTransportService.", new Object[0]);
                        }
                        a.mo19643b("com.google.android.gms/.backup.BackupTransportService");
                    }
                    if (m21866b(a)) {
                        Thread.sleep(5000);
                        if (f29000a.mo19637a(3)) {
                            f29000a.mo25412b("Selecting GMS BackupTransportService again.", new Object[0]);
                        }
                        a.mo19643b("com.google.android.gms/.backup.BackupTransportService");
                        if (!"com.google.android.gms/.backup.BackupTransportService".equals(a.mo19645c())) {
                            if (f29000a.mo19637a(3)) {
                                f29000a.mo25412b("Could not select GMS BackupTransportService.", new Object[0]);
                            }
                            f29000a.mo25418e("Could not migrate transport!", new Object[0]);
                            return;
                        }
                    }
                    Account a2 = new lvb().mo19624a();
                    Intent a3 = BackupAccountManagerChimeraService.m21858a();
                    if (a3 != null) {
                        rex rex = new rex();
                        try {
                            z = skh.m35531a().mo25690a(this, a3, rex, 1);
                            if (!z) {
                                try {
                                    lvn lvn = f29000a;
                                    String valueOf = String.valueOf(a3);
                                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                                    sb.append("Fail to bind service : ");
                                    sb.append(valueOf);
                                    lvn.mo25418e(sb.toString(), new Object[0]);
                                } catch (Throwable th) {
                                    th = th;
                                    if (z) {
                                        try {
                                            skh.m35531a().mo25689a(this, rex);
                                        } catch (IllegalArgumentException | IllegalStateException e) {
                                            f29000a.mo25415d("Exception when unbinding: ", e, new Object[0]);
                                        }
                                    }
                                    throw th;
                                }
                            } else {
                                IBinder a4 = rex.mo24567a();
                                if (a4 != null) {
                                    IInterface queryLocalInterface = a4.queryLocalInterface("com.google.android.gms.backup.IBackupAccountManagerService");
                                    lug = !(queryLocalInterface instanceof lug) ? new lue(a4) : (lug) queryLocalInterface;
                                } else {
                                    lug = null;
                                }
                                Account a5 = lug.mo19604a();
                                if (a5 != null) {
                                    lvn lvn2 = f29000a;
                                    String valueOf2 = String.valueOf(a5);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 37);
                                    sb2.append("GmsCore already has backup account : ");
                                    sb2.append(valueOf2);
                                    lvn2.mo25412b(sb2.toString(), new Object[0]);
                                    try {
                                        skh.m35531a().mo25689a(this, rex);
                                    } catch (IllegalArgumentException | IllegalStateException e2) {
                                        f29000a.mo25415d("Exception when unbinding: ", e2, new Object[0]);
                                    }
                                } else {
                                    if (a2 != null) {
                                        lvn lvn3 = f29000a;
                                        String valueOf3 = String.valueOf(a2);
                                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 21);
                                        sb3.append("Found backup account:");
                                        sb3.append(valueOf3);
                                        lvn3.mo25412b(sb3.toString(), new Object[0]);
                                        lug.mo19605a(a2);
                                    } else {
                                        f29000a.mo25412b("Couldn't find backup account, notifying.", new Object[0]);
                                        startService(mcc.m24852a(this));
                                    }
                                    try {
                                        skh.m35531a().mo25689a(this, rex);
                                    } catch (IllegalArgumentException | IllegalStateException e3) {
                                        f29000a.mo25415d("Exception when unbinding: ", e3, new Object[0]);
                                    }
                                }
                            }
                            if (!m21862a(this, ComponentName.unflattenFromString("com.google.android.backuptransport/com.google.android.backup.BackupTransportService"), false)) {
                                m21862a(this, ComponentName.unflattenFromString("com.google.android.backup/.BackupTransportService"), false);
                            }
                            f29000a.mo25414c("Successfully migrated to use GMS BackupTransportService!", new Object[0]);
                        } catch (Throwable th2) {
                            th = th2;
                            z = false;
                            if (z) {
                            }
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("GmsBackupAccountManagerService not found!");
                    }
                } catch (Exception e4) {
                    f29000a.mo25417e("Unexpected exception!", e4, new Object[0]);
                    m21864b();
                }
            }
        } else if (f29000a.mo19637a(3)) {
            f29000a.mo25412b("Should not migrate.", new Object[0]);
        }
    }

    /* renamed from: b */
    private static boolean m21866b(lvp lvp) {
        String c = lvp.mo19645c();
        return TextUtils.isEmpty(c) || "com.google.android.backup/.BackupTransportService".equals(c);
    }
}
