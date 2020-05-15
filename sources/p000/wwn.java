package p000;

import android.text.TextUtils;
import com.google.android.gms.feedback.ErrorReport;
import com.google.android.gms.feedback.FeedbackChimeraActivity;
import java.util.List;

/* renamed from: wwn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ErrorReport f51486a;

    /* renamed from: b */
    final /* synthetic */ boolean f51487b;

    /* renamed from: c */
    final /* synthetic */ FeedbackChimeraActivity f51488c;

    public wwn(FeedbackChimeraActivity feedbackChimeraActivity, ErrorReport errorReport, boolean z) {
        this.f51488c = feedbackChimeraActivity;
        this.f51486a = errorReport;
        this.f51487b = z;
    }

    public final void run() {
        List a;
        ErrorReport errorReport = this.f51486a;
        wwy wwy = FeedbackChimeraActivity.f31574e;
        if (wwy != null) {
            wvm wvm = wwy.f51520g;
            String str = wwy.f51516c.f31584i;
            String str2 = wvm.f51422a.f31511B;
            if (!TextUtils.isEmpty(str2) && (a = wvm.mo29462a(str2)) != null) {
                if (a.isEmpty()) {
                    wvm.f51422a.f31545ai = 1;
                } else if (!TextUtils.isEmpty(str) && !str2.equals(str)) {
                    List a2 = wvm.mo29462a(str);
                    if (a2 != null) {
                        if (a.size() == a2.size() && a.containsAll(a2)) {
                            wvm.f51422a.f31544ah = a;
                        } else {
                            wvm.f51422a.f31545ai = 3;
                        }
                    }
                } else {
                    wvm.f51422a.f31544ah = a;
                }
            }
            errorReport = wwy.mo29517g();
        }
        if (wwy != null && wwy.mo29516f()) {
            this.f51488c.mo18600a(wwy, this.f51487b);
        } else {
            this.f51488c.mo18604b(errorReport, this.f51487b);
        }
    }
}
