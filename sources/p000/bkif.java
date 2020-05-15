package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.wallet.p097ui.document.DownloadedDocument;

/* renamed from: bkif */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bkif implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new DownloadedDocument(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new DownloadedDocument[i];
    }
}
