package p000;

import android.accounts.Account;
import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: jdi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jdi {

    /* renamed from: a */
    public static final sek f22220a = jdh.m16547a("VaultServiceGrpcClient");

    /* renamed from: b */
    public final chsz f22221b = m16548b();

    /* renamed from: c */
    public final Account f22222c;

    /* renamed from: d */
    public final Context f22223d;

    public jdi(Context context, Account account) {
        this.f22222c = account;
        this.f22223d = context;
    }

    /* renamed from: b */
    private static synchronized chsz m16548b() {
        chsz b;
        synchronized (jdi.class) {
            b = chta.m149516a(ccfy.f178890a.mo6606a().mo75884J(), (int) ccfy.f178890a.mo6606a().mo75885K()).mo85581b();
        }
        return b;
    }

    /* renamed from: a */
    public final void mo13600a() {
        try {
            this.f22221b.mo85624c();
            this.f22221b.mo85623a(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
        }
    }
}
