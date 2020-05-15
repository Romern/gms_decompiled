package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: dkt */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dkt {
    /* renamed from: a */
    public static int m8751a(djz djz, List list) {
        int i;
        int e = djz.mo9180e();
        brtm brtm = new brtm();
        Iterator it = list.iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            djd djd = (djd) it.next();
            String str = djd.f13317b;
            long j = djd.f13318c;
            int a = m8753a(str, j, djz, brtm);
            if (a < 0) {
                z = true;
            } else if (brtm.mo69931t()) {
                z2 = true;
            } else if (j == -1 && (i = a + 1) < e) {
                djz.mo9174a(brtm, i);
                z2 = str.equals(brtm.mo9295P());
            }
        }
        if (z) {
            return 1;
        }
        if (!z2) {
            return 0;
        }
        return 2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: dkt.a(djz, java.util.List):int
     arg types: [djz, java.util.ArrayList]
     candidates:
      dkt.a(djz, byte[]):int
      dkt.a(djz, java.util.Collection):java.util.List
      dkt.a(djz, java.util.List):int */
    /* renamed from: a */
    public static int m8752a(djz djz, byte[] bArr) {
        try {
            bxwc bxwc = ((djf) GeneratedMessageLite.m124016a(djf.f13322b, bArr, bxus.m123743b())).f13324a;
            ArrayList arrayList = new ArrayList(bxwc.size());
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                djc djc = (djc) bxwc.get(i);
                bxvd da = djd.f13314d.mo74144da();
                String str = djc.f13310b;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                djd djd = (djd) da.f164949b;
                str.getClass();
                int i2 = djd.f13316a | 1;
                djd.f13316a = i2;
                djd.f13317b = str;
                long j = djc.f13311c;
                djd.f13316a = i2 | 2;
                djd.f13318c = j;
                arrayList.add((djd) da.mo74062i());
            }
            return m8751a(djz, (List) arrayList);
        } catch (bxwf e) {
            String valueOf = String.valueOf(e.getMessage());
            Log.e("FeatureCheckUtils", valueOf.length() == 0 ? new String("Failed to parse FeatureList proto: ") : "Failed to parse FeatureList proto: ".concat(valueOf));
            return 3;
        }
    }

    /* renamed from: a */
    private static int m8753a(String str, long j, djz djz, brtm brtm) {
        int a = dll.m8799a(djz, dll.f13447c, new dlj(str, j));
        if (a >= 0) {
            djz.mo9174a(brtm, a);
            return a;
        }
        int i = (-a) - 1;
        if (i != djz.mo9180e()) {
            djz.mo9174a(brtm, i);
            if (str.equals(brtm.mo9295P())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: a */
    public static List m8754a(djz djz, Collection collection) {
        int e = djz.mo9180e();
        brtm brtm = new brtm();
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            int a = m8753a(str, 0, djz, brtm);
            if (a >= 0) {
                do {
                    arrayList.add(djh.m8646a(brtm));
                    a++;
                    if (a == e) {
                        break;
                    }
                    djz.mo9174a(brtm, a);
                } while (str.equals(brtm.mo9295P()));
            }
        }
        return arrayList;
    }
}
