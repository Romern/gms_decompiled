package p000;

import android.provider.MediaStore;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: adrj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class adrj {

    /* renamed from: a */
    public final brhj f62556a;

    /* renamed from: b */
    public final adsi f62557b;

    /* renamed from: c */
    public final adqt f62558c;

    /* renamed from: d */
    public final adqo f62559d;

    /* renamed from: e */
    private final Set f62560e = new HashSet();

    /* renamed from: f */
    private final List f62561f = new ArrayList();

    /* renamed from: g */
    private final Executor f62562g;

    public adrj(brhj brhj, Executor executor, adsi adsi, adqo adqo) {
        this.f62556a = brhj;
        this.f62562g = executor;
        this.f62557b = adsi;
        this.f62559d = adqo;
        adqt adqt = new adqt(2);
        this.f62558c = adqt;
        adqo adqo2 = this.f62559d;
        adqt.mo33729c();
        adqo2.mo33709a(adqt);
    }

    /* renamed from: b */
    private final void m51055b() {
        String str;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (adqz adqz : this.f62560e) {
            Long l = adqz.f62530a;
            int intValue = adqz.f62531b.intValue();
            if (intValue == 0) {
                String uri = MediaStore.Files.getContentUri("external").toString();
                String valueOf = String.valueOf(l);
                StringBuilder sb = new StringBuilder(String.valueOf(uri).length() + 1 + String.valueOf(valueOf).length());
                sb.append(uri);
                sb.append("/");
                sb.append(valueOf);
                str = sb.toString();
            } else if (intValue == 1) {
                String valueOf2 = String.valueOf(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                String valueOf3 = String.valueOf(l);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1 + String.valueOf(valueOf3).length());
                sb2.append(valueOf2);
                sb2.append("/");
                sb2.append(valueOf3);
                str = sb2.toString();
            } else if (intValue != 2) {
                str = "";
            } else {
                String valueOf4 = String.valueOf(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI);
                String valueOf5 = String.valueOf(l);
                StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf4).length() + 1 + String.valueOf(valueOf5).length());
                sb3.append(valueOf4);
                sb3.append("/");
                sb3.append(valueOf5);
                str = sb3.toString();
            }
            arrayList.add(str);
            arrayList2.add(adqz.f62530a);
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        aucb a = this.f62556a.mo32870a(strArr);
        this.f62558c.mo33730c(arrayList.size());
        this.f62560e.clear();
        this.f62561f.add(mo33740a(a, arrayList2, strArr, true));
    }

    /* renamed from: a */
    public final bqgg mo33739a() {
        m51055b();
        bqgg a = bqga.m112774a((Iterable) this.f62561f);
        this.f62561f.clear();
        return bqdx.m112673a(a, new adrg(this), this.f62562g);
    }

    /* renamed from: a */
    public final bqgg mo33740a(aucb aucb, List list, String[] strArr, boolean z) {
        bqgy c = bqgy.m112818c();
        aucb.mo50380a(this.f62562g, new adrh(this, list, c));
        aucb.mo50379a(this.f62562g, new adri(this, z, strArr, list, c));
        return c;
    }

    /* renamed from: a */
    public final void mo33741a(adqz adqz) {
        this.f62560e.add(adqz);
        if (ceqm.f183265a.mo6606a().mo79594G() == ((long) this.f62560e.size())) {
            m51055b();
        }
    }
}
