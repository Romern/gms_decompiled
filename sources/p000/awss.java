package p000;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.service.p086ib.ProcessBuyFlowResultResponse;

/* renamed from: awss */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awss implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        int a = byaj.m124599a(parcel.readInt());
        ClassLoader classLoader = awfu.class.getClassLoader();
        Intent intent = (Intent) parcel.readParcelable(classLoader);
        if (intent != null) {
            intent.setExtrasClassLoader(classLoader);
        }
        return new ProcessBuyFlowResultResponse(readInt, readInt2, a, intent, parcel.readByte() != 0);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ProcessBuyFlowResultResponse[i];
    }
}
