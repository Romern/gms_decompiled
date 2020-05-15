package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: abez */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abez extends aayk {

    /* renamed from: a */
    private final String f57325a;

    public abez(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, String str) {
        super(context, helpConfig, bqgj, abcr, 179);
        this.f57325a = str;
    }

    /* renamed from: a */
    public static abey m47601a(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, String str) {
        sdo.m34973b("Must be called from a worker thread.");
        if (ssk.m36235a(context)) {
            abez abez = new abez(context, helpConfig, bqgj, abcr, str);
            try {
                aays k = abez.mo31910k();
                if (!abez.mo31909a(k)) {
                    return abey.m47591b(m47602b(abez.f57325a), abez.f56830c);
                }
                int b = m47602b(abez.f57325a);
                String a = abfc.m47607a(abez.f56831d.f78828c, abez.f57325a);
                try {
                    bzrk bzrk = ((bzpd) GeneratedMessageLite.m124016a(bzpd.f170900b, k.f56844c, bxus.m123744c())).f170902a;
                    if (bzrk == null) {
                        bzrk = bzrk.f171153e;
                    }
                    Map a2 = aasm.m46894a(a, bzrk, abez.f56831d);
                    if (a2.size() <= 1) {
                        return abey.m47592c(b, abez.f56830c);
                    }
                    return new abey(a, a2, b);
                } catch (bxwf e) {
                    Log.e("gH_RecsCronetRequest", "Parsing incoming recommendations failed.");
                    return abey.m47591b(b, abez.f56830c);
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.e("gH_RecsCronetRequest", "Fetching recommendations failed.", e2);
                return abey.m47591b(m47602b(str), context);
            }
        } else if (!aaya.m47229b(ceiz.m136966c()) || TextUtils.isEmpty(str)) {
            return abey.m47591b(m47602b(str), context);
        } else {
            return abey.m47588a(m47602b(str), context);
        }
    }

    /* renamed from: b */
    private static int m47602b(String str) {
        return TextUtils.isEmpty(str) ? 16 : 7;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56438c = this.f57325a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo79006az()).appendQueryParameter("hl", aasw.m46952a()).appendQueryParameter("e", ceeg.m136406k()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79063o());
    }
}
