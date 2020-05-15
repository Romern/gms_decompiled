package p000;

import android.os.RemoteException;
import com.google.android.gms.carsetup.CarInfoInternal;

/* renamed from: nnm */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class nnm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f36098a;

    /* renamed from: b */
    final /* synthetic */ String f36099b;

    /* renamed from: c */
    final /* synthetic */ biww f36100c;

    /* renamed from: d */
    final /* synthetic */ nnn f36101d;

    public nnm(nnn nnn, String str, String str2, biww biww) {
        this.f36101d = nnn;
        this.f36098a = str;
        this.f36099b = str2;
        this.f36100c = biww;
    }

    public final void run() {
        orf orf;
        noj noj = this.f36101d.f36102a;
        String str = this.f36098a;
        String str2 = this.f36099b;
        biww biww = this.f36100c;
        nkq nkq = noj.f36237x;
        if (nkq != null) {
            CarInfoInternal carInfoInternal = noj.f36162G;
            carInfoInternal.f29544f = nkq.f35908j;
            carInfoInternal.f29546h = noj.f36238y.f36334d;
            carInfoInternal.f29545g = str;
            carInfoInternal.f29547i = str2;
            if (biww == null) {
                biww = biww.UNKNOWN_SECURITY_MODE;
            }
            noj.f36162G.f29548j = biww.f122145k;
            try {
                orf = new orf(noj.f36219f);
                orf.f38270b.mo22643a(noj.f36162G);
                orf.close();
                return;
            } catch (RemoteException e) {
                bnsi b = noj.f36155b.mo68387b();
                b.mo68432a("noj", "a", 4052, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                b.mo68405a("Error while updating car wifi info");
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }
}
