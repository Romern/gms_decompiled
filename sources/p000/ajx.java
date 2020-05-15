package p000;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: ajx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajx {

    /* renamed from: a */
    public final int f694a;

    /* renamed from: b */
    public final int f695b;

    /* renamed from: c */
    public final byte[] f696c;

    public ajx(int i, int i2, byte[] bArr) {
        this(i, i2, bArr, null);
    }

    /* renamed from: a */
    public static ajx m889a(int i, ByteOrder byteOrder) {
        int[] iArr = {i};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aka.f719e[3]]);
        wrap.order(byteOrder);
        wrap.putShort((short) iArr[0]);
        return new ajx(3, 1, wrap.array());
    }

    /* renamed from: b */
    public final int mo862b(ByteOrder byteOrder) {
        Object a = mo861a(byteOrder);
        if (a == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        } else if (a instanceof String) {
            return Integer.parseInt((String) a);
        } else {
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            } else {
                throw new NumberFormatException("Couldn't find a integer value");
            }
        }
    }

    /* renamed from: c */
    public final String mo863c(ByteOrder byteOrder) {
        Object a = mo861a(byteOrder);
        if (a != null) {
            if (a instanceof String) {
                return (String) a;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (a instanceof long[]) {
                long[] jArr = (long[]) a;
                while (true) {
                    int length = jArr.length;
                    if (i >= length) {
                        return sb.toString();
                    }
                    sb.append(jArr[i]);
                    i++;
                    if (i != length) {
                        sb.append(",");
                    }
                }
            } else if (a instanceof int[]) {
                int[] iArr = (int[]) a;
                while (true) {
                    int length2 = iArr.length;
                    if (i >= length2) {
                        return sb.toString();
                    }
                    sb.append(iArr[i]);
                    i++;
                    if (i != length2) {
                        sb.append(",");
                    }
                }
            } else if (a instanceof double[]) {
                double[] dArr = (double[]) a;
                while (true) {
                    int length3 = dArr.length;
                    if (i >= length3) {
                        return sb.toString();
                    }
                    sb.append(dArr[i]);
                    i++;
                    if (i != length3) {
                        sb.append(",");
                    }
                }
            } else if (a instanceof ajz[]) {
                ajz[] ajzArr = (ajz[]) a;
                while (true) {
                    int length4 = ajzArr.length;
                    if (i >= length4) {
                        return sb.toString();
                    }
                    sb.append(ajzArr[i].f701a);
                    sb.append('/');
                    sb.append(ajzArr[i].f702b);
                    i++;
                    if (i != length4) {
                        sb.append(",");
                    }
                }
            }
        }
        return null;
    }

    public final String toString() {
        return "(" + aka.f718d[this.f694a] + ", data length:" + this.f696c.length + ")";
    }

    public ajx(int i, int i2, byte[] bArr, byte[] bArr2) {
        this.f694a = i;
        this.f695b = i2;
        this.f696c = bArr;
    }

    /* renamed from: a */
    public static ajx m890a(long j, ByteOrder byteOrder) {
        long[] jArr = {j};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aka.f719e[4]]);
        wrap.order(byteOrder);
        wrap.putInt((int) jArr[0]);
        return new ajx(4, 1, wrap.array());
    }

    /* renamed from: a */
    public static ajx m891a(ajz ajz, ByteOrder byteOrder) {
        ajz[] ajzArr = {ajz};
        ByteBuffer wrap = ByteBuffer.wrap(new byte[aka.f719e[5]]);
        wrap.order(byteOrder);
        ajz ajz2 = ajzArr[0];
        wrap.putInt((int) ajz2.f701a);
        wrap.putInt((int) ajz2.f702b);
        return new ajx(5, 1, wrap.array());
    }

    /* renamed from: a */
    public static ajx m892a(String str) {
        byte[] bytes = (str + 0).getBytes(aka.f722h);
        return new ajx(2, bytes.length, bytes);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x019e A[SYNTHETIC, Splitter:B:166:0x019e] */
    /* renamed from: a */
    public final Object mo861a(ByteOrder byteOrder) {
        ajw ajw;
        ajw ajw2 = null;
        try {
            ajw = new ajw(this.f696c);
            try {
                ajw.f690a = byteOrder;
                int i = 0;
                switch (this.f694a) {
                    case 1:
                    case 6:
                        byte[] bArr = this.f696c;
                        if (bArr.length == 1) {
                            byte b = bArr[0];
                            if (b >= 0) {
                                if (b <= 1) {
                                    String str = new String(new char[]{(char) (b + 48)});
                                    try {
                                        ajw.close();
                                    } catch (IOException e) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e);
                                    }
                                    return str;
                                }
                            }
                        }
                        String str2 = new String(bArr, aka.f722h);
                        try {
                            ajw.close();
                        } catch (IOException e2) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e2);
                        }
                        return str2;
                    case 2:
                    case 7:
                        if (this.f695b >= aka.f720f.length) {
                            int i2 = 0;
                            while (true) {
                                if (i2 >= aka.f720f.length) {
                                    i = aka.f720f.length;
                                } else if (this.f696c[i2] == aka.f720f[i2]) {
                                    i2++;
                                }
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        while (true) {
                            if (i < this.f695b) {
                                byte b2 = this.f696c[i];
                                if (b2 != 0) {
                                    if (b2 >= 32) {
                                        sb.append((char) b2);
                                    } else {
                                        sb.append('?');
                                    }
                                    i++;
                                }
                            }
                        }
                        String sb2 = sb.toString();
                        try {
                            ajw.close();
                        } catch (IOException e3) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e3);
                        }
                        return sb2;
                    case 3:
                        int[] iArr = new int[this.f695b];
                        while (i < this.f695b) {
                            iArr[i] = ajw.readUnsignedShort();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e4) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e4);
                        }
                        return iArr;
                    case 4:
                        long[] jArr = new long[this.f695b];
                        while (i < this.f695b) {
                            jArr[i] = ajw.mo841a();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e5) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e5);
                        }
                        return jArr;
                    case 5:
                        ajz[] ajzArr = new ajz[this.f695b];
                        while (i < this.f695b) {
                            ajzArr[i] = new ajz(ajw.mo841a(), ajw.mo841a());
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e6) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                        }
                        return ajzArr;
                    case 8:
                        int[] iArr2 = new int[this.f695b];
                        while (i < this.f695b) {
                            iArr2[i] = ajw.readShort();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e7) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                        }
                        return iArr2;
                    case 9:
                        int[] iArr3 = new int[this.f695b];
                        while (i < this.f695b) {
                            iArr3[i] = ajw.readInt();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                        }
                        return iArr3;
                    case 10:
                        ajz[] ajzArr2 = new ajz[this.f695b];
                        while (i < this.f695b) {
                            ajzArr2[i] = new ajz((long) ajw.readInt(), (long) ajw.readInt());
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e9) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e9);
                        }
                        return ajzArr2;
                    case 11:
                        double[] dArr = new double[this.f695b];
                        while (i < this.f695b) {
                            dArr[i] = (double) ajw.readFloat();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e10) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                        }
                        return dArr;
                    case 12:
                        double[] dArr2 = new double[this.f695b];
                        while (i < this.f695b) {
                            dArr2[i] = ajw.readDouble();
                            i++;
                        }
                        try {
                            ajw.close();
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                        return dArr2;
                    default:
                        try {
                            ajw.close();
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                        }
                        return null;
                }
            } catch (IOException e13) {
                e = e13;
            } catch (Throwable th) {
                th = th;
                ajw2 = ajw;
                if (ajw2 != null) {
                }
                throw th;
            }
            e = e13;
        } catch (IOException e14) {
            e = e14;
            ajw = null;
        } catch (Throwable th2) {
            th = th2;
            if (ajw2 != null) {
                try {
                    ajw2.close();
                } catch (IOException e15) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                }
            }
            throw th;
        }
        try {
            Log.w("ExifInterface", "IOException occurred during reading a value", e);
            if (ajw != null) {
                try {
                    ajw.close();
                } catch (IOException e16) {
                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e16);
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            ajw2 = ajw;
            if (ajw2 != null) {
            }
            throw th;
        }
    }
}
