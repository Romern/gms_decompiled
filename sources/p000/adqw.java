package p000;

import android.provider.MediaStore;
import android.text.TextUtils;
import java.util.concurrent.Executor;

/* renamed from: adqw */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqw extends adrf {
    public adqw(brhj brhj, Executor executor, adsi adsi) {
        super(brhj, executor, adsi);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: adrf.a(aucb, java.lang.Integer):bqgg
     arg types: [aucb, int]
     candidates:
      adrf.a(adrr, adqt):bqgg
      adrf.a(aucb, java.lang.Integer):bqgg */
    /* renamed from: a */
    public final bqgg mo33734a() {
        return mo33738a(this.f62544a.mo32873b("MusicGroup"), (Integer) 11);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo33736b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ brhy mo33735a(adsg adsg) {
        adsa adsa = (adsa) adsg;
        if (!adsa.mo33756b().booleanValue() || TextUtils.isEmpty(adsa.f62599a)) {
            return null;
        }
        bric c = brid.m114047c();
        String valueOf = String.valueOf(MediaStore.Audio.Artists.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(adsa.f62616g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        c.mo69557b(sb.toString());
        c.mo69558c(adsa.f62599a);
        return c.mo69547a();
    }
}
