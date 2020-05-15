package p000;

import android.content.Context;
import android.os.Process;

/* renamed from: bdjc */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bdjc {
    /* renamed from: a */
    public static cioa m90894a(String str, Context context) {
        bxvd da = cioa.f191029f.mo74144da();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioa cioa = (cioa) da.f164949b;
        cioa.f191031a |= 1;
        cioa.f191032b = elapsedCpuTime;
        boolean b = bdjb.m90891b(context);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioa cioa2 = (cioa) da.f164949b;
        cioa2.f191031a |= 2;
        cioa2.f191033c = b;
        int activeCount = Thread.activeCount();
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        cioa cioa3 = (cioa) da.f164949b;
        int i = cioa3.f191031a | 4;
        cioa3.f191031a = i;
        cioa3.f191034d = activeCount;
        if (str != null) {
            str.getClass();
            cioa3.f191031a = i | 8;
            cioa3.f191035e = str;
        }
        return (cioa) da.mo74062i();
    }
}
