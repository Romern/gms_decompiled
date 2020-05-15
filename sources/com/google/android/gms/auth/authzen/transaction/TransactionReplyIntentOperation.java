package com.google.android.gms.auth.authzen.transaction;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.authzen.gencode.server.api.ReplyTxRequestEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.SyncTxRequestEntity;
import com.google.android.gms.auth.authzen.gencode.server.api.SyncTxResponseEntity;
import com.google.android.gms.common.internal.ClientContext;
import com.google.autofill.detection.p098ml.AndroidInputTypeSignal;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public class TransactionReplyIntentOperation extends IntentOperation {

    /* renamed from: a */
    private static final ikj f10497a = new ikj();

    /* renamed from: b */
    private static final sek f10498b = new sek("TransactionReplyIntentOperation");

    /* renamed from: a */
    public static Intent m6529a(String str, byte[] bArr, bxtx bxtx, bypf bypf, byox byox, bypc bypc) {
        Intent a = m6531a(str, bArr, bysa.TX_SYNC_REQUEST);
        if (bxtx == null) {
            f10498b.mo25418e("Ack requests should have a txId, none was provided", new Object[0]);
            return null;
        }
        a.putExtra("transaction_id", bxtx.mo73780k());
        if (bypf != null) {
            a.putExtra("syncState", bypf);
        }
        if (byox != null) {
            a.putExtra("trigger", byox);
        }
        if (bypc != null) {
            a.putExtra("txRequest", bypc.mo73642k());
        }
        return a;
    }

    /* renamed from: b */
    public static void m6533b(byte[] bArr) {
        if (bArr != null) {
            Intent intent = new Intent("AUTHZEN_UPDATE_ACTIVITY");
            intent.setPackage("com.google.android.gms");
            intent.putExtra("transaction_id", bArr);
            int i = -1;
            ikm.m15621c(-1);
            ikg a = f10497a.mo13090a(bArr);
            if (a != null) {
                i = a.f21191h;
                ikm.m15621c(i);
            }
            intent.putExtra("transaction_state", i);
            rpr.m34216b().sendBroadcast(intent);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:163:0x0397 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:192:0x03e1 */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:178:0x03c3 */
    /* JADX WARN: Type inference failed for: r16v9, assign insn: PHI: (r16v9 ?) = (r16v21 ?), (r16v8 int) binds: [B:126:0x02c0, B:121:0x02b2] */
    /* JADX WARN: Type inference failed for: r16v13, assign insn: PHI: (r16v13 ?) = (r16v9 ?), (r16v18 ?) binds: [B:163:0x0397, B:178:0x03c3] */
    /* JADX WARN: Type inference failed for: r16v18, assign insn: PHI: (r16v18 ?) = (r16v19 byte[]), (r16v20 byte[]), (r16v20 byte[]) binds: [B:177:0x03c1, B:175:0x03be, B:174:?] */
    /* JADX WARN: Type inference failed for: r16v21, assign insn: 0x02cb: CONST  (r16v21 ? I:?[int, float, short, byte, char]) = (16 ?[int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v26, assign insn: PHI: (r9v26 ?) = (r9v27 ?), (r9v28 ?) binds: [B:86:0x01f8, B:81:0x01e1] */
    /* JADX WARN: Type inference failed for: r9v27, assign insn: 0x0201: CONST  (r9v27 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARN: Type inference failed for: r9v28, assign insn: 0x01e1: CONST  (r9v28 ? I:?[boolean, int, float, short, byte, char]) = (1 ?[boolean, int, float, short, byte, char]) */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03da, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x088c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x088d, code lost:
        r4 = r11;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:406:0x08c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        p000.ikf.f21178d.mo25415d("Error getting auth token", r0, new java.lang.Object[0]);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x048b A[SYNTHETIC, Splitter:B:224:0x048b] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0498 A[SYNTHETIC, Splitter:B:227:0x0498] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00f3 A[ExcHandler: gid (r0v36 'e' gid A[CUSTOM_DECLARE]), Splitter:B:34:0x00df] */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final void onHandleIntent(Intent intent) {
        asfb asfb;
        Throwable th;
        int i;
        shj shj;
        String str;
        int i2;
        String str2;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        String str3;
        String stringExtra;
        ReentrantLock reentrantLock;
        Context context;
        int i3;
        ClientContext clientContext;
        int i4;
        gid gid;
        VolleyError volleyError;
        iht iht;
        ihv ihv;
        Integer valueOf;
        Context context2;
        boolean z;
        int i5;
        byte[] bArr4;
        byte[] bArr5;
        String str4;
        ikg a;
        byte[] bArr6;
        ? r9;
        bypf bypf;
        byox byox;
        TransactionReplyIntentOperation transactionReplyIntentOperation;
        IOException iOException;
        TransactionReplyIntentOperation transactionReplyIntentOperation2 = this;
        Intent intent2 = intent;
        asfb asfb2 = new asfb(this, 1, "TransactionReplyIntentOperationWakeLock", null, "com.google.android.gms");
        asfb2.mo49115a(false);
        try {
            asfb2.mo49111a(3000);
            if (!"com.google.android.gms.auth.authzen.operation.TRANSACTION_STATE_SYNC_REQUEST".equals(intent.getAction())) {
                String stringExtra2 = intent2.getStringExtra("account");
                bysa bysa = (bysa) intent2.getSerializableExtra("type");
                byte[] byteArrayExtra = intent2.getByteArrayExtra("transaction_id");
                if (bysa != bysa.TX_REPLY) {
                    try {
                        i = bysa == bysa.TX_SYNC_REQUEST ? 3 : 1;
                    } catch (Throwable th2) {
                        th = th2;
                        asfb = asfb2;
                        asfb.mo49120c();
                        throw th;
                    }
                } else {
                    i = 2;
                }
                shj shj2 = shj;
                byte[] bArr7 = byteArrayExtra;
                asfb = asfb2;
                bysa bysa2 = bysa;
                shj = new shj(this, igi.m15410a(), "cryptauth/v1/", false, true, null, null, 4098, "AIzaSyAP-gfH3qvi6vgHZbSYwQ_XHqV_mXHhzIk");
                ijk ijk = new ijk(new ihf(shj2));
                iju iju = new iju(transactionReplyIntentOperation2, "TRS");
                long j = ifj.f20859a;
                ikf ikf = new ikf(this, ijk, iju, bArr7, i);
                ikf.mo13085b(15);
                String valueOf2 = String.valueOf(igi.m15411b());
                if (valueOf2.length() == 0) {
                    try {
                        str = new String("oauth2:");
                    } catch (IOException e) {
                        ikf.mo13084a(context2, -1, e);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    str = "oauth2:".concat(valueOf2);
                }
                i2 = 0;
                while (i2 < 3) {
                    if (i2 > 0) {
                        ikf.m15580a();
                    }
                    try {
                        String a2 = gie.m13189a(ikf.f21180b, stringExtra2, str);
                        ikf.mo13085b(16);
                        str2 = a2;
                        break;
                    } catch (IOException e2) {
                        iOException = e2;
                        transactionReplyIntentOperation = transactionReplyIntentOperation2;
                    } catch (gid e3) {
                    } catch (Throwable th4) {
                        th = th4;
                        th = th;
                        asfb.mo49120c();
                        throw th;
                    }
                }
                ikf.mo13085b(17);
                str2 = null;
                if (bysa2 == bysa.TX_REPLY) {
                    bArr = bArr7;
                    if (!f10497a.mo13092a(f10497a.mo13090a(bArr), 70)) {
                        f10498b.mo25416d("Can't update transaction state to replied", new Object[0]);
                    }
                } else {
                    bArr = bArr7;
                }
                if (str2 == null) {
                    f10498b.mo25416d("Failed to get auth token", new Object[0]);
                }
                ikk ikk = new ikk(transactionReplyIntentOperation2);
                byte[] byteArrayExtra2 = intent2.getByteArrayExtra("message");
                if (byteArrayExtra2 != null) {
                    bArr2 = bArr;
                    i5 = 2;
                    z = true;
                } else if (bysa2 != bysa.TX_SYNC_REQUEST) {
                    sek sek = ikk.f21208c;
                    String valueOf3 = String.valueOf(bysa2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 38);
                    sb.append("cannot build message for payload type ");
                    sb.append(valueOf3);
                    sek.mo25418e(sb.toString(), new Object[0]);
                    bArr2 = bArr;
                    bArr3 = null;
                    if (bArr3 == null) {
                        f10498b.mo25414c("message is null", new Object[0]);
                    } else {
                        f10498b.mo25414c("Sending response for transaction (txId=%s) of type %s", ikj.m15598b(bArr2), bysa2);
                        byrz byrz = new byrz(bysa2, bArr3);
                        intent2.getByteArrayExtra("keyHandle");
                        String a3 = ikf.mo13083a(byrz, stringExtra2);
                        ikf.mo13085b(18);
                        if (a3 == null) {
                            ikf.f21178d.mo25418e("Cannot send null message", new Object[0]);
                            str3 = null;
                        } else {
                            if (ikf.m15581a(2)) {
                                ikf.f21178d.mo25414c("Calling server via GCM", new Object[0]);
                                context2 = ikf.f21180b;
                                if (bysa2 != bysa.TX_SYNC_REQUEST) {
                                    sek sek2 = ikf.f21178d;
                                    String valueOf4 = String.valueOf(bysa2);
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf4).length() + 43);
                                    sb2.append("Sending GCM not supported for payload type ");
                                    sb2.append(valueOf4);
                                    sek2.mo25418e(sb2.toString(), new Object[0]);
                                } else {
                                    sek sek3 = ikf.f21178d;
                                    String valueOf5 = String.valueOf(bysa2);
                                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf5).length() + 38);
                                    sb3.append("Sending GCM upstream message of type: ");
                                    sb3.append(valueOf5);
                                    sek3.mo25414c(sb3.toString(), new Object[0]);
                                    iju iju2 = ikf.f21181c;
                                    String str5 = bysa2.toString();
                                    Bundle bundle = new Bundle();
                                    bundle.putString("l", str5);
                                    bundle.putString("a", stringExtra2);
                                    if (str2 != null) {
                                        bundle.putString("t", str2);
                                    }
                                    bundle.putString("p", a3);
                                    aakz aakz = iju2.f21148b;
                                    String str6 = iju2.f21149c;
                                    String str7 = iju2.f21150d;
                                    long incrementAndGet = iju.f21147a.incrementAndGet();
                                    StringBuilder sb4 = new StringBuilder(String.valueOf(str7).length() + 20);
                                    sb4.append(str7);
                                    sb4.append(incrementAndGet);
                                    aakz.mo16961a(str6, sb4.toString(), 3600, bundle);
                                }
                                ikf.mo13085b(19);
                            }
                            if (ikf.m15581a(1)) {
                                try {
                                    ikf.f21178d.mo25414c("Calling server via HTTP", new Object[0]);
                                    context = ikf.f21180b;
                                    if (str2 != null) {
                                        int i6 = context.getApplicationInfo().uid;
                                        String packageName = context.getPackageName();
                                        i3 = 2;
                                        clientContext = new ClientContext(i6, stringExtra2, stringExtra2, packageName, packageName);
                                        clientContext.mo17806d(igi.m15411b());
                                        clientContext.mo17798a("auth_token", str2);
                                    } else {
                                        i3 = 2;
                                        ikf.f21178d.mo25414c("Creating client context without an auth token", new Object[0]);
                                        int i7 = context.getApplicationInfo().uid;
                                        Account account = null;
                                        String packageName2 = context.getPackageName();
                                        clientContext = new ClientContext(i7, account, account, packageName2, packageName2);
                                        clientContext.mo17806d(igi.m15411b());
                                    }
                                    i4 = 0;
                                    while (i4 < 3) {
                                        if (i4 != 0) {
                                            ikf.f21178d.mo25414c("attempting send operation again", new Object[0]);
                                        }
                                        try {
                                            ijk ijk2 = ikf.f21179a;
                                            int ordinal = bysa2.ordinal();
                                            if (ordinal == 3) {
                                                try {
                                                    iht = new iht();
                                                    iht.f21035a = stringExtra2;
                                                    iht.f21037c.add(Integer.valueOf(i3));
                                                    iht.f21036b = a3;
                                                } catch (gid e4) {
                                                    e = e4;
                                                    gid = e;
                                                    ikf.mo13084a(context, i4, gid);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                } catch (VolleyError e5) {
                                                    e = e5;
                                                    volleyError = e;
                                                    ikf.mo13084a(context, i4, volleyError);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                }
                                                try {
                                                    iht.f21037c.add(3);
                                                    ijk2.f21113a.f21018a.mo25539a(clientContext, 1, new StringBuilder("authzen/replytx").toString(), new ReplyTxRequestEntity(iht.f21037c, iht.f21035a, iht.f21036b));
                                                    ikf.f21178d.mo25414c("Sent HTTP TxReply message", new Object[0]);
                                                    str3 = null;
                                                } catch (gid e6) {
                                                    e = e6;
                                                    gid = e;
                                                    ikf.mo13084a(context, i4, gid);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                } catch (VolleyError e7) {
                                                    e = e7;
                                                    volleyError = e;
                                                    ikf.mo13084a(context, i4, volleyError);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                }
                                            } else if (ordinal != 4) {
                                                try {
                                                    sek sek4 = ikf.f21178d;
                                                    String valueOf6 = String.valueOf(bysa2);
                                                    StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf6).length() + 22);
                                                    sb5.append("Invalid message type: ");
                                                    sb5.append(valueOf6);
                                                    sek4.mo25418e(sb5.toString(), new Object[0]);
                                                    str3 = null;
                                                } catch (gid e8) {
                                                    gid = e8;
                                                } catch (VolleyError e9) {
                                                    volleyError = e9;
                                                    ikf.mo13084a(context, i4, volleyError);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                }
                                            } else {
                                                try {
                                                    ihv = new ihv();
                                                    ihv.f21038a = stringExtra2;
                                                    Set set = ihv.f21040c;
                                                    valueOf = Integer.valueOf(i3);
                                                    set.add(valueOf);
                                                    ihv.f21039b = a3;
                                                } catch (gid e10) {
                                                    e = e10;
                                                    gid = e;
                                                    ikf.mo13084a(context, i4, gid);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                } catch (VolleyError e11) {
                                                    e = e11;
                                                    volleyError = e;
                                                    ikf.mo13084a(context, i4, volleyError);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                }
                                                try {
                                                    ihv.f21040c.add(4);
                                                    Integer num = valueOf;
                                                    SyncTxResponseEntity syncTxResponseEntity = (SyncTxResponseEntity) ijk2.f21113a.f21018a.mo25536a(clientContext, 1, new StringBuilder("authzen/synctx").toString(), new SyncTxRequestEntity(ihv.f21040c, ihv.f21038a, null, ihv.f21039b, null), SyncTxResponseEntity.class);
                                                    ikf.f21178d.mo25414c("Sent HTTP TxSyncRequest message", new Object[0]);
                                                    if (syncTxResponseEntity == null) {
                                                        ikf.f21178d.mo25418e("Did not expect a null SyncTxReplyEntity on SyncTx", new Object[0]);
                                                        str3 = null;
                                                    } else if (!syncTxResponseEntity.f10457a.contains(num)) {
                                                        ikf.f21178d.mo25418e("Did not expect an empty SyncTxReplyEntity on SyncTx", new Object[0]);
                                                        str3 = null;
                                                    } else {
                                                        str3 = syncTxResponseEntity.f10458b;
                                                    }
                                                } catch (gid e12) {
                                                    e = e12;
                                                    gid = e;
                                                    ikf.mo13084a(context, i4, gid);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                } catch (VolleyError e13) {
                                                    e = e13;
                                                    volleyError = e;
                                                    ikf.mo13084a(context, i4, volleyError);
                                                    ikf.m15580a();
                                                    i4++;
                                                    transactionReplyIntentOperation2 = this;
                                                }
                                            }
                                            sek sek5 = ikf.f21178d;
                                            String valueOf7 = String.valueOf(bysa2);
                                            StringBuilder sb6 = new StringBuilder(String.valueOf(valueOf7).length() + 27);
                                            sb6.append("Sent HTTP message of type: ");
                                            sb6.append(valueOf7);
                                            sek5.mo25414c(sb6.toString(), new Object[0]);
                                            break;
                                        } catch (gid e14) {
                                            e = e14;
                                            gid = e;
                                            ikf.mo13084a(context, i4, gid);
                                            ikf.m15580a();
                                            i4++;
                                            transactionReplyIntentOperation2 = this;
                                        } catch (VolleyError e15) {
                                            e = e15;
                                            volleyError = e;
                                            ikf.mo13084a(context, i4, volleyError);
                                            ikf.m15580a();
                                            i4++;
                                            transactionReplyIntentOperation2 = this;
                                        }
                                    }
                                    if (bysa2 == bysa.TX_REPLY) {
                                        ikf.f21178d.mo25418e("Sending reply tx failed after 3 retries", new Object[0]);
                                        str3 = null;
                                    } else {
                                        str3 = null;
                                    }
                                    ikf.mo13085b(20);
                                } catch (gid e16) {
                                    e = e16;
                                    gid = e;
                                    ikf.mo13084a(context, i4, gid);
                                    ikf.m15580a();
                                    i4++;
                                    transactionReplyIntentOperation2 = this;
                                } catch (VolleyError e17) {
                                    e = e17;
                                    volleyError = e;
                                    ikf.mo13084a(context, i4, volleyError);
                                    ikf.m15580a();
                                    i4++;
                                    transactionReplyIntentOperation2 = this;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            } else {
                                str3 = null;
                            }
                        }
                        if (bysa2 == bysa.TX_REPLY && (stringExtra = intent2.getStringExtra("txCacheKey")) != null) {
                            byte[] byteArrayExtra3 = intent2.getByteArrayExtra("transaction_id");
                            ikh ikh = ikj.f21204a;
                            ikh.f21193b.lock();
                            try {
                                ikh.f21195d.mo25414c(stringExtra.length() == 0 ? new String("Removing transaction from cache: ") : "Removing transaction from cache: ".concat(stringExtra), new Object[0]);
                                String a4 = ikh.f21194c.mo13139a(stringExtra);
                                if (a4 == null) {
                                    ikh.f21195d.mo25414c("Could not remove transaction entry -- not found", new Object[0]);
                                    reentrantLock = ikh.f21193b;
                                    reentrantLock.unlock();
                                } else {
                                    ikg a5 = ikg.m15585a(a4);
                                    if (byteArrayExtra3 != null) {
                                        if (!Arrays.equals(a5.f21184a.f167308b.mo73780k(), byteArrayExtra3)) {
                                            ikh.f21195d.mo25416d("Not removing entry as txId not the same", new Object[0]);
                                            reentrantLock = ikh.f21193b;
                                            reentrantLock.unlock();
                                        }
                                    }
                                    if (ikh.f21194c.mo13141a(stringExtra, null, a4)) {
                                        ikh.mo13089b();
                                        ikh.f21194c.mo13140a();
                                        reentrantLock = ikh.f21193b;
                                        reentrantLock.unlock();
                                    } else {
                                        ikh.mo13088a();
                                        throw new IllegalStateException("Transaction cache storage failed internally during remove");
                                    }
                                }
                            } catch (IOException e18) {
                                ikh.f21195d.mo25417e("Internal transaction cache error", e18, new Object[0]);
                                ikh.mo13088a();
                                reentrantLock = ikh.f21193b;
                            }
                        }
                        if (bysa2 == bysa.TX_SYNC_REQUEST) {
                            Intent intent3 = new Intent(intent2);
                            intent3.putExtra("syncPayload", str3);
                            new ifd(this, new ikj()).mo12958a(this, intent3);
                        }
                    }
                } else {
                    bynz a6 = ikk.f21210b.mo13058a();
                    if (str2 != null) {
                        bxvd a7 = bynz.f167151u.mo74141a(a6);
                        if (a7.f164950c) {
                            a7.mo74035c();
                            a7.f164950c = false;
                        }
                        bynz bynz = (bynz) a7.f164949b;
                        str2.getClass();
                        bynz.f167153a |= AndroidInputTypeSignal.TYPE_TEXT_FLAG_NO_SUGGESTIONS;
                        bynz.f167172t = str2;
                        a6 = (bynz) a7.mo74062i();
                    }
                    bxvd da = bypg.f167334g.mo74144da();
                    bArr2 = bArr;
                    long currentTimeMillis = System.currentTimeMillis();
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    bypg bypg = (bypg) da.f164949b;
                    int i8 = bypg.f167336a | 4;
                    bypg.f167336a = i8;
                    bypg.f167338c = currentTimeMillis;
                    a6.getClass();
                    bypg.f167339d = a6;
                    bypg.f167336a = i8 | 8;
                    byte[] bArr8 = new byte[0];
                    if (!intent2.hasExtra("transaction_id")) {
                        r9 = 1;
                    } else {
                        bArr8 = intent2.getByteArrayExtra("transaction_id");
                        bxtx a8 = bxtx.m123261a(bArr8);
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bypg bypg2 = (bypg) da.f164949b;
                        a8.getClass();
                        r9 = 1;
                        bypg2.f167336a |= 1;
                        bypg2.f167337b = a8;
                    }
                    if (intent2.hasExtra("syncState")) {
                        bypf = (bypf) intent2.getSerializableExtra("syncState");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bypg bypg3 = (bypg) da.f164949b;
                        bypg3.f167340e = bypf.f167333e;
                        bypg3.f167336a |= 32;
                    } else {
                        bypf = null;
                    }
                    if (intent2.hasExtra("trigger")) {
                        byox = (byox) intent2.getSerializableExtra("trigger");
                        if (da.f164950c) {
                            da.mo74035c();
                            da.f164950c = false;
                        }
                        bypg bypg4 = (bypg) da.f164949b;
                        bypg4.f167341f = byox.f167278e;
                        bypg4.f167336a |= 64;
                    } else {
                        byox = null;
                    }
                    sek sek6 = ikk.f21208c;
                    Object[] objArr = new Object[3];
                    objArr[0] = ikj.m15598b(bArr8);
                    objArr[r9] = bypf;
                    i5 = 2;
                    objArr[2] = byox;
                    sek6.mo25414c("Built TxSync: txId=[%s], syncState=%s, trigger=%s", objArr);
                    byteArrayExtra2 = ((bypg) da.mo74062i()).mo73642k();
                    z = r9;
                }
                if (bysa2.ordinal() != 3) {
                    bArr4 = byteArrayExtra2;
                } else {
                    try {
                        bxvd a9 = byoz.f167283d.mo74141a((byoz) GeneratedMessageLite.m124014a(byoz.f167283d, byteArrayExtra2));
                        bypd bypd = ((byoz) a9.f164949b).f167287c;
                        if (bypd == null) {
                            bypd = bypd.f167317i;
                        }
                        bxvd a10 = bypd.f167317i.mo74141a(bypd);
                        int i9 = ((bypd) a10.f164949b).f167319a & 16;
                        if (i9 == 0) {
                            byqq byqq = byqq.f167409i;
                            if (a10.f164950c) {
                                a10.mo74035c();
                                a10.f164950c = false;
                            }
                            bypd bypd2 = (bypd) a10.f164949b;
                            byqq.getClass();
                            bypd2.f167325g = byqq;
                            i9 = 16;
                            bypd2.f167319a |= 16;
                        }
                        byqq byqq2 = ((bypd) a10.f164949b).f167325g;
                        if (byqq2 == null) {
                            byqq2 = byqq.f167409i;
                        }
                        bxvd a11 = byqq.f167409i.mo74141a(byqq2);
                        if (ikk.f21209a.mo12994b()) {
                            if (a11.f164950c) {
                                a11.mo74035c();
                                a11.f164950c = false;
                            }
                            byqq byqq3 = (byqq) a11.f164949b;
                            boolean z2 = byqq3.f167411a | z;
                            byqq3.f167411a = z2;
                            byqq3.f167412b = z;
                            byqq3.f167413c = 10;
                            byqq3.f167411a = z2 | true;
                            ikk.mo13093a(a11);
                        } else {
                            if (a11.f164950c) {
                                a11.mo74035c();
                                a11.f164950c = false;
                            }
                            byqq byqq4 = (byqq) a11.f164949b;
                            byqq4.f167411a |= 1;
                            byqq4.f167412b = false;
                        }
                        byqq byqq5 = (byqq) a11.mo74062i();
                        if (a10.f164950c) {
                            a10.mo74035c();
                            a10.f164950c = false;
                        }
                        bypd bypd3 = (bypd) a10.f164949b;
                        byqq5.getClass();
                        bypd3.f167325g = byqq5;
                        bypd3.f167319a |= 16;
                        bxvd da2 = byqn.f167402e.mo74144da();
                        if (da2.f164950c) {
                            da2.mo74035c();
                            da2.f164950c = false;
                        }
                        byqn byqn = (byqn) da2.f164949b;
                        byqq5.getClass();
                        byqn.f167406c = byqq5;
                        byqn.f167404a |= i5;
                        igg a12 = igg.m15405a();
                        bypc bypc = ((byoz) a9.f164949b).f167286b;
                        if (bypc == null) {
                            bypc = bypc.f167305k;
                        }
                        byte[] k = bypc.f167308b.mo73780k();
                        if (TextUtils.isEmpty((CharSequence) igt.f20962l.mo58455c()) || (a = igg.f20915a.mo13087a(k)) == null) {
                            str4 = null;
                        } else {
                            String str8 = a.f21190g;
                            if (str8 == null) {
                                synchronized (a12.f20919c) {
                                    try {
                                        long elapsedRealtime = SystemClock.elapsedRealtime();
                                        long longValue = elapsedRealtime + ((Long) igt.f20964n.mo58455c()).longValue();
                                        while (true) {
                                            if (a12.f20920d) {
                                                if (elapsedRealtime >= longValue) {
                                                    break;
                                                }
                                                try {
                                                    bArr5 = byteArrayExtra2;
                                                    try {
                                                        a12.f20919c.wait(longValue - elapsedRealtime);
                                                    } catch (InterruptedException e19) {
                                                    }
                                                } catch (InterruptedException e20) {
                                                    bArr5 = byteArrayExtra2;
                                                }
                                                elapsedRealtime = SystemClock.elapsedRealtime();
                                                byteArrayExtra2 = bArr5;
                                            } else {
                                                break;
                                            }
                                        }
                                        ikg a13 = igg.f20915a.mo13087a(k);
                                        if (a13 != null) {
                                            str4 = a13.f21190g;
                                        }
                                    } catch (Throwable th6) {
                                        th = th6;
                                        bArr6 = bArr5;
                                        Throwable th7 = th;
                                        throw th7;
                                    }
                                }
                            } else {
                                str4 = str8;
                            }
                        }
                        if (str4 != null) {
                            bxvd da3 = byqt.f167420c.mo74144da();
                            if (da3.f164950c) {
                                da3.mo74035c();
                                da3.f164950c = false;
                            }
                            byqt byqt = (byqt) da3.f164949b;
                            str4.getClass();
                            byqt.f167422a |= 1;
                            byqt.f167423b = str4;
                            byqt byqt2 = (byqt) da3.mo74062i();
                            if (da2.f164950c) {
                                da2.mo74035c();
                                da2.f164950c = false;
                            }
                            byqn byqn2 = (byqn) da2.f164949b;
                            byqt2.getClass();
                            byqn2.f167407d = byqt2;
                            byqn2.f167404a |= 4;
                        }
                        if (a10.f164950c) {
                            a10.mo74035c();
                            a10.f164950c = false;
                        }
                        bypd bypd4 = (bypd) a10.f164949b;
                        byqn byqn3 = (byqn) da2.mo74062i();
                        byqn3.getClass();
                        bypd4.f167326h = byqn3;
                        bypd4.f167319a |= 32;
                        if (a9.f164950c) {
                            a9.mo74035c();
                            a9.f164950c = false;
                        }
                        byoz byoz = (byoz) a9.f164949b;
                        bypd bypd5 = (bypd) a10.mo74062i();
                        bypd5.getClass();
                        byoz.f167287c = bypd5;
                        byoz.f167285a |= 2;
                        bArr3 = ((byoz) a9.mo74062i()).mo73642k();
                    } catch (bxwf e21) {
                        bArr4 = byteArrayExtra2;
                        ikk.f21208c.mo25418e("Failed to parse TxLedger", new Object[0]);
                        bArr3 = bArr4;
                        if (bArr3 == null) {
                        }
                    }
                    if (bArr3 == null) {
                    }
                }
                bArr3 = bArr4;
                if (bArr3 == null) {
                }
            } else {
                asfb = asfb2;
                m6533b(intent2.getByteArrayExtra("transaction_id"));
            }
            asfb.mo49120c();
            return;
            sek sek7 = ikf.f21178d;
            StringBuilder sb7 = new StringBuilder(45);
            sb7.append("Error getting auth token, attempt ");
            sb7.append(i2);
            sek7.mo25415d(sb7.toString(), iOException, new Object[0]);
            i2++;
            transactionReplyIntentOperation2 = transactionReplyIntentOperation;
        } catch (Throwable th8) {
            th = th8;
            asfb = asfb2;
            th = th;
            asfb.mo49120c();
            throw th;
        }
    }

    /* renamed from: a */
    public static Intent m6530a(String str, byte[] bArr, bypc bypc, byrz byrz) {
        Intent a = m6531a(str, bArr, byrz.f167530a);
        a.putExtra("message", byrz.f167531b);
        a.putExtra("transaction_id", bypc.f167308b.mo73780k());
        String a2 = ikh.m15587a(bypc);
        if (a2 != null) {
            a.putExtra("txCacheKey", a2);
        }
        return a;
    }

    /* renamed from: a */
    private static Intent m6531a(String str, byte[] bArr, bysa bysa) {
        sdo.m34977c(str);
        return IntentOperation.getStartIntent(rpr.m34216b(), TransactionReplyIntentOperation.class, "com.google.android.gms.auth.authzen.operation.TRANSACTION_REPLY").putExtra("account", str).putExtra("keyHandle", bArr).putExtra("type", bysa);
    }

    /* renamed from: a */
    public static Intent m6532a(byte[] bArr) {
        Intent startIntent = IntentOperation.getStartIntent(rpr.m34216b(), TransactionReplyIntentOperation.class, "com.google.android.gms.auth.authzen.operation.TRANSACTION_STATE_SYNC_REQUEST");
        startIntent.putExtra("transaction_id", bArr);
        return startIntent;
    }
}
