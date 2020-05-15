package p000;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackAsyncChimeraService;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import java.io.IOException;

/* renamed from: wvv */
public final /* synthetic */ class wvv implements Runnable {

    /* renamed from: a */
    private final FeedbackAsyncChimeraService f51443a;

    /* renamed from: b */
    private final int f51444b;

    /* renamed from: c */
    private final ParcelFileDescriptor.AutoCloseInputStream f51445c;

    public wvv(FeedbackAsyncChimeraService feedbackAsyncChimeraService, int i, ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream) {
        this.f51443a = feedbackAsyncChimeraService;
        this.f51444b = i;
        this.f51445c = autoCloseInputStream;
    }

    public final void run() {
        ErrorReport errorReport;
        wvm wvm;
        FeedbackAsyncChimeraService feedbackAsyncChimeraService = this.f51443a;
        int i = this.f51444b;
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = this.f51445c;
        byte[] bArr = new byte[i];
        Screenshot screenshot = null;
        try {
            autoCloseInputStream.read(bArr);
            try {
                autoCloseInputStream.close();
            } catch (IOException e) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e);
            }
            try {
                Parcel obtain = Parcel.obtain();
                obtain.unmarshall(bArr, 0, i);
                obtain.setDataPosition(0);
                errorReport = (ErrorReport) ErrorReport.CREATOR.createFromParcel(obtain);
                obtain.recycle();
            } catch (Exception e2) {
                Log.e("gf_FeedbackAsyncService", "Exception while parsing report", e2);
                errorReport = null;
            }
        } catch (IOException e3) {
            Log.e("gf_FeedbackAsyncService", "Exception while reading report", e3);
            try {
                autoCloseInputStream.close();
                errorReport = null;
            } catch (IOException e4) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e4);
                errorReport = null;
            }
        } catch (Throwable th) {
            try {
                autoCloseInputStream.close();
            } catch (IOException e5) {
                Log.e("gf_FeedbackAsyncService", "Exception while closing report input stream", e5);
            }
            throw th;
        }
        if (errorReport != null) {
            if (errorReport.f31514E) {
                if (!errorReport.f31532W) {
                    if (!TextUtils.isEmpty(errorReport.f31529T)) {
                        try {
                            Screenshot screenshot2 = new Screenshot();
                            try {
                                Screenshot.m66501a(feedbackAsyncChimeraService.getFilesDir(), errorReport.f31529T, screenshot2, true, null).get();
                            } catch (Exception e6) {
                            }
                            screenshot = screenshot2;
                        } catch (Exception e7) {
                        }
                    }
                    wvm = new wvm(feedbackAsyncChimeraService, errorReport, screenshot);
                    wvm.mo29465a(wym.m42469a(errorReport.f31535Z));
                } else {
                    wvm = new wvm(feedbackAsyncChimeraService, errorReport, null);
                }
                errorReport = wvm.mo29466b();
            }
            if (errorReport != null) {
                feedbackAsyncChimeraService.mo18590a(errorReport);
                if (!feedbackAsyncChimeraService.mo18588a().mo29532a(errorReport, wxb.m42440a(errorReport, feedbackAsyncChimeraService), FeedbackAsyncChimeraService.f31572b)) {
                    feedbackAsyncChimeraService.mo18589a(feedbackAsyncChimeraService, errorReport);
                }
                feedbackAsyncChimeraService.stopSelf();
                return;
            }
            feedbackAsyncChimeraService.stopSelf();
        }
    }
}
