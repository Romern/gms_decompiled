package p000;

import android.content.Context;
import android.os.Build;
import java.io.IOException;

/* renamed from: avnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class avnm {

    /* renamed from: a */
    public static final sek f93516a = avpq.m79018e("ExecutionManager");

    /* renamed from: b */
    public static final avsz f93517b = new avnl();

    /* renamed from: c */
    public final Context f93518c;

    /* renamed from: d */
    public final avtn f93519d = ((avtn) avtn.f93892a.mo51589b());

    /* renamed from: e */
    public final avpp f93520e;

    /* renamed from: f */
    public final Object f93521f;

    /* renamed from: g */
    public final Object f93522g;

    /* renamed from: h */
    public avnj f93523h;

    /* renamed from: i */
    public boolean f93524i;

    public avnm(Context context) {
        sdo.m34959a(context);
        this.f93518c = context;
        this.f93520e = avpp.m79008a(context);
        this.f93522g = new Object();
        this.f93521f = new Object();
    }

    /* renamed from: a */
    public final void mo51439a() {
        synchronized (this.f93521f) {
            this.f93523h = null;
            if (this.f93524i) {
                Context context = this.f93518c;
                context.startService(avnh.m78872a(context));
            }
        }
    }

    /* renamed from: b */
    public final void mo51440b() {
        avpk a;
        synchronized (this.f93521f) {
            f93516a.mo25414c("Finishing the current execution.", new Object[0]);
            ((avmi) avmi.f93389c.mo51589b()).mo51379d();
            ((avmq) avmq.f93413e.mo51589b()).mo51392b();
            ((avnb) avnb.f93488c.mo51589b()).mo51427d();
            int i = Build.VERSION.SDK_INT;
            try {
                avpb.m78977a(this.f93518c);
            } catch (IOException e) {
                f93516a.mo25417e("Failed to cancel the scheduled update.", e, new Object[0]);
            } catch (Throwable th) {
                a.mo51467c();
                throw th;
            }
            if (avls.m78732a()) {
                a = avpk.m78987a();
                a.mo51466b();
                try {
                    a.mo51469e();
                } catch (InterruptedException e2) {
                    f93516a.mo25417e("Failed to reset update engine.", e2, new Object[0]);
                }
                a.mo51467c();
            }
            avov.m78969b(this.f93518c);
            this.f93519d.mo51606a(avnp.f93533h, avnp.f93538m, avnp.f93526a, avnp.f93527b, avnp.f93528c, avnp.f93530e, avnp.f93529d, avnp.f93531f, avnp.f93532g, avnp.f93539n);
            mo51439a();
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: c */
    public final avnj mo51441c() {
        char c;
        avnj avnj;
        synchronized (this.f93521f) {
            String str = (String) this.f93519d.mo51607b(avnp.f93527b);
            avte avte = (avte) this.f93519d.mo51607b(avnp.f93528c);
            if (bmxx.m108577a(str)) {
                str = "pending";
                this.f93519d.mo51605a(new avtc(avnp.f93527b, str));
            }
            try {
                Context context = this.f93518c;
                switch (str.hashCode()) {
                    case -1839227779:
                        if (str.equals("non-streaming-process-package")) {
                            c = 11;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1494191981:
                        if (str.equals("non-streaming-download")) {
                            c = 10;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1263894125:
                        if (str.equals("streaming-download")) {
                            c = 16;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1000288303:
                        if (str.equals("non-ab-reboot")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case -934938715:
                        if (str.equals("reboot")) {
                            c = 14;
                            break;
                        }
                        c = 65535;
                        break;
                    case -682587753:
                        if (str.equals("pending")) {
                            c = 12;
                            break;
                        }
                        c = 65535;
                        break;
                    case -474775007:
                        if (str.equals("exponential-backoff-delay-execution")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192651531:
                        if (str.equals("fixed-delay-execution")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -68267281:
                        if (str.equals("non-ab-install")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 95755281:
                        if (str.equals("pre-download-validate")) {
                            c = 13;
                            break;
                        }
                        c = 65535;
                        break;
                    case 115318481:
                        if (str.equals("ab-reboot")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 211344235:
                        if (str.equals("permanent-failure")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 410752261:
                        if (str.equals("ab-update-prep")) {
                            c = 18;
                            break;
                        }
                        c = 65535;
                        break;
                    case 489761078:
                        if (str.equals("non-streaming-ab-apply-action")) {
                            c = 8;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1084223181:
                        if (str.equals("non-streaming-ab-apply")) {
                            c = 9;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1839351677:
                        if (str.equals("finished-execution")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1871854292:
                        if (str.equals("non-ab-install-action")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1899388483:
                        if (str.equals("streaming-apply")) {
                            c = 15;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1935698813:
                        if (str.equals("streaming-process-package")) {
                            c = 17;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        avnj = new avnt(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 1:
                        avnj = new avny(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 2:
                    case 3:
                        avnj = new avnz(avte);
                        this.f93523h = avnj;
                        break;
                    case 4:
                        avnj = new avob(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 5:
                    case 6:
                        avnj = new avod(avte);
                        this.f93523h = avnj;
                        break;
                    case 7:
                        avnj = new avog(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 8:
                    case 9:
                        avnj = new avoh("non-streaming-ab-apply", context, avte);
                        this.f93523h = avnj;
                        break;
                    case 10:
                        avnj = new avoi(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 11:
                        avnj = new avoj(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 12:
                        avnj = new avok(avte);
                        this.f93523h = avnj;
                        break;
                    case 13:
                        avnj = new avol(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 14:
                        avnj = new avom(avte);
                        this.f93523h = avnj;
                        break;
                    case 15:
                        avnj = avoo.m78932a(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 16:
                        avnj = avop.m78943a(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 17:
                        avnj = avor.m78949a(context, avte);
                        this.f93523h = avnj;
                        break;
                    case 18:
                        avnj = new avnu(context, avte);
                        this.f93523h = avnj;
                        break;
                    default:
                        throw new IllegalStateException(String.format("Unknown action name: %s.", str));
                }
            } catch (IllegalStateException e) {
                f93516a.mo25415d("Unable to create the action. Restart the execution from the scratch.", e, new Object[0]);
                this.f93519d.mo51606a(avnp.f93527b, avnp.f93528c);
                return mo51441c();
            }
        }
        return avnj;
    }
}
