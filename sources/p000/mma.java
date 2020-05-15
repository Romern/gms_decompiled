package p000;

import com.felicanetworks.sdu.ErrorInfo;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: mma */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class mma implements mmh {

    /* renamed from: a */
    public bnhe f33986a;

    /* renamed from: b */
    private final mis f33987b;

    public mma(mis mis) {
        bmxy.m108581a(mis);
        this.f33987b = mis;
    }

    /* renamed from: a */
    public final InputStream mo20162a(mph mph) {
        mov mov;
        String str = mph.f34146d;
        if (mph.f34144b == 103) {
            mov = (mov) mph.f34145c;
        } else {
            mov = mov.f34076c;
        }
        mir a = mir.m25185a(str, mov.f34079b);
        bnhe bnhe = this.f33986a;
        if (bnhe == null || !bnhe.containsKey(a)) {
            return new mmt(new mly(a));
        }
        return new mmt(new mlz(this, a));
    }

    /* renamed from: a */
    public final List mo20163a() {
        if (this.f33987b.mo20079a().isEmpty()) {
            return bngx.m109376e();
        }
        bnhe a = this.f33987b.mo20079a();
        this.f33986a = a;
        bnic j = a.keySet();
        ArrayList arrayList = new ArrayList();
        bnrd a2 = j.iterator();
        while (a2.hasNext()) {
            mir mir = (mir) a2.next();
            String a3 = mir.mo20069a();
            String b = mir.mo20070b();
            long length = new File((String) this.f33986a.get(mir)).length();
            bxvd da = mph.f34141f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph = (mph) da.f164949b;
            a3.getClass();
            mph.f34143a |= 1;
            mph.f34146d = a3;
            bxvd da2 = mov.f34076c.mo74144da();
            if (da2.f164950c) {
                da2.mo74035c();
                da2.f164950c = false;
            }
            mov mov = (mov) da2.f164949b;
            b.getClass();
            mov.f34078a |= 1;
            mov.f34079b = b;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph2 = (mph) da.f164949b;
            mov mov2 = (mov) da2.mo74062i();
            mov2.getClass();
            mph2.f34145c = mov2;
            mph2.f34144b = ErrorInfo.TYPE_SDU_COMMUNICATIONERROR;
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            mph mph3 = (mph) da.f164949b;
            mph3.f34143a |= 2;
            mph3.f34147e = length;
            arrayList.add((mph) da.mo74062i());
        }
        return bngx.m109368a((Collection) arrayList);
    }

    /* renamed from: a */
    public final void mo20164a(mph mph, InputStream inputStream) {
        srz.m36171a((Closeable) inputStream);
    }
}
