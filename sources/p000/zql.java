package p000;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: zql */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class zql extends zqy {

    /* renamed from: a */
    public final zre f55699a;

    /* renamed from: b */
    private final zuu f55700b;

    /* renamed from: c */
    private final zqo f55701c;

    /* renamed from: d */
    private final int f55702d;

    /* renamed from: e */
    private final TimeUnit f55703e;

    static {
        zvt.m46581a();
    }

    public zql(zre zre, zuu zuu, int i, TimeUnit timeUnit, zqo zqo) {
        this.f55699a = zua.m46422a(zre);
        this.f55700b = zuu;
        this.f55701c = zqo;
        this.f55702d = i;
        this.f55703e = timeUnit;
    }

    /* JADX INFO: additional move instructions added (2) to help type inference */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x022a, code lost:
        r5.add(r6);
     */
    /* renamed from: a */
    public final cadp mo31331a(cadp cadp, yhe yhe, boolean z) {
        Long l;
        long j;
        bngx bngx;
        cadp cadp2 = cadp;
        yhe yhe2 = yhe;
        int size = cadp2.f172714c.size();
        if (yhe.mo30496d() && size >= yhe2.f53820b) {
            return cadp2;
        }
        caae caae = cadp2.f172713b;
        if (caae == null) {
            caae = caae.f172323i;
        }
        zre zre = this.f55699a;
        caae caae2 = cadp2.f172713b;
        if (caae2 == null) {
            caae2 = caae.f172323i;
        }
        yqi c = zre.mo31387c(caae2);
        if (c == null) {
            l = this.f55699a.mo31389i().containsKey(caae) ? -1L : null;
        } else {
            l = Long.valueOf(c.f54392c);
        }
        if (l != null && (l.longValue() < 0 || l.longValue() <= yhe.mo30494b())) {
            return cadp2;
        }
        if (l != null) {
            long longValue = l.longValue();
            long c2 = yhe.mo30495c();
            long j2 = Long.MAX_VALUE;
            if (c2 < Long.MAX_VALUE - TimeUnit.MILLISECONDS.toNanos(1)) {
                j2 = c2 + TimeUnit.MILLISECONDS.toNanos(1);
            }
            j = Math.min(longValue, j2);
        } else {
            j = yhe.mo30495c();
        }
        TimeUnit.NANOSECONDS.toMillis(yhe.mo30494b());
        TimeUnit.NANOSECONDS.toMillis(j);
        TimeUnit.NANOSECONDS.toMillis(yhe.mo30495c());
        if (!z) {
            bxvd bxvd = (bxvd) cadp2.mo74142c(5);
            bxvd.mo73625a((GeneratedMessageLite) cadp2);
            cado cado = (cado) bxvd;
            if (cado.f164950c) {
                cado.mo74035c();
                cado.f164950c = false;
            }
            cadp cadp3 = (cadp) cado.f164949b;
            cadp cadp4 = cadp.f172710f;
            cadp3.f172712a |= 4;
            cadp3.f172716e = true;
            return (cadp) cado.mo74062i();
        }
        try {
            zuu zuu = this.f55700b;
            if (zuu != null) {
                bngx = (bngx) zuu.mo30701a(caae, yhe.mo30494b(), j).get((long) this.f55702d, this.f55703e);
            } else {
                bngx = bngx.m109376e();
            }
            zqo zqo = this.f55701c;
            zqm zqm = new zqm();
            bmxy.m108581a(caae);
            zqm.f55705b = caae;
            zqm.f55704a = bngx.m109368a((Collection) bngx);
            zqm.f55706c = l;
            zqm.f55707d = yhe.mo30494b();
            zqm.f55708e = j;
            bmxy.m108581a(zqm.f55704a);
            bmxy.m108581a(zqm.f55705b);
            zqo.mo31333a(new zqn(zqm));
            bngx.size();
            caae caae3 = cadp2.f172713b;
            bngx bngx2 = bngx;
            if (yhe.mo30496d()) {
                int size2 = yhe2.f53820b - cadp2.f172714c.size();
                int size3 = bngx.size();
                bngx2 = bngx;
                if (size3 > size2) {
                    bngx2 = bngx.subList(size3 - size2, size3);
                }
            }
            bxwc bxwc = cadp2.f172714c;
            ArrayList arrayList = new ArrayList(bxwc.size() + bngx2.size());
            bnjq h = bnjr.m109626h(bxwc.iterator());
            bnjq h2 = bnjr.m109626h(bngx2.iterator());
            while (true) {
                if (!h.hasNext() && !h2.hasNext()) {
                    break;
                }
                if (h.hasNext()) {
                    if (h2.hasNext()) {
                        if (((cadn) h.mo67862a()).f172702b <= ((cadn) h2.mo67862a()).f172702b) {
                        }
                    }
                    arrayList.add((cadn) h.next());
                }
                cadn cadn = (cadn) h2.next();
                int size4 = arrayList.size() - 1;
                while (true) {
                    if (size4 < 0) {
                        break;
                    }
                    cadn cadn2 = (cadn) arrayList.get(size4);
                    if (cadn2.f172702b < cadn.f172702b) {
                        break;
                    }
                    caae caae4 = cadn2.f172705e;
                    if (caae4 == null) {
                        caae4 = caae.f172323i;
                    }
                    caae caae5 = cadn.f172705e;
                    if (caae5 == null) {
                        caae5 = caae.f172323i;
                    }
                    if (caae4.equals(caae5) && cadn2.f172702b == cadn.f172702b && cadn2.f172703c == cadn.f172703c) {
                        if (!cadn2.f172704d.equals(cadn.f172704d)) {
                            continue;
                        } else {
                            caae caae6 = cadn2.f172706f;
                            if (caae6 == null) {
                                caae6 = caae.f172323i;
                            }
                            caae caae7 = cadn.f172706f;
                            if (caae7 == null) {
                                caae7 = caae.f172323i;
                            }
                            if (caae6.equals(caae7)) {
                                break;
                            }
                        }
                    }
                    size4--;
                }
            }
            bxvd bxvd2 = (bxvd) cadp2.mo74142c(5);
            bxvd2.mo73625a((GeneratedMessageLite) cadp2);
            cado cado2 = (cado) bxvd2;
            if (cado2.f164950c) {
                cado2.mo74035c();
                cado2.f164950c = false;
            }
            cadp cadp5 = cadp.f172710f;
            ((cadp) cado2.f164949b).f172714c = GeneratedMessageLite.m124030de();
            cado2.mo74617a(arrayList);
            return (cadp) cado2.mo74062i();
        } catch (InterruptedException | ExecutionException e) {
            String valueOf = String.valueOf(caae.f172326b);
            throw new IOException(valueOf.length() == 0 ? new String("Unable to fetch server data for: ") : "Unable to fetch server data for: ".concat(valueOf), e);
        } catch (TimeoutException e2) {
            String valueOf2 = String.valueOf(caae.f172326b);
            throw new IOException(valueOf2.length() == 0 ? new String("Request timed out. Unable to fetch server data for: ") : "Request timed out. Unable to fetch server data for: ".concat(valueOf2), e2);
        }
    }
}
