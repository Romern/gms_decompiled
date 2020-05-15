package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: pwo */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class pwo implements pwm {

    /* renamed from: a */
    final /* synthetic */ phy f40501a;

    /* renamed from: b */
    final /* synthetic */ long f40502b;

    /* renamed from: c */
    final /* synthetic */ List f40503c;

    /* renamed from: d */
    final /* synthetic */ String f40504d;

    /* renamed from: e */
    final /* synthetic */ String f40505e;

    /* renamed from: f */
    final /* synthetic */ pwp f40506f;

    /* renamed from: g */
    final /* synthetic */ pxe f40507g;

    public pwo(pwp pwp, phy phy, long j, List list, String str, String str2, pxe pxe) {
        this.f40506f = pwp;
        this.f40501a = phy;
        this.f40502b = j;
        this.f40503c = list;
        this.f40504d = str;
        this.f40505e = str2;
        this.f40507g = pxe;
    }

    /* renamed from: a */
    public final void mo23770a(int i) {
        int i2 = 1;
        this.f40506f.f40509b.mo23677d("onError is called with error code: %d", Integer.valueOf(i));
        phy phy = this.f40501a;
        bpfa bpfa = bpfa.KEY_EXCHANGE_FAILED;
        Long valueOf = Long.valueOf(this.f40502b);
        if (i != 2) {
            if (i == 4) {
                i2 = 10;
            } else if (i == 5) {
                i2 = 8;
            } else if (i != 7) {
                if (i == 8) {
                    i2 = 9;
                }
            }
            phy.mo23109a(bpfa, valueOf, i2);
            this.f40507g.mo23797a(i);
        }
        i2 = 5;
        phy.mo23109a(bpfa, valueOf, i2);
        this.f40507g.mo23797a(i);
    }

    /* renamed from: a */
    public final void mo23771a(byte[] bArr, blse blse) {
        this.f40501a.mo23109a(bpfa.KEY_EXCHANGE_SUCCEEDED, Long.valueOf(this.f40502b), 0);
        try {
            List list = this.f40503c;
            String str = this.f40504d;
            String str2 = this.f40505e;
            bxvd da = blrx.f127545f.mo74144da();
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrx blrx = (blrx) da.f164949b;
            if (!blrx.f127550d.mo73666a()) {
                blrx.f127550d = bxvk.m124021a(blrx.f127550d);
            }
            bxsy.m123078a(list, blrx.f127550d);
            if (da.f164950c) {
                da.mo74035c();
                da.f164950c = false;
            }
            blrx blrx2 = (blrx) da.f164949b;
            str.getClass();
            blrx2.f127547a |= 1;
            blrx2.f127551e = str;
            str2.getClass();
            blrx2.f127548b = 3;
            blrx2.f127549c = str2;
            byte[] bArr2 = new byte[12];
            new SecureRandom().nextBytes(bArr2);
            byte[] k = ((blrx) da.mo74062i()).mo73642k();
            qag.f40785a = null;
            qag.f40786b = null;
            if (bArr.length == 48) {
                byte[] copyOf = Arrays.copyOf(bArr, 16);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 16, 48);
                byte[] copyOf2 = Arrays.copyOf(bArr2, 16);
                Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
                instance.init(1, new SecretKeySpec(copyOf, "AES"), new IvParameterSpec(copyOf2));
                qag.f40785a = instance.doFinal(k);
                ByteBuffer allocate = ByteBuffer.allocate(8);
                allocate.order(ByteOrder.LITTLE_ENDIAN);
                allocate.putLong(0);
                byte[] array = allocate.array();
                ByteBuffer allocate2 = ByteBuffer.allocate(8);
                allocate2.order(ByteOrder.LITTLE_ENDIAN);
                allocate2.putLong((long) qag.f40785a.length);
                byte[] array2 = allocate2.array();
                int length = qag.f40785a.length + 64;
                byte[] bArr3 = new byte[length];
                for (int i = 0; i < 8; i++) {
                    bArr3[i] = array[i];
                }
                for (int i2 = 0; i2 < 8; i2++) {
                    bArr3[i2 + 8] = array2[i2];
                }
                for (int i3 = 0; i3 < 12; i3++) {
                    bArr3[i3 + 16] = bArr2[i3];
                }
                for (int i4 = 0; i4 < qag.f40785a.length; i4++) {
                    bArr3[(length - qag.f40785a.length) + i4] = qag.f40785a[i4];
                }
                Mac instance2 = Mac.getInstance("HmacSHA256");
                instance2.init(new SecretKeySpec(copyOfRange, "HmacSHA256"));
                qag.f40786b = instance2.doFinal(bArr3);
                byte[] bArr4 = new byte[(qag.f40785a.length + qag.f40786b.length)];
                for (int i5 = 0; i5 < qag.f40785a.length; i5++) {
                    bArr4[i5] = qag.f40785a[i5];
                }
                for (int i6 = 0; i6 < qag.f40786b.length; i6++) {
                    bArr4[qag.f40785a.length + i6] = qag.f40786b[i6];
                }
                bxvd da2 = blrz.f127553f.mo74144da();
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blrz blrz = (blrz) da2.f164949b;
                blse.getClass();
                blrz.f127556b = blse;
                blrz.f127555a |= 1;
                bxtx a = bxtx.m123261a(bArr2);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blrz blrz2 = (blrz) da2.f164949b;
                a.getClass();
                int i7 = blrz2.f127555a | 2;
                blrz2.f127555a = i7;
                blrz2.f127557c = a;
                blrz2.f127558d = 1;
                blrz2.f127555a = i7 | 4;
                bxtx a2 = bxtx.m123261a(bArr4);
                if (da2.f164950c) {
                    da2.mo74035c();
                    da2.f164950c = false;
                }
                blrz blrz3 = (blrz) da2.f164949b;
                a2.getClass();
                blrz3.f127555a = 8 | blrz3.f127555a;
                blrz3.f127559e = a2;
                blrz blrz4 = (blrz) da2.mo74062i();
                try {
                    List<pmv> e = this.f40506f.f40510c.mo23853e();
                    if (e.isEmpty()) {
                        this.f40507g.mo23797a(11);
                    } else if (!this.f40506f.f40510c.mo23855g()) {
                        byte[] k2 = blrz4.mo73642k();
                        DatagramPacket datagramPacket = new DatagramPacket(k2, k2.length);
                        datagramPacket.setAddress(this.f40506f.f40513f);
                        datagramPacket.setPort((int) cdaj.f180379a.mo6606a().mo77166a());
                        pwp pwp = this.f40506f;
                        if (pwp.f40512e == null) {
                            pwp.f40512e = new MulticastSocket(0);
                            this.f40506f.f40512e.setTimeToLive(1);
                        }
                        for (pmv pmv : e) {
                            this.f40506f.f40512e.setNetworkInterface(pmv.f39757a);
                            this.f40506f.f40512e.send(datagramPacket);
                        }
                        try {
                            rnt rnt = (rnt) this.f40507g.f40555a.f40556a.get();
                            if (rnt != null) {
                                rnt.mo11797a(new Status(0));
                            }
                        } catch (RemoteException e2) {
                        }
                        this.f40506f.f40512e = null;
                    } else {
                        this.f40507g.mo23797a(12);
                        this.f40506f.f40512e = null;
                    }
                } catch (IOException e3) {
                    this.f40506f.f40509b.mo23677d("Failed to send multicast message due to %s", e3);
                    this.f40507g.mo23797a(9);
                } finally {
                    this.f40506f.f40512e = null;
                }
            } else {
                throw new IllegalArgumentException("key must have 48 bytes.");
            }
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e4) {
            this.f40506f.f40509b.mo23677d("Failed to encrypt the message due to %s", e4);
            this.f40507g.mo23797a(10);
        }
    }
}
