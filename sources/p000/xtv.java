package p000;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: xtv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class xtv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ byte[] f53095a;

    /* renamed from: b */
    final /* synthetic */ xub f53096b;

    public xtv(xub xub, byte[] bArr) {
        this.f53096b = xub;
        this.f53095a = bArr;
    }

    public final void run() {
        bqgg bqgg;
        String str;
        xub xub = this.f53096b;
        byte[] bArr = this.f53095a;
        if (!xub.mo30139a()) {
            xub.f53108m.mo25418e("Received fragment but not connected.", new Object[0]);
            return;
        }
        if (xub.f53117k == null) {
            xub.f53117k = new xjj(xub.f53114h);
        }
        boolean z = true;
        if (!xub.f53117k.mo29839a(bArr)) {
            byte byteValue = xub.f53117k.f52418b.byteValue();
            xub.f53108m.mo25418e("Received invalid fragment, error=%s.", Byte.valueOf(byteValue));
            xub.mo30138a(xub.mo30140b((byte) -65, new byte[]{byteValue}));
            xub.f53117k = null;
        } else if (xub.f53117k.mo29838a()) {
            xjj xjj = xub.f53117k;
            byte b = xjj.f52417a;
            byte[] b2 = xjj.mo29840b();
            if (b != -124) {
                xtn xtn = (xtn) xub;
                xjw xjw = xtn.f53077c;
                if (xjw == null) {
                    xtn.f53074d.mo25418e("Could not decrypt frame data. Handshake was not completed.", new Object[0]);
                    xtn.f53111e.mo30194a(xtn.f53075a, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_ENCRYPTION);
                    b2 = null;
                } else {
                    try {
                        b2 = xjw.mo29846b(b2, b);
                    } catch (xju e) {
                        xtn.f53111e.mo30194a(xtn.f53075a, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_ENCRYPTION);
                        xtn.f53074d.mo25417e("Unable to decrypt frame data.", e, new Object[0]);
                        b2 = null;
                    }
                }
            }
            if (b2 != null) {
                byte b3 = xub.f53117k.f52417a;
                if (b3 == -127) {
                    xub.f53108m.mo25414c("Handling PING request of %s bytes.", Integer.valueOf(b2.length));
                    xub.mo30138a(xub.mo30140b((byte) -127, b2));
                } else if (b3 == -66) {
                    xub.f53108m.mo25414c("Handling CANCEL command", new Object[0]);
                    xtk.f53046k.mo25414c("  Request cancelled.", new Object[0]);
                } else if (b3 == -125) {
                    xub.f53108m.mo25414c("Handling MSG request", new Object[0]);
                    xtg xtg = xub.f53119n;
                    xtk xtk = xtg.f53037b;
                    xtk.f53051e.mo30194a(xtk.f53048b, xaj.TYPE_CABLE_CTAP_REQUEST_RECEIVED);
                    xtk.f53046k.mo25414c("  Request received: %s", srv.m36164d(b2));
                    xtu xtu = xtg.f53037b.f53055i;
                    bmxv bmxv = xtg.f53036a;
                    if (b2.length != 0) {
                        try {
                            byte b4 = b2[0];
                            xke[] values = xke.values();
                            int length = values.length;
                            int i = 0;
                            while (i < length) {
                                xke xke = values[i];
                                if (b4 != xke.f52498g) {
                                    i++;
                                } else {
                                    int ordinal = xke.ordinal();
                                    if (ordinal == 1) {
                                        byte[] copyOfRange = Arrays.copyOfRange(b2, 1, b2.length);
                                        xtu.f53094f = 2;
                                        if (copyOfRange.length == 0) {
                                            xtu.f53094f = 4;
                                            bqgg = xtu.mo30129a(xkj.CTAP1_ERR_INVALID_LENGTH);
                                        } else {
                                            try {
                                                try {
                                                    xkn a = xkn.m43097a(bypx.m125087b(copyOfRange));
                                                    bqgy c = bqgy.m112818c();
                                                    bqgg a2 = bqga.m112773a(c, 1, TimeUnit.MINUTES, new sny(1, 9));
                                                    bqga.m112781a(a2, new xtr(xtu), xhu.f52320a);
                                                    xtu.f53093e.mo30195a(xtu.f53090b, a);
                                                    ((soc) xtu.f53092d).submit(new xue(xtu.f53089a, xtu.f53090b, new xts(), xtu.f53091c, bmxv, new xdy(), a, xtu.f53093e, new xtt(xtu, c)));
                                                    bqgg = a2;
                                                } catch (xkk e2) {
                                                    xtu.f53094f = 4;
                                                    bqgg = xtu.mo30129a(xkj.CTAP1_ERR_INVALID_PARAMETER);
                                                }
                                            } catch (bypq e3) {
                                                xtu.f53094f = 4;
                                                bqgg = xtu.mo30129a(xkj.CTAP2_ERR_CBOR_PARSING);
                                            }
                                        }
                                    } else if (ordinal != 2) {
                                        Logger Logger = xtu.f53088g;
                                        String name = xke.name();
                                        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 34);
                                        sb.append("Commands of type ");
                                        sb.append(name);
                                        sb.append(" are unsupported.");
                                        Logger.mo25418e(sb.toString(), new Object[0]);
                                        bqgg = xtu.mo30129a(xkj.CTAP1_ERR_INVALID_COMMAND);
                                    } else {
                                        xtu.f53093e.mo30195a(xtu.f53090b, new xko());
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add("FIDO_2_0");
                                        xkj xkj = xkj.CTAP1_ERR_SUCCESS;
                                        xkt xkt = new xkt();
                                        xkt.mo29878a(boan.f132472f.mo68788c().mo68796b(cdus.m135078b()));
                                        xkt.f52602g = null;
                                        xkt.f52598c = false;
                                        xkt.f52599d = true;
                                        xkt.f52600e = true;
                                        xkt.f52601f = false;
                                        xkt.mo29879b(arrayList);
                                        xkt.mo29877a((List) null);
                                        xkg xkg = new xkg(xkj, xkt.mo29876a());
                                        xtu.f53093e.mo30196a(xtu.f53090b, xkg);
                                        bqgg = bqga.m112775a(xkg);
                                    }
                                }
                            }
                            throw new xkd(String.format("Unidentified command type value: 0x%x", Byte.valueOf(b4)));
                        } catch (xkd e4) {
                            bqgg = xtu.mo30129a(xkj.CTAP1_ERR_INVALID_COMMAND);
                        }
                    } else {
                        bqgg = xtu.mo30129a(xkj.CTAP1_ERR_INVALID_LENGTH);
                    }
                    bqga.m112781a(bqgg, new xtf(xtg), bqfb.INSTANCE);
                } else if (b3 == -124) {
                    xub.f53108m.mo25414c("Handling CONTROL command", new Object[0]);
                    xtn xtn2 = (xtn) xub;
                    int i2 = xtn2.f53076b.f52475g;
                    if (i2 == 1) {
                        xtn2.f53111e.mo30194a(xtn2.f53075a, xaj.TYPE_CABLE_CLIENT_HANDSHAKE_RECEIVED);
                        try {
                            xjv xjv = ((xtn) xub).f53076b;
                            int i3 = xjv.f52474f;
                            sdo.m34970a(true);
                            sdo.m34970a(xjv.f52475g == 1);
                            sdo.m34970a(xjv.f52471c == null);
                            xjv.f52471c = xjt.m43058a(xjv.f52469a, xjv.f52470b, xjt.f52460b).getEncoded();
                            byte[] bArr2 = xjv.f52471c;
                            bypv bypv = xjt.f52465g;
                            int length2 = b2.length;
                            int i4 = length2 - 16;
                            if (i4 > 0) {
                                byte[] copyOfRange2 = Arrays.copyOfRange(b2, 0, i4);
                                if (MessageDigest.isEqual(xjt.m43062a(copyOfRange2, bArr2, 16), Arrays.copyOfRange(b2, i4, length2))) {
                                    bnim bnim = bypx.m125087b(copyOfRange2).mo74447f().f167361a;
                                    if (bnim.size() != 2 || !bnim.containsKey(xjt.f52463e) || !bnim.containsKey(xjt.f52464f)) {
                                        throw new xju("Invalid CBOR map.");
                                    }
                                    bypv g = ((bypx) bnim.get(xjt.f52463e)).mo74448g();
                                    if (g.equals(bypv)) {
                                        xjv.f52472d = ((bypx) bnim.get(xjt.f52464f)).mo74445d().f167357a.getKey();
                                        xjv.f52475g = 2;
                                        xtn2.f53111e.mo30194a(xtn2.f53075a, xaj.TYPE_CABLE_CLIENT_HANDSHAKE_CLIENT_MAC_VALIDATED);
                                        try {
                                            xjv xjv2 = ((xtn) xub).f53076b;
                                            int i5 = xjv2.f52474f;
                                            sdo.m34970a(true);
                                            sdo.m34970a(xjv2.f52475g == 2);
                                            xjv2.f52475g = 3;
                                            xjv2.f52473e = xjt.m43061a();
                                            byte[] bArr3 = xjv2.f52471c;
                                            byte[] c2 = bypx.m125084a(new bypt(xjt.f52463e, xjt.f52466h), new bypt(xjt.f52464f, bypx.m125082a(xjv2.f52473e))).mo74444c();
                                            byte[] a3 = sqc.m35959a(c2, xjt.m43062a(c2, bArr3, 16));
                                            try {
                                                xjv xjv3 = ((xtn) xub).f53076b;
                                                if (xjv3.f52475g != 3) {
                                                    z = false;
                                                }
                                                sdo.m34970a(z);
                                                sdo.m34959a(xjv3.f52472d);
                                                sdo.m34959a(xjv3.f52473e);
                                                byte[] a4 = xjt.m43063a(xjv3.f52469a, xjv3.f52470b, xjv3.f52472d, xjv3.f52473e);
                                                int i6 = xjv3.f52474f;
                                                ((xtn) xub).f53077c = new xjw(xjv3.f52470b, a4);
                                                xtn.f53074d.mo25414c("Client handshake message successfully validated! Sending authenticator handshake.", new Object[0]);
                                                xtn2.f53111e.mo30194a(xtn2.f53075a, xaj.TYPE_CABLE_CLIENT_HANDSHAKE_SENT);
                                                xub.mo30138a(xub.mo30136a((byte) -124, a3, false));
                                            } catch (xju e5) {
                                                xtn.f53074d.mo25417e("Unable to generate session key", e5, new Object[0]);
                                                xub.mo30142c();
                                            }
                                        } catch (bypm | bypr e6) {
                                            throw new xju(e6);
                                        } catch (xju e7) {
                                            xtn.f53074d.mo25417e("Unable to generate handshake message", e7, new Object[0]);
                                            xub.mo30142c();
                                        }
                                    } else {
                                        String valueOf = String.valueOf(g.f167363a);
                                        throw new xju(valueOf.length() == 0 ? new String("Unexpected role: ") : "Unexpected role: ".concat(valueOf));
                                    }
                                } else {
                                    throw new xju("Handshake MAC is invalid.");
                                }
                            } else {
                                StringBuilder sb2 = new StringBuilder(40);
                                sb2.append("Handshake message too short: ");
                                sb2.append(length2);
                                throw new xju(sb2.toString());
                            }
                        } catch (bypq | bypw e8) {
                            throw new xju(e8);
                        } catch (xju e9) {
                            xtn2.f53111e.mo30194a(xtn2.f53075a, xaj.TYPE_CABLE_CLIENT_CONNECTION_TERMINATED_INVALID_CLIENT_MAC);
                            xub.mo30138a(xub.mo30136a((byte) -65, new byte[]{12}, false));
                        }
                    } else {
                        Logger logger2 = xtn.f53074d;
                        if (i2 != 1) {
                            str = i2 != 2 ? i2 != 3 ? "null" : "HANDSHAKE_SUCCESS" : "CLIENT_HANDSHAKE_MESSAGE_PROCESSED";
                        } else {
                            str = "NOT_STARTED";
                        }
                        StringBuilder sb3 = new StringBuilder(str.length() + 53);
                        sb3.append("Received CONTROL command in invalid handshake state: ");
                        sb3.append(str);
                        logger2.mo25418e(sb3.toString(), new Object[0]);
                        xub.mo30142c();
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder(21);
                    sb4.append("Invalid command: ");
                    sb4.append((int) b3);
                    throw new IllegalStateException(sb4.toString());
                }
                xub.f53117k = null;
                return;
            }
            xub.f53108m.mo25418e("Unable to decrypt frame, sending error.", new Object[0]);
            xub.mo30138a(xub.mo30136a((byte) -65, new byte[]{12}, false));
        }
    }
}
