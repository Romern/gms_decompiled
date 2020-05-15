package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.phenotype.ExperimentTokens;

/* renamed from: andx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class andx implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ExperimentTokens[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        String str = null;
        byte[] bArr = null;
        byte[][] bArr2 = null;
        byte[][] bArr3 = null;
        byte[][] bArr4 = null;
        byte[][] bArr5 = null;
        int[] iArr = null;
        byte[][] bArr6 = null;
        int[] iArr2 = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    str = sed.m35020q(parcel, readInt);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 4:
                    bArr2 = sed.m35024u(parcel, readInt);
                    break;
                case 5:
                    bArr3 = sed.m35024u(parcel, readInt);
                    break;
                case 6:
                    bArr4 = sed.m35024u(parcel, readInt);
                    break;
                case 7:
                    bArr5 = sed.m35024u(parcel, readInt);
                    break;
                case 8:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 9:
                    bArr6 = sed.m35024u(parcel, readInt);
                    break;
                case 10:
                    iArr2 = sed.m35026w(parcel, readInt);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new ExperimentTokens(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, bArr6, iArr2);
    }
}
