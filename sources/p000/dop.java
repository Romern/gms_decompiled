package p000;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;

/* renamed from: dop */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class dop {
    /* renamed from: a */
    public static bxfy m8958a(int i, bxfw bxfw, String str) {
        bxvd da = bxfy.f163211d.mo74144da();
        bxvd da2 = bxhw.f163474d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxhw bxhw = (bxhw) da2.f164949b;
        bxhw.f163477b = i - 1;
        bxhw.f163476a |= 1;
        if (!TextUtils.isEmpty(str)) {
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bxhw bxhw2 = (bxhw) da2.f164949b;
            str.getClass();
            bxhw2.f163476a |= 2;
            bxhw2.f163478c = str;
        }
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxfy bxfy = (bxfy) da.f164949b;
        bxhw bxhw3 = (bxhw) da2.mo74062i();
        bxhw3.getClass();
        bxfy.f163214b = bxhw3;
        bxfy.f163213a |= 1;
        bxvd da3 = bxfu.f163194c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxfu bxfu = (bxfu) da3.f164949b;
        bxfu.f163197b = bxfw.f163209j;
        bxfu.f163196a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxfy bxfy2 = (bxfy) da.f164949b;
        bxfu bxfu2 = (bxfu) da3.mo74062i();
        bxfu2.getClass();
        bxfy2.f163215c = bxfu2;
        bxfy2.f163213a |= 2;
        return (bxfy) da.mo74062i();
    }

    /* renamed from: a */
    public static bxhp m8959a(bxco bxco, bxjq bxjq, bxfy... bxfyArr) {
        bxvd da = bxhp.f163445f.mo74144da();
        bxvd da2 = bxhr.f163456d.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bxhr bxhr = (bxhr) da2.f164949b;
        bxhr.f163460c = bxco.f162973bD;
        bxhr.f163458a |= 2;
        bxhr bxhr2 = (bxhr) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhp bxhp = (bxhp) da.f164949b;
        bxhr2.getClass();
        bxhp.f163448b = bxhr2;
        bxhp.f163447a |= 1;
        List asList = Arrays.asList(bxfyArr);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhp bxhp2 = (bxhp) da.f164949b;
        if (!bxhp2.f163449c.mo73666a()) {
            bxhp2.f163449c = GeneratedMessageLite.m124021a(bxhp2.f163449c);
        }
        bxsy.m123078a(asList, bxhp2.f163449c);
        bxvd da3 = bxjo.f163657c.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bxjo bxjo = (bxjo) da3.f164949b;
        bxjo.f163660b = bxjq.f163668f;
        bxjo.f163659a |= 1;
        bxjo bxjo2 = (bxjo) da3.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxhp bxhp3 = (bxhp) da.f164949b;
        bxjo2.getClass();
        bxhp3.f163450d = bxjo2;
        bxhp3.f163447a |= 2;
        return (bxhp) da.mo74062i();
    }
}
