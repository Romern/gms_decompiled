package p000;

import android.accounts.Account;
import android.app.DownloadManager;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.google.android.libraries.matchstick.data.DatabaseProvider;
import com.google.android.libraries.matchstick.data.LocalEntityId;
import java.io.File;

/* renamed from: azds */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class azds extends soa {

    /* renamed from: a */
    final /* synthetic */ String f99109a;

    /* renamed from: b */
    final /* synthetic */ String f99110b;

    /* renamed from: c */
    final /* synthetic */ String f99111c;

    /* renamed from: d */
    final /* synthetic */ azea f99112d;

    /* renamed from: h */
    final /* synthetic */ byte[] f99113h;

    /* renamed from: i */
    final /* synthetic */ String f99114i;

    /* renamed from: j */
    final /* synthetic */ aznz f99115j;

    /* renamed from: k */
    final /* synthetic */ azeb f99116k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public azds(azeb azeb, String str, String str2, String str3, azea azea, byte[] bArr, String str4, aznz aznz) {
        super(9);
        this.f99116k = azeb;
        this.f99109a = str;
        this.f99110b = str2;
        this.f99111c = str3;
        this.f99112d = azea;
        this.f99113h = bArr;
        this.f99114i = str4;
        this.f99115j = aznz;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: azob.a(android.accounts.Account, boolean):java.lang.String
     arg types: [android.accounts.Account, int]
     candidates:
      azob.a(java.lang.String, java.util.Map):java.lang.String
      azob.a(android.accounts.Account, boolean):java.lang.String */
    public final void run() {
        Pair pair;
        cbna cbna;
        Account a;
        azeb azeb = this.f99116k;
        Uri uri = azeb.f99133a;
        azda b = DatabaseProvider.m94536b(azeb.f99137b.getContentResolver(), this.f99109a);
        int i = b != null ? b.f99021c : 0;
        if (i == 2) {
            if (!new File(b.f99020b).exists()) {
                new Object[1][0] = this.f99109a;
                pair = new Pair(true, b);
                this.f99116k.f99139d.post(new azdr(this, pair));
            }
        } else if (i == 1) {
            new Object[1][0] = this.f99109a;
        }
        if (TextUtils.isEmpty(this.f99110b) || this.f99110b.equals(cfeo.m138850G())) {
            byte[] bArr = this.f99113h;
            if (bArr != null) {
                azeb azeb2 = this.f99116k;
                String str = this.f99114i;
                LocalEntityId localEntityId = this.f99115j.f99780g;
                bxvd da = cbna.f177706c.mo74144da();
                cbmf cbmf = (cbmf) azol.m85935a((bxxk) cbmf.f177611d.mo74142c(7), bArr);
                if (cbmf != null) {
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbmf.getClass();
                    ((cbna) da.f164949b).f177709b = cbmf;
                    bxvd a2 = azfn.m85571a(azeb2.f99137b, localEntityId);
                    if (str != null) {
                        if (a2.f164950c) {
                            a2.mo74035c();
                            a2.f164950c = false;
                        }
                        cbmo cbmo = cbmo.f177654h;
                        str.getClass();
                        ((cbmo) a2.f164949b).f177661f = str;
                    }
                    if (da.f164950c) {
                        da.mo74035c();
                        da.f164950c = false;
                    }
                    cbmo cbmo2 = (cbmo) a2.mo74062i();
                    cbmo2.getClass();
                    ((cbna) da.f164949b).f177708a = cbmo2;
                    new Object[1][0] = da.mo74062i();
                    cbna = (cbna) da.mo74062i();
                } else {
                    cbna = null;
                }
                if (cbna != null) {
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(cfeo.m138850G()));
                    request.addRequestHeader("X-Goog-Download-Metadata", Base64.encodeToString(cbna.serializeToBytes(), 2));
                    String h = azcv.m85357a(this.f99116k.f99137b).mo54707h(this.f99115j.f99780g);
                    if (!(h == null || (a = azoe.m85908a(this.f99116k.f99137b).mo55114a(h)) == null)) {
                        String valueOf = String.valueOf(azob.m85899a(this.f99116k.f99137b).mo55112a(a, false));
                        request.addRequestHeader("Authorization", valueOf.length() == 0 ? new String("Bearer ") : "Bearer ".concat(valueOf));
                    }
                    request.setMimeType(this.f99111c);
                    azeb.m85506a(this.f99116k, request, this.f99109a, i, this.f99111c, this.f99113h, this.f99112d);
                } else {
                    azoj.m85933c("DownloadManager", "Error parsing mediaId for messageId : %s", this.f99109a);
                    pair = new Pair(false, null);
                }
            } else {
                pair = new Pair(false, null);
            }
            this.f99116k.f99139d.post(new azdr(this, pair));
        }
        DownloadManager.Request request2 = new DownloadManager.Request(Uri.parse(this.f99110b));
        request2.setMimeType(this.f99111c);
        azeb.m85506a(this.f99116k, request2, this.f99109a, i, this.f99111c, azpi.m86073a(this.f99110b), this.f99112d);
        pair = new Pair(true, null);
        this.f99116k.f99139d.post(new azdr(this, pair));
    }
}
