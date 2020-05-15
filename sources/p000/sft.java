package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: sft */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class sft {

    /* renamed from: a */
    public static final sft f44147a = new sft();

    /* renamed from: c */
    private static final Map f44148c = sqw.m36035a((Object[]) new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, (Object[]) new String[]{"android.permission.BODY_SENSORS", "android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"});

    /* renamed from: d */
    private static final Map f44149d = sqw.m36035a((Object[]) new String[]{"android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"}, (Object[]) new Integer[]{Integer.valueOf((int) C0126R.string.permgrouplab_sensors), Integer.valueOf((int) C0126R.string.permgrouplab_calendar), Integer.valueOf((int) C0126R.string.permgrouplab_camera), Integer.valueOf((int) C0126R.string.permgrouplab_contacts), Integer.valueOf((int) C0126R.string.permgrouplab_microphone), Integer.valueOf((int) C0126R.string.permgrouplab_phone), Integer.valueOf((int) C0126R.string.permgrouplab_sms), Integer.valueOf((int) C0126R.string.permgrouplab_storage)});

    /* renamed from: b */
    volatile Set f44150b = null;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map
     arg types: [java.lang.String[], java.lang.String[]]
     candidates:
      sqw.a(int, boolean):java.util.Set
      sqw.a(java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map
     arg types: [java.lang.String[], java.lang.Integer[]]
     candidates:
      sqw.a(int, boolean):java.util.Set
      sqw.a(java.lang.Object, java.lang.Object):java.util.Set
      sqw.a(java.lang.Object[], java.lang.Object[]):java.util.Map */
    static {
        new C1223np();
        new C1223np();
    }

    private sft() {
    }

    /* renamed from: a */
    public static Integer m35177a(String str) {
        return (Integer) f44149d.get(str);
    }

    @Deprecated
    /* renamed from: d */
    public static Set m35178d() {
        return f44148c.keySet();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final Set mo25489b() {
        Set set = this.f44150b;
        if (set == null) {
            synchronized (this) {
                set = this.f44150b;
                if (set == null) {
                    HashSet hashSet = new HashSet();
                    rpr b = rpr.m34216b();
                    int i = Build.VERSION.SDK_INT;
                    for (Map.Entry entry : f44148c.entrySet()) {
                        if (b.checkSelfPermission((String) entry.getValue()) == -1) {
                            hashSet.add((String) entry.getKey());
                        }
                    }
                    set = Collections.unmodifiableSet(hashSet);
                    this.f44150b = set;
                }
            }
        }
        return set;
    }

    /* renamed from: c */
    public final synchronized void mo25490c() {
        this.f44150b = null;
    }

    /* renamed from: a */
    public final PendingIntent mo25484a(Context context, Set set) {
        return mo25485a(context, set, null);
    }

    /* renamed from: a */
    public final PendingIntent mo25485a(Context context, Set set, Map map) {
        sre.m36089i(context);
        Intent intent = new Intent("com.google.android.gms.RECOVER_PERMISSION");
        if (set == null) {
            return PendingIntent.getActivity(context, 0, intent, 134217728);
        }
        intent.putStringArrayListExtra("requiredGroups", new ArrayList(set));
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (set.contains(entry.getKey())) {
                    intent.putExtra((String) entry.getKey(), entry.getValue() != null ? ((Integer) entry.getValue()).intValue() : 0);
                }
            }
        }
        return PendingIntent.getActivity(context, 0, intent, 134217728);
    }

    /* renamed from: a */
    public final Set mo25486a(Set set) {
        if (set == null) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(mo25489b());
        hashSet.retainAll(set);
        return hashSet;
    }

    /* renamed from: a */
    public final void mo25487a(PackageManager packageManager) {
        packageManager.addOnPermissionsChangeListener(new sfs(this));
    }

    /* renamed from: a */
    public final boolean mo25488a() {
        return !mo25489b().isEmpty();
    }
}
