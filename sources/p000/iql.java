package p000;

import android.content.Context;
import java.io.IOException;

/* renamed from: iql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class iql {

    /* renamed from: a */
    private final Context f21569a;

    public iql(Context context) {
        this.f21569a = context;
    }

    /* renamed from: a */
    public final bqli mo13262a(String str, bqlr bqlr) {
        try {
            addi a = addi.m50206a(this.f21569a);
            String a2 = a.mo33343a(ccfa.f178850a.mo6606a().mo75845c(), "GCM");
            String b = a.mo33346b();
            bxvd da = bqli.f141098e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqli bqli = (bqli) da.f164949b;
            str.getClass();
            bqli.f141100a = str;
            b.getClass();
            bqli.f141102c = b;
            a2.getClass();
            bqli.f141103d = a2;
            bqlr.getClass();
            bqli.f141101b = bqlr;
            return (bqli) da.mo74062i();
        } catch (IOException e) {
            throw new iqr("Couldn't generate request context", e);
        }
    }
}
