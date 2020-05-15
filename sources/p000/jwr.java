package p000;

import com.google.android.gms.auth.uiflows.addaccount.setupwizard.BufferedLogsUploadIntentOperation;

/* renamed from: jwr */
public final /* synthetic */ class jwr implements Runnable {

    /* renamed from: a */
    private final BufferedLogsUploadIntentOperation f23417a;

    /* renamed from: b */
    private final String f23418b;

    public jwr(BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation, String str) {
        this.f23417a = bufferedLogsUploadIntentOperation;
        this.f23418b = str;
    }

    public final void run() {
        BufferedLogsUploadIntentOperation bufferedLogsUploadIntentOperation = this.f23417a;
        String str = this.f23418b;
        BufferedLogsUploadIntentOperation.f11458a.mo25412b("Uploading buffered logs to clearcut", new Object[0]);
        ((beon) bufferedLogsUploadIntentOperation.f11461d.f21289a.f18320b.mo6606a()).mo60861b(Boolean.valueOf(bufferedLogsUploadIntentOperation.f11459b.mo64978a(str)));
        bufferedLogsUploadIntentOperation.f11460c.mo64977a(str);
    }
}
