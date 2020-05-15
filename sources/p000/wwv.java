package p000;

import android.app.ApplicationErrorReport;
import android.text.TextUtils;
import com.google.android.gms.feedback.FeedbackOptions;

/* renamed from: wwv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class wwv extends wwu {

    /* renamed from: j */
    public String f51512j;

    public wwv() {
        this.f51504i = new ApplicationErrorReport();
        this.f51504i.crashInfo = new ApplicationErrorReport.CrashInfo();
        this.f51504i.crashInfo.throwLineNumber = -1;
    }

    /* renamed from: a */
    public final FeedbackOptions mo29490a() {
        sdo.m34959a((Object) this.f51504i.crashInfo.exceptionClassName);
        sdo.m34959a((Object) this.f51504i.crashInfo.throwClassName);
        sdo.m34959a((Object) this.f51504i.crashInfo.throwMethodName);
        sdo.m34959a((Object) this.f51504i.crashInfo.stackTrace);
        if (TextUtils.isEmpty(this.f51504i.crashInfo.throwFileName)) {
            this.f51504i.crashInfo.throwFileName = "unknown";
        }
        FeedbackOptions a = super.mo29490a();
        a.f31593d.crashInfo = this.f51504i.crashInfo;
        a.f31596g = this.f51512j;
        return a;
    }

    /* renamed from: b */
    public final void mo29500b(String str) {
        this.f51504i.crashInfo.stackTrace = str;
    }

    /* renamed from: c */
    public final void mo29501c(String str) {
        this.f51504i.crashInfo.throwClassName = str;
    }

    /* renamed from: d */
    public final void mo29502d(String str) {
        this.f51504i.crashInfo.throwFileName = str;
    }

    /* renamed from: e */
    public final void mo29503e(String str) {
        this.f51504i.crashInfo.throwMethodName = str;
    }

    public wwv(Throwable th) {
        this();
        this.f51504i.crashInfo = new ApplicationErrorReport.CrashInfo(th);
    }

    /* renamed from: a */
    public final void mo29498a(int i) {
        this.f51504i.crashInfo.throwLineNumber = i;
    }

    /* renamed from: a */
    public final void mo29499a(String str) {
        this.f51504i.crashInfo.exceptionClassName = str;
    }
}
