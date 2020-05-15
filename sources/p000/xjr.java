package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xjr implements bmxj {

    /* renamed from: a */
    final /* synthetic */ xka f52449a;

    /* renamed from: b */
    final /* synthetic */ byte[] f52450b;

    /* renamed from: c */
    final /* synthetic */ AtomicReference f52451c;

    /* renamed from: d */
    final /* synthetic */ AtomicReference f52452d;

    /* renamed from: e */
    final /* synthetic */ AtomicReference f52453e;

    /* renamed from: f */
    final /* synthetic */ Account f52454f;

    public xjr(xka xka, byte[] bArr, AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3, Account account) {
        this.f52449a = xka;
        this.f52450b = bArr;
        this.f52451c = atomicReference;
        this.f52452d = atomicReference2;
        this.f52453e = atomicReference3;
        this.f52454f = account;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        xjy xjy;
        try {
            xjy = xjy.m43070a(new xkb(this.f52449a, ((KeyHandleResult) obj).f10538b));
        } catch (xma e) {
            xjy = null;
        }
        return new xjm(this.f52450b, (byte[]) this.f52451c.get(), (byte[]) this.f52452d.get(), (byte[]) this.f52453e.get(), bmxv.m108567c(xjy), this.f52454f.name);
    }
}
