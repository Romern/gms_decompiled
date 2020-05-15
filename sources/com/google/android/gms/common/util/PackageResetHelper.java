package com.google.android.gms.common.util;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Handler;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class PackageResetHelper extends aacn {

    /* renamed from: a */
    private final Context f30403a;

    /* renamed from: b */
    private final ssn f30404b;

    /* renamed from: c */
    private final boolean f30405c;

    public PackageResetHelper(Context context, ssn ssn, boolean z) {
        super("common-base");
        this.f30403a = context;
        this.f30404b = ssn;
        this.f30405c = z;
    }

    /* renamed from: a */
    public final void mo17933a() {
        this.f30403a.unregisterReceiver(this);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        String str;
        char c;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getSchemeSpecificPart();
        } else {
            str = null;
        }
        if (str != null) {
            String action = intent.getAction();
            int i = 0;
            switch (action.hashCode()) {
                case -1072806502:
                    if (action.equals("android.intent.action.QUERY_PACKAGE_RESTART")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -757780528:
                    if (action.equals("android.intent.action.PACKAGE_RESTARTED")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 172491798:
                    if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 525384130:
                    if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 666876841:
                    if (action.equals("com.google.android.gms.INSTANT_APP_STOPPED")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                String[] stringArrayExtra = intent.getStringArrayExtra("android.intent.extra.PACKAGES");
                if (stringArrayExtra != null) {
                    int length = stringArrayExtra.length;
                    while (i < length) {
                        if (!this.f30404b.mo26048b(stringArrayExtra[i])) {
                            i++;
                        } else {
                            setResultCode(-1);
                            return;
                        }
                    }
                }
            } else if (c == 1) {
                String[] stringArrayExtra2 = intent.getStringArrayExtra("android.intent.extra.changed_component_name_list");
                if (stringArrayExtra2 != null) {
                    int length2 = stringArrayExtra2.length;
                    int i2 = 0;
                    while (i2 < length2) {
                        if (!str.equals(stringArrayExtra2[i2])) {
                            i2++;
                        } else {
                            try {
                                if (!this.f30403a.getPackageManager().getApplicationInfo(str, 0).enabled) {
                                    this.f30404b.mo26047a(str);
                                    return;
                                }
                                return;
                            } catch (PackageManager.NameNotFoundException e) {
                                return;
                            }
                        }
                    }
                }
            } else if (c == 2 || c == 3) {
                this.f30404b.mo26047a(str);
            } else if (c == 4 && this.f30405c) {
                this.f30404b.mo26047a(str);
            }
        }
    }

    /* renamed from: a */
    public final void mo17934a(Handler handler) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addAction("android.intent.action.QUERY_PACKAGE_RESTART");
        intentFilter.addDataScheme("package");
        this.f30403a.registerReceiver(this, intentFilter, null, handler);
        if (this.f30405c) {
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.android.gms.INSTANT_APP_STOPPED");
            this.f30403a.registerReceiver(this, intentFilter2, "com.google.android.gms.permission.INTERNAL_BROADCAST", handler);
        }
    }
}
