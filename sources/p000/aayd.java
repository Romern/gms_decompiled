package p000;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.googlehelp.feedback.Screenshot;

/* renamed from: aayd */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aayd implements Parcelable.Creator {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Screenshot screenshot = new Screenshot();
        screenshot.f78924c = parcel.readString();
        try {
            screenshot.f78922a = parcel.readInt();
            screenshot.f78923b = parcel.readInt();
        } catch (Exception e) {
            screenshot.f78922a = 0;
            screenshot.f78923b = 0;
        }
        return screenshot;
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new Screenshot[i];
    }
}
