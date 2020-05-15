package p000;

import com.google.android.gms.location.LocationAvailability;

/* renamed from: bgzq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bgzq {
    /* renamed from: a */
    public static int m100483a(int i) {
        int a = bvwo.m121540a(i);
        if (a == 0) {
            return 100;
        }
        return a;
    }

    /* renamed from: b */
    public static bvwq m100486b(boolean z, long j) {
        bxvd da = bvwd.f157910e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvwd bvwd = (bvwd) da.f164949b;
        bvwd.f157912a |= 2;
        bvwd.f157914c = z;
        bvwd bvwd2 = (bvwd) da.mo74062i();
        bxvd da2 = bvwq.f157983r.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvwq bvwq = (bvwq) da2.f164949b;
        bvwd2.getClass();
        bvwq.f157996l = bvwd2;
        int i = bvwq.f157985a | 512;
        bvwq.f157985a = i;
        bvwq.f157985a = i | 1;
        bvwq.f157986b = j;
        return (bvwq) da2.mo74062i();
    }

    /* renamed from: a */
    public static bvwp m100484a(LocationAvailability locationAvailability) {
        bxvd da = bvwp.f157977e.mo74144da();
        int a = m100483a(locationAvailability.f79345b);
        int a2 = m100483a(locationAvailability.f79344a);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvwp bvwp = (bvwp) da.f164949b;
        int i = a - 1;
        if (a != 0) {
            bvwp.f157981c = i;
            int i2 = bvwp.f157979a | 2;
            bvwp.f157979a = i2;
            int i3 = a2 - 1;
            if (a2 != 0) {
                bvwp.f157980b = i3;
                int i4 = i2 | 1;
                bvwp.f157979a = i4;
                bvwp.f157979a = i4 | 4;
                bvwp.f157982d = false;
                return (bvwp) da.mo74062i();
            }
            throw null;
        }
        throw null;
    }

    /* renamed from: a */
    public static bvwq m100485a(boolean z, long j) {
        bxvd da = bvwd.f157910e.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bvwd bvwd = (bvwd) da.f164949b;
        bvwd.f157912a |= 1;
        bvwd.f157913b = z;
        bvwd bvwd2 = (bvwd) da.mo74062i();
        bxvd da2 = bvwq.f157983r.mo74144da();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        bvwq bvwq = (bvwq) da2.f164949b;
        bvwd2.getClass();
        bvwq.f157996l = bvwd2;
        int i = bvwq.f157985a | 512;
        bvwq.f157985a = i;
        bvwq.f157985a = i | 1;
        bvwq.f157986b = j;
        return (bvwq) da2.mo74062i();
    }
}
