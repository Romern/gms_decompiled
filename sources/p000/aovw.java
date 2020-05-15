package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: aovw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovw extends aovg {

    /* renamed from: h */
    private final ReindexDueDatesOptions f83704h;

    public aovw(aost aost, String str, String str2, ReindexDueDatesOptions reindexDueDatesOptions) {
        super(aost, str, str2, "ReindexDueDates");
        this.f83704h = reindexDueDatesOptions;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x010d, code lost:
        if (r13.intValue() != 1) goto L_0x010f;
     */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        new Object[1][0] = this;
        if (aosf.m69445a(context, this.f83670b) != null) {
            if (!((Boolean) aoss.f83565x.mo58455c()).booleanValue()) {
                aowg a = aowf.m69689a(context);
                ClientContext a2 = aowf.m69691a(context, this.f83670b);
                bxvd da = blrc.f127432c.mo74144da();
                bxvd da2 = bloy.f127165c.mo74144da();
                String str = this.f83704h.f107052a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bloy bloy = (bloy) da2.f164949b;
                str.getClass();
                bloy.f127167a |= 1;
                bloy.f127168b = str;
                bloy bloy2 = (bloy) da2.mo74062i();
                blrk a3 = aowp.m69707a(context, mo46944b());
                bxvd bxvd = (bxvd) a3.mo74142c(5);
                bxvd.mo73625a((GeneratedMessageLite) a3);
                if (bxvd.f164950c) {
                    bxvd.mo74035c();
                    bxvd.f164950c = false;
                }
                blrk blrk = (blrk) bxvd.f164949b;
                blrk blrk2 = blrk.f127482d;
                bloy2.getClass();
                blrk.f127485b = bloy2;
                blrk.f127484a |= 1;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blrc blrc = (blrc) da.f164949b;
                blrk blrk3 = (blrk) bxvd.mo74062i();
                blrk3.getClass();
                blrc.f127435b = blrk3;
                blrc.f127434a = 1 | blrc.f127434a;
                try {
                    blrc blrc2 = (blrc) da.mo74062i();
                    if (aowg.f83747m == null) {
                        aowg.f83747m = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/ReindexDueDates", ciie.m150370a(blrc.f127432c), ciie.m150370a(blrd.f127436a));
                    }
                    blrd blrd = (blrd) a.f83755a.mo25553a(aowg.f83747m, a2, blrc2, (long) aowg.f83736b, TimeUnit.MILLISECONDS);
                } catch (chuw e) {
                    aowu.m69734a("RemindersApiOp", e, "NetworkError", new Object[0]);
                    this.f83675g.mo46830a(new Status(6014));
                    return;
                } catch (gid e2) {
                    aowu.m69734a("RemindersApiOp", e2, "AuthError", new Object[0]);
                    this.f83675g.mo46830a(new Status(6014));
                    return;
                }
            } else {
                Integer num = (Integer) aoss.f83566y.mo58455c();
                String valueOf = String.valueOf(num);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 57);
                sb.append("Overriding reindexDueDatesRemotely for api test, result: ");
                sb.append(valueOf);
                sb.toString();
            }
            this.f83675g.mo46830a(new Status(0));
            return;
        }
        this.f83675g.mo46830a(new Status(6000));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo46936a(ArrayList arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo46945b(ArrayList arrayList) {
    }
}
