package p000;

import android.content.Context;
import android.util.Log;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.List;

/* renamed from: gro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class gro implements grt {

    /* renamed from: a */
    private final grm f18896a;

    /* renamed from: b */
    private final grn f18897b;

    /* renamed from: c */
    private final byqd f18898c = new byqd(this.f18899d, new gru());

    /* renamed from: d */
    private final byqf f18899d;

    public gro(grm grm, grn grn) {
        byqf byqf = new byqf();
        this.f18896a = grm;
        this.f18897b = grn;
        this.f18899d = byqf;
    }

    /* renamed from: a */
    public static gro m13782a(Context context) {
        return new gro(new grm(context), new grx(context));
    }

    /* renamed from: a */
    public final List mo12137a(String str, boolean z) {
        return mo12138a(str, z, null);
    }

    /* renamed from: a */
    public final List mo12138a(String str, boolean z, byte[] bArr) {
        grv a = this.f18896a.mo12135a(str);
        if (a == null) {
            Log.e("EightDigitOtp", "Failed to get Authzen secret.");
            return null;
        }
        Long a2 = this.f18897b.mo12136a(a);
        String valueOf = String.valueOf(a2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
        sb.append("Current counter: ");
        sb.append(valueOf);
        sb.toString();
        if (a2 != null) {
            try {
                String[] strArr = new String[1];
                byqd byqd = this.f18898c;
                byte[] bArr2 = a.f18911b;
                long longValue = a2.longValue();
                if (longValue >= 0) {
                    strArr[0] = String.format("%02d%s", Long.valueOf(longValue % byqd.f167377a), new byqj(byqd.f167378b.mo12146a(bArr2), 6, byqj.f167381a).mo74470a(byqf.m125121a(), longValue, 0, bArr));
                    return Arrays.asList(strArr);
                }
                throw new IllegalArgumentException("Counter must be non-negative");
            } catch (InvalidKeyException e) {
                Log.e("EightDigitOtp", "Failed to generate code.");
                return null;
            }
        } else {
            Log.e("EightDigitOtp", "Failed to get counter.");
            return null;
        }
    }
}
