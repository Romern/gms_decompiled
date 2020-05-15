package p000;

import android.app.backup.BackupManager;
import android.app.backup.BackupManagerMonitor;
import android.app.backup.BackupObserver;
import android.app.backup.RestoreSession;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: lvp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvp {

    /* renamed from: a */
    public final BackupManager f33054a;

    /* renamed from: b */
    private final Context f33055b;

    /* renamed from: c */
    private final lvn f33056c;

    /* renamed from: d */
    private bmxv f33057d = null;

    public lvp(Context context) {
        BackupManager backupManager = new BackupManager(context);
        lvr lvr = lvr.f33060a;
        lvn lvn = new lvn("BackupManagerWrapper");
        this.f33055b = context;
        this.f33054a = backupManager;
        this.f33056c = lvn;
    }

    /* renamed from: g */
    private final bmxv m24460g() {
        bmxv bmxv;
        if (this.f33057d == null) {
            Class[] clsArr = {ComponentName.class, String.class, Intent.class, String.class, Intent.class, String.class};
            int i = Build.VERSION.SDK_INT;
            try {
                bmxv = bmxv.m108566b(new lvo(BackupManager.class.getMethod("updateTransportAttributes", clsArr)));
            } catch (NoSuchMethodException e) {
                bmxv = bmvz.f131120a;
            }
            this.f33057d = bmxv;
        }
        return this.f33057d;
    }

    /* renamed from: a */
    public final int mo19638a(String[] strArr, BackupObserver backupObserver, BackupManagerMonitor backupManagerMonitor, int i) {
        if (mo19648f()) {
            return this.f33054a.requestBackup(strArr, backupObserver, backupManagerMonitor, i);
        }
        return -1;
    }

    @Deprecated
    /* renamed from: b */
    public final void mo19643b(String str) {
        if (mo19648f()) {
            this.f33054a.selectBackupTransport(str);
        }
    }

    /* renamed from: c */
    public final String mo19645c() {
        if (mo19648f()) {
            return this.f33054a.getCurrentTransport();
        }
        return null;
    }

    /* renamed from: d */
    public final String[] mo19646d() {
        if (mo19648f()) {
            return this.f33054a.listAllTransports();
        }
        return null;
    }

    /* renamed from: e */
    public final boolean mo19647e() {
        return m24460g().mo66813a();
    }

    /* renamed from: f */
    public final boolean mo19648f() {
        if (C1133kh.m17835a(this.f33055b, "android.permission.BACKUP") == 0) {
            return true;
        }
        this.f33056c.mo25418e("Google Play Services doesn't have permission android.permission.BACKUP", new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final long mo19639a(String str) {
        if (mo19648f()) {
            return this.f33054a.getAvailableRestoreToken(str);
        }
        return 0;
    }

    /* renamed from: b */
    public final boolean mo19644b() {
        int i = Build.VERSION.SDK_INT;
        if (mo19648f()) {
            return this.f33054a.isBackupEnabled();
        }
        return false;
    }

    /* renamed from: a */
    public final RestoreSession mo19640a() {
        if (mo19648f()) {
            return this.f33054a.beginRestoreSession();
        }
        return null;
    }

    /* renamed from: a */
    public final void mo19641a(ComponentName componentName, lvs lvs) {
        lvo lvo;
        if (maq.m24773a(this.f33055b) && mo19647e()) {
            try {
                String a = lvs.mo19663a();
                Intent b = lvs.mo19664b();
                String c = lvs.mo19665c();
                Intent d = lvs.mo19666d();
                String e = lvs.mo19667e();
                if (mo19648f()) {
                    bmxv g = m24460g();
                    if (g.mo66813a()) {
                        try {
                            lvo = (lvo) g.mo66814b();
                            lvo.f33053a.invoke(this.f33054a, componentName, a, b, c, d, e);
                        } catch (IllegalAccessException e2) {
                            String name = lvo.f33053a.getName();
                            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 33);
                            sb.append("API method ");
                            sb.append(name);
                            sb.append(" expected to be public");
                            throw new IllegalStateException(sb.toString(), e2);
                        } catch (InvocationTargetException e3) {
                            Throwable cause = e3.getCause();
                            if (cause instanceof RuntimeException) {
                                throw ((RuntimeException) cause);
                            } else if (!(cause instanceof Error)) {
                                throw new AssertionError(cause);
                            } else {
                                throw ((Error) cause);
                            }
                        }
                    } else {
                        this.f33056c.mo25418e("Tried to call BackupManager.updateTransportAttributes(), but it doesn't exist", new Object[0]);
                    }
                }
            } catch (SecurityException e4) {
                if (!mcl.m24877a()) {
                    IllegalStateException illegalStateException = new IllegalStateException("User != 0 tried to update transport attributes", e4);
                    this.f33056c.mo25417e(illegalStateException.getMessage(), illegalStateException, new Object[0]);
                    mab.m24748a(this.f33055b, e4, cckt.f179251a.mo6606a().mo76202j());
                    return;
                }
                throw e4;
            }
        }
    }

    /* renamed from: a */
    public final void mo19642a(boolean z) {
        if (mo19648f()) {
            this.f33054a.setBackupEnabled(z);
        }
    }
}
