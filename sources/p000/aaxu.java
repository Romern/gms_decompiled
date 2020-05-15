package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aaxu */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxu extends aayk {

    /* renamed from: a */
    private final abdy f56793a;

    public aaxu(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, abdy abdy) {
        super(context, helpConfig, bqgj, abcr, 186);
        this.f56793a = abdy;
    }

    /* renamed from: a */
    public static abdz m47193a(abdx abdx, aarp aarp, Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        bxvd da = abdy.f57154d.mo74144da();
        String a = aawg.m47095a(helpConfig, aarp);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abdy abdy = (abdy) da.f164949b;
            a.getClass();
            abdy.f57156a |= 1;
            abdy.f57157b = a;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdy abdy2 = (abdy) da.f164949b;
        abdy2.f57158c = abdx.f57153e;
        abdy2.f57156a |= 2;
        aaxu aaxu = new aaxu(context, helpConfig, bqgj, abcr, (abdy) da.mo74062i());
        try {
            aays k = aaxu.mo31910k();
            if (!aaxu.mo31909a(k)) {
                return null;
            }
            try {
                return (abdz) GeneratedMessageLite.m124016a(abdz.f57159a, k.f56844c, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_UpdateTypingStatCReq", "Parsing UpdateTypingStatusRequest failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_UpdateTypingStatCReq", String.format("Updating typing status failed: [%s]", da.mo74062i()), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78974aO()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) TimeUnit.SECONDS.convert(aata.m46957a(ceeg.f182447a.mo6606a().mo79025t(), ceeg.m136404i(), (float) ceeg.m136403h()), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo31873f() {
        return ((int) ceeg.m136404i()) + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final double mo31874g() {
        return ceeg.m136403h();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3843);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79066r());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56453r = this.f56793a;
        mo31905b(aash);
    }
}
