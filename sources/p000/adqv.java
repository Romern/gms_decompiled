package p000;

import android.provider.MediaStore;
import java.util.concurrent.Executor;

/* renamed from: adqv */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adqv extends adrf {
    public adqv(brhj brhj, Executor executor, adsi adsi) {
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
        return mo33738a(this.f62544a.mo32873b("MusicAlbum"), (Integer) 10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo33736b() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ brhy mo33735a(adsg adsg) {
        adry adry = (adry) adsg;
        if (!adry.mo33756b().booleanValue()) {
            return null;
        }
        bric b = brid.m114046b();
        String valueOf = String.valueOf(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI);
        String valueOf2 = String.valueOf(adry.f62616g);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("/");
        sb.append(valueOf2);
        b.mo69557b(sb.toString());
        String str = adry.f62593a;
        if (str == null) {
            str = "Untitled Album";
        }
        b.mo69558c(str);
        String str2 = adry.f62594b;
        if (str2 != null) {
            b.mo69550a(str2);
        }
        Integer num = adry.f62596d;
        if (num != null) {
            b.mo69551a("numTracks", (long) num.intValue());
        }
        if (adry.f62595c != null) {
            bric c = brid.m114047c();
            c.mo69558c(adry.f62595c);
            b.mo69552a("byArtist", c);
        }
        return b.mo69547a();
    }
}
