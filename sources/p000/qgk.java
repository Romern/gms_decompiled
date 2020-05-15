package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qgk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class qgk {

    /* renamed from: a */
    private final Context f41179a;

    /* renamed from: b */
    private final bmza f41180b;

    /* renamed from: c */
    private final bmza f41181c;

    /* renamed from: d */
    private final bmza f41182d;

    /* renamed from: e */
    private final bmza f41183e;

    /* renamed from: f */
    private final boolean f41184f;

    /* renamed from: g */
    private final bxvd f41185g = qgq.f41203e.mo74144da();

    /* renamed from: h */
    private final bxvd f41186h = qgp.f41198d.mo74144da();

    /* renamed from: i */
    private final bxvd f41187i = qgj.f41167k.mo74144da();

    public qgk(Context context, bmzq bmzq) {
        this.f41179a = context;
        this.f41180b = bmza.m108657a(bmzq);
        this.f41182d = bmza.m108657a(bmzq);
        this.f41183e = bmza.m108657a(bmzq);
        this.f41181c = bmza.m108657a(bmzq);
        this.f41184f = !qdn.m31951c(context);
    }

    /* renamed from: a */
    public final void mo24029a() {
        this.f41181c.mo66930d();
    }

    /* renamed from: b */
    public final void mo24035b() {
        this.f41181c.mo66931e();
        bxvd bxvd = this.f41185g;
        long a = this.f41181c.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgq qgq = (qgq) bxvd.f164949b;
        qgq qgq2 = qgq.f41203e;
        qgq.f41205a |= 2;
        qgq.f41207c = a;
    }

    /* renamed from: c */
    public final void mo24037c() {
        this.f41182d.mo66930d();
    }

    /* renamed from: d */
    public final void mo24038d() {
        if (this.f41181c.f131251a) {
            mo24035b();
        }
        this.f41182d.mo66931e();
        bxvd bxvd = this.f41185g;
        long a = ((qgq) bxvd.f164949b).f41206b + this.f41182d.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgq qgq = (qgq) bxvd.f164949b;
        qgq qgq2 = qgq.f41203e;
        qgq.f41205a |= 1;
        qgq.f41206b = a;
    }

    /* renamed from: e */
    public final void mo24039e() {
        this.f41183e.mo66930d();
    }

    /* renamed from: f */
    public final void mo24040f() {
        this.f41183e.mo66931e();
        bxvd bxvd = this.f41186h;
        long a = this.f41183e.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgp qgp = (qgp) bxvd.f164949b;
        qgp qgp2 = qgp.f41198d;
        qgp.f41200a |= 1;
        qgp.f41201b = a;
    }

    /* renamed from: g */
    public final void mo24041g() {
        this.f41180b.mo66930d();
    }

    /* renamed from: h */
    public final qgj mo24042h() {
        if (this.f41182d.f131251a) {
            mo24038d();
        }
        if (this.f41183e.f131251a) {
            mo24040f();
        }
        this.f41180b.mo66931e();
        bxvd bxvd = this.f41187i;
        long a = this.f41180b.mo66928a(TimeUnit.MILLISECONDS);
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = (qgj) bxvd.f164949b;
        qgj qgj2 = qgj.f41167k;
        qgj.f41169a |= 4;
        qgj.f41172d = a;
        bxvd bxvd2 = this.f41187i;
        boolean z = this.f41184f;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qgj qgj3 = (qgj) bxvd2.f164949b;
        qgj3.f41169a |= 128;
        qgj3.f41178j = z;
        qgq qgq = (qgq) this.f41185g.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qgj qgj4 = (qgj) bxvd2.f164949b;
        qgq.getClass();
        qgj4.f41175g = qgq;
        qgj4.f41169a |= 32;
        bxvd bxvd3 = this.f41186h;
        qgo i = qdn.m31957i(this.f41179a);
        if (bxvd3.f164950c) {
            bxvd3.mo74035c();
            bxvd3.f164950c = false;
        }
        qgp qgp = (qgp) bxvd3.f164949b;
        qgp qgp2 = qgp.f41198d;
        i.getClass();
        qgp.f41202c = i;
        qgp.f41200a |= 2;
        qgp qgp3 = (qgp) bxvd3.mo74062i();
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qgj qgj5 = (qgj) bxvd2.f164949b;
        qgp3.getClass();
        qgj5.f41177i = qgp3;
        qgj5.f41169a |= 64;
        return (qgj) bxvd2.mo74062i();
    }

    /* renamed from: a */
    public final void mo24030a(int i) {
        bxvd bxvd = this.f41187i;
        int i2 = 2;
        if (i != 0) {
            i2 = (i == 1 || i == 2) ? 3 : 4;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = (qgj) bxvd.f164949b;
        qgj qgj2 = qgj.f41167k;
        qgj.f41170b = i2 - 1;
        qgj.f41169a |= 1;
    }

    /* renamed from: b */
    public final void mo24036b(int i) {
        bxvd bxvd = this.f41187i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = (qgj) bxvd.f164949b;
        qgj qgj2 = qgj.f41167k;
        qgj.f41174f = i - 1;
        qgj.f41169a |= 16;
    }

    /* renamed from: a */
    public final void mo24031a(long j) {
        bxvd bxvd = this.f41187i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = (qgj) bxvd.f164949b;
        qgj qgj2 = qgj.f41167k;
        qgj.f41169a |= 2;
        qgj.f41171c = j;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0043, code lost:
        if (r12.equals("com.google.android.c2dm.intent.RECEIVE") != false) goto L_0x006f;
     */
    /* renamed from: a */
    public final void mo24032a(Bundle bundle) {
        bxvd bxvd = this.f41187i;
        int i = 2;
        char c = 3;
        if (!bundle.getString("checkin_task_tag", "").equals("PeriodicTaskTag")) {
            String string = bundle.getString("checkin_source_intent_action", "");
            switch (string.hashCode()) {
                case -1172645946:
                    if (string.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -229777127:
                    if (string.equals("android.intent.action.SIM_STATE_CHANGED")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case -177095062:
                    if (string.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 211362435:
                    if (string.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 366519424:
                    break;
                case 370775467:
                    if (string.equals("android.app.action.DEVICE_OWNER_CHANGED")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 586577647:
                    if (string.equals("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED")) {
                        c = 2;
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
                    i = 4;
                    break;
                case 1:
                    i = 5;
                    break;
                case 2:
                    i = 6;
                    break;
                case 3:
                    i = 7;
                    break;
                case 4:
                    i = 8;
                    break;
                case 5:
                    i = 9;
                    break;
                case 6:
                    i = 10;
                    break;
            }
        } else {
            i = 3;
        }
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = (qgj) bxvd.f164949b;
        qgj qgj2 = qgj.f41167k;
        qgj.f41173e = i - 1;
        qgj.f41169a |= 8;
    }

    /* renamed from: a */
    public final void mo24033a(List list) {
        bxvd bxvd = this.f41187i;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj = qgj.f41167k;
        ((qgj) bxvd.f164949b).f41176h = GeneratedMessageLite.m124030de();
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgj qgj2 = (qgj) bxvd.f164949b;
        if (!qgj2.f41176h.mo73666a()) {
            qgj2.f41176h = GeneratedMessageLite.m124021a(qgj2.f41176h);
        }
        bxsy.m123078a(list, qgj2.f41176h);
    }

    /* renamed from: a */
    public final void mo24034a(qgr qgr) {
        bxvd bxvd = this.f41185g;
        long j = ((qgq) bxvd.f164949b).f41206b + qgr.f41212b;
        if (bxvd.f164950c) {
            bxvd.mo74035c();
            bxvd.f164950c = false;
        }
        qgq qgq = (qgq) bxvd.f164949b;
        qgq qgq2 = qgq.f41203e;
        qgq.f41205a |= 1;
        qgq.f41206b = j;
        bxvd bxvd2 = this.f41185g;
        if (bxvd2.f164950c) {
            bxvd2.mo74035c();
            bxvd2.f164950c = false;
        }
        qgq qgq3 = (qgq) bxvd2.f164949b;
        qgr.getClass();
        qgq3.f41208d = qgr;
        qgq3.f41205a |= 4;
    }
}
