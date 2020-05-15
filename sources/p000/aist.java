package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.IceCandidate;

/* renamed from: aist */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aist {
    /* renamed from: a */
    public static bvgr m57870a(aiss aiss) {
        bxvd da = bvgr.f156035c.mo74144da();
        String str = aiss.f69653a;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvgr bvgr = (bvgr) da.f164949b;
        str.getClass();
        bvgr.f156037a |= 1;
        bvgr.f156038b = str;
        return (bvgr) da.mo74062i();
    }

    /* renamed from: a */
    public static bvgv m57871a(aiss aiss, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IceCandidate iceCandidate = (IceCandidate) it.next();
            bxvd da = bvgo.f156022e.mo74144da();
            String str = iceCandidate.f191827c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvgo bvgo = (bvgo) da.f164949b;
            str.getClass();
            int i = bvgo.f156024a | 1;
            bvgo.f156024a = i;
            bvgo.f156025b = str;
            String str2 = iceCandidate.f191825a;
            str2.getClass();
            int i2 = i | 2;
            bvgo.f156024a = i2;
            bvgo.f156026c = str2;
            int i3 = iceCandidate.f191826b;
            bvgo.f156024a = i2 | 4;
            bvgo.f156027d = i3;
            arrayList.add((bvgo) da.mo74062i());
        }
        bxvd da2 = bvgv.f156046f.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgv bvgv = (bvgv) da2.f164949b;
        bvgv.f156052e = 3;
        bvgv.f156048a |= 2;
        bvgr a = m57870a(aiss);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgv bvgv2 = (bvgv) da2.f164949b;
        a.getClass();
        bvgv2.f156051d = a;
        bvgv2.f156048a |= 1;
        bxvd da3 = bvgp.f156028b.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        bvgp bvgp = (bvgp) da3.f164949b;
        if (!bvgp.f156030a.mo73666a()) {
            bvgp.f156030a = GeneratedMessageLite.m124021a(bvgp.f156030a);
        }
        bxsy.m123078a(arrayList, bvgp.f156030a);
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvgv bvgv3 = (bvgv) da2.f164949b;
        bvgp bvgp2 = (bvgp) da3.mo74062i();
        bvgp2.getClass();
        bvgv3.f156050c = bvgp2;
        bvgv3.f156049b = 5;
        return (bvgv) da2.mo74062i();
    }
}
