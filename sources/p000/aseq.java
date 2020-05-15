package p000;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.lockbox.internal.LockboxOptInFlags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aseq */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aseq {

    /* renamed from: a */
    protected static bdtr f88785a;

    public aseq() {
        rjo rjo = auzz.f92845a;
        rjo rjo2 = aeyf.f64000a;
    }

    /* renamed from: a */
    public static final List m73886a(Context context) {
        if (!cgsr.f187679a.mo6606a().mo84427a() || !ashc.m74113a(context)) {
            return m73887a(context, context.getPackageName());
        }
        return Collections.emptyList();
    }

    /* renamed from: a */
    private static final List m73887a(Context context, String str) {
        List<Account> d = soz.m35801d(context, str);
        Collections.sort(d, new asep());
        ArrayList arrayList = new ArrayList();
        try {
            boolean a = cgvc.f187802a.mo6606a().mo84529a();
            for (Account account : d) {
                if (!a) {
                    rkj rkj = (rkj) aucu.m76783a(auzz.m78131a(context, new auzy(account)).mo24671C(), 15, TimeUnit.SECONDS);
                    if (rkj != null && rkj.mo24822p()) {
                        if (!rkj.mo24823q()) {
                            if (cgsl.m146894b()) {
                            }
                        }
                        arrayList.add(new aezi(Status.f30107a, new LockboxOptInFlags(account.name, rkj.mo24822p(), rkj.mo24823q())));
                    }
                } else {
                    if (f88785a == null) {
                        bdtt bdtt = new bdtt();
                        bdtt.mo58364a(context);
                        bdtt.mo58366b("gmscorestatsfacsid");
                        f88785a = bdtt.mo58363a();
                    }
                    bdtq b = f88785a.mo58362b(account);
                    boolean booleanValue = ((Boolean) b.mo58355a(4).get(15, TimeUnit.SECONDS)).booleanValue();
                    boolean booleanValue2 = ((Boolean) b.mo58355a(5).get(15, TimeUnit.SECONDS)).booleanValue();
                    if (booleanValue && (booleanValue2 || cgsl.m146894b())) {
                        arrayList.add(new aezi(Status.f30107a, new LockboxOptInFlags(account.name, true, booleanValue2)));
                    }
                }
            }
        } catch (IllegalStateException e) {
            if (cgrz.m146803c()) {
                return null;
            }
        } catch (ExecutionException | TimeoutException e2) {
            if (cgrz.m146803c()) {
                return null;
            }
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            if (cgrz.m146803c()) {
                return null;
            }
        }
        return arrayList;
    }
}
