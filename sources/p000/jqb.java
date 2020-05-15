package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.proximity.firstparty.SetupRequestedSubscription;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.ExecutionException;

/* renamed from: jqb */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class jqb extends aaab {

    /* renamed from: a */
    private final rnt f23036a;

    /* renamed from: b */
    private final PendingIntent f23037b;

    /* renamed from: c */
    private final String f23038c;

    /* renamed from: d */
    private final boolean f23039d;

    /* renamed from: e */
    private final String f23040e;

    static {
        jsy.m17256a("SetupRequestedListener");
    }

    public jqb(rnt rnt, PendingIntent pendingIntent, String str, boolean z, String str2) {
        super(142, "RegisterSetupRequestedListenerOperation");
        this.f23036a = rnt;
        this.f23037b = pendingIntent;
        this.f23038c = str;
        this.f23039d = z;
        this.f23040e = str2;
    }

    /* renamed from: a */
    public final void mo6502a(Context context) {
        boolean z;
        if (!jqd.m17109a(this.f23037b, this.f23040e)) {
            this.f23036a.mo11797a(Status.f30109c);
            return;
        }
        try {
            bsni a = bsni.m116007a(this.f23038c);
            if (a != bsni.UNKNOWN_FEATURE) {
                z = true;
            } else {
                z = false;
            }
            sdo.m34974b(z);
            jqm jqm = new jqm();
            jqm.f23068a = this.f23037b;
            jqm.f23069b = a;
            jqm.f23070c = this.f23040e;
            SetupRequestedSubscription setupRequestedSubscription = new SetupRequestedSubscription(jqm.f23068a, jqm.f23069b.name(), jqm.f23070c);
            try {
                this.f23036a.mo11797a((Status) (this.f23039d ? jqw.m17133a().mo14002a(setupRequestedSubscription) : jqw.m17133a().mo14005b(setupRequestedSubscription)).get());
            } catch (InterruptedException e) {
                throw new aaaj(14, "Interrupted while executing operation.");
            } catch (ExecutionException e2) {
                throw new RuntimeException(e2.getCause());
            }
        } catch (IllegalArgumentException e3) {
            String valueOf = String.valueOf(this.f23038c);
            throw new aaaj(101, valueOf.length() == 0 ? new String("Invalid feature name: ") : "Invalid feature name: ".concat(valueOf));
        }
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f23036a.mo11797a(status);
    }
}
