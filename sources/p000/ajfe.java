package p000;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: ajfe */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ajfe {

    /* renamed from: a */
    static final Map f70512a = Collections.emptyMap();

    /* renamed from: b */
    private final String f70513b;

    /* renamed from: c */
    private final aiwq f70514c;

    /* renamed from: d */
    private volatile long f70515d = 0;

    /* renamed from: e */
    private bvhk f70516e;

    public ajfe(Context context, String str) {
        this.f70513b = str;
        this.f70514c = (aiwq) ahgz.m55754a(context, aiwq.class);
    }

    /* renamed from: a */
    private static List m58634a(Map map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bxvd da = bvhj.f156075d.mo74144da();
            String str = (String) entry.getKey();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhj bvhj = (bvhj) da.f164949b;
            str.getClass();
            bvhj.f156077a |= 1;
            bvhj.f156078b = str;
            String str2 = (String) entry.getValue();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhj bvhj2 = (bvhj) da.f164949b;
            str2.getClass();
            bvhj2.f156077a |= 2;
            bvhj2.f156079c = str2;
            arrayList.add((bvhj) da.mo74062i());
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo38570a(bxxc bxxc, int i, Map map) {
        SystemClock.elapsedRealtime();
        srn srn = ahfq.f67120a;
        if (this.f70514c.mo38176b() && this.f70516e != null) {
            bxvd da = bvhm.f156093f.mo74144da();
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhm bvhm = (bvhm) da.f164949b;
            int i2 = bvhm.f156095a | 1;
            bvhm.f156095a = i2;
            bvhm.f156096b = currentTimeMillis;
            bvhm.f156095a = i2 | 2;
            bvhm.f156097c = i;
            List a = m58634a(map);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhm bvhm2 = (bvhm) da.f164949b;
            if (!bvhm2.f156098d.mo73666a()) {
                bvhm2.f156098d = GeneratedMessageLite.m124021a(bvhm2.f156098d);
            }
            bxsy.m123078a(a, bvhm2.f156098d);
            if (bxxc != null) {
                ByteString aL = bxxc.mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvhm bvhm3 = (bvhm) da.f164949b;
                aL.getClass();
                bvhm3.f156095a |= 4;
                bvhm3.f156099e = aL;
            }
            aiwq aiwq = this.f70514c;
            bvhk bvhk = this.f70516e;
            bxvd bxvd = (bxvd) bvhk.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) bvhk);
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            bvhk bvhk2 = (bvhk) bxvd.f164949b;
            bvhm bvhm4 = (bvhm) da.mo74062i();
            bvhk bvhk3 = bvhk.f156080d;
            bvhm4.getClass();
            bvhk2.f156084c = bvhm4;
            bvhk2.f156082a |= 2;
            aiwq.mo38173a((bvhk) bxvd.mo74062i());
        }
    }

    /* renamed from: a */
    public final void mo38571a(String str, bxxc bxxc, Map map) {
        this.f70515d = SystemClock.elapsedRealtime();
        if (this.f70514c.mo38176b()) {
            bxvd da = bvhl.f156085g.mo74144da();
            long currentTimeMillis = System.currentTimeMillis();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhl bvhl = (bvhl) da.f164949b;
            int i = bvhl.f156087a | 1;
            bvhl.f156087a = i;
            bvhl.f156088b = currentTimeMillis;
            String str2 = this.f70513b;
            str2.getClass();
            bvhl.f156087a = i | 4;
            bvhl.f156090d = str2;
            List a = m58634a(map);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bvhl bvhl2 = (bvhl) da.f164949b;
            if (!bvhl2.f156091e.mo73666a()) {
                bvhl2.f156091e = GeneratedMessageLite.m124021a(bvhl2.f156091e);
            }
            bxsy.m123078a(a, bvhl2.f156091e);
            if (str != null) {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvhl bvhl3 = (bvhl) da.f164949b;
                str.getClass();
                bvhl3.f156087a |= 2;
                bvhl3.f156089c = str;
            }
            if (bxxc != null) {
                ByteString aL = bxxc.mo73639aL();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bvhl bvhl4 = (bvhl) da.f164949b;
                aL.getClass();
                bvhl4.f156087a |= 16;
                bvhl4.f156092f = aL;
            }
            bxvd da2 = bvhk.f156080d.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            bvhk bvhk = (bvhk) da2.f164949b;
            bvhl bvhl5 = (bvhl) da.mo74062i();
            bvhl5.getClass();
            bvhk.f156083b = bvhl5;
            bvhk.f156082a |= 1;
            this.f70516e = (bvhk) da2.mo74062i();
        }
    }
}
