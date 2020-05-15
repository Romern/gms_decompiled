package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.autofill.AutofillId;
import com.google.android.gms.autofill.fill.FillField;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

/* renamed from: kqf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class kqf implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FillField[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        kqg a = FillField.m7129a();
        a.mo14801a((AutofillId) parcel.readTypedObject(AutofillId.CREATOR));
        a.f24794a = parcel.readInt();
        a.mo14806a(parcel.createStringArray());
        a.mo14808b((Collection) Arrays.stream(parcel.createIntArray()).mapToObj(kqe.f24793a).collect(Collectors.toList()));
        a.f24795b = parcel.readInt();
        a.mo14805a(lbc.m18872a(parcel.readInt()));
        int readInt = parcel.readInt();
        bngs b = bngx.m109371b(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            byte[] bArr = new byte[parcel.readInt()];
            parcel.readByteArray(bArr);
            b.mo67668c(kka.m17968a(bnzb.m110871a(bArr), readInt2));
        }
        a.mo14807b((Iterable) b.mo67664a());
        a.f24796c = parcel.readInt();
        a.f24797d = parcel.readInt();
        a.f24798e = parcel.readString();
        return a.mo14800a();
    }
}
