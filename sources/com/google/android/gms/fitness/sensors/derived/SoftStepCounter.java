package com.google.android.gms.fitness.sensors.derived;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class SoftStepCounter extends aacn implements zgf {

    /* renamed from: e */
    private static final srn f32370e = zvt.m46581a();

    /* renamed from: f */
    private static final caah f32371f = bzzn.f172101an;

    /* renamed from: a */
    public final zjd f32372a = new zjd();

    /* renamed from: b */
    public final AtomicLong f32373b = new AtomicLong(0);

    /* renamed from: c */
    public final AtomicInteger f32374c = new AtomicInteger(0);

    /* renamed from: d */
    public final adyq f32375d;

    /* renamed from: g */
    private final Handler f32376g;

    /* renamed from: h */
    private final Context f32377h;

    /* renamed from: i */
    private final caae f32378i;

    /* renamed from: j */
    private final long f32379j;

    /* renamed from: k */
    private final zgm f32380k;

    /* renamed from: l */
    private final AtomicReference f32381l = new AtomicReference();

    /* renamed from: m */
    private final PendingIntent f32382m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SoftStepCounter(Context context, Handler handler, zgm zgm) {
        super("fitness");
        adyq adyq = new adyq(cdzd.f182003a.mo6606a().mo78573am(), cdzd.f182003a.mo6606a().mo78570aj(), (int) cdzd.f182003a.mo6606a().mo78572al(), (float) cdzd.f182003a.mo6606a().mo78571ak(), 0.8f);
        this.f32375d = adyq;
        this.f32377h = context;
        Intent intent = new Intent("com.google.fitness.soft_step_count.ACTION");
        intent.setPackage(yxy.f54800b.f172301b);
        this.f32382m = PendingIntent.getBroadcast(context, 0, intent, 0);
        yyc a = yyd.m44987a();
        a.mo30856a(caad.DERIVED);
        a.mo30857a(f32371f);
        a.mo30855a(yxy.f54800b);
        a.mo30858a(zvn.m46574a(context));
        a.mo30859a("soft_step_counter");
        this.f32378i = a.mo30854a();
        this.f32379j = m23740b();
        this.f32376g = handler;
        this.f32380k = zgm;
        aki.m919a(context).mo873a(this, new IntentFilter("com.google.android.location.internal.SAMPLED_SENSOR"));
    }

    /* renamed from: b */
    public static long m23740b() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    /* renamed from: c */
    private final boolean m23742c() {
        if (this.f32380k.mo31092a(this.f32377h, this.f32382m)) {
            return true;
        }
        bnsl bnsl = (bnsl) f32370e.mo68388c();
        bnsl.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "c", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Unable to unregister from AR for soft step counter");
        return false;
    }

    /* renamed from: a */
    public final bqgg mo19154a() {
        return bqga.m112775a(Status.f30107a);
    }

    /* renamed from: a */
    public final bqgg mo19155a(zgh zgh) {
        zgh zgh2 = zgh;
        if (mo19158a(zgh2.f55011a)) {
            zgg zgg = zgh2.f55012b;
            if (!this.f32381l.compareAndSet(null, zgg)) {
                bnsl bnsl = (bnsl) f32370e.mo68388c();
                bnsl.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "a", 143, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("already registered to: %s", this.f32381l.get());
            }
            if (!this.f32380k.mo31093a(this.f32377h, null, "fitness...SoftStepCounter", TimeUnit.MICROSECONDS.toMillis(zgh2.f55013c), TimeUnit.MICROSECONDS.toMillis(zgh2.f55014d), false, zgi.m45374a(zgh), this.f32382m)) {
                bnsl bnsl2 = (bnsl) f32370e.mo68388c();
                bnsl2.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Unable to register to AR for soft step counter.");
            } else {
                this.f32376g.post(new zja(this, zgg));
                this.f32373b.set(TimeUnit.MICROSECONDS.toNanos(zgh2.f55013c));
                return bqga.m112775a((Object) true);
            }
        }
        return bqga.m112775a((Object) false);
    }

    /* renamed from: b */
    private final boolean m23741b(zgh zgh) {
        if (this.f32380k.mo31093a(this.f32377h, null, "fitness...SoftStepCounter", TimeUnit.MICROSECONDS.toMillis(zgh.f55013c), TimeUnit.MICROSECONDS.toMillis(zgh.f55014d), false, zgi.m45374a(zgh), this.f32382m)) {
            return true;
        }
        bnsl bnsl = (bnsl) f32370e.mo68388c();
        bnsl.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "b", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68405a("Unable to register to AR for soft step counter.");
        return false;
    }

    /* renamed from: b */
    public final bngx mo19161b(caah caah) {
        return mo19159a(caah) ? bngx.m109356a(this.f32378i) : bngx.m109376e();
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        zgg zgg = (zgg) this.f32381l.get();
        if (zgg != null) {
            Serializable serializableExtra = intent.getSerializableExtra("accelEvents");
            bfku bfku = null;
            if (serializableExtra instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) serializableExtra;
                if (!arrayList.isEmpty() && (arrayList.get(0) instanceof bfku)) {
                    bfku = (bfku) arrayList.get(0);
                }
            }
            if (bfku != null && bfku.f114316b != 0) {
                this.f32376g.post(new zjb(this, bfku, (zje) this.f32372a.f55193a, zgg));
            }
        }
    }

    /* renamed from: a */
    public final void mo19156a(PrintWriter printWriter) {
        printWriter.append((CharSequence) "SoftStepCounter.Queue").append((CharSequence) ":").append((CharSequence) Integer.toString(this.f32374c.get())).append((CharSequence) "\n");
        Iterator it = this.f32372a.iterator();
        while (it.hasNext()) {
            printWriter.append((CharSequence) ((zje) it.next()).toString()).append((CharSequence) "\n");
        }
    }

    /* renamed from: a */
    public final void mo19157a(zgg zgg, long j, long j2, long j3) {
        long j4 = this.f32379j;
        if (j >= j4) {
            cadn a = yyk.m45011a(this.f32378i, j4, j, TimeUnit.NANOSECONDS, yyp.m45047a(this.f32374c.get()));
            bxvd bxvd = (bxvd) a.mo74142c(5);
            bxvd.mo73625a((bxvk) a);
            cadm cadm = (cadm) bxvd;
            if (cadm.f164950c) {
                cadm.mo74035c();
                cadm.f164950c = false;
            }
            cadn cadn = (cadn) cadm.f164949b;
            cadn cadn2 = cadn.f172699j;
            int i = cadn.f172701a | 16;
            cadn.f172701a = i;
            cadn.f172707g = j3;
            cadn.f172701a = i | 32;
            cadn.f172708h = j2;
            try {
                zgg.mo30949a(bngx.m109356a((cadn) cadm.mo74062i()));
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) f32370e.mo68387b();
                bnsl.mo68437a(e);
                bnsl.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "a", 307, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Couldn't push event back to listener");
            }
        } else {
            bnsl bnsl2 = (bnsl) f32370e.mo68387b();
            bnsl2.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "a", 291, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68425a("Invalid step count emitted. Start time: %d, End time: %d, Now: %d", Long.valueOf(this.f32379j), Long.valueOf(j), Long.valueOf(j2));
        }
    }

    /* renamed from: a */
    public final boolean mo19158a(caae caae) {
        return this.f32378i.f172326b.equals(caae.f172326b);
    }

    /* renamed from: a */
    public final boolean mo19159a(caah caah) {
        return f32371f.equals(caah);
    }

    /* renamed from: a */
    public final boolean mo19160a(zgg zgg) {
        if (!this.f32380k.mo31092a(this.f32377h, this.f32382m)) {
            bnsl bnsl = (bnsl) f32370e.mo68388c();
            bnsl.mo68432a("com.google.android.gms.fitness.sensors.derived.SoftStepCounter", "c", 202, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Unable to unregister from AR for soft step counter");
            return false;
        } else if (!this.f32381l.compareAndSet(zgg, null)) {
            return false;
        } else {
            this.f32373b.set(0);
            return true;
        }
    }
}
