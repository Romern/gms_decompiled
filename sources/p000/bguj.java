package p000;

import java.util.ArrayList;
import java.util.Locale;

/* renamed from: bguj */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bguj {

    /* renamed from: a */
    public final ArrayList f117566a = new ArrayList();

    /* renamed from: b */
    public final ArrayList f117567b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f117568c = new ArrayList();

    /* renamed from: d */
    public final ArrayList f117569d = new ArrayList();

    /* renamed from: e */
    public final ArrayList f117570e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f117571f = new ArrayList();

    /* renamed from: a */
    public final void mo63206a(byte[] bArr, bgvl bgvl) {
        this.f117571f.add(bArr);
        if ((bgvl.f117679a & 1) != 0) {
            ArrayList arrayList = this.f117566a;
            bgvr bgvr = bgvl.f117680b;
            if (bgvr == null) {
                bgvr = bgvr.f117713u;
            }
            arrayList.add(bgvr);
        }
        if ((bgvl.f117679a & 2) != 0) {
            bgoq bgoq = bgvl.f117681c;
            if (bgoq == null) {
                bgoq = bgoq.f116946f;
            }
            this.f117567b.add(bgfb.m98742a(bgoq));
        }
        if ((bgvl.f117679a & 4) != 0) {
            bvwq bvwq = bgvl.f117682d;
            if (bvwq == null) {
                bvwq = bvwq.f157983r;
            }
            String valueOf = String.valueOf(bvwq);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17);
            sb.append("addMetadataGrpc: ");
            sb.append(valueOf);
            sb.toString();
            bvwq.f157993i.size();
            this.f117568c.add(bvwq);
        }
        if ((bgvl.f117679a & 8) != 0) {
            bvxg bvxg = bgvl.f117683e;
            if (bvxg == null) {
                bvxg = bvxg.f158058b;
            }
            this.f117569d.add(bvxg);
        }
        if ((bgvl.f117679a & 16) != 0) {
            bvxr bvxr = bgvl.f117684f;
            if (bvxr == null) {
                bvxr = bvxr.f158087f;
            }
            this.f117570e.add(bvxr);
        }
    }

    public final String toString() {
        return String.format(Locale.US, "%d locations, %d activities, and %d metadata", Integer.valueOf(this.f117566a.size()), Integer.valueOf(this.f117567b.size()), Integer.valueOf(this.f117568c.size()));
    }
}
