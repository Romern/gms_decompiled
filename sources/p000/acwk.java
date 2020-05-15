package p000;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.gms.appdatasearch.DocumentSection;
import com.google.android.gms.appdatasearch.UsageInfo;

/* renamed from: acwk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acwk {

    /* renamed from: a */
    private static final DocumentSection[] f60966a = {UsageInfo.m6158a(""), UsageInfo.m6157a(Uri.EMPTY), UsageInfo.m6159a("intent_action", ""), UsageInfo.m6159a("intent_data", ""), ftr.m12361a(".private:action", cixm.f191686d)};

    /* renamed from: b */
    private static final String[] f60967b = {"title", "web_url", "intent_action", "intent_data", ".private:action"};

    /* renamed from: a */
    public static abqe m49902a(abqe abqe) {
        SparseArray sparseArray = new SparseArray();
        bxwc bxwc = abqe.f57955e;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            abqd abqd = (abqd) bxwc.get(i);
            abqo abqo = abqd.f57948d;
            if (abqo == null) {
                abqo = abqo.f57975r;
            }
            String str = abqo.f57978b;
            int i2 = 0;
            while (true) {
                String[] strArr = f60967b;
                if (i2 < strArr.length) {
                    if (strArr[i2].equals(str)) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 == -1) {
                return abqe;
            }
            sparseArray.put(i2, abqd);
        }
        bxvd bxvd = (bxvd) abqe.mo74142c(5);
        bxvd.mo73625a((GeneratedMessageLite) abqe);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        abqe abqe2 = abqe.f57949g;
        ((abqe) bxvd.f164949b).f57955e = GeneratedMessageLite.m124030de();
        for (int i3 = 0; i3 < f60967b.length; i3++) {
            abqd abqd2 = (abqd) sparseArray.get(i3);
            if (abqd2 == null) {
                DocumentSection documentSection = f60966a[i3];
                abqo a = abzm.m48648a(documentSection.f9544d);
                bxvd bxvd2 = (bxvd) a.mo74142c(5);
                bxvd2.mo73625a((GeneratedMessageLite) a);
                if (documentSection.f9545e != DocumentSection.f9541a) {
                    int i4 = documentSection.f9545e;
                    if (bxvd2.f164950c) {
                        bxvd2.mo74035c();
                        bxvd2.f164950c = false;
                    }
                    abqo abqo2 = (abqo) bxvd2.f164949b;
                    bxvu bxvu = abqo.f57974i;
                    abqo2.f57977a |= 512;
                    abqo2.f57989n = i4;
                }
                bxvd da = abqd.f57943e.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abqd abqd3 = (abqd) da.f164949b;
                abqo abqo3 = (abqo) bxvd2.mo74062i();
                abqo3.getClass();
                abqd3.f57948d = abqo3;
                abqd3.f57945a |= 32;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                abqd abqd4 = (abqd) da.f164949b;
                abqd4.f57945a |= 1;
                abqd4.f57946b = i3;
                bxvd.mo74079l(da);
            } else {
                bxvd bxvd3 = (bxvd) abqd2.mo74142c(5);
                bxvd3.mo73625a((GeneratedMessageLite) abqd2);
                if (bxvd3.f164950c) {
                    bxvd3.mo74035c();
                    bxvd3.f164950c = false;
                }
                abqd abqd5 = (abqd) bxvd3.f164949b;
                abqd5.f57945a |= 1;
                abqd5.f57946b = i3;
                bxvd.mo74079l(bxvd3);
            }
        }
        return (abqe) bxvd.mo74062i();
    }
}
