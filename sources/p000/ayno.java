package p000;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import com.google.android.libraries.bluetooth.BluetoothException;
import com.google.android.libraries.bluetooth.fastpair.CreateBondException;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ayno */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ayno extends ayon {

    /* renamed from: a */
    final /* synthetic */ ayns f98075a;

    /* renamed from: b */
    private boolean f98076b = false;

    /* renamed from: d */
    private boolean f98077d = false;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ayno(ayns ayns) {
        super(ayns.f98083a, ayns.f98084b, ayns.f98086d, "android.bluetooth.device.action.PAIRING_REQUEST", "android.bluetooth.device.action.BOND_STATE_CHANGED", "android.bluetooth.device.action.UUID");
        this.f98075a = ayns;
    }

    /* renamed from: a */
    private final void m84361a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (!defaultAdapter.isDiscovering()) {
            HandlerThread handlerThread = new HandlerThread("TriggerDiscoverStateChangeThread");
            handlerThread.start();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            ayns ayns = this.f98075a;
            aynn aynn = new aynn(ayns.f98083a, ayns.f98084b, new Handler(handlerThread.getLooper()), new String[]{"android.bluetooth.adapter.action.DISCOVERY_STARTED", "android.bluetooth.adapter.action.DISCOVERY_FINISHED"}, atomicBoolean);
            bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
            bnsl.mo68432a("ayno", "a", 574, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68405a("triggerDiscoverStateChange call startDiscovery.");
            defaultAdapter.startDiscovery();
            defaultAdapter.cancelDiscovery();
            try {
                aynn.mo54283a(3000, TimeUnit.MILLISECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e) {
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68388c();
                bnsl2.mo68437a(e);
                bnsl2.mo68432a("ayno", "a", 581, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("triggerDiscoverStateChange failed!");
            }
            handlerThread.quitSafely();
            try {
                handlerThread.join();
            } catch (InterruptedException e2) {
                bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                bnsl3.mo68437a(e2);
                bnsl3.mo68432a("ayno", "a", 588, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl3.mo68405a("triggerDiscoverStateChange backgroundThread.join meet exception!");
            }
            if (atomicBoolean.get()) {
                bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                bnsl4.mo68432a("ayno", "a", 593, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl4.mo68405a("triggerDiscoverStateChange successful.");
            }
        }
    }

    /* renamed from: b */
    private final void m84364b(int i, int i2) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("ayno", "b", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68411a("Bond state changed to %d, reason=%d", i, i2);
        if (i == 10) {
            throw new CreateBondException(2, i2, "Bond broken, reason=%d", Integer.valueOf(i2));
        } else if (i == 12) {
            ayns ayns = this.f98075a;
            if (ayns.f98087e != null && !this.f98077d) {
                ayqr ayqr = new ayqr(ayns.f98088f, "Close BondedReceiver: POSSIBLE_MITM");
                try {
                    mo54284a(new CreateBondException(3, i2, "Unexpectedly bonded without a passkey. It might be a MITM! Unbonding!", new Object[0]));
                    ayqr.close();
                    this.f98075a.mo54164b();
                    return;
                } catch (Throwable th) {
                    bqye.m113761a(th, th);
                }
            } else if (!ayns.f98084b.mo54150w() || (this.f98075a.f98084b.mo54151x() && this.f98076b)) {
                ayqr ayqr2 = new ayqr(this.f98075a.f98088f, "Close BondedReceiver");
                try {
                    close();
                    ayqr2.close();
                    return;
                } catch (Throwable th2) {
                    bqye.m113761a(th, th2);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        throw th;
        throw th;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* renamed from: a */
    private final void m84362a(int i, int i2) {
        String str;
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("ayno", "a", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        if (i2 != Integer.MIN_VALUE) {
            str = String.valueOf(i2);
        } else {
            str = "(none)";
        }
        bnsl.mo68413a("Pairing request, variant=%d, passkey=%s", i, (Object) str);
        if (!this.f98075a.mo54163a("android.permission.BLUETOOTH_PRIVILEGED")) {
            return;
        }
        if (this.f98075a.f98084b.mo54122ac() && i == 4) {
            this.f98077d = true;
            this.f98294c = (long) (this.f98075a.f98084b.mo54094B() - this.f98075a.f98084b.mo54093A());
            m84361a();
            return;
        }
        abortBroadcast();
        if (i == 3) {
            ayns ayns = this.f98075a;
            if (ayns.f98087e == null && ayns.f98084b.mo54124ae()) {
                this.f98075a.f98086d.setPairingConfirmation(true);
                return;
            }
        }
        if (i == 2) {
            this.f98077d = true;
            ayns ayns2 = this.f98075a;
            if (ayns2.f98087e != null) {
                Executors.newSingleThreadExecutor().execute(new aynm(this, i2));
            } else if (ayns2.f98084b.mo54103K()) {
                this.f98075a.f98086d.setPairingConfirmation(true);
            }
        } else {
            this.f98075a.f98086d.setPairingConfirmation(false);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnsi.a(java.lang.String, int, java.lang.Object):void
     arg types: [java.lang.String, int, java.lang.String]
     candidates:
      bnsi.a(java.lang.String, byte, byte):void
      bnsi.a(java.lang.String, double, double):void
      bnsi.a(java.lang.String, int, byte):void
      bnsi.a(java.lang.String, int, int):void
      bnsi.a(java.lang.String, int, long):void
      bnsi.a(java.lang.String, int, boolean):void
      bnsi.a(java.lang.String, long, int):void
      bnsi.a(java.lang.String, long, long):void
      bnsi.a(java.lang.String, long, java.lang.Object):void
      bnsi.a(java.lang.String, long, boolean):void
      bnsi.a(java.lang.String, java.lang.Object, byte):void
      bnsi.a(java.lang.String, java.lang.Object, int):void
      bnsi.a(java.lang.String, java.lang.Object, long):void
      bnsi.a(java.lang.String, java.lang.Object, java.lang.Object):void
      bnsi.a(java.lang.String, java.lang.Object, boolean):void
      bnsi.a(java.lang.String, boolean, java.lang.Object):void
      bnsi.a(java.lang.String, boolean, boolean):void
      bnsi.a(java.lang.String, int, java.lang.Object):void */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0145  */
    /* renamed from: b */
    public final void mo54160b(Intent intent) {
        char c;
        String str;
        String action = intent.getAction();
        int hashCode = action.hashCode();
        if (hashCode != -377527494) {
            if (hashCode != -223687943) {
                if (hashCode == 2116862345 && action.equals("android.bluetooth.device.action.BOND_STATE_CHANGED")) {
                    c = 1;
                    if (c != 0) {
                        int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", Integer.MIN_VALUE);
                        int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_KEY", Integer.MIN_VALUE);
                        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                        bnsl.mo68432a("ayno", "a", 411, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        if (intExtra2 != Integer.MIN_VALUE) {
                            str = String.valueOf(intExtra2);
                        } else {
                            str = "(none)";
                        }
                        bnsl.mo68413a("Pairing request, variant=%d, passkey=%s", intExtra, (Object) str);
                        if (!this.f98075a.mo54163a("android.permission.BLUETOOTH_PRIVILEGED")) {
                            return;
                        }
                        if (!this.f98075a.f98084b.mo54122ac() || intExtra != 4) {
                            abortBroadcast();
                            if (intExtra == 3) {
                                ayns ayns = this.f98075a;
                                if (ayns.f98087e == null && ayns.f98084b.mo54124ae()) {
                                    this.f98075a.f98086d.setPairingConfirmation(true);
                                    return;
                                }
                            }
                            if (intExtra == 2) {
                                this.f98077d = true;
                                ayns ayns2 = this.f98075a;
                                if (ayns2.f98087e != null) {
                                    Executors.newSingleThreadExecutor().execute(new aynm(this, intExtra2));
                                    return;
                                } else if (ayns2.f98084b.mo54103K()) {
                                    this.f98075a.f98086d.setPairingConfirmation(true);
                                    return;
                                } else {
                                    return;
                                }
                            } else {
                                this.f98075a.f98086d.setPairingConfirmation(false);
                                return;
                            }
                        } else {
                            this.f98077d = true;
                            this.f98294c = (long) (this.f98075a.f98084b.mo54094B() - this.f98075a.f98084b.mo54093A());
                            m84361a();
                            return;
                        }
                    } else if (c == 1) {
                        int intExtra3 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", Integer.MIN_VALUE);
                        int intExtra4 = intent.getIntExtra("android.bluetooth.device.extra.REASON", Integer.MIN_VALUE);
                        bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl2.mo68432a("ayno", "b", 600, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl2.mo68411a("Bond state changed to %d, reason=%d", intExtra3, intExtra4);
                        if (intExtra3 == 10) {
                            throw new CreateBondException(2, intExtra4, "Bond broken, reason=%d", Integer.valueOf(intExtra4));
                        } else if (intExtra3 == 12) {
                            ayns ayns3 = this.f98075a;
                            if (ayns3.f98087e != null && !this.f98077d) {
                                ayqr ayqr = new ayqr(ayns3.f98088f, "Close BondedReceiver: POSSIBLE_MITM");
                                try {
                                    mo54284a(new CreateBondException(3, intExtra4, "Unexpectedly bonded without a passkey. It might be a MITM! Unbonding!", new Object[0]));
                                    ayqr.close();
                                    this.f98075a.mo54164b();
                                    return;
                                } catch (Throwable th) {
                                    bqye.m113761a(th, th);
                                }
                            } else if (!ayns3.f98084b.mo54150w() || (this.f98075a.f98084b.mo54151x() && this.f98076b)) {
                                ayqr ayqr2 = new ayqr(this.f98075a.f98088f, "Close BondedReceiver");
                                try {
                                    close();
                                    ayqr2.close();
                                    return;
                                } catch (Throwable th2) {
                                    bqye.m113761a(th, th2);
                                }
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (c == 2 && this.f98075a.f98084b.mo54150w()) {
                        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
                        bnsl bnsl3 = (bnsl) aypn.f98194a.mo68390d();
                        bnsl3.mo68432a("ayno", "a", 633, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                        bnsl3.mo68424a("Got UUIDs for %s: %s", this.f98075a.f98086d, Arrays.toString(parcelableArrayExtra));
                        this.f98076b = true;
                        if (!this.f98075a.f98084b.mo54151x() || this.f98075a.mo54162a()) {
                            ayqr ayqr3 = new ayqr(this.f98075a.f98088f, "Close BondedReceiver");
                            try {
                                close();
                                ayqr3.close();
                                return;
                            } catch (Throwable th3) {
                                bqye.m113761a(th, th3);
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (action.equals("android.bluetooth.device.action.PAIRING_REQUEST")) {
                c = 0;
                if (c != 0) {
                }
            }
        } else if (action.equals("android.bluetooth.device.action.UUID")) {
            c = 2;
            if (c != 0) {
            }
        }
        c = 65535;
        if (c != 0) {
        }
        throw th;
        throw th;
        throw th;
    }

    /* renamed from: a */
    private final void m84363a(Parcelable[] parcelableArr) {
        bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
        bnsl.mo68432a("ayno", "a", 633, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
        bnsl.mo68424a("Got UUIDs for %s: %s", this.f98075a.f98086d, Arrays.toString(parcelableArr));
        this.f98076b = true;
        if (!this.f98075a.f98084b.mo54151x() || this.f98075a.mo54162a()) {
            ayqr ayqr = new ayqr(this.f98075a.f98088f, "Close BondedReceiver");
            try {
                close();
                ayqr.close();
                return;
            } catch (Throwable th) {
                bqye.m113761a(th, th);
            }
        } else {
            return;
        }
        throw th;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo54159a(int i) {
        ayqr ayqr;
        ayqr ayqr2;
        ayqr ayqr3;
        ayqr ayqr4;
        boolean z;
        ayqr ayqr5;
        try {
            ayqr ayqr6 = new ayqr(this.f98075a.f98088f, "Exchange passkey");
            try {
                this.f98075a.f98085c.mo54180a(bvjc.PASSKEY_EXCHANGE);
                bmxy.m108581a(this.f98075a.f98087e);
                ayri a = this.f98075a.f98087e.f98080b.mo54203a();
                ayrh c = a.mo54316c(ayod.f98113a, ayoc.f98112a);
                bnsl bnsl = (bnsl) aypn.f98194a.mo68390d();
                bnsl.mo68432a("ayno", "a", 479, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68405a("Sending local passkey.");
                ayqr = new ayqr(this.f98075a.f98088f, "Encrypt passkey");
                byte[] a2 = ayoc.m84382a(ayob.SEEKER, this.f98075a.f98087e.f98079a, i);
                ayqr.close();
                ayqr2 = new ayqr(this.f98075a.f98088f, "Send passkey to remote");
                a.mo54313a(ayod.f98113a, ayoc.f98112a, a2);
                ayqr2.close();
                bnsl bnsl2 = (bnsl) aypn.f98194a.mo68390d();
                bnsl2.mo68432a("ayno", "a", 492, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl2.mo68405a("Waiting for remote passkey.");
                ayqr3 = new ayqr(this.f98075a.f98088f, "Wait for remote passkey");
                byte[] a3 = c.mo54309a(TimeUnit.SECONDS.toMillis((long) this.f98075a.f98084b.mo54119a()));
                ayqr3.close();
                ayqr4 = new ayqr(this.f98075a.f98088f, "Decrypt passkey");
                int a4 = ayoc.m84381a(ayob.PROVIDER, this.f98075a.f98087e.f98079a, a3);
                ayqr4.close();
                this.f98075a.f98085c.mo54183b();
                if (i == a4) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    bnsl bnsl3 = (bnsl) aypn.f98194a.mo68387b();
                    bnsl3.mo68432a("ayno", "a", 519, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl3.mo68411a("Passkey incorrect, local=%s, remote=%s", i, a4);
                } else {
                    bnsl bnsl4 = (bnsl) aypn.f98194a.mo68390d();
                    bnsl4.mo68432a("ayno", "a", 517, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                    bnsl4.mo68405a("Passkey correct.");
                }
                ayqt ayqt = this.f98075a.f98088f;
                StringBuilder sb = new StringBuilder(26);
                sb.append("Confirm the pairing: ");
                sb.append(z);
                ayqr5 = new ayqr(ayqt, sb.toString());
                this.f98075a.f98086d.setPairingConfirmation(z);
                ayqr5.close();
                ayqr6.close();
                return;
                throw th;
                throw th;
                throw th;
                throw th;
                throw th;
            } catch (Throwable th) {
                ayqr6.close();
                throw th;
            }
        } catch (BluetoothException | InterruptedException | GeneralSecurityException | ExecutionException | TimeoutException e) {
            this.f98075a.f98085c.mo54181a(e);
            mo54284a(e);
        } catch (Throwable th2) {
            bqye.m113761a(th, th2);
        }
    }
}
