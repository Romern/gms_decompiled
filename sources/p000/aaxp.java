package p000;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aaxp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxp extends aayk {

    /* renamed from: a */
    private final abdn f56778a;

    public aaxp(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, abdn abdn) {
        super(context, helpConfig, bqgj, abcr, 52);
        this.f56778a = abdn;
    }

    /* renamed from: a */
    public static abdo m47175a(aarp aarp, Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        bxvd da = abdn.f57103e.mo74144da();
        String a = aawg.m47095a(helpConfig, aarp);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abdn abdn = (abdn) da.f164949b;
            a.getClass();
            abdn.f57105a |= 1;
            abdn.f57106b = a;
        }
        bxyl a2 = bxyl.m124413a(aawg.m47110c(aarp));
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdn abdn2 = (abdn) da.f164949b;
        a2.getClass();
        abdn2.f57107c = a2;
        abdn2.f57105a |= 2;
        if (aaya.m47228a(cefw.m136749b())) {
            String a3 = aawg.m47094a(aarp);
            if (!TextUtils.isEmpty(a3)) {
                bxvd da2 = abec.f57171c.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                abec abec = (abec) da2.f164949b;
                a3.getClass();
                abec.f57173a |= 1;
                abec.f57174b = a3;
                abec abec2 = (abec) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abdn abdn3 = (abdn) da.f164949b;
                abec2.getClass();
                abdn3.f57108d = abec2;
                abdn3.f57105a |= 4;
            }
        }
        aaxp aaxp = new aaxp(context, helpConfig, bqgj, abcr, (abdn) da.mo74062i());
        try {
            aays k = aaxp.mo31910k();
            if (!aaxp.mo31909a(k)) {
                return null;
            }
            try {
                return (abdo) bxvk.m124016a(abdo.f57109b, k.f56844c, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_ListConvoEventsCReq", "Parsing ListChatConversationEventsRequest failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_ListConvoEventsCReq", String.format("Fetching chat conversation events failed: [%s]", da.mo74062i()), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78954V()).build().toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final int mo29523e() {
        return (int) TimeUnit.SECONDS.convert(aata.m46957a(ceeg.m136400e(), ceeg.m136399d(), (float) ceeg.m136398c()), TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo31873f() {
        return ((int) ceeg.m136399d()) + 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final double mo31874g() {
        return ceeg.m136398c();
    }

    public final void onPreNetworkDispatch() {
        shr.m35316b(3842);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79062n());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56455t = this.f56778a;
        mo31905b(aash);
    }
}
