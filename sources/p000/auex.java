package p000;

import android.content.Context;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.gms.common.api.Status;

/* renamed from: auex */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class auex extends aaab {

    /* renamed from: a */
    private final audg f91614a = audg.m76790a("UpdateSettingsOperation");

    /* renamed from: b */
    private final rnt f91615b;

    /* renamed from: c */
    private final int f91616c;

    /* renamed from: d */
    private final String f91617d;

    /* renamed from: e */
    private final boolean f91618e;

    public auex(rnt rnt, String str, int i, boolean z) {
        super(MfiClientException.TYPE_MFICLIENT_REMOTE_ACCESS_FAILED, "UpdateSettings");
        this.f91615b = rnt;
        this.f91617d = str;
        this.f91616c = i;
        this.f91618e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        int i = 2;
        Object[] objArr = {Integer.valueOf(this.f91616c), Boolean.valueOf(this.f91618e)};
        if (this.f91616c == 2) {
            i = 3;
        }
        boolean e = audi.m76806e(context, i);
        if (audi.m76801a(context, this.f91617d, this.f91616c, this.f91618e)) {
            if (this.f91618e && !e) {
                auey.m76972c();
            }
            this.f91615b.mo11797a(Status.f30107a);
            return;
        }
        this.f91614a.mo50425c("Unable to update spam module settings");
        this.f91615b.mo11797a(Status.f30109c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f91615b.mo11797a(status);
    }
}
