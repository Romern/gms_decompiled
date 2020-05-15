package p000;

import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.util.HashSet;
import java.util.Set;

/* renamed from: acaf */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acaf {

    /* renamed from: a */
    public final Context f59079a;

    /* renamed from: b */
    public final abqv f59080b;

    /* renamed from: c */
    public final acpl f59081c;

    /* renamed from: d */
    public final abze f59082d;

    /* renamed from: e */
    public final Set f59083e = new HashSet();

    /* renamed from: f */
    public final Set f59084f = new HashSet();

    /* renamed from: g */
    public final Object f59085g = new Object();

    /* renamed from: h */
    private final abyx f59086h;

    /* renamed from: i */
    private final abym f59087i;

    /* renamed from: j */
    private final abyh f59088j;

    /* renamed from: k */
    private final acao f59089k;

    /* renamed from: l */
    private final NativeIndex f59090l;

    /* renamed from: m */
    private final abvc f59091m;

    public acaf(Context context, abqv abqv, acpl acpl, abze abze, abyx abyx, abym abym, abyh abyh, acao acao, NativeIndex nativeIndex, abvc abvc) {
        this.f59079a = context;
        this.f59080b = abqv;
        this.f59081c = acpl;
        this.f59082d = abze;
        this.f59086h = abyx;
        this.f59087i = abym;
        this.f59088j = abyh;
        this.f59089k = acao;
        this.f59090l = nativeIndex;
        this.f59091m = abvc;
    }

    /* renamed from: a */
    public final void mo32578a(acak acak) {
        mo32579a(acak, 300000);
    }

    /* renamed from: a */
    public final void mo32579a(acak acak, long j) {
        String a;
        String str;
        String str2;
        acak acak2 = acak;
        abzm abzm = this.f59082d.f58793b;
        synchronized (abzm.mo32525a()) {
            a = abzm.mo32526a(acak2);
            absr d = abzm.mo32543d(acak2);
            if (d != null) {
                String str3 = d.f58140e;
                str2 = d.f58138c;
                str = str3;
            } else {
                str2 = null;
                str = null;
            }
        }
        if (acak2 == null) {
            absg.m48192b("Corpus doesn't exist: %s", (Object) null);
        } else if (a != null) {
            synchronized (this.f59085g) {
                if (!this.f59083e.contains(a)) {
                    this.f59083e.add(a);
                    acpl acpl = this.f59081c;
                    acpl.mo32995d(new acac(this.f59079a, acpl, this.f59082d, this.f59086h, this.f59087i, this.f59088j, this.f59089k, this.f59090l, this.f59091m, str, acak, a, j, new acae(this, str, str2, a), null));
                }
            }
        } else {
            absg.m48192b("Corpus incarnation doesn't exist: %s", acak.mo32584b());
        }
    }
}
