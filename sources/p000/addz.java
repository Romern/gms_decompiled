package p000;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.iid.MessengerCompat;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: addz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class addz {

    /* renamed from: a */
    static String f61465a = null;

    /* renamed from: b */
    static boolean f61466b = false;

    /* renamed from: c */
    static int f61467c = 0;

    /* renamed from: d */
    static BroadcastReceiver f61468d = null;

    /* renamed from: e */
    final Context f61469e;

    /* renamed from: f */
    final Map f61470f = new C1223np();

    /* renamed from: g */
    Messenger f61471g;

    /* renamed from: h */
    Messenger f61472h;

    /* renamed from: i */
    MessengerCompat f61473i;

    /* renamed from: j */
    PendingIntent f61474j;

    public addz(Context context) {
        this.f61469e = context;
    }

    /* renamed from: a */
    public static synchronized String m50234a() {
        String num;
        synchronized (addz.class) {
            int i = f61467c;
            f61467c = i + 1;
            num = Integer.toString(i);
        }
        return num;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: addz.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, android.os.Bundle]
     candidates:
      addz.a(java.lang.Object, java.lang.Object):void
      addz.a(android.content.pm.PackageManager, java.lang.String):boolean
      addz.a(java.lang.String, java.lang.Object):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: addz.a(java.lang.String, java.lang.Object):void
     arg types: [java.lang.String, java.lang.String]
     candidates:
      addz.a(java.lang.Object, java.lang.Object):void
      addz.a(android.content.pm.PackageManager, java.lang.String):boolean
      addz.a(java.lang.String, java.lang.Object):void */
    /* renamed from: b */
    public final void mo33376b(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("com.google.android.c2dm.intent.REGISTRATION".equals(action) || "com.google.android.gms.iid.InstanceID".equals(action)) {
                String stringExtra = intent.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent.getExtras();
                        extras.putString("registration_id", group2);
                        m50237a(group, (Object) extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent.getStringExtra("error");
                if (stringExtra2 == null) {
                    String valueOf = String.valueOf(intent.getExtras());
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                    sb.append("Unexpected response, no error or registration id ");
                    sb.append(valueOf);
                    Log.w("InstanceID", sb.toString());
                    return;
                }
                String str = null;
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (!"ID".equals(split[1])) {
                        Log.w("InstanceID", stringExtra2.length() == 0 ? new String("Unexpected structured response ") : "Unexpected structured response ".concat(stringExtra2));
                    }
                    if (split.length > 2) {
                        String str2 = split[2];
                        String str3 = split[3];
                        if (str3.startsWith(":")) {
                            str = str2;
                            stringExtra2 = str3.substring(1);
                        } else {
                            str = str2;
                            stringExtra2 = str3;
                        }
                    } else {
                        stringExtra2 = "UNKNOWN";
                    }
                    intent.putExtra("error", stringExtra2);
                }
                if (str == null) {
                    synchronized (getClass()) {
                        for (String str4 : this.f61470f.keySet()) {
                            Object obj = this.f61470f.get(str4);
                            this.f61470f.put(str4, stringExtra2);
                            m50236a(obj, stringExtra2);
                        }
                    }
                    return;
                }
                m50237a(str, (Object) stringExtra2);
            }
        }
    }

    /* renamed from: a */
    public static String m50235a(Context context) {
        String str = f61465a;
        if (str != null) {
            return str;
        }
        Process.myUid();
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(new Intent("com.google.iid.TOKEN_REQUEST"), 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                String str2 = resolveInfo.activityInfo.packageName;
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", str2) != 0) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 84);
                    sb.append("Possible malicious package ");
                    sb.append(str2);
                    sb.append(" declares com.google.iid.TOKEN_REQUEST without permission");
                    Log.w("InstanceID", sb.toString());
                } else if (m50238a(packageManager, str2)) {
                    f61466b = true;
                    return f61465a;
                }
            }
        }
        Log.w("InstanceID", "Failed to resolve IID implementation package, falling back");
        if (m50238a(packageManager, "com.google.android.gms")) {
            int i2 = Build.VERSION.SDK_INT;
            f61466b = true;
            return f61465a;
        }
        int i3 = Build.VERSION.SDK_INT;
        Log.w("InstanceID", "Google Play services is missing, unable to get tokens");
        return null;
    }

    /* renamed from: a */
    private static final void m50236a(Object obj, Object obj2) {
        if (obj instanceof ConditionVariable) {
            ((ConditionVariable) obj).open();
        }
        if (obj instanceof Messenger) {
            Messenger messenger = (Messenger) obj;
            Message obtain = Message.obtain();
            obtain.obj = obj2;
            try {
                messenger.send(obtain);
            } catch (RemoteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Failed to send response ");
                sb.append(valueOf);
                Log.w("InstanceID", sb.toString());
            }
        }
    }

    /* renamed from: a */
    private final void m50237a(String str, Object obj) {
        synchronized (getClass()) {
            Object obj2 = this.f61470f.get(str);
            this.f61470f.put(str, obj);
            m50236a(obj2, obj);
        }
    }

    /* renamed from: a */
    private static boolean m50238a(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 0);
            f61465a = applicationInfo.packageName;
            int i = applicationInfo.uid;
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b A[SYNTHETIC] */
    /* renamed from: a */
    public final Bundle mo33374a(Bundle bundle) {
        Bundle bundle2;
        ConditionVariable conditionVariable = new ConditionVariable();
        String a = m50234a();
        synchronized (getClass()) {
            this.f61470f.put(a, conditionVariable);
        }
        if (this.f61471g == null) {
            m50235a(this.f61469e);
            this.f61471g = new Messenger(new addx(this, Looper.getMainLooper()));
        }
        if (f61465a != null) {
            Intent intent = new Intent(!f61466b ? "com.google.android.c2dm.intent.REGISTER" : "com.google.iid.TOKEN_REQUEST");
            intent.setPackage(f61465a);
            intent.putExtras(bundle);
            mo33375a(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 5);
            sb.append("|ID|");
            sb.append(a);
            sb.append("|");
            intent.putExtra("kid", sb.toString());
            StringBuilder sb2 = new StringBuilder(String.valueOf(a).length() + 5);
            sb2.append("|ID|");
            sb2.append(a);
            sb2.append("|");
            intent.putExtra("X-kid", sb2.toString());
            boolean equals = "com.google.android.gsf".equals(f61465a);
            String stringExtra = intent.getStringExtra("useGsf");
            if (stringExtra != null) {
                equals = "1".equals(stringExtra);
            }
            if (this.f61472h != null) {
                intent.putExtra("google.messenger", this.f61471g);
                Message obtain = Message.obtain();
                obtain.obj = intent;
                try {
                    this.f61472h.send(obtain);
                } catch (RemoteException e) {
                }
                conditionVariable.block(30000);
                synchronized (getClass()) {
                    Object remove = this.f61470f.remove(a);
                    if (remove instanceof Bundle) {
                        bundle2 = (Bundle) remove;
                    } else if (!(remove instanceof String)) {
                        String valueOf = String.valueOf(remove);
                        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 12);
                        sb3.append("No response ");
                        sb3.append(valueOf);
                        Log.w("InstanceID", sb3.toString());
                        throw new IOException("TIMEOUT");
                    } else {
                        throw new IOException((String) remove);
                    }
                }
                return bundle2;
            }
            if (!equals) {
                intent.putExtra("google.messenger", this.f61471g);
                intent.putExtra("messenger2", "1");
                if (this.f61473i != null) {
                    Message obtain2 = Message.obtain();
                    obtain2.obj = intent;
                    try {
                        this.f61473i.mo43433a(obtain2);
                    } catch (RemoteException e2) {
                    }
                }
                if (!f61466b) {
                    this.f61469e.startService(intent);
                } else {
                    this.f61469e.sendBroadcast(intent);
                }
            } else {
                synchronized (addz.class) {
                    if (f61468d == null) {
                        f61468d = new addy(this);
                        IntentFilter intentFilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
                        intentFilter.addCategory(this.f61469e.getPackageName());
                        this.f61469e.registerReceiver(f61468d, intentFilter, "com.google.android.c2dm.permission.SEND", null);
                    }
                }
                this.f61469e.sendBroadcast(intent);
            }
            conditionVariable.block(30000);
            synchronized (getClass()) {
            }
        } else {
            throw new IOException("MISSING_INSTANCEID_SERVICE");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo33375a(Intent intent) {
        if (this.f61474j == null) {
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            this.f61474j = PendingIntent.getBroadcast(this.f61469e, 0, intent2, 0);
        }
        intent.putExtra("app", this.f61474j);
    }
}
