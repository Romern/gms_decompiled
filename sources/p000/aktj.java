package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aktj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aktj extends akuu {

    /* renamed from: a */
    private final int f72744a;

    public aktj(int i) {
        this.f72744a = i < 0 ? 20 : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39833a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo39834a(long j) {
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Pair mo39835b(Object obj) {
        String str;
        Pair pair;
        aktn aktn = (aktn) obj;
        List f = aktn.mo39891f();
        if (f == null) {
            return new Pair(false, aktn);
        }
        int size = f.size();
        int i = 0;
        loop0:
        while (true) {
            str = null;
            if (i >= size) {
                pair = null;
                break;
            }
            String[] split = ((String) f.get(i)).split("\n");
            int length = split.length;
            int i2 = 0;
            while (i2 < length) {
                String str2 = split[i2];
                String replaceAll = str2.replaceAll("\\s+", "").replaceAll("[^a-zA-Z0-9$]", "");
                if (replaceAll.length() == 16 || replaceAll.length() == 20) {
                    pair = new Pair(replaceAll, str2);
                } else {
                    i2++;
                }
            }
            i++;
        }
        ArrayList arrayList = new ArrayList();
        if (pair != null) {
            StringBuilder sb = new StringBuilder((String) pair.first);
            int length2 = sb.length();
            for (int i3 = 0; i3 < length2; i3++) {
                char charAt = sb.charAt(i3);
                bnhe bnhe = aktv.f72787b;
                Character valueOf = Character.valueOf(charAt);
                if (bnhe.containsKey(valueOf)) {
                    sb.setCharAt(i3, ((Character) aktv.f72787b.get(valueOf)).charValue());
                }
                if (length2 == 16 && aktv.f72788c.containsKey(valueOf)) {
                    sb.setCharAt(i3, ((Character) aktv.f72788c.get(valueOf)).charValue());
                }
            }
            String str3 = (String) pair.first;
            ArrayList arrayList2 = new ArrayList(this.f72744a);
            StringBuilder sb2 = new StringBuilder(sb);
            int length3 = sb2.length();
            arrayList2.add(sb2.toString());
            if (arrayList2.size() < this.f72744a) {
                int size2 = aktv.f72786a.size();
                loop3:
                for (int i4 = 0; i4 < size2; i4++) {
                    akti akti = (akti) aktv.f72786a.get(i4);
                    for (int i5 = 0; i5 < length3; i5++) {
                        if (akti.mo39840a() == str3.charAt(i5)) {
                            sb2.setCharAt(i5, akti.mo39841b());
                            arrayList2.add(sb2.toString());
                            sb2.replace(0, length3, sb.toString());
                            if (arrayList2.size() >= this.f72744a) {
                                break loop3;
                            }
                        }
                    }
                }
            }
            str = (String) pair.second;
            arrayList = arrayList2;
        }
        aktn.f72771a = arrayList;
        aktn.f72772b = str;
        aktn.mo39892g();
        return new Pair(Boolean.valueOf(!arrayList.isEmpty()), aktn);
    }
}
