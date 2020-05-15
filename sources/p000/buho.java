package p000;

import android.hardware.location.ContextHubClient;
import android.hardware.location.ContextHubClientCallback;
import android.hardware.location.ContextHubInfo;
import android.hardware.location.NanoAppMessage;

/* renamed from: buho */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buho extends ContextHubClientCallback {

    /* renamed from: a */
    final /* synthetic */ buhm f153877a;

    public buho(buhm buhm) {
        this.f153877a = buhm;
    }

    public final void onHubReset(ContextHubClient contextHubClient) {
        ((buhb) this.f153877a.f153868b).mo72658b(contextHubClient.getAttachedHub().getId());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [bugn, buhn], assign insn: 0x0045: IGET  (r1v5 ? I:buhn) = (r1v4 buhm) buhm.b buhn */
    public final void onMessageFromNanoApp(ContextHubClient contextHubClient, NanoAppMessage nanoAppMessage) {
        buhs a = buhs.m119543a(nanoAppMessage.getMessageBody());
        if (a == null) {
            String valueOf = String.valueOf(nanoAppMessage);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to parse nanoapp message: ");
            sb.append(valueOf);
            sb.toString();
            return;
        }
        buhv a2 = this.f153877a.f153872f.mo72695a(a);
        if (a2 != null && a2.f153901a) {
            buhd buhd = a2.f153902b;
            buhc a3 = this.f153877a.mo72676a(nanoAppMessage.getNanoAppId());
            ? r1 = this.f153877a.f153868b;
            buhb buhb = (buhb) r1;
            if (buhb.mo72660c(contextHubClient.getAttachedHub().getId())) {
                bgbq bgbq = buhb.f153817o;
                if (!(bgbq == null || buhd == null)) {
                    bgbq.mo62620a(a3, buhd.f153831a);
                }
                ((buha) r1).mo72649a(buhb.mo72655a((bugr) a3), r1, a3, buhd);
            }
        }
    }

    public final void onNanoAppLoaded(ContextHubClient contextHubClient, long j) {
        buhn buhn = this.f153877a.f153868b;
        ContextHubInfo attachedHub = contextHubClient.getAttachedHub();
        buhc a = this.f153877a.mo72676a(j);
        buhb buhb = (buhb) buhn;
        if (buhb.mo72660c(attachedHub.getId())) {
            synchronized (buhb.f153813k) {
                ((buhb) buhn).f153814l.put(a.f153823a, a);
            }
        }
    }

    public final void onNanoAppUnloaded(ContextHubClient contextHubClient, long j) {
        buhn buhn = this.f153877a.f153868b;
        ContextHubInfo attachedHub = contextHubClient.getAttachedHub();
        buhc a = this.f153877a.mo72676a(j);
        buhb buhb = (buhb) buhn;
        if (buhb.mo72660c(attachedHub.getId())) {
            synchronized (buhb.f153813k) {
                ((buhb) buhn).f153814l.delete(a.f153823a);
            }
        }
    }
}
