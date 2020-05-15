package p000;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.os.Bundle;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: aowe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aowe extends soa {

    /* renamed from: a */
    final /* synthetic */ Context f83732a;

    /* renamed from: b */
    final /* synthetic */ String f83733b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aowe(Context context, String str) {
        super(10);
        this.f83732a = context;
        this.f83733b = str;
    }

    public final void run() {
        String str;
        Context context = this.f83732a;
        String str2 = this.f83733b;
        Iterator it = soz.m35801d(context, context.getPackageName()).iterator();
        while (true) {
            if (!it.hasNext()) {
                str = null;
                break;
            }
            Account account = (Account) it.next();
            try {
                if (str2.equals(gie.m13198c(context, account.name))) {
                    str = account.name;
                    break;
                }
            } catch (gid | IOException | IllegalStateException e) {
                aowu.m69733a("RemindersAccount", "Failed to get account ID. %s", e.getMessage());
            }
        }
        if (bmxx.m108577a(str)) {
            aowu.m69733a("Reminders_GcmBroadcastReceiver", "Cannot find account name.", new Object[0]);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("chime", true);
        ContentResolver.requestSync(new Account(str, "com.google"), "com.google.android.gms.reminders", bundle);
    }
}
