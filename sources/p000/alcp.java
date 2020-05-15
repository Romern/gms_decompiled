package p000;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;

/* renamed from: alcp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class alcp {
    static {
        try {
            awp.f2450a.mo2814a("http://ns.google.com/photos/1.0/panorama/", "GPano");
        } catch (awn e) {
            bqye.m113758a(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007e, code lost:
        r3 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* renamed from: a */
    public static awo m60861a(InputStream inputStream) {
        ArrayList arrayList;
        boolean z;
        int length;
        int read;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        try {
            if (dataInputStream.read() == 255 && dataInputStream.read() == 216) {
                arrayList = new ArrayList();
                while (true) {
                    int read2 = dataInputStream.read();
                    if (read2 != -1) {
                        if (read2 != 255) {
                            dataInputStream.close();
                            break;
                        }
                        do {
                            read = dataInputStream.read();
                        } while (read == 255);
                        if (read != -1) {
                            if (read == 218) {
                                break;
                            }
                            int read3 = dataInputStream.read();
                            int read4 = dataInputStream.read();
                            if (read3 == -1) {
                                break;
                            } else if (read4 != -1) {
                                int i = (read3 << 8) | read4;
                                if (read != 225) {
                                    dataInputStream.skip((long) (i - 2));
                                } else {
                                    alco alco = new alco();
                                    int i2 = i - 2;
                                    alco.f73479a = new byte[i2];
                                    dataInputStream.readFully(alco.f73479a, 0, i2);
                                    arrayList.add(alco);
                                }
                            }
                        } else {
                            break;
                        }
                    } else {
                        try {
                            break;
                        } catch (IOException e) {
                        }
                    }
                }
                if (arrayList != null) {
                }
                return null;
            }
            dataInputStream.close();
            arrayList = null;
            if (arrayList != null) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    alco alco2 = (alco) arrayList.get(i3);
                    byte[] bArr = alco2.f73479a;
                    if (bArr.length >= 29) {
                        try {
                            byte[] bArr2 = new byte[29];
                            System.arraycopy(bArr, 0, bArr2, 0, 29);
                            z = new String(bArr2, "UTF-8").equals("http://ns.adobe.com/xap/1.0/\u0000");
                        } catch (UnsupportedEncodingException e2) {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    i3++;
                    if (z) {
                        byte[] bArr3 = alco2.f73479a;
                        int length2 = bArr3.length - 1;
                        while (true) {
                            if (length2 > 0) {
                                if (bArr3[length2] == 62 && bArr3[length2 - 1] != 63) {
                                    length = length2 + 1;
                                    break;
                                }
                                length2--;
                            } else {
                                length = bArr3.length;
                                break;
                            }
                        }
                        int i4 = length - 29;
                        byte[] bArr4 = new byte[i4];
                        System.arraycopy(alco2.f73479a, 29, bArr4, 0, i4);
                        try {
                            return awp.m2279a(bArr4);
                        } catch (awn e3) {
                            return null;
                        }
                    }
                }
            }
            return null;
        } catch (IOException e4) {
            dataInputStream.close();
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (IOException e5) {
            }
            throw th;
        }
    }
}
