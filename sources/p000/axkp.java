package p000;

import com.google.android.libraries.walletp2p.model.Contact;
import java.util.Locale;

/* renamed from: axkp */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class axkp {
    /* renamed from: a */
    public static btsf m82676a(Contact contact) {
        beat beat;
        bxvd da = btsf.f150195c.mo74144da();
        if (!contact.f150664c.isEmpty()) {
            String str = contact.f150664c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            btsf btsf = (btsf) da.f164949b;
            str.getClass();
            btsf.f150197a = 2;
            btsf.f150198b = str;
        } else if (!contact.f150665d.isEmpty()) {
            String str2 = contact.f150665d;
            try {
                if (!chlh.m148921b()) {
                    beat = beao.m91670a().mo58483a(str2, Locale.US.getCountry());
                } else {
                    beat = beao.m91670a().mo58483a(str2, bmxx.m108578b((String) axmc.f96176b.mo58455c()).toUpperCase(Locale.US));
                }
                bxvd da2 = bsjl.f144810h.mo74144da();
                int i = beat.f106841a;
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bsjl bsjl = (bsjl) da2.f164949b;
                int i2 = bsjl.f144812a | 1;
                bsjl.f144812a = i2;
                bsjl.f144813b = i;
                long j = beat.f106842b;
                int i3 = 2 | i2;
                bsjl.f144812a = i3;
                bsjl.f144814c = j;
                String str3 = beat.f106844d;
                str3.getClass();
                int i4 = i3 | 4;
                bsjl.f144812a = i4;
                bsjl.f144815d = str3;
                boolean z = beat.f106845e;
                int i5 = i4 | 8;
                bsjl.f144812a = i5;
                bsjl.f144816e = z;
                int i6 = beat.f106846f;
                int i7 = i5 | 16;
                bsjl.f144812a = i7;
                bsjl.f144817f = i6;
                str2.getClass();
                bsjl.f144812a = i7 | 32;
                bsjl.f144818g = str2;
                bsjl bsjl2 = (bsjl) da2.mo74062i();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                btsf btsf2 = (btsf) da.f164949b;
                bsjl2.getClass();
                btsf2.f150198b = bsjl2;
                btsf2.f150197a = 3;
            } catch (bean e) {
                throw new RuntimeException(e);
            }
        }
        return (btsf) da.mo74062i();
    }
}
