package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.webview.WebViewWidgetResult;

/* renamed from: axdl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class axdl implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new WebViewWidgetResult(parcel);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WebViewWidgetResult[i];
    }
}
