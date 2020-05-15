package p000;

import java.util.ArrayList;

/* renamed from: aizs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aizs {
    /* renamed from: a */
    public static byys m58300a(int i, byte[] bArr) {
        bxvf bxvf = (bxvf) byys.f169002d.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byys byys = (byys) bxvf.f164949b;
        byys.f169005b = i - 1;
        byys.f169004a |= 1;
        ByteString a = ByteString.m123261a(bArr);
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        byys byys2 = (byys) bxvf.f164949b;
        a.getClass();
        byys2.f169004a |= 2;
        byys2.f169006c = a;
        return (byys) bxvf.mo74062i();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* renamed from: a */
    public static String m58301a(byys byys) {
        int i;
        String str;
        String str2 = "null";
        if (byys == null) {
            return str2;
        }
        Object[] objArr = new Object[2];
        if ((byys.f169004a & 1) != 0) {
            i = bzaj.m125580a(byys.f169005b);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        if (i != 0) {
            int i2 = i - 1;
            if (i2 == 1) {
                str = "IBEACON";
            } else if (i2 == 2) {
                str = "EDDYSTONE_UID";
            } else if (i2 == 3) {
                str = "ALTBEACON";
            } else if (i2 == 4) {
                str = "EDDYSTONE_EIDR";
            } else if (i2 == 106) {
                str = "MAGIC_PAIR";
            }
            objArr[0] = str;
            if ((2 & byys.f169004a) != 0) {
                str2 = srv.m36160a(byys.f169006c.getKey());
            }
            objArr[1] = str2;
            return String.format("BeaconId{type=%s, id=%s}", objArr);
        }
        String valueOf = String.valueOf(i != 0 ? Integer.toString(i - 1) : str2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("UNKNOWN_BEACON_TYPE(");
        sb.append(valueOf);
        sb.append(")");
        str = sb.toString();
        objArr[0] = str;
        if ((2 & byys.f169004a) != 0) {
        }
        objArr[1] = str2;
        return String.format("BeaconId{type=%s, id=%s}", objArr);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List, java.lang.Iterable], assign insn: null */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    public static String m58302a(Iterable r4) {
        if (r4 == 0) {
            return "null";
        }
        ArrayList arrayList = new ArrayList();
        int size = r4.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(m58301a((byys) r4.get(i)));
        }
        return arrayList.toString();
    }
}
