package p000;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.auth.api.credentials.HintRequest;
import java.util.concurrent.Future;

/* renamed from: hri */
final /* synthetic */ class hri implements bqeh {

    /* renamed from: a */
    private final hrr f20303a;

    /* renamed from: b */
    private final bqgg f20304b;

    public hri(hrr hrr, bqgg bqgg) {
        this.f20303a = hrr;
        this.f20304b = bqgg;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, hrj]
     candidates:
      bnjd.a(java.lang.Iterable, int):java.lang.Iterable
      bnjd.a(java.lang.Iterable, java.util.Comparator):java.lang.Iterable
      bnjd.a(java.lang.Iterable, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Object):boolean
      bnjd.a(java.util.Collection, java.lang.Iterable):boolean
      bnjd.a(java.util.List, bmxz):boolean
      bnjd.a(java.lang.Iterable, java.lang.Class):java.lang.Object[]
      bnjd.a(java.lang.Iterable, java.lang.Object[]):java.lang.Object[]
      bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable */
    /* renamed from: a */
    public final bqgg mo6375a(Object obj) {
        hrr hrr = this.f20303a;
        bqgg bqgg = this.f20304b;
        bngx bngx = (bngx) obj;
        if (bngx.isEmpty()) {
            gwi gwi = new gwi();
            CredentialRequest credentialRequest = hrr.f20322d;
            gwi.f19121a = credentialRequest.f10105b;
            String[] strArr = credentialRequest.f10106c;
            if (strArr == null) {
                strArr = new String[0];
            }
            gwi.f19122b = strArr;
            CredentialPickerConfig credentialPickerConfig = credentialRequest.f10108e;
            sdo.m34959a(credentialPickerConfig);
            gwi.f19123c = credentialPickerConfig;
            if (gwi.f19122b == null) {
                gwi.f19122b = new String[0];
            }
            boolean z = gwi.f19121a;
            if (z || gwi.f19122b.length != 0) {
                HintRequest hintRequest = new HintRequest(2, gwi.f19123c, z, false, gwi.f19122b, false, null, null);
                String c = qqt.m32669c(hrr.f20321c);
                String str = hrr.f20323e;
                Intent putExtra = new Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("claimedCallingPackage", c);
                putExtra.putExtra("logSessionId", str);
                sef.m35071a(hintRequest, putExtra, "com.google.android.gms.credentials.HintRequest");
                adbd a = adbe.m50105a();
                a.f61234c = 28421;
                a.f61235d = bmxv.m108566b(PendingIntent.getActivity(hrr.f20319a, 0, putExtra, 134217728));
                throw a.mo33301a();
            }
            throw new IllegalStateException("At least one authentication method must be specified");
        }
        bngx bngx2 = (bngx) bqga.m112780a((Future) bqgg);
        return bqdx.m112674a(adax.m50091a(bngx.m109355a(bnjd.m109575a((Iterable) bngx2, (bmxj) new hrj(hrr))), hrk.f20306a), new hrl(hrr, bngx, bngx2), bqfb.INSTANCE);
    }
}
