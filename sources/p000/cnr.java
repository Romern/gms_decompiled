package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cnr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class cnr implements cdm {

    /* renamed from: a */
    private static final cnq f7108a = new cnq();

    /* renamed from: b */
    private final Context f7109b;

    /* renamed from: c */
    private final List f7110c;

    /* renamed from: d */
    private final cnq f7111d;

    /* renamed from: e */
    private final cns f7112e;

    public cnr(Context context, List list, cgt cgt, cgr cgr) {
        cnq cnq = f7108a;
        this.f7109b = context.getApplicationContext();
        this.f7110c = list;
        this.f7112e = new cns(cgt, cgr);
        this.f7111d = cnq;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ cgj mo3743a(Object obj, int i, int i2, cdk cdk) {
        ccq ccq;
        boolean z;
        boolean z2;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        ccr a = this.f7111d.mo4001a(byteBuffer);
        try {
            cqw.m7370a();
            if (a.f6533b != null) {
                cnw cnw = null;
                int i3 = 0;
                if (!a.mo3723e()) {
                    StringBuilder sb = new StringBuilder();
                    for (int i4 = 0; i4 < 6; i4++) {
                        sb.append((char) a.mo3721c());
                    }
                    if (sb.toString().startsWith("GIF")) {
                        a.f6534c.f6524f = a.mo3722d();
                        a.f6534c.f6525g = a.mo3722d();
                        int c = a.mo3721c();
                        ccq ccq2 = a.f6534c;
                        ccq2.f6526h = (c & 128) != 0;
                        ccq2.f6527i = (int) Math.pow(2.0d, (double) ((c & 7) + 1));
                        a.f6534c.f6528j = a.mo3721c();
                        a.f6534c.f6529k = a.mo3721c();
                        if (a.f6534c.f6526h && !a.mo3723e()) {
                            ccq ccq3 = a.f6534c;
                            ccq3.f6519a = a.mo3719a(ccq3.f6527i);
                            ccq ccq4 = a.f6534c;
                            ccq4.f6530l = ccq4.f6519a[ccq4.f6528j];
                        }
                    } else {
                        a.f6534c.f6520b = 1;
                    }
                    if (!a.mo3723e()) {
                        boolean z3 = false;
                        while (true) {
                            if (!z3) {
                                if (a.mo3723e()) {
                                    break;
                                }
                                int i5 = a.f6534c.f6521c;
                                int c2 = a.mo3721c();
                                if (c2 == 33) {
                                    int c3 = a.mo3721c();
                                    if (c3 == 1) {
                                        a.mo3718a();
                                    } else if (c3 == 249) {
                                        a.f6534c.f6522d = new ccp();
                                        a.mo3721c();
                                        int c4 = a.mo3721c();
                                        ccp ccp = a.f6534c.f6522d;
                                        int i6 = (c4 & 28) >> 2;
                                        ccp.f6514g = i6;
                                        if (i6 == 0) {
                                            ccp.f6514g = 1;
                                        }
                                        if ((c4 & 1) == 0) {
                                            z = false;
                                        } else {
                                            z = true;
                                        }
                                        ccp.f6513f = z;
                                        int d = a.mo3722d();
                                        if (d < 2) {
                                            d = 10;
                                        }
                                        ccp ccp2 = a.f6534c.f6522d;
                                        ccp2.f6516i = d * 10;
                                        ccp2.f6515h = a.mo3721c();
                                        a.mo3721c();
                                    } else if (c3 == 254) {
                                        a.mo3718a();
                                    } else if (c3 != 255) {
                                        a.mo3718a();
                                    } else {
                                        a.mo3720b();
                                        StringBuilder sb2 = new StringBuilder();
                                        for (int i7 = 0; i7 < 11; i7++) {
                                            sb2.append((char) a.f6532a[i7]);
                                        }
                                        if (sb2.toString().equals("NETSCAPE2.0")) {
                                            while (true) {
                                                a.mo3720b();
                                                byte[] bArr = a.f6532a;
                                                if (bArr[0] == 1) {
                                                    a.f6534c.f6531m = ((bArr[2] & 255) << 8) | (bArr[1] & 255);
                                                }
                                                if (a.f6535d > 0) {
                                                    if (a.mo3723e()) {
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        } else {
                                            a.mo3718a();
                                        }
                                    }
                                } else if (c2 == 44) {
                                    ccq ccq5 = a.f6534c;
                                    if (ccq5.f6522d == null) {
                                        ccq5.f6522d = new ccp();
                                    }
                                    a.f6534c.f6522d.f6508a = a.mo3722d();
                                    a.f6534c.f6522d.f6509b = a.mo3722d();
                                    a.f6534c.f6522d.f6510c = a.mo3722d();
                                    a.f6534c.f6522d.f6511d = a.mo3722d();
                                    int c5 = a.mo3721c();
                                    int i8 = c5 & 128;
                                    int pow = (int) Math.pow(2.0d, (double) ((c5 & 7) + 1));
                                    ccp ccp3 = a.f6534c.f6522d;
                                    if ((c5 & 64) != 0) {
                                        z2 = true;
                                    } else {
                                        z2 = false;
                                    }
                                    ccp3.f6512e = z2;
                                    if (i8 != 0) {
                                        ccp3.f6518k = a.mo3719a(pow);
                                    } else {
                                        ccp3.f6518k = null;
                                    }
                                    a.f6534c.f6522d.f6517j = a.f6533b.position();
                                    a.mo3721c();
                                    a.mo3718a();
                                    if (!a.mo3723e()) {
                                        ccq ccq6 = a.f6534c;
                                        ccq6.f6521c++;
                                        ccq6.f6523e.add(ccq6.f6522d);
                                    }
                                } else if (c2 != 59) {
                                    a.f6534c.f6520b = 1;
                                } else {
                                    z3 = true;
                                }
                            } else {
                                break;
                            }
                        }
                        ccq ccq7 = a.f6534c;
                        if (ccq7.f6521c < 0) {
                            ccq7.f6520b = 1;
                        }
                    }
                    ccq = a.f6534c;
                } else {
                    ccq = a.f6534c;
                }
                if (ccq.f6521c > 0 && ccq.f6520b == 0) {
                    Bitmap.Config config = cdk.mo3739a(coc.f7151a) != ccu.f6557b ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                    int min = Math.min(ccq.f6525g / i2, ccq.f6524f / i);
                    if (min != 0) {
                        i3 = Integer.highestOneBit(min);
                    }
                    ccs ccs = new ccs(this.f7112e, ccq, byteBuffer, Math.max(1, i3));
                    if (config != Bitmap.Config.ARGB_8888) {
                        if (config != Bitmap.Config.RGB_565) {
                            String valueOf = String.valueOf(config);
                            String valueOf2 = String.valueOf(Bitmap.Config.ARGB_8888);
                            String valueOf3 = String.valueOf(Bitmap.Config.RGB_565);
                            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
                            sb3.append("Unsupported format: ");
                            sb3.append(valueOf);
                            sb3.append(", must be one of ");
                            sb3.append(valueOf2);
                            sb3.append(" or ");
                            sb3.append(valueOf3);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                    }
                    ccs.f6544i = config;
                    ccs.mo3716a();
                    Bitmap b = ccs.mo3717b();
                    if (b != null) {
                        cnw = new cnw(new cnu(new cnt(new coa(cbo.m3902a(this.f7109b), ccs, i, i2, cli.f7019b, b))));
                    }
                }
                this.f7111d.mo4002a(a);
                return cnw;
            }
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } catch (Throwable th) {
            this.f7111d.mo4002a(a);
            throw th;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo3744a(Object obj, cdk cdk) {
        ImageHeaderParser$ImageType imageHeaderParser$ImageType;
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (((Boolean) cdk.mo3739a(coc.f7152b)).booleanValue()) {
            return false;
        }
        List list = this.f7110c;
        if (byteBuffer != null) {
            imageHeaderParser$ImageType = cdf.m3988a(list, new ccz(byteBuffer));
        } else {
            imageHeaderParser$ImageType = ImageHeaderParser$ImageType.UNKNOWN;
        }
        if (imageHeaderParser$ImageType == ImageHeaderParser$ImageType.GIF) {
            return true;
        }
        return false;
    }
}
