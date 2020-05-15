package p000;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.googlehelp.common.HelpConfig;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aaxt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aaxt extends aayk {

    /* renamed from: a */
    public static final /* synthetic */ int f56791a = 0;

    /* renamed from: l */
    private final abdu f56792l;

    public aaxt(Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr, int i, abdu abdu) {
        super(context, helpConfig, bqgj, abcr, i);
        this.f56792l = abdu;
    }

    /* renamed from: a */
    public static abdu m47185a(aarp aarp, HelpConfig helpConfig) {
        bxvd da = abdu.f57135g.mo74144da();
        String a = aawg.m47095a(helpConfig, aarp);
        if (a != null) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            abdu abdu = (abdu) da.f164949b;
            a.getClass();
            abdu.f57137a |= 1;
            abdu.f57140d = a;
        }
        bxvd da2 = bxyl.f165099b.mo74144da();
        long c = aawg.m47110c(aarp);
        if (c != -1) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            ((bxyl) da2.f164949b).f165101a = c;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        abdu abdu2 = (abdu) da.f164949b;
        bxyl bxyl = (bxyl) da2.mo74062i();
        bxyl.getClass();
        abdu2.f57141e = bxyl;
        abdu2.f57137a |= 2;
        return (abdu) da.mo74062i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo29520b() {
        return Uri.parse(ceeg.m136397b()).buildUpon().encodedPath(ceeg.f182447a.mo6606a().mo78973aN()).build().toString();
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

    /* renamed from: a */
    public static abdv m47186a(abdu abdu, int i, Context context, HelpConfig helpConfig, bqgj bqgj, abcr abcr) {
        sdo.m34973b("Must be called from a worker thread.");
        aaxt aaxt = new aaxt(context, helpConfig, bqgj, abcr, i, abdu);
        try {
            aays k = aaxt.mo31910k();
            if (!aaxt.mo31909a(k)) {
                return null;
            }
            try {
                return (abdv) GeneratedMessageLite.m124016a(abdv.f57143c, k.f56844c, bxus.m123744c());
            } catch (bxwf e) {
                Log.e("gH_UpdateChatConvoCReq", "Parsing MobileUpdateConversationResponse failed!", e);
                return null;
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            Log.e("gH_UpdateChatConvoCReq", String.format("Updating conversation failed: [%s]", abdu), e2);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo29518a() {
        return aayq.m47281a(ceev.f182568a.mo6606a().mo79065q());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo29564a(aash aash) {
        aash.f56454s = this.f56792l;
        mo31905b(aash);
    }
}
