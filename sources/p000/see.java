package p000;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: see */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class see {
    /* renamed from: a */
    public static int m35030a(Parcel parcel) {
        return m35031a(parcel, 20293);
    }

    /* renamed from: b */
    public static void m35062b(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: c */
    public static void m35066c(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = m35031a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m35061a(parcel, parcelable, 0);
                }
            }
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static int m35031a(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: a */
    public static void m35032a(Parcel parcel, int i, byte b) {
        m35035a(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: b */
    public static void m35063b(Parcel parcel, int i, int i2) {
        m35035a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: a */
    public static void m35033a(Parcel parcel, int i, double d) {
        m35035a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: b */
    public static void m35064b(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m35031a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeLong(((Long) list.get(i2)).longValue());
            }
            m35062b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m35034a(Parcel parcel, int i, float f) {
        m35035a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: a */
    public static void m35035a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: a */
    public static void m35036a(Parcel parcel, int i, long j) {
        m35035a(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: b */
    public static void m35065b(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = m35031a(parcel, i);
            parcel.writeStringList(list);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35037a(Parcel parcel, int i, Bundle bundle, boolean z) {
        if (bundle != null) {
            int a = m35031a(parcel, i);
            parcel.writeBundle(bundle);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35038a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            int a = m35031a(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m35062b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m35039a(Parcel parcel, int i, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int a = m35031a(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35040a(Parcel parcel, int i, Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int a = m35031a(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35041a(Parcel parcel, int i, Boolean bool) {
        if (bool != null) {
            m35035a(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
    }

    /* renamed from: a */
    public static void m35042a(Parcel parcel, int i, Double d) {
        if (d != null) {
            m35035a(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        }
    }

    /* renamed from: a */
    public static void m35043a(Parcel parcel, int i, Float f) {
        if (f != null) {
            m35035a(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        }
    }

    /* renamed from: a */
    public static void m35044a(Parcel parcel, int i, Integer num) {
        if (num != null) {
            m35035a(parcel, i, 4);
            parcel.writeInt(num.intValue());
        }
    }

    /* renamed from: a */
    public static void m35045a(Parcel parcel, int i, Long l) {
        if (l != null) {
            m35035a(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    /* renamed from: a */
    public static void m35046a(Parcel parcel, int i, String str, boolean z) {
        if (str != null) {
            int a = m35031a(parcel, i);
            parcel.writeString(str);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35047a(Parcel parcel, int i, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal != null) {
            int a = m35031a(parcel, i);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35048a(Parcel parcel, int i, List list) {
        if (list != null) {
            int a = m35031a(parcel, i);
            parcel.writeList(list);
            m35062b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m35049a(Parcel parcel, int i, List list, boolean z) {
        if (list != null) {
            int a = m35031a(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35050a(Parcel parcel, int i, short s) {
        m35035a(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: a */
    public static void m35051a(Parcel parcel, int i, boolean z) {
        m35035a(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: a */
    public static void m35052a(Parcel parcel, int i, byte[] bArr, boolean z) {
        if (bArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeByteArray(bArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35053a(Parcel parcel, int i, double[] dArr, boolean z) {
        if (dArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeDoubleArray(dArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35054a(Parcel parcel, int i, float[] fArr, boolean z) {
        if (fArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeFloatArray(fArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35055a(Parcel parcel, int i, int[] iArr, boolean z) {
        if (iArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeIntArray(iArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35056a(Parcel parcel, int i, long[] jArr, boolean z) {
        if (jArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeLongArray(jArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35057a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            int a = m35031a(parcel, i);
            int length = parcelableArr.length;
            parcel.writeInt(length);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m35061a(parcel, parcelable, i2);
                }
            }
            m35062b(parcel, a);
        }
    }

    /* renamed from: a */
    public static void m35058a(Parcel parcel, int i, String[] strArr, boolean z) {
        if (strArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeStringArray(strArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35059a(Parcel parcel, int i, boolean[] zArr, boolean z) {
        if (zArr != null) {
            int a = m35031a(parcel, i);
            parcel.writeBooleanArray(zArr);
            m35062b(parcel, a);
        } else if (z) {
            m35035a(parcel, i, 0);
        }
    }

    /* renamed from: a */
    public static void m35060a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            int a = m35031a(parcel, i);
            int length = bArr.length;
            parcel.writeInt(length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            m35062b(parcel, a);
        }
    }

    /* renamed from: a */
    private static void m35061a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
