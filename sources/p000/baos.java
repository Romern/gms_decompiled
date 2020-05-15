package p000;

import android.os.SystemClock;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: baos */
final /* synthetic */ class baos implements bqeh {

    /* renamed from: a */
    private final baot f101421a;

    /* renamed from: b */
    private final List f101422b;

    public baos(baot baot, List list) {
        this.f101421a = baot;
        this.f101422b = list;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        String str;
        baot baot = this.f101421a;
        List<baog> list = this.f101422b;
        HashMap hashMap = new HashMap();
        bxwc bxwc = ((bygw) obj).f166400a;
        int size = bxwc.size();
        for (int i = 0; i < size; i++) {
            bygv bygv = (bygv) bxwc.get(i);
            bygz bygz = bygv.f166392c;
            if (bygz == null) {
                bygz = bygz.f166410c;
            }
            HashMap hashMap2 = new HashMap();
            bxwc bxwc2 = bygv.f166393d;
            int size2 = bxwc2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                bygq bygq = (bygq) bxwc2.get(i2);
                String str2 = "";
                if (bygq.f166369a != 1) {
                    str = str2;
                } else {
                    str = (String) bygq.f166370b;
                }
                int i3 = bygq.f166373e;
                if (hashMap2.containsKey(str) && !((Integer) hashMap2.get(str)).equals(Integer.valueOf(i3))) {
                    baot.f101424b.mo32744a(10019, baqz.m87422a(bygz));
                }
                if (bygq.f166369a == 1) {
                    str2 = (String) bygq.f166370b;
                }
                hashMap2.put(str2, Integer.valueOf(bygq.f166373e));
            }
            hashMap.put(bygz, bnhe.m109413a(hashMap2));
        }
        bnhe a = bnhe.m109413a(hashMap);
        try {
            for (baog baog : list) {
                if (a.containsKey(baog.mo55816c())) {
                    Map map = (Map) a.get(baog.mo55816c());
                    if (map.containsKey(baog.mo55814a())) {
                        int intValue = ((Integer) map.get(baog.mo55814a())).intValue();
                        try {
                            if (baog.mo55821g() == ((Integer) baot.f101427e.mo32621a()).intValue()) {
                                if (baog.mo55820f() != -1 && SystemClock.elapsedRealtime() - baog.mo55820f() <= TimeUnit.DAYS.toMillis((long) intValue)) {
                                }
                            }
                        } catch (IOException e) {
                            ((acdc) baot.f101428f.mo16713a()).mo32707a("Failed to retrieve boot count", e);
                        }
                        if (baog.mo55822h() != -1 && System.currentTimeMillis() - baog.mo55822h() <= TimeUnit.DAYS.toMillis((long) intValue)) {
                        }
                    }
                }
                baot.f101425c.mo55829a(baog.mo55814a(), baog.mo55815b(), baog.mo55816c(), baoi.SUBSCRIPTION_CLEANUP);
            }
            return bqga.m112775a((Object) null);
        } catch (baoh e2) {
            ((achw) baot.f101423a.mo16713a()).mo25417e("Failed to delete subscription.", e2, new Object[0]);
            throw e2;
        }
    }
}
