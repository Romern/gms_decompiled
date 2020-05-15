package p000;

import android.accounts.Account;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.people.service.galprovider.PeopleGalChimeraProvider;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.Callable;

/* renamed from: ampy */
public final /* synthetic */ class ampy implements Callable {

    /* renamed from: a */
    private final PeopleGalChimeraProvider f75709a;

    /* renamed from: b */
    private final Uri f75710b;

    /* renamed from: c */
    private final Account f75711c;

    /* renamed from: d */
    private final bxvd f75712d;

    public ampy(PeopleGalChimeraProvider peopleGalChimeraProvider, Uri uri, Account account, bxvd bxvd) {
        this.f75709a = peopleGalChimeraProvider;
        this.f75710b = uri;
        this.f75711c = account;
        this.f75712d = bxvd;
    }

    public final Object call() {
        int i;
        byte[] bArr;
        PeopleGalChimeraProvider peopleGalChimeraProvider = this.f75709a;
        Uri uri = this.f75710b;
        Account account = this.f75711c;
        bxvd bxvd = this.f75712d;
        String queryParameter = uri.getQueryParameter("lookup");
        if (queryParameter == null) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc = (amlc) bxvd.f164949b;
            amlc amlc2 = amlc.f75159h;
            amlc.f75163c = 6;
            amlc.f75161a |= 2;
            Log.e("PeopleGalProvider", "Lookup key cannot be null");
            return null;
        }
        String queryParameter2 = uri.getQueryParameter("sz");
        ClientContext a = peopleGalChimeraProvider.mo46472a(account);
        ampm ampm = peopleGalChimeraProvider.f82041a;
        if (queryParameter2 == null) {
            i = (int) cfyo.f186156a.mo6606a().mo83133j();
        } else {
            i = (int) cfyo.m143933h();
        }
        bxvd da = btde.f148384e.mo74144da();
        bxvd da2 = btea.f148482d.mo74144da();
        bxvd da3 = btdz.f148478b.mo74144da();
        if (da3.f164950c) {
            da3.mo74035c();
            da3.f164950c = false;
        }
        ((btdz) da3.f164949b).f148481c = true;
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btdz btdz = (btdz) da3.mo74062i();
        btdz.getClass();
        ((btea) da2.f164949b).f148485b = btdz;
        bxvd a2 = ampu.m63153a();
        if (da2.f164950c) {
            da2.mo74035c();
            da2.f164950c = false;
        }
        btcb btcb = (btcb) a2.mo74062i();
        btcb.getClass();
        ((btea) da2.f164949b).f148484a = btcb;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btea btea = (btea) da2.mo74062i();
        btea.getClass();
        ((btde) da.f164949b).f148389d = btea;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        ((btde) da.f164949b).f148386a = btee.m116473a(4);
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        btde btde = (btde) da.f164949b;
        queryParameter.getClass();
        btde.f148387b = queryParameter;
        btde.f148390f = true;
        bxvd da4 = bted.f148495c.mo74144da();
        if (da4.f164950c) {
            da4.mo74035c();
            da4.f164950c = false;
        }
        bted bted = (bted) da4.f164949b;
        bted.f148498b = i;
        bted.f148497a = i;
        if (da.f164950c) {
            da.mo74035c();
            da.f164950c = false;
        }
        bted bted2 = (bted) da4.mo74062i();
        bted2.getClass();
        ((btde) da.f164949b).f148388c = bted2;
        try {
            bArr = ampm.mo41250a(a, (btde) da.mo74062i()).f148383b.getKey();
        } catch (gid e) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc3 = (amlc) bxvd.f164949b;
            amlc amlc4 = amlc.f75159h;
            amlc3.f75163c = 3;
            amlc3.f75161a |= 2;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
            sb.append("Error getPersonPhotoEncodedResponse grpc response: ");
            sb.append(valueOf);
            Log.e("PeopleGalProvider", sb.toString());
            bArr = null;
        } catch (chuw e2) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc5 = (amlc) bxvd.f164949b;
            amlc amlc6 = amlc.f75159h;
            amlc5.f75163c = 14;
            int i2 = amlc5.f75161a | 2;
            amlc5.f75161a = i2;
            int i3 = e2.f189236a.f189233s.f189211r;
            amlc5.f75161a = i2 | 16;
            amlc5.f75166f = i3;
            String valueOf2 = String.valueOf(e2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 51);
            sb2.append("Error getPersonPhotoEncodedResponse grpc response: ");
            sb2.append(valueOf2);
            Log.e("PeopleGalProvider", sb2.toString());
            bArr = null;
        }
        if (bArr == null) {
            Log.e("PeopleGalProvider", "Can't get GetPersonPhotoEncoded grpc response");
            return null;
        }
        try {
            return peopleGalChimeraProvider.openPipeHelper(uri, null, null, new ByteArrayInputStream(bArr), new amqb(bxvd));
        } catch (FileNotFoundException e3) {
            if (bxvd.f164950c) {
                bxvd.mo74035c();
                bxvd.f164950c = false;
            }
            amlc amlc7 = (amlc) bxvd.f164949b;
            amlc amlc8 = amlc.f75159h;
            amlc7.f75163c = 11;
            amlc7.f75161a |= 2;
            Log.e("PeopleGalProvider", "Cannot find file for the photo.");
            return null;
        }
    }
}
