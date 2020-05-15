package p000;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

/* renamed from: aluq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aluq implements alub {

    /* renamed from: a */
    private final String f74321a;

    public aluq(String str) {
        this.f74321a = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ alua mo40783a(rkb rkb) {
        aney a = anef.m64089a(((rmx) rkb).f43323c);
        try {
            ArrayList arrayList = new ArrayList();
            for (Configuration configuration : ((Configurations) aucu.m76782a(a.mo41766p(this.f74321a))).f82077d) {
                Flag[] flagArr = configuration.f82071b;
                for (Flag flag : flagArr) {
                    String str = flag.f82099a;
                    String f = flag.mo46505f();
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(f).length());
                    sb.append(str);
                    sb.append("=");
                    sb.append(f);
                    arrayList.add(sb.toString());
                }
            }
            return new alup(mo40784a(), arrayList);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public final void mo40785b() {
    }

    /* renamed from: a */
    public final String mo40784a() {
        String str = this.f74321a;
        return str.length() == 0 ? new String("phenotype_") : "phenotype_".concat(str);
    }
}
