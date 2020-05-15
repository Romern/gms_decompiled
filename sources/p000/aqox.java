package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import java.util.Arrays;

/* renamed from: aqox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aqox extends aaab {

    /* renamed from: a */
    private final String f86443a;

    /* renamed from: b */
    private final int f86444b;

    /* renamed from: c */
    private final String f86445c;

    /* renamed from: d */
    private final RecordConsentRequest f86446d;

    /* renamed from: e */
    private final aqoc f86447e;

    public aqox(String str, int i, String str2, RecordConsentRequest recordConsentRequest, aqoc aqoc) {
        super(44, "RecordConsent");
        this.f86443a = str;
        this.f86444b = i;
        this.f86445c = str2;
        this.f86446d = recordConsentRequest;
        this.f86447e = aqoc;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        RecordConsentRequest recordConsentRequest = this.f86446d;
        adag a = adag.m50068a(recordConsentRequest.f107705b, Arrays.asList(recordConsentRequest.f107706c));
        a.mo33287a(this.f86443a, this.f86444b);
        a.mo33283a(4);
        a.mo33285a(iyb.GRANTED);
        a.mo33289b(this.f86445c);
        this.f86447e.mo47989b(!aqpl.m71926a(context).mo48034a(a.mo33282a()).mo48035a() ? new Status(13) : Status.f30107a);
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f86447e.mo47989b(status);
    }
}
