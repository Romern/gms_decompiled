package p000;

import android.content.SharedPreferences;
import java.util.ArrayList;

/* renamed from: qgl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgl {

    /* renamed from: a */
    private final qws f41188a;

    /* renamed from: b */
    private final SharedPreferences f41189b;

    public qgl(qws qws, SharedPreferences sharedPreferences) {
        this.f41188a = qws;
        this.f41189b = sharedPreferences;
    }

    /* renamed from: a */
    public final void mo24043a(qhk qhk) {
        long j;
        ArrayList arrayList = new ArrayList();
        arrayList.add(qhk);
        bxvd da = qcv.f40941d.mo74144da();
        bxvd da2 = qdo.f40992c.mo74144da();
        String string = this.f41189b.getString("CheckinService_deviceDataVersionInfo", "");
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        qdo qdo = (qdo) da2.f164949b;
        string.getClass();
        qdo.f40994a |= 1;
        qdo.f40995b = string;
        qdo qdo2 = (qdo) da2.mo74062i();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        qcv qcv = (qcv) da.f164949b;
        qdo2.getClass();
        qcv.f40944b = qdo2;
        qcv.f40943a |= 1;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qhk qhk2 = (qhk) arrayList.get(i);
            bxvd da3 = bpsu.f139013e.mo74144da();
            String b = bmxx.m108578b(qhk2.f41365b);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpsu bpsu = (bpsu) da3.f164949b;
            b.getClass();
            int i2 = bpsu.f139015a | 1;
            bpsu.f139015a = i2;
            bpsu.f139016b = b;
            if ((qhk2.f41364a & 4) != 0) {
                j = qhk2.f41367d;
            } else {
                j = 0;
            }
            bpsu.f139015a = i2 | 4;
            bpsu.f139018d = j;
            String b2 = bmxx.m108578b(qhk2.f41366c);
            if (da3.f164950c) {
                da3.mo74035c();
                da3.f164950c = false;
            }
            bpsu bpsu2 = (bpsu) da3.f164949b;
            b2.getClass();
            bpsu2.f139015a |= 2;
            bpsu2.f139017c = b2;
            bpsu bpsu3 = (bpsu) da3.mo74062i();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            qcv qcv2 = (qcv) da.f164949b;
            bpsu3.getClass();
            if (!qcv2.f40945c.mo73666a()) {
                qcv2.f40945c = bxvk.m124021a(qcv2.f40945c);
            }
            qcv2.f40945c.add(bpsu3);
        }
        this.f41188a.mo24333a((qcv) da.mo74062i()).mo24327b();
    }
}
