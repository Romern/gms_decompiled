package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: bpo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bpo implements Serializable {

    /* renamed from: a */
    public byte[] f5320a;

    /* renamed from: b */
    private Boolean f5321b;

    public bpo(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            String str = null;
            if (length != 0) {
                int i = 1;
                if (length != 1) {
                    if ((bArr[0] & 31) != 31) {
                        StringBuilder sb = new StringBuilder((int) ErrorInfo.TYPE_SDU_COMMUNICATIONERROR);
                        sb.append("The given byte[] is too long. The tag spcifies single byte, but the given byte[] has length ");
                        sb.append(length);
                        str = sb.toString();
                    } else {
                        int i2 = length - 1;
                        if ((bArr[i2] & 128) == 128) {
                            str = "The last byte in tag is invalid";
                        } else {
                            while (true) {
                                if (i >= i2) {
                                    break;
                                } else if ((bArr[i] & 128) != 128) {
                                    StringBuilder sb2 = new StringBuilder(37);
                                    sb2.append("The tag byte[");
                                    sb2.append(i);
                                    sb2.append("] is invalid.");
                                    str = sb2.toString();
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                } else if ((bArr[0] & 31) == 31) {
                    str = "The given byte[] is too short. The tag spcifies multibytes, but the given byte[] has length 1";
                }
            } else {
                str = "The given array representing a tag is empty";
            }
            if (str == null) {
                this.f5320a = (byte[]) bArr.clone();
                return;
            }
            throw new IllegalArgumentException(str);
        }
        throw new IllegalArgumentException("A tag can't be NULL.");
    }

    /* renamed from: a */
    public final byte[] mo3377a() {
        return (byte[]) this.f5320a.clone();
    }

    /* renamed from: b */
    public final boolean mo3378b() {
        if (this.f5321b == null) {
            boolean z = false;
            if ((this.f5320a[0] & 32) != 0) {
                z = true;
            }
            this.f5321b = Boolean.valueOf(z);
        }
        return this.f5321b.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bpo)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        byte[] a = ((bpo) obj).mo3377a();
        byte[] bArr = this.f5320a;
        if (bArr == null || a == null) {
            return false;
        }
        return Arrays.equals(bArr, a);
    }

    public final int hashCode() {
        int i = 17;
        for (byte b : this.f5320a) {
            i = (i * 31) + b;
        }
        return i;
    }

    public final String toString() {
        return cbm.m3893a(this.f5320a);
    }
}
