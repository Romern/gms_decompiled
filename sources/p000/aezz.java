package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.felicanetworks.mfc.C0126R;
import com.google.android.gms.magictether.host.ConnectTetheringResponder$TetheringResultReceiver;

/* renamed from: aezz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aezz implements afcb {

    /* renamed from: a */
    final /* synthetic */ afbf f64071a;

    /* renamed from: b */
    final /* synthetic */ afaa f64072b;

    public aezz(afaa afaa, afbf afbf) {
        this.f64072b = afaa;
        this.f64071a = afbf;
    }

    /* renamed from: a */
    public final void mo34705a(String str) {
        afaa afaa = this.f64072b;
        Context context = afaa.f64074a;
        afbf afbf = this.f64071a;
        String str2 = afaa.f64075b.f11139c;
        ConnectTetheringResponder$TetheringResultReceiver connectTetheringResponder$TetheringResultReceiver = afaa.f64078e;
        String string = context.getString(C0126R.string.magictether_first_time_setup_required_host_dialog_title, afbf.f64128c);
        PendingIntent activity = PendingIntent.getActivity(context, 0, new Intent().setClassName(context, "com.google.android.gms.magictether.host.FirstTimeSetupDialogActivity").putExtra("dialog_content_title", string).putExtra("dialog_content_message", context.getString(C0126R.string.magictether_first_time_setup_required_host_dialog_content, str, str2)).putExtra("result_receiver", connectTetheringResponder$TetheringResultReceiver), 134217728);
        afcg a = afcg.m52833a();
        afbf afbf2 = this.f64071a;
        String str3 = this.f64072b.f64075b.f11139c;
        String string2 = a.f64175b.getString(C0126R.string.magictether_first_time_setup_required_host_content, afbf2.f64128c, str3);
        C1102je a2 = a.mo34738a(false, "mt-notification-channel-id");
        a2.mo13640e(a.f64175b.getString(C0126R.string.magictether_provide_data_title));
        a2.mo13632b(string2);
        C1101jd jdVar = new C1101jd();
        jdVar.mo13593a(string2);
        a2.mo13626a(jdVar);
        a2.mo13639d(string2);
        int i = Build.VERSION.SDK_INT;
        a2.f22254f = activity;
        a.mo34741a(a.f64176c, a2.mo13629b(), 4);
        afba afba = a.f64174a;
        if (cfcm.m138682b()) {
            afba.f64113b.mo24383c("magictether_setup_notification_shown_count").mo24359a();
            afba.f64113b.mo24388e();
        }
    }
}
