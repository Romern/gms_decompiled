package p000;

import com.google.android.gms.auth.api.phone.internal.SmsRetrieverEvent;
import com.google.android.gms.common.api.Status;

/* renamed from: iag */
public final /* synthetic */ class iag implements roo {

    /* renamed from: a */
    private final SmsRetrieverEvent f20629a;

    public iag(SmsRetrieverEvent smsRetrieverEvent) {
        this.f20629a = smsRetrieverEvent;
    }

    /* renamed from: a */
    public final void mo6476a(Object obj, Object obj2) {
        SmsRetrieverEvent smsRetrieverEvent = this.f20629a;
        int i = iai.f20630a;
        ((hyx) ((iaj) obj).mo25289B()).mo12825a(smsRetrieverEvent);
        rpc.m34201a(Status.f30107a, (aucf) obj2);
    }
}
