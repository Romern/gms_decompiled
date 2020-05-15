package p000;

import android.content.Context;
import android.provider.Settings;
import java.util.Arrays;

/* renamed from: lvt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class lvt {

    /* renamed from: a */
    public static final lvt f33072a = new lvt();

    /* renamed from: b */
    public static final int[] f33073b = {0, 1};

    /* renamed from: c */
    private static final lvn f33074c = new lvn("G1Settings");

    /* renamed from: d */
    private static final int[] f33075d = {0, 1, 2};

    /* renamed from: e */
    private static final int[] f33076e = {0, 1};

    /* renamed from: f */
    private static final int[] f33077f = {0, 1};

    /* renamed from: g */
    private static final int[] f33078g = {0, 1, 2};

    /* renamed from: h */
    private static final int[] f33079h = {0, 1};

    /* renamed from: i */
    private static final int[] f33080i = {0, 1, 2};

    protected lvt() {
    }

    /* renamed from: a */
    public static void m24492a(String str, int i, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            if (i != iArr[i2]) {
                i2++;
            } else {
                return;
            }
        }
        f33074c.mo25416d("Found invalid value %d for setting %s. Possible values are %s", Integer.valueOf(i), str, Arrays.toString(iArr));
    }

    /* renamed from: b */
    public final void mo19671b(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "mms_restore_started", z ? 1 : 0);
    }

    /* renamed from: c */
    public final void mo19673c(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "mms_restore_complete", z ? 1 : 0);
    }

    /* renamed from: d */
    public final int mo19675d(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "photos_restore_enabled", 0);
        m24492a("photos_restore_enabled", i, f33078g);
        return i;
    }

    /* renamed from: e */
    public final void mo19677e(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "photos_restore_started", z ? 1 : 0);
    }

    /* renamed from: f */
    public final String mo19679f(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "restore_ancestor_id");
    }

    /* renamed from: g */
    public final void mo19681g(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "mms_backup_enabled", !z ? 2 : 1);
    }

    /* renamed from: h */
    public final void mo19683h(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "mms_backup_in_progress", z ? 1 : 0);
    }

    /* renamed from: b */
    public final boolean mo19672b(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "mms_restore_started", 0);
        m24492a("mms_restore_started", i, f33076e);
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo19674c(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "mms_restore_complete", 0);
        m24492a("mms_restore_complete", i, f33077f);
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean mo19678e(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "photos_restore_completed", 0);
        m24492a("photos_restore_completed", i, f33079h);
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo19680f(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "photos_restore_completed", z ? 1 : 0);
    }

    /* renamed from: g */
    public final boolean mo19682g(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "mms_backup_enabled", 0);
        m24492a("mms_backup_enabled", i, f33080i);
        return i == 1;
    }

    /* renamed from: a */
    public final int mo19668a(Context context) {
        int i = Settings.Secure.getInt(context.getContentResolver(), "mms_restore_enabled", 0);
        m24492a("mms_restore_enabled", i, f33075d);
        return i;
    }

    /* renamed from: d */
    public final void mo19676d(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "photos_restore_enabled", !z ? 2 : 1);
    }

    /* renamed from: a */
    public final void mo19669a(Context context, long j) {
        Settings.Secure.putLong(context.getContentResolver(), "mms_backup_last_completed", j);
    }

    /* renamed from: a */
    public final void mo19670a(Context context, boolean z) {
        Settings.Secure.putInt(context.getContentResolver(), "mms_restore_enabled", !z ? 2 : 1);
    }
}
