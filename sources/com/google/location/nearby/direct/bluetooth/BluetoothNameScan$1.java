package com.google.location.nearby.direct.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.Intent;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class BluetoothNameScan$1 extends aacn {

    /* renamed from: a */
    final /* synthetic */ buvy f191757a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BluetoothNameScan$1(buvy buvy, String str) {
        super(str);
        this.f191757a = buvy;
    }

    /* renamed from: a */
    public final void mo6253a(Context context, Intent intent) {
        if (intent != null && "android.bluetooth.device.action.FOUND".equals(intent.getAction()) && this.f191757a.f155109d != null) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getExtras().get("android.bluetooth.device.extra.DEVICE");
            Short sh = (Short) intent.getExtras().get("android.bluetooth.device.extra.RSSI");
            if (sh != null) {
                sh.shortValue();
            }
            srn srn = bvcm.f155598a;
            bluetoothDevice.getName();
            buvy buvy = this.f191757a;
            buzj buzj = buvy.f155108c;
            String name = bluetoothDevice.getName();
            if (name != null) {
                buzi buzi = buzj.f155390b;
                if (buzi == null) {
                    buzi = buzi.f155382d;
                }
                if (name.startsWith(buzi.f155385b)) {
                    buzi buzi2 = buzj.f155390b;
                    if (buzi2 == null) {
                        buzi2 = buzi.f155382d;
                    }
                    ahfv a = ahfv.m55670a(name.substring(buzi2.f155385b.length()));
                    buzi buzi3 = buzj.f155390b;
                    if (buzi3 == null) {
                        buzi3 = buzi.f155382d;
                    }
                    if ((buzi3.f155384a & 2) != 0) {
                        buzi buzi4 = buzj.f155390b;
                        if (buzi4 == null) {
                            buzi4 = buzi.f155382d;
                        }
                        if (buzi4.f155386c != 0) {
                            int length = a.f67128a.length;
                            buzi buzi5 = buzj.f155390b;
                            if (buzi5 == null) {
                                buzi5 = buzi.f155382d;
                            }
                            if (length != buzi5.f155386c) {
                                return;
                            }
                        }
                    }
                    bvat bvat = buvy.f155109d;
                    byte[] bArr = a.f67128a;
                    String address = bluetoothDevice.getAddress();
                    bxvd da = buzg.f155373d.mo74144da();
                    bxvd da2 = buzq.f155418c.mo74144da();
                    bxtx a2 = bxtx.m123261a(bArr);
                    if (da2.f164950c) {
                        da2.mo74035c();
                        da2.f164950c = false;
                    }
                    buzq buzq = (buzq) da2.f164949b;
                    a2.getClass();
                    buzq.f155420a |= 1;
                    buzq.f155421b = a2;
                    buzq buzq2 = (buzq) da2.mo74062i();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    buzg buzg = (buzg) da.f164949b;
                    buzq2.getClass();
                    buzg.f155376b = buzq2;
                    buzg.f155375a |= 1;
                    bxvd da3 = buzv.f155434c.mo74144da();
                    bxtx a3 = bxtx.m123261a(bvau.m120846a(address));
                    if (da3.f164950c) {
                        da3.mo74035c();
                        da3.f164950c = false;
                    }
                    buzv buzv = (buzv) da3.f164949b;
                    a3.getClass();
                    buzv.f155436a |= 1;
                    buzv.f155437b = a3;
                    buzv buzv2 = (buzv) da3.mo74062i();
                    bxvf bxvf = (bxvf) bvae.f155472e.mo74144da();
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bvae bvae = (bvae) bxvf.f164949b;
                    bvae.f155475b = 3;
                    bvae.f155474a |= 1;
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    buzg buzg2 = (buzg) da.f164949b;
                    buzv2.getClass();
                    buzg2.f155377c = buzv2;
                    buzg2.f155375a |= 2;
                    if (bxvf.f164950c) {
                        bxvf.mo74035c();
                        bxvf.f164950c = false;
                    }
                    bvae bvae2 = (bvae) bxvf.f164949b;
                    buzg buzg3 = (buzg) da.mo74062i();
                    buzg3.getClass();
                    bvae2.f155476c = buzg3;
                    bvae2.f155474a |= 2;
                    bvah bvah = (bvah) bvai.f155480d.mo74144da();
                    bvah.mo73266a((bvae) bxvf.mo74062i());
                    bvat.mo36284a((bvai) bvah.mo74062i());
                }
            }
        }
    }
}
