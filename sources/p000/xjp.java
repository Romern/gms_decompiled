package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.HashResult;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xjp implements bqeh {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f52440a;

    /* renamed from: b */
    final /* synthetic */ ios f52441b;

    /* renamed from: c */
    final /* synthetic */ Account f52442c;

    /* renamed from: d */
    final /* synthetic */ String f52443d;

    /* renamed from: e */
    final /* synthetic */ byte[] f52444e;

    public xjp(AtomicReference atomicReference, ios ios, Account account, String str, byte[] bArr) {
        this.f52440a = atomicReference;
        this.f52441b = ios;
        this.f52442c = account;
        this.f52443d = str;
        this.f52444e = bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        this.f52440a.set(Arrays.copyOf(((HashResult) obj).f10534b, 16));
        return adbb.m50100a(this.f52441b.mo24701a((rpa) new inz(this.f52442c, this.f52443d.concat("_cable_lk"), "AES", this.f52444e, xjt.f52459a)));
    }
}
