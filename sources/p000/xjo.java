package p000;

import android.accounts.Account;
import com.google.android.gms.auth.cryptauth.HashResult;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xjo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xjo implements bqeh {

    /* renamed from: a */
    final /* synthetic */ AtomicReference f52435a;

    /* renamed from: b */
    final /* synthetic */ byte[] f52436b;

    /* renamed from: c */
    final /* synthetic */ ios f52437c;

    /* renamed from: d */
    final /* synthetic */ Account f52438d;

    /* renamed from: e */
    final /* synthetic */ String f52439e;

    public xjo(AtomicReference atomicReference, byte[] bArr, ios ios, Account account, String str) {
        this.f52435a = atomicReference;
        this.f52436b = bArr;
        this.f52437c = ios;
        this.f52438d = account;
        this.f52439e = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bqgg mo6375a(Object obj) {
        byte[] copyOf = Arrays.copyOf(((HashResult) obj).f10534b, 8);
        this.f52435a.set(bqce.m112562a(this.f52436b, copyOf));
        return adbb.m50100a(this.f52437c.mo13179a(this.f52438d, this.f52439e.concat("_cable_irk"), "HmacSHA256", sqc.m35959a((byte[]) this.f52435a.get(), xjt.f52462d)));
    }
}
