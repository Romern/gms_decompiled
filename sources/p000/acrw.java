package p000;

import com.google.android.gms.phenotype.Configuration;
import com.google.android.gms.phenotype.Configurations;
import com.google.android.gms.phenotype.Flag;

/* renamed from: acrw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acrw implements aubq {

    /* renamed from: a */
    final /* synthetic */ String f60646a;

    /* renamed from: b */
    final /* synthetic */ String f60647b;

    /* renamed from: c */
    final /* synthetic */ bqgy f60648c;

    public acrw(String str, String str2, bqgy bqgy) {
        this.f60646a = str;
        this.f60647b = str2;
        this.f60648c = bqgy;
    }

    /* renamed from: a */
    public final void mo6378a(aucb aucb) {
        if (!aucb.mo50384b()) {
            Object[] objArr = {this.f60646a, this.f60647b, aucb.mo50387e()};
            this.f60648c.mo69138b((Object) false);
            return;
        }
        for (Configuration configuration : ((Configurations) aucb.mo50386d()).f82078e.values()) {
            Flag[] flagArr = configuration.f82071b;
            int length = flagArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    Flag flag = flagArr[i];
                    if (flag.f82099a.equals("SherlogAndroid__sherlog_android_optin")) {
                        Boolean valueOf = Boolean.valueOf(flag.mo46499b());
                        Object[] objArr2 = {this.f60646a, this.f60647b, valueOf};
                        this.f60648c.mo69138b(valueOf);
                        return;
                    }
                    i++;
                }
            }
        }
        this.f60648c.mo69138b((Object) false);
    }
}
