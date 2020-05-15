package p000;

import android.provider.MediaStore;
import java.util.concurrent.Executor;

/* renamed from: adqx */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqx extends adrf {
    public adqx(brhj brhj, Executor executor, adsi adsi) {
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
        return mo33738a(this.f62544a.mo32873b("MusicRecording"), (Integer) 2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ brhy mo33735a(adsg adsg) {
        adsc adsc = (adsc) adsg;
        bric bric = new bric("MusicRecording");
        if (!adsc.mo33756b().booleanValue()) {
            return null;
        }
        String valueOf = String.valueOf(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(adsc.f62616g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        bric.mo69557b(sb.toString());
        String str = adsc.f62607a;
        if (str == null) {
            str = "Music";
        }
        bric.mo69558c(str);
        if (adsc.f62608b != null) {
            bric b = brid.m114046b();
            b.mo69558c(adsc.f62608b);
            bric.mo69552a("inAlbum", b);
        }
        Long l = adsc.f62609c;
        if (l != null) {
            bric.mo69551a("albumId", l.longValue());
        }
        if (adsc.f62610d != null) {
            bric c = brid.m114047c();
            c.mo69558c(adsc.f62610d);
            bric.mo69552a("byArtist", c);
        }
        Long l2 = adsc.f62611e;
        if (l2 != null) {
            bric.mo69551a("artistId", l2.longValue());
        }
        return bric.mo69547a();
    }
}
