package com.google.android.gms.common.analytics;

import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class CoreAnalyticsIntentOperation extends IntentOperation {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final SharedPreferences mo17699a() {
        return getSharedPreferences("coreanalyticsprefs", 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0102  */
    public final void onHandleIntent(Intent intent) {
        int i;
        long j;
        boolean z;
        long j2;
        Intent intent2 = intent;
        int i2 = 0;
        switch (intent2.getIntExtra("event_code", 0)) {
            case 0:
                i2 = 1;
                break;
            case 1:
                i2 = 2;
                break;
            case 2:
                i2 = 3;
                break;
            case 3:
                i2 = 4;
                break;
            case 4:
                i2 = 5;
                break;
            case 5:
                i2 = 6;
                break;
            case 6:
                i2 = 7;
                break;
            case 7:
                i2 = 8;
                break;
            case 8:
                i2 = 9;
                break;
            case 9:
                i2 = 10;
                break;
            case 10:
                i2 = 11;
                break;
            case 11:
                i2 = 12;
                break;
            case 12:
                i2 = 13;
                break;
            case 13:
                i2 = 14;
                break;
            case 14:
                i2 = 15;
                break;
            case 15:
                i2 = 16;
                break;
            case 16:
                i2 = 17;
                break;
            case 17:
                i2 = 18;
                break;
            case 18:
                i2 = 19;
                break;
            case 19:
                i2 = 20;
                break;
            case 20:
                i2 = 21;
                break;
            case 21:
                i2 = 22;
                break;
            case 22:
                i2 = 23;
                break;
            case 23:
                i2 = 24;
                break;
            case 24:
                i2 = 25;
                break;
            case 25:
                i2 = 26;
                break;
        }
        if (i2 == 0) {
            i2 = 1;
        }
        int i3 = i2 - 1;
        rik.m33637a();
        rpr b = rpr.m34216b();
        int i4 = -1;
        switch (i3) {
            case 7:
            case 8:
                rik.m33639a(b, i2, asie.m74164a(b));
                if (i2 == 8) {
                    SharedPreferences.Editor edit = mo17699a().edit();
                    edit.putLong("last_periodic_run", System.currentTimeMillis());
                    edit.apply();
                }
                j = ((Long) rst.f43610e.mo25081c()).longValue();
                i = 8;
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                int intExtra = intent2.getIntExtra("post_install_checkin_stage", -1);
                rik.m33638a(b, i2, intExtra, asie.m74164a(b));
                if (i2 == 10) {
                    SharedPreferences a = mo17699a();
                    long currentTimeMillis = System.currentTimeMillis();
                    long j3 = a.getLong("last_periodic_run", currentTimeMillis);
                    long longValue = ((Long) rst.f43610e.mo25081c()).longValue();
                    long j4 = currentTimeMillis - j3;
                    if (j4 <= 0 || j4 >= longValue) {
                        j2 = longValue;
                    } else {
                        j2 = longValue - j4;
                    }
                    ril.m33641a();
                    ril.m33643a(b, 8, j2);
                }
                i4 = intExtra + 1;
                if (i3 == 9) {
                    z = cdka.f181086a.mo6606a().mo77770b();
                } else if (i3 != 11) {
                    if (i3 == 12) {
                        z = cdka.f181086a.mo6606a().mo77769a();
                    }
                    if (i4 < 0) {
                        if (i4 > 4) {
                            i = i2;
                            j = 0;
                            break;
                        } else {
                            j = (long) Math.scalb((float) ((Long) rst.f43608c.mo25081c()).longValue(), i4);
                            i = 11;
                            break;
                        }
                    } else {
                        i = i2;
                        j = 0;
                        break;
                    }
                } else {
                    z = cdka.f181086a.mo6606a().mo77771c();
                }
                if (!z) {
                    i = i2;
                    j = 0;
                    break;
                }
                if (i4 < 0) {
                }
                break;
            default:
                StringBuilder sb = new StringBuilder(30);
                sb.append("Unknown eventCode: ");
                sb.append(i3);
                Log.w("CoreAnalyticsIntentSrv", sb.toString());
                i = i2;
                j = 0;
                break;
        }
        if (j > 0) {
            ril.m33641a();
            ril.m33642a(b, i, i4, j);
        }
    }
}
