package p000;

import android.accounts.Account;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: ahuk */
public final /* synthetic */ class ahuk implements Runnable {

    /* renamed from: a */
    private final Context f68094a;

    /* renamed from: b */
    private final buru f68095b;

    /* renamed from: c */
    private final Account f68096c;

    public ahuk(Context context, buru buru, Account account) {
        this.f68094a = context;
        this.f68095b = buru;
        this.f68096c = account;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00fa, code lost:
        r6 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00fc, code lost:
        r6 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00fc A[ExcHandler: InterruptedException | ExecutionException (e java.lang.Throwable), Splitter:B:13:0x0037] */
    public final void run() {
        Context context = this.f68094a;
        buru buru = this.f68095b;
        Account account = this.f68096c;
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            srn srn = ahsd.f67925a;
            return;
        }
        Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
        if (bondedDevices == null || bondedDevices.isEmpty()) {
            srn srn2 = ahsd.f67925a;
            return;
        } else if (account != null) {
            boolean z = false;
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                try {
                    ahza a = ahur.m56666a((List) buru.mo73055a(account).get(), ((ahst) ahgz.m55754a(context, ahst.class)).mo37033a(bluetoothDevice.getAddress()));
                    if (a != null) {
                        ByteString bxtx = a.f68445c;
                        bxus c = bxus.m123744c();
                        aiaa aiaa = aiaa.f68501K;
                        bxuc h = bxtx.mo73764h();
                        GeneratedMessageLite GeneratedMessageLite = (GeneratedMessageLite) aiaa.mo74142c(4);
                        bxxv a2 = bxxm.f165037a.mo74228a(GeneratedMessageLite);
                        a2.mo74220a(GeneratedMessageLite, bxud.m123454a(h), c);
                        a2.mo74225d(GeneratedMessageLite);
                        h.mo73787a(0);
                        GeneratedMessageLite.m124027b(GeneratedMessageLite);
                        aiaa aiaa2 = (aiaa) GeneratedMessageLite;
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: found device with bonded device public address, item title = %s", aiaa2.f68520h);
                        String c2 = buqx.m120262c(bluetoothDevice.getAddress());
                        ((bnsl) ahsd.f67925a.mo68390d()).mo68420a("FastPair: found device with bonded device public address, alias = %s", c2);
                        if (c2 == null || !c2.equals(aiaa2.f68520h)) {
                            buqx.m120259a(bluetoothDevice.getAddress(), aiaa2.f68520h);
                            if (!z) {
                                z = true;
                            }
                        } else {
                            ((bnsl) ahsd.f67925a.mo68390d()).mo68405a("FastPair: No need to update alias name when footrpints sync complete");
                        }
                    } else {
                        continue;
                    }
                } catch (IOException e) {
                    if (!(e.getCause() instanceof bxwf)) {
                        throw new bxwf(e.getMessage());
                    }
                    throw ((bxwf) e.getCause());
                } catch (RuntimeException e2) {
                    if (e2.getCause() instanceof bxwf) {
                        throw ((bxwf) e2.getCause());
                    }
                    throw e2;
                } catch (bxwf e3) {
                    throw e3;
                } catch (InterruptedException | ExecutionException e4) {
                } catch (bxwf e5) {
                    throw e5;
                }
            }
            return;
        } else {
            srn srn3 = ahsd.f67925a;
            return;
        }
        bnsl bnsl = (bnsl) ahsd.f67925a.mo68388c();
        bnsl.mo68437a(e);
        bnsl.mo68405a("FastPair: Failed to read device from Footprints when footprints sync complete.");
    }
}
