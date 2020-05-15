package com.google.android.gms.ads.social;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.C0633h;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* renamed from: com.google.android.gms.ads.social.c */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class C0902c {

    /* renamed from: a */
    private final Context f9467a;

    /* renamed from: b */
    private final C0904e f9468b;

    /* renamed from: c */
    private final C0900a f9469c;

    public C0902c(Context context, C0904e eVar, C0900a aVar) {
        this.f9467a = context;
        this.f9468b = eVar;
        this.f9469c = aVar;
    }

    /* renamed from: a */
    static C0902c m6094a(Context context) {
        return new C0902c(context, C0904e.m6102a(context), C0900a.m6091a(context));
    }

    /* renamed from: a */
    public final int mo7125a(String str) {
        C0633h.m5664a("Running DSID refresh task.");
        if (TextUtils.isEmpty(str) || !Character.isDigit(str.charAt(str.length() - 1))) {
            Account[] a = this.f9468b.mo7132a();
            C0901b bVar = new C0901b(this.f9467a);
            boolean z = true;
            for (Account account : a) {
                z = z && mo7126a(account.name, bVar);
            }
            if (z) {
                return 0;
            }
            if (str.startsWith("ads.social.doritos-oneoff")) {
                return 2;
            }
            return 1;
        }
        C0633h.m5664a("Cancelling old DRT task.");
        aeat.m51532a(this.f9467a).mo33986a(str, "com.google.android.gms.ads.social.GcmSchedulerWakeupService");
        return 2;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        if (r6 != 200) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0092, code lost:
        r11 = r5.getHeaderFields();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r11 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        r0 = r11.keySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r0.hasNext() == false) goto L_0x00bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a7, code lost:
        r1 = r0.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b3, code lost:
        if ("Set-Cookie".equalsIgnoreCase(r1) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        r11 = r11.get(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00bc, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r11 == null) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r11 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c7, code lost:
        if (r11.hasNext() == false) goto L_0x00dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c9, code lost:
        r0 = r11.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r0 == null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d7, code lost:
        if (r0.startsWith("DSID") == false) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d9, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00dc, code lost:
        r9.f9469c.f9465a.edit().putString(r10, r2).apply();
        com.google.android.gms.ads.internal.util.client.C0633h.m5664a("Saved DSID.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return false;
     */
    /* renamed from: a */
    public final boolean mo7126a(String str, C0901b bVar) {
        try {
            URL url = new URL(cbsy.f178239a.mo6606a().mo75347g());
            aboy aboy = new aboy(this.f9467a);
            int i = 0;
            while (true) {
                try {
                    String a = gie.m13189a(bVar.f9466a, str, cbsy.f178239a.mo6606a().mo75343c());
                    if (a == null) {
                        return false;
                    }
                    try {
                        shr.m35316b((int) PSKKeyManager.MAX_KEY_LENGTH_BYTES);
                        HttpURLConnection a2 = aboy.mo32271a(url);
                        if (a2 == null) {
                            break;
                        }
                        a2.setRequestProperty("Authorization", a.length() == 0 ? new String("Bearer ") : "Bearer ".concat(a));
                        int responseCode = a2.getResponseCode();
                        aboy.mo32262a(a2, responseCode);
                        shr.m35312a();
                        if (responseCode == 401) {
                            try {
                                gie.m13196b(bVar.f9466a, a);
                            } catch (Exception e) {
                                String valueOf = String.valueOf(e);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
                                sb.append("Failed to clear auth token for DSID: ");
                                sb.append(valueOf);
                                C0633h.m5664a(sb.toString());
                                return false;
                            }
                        }
                        if (responseCode != 401) {
                            break;
                        }
                        int i2 = i + 1;
                        if (i != 0) {
                            break;
                        }
                        i = i2;
                    } catch (IOException e2) {
                        String valueOf2 = String.valueOf(url);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 41);
                        sb2.append("Failed to connect to ");
                        sb2.append(valueOf2);
                        sb2.append(". No DSID retrieved.");
                        C0633h.m5668b(sb2.toString());
                    } catch (Throwable th) {
                        shr.m35312a();
                        throw th;
                    }
                } catch (Exception e3) {
                    String valueOf3 = String.valueOf(e3);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 35);
                    sb3.append("Failed to get auth token for DSID: ");
                    sb3.append(valueOf3);
                    C0633h.m5664a(sb3.toString());
                    return false;
                }
            }
            shr.m35312a();
            return false;
        } catch (MalformedURLException e4) {
            return false;
        }
    }
}
