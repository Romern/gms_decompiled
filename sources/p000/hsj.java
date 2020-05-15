package p000;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.yolo.p023ui.CredentialsSaveConfirmationChimeraActivity;

/* renamed from: hsj */
final /* synthetic */ class hsj implements bmxj {

    /* renamed from: a */
    private final hsk f20353a;

    /* renamed from: b */
    private final bngx f20354b;

    public hsj(hsk hsk, bngx bngx) {
        this.f20353a = hsk;
        this.f20354b = bngx;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bnjd.a(java.lang.Iterable, bmxj):java.lang.Iterable
     arg types: [bngx, bmxj]
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
    public final Object apply(Object obj) {
        bmvz bmvz;
        hsk hsk = this.f20353a;
        bngx bngx = this.f20354b;
        hsk.f20355a.mo25412b("Returning intent for saving with %d accounts.", Integer.valueOf(bngx.size()));
        bmxv f = bnjd.m109599f(bngx, new hru(hsk));
        Context context = hsk.f20357b;
        String str = hsk.f20359d;
        Credential credential = hsk.f20360e;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        bngx a = bngx.m109355a(bnjd.m109575a((Iterable) bngx, hrv.f20330a));
        if (f.mo66813a()) {
            bmvz = bmxv.m108566b(((acyr) f.mo66814b()).mo33252a());
        } else {
            bmvz = bmvz.f131120a;
        }
        PendingIntent activity = PendingIntent.getActivity(hsk.f20357b, 0, CredentialsSaveConfirmationChimeraActivity.m6378a(context, str, credential, booleanValue, a, bmvz, hsk.f20361f), 134217728);
        adbd a2 = adbe.m50105a();
        a2.f61234c = 28423;
        a2.f61235d = bmxv.m108566b(activity);
        throw a2.mo33301a().mo33303c();
    }
}
