package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: abqz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abqz extends acpn {

    /* renamed from: a */
    final /* synthetic */ acqv f58024a;

    /* renamed from: b */
    final /* synthetic */ abrv f58025b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abqz(abrv abrv, bqbd bqbd, acqv acqv) {
        super(bqbd);
        this.f58025b = abrv;
        this.f58024a = acqv;
    }

    /* renamed from: b */
    public final void mo32291b() {
        String str;
        boolean z;
        acqv acqv = this.f58024a;
        if ((acqv.f60550a & 1) != 0) {
            abrv abrv = this.f58025b;
            acqt acqt = acqv.f60551b;
            if (acqt == null) {
                acqt = acqt.f60536e;
            }
            abzo a = abrv.mo32298a();
            absg.m48184a("handleGcmDeleteAppHistory.");
            synchronized (a.mo32525a()) {
                int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(acqt.f60540c);
                int seconds2 = (int) TimeUnit.MILLISECONDS.toSeconds(acqt.f60541d);
                if (acqt.f60538a.isEmpty()) {
                    bnrd a2 = a.mo32544d().iterator();
                    while (a2.hasNext()) {
                        acak acak = (acak) a2.next();
                        absr d = a.mo32543d(acak);
                        if (d != null) {
                            abyv d2 = abrv.f58077m.mo32506d(d.f58140e);
                            abrv.f58078n.mo43401a(d.f58144i, seconds, seconds2);
                            abrv.mo32313a(acak, d2);
                        }
                    }
                } else {
                    abyv d3 = abrv.f58077m.mo32506d(acqt.f60538a);
                    if (d3 != null) {
                        for (acak acak2 : d3.mo32462a()) {
                            abss b = a.mo32534b(acak2);
                            absy absy = b.f58158c;
                            if (absy == null) {
                                absy = absy.f58176h;
                            }
                            int a3 = absx.m48236a(absy.f58180c);
                            if (a3 != 0) {
                                if (a3 != 1) {
                                }
                            }
                            absr absr = b.f58157b;
                            if (absr == null) {
                                absr = absr.f58134s;
                            }
                            if (abzm.m48658f(absr)) {
                                if (!acqt.f60539b.isEmpty()) {
                                    absr absr2 = b.f58157b;
                                    if (absr2 == null) {
                                        absr2 = absr.f58134s;
                                    }
                                    if (!abrv.mo32311a(absr2, acqt.f60539b)) {
                                        absg.m48205e("Failed to delete usage report and implicit document");
                                    }
                                } else {
                                    NativeIndex nativeIndex = abrv.f58078n;
                                    absr absr3 = b.f58157b;
                                    if (absr3 == null) {
                                        absr3 = absr.f58134s;
                                    }
                                    nativeIndex.mo43401a(absr3.f58144i, seconds, seconds2);
                                    abrv.mo32313a(acak2, d3);
                                }
                            }
                        }
                    }
                }
            }
        }
        acqv acqv2 = this.f58024a;
        if ((acqv2.f60550a & 2) != 0) {
            abrv abrv2 = this.f58025b;
            acqu acqu = acqv2.f60552c;
            if (acqu == null) {
                acqu = acqu.f60543c;
            }
            if (!acqu.f60545a.isEmpty()) {
                String str2 = acqu.f60545a;
                Context context = abrv2.f58066b;
                Iterator it = soz.m35801d(context, context.getPackageName()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        absg.m48185a("Failed to find account name for ID %s", str2);
                        str = null;
                        break;
                    }
                    Account account = (Account) it.next();
                    try {
                        if (str2.equals(gie.m13198c(abrv2.f58066b, account.name))) {
                            str = account.name;
                            break;
                        }
                    } catch (gid | IOException e) {
                        absg.m48206e("Failed to get account ID. %s", e.getMessage());
                    }
                }
                if (str != null) {
                    abrv2.mo32309a(str, acqu);
                    if (acwx.m49915a()) {
                        z = ((Boolean) acaw.f59266W.mo58455c()).booleanValue();
                    } else {
                        z = ((Boolean) acaw.f59265V.mo58455c()).booleanValue();
                    }
                    if (z) {
                        ackw.m49352a();
                    }
                }
            }
        }
    }
}
