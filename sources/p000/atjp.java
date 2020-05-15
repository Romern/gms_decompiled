package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.firstparty.LocalNotification;

/* renamed from: atjp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atjp extends atki {
    public atjp(byte[] bArr, String str, aswm aswm) {
        super("ScheduleOobeNotificationOperation", new LocalNotification(bArr), str, aswm);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49629f(status);
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        atau atau = new atau(context);
        byte[] bArr = ((LocalNotification) this.f90410b).f108410a;
        try {
            btqg btqg = (btqg) bxvk.m124016a(btqg.f149933q, bArr, bxus.m123744c());
            if (btqg.f149935a > 0) {
                Context context2 = atau.f89974b;
                Bundle bundle = new Bundle();
                bundle.putByteArray("localNotification", btqg.mo73642k());
                aeat a = aeat.m51532a(context2);
                aebi aebi = new aebi();
                long j = (long) btqg.f149935a;
                aebi.mo34004a(j, cgwz.f187949a.mo6606a().mo84660b() + j);
                aebi.f63097i = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
                aebi.f63099k = "local_notification.oneoff";
                aebi.mo34023a(2);
                aebi.mo34027b(0);
                aebi.f63107s = bundle;
                a.mo33984a(aebi.mo33974b());
            } else {
                atau.mo49771a(btqg);
            }
        } catch (bxwf e) {
            bnsl bnsl = (bnsl) atau.f89973a.mo68388c();
            bnsl.mo68437a(e);
            bnsl.mo68432a("atau", "a", 59, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Failed to parse proto");
        }
        this.f90414d.mo49629f(Status.f30107a);
    }
}
