package p000;

import android.content.res.Resources;
import java.util.List;
import java.util.Set;

/* renamed from: abrk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class abrk extends acpn {

    /* renamed from: a */
    final /* synthetic */ String f58041a;

    /* renamed from: b */
    final /* synthetic */ abrv f58042b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrk(abrv abrv, bqbd bqbd, String str) {
        super(bqbd);
        this.f58042b = abrv;
        this.f58041a = str;
    }

    /* renamed from: b */
    public final void mo32291b() {
        Resources resources;
        if (this.f58041a.equals(this.f58042b.f58066b.getResources().getConfiguration().locale.getLanguage())) {
            abrv abrv = this.f58042b;
            abrv.f58067c.mo32992b(2);
            Set<abyv> a = abrv.f58077m.mo32500a();
            abzm b = abrv.mo32314b();
            for (abyv abyv : a) {
                Resources l = abyv.mo32483l();
                if (l == null) {
                    String valueOf = String.valueOf(abyv.f58761b);
                    absg.m48191b(valueOf.length() == 0 ? new String("Can't get resources for package: ") : "Can't get resources for package: ".concat(valueOf));
                } else {
                    for (acak acak : abyv.mo32462a()) {
                        abzr c = b.mo32540c(acak);
                        absy absy = ((abss) c.mo32560c()).f58158c;
                        if (absy == null) {
                            absy = absy.f58176h;
                        }
                        int a2 = absx.m48236a(absy.f58180c);
                        if (a2 == 0 || a2 == 1) {
                            absr absr = ((abss) c.mo32560c()).f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            bxvd bxvd = (bxvd) absr.mo74142c(5);
                            bxvd.mo73625a((bxvk) absr);
                            absr absr2 = ((abss) c.mo32560c()).f58157b;
                            if (absr2 == null) {
                                absr2 = absr.f58134s;
                            }
                            if (!absr2.f58146k.isEmpty()) {
                                absr absr3 = ((abss) c.mo32560c()).f58157b;
                                if (absr3 == null) {
                                    absr3 = absr.f58134s;
                                }
                                absr absr4 = ((abss) c.mo32560c()).f58157b;
                                if (absr4 == null) {
                                    absr4 = absr.f58134s;
                                }
                                if (abww.m48413a(absr4.f58138c)) {
                                    resources = abrv.f58066b.getResources();
                                } else {
                                    resources = l;
                                }
                                acbf acbf = new acbf(absr3, resources);
                                try {
                                    acbf.mo32603a();
                                    List b2 = acbf.mo32604b();
                                    if (bxvd.f164950c) {
                                        bxvd.mo74035c();
                                        bxvd.f164950c = false;
                                    }
                                    ((absr) bxvd.f164949b).f58146k = bxvk.m124030de();
                                    if (b2 != null) {
                                        bxvd.mo73949L(b2);
                                    }
                                    String str = abyv.f58761b;
                                    absr absr5 = ((abss) c.mo32560c()).f58157b;
                                    if (absr5 == null) {
                                        absr5 = absr.f58134s;
                                    }
                                    try {
                                        b.mo32529a(new acak(str, absr5.f58138c), c.mo32554a((absr) bxvd.mo74062i()));
                                    } catch (acaq e) {
                                        absg.m48189a(e, "Failed to set corpus config on reparse");
                                        abrv.f58083s.mo32447a("reparse_sourcecheck_failed");
                                    }
                                } catch (acar e2) {
                                    String str2 = abyv.f58761b;
                                    absr absr6 = ((abss) c.mo32560c()).f58157b;
                                    if (absr6 == null) {
                                        absr6 = absr.f58134s;
                                    }
                                    String str3 = absr6.f58138c;
                                    String message = e2.getMessage();
                                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 73 + String.valueOf(str3).length() + String.valueOf(message).length());
                                    sb.append("Error while reparsing mapping for packageName = ");
                                    sb.append(str2);
                                    sb.append(", corpusName = ");
                                    sb.append(str3);
                                    sb.append(", error = ");
                                    sb.append(message);
                                    absg.m48191b(sb.toString());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
