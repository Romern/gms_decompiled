package p000;

import android.text.TextUtils;
import java.util.TimeZone;

/* renamed from: tli */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class tli implements tkp {

    /* renamed from: a */
    public static final TimeZone f46239a = TimeZone.getTimeZone("UTC");

    /* renamed from: b */
    public final bxex f46240b;

    public tli(bxex bxex) {
        sdo.m34959a(bxex);
        this.f46240b = bxex;
    }

    /* renamed from: a */
    public static bxex m37157a(bxew bxew, TimeZone timeZone, long j, long j2) {
        bxvd da = bxex.f163147g.mo74144da();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bxex bxex = (bxex) da.f164949b;
        bxex.f163150b = bxew.f163146n;
        bxex.f163149a |= 1;
        if (timeZone == null || TextUtils.isEmpty(timeZone.getID())) {
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxex bxex2 = (bxex) da.f164949b;
            bxex2.f163149a |= 32;
            bxex2.f163154f = true;
        } else {
            String id = timeZone.getID();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bxex bxex3 = (bxex) da.f164949b;
            id.getClass();
            int i = bxex3.f163149a | 2;
            bxex3.f163149a = i;
            bxex3.f163151c = id;
            bxex3.f163149a = i | 32;
            bxex3.f163154f = false;
        }
        bxex bxex4 = (bxex) da.f164949b;
        int i2 = bxex4.f163149a | 4;
        bxex4.f163149a = i2;
        bxex4.f163152d = j;
        bxex4.f163149a = i2 | 8;
        bxex4.f163153e = j2;
        return (bxex) da.mo74062i();
    }

    /* renamed from: a */
    public final int mo18031a() {
        return !this.f46240b.f163154f ? -1 : 45;
    }

    /* renamed from: a */
    public static tli m37158a(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        bxew bxew;
        boolean z5 = true;
        sdo.m34974b(true);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34974b(z);
        if (j <= 86400000) {
            z2 = true;
        } else {
            z2 = false;
        }
        sdo.m34974b(z2);
        if (j2 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        sdo.m34974b(z3);
        if (j2 <= 86400000) {
            z4 = true;
        } else {
            z4 = false;
        }
        sdo.m34974b(z4);
        if (j > j2) {
            z5 = false;
        }
        sdo.m34974b(z5);
        bxew a = bxew.m122643a(2);
        if (a != null) {
            bxew = a;
        } else {
            bxew = bxew.UNKNOWN_TIME_FENCE_TRIGGER_TYPE;
        }
        return new tli(m37157a(bxew, null, j, j2));
    }
}
