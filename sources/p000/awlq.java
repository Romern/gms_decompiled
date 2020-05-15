package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.firstparty.saveinstrument.Card;
import com.google.android.gms.wallet.firstparty.saveinstrument.SaveInstrumentRequest;
import java.util.ArrayList;

/* renamed from: awlq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awlq implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SaveInstrumentRequest[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = sed.m35001b(parcel);
        Card card = null;
        ArrayList arrayList = null;
        byte[] bArr = null;
        while (parcel.dataPosition() < b) {
            int readInt = parcel.readInt();
            int a = sed.m34995a(readInt);
            if (a == 1) {
                card = (Card) sed.m34998a(parcel, readInt, Card.CREATOR);
            } else if (a == 2) {
                arrayList = sed.m35005c(parcel, readInt, UserAddress.CREATOR);
            } else if (a != 3) {
                sed.m35002b(parcel, readInt);
            } else {
                bArr = sed.m35023t(parcel, readInt);
            }
        }
        sed.m34994F(parcel, b);
        return new SaveInstrumentRequest(card, arrayList, bArr);
    }
}
