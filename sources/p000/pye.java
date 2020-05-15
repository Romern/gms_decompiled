package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pye */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pye extends aaab {

    /* renamed from: a */
    final /* synthetic */ String f40615a;

    /* renamed from: b */
    final /* synthetic */ byte[] f40616b;

    /* renamed from: c */
    final /* synthetic */ long f40617c;

    /* renamed from: d */
    final /* synthetic */ pyf f40618d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pye(pyf pyf, String str, String str2, byte[] bArr, long j) {
        super(str);
        this.f40618d = pyf;
        this.f40615a = str2;
        this.f40616b = bArr;
        this.f40617c = j;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyf pyf = this.f40618d;
        qav qav = pyf.f40622d;
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = pyf.f40621c;
        objArr[1] = this.f40615a;
        byte[] bArr = this.f40616b;
        if (bArr != null) {
            i = bArr.length;
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Long.valueOf(this.f40617c);
        qav.mo23670a("sendBinaryMessage: %s %s %d %d", objArr);
        if (!TextUtils.isEmpty(this.f40615a) && this.f40615a.length() <= 128 && !this.f40618d.mo23809e(this.f40615a)) {
            this.f40618d.f40624f.mo23206a(this.f40615a, this.f40616b, this.f40617c);
        }
    }
}
