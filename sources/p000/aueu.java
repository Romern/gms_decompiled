package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.telephonyspam.SettingsLookupResult;
import java.util.Collections;

/* renamed from: aueu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aueu extends aaab {

    /* renamed from: a */
    private final audg f91584a = audg.m76790a("GetSettingsOperation");

    /* renamed from: b */
    private final String f91585b;

    /* renamed from: c */
    private final int f91586c;

    /* renamed from: d */
    private final audm f91587d;

    public aueu(audm audm, String str, int i) {
        super(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, "GetSpamStatus");
        this.f91587d = audm;
        this.f91585b = str;
        this.f91586c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        new Object[1][0] = Integer.valueOf(this.f91586c);
        String str = this.f91585b;
        int i = this.f91586c;
        this.f91587d.mo50430a(Status.f30107a, new SettingsLookupResult(Boolean.valueOf(audi.m76798a(context).getStringSet(audi.m76799a(i), Collections.emptySet()).contains(str)).booleanValue()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        audg audg = this.f91584a;
        String valueOf = String.valueOf(status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("onFailure: status: ");
        sb.append(valueOf);
        audg.mo50425c(sb.toString());
        this.f91587d.mo50430a(status, new SettingsLookupResult(false));
    }
}
