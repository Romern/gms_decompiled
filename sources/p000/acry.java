package p000;

import android.os.SystemClock;

/* renamed from: acry */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acry {

    /* renamed from: a */
    public final byne f60652a;

    /* renamed from: b */
    public final botw f60653b;

    /* renamed from: c */
    private final long f60654c = SystemClock.elapsedRealtime();

    /* renamed from: d */
    private boolean f60655d;

    public acry(byne byne) {
        bmxy.m108581a(byne);
        this.f60652a = byne;
        bxvd da = botw.f134882d.mo74144da();
        long j = this.f60654c;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        botw botw = (botw) da.f164949b;
        int i = botw.f134884a | 1;
        botw.f134884a = i;
        botw.f134885b = j;
        botw.f134886c = 16;
        botw.f134884a = i | 2;
        this.f60653b = (botw) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo33049a(String str, String str2) {
        sdo.m34970a(!this.f60655d);
        this.f60655d = true;
        if (str != null) {
            byne byne = this.f60652a;
            botw botw = this.f60653b;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            bxvd da = botx.f134887e.mo74144da();
            long j = this.f60654c * 1000;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            botx botx = (botx) da.f164949b;
            int i = botx.f134889a | 2;
            botx.f134889a = i;
            botx.f134891c = j;
            int i2 = i | 4;
            botx.f134889a = i2;
            botx.f134892d = elapsedRealtime * 1000;
            str.getClass();
            botx.f134889a = i2 | 1;
            botx.f134890b = str;
            byne.mo74398a(botw, (botx) da.mo74062i());
        }
        if (str2 != null) {
            byne byne2 = this.f60652a;
            botw botw2 = this.f60653b;
            bxvd da2 = bott.f134871d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bott bott = (bott) da2.f164949b;
            str2.getClass();
            bott.f134873a = 1 | bott.f134873a;
            bott.f134874b = str2;
            String valueOf = String.valueOf(this.f60654c);
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bott bott2 = (bott) da2.f164949b;
            valueOf.getClass();
            bott2.f134873a |= 2;
            bott2.f134875c = valueOf;
            byne2.mo74396a(botw2, (bott) da2.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo33050a(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                this.f60652a.mo74396a(this.f60653b, (bott) bxvk.m124014a(bott.f134871d, bArr));
            } catch (bxwf e) {
            }
        }
    }
}
