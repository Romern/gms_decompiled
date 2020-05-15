package p000;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;

/* renamed from: kag */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kag {

    /* renamed from: a */
    private static final Logger f23655a = ght.m13171a("NotificationChannelUtil");

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
    /* renamed from: a */
    public static void m17570a(sex sex, Context context, String str) {
        char c;
        if (m17571a()) {
            int hashCode = str.hashCode();
            if (hashCode != 579461612) {
                if (hashCode == 2139740008 && str.equals("com.google.android.gms.auth.base.Notifications.AuthGroup.UncertifiedDevice")) {
                    c = 1;
                    if (c == 0) {
                        sex.mo25443a(new NotificationChannelGroup("com.google.android.gms.auth.base.Notifications.AuthGroup", context.getString(C0126R.string.auth_account_module_display_name)));
                        NotificationChannel notificationChannel = new NotificationChannel("com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth", context.getString(C0126R.string.account_level_title), 3);
                        notificationChannel.setGroup("com.google.android.gms.auth.base.Notifications.AuthGroup");
                        sex.mo25442a(notificationChannel);
                        return;
                    } else if (c != 1) {
                        Logger Logger = f23655a;
                        String valueOf = String.valueOf(str);
                        Logger.mo25412b(valueOf.length() == 0 ? new String("Attempt to initialize unknown notification channel ") : "Attempt to initialize unknown notification channel ".concat(valueOf), new Object[0]);
                        return;
                    } else {
                        sex.mo25447b(str);
                        return;
                    }
                }
            } else if (str.equals("com.google.android.gms.auth.base.Notifications.AuthGroup.AccountReauth")) {
                c = 0;
                if (c == 0) {
                }
            }
            c = 65535;
            if (c == 0) {
            }
        }
    }

    /* renamed from: a */
    public static boolean m17571a() {
        int i = Build.VERSION.SDK_INT;
        return gnv.m13540am();
    }
}
