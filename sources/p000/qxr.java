package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.android.gms.phenotype.GenericDimension;

/* renamed from: qxr */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qxr implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LogEventParcelable[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        PlayLoggerContext playLoggerContext = null;
        byte[] bArr = null;
        int[] iArr = null;
        String[] strArr = null;
        int[] iArr2 = null;
        byte[][] bArr2 = null;
        ExperimentTokens[] experimentTokensArr = null;
        GenericDimension[] genericDimensionArr = null;
        boolean z = true;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            switch (sed.m34995a(readInt)) {
                case 2:
                    playLoggerContext = (PlayLoggerContext) sed.m34998a(parcel, readInt, PlayLoggerContext.CREATOR);
                    break;
                case 3:
                    bArr = sed.m35023t(parcel, readInt);
                    break;
                case 4:
                    iArr = sed.m35026w(parcel, readInt);
                    break;
                case 5:
                    strArr = sed.m34989A(parcel, readInt);
                    break;
                case 6:
                    iArr2 = sed.m35026w(parcel, readInt);
                    break;
                case 7:
                    bArr2 = sed.m35024u(parcel, readInt);
                    break;
                case 8:
                    z = sed.m35006c(parcel, readInt);
                    break;
                case 9:
                    experimentTokensArr = (ExperimentTokens[]) sed.m35004b(parcel, readInt, ExperimentTokens.CREATOR);
                    break;
                case 10:
                    genericDimensionArr = (GenericDimension[]) sed.m35004b(parcel, readInt, GenericDimension.CREATOR);
                    break;
                default:
                    sed.m35002b(parcel, readInt);
                    break;
            }
        }
        sed.m34994F(parcel, b);
        return new LogEventParcelable(playLoggerContext, bArr, iArr, strArr, iArr2, bArr2, z, experimentTokensArr, genericDimensionArr);
    }
}
