package p000;

import android.text.TextUtils;
import com.google.firebase.auth.api.model.MfaInfo;
import java.util.ArrayList;
import java.util.List;

/* renamed from: brro */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class brro implements brpk {

    /* renamed from: a */
    public String f143255a;

    /* renamed from: b */
    public String f143256b;

    /* renamed from: c */
    public long f143257c;

    /* renamed from: d */
    public List f143258d;

    /* renamed from: e */
    public String f143259e;

    /* renamed from: a */
    public final bxxk mo69763a() {
        return (bxxk) bklg.f124743j.mo74142c(7);
    }

    /* renamed from: b */
    public final boolean mo69822b() {
        return !TextUtils.isEmpty(this.f143259e);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo69764a(bxxc bxxc) {
        if (bxxc instanceof bklg) {
            bklg bklg = (bklg) bxxc;
            stm.m36300b(bklg.f124745a);
            stm.m36300b(bklg.f124746b);
            stm.m36300b(bklg.f124747c);
            this.f143255a = stm.m36300b(bklg.f124748d);
            stm.m36300b(bklg.f124749e);
            this.f143256b = stm.m36300b(bklg.f124750f);
            this.f143257c = bklg.f124751g;
            this.f143258d = new ArrayList();
            bxwc bxwc = bklg.f124753i;
            int size = bxwc.size();
            for (int i = 0; i < size; i++) {
                this.f143258d.add(MfaInfo.m118902a((bkll) bxwc.get(i)));
            }
            this.f143259e = bklg.f124752h;
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of VerifyPasswordResponse.");
    }
}
