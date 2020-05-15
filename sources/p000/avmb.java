package p000;

import android.app.admin.DevicePolicyManager;
import android.app.admin.SystemUpdatePolicy;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

/* renamed from: avmb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avmb {

    /* renamed from: c */
    private static final sek f93367c = avpq.m79016c("SystemUpdatePolicyCompat");

    /* renamed from: d */
    private static final avmb f93368d = new avmb(0, Long.MAX_VALUE);

    /* renamed from: a */
    public final int f93369a;

    /* renamed from: b */
    public final long f93370b;

    private avmb(int i, long j) {
        this.f93369a = i;
        this.f93370b = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static avmb m78775a(Context context, long j) {
        Integer num;
        avmb avmb;
        long currentTimeMillis = System.currentTimeMillis();
        if (cfsg.m142819f()) {
            int i = Build.VERSION.SDK_INT;
            try {
                SystemUpdatePolicy systemUpdatePolicy = ((DevicePolicyManager) context.getSystemService("device_policy")).getSystemUpdatePolicy();
                if (systemUpdatePolicy != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    int i3 = 0;
                    Long l = Long.MAX_VALUE;
                    try {
                        Class<?> cls = Class.forName("android.app.admin.SystemUpdatePolicy$InstallationOption");
                        Object invoke = SystemUpdatePolicy.class.getMethod("getInstallationOptionAt", Long.TYPE).invoke(systemUpdatePolicy, Long.valueOf(currentTimeMillis));
                        if (invoke == null) {
                            return f93368d;
                        }
                        num = (Integer) cls.getMethod("getType", new Class[0]).invoke(invoke, new Object[0]);
                        try {
                            l = (Long) cls.getMethod("getEffectiveTime", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                            e = e;
                            i3 = num;
                            f93367c.mo25415d("Error getting installation option", e, new Object[0]);
                            num = i3;
                            if (num == null) {
                                avmb = new avmb(num.intValue(), l.longValue());
                                if (avmb.f93369a == 3) {
                                }
                            }
                            return f93368d;
                        }
                        if (num == null || l == null) {
                            return f93368d;
                        }
                        avmb = new avmb(num.intValue(), l.longValue());
                        if (avmb.f93369a == 3) {
                            return avmb;
                        }
                        if (!((Boolean) avma.f93362h.mo51364a()).booleanValue()) {
                            return j + cfsg.f185570a.mo6606a().mo82643o() < currentTimeMillis ? f93368d : avmb;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e2) {
                        e = e2;
                        f93367c.mo25415d("Error getting installation option", e, new Object[0]);
                        num = i3;
                        if (num == null) {
                        }
                        return f93368d;
                    }
                }
            } catch (RuntimeException e3) {
                f93367c.mo25416d("Error getting device policy. This might be WAI given that there is a bug in Android framework API.", new Object[0]);
                return f93368d;
            }
        }
        return f93368d;
    }
}
