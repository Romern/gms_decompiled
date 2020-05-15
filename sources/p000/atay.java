package p000;

import android.text.TextUtils;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import java.io.IOException;

/* renamed from: atay */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class atay {

    /* renamed from: a */
    private final askf f89983a;

    static {
        sgj sgj = sgj.UNKNOWN;
    }

    private atay(askf askf) {
        this.f89983a = askf;
    }

    /* renamed from: a */
    public static atay m75352a(askf askf) {
        return new atay(askf);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final atax mo49774a(bmtv bmtv, bmum bmum) {
        byte[] bArr;
        byte[] bArr2;
        bmtv bmtv2 = bmtv;
        if (bmtv2 == null) {
            return atax.m75350a(5);
        }
        try {
            int a = bmtu.m108377a(bmtv2.f130915a);
            if (a == 0) {
                a = 1;
            }
            int i = a - 1;
            if (i == 1) {
                return atax.m75351a(null, 2);
            }
            if (i != 3) {
                return atax.m75350a(5);
            }
            if (bmum != null) {
                bArr = bmum.mo73642k();
            } else {
                bArr = null;
            }
            String str = bmtv2.f130916b;
            try {
                askf askf = this.f89983a;
                if (!"com.google.android.gms.ui".equals(ssy.m36271a())) {
                    AccountInfo a2 = askf.mo49209a();
                    AccountInfo b = asix.m74201b(askf.f89126d, askf.f89125c);
                    if (b != null) {
                        if (!b.f108325a.equals(a2.f108325a)) {
                            throw new ataw();
                        }
                    }
                    if (b == null) {
                        new asiv().mo49195a(askf);
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    bArr2 = atds.m75668a(atds.m75666a(askf), str);
                } else {
                    bArr2 = null;
                }
                return atax.m75351a(atrq.m76260a("com.google.android.gms", askf.mo49209a(), null, bArr2, false, null, bArr, null, false, false, false, false, null), 4);
            } catch (asks | atfh | IOException e) {
                return atax.m75350a(4);
            } catch (ataw e2) {
                return atax.m75350a(6);
            }
        } catch (IOException e3) {
            return atax.m75350a(4);
        } catch (atfh e4) {
            return atax.m75350a(4);
        } catch (asks e5) {
            return atax.m75350a(4);
        } catch (ataw e6) {
            return atax.m75350a(6);
        }
    }
}
