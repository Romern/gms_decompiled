package p000;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wza */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wza extends dck implements wzb {

    /* renamed from: a */
    final /* synthetic */ FeedbackAsyncChimeraService f51592a;

    public wza() {
        super("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
    }

    /* renamed from: a */
    public final String mo29579a(FeedbackOptions feedbackOptions) {
        if (feedbackOptions == null) {
            return "";
        }
        if (TextUtils.isEmpty(feedbackOptions.f31603n)) {
            feedbackOptions.f31603n = wzg.m42522b();
        }
        C1223np npVar = FeedbackAsyncChimeraService.f31571a;
        String str = feedbackOptions.f31603n;
        wvm wvm = new wvm(this.f51592a, feedbackOptions);
        wvm.mo29465a(wym.m42469a(feedbackOptions.f31600k));
        npVar.put(str, wvm.mo29466b());
        return feedbackOptions.f31603n;
    }

    /* renamed from: b */
    public final Bitmap mo29581b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return ((ErrorReport) FeedbackAsyncChimeraService.f31571a.get(str)).f31542af;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wza(FeedbackAsyncChimeraService feedbackAsyncChimeraService) {
        super("com.google.android.gms.feedback.internal.IFeedbackAsyncService");
        this.f51592a = feedbackAsyncChimeraService;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        ErrorReport errorReport;
        if (i == 1) {
            String a = mo29579a((FeedbackOptions) dcl.m8163a(parcel, FeedbackOptions.CREATOR));
            parcel2.writeNoException();
            parcel2.writeString(a);
        } else if (i == 2) {
            boolean a2 = mo29580a(parcel.readString());
            parcel2.writeNoException();
            dcl.m8166a(parcel2, a2);
        } else if (i == 3) {
            Bitmap b = mo29581b(parcel.readString());
            parcel2.writeNoException();
            dcl.m8169b(parcel2, b);
        } else if (i != 4) {
            return false;
        } else {
            String readString = parcel.readString();
            Bitmap bitmap = (Bitmap) dcl.m8163a(parcel, Bitmap.CREATOR);
            if (!TextUtils.isEmpty(readString) && (errorReport = (ErrorReport) FeedbackAsyncChimeraService.f31571a.get(readString)) != null) {
                errorReport.f31542af = bitmap;
            }
            parcel2.writeNoException();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo29580a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        ErrorReport errorReport = (ErrorReport) FeedbackAsyncChimeraService.f31571a.get(str);
        if (errorReport == null) {
            this.f51592a.stopSelf();
            return false;
        }
        this.f51592a.mo18590a(errorReport);
        if (!this.f51592a.mo18588a().mo29532a(errorReport, wxb.m42440a(errorReport, this.f51592a.getApplicationContext()), FeedbackAsyncChimeraService.f31572b)) {
            FeedbackAsyncChimeraService feedbackAsyncChimeraService = this.f51592a;
            feedbackAsyncChimeraService.mo18589a(feedbackAsyncChimeraService, errorReport);
        }
        FeedbackAsyncChimeraService.f31571a.remove(str);
        this.f51592a.stopSelf();
        return true;
    }
}
