package p000;

import android.content.Context;
import com.google.android.gms.common.api.Status;
import java.io.IOException;

/* renamed from: atib */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class atib extends atkj {

    /* renamed from: a */
    private final String f90387a;

    public atib(String str, String str2, aswm aswm) {
        super("GetLinkingToken", str2, aswm);
        this.f90387a = str;
    }

    /* renamed from: a */
    public final void mo6503a(Status status) {
        this.f90414d.mo49628e(status, null);
    }

    /* renamed from: a */
    public final boolean mo50004a() {
        return false;
    }

    /* renamed from: b */
    public final void mo50005b(Context context) {
        super.mo50005b(context);
        if (!cgwn.f187872a.mo6606a().mo84633n()) {
            this.f90414d.mo49628e(new Status(15009), null);
            return;
        }
        askf b = askg.m74283b(context, this.f90413c);
        if (b == null) {
            this.f90414d.mo49628e(new Status(15002), null);
            return;
        }
        try {
            bxvd da = bzto.f171353b.mo74144da();
            String str = this.f90387a;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            str.getClass();
            ((bzto) da.f164949b).f171355a = str;
            this.f90414d.mo49628e(Status.f30107a, ((bztp) atff.m75769b(b, "g/accountlinking/getlinkingtoken", da.mo74062i(), bztp.f171356b)).f171358a);
        } catch (atfh | IOException e) {
            this.f90414d.mo49628e(new Status(7), null);
        }
    }
}
