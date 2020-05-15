package p000;

import android.accounts.Account;
import android.content.Intent;

/* renamed from: jvh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class jvh {

    /* renamed from: a */
    public final int f23344a;

    /* renamed from: b */
    public final Account f23345b;

    /* renamed from: c */
    public final Intent f23346c;

    /* renamed from: d */
    public final String f23347d;

    /* renamed from: e */
    public final boolean f23348e;

    /* renamed from: f */
    public final String f23349f;

    /* renamed from: g */
    public final int f23350g;

    public jvh(int i, Account account, Intent intent, String str, boolean z, String str2, int i2) {
        if (i == 0) {
            sdo.m34959a(account);
        }
        this.f23344a = i;
        this.f23345b = account;
        this.f23346c = intent;
        this.f23347d = str;
        this.f23348e = z;
        this.f23349f = str2;
        this.f23350g = i2;
    }

    public final String toString() {
        return "status=" + this.f23344a + "unicorn=" + this.f23348e;
    }
}
