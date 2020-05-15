package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.walletp2p.feature.rpcclient.types.LegalDocuments;
import java.util.ArrayList;

/* renamed from: axik */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axik implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            arrayList.add((bttm) GeneratedMessageLite.m124014a(bttm.f150361c, parcel.createByteArray()));
        }
        try {
            return new LegalDocuments(arrayList);
        } catch (bxwf e) {
            throw new RuntimeException("Attempted to restore legal documents from parcel but failed.", e);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new LegalDocuments[i];
    }
}
