package p000;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pay.RequestPayModuleRequest;

/* renamed from: aljt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class aljt extends aaab {

    /* renamed from: a */
    private final RequestPayModuleRequest f73579a;

    /* renamed from: b */
    private final alix f73580b;

    /* renamed from: c */
    private final String f73581c;

    public aljt(RequestPayModuleRequest requestPayModuleRequest, alix alix, String str) {
        super(198, "StubRequestPayModule");
        this.f73579a = requestPayModuleRequest;
        this.f73580b = alix;
        this.f73581c = str;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i;
        if (cfuc.f185713a.mo6606a().mo82727c()) {
            if (!TextUtils.isEmpty(this.f73581c)) {
                for (String str : bmyx.m108640a(',').mo66918a((CharSequence) cfuf.f185724a.mo6606a().mo82735a())) {
                    if (this.f73581c.equals(str)) {
                    }
                }
                this.f73580b.mo40441a(Status.f30109c);
                return;
            }
            alhw alhw = new alhw(context);
            int i2 = this.f73579a.f81570a;
            if (alhw.mo40358a(false)) {
                aljq aljq = alhw.f73524c;
                if (i2 != 1) {
                    i = i2 != 2 ? 10 : 12;
                } else {
                    i = 11;
                }
                aljq.mo40450a(i);
                if (alhw.mo40357a(alhw.f73523b, alhw.f73522a)) {
                    alhw.mo40359b();
                }
            }
            this.f73580b.mo40441a(Status.f30107a);
            return;
        }
        this.f73580b.mo40441a(Status.f30109c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f73580b.mo40441a(status);
    }
}
