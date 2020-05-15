package p000;

import com.felicanetworks.mfc.mfi.MfiClientException;
import java.io.IOException;
import java.io.PipedOutputStream;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aivn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class aivn implements aivf {

    /* renamed from: a */
    private final bqgj f69883a = ahhr.m55806b();

    /* renamed from: b */
    private final Map f69884b = new C1223np();

    /* renamed from: c */
    private final Map f69885c = new C1223np();

    /* renamed from: d */
    private final Random f69886d = new SecureRandom();

    /* renamed from: e */
    private aivm f69887e;

    /* renamed from: c */
    private final aivg m58018c(aivw aivw) {
        ails.m57439a();
        aivl aivl = new aivl(this, aivw, this, aivw);
        this.f69884b.put(aivw, aivl);
        return aivl;
    }

    /* renamed from: a */
    public final synchronized aivg mo38120a(aivw aivw) {
        aivg aivg = (aivg) this.f69884b.get(aivw);
        if (aivg != null) {
            return aivg;
        }
        return m58018c(aivw);
    }

    /* renamed from: a */
    public final synchronized void mo38123a(aivm aivm) {
        this.f69887e = aivm;
    }

    /* renamed from: b */
    public final synchronized void mo38125b(int i) {
        Map map = this.f69885c;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aivn", "b", (int) MfiClientException.TYPE_ILLEGAL_CARD_OPERATION, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("WiFi Aware received onMessageSendFailed for unknown messageId %d", i);
            return;
        }
        ((bqgy) this.f69885c.remove(valueOf)).mo69136a((Throwable) new IOException(String.format(Locale.US, "Message %d failed to send", valueOf)));
    }

    /* renamed from: a */
    public final synchronized void mo38121a() {
        ahhr.m55805a(this.f69883a, "WifiAwareL2SocketManager.singleThreadOffloader");
        Iterator it = new C1225nr(this.f69884b.values()).iterator();
        while (it.hasNext()) {
            ((aivg) it.next()).close();
        }
        this.f69887e = null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        return;
     */
    /* renamed from: c */
    public final synchronized void mo38128c(aivw aivw, byte[] bArr) {
        srn srn = ailf.f69111a;
        ails.m57438a(bArr);
        aivg aivg = (aivg) this.f69884b.get(aivw);
        if (aivg == null) {
            aivg = m58018c(aivw);
            aivm aivm = this.f69887e;
            if (aivm != null) {
                aivm.mo38119a(aivg);
            }
        }
        PipedOutputStream pipedOutputStream = aivg.f69868d;
        if (pipedOutputStream != null) {
            try {
                pipedOutputStream.write(bArr);
                if (cfnv.m140741C()) {
                    aivg.f69868d.flush();
                }
            } catch (IOException e) {
                bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
                bnsl.mo68437a(e);
                bnsl.mo68432a("aivg", "a", 97, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
                bnsl.mo68420a("WifiAwareL2Socket connected to %s encountered an error when receiving incoming data.", aivg.f69865a);
            }
        } else {
            bnsl bnsl2 = (bnsl) ailf.f69111a.mo68387b();
            bnsl2.mo68432a("aivg", "a", 87, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl2.mo68405a("WifiAwareL2Socket failed to process incoming bytes.");
        }
    }

    /* renamed from: a */
    public final synchronized void mo38122a(int i) {
        Map map = this.f69885c;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            bnsl bnsl = (bnsl) ailf.f69111a.mo68388c();
            bnsl.mo68432a("aivn", "a", 142, ":com.google.android.gms@201515033@20.15.15 (120300-306758586)");
            bnsl.mo68409a("WiFi Aware received onMessageSendSucceeded for unknown messageId %d", i);
            return;
        }
        ((bqgy) this.f69885c.remove(valueOf)).mo69138b((Object) null);
    }

    /* renamed from: b */
    public final synchronized void mo38126b(aivw aivw) {
        this.f69884b.remove(aivw);
    }

    /* renamed from: b */
    public final void mo38127b(aivw aivw, byte[] bArr) {
        int nextInt;
        bqgy c = bqgy.m112818c();
        synchronized (this) {
            nextInt = this.f69886d.nextInt();
            this.f69885c.put(Integer.valueOf(nextInt), c);
            aivw.f69911c.sendMessage(aivw.f69909a, nextInt, bArr);
        }
        try {
            c.get(cfnv.f184625a.mo6606a().mo81815bg(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            synchronized (this) {
                this.f69885c.remove(Integer.valueOf(nextInt));
                if (e instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                throw new IOException(String.format("Failed to write to %s", aivw), e);
            }
        }
    }

    /* renamed from: a */
    public final void mo38112a(aivw aivw, byte[] bArr) {
        srn srn = ailf.f69111a;
        ails.m57438a(bArr);
        if (!butl.m120434a(new aivh(this, aivw, bArr), "WriteToPeerHandle", new butj(0).mo73110a())) {
            throw new IOException("Failed to write");
        }
    }

    /* renamed from: a */
    public final void mo38124a(Runnable runnable) {
        this.f69883a.execute(runnable);
    }
}
