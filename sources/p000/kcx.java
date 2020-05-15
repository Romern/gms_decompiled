package p000;

import android.os.BadParcelableException;
import android.os.Parcel;

/* renamed from: kcx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kcx {
    /* renamed from: a */
    public static kcv m17654a(Parcel parcel) {
        int readInt = parcel.readInt();
        if (readInt == 1) {
            String readString = parcel.readString();
            bmxy.m108581a(readString);
            String readString2 = parcel.readString();
            bmxy.m108581a(readString2);
            return new kck(readString, readString2);
        } else if (readInt == 2) {
            String readString3 = parcel.readString();
            bmxy.m108581a(readString3);
            return new kdl(readString3);
        } else {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Unknown domain type ");
            sb.append(readInt);
            throw new BadParcelableException(sb.toString());
        }
    }

    /* renamed from: a */
    public static void m17655a(kcv kcv, Parcel parcel) {
        if (kcv instanceof kck) {
            parcel.writeInt(1);
            kck kck = (kck) kcv;
            parcel.writeString(kck.f23841b);
            parcel.writeString(kck.f23817a);
        } else if (kcv instanceof kdl) {
            parcel.writeInt(2);
            parcel.writeString(((kdl) kcv).f23841b);
        } else {
            String valueOf = String.valueOf(kcv.getClass());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
            sb.append("Unknown domain type ");
            sb.append(valueOf);
            throw new BadParcelableException(sb.toString());
        }
    }
}
