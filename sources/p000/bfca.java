package p000;

import java.io.IOException;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: bfca */
final /* synthetic */ class bfca implements bmxj {

    /* renamed from: a */
    private final Map f113358a;

    public bfca(Map map) {
        this.f113358a = map;
    }

    public final Object apply(Object obj) {
        bupj bupj;
        bupi bupi;
        GZIPInputStream gZIPInputStream;
        Map map = this.f113358a;
        bupy bupy = (bupy) obj;
        bupw bupw = bupy.f154692a;
        if (bupw == null) {
            bupw = bupw.f154682d;
        }
        if (bupw.f154684a == 5) {
            bupj = (bupj) bupw.f154685b;
        } else {
            bupj = bupj.f154644b;
        }
        bezl bezl = (bezl) map.get(bupj.f154646a);
        bupv bupv = bupy.f154693b;
        if (bupv == null) {
            bupv = bupv.f154678c;
        }
        if (bupv.f154680a == 4) {
            bupi = (bupi) bupv.f154681b;
        } else {
            bupi = bupi.f154641b;
        }
        try {
            gZIPInputStream = new GZIPInputStream(bupi.f154643a.mo73763g());
            bznt bznt = (bznt) ((bxxk) bznt.f170757f.mo74142c(7)).mo73656a(gZIPInputStream);
            gZIPInputStream.close();
            int i = bezl.f113157c;
            if (!new bxvv(bznt.f170761c, bznt.f170756d).contains(bznr.CLUTTER_UNKNOWN)) {
                int i2 = i * i;
                if (bznt.f170759a.size() == i2 && bznt.f170761c.size() == i2) {
                    return new bfce(bezl, bznt);
                }
                throw new bfbq("Dense arrays dimension does not match rows * cols.");
            }
            throw new bfbq("CLUTTER_UNKNOWN is not allowed.");
        } catch (IOException e) {
            throw new bfbq("Issue parsing Bluesky data.", e);
        } catch (Throwable th) {
            bqye.m113761a(th, th);
        }
        throw th;
    }
}
