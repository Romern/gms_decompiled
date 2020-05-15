package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class FrpUpdateIntentOperation extends IntentOperation {

    /* renamed from: a */
    public static final sek f10953a = ght.m13171a("FRP", "FrpUpdateIntentOperation");

    /* renamed from: b */
    private static final List f10954b = Arrays.asList("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", "com.google.android.gms.auth.FRP_CONFIG_CHANGED", "android.app.action.DEVICE_OWNER_CHANGED");

    /* renamed from: c */
    private Context f10955c;

    /* renamed from: d */
    private glh f10956d;

    /* renamed from: e */
    private jdv f10957e;

    public FrpUpdateIntentOperation() {
    }

    /* renamed from: a */
    public static synchronized void m6647a(Context context, String str) {
        Intent intent;
        synchronized (FrpUpdateIntentOperation.class) {
            if ("android.intent.action.BOOT_COMPLETED".equals(str)) {
                str = "com.google.android.gms.auth.FRP_CONFIG_CHANGED";
            }
            if (m6648a(str)) {
                intent = IntentOperation.getStartIntent(context, FrpUpdateIntentOperation.class, str);
            } else {
                intent = null;
            }
            if (intent != null) {
                context.startService(intent);
            }
        }
    }

    public final void onCreate() {
        this.f10955c = this;
        this.f10956d = glh.m13369a(this);
    }

    FrpUpdateIntentOperation(Context context, glh glh, jdv jdv) {
        this.f10955c = context;
        this.f10956d = glh;
        this.f10957e = jdv;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: glh.a(java.util.List, boolean):void
     arg types: [java.util.List, int]
     candidates:
      glh.a(ime, java.lang.String):boolean
      glh.a(java.util.List, boolean):void */
    public final void onHandleIntent(Intent intent) {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        if (this.f10957e == null) {
            Context context = this.f10955c;
            this.f10957e = new jdv(new adzt(context.getMainLooper()), context.getContentResolver(), Settings.Global.getUriFor("device_provisioned"), new CountDownLatch(1));
        }
        if (!m6648a(intent.getAction())) {
            sek sek = f10953a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Invalid intent received: ");
            sb.append(valueOf);
            sek.mo25414c(sb.toString(), new Object[0]);
        } else if (this.f10956d.mo12009a()) {
            if (Settings.Global.getInt(this.f10955c.getContentResolver(), "device_provisioned", 0) != 1) {
                jdv jdv = this.f10957e;
                jdv.f22234a.registerContentObserver(jdv.f22235b, true, jdv);
                try {
                    sek sek2 = f10953a;
                    String valueOf2 = String.valueOf(jdv.f22235b);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 18);
                    sb2.append("Blocking wait for ");
                    sb2.append(valueOf2);
                    sek2.mo25414c(sb2.toString(), new Object[0]);
                    jdv.f22236c.await();
                } catch (InterruptedException e) {
                    f10953a.mo25417e("Error waiting for count down", e, new Object[0]);
                }
                jdv.f22234a.unregisterContentObserver(jdv);
            }
            if ("com.google.android.gms.auth.FRP_CONFIG_CHANGED".equals(intent.getAction()) || "android.app.action.DEVICE_OWNER_CHANGED".equals(intent.getAction())) {
                glh glh = this.f10956d;
                int i2 = Build.VERSION.SDK_INT;
                Bundle applicationRestrictions = ((UserManager) glh.f18463b.getSystemService("user")).getApplicationRestrictions(glh.f18463b.getPackageName());
                ComponentName deviceOwnerComponentOnAnyUser = ((DevicePolicyManager) glh.f18463b.getSystemService(DevicePolicyManager.class)).getDeviceOwnerComponentOnAnyUser();
                imd imd = null;
                if (deviceOwnerComponentOnAnyUser != null) {
                    str = deviceOwnerComponentOnAnyUser.flattenToShortString();
                } else {
                    str = null;
                }
                if (applicationRestrictions != null) {
                    str2 = applicationRestrictions.getString("persistentDeviceOwnerState");
                } else {
                    str2 = null;
                }
                if (!(str == null || str2 == null)) {
                    bxvd da = imd.f21346d.mo74144da();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    imd imd2 = (imd) da.f164949b;
                    str.getClass();
                    int i3 = imd2.f21348a | 1;
                    imd2.f21348a = i3;
                    imd2.f21349b = str;
                    str2.getClass();
                    imd2.f21348a = i3 | 2;
                    imd2.f21350c = str2;
                    imd imd3 = (imd) da.mo74062i();
                    int i4 = imd3.f164961ai;
                    if (i4 == -1) {
                        i4 = bxxm.f165037a.mo74228a(imd3).mo74223b(imd3);
                        imd3.f164961ai = i4;
                    }
                    if (i4 > 1024) {
                        sek sek3 = glh.f18461a;
                        int i5 = imd3.f164961ai;
                        if (i5 == -1) {
                            i5 = bxxm.f165037a.mo74228a(imd3).mo74223b(imd3);
                            imd3.f164961ai = i5;
                        }
                        StringBuilder sb3 = new StringBuilder(120);
                        sb3.append("Failed storing persistent device owner state - the maximum allowed serialized size of 1024B was exceeded by ");
                        sb3.append(i5 - 1024);
                        sb3.append("B");
                        sek3.mo25418e(sb3.toString(), new Object[0]);
                    } else {
                        imd = imd3;
                    }
                }
                glh.mo12007a(imd);
            }
            List e2 = this.f10956d.mo12014e();
            if (e2 == null) {
                f10953a.mo25414c("No frp data present in app restriction, using current google accounts.", new Object[0]);
                Context context2 = this.f10955c;
                List d = soz.m35801d(context2, context2.getPackageName());
                glh glh2 = this.f10956d;
                List arrayList = new ArrayList(d.size());
                Iterator it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Account account = (Account) it.next();
                    String b = this.f10956d.mo12011b(account.name);
                    if (TextUtils.isEmpty(b)) {
                        f10953a.mo25418e(String.format("Critial error: accountId is empty for account %s.", account.name), new Object[0]);
                        arrayList = Collections.emptyList();
                        break;
                    }
                    arrayList.add(b);
                }
                glh2.mo12008a(arrayList, true);
            } else if ("com.google.android.gms.auth.FRP_CONFIG_CHANGED".equals(intent.getAction())) {
                f10953a.mo25414c("Using app restriction data to update frp challenges.", new Object[0]);
                this.f10956d.mo12008a(e2, false);
            } else {
                f10953a.mo25414c("No need to update account challenges.", new Object[0]);
            }
        } else {
            f10953a.mo25414c("Frp is not supported for this device / user", new Object[0]);
        }
    }

    /* renamed from: a */
    private static boolean m6648a(String str) {
        sek sek = f10953a;
        String valueOf = String.valueOf(str);
        sek.mo25412b(valueOf.length() == 0 ? new String("Received intent with action: ") : "Received intent with action: ".concat(valueOf), new Object[0]);
        if (f10954b.contains(str)) {
            return true;
        }
        sek sek2 = f10953a;
        String valueOf2 = String.valueOf(str);
        sek2.mo25416d(valueOf2.length() == 0 ? new String("Received invalid intent action: ") : "Received invalid intent action: ".concat(valueOf2), new Object[0]);
        return false;
    }
}
