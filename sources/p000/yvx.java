package p000;

import com.google.android.gms.fitness.data.Application;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Device;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: yvx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class yvx {
    /* renamed from: a */
    public static bngx m44924a(Collection collection) {
        bngs b = bngx.m109371b(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b.mo67668c(m44925a((DataSource) it.next()));
        }
        return b.mo67664a();
    }

    /* renamed from: a */
    public static caae m44925a(DataSource dataSource) {
        if (dataSource == null) {
            return null;
        }
        caab caab = (caab) caae.f172323i.mo74144da();
        caad a = caad.m126389a(dataSource.f32006b);
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae = (caae) caab.f164949b;
        caae.f172329e = a.f172322e;
        caae.f172325a |= 8;
        Application application = dataSource.f32008d;
        if (application != null) {
            bzzy bzzy = (bzzy) bzzz.f172298f.mo74144da();
            String str = application.f31980b;
            if (bzzy.f164950c) {
                bzzy.mo74035c();
                bzzy.f164950c = false;
            }
            bzzz bzzz = (bzzz) bzzy.f164949b;
            str.getClass();
            bzzz.f172300a |= 1;
            bzzz.f172301b = str;
            bzzz bzzz2 = (bzzz) bzzy.mo74062i();
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae2 = (caae) caab.f164949b;
            bzzz2.getClass();
            caae2.f172332h = bzzz2;
            caae2.f172325a |= 64;
        }
        Device device = dataSource.f32007c;
        if (device != null) {
            caap a2 = caap.m126421a(device.f32076d);
            if (a2 == null) {
                a2 = caap.UNKNOWN;
            }
            int a3 = caan.m126419a(device.f32077e);
            if (a3 == 0) {
                a3 = 1;
            }
            caaq a4 = yyh.m45003a(device.f32073a, device.f32074b, device.f32075c, a2, a3);
            if (caab.f164950c) {
                caab.mo74035c();
                caab.f164950c = false;
            }
            caae caae3 = (caae) caab.f164949b;
            a4.getClass();
            caae3.f172331g = a4;
            caae3.f172325a |= 32;
        }
        caah a5 = ywb.m44930a(dataSource.f32005a);
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae4 = (caae) caab.f164949b;
        a5.getClass();
        caae4.f172330f = a5;
        caae4.f172325a |= 16;
        String b = bmxx.m108578b(dataSource.f32009e);
        if (caab.f164950c) {
            caab.mo74035c();
            caab.f164950c = false;
        }
        caae caae5 = (caae) caab.f164949b;
        b.getClass();
        int i = caae5.f172325a | 4;
        caae5.f172325a = i;
        caae5.f172328d = b;
        String str2 = dataSource.f32010f;
        str2.getClass();
        caae5.f172325a = i | 1;
        caae5.f172326b = str2;
        return (caae) caab.mo74062i();
    }

    /* renamed from: a */
    public static DataSource m44926a(caae caae) {
        return m44927a(caae, null);
    }

    /* renamed from: a */
    public static DataSource m44927a(caae caae, String str) {
        String str2;
        int i;
        int i2;
        ywq ywq = new ywq();
        caad a = caad.m126389a(caae.f172329e);
        if (a == null) {
            a = caad.RAW;
        }
        ywq.f54713b = a.f172322e;
        caah caah = caae.f172330f;
        if (caah == null) {
            caah = caah.f172333d;
        }
        ywq.f54712a = ywb.m44931a(caah);
        ywq.mo30805a(caae.f172328d);
        if ((caae.f172325a & 32) != 0) {
            caaq caaq = caae.f172331g;
            if (caaq == null) {
                caaq = caaq.f172356h;
            }
            int a2 = caan.m126419a(caaq.f172364g);
            if (a2 == 0) {
                a2 = 1;
            }
            String str3 = caaq.f172363f;
            String str4 = caaq.f172362e;
            if (a2 != 2) {
                str2 = yxw.m44960a(caaq.f172359b, str);
            } else {
                str2 = caaq.f172359b;
            }
            if ((caaq.f172358a & 2) != 0) {
                caap a3 = caap.m126421a(caaq.f172360c);
                if (a3 == null) {
                    a3 = caap.UNKNOWN;
                }
                i = a3.f172355h;
            } else {
                i = 0;
            }
            if ((caaq.f172358a & 32) != 0) {
                int a4 = caan.m126419a(caaq.f172364g);
                if (a4 == 0) {
                    a4 = 1;
                }
                i2 = a4 - 1;
            } else {
                i2 = 0;
            }
            ywq.f54714c = new Device(str3, str4, str2, i, i2);
        }
        if ((caae.f172325a & 64) != 0) {
            bzzz bzzz = caae.f172332h;
            if (bzzz == null) {
                bzzz = bzzz.f172298f;
            }
            if ((bzzz.f172300a & 1) != 0) {
                bzzz bzzz2 = caae.f172332h;
                if (bzzz2 == null) {
                    bzzz2 = bzzz.f172298f;
                }
                ywq.f54715d = Application.m23661a(bzzz2.f172301b);
            }
        }
        return ywq.mo30804a();
    }
}
