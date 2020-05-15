package p000;

import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: bbex */
public final /* synthetic */ class bbex implements bqeh {

    /* renamed from: a */
    private final bbfc f102513a;

    /* renamed from: b */
    private final int f102514b;

    public bbex(bbfc bbfc, int i) {
        this.f102513a = bbfc;
        this.f102514b = i;
    }

    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        bbfb bbfb;
        Set set;
        bavd bavd;
        HashMap hashMap;
        long j;
        bqgg bqgg;
        bbfc bbfc = this.f102513a;
        int i = this.f102514b;
        List<Pair> list = (List) obj;
        for (bavd bavd2 : bbfc.f102530a.mo56058c()) {
            bxvd da = bavr.f101916f.mo74144da();
            String str = bavd2.f101873c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bavr bavr = (bavr) da.f164949b;
            str.getClass();
            bavr.f101918a = 1 | bavr.f101918a;
            bavr.f101919b = str;
            if (!bmxx.m108577a(bavd2.f101874d)) {
                String str2 = bavd2.f101874d;
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bavr bavr2 = (bavr) da.f164949b;
                str2.getClass();
                bavr2.f101918a |= 2;
                bavr2.f101920c = str2;
            } else {
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bavr bavr3 = (bavr) da.f164949b;
                "com.google.android.gms".getClass();
                bavr3.f101918a |= 2;
                bavr3.f101920c = "com.google.android.gms";
            }
            list.add(Pair.create((bavr) da.mo74062i(), bavd2));
        }
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        HashSet hashSet = new HashSet();
        AtomicLong atomicLong = new AtomicLong(0);
        ArrayList arrayList = new ArrayList();
        for (Pair pair : list) {
            bavr bavr4 = (bavr) pair.first;
            bavd bavd3 = (bavd) pair.second;
            Set a = bbfc.m87915a(hashMap3, bbfc.m87914a(bavr4));
            String a2 = bbfc.m87914a(bavr4);
            bbfb bbfb2 = (bbfb) hashMap2.get(a2);
            if (bbfb2 == null) {
                hashMap2.put(a2, new bbfb());
                bbfb = (bbfb) hashMap2.get(a2);
            } else {
                bbfb = bbfb2;
            }
            if (bavr4.f101922e) {
                Set a3 = bbfc.m87915a(hashMap4, bbfc.m87914a(bavr4));
                hashMap5.put(bbfc.m87914a(bavr4), Integer.valueOf(bavd3.f101875e));
                set = a3;
            } else {
                set = null;
            }
            bxwc bxwc = bavd3.f101880j;
            int size = bxwc.size();
            int i2 = 0;
            while (i2 < size) {
                bauy bauy = (bauy) bxwc.get(i2);
                HashMap hashMap6 = hashMap3;
                int a4 = bavb.m87594a(bavd3.f101876f);
                if (a4 == 0) {
                    a4 = 1;
                }
                bavt a5 = bbdd.m87829a(bauy, a4);
                try {
                    hashMap = hashMap4;
                    bavd = bavd3;
                    bqgg = bqdx.m112673a(bbfc.f102531b.mo56075b(a5), new bbfa(bbfc), bbfc.f102537h);
                    j = 0;
                } catch (bbdb e) {
                    hashMap = hashMap4;
                    bavd = bavd3;
                    j = 0;
                    bqgg = bqga.m112775a((Object) 0L);
                }
                arrayList.add(bqdx.m112673a(bqgg, new bbey(hashSet, a5, atomicLong, a, bbfb, bavr4, set), bbfc.f102537h));
                i2++;
                size = size;
                arrayList = arrayList;
                hashMap3 = hashMap6;
                hashMap4 = hashMap;
                bavd3 = bavd;
                bavr4 = bavr4;
                i = i;
                bxwc = bxwc;
                atomicLong = atomicLong;
            }
            i = i;
        }
        return bqga.m112782b(arrayList).mo69216a(new bbez(bbfc, hashMap2, hashMap5, atomicLong, i), bbfc.f102537h);
    }
}
