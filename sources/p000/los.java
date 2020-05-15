package p000;

import android.app.ProgressDialog;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* renamed from: los */
final /* synthetic */ class los implements Consumer {

    /* renamed from: a */
    private final lpc f26510a;

    /* renamed from: b */
    private final lpb f26511b;

    public los(lpc lpc, lpb lpb) {
        this.f26510a = lpc;
        this.f26511b = lpb;
    }

    public final void accept(Object obj) {
        String str;
        lpc lpc = this.f26510a;
        lpb lpb = this.f26511b;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        String b = lpb.mo15296a().mo58453b();
        Intent putExtra = new Intent().setAction("com.google.android.gms.phenotype.FLAG_OVERRIDE").setPackage("com.google.android.gms").putExtra("package", "com.google.android.gms.autofill").putExtra("user", "*").putExtra("flags", new String[]{b});
        String[] strArr = new String[1];
        if (!booleanValue) {
            str = "false";
        } else {
            str = "true";
        }
        strArr[0] = str;
        lpc.f26159a.sendBroadcast(putExtra.putExtra("values", strArr).putExtra("types", new String[]{"boolean"}));
        bdyx a = lpb.mo15296a();
        Boolean valueOf = Boolean.valueOf(booleanValue);
        ProgressDialog progressDialog = new ProgressDialog(lpc.f26159a);
        progressDialog.setIndeterminate(true);
        progressDialog.show();
        ScheduledExecutorService a2 = adzl.f62962b.mo25877a(2, 2);
        bqgg b2 = bqgs.m112812a(a2).mo25819b(new lox(valueOf, a));
        progressDialog.getClass();
        b2.mo741a(new loy(progressDialog), new lpa());
        bqgg a3 = bqga.m112773a(b2, 4, TimeUnit.SECONDS, a2);
        a3.mo741a(new lot(lpc, a3, lpb), new lpa());
    }
}
