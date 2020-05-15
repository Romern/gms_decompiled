package p000;

import android.accounts.Account;
import com.google.android.gms.auth.account.mdm.GcmReceiverChimeraService;
import com.google.android.gms.auth.account.p016be.RemoveAccountChimeraIntentService;
import java.io.IOException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpResponseException;
import org.apache.http.entity.ByteArrayEntity;

/* renamed from: grl */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class grl implements Runnable {

    /* renamed from: a */
    final /* synthetic */ HttpEntity f18886a;

    /* renamed from: b */
    final /* synthetic */ String f18887b;

    /* renamed from: c */
    final /* synthetic */ String f18888c;

    /* renamed from: d */
    final /* synthetic */ long f18889d;

    /* renamed from: e */
    final /* synthetic */ GcmReceiverChimeraService f18890e;

    public grl(GcmReceiverChimeraService gcmReceiverChimeraService, HttpEntity httpEntity, String str, String str2, long j) {
        this.f18890e = gcmReceiverChimeraService;
        this.f18886a = httpEntity;
        this.f18887b = str;
        this.f18888c = str2;
        this.f18889d = j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x01b1 A[SYNTHETIC, Splitter:B:66:0x01b1] */
    public final void run() {
        try {
            HttpResponse a = gmv.m13465a(gnv.m13525aG(), this.f18886a, GcmReceiverChimeraService.m6303a(this.f18887b));
            HttpEntity httpEntity = null;
            try {
                StatusLine statusLine = a.getStatusLine();
                int statusCode = statusLine.getStatusCode();
                Header lastHeader = a.getLastHeader("Location");
                if (statusCode != 200) {
                    String valueOf = String.valueOf(statusLine);
                    String reasonPhrase = statusLine.getReasonPhrase();
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(reasonPhrase).length());
                    sb.append("Rejected response from server: ");
                    sb.append(valueOf);
                    sb.append(" \nReason: ");
                    sb.append(reasonPhrase);
                    String sb2 = sb.toString();
                    if (statusCode == 301 && lastHeader != null) {
                        sb2 = lastHeader.getValue();
                    }
                    throw new HttpResponseException(statusCode, sb2);
                }
                httpEntity = a.getEntity();
                if (httpEntity != null) {
                    try {
                        bzzc bzzc = (bzzc) GeneratedMessageLite.m124016a(bzzc.f171952c, gmv.m13466a(a), bxus.m123744c());
                        httpEntity.consumeContent();
                        int a2 = bzzb.m126341a(bzzc.f171954a);
                        if (a2 != 0 && a2 == 2) {
                            bzyy bzyy = bzzc.f171955b;
                            if (bzyy == null) {
                                bzyy = bzyy.f171941b;
                            }
                            bzyv bzyv = bzyy.f171943a;
                            if (bzyv == null) {
                                bzyv = bzyv.f171926d;
                            }
                            int a3 = bzyt.m126333a(bzyv.f171930c);
                            if (a3 != 0 && a3 == 2) {
                                Account account = new Account(this.f18888c, "com.google");
                                GcmReceiverChimeraService gcmReceiverChimeraService = this.f18890e;
                                gcmReceiverChimeraService.startService(RemoveAccountChimeraIntentService.m6276a(gcmReceiverChimeraService.getApplicationContext(), account));
                                String l = Long.toString(this.f18889d);
                                String str = this.f18888c;
                                String str2 = this.f18887b;
                                bxvd da = bzyw.f171931d.mo74144da();
                                if (da.f164950c) {
                                    da.mo74035c();
                                    da.f164950c = false;
                                }
                                bzyw bzyw = (bzyw) da.f164949b;
                                l.getClass();
                                int i = bzyw.f171933a | 1;
                                bzyw.f171933a = i;
                                bzyw.f171934b = l;
                                str.getClass();
                                bzyw.f171933a = i | 2;
                                bzyw.f171935c = str;
                                bzyw bzyw2 = (bzyw) da.mo74062i();
                                bxvd da2 = bzzd.f171957d.mo74144da();
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bzzd bzzd = (bzzd) da2.f164949b;
                                str2.getClass();
                                bzzd.f171959a |= 1;
                                bzzd.f171960b = str2;
                                bxvd da3 = bzyv.f171926d.mo74144da();
                                if (da3.f164950c) {
                                    da3.mo74035c();
                                    da3.f164950c = false;
                                }
                                bzyv bzyv2 = (bzyv) da3.f164949b;
                                bzyv2.f171929b = 1;
                                int i2 = bzyv2.f171928a | 1;
                                bzyv2.f171928a = i2;
                                bzyv2.f171930c = 2;
                                bzyv2.f171928a = i2 | 2;
                                if (da2.f164950c) {
                                    da2.mo74035c();
                                    da2.f164950c = false;
                                }
                                bzzd bzzd2 = (bzzd) da2.f164949b;
                                bzyv bzyv3 = (bzyv) da3.mo74062i();
                                bzyv3.getClass();
                                bzzd2.f171961c = bzyv3;
                                bzzd2.f171959a = 2 | bzzd2.f171959a;
                                bzzd bzzd3 = (bzzd) da2.mo74062i();
                                bxvd da4 = bzyz.f171945e.mo74144da();
                                if (da4.f164950c) {
                                    da4.mo74035c();
                                    da4.f164950c = false;
                                }
                                bzyz bzyz = (bzyz) da4.f164949b;
                                bzyw2.getClass();
                                bzyz.f171948b = bzyw2;
                                int i3 = bzyz.f171947a | 1;
                                bzyz.f171947a = i3;
                                bzzd3.getClass();
                                bzyz.f171950d = bzzd3;
                                bzyz.f171947a = i3 | 4;
                                gmv.m13465a(gnv.m13525aG(), new ByteArrayEntity(((bzyz) da4.mo74062i()).serializeToBytes()), GcmReceiverChimeraService.m6303a(this.f18887b));
                            }
                        }
                    } catch (RuntimeException e) {
                        e = e;
                        try {
                            throw new IOException("Can't parse dm response", e);
                        } catch (Throwable th) {
                            th = th;
                            if (httpEntity != null) {
                            }
                            throw th;
                        }
                    }
                } else {
                    throw new IOException("Empty response from server.");
                }
            } catch (RuntimeException e2) {
                e = e2;
                throw new IOException("Can't parse dm response", e);
            } catch (Throwable th2) {
                th = th2;
                if (httpEntity != null) {
                    httpEntity.consumeContent();
                }
                throw th;
            }
        } catch (IOException e3) {
            GcmReceiverChimeraService.f10014a.mo25415d("Exception communicating account wipe status", e3, new Object[0]);
        }
    }
}
