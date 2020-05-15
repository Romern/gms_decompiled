package p000;

import android.accounts.Account;
import android.content.ContentResolver;

/* renamed from: zux */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zux {
    /* renamed from: a */
    public static Account m46539a(String str) {
        return new Account(str, "com.google");
    }

    /* renamed from: b */
    public static boolean m46541b(String str) {
        return ContentResolver.getSyncAutomatically(m46539a(str), "com.google.android.gms.fitness");
    }

    /* renamed from: c */
    public static boolean m46542c(String str) {
        return m46541b(str) && ContentResolver.getIsSyncable(m46539a(str), "com.google.android.gms.fitness") > 0 && !ContentResolver.getPeriodicSyncs(m46539a(str), "com.google.android.gms.fitness").isEmpty();
    }

    /* renamed from: a */
    public static void m46540a(Account account) {
        ContentResolver.setIsSyncable(account, "com.google.android.gms.fitness", 1);
        ContentResolver.setSyncAutomatically(account, "com.google.android.gms.fitness", true);
    }
}
