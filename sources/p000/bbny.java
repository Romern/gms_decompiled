package p000;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;

/* renamed from: bbny */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bbny {

    /* renamed from: a */
    public final befa f102996a;

    /* renamed from: b */
    private final Context f102997b;

    /* renamed from: c */
    private final String f102998c;

    public bbny(Context context, befa befa, String str) {
        this.f102997b = context;
        this.f102996a = befa;
        this.f102998c = str;
    }

    /* renamed from: a */
    public final Uri mo56264a() {
        befh a = befi.m94962a(this.f102997b);
        a.mo60660a(this.f102998c);
        return a.mo60657a();
    }

    /* renamed from: a */
    public final Uri mo56265a(Account account) {
        befh a = befi.m94962a(this.f102997b);
        a.mo60660a(this.f102998c);
        a.mo60658a(account);
        return a.mo60657a();
    }
}
