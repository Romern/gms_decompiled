package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xjs implements bmxj {

    /* renamed from: a */
    final /* synthetic */ byte[] f52455a;

    /* renamed from: b */
    final /* synthetic */ AtomicReference f52456b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f52457c;

    /* renamed from: d */
    final /* synthetic */ Account f52458d;

    public xjs(byte[] bArr, AtomicReference atomicReference, AtomicReference atomicReference2, Account account) {
        this.f52455a = bArr;
        this.f52456b = atomicReference;
        this.f52457c = atomicReference2;
        this.f52458d = account;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        return new xjm(this.f52455a, (byte[]) this.f52456b.get(), (byte[]) this.f52457c.get(), ((KeyDerivationResult) obj).f10536b, bmvz.f131120a, this.f52458d.name);
    }
}
