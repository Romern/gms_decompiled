package p000;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wyz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wyz extends dcj implements wzb {
    public wyz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.feedback.internal.IFeedbackAsyncService");
    }

    /* renamed from: a */
    public final String mo29579a(FeedbackOptions feedbackOptions) {
        Parcel bj = mo8529bj();
        dcl.m8165a(bj, feedbackOptions);
        Parcel a = mo8526a(1, bj);
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    /* renamed from: b */
    public final Bitmap mo29581b(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(3, bj);
        Bitmap bitmap = (Bitmap) dcl.m8163a(a, Bitmap.CREATOR);
        a.recycle();
        return bitmap;
    }

    /* renamed from: a */
    public final boolean mo29580a(String str) {
        Parcel bj = mo8529bj();
        bj.writeString(str);
        Parcel a = mo8526a(2, bj);
        boolean a2 = dcl.m8167a(a);
        a.recycle();
        return a2;
    }
}
