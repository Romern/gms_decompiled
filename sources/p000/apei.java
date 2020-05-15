package p000;

import com.google.android.gms.romanesco.protomodel.SourceStats;
import java.util.ArrayList;

/* renamed from: apei */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class apei {

    /* renamed from: a */
    public final String f84218a;

    /* renamed from: b */
    public Long f84219b;

    /* renamed from: c */
    public final String f84220c;

    /* renamed from: d */
    public long f84221d;

    /* renamed from: e */
    public long f84222e;

    /* renamed from: f */
    public int f84223f;

    /* renamed from: g */
    public int f84224g;

    /* renamed from: h */
    public int f84225h;

    /* renamed from: i */
    public final ArrayList f84226i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f84227j = new ArrayList();

    /* renamed from: k */
    public ltn f84228k;

    public apei(String str, String str2) {
        this.f84218a = str;
        this.f84220c = str2;
    }

    /* renamed from: a */
    public final apej mo47135a() {
        return new apej(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47136a(SourceStats sourceStats) {
        if ("com.google".equals(sourceStats.mo58831a())) {
            this.f84223f += sourceStats.mo58832b().intValue();
            return;
        }
        String a = sourceStats.mo58831a();
        if (a == null || !a.matches(".*sim.*|.*SIM.*")) {
            this.f84226i.add(sourceStats.mo58831a());
            this.f84224g += sourceStats.mo58832b().intValue();
            return;
        }
        this.f84227j.add(sourceStats.mo58831a());
        this.f84225h += sourceStats.mo58832b().intValue();
    }
}
