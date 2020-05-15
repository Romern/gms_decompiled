package p000;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.RemoteException;
import com.felicanetworks.mfc.mfi.MfiClientException;
import com.google.android.libraries.bluetooth.fastpair.Event;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: ayox */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayox {

    /* renamed from: a */
    public Short f98141a;

    /* renamed from: b */
    public BluetoothDevice f98142b;

    /* renamed from: c */
    public String f98143c;

    /* renamed from: d */
    public ayqj f98144d;

    /* renamed from: e */
    public ayqe f98145e;

    /* renamed from: f */
    public CountDownLatch f98146f;

    /* renamed from: g */
    private final ArrayDeque f98147g;

    /* renamed from: h */
    private final ServiceConnection f98148h = new ayov(this);

    /* renamed from: i */
    private final ahts f98149i;

    public ayox(ahts ahts) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f98147g = arrayDeque;
        this.f98149i = ahts;
        arrayDeque.push(new ayow(bvjc.UNKNOWN_EVENT_TYPE));
    }

    /* renamed from: d */
    private final ayou m84399d() {
        ayow ayow = (ayow) this.f98147g.pop();
        ayou f = Event.m94486f();
        f.mo54175a(ayow.f98139a);
        f.mo54174a(ayow.f98140b);
        Short sh = this.f98141a;
        if (sh != null) {
            f.f98133a = sh;
        }
        BluetoothDevice bluetoothDevice = this.f98142b;
        if (bluetoothDevice != null) {
            f.f98134b = bluetoothDevice;
        }
        if (this.f98147g.isEmpty()) {
            this.f98147g.push(new ayow(bvjc.UNKNOWN_EVENT_TYPE));
        }
        return f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54178a(Context context) {
        context.unbindService(this.f98148h);
        this.f98145e = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo54182a() {
        return this.f98145e != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo54183b() {
        Event a = m84399d().mo54173a();
        ahts ahts = this.f98149i;
        if (ahts != null) {
            ahts.mo37156a(a);
        }
        ayqe ayqe = this.f98145e;
        if (ayqe != null) {
            try {
                ayqe.mo54219a(a);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ayox", "b", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPair: Failed to send succeeded event.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo54184c() {
        ayow ayow = (ayow) this.f98147g.peek();
        return (ayow == null || ayow.f98139a == bvjc.UNKNOWN_EVENT_TYPE) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54179a(Context context, String str, ayqj ayqj) {
        if (!mo54182a()) {
            this.f98143c = str;
            this.f98144d = ayqj;
            this.f98146f = new CountDownLatch(1);
            bnsp bnsp = aypn.f98194a;
            Intent intent = new Intent("com.google.android.gms.nearby.discovery.fastpair.ACTION_LOGGING");
            intent.setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsBoundBrokerService");
            try {
                if (context.bindService(intent, this.f98148h, 1)) {
                    this.f98146f.await(500, TimeUnit.MILLISECONDS);
                }
            } catch (SecurityException e) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ayox", "a", 111, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPair: Failed binding to logging service.");
            } catch (InterruptedException e2) {
                Thread.currentThread().interrupt();
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                bnsl2.mo68437a(e2);
                bnsl2.mo68432a("ayox", "a", 114, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("FastPair: Interrupted while binding to logging.");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54180a(bvjc bvjc) {
        this.f98147g.push(new ayow(bvjc));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo54181a(Exception exc) {
        ayou d = m84399d();
        d.f98135c = exc;
        Event a = d.mo54173a();
        ahts ahts = this.f98149i;
        if (ahts != null) {
            ahts.mo37157a(a, exc);
        }
        ayqe ayqe = this.f98145e;
        if (ayqe != null) {
            try {
                ayqe.mo54221b(a);
            } catch (RemoteException e) {
                bnsl bnsl = (bnsl) aypn.f98194a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("ayox", "a", (int) AndroidInputTypeSignal.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("FastPair: Failed to send failed event.");
            }
        }
    }
}
