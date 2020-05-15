package p000;

import java.util.ArrayList;

/* renamed from: bfmh */
/* compiled from: :com.google.android.gms@201515033@20.15.15 (120300-306758586) */
public final class bfmh {

    /* renamed from: a */
    final /* synthetic */ bfmu f114396a;

    /* renamed from: b */
    final /* synthetic */ ArrayList f114397b;

    /* renamed from: c */
    final /* synthetic */ bgdy f114398c;

    public bfmh() {
    }

    /* renamed from: a */
    public final void mo61922a(bfoa bfoa, bfmq bfmq, bfni bfni, boolean z) {
        String str;
        Object obj;
        if (bfoa != null) {
            int b = bfoa.mo62006b();
            StringBuilder sb = new StringBuilder(30);
            sb.append("present with count ");
            sb.append(b);
            str = sb.toString();
        } else {
            str = " NULL ";
        }
        String valueOf = String.valueOf(str);
        if (valueOf.length() == 0) {
            new String("Computing location, wifiScan is ");
        } else {
            "Computing location, wifiScan is ".concat(valueOf);
        }
        String valueOf2 = String.valueOf(bfmq);
        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 34);
        sb2.append("Computing location, cellStatus is ");
        sb2.append(valueOf2);
        sb2.toString();
        bfnb a = this.f114398c.mo62696a(bfoa, bfmq, this.f114396a, bfni, z);
        String valueOf3 = String.valueOf(a.f114456a);
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf3).length() + 23);
        sb3.append("Location bestResult is ");
        sb3.append(valueOf3);
        sb3.toString();
        bfns bfns = a.f114457b;
        Object obj2 = "null";
        if (bfns != null) {
            obj = bfns.f114450d;
        } else {
            obj = obj2;
        }
        String valueOf4 = String.valueOf(obj);
        StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf4).length() + 13);
        sb4.append("wifi status: ");
        sb4.append(valueOf4);
        sb4.toString();
        bfml bfml = a.f114458c;
        if (bfml != null) {
            obj2 = bfml.f114450d;
        }
        String valueOf5 = String.valueOf(obj2);
        StringBuilder sb5 = new StringBuilder(String.valueOf(valueOf5).length() + 13);
        sb5.append("cell status: ");
        sb5.append(valueOf5);
        sb5.toString();
        this.f114397b.add(a);
    }

    public bfmh(bgdy bgdy, bfmu bfmu, ArrayList arrayList) {
        this.f114398c = bgdy;
        this.f114396a = bfmu;
        this.f114397b = arrayList;
    }
}
