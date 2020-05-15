package p000;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: pyh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class pyh extends pyw {

    /* renamed from: a */
    final /* synthetic */ String f40634a;

    /* renamed from: b */
    final /* synthetic */ byte[] f40635b;

    /* renamed from: c */
    final /* synthetic */ long f40636c;

    /* renamed from: d */
    final /* synthetic */ pyx f40637d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pyh(pyx pyx, String str, String str2, byte[] bArr, long j) {
        super(str);
        this.f40637d = pyx;
        this.f40634a = str2;
        this.f40635b = bArr;
        this.f40636c = j;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        pyx pyx = this.f40637d;
        qav qav = pyx.f40684d;
        Object[] objArr = new Object[4];
        int i = 0;
        objArr[0] = pyx.f40683c;
        objArr[1] = this.f40634a;
        byte[] bArr = this.f40635b;
        if (bArr != null) {
            i = bArr.length;
        }
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Long.valueOf(this.f40636c);
        qav.mo23670a("sendBinaryMessage: %s %s %d %d", objArr);
        if (!TextUtils.isEmpty(this.f40634a) && this.f40634a.length() <= 128 && !this.f40637d.mo23814e(this.f40634a)) {
            this.f40637d.f40686f.mo23206a(this.f40634a, this.f40635b, this.f40636c);
        }
    }
}
