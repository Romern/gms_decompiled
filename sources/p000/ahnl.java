package p000;

import java.io.IOException;

/* renamed from: ahnl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
abstract class ahnl implements Runnable {

    /* renamed from: a */
    final String f67629a;

    /* renamed from: b */
    final ahkv f67630b;

    /* renamed from: c */
    final String f67631c;

    /* renamed from: d */
    final /* synthetic */ ahnp f67632d;

    public ahnl(ahnp ahnp, String str, ahkv ahkv, String str2) {
        this.f67632d = ahnp;
        this.f67629a = str;
        this.f67630b = ahkv;
        this.f67631c = str2;
    }

    /* renamed from: a */
    public abstract boolean mo36889a(ahna ahna);

    public void run() {
        ahna ahna = null;
        while (true) {
            ahna a = this.f67632d.f67634a.mo36876a(this.f67631c);
            if (a == null) {
                ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointManager quit overall %s loop for endpoint %s because there's no EndpointChannel for it.", this.f67629a, this.f67631c);
                break;
            }
            if (ahna != null) {
                if (a == ahna) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68425a("EndpointManager quit overall %s loop for endpoint %s because the currently registered %s EndpointChannel is in a failed state.", this.f67629a, this.f67631c, a.mo36795a());
                    break;
                } else {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68426a("EndpointManager switched its %s loop from %s EndpointChannel to %s EndpointChannel for endpoint %s.", this.f67629a, ahna.mo36795a(), a.mo36795a(), this.f67631c);
                    ahna = null;
                }
            }
            try {
                if (!mo36889a(a)) {
                    ((bnsl) ahkm.f67363a.mo68390d()).mo68424a("EndpointManager quit overall %s loop for endpoint %s.", this.f67629a, this.f67631c);
                    break;
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ahkm.f67363a.mo68390d();
                bnsl.mo68437a(e);
                bnsl.mo68425a("EndpointManager failed the next %s read/write for endpoint %s over its %s EndpointChannel.", this.f67629a, this.f67631c, a.mo36795a());
                ahna = a;
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) ahkm.f67363a.mo68390d();
                bnsl2.mo68437a(e2);
                bnsl2.mo68424a("EndpointManager quit overall %s loop for endpoint %s because it was interrupted.", this.f67629a, this.f67631c);
            }
        }
        this.f67632d.mo36892a(this.f67630b, this.f67631c);
    }
}
