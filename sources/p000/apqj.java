package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Request;
import com.google.android.gms.search.global.SetIncludeInGlobalSearchCall$Response;

/* renamed from: apqj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class apqj extends aplq {

    /* renamed from: a */
    private final abrv f84796a;

    public apqj(abrv abrv, SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request, abyy abyy) {
        super(bqbd.SET_INCLUDE_IN_GLOBAL_SEARCH, 1, 2, abrv.f58066b, setIncludeInGlobalSearchCall$Request, abyy);
        this.f84796a = abrv;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo11132a() {
        SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = new SetIncludeInGlobalSearchCall$Response();
        if (!"com.google.android.gms".equals(((SetIncludeInGlobalSearchCall$Request) this.f84708n).f107434a) || ((SetIncludeInGlobalSearchCall$Request) this.f84708n).f107435b != null) {
            abyv c = this.f84796a.f58077m.mo32505c(((SetIncludeInGlobalSearchCall$Request) this.f84708n).f107434a);
            SetIncludeInGlobalSearchCall$Request setIncludeInGlobalSearchCall$Request = (SetIncludeInGlobalSearchCall$Request) this.f84708n;
            String str = setIncludeInGlobalSearchCall$Request.f107435b;
            boolean z = setIncludeInGlobalSearchCall$Request.f107436c;
            boolean z2 = true;
            absg.m48194b("package:%s source:%s enabled:%b", c.f58761b, str, Boolean.valueOf(z));
            acrl acrl = c.f58763d;
            String str2 = c.f58761b;
            if (!"com.google.android.gms".equals(str2)) {
                abtf abtf = !z ? abtf.DISABLED : abtf.ENABLED;
                synchronized (acrl.f60625g) {
                    abul d = acrl.mo33026d(str2);
                    bxvd bxvd = (bxvd) d.mo74142c(5);
                    bxvd.mo73625a((bxvk) d);
                    abtf a = abtf.m48246a(((abul) bxvd.f164949b).f58422i);
                    if (a == null) {
                        a = abtf.UNSET;
                    }
                    if (abtf != a) {
                        if (bxvd.f164950c) {
                            bxvd.mo74035c();
                            bxvd.f164950c = false;
                        }
                        abul abul = (abul) bxvd.f164949b;
                        abul abul2 = abul.f58412n;
                        abul.f58422i = abtf.f58217d;
                        abul.f58414a |= 128;
                        acrl.mo33020a(str2, (abul) bxvd.mo74062i());
                    }
                }
            } else {
                if (str == null) {
                    z2 = false;
                }
                sdo.m34974b(z2);
                abtf abtf2 = !z ? abtf.DISABLED : abtf.ENABLED;
                synchronized (acrl.f60625g) {
                    abuk abuk = acrl.f60622d;
                    if (abuk != null) {
                        bxvd bxvd2 = (bxvd) abuk.mo74142c(5);
                        bxvd2.mo73625a((bxvk) abuk);
                        int i = 0;
                        while (true) {
                            if (i >= ((abuk) bxvd2.f164949b).f58411b.size()) {
                                break;
                            } else if (!acky.m49359a((abtd) ((abuk) bxvd2.f164949b).f58410a.get(i)).f9563b.equals(str)) {
                                i++;
                            } else if (((abtf) abuk.f58407c.mo14948a(Integer.valueOf(((abuk) bxvd2.f164949b).f58411b.mo74151b(i)))) != abtf2) {
                                if (bxvd2.f164950c) {
                                    bxvd2.mo74035c();
                                    bxvd2.f164950c = false;
                                }
                                abuk abuk2 = (abuk) bxvd2.f164949b;
                                abtf2.getClass();
                                abuk2.mo32348a();
                                abuk2.f58411b.mo74149a(i, abtf2.f58217d);
                                acrl.f60622d = (abuk) bxvd2.mo74062i();
                                acrl.mo33018a(acrl.f60622d);
                            }
                        }
                    }
                }
            }
            setIncludeInGlobalSearchCall$Response.f107437a = Status.f30107a;
        } else {
            setIncludeInGlobalSearchCall$Response.f107437a = new Status(10, "Non-null source name required for GMSCore package", null);
        }
        return setIncludeInGlobalSearchCall$Response;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final String mo33000f() {
        return String.format("%s, package[%s]", super.mo33000f(), ((SetIncludeInGlobalSearchCall$Request) this.f84708n).f107434a);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo47405a(Status status) {
        SetIncludeInGlobalSearchCall$Response setIncludeInGlobalSearchCall$Response = new SetIncludeInGlobalSearchCall$Response();
        setIncludeInGlobalSearchCall$Response.f107437a = status;
        return setIncludeInGlobalSearchCall$Response;
    }
}
