package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.reminders.ReindexDueDatesOptions;
import java.util.concurrent.TimeUnit;

/* renamed from: aovk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aovk extends aove {

    /* renamed from: b */
    private final String f83682b;

    /* renamed from: c */
    private final ReindexDueDatesOptions f83683c;

    public aovk(aost aost, String str, ReindexDueDatesOptions reindexDueDatesOptions) {
        super(aost, "CheckReindexDueDatesNeeded");
        this.f83682b = str;
        this.f83683c = reindexDueDatesOptions;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: aost.a(boolean, com.google.android.gms.common.api.Status):void
     arg types: [int, com.google.android.gms.common.api.Status]
     candidates:
      aost.a(com.google.android.gms.common.data.DataHolder, com.google.android.gms.common.api.Status):void
      dcj.a(int, android.os.Parcel):android.os.Parcel
      aost.a(boolean, com.google.android.gms.common.api.Status):void */
    /* renamed from: a */
    public final void mo6502a(Context context) {
        if (aosf.m69445a(context, this.f83682b) != null) {
            Boolean bool = null;
            boolean z = true;
            if (!((Boolean) aoss.f83565x.mo58455c()).booleanValue()) {
                aowg a = aowf.m69689a(context);
                ClientContext a2 = aowf.m69691a(context, this.f83682b);
                bxvd da = blpj.f127234c.mo74144da();
                bxvd da2 = bloy.f127165c.mo74144da();
                String str = this.f83683c.f107052a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bloy bloy = (bloy) da2.f164949b;
                str.getClass();
                bloy.f127167a |= 1;
                bloy.f127168b = str;
                bloy bloy2 = (bloy) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                blpj blpj = (blpj) da.f164949b;
                bloy2.getClass();
                blpj.f127237b = bloy2;
                blpj.f127236a |= 1;
                try {
                    blpj blpj2 = (blpj) da.mo74062i();
                    if (aowg.f83748n == null) {
                        aowg.f83748n = chtv.m149566a(chtu.UNARY, "caribou.tasks.service.TasksApiService/CheckReindexDueDatesNeeded", ciie.m150370a(blpj.f127234c), ciie.m150370a(blpk.f127238b));
                    }
                    bool = ((blpk) a.f83755a.mo25553a(aowg.f83748n, a2, blpj2, (long) aowg.f83736b, TimeUnit.MILLISECONDS)).f127240a;
                } catch (chuw e) {
                    aowu.m69734a("RemindersApiOp", e, "NetworkError", new Object[0]);
                } catch (gid e2) {
                    aowu.m69734a("RemindersApiOp", e2, "AuthError", new Object[0]);
                }
            } else {
                Integer num = (Integer) aoss.f83566y.mo58455c();
                String valueOf = String.valueOf(num);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
                sb.append("Overriding checkReindexDueDatesNeededRemotely for api test, result: ");
                sb.append(valueOf);
                sb.toString();
                if (num.intValue() >= 0) {
                    if (num.intValue() != 1) {
                        z = false;
                    }
                    bool = Boolean.valueOf(z);
                }
            }
            if (bool != null) {
                String valueOf2 = String.valueOf(bool);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("CheckReindexDueDateNeeded succeeded, result: ");
                sb2.append(valueOf2);
                sb2.toString();
                this.f83667a.mo46832a(bool.booleanValue(), new Status(0));
                return;
            }
            this.f83667a.mo46832a(false, new Status(6013));
            return;
        }
        this.f83667a.mo46830a(new Status(6000));
    }
}
