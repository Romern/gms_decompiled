package p000;

import android.content.Context;
import com.google.android.gms.wallet.shared.common.ExceptionHandlingAsyncTask;
import java.security.Signature;

/* renamed from: awgd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awgd extends ExceptionHandlingAsyncTask {

    /* renamed from: a */
    final /* synthetic */ awfr f94288a;

    /* renamed from: b */
    final /* synthetic */ byte[] f94289b;

    /* renamed from: c */
    final /* synthetic */ Signature f94290c;

    /* renamed from: d */
    final /* synthetic */ int f94291d;

    /* renamed from: e */
    final /* synthetic */ awgf f94292e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public awgd(awgf awgf, Context context, awfr awfr, byte[] bArr, Signature signature, int i) {
        super(context);
        this.f94292e = awgf;
        this.f94288a = awfr;
        this.f94289b = bArr;
        this.f94290c = signature;
        this.f94291d = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo52117a(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        byte[] a = this.f94288a.mo52106a(this.f94289b, this.f94290c);
        if (a != null) {
            return bxtx.m123261a(a);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        bxtx bxtx = (bxtx) obj;
        awgf awgf = this.f94292e;
        awgf.f94296g = false;
        awge awge = awgf.f94294e;
        if (awge == null) {
            awgf.f94295f = true;
            awgf.f94293d = bxtx;
            awgf.f94297h = this.f94291d;
            return;
        }
        awge.mo52119a(this.f94291d, bxtx);
    }
}
