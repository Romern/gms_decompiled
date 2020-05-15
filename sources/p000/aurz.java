package p000;

import android.bluetooth.BluetoothDevice;
import com.google.android.libraries.bluetooth.BluetoothException;

/* renamed from: aurz */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aurz extends ausl {

    /* renamed from: a */
    final /* synthetic */ ausf f92394a;

    /* renamed from: b */
    final /* synthetic */ autq f92395b;

    /* renamed from: c */
    final /* synthetic */ aurv f92396c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aurz(ausf ausf, Object[] objArr, autq autq, aurv aurv) {
        super(4, objArr);
        this.f92394a = ausf;
        this.f92395b = autq;
        this.f92396c = aurv;
    }

    /* renamed from: a */
    public final void mo50864a() {
        ausf ausf = this.f92394a;
        autq autq = this.f92395b;
        aurv aurv = this.f92396c;
        aunx aunx = ausf.f92404a;
        String valueOf = String.valueOf(autq.mo50909a());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Enabling data notification on ");
        sb.append(valueOf);
        aunx.mo50711a(sb.toString(), new Object[0]).mo50708c();
        bedy bedy = new bedy(new bedj(ausf.f92408d, aysk.m84701b()), new aysi());
        BluetoothDevice a = autq.mo50909a();
        try {
            bedt b = autq.mo50910b();
            beds beds = b.f106988b;
            aunx aunx2 = ausf.f92404a;
            String valueOf2 = String.valueOf(beds.f106984c.f106974c);
            String valueOf3 = String.valueOf(beds.f106985d);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 21 + String.valueOf(valueOf3).length());
            sb2.append("Device ");
            sb2.append(valueOf2);
            sb2.append(", last state: ");
            sb2.append(valueOf3);
            aunx2.mo50711a(sb2.toString(), new Object[0]);
            ausd ausd = new ausd(ausf, aurv, a);
            synchronized (bedy.f106995a) {
                if (bedy.f106999e == null) {
                    bede a2 = bedy.f106996b.mo58573a(b.f106988b.f106984c.f106972a);
                    try {
                        bedd c = a2.mo58570c(bedy.m91843a(a2), bedz.f107002b);
                        bedy.f107000f = ausd;
                        bedy.f106999e = a2;
                        bedy.f106998d = b;
                        bedw bedw = new bedw(bedy);
                        a2.f106941g.add(bedw);
                        if (!a2.f106938d) {
                            bedw.mo58594a();
                        }
                        bedx bedx = new bedx(bedy);
                        synchronized (c.f106933a) {
                            c.f106934b = bedx;
                            while (true) {
                                byte[] bArr = (byte[]) c.f106933a.poll();
                                if (bArr != null) {
                                    bedx.mo58595a(bArr);
                                }
                            }
                        }
                    } catch (BluetoothException e) {
                        a2.close();
                        throw e;
                    }
                } else {
                    throw new bedp("This client is already watching a device.");
                }
            }
            ausf.f92410f.putIfAbsent(a, bedy);
            aunx aunx3 = ausf.f92404a;
            String valueOf4 = String.valueOf(ausf.f92410f.keySet());
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 45);
            sb3.append("finish enabling notification. EidGattClients:");
            sb3.append(valueOf4);
            aunx3.mo50711a(sb3.toString(), new Object[0]);
        } catch (bedp | BluetoothException e2) {
            aunx aunx4 = ausf.f92404a;
            String valueOf5 = String.valueOf(a.getName());
            aunx4.mo50710a(valueOf5.length() == 0 ? new String("notification is not enabled for ") : "notification is not enabled for ".concat(valueOf5), e2, new Object[0]).mo50706a();
            aurv.mo50854a(a, e2.getMessage());
        }
    }
}
