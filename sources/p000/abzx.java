package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: abzx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abzx implements bdyv {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo24436a(byte[] bArr) {
        int i;
        if (bArr.length == 0) {
            return Collections.emptyList();
        }
        List<String> c = bmyx.m108640a(',').mo66925c((CharSequence) new String(bArr, bmwy.f131158c));
        ArrayList arrayList = new ArrayList(c.size());
        for (String str : c) {
            List c2 = bmyx.m108640a('/').mo66925c((CharSequence) str);
            if (c2.size() == 3) {
                if (!((String) c2.get(2)).isEmpty()) {
                    i = Integer.parseInt((String) c2.get(2));
                    if (i < 0 || i > 100) {
                        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68);
                        sb.append("Invalid percentage \"");
                        sb.append(i);
                        sb.append("\" not in [0,100] in filter string: \"");
                        sb.append(str);
                        sb.append("\"");
                        absg.m48191b(sb.toString());
                        return Collections.emptyList();
                    }
                } else {
                    i = 0;
                }
                bxvd da = abti.f58235e.mo74144da();
                String str2 = (String) c2.get(0);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abti abti = (abti) da.f164949b;
                str2.getClass();
                abti.f58237a |= 1;
                abti.f58238b = str2;
                String str3 = (String) c2.get(1);
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abti abti2 = (abti) da.f164949b;
                str3.getClass();
                int i2 = 2 | abti2.f58237a;
                abti2.f58237a = i2;
                abti2.f58239c = str3;
                abti2.f58237a = i2 | 4;
                abti2.f58240d = i;
                arrayList.add((abti) da.mo74062i());
            } else {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 24);
                sb2.append("Invalid filter string \"");
                sb2.append(str);
                sb2.append("\"");
                absg.m48191b(sb2.toString());
                return Collections.emptyList();
            }
        }
        return arrayList;
    }
}
