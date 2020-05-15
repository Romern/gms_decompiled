package p000;

import android.content.Context;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: buvo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class buvo implements bvbw {

    /* renamed from: i */
    public static final /* synthetic */ int f155057i = 0;

    /* renamed from: j */
    private static final bvcl f155058j = bvcl.m120913b();

    /* renamed from: a */
    final String f155059a;

    /* renamed from: b */
    blux f155060b;

    /* renamed from: c */
    public blun f155061c;

    /* renamed from: d */
    public final BlockingQueue f155062d = new LinkedBlockingQueue();

    /* renamed from: e */
    bvdb f155063e;

    /* renamed from: f */
    public final CountDownLatch f155064f = new CountDownLatch(1);

    /* renamed from: g */
    public final CountDownLatch f155065g = new CountDownLatch(1);

    /* renamed from: h */
    final bluw f155066h = new buvk(this);

    /* renamed from: k */
    private final Context f155067k;

    /* renamed from: l */
    private final String f155068l;

    /* renamed from: m */
    private final boolean f155069m;

    /* renamed from: n */
    private Future f155070n;

    public buvo(Context context, blvp blvp) {
        this.f155067k = context;
        this.f155069m = false;
        this.f155059a = blvp.mo66756c();
        this.f155060b = new blvx(blvp, this.f155066h);
        this.f155068l = ((bvci) f155058j).mo73313a();
    }

    /* renamed from: a */
    public final String mo73141a() {
        return this.f155068l;
    }

    /* renamed from: b */
    public final byte[] mo73143b() {
        if (mo73146d()) {
            return this.f155063e.mo73143b();
        }
        throw new IOException("BleGattConnection disconnected");
    }

    /* renamed from: c */
    public final synchronized void mo73144c() {
        if (this.f155069m && this.f155060b == null) {
            this.f155070n = new blvi(this.f155067k, null, buvj.f155043a, buxb.f155204b, buxb.f155206d, buxb.f155205c, 23).mo66750a(this.f155059a);
            try {
                srn srn = bvcm.f155598a;
                this.f155061c = (blun) this.f155070n.get();
                blvv blvv = new blvv(this.f155061c, this.f155066h);
                this.f155060b = blvv;
                blvv.mo66733f();
            } catch (InterruptedException e) {
                e = e;
                throw new IOException("Failed to create connection", e);
            } catch (ExecutionException e2) {
                e = e2;
                throw new IOException("Failed to create connection", e);
            }
        }
        try {
            this.f155064f.await();
        } catch (InterruptedException e3) {
            bnsl bnsl = (bnsl) bvcm.f155598a.mo68388c();
            bnsl.mo68432a("buvo", "c", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_POSTAL_ADDRESS, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("Interrupted while waiting for getting connected");
        }
        if (!this.f155060b.mo66708c()) {
            bnsl bnsl2 = (bnsl) bvcm.f155598a.mo68388c();
            bnsl2.mo68432a("buvo", "c", 116, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("BleGattConnection fail to connect");
            return;
        }
        bvdb bvdb = new bvdb(this.f155069m, new buvl(this.f155062d), new buvm(this.f155060b));
        this.f155063e = bvdb;
        bvdb.mo73144c();
    }

    public final void close() {
        srn srn = bvcm.f155598a;
        if (this.f155060b == null) {
            Future future = this.f155070n;
            if (future != null) {
                future.cancel(true);
            }
        } else if (this.f155065g.getCount() > 0) {
            this.f155060b.mo66698a();
        }
    }

    /* renamed from: d */
    public final boolean mo73146d() {
        bvdb bvdb;
        blux blux = this.f155060b;
        return blux != null && blux.mo66708c() && (bvdb = this.f155063e) != null && bvdb.f155629a;
    }

    /* renamed from: e */
    public final buzo mo73147e() {
        bxvd da = buzo.f155407d.mo74144da();
        String str = this.f155068l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo = (buzo) da.f164949b;
        str.getClass();
        buzo.f155409a |= 1;
        buzo.f155410b = str;
        bxvf bxvf = (bxvf) buzp.f155413c.mo74144da();
        if (bxvf.f164950c) {
            bxvf.mo74035c();
            bxvf.f164950c = false;
        }
        buzp buzp = (buzp) bxvf.f164949b;
        buzp.f155416b = 0;
        buzp.f155415a |= 1;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzo buzo2 = (buzo) da.f164949b;
        buzp buzp2 = (buzp) bxvf.mo74062i();
        buzp2.getClass();
        buzo2.f155411c = buzp2;
        buzo2.f155409a |= 2;
        return (buzo) da.mo74062i();
    }

    /* renamed from: f */
    public final boolean mo73148f() {
        return this.f155069m;
    }

    /* renamed from: g */
    public final buzx mo73149g() {
        bxvd da = buzx.f155443c.mo74144da();
        String str = this.f155068l;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        buzx buzx = (buzx) da.f164949b;
        str.getClass();
        buzx.f155445a |= 1;
        buzx.f155446b = str;
        return (buzx) da.mo74062i();
    }

    /* renamed from: a */
    public final void mo73142a(byte[] bArr) {
        if (mo73146d()) {
            this.f155063e.mo73142a(bArr);
            return;
        }
        throw new IOException("BleGattConnection disconnected");
    }

    public buvo(Context context, boolean z, String str) {
        this.f155067k = context;
        this.f155069m = z;
        this.f155059a = str;
        this.f155068l = ((bvci) f155058j).mo73313a();
    }
}
