package p000;

import android.accounts.AccountManager;
import android.content.Context;

/* renamed from: alwf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alwf {

    /* renamed from: a */
    public static final Object f74456a = new Object();

    /* renamed from: b */
    public static alwf f74457b;

    /* renamed from: c */
    public final Context f74458c;

    /* renamed from: d */
    public final AccountManager f74459d;

    public alwf() {
    }

    public alwf(Context context) {
        this.f74458c = context;
        this.f74459d = AccountManager.get(context);
    }
}
