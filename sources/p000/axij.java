package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.feature.rpcclient.types.FundsTransferNotices;
import java.util.ArrayList;

/* renamed from: axij */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axij implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FundsTransferNotices[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i < readInt; i++) {
                arrayList.add((bttj) GeneratedMessageLite.m124014a(bttj.f150351c, parcel.createByteArray()));
            }
            return new FundsTransferNotices(arrayList);
        } catch (bxwf e) {
            throw new RuntimeException("Attempted to restore notices from parcel but failed.");
        }
    }
}
