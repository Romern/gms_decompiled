package p000;

import java.util.ArrayList;

/* renamed from: bahs */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bahs extends cazu {

    /* renamed from: b */
    private final cazn f100904b;

    public bahs(cijl cijl, cijl cijl2, cazn cazn) {
        super(cijl2, cbag.m127657a(bahs.class), cijl);
        this.f100904b = cbac.m127643a(cazn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final bqgg mo14448a() {
        return this.f100904b.mo75201b();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ bqgg mo14449b(Object obj) {
        ArrayList arrayList = new ArrayList();
        bngx bngx = ((bamm) obj).f101270a;
        int size = bngx.size();
        int i = 0;
        while (i < size) {
            byhy byhy = (byhy) bngx.get(i);
            bxvd da = byhi.f166451f.mo74144da();
            bxtx bxtx = byhy.f166532c;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            byhi byhi = (byhi) da.f164949b;
            bxtx.getClass();
            int i2 = byhi.f166453a | 4;
            byhi.f166453a = i2;
            byhi.f166456d = bxtx;
            long j = byhy.f166533d;
            byhi.f166453a = i2 | 1;
            byhi.f166454b = j;
            bxvd da2 = bygu.f166382e.mo74144da();
            byhx a = byhx.m124831a(byhy.f166531b);
            if (a == null) {
                a = byhx.UNKNOWN;
            }
            if (a.ordinal() == 1) {
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bygu bygu = (bygu) da2.f164949b;
                bygu.f166387d = 4;
                bygu.f166384a = 1 | bygu.f166384a;
                byhi byhi2 = (byhi) da.mo74062i();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bygu bygu2 = (bygu) da2.f164949b;
                byhi2.getClass();
                bygu2.f166386c = byhi2;
                bygu2.f166385b = 4;
                arrayList.add((bygu) da2.mo74062i());
                i++;
            } else {
                String valueOf = String.valueOf(a);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Don't know what local Footprints change type ");
                sb.append(valueOf);
                sb.append(" means");
                throw new UnsupportedOperationException(sb.toString());
            }
        }
        return bqga.m112775a((Object) arrayList);
    }
}
