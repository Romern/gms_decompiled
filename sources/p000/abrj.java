package p000;

import android.content.Context;
import android.os.SystemClock;
import android.util.TimingLogger;
import com.google.android.gms.icing.nativeindex.NativeIndex;

/* renamed from: abrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class abrj extends acpn {

    /* renamed from: a */
    final /* synthetic */ boolean f58037a;

    /* renamed from: b */
    final /* synthetic */ boolean f58038b;

    /* renamed from: c */
    final /* synthetic */ bnic f58039c;

    /* renamed from: d */
    final /* synthetic */ abrv f58040d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abrj(abrv abrv, bqbd bqbd, boolean z, boolean z2, bnic bnic) {
        super(bqbd);
        this.f58040d = abrv;
        this.f58037a = z;
        this.f58038b = z2;
        this.f58039c = bnic;
    }

    /* renamed from: b */
    public final void mo32291b() {
        bpxm bpxm;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        TimingLogger timingLogger = new TimingLogger("Icing", "post-init");
        abrv abrv = this.f58040d;
        acrl acrl = abrv.f58071g;
        Context context = abrv.f58066b;
        if (acrl.mo33029e()) {
            aeat.m51532a(context).mo33984a(apsu.m70924a(false));
        }
        if (this.f58037a) {
            this.f58040d.f58082r.mo32434b();
        } else {
            if (this.f58038b) {
                abrv abrv2 = this.f58040d;
                bnre i = abrv2.mo32314b().mo32541c().listIterator();
                while (i.hasNext()) {
                    absr absr = (absr) i.next();
                    if (!abrv2.f58078n.mo43402a(absr.f58144i, absr.f58137b, abrv.m48116b(abzm.m48656d(absr)))) {
                        abrv2.f58083s.mo32447a("add_all_active_corpora_failed");
                        absg.m48192b("Add corpus from %s failed", absr.f58140e);
                    }
                }
            }
            NativeIndex nativeIndex = this.f58040d.f58078n;
            if (this.f58038b && !nativeIndex.mo43403a(abzu.m48730a())) {
                absg.m48196c("Failed to rebuild index.");
            }
            try {
                bpxm = (bpxm) GeneratedMessageLite.m124014a(bpxm.f139734c, NativeIndex.nativeRestoreIndex(nativeIndex.f79071b, abzu.m48730a().serializeToBytes()));
            } catch (bxwf e) {
                absg.m48189a(e, "Failed parsing index restoration stats response");
                bxvd da = bpxm.f139734c.mo74144da();
                if (da.f164950c) {
                    da.mo74035c();
                    da.f164950c = false;
                }
                bpxm bpxm2 = (bpxm) da.f164949b;
                bpxm2.f139737b = 4;
                bpxm2.f139736a |= 1;
                bpxm = (bpxm) da.mo74062i();
            }
            timingLogger.addSplit("index-restored");
            abym abym = this.f58040d.f58083s;
            long k = cema.f182934a.mo6606a().mo79309k();
            if (abym.mo32452a(k)) {
                bxvd da2 = bpxb.f139606R.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                bpxb bpxb = (bpxb) da2.f164949b;
                bpxm.getClass();
                bpxb.f139615H = bpxm;
                bpxb.f139626b |= 2048;
                abym.mo32438a(6012, da2, k);
            }
            if (System.currentTimeMillis() > acrl.mo33024c() + ((Long) abzt.f58987g.mo58455c()).longValue()) {
                absg.m48196c("No maintenance for too long");
                abym.mo32447a("no_maint_too_long");
                this.f58040d.mo32330m();
                timingLogger.addSplit("forced-maintenance");
            }
            bnic bnic = this.f58039c;
            if (bnic != null && !bnic.isEmpty()) {
                absg.m48197c("%d corpora need re-polling", Integer.valueOf(this.f58039c.size()));
                bnrd a = this.f58039c.iterator();
                while (a.hasNext()) {
                    acak acak = (acak) a.next();
                    abss b = this.f58040d.mo32314b().mo32534b(acak);
                    if (b != null) {
                        absy absy = b.f58158c;
                        if (absy == null) {
                            absy = absy.f58176h;
                        }
                        int a2 = absx.m48236a(absy.f58180c);
                        if (a2 == 0 || a2 == 1) {
                            absr absr2 = b.f58157b;
                            if (absr2 == null) {
                                absr2 = absr.f58134s;
                            }
                            if (abzm.m48653a(absr2)) {
                                this.f58040d.f58079o.mo32578a(acak);
                            }
                        }
                    }
                }
                abvx abvx = this.f58040d.f58081q;
                if (abvx != null) {
                    abvx.mo32375b();
                }
            }
            if (!nativeIndex.mo43414i()) {
                absg.m48196c("Failed to delete usage reports.");
            }
            Context context2 = this.f58040d.f58066b;
            if (acrl.mo33031f()) {
                abpk.m48040a(context2);
            }
        }
        this.f58040d.mo32307a(bpzm.POST_INIT, elapsedRealtime);
        timingLogger.dumpToLog();
        absg.m48196c("Post-init done");
    }
}
