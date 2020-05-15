package p000;

import android.content.Context;
import com.google.android.gms.common.internal.ClientContext;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* renamed from: apbv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apbv {

    /* renamed from: a */
    public final apbu f84113a;

    /* renamed from: b */
    public final apbt f84114b;

    /* renamed from: a */
    public final btem mo47087a(ClientContext clientContext, String str, String[] strArr, String str2) {
        btej btej = (btej) btek.f148526d.mo74144da();
        bxvd da = btcs.f148310b.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        str.getClass();
        ((btcs) da.f164949b).f148312a = str;
        if (btej.f164950c) {
            btej.mo74035c();
            btej.f164950c = false;
        }
        btcs btcs = (btcs) da.mo74062i();
        btcs.getClass();
        ((btek) btej.f164949b).f148528a = btcs;
        if (strArr != null) {
            btej.mo70753a(Arrays.asList(strArr));
        }
        if (btej.f164950c) {
            btej.mo74035c();
            btej.f164950c = false;
        }
        ((btek) btej.f164949b).f148531e = 0;
        if (btej.f164950c) {
            btej.mo74035c();
            btej.f164950c = false;
        }
        str2.getClass();
        ((btek) btej.f164949b).f148530c = str2;
        apbu apbu = this.f84113a;
        btek btek = (btek) btej.mo74062i();
        long b = cgjp.m145738b();
        if (apbu.f84111c == null) {
            apbu.f84111c = chtv.m149566a(chtu.UNARY, "google.internal.people.v2.InternalPeopleService/RestoreDeviceContacts", ciie.m150370a(btek.f148526d), ciie.m150370a(btem.f148532c));
        }
        return (btem) apbu.f84112a.mo25553a(apbu.f84111c, clientContext, btek, b, TimeUnit.MILLISECONDS);
    }

    public apbv(Context context) {
        shl shl = new shl(context, cgjp.f187086a.mo6606a().mo83916b(), (int) cgjp.f187086a.mo6606a().mo83915a(), context.getApplicationInfo().uid, 14080);
        this.f84113a = new apbu(shl);
        this.f84114b = new apbt(shl);
    }
}
