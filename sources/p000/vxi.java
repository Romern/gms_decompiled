package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Random;

/* renamed from: vxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class vxi implements vvq {

    /* renamed from: a */
    public volatile vxp f50186a;

    /* renamed from: b */
    public volatile byte[] f50187b;

    /* renamed from: c */
    final /* synthetic */ vxj f50188c;

    /* renamed from: d */
    private final long f50189d;

    /* renamed from: e */
    private final vxu f50190e;

    public vxi(vxj vxj, String str, vxu vxu) {
        this.f50188c = vxj;
        this.f50190e = vxu;
        this.f50187b = vxv.m41563a(str);
        this.f50189d = 0;
    }

    /* renamed from: a */
    public final String mo28905a(Map map) {
        byte[] bArr;
        vxu b = this.f50190e.mo28935b();
        b.mo28934a(14, vxw.COARSE);
        if (this.f50187b == null) {
            vwy vwy = new vwy();
            this.f50188c.mo28931a(new vxg(this, map, vwy));
            try {
                bArr = (byte[]) vwy.mo28919a(this.f50189d);
                if (bArr == null) {
                    long j = this.f50189d;
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Snapshot timeout: ");
                    sb.append(j);
                    sb.append(" ms");
                    bArr = vxv.m41563a(sb.toString());
                }
            } catch (InterruptedException e) {
                String valueOf = String.valueOf(e.toString());
                bArr = vxv.m41563a(valueOf.length() == 0 ? new String("Results transfer failed: ") : "Results transfer failed: ".concat(valueOf));
            }
        } else {
            bArr = this.f50187b;
        }
        b.mo28934a(15, vxw.COARSE);
        if (cdqy.m134715b()) {
            bxvd da = bltc.f127663f.mo74144da();
            bxtx a = bxtx.m123261a(bArr);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bltc bltc = (bltc) da.f164949b;
            a.getClass();
            bltc.f127665a |= 2;
            bltc.f127667c = a;
            bltb a2 = b.mo28933a();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bltc bltc2 = (bltc) da.f164949b;
            a2.getClass();
            bltc2.f127668d = a2;
            bltc2.f127665a |= 4;
            blsy blsy = blsy.f127650c;
            bxvd da2 = blsy.f127650c.mo74144da();
            if (blsy.f127653b != cdrn.m134752b()) {
                boolean b2 = cdrn.m134752b();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blsy blsy2 = (blsy) da2.f164949b;
                blsy2.f127652a |= 1;
                blsy2.f127653b = b2;
            }
            blsy blsy3 = (blsy) da2.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bltc bltc3 = (bltc) da.f164949b;
            blsy3.getClass();
            bltc3.f127669e = blsy3;
            bltc3.f127665a |= 8;
            bltc bltc4 = (bltc) da.mo74062i();
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr2 = new byte[8];
                new Random().nextBytes(bArr2);
                bArr2[0] = 10;
                bArr2[1] = 6;
                byte b3 = 3;
                for (int i = 0; i < 8; i++) {
                    b3 ^= bArr2[i];
                }
                bArr2[2] = (byte) (bArr2[2] ^ ((byte) b3));
                byteArrayOutputStream.write(bArr2);
                bxvd bxvd = (bxvd) bltc4.mo74142c(5);
                bxvd.mo73625a((bxvk) bltc4);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                bltc bltc5 = (bltc) bxvd.f164949b;
                bltc5.f127665a &= -2;
                bltc5.f127666b = bltc.f127663f.f127666b;
                ((bltc) bxvd.mo74062i()).mo73638a(byteArrayOutputStream);
                bArr = byteArrayOutputStream.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        return vxv.m41562a(bArr);
    }

    /* renamed from: b */
    public final void mo28907b() {
        this.f50188c.mo28931a(new vxh(this));
    }

    public vxi(vxj vxj, vxp vxp, long j, vxu vxu) {
        this.f50188c = vxj;
        this.f50186a = vxp;
        this.f50189d = j;
        this.f50190e = vxu;
        vxj.f50193b++;
    }

    /* renamed from: a */
    public final boolean mo28906a() {
        return this.f50186a != null && this.f50187b == null && this.f50186a.asBinder().pingBinder();
    }
}
