package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: caq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class caq {
    static {
        caq.class.getSimpleName();
    }

    /* renamed from: a */
    public static void m3856a(bxi bxi, byte b, byte[]... bArr) {
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (bxi.mo3583b(bArr2)) {
                Object[] objArr = {bArr2, bxi.mo3582a(bArr2)};
                i++;
                int i2 = cbd.f6383a;
            } else {
                String a = cbm.m3893a(bArr2);
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 33);
                sb.append("Missing tag ");
                sb.append(a);
                sb.append(" in data for CVN ");
                sb.append((int) b);
                throw new bon(sb.toString(), bop.f5271k);
            }
        }
    }

    /* renamed from: a */
    public static byte[] m3857a(bxm bxm, bya bya) {
        new Object[1][0] = bya;
        int i = cbd.f6383a;
        byte b = bya.mo3563i()[0];
        if (b == 10) {
            new Object[1][0] = (byte) 10;
            try {
                bxj bxj = bxm.f5994p;
                m3856a(bxj, (byte) 10, caj.f6358a, bzy.f6303a, bzz.f6308a, cad.f6325a, caf.f6337a, cag.f6343c, cah.f6348a, cai.f6353a);
                bxo bxo = bxm.f5988j;
                m3856a(bxo, (byte) 10, bxp.f6000a, bxs.f6023b);
                bxr f = bxm.f5984f.mo3578d().mo3432f(bxm);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(bxj.mo3481f().mo3563i());
                byteArrayOutputStream.write(bxj.mo3482w().mo3563i());
                byteArrayOutputStream.write(bxj.mo3589k().mo3563i());
                byteArrayOutputStream.write(bxj.mo3590l().mo3563i());
                byteArrayOutputStream.write(bxj.mo3483x().mo3563i());
                byteArrayOutputStream.write(bxj.mo3591m().mo3563i());
                byteArrayOutputStream.write(bxj.mo3592n().mo3563i());
                byteArrayOutputStream.write(bxj.mo3588j().mo3563i());
                byteArrayOutputStream.write(f.mo3563i());
                byteArrayOutputStream.write(bxo.mo3607v().mo3563i());
                new Object[1][0] = bxo;
                byteArrayOutputStream.write(((bxs) bxo.mo3464e()).mo3456d().mo3563i());
                while (byteArrayOutputStream.size() % 8 != 0) {
                    byteArrayOutputStream.write(0);
                }
                return byteArrayOutputStream.toByteArray();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (b == 17) {
            new Object[1][0] = (byte) 17;
            try {
                bxj bxj2 = bxm.f5994p;
                m3856a(bxj2, (byte) 17, caj.f6358a, bzy.f6303a);
                bxo bxo2 = bxm.f5988j;
                m3856a(bxo2, (byte) 17, bxp.f6000a, bxs.f6023b);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                byteArrayOutputStream2.write(bxj2.mo3481f().mo3563i());
                byteArrayOutputStream2.write(bxj2.mo3588j().mo3563i());
                byteArrayOutputStream2.write(bxo2.mo3607v().mo3563i());
                byteArrayOutputStream2.write(bxo2.mo3464e().mo3563i()[4]);
                while (byteArrayOutputStream2.size() % 8 != 0) {
                    byteArrayOutputStream2.write(0);
                }
                return byteArrayOutputStream2.toByteArray();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else if (b != 18) {
            switch (b) {
                case 20:
                    new Object[1][0] = (byte) 20;
                    try {
                        bxj bxj3 = bxm.f5994p;
                        m3856a(bxj3, (byte) 20, caj.f6358a, bzy.f6303a, bzz.f6308a, cad.f6325a, caf.f6337a, cag.f6343c, cah.f6348a, cai.f6353a);
                        bxo bxo3 = bxm.f5988j;
                        m3856a(bxo3, (byte) 20, bxp.f6000a, bxs.f6023b);
                        ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                        bxj3.mo3481f().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3482w().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3589k().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3590l().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3483x().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3591m().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3592n().mo3552a(byteArrayOutputStream3);
                        bxj3.mo3588j().mo3552a(byteArrayOutputStream3);
                        bxo3.mo3463d().mo3552a(byteArrayOutputStream3);
                        bxo3.mo3607v().mo3552a(byteArrayOutputStream3);
                        new Object[1][0] = bxo3;
                        byte[] bArr = new byte[6];
                        System.arraycopy(bxo3.mo3464e().mo3563i(), 2, bArr, 0, 6);
                        byteArrayOutputStream3.write(bArr);
                        byteArrayOutputStream3.write(128);
                        while (byteArrayOutputStream3.size() % 8 != 0) {
                            byteArrayOutputStream3.write(0);
                        }
                        return byteArrayOutputStream3.toByteArray();
                    } catch (IOException e3) {
                        throw new RuntimeException(e3);
                    }
                case 21:
                    new Object[1][0] = (byte) 21;
                    try {
                        bxj bxj4 = bxm.f5994p;
                        m3856a(bxj4, (byte) 21, bzy.f6303a, cag.f6343c, caj.f6358a);
                        bxo bxo4 = bxm.f5988j;
                        m3856a(bxo4, (byte) 17, bxp.f6000a, bxs.f6023b);
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        byteArrayOutputStream4.write(bxj4.mo3481f().mo3563i());
                        byteArrayOutputStream4.write(bxj4.mo3483x().mo3563i());
                        byteArrayOutputStream4.write(bxj4.mo3588j().mo3563i());
                        byteArrayOutputStream4.write(bxo4.mo3607v().mo3563i());
                        byteArrayOutputStream4.write(bxo4.mo3464e().mo3563i());
                        byteArrayOutputStream4.write(128);
                        while (byteArrayOutputStream4.size() % 8 != 0) {
                            byteArrayOutputStream4.write(0);
                        }
                        return byteArrayOutputStream4.toByteArray();
                    } catch (IOException e4) {
                        throw new RuntimeException(e4);
                    }
                case 22:
                    new Object[1][0] = (byte) 21;
                    try {
                        bxj bxj5 = bxm.f5994p;
                        m3856a(bxj5, (byte) 21, bzy.f6303a, cag.f6343c, caj.f6358a);
                        bxo bxo5 = bxm.f5988j;
                        m3856a(bxo5, (byte) 17, bxp.f6000a, bxs.f6023b);
                        ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                        byteArrayOutputStream5.write(bxj5.mo3481f().mo3563i());
                        byteArrayOutputStream5.write(bxj5.mo3483x().mo3563i());
                        byteArrayOutputStream5.write(bxj5.mo3588j().mo3563i());
                        byteArrayOutputStream5.write(bxo5.mo3607v().mo3563i());
                        byte[] bArr2 = new byte[8];
                        System.arraycopy(bxo5.mo3464e().mo3563i(), 2, bArr2, 0, 8);
                        byteArrayOutputStream5.write(bArr2);
                        byteArrayOutputStream5.write(128);
                        while (byteArrayOutputStream5.size() % 8 != 0) {
                            byteArrayOutputStream5.write(0);
                        }
                        return byteArrayOutputStream5.toByteArray();
                    } catch (IOException e5) {
                        throw new RuntimeException(e5);
                    }
                default:
                    String valueOf = String.valueOf(bya);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
                    sb.append("Unsupported CVN: ");
                    sb.append(valueOf);
                    throw new bon(sb.toString(), bop.f5271k);
            }
        } else {
            new Object[1][0] = (byte) 18;
            try {
                bxj bxj6 = bxm.f5994p;
                m3856a(bxj6, (byte) 18, caj.f6358a, bzy.f6303a, bzz.f6308a, cad.f6325a, caf.f6337a, cag.f6343c, cah.f6348a, cai.f6353a);
                bxo bxo6 = bxm.f5988j;
                m3856a(bxo6, (byte) 18, bxp.f6000a, bxs.f6023b);
                bxb d = bxm.f5984f.mo3578d();
                ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                byteArrayOutputStream6.write(bxj6.mo3481f().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3482w().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3589k().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3590l().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3483x().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3591m().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3592n().mo3563i());
                byteArrayOutputStream6.write(bxj6.mo3588j().mo3563i());
                byteArrayOutputStream6.write(d.mo3432f(bxm).mo3563i());
                byteArrayOutputStream6.write(bxo6.mo3607v().mo3563i());
                byteArrayOutputStream6.write(bxo6.mo3464e().mo3563i());
                byteArrayOutputStream6.write(128);
                while (byteArrayOutputStream6.size() % 8 != 0) {
                    byteArrayOutputStream6.write(0);
                }
                return byteArrayOutputStream6.toByteArray();
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        }
    }
}
