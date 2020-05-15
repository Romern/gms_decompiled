package p000;

import android.content.Context;
import android.content.Intent;

/* renamed from: akny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class akny {
    /* renamed from: a */
    public static Intent m60109a(Context context, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION");
        className.putExtras(intent);
        return className;
    }

    /* renamed from: a */
    public static Intent m60110a(Context context, Intent intent, int i, Boolean bool, String str) {
        Intent a = m60109a(context, intent);
        int i2 = i - 1;
        if (i != 0) {
            a.putExtra("com.google.android.gms.notifications.intents.readState", i2);
            a.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", bool);
            a.putExtra("com.google.android.gms.notifications.intents.actionId", str);
            return a;
        }
        throw null;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: a */
    public static Intent m60111a(Context context, blcs blcs, String str, blcz blcz) {
        int i;
        bldb bldb;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.notifications.GunsNotificationActivity");
        className.setAction("com.google.android.gms.notifications.intents.START_ACTIVITY");
        className.putExtra("gms.gnots.payload", akoc.m60118a((bxxc) blcs));
        int i2 = 1;
        if (blcz == null) {
            className.putExtra("com.google.android.gms.notifications.intents.readState", 2);
            className.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", true);
            if ((blcs.f125976a & 16) != 0) {
                bldb = blcs.f125981f;
                if (bldb == null) {
                    bldb = bldb.f126036d;
                }
            } else {
                bldb = null;
            }
            className.putExtra("com.google.android.gms.notifications.intents.target", akoc.m60118a((bxxc) bldb));
        } else {
            if ((blcz.f126009a & 32) != 0) {
                int a = blch.m107015a(blcz.f126014f);
                if (a != 0) {
                    i2 = a;
                }
                i = i2 - 1;
            } else {
                i = 0;
            }
            className.putExtra("com.google.android.gms.notifications.intents.readState", i);
            className.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", blcz.f126013e);
            if ((blcz.f126009a & 2) != 0) {
                bldb bldb2 = blcz.f126011c;
                if (bldb2 == null) {
                    bldb2 = bldb.f126036d;
                }
                className.putExtra("com.google.android.gms.notifications.intents.target", akoc.m60118a((bxxc) bldb2));
            }
            className.putExtra("com.google.android.gms.notifications.intents.actionId", blcz.f126012d);
        }
        className.putExtra("com.google.android.gms.notifications.intents.accountName", str);
        return className;
    }
}
