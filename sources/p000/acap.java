package p000;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acap */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class acap implements acao {

    /* renamed from: a */
    private static bdtp f59113a;

    /* renamed from: b */
    private final Context f59114b;

    /* renamed from: c */
    private final bdtp f59115c;

    /* renamed from: d */
    private final rjx f59116d;

    public acap(Context context) {
        rjx a = aeyf.m52681a(context);
        bdtp a2 = m48779a(context);
        this.f59114b = context;
        this.f59116d = a;
        this.f59115c = a2;
    }

    /* renamed from: a */
    private static synchronized bdtp m48779a(Context context) {
        bdtp bdtp;
        synchronized (acap.class) {
            if (cemw.m137398f()) {
                if (f59113a == null) {
                    bdtt bdtt = new bdtt();
                    bdtt.mo58364a(context);
                    bdtt.mo58366b("icing");
                    f59113a = bdtt.mo58363a();
                }
                bdtp = f59113a;
            } else {
                bdtp = null;
            }
        }
        return bdtp;
    }

    /* renamed from: b */
    public final void mo32594b() {
        rkb rkb = this.f59116d.f43165D;
        aezg aezg = new aezg(rkb);
        rkb.mo24795b(aezg);
        try {
            aucu.m76783a(sdl.m34954a(aezg), ((Long) abzt.f58960bv.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            absg.m48205e("Failed to remove signed-in account.");
            if (e instanceof InterruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* renamed from: c */
    public final rkj mo32595c() {
        try {
            return (rkj) aucu.m76783a(this.f59116d.mo24760n(), ((Long) abzt.f58960bv.mo58455c()).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            absg.m48200c(e, "Failed to get Lockbox signed-in status", new Object[0]);
            if (!(e instanceof InterruptedException)) {
                return null;
            }
            Thread.currentThread().interrupt();
            return null;
        }
    }

    /* renamed from: a */
    public final String mo32592a() {
        rkj c = mo32595c();
        if (c != null) {
            return bmxx.m108578b(c.mo24812f());
        }
        absg.m48205e("getSignedInAccountName: Falling back to default value");
        return "";
    }

    /* renamed from: a */
    public final boolean mo32593a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (cemw.m137398f()) {
                    if (this.f59115c != null) {
                        return ((Boolean) this.f59115c.mo58357a(new Account(str, "com.google")).mo58355a(4).get(((Long) abzt.f58960bv.mo58455c()).longValue(), TimeUnit.MILLISECONDS)).booleanValue();
                    }
                }
                Context context = this.f59114b;
                auzx auzx = new auzx();
                auzx.mo51098a(str);
                return ((rkj) aucu.m76783a(auzz.m78131a(context, auzx.mo51097a()).mo24671C(), ((Long) abzt.f58960bv.mo58455c()).longValue(), TimeUnit.MILLISECONDS)).mo24822p();
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                absg.m48200c(e, "Failed to get opt-in status", new Object[0]);
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                return false;
            }
        } else {
            absg.m48205e("isOptedInForAppHistory: empty Account Name encountered");
            return false;
        }
    }
}
