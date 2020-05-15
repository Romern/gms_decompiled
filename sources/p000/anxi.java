package p000;

import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: anxi */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class anxi {
    /* renamed from: a */
    public static aoem m65489a(Audience audience) {
        aoel aoel = new aoel();
        aoel.mo42627a(m65492a(audience.f30287b));
        int i = audience.f30288c;
        if (i == 1) {
            aoel.mo42628a(true);
        } else if (i == 2) {
            aoel.mo42628a(false);
        }
        return aoel.mo42626a();
    }

    /* renamed from: b */
    public static Audience m65494b(aoem aoem) {
        sfd sfd = new sfd();
        sfd.mo25467a(m65491a(aoem));
        int i = 1;
        boolean z = false;
        if (aoem.mo42634h() && aoem.mo42633g()) {
            z = true;
        }
        sfd.f44110b = z;
        if (aoem.mo42630c()) {
            if (!aoem.mo42635i()) {
                i = 2;
            }
            sfd.mo25466a(i);
        }
        return sfd.mo25465a();
    }

    /* renamed from: a */
    public static AudienceMember m65490a(sfn sfn, String str) {
        String str2;
        sfo sfo = sfn.f44133b;
        if (sfo == null) {
            sfo = sfo.f44136d;
        }
        int i = sfn.f44132a;
        if ((i & 4) != 0) {
            int a = sfq.m35173a(sfn.f44135d);
            if (a == 0) {
                a = 1;
            }
            int a2 = sfq.m35173a(a);
            if (a2 != 0) {
                if (a2 == 1) {
                    str2 = "public";
                } else if (a2 == 2) {
                    str2 = "domain";
                } else if (a2 == 3) {
                    str2 = "myCircles";
                } else if (a2 == 4) {
                    str2 = "extendedCircles";
                } else {
                    StringBuilder sb = new StringBuilder(38);
                    sb.append("Unknown system group type: ");
                    sb.append(a);
                    throw new IllegalArgumentException(sb.toString());
                }
                return AudienceMember.m22642c(str2, str);
            }
            throw null;
        } else if ((i & 2) != 0) {
            return AudienceMember.m22640b(sfn.f44134c, str);
        } else {
            int i2 = sfo.f44138a;
            if ((i2 & 4) != 0) {
                return AudienceMember.m22639a(sfo.f44140c, str, null);
            }
            if ((i2 & 1) != 0) {
                String str3 = sfo.f44139b;
                return AudienceMember.m22638a(str3, str3);
            }
            String valueOf = String.valueOf(sfn);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb2.append("Unrecognized sharing target (");
            sb2.append(valueOf);
            sb2.append(")");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    /* renamed from: a */
    public static ArrayList m65491a(aoem aoem) {
        ArrayList arrayList = new ArrayList();
        if (aoem.mo42632f()) {
            for (aoib aoib : aoem.mo42631d()) {
                String d = aoib.mo42790d();
                String c = aoib.mo42789c();
                String b = aoib.mo42788b();
                if ("circle".equals(d)) {
                    arrayList.add(AudienceMember.m22640b(c, b));
                } else if ("person".equals(d)) {
                    arrayList.add(AudienceMember.m22639a(c, b, null));
                } else if (!"allContacts".equals(d) && !"allCircles".equals(d)) {
                    arrayList.add(AudienceMember.m22642c(d, b));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m65492a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudienceMember audienceMember = (AudienceMember) it.next();
            aoia aoia = new aoia();
            if (audienceMember.mo17847c()) {
                String str = audienceMember.f30295e;
                aoia.mo42786a(ancm.m64020i(str) ? ancm.m64018g(str) : ancm.m64016e(str));
                aoia.mo42787b("person");
            } else if (audienceMember.mo17845a()) {
                aoia.mo42786a(audienceMember.f30294d);
                aoia.mo42787b("circle");
            } else {
                aoia.mo42787b(audienceMember.f30294d);
            }
            arrayList.add(aoia.mo42785a());
        }
        return arrayList;
    }

    /* renamed from: a */
    public static List m65493a(byte[] bArr) {
        sfj sfj = (sfj) bxvk.m124016a(sfj.f44114c, bArr, bxus.m123744c());
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        bxwc bxwc = sfj.f44117b;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            sfm sfm = (sfm) bxwc.get(i);
            sfn sfn = sfm.f44127a;
            if (sfn == null) {
                sfn = sfn.f44130e;
            }
            arrayList2.add(m65490a(sfn, sfm.f44128b));
        }
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            AudienceMember audienceMember = (AudienceMember) arrayList2.get(i2);
            hashMap.put(audienceMember, audienceMember);
        }
        bxwc bxwc2 = sfj.f44116a;
        int size3 = bxwc2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            sfk sfk = (sfk) bxwc2.get(i3);
            if ((sfk.f44120a & 2) != 0) {
                sfl sfl = sfk.f44121b;
                if (sfl == null) {
                    sfl = sfl.f44122b;
                }
                bxwc bxwc3 = sfl.f44124a;
                int size4 = bxwc3.size();
                int i4 = 0;
                while (i4 < size4) {
                    AudienceMember audienceMember2 = (AudienceMember) hashMap.get(m65490a((sfn) bxwc3.get(i4), null));
                    if (audienceMember2 != null) {
                        arrayList.add(audienceMember2);
                        i4++;
                    } else {
                        String valueOf = String.valueOf((Object) null);
                        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
                        sb.append("No rendered information for ");
                        sb.append(valueOf);
                        sb.append(" available.");
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                continue;
            }
        }
        return arrayList;
    }
}
