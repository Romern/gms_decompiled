package p000;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.libraries.messaging.lighter.model.ConversationId;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: bcjl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bcjl implements ciir {

    /* renamed from: a */
    final /* synthetic */ bqgy f104326a;

    /* renamed from: b */
    final /* synthetic */ UUID f104327b;

    /* renamed from: c */
    final /* synthetic */ bcjm f104328c;

    /* renamed from: d */
    public ciik f104329d;

    /* renamed from: e */
    final /* synthetic */ bcmw f104330e;

    /* renamed from: f */
    final /* synthetic */ bbua f104331f;

    public bcjl(bcjm bcjm, bqgy bqgy, bbua bbua, bcmw bcmw, UUID uuid) {
        this.f104328c = bcjm;
        this.f104326a = bqgy;
        this.f104331f = bbua;
        this.f104330e = bcmw;
        this.f104327b = uuid;
    }

    /* renamed from: a */
    public final void mo25548a() {
        bbua bbua = this.f104331f;
        String valueOf = String.valueOf(bbua.f103376a.f103381b.mo57058b().mo57074e().mo60492a());
        bbos.m88289a("MsgReceiver", valueOf.length() == 0 ? new String("BindV2 stream onCompleted for ") : "BindV2 stream onCompleted for ".concat(valueOf));
        bbua.f103376a.mo56431i();
        if (((Boolean) bbqt.m88417a(bbua.f103376a.f103382c).f103164f.mo58455c()).booleanValue()) {
            bbqw.m88429a();
            if (bbqw.m88430a(bbua.f103376a.f103382c)) {
                bbua.f103376a.mo56428f();
            }
        }
        bbua.f103376a.f103391l.mo56380a();
        this.f104329d = null;
    }

    /* renamed from: a */
    public final void mo56933a(ciik ciik) {
        this.f104326a.mo69138b(Long.valueOf(SystemClock.elapsedRealtime()));
        this.f104329d = ciik;
        this.f104331f.f103377b = new bcjk(this);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo25549a(Object obj) {
        bbyo bbyo;
        String str;
        cbkj cbkj;
        bcmw bcmw = this.f104330e;
        cbkx cbkx = (cbkx) ((bxxc) obj);
        bbyn bbyn = new bbyn(null);
        int i = cbkx.f177455a;
        if (i == 2) {
            bcoh bcoh = bcmw.f104507a;
            Context context = bcmw.f104508b;
            bmxv a = bclm.m89252a((cbkj) cbkx.f177456b, bcoh, context, bcmw.f104509c, bcfx.m88929a(context));
            bbyn.getClass();
            a.mo66810a((bmxj) new bcmu(bbyn));
            if (cbkx.f177455a == 2) {
                cbkj = (cbkj) cbkx.f177456b;
            } else {
                cbkj = cbkj.f177405k;
            }
            bmxv a2 = bclm.m89251a(cbkj);
            bbyn.getClass();
            a2.mo66810a((bmxj) new bcmv(bbyn));
            bbyo = bbyn.mo56549a();
        } else if (i == 3 || i == 4 || i == 5) {
            bbyo = bbyn.mo56549a();
        } else {
            String valueOf = String.valueOf(cbkx);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("non-InboxMessage received");
            sb.append(valueOf);
            bbos.m88294d("ReceiveMessagesHdlr", sb.toString());
            bbyo = bbyn.mo56549a();
        }
        bbua bbua = this.f104331f;
        bbov.m88299a();
        bbyb bbyb = (bbyb) bbyo;
        long j = 0;
        if (bbyb.f103741b.mo66813a()) {
            if (((Long) bbqt.m88417a(bbua.f103376a.f103382c).f103079A.mo58455c()).longValue() <= 0) {
                bbua.f103376a.mo56416a(Collections.singletonList((String) bbyb.f103741b.mo66814b()));
            } else {
                synchronized (bbua.f103376a) {
                    if (bbua.f103376a.f103393n.isEmpty()) {
                        bbub bbub = bbua.f103376a;
                        bbub.f103398s.postDelayed(new bbtz(bbub), ((Long) bbqt.m88417a(bbua.f103376a.f103382c).f103079A.mo58455c()).longValue());
                    }
                    bbyb bbyb2 = (bbyb) bbyo;
                    bbyb bbyb3 = (bbyb) bbyo;
                    bbua.f103376a.f103393n.add((String) ((bbyb) bbyo).f103741b.mo66814b());
                }
            }
        }
        if (bbyb.f103740a.mo66813a()) {
            bbua.f103376a.mo56418a((bcia) bbyb.f103740a.mo66814b());
            bbua.f103376a.mo56424b(Arrays.asList((bcia) bbyb.f103740a.mo66814b()));
        }
        bbua.f103376a.f103391l.mo56380a();
        try {
            if (this.f104326a.isDone()) {
                j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) this.f104326a.get()).longValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88290a("Backend", "Unexpected exception", e);
        }
        bcmw bcmw2 = this.f104330e;
        bcfx bcfx = this.f104328c.f104334c;
        if (bbyb.f103740a.mo66813a()) {
            int l = ((bcia) bbyb.f103740a.mo66814b()).mo56918l();
            int i2 = l - 1;
            if (l != 0) {
                if (i2 == 0) {
                    str = ((bcia) bbyb.f103740a.mo66814b()).mo56912e().mo57359a();
                } else if (i2 == 1) {
                    str = ((bcia) bbyb.f103740a.mo66814b()).mo56913f().mo56855a();
                } else if (i2 == 2) {
                    str = ((bcia) bbyb.f103740a.mo66814b()).mo56914g().mo56861b();
                } else if (i2 == 3) {
                    str = ((bcia) bbyb.f103740a.mo66814b()).mo56915h().mo56875a();
                } else if (i2 != 4) {
                    bbos.m88294d("ReceiveMessagesHdlr", "Unknown message type");
                    return;
                } else {
                    ConversationId j2 = ((bcia) bbyb.f103740a.mo66814b()).mo56917j();
                    if (j2 == null) {
                        bbos.m88294d("ReceiveMessagesHdlr", "Cloud update message without conversationId");
                        return;
                    }
                    str = j2.toString();
                }
                bcnr q = bcns.m89409q();
                q.mo57011b(10003);
                q.mo57012b(bcmw2.f104507a.mo57058b().mo57074e());
                q.mo57010a(bcmw2.f104507a.mo57059c().mo73781l());
                q.mo57013b(str);
                q.mo57014c(11);
                q.mo57003a(4);
                q.mo57004a(j);
                bcfx.mo56753a(q.mo57002a());
                return;
            }
            throw null;
        }
    }

    /* renamed from: a */
    public final void mo25550a(Throwable th) {
        int i;
        long j = 0;
        try {
            if (this.f104326a.isDone()) {
                j = TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) this.f104326a.get()).longValue());
            }
        } catch (InterruptedException | ExecutionException e) {
            bbos.m88290a("Backend", "Unexpected exception", e);
        }
        bbua bbua = this.f104331f;
        bbua.f103376a.mo56431i();
        bbub bbub = bbua.f103376a;
        chuv a = chuv.m149608a(th);
        if (a == null || !chuv.f189216c.f189233s.equals(a.f189233s)) {
            String valueOf = String.valueOf(bbub.f103381b.mo57058b().mo57074e().mo60492a());
            bbos.m88292b("MsgReceiver", valueOf.length() == 0 ? new String("BindV2 stream error for ") : "BindV2 stream error for ".concat(valueOf), th);
            bbqz bbqz = bbub.f103391l;
            Context context = bbub.f103382c;
            bqgj bqgj = bbub.f103387h;
            if (!((Boolean) chqe.f188991b.mo58455c()).booleanValue() || !bbqk.m88407a(context) || !chuv.f189229p.equals(a) || bbqz.f103189b <= 0) {
                bbub.f103389j.mo56343a(4);
            } else {
                int nextInt = bbqz.f103188a.nextInt(((bceg) bcen.f104044e).f104031c);
                if (bbqz.f103189b != 3) {
                    double d = ((bceg) bcen.f104044e).f104030b;
                    double d2 = (double) bbqz.f103190c;
                    Double.isNaN(d2);
                    i = ((int) (d * d2)) + nextInt;
                } else {
                    i = ((int) ((bceg) bcen.f104044e).f104029a) + nextInt;
                }
                bbqz.f103190c = i;
                bbqz.f103189b--;
                bbub.getClass();
                bbqz.f103191d = bbqi.m88404a((long) i, new bbqy(bbub), bqgj);
            }
        } else {
            String valueOf2 = String.valueOf(bbub.f103381b.mo57058b().mo57074e().mo60492a());
            bbos.m88290a("MsgReceiver", valueOf2.length() == 0 ? new String("BindV2 stream CANCELLED for ") : "BindV2 stream CANCELLED for ".concat(valueOf2), th);
        }
        bcmw bcmw = this.f104330e;
        UUID uuid = this.f104327b;
        int i2 = chuv.m149608a(th).f189233s.f189211r;
        bcfx bcfx = this.f104328c.f104334c;
        bcnr q = bcns.m89409q();
        q.mo57011b(10003);
        q.mo57012b(bcmw.f104507a.mo57058b().mo57074e());
        q.mo57010a(bcmw.f104507a.mo57059c().mo73781l());
        q.mo57013b(uuid.toString());
        q.mo57014c(11);
        q.mo57009a(Integer.valueOf(i2));
        q.mo57003a(5);
        q.mo57004a(j);
        bcfx.mo56753a(q.mo57002a());
        this.f104329d = null;
    }
}
