package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xjq implements bqeh {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f52445a;

    /* renamed from: b */
    final /* synthetic */ ios f52446b;

    /* renamed from: c */
    final /* synthetic */ String f52447c;

    /* renamed from: d */
    final /* synthetic */ Account f52448d;

    public xjq(AtomicReference atomicReference, ios ios, String str, Account account) {
        this.f52445a = atomicReference;
        this.f52446b = ios;
        this.f52447c = str;
        this.f52448d = account;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        this.f52445a.set(((KeyDerivationResult) obj).f10536b);
        return adbb.m50100a(this.f52446b.mo13186b(this.f52447c, this.f52448d));
    }
}
