package p000;

import android.accounts.Account;
import android.content.Context;
import android.os.Parcel;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.android.volley.NetworkResponse;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenRequest;
import com.google.android.gms.wallet.service.reauth.ReauthProofTokenResponse;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeoutException;
import java.util.zip.GZIPInputStream;

/* renamed from: awxn */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class awxn extends dck implements awxo {

    /* renamed from: a */
    private Context f95242a;

    /* renamed from: b */
    private sgv f95243b;

    public awxn() {
        super("com.google.android.gms.wallet.service.reauth.IReauthService");
    }

    /* renamed from: a */
    private static long m81411a(long j) {
        return SystemClock.elapsedRealtime() - j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0114 A[SYNTHETIC, Splitter:B:26:0x0114] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x017b  */
    /* renamed from: a */
    public final ReauthProofTokenResponse mo52698a(ReauthProofTokenRequest reauthProofTokenRequest) {
        int i;
        NetworkResponse networkResponse;
        InputStream inputStream;
        ReauthProofTokenResponse reauthProofTokenResponse;
        ReauthProofTokenRequest reauthProofTokenRequest2 = reauthProofTokenRequest;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        ClientContext clientContext = new ClientContext();
        clientContext.f30212b = Process.myUid();
        Account account = reauthProofTokenRequest2.f110393a;
        clientContext.f30214d = account;
        clientContext.f30213c = account;
        clientContext.f30215e = "com.google.android.gms";
        clientContext.f30216f = "com.google.android.gms";
        clientContext.mo17806d((String) awiy.f94505c.mo58455c());
        bxvd da = bsli.f144923d.mo74144da();
        int i2 = reauthProofTokenRequest2.f110396d;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bsli bsli = (bsli) da.f164949b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            bsli.f144926b = i3;
            int i4 = bsli.f144925a | 1;
            bsli.f144925a = i4;
            String str = reauthProofTokenRequest2.f110394b;
            str.getClass();
            bsli.f144925a = i4 | 4;
            bsli.f144927c = str;
            bsli bsli2 = (bsli) da.mo74062i();
            if (reauthProofTokenRequest2.f110395c >= ((Integer) awiy.f94511i.mo58455c()).intValue()) {
                return ReauthProofTokenResponse.m94153a(2, m81411a(elapsedRealtime));
            }
            try {
                sgv sgv = this.f95243b;
                if (sgv == null) {
                    sgv = new sgv(this.f95242a, (String) awiy.f94503a.mo58455c(), (String) awiy.f94504b.mo58455c(), ((Boolean) awiy.f94507e.mo58455c()).booleanValue(), ((Boolean) awiy.f94508f.mo58455c()).booleanValue(), (String) awiy.f94509g.mo58455c(), (String) awiy.f94510h.mo58455c());
                    this.f95243b = sgv;
                }
                i = 3;
                try {
                    return new ReauthProofTokenResponse(((bsls) sgv.mo25514a(clientContext, 1, (String) awiy.f94506d.mo58455c(), bsli2.mo73642k(), bsls.f144946b, chiv.f188665a.mo6606a().mo85268a())).f144948a, 0, m81411a(elapsedRealtime));
                } catch (gid e) {
                } catch (VolleyError e2) {
                    e = e2;
                    networkResponse = e.networkResponse;
                    if (networkResponse != null) {
                        return ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                    }
                    try {
                        byte[] bArr = networkResponse.data;
                        if (srz.m36173a(bArr)) {
                            inputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
                        } else {
                            inputStream = new ByteArrayInputStream(bArr);
                        }
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                reauthProofTokenResponse = null;
                                break;
                            }
                            String upperCase = readLine.toUpperCase();
                            if (!upperCase.contains("FORBIDDEN")) {
                                if (upperCase.contains("INVALID_GRANT")) {
                                    reauthProofTokenResponse = ReauthProofTokenResponse.m94153a(1, m81411a(elapsedRealtime));
                                    break;
                                }
                            } else {
                                reauthProofTokenResponse = ReauthProofTokenResponse.m94153a(2, m81411a(elapsedRealtime));
                                break;
                            }
                        }
                        if (reauthProofTokenResponse == null) {
                            return ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                        }
                        return reauthProofTokenResponse;
                    } catch (IOException e3) {
                        return ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                    }
                } catch (TimeoutException e4) {
                    e = e4;
                    ReauthProofTokenResponse a = ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                    Log.e("ReauthService", "Timed out calling reauth service", e);
                    return a;
                }
            } catch (gid e5) {
                i = 3;
                ReauthProofTokenResponse a2 = ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                Log.e("ReauthService", "Error occured while getting reauth token");
                return a2;
            } catch (VolleyError e6) {
                e = e6;
                i = 3;
                networkResponse = e.networkResponse;
                if (networkResponse != null) {
                }
            } catch (TimeoutException e7) {
                e = e7;
                i = 3;
                ReauthProofTokenResponse a3 = ReauthProofTokenResponse.m94153a(i, m81411a(elapsedRealtime));
                Log.e("ReauthService", "Timed out calling reauth service", e);
                return a3;
            }
        } else {
            throw null;
        }
    }

    public awxn(Context context) {
        super("com.google.android.gms.wallet.service.reauth.IReauthService");
        this.f95242a = context;
    }

    /* renamed from: a */
    public final boolean mo3209a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        ReauthProofTokenResponse a = mo52698a((ReauthProofTokenRequest) dcl.m8163a(parcel, ReauthProofTokenRequest.CREATOR));
        parcel2.writeNoException();
        dcl.m8169b(parcel2, a);
        return true;
    }
}
