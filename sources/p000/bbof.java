package p000;

import android.content.Context;
import com.google.android.libraries.messaging.lighter.Lighter;
import com.google.android.libraries.messaging.lighter.model.ContactId;

/* renamed from: bbof */
public final /* synthetic */ class bbof implements bmxj {

    /* renamed from: a */
    private final Lighter f103008a;

    public bbof(Lighter lighter) {
        this.f103008a = lighter;
    }

    public final Object apply(Object obj) {
        String str;
        String str2;
        Lighter lighter = this.f103008a;
        bngx bngx = (bngx) obj;
        Context context = lighter.f111318b;
        bbov.m88299a();
        bbqo bbqo = new bbqo(context);
        int i = 0;
        anef.m64089a(bbqo.f103073a).mo25234a(bbql.m88408a(bbqo.f103073a), bbqj.m88406a(bbqo.f103073a).f103071b, new String[]{"LIGHTER_ANDROID"}, (byte[]) null).mo50371a(bbqm.f103072a);
        int size = bngx.size();
        while (true) {
            str = "";
            if (i >= size) {
                str2 = str;
                break;
            }
            bcoh bcoh = (bcoh) bngx.get(i);
            i++;
            if (ContactId.ContactType.EMAIL.equals(bcoh.mo57058b().mo57074e().mo60494c())) {
                str2 = bcoh.mo57058b().mo57074e().mo60492a();
                break;
            }
        }
        if (str2 != null) {
            str = str2;
        }
        bbos.m88291b("PhenotypeApiImplV12", str.length() == 0 ? new String("Retrieve experiment configurations for: ") : "Retrieve experiment configurations for: ".concat(str));
        new bbqn(anef.m64089a(bbqo.f103073a), bbql.m88408a(bbqo.f103073a)).mo25219a(str);
        lighter.f111320d.mo56326a(bngx);
        lighter.f111317a.f104097a = ((Boolean) bbqt.m88417a(context).f103121aP.mo58455c()).booleanValue();
        return null;
    }
}
