package com.google.android.gms.constellation.checker;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class SimStateChecker extends IntentOperation {

    /* renamed from: a */
    public static final sek f30501a = tea.m36798a("sim_state_checker");

    /* renamed from: e */
    public static ScheduledFuture f30502e = null;

    /* renamed from: f */
    public static final int f30503f = 13;

    /* renamed from: b */
    public tds f30504b;

    /* renamed from: c */
    public UUID f30505c;

    /* renamed from: d */
    public Context f30506d;

    /* renamed from: g */
    private ScheduledExecutorService f30507g;

    /* renamed from: h */
    private final Runnable f30508h = new syq(this);

    public final void onCreate() {
        this.f30507g = snp.m35703a(1, 10);
        this.f30506d = getApplicationContext();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public final void onHandleIntent(Intent intent) {
        char c;
        int i = Build.VERSION.SDK_INT;
        if (cdfw.m133050e() || cdfw.f180710a.mo6606a().mo77459n()) {
            sek sek = f30501a;
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 16);
            sb.append("Handling intent ");
            sb.append(valueOf);
            sek.mo25414c(sb.toString(), new Object[0]);
            if (!intent.getAction().equals("android.intent.action.SIM_STATE_CHANGED")) {
                f30501a.mo25416d("Unexpected intent.", new Object[0]);
                return;
            }
            this.f30504b = tds.m36774a(this.f30506d);
            this.f30505c = UUID.randomUUID();
            int i2 = 3;
            if (!intent.hasExtra("ss")) {
                f30501a.mo25416d("Extra not found in intent.", new Object[0]);
                i2 = 2;
            } else {
                String stringExtra = intent.getStringExtra("ss");
                switch (stringExtra.hashCode()) {
                    case -2044123382:
                        if (stringExtra.equals("LOCKED")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1097519099:
                        if (stringExtra.equals("loaded")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2251386:
                        if (stringExtra.equals("IMSI")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 77848963:
                        if (stringExtra.equals("READY")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1924388665:
                        if (stringExtra.equals("ABSENT")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    i2 = c != 1 ? c != 2 ? c != 3 ? c != 4 ? 2 : 6 : 4 : 7 : 5;
                }
            }
            tds tds = this.f30504b;
            String uuid = this.f30505c.toString();
            bxvd da = bqiu.f140898e.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            bqiu bqiu = (bqiu) da.f164949b;
            bqiu.f140903d = i2 - 2;
            bqiu.f140900a |= 4;
            tds.mo26400a(tds.m36770a(uuid, 47, da));
            if (cdfw.m133050e() && syo.m36599a(szq.m36667a(this.f30506d))) {
                f30501a.mo25409a("fire attempt", new Object[0]);
                synchronized (SimStateChecker.class) {
                    if (f30502e != null) {
                        if (!f30502e.isDone() && !f30502e.isCancelled()) {
                            f30501a.mo25409a("cancel attempt", new Object[0]);
                            f30502e.cancel(false);
                        }
                    }
                    f30502e = ((sny) this.f30507g).schedule(this.f30508h, cdfw.f180710a.mo6606a().mo77461p(), TimeUnit.MILLISECONDS);
                }
                return;
            }
            return;
        }
        f30501a.mo25414c("sim state checker is disabled.", new Object[0]);
    }
}
