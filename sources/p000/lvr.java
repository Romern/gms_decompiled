package p000;

import android.content.Context;
import android.provider.Settings;
import java.util.Arrays;

/* renamed from: lvr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvr {

    /* renamed from: a */
    public static final lvr f33060a = new lvr();

    /* renamed from: b */
    public static final int[] f33061b = {-1, 0, 1};

    /* renamed from: c */
    public static final int[] f33062c = {-1, 0, 1};

    /* renamed from: d */
    public static final int[] f33063d = {0, 1, 2, 3};

    /* renamed from: e */
    private static final lvn f33064e = new lvn("BackupSettings");

    /* renamed from: f */
    private static final int[] f33065f = {0, 1};

    /* renamed from: g */
    private static final int[] f33066g = {0, 1};

    /* renamed from: h */
    private static final int[] f33067h = {0, 1};

    /* renamed from: i */
    private static final int[] f33068i = {0, 1};

    /* renamed from: j */
    private static final int[] f33069j = {0, 1};

    /* renamed from: k */
    private static final int[] f33070k = {0, 1};

    /* renamed from: l */
    private static final int[] f33071l = {0, 1};

    protected lvr() {
    }

    /* renamed from: a */
    public static void m24472a(String str, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i != iArr[i2]) {
                i2++;
            } else {
                return;
            }
        }
        f33064e.mo25416d("Found invalid value %d for setting %s. Possible values are %s", Integer.valueOf(i), str, Arrays.toString(iArr));
    }

    /* renamed from: b */
    public final void mo19653b(Context context, int i) {
        if (!(i == -1 || i == 0)) {
            i = 1;
        }
        sdo.m34974b(true);
        Settings.Secure.putInt(context.getContentResolver(), "migrate_backup_enabled", i);
    }

    /* renamed from: c */
    public final void mo19656c(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "backup_enabled:com.android.providers.telephony", z ? 1 : 0);
    }

    /* renamed from: d */
    public final void mo19658d(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "backup_encryption_opt_in_displayed", z ? 1 : 0);
    }

    /* renamed from: e */
    public final boolean mo19660e(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "user_full_data_backup_aware", 0);
        m24472a("user_full_data_backup_aware", i, f33069j);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo19661f(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "backup_enabled:com.android.providers.telephony", 0);
        m24472a("backup_enabled:com.android.providers.telephony", i, f33070k);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final boolean mo19662g(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "backup_encryption_opt_in_displayed", 0);
        m24472a("backup_encryption_opt_in_displayed", i, f33071l);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo19657c(Context context) {
        int i = Settings.Global.getInt(context.getContentResolver(), "device_provisioned", 0);
        m24472a("device_provisioned", i, f33067h);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo19659d(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "has_enabled_photos_backup_before", 0);
        m24472a("has_enabled_photos_backup_before", i, f33068i);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo19654b(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "user_full_data_backup_aware", z ? 1 : 0);
    }

    /* renamed from: a */
    public final void mo19649a(Context context, int i) {
        if (!(i == -1 || i == 0)) {
            i = 1;
        }
        sdo.m34974b(true);
        Settings.Secure.putInt(context.getContentResolver(), "migrate_full_data_aware_original", i);
    }

    /* renamed from: b */
    public final boolean mo19655b(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "backup_enabled:com.android.calllogbackup", 0);
        m24472a("backup_enabled:com.android.calllogbackup", i, f33066g);
        if (i != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo19650a(Context context, long j) {
        Settings.Global.putLong(context.getContentResolver(), "wifi_bounce_delay_override_ms", j);
    }

    /* renamed from: a */
    public final void mo19651a(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "backup_enabled:com.android.calllogbackup", z ? 1 : 0);
    }

    /* renamed from: a */
    public final boolean mo19652a(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "backup_auto_restore", 1);
        m24472a("backup_auto_restore", i, f33065f);
        if (i != 0) {
            return true;
        }
        return false;
    }
}
