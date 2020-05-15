package p000;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: clw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class clw implements ccx {

    /* renamed from: a */
    static final byte[] f7035a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: b */
    private static final int[] f7036b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a */
    private static final ImageHeaderParser$ImageType m4484a(clu clu) {
        try {
            int b = clu.mo3962b();
            if (b == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            short a = (b << 8) | clu.mo3961a();
            if (a == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            short a2 = (a << 8) | clu.mo3961a();
            if (a2 == -1991225785) {
                clu.mo3960a(21);
                try {
                    return clu.mo3961a() < 3 ? ImageHeaderParser$ImageType.PNG : ImageHeaderParser$ImageType.PNG_A;
                } catch (clt e) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            } else if (a2 != 1380533830) {
                return ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                clu.mo3960a(4);
                if (((clu.mo3962b() << 16) | clu.mo3962b()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int b2 = (clu.mo3962b() << 16) | clu.mo3962b();
                if ((b2 & -256) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i = b2 & 255;
                if (i == 88) {
                    clu.mo3960a(4);
                    return (clu.mo3961a() & 16) == 0 ? ImageHeaderParser$ImageType.WEBP : ImageHeaderParser$ImageType.WEBP_A;
                } else if (i != 76) {
                    return ImageHeaderParser$ImageType.WEBP;
                } else {
                    clu.mo3960a(4);
                    return (clu.mo3961a() & 8) == 0 ? ImageHeaderParser$ImageType.WEBP : ImageHeaderParser$ImageType.WEBP_A;
                }
            }
        } catch (clt e2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    /* renamed from: a */
    public final int mo3726a(InputStream inputStream, cgr cgr) {
        int i;
        byte[] bArr;
        short s;
        ByteOrder byteOrder;
        int i2;
        int i3;
        short a;
        crb.m7382a(inputStream);
        clv clv = new clv(inputStream);
        crb.m7382a(cgr);
        try {
            int b = clv.mo3962b();
            if ((b & 65496) != 65496) {
                if (!(b == 19789 || b == 18761)) {
                    return -1;
                }
            }
            while (true) {
                if (clv.mo3961a() == 255 && (a = clv.mo3961a()) != 218 && a != 217) {
                    i = clv.mo3962b() - 2;
                    if (a == 225) {
                        break;
                    }
                    long j = (long) i;
                    if (clv.mo3960a(j) != j) {
                        i = -1;
                        break;
                    }
                } else {
                    i = -1;
                }
            }
            if (i == -1) {
                return -1;
            }
            bArr = (byte[]) cgr.mo3870a(i, byte[].class);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            while (i5 < i) {
                i6 = clv.f7034a.read(bArr, i5, i - i5);
                if (i6 == -1) {
                    break;
                }
                i5 += i6;
            }
            if (i5 == 0) {
                if (i6 == -1) {
                    throw new clt();
                }
            }
            if (i5 != i) {
                s = -1;
            } else if (bArr != null) {
                if (i > f7035a.length) {
                    int i7 = 0;
                    while (true) {
                        if (i7 < f7035a.length) {
                            if (bArr[i7] != f7035a[i7]) {
                                s = -1;
                                break;
                            }
                            i7++;
                        } else {
                            cls cls = new cls(bArr, i);
                            short b2 = cls.mo3965b(6);
                            if (b2 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (b2 != 19789) {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            } else {
                                byteOrder = ByteOrder.BIG_ENDIAN;
                            }
                            cls.f7033a.order(byteOrder);
                            int a2 = cls.mo3964a(10) + 6;
                            short b3 = cls.mo3965b(a2);
                            while (true) {
                                if (i4 >= b3) {
                                    s = -1;
                                    break;
                                }
                                int i8 = a2 + 2 + (i4 * 12);
                                if (cls.mo3965b(i8) == 274) {
                                    short b4 = cls.mo3965b(i8 + 2);
                                    if (b4 > 0 && b4 <= 12) {
                                        int a3 = cls.mo3964a(i8 + 4);
                                        if (a3 >= 0 && (i2 = a3 + f7036b[b4]) <= 4 && (i3 = i8 + 8) >= 0 && i3 <= cls.mo3963a() && i2 >= 0 && i2 + i3 <= cls.mo3963a()) {
                                            s = cls.mo3965b(i3);
                                            break;
                                        }
                                    }
                                }
                                i4++;
                            }
                        }
                    }
                } else {
                    s = -1;
                }
            } else {
                s = -1;
            }
            cgr.mo3874a(bArr);
            return s;
        } catch (clt e) {
            return -1;
        } catch (Throwable th) {
            cgr.mo3874a(bArr);
            throw th;
        }
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3727a(InputStream inputStream) {
        crb.m7382a(inputStream);
        return m4484a(new clv(inputStream));
    }

    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo3728a(ByteBuffer byteBuffer) {
        crb.m7382a(byteBuffer);
        return m4484a(new clr(byteBuffer));
    }
}
