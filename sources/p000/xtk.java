package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothGattServer;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelUuid;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorScan$2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/* renamed from: xtk */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class xtk {

    /* renamed from: k */
    public static final sek f53046k = new sek(new String[]{"CableAuthenticatorSession"}, (short[]) null);

    /* renamed from: a */
    public final Context f53047a;

    /* renamed from: b */
    public final xwj f53048b;

    /* renamed from: c */
    public final xth f53049c;

    /* renamed from: d */
    public final xdx f53050d;

    /* renamed from: e */
    public final xwn f53051e;

    /* renamed from: f */
    public xtj f53052f = xtj.NOT_STARTED;

    /* renamed from: g */
    public xuh f53053g;

    /* renamed from: h */
    public xub f53054h;

    /* renamed from: i */
    public xtu f53055i;

    /* renamed from: j */
    public final boolean f53056j;

    /* renamed from: l */
    public xuc f53057l;

    /* renamed from: m */
    private final xto f53058m;

    /* renamed from: n */
    private final Handler f53059n = new adzt(Looper.getMainLooper());

    /* renamed from: o */
    private Runnable f53060o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public xsz f53061p;

    /* renamed from: q */
    private xtm f53062q;

    /* renamed from: r */
    private final int f53063r;

    public xtk(Context context, xwj xwj, xto xto, xdx xdx, xth xth, int i, boolean z) {
        this.f53047a = context;
        this.f53048b = xwj;
        this.f53058m = xto;
        this.f53049c = xth;
        this.f53056j = z;
        this.f53050d = xdx;
        this.f53063r = i;
        this.f53051e = xwm.m43527b(context);
    }

    /* renamed from: c */
    public final boolean mo30123c() {
        return this.f53052f == xtj.SCANNING_FOR_CLIENT || this.f53052f == xtj.WAITING_FOR_USER_APPROVAL || this.f53052f == xtj.ADVERTISING_TO_CLIENT || this.f53052f == xtj.CLIENT_CONNECTED || this.f53052f == xtj.ASSERTION_SENT;
    }

    /* renamed from: a */
    public final void mo30119a() {
        boolean z;
        int i;
        int i2;
        f53046k.mo25414c("State: NOT_STARTED", new Object[0]);
        if (this.f53052f == xtj.NOT_STARTED) {
            z = true;
        } else {
            z = false;
        }
        sdo.m34970a(z);
        if (cdwx.f181857a.mo6606a().mo78408a() && !this.f53056j) {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            xih xih = new xih(this.f53047a);
            if (!defaultAdapter.isEnabled() || !xih.mo29801a()) {
                return;
            }
        }
        f53046k.mo25414c("State: SCANNING_FOR_CLIENT", new Object[0]);
        this.f53052f = xtj.SCANNING_FOR_CLIENT;
        xto xto = this.f53058m;
        xta xta = new xta(this);
        xwj xwj = this.f53048b;
        xwn xwn = this.f53051e;
        BluetoothLeScanner a = xjl.m43047a();
        sdo.m34959a(xwn);
        this.f53061p = new xsz(xwj, xto, xta, a, xwn);
        if (this.f53063r == 1) {
            i = (int) cdvh.f181801a.mo6606a().mo78369d();
            i2 = (int) cdvh.f181801a.mo6606a().mo78368c();
        } else {
            i = (int) cdvh.f181801a.mo6606a().mo78367b();
            i2 = (int) cdvh.f181801a.mo6606a().mo78366a();
        }
        xsz xsz = this.f53061p;
        sdo.m34970a(((xsy) xsz.f53021f.get()).equals(xsy.NOT_STARTED));
        if (!cdwo.f181843a.mo6606a().mo78397a()) {
            BluetoothAdapter bluetoothAdapter = xsz.f53019d;
            if (bluetoothAdapter == null || xsz.f53020e == null) {
                xsz.f53025j.mo30115a("Cannot perform a BLE scan on this device.");
                return;
            } else if (!bluetoothAdapter.isEnabled()) {
                xsz.f53025j.mo30115a("Bluetooth is disabled.");
                return;
            }
        } else {
            BluetoothAdapter bluetoothAdapter2 = xsz.f53019d;
            if (bluetoothAdapter2 == null) {
                if (xsz.f53016a.f53296b != null) {
                    xsz.f53022g.mo30194a(xsz.f53016a, xaj.TYPE_CABLE_SCAN_ERROR_BLE_SCANNING_UNSUPPORTED);
                }
                xsz.f53025j.mo30115a("Cannot perform a BLE scan on this device.");
                return;
            } else if (!bluetoothAdapter2.isEnabled()) {
                if (xsz.f53016a.f53296b != null) {
                    xsz.f53022g.mo30194a(xsz.f53016a, xaj.TYPE_CABLE_SCAN_ERROR_BLUETOOTH_DISABLED);
                }
                xsz.f53025j.mo30115a("Bluetooth is disabled.");
                return;
            } else if (xsz.f53020e == null) {
                if (xsz.f53016a.f53296b != null) {
                    xsz.f53022g.mo30194a(xsz.f53016a, xaj.TYPE_CABLE_SCAN_ERROR_BLE_SCANNING_UNSUPPORTED);
                }
                xsz.f53025j.mo30115a("Cannot perform a BLE scan on this device.");
                return;
            }
        }
        xsz.f53024i = new xsw(xsz);
        xsz.f53018c.postDelayed(xsz.f53024i, (long) i);
        xsz.f53023h = new CableAuthenticatorScan$2(xsz, "fido", "CableAuthenticatorScan");
        xsz.f53021f.set(xsy.SCANNING);
        try {
            xsz.f53020e.startScan(xjl.m43049a(xsz.m43376b()), xjl.m43048a(i2), xsz.f53023h);
        } catch (Exception e) {
            xsz.f53025j.mo30115a(e.getMessage());
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent}
     arg types: [java.lang.String, int]
     candidates:
      ClspMth{android.content.Intent.putExtra(java.lang.String, int):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, int[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Bundle):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.CharSequence):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, long):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.io.Serializable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, double[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, android.os.Parcelable):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, float[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, byte[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, java.lang.String):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, short[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, char[]):android.content.Intent}
      ClspMth{android.content.Intent.putExtra(java.lang.String, boolean):android.content.Intent} */
    /* renamed from: b */
    public final void mo30122b() {
        if (this.f53052f != xtj.SESSION_TERMINATED) {
            xtj xtj = this.f53052f;
            boolean z = true;
            f53046k.mo25414c("State: SESSION_TERMINATED (from state %s)", xtj);
            this.f53052f = xtj.SESSION_TERMINATED;
            Runnable runnable = this.f53060o;
            if (runnable != null) {
                this.f53059n.removeCallbacks(runnable);
                this.f53060o = null;
            }
            xsz xsz = this.f53061p;
            if (xsz != null) {
                xsz.mo30114a();
                this.f53061p = null;
            }
            if (this.f53053g != null) {
                if (xtj == xtj.WAITING_FOR_USER_APPROVAL) {
                    xuh xuh = this.f53053g;
                    xuh.f53152i.mo25414c("Prompt dismissed.", new Object[0]);
                    xuh.f53155c.mo30152a();
                    xuh.mo30153a();
                    xuh.f53154b.sendBroadcast(new Intent("updatePolluxChimeraActivity").putExtra("DismissActivityExtra", true));
                    xuh.f53159g = 5;
                } else if (xtj != xtj.ASSERTION_SENT) {
                    this.f53053g.mo30154a(false);
                }
                this.f53053g = null;
            }
            xtm xtm = this.f53062q;
            if (xtm != null) {
                bmxy.m108600b(xtm.f53072e);
                xtm.f53069b.stopAdvertising(xtm.f53070c);
                this.f53062q = null;
            }
            xuc xuc = this.f53057l;
            if (xuc != null) {
                if (cdwu.m135190b()) {
                    BluetoothGattServer bluetoothGattServer = xuc.f53128h;
                    if (bluetoothGattServer != null) {
                        bluetoothGattServer.close();
                    }
                } else {
                    if (xuc.f53128h == null) {
                        z = false;
                    }
                    bmxy.m108600b(z);
                    xuc.f53128h.close();
                }
                xuc.f53121o.mo25414c("CTAP GATT server stopped.", new Object[0]);
                if (xuc.f53133m != null) {
                    xuc.f53132l.mo30194a(xuc.f53131k, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_GATT_SERVER_CLOSED);
                    xuc.f53133m.mo30141b();
                    xuc.f53133m = null;
                }
                this.f53057l = null;
            }
            this.f53049c.mo30110a();
        }
    }

    /* renamed from: a */
    public final void mo30120a(int i, xaj xaj) {
        this.f53059n.removeCallbacks(this.f53060o);
        xte xte = new xte(this, xaj);
        this.f53060o = xte;
        this.f53059n.postDelayed(xte, (long) i);
    }

    /* renamed from: a */
    public final void mo30121a(xjm xjm) {
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        byte[] bArr;
        sdo.m34970a((this.f53056j && this.f53052f == xtj.SCANNING_FOR_CLIENT) || this.f53052f == xtj.WAITING_FOR_USER_APPROVAL);
        this.f53052f = xtj.ADVERTISING_TO_CLIENT;
        this.f53061p.mo30114a();
        this.f53061p = null;
        f53046k.mo25414c("State: ADVERTISING_TO_CLIENT", new Object[0]);
        xwj xwj = this.f53048b;
        xtc xtc = new xtc(this, xjm);
        xwn xwn = this.f53051e;
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            bluetoothLeAdvertiser = defaultAdapter.getBluetoothLeAdvertiser();
        } else {
            bluetoothLeAdvertiser = null;
        }
        bmxy.m108581a(xwn);
        xtm xtm = new xtm(xwj, xtc, bluetoothLeAdvertiser, xwn);
        this.f53062q = xtm;
        byte[] bArr2 = xjm.f52428c;
        bmxy.m108600b(!xtm.f53072e);
        xtm.f53072e = true;
        if (xtm.f53069b == null) {
            xtm.f53071d.mo30194a(xtm.f53068a, xaj.TYPE_CABLE_ADVERTISEMENT_ERROR_BLE_ADVERTISING_UNSUPPORTED);
            xtm.f53073f.mo30117a();
        } else {
            int length = bArr2.length;
            if (length != 16) {
                sek sek = xtm.f53067g;
                StringBuilder sb = new StringBuilder(34);
                sb.append("Unexpected EID length: ");
                sb.append(length);
                sek.mo25418e(sb.toString(), new Object[0]);
                bArr = null;
            } else {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(32);
                    byteArrayOutputStream.write(1);
                    byteArrayOutputStream.write(bArr2);
                    bArr = byteArrayOutputStream.toByteArray();
                } catch (IOException e) {
                    xtm.f53067g.mo25417e("Error writing output stream", e, new Object[0]);
                    bArr = null;
                }
            }
            if (bArr != null) {
                xtm.f53067g.mo25414c("Advertising 0x%s", srv.m36164d(bArr));
                AdvertiseData build = new AdvertiseData.Builder().addServiceData(new ParcelUuid(UUID.fromString((String) xmn.f52766p.mo58455c())), bArr).build();
                xtm.f53071d.mo30194a(xtm.f53068a, xaj.TYPE_CABLE_ADVERTISEMENT_STARTED);
                xtm.f53069b.startAdvertising(new AdvertiseSettings.Builder().setAdvertiseMode(2).setConnectable(true).build(), build, xtm.f53070c);
            } else {
                xtm.f53071d.mo30194a(xtm.f53068a, xaj.TYPE_CABLE_ADVERTISEMENT_ERROR_AUTHENTICATOR_EID_INVALID);
                xtm.f53073f.mo30117a();
            }
        }
        mo30120a(10000, null);
    }
}
