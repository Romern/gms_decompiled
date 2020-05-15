package p000;

import android.content.Context;
import android.content.Intent;
import java.math.BigInteger;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

/* renamed from: ife */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
final class ife {

    /* renamed from: a */
    public static final Logger f20850a = new Logger("AuthZenGcmEventHandler");

    /* renamed from: b */
    private final ikj f20851b;

    /* renamed from: c */
    private final rkb f20852c;

    /* renamed from: d */
    private final Context f20853d;

    public ife(Context context, ikj ikj) {
        ijv.m15561a();
        rjy rjy = new rjy(context);
        rjy.mo24779a(axoz.f96226a);
        rkb b = rjy.mo24784b();
        long j = ifj.f20859a;
        this.f20853d = context;
        this.f20851b = ikj;
        this.f20852c = b;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ikj.a(android.content.Context, bypc, java.lang.String, byte[], boolean):void
     arg types: [android.content.Context, bypc, java.lang.String, byte[], int]
     candidates:
      ikj.a(android.content.Context, bypc, java.lang.String, byte[], byoo):void
      ikj.a(android.content.Context, bypc, java.lang.String, byte[], boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0456, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0457, code lost:
        p000.ife.f20850a.mo25417e("Error during decoding", r0, new java.lang.Object[0]);
        r2.f21069d = r0.f20923a;
        r2.mo13046a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0469, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x046a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x046b, code lost:
        p000.ife.f20850a.mo25417e("Couldn't parse SecureMessage proto", r0, new java.lang.Object[0]);
        r2.f21069d = 10;
        r2.mo13046a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x047d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f6, code lost:
        p000.ife.f20850a.mo25417e("Unable to decode the proto.", r0, new java.lang.Object[0]);
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b2, code lost:
        p000.ikj.f21205d.mo25418e("Unable to parse a received TxCancelRequest", new java.lang.Object[0]);
        r4 = new p000.iir(r7);
        r4.f21069d = 15;
        r4.mo13046a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c5, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x0456 A[ExcHandler: igj (r0v1 'e' igj A[CUSTOM_DECLARE]), Splitter:B:1:0x000e] */
    /* renamed from: a */
    public final void mo12959a(Intent intent) {
        Context context;
        String str;
        Intent intent2;
        String str2;
        iir iir = new iir(this.f20853d);
        try {
            byte[] b = igk.m15413b(intent.getStringExtra("P"));
            byte[] a = igk.m15412a(b);
            f20850a.mo25412b("Decrypting payload using Cryptauth", new Object[0]);
            try {
                ifi a2 = ifj.m15367a(this.f20853d, b, a);
                byrz byrz = a2.f20857a;
                String str3 = a2.f20858b;
                f20850a.mo25414c("Handling payload by type %s for account %s using key with handle %s", byrz.f167530a, str3, Long.valueOf(new BigInteger(a).longValue()));
                int ordinal = byrz.f167530a.ordinal();
                if (ordinal == 2) {
                    ikj ikj = this.f20851b;
                    context = this.f20853d;
                    rkb rkb = this.f20852c;
                    bypc bypc = (bypc) GeneratedMessageLite.m124014a(bypc.f167305k, byrz.f167531b);
                    if ((bypc.f167307a & 4096) != 0) {
                        ikj.f21205d.mo25414c("Transaction has FIDO data. Calling the FIDO2 0p API to start a silent caBLEauthenticator session.", new Object[0]);
                        bxvd da = bsno.f146308c.mo74144da();
                        ByteString bxtx = bypc.f167308b;
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bsno bsno = (bsno) da.f164949b;
                        bxtx.getClass();
                        bsno.f146310a = bxtx;
                        str3.getClass();
                        bsno.f146311b = str3;
                        xnw c = wzk.m42529c(context);
                        byte[] k = ((bsno) da.mo74062i()).serializeToBytes();
                        byte[] k2 = bypc.f167315i.getKey();
                        xod xod = new xod();
                        roz b2 = rpa.m34196b();
                        b2.f43472a = new xns(1, k, k2, xod);
                        c.mo24701a(b2.mo24977a());
                    }
                    igg.m15405a().mo12992a(bypc.f167308b.getKey());
                    Logger Logger = ikj.f21205d;
                    Object[] objArr = new Object[1];
                    StringBuilder sb = new StringBuilder("{\n");
                    sb.append(String.format("  id: %s\n", srv.m36160a(bypc.f167308b.getKey())));
                    rkb rkb2 = rkb;
                    sb.append(String.format("  tx_creation_time_millis: %s\n", Long.valueOf(bypc.f167309c)));
                    sb.append(String.format("  min_required_version: %d\n", Integer.valueOf(bypc.f167316j)));
                    sb.append(String.format("  user_agent: %s\n", bypc.f167311e));
                    bypb bypb = bypc.f167310d;
                    if (bypb == null) {
                        bypb = bypb.f167289p;
                    }
                    sb.append("  params: {\n");
                    Object[] objArr2 = new Object[1];
                    int a3 = byoj.m125028a(bypb.f167293c);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    objArr2[0] = byoj.m125029b(a3);
                    sb.append(String.format("    type: %s\n", objArr2));
                    sb.append(String.format("    sender: %s\n", bypb.f167294d));
                    Object[] objArr3 = new Object[1];
                    byod a4 = byod.m125020a(bypb.f167296f);
                    if (a4 == null) {
                        a4 = byod.START_ACTIVITY;
                    }
                    objArr3[0] = a4;
                    sb.append(String.format("    interaction: %s\n", objArr3));
                    Object[] objArr4 = new Object[1];
                    byod a5 = byod.m125020a(bypb.f167297g);
                    if (a5 == null) {
                        a5 = byod.START_ACTIVITY;
                    }
                    objArr4[0] = a5;
                    sb.append(String.format("    interaction_after_trigger: %s\n", objArr4));
                    Object[] objArr5 = new Object[1];
                    int a6 = byom.m125032a(bypb.f167298h);
                    if (a6 == 0) {
                        a6 = -1;
                    }
                    if (a6 == 0) {
                        str = "null";
                    } else if (a6 == 0) {
                        throw null;
                    } else if (a6 != 0) {
                        str = Integer.toString(a6);
                    } else {
                        throw null;
                    }
                    objArr5[0] = str;
                    sb.append(String.format("    risk_level: %s\n", objArr5));
                    ikj ikj2 = ikj;
                    sb.append(String.format("    force_unlock_millis: %s\n", Long.valueOf(bypb.f167299i)));
                    sb.append(String.format("    triggers: %s\n", new bxvv(bypb.f167300j, bypb.f167288k)));
                    int a7 = byoj.m125028a(bypb.f167293c);
                    if (a7 != 0) {
                        if (a7 == 2) {
                            byoa byoa = bypb.f167301l;
                            if (byoa == null) {
                                byoa = byoa.f167173e;
                            }
                            sb.append("    prompt: {\n");
                            Object[] objArr6 = new Object[1];
                            int a8 = bypl.m125063a(byoa.f167177c);
                            if (a8 == 0) {
                                a8 = 1;
                            }
                            objArr6[0] = Integer.toString(a8 - 1);
                            sb.append(String.format("      workflow_hint: %s\n", objArr6));
                            sb.append(String.format("      min_required_version: %d\n", Integer.valueOf(byoa.f167178d)));
                            sb.append("    }\n");
                        }
                    }
                    sb.append("  }\n}");
                    objArr[0] = sb.toString();
                    Logger.mo25414c("Processing TxRequest: %s\n", objArr);
                    bypc bypc2 = bypc;
                    rkb rkb3 = rkb2;
                    ikj.m15596a(context, bypc, str3, a, bypf.RECEIVED, null);
                    ikj2.mo13091a(context, bypc2, str3, a, false);
                    if (((Boolean) igt.f20955e.mo58455c()).booleanValue()) {
                        bypb bypb2 = bypc2.f167310d;
                        if (bypb2 == null) {
                            bypb2 = bypb.f167289p;
                        }
                        if ((bypb2.f167291a & 2048) != 0) {
                            bypb bypb3 = bypc2.f167310d;
                            if (bypb3 == null) {
                                bypb3 = bypb.f167289p;
                            }
                            byog byog = bypb3.f167302m;
                            if (byog == null) {
                                byog = byog.f167196i;
                            }
                            if (!byog.f167205h) {
                                ijw ijw = new ijw(context, str3, null);
                                iki iki = new iki(ikj2, rkb3, context, bypc2, a, str3);
                                ijw.f21153a = 2;
                                ijw.mo13075a(iki);
                            }
                        }
                    }
                } else if (ordinal == 8) {
                    ikj ikj3 = this.f20851b;
                    Context context2 = this.f20853d;
                    rkb rkb4 = this.f20852c;
                    ikg a9 = ikh.m15586a(context2).mo13087a(((byoy) GeneratedMessageLite.m124014a(byoy.f167279b, byrz.f167531b)).f167281a.getKey());
                    if (a9 != null) {
                        bypc bypc3 = a9.f21184a;
                        Intent a10 = ikj.m15594a(context2, bypc3, str3, a);
                        String a11 = ikl.m15608a(bypc3);
                        a10.addCategory(a11);
                        ikl ikl = ikj3.f21206b;
                        Intent intent3 = new Intent("AUTHZEN_CLOSE_ACTIVITY");
                        intent3.setPackage("com.google.android.gms");
                        intent3.putExtra("transaction_id", bypc3.f167308b.getKey());
                        ikl.f21216a.sendBroadcast(intent3);
                        ikl.mo13096a(a10, a11);
                        if (((Boolean) igt.f20955e.mo58455c()).booleanValue()) {
                            ikj3.f21207c.mo12998a(rkb4);
                            igr igr = ikj3.f21207c;
                            String valueOf = String.valueOf(bypc3.f167308b.mo73781l());
                            igs a12 = igr.mo12996a(valueOf.length() == 0 ? new String("/tx-cancel/") : "/tx-cancel/".concat(valueOf));
                            if (!cceo.m129401b()) {
                                a12.mo13000b();
                            } else {
                                a12.mo12999a();
                            }
                        }
                    } else {
                        ikj.f21205d.mo25418e("No cached entry found", new Object[0]);
                    }
                } else if (ordinal != 14) {
                    Logger logger2 = f20850a;
                    String valueOf2 = String.valueOf(byrz.f167530a.name());
                    logger2.mo25418e(valueOf2.length() == 0 ? new String("Unexpected payload type: ") : "Unexpected payload type: ".concat(valueOf2), new Object[0]);
                    iir.f21069d = 14;
                    iir.mo13046a();
                } else {
                    byry byry = (byry) GeneratedMessageLite.m124014a(byry.f167524e, byrz.f167531b);
                    if ((byry.f167526a & 1) != 0) {
                        intent2 = new Intent("com.google.android.gms.auth.authzen.GCM_DEVICE_PROXIMITY");
                        intent2.putExtra("account_name", str3);
                        intent2.putExtra("bluetooth_mac_address", byry.f167527b);
                        if ((byry.f167526a & 4) != 0) {
                            intent2.putExtra("protocol_version", byry.f167529d);
                        }
                        if ((byry.f167526a & 2) != 0) {
                            int a13 = byru.m125231a(byry.f167528c);
                            if (a13 == 0) {
                                a13 = 1;
                            }
                            if (a13 != 1) {
                                str2 = a13 != 2 ? a13 != 3 ? a13 != 4 ? a13 != 5 ? "OSX" : "BROWSER" : "IOS" : "CHROME" : "ANDROID";
                            } else {
                                str2 = "UNKNOWN";
                            }
                            intent2.putExtra("source_device_type", str2);
                        }
                    } else {
                        f20850a.mo25418e("Missing Bluetooth address in DeviceProximityCallback.", new Object[0]);
                        intent2 = null;
                    }
                    if (intent2 == null) {
                        f20850a.mo25418e("Could not create CryptauthGcmProximity broadcast intent fromserver payload.", new Object[0]);
                    } else {
                        this.f20853d.sendBroadcast(intent2, "com.google.android.gms.auth.authzen.permission.GCM_DEVICE_PROXIMITY");
                    }
                }
            } catch (ExecutionException e) {
                e = e;
                f20850a.mo25417e("Failed to verifyDecrypt payload", e, new Object[0]);
            } catch (InterruptedException e2) {
                e = e2;
                f20850a.mo25417e("Failed to verifyDecrypt payload", e, new Object[0]);
            } catch (TimeoutException e3) {
                e = e3;
                f20850a.mo25417e("Failed to verifyDecrypt payload", e, new Object[0]);
            }
        } catch (bxwf e4) {
            ikj.f21205d.mo25418e("Unable to parse a received TxRequest", new Object[0]);
            iir iir2 = new iir(context);
            iir2.f21069d = 15;
            iir2.mo13046a();
        } catch (igj e5) {
        }
    }
}
