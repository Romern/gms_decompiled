package p000;

import com.google.android.gms.location.ActivityTransition;
import java.util.Map;

/* renamed from: bgld */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgld {
    /* renamed from: a */
    public static bubt m99230a(int i, Map map) {
        bxvd da = bubt.f153275g.mo74144da();
        bubs bubs = bubs.ENABLE;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bubt bubt = (bubt) da.f164949b;
        bubt.f153278b = bubs.f153274g;
        int i2 = bubt.f153277a | 1;
        bubt.f153277a = i2;
        bubt.f153277a = i2 | 2;
        bubt.f153279c = i;
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                buce a = bglg.m99238a(((ActivityTransition) entry.getKey()).f79305a);
                bucs bucs = (bucs) bglg.f116758a.get(Integer.valueOf(((ActivityTransition) entry.getKey()).f79306b));
                if (a != null) {
                    bxvd da2 = bucb.f153316e.mo74144da();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bucb bucb = (bucb) da2.f164949b;
                    bucb.f153319b = a.f153340k;
                    int i3 = bucb.f153318a | 1;
                    bucb.f153318a = i3;
                    bucb.f153320c = bucs.f153408d;
                    bucb.f153318a = i3 | 2;
                    int intValue = ((Integer) entry.getValue()).intValue();
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    bucb bucb2 = (bucb) da2.f164949b;
                    bucb2.f153318a |= 4;
                    bucb2.f153321d = intValue;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bubt bubt2 = (bubt) da.f164949b;
                    bucb bucb3 = (bucb) da2.mo74062i();
                    bucb3.getClass();
                    if (!bubt2.f153280d.mo73666a()) {
                        bubt2.f153280d = GeneratedMessageLite.m124021a(bubt2.f153280d);
                    }
                    bubt2.f153280d.add(bucb3);
                }
            }
        }
        return (bubt) da.mo74062i();
    }

    /* renamed from: a */
    public static bubt m99231a(bubs bubs) {
        bxvd da = bubt.f153275g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bubt bubt = (bubt) da.f164949b;
        bubt.f153278b = bubs.f153274g;
        bubt.f153277a |= 1;
        return (bubt) da.mo74062i();
    }
}
