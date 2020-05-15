package p000;

import java.util.ArrayList;

/* renamed from: bazz */
final /* synthetic */ class bazz implements bqeh {

    /* renamed from: a */
    private final bbav f102187a;

    /* renamed from: b */
    private final bavn f102188b;

    /* renamed from: c */
    private final bavd f102189c;

    /* renamed from: d */
    private final bavr f102190d;

    public bazz(bbav bbav, bavn bavn, bavd bavd, bavr bavr) {
        this.f102187a = bbav;
        this.f102188b = bavn;
        this.f102189c = bavd;
        this.f102190d = bavr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bavn bavn;
        int size;
        int i;
        int i2;
        bxwc bxwc;
        int i3;
        bqgg bqgg;
        bavt bavt;
        bbcr bbcr;
        bbav bbav = this.f102187a;
        bavn bavn2 = this.f102188b;
        bavd bavd = this.f102189c;
        bavr bavr = this.f102190d;
        Void voidR = (Void) obj;
        if (bavn2 == null) {
            bavn bavn3 = bavd.f101879i;
            if (bavn3 != null) {
                bavn = bavn3;
                ArrayList arrayList = new ArrayList();
                bxwc bxwc2 = bavd.f101880j;
                size = bxwc2.size();
                i = 0;
                while (i < size) {
                    bauy bauy = (bauy) bxwc2.get(i);
                    int a = bavb.m87594a(bavd.f101876f);
                    if (a == 0) {
                        a = 1;
                    }
                    bavt a2 = bbdd.m87829a(bauy, a);
                    try {
                        bbda bbda = bbav.f102248e;
                        int i4 = bavd.f101881k;
                        bxwc bxwc3 = bavd.f101882l;
                        bbcr bbcr2 = bbcr;
                        bqgg a3 = bbda.f102393c.mo56079a(a2);
                        bxwc = bxwc2;
                        bavt = a2;
                        i2 = i;
                        i3 = size;
                        try {
                            bbcr = new bbcr(bbda, a2, bavr, bauy, bavn, i4, bxwc3);
                            bqgg = bqdx.m112674a(a3, bbcr2, bbda.f102401k);
                        } catch (bbdb e) {
                            e = e;
                            bbev.m87906a("%s: Shared file not found, newFileKey = %s", "FileGroupManager", bavt);
                            bbav.f102246c.mo55999a("Shared file not found in downloadFileGroup", e);
                            bauo a4 = bauq.m87573a();
                            a4.f101791a = baup.SHARED_FILE_NOT_FOUND_ERROR;
                            a4.f101793c = e;
                            bqgg = bqga.m112777a((Throwable) a4.mo55987a());
                            arrayList.add(bqgg);
                            i = i2 + 1;
                            size = i3;
                            bxwc2 = bxwc;
                        }
                    } catch (bbdb e2) {
                        e = e2;
                        i2 = i;
                        i3 = size;
                        bxwc = bxwc2;
                        bavt = a2;
                        bbev.m87906a("%s: Shared file not found, newFileKey = %s", "FileGroupManager", bavt);
                        bbav.f102246c.mo55999a("Shared file not found in downloadFileGroup", e);
                        bauo a42 = bauq.m87573a();
                        a42.f101791a = baup.SHARED_FILE_NOT_FOUND_ERROR;
                        a42.f101793c = e;
                        bqgg = bqga.m112777a((Throwable) a42.mo55987a());
                        arrayList.add(bqgg);
                        i = i2 + 1;
                        size = i3;
                        bxwc2 = bxwc;
                    }
                    arrayList.add(bqgg);
                    i = i2 + 1;
                    size = i3;
                    bxwc2 = bxwc;
                }
                return bqga.m112782b(arrayList).mo69214a(new bbab(bbav, bavr, bavd, arrayList), bbav.f102251h);
            }
            bavn2 = bavn.f101895f;
        }
        bavn = bavn2;
        ArrayList arrayList2 = new ArrayList();
        bxwc bxwc22 = bavd.f101880j;
        size = bxwc22.size();
        i = 0;
        while (i < size) {
        }
        return bqga.m112782b(arrayList2).mo69214a(new bbab(bbav, bavr, bavd, arrayList2), bbav.f102251h);
    }
}
